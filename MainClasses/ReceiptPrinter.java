package MainClasses;

public class ReceiptPrinter {
    public String print(ReceiptBasis receiptBasis) {
        StringBuilder receipt = new StringBuilder("Receipt:\n");
        for (DepositItem item : receiptBasis.getItems()) {
            receipt.append(item.getType()).append(" - Value: $").append(item.getValue()).append("\n");
        }
        receipt.append("Total: $").append(receiptBasis.computeSum());
        return receipt.toString();
    }
}
