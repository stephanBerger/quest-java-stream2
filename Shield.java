import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shield {

   
	public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        // TODO 1 : map names to agents list
        List<Agent> agents = new ArrayList<>();
        //version beau gosse
        agents= names.stream()
        		.map(item -> new Agent(item.split(" ")[0],item.split(" ")[1]))
        		.collect(Collectors.toList());
        //version quête
//      agents = names.stream().map(new Function<String, Agent>(){
//					@Override
//					public Agent apply(String item) {
//						String[] name = item.split(" ");
//    					return new Agent(name[0], name[1]);
//						}
//					})
//					.collect(Collectors.toList());
        
        showAgents(agents);
    }

    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}