package com.aspose.words.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: loaded from: classes5.dex */
public class zzZYP {
    private static String[] zzcb = new String[0];
    private int zzVf;
    private String[] zzcc = zzcb;

    private void ensureCapacity(int i) {
        String[] strArr = this.zzcc;
        if (strArr.length >= i) {
            return;
        }
        int length = strArr.length == 0 ? 4 : strArr.length * 2;
        if (length >= i) {
            i = length;
        }
        zzH(i);
    }

    private String get(int i) {
        zzZQ(i);
        return this.zzcc[i];
    }

    private void zzH(int i) {
        if (i == this.zzcc.length) {
            return;
        }
        zzZ4.zzY(i, "value");
        int i2 = this.zzVf;
        if (i < i2) {
            throw new IllegalArgumentException("The specified capacity is less than the current size.\r\nParameter name: value");
        }
        if (i <= 0) {
            this.zzcc = zzcb;
            return;
        }
        String[] strArr = new String[i];
        if (i2 > 0) {
            zzZKV.zzZ(this.zzcc, 0, strArr, 0, i2);
        }
        this.zzcc = strArr;
    }

    private void zzK(int i, int i2) {
        zzZ4.zzY(0, FirebaseAnalytics.Param.INDEX);
        zzZ4.zzY(i2, C18293o1.f55803f);
        if (i2 > this.zzVf) {
            throw new IllegalArgumentException("The given index or/and count specify an invalid offset length.");
        }
    }

    private int zzQ(int i, String str) {
        zzK(0, i);
        return zzZ1.zzZ(this.zzcc, 0, i, str);
    }

    private boolean zzZ(zzZYP zzzyp) {
        if (zzZKO.zzA(null, zzzyp)) {
            return false;
        }
        if (zzZKO.zzA(this, zzzyp)) {
            return true;
        }
        if (this.zzVf != zzzyp.zzVf) {
            return false;
        }
        for (int i = 0; i < this.zzVf; i++) {
            if (!zzZKN.equals(get(i), zzzyp.get(i))) {
                return false;
            }
        }
        return true;
    }

    private void zzZP(int i) {
        zzZ4.zzZ(i, 0, this.zzVf, FirebaseAnalytics.Param.INDEX);
    }

    private void zzZQ(int i) {
        zzZ4.zzZ(i, 0, this.zzVf - 1, FirebaseAnalytics.Param.INDEX);
    }

    public boolean equals(Object obj) {
        if (zzZKO.zzA(null, obj)) {
            return false;
        }
        if (zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzZYP.class) {
            return false;
        }
        return zzZ((zzZYP) obj);
    }

    public final int getCount() {
        return this.zzVf;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (String str : this.zzcc) {
            iHashCode = (iHashCode * 397) ^ str.hashCode();
        }
        return iHashCode;
    }

    public final void insert(int i, String str) {
        zzZP(i);
        ensureCapacity(this.zzVf + 1);
        int i2 = this.zzVf;
        if (i < i2) {
            String[] strArr = this.zzcc;
            zzZKV.zzZ(strArr, i, strArr, i + 1, i2 - i);
        }
        this.zzcc[i] = str;
        this.zzVf++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.zzVf; i++) {
            if (i != 0) {
                zzZNH.zzU(sb, " ");
            }
            zzZNH.zzU(sb, this.zzcc[i]);
        }
        return sb.toString();
    }

    public final int zzXu(String str) {
        return zzQ(this.zzVf, str);
    }
}
