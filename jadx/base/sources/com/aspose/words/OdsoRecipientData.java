package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class OdsoRecipientData implements Cloneable {
    private int zzXRU;
    private boolean zzXRW = true;
    private int zzXRZ = 0;
    private byte[] zzXRV = null;

    public OdsoRecipientData deepClone() {
        return (OdsoRecipientData) memberwiseClone();
    }

    public boolean getActive() {
        return this.zzXRW;
    }

    public int getColumn() {
        return this.zzXRZ;
    }

    public int getHash() {
        return this.zzXRU;
    }

    public byte[] getUniqueTag() {
        return this.zzXRV;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setActive(boolean z) {
        this.zzXRW = z;
    }

    public void setColumn(int i) {
        this.zzXRZ = i;
    }

    public void setHash(int i) {
        this.zzXRU = i;
    }

    public void setUniqueTag(byte[] bArr) {
        this.zzXRV = bArr;
    }
}
