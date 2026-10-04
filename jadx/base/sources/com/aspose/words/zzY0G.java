package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0G {
    private com.aspose.words.internal.zzGQ zzFh;
    private boolean zzWUd;
    private float zzWUe;
    private boolean zzWUf;
    private com.aspose.words.internal.zzZQ4[] zzWUg;
    private int[] zzWUh;
    private int[] zzWUi;
    private String[] zzWUj;
    private int zzWVy;
    private long zzXeZ;
    private com.aspose.words.internal.zzPM zzYX;
    private com.aspose.words.internal.zzP5[] zzZ3Q;

    public zzY0G(int i, String str, com.aspose.words.internal.zzG zzg, long j, com.aspose.words.internal.zzPM zzpm, com.aspose.words.internal.zzGQ zzgq, boolean z) throws Exception {
        this.zzXeZ = 0L;
        this.zzWVy = i;
        this.zzYX = zzpm;
        this.zzFh = zzgq;
        this.zzWUd = z;
        String strZzyu = zzY0C.zzyu(str);
        this.zzXeZ = zzY0L.zzZ(strZzyu, this.zzYX, this.zzFh, this.zzWUd);
        String[] strArrZzY = com.aspose.words.internal.zzZKN.zzY(strZzyu, ControlChar.f50774LF.toCharArray(), com.aspose.words.internal.zzZOE.REMOVE_EMPTY_ENTRIES$77a9e2fd);
        this.zzWUj = strArrZzY;
        if (z) {
            com.aspose.words.internal.zzZKV.zzU(strArrZzY);
        }
        int i2 = 0;
        com.aspose.words.internal.zzZG zzzg = zzg.getCount() == 1 ? (com.aspose.words.internal.zzZG) zzg.zzN(0) : null;
        if (zzzg != null) {
            com.aspose.words.internal.zzP8 zzp8ZzY = com.aspose.words.internal.zz6G.zzY(zzzg.zzZ0(), true);
            this.zzZ3Q = new com.aspose.words.internal.zzP5[zzp8ZzY.getCount()];
            while (true) {
                com.aspose.words.internal.zzP5[] zzp5Arr = this.zzZ3Q;
                if (i2 >= zzp5Arr.length) {
                    break;
                }
                zzp5Arr[i2] = zzp8ZzY.zzO7().get(i2);
                i2++;
            }
        } else {
            com.aspose.words.internal.zzP5[] zzp5Arr2 = new com.aspose.words.internal.zzP5[2];
            this.zzZ3Q = zzp5Arr2;
            zzp5Arr2[0] = new com.aspose.words.internal.zzP5();
            int i3 = (int) j;
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzOS>) this.zzZ3Q[0].zzNY(), new com.aspose.words.internal.zzOS(0L, com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i3), 0.0f)));
            this.zzZ3Q[1] = new com.aspose.words.internal.zzP5();
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzOS>) this.zzZ3Q[1].zzNY(), new com.aspose.words.internal.zzOS(com.aspose.words.internal.zzZPY.zzG(0.0f, com.aspose.words.internal.zzZPW.zzYz(j)), com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i3), com.aspose.words.internal.zzZPW.zzYz(j))));
            this.zzWUf = true;
        }
        zzXSa();
        zzXS9();
    }

    private static String zzX9(String str) {
        char[] charArray = str.toCharArray();
        com.aspose.words.internal.zzZKV.zzY(charArray, charArray.length);
        return new String(charArray);
    }

    private float zzXS(float f) {
        int i = this.zzWVy;
        if (i == 1) {
            return (Float.intBitsToFloat((int) this.zzXeZ) - f) / 2.0f;
        }
        if (i != 3) {
            return 0.0f;
        }
        return Float.intBitsToFloat((int) this.zzXeZ) - f;
    }

    private void zzXS9() throws Exception {
        float fZzZ = 0.0f;
        this.zzWUe = 0.0f;
        String[] strArr = this.zzWUj;
        this.zzWUh = new int[strArr.length];
        this.zzWUg = new com.aspose.words.internal.zzZQ4[strArr.length];
        int i = 0;
        int i2 = 0;
        float f = -3.4028235E38f;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.zzWUj;
            if (i >= strArr2.length) {
                this.zzXeZ = com.aspose.words.internal.zzZPW.zzG(Float.intBitsToFloat((int) this.zzXeZ), this.zzYX.zzPg() + f);
                return;
            }
            strArr2[i] = zzyB(strArr2[i]);
            int i4 = this.zzWUi[i2];
            if (i > (i3 + i4) - 1) {
                i3 += i4;
                i2++;
            }
            this.zzWUh[i] = i2;
            long jZzZ = zzY0L.zzZ(this.zzWUj[i], this.zzYX, this.zzFh, this.zzWUd);
            fZzZ = zzZ(i, fZzZ, jZzZ);
            if (f < fZzZ) {
                f = fZzZ;
            }
            this.zzWUg[i] = new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzG(zzXS(Float.intBitsToFloat((int) jZzZ)), fZzZ), jZzZ);
            if (this.zzWUe < this.zzWUg[i].getWidth()) {
                this.zzWUe = this.zzWUg[i].getWidth();
            }
            i++;
        }
    }

    private void zzXSa() {
        int length = this.zzWUj.length;
        com.aspose.words.internal.zzP5[] zzp5Arr = this.zzZ3Q;
        int length2 = zzp5Arr.length % 2;
        int length3 = zzp5Arr.length;
        if (length2 == 0) {
            length3 /= 2;
        }
        int i = length % length3;
        int i2 = (length - i) / length3;
        this.zzWUi = new int[length3];
        int i3 = 0;
        while (true) {
            int[] iArr = this.zzWUi;
            if (i3 >= iArr.length) {
                return;
            }
            iArr[i3] = i2;
            if (i > 0) {
                iArr[i3] = i2 + 1;
                i--;
            }
            i3++;
        }
    }

    private int zzXSb() {
        int[] iArr = this.zzWUi;
        if (iArr.length == 0) {
            return 0;
        }
        return iArr[0];
    }

    private float zzZ(int i, float f, long j) {
        int iZzXSb = zzXSb();
        int[] iArr = this.zzWUh;
        int i2 = iArr[i];
        if (i != 0 && i2 == iArr[i - 1]) {
            return (com.aspose.words.internal.zzZPW.zzYz(j) * ((iZzXSb - 1) / (this.zzWUi[i2] - 1))) + f;
        }
        if (this.zzWUi[i2] != 1 || iZzXSb <= 1) {
            return 0.0f;
        }
        return com.aspose.words.internal.zzZPW.zzYz(j) * 0.5f;
    }

    private static String zzyB(String str) {
        StringBuilder sb = new StringBuilder();
        boolean zZzXn = false;
        for (com.aspose.words.internal.zzY3 zzy3 : com.aspose.words.internal.zzY9.zzW(str, com.aspose.words.internal.zzY9.zzK(str))) {
            if (sb.length() == 0) {
                zZzXn = zzy3.zzXn();
            }
            String strZzY8s = new zzYBP(new String[]{zzy3.getText()}).zzY8s();
            if (zzy3.zzXn()) {
                strZzY8s = zzX9(strZzY8s);
            }
            if (zZzXn) {
                sb.insert(0, strZzY8s);
            } else {
                com.aspose.words.internal.zzZNH.zzU(sb, strZzY8s);
            }
        }
        return sb.toString();
    }

    public final int zzXS5() {
        return this.zzZ3Q.length;
    }

    public final float zzXS6() {
        return this.zzWUe;
    }

    public final long zzXS7() {
        return this.zzXeZ;
    }

    public final boolean zzXS8() {
        return this.zzWUf;
    }

    public final int zzYqt() {
        return this.zzWUj.length;
    }

    public final com.aspose.words.internal.zzZQ4 zzhN(int i) {
        return this.zzWUg[i];
    }

    public final com.aspose.words.internal.zzP5 zzhO(int i) {
        com.aspose.words.internal.zzP5[] zzp5Arr = this.zzZ3Q;
        return zzp5Arr[zzp5Arr.length % 2 == 0 ? (this.zzWUh[i] * 2) + 1 : this.zzWUh[i]];
    }

    public final com.aspose.words.internal.zzP5 zzhP(int i) {
        com.aspose.words.internal.zzP5[] zzp5Arr = this.zzZ3Q;
        return zzp5Arr[zzp5Arr.length % 2 == 0 ? this.zzWUh[i] * 2 : this.zzWUh[i]];
    }

    public final String zzhQ(int i) {
        String[] strArr = this.zzWUj;
        if (i <= strArr.length - 1) {
            return strArr[i];
        }
        return null;
    }
}
