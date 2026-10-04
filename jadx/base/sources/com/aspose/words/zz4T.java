package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz4T extends zz80 implements Cloneable {
    private String mName;
    private String zzLr;
    private int zzYG;
    private zz6P zzZ13;
    private zz6P zzZ14;
    private String zzZj;
    private boolean zzZxy;

    public zz4T() {
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String getDescription() {
        return this.zzLr;
    }

    public final boolean getHidden() {
        return this.zzZxy;
    }

    public final int getId() {
        return this.zzYG;
    }

    public final String getName() {
        return this.mName;
    }

    public final String getTitle() {
        return this.zzZj;
    }

    public final void setDescription(String str) {
        this.zzLr = str;
    }

    public final void setHidden(boolean z) {
        this.zzZxy = z;
    }

    public final void setId(int i) {
        this.zzYG = i;
    }

    public final void setName(String str) {
        this.mName = str;
    }

    public final void setTitle(String str) {
        this.zzZj = str;
    }

    public final void zzY(zz6P zz6p) {
        this.zzZ13 = zz6p;
    }

    public final void zzZ(zz6P zz6p) {
        this.zzZ14 = zz6p;
    }

    public final zz6P zzZxY() {
        return this.zzZ13;
    }

    public final zz6P zzZxZ() {
        return this.zzZ14;
    }

    public final zz4T zzZy0() {
        zz4T zz4t = (zz4T) memberwiseClone();
        zz4t.setExtensions(zzZBz());
        return zz4t;
    }

    public zz4T(int i, String str) {
        this.zzYG = i;
        this.mName = str;
    }
}
