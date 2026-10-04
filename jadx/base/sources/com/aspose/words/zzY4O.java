package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4O {
    private boolean zzX1Q;
    private zzY4N zzX1R;
    private int zzX1S;
    private int zzY99;
    private String zzZi;

    public zzY4O(int i) {
        this("", 0, i);
    }

    public final String getText() {
        return this.zzZi;
    }

    public final zzY4N zzXUL() {
        return this.zzX1R;
    }

    public final void zzXUM() {
        this.zzX1Q = true;
    }

    public final boolean zzXUN() {
        return this.zzX1Q;
    }

    public final int zzXUO() {
        return this.zzX1S;
    }

    public final int zzYM7() {
        return this.zzY99;
    }

    public final void zzZ(zzY4N zzy4n) {
        this.zzX1R = zzy4n;
    }

    public zzY4O(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: text");
        }
        this.zzX1S = i2;
        this.zzZi = str;
        this.zzY99 = i;
    }
}
