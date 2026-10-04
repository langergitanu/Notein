package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zzAO extends Exception {
    private long zzNA;
    private int zzs7;
    private int zzs8;
    private String zzs9;
    private String zzsa;

    public zzAO() {
        this((byte) 0);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.zzsa;
    }

    private zzAO(byte b) {
        super("", null);
        this.zzsa = "";
        this.zzs9 = "";
        this.zzs7 = -1;
        this.zzNA = -1L;
        this.zzs8 = -1;
    }

    public zzAO(String str, int i, long j, int i2) {
        this(str, i, j, i2, (byte) 0);
    }

    private zzAO(String str, int i, long j, int i2, byte b) {
        super("", null);
        this.zzs9 = str == null ? "" : str;
        this.zzs7 = i;
        this.zzNA = j;
        this.zzs8 = i2;
        this.zzsa = zzZKN.format("The CSV appears to be corrupt near record '{0}' field '{1}' at position '{2}'. Current raw data : '{3}'.", Long.valueOf(j), Integer.valueOf(this.zzs8), Integer.valueOf(this.zzs7), this.zzs9);
    }
}
