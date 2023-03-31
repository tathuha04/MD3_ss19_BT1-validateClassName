public class TestClassName {
    private  static ClassName testClassName;
    public static final String[] validate1 = new  String[]{"C0318G"};
    public static final String[] inValidate = new  String[]{"M0318G","P0323A"};

    public static void main(String[] args) {
        testClassName = new ClassName();
        for (String className: validate1
             ) {
            boolean isvalid = testClassName.validate(className);
            System.out.println(className + " is "+isvalid);
        }
        for (String className: inValidate
             ) {
            boolean isvalid = testClassName.validate(className);
            System.out.println( className +" is "+ isvalid);

        }
    }

}