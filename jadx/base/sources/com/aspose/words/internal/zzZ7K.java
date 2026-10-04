package com.aspose.words.internal;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7K extends zzZDB {
    private zzZ7P[] zzWpV;
    private zzZ7P[] zzWpW;

    private zzZ7K(zzZD4 zzzd4) {
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        while (enumerationZzXKE.hasMoreElements()) {
            zzZCY zzzcyZzYw = zzZCY.zzYw(enumerationZzXKE.nextElement());
            int iZzXKy = zzzcyZzYw.zzXKy();
            if (iZzXKy == 0) {
                this.zzWpW = zzY(zzZD4.zzX(zzzcyZzYw, false));
            } else {
                if (iZzXKy != 1) {
                    throw new IllegalArgumentException("Unknown tag encountered: " + zzzcyZzYw.zzXKy());
                }
                this.zzWpV = zzY(zzZD4.zzX(zzzcyZzYw, false));
            }
        }
    }

    public static zzZ7K zzX3(Object obj) {
        if (obj instanceof zzZ7K) {
            return (zzZ7K) obj;
        }
        if (obj != null) {
            return new zzZ7K(zzZD4.zzYy(obj));
        }
        return null;
    }

    private static zzZ7P[] zzY(zzZD4 zzzd4) {
        int size = zzzd4.size();
        zzZ7P[] zzz7pArr = new zzZ7P[size];
        for (int i = 0; i != size; i++) {
            zzz7pArr[i] = zzZ7P.zzX7(zzzd4.zzg6(i));
        }
        return zzz7pArr;
    }

    private static zzZ7P[] zzZ(zzZ7P[] zzz7pArr) {
        if (zzz7pArr == null) {
            return null;
        }
        int length = zzz7pArr.length;
        zzZ7P[] zzz7pArr2 = new zzZ7P[length];
        System.arraycopy(zzz7pArr, 0, zzz7pArr2, 0, length);
        return zzz7pArr2;
    }

    public final zzZ7P[] zzXHN() {
        return zzZ(this.zzWpV);
    }

    public final zzZ7P[] zzXHO() {
        return zzZ(this.zzWpW);
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzZ7P[] zzz7pArr = this.zzWpW;
        if (zzz7pArr != null) {
            zzzdj.zzZ(new zzZBX(false, 0, new zzZC2(zzz7pArr)));
        }
        zzZ7P[] zzz7pArr2 = this.zzWpV;
        if (zzz7pArr2 != null) {
            zzzdj.zzZ(new zzZBX(false, 1, new zzZC2(zzz7pArr2)));
        }
        return new zzZC2(zzzdj);
    }
}
