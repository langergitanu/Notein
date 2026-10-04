package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZW6 extends zzAF {
    private zzZW4 zz89;
    private Class zz8a;

    public zzZW6(Class cls, zzZW4 zzzw4) {
        this.zz8a = cls;
        this.zz89 = zzzw4;
        zzzw4.zzZ(this);
    }

    public final Class getType() {
        return this.zz8a;
    }

    @Override // com.aspose.words.internal.zzAF
    public final zzAD zzYv(String str) {
        zzZW5 zzzw5ZzZ = zzZ(new zzZW1(str, true));
        if (zzzw5ZzZ == null || !zzzw5ZzZ.zznS()) {
            return null;
        }
        return zzzw5ZzZ;
    }

    @Override // com.aspose.words.internal.zzAF
    public final zzAD zzZ(Object obj, String str) {
        zzZW5 zzzw5ZzZ = zzZ(new zzZW1(str, false));
        if (zzzw5ZzZ == null || !zzzw5ZzZ.zznS()) {
            return null;
        }
        return zzzw5ZzZ;
    }

    @Override // com.aspose.words.internal.zzAF
    public final zzAD zzZ(Object obj, String str, zzZVP zzzvp) {
        zzZW5 zzzw5ZzZ = zzZ(new zzZW1(str, false));
        if (zzzw5ZzZ == null || !zzzw5ZzZ.zznR()) {
            return null;
        }
        return zzzw5ZzZ;
    }

    @Override // com.aspose.words.internal.zzAF
    public final zzAD zzZ(Object obj, zzZVP[] zzzvpArr) {
        return zzZ(new zzZW7(zzzvpArr));
    }

    @Override // com.aspose.words.internal.zzAF
    public final zzAD zzZ(String str, zzZVP[] zzzvpArr) {
        return zzZ(new zzZW2(str, true, zzzvpArr));
    }

    @Override // com.aspose.words.internal.zzAF
    public final zzAD zzZ(Object obj, String str, zzZVP[] zzzvpArr) {
        return zzZ(new zzZW2(str, false, zzzvpArr));
    }

    @Override // com.aspose.words.internal.zzAF
    public final zzAD zzZ(zzZVP[] zzzvpArr) {
        return zzZ(new zzZW9(zzzvpArr));
    }

    public final zzAD zzZ(zzZVP zzzvp, zzZVP zzzvp2, zzZW6 zzzw6) {
        return zzZ(new zzSB(zzzvp, zzzvp2), zzzw6);
    }

    public final zzAD zzZ(String str, zzZVP zzzvp) {
        return zzZ(new zzSV(str, zzzvp));
    }

    public final zzAD zzZ(String str, zzZVP zzzvp, zzZVP zzzvp2, zzZW6 zzzw6) {
        return zzZ(new zzSV(str, zzzvp, zzzvp2), zzzw6);
    }

    private zzZW5 zzZ(zzF7 zzf7) {
        this.zz89.zzY(zzf7);
        return zzf7.zzRB();
    }

    private zzZW5 zzZ(zz72 zz72Var, zzZW6 zzzw6) {
        this.zz89.zzY(zz72Var);
        if (zzzw6 != null && zzzw6 != this) {
            zz72Var.zzH(this.zz8a);
            zzzw6.zz89.zzY(zz72Var);
        }
        return zz72Var.zzRB();
    }
}
