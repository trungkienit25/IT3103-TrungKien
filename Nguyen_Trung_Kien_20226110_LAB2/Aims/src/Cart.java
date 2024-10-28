//Nguyen Trung Kien 20226110
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = 
        new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered ++;
        System.out.println("Awesome,the disc has been added!");
        if (MAX_NUMBERS_ORDERED == qtyOrdered) {
            System.out.println("Warning! The cart is almost full!");
        }
    }

    public float totalCost() {
        float result = 0f;
        for (int i = 0; i < qtyOrdered; i++) {
			result += itemsOrdered[i].getCost();
		}
        return result;
    }

    public void  removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int disc_position = -2;
        for(int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
        if(itemsOrdered[i].equals(disc)) {
                disc_position = i;
            break;
        }
        }

        if(disc_position == -2) {
            System.out.println("We couldn't find that disc in your cart.");
        }

        for(int i = disc_position; i <MAX_NUMBERS_ORDERED; i++) {
            if(i == MAX_NUMBERS_ORDERED -1) {
                itemsOrdered[i] = null;
            }
            else itemsOrdered[i] = itemsOrdered[i+1];
        }
        qtyOrdered -= 1;
        System.out.println("The disc has been remove!");
    }
}

