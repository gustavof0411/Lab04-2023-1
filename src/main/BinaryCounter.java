import list.FilaMetodo;

public class BinaryCounter extends FilaMetodo {

    public void binaryConverter(int num) {
        int number = num;
        while (number >= 2) {
            enqueue(number % 2);
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = (number - 1) / 2;
            }
        }
        enqueue(number % 2);
    }

    public void reverseOrder() {
        if (!isEmpty()) {
            int[] arrayReverse = new int[size()];
            for (int i = size(); !isEmpty(); i--) {
                arrayReverse[i - 1] = dequeue();
            }
            this.setArray(arrayReverse);
        }

    }

    public String buildString() {
        String string = "";
        while (!isEmpty()) {
            string = string + dequeue();
        }
        return string;
    }

    public void sequencialBinary(int num) {
        int number = 1;
        while (number <= num) {
            binaryConverter(number);
            reverseOrder();
            System.out.println(buildString());
            number++;
        }
    }

}

