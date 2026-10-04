package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZHW {
    static final /* synthetic */ boolean zzVr = true;
    private final int mask;
    private final zzZ[] zzZHp;
    private final String[] zzZHq;

    public static class zzZ {
        static final /* synthetic */ boolean zzVr = true;
        final int value;
        final String zzZHo;

        public zzZ(String str, int i) {
            if (!zzVr && str == null) {
                throw new AssertionError();
            }
            this.zzZHo = str;
            this.value = i;
        }
    }

    public zzZHW(String... strArr) {
        String str;
        int i;
        zzZ[] zzzArr;
        this.zzZHq = strArr;
        int iZzPu = zzPu(strArr.length);
        this.zzZHp = new zzZ[iZzPu];
        this.mask = iZzPu - 1;
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.zzZHq;
            if (i2 >= strArr2.length) {
                return;
            }
            str = strArr2[i2];
            if (!zzVr && str == null) {
                throw new AssertionError("The map doesn't accept null keys.");
            }
            int iZzPv = zzPv(str.hashCode());
            while (true) {
                i = this.mask & iZzPv;
                zzzArr = this.zzZHp;
                zzZ zzz = zzzArr[i];
                if (zzz == null) {
                    break;
                } else {
                    if (zzz.zzZHo.equals(str)) {
                        throw new IllegalArgumentException("duplicate key: ".concat(str));
                    }
                    iZzPv++;
                }
            }
            zzzArr[i] = new zzZ(str, i2);
            i2++;
        }
    }

    private static int zzPu(int i) {
        if (i < 536870912) {
            return Integer.highestOneBit(i) << 2;
        }
        if (zzVr || i < 1073741824) {
            return 1073741824;
        }
        throw new AssertionError("collection too large");
    }

    private static int zzPv(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.zzZHq.length * 16);
        sb.append('{');
        for (String str : this.zzZHq) {
            sb.append(str);
            sb.append(" : ");
            sb.append(zzTP(str));
            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        sb.append('}');
        return sb.toString();
    }

    public final int zzTP(String str) {
        if (str == null) {
            return -1;
        }
        int iZzPv = zzPv(str.hashCode());
        while (true) {
            zzZ zzz = this.zzZHp[this.mask & iZzPv];
            if (zzz == null) {
                return -1;
            }
            if (zzz.zzZHo.equals(str)) {
                return zzz.value;
            }
            iZzPv++;
        }
    }
}
