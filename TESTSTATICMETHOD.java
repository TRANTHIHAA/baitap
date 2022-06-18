package NGAYNAM;

public class TESTSTATICMETHOD {
    public static void main(String[] args) {
        //THSTATICMETHOD.change();
        THSTATICMETHOD s1 = new THSTATICMETHOD(111,"THINH");
        THSTATICMETHOD s2 = new THSTATICMETHOD(112,"THINH1");
        THSTATICMETHOD s3 = new THSTATICMETHOD(113,"THINH2");

        s1.display();
        THSTATICMETHOD.change();
        s2.display();
        s3.display();
    }
}
