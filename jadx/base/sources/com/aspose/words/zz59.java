package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz59 extends zz5A {
    private com.aspose.words.internal.zzZOZ zzZ1e;

    public zz59(com.aspose.words.internal.zzZOZ zzzoz) {
        this.zzZ1e = zzzoz;
    }

    private boolean zzZ(zz59 zz59Var) {
        return this.zzZ1e.equals(zz59Var.zzZ1e);
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zz59.class) {
            return false;
        }
        return zzZ((zz59) obj);
    }

    public int hashCode() {
        return this.zzZ1e.hashCode();
    }

    public String toString() {
        return this.zzZ1e.toString();
    }
}
