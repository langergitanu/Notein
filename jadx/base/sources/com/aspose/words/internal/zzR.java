package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zzR {
    private Object[] zz9;

    public zzR(int i) {
        this.zz9 = new Object[i];
    }

    public boolean equals(Object obj) {
        zzR zzr = (zzR) zzZKW.zzZ(obj, zzR.class);
        if (zzr == null || zzr.zz9.length != this.zz9.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Object[] objArr = this.zz9;
            if (i >= objArr.length) {
                return true;
            }
            if (!zzZKO.equals(zzr.zz9[i], objArr[i])) {
                return false;
            }
            i++;
        }
    }

    public int hashCode() {
        int i = 0;
        int iHashCode = 0;
        while (true) {
            Object[] objArr = this.zz9;
            if (i >= objArr.length) {
                return iHashCode;
            }
            Object obj = objArr[i];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
            i++;
        }
    }

    public final Object[] zzr() {
        return this.zz9;
    }
}
