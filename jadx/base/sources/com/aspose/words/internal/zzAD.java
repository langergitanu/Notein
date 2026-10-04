package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zzAD {
    private Object zzMw;
    private int zzMx;
    private zz6P[] zzrF;
    private zzZVP zzrG;
    private zzAF zzrH;

    public zzAD(zzAD zzad) {
        this(zzad.zzrH, zzad.zzMw, zzad.zzMx, zzad.zzrG, zzad.zzrF);
    }

    public final boolean isVarArgs() {
        zz6P[] zz6pArr = this.zzrF;
        int length = zz6pArr.length;
        return length != 0 && zz6pArr[length - 1].isVarArgs();
    }

    public boolean zzAD() {
        return false;
    }

    public final zz6P[] zzAE() {
        return this.zzrF;
    }

    public final zzZVP zzAF() {
        return this.zzrG;
    }

    public final int zzAG() {
        return this.zzMx;
    }

    public final zzAF zzAH() {
        return this.zzrH;
    }

    public boolean zzAI() {
        return false;
    }

    public final void zzG(Object obj, Object obj2) throws Exception {
        this.zzrH.zzZ(this, this.zzMw, obj, obj2);
    }

    public final Object zzH(Object obj, Object obj2) throws Exception {
        return this.zzrH.zzY(this, this.zzMw, obj, obj2);
    }

    public final int zzV6(int i) {
        if (!isVarArgs()) {
            return -1;
        }
        int length = this.zzrF.length;
        if (i < length) {
            return 0;
        }
        return (i - length) + 1;
    }

    public final Object zzZ(Object obj, Object obj2, Object obj3) throws Exception {
        return this.zzrH.zzZ(this, this.zzMw, obj, obj2, obj3);
    }

    public final Object zzr(Object obj) throws Exception {
        return this.zzrH.zzZ(this, this.zzMw, obj);
    }

    public zzAD(zzAF zzaf, Object obj, int i, Object obj2, Class cls) {
        this(zzaf, obj, i, obj2, cls, zz6P.zzlP);
    }

    public final Object zzZ(Object obj, Object obj2, Object obj3, Object obj4) throws Exception {
        return this.zzrH.zzZ(this, this.zzMw, obj, obj2, obj3, obj4);
    }

    public zzAD(zzAF zzaf, Object obj, zzZVP zzzvp) {
        this(zzaf, obj, 6, zzzvp, zz6P.zzlP);
    }

    public final Object zzZ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws Exception {
        return this.zzrH.zzZ(this, this.zzMw, obj, obj2, obj3, obj4, obj5);
    }

    public zzAD(zzAF zzaf, Object obj, int i, zzZVP zzzvp, zz6P[] zz6pArr) {
        this.zzrH = zzaf;
        this.zzMw = obj;
        this.zzMx = i;
        this.zzrG = zzzvp;
        this.zzrF = zz6pArr;
    }

    public final Object zzZ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) throws Exception {
        return this.zzrH.zzZ(this, this.zzMw, obj, obj2, obj3, obj4, obj5, obj6);
    }

    public final Object zzZ(Object obj, Object[] objArr) throws Exception {
        return this.zzrH.zzZ(this, this.zzMw, obj, objArr);
    }

    public final void zzZ(zzAF zzaf) {
        this.zzrH = zzaf;
    }

    private zzAD(zzAF zzaf, Object obj, int i, Object obj2, Class cls, zz6P[] zz6pArr) {
        this(zzaf, obj, i, zzZVO.zzX(cls, obj2, null), zz6pArr);
    }
}
