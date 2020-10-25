package com.company;

import java.util.LinkedList;

public class MazeSolver {

    static int[][] maze = {
            {2, 0, 1, 1},
            {1, 1, 2, 0},
            {0, 1, 1, 1}
    };

    // 0 = wall
    // 1 = path
    // 2 = destination

    static LinkedList<Position> path = new LinkedList<>();

    public static void main(String[] args) {
        Position position = new Position(0, 3);
        path.push(position);


        while (true) {
            int x = path.peek().x;
            int y = path.peek().y;

            maze[y][x] = 0;

            // down
            if (maze[y+1][x] == 2) {
                System.out.println("down and Yo YOU WON!!! :)");
                return;
            } else if (maze[y+1][x] == 1) {
                System.out.println("moved down bro");
                path.push(new Position(++y, x));
                continue;
            }

            // left
            if (maze[y][x-1] == 2) {
                System.out.println("left and Yo YOU WON!! :)");
                return;
            } else if (maze[y][x-1] == 1) {
                System.out.println("moved left bro");
                path.push(new Position(y, --x));
                continue;
            }

            // up
            if (maze[y-1][x] == 2) {
                System.out.println("up Yo YOU WON!! :)");
                return;
            } else if (maze[y-1][x] == 1) {
                System.out.println("moved up bro");
                path.push(new Position(--y, x));
                continue;
            }

            // right
            if (maze[y][x+1] == 2) {
                System.out.println("right Yo YOU WON!! :)");
                return;
            } else if (maze[y][x+1] == 1) {
                System.out.println("moved right bro");
                path.push(new Position(y, ++x));
                continue;
            }

            path.pop();
            if (path.size() <= 0)
                System.out.println("No  path");




        }



    }
}
