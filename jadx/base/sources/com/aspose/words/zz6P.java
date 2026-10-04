package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz6P extends zz80 implements Cloneable {
    private String zzYK;
    private String zzZ2W;
    private String zzZh;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String getId() {
        return this.zzZh;
    }

    public final void setId(String str) {
        this.zzZh = str;
    }

    public final void zzOu(String str) {
        this.zzZ2W = str;
    }

    public final void zzOv(String str) {
        this.zzYK = str;
    }

    public final String zzZe() {
        return this.zzYK;
    }

    public final String zzZzU() {
        return this.zzZ2W;
    }

    public final zz6P zzZzV() {
        zz6P zz6p = (zz6P) memberwiseClone();
        zz6p.setExtensions(zz6p.zzZBz());
        return zz6p;
    }
}
