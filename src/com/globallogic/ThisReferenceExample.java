package com.globallogic;

public class ThisReferenceExample {

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        /*thisReferenceExample.doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            //System.out.println(this); - this will not work (static)
        });
        */

        thisReferenceExample.execute();
    }

    public void execute(){
        doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            System.out.println(this); // not a static context
        });
    }

    public void doProcess(int i, Process p){
        p.process(i);
    }

    interface Process {
        void process(int i);
    }

    @Override
    public String toString(){
        return "This is the main ThisReferenceExample class instance";
    }

}
