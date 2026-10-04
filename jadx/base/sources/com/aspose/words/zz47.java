package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz47 implements Cloneable {
    private zz30 zzZ0C;
    private zz4A zzZ0D;

    public zz47() {
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzW(zz30 zz30Var) {
        this.zzZ0C = zz30Var;
    }

    public void zzZ(zz4A zz4a) {
        this.zzZ0D = zz4a;
        zzZx5().zzU(zz4a.zzZxp().zzZHc());
    }

    public final zz30 zzZx5() {
        if (this.zzZ0C == null) {
            this.zzZ0C = new zz30();
        }
        return this.zzZ0C;
    }

    public final zz4A zzZx6() {
        return this.zzZ0D;
    }

    public zz47 zzZx7() {
        zz47 zz47Var = (zz47) memberwiseClone();
        zz30 zz30Var = this.zzZ0C;
        if (zz30Var != null) {
            zz47Var.zzZ0C = zz30Var.zzZw2();
        }
        return zz47Var;
    }

    public zz47(zz30 zz30Var) {
        this.zzZ0C = zz30Var;
    }
}
