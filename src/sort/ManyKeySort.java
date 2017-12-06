package sort;

/**
 * @author wuxiaoming
 * @date 2017-12-06 14:41
 */

/**
 * 多关键字排序
 */
public class ManyKeySort {

    static class Card implements Comparable {
        private int pokerColors;
        private int cardPoints;

        public Card(int pokerColors, int cardPoints) {
            this.pokerColors = pokerColors;
            this.cardPoints = cardPoints;
        }

        @Override
        public int compareTo(Object o) {
            Card card = (Card) o;
            if (cardPoints > card.cardPoints) {
                return 1;
            } else if (cardPoints < card.cardPoints) {
                return -1;
            }
            if (pokerColors > card.pokerColors) {
                return 1;
            } else if (pokerColors < card.pokerColors) {
                return -1;
            }
            return 0;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "pokerColors=" + pokerColors +
                    ", cardPoints=" + cardPoints +
                    '}';
        }
    }

    /**
     * 冒泡排序
     * @param array
     */
    private static void bubbleSort(Card[] array){
        for (int i = array.length - 1; i > 0; i--) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if(array[j].compareTo(array[j+1])>0){
                    Card temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        for (Card card : array) {
            System.out.println(card.toString());
        }
    }

    public static void main(String[] args){
        /*Card[] array = new Card[]{
                new Card(3,9),
                new Card(2,9),
                new Card(4,2),
                new Card(4,3),
                new Card(1,3),
                new Card(3,3)
        };*/
        Card[] array = new Card[]{
                new Card(3,9),
                new Card(2,7),
                new Card(1,7),
                new Card(4,3)
        };
        bubbleSort(array);
    }
}
