package backjoon.queue;

import java.util.*;

public class Queue01260 {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int vertexCount = scanner.nextInt();
        int edgeCount = scanner.nextInt();
        int startVertex = scanner.nextInt();

        List<Integer> vertex1 = new ArrayList<Integer>();
        List<Integer> vertex2 = new ArrayList<Integer>();

        for (int i = 0; i < edgeCount; i++) {
            vertex1.add(scanner.nextInt());
            vertex2.add(scanner.nextInt());
        }

        dfs(vertex1, vertex2, vertexCount, edgeCount, startVertex);
        bfs(vertex1, vertex2, vertexCount, edgeCount, startVertex);
    }

    private static void dfs(List<Integer> vertex1, List<Integer> vertex2, int vertexCount, int edgeCount, int startVertex) {
        List<Integer> nextVertex;
        List<Boolean> beforeVisitVertex = new ArrayList<Boolean>();
        List<Integer> resultDfs = new ArrayList<Integer>();
        resultDfs.add(startVertex);

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(startVertex);

        setStartVertex(beforeVisitVertex, vertexCount, startVertex);

        while (!stack.isEmpty()) {
            nextVertex = makeNextVisitVertexCandidate(vertex1, vertex2, edgeCount, stack.pop());
            Collections.sort(nextVertex, Comparator.reverseOrder());

            for (int j = 0; j < nextVertex.size(); j++) {
                if (beforeVisitVertex.get(nextVertex.get(j) - 1)) {
                    continue;
                }

                stack.push(nextVertex.get(j));
            }

            if (stack.isEmpty()) {
                break;
            }

            if (!beforeVisitVertex.get(stack.peek() - 1)) {
                resultDfs.add(stack.peek());
                beforeVisitVertex.set(stack.peek() - 1, true);
            }
        }

        for (int i = 0; i < resultDfs.size(); i++) {
            System.out.print(resultDfs.get(i) + " ");
        }

        System.out.println();
    }

    private static void bfs(List<Integer> vertex1, List<Integer> vertex2, int vertexCount, int edgeCount, int startVertex) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(startVertex);
        List<Integer> nextVertex;
        List<Boolean> beforeVisitVertex = new ArrayList<Boolean>();
        List<Integer> resultBfs = new ArrayList<Integer>();
        resultBfs.add(startVertex);

        setStartVertex(beforeVisitVertex, vertexCount, startVertex);

        while (!queue.isEmpty()) {
            nextVertex = makeNextVisitVertexCandidate(vertex1, vertex2, edgeCount, queue.poll());
            Collections.sort(nextVertex, Comparator.naturalOrder());

            for (int j = 0; j < nextVertex.size(); j++) {
                if (beforeVisitVertex.get(nextVertex.get(j) - 1)) {
                    continue;
                }

                resultBfs.add(nextVertex.get(j));
                beforeVisitVertex.set(nextVertex.get(j) - 1, true);
                queue.offer(nextVertex.get(j));
            }
        }

        for (int i = 0; i < resultBfs.size(); i++) {
            System.out.print(resultBfs.get(i) + " ");
        }

        System.out.println();
    }

    private static void setStartVertex(List<Boolean> beforeVisitVertex, int vertexCount, int startVertex) {
        for (int i = 0; i < vertexCount; i++) {
            if (i == (startVertex - 1)) {
                beforeVisitVertex.add(true);
            } else {
                beforeVisitVertex.add(false);
            }
        }
    }

    private static List<Integer> makeNextVisitVertexCandidate(List<Integer> vertex1, List<Integer> vertex2, int edgeCount, int currentVertex) {
        List<Integer> nextVertex = new ArrayList<Integer>();

        for (int i = 0; i < edgeCount; i++) {
            if (currentVertex == vertex1.get(i)) {
                nextVertex.add(vertex2.get(i));
            }

            if (currentVertex == vertex2.get(i)) {
                nextVertex.add(vertex1.get(i));
            }
        }

        return nextVertex;
    }
}
