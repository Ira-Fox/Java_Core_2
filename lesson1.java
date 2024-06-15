public class lesson1{
    public static void main(String[] args){
        //task 1
        int a = 3;
        double b = 3.7;
        boolean c = true;
        Boolean d = false; //Java Wrappers

        //task2
        lesson1 task = new lesson1();
        task.task2(a, b, c, d);

        //task3
        int arr [] = {6, 3, 73, 1, 94, 27, 9, 17, 39, 7};
        task.task3(arr);
    }

    public void task2(int a, double b, boolean c, Boolean d){
        String result = (a > b) ? "Yes" : "No";
      
        switch (result) {
            case "Yes":
                System.out.println("a > b - " + "max: " + a + "  min: " + b);
                break;
            case "No":
                System.out.println("a < b - " + "max: " + b + "  min: " + a);
                break;
            default:
                System.out.println("a = b");
        }

        if(d == true){
            System.out.println("d > c - " + "max: " + d + "  min: " + c);
        }
        else if(c == d){
            System.out.println("c = d");
        }
        else{
            System.out.println("d < c - " + "max: " + c + "  min: " + d);
        }

    }

    public void task3(int arr []){
        Integer max = arr[0], min = arr[0];//Java Wrappers

       for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
       }
       System.out.println("max: " + max + "  min: " + min);
    }
}