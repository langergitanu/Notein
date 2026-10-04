package com.aspose.words.internal;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZN6 implements Iterable<String> {
    private String zzZVe;
    private String zzZVf;
    private int zzZVg;
    private zzZN7 zzZVh;
    int zzZVi;
    private zzZ[] zzZVj;

    public static class zzZ {
        private String zz3z;
        private int zzZVc;
        private String zzZVd;
        private int zzZVg;

        private zzZ() {
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }

        public final void zzZ(String str, String str2, int i, int i2) {
            this.zz3z = str;
            this.zzZVd = str2;
            this.zzZVg = i;
            this.zzZVc = i2;
        }
    }

    public zzZN6(zzZN7 zzzn7) {
        byte b = 0;
        this.zzZVi = 0;
        this.zzZVh = zzzn7;
        this.zzZVf = zzzn7.zzUK("xml");
        this.zzZVe = zzzn7.zzUK("xmlns");
        zzZ[] zzzArr = new zzZ[8];
        this.zzZVj = zzzArr;
        zzzArr[0] = new zzZ(b);
        this.zzZVj[1] = new zzZ(b);
        this.zzZVj[2] = new zzZ(b);
        String strZzUK = zzzn7.zzUK("");
        this.zzZVj[0].zzZ(strZzUK, strZzUK, -1, -1);
        this.zzZVj[1].zzZ(this.zzZVe, zzzn7.zzUK("http://www.w3.org/2000/xmlns/"), -1, -1);
        this.zzZVj[2].zzZ(this.zzZVf, zzzn7.zzUK("http://www.w3.org/XML/1998/namespace"), 0, -1);
        this.zzZVi = 2;
        this.zzZVg = 1;
    }

    private int zzUz(String str) {
        for (int i = this.zzZVi; i >= 0; i--) {
            if (this.zzZVj[i].zz3z == str && this.zzZVj[i].zzZVd != null) {
                return i;
            }
        }
        for (int i2 = this.zzZVi; i2 >= 0; i2--) {
            if (zzZKN.equals(this.zzZVj[i2].zz3z, str) && this.zzZVj[i2].zzZVd != null) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.zzZVi + 1);
        for (int i = 0; i <= this.zzZVi; i++) {
            if (this.zzZVj[i].zzZVd != null) {
                linkedHashMap.put(this.zzZVj[i].zz3z, this.zzZVj[i].zz3z);
            }
        }
        return linkedHashMap.keySet().iterator();
    }

    public final String lookupPrefix(String str) {
        for (int i = this.zzZVi; i >= 0; i--) {
            if (zzZKN.equals(this.zzZVj[i].zzZVd, str)) {
                String str2 = this.zzZVj[i].zz3z;
                if (zzZKN.equals(zzM(str2), str)) {
                    return str2;
                }
            }
        }
        return null;
    }

    public final String zzM(String str) {
        int iZzUz = zzUz(str);
        if (iZzUz == -1) {
            return null;
        }
        return this.zzZVj[iZzUz].zzZVd;
    }

    public final void zzZN(String str, String str2) {
        if (str2 == null) {
            throw new IllegalArgumentException("uri");
        }
        if (str == null) {
            throw new IllegalArgumentException(RequestParameters.PREFIX);
        }
        String strZzUK = this.zzZVh.zzUK(str);
        String strZzUK2 = this.zzZVh.zzUK(str2);
        int iZzUz = zzUz(strZzUK);
        if (iZzUz == -1) {
            iZzUz = -1;
        } else if (this.zzZVj[iZzUz].zzZVg == this.zzZVg) {
            this.zzZVj[iZzUz].zzZVd = strZzUK2;
            return;
        }
        int i = this.zzZVi;
        zzZ[] zzzArr = this.zzZVj;
        byte b = 0;
        if (i == zzzArr.length - 1) {
            zzZ[] zzzArr2 = new zzZ[zzzArr.length * 2];
            zzZKV.zzZ(zzzArr, 0, zzzArr2, 0, zzzArr.length);
            this.zzZVj = zzzArr2;
        }
        zzZ[] zzzArr3 = this.zzZVj;
        int i2 = this.zzZVi + 1;
        this.zzZVi = i2;
        if (zzzArr3[i2] == null) {
            zzzArr3[i2] = new zzZ(b);
        }
        this.zzZVj[this.zzZVi].zzZ(strZzUK, strZzUK2, this.zzZVg, iZzUz);
    }

    public final void zzZO(String str, String str2) {
        if (str2 == null) {
            throw new IllegalArgumentException("uri");
        }
        int iZzUz = zzUz(str);
        while (iZzUz != -1) {
            if (zzZKN.equals(this.zzZVj[iZzUz].zzZVd, str2) && this.zzZVj[iZzUz].zzZVg == this.zzZVg) {
                this.zzZVj[iZzUz].zzZVd = null;
            }
            iZzUz = this.zzZVj[iZzUz].zzZVc;
        }
    }

    public final boolean zzhb() {
        int i = this.zzZVi;
        if (this.zzZVg == 1) {
            return false;
        }
        while (true) {
            int i2 = this.zzZVj[i].zzZVg;
            int i3 = this.zzZVg;
            if (i2 != i3) {
                this.zzZVi = i;
                this.zzZVg = i3 - 1;
                return true;
            }
            i--;
        }
    }

    public final void zzhc() {
        this.zzZVg++;
    }

    public final String zzhd() {
        String strZzM = zzM("");
        return strZzM == null ? "" : strZzM;
    }
}
