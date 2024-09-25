package util;

public enum Status {
    AVAILABLE(0), LENT(1), LOST(2);

    private final int status;

    Status(final int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
