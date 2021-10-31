public class temp {
    public static void main(String[] args) {

        int array[] = {101, 67, 89, 25, 5, 4, 21, 78, 32, 23, 8, 45};
        int solution[] = solution(array);

        for (int element: solution ) {
            System.out.println(element);
        }
    }

    private static int [] solution2(int [] input) {
        int [] result = new int[input.length];
        Stack stack = new Stack();
        int count = 0;

        for (int i = input.length-1; i >= 0; i--) {
            if(stack.isEmpty()) {
                stack.push(input[i]);
            } else if(input[i] > stack.peek()) {
                stack.push(input[i]);
            }

            if(stack.isEmpty()) {
                result[i] = -1;
            } else if(input[i] < stack.peek()){
                result[i] = stack.peek();
            } else {
                result[i] = -1;
            }
                System.out.println("runtime " + count++);

        }

        return result;
    }


    private static int [] solution(int [] input) {
        int [] result = new int[input.length];
        int count = 0;
        for(int i = 0; i < input.length-1; i++) {
            int current = input[i];
            int max = input[i+1];

            //finding the next max
            for (int j = i+1; j < input.length; j++) {
                if(max < input[j]) {
                    max = input[j];
                }
                System.out.println("runtime " + count++);
            }
            if(max > current) {
                result[i] = max;
            } else {
                result[i] = -1;
            }
        }

        result[input.length - 1] = -1;


        return result;
    }
}
