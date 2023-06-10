package OOPS;

class Girl {
    private String name;
    private int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Basicobj2{
    public static void main(String[] args) {
        Girl g1 = new Girl("Varsha", 11);
        Girl g2 = new Girl("Mano", 12);
        System.out.println(g1.getName() + "(girl) is " + g1.getAge() + " yr");
        System.out.println(g2.getName() + "(girl) is " + g2.getAge() + " yr\n");
    }
}