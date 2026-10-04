package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzAT extends zz80 {
    private zzBP[] zzZ7o;
    private zzBO[] zzZ7p;
    private String zzZ7q;
    private zz8T[] zzZ7r;
    private zz8T[] zzZ7s;
    private String zzZxw;

    public final String getUniqueId() {
        return this.zzZxw;
    }

    public final void zzQA(String str) {
        this.zzZ7q = str;
    }

    public final zzBO zzQz(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return null;
        }
        for (zzBO zzbo : this.zzZ7p) {
            if (com.aspose.words.internal.zzZKN.equals(zzbo.getName(), str)) {
                return zzbo;
            }
        }
        return null;
    }

    public final void zzT6(String str) {
        this.zzZxw = str;
    }

    public final void zzY(zz8T[] zz8tArr) {
        this.zzZ7r = zz8tArr;
    }

    public final void zzZ(zzBO[] zzboArr) {
        this.zzZ7p = zzboArr;
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

    public final zzBO[] zzZEM() {
        return this.zzZ7p;
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
