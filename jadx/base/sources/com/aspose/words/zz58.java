package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz58 extends zz5A {
    private int zzZn;

    public zz58(int i) {
        this.zzZn = i;
    }

    private boolean zzZ(zz58 zz58Var) {
        return this.zzZn == zz58Var.zzZn;
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zz58.class) {
            return false;
        }
        return zzZ((zz58) obj);
    }

    public int hashCode() {
        return this.zzZn;
    }

    public String toString() {
        return com.aspose.words.internal.zzJB.zzWD(this.zzZn);
    }
}
