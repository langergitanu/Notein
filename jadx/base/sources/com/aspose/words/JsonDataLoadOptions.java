package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class JsonDataLoadOptions {
    private boolean zzu5;
    private boolean zzu6;
    private Iterable<String> zzu7;
    private int zzu8;

    private static int zzy7(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: simpleValueParseMode");
    }

    public boolean getAlwaysGenerateRootObject() {
        return this.zzu6;
    }

    public Iterable<String> getExactDateTimeParseFormats() {
        return this.zzu7;
    }

    public boolean getPreserveSpaces() {
        return this.zzu5;
    }

    public int getSimpleValueParseMode() {
        return this.zzu8;
    }

    public void setAlwaysGenerateRootObject(boolean z) {
        this.zzu6 = z;
    }

    public void setExactDateTimeParseFormats(Iterable<String> iterable) {
        this.zzu7 = iterable;
    }

    public void setPreserveSpaces(boolean z) {
        this.zzu5 = z;
    }

    public void setSimpleValueParseMode(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzu8 = i;
    }

    public final com.aspose.words.internal.zzCN zzYUH() {
        return new com.aspose.words.internal.zzCN(zzy7(this.zzu8), this.zzu7, this.zzu6, this.zzu5);
    }
}
