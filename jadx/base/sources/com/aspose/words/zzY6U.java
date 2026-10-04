package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzY6U implements zzZCY {
    private int zzKF;
    private com.aspose.words.internal.zzDB zzX6f;

    public zzY6U() {
        this.zzX6f = new com.aspose.words.internal.zzDB();
    }

    public static boolean zzZ(zzY6U zzy6u) {
        return zzy6u != null && zzy6u.zzKF == 2;
    }

    @Override // com.aspose.words.zzZCY
    public zzZCY deepCloneComplexAttr() {
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB(this.zzX6f.getCount());
        zzdb.zzX(this.zzX6f);
        zzY6U zzy6u = new zzY6U(zzdb);
        zzy6u.zzKF = this.zzKF;
        return zzy6u;
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzY6U.class) {
            return false;
        }
        zzY6U zzy6u = (zzY6U) obj;
        return this.zzX6f.equals(zzy6u.zzX6f) && this.zzKF == zzy6u.zzKF;
    }

    public final int getState() {
        return this.zzKF;
    }

    public int hashCode() {
        int i = this.zzKF;
        for (int i2 = 0; i2 < this.zzX6f.getCount(); i2++) {
            i ^= this.zzX6f.get(i2);
        }
        return i;
    }

    @Override // com.aspose.words.zzZCY
    public boolean isInheritedComplexAttr() {
        return false;
    }

    public final void setState(int i) {
        this.zzKF = i;
    }

    public final void zzU(com.aspose.words.internal.zzDB zzdb) {
        this.zzX6f = zzdb;
    }

    public final com.aspose.words.internal.zzDB zzXZp() {
        return this.zzX6f;
    }

    public final int[] zzXZq() {
        int[] iArr = new int[this.zzX6f.getCount()];
        for (int i = 0; i < this.zzX6f.getCount(); i++) {
            iArr[i] = this.zzX6f.get(i) * 50;
        }
        return iArr;
    }

    public zzY6U(com.aspose.words.internal.zzDB zzdb) {
        this.zzX6f = zzdb;
    }
}
