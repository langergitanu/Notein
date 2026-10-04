package com.huawei.cloud.client.exception;

/* JADX INFO: loaded from: classes8.dex */
public class DriveException extends Exception {

    /* JADX INFO: renamed from: a */
    private int f52289a;

    public DriveException(int i, String str) {
        super(str);
        this.f52289a = i;
    }

    public int getCode() {
        return this.f52289a;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder("{code=");
        sb.append(this.f52289a);
        String message = getMessage();
        if (message != null && !message.isEmpty()) {
            sb.append(", message=");
            sb.append(getMessage());
        }
        sb.append("}");
        return sb.toString();
    }
}
