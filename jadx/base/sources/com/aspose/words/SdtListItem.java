package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class SdtListItem implements Cloneable {
    private String mValue;
    private String zzXoa;

    public SdtListItem(String str, String str2) {
        this.zzXoa = str;
        com.aspose.words.internal.zzZ4.zzU(str2, "value");
        this.mValue = str2;
    }

    public String getDisplayText() {
        return this.zzXoa;
    }

    public String getValue() {
        return this.mValue;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void setDisplayText(String str) {
        this.zzXoa = str;
    }

    public final SdtListItem zzYcN() {
        return (SdtListItem) memberwiseClone();
    }

    public SdtListItem(String str) {
        this(str, str);
    }

    public SdtListItem() {
    }
}
