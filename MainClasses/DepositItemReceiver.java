package MainClasses;

import java.util.ArrayList;
import java.util.List;

public class DepositItemReceiver {
    private List<DepositItem> items;

    public DepositItemReceiver() {
        items = new ArrayList<>();
    }

    public void classifyItem(DepositItem item) {
        items.add(item);
    }

    public void printReceipt() {
        ReceiptPrinter printer = new ReceiptPrinter();
        ReceiptBasis receiptBasis = new ReceiptBasis(items);
        System.out.println(printer.print(receiptBasis));
    }
}
