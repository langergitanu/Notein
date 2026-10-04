package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYLA {
    private static zzYL7 zzC(ArrayList<zzYLC> arrayList, int i) {
        zzYL7 zzyl7 = null;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (i != i2) {
                zzYL7 zzyl72 = new zzYL7(arrayList.get(i), arrayList.get(i2), i, i2);
                if (zzyl7 == null || zzyl72.zzZSd() < zzyl7.zzZSd()) {
                    zzyl7 = zzyl72;
                }
            }
        }
        return zzyl7;
    }

    private static void zzD(ArrayList<zzYLC> arrayList, int i) {
        zzYL7 zzyl7ZzC = zzC(arrayList, i);
        zzYLC zzylc = arrayList.get(zzyl7ZzC.zzYn5());
        zzZ(zzylc, arrayList.get(zzyl7ZzC.zzYn4()), zzyl7ZzC);
        arrayList.remove(zzyl7ZzC.zzYn5());
        arrayList.remove(zzyl7ZzC.zzYn4());
        arrayList.add(0, zzylc);
    }

    private static int zzS(zzYLC zzylc, zzYLC zzylc2) {
        for (int i = 0; i < zzylc.zzYnj(); i++) {
            if (zzylc.zzq1(i).zzYn9() == 1) {
                zzYL8 zzyl8Zzq1 = zzylc.zzq1(zzylc.getIndex(i + 1));
                if (zzyl8Zzq1.zzYn9() == 1 || zzylc2.zzk(zzyl8Zzq1.zzYn8())) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static zzYLC zzT(zzYLC zzylc, zzYLC zzylc2) {
        zzylc.zzRx(true);
        zzylc2.zzRx(true);
        zzYLC zzylcZzYnk = zzylc.zzYnk();
        zzYLC zzylcZzYnk2 = zzylc2.zzYnk();
        return zzZ(zzylcZzYnk, zzylcZzYnk2, zzW(zzylcZzYnk, zzylcZzYnk2), zzylc, zzylc2);
    }

    private static int zzU(zzYLC zzylc, zzYLC zzylc2) {
        int i = 0;
        for (int i2 = 0; i2 < zzylc2.zzYnj(); i2++) {
            if (zzylc.zzk(zzylc2.zzq1(i2).zzYn8())) {
                i++;
            }
        }
        return i;
    }

    private static zzYL9 zzV(zzYLC zzylc, zzYLC zzylc2) {
        int iZzU = zzU(zzylc, zzylc2);
        if (iZzU != zzylc2.zzYnj() && iZzU == 0) {
            int iZzU2 = zzU(zzylc2, zzylc);
            if (iZzU2 != zzylc.zzYnj() && iZzU2 == 0) {
                return new zzYL9(zzylc, zzylc2);
            }
            return new zzYL9(zzylc2);
        }
        return new zzYL9(zzylc);
    }

    private static boolean zzW(zzYLC zzylc, zzYLC zzylc2) {
        if (zzylc.zzYnj() < 3 || zzylc2.zzYnj() < 3) {
            return false;
        }
        zzYL6 zzyl6 = new zzYL6(zzylc, zzylc2);
        int i = 0;
        while (i < zzylc.zzYnj()) {
            zzyl6.zzXt(zzylc.zzq1(i).zzYn8());
            zzyl6.zzpY(i);
            int i2 = i + 1;
            zzyl6.zzpX(zzylc.getIndex(i2));
            com.aspose.words.internal.zzPB zzpbZzZ = zzZ(zzylc, i);
            for (int i3 = 0; i3 < zzylc2.zzYnj(); i3++) {
                zzyl6.zzpW(i3);
                zzZ(zzyl6, zzpbZzZ);
            }
            i = i2;
        }
        if (zzyl6.zzYmY()) {
            zzZ(zzyl6, true);
            zzZ(zzyl6, false);
        }
        return zzyl6.zzYmY();
    }

    public static zzYLC zzX(zzYL9 zzyl9) {
        return zzyl9.zzYna() == 0 ? new zzYLC() : zzyl9.zzYna() == 1 ? zzyl9.zzq0(0) : zzW(zzyl9);
    }

    public static zzYLC zzY(zzYLC zzylc, zzYLC zzylc2) {
        return (zzylc == null && zzylc2 == null) ? new zzYLC() : (zzylc2 == null || zzylc2.zzYnj() == 0) ? new zzYLC() : (zzylc == null || zzylc.zzYnj() == 0) ? new zzYLC() : zzT(zzylc, zzylc2);
    }

    public static zzYL9 zzZ(zzYLC zzylc, zzYLC zzylc2) {
        return (zzylc == null && zzylc2 == null) ? new zzYL9() : (zzylc2 == null || zzylc2.zzYnj() == 0) ? new zzYL9(zzylc) : (zzylc == null || zzylc.zzYnj() == 0) ? new zzYL9(zzylc2) : zzX(zzylc, zzylc2);
    }

    private static zzYL9 zzX(zzYLC zzylc, zzYLC zzylc2) {
        zzylc.zzRx(true);
        zzylc2.zzRx(true);
        return zzZ(zzylc, zzylc2, zzW(zzylc, zzylc2));
    }

    private static void zzY(com.aspose.words.internal.zzPB zzpb, zzYL6 zzyl6, boolean z) {
        zzYLC zzylcZzYn3;
        int iZzYmW;
        zzyl6.zzYmX();
        if (z) {
            zzylcZzYn3 = zzyl6.zzYn2();
            iZzYmW = zzyl6.zzYmU();
        } else {
            zzylcZzYn3 = zzyl6.zzYn3();
            iZzYmW = zzyl6.zzYmW();
        }
        zzYL8 zzyl8Zzq1 = zzylcZzYn3.zzq1(iZzYmW);
        zzyl8Zzq1.zzpZ(1);
        if (zzZ(zzpb, zzyl6, z, true, zzyl8Zzq1) || zzZ(zzpb, zzyl6, z, false, zzyl8Zzq1)) {
            return;
        }
        zzZ(z ? zzyl6.zzpU(zzyl6.zzYmW()) : zzyl6.zzpT(zzyl6.zzYmU()), z ? zzyl6.zzpS(zzyl6.zzYmW()) : zzyl6.zzpR(zzyl6.zzYmU()), z ? zzyl6.zzYn1() : zzyl6.zzYn0(), z ? zzyl6.zzYn0() : zzyl6.zzYn1());
    }

    private static void zzZ(zzYL6 zzyl6, com.aspose.words.internal.zzPB zzpb) {
        zzyl6.zzXs(zzyl6.zzYn2().zzq1(zzyl6.zzYmU()).zzYn8());
        zzyl6.zzpV(zzyl6.zzYn2().getIndex(zzyl6.zzYmU() + 1));
        com.aspose.words.internal.zzPB zzpbZzZ = zzZ(zzyl6.zzYn2(), zzyl6.zzYmU());
        if (zzZ(zzpb, zzpbZzZ, zzyl6)) {
            return;
        }
        long[] jArr = new long[1];
        boolean zZzZ = com.aspose.words.internal.zzPB.zzZ(zzpb, zzpbZzZ, jArr, true);
        zzyl6.zzXr(jArr[0]);
        if (!zZzZ || com.aspose.words.internal.zzJ6.zzN(zzyl6.zzYmZ(), zzpbZzZ.zzPW()) || com.aspose.words.internal.zzJ6.zzN(zzyl6.zzYmZ(), zzpb.zzPW())) {
            return;
        }
        zzZ(zzyl6.zzpU(zzyl6.zzYmW()), zzyl6.zzpS(zzyl6.zzYmW()), zzyl6.zzYn1(), jArr[0]);
        zzZ(zzyl6.zzpT(zzyl6.zzYmU()), zzyl6.zzpR(zzyl6.zzYmU()), zzyl6.zzYn0(), jArr[0]);
        zzyl6.zzYmX();
    }

    private static zzYLC zzW(zzYL9 zzyl9) {
        zzyl9.zzNw();
        ArrayList<zzYLC> arrayListZzYAN = zzyl9.zzYAN();
        for (int size = arrayListZzYAN.size() - 1; size > 0; size--) {
            zzD(arrayListZzYAN, size);
        }
        return arrayListZzYAN.get(0);
    }

    private static boolean zzY(zzYLC zzylc, zzYLC zzylc2, int[] iArr) {
        int iZzS = zzS(zzylc, zzylc2);
        if (iZzS != -1) {
            iArr[0] = iZzS;
            return true;
        }
        iArr[0] = zzS(zzylc2, zzylc);
        return false;
    }

    private static boolean zzZ(com.aspose.words.internal.zzPB zzpb, com.aspose.words.internal.zzPB zzpb2, zzYL6 zzyl6) {
        boolean zZzZ = zzZ(zzpb, zzyl6, true);
        if (zzZ(zzpb2, zzyl6, false)) {
            return true;
        }
        return zZzZ;
    }

    private static boolean zzZ(com.aspose.words.internal.zzPB zzpb, zzYL6 zzyl6, boolean z) {
        if (!zzpb.zzp(z ? zzyl6.zzYn0() : zzyl6.zzYn1())) {
            return false;
        }
        zzY(zzpb, zzyl6, z);
        return true;
    }

    private static boolean zzZ(com.aspose.words.internal.zzPB zzpb, zzYL6 zzyl6, boolean z, boolean z2, zzYL8 zzyl8) {
        zzYL8 zzyl8Zzq1;
        if (!com.aspose.words.internal.zzJ6.zzN(z2 ? zzpb.zzPX() : zzpb.zzPW(), zzyl8.zzYn8())) {
            return false;
        }
        if (z) {
            zzyl8Zzq1 = zzyl6.zzYn3().zzq1(z2 ? zzyl6.zzYmW() : zzyl6.zzYmV());
        } else {
            zzyl8Zzq1 = zzyl6.zzYn2().zzq1(z2 ? zzyl6.zzYmU() : zzyl6.zzYmT());
        }
        zzyl8Zzq1.zzpZ(1);
        zzyl8Zzq1.zzXu(zzyl8.zzYn8());
        return true;
    }

    private static com.aspose.words.internal.zzPB zzZ(zzYLC zzylc, int i) {
        return new com.aspose.words.internal.zzPB(zzylc.zzq1(i).zzYn8(), zzylc.zzq1(zzylc.getIndex(i + 1)).zzYn8());
    }

    private static void zzZ(ArrayList<zzYL8> arrayList, com.aspose.words.internal.zzKA zzka, long j, long j2) {
        float fZzO = com.aspose.words.internal.zzJ6.zzO(j, j2);
        boolean z = false;
        for (int i = 0; i < zzka.getCount(); i++) {
            if (fZzO < zzka.get(i)) {
                arrayList.add(i, new zzYL8(j2, 1));
                zzka.zzY(i, fZzO);
                z = true;
            }
            if (fZzO == zzka.get(i)) {
                z = true;
            }
            if (z) {
                break;
            }
        }
        if (z) {
            return;
        }
        arrayList.add(new zzYL8(j2, 1));
        zzka.zzu(fZzO);
    }

    private static void zzZ(zzYL6 zzyl6, boolean z) {
        ArrayList<zzYL8> arrayListZzpT;
        zzYLC zzylcZzYn3 = z ? zzyl6.zzYn3() : zzyl6.zzYn2();
        int iZzYnj = zzylcZzYn3.zzYnj();
        int size = 1;
        for (int i = 0; i < iZzYnj; i++) {
            if (z) {
                arrayListZzpT = zzyl6.zzpU(i);
            } else {
                arrayListZzpT = zzyl6.zzpT(i);
            }
            zzylcZzYn3.zzZ(i + size, arrayListZzpT);
            size += arrayListZzpT.size();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzZ(zzYLC zzylc, zzYLC zzylc2, int[] iArr) {
        boolean z;
        int iZzYni = zzylc.zzYni();
        int iZzYni2 = zzylc2.zzYni();
        if (!zzylc.zzYnl()) {
            z = true;
            if (!zzylc2.zzYnl()) {
                long jZzYn8 = zzylc.zzq1(iZzYni).zzYn8();
                long jZzYn82 = zzylc2.zzq1(iZzYni2).zzYn8();
                int i = (int) jZzYn8;
                int i2 = (int) jZzYn82;
                if (Float.intBitsToFloat(i) >= Float.intBitsToFloat(i2) && (Float.intBitsToFloat(i) != Float.intBitsToFloat(i2) || com.aspose.words.internal.zzZPY.zzYC(jZzYn8) >= com.aspose.words.internal.zzZPY.zzYC(jZzYn82))) {
                    z = false;
                }
            }
        }
        if (!z) {
            iZzYni = iZzYni2;
        }
        iArr[0] = iZzYni;
        return z;
    }

    private static zzYL9 zzZ(zzYLC zzylc, zzYLC zzylc2, boolean z) {
        if (!z) {
            return zzV(zzylc, zzylc2);
        }
        int[] iArr = new int[1];
        zzYLC zzylcZzZ = zzZ(zzylc, zzylc2, iArr[0], zzZ(zzylc, zzylc2, iArr), false);
        zzylc.zzYnm();
        zzylc2.zzYnm();
        return new zzYL9(zzylcZzZ);
    }

    private static zzYLC zzZ(zzYLC zzylc, zzYLC zzylc2, int i, boolean z, boolean z2) {
        zzYLC zzylc3 = z ? zzylc : zzylc2;
        zzYLC zzylc4 = new zzYLC();
        int iZzYnj = zzylc.zzYnj() + zzylc2.zzYnj();
        int i2 = i;
        zzYLC zzylc5 = zzylc3;
        int i3 = 0;
        while (true) {
            zzYL8 zzyl8Zzq1 = zzylc5.zzq1(i2);
            if (zzylc4.zzYnj() == 0 || (!com.aspose.words.internal.zzZPY.zzD(zzylc4.zzq1(zzylc4.zzYnj() - 1).zzYn8(), zzyl8Zzq1.zzYn8()) && !com.aspose.words.internal.zzZPY.zzD(zzylc4.zzq1(0).zzYn8(), zzyl8Zzq1.zzYn8()))) {
                zzylc4.zzZ(zzyl8Zzq1);
            }
            i2 = i2 == zzylc5.zzYnj() + (-1) ? 0 : i2 + 1;
            i3++;
            if (!z2) {
                if ((i2 == i && zzylc5 == zzylc3) || zzylc4.zzYnj() > iZzYnj || i3 > iZzYnj + 1) {
                    break;
                }
                if (zzyl8Zzq1.zzYn9() != 0) {
                    zzylc5 = zzylc5 == zzylc ? zzylc2 : zzylc;
                    int iZzY = zzylc5.zzY(zzyl8Zzq1);
                    if ((iZzY != i || zzylc5 != zzylc3) && iZzY != -1) {
                        i2 = iZzY == zzylc5.zzYnj() + (-1) ? 0 : iZzY + 1;
                        if (i2 == i && zzylc5 == zzylc3) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    continue;
                }
            } else {
                z2 = false;
            }
        }
        zzylc4.zzYnm();
        return zzylc4;
    }

    private static void zzZ(zzYLC zzylc, zzYLC zzylc2, zzYL7 zzyl7) {
        long jZzL;
        int iZzYn7 = zzyl7.zzYn7();
        int iZzYn6 = zzyl7.zzYn6();
        int iZzZ = zzZ(zzylc, iZzYn7, false);
        int iZzZ2 = zzZ(zzylc, iZzYn7, true);
        int iZzZ3 = zzZ(zzylc2, iZzYn6, false);
        int iZzZ4 = zzZ(zzylc2, iZzYn6, true);
        com.aspose.words.internal.zzPB zzpbZzZ = zzZ(zzylc, iZzYn7, iZzZ2);
        com.aspose.words.internal.zzPB zzpbZzZ2 = zzZ(zzylc2, iZzYn6, iZzZ3);
        long jZzL2 = zzpbZzZ.zzL(0.002f);
        long jZzL3 = zzpbZzZ2.zzL(0.002f);
        boolean zZzZ = com.aspose.words.internal.zzPB.zzZ(new com.aspose.words.internal.zzPB(zzylc.zzq1(iZzYn7).zzYn8(), zzylc2.zzq1(iZzYn6).zzYn8()), new com.aspose.words.internal.zzPB(jZzL2, jZzL3));
        if (zZzZ) {
            com.aspose.words.internal.zzPB zzpbZzZ3 = zzZ(zzylc, iZzYn7, iZzZ);
            com.aspose.words.internal.zzPB zzpbZzZ4 = zzZ(zzylc2, iZzYn6, iZzZ4);
            jZzL = zzpbZzZ3.zzL(0.002f);
            jZzL3 = zzpbZzZ4.zzL(0.002f);
        } else {
            jZzL = jZzL2;
        }
        if (!com.aspose.words.internal.zzZPY.zzD(jZzL, 0L)) {
            zzylc.zzZ(zZzZ ? iZzYn7 : iZzZ2, new zzYL8(jZzL));
        }
        if (!com.aspose.words.internal.zzZPY.zzD(jZzL3, 0L)) {
            if (!zZzZ) {
                iZzZ4 = iZzYn6;
            }
            zzylc2.zzZ(iZzZ4, new zzYL8(jZzL3));
        }
        zzylc.zzZ(zzZ(zzylc, iZzYn7, true), zzylc2.zzq2(zzZ(zzylc2, iZzYn6, true)));
    }

    private static int zzZ(zzYLC zzylc, int i, boolean z) {
        if (!z) {
            return i == 0 ? zzylc.zzYnj() - 1 : i - 1;
        }
        if (i == zzylc.zzYnj() - 1) {
            return 0;
        }
        return i + 1;
    }

    private static com.aspose.words.internal.zzPB zzZ(zzYLC zzylc, int i, int i2) {
        return new com.aspose.words.internal.zzPB(zzylc.zzq1(i).zzYn8(), zzylc.zzq1(i2).zzYn8());
    }

    private static zzYLC zzZ(zzYLC zzylc, zzYLC zzylc2, boolean z, zzYLC zzylc3, zzYLC zzylc4) {
        if (!z) {
            zzYL9 zzyl9ZzV = zzV(zzylc, zzylc2);
            if (zzyl9ZzV.zzYna() == 1) {
                return zzyl9ZzV.zzq0(0) == zzylc ? zzylc4 : zzylc3;
            }
            return new zzYLC();
        }
        int[] iArr = new int[1];
        boolean zZzY = zzY(zzylc, zzylc2, iArr);
        int i = iArr[0];
        if (i == -1) {
            return new zzYLC();
        }
        zzYLC zzylcZzZ = zzZ(zzylc, zzylc2, i, zZzY, true);
        zzylc.zzYnm();
        zzylc2.zzYnm();
        return zzylcZzZ;
    }
}
