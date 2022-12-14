import graphs.GraphsFactory;
import graphs.IGraphs;
import searchGraph.GraphDepthSearch;
import searchGraph.ISearch;


public class App {
    public static void main(String[] args) throws Exception {
        GraphsFactory graphsFactory = new GraphsFactory("pequenoG.txt");
        IGraphs myGraphs = graphsFactory.getGraphs();
        
        //Atividade 1
        myGraphs.printDegreeOfEachVertex();
        System.out.println();
        System.out.println("Ordem do grafo = " + myGraphs.getGraphsOrder());
        System.out.println("Tamanho do grafo = " + myGraphs.getGraphsLength());
        System.out.println("Número de vértices isolados = " + myGraphs.getNumberOfIsolatedVertices());
        System.out.println("Não há vertice de extremidade para grafos direcionados.");

        // //Atividade 2
        // System.out.println();
        // System.out.println("Busca em Extenção");
        // Integer verticeSourceIndex = 6;
        // Integer verticeTargetIndex = 9;
        // ISearch myBFS = graphsFactory.getGraphBreadthSearch(verticeSourceIndex);

        // System.out.println("O menor caminho entre o vértice " + verticeSourceIndex + " e o vértice " + verticeTargetIndex + " é: ");
        // myBFS.checkAndPrintPath(verticeTargetIndex);
        
         //Atividade 3
         System.out.println();
         System.out.println("Busca em Profundidade");
         Integer verticeSourceIndex = 2;
         GraphDepthSearch myDFS = graphsFactory.getGraphDepthSearch(verticeSourceIndex);
         myDFS.start();
    }
}