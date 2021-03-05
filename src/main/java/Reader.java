import java.util.Random;

class Reader extends Library {

    public String[] choiceBook(String[][] massBook) {
        Random random = new Random();
        int index = random.nextInt(massBook.length);
        return massBook[index];
    }

    public int appraisal(String[] massBook) {
        int[] n = new int[massBook.length / 2];
        for (int i = 2; i < massBook.length; i++) {
            if (massBook[i].equals("")) {
                n[i-2] = new Random().nextInt(500);
            } else {
                n[i-2] = Integer.parseInt(massBook[i]);
            }
            n[i-2]++;
        }
        return ((massBook[0].length() + massBook[1].length()) - n[0]) + n[1];
    }
}
