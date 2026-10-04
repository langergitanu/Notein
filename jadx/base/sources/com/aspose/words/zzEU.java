package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzEU implements Cloneable {
    private String mValue;
    private int zzZcp;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int getDirection() {
        return this.zzZcp;
    }

    public final String getValue() {
        return this.mValue;
    }

    public final void setDirection(int i) {
        this.zzZcp = i;
    }

    public final void setValue(String str) {
        this.mValue = str;
    }

    public final zzEU zzZLO() {
        return (zzEU) memberwiseClone();
    }
}
