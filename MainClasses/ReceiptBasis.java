package MainClasses;

import java.util.List;

public class ReceiptBasis {
    private List<DepositItem> items;

    public ReceiptBasis(List<DepositItem> items) {
        this.items = items;
    }

    public List<DepositItem> getItems() {
        return items;
    }

    public float computeSum() {
        float sum = 0;
        for (DepositItem item : items) {
            sum += item.getValue();
        }
        return sum;
    }
}
