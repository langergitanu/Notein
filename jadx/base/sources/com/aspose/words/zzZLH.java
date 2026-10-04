package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZLH {
    private zzYCD zzYuE;

    public zzZLH(zzYCD zzycd) {
        this.zzYuE = zzycd;
    }

    private com.aspose.words.internal.zzQ2 zzQ(RefInt refInt) {
        long j = this.zzYuE.zzYae().zzY90()[refInt.get()];
        zzZ5I zzz5iZzm5 = this.zzYuE.zzYae().zzm5(refInt.get());
        com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
        long j2 = this.zzYuE.zzYae().zzY90()[refInt.get()];
        com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
        long j3 = this.zzYuE.zzYae().zzY90()[refInt.get()];
        refInt.set(refInt.get() + 1);
        com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5();
        zzq5.zz6(360.0f - (Float.intBitsToFloat((int) j3) / 65536.0f));
        zzq5.zz5((-com.aspose.words.internal.zzZPY.zzYC(j3)) / 65536.0f);
        int i = (int) j2;
        zzq5.setSize(com.aspose.words.internal.zzZPW.zzG(Float.intBitsToFloat(i) * 2.0f, com.aspose.words.internal.zzZPY.zzYC(j2) * 2.0f));
        zzq5.zzA(com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) j) - Float.intBitsToFloat(i), com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(j2)));
        return zzZ(zzq5, zzz5iZzm5);
    }

    private long zzXK(long j) {
        return zzZ(j, zzZ5I.zzW(j, this.zzYuE.getShape().zzYbm(), this.zzYuE.getShape().zzYbl()));
    }

    private int zzY(zzYM6 zzym6, int i) throws Exception {
        int i2 = 0;
        int i3 = i;
        while (i2 < zzym6.zzYnK()) {
            zzZ5I zzz5iZzYai = this.zzYuE.zzYai();
            long jZzYaj = this.zzYuE.zzYaj();
            zzZ5I zzz5iZzm5 = this.zzYuE.zzYae().zzm5(i3);
            int i4 = i3 + 1;
            long j = this.zzYuE.zzYae().zzY90()[i3];
            zzZ5I zzz5iZzm52 = this.zzYuE.zzYae().zzm5(i4);
            int i5 = i3 + 2;
            long j2 = this.zzYuE.zzYae().zzY90()[i4];
            zzZ5I zzz5iZzm53 = this.zzYuE.zzYae().zzm5(i5);
            int i6 = i3 + 3;
            long j3 = this.zzYuE.zzYae().zzY90()[i5];
            this.zzYuE.zzY(j3, zzz5iZzm53);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzPZ>) this.zzYuE.zzzz().zzNY(), new com.aspose.words.internal.zzPZ(zzZ(jZzYaj, zzz5iZzYai), zzZ(j, zzz5iZzm5), zzZ(j2, zzz5iZzm52), zzZ(j3, zzz5iZzm53)));
            i2++;
            i3 = i6;
        }
        this.zzYuE.zzU(null);
        return i3;
    }

    private void zzzF() throws Exception {
        this.zzYuE.zzzz().zze(true);
    }

    public final void zzZ(zzYM6 zzym6, RefInt refInt) throws Exception {
        int iZzYnL = zzym6.zzYnL();
        if (iZzYnL != -1) {
            if (iZzYnL == 0) {
                refInt.set(zzZ(zzym6, refInt.get()));
                return;
            }
            if (iZzYnL == 1) {
                refInt.set(zzY(zzym6, refInt.get()));
                return;
            }
            if (iZzYnL == 2) {
                this.zzYuE.zzYam();
                zzYCD zzycd = this.zzYuE;
                zzycd.zzY(zzycd.zzYae().zzY90()[refInt.get()], this.zzYuE.zzYae().zzm5(refInt.get()));
                this.zzYuE.zzQV(true);
                com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
                return;
            }
            if (iZzYnL == 3) {
                zzzF();
                return;
            }
            if (iZzYnL == 4) {
                this.zzYuE.zzYan();
                return;
            }
            switch (iZzYnL) {
                case 160:
                case 169:
                case 172:
                case 173:
                case 174:
                case 175:
                case 176:
                case 177:
                case 178:
                case 179:
                case 180:
                case 182:
                    return;
                case 161:
                    this.zzYuE.zzU(null);
                    refInt.set(zzZ(zzym6, refInt.get(), this.zzYuE.zzYah()));
                    return;
                case 162:
                    this.zzYuE.zzYam();
                    refInt.set(zzZ(zzym6, refInt.get(), false));
                    return;
                case 163:
                    this.zzYuE.zzU(null);
                    refInt.set(zzZ(zzym6, refInt.get(), false, this.zzYuE.zzYah()));
                    return;
                case 164:
                    this.zzYuE.zzYam();
                    refInt.set(zzZ(zzym6, refInt.get(), false, false));
                    return;
                case 165:
                    this.zzYuE.zzU(null);
                    refInt.set(zzZ(zzym6, refInt.get(), true, this.zzYuE.zzYah()));
                    return;
                case 166:
                    this.zzYuE.zzYam();
                    refInt.set(zzZ(zzym6, refInt.get(), true, false));
                    return;
                case 167:
                    this.zzYuE.zzU(null);
                    refInt.set(zzY(zzym6, refInt.get(), true));
                    return;
                case 168:
                    this.zzYuE.zzU(null);
                    refInt.set(zzY(zzym6, refInt.get(), false));
                    return;
                case 170:
                    this.zzYuE.zzRV().zzY((com.aspose.words.internal.zzPY) null);
                    return;
                case 171:
                    this.zzYuE.zzRV().zzX(null);
                    return;
                case 181:
                    com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
                    this.zzYuE.zzRV().zzY(this.zzYuE.zzYak());
                    return;
                default:
                    throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: pathInfo");
            }
        }
    }

    private int zzY(zzYM6 zzym6, int i, boolean z) throws Exception {
        for (int i2 = 0; i2 < zzym6.zzYnK(); i2++) {
            RefInt refInt = new RefInt(i);
            zzY(zzY(refInt, z));
            i = refInt.get();
            z = !z;
        }
        this.zzYuE.zzQV(false);
        return i;
    }

    private com.aspose.words.internal.zzQ2 zzY(RefInt refInt, boolean z) {
        long jZzG;
        float f;
        zzYBX zzybxZzYal = this.zzYuE.zzYal();
        long jZzX = zzybxZzYal.zzX(this.zzYuE.zzYaj(), this.zzYuE.zzYai());
        zzZ5I zzz5i = new zzZ5I(false, false);
        zzYCD zzycd = this.zzYuE;
        zzycd.zzY(zzycd.zzYae().zzY90()[refInt.get()], this.zzYuE.zzYae().zzm5(refInt.get()));
        long jZzX2 = zzybxZzYal.zzX(this.zzYuE.zzYaj(), this.zzYuE.zzYai());
        zzZ5I zzz5i2 = new zzZ5I(false, false);
        com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
        int i = (int) jZzX2;
        int i2 = (int) jZzX;
        float fAbs = Math.abs(Float.intBitsToFloat(i) - Float.intBitsToFloat(i2));
        float fAbs2 = Math.abs(com.aspose.words.internal.zzZPY.zzYC(jZzX2) - com.aspose.words.internal.zzZPY.zzYC(jZzX));
        if (z) {
            jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i2) - fAbs, com.aspose.words.internal.zzZPY.zzYC(jZzX2) - fAbs2);
        } else {
            jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i) - fAbs, com.aspose.words.internal.zzZPY.zzYC(jZzX) - fAbs2);
        }
        long jZzG2 = com.aspose.words.internal.zzZPW.zzG(fAbs * 2.0f, fAbs2 * 2.0f);
        float f2 = 180.0f;
        if (Float.intBitsToFloat(i2) < Float.intBitsToFloat(i) && com.aspose.words.internal.zzZPY.zzYC(jZzX) < com.aspose.words.internal.zzZPY.zzYC(jZzX2)) {
            if (z) {
                f2 = 270.0f;
                f = 90.0f;
            }
            f = -90.0f;
        } else if (Float.intBitsToFloat(i2) >= Float.intBitsToFloat(i) || com.aspose.words.internal.zzZPY.zzYC(jZzX) <= com.aspose.words.internal.zzZPY.zzYC(jZzX2)) {
            f2 = 0.0f;
            if (Float.intBitsToFloat(i2) <= Float.intBitsToFloat(i) || com.aspose.words.internal.zzZPY.zzYC(jZzX) <= com.aspose.words.internal.zzZPY.zzYC(jZzX2)) {
                if (Float.intBitsToFloat(i2) <= Float.intBitsToFloat(i) || com.aspose.words.internal.zzZPY.zzYC(jZzX) >= com.aspose.words.internal.zzZPY.zzYC(jZzX2)) {
                    com.aspose.words.internal.zzQ2 zzq2 = new com.aspose.words.internal.zzQ2(1);
                    long jZzZ = zzZ(jZzX, zzz5i);
                    long jZzZ2 = zzZ(jZzX2, zzz5i2);
                    zzq2.zzV(jZzZ, jZzZ, jZzZ2, jZzZ2);
                    return zzq2;
                }
                if (z) {
                    f2 = 270.0f;
                }
                f = 90.0f;
            } else if (z) {
                f = 90.0f;
                f2 = 90.0f;
            }
            f = -90.0f;
        } else if (z) {
            f = -90.0f;
            f2 = 90.0f;
        } else {
            f = 90.0f;
        }
        com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5();
        zzq5.zzA(jZzG);
        zzq5.setSize(jZzG2);
        zzq5.zz6(f2);
        zzq5.zz5(f);
        return zzZ(zzq5, zzz5i);
    }

    private int zzZ(zzYM6 zzym6, int i) throws Exception {
        com.aspose.words.internal.zzOS zzos = (com.aspose.words.internal.zzOS) com.aspose.words.internal.zzZKW.zzZ(this.zzYuE.zzYag(), com.aspose.words.internal.zzOS.class);
        if (zzos == null) {
            zzos = new com.aspose.words.internal.zzOS();
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzOS>) this.zzYuE.zzzz().zzNY(), zzos);
            this.zzYuE.zzU(zzos);
            if (this.zzYuE.zzYah()) {
                zzos.zzNu().add(zzZ(this.zzYuE.zzYaj(), this.zzYuE.zzYai()));
            }
        }
        int iZzYnK = zzym6.zzYnK();
        for (int i2 = 0; i2 < iZzYnK; i2++) {
            zzYCD zzycd = this.zzYuE;
            zzycd.zzY(zzycd.zzYae().zzY90()[i], this.zzYuE.zzYae().zzm5(i));
            zzos.zzNu().add(zzZ(this.zzYuE.zzYaj(), this.zzYuE.zzYai()));
            i++;
        }
        return i;
    }

    private int zzZ(zzYM6 zzym6, int i, boolean z) throws Exception {
        int iZzYnK = zzym6.zzYnK() / 3;
        int i2 = 0;
        while (i2 < iZzYnK) {
            RefInt refInt = new RefInt(i);
            com.aspose.words.internal.zzQ2 zzq2ZzQ = zzQ(refInt);
            int i3 = refInt.get();
            if (z) {
                zzZ(zzq2ZzQ);
                z = false;
            }
            zzY(zzq2ZzQ);
            i2++;
            i = i3;
        }
        this.zzYuE.zzQV(false);
        return i;
    }

    private int zzZ(zzYM6 zzym6, int i, boolean z, boolean z2) throws Exception {
        int iZzYnK = zzym6.zzYnK() / 4;
        int i2 = 0;
        while (i2 < iZzYnK) {
            RefInt refInt = new RefInt(i);
            com.aspose.words.internal.zzQ2 zzq2ZzZ = zzZ(refInt, z);
            int i3 = refInt.get();
            if (z2) {
                zzZ(zzq2ZzZ);
                z2 = false;
            }
            zzY(zzq2ZzZ);
            i2++;
            i = i3;
        }
        this.zzYuE.zzQV(false);
        return i;
    }

    private void zzY(com.aspose.words.internal.zzQ2 zzq2) throws Exception {
        for (int i = 0; i < zzq2.getCount(); i++) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzPZ>) this.zzYuE.zzzz().zzNY(), new com.aspose.words.internal.zzPZ(zzq2, i));
        }
    }

    private com.aspose.words.internal.zzQ2 zzZ(RefInt refInt, boolean z) {
        double d;
        zzYBX zzybxZzYal = this.zzYuE.zzYal();
        long jZzX = zzybxZzYal.zzX(this.zzYuE.zzYae().zzY90()[refInt.get()], this.zzYuE.zzYae().zzm5(refInt.get()));
        com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
        long jZzX2 = zzybxZzYal.zzX(this.zzYuE.zzYae().zzY90()[refInt.get()], this.zzYuE.zzYae().zzm5(refInt.get()));
        com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
        long jZzX3 = zzybxZzYal.zzX(this.zzYuE.zzYae().zzY90()[refInt.get()], this.zzYuE.zzYae().zzm5(refInt.get()));
        com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
        long jZzX4 = zzybxZzYal.zzX(this.zzYuE.zzYae().zzY90()[refInt.get()], this.zzYuE.zzYae().zzm5(refInt.get()));
        com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
        int i = (int) jZzX;
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzX);
        int i2 = (int) jZzX2;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fZzYC2 = com.aspose.words.internal.zzZPY.zzYC(jZzX2);
        if (Float.intBitsToFloat(i) > Float.intBitsToFloat(i2)) {
            fIntBitsToFloat = Float.intBitsToFloat(i2);
            fIntBitsToFloat2 = Float.intBitsToFloat(i);
        }
        if (com.aspose.words.internal.zzZPY.zzYC(jZzX) > com.aspose.words.internal.zzZPY.zzYC(jZzX2)) {
            fZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzX2);
            fZzYC2 = com.aspose.words.internal.zzZPY.zzYC(jZzX);
        }
        float f = fIntBitsToFloat2 - fIntBitsToFloat;
        float f2 = fZzYC2 - fZzYC;
        float f3 = (f * 0.5f) + fIntBitsToFloat;
        float f4 = (0.5f * f2) + fZzYC;
        long jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzX3) - f3, com.aspose.words.internal.zzZPY.zzYC(jZzX3) - f4);
        long jZzG2 = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzX4) - f3, com.aspose.words.internal.zzZPY.zzYC(jZzX4) - f4);
        int i3 = (int) jZzG;
        double dZzZK = com.aspose.words.internal.zzAN.zzZK(Math.acos(((double) Float.intBitsToFloat(i3)) / Math.sqrt((((double) com.aspose.words.internal.zzZPY.zzYC(jZzG)) * ((double) com.aspose.words.internal.zzZPY.zzYC(jZzG))) + (((double) Float.intBitsToFloat(i3)) * ((double) Float.intBitsToFloat(i3))))));
        if (com.aspose.words.internal.zzZPY.zzYC(jZzG) < 0.0f) {
            dZzZK = 360.0d - dZzZK;
        }
        int i4 = (int) jZzG2;
        double dZzZK2 = com.aspose.words.internal.zzAN.zzZK(Math.acos(((double) Float.intBitsToFloat(i4)) / Math.sqrt((((double) com.aspose.words.internal.zzZPY.zzYC(jZzG2)) * ((double) com.aspose.words.internal.zzZPY.zzYC(jZzG2))) + (((double) Float.intBitsToFloat(i4)) * ((double) Float.intBitsToFloat(i4))))));
        if (com.aspose.words.internal.zzZPY.zzYC(jZzG2) < 0.0f) {
            dZzZK2 = 360.0d - dZzZK2;
        }
        if (z) {
            if (dZzZK2 <= dZzZK) {
                d = dZzZK2 + (360.0d - dZzZK);
            }
            com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5();
            zzq5.zz6(dZzZK);
            zzq5.zz5(d);
            zzq5.setSize(com.aspose.words.internal.zzZPW.zzG(f, f2));
            zzq5.zzA(com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat, fZzYC));
            return zzZ(zzq5, new zzZ5I(false, false));
        }
        if (dZzZK2 >= dZzZK) {
            dZzZK2 -= 360.0d;
        }
        d = dZzZK2 - dZzZK;
        com.aspose.words.internal.zzQ5 zzq52 = new com.aspose.words.internal.zzQ5();
        zzq52.zz6(dZzZK);
        zzq52.zz5(d);
        zzq52.setSize(com.aspose.words.internal.zzZPW.zzG(f, f2));
        zzq52.zzA(com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat, fZzYC));
        return zzZ(zzq52, new zzZ5I(false, false));
    }

    private void zzZ(com.aspose.words.internal.zzQ2 zzq2) throws Exception {
        if (this.zzYuE.zzzz().getCount() == 0) {
            long jZzYd = zzq2.zzYd(0);
            if (Float.intBitsToFloat((int) jZzYd) == Float.intBitsToFloat((int) this.zzYuE.zzYaj()) && com.aspose.words.internal.zzZPY.zzYC(jZzYd) == com.aspose.words.internal.zzZPY.zzYC(this.zzYuE.zzYaj())) {
                return;
            }
            com.aspose.words.internal.zzOS zzos = new com.aspose.words.internal.zzOS();
            zzos.zzNu().add(zzXK(this.zzYuE.zzYaj()));
            zzos.zzNu().add(jZzYd);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzOS>) this.zzYuE.zzzz().zzNY(), zzos);
        }
    }

    private com.aspose.words.internal.zzQ2 zzZ(com.aspose.words.internal.zzQ5 zzq5, zzZ5I zzz5i) {
        com.aspose.words.internal.zzQ2 zzq2ZzPV = zzq5.zzPV();
        for (int i = 0; i < zzq2ZzPV.getCount(); i++) {
            zzq2ZzPV.zzZ(i, zzZ(zzq2ZzPV.zzYd(i), zzz5i));
            zzq2ZzPV.zzY(i, zzZ(zzq2ZzPV.zzYc(i), zzz5i));
            zzq2ZzPV.zzX(i, zzZ(zzq2ZzPV.zzYb(i), zzz5i));
            zzq2ZzPV.zzW(i, zzZ(zzq2ZzPV.zzYa(i), zzz5i));
        }
        return zzq2ZzPV;
    }

    private long zzZ(long j, zzZ5I zzz5i) {
        return this.zzYuE.zzYal().zzZ(j, zzz5i, false);
    }
}
