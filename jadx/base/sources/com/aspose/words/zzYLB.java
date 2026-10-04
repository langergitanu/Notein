package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYLB {
    private com.aspose.words.internal.zzPG zzXDU;
    private com.aspose.words.internal.zzPG zzXDV;
    private com.aspose.words.internal.zzPB[] zzXDW;
    private com.aspose.words.internal.zzPB[] zzXDX;
    private ArrayList<zzWY> zzXDY;
    private zzWY zzXDZ;
    private boolean zzXE0;
    private int zzXE1;
    private int zzXE2;
    private int zzXE3;
    private zzYLC zzXFo;

    private int getIndex(int i) {
        return this.zzXFo.getIndex(i);
    }

    public static void zzW(zzYLC zzylc) {
        if (zzylc == null || zzylc.zzYnj() < 4) {
            return;
        }
        zzYLB zzylb = new zzYLB();
        zzylb.zzXFo = zzylc;
        zzylb.zzYne();
    }

    private int zzWk(int i, int i2) {
        int index = getIndex(i + 1);
        int i3 = 0;
        while (index != i2) {
            i3++;
            index = getIndex(index + 1);
        }
        return i3;
    }

    private com.aspose.words.internal.zzPB[] zzWl(int i, int i2) {
        int iZzWk = zzWk(i, i2) + 1;
        com.aspose.words.internal.zzPB[] zzpbArr = new com.aspose.words.internal.zzPB[iZzWk];
        for (int i3 = 0; i3 < iZzWk; i3++) {
            int i4 = i + i3;
            zzpbArr[i3] = new com.aspose.words.internal.zzPB(this.zzXFo.zzq1(getIndex(i4)).zzYn8(), this.zzXFo.zzq1(getIndex(i4 + 1)).zzYn8());
        }
        return zzpbArr;
    }

    private void zzX(long j, int i, boolean z) {
        this.zzXDZ.zzYj(j);
        zzWY zzwy = this.zzXDZ;
        zzwy.zzOF(zzwy.zz6I() + 1);
        if (z) {
            zzXv(this.zzXFo.zzq1(getIndex(i + 1)).zzYn8());
        }
    }

    private void zzXv(long j) {
        this.zzXDZ.zzYi(j);
        com.aspose.words.internal.zzZQG.zzZ(this.zzXDY, this.zzXDZ);
        this.zzXDZ = null;
    }

    private void zzXw(long j) {
        zzWY zzwy = this.zzXDZ;
        if (zzwy != null) {
            zzwy.zzYi(j);
            com.aspose.words.internal.zzZQG.zzZ(this.zzXDY, this.zzXDZ);
        }
        this.zzXDZ = null;
        this.zzXE0 = false;
    }

    private void zzY(long j, long j2, int i, int i2, boolean z) {
        zzWY zzwy = new zzWY();
        this.zzXDZ = zzwy;
        zzwy.zzYJ(this.zzXE0);
        this.zzXDZ.zzL(i2);
        this.zzXDZ.zzy(j2);
        this.zzXDZ.zzYk(j);
        this.zzXDZ.zzYj(j);
        zzWY zzwy2 = this.zzXDZ;
        zzwy2.zzOF(zzwy2.zz6I() + 1);
        if (z) {
            zzXv(this.zzXFo.zzq1(getIndex(i + 1)).zzYn8());
        }
    }

    private void zzYnb() {
        ArrayList arrayList = new ArrayList();
        for (zzWY zzwy : this.zzXDY) {
            zzZ(zzwy, arrayList);
            zzZ(zzwy);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzWY>) arrayList, zzwy);
        }
    }

    private void zzYnc() {
        int i = 0;
        while (i < this.zzXE1 - 1) {
            int index = getIndex(this.zzXE3 + i);
            int index2 = getIndex(index + 1);
            long jZzYn8 = this.zzXFo.zzq1(index).zzYn8();
            long jZzYn82 = this.zzXFo.zzq1(index2).zzYn8();
            if (index2 == this.zzXE2) {
                zzXw(jZzYn82);
            } else {
                zzZ(jZzYn82, jZzYn8, index, index2, i == this.zzXE1 + (-2));
            }
            i++;
        }
    }

    private void zzYnd() {
        this.zzXFo.zzRx(true);
        this.zzXE3 = this.zzXFo.zzYng();
        this.zzXE2 = this.zzXFo.zzYnf();
        this.zzXE1 = this.zzXFo.zzYnj();
        this.zzXDX = zzWl(this.zzXE3, this.zzXE2);
        this.zzXDW = zzWl(this.zzXE2, this.zzXE3);
        this.zzXE0 = true;
        this.zzXDZ = null;
        this.zzXDY = new ArrayList<>();
        zzYLC zzylc = this.zzXFo;
        long jZzYn8 = zzylc.zzq1(zzylc.zzYni()).zzYn8();
        zzYLC zzylc2 = this.zzXFo;
        long jZzYn82 = zzylc2.zzq1(zzylc2.zzYnh()).zzYn8();
        this.zzXDV = com.aspose.words.internal.zzPG.zzZ(jZzYn8, false);
        this.zzXDU = com.aspose.words.internal.zzPG.zzZ(jZzYn82, false);
    }

    private void zzYne() {
        zzYnd();
        zzYnc();
        zzYnb();
    }

    private void zzZ(long j, long j2, int i, int i2, boolean z) {
        int iZzWk = zzWk(this.zzXE0 ? this.zzXE3 : this.zzXE2, i2) + 1;
        boolean z2 = this.zzXE0;
        if (!zzZ(j, iZzWk, z2 ? this.zzXDX : this.zzXDW, z2 ? this.zzXDV : this.zzXDU)) {
            if (this.zzXDZ != null) {
                zzXv(j);
            }
        } else if (this.zzXDZ == null) {
            zzY(j, j2, i2, i, z);
        } else {
            zzX(j, i2, z);
        }
    }

    private static boolean zzZ(long j, int i, com.aspose.words.internal.zzPB[] zzpbArr, com.aspose.words.internal.zzPG zzpg) {
        long[] jArr = {0};
        if (com.aspose.words.internal.zzPG.zzZ(zzpg, com.aspose.words.internal.zzPG.zzZ(j, true), jArr, true)) {
            return zzZ(new com.aspose.words.internal.zzPB(j, jArr[0]), i, zzpbArr);
        }
        return false;
    }

    private static boolean zzZ(com.aspose.words.internal.zzPB zzpb, int i, com.aspose.words.internal.zzPB[] zzpbArr) {
        long[] jArr = {0};
        for (int i2 = 0; i2 < zzpbArr.length; i2++) {
            if (i2 != i - 1 && i2 != i && com.aspose.words.internal.zzPB.zzZ(zzpbArr[i2], zzpb, jArr, true)) {
                return true;
            }
        }
        return false;
    }

    private static void zzZ(zzWY zzwy, ArrayList<zzWY> arrayList) {
        Iterator<zzWY> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().getStartIndex() < zzwy.getStartIndex()) {
                zzwy.zzL(zzwy.getStartIndex() - (r0.zz6I() - 1));
            }
        }
    }

    private void zzZ(zzWY zzwy) {
        boolean zZz6H;
        int index = getIndex(zzwy.getStartIndex() + 1);
        for (int i = 0; i < zzwy.zz6I(); i++) {
            this.zzXFo.zzq3(index);
        }
        if (com.aspose.words.internal.zzAN.zzY(com.aspose.words.internal.zzZPY.zzYC(zzwy.zzPX()), com.aspose.words.internal.zzZPY.zzYC(zzwy.zzPQ()), 0.001f)) {
            zzwy.zzOF(zzwy.zz6I() + 1);
            return;
        }
        if (Float.intBitsToFloat((int) zzwy.zzPX()) < Float.intBitsToFloat((int) zzwy.zzPQ())) {
            zZz6H = zzwy.zz6H();
        } else {
            zZz6H = !zzwy.zz6H();
        }
        com.aspose.words.internal.zzPG zzpgZzZ = com.aspose.words.internal.zzPG.zzZ(zZz6H ? zzwy.zzPX() : zzwy.zzPQ(), true);
        long jZz6J = zZz6H ? zzwy.zz6J() : zzwy.zz6K();
        long jZzPQ = zZz6H ? zzwy.zzPQ() : zzwy.zzPX();
        long[] jArr = {0};
        com.aspose.words.internal.zzPG.zzZ(zzpgZzZ, new com.aspose.words.internal.zzPG(jZz6J, jZzPQ), jArr);
        this.zzXFo.zzZ(index, new zzYL8(jArr[0]));
    }
}
