package sort;

/**
 * @author wuxiaoming
 * @date 2017-12-06 14:41
 */

/**
 * 多关键字排序
 */
public class ManyKeySort {

    class Card implements Comparable {
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
    private void bubbleSort(Card[] array){
        for (int i = array.length - 1; i >= 0; i--) {
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
    }
}
