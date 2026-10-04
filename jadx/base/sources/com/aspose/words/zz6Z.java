package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz6Z extends zzBK implements zzZCL {
    private int zzZ3e = 255;
    private int zzZ3f;
    private zz0J zzZ3g;
    private zz4G zzZje;
    private zz1K zzZjk;

    public zz6Z(int i) {
        if (i != 3 && i != 9 && i != 4 && i != 12) {
            throw new IllegalArgumentException("Unexpected group shape type.");
        }
        this.zzZ3f = i;
    }

    @Override // com.aspose.words.zzZCL
    public final zz4G getOutline() {
        return this.zzZje;
    }

    @Override // com.aspose.words.zzZCL
    public final void setOutline(zz4G zz4g) {
        this.zzZje = zz4g;
    }

    public final void zzLV(int i) {
        this.zzZ3e = i;
    }

    @Override // com.aspose.words.zz7S, com.aspose.words.zz53
    public final zz53 zzY(boolean z, zzZA5 zzza5) {
        zz6Z zz6z = (zz6Z) super.zzY(z, zzza5);
        zz0J zz0j = this.zzZ3g;
        if (zz0j != null) {
            zz6z.zzZ3g = zz0j.zzZsy();
        }
        return zz6z;
    }

    public final boolean zzZ(zz6Z zz6z) {
        zz53 zz53VarZzY9i;
        while (zz6z.zzZye() != null && zz6z.zzZye().getNodeType() == 17 && (zz53VarZzY9i = ((GroupShape) zz6z.zzZye()).zzY9i()) != null) {
            if (zz53VarZzY9i.zzZHY() == 5) {
                return true;
            }
            if (zz53VarZzY9i.zzZHY() != 3) {
                return false;
            }
            zz6z = (zz6Z) zz53VarZzY9i;
        }
        return false;
    }

    public final zz0J zzZAk() {
        return this.zzZ3g;
    }

    @Override // com.aspose.words.zz53
    public final int zzZHY() {
        return this.zzZ3f;
    }

    public final int zzZTg() {
        return this.zzZ3e;
    }

    @Override // com.aspose.words.zzZCL
    public final zz1K zzZTj() {
        return this.zzZjk;
    }

    public final void zzY(zz0J zz0j) {
        this.zzZ3g = zz0j;
    }

    @Override // com.aspose.words.zzZCL
    public final void zzZ(zz1K zz1k) {
        this.zzZjk = zz1k;
    }
}
