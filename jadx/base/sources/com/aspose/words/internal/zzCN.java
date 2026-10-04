package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzCN {
    public static zzCN zzu4 = new zzCN();
    private boolean zzu5;
    private boolean zzu6;
    private Iterable<String> zzu7;
    private int zzu8;

    private zzCN() {
    }

    public final boolean getAlwaysGenerateRootObject() {
        return this.zzu6;
    }

    public final Iterable<String> getExactDateTimeParseFormats() {
        return this.zzu7;
    }

    public final boolean getPreserveSpaces() {
        return this.zzu5;
    }

    public final int getSimpleValueParseMode() {
        return this.zzu8;
    }

    public zzCN(int i, Iterable<String> iterable, boolean z, boolean z2) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: simpleValueParseMode");
        }
        this.zzu8 = i;
        this.zzu7 = iterable;
        this.zzu6 = z;
        this.zzu5 = z2;
    }
}
