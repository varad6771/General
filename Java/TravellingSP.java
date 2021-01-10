public class TravellingSP {

    static int tsp(int[][] graph, boolean[] v, int currPos, int n,
                   int count, int cost, int ans) {
        // System.out.println(currPos +" "+n+" "+count+" "+cost+" "+ans);
        // If last node is reached and it has a link
        // to the starting node i.e the source then
        // keep the minimum value out of the total cost
        // of traversal and "ans"
        // Finally return to check for more possible values
        if (count == n && graph[currPos][0] > 0) {
            ans = Math.min(ans, cost + graph[currPos][0]);
            System.out.println("if " + graph[currPos][0]);
            return ans;
        }

        // BACKTRACKING STEP
        // Loop to traverse the adjacency list
        // of currPos node and increasing the count
        // by 1 and cost by graph[currPos,i] value
        System.out.println("i currPos gci v ans ");
        for (int i = 0; i < n; i++) {
            if (v[i] == false && graph[currPos][i] > 0) {

                // Mark as visited
                v[i] = true;
                ans = tsp(graph, v, i, n, count + 1,
                        cost + graph[currPos][i], ans);
                // Mark ith node as UnknownErrornvisited
                v[i] = false;
            }
            System.out.println(i + " " + currPos + " " + graph[currPos][i] + " " + v[i] + " " + ans);
        }
        return ans;
    }


    public static void main(String[] args) {

        // n is the number of nodes i.e. V
        int n = 4;

        int[][] graph = {{0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}};

        // Boolean array to check if a node
        // has been visited or not
        boolean[] v = new boolean[n];

        // Mark 0th node as visited
        v[0] = true;
        int ans = Integer.MAX_VALUE;
        // System.out.println("ans "+ans);
        // Find the minimum weight Hamiltonian Cycle
        ans = tsp(graph, v, 0, n, 1, 0, ans);

        // ans is the minimum weight Hamiltonian Cycle
        System.out.println(ans);
    }
} 

