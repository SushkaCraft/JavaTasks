// v1
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

    public void redistributeUsers() {
        int totalPriority = outgoingLinks.stream().mapToInt(link -> link.priority).sum();
        if (totalPriority == 0) return;

        int usersPerPart = users / totalPriority;
        for (Link link : outgoingLinks) {
            int usersToTransfer = link.priority * usersPerPart;
            link.toServer.users += usersToTransfer;
            this.users -= usersToTransfer;
        }
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

            for (Server server : servers) {
                server.redistributeUsers();
            }

            servers.forEach(System.out::println);
            System.out.println();
        }
    }
}
