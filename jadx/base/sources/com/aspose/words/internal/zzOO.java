package com.aspose.words.internal;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public final class zzOO {
    private static void zzW(ArrayList<zzPI> arrayList) {
        Collections.reverse(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            zzPI zzpi = arrayList.get(i);
            zzpi.zzO(1.0f - zzpi.zzOG());
        }
    }

    private static int zzX(int i, int i2, float f) {
        if (i == i2) {
            return i;
        }
        return (int) ((f * (i2 - i)) + i);
    }

    private static zzPP zzZ(zzOP zzop) {
        float fZzPv = zzop.zzNr().zzPs().zzPv() - zzop.zzNs().zzPs().zzPv();
        float fZzPv2 = zzop.zzNr().zzPr().zzPv() - zzop.zzNs().zzPr().zzPv();
        if (zzAN.zzf(fZzPv) && zzAN.zzf(fZzPv2)) {
            return zzop.zzNr();
        }
        float fSqrt = (float) Math.sqrt((fZzPv2 * fZzPv2) + (fZzPv * fZzPv));
        float fZzPv3 = zzop.zzNq().zzPv() / zzop.zzNp().zzPv();
        float fZzPv4 = (((zzop.zzNp().zzPv() + fSqrt) * fZzPv3) - zzop.zzNq().zzPv()) / (1.0f - fZzPv3);
        return new zzPP(((fZzPv / fSqrt) * fZzPv4) + zzop.zzNr().zzPs().zzPv(), false, ((fZzPv2 / fSqrt) * fZzPv4) + zzop.zzNr().zzPr().zzPv(), false);
    }

    public static zzP0 zzX(zzOP zzop, zzZQ4 zzzq4) throws Exception {
        zzOP zzopZzH = zzop.zzH(zzzq4);
        zzP8 zzp8 = new zzP8();
        zzP5 zzp5 = new zzP5();
        zzopZzH.zzZ(zzZ(zzopZzH));
        zzopZzH.zzZ(new zzPP(zzJ6.zzZ(zzopZzH.zzNs().zzPt(), zzopZzH.zzNp().zzPv(), zzopZzH.zzNr().zzPt())));
        float fZzPv = zzopZzH.zzNp().zzPv() * 2.0f;
        zzp5.zzZ(new zzQ5(new zzZQ4(zzopZzH.zzNs().zzPs().zzPv() - zzopZzH.zzNp().zzPv(), zzopZzH.zzNs().zzPr().zzPv() - zzopZzH.zzNp().zzPv(), fZzPv, fZzPv)));
        zzp5.zze(true);
        zzZQG.zzZ(zzp8.zzO7(), zzp5);
        zzP0 zzp0ZzZ = zzZ(zzopZzH, zzp8);
        zzZ(zzopZzH, zzp0ZzZ);
        long[] jArrZzz = zzJ6.zzz(zzzq4);
        float f = 1.0f;
        for (int i = 0; i < 4; i++) {
            float fZzZ = zzZ(zzp0ZzZ, jArrZzz[i]);
            if (fZzZ > f) {
                f = fZzZ;
            }
        }
        zzP9 zzp9 = new zzP9();
        zzp9.zzY(-Float.intBitsToFloat((int) zzp0ZzZ.zzNV()), -zzZPY.zzYC(zzp0ZzZ.zzNV()), 1);
        zzp9.zzZ(f, f, 1);
        zzp9.zzY(Float.intBitsToFloat((int) zzp0ZzZ.zzNV()), zzZPY.zzYC(zzp0ZzZ.zzNV()), 1);
        zzp0ZzZ.zzY(zzZ(zzopZzH.zzOP(), f, zzopZzH.zzNq().zzPv() / zzopZzH.zzNp().zzPv(), zzopZzH.zzNa()));
        zzp0ZzZ.zzUu().zzY(zzp9);
        return zzp0ZzZ;
    }

    private static zzP0 zzZ(zzOP zzop, zzP8 zzp8) {
        zzP0 zzp0 = new zzP0(zzp8, zzop.zzNr().zzPt());
        if (zzop.zzON() != null) {
            zzp0.zzY((float[]) zzop.zzON().clone());
        }
        if (zzop.zzOO() != null) {
            zzp0.zzZ((float[]) zzop.zzOO().clone());
        }
        if (zzop.zzOP() != null) {
            zzp0.zzY(new zzPI[zzop.zzOP().length]);
            for (int i = 0; i < zzop.zzOP().length; i++) {
                zzp0.zzOP()[i] = zzop.zzOP()[i].zzOF();
            }
        }
        return zzp0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzPI[] zzZ(zzPI[] zzpiArr, float f, float f2, int i) {
        boolean z;
        boolean z2;
        if (i == 0) {
            z = false;
            z2 = false;
        } else if (i == 1 || i == 2 || i == 3) {
            z2 = true;
            z = false;
        } else {
            z = true;
            z2 = false;
        }
        ArrayList arrayList = new ArrayList((z ? 1 : (int) f) * zzpiArr.length);
        float f3 = (1.0f - f2) / f;
        float f4 = f2 / f;
        float f5 = f4;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            if (z) {
                if (z3) {
                    break;
                }
                float f6 = f5 + f3;
                zzPI[] zzpiArr2 = zzpiArr;
                zzZ(arrayList, zzpiArr2, z4, f3, f5, f6);
                z4 = (z2 || z4) ? false : true;
                z3 = true;
                zzpiArr = zzpiArr2;
                f5 = f6;
            } else {
                if (f5 >= 1.0f) {
                    break;
                }
                float f62 = f5 + f3;
                zzPI[] zzpiArr22 = zzpiArr;
                zzZ(arrayList, zzpiArr22, z4, f3, f5, f62);
                if (z2) {
                }
                z3 = true;
                zzpiArr = zzpiArr22;
                f5 = f62;
            }
        }
        zzPI[] zzpiArr3 = zzpiArr;
        if (z) {
            zzPI zzpiZzOF = ((zzPI) C21505OooO0Oo.OooO00o(1, arrayList)).zzOF();
            if (zzpiZzOF.zzOG() < 1.0f) {
                zzpiZzOF.zzO(1.0f);
                zzZQG.zzZ((ArrayList<zzPI>) arrayList, zzpiZzOF);
            }
            zzPI zzpiZzOF2 = ((zzPI) arrayList.get(0)).zzOF();
            if (zzpiZzOF2.zzOG() > 0.0f) {
                zzpiZzOF2.zzO(0.0f);
                arrayList.add(0, zzpiZzOF2);
            }
        } else if (f2 > 0.0f) {
            float f7 = f4;
            boolean z5 = !z2;
            while (f7 > 0.0f) {
                float f8 = f7 - f3;
                zzZ(arrayList, zzpiArr3, z5, f3, f7, f8);
                z5 = z2 && !z5;
                f7 = f8;
            }
        }
        zzW(arrayList);
        return (zzPI[]) arrayList.toArray(new zzPI[0]);
    }

    private static void zzZ(ArrayList<zzPI> arrayList, zzPI[] zzpiArr, boolean z, float f, float f2, float f3) {
        int length = zzpiArr.length;
        boolean z2 = f2 > f3;
        for (int i = 0; i < length; i++) {
            zzPI zzpiZzOF = zzpiArr[z ? (length - i) - 1 : i].zzOF();
            float fZzOG = zzpiZzOF.zzOG();
            float f4 = 1.0f;
            if (z) {
                fZzOG = 1.0f - zzpiZzOF.zzOG();
            }
            float f5 = fZzOG * f;
            if (z2) {
                f5 = -f5;
            }
            float f6 = f2 + f5;
            if (z2) {
                if (f6 < 0.0f) {
                    zzPI zzpi = arrayList.get(0);
                    zzpiZzOF.zzY(zzPS.zzZ(zzpi.zzZy(), zzpiZzOF.zzZy(), zzpi.zzOG() / (zzpi.zzOG() - f6)));
                    f6 = 0.0f;
                }
                zzpiZzOF.zzO(f6);
                arrayList.add(0, zzpiZzOF);
            } else {
                if (f6 > 1.0f) {
                    zzPI zzpi2 = (zzPI) C21505OooO0Oo.OooO00o(1, arrayList);
                    zzpiZzOF.zzY(zzZ(zzpi2.zzZy(), zzpiZzOF.zzZy(), (1.0f - zzpi2.zzOG()) / (f6 - zzpi2.zzOG())));
                } else {
                    f4 = f6;
                }
                zzpiZzOF.zzO(f4);
                zzZQG.zzZ(arrayList, zzpiZzOF);
            }
        }
    }

    private static zzPV zzZ(zzPV zzpv, zzPV zzpv2, float f) {
        return zzPV.zzX(zzX(zzpv.zzPD(), zzpv2.zzPD(), f), zzX(zzpv.zzPC(), zzpv2.zzPC(), f), zzX(zzpv.zzPB(), zzpv2.zzPB(), f), zzX(zzpv.zzPA(), zzpv2.zzPA(), f));
    }

    private static float zzZ(zzP0 zzp0, long j) throws Exception {
        zz0Q zz0qZzZ = zzOZ.zzZ(zzp0.zzUu(), zzp0.zzNV(), j);
        if (zz0qZzZ.getCount() == 0) {
            return 1.0f;
        }
        float f = Float.MAX_VALUE;
        for (int i = 0; i < zz0qZzZ.getCount(); i++) {
            float fZzO = zzJ6.zzO(zzp0.zzNV(), zz0qZzZ.get(i));
            if (fZzO < f) {
                f = fZzO;
            }
        }
        return zzJ6.zzO(zzp0.zzNV(), j) / f;
    }

    private static void zzZ(zzOP zzop, zzP0 zzp0) {
        if (zzP9.zzO(zzop.zzNb())) {
            return;
        }
        zzp0.zzUu().zzY(zzop.zzNb());
        zzp0.zzo(zzop.zzNb().zzR(zzp0.zzNV()));
        zzp0.zzL(null);
    }
}
