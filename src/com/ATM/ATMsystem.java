package com.ATM;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMsystem {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("ATM系统");
            System.out.println("1.账户开户");
            System.out.println("2.账户登录");
            System.out.println("请输入你要的操作：");
            int command = sc.nextInt();
            switch (command){
                case 1 :
                    //用户开户操作
                    createUser(users,sc);
                    break;
                case 2 :
                    //用户登录操作
                    login(users,sc);
                    break;
                default:
                    System.out.println("你输入的操作不存在！");
            }
        }}

    private static void login(ArrayList<User> users, Scanner sc) {
        if (users.size() == 0){
            System.out.println("当前系统无任何账户，请先开户！");
            return;
        }
        while (true) {
            System.out.println("请您输入卡号：");
            String cardId = sc.next();
            User user = getUserById(cardId,users);
            if (user!=null){
                while (true) {
                    System.out.println("请你输入登录密码：");
                    if (sc.next().equals(user.getPassword())){
                        System.out.println("登录成功！");
                        break;
                    }else {
                        System.out.println("输入密码有误！");
                    }
                }
            }else {
                System.out.println("对不起系统不存在该卡号！");
            }
        }
    }

    /**
     * 实现用户开户功能
     * @param users 接收账户的集合
     */
    public static void createUser(ArrayList<User> users,Scanner sc){
        User user = new User();

        System.out.println("请您输入账户姓名");
        String name = sc.next();
        user.setName(name);
        while (true) {
            System.out.println("请您输入账户密码");
            String initpas = sc.next();
            System.out.println("请您输入账确认密码");
            String secpas = sc.next();
            if (initpas.equals(secpas)){
                user.setPassword(secpas);
                break;
            }else{
                System.out.println("两次输入密码不一致，请重新输入！");
            }
        }
        System.out.println("请您输入当次限额：");
        double quotamoney = sc.nextDouble();
        user.setQuotaMoney(quotamoney);

        String cardId = getRamdomCardId(users);
        user.setCardId(cardId);
        users.add(user);
        System.out.println("恭喜您！"+name+"！k卡号是："+cardId);
    }

    /**
     * 为账户生成8位不重复的卡号
     * @return
     */
    private static String getRamdomCardId(ArrayList<User> users) {
        Random r = new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }
            User user = getUserById(cardId,users);
            if (user == null){
                //没有重复
                return cardId;
            }
        }

    }
    private static User getUserById(String cardId,ArrayList<User> users){
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if(cardId.equals(user.getCardId())){
                return user;
            }
        }
        return null;
    }
}



