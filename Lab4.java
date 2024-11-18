// v3
import java.util.*;

class Server {
    String name;
    int users;
    LinkedList<Link> incomingLinks;
    LinkedList<Link> outgoingLinks;

    public Server(String name, int users) {
        this.name = name;
        this.users = users;
        this.incomingLinks = new LinkedList<>();
        this.outgoingLinks = new LinkedList<>();
    }

    public void addIncomingLink(Link link) {
        incomingLinks.add(link);
    }

    public void addOutgoingLink(Link link) {
        outgoingLinks.add(link);
    }

    public Map<Server, Integer> calculateRedistribution() {
        Map<Server, Integer> transferMap = new HashMap<>();
        int totalPriority = outgoingLinks.stream().mapToInt(link -> link.priority).sum();
        if (totalPriority == 0 || users == 0) return transferMap;

        int usersPerPart = users / totalPriority;
        int remainder = users;

        for (Link link : outgoingLinks) {
            int usersToTransfer = link.priority * usersPerPart;
            transferMap.put(link.toServer, usersToTransfer);
            remainder -= usersToTransfer;
        }

        if (remainder > 0) {
            Link maxPriorityLink = Collections.max(outgoingLinks, Comparator.comparingInt(link -> link.priority));
            transferMap.put(maxPriorityLink.toServer, transferMap.getOrDefault(maxPriorityLink.toServer, 0) + remainder);
        }

        return transferMap;
    }

    @Override
    public String toString() {
        return name + ": " + users + " users";
    }
}

class Link {
    int priority;
    Server fromServer;
    Server toServer;

    public Link(int priority, Server fromServer, Server toServer) {
        this.priority = priority;
        this.fromServer = fromServer;
        this.toServer = toServer;
    }
}

public class Main {
    public static void main(String[] args) {
        Server a = new Server("A", 30);
        Server b = new Server("B", 30);
        Server c = new Server("C", 30);
        Server d = new Server("D", 30);
        Server e = new Server("E", 30);
        Server f = new Server("F", 30);

        List<Link> links = Arrays.asList(
                new Link(1, b, a), new Link(1, a, d),
                new Link(3, d, c), new Link(2, d, e),
                new Link(2, e, f), new Link(3, f, d),
                new Link(2, f, a), new Link(1, f, e)
        );

        for (Link link : links) {
            link.fromServer.addOutgoingLink(link);
            link.toServer.addIncomingLink(link);
        }

        int iterations = 5;
        
        for (int i = 0; i < iterations; i++) {
            System.out.println("Iteration " + (i + 1) + ":");
            List<Server> servers = Arrays.asList(a, b, c, d, e, f);

            Map<Server, Integer> tempChanges = new HashMap<>();
            servers.forEach(server -> tempChanges.put(server, 0));

            for (Server server : servers) {
                Map<Server, Integer> redistribution = server.calculateRedistribution();
                for (Map.Entry<Server, Integer> entry : redistribution.entrySet()) {
                    Server toServer = entry.getKey();
                    int usersToTransfer = entry.getValue();
                    tempChanges.put(server, tempChanges.get(server) - usersToTransfer);
                    tempChanges.put(toServer, tempChanges.getOrDefault(toServer, 0) + usersToTransfer);
                }
            }

            for (Server server : servers) {
                server.users += tempChanges.get(server);
            }

            int totalUsers = servers.stream().mapToInt(server -> server.users).sum();
            if (totalUsers != 180) {
                System.out.println("Ошибка: Общее количество пользователей изменилось! Сейчас: " + totalUsers);
                break;
            }

            servers.forEach(System.out::println);
            System.out.println();
        }
    }
}
