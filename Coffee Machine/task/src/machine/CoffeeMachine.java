package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        String command;

        Machine coffeeMachine = new Machine();

        coffeeMachine.ask();
        while(!exit) {
            command = scanner.nextLine();
            if(command.equals("exit")) {
                exit = true;
            } else {
                coffeeMachine.action(command);
            }
        }
    }
}

class Machine {
    private int money;
    private int water;
    private int milk;
    private int beans;
    private int cups;
    private State state;

    public Machine() {
        this.money = 550;
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.cups = 9;
        this.state = State.ACTION;
    }

    public void action(String command) {
        switch (this.state) {
            case ACTION:
                switch (command) {
                    case "remaining":
                        infoAboutMachineState();
                        break;
                    case "buy":
                        System.out.println("\nWhat do you want to nuy? 1 - espresso, 2 - latte, 3 - cappuccino, " +
                                "back - to main menu:");
                        this.state = State.COFFEE;
                        break;
                    case "fill":
                        System.out.println();
                        fillInfo("ml of water");
                        this.state = State.FILL_WATER;
                        break;
                    case "take":
                        System.out.println("\nI gave you $" + this.money);
                        this.money = 0;
                        ask();
                        break;
                }
                break;
            case COFFEE:
                if(command.equals("back")) {
                    ask();
                    this.state = State.ACTION;
                    break;
                }
                switch (Integer.parseInt(command)) {
                    case 1:
                        if(this.water < Espresso.WATER.getAmount()) {
                            sorryFor(Ingredient.WATER.getName());
                            break;
                        } else if(this.beans < Espresso.BEANS.getAmount()) {
                            sorryFor(Ingredient.BEANS.getName());
                            break;
                        } else if(cupsProblem()) {
                            sorryFor(Ingredient.CUPS.getName());
                            break;
                        }
                        changeIngredients(Espresso.WATER.getAmount(), Espresso.MILK.getAmount(),
                                Espresso.BEANS.getAmount(),Espresso.MONEY.getAmount());
                        makingCoffee();
                        break;
                    case 2:
                        if(this.water < Latte.WATER.getAmount()) {
                            sorryFor(Ingredient.WATER.getName());
                            break;
                        } else if(this.milk < Latte.MILK.getAmount()) {
                            sorryFor(Ingredient.MILK.getName());
                            break;
                        } else if(this.beans < Latte.BEANS.getAmount()) {
                            sorryFor(Ingredient.BEANS.getName());
                            break;
                        } else if(cupsProblem()) {
                            sorryFor(Ingredient.CUPS.getName());
                            break;
                        }
                        changeIngredients(Latte.WATER.getAmount(), Latte.MILK.getAmount(), Latte.BEANS.getAmount(),
                                Latte.MONEY.getAmount());
                        makingCoffee();
                        break;
                    case 3:
                        if(this.water < Cappuccino.WATER.getAmount()) {
                            sorryFor(Ingredient.WATER.getName());
                            break;
                        } else if(this.milk < Cappuccino.MILK.getAmount()) {
                            sorryFor(Ingredient.MILK.getName());
                            break;
                        } else if(this.beans < Cappuccino.BEANS.getAmount()) {
                            sorryFor(Ingredient.BEANS.getName());
                            break;
                        } else if(cupsProblem()) {
                            sorryFor(Ingredient.CUPS.getName());
                            break;
                        }
                        changeIngredients(Cappuccino.WATER.getAmount(), Cappuccino.MILK.getAmount(), Cappuccino.BEANS.getAmount(),
                                Cappuccino.MONEY.getAmount());
                        makingCoffee();
                        break;
                }
                this.state = State.ACTION;
                break;
            case FILL_WATER:
                this.water += Integer.parseInt(command);
                fillInfo("ml of milk");
                this.state = State.FILL_MILK;
                break;
            case FILL_MILK:
                this.milk += Integer.parseInt(command);
                fillInfo("grams of coffee");
                this.state = State.FILL_BEANS;
                break;
            case FILL_BEANS:
                this.beans += Integer.parseInt(command);
                fillInfo("disposable cups");
                this.state = State.FILL_CUPS;
                break;
            case FILL_CUPS:
                this.cups += Integer.parseInt(command);
                ask();
                this.state = State.ACTION;
                break;
        }
    }

    public void ask() {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
    }

    private void infoAboutMachineState() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(this.water + " of water");
        System.out.println(this.milk + " of milk");
        System.out.println(this.beans + " of beans");
        System.out.println(this.cups + " of cups");
        System.out.println("$" + this.money + " of money");
        ask();
    }

    public void fillInfo(String what) {
        System.out.println("Write how many " + what + " do you want to add:");
    }

    public void sorryFor(String ingredient) {
        System.out.println("Sorry, not enough " + ingredient + "!");
        this.state = State.ACTION;
        ask();
    }

    public void makingCoffee() {
        System.out.println("I have enough resources, making you a coffee!");
        ask();
    }

    private boolean cupsProblem() {
        boolean isProblem = false;
        if(this.cups < 1) {
            isProblem = true;
        }
        return isProblem;
    }

    public void changeIngredients(int water, int milk, int beans, int money) {
        this.water -= water;
        this.milk -= milk;
        this.beans -= beans;
        this.money += money;
        this.cups--;
    }
}

enum State {
    ACTION, COFFEE, FILL_WATER, FILL_MILK, FILL_BEANS, FILL_CUPS
}

enum Espresso {
    WATER(250),
    MILK(0),
    BEANS(16),
    MONEY(4);

    private final int amount;

    Espresso(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

enum Latte {
    WATER(350),
    MILK(75),
    BEANS(20),
    MONEY(7);

    private final int amount;

    Latte(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

enum Cappuccino {
    WATER(200),
    MILK(100),
    BEANS(12),
    MONEY(6);

    private final int amount;

    Cappuccino(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

enum Ingredient {
    WATER("water"),
    MILK("milk"),
    BEANS("coffee beans"),
    CUPS("disposable cups");

    private final String name;

    Ingredient(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}