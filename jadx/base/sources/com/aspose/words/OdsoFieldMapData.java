package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class OdsoFieldMapData implements Cloneable {
    private int zzXRZ = 0;
    private boolean zzXRY = false;
    private int zzQt = EditingLanguage.ENGLISH_US;
    private String zzXRX = "";
    private String mName = "";
    private int zzL4 = 1;

    public OdsoFieldMapData deepClone() {
        return (OdsoFieldMapData) memberwiseClone();
    }

    public int getColumn() {
        return this.zzXRZ;
    }

    public String getMappedName() {
        return this.zzXRX;
    }

    public String getName() {
        return this.mName;
    }

    public int getType() {
        return this.zzL4;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setColumn(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzXRZ = i;
    }

    public void setMappedName(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzXRX = str;
    }

    public void setName(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.mName = str;
    }

    public void setType(int i) {
        this.zzL4 = i;
    }

    public final void zzRe(int i) {
        this.zzQt = i;
    }

    public final void zzSs(boolean z) {
        this.zzXRY = z;
    }

    public final int zzTu() {
        return this.zzQt;
    }

    public final boolean zzYyh() {
        return this.zzXRY;
    }

    public final void zzsR(int i) {
        if (i >= 0) {
            this.zzXRZ = i;
        }
    }
}
