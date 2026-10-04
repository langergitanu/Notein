package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz5G extends zz80 implements Cloneable {
    private com.aspose.words.internal.zzD3<Object> zzZ1i = new com.aspose.words.internal.zzD3<>();

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int getCount() {
        return this.zzZ1i.getCount();
    }

    public final Object zzHE(int i) {
        return this.zzZ1i.get(i);
    }

    public final zz5G zzZyr() {
        zz5G zz5g = (zz5G) memberwiseClone();
        if (this.zzZ1i != null) {
            zz5g.zzZ1i = new com.aspose.words.internal.zzD3<>();
            com.aspose.words.internal.zzD3<Object>.zzZ zzzZzCK = this.zzZ1i.zzCK();
            while (zzzZzCK.moveNext()) {
                zz5g.zzZ1i.add(zzzZzCK.zzCM(), zzzZzCK.zzCI());
            }
        }
        zz5g.setExtensions(zzZBz());
        return zz5g;
    }

    public final void zza(int i, boolean z) {
        this.zzZ1i.set(i, Boolean.valueOf(z));
    }
}
