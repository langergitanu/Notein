package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz8S extends zz80 {
    private zz18[] zzZ5h;
    private zz2S zzZ5i;
    private zzBP[] zzZ7o;
    private String zzZ7q;
    private zz8T[] zzZ7r;
    private zz8T[] zzZ7s;
    private String zzZxw;

    public final String getUniqueId() {
        return this.zzZxw;
    }

    public final zz18 zzPq(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return null;
        }
        for (zz18 zz18Var : this.zzZ5h) {
            if (com.aspose.words.internal.zzZKN.equals(zz18Var.getName(), str)) {
                return zz18Var;
            }
        }
        return null;
    }

    public final void zzQA(String str) {
        this.zzZ7q = str;
    }

    public final void zzT6(String str) {
        this.zzZxw = str;
    }

    public final void zzX(zz2S zz2s) {
        this.zzZ5i = zz2s;
    }

    public final void zzY(zz8T[] zz8tArr) {
        this.zzZ7r = zz8tArr;
    }

    public final void zzZ(zz18[] zz18VarArr) {
        this.zzZ5h = zz18VarArr;
    }

    public final zz18[] zzZCt() {
        return this.zzZ5h;
    }

    public final zz2S zzZCu() {
        return this.zzZ5i;
    }

    public final zz8T[] zzZEJ() {
        return this.zzZ7r;
    }

    public final zz8T[] zzZEK() {
        return this.zzZ7s;
    }

    public final zzBP[] zzZEL() {
        return this.zzZ7o;
    }

    public final String zzZEN() {
        return this.zzZ7q;
    }

    public final void zzZ(zzBP[] zzbpArr) {
        this.zzZ7o = zzbpArr;
    }

    public final void zzZ(zz8T[] zz8tArr) {
        this.zzZ7s = zz8tArr;
    }
}
