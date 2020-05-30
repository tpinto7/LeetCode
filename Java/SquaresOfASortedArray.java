class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        int left = 0;
        int right = A.length - 1;
        int[] B = new int[A.length];
        int count = right;
        while( right >= left){
            int leftVal = A[left] * A[left];
            int rightVal = A[right] * A[right];
            if(leftVal >= rightVal){
                B[count] = leftVal;
                left++;
            }else {
                B[count] = rightVal;
                right--;
            }
            count--;
        }
        return B;
    }
}