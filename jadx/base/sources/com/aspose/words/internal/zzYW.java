package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYW {
    private Object zzXN;

    private zzYW(Object obj) {
        this.zzXN = obj;
    }

    public static zzYW zzZ(Object[] objArr) {
        if (objArr != null && objArr.length == 2 && "{2E1778F6-6E10-4443-B931-B84B66229AE6}".equals(objArr[0])) {
            return new zzYW(objArr[1]);
        }
        return null;
    }

    public final void zzZ(zzYY zzyy) {
        if (this.zzXN.equals(zzyy.zzYy())) {
            throw new IllegalStateException();
        }
    }
}
