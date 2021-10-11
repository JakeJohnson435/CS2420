public class singleBuffer<AnyType> {

    private AnyType item;

    public singleBuffer(AnyType t) {
        item = t;
    }

    public singleBuffer(){

    }

    public AnyType get() throws Exception {

        AnyType bufferedItem;

        if (item != null){
            bufferedItem = item;
            item = null;
            return bufferedItem;
        } else {

            Exception e = new IllegalAccessException("There is nothing here");

            throw e;
        }

    }

    public void set(AnyType t) throws Exception {

        if (item == null){
            item = t;
        } else {

            Exception e = new IllegalAccessException("There is another item here");

            throw e;

        }


    }

    public static void main(String[] args) throws Exception {

        singleBuffer sb1 = new singleBuffer<>("I'm in here");

        System.out.println(sb1.get());
        sb1.set("Now I am");
        System.out.println(sb1.get());

        singleBuffer sb2 = new singleBuffer<>("Occupied");
        singleBuffer sb3 = new singleBuffer<>();

//        sb2.set("Testing");
        System.out.println(sb3.get());





    }



}
