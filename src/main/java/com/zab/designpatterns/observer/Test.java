package com.zab.designpatterns.observer;

public class Test {
    public static void main(String[] args) {
        //现在有一款游戏主题
        GameSubject gameSubject = new GameSubject();

        //现在有一款游戏主题，有一个玩家，并且订阅了游戏相关资讯
        PlayerOneObserver playerOneObserver = new PlayerOneObserver();
        gameSubject.registerObserver(playerOneObserver);

        //现在有一款游戏主题，有另一个玩家，并且也订阅了游戏相关资讯
        PlayerTwoObserver playerTwoObserver = new PlayerTwoObserver();
        gameSubject.registerObserver(playerTwoObserver);

        //游戏资讯更新
        gameSubject.setGameUpdateInfo("今天更新了一款超级好玩的游戏，绝地求生");
        //通知玩家
        gameSubject.notifyObservers();

        printPlayerGameInfo(playerOneObserver, playerTwoObserver);

        //现在玩家1，玩腻了，不想接受游戏资讯了
        gameSubject.removeObserver(playerOneObserver);

        //第二次更新游戏资讯
        gameSubject.setGameUpdateInfo("今天更新了一款超级好玩的游戏，王者荣耀");
        //通知玩家
        gameSubject.notifyObservers();

        printPlayerGameInfo(playerOneObserver, playerTwoObserver);
    }

    private static void printPlayerGameInfo(PlayerOneObserver playerOneObserver, PlayerTwoObserver playerTwoObserver) {
        System.out.println("================================");
        //打印玩家接收到的游戏资讯
        System.out.println(playerOneObserver.getGameInfo());
        System.out.println(playerTwoObserver.getGameInfo());
    }
}
