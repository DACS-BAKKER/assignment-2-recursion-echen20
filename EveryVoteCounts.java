public class EveryVoteCounts {
    static double totInitial = 0;
    static int totCritVotes = 0;
    static int[] blocks = {4, 2, 7, 4};

    public static void main(String[] args) {

        for (int x = 0; x < blocks.length; x++) {
            totInitial += blocks[x];
        }

        countCriticalVotes(blocks, 2);
        System.out.println(totCritVotes);

    }

    public static void countCriticalVotes(int[] blocks, int blockIndex) {
        System.out.println("one");
        double sum = 0;
        for (int x = 0; x < blocks.length; x++) {
            if (x != blockIndex) {
                sum += blocks[x];
            }
        }


        //System.out.println(blockIndex);
        if (Math.abs((totInitial - sum) - (totInitial / 2)) < blocks[blockIndex]) {
            totCritVotes++;
        }

        if (blocks.length > 1) {
            int[] newBlock = new int[blocks.length]; // ANOTHER ATTEMPT AT BREAKING BLOCKS DOWN INTO SMALLER PROBLEMS

            for (int x = 0; x < blocks.length; x++) {
                for (int i = 0; i < blocks.length; i++) {
                    if (x != blockIndex) {
                        if (i != x) {
                            newBlock[i] = blocks[i];
                        }
                    }
                }
                if (x < blockIndex) {
                    countCriticalVotes(newBlock, blockIndex - 1);
                } else {
                    countCriticalVotes(newBlock, blockIndex);
                }
            }

         /*   for (int x = 0; x < blocks.length-2; x++) { // MY ATTEMPT AT SPLITTING LIST INTO SMALLER LISTS
                if (x != blockIndex) {
                    newBlock[x] = blocks[x];
                }

                if(newBlock.length!=blocks.length-1) {
                    if(blocks.length-2 == blockIndex) {
                        newBlock[blocks.length-2] = blocks[blocks.length-1];
                    } else {
                        newBlock[blocks.length-2] = blocks[blocks.length-2];
                    }
                }

            }
            countCriticalVotes(newBlock, blockIndex);

            for(int x = 1; x<blocks.length; x++) {
                if (x != blockIndex) {
                    newBlock[x] = blocks[x];
                }
            }
            countCriticalVotes(newBlock, blockIndex);*/

        }

    }

  /*  public static int countCriticalVotes(int[] blocks, int blockIndex) { // ANOTHER ATTEMPT
        if(endFirst) {
            for(int i = 0; i<blocks.length; i++) {
                totInitial += blocks[i];
            }
            endFirst = false;
        }

        if(blocks.length == 2) {
            return
        } else {
            int[] newBlocks;
            for(int i = 0; i<blocks.length; i++) {
                newBlocks = blocks;
                if(i != blockIndex) {
                    newBlocks[i] = 0;
                    return countCriticalVotes(newBlocks, blockIndex);
                }
            }
        }
    }
*/ //failure
}