package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZUV {
    private boolean zzYLC;
    private com.aspose.words.internal.zzZXH[] zzYLB = new com.aspose.words.internal.zzZXH[4];
    private zzZUW[][] zzYLD = new zzZUW[2][];

    public zzZUV() {
        for (int i = 0; i < 2; i++) {
            this.zzYLD[i] = new zzZUW[4];
        }
    }

    private static com.aspose.words.internal.zzZXH zzYj(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new com.aspose.words.internal.zzZXF().zzW(bArr, (String) null);
        } catch (Exception unused) {
            return null;
        }
    }

    private void zzZju() throws Throwable {
        com.aspose.words.internal.zzZXH zzzxh;
        com.aspose.words.internal.zzZXH zzzxh2;
        com.aspose.words.internal.zzZXH zzzxh3;
        if (this.zzYLC) {
            return;
        }
        this.zzYLC = true;
        com.aspose.words.internal.zzZXH[] zzzxhArr = {zzYj(zzEt(0)), zzYj(zzEt(1)), zzYj(zzEt(2)), zzYj(zzEt(3))};
        com.aspose.words.internal.zzZXH zzzxh4 = zzzxhArr[0];
        if (zzzxh4 != null) {
            this.zzYLB[0] = zzzxh4;
            zzZ(zzzxhArr, 0, 1, 2, 3);
        }
        com.aspose.words.internal.zzZXH[] zzzxhArr2 = this.zzYLB;
        if (zzzxhArr2[1] == null && (zzzxh3 = zzzxhArr[1]) != null) {
            zzzxhArr2[1] = zzzxh3;
            zzZ(zzzxhArr, 1, 3);
        }
        com.aspose.words.internal.zzZXH[] zzzxhArr3 = this.zzYLB;
        if (zzzxhArr3[2] == null && (zzzxh2 = zzzxhArr[2]) != null) {
            zzzxhArr3[2] = zzzxh2;
            zzZ(zzzxhArr, 2, 3);
        }
        com.aspose.words.internal.zzZXH[] zzzxhArr4 = this.zzYLB;
        if (zzzxhArr4[3] == null && (zzzxh = zzzxhArr[3]) != null) {
            zzzxhArr4[3] = zzzxh;
        }
        for (com.aspose.words.internal.zzZXH zzzxh5 : zzzxhArr4) {
            if (zzzxh5 != null) {
                zzzxh5.zzpv();
            }
        }
    }

    private void zzZjv() {
        this.zzYLC = false;
        for (int i = 0; i < 4; i++) {
            this.zzYLB[i] = null;
        }
    }

    public final byte[] zzEt(int i) {
        zzZUW zzzuwZzXN = zzXN(1, i);
        if (zzzuwZzXN != null && zzzuwZzXN.getData() != null) {
            return zzzuwZzXN.getData();
        }
        zzZUW zzzuwZzXN2 = zzXN(0, i);
        if (zzzuwZzXN2 == null || zzzuwZzXN2.getData() == null) {
            return null;
        }
        return com.aspose.words.internal.zzKU.zzc(zzzuwZzXN2.getData());
    }

    public final com.aspose.words.internal.zzZXH zzEu(int i) throws Throwable {
        zzZju();
        return this.zzYLB[i];
    }

    public final zzZUW[] zzEv(int i) {
        return this.zzYLD[i];
    }

    public final zzZUW zzXN(int i, int i2) {
        return this.zzYLD[i][i2];
    }

    public final void zzZ(zzZUV zzzuv) {
        zzZUW zzzuw;
        for (int i = 0; i < 2; i++) {
            zzZUW[] zzzuwArr = zzzuv.zzYLD[i];
            for (int i2 = 0; i2 < 4; i2++) {
                zzZUW zzzuw2 = zzzuwArr[i2];
                if (zzzuw2 != null && ((zzzuw = this.zzYLD[i][i2]) == null || (zzzuw.zzZjy() && !zzzuw2.zzZjy()))) {
                    this.zzYLD[i][i2] = zzzuw2;
                }
            }
        }
        zzZjv();
    }

    public final com.aspose.words.internal.zzZXH zzZjw() throws Throwable {
        zzZju();
        for (com.aspose.words.internal.zzZXH zzzxh : this.zzYLB) {
            if (zzzxh != null) {
                return zzzxh;
            }
        }
        return null;
    }

    public final zzZUV zzZjx() {
        zzZUV zzzuv = new zzZUV();
        int i = 0;
        while (true) {
            zzZUW[][] zzzuwArr = this.zzYLD;
            if (i >= zzzuwArr.length) {
                zzzuv.zzZjv();
                return zzzuv;
            }
            zzZUW[] zzzuwArr2 = zzzuwArr[i];
            zzZUW[] zzzuwArr3 = new zzZUW[zzzuwArr2.length];
            System.arraycopy(zzzuwArr2, 0, zzzuwArr3, 0, zzzuwArr2.length);
            zzzuv.zzYLD[i] = zzzuwArr3;
            i++;
        }
    }

    public final void zzZ(zzZUW zzzuw) {
        this.zzYLD[zzzuw.getFormat()][zzzuw.getStyle()] = zzzuw;
        zzZjv();
    }

    private static boolean zzZ(com.aspose.words.internal.zzZXH[] zzzxhArr, int i, int i2) {
        com.aspose.words.internal.zzZXH zzzxh = zzzxhArr[i];
        com.aspose.words.internal.zzZXH zzzxh2 = zzzxhArr[i2];
        return zzzxh != null && zzzxh2 != null && com.aspose.words.internal.zzZYD.zzi(zzzxh.getFullFontName(), zzzxh2.getFullFontName()) && zzzxh.getStyle() == zzzxh2.getStyle();
    }

    private void zzZ(com.aspose.words.internal.zzZXH[] zzzxhArr, int i, int... iArr) throws Throwable {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        for (int i2 : iArr) {
            if (zzZ(zzzxhArr, i, i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (arrayList.size() <= 1) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : arrayList) {
            num.intValue();
            arrayList2.add(zzzxhArr[num.intValue()]);
        }
        com.aspose.words.internal.zzZXH zzzxhZzL = com.aspose.words.internal.zzZXF.zzL(arrayList2);
        this.zzYLB[i] = zzzxhZzL;
        for (Integer num2 : arrayList) {
            num2.intValue();
            this.zzYLB[num2.intValue()] = zzzxhZzL;
        }
    }
}
