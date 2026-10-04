package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public abstract class VbaReference implements Cloneable {
    private String mName;

    public VbaReference(String str) {
        this.mName = str;
    }

    public static VbaReference zzZ(zzY3M zzy3m) throws Exception {
        VbaReference vbaReferenceZzg = zzg(zzy3m.zzX9() & 65535, zzy3m.zzV4(22, 62));
        vbaReferenceZzg.zzY(zzy3m);
        return vbaReferenceZzg;
    }

    private static VbaReference zzg(int i, String str) {
        if (i == 13) {
            return new zzY3H(str);
        }
        if (i == 14) {
            return new zzY3I(str);
        }
        if (i == 47) {
            return new zzY3K(str);
        }
        if (i == 51) {
            return new zzY3J(str);
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: " + com.aspose.words.internal.zzZKN.format("Unexpected VBA reference type: {0}", Integer.valueOf(i)));
    }

    public abstract String getLibId();

    public final String getName() {
        return this.mName;
    }

    public abstract int getType();

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final VbaReference zzXTT() {
        return (VbaReference) memberwiseClone();
    }

    public abstract void zzY(zzY3M zzy3m) throws Exception;

    public abstract void zzZ(zzY3L zzy3l) throws Exception;
}
