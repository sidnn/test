package com.example.androapps.sampledemo.Constant;

import java.util.ArrayList;

public class DashBoardConstant {

    public ArrayList<DashBoard> DashBoardItems(){
        ArrayList<DashBoard> dashBoards = new ArrayList<>();
        dashBoards.add(addItem("Android"));
        dashBoards.add(addItem("iOS"));
        dashBoards.add(addItem("Flutter"));
        dashBoards.add(addItem("Kotlin"));
        return dashBoards;
    }

    private DashBoard addItem(String name) {
        DashBoard dashBoard = new DashBoard();
        dashBoard.setName(name);
        return dashBoard;
    }
}
