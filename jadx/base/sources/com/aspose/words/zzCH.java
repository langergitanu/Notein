package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzCH extends zz80 implements Cloneable {
    private boolean zzZ9c;
    private zzD9 zzZ9d;
    private boolean zzZ9e;
    private zzD9 zzZ9f;
    private int zzZ9g = 150;
    private boolean zzXu = false;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int getGapWidth() {
        return this.zzZ9g;
    }

    public final boolean isEmpty() {
        return (this.zzZ9e || this.zzZ9c) ? false : true;
    }

    public final boolean isVisible() {
        return this.zzXu;
    }

    public final void zzKh(int i) {
        if (i < 0 || i > 500) {
            return;
        }
        this.zzZ9g = i;
    }

    public final void zzXx(boolean z) {
        this.zzZ9c = z;
    }

    public final void zzXy(boolean z) {
        this.zzZ9e = z;
    }

    public final boolean zzZGe() {
        return this.zzZ9c;
    }

    public final boolean zzZGf() {
        return this.zzZ9e;
    }

    public final void zzZGg() {
        this.zzXu = true;
    }

    public final zzD9 zzZGh() {
        if (this.zzZ9d == null) {
            this.zzZ9d = new zzD9();
        }
        return this.zzZ9d;
    }

    public final zzD9 zzZGi() {
        if (this.zzZ9f == null) {
            this.zzZ9f = new zzD9();
        }
        return this.zzZ9f;
    }

    public final zzCH zzZGj() {
        zzCH zzch = (zzCH) memberwiseClone();
        zzD9 zzd9 = this.zzZ9f;
        if (zzd9 != null) {
            zzch.zzZ9f = zzd9.zzZI4();
        }
        zzD9 zzd92 = this.zzZ9d;
        if (zzd92 != null) {
            zzch.zzZ9d = zzd92.zzZI4();
        }
        zzch.setExtensions(zzZBz());
        return zzch;
    }
}
