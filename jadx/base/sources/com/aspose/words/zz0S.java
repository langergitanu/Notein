package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz0S {
    private boolean zzYXG;
    private com.aspose.words.internal.zzH6 zzl7;
    private com.aspose.words.internal.zzZYG<com.aspose.words.internal.zzD3<byte[]>> zzYXP = new com.aspose.words.internal.zzZYG<>();
    private com.aspose.words.internal.zzZYG<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<byte[]>>>> zzYXO = new com.aspose.words.internal.zzZYG<>();
    private com.aspose.words.internal.zzZYG<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<byte[]>>>> zzYXN = new com.aspose.words.internal.zzZYG<>();
    private com.aspose.words.internal.zzZYG<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<byte[]>>>> zzYXM = new com.aspose.words.internal.zzZYG<>();
    private com.aspose.words.internal.zzZYG<com.aspose.words.internal.zzD3<byte[]>> zzYXL = new com.aspose.words.internal.zzZYG<>();
    private com.aspose.words.internal.zzZYG<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<byte[]>>>> zzYXK = new com.aspose.words.internal.zzZYG<>();
    private com.aspose.words.internal.zzZYG<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<byte[]>>>> zzYXJ = new com.aspose.words.internal.zzZYG<>();
    private com.aspose.words.internal.zzZYG<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<byte[]>>>> zzYXI = new com.aspose.words.internal.zzZYG<>();
    private int zzYXH = 26;

    public zz0S(com.aspose.words.internal.zzH6 zzh6) {
        this.zzl7 = zzh6;
    }

    private byte[] zzY(com.aspose.words.internal.zzPM zzpm, int i, int i2) throws Exception {
        com.aspose.words.internal.zzPM zzpm2 = new com.aspose.words.internal.zzPM(i2 == 1 ? this.zzYXH * 2 : this.zzYXH, zzpm.zzPk(), zzpm.zzPl());
        String strZzS7 = com.aspose.words.internal.zzZVS.zzS7(i);
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        boolean z = this.zzYXG;
        zzg.zzX(new com.aspose.words.internal.zzZU(zzpm2, z ? com.aspose.words.internal.zzPV.zzHZ : com.aspose.words.internal.zzPV.zzKa, z ? com.aspose.words.internal.zzPV.zzKa : com.aspose.words.internal.zzPV.zzHZ, com.aspose.words.internal.zzZPY.zzG(0.0f, zzpm2.getAscentPoints()), strZzS7, 0.0f));
        return com.aspose.words.internal.zzE.zzZ(zzg, new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzG(0.0f, 0.0f), zzpm2.zz6(strZzS7)), 96.0f, this.zzl7);
    }

    public static int zzYO(float f) {
        return com.aspose.words.internal.zzAN.zzR(f, 26.0f) ? 26 : 70;
    }

    private com.aspose.words.internal.zzZYG<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<byte[]>>>> zzZt6() {
        return this.zzYXH == 26 ? this.zzYXN : this.zzYXJ;
    }

    private com.aspose.words.internal.zzZYG<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<byte[]>>>> zzZt7() {
        return this.zzYXH == 26 ? this.zzYXM : this.zzYXI;
    }

    private com.aspose.words.internal.zzZYG<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<byte[]>>>> zzZt8() {
        return this.zzYXH == 26 ? this.zzYXO : this.zzYXK;
    }

    private com.aspose.words.internal.zzZYG<com.aspose.words.internal.zzD3<byte[]>> zzZt9() {
        return this.zzYXH == 26 ? this.zzYXP : this.zzYXL;
    }

    public final com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzZU zzzu, zz21 zz21Var, zzZ90 zzz90) throws Exception {
        zz1Z zz1z = new zz1Z(zz21Var, zzz90);
        com.aspose.words.internal.zzG zzgZzZ = zzZ(zzzu, zz1z.zzA(0), (float) zz21Var.zzZuN(), 6);
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(zzzu.zzZE(), com.aspose.words.internal.zzZPW.zzG(Float.intBitsToFloat((int) zzzu.getSize()), zzzu.zzZr().zzPf()));
        if (zzzu.zzZO() != null) {
            zzgZzZ.zzZO().zzZ(zzzu.zzZO(), 0);
        }
        zzgZzZ.zzZO().zzZ(zz1z.zzZt(zzzq4), 1);
        return zzgZzZ;
    }

    public final com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzZU zzzu, zz25 zz25Var, zzZ90 zzz90) throws Exception {
        return zzZ(zzzu, zz25Var.zzZQX().zzZ(zzz90, (zzZCM) null), (float) zz25Var.zzZuN(), 1);
    }

    public final com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzZU zzzu, zz27 zz27Var, zzZ90 zzz90) throws Exception {
        return zzZ(zzzu, zz27Var.zzZQX().zzZ(zzz90, (zzZCM) null), (float) zz27Var.zzZPS(), 5);
    }

    private com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzZU zzzu, com.aspose.words.internal.zzPV zzpv, float f, int i) throws Exception {
        int i2;
        float f2;
        float f3;
        zz0S zz0s = this;
        int i3 = i;
        if (i3 != 5 && i3 != 6 && i3 != 1) {
            throw new IllegalArgumentException("Unexpected effect type");
        }
        zz0s.zzYXG = zzzu.zzZy().isEmpty();
        int iZzYO = zzYO(zzzu.zzZr().zzPg());
        zz0s.zzYXH = iZzYO;
        if (i3 == 1) {
            iZzYO *= 2;
        }
        float fZzPg = zzzu.zzZr().zzPg() / iZzYO;
        float fZzPf = zzzu.zzZr().zzPf();
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        int iZzZG = com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzSA.pointToPixel(f));
        float fPixelToPoint = (float) com.aspose.words.internal.zzSA.pixelToPoint(com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzSA.pointToPixel(f * fZzPg)));
        long jZzG = com.aspose.words.internal.zzZPY.zzG(zzzu.zzZm() - fPixelToPoint, zzzu.zzZo() - fPixelToPoint);
        Iterator<Integer> it = new com.aspose.words.internal.zzZYE(zzzu.getText()).iterator();
        long jZzC = jZzG;
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            float fZzY7 = zzzu.zzZr().zzY7(iIntValue);
            if (fZzY7 > 0.0f) {
                i2 = iZzZG;
                byte[] bArrZzZ = zz0s.zzZ(zzzu.zzZr(), iIntValue, i2, zzpv, i3);
                float f4 = 2.0f * fPixelToPoint;
                long jZzG2 = com.aspose.words.internal.zzZPW.zzG(fZzY7 + f4, f4 + fZzPf);
                f2 = fZzY7;
                f3 = 0.0f;
                zzg.zzX(new com.aspose.words.internal.zzZP(jZzC, jZzG2, bArrZzZ));
            } else {
                i2 = iZzZG;
                f2 = fZzY7;
                f3 = 0.0f;
            }
            jZzC = com.aspose.words.internal.zzZPY.zzC(jZzC, com.aspose.words.internal.zzZPW.zzG(f2, f3));
            zz0s = this;
            i3 = i;
            iZzZG = i2;
        }
        com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        return zzg;
    }

    private byte[] zzZ(com.aspose.words.internal.zzPM zzpm, int i, int i2, com.aspose.words.internal.zzPV zzpv, int i3) throws Exception {
        com.aspose.words.internal.zzZYG<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<byte[]>>>> zzzygZzZt7;
        if (i3 == 1) {
            zzzygZzZt7 = zzZt7();
        } else if (i3 == 5) {
            zzzygZzZt7 = zzZt6();
        } else if (i3 == 6) {
            zzzygZzZt7 = zzZt8();
        } else {
            throw new IllegalArgumentException("Unexpected effect type");
        }
        com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<byte[]>>> zzd3 = zzzygZzZt7.get(zzpm.zzOQ());
        if (zzd3 == null) {
            zzd3 = new com.aspose.words.internal.zzD3<>();
            zzzygZzZt7.set(zzpm.zzOQ(), zzd3);
        }
        com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD3<byte[]>> zzd32 = zzd3.get(i2);
        if (zzd32 == null) {
            zzd32 = new com.aspose.words.internal.zzD3<>();
            zzd3.set(i2, zzd32);
        }
        com.aspose.words.internal.zzD3<byte[]> zzd33 = zzd32.get(i);
        if (zzd33 == null) {
            zzd33 = new com.aspose.words.internal.zzD3<>();
            zzd32.set(i, zzd33);
        }
        int argb = zzpv.toArgb();
        if (zzd33.get(argb) == null) {
            int argb2 = com.aspose.words.internal.zzPV.zzKa.toArgb();
            byte[] bArrZzZ = zzd33.get(argb2);
            if (bArrZzZ == null) {
                bArrZzZ = zzZ(zzpm, i, i2, i3);
                zzd33.set(argb2, bArrZzZ);
            }
            zzd33.set(argb, zz03.zzZ(bArrZzZ, zzpv));
        }
        return zzd33.get(argb);
    }

    private byte[] zzZ(com.aspose.words.internal.zzPM zzpm, int i, int i2, int i3) throws Exception {
        byte[] bArrZzZ = zzZ(zzpm, i, i3);
        if (i3 == 1) {
            return zz03.zzu(bArrZzZ, i2);
        }
        if (i3 != 5) {
            if (i3 != 6) {
                throw new IllegalArgumentException("Unexpected effect type");
            }
            if (i2 != 0) {
                return zz03.zzv(bArrZzZ, i2);
            }
        } else if (i2 != 0) {
            return zz03.zzZ(bArrZzZ, i2, true, true);
        }
        return bArrZzZ;
    }

    private byte[] zzZ(com.aspose.words.internal.zzPM zzpm, int i, int i2) throws Exception {
        com.aspose.words.internal.zzD3<byte[]> zzd3 = zzZt9().get(zzpm.zzOQ());
        if (zzd3 == null) {
            zzd3 = new com.aspose.words.internal.zzD3<>();
            zzZt9().set(zzpm.zzOQ(), zzd3);
        }
        if (zzd3.get(i) == null) {
            zzd3.set(i, zzY(zzpm, i, i2));
        }
        return zzd3.get(i);
    }
}
