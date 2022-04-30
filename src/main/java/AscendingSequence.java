public class AscendingSequence {

    //0, 1, 2, 3, 5

    public int[] ascendingSequenceAlgorithm(int start, int end, int step) {
        if (step > 0 && start < end) {
            int[] result = new int[end - start + 1];

            for(int i = 0; i < result.length; i ++){
                if (start <= end) {
                    result[i] = start;
                    start += step;
                }
            }

            return result;

//            int j = 0;
//
//            for(int i = start; i <= end; i += step) {
//                if(j < result.length) {
//                result[j] = i;
//                j++;
//            }
//
//            return result;

        }

        return new int[]{}; //возвращает пустой массив

    }


}

