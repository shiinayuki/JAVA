
    /*
     * Copyright (c) ShiinaYuki
     *  ALL Rights Reserved
     */

    /*
     *Created by ShiinaYuki on 2021/5/13 19:40
     */

    package TestDemo2;

/*
1、	用工厂设计模式或代理设计模式，实现一个工作查询的程序。
工资查询人员一共包含三类：项目经理（Manager）、高级程序员（SeniorProgrammer）、程序员（Programmer）。
其中每月基础工资为5000元。
高级程序员和项目经理在基础工资的基础上有5000员的绩效工资，同时，每月项目经理有5000元的奖金。
2、	在程序1的基础上增加额外加班费的计算，每月约计28天，其中正常工作日为20天，其中8天是公共休息日。
输入加班天数（小于等于8天），将总月薪给输出出来。
其中加班费：项目经理800元/天，高级程序员500元/天，程序员200员/天。
*/

import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        Employee p = SimpleFactory.createProduct("programmer");
        Employee s = SimpleFactory.createProduct("seniorProgrammer");
        Employee m = SimpleFactory.createProduct("manager");
        System.out.println("查询工资：");
        for (Employee employee : Arrays.asList(p, s, m)) {
            employee.calculate(5);
            employee.showSalary();
        }
    }

}

//简单工厂模式
class SimpleFactory {
    public static Employee createProduct(String type) {
        if (type.equals("programmer")){
            return new Programmer();
        }else if (type.equals("seniorProgrammer")){
            return new SeniorProgrammer();
        }else {
            return new Manager();
        }
    }
}

abstract class Employee implements OvertimeSalary {
    private int salary;

    public Employee() {
        this.salary = 5000;
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void showSalary() {
        System.out.println(this.salary);
    }
}

class Manager extends Employee {
    public Manager() {
        super();
        super.setSalary(getSalary() + 5000 + 5000);
    }

    public Manager(int salary) {
        super(salary);
        super.setSalary(getSalary() + 5000 + 5000);
    }

    @Override
    public void calculate(int day) {
        if (Math.max(0, day) == Math.min(day, 8)){
            super.setSalary(super.getSalary() + 800 * day);
        }
        else {
            System.out.println("加班天数有误（小于等于8天）");
        }
    }

    @Override
    public void showSalary() {
        System.out.println("Manager:" + getSalary());
    }
}

class SeniorProgrammer extends Employee {
    public SeniorProgrammer() {
        super();
        super.setSalary(getSalary() + 5000);
    }

    public SeniorProgrammer(int salary) {
        super(salary);
        super.setSalary(getSalary() + 5000);
    }

    @Override
    public void calculate(int day) {
        if (Math.max(0, day) == Math.min(day, 8)){
            super.setSalary(super.getSalary() + 500 * day);
        } else {
            System.out.println("加班天数有误（小于等于8天）");
        }
    }

    @Override
    public void showSalary() {
        System.out.println("SeniorProgrammer:" + super.getSalary());
    }
}

class Programmer extends Employee {
    public Programmer() {
    }

    public Programmer(int salary) {
        super(salary);
    }

    @Override
    public void calculate(int day) {
        if (Math.max(0, day) == Math.min(day, 8)){
            super.setSalary(super.getSalary() + 200 * day);
        }
        else {
            System.out.println("加班天数有误（小于等于8天）");
        }
    }

    @Override
    public void showSalary() {
        System.out.println("Programmer:" + super.getSalary());
    }
}

interface OvertimeSalary {
    void calculate(int day);
}