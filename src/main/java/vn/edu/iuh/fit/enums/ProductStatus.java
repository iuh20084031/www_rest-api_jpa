package vn.edu.iuh.fit.enums;

public enum ProductStatus {
    ACTIVE(1),//đang bán
    IN_ACTIVE(0), // tạm ngưng
    TERMINATED(-1); // KHông bán nữa
    private int value;

    ProductStatus(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
