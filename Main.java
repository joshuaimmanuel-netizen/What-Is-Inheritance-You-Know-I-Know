//                                                                            -----------------THis is inhertance in java----------------
//                                                                                                     its OOP concept

class a{
    public void b(){
        System.out.println("Good");
    }
}
class c extends a{
    public void d(){
        System.out.println("Morning");
    }
}
class Main{
    public static void main(String[] args){
        c Joshua = new c();
        Joshua.b();
        Joshua.d();
    }
}