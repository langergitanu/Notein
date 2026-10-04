package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7O {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("auto", "auto-start-reverse");
    private boolean zzX7X;
    private boolean zzX7Y;
    private com.aspose.words.internal.zzG zzX7Z;
    private double zzX83;
    private double zzX84;
    private String zzX85 = "strokeWidth";
    private double zzX82 = 3.0d;
    private double zzX81 = 3.0d;
    private double zzX80 = 0.0d;
    private float zzYIt = 1.0f;
    private float zzYIs = 1.0f;

    public static zzY7O zzP(zzY7J zzy7j, zzY7X zzy7x) throws Exception {
        if (zzy7x.zzQw().size() == 0) {
            return null;
        }
        zzY7O zzy7o = new zzY7O();
        String strZzKM = zzy7x.zzKM("markerUnits");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzKM)) {
            zzy7o.zzX85 = strZzKM;
        }
        zzy7o.zzX84 = zzY7B.zzZ(zzy7j, zzy7x, "refX", (float) zzy7o.zzX84);
        zzy7o.zzX83 = zzY7B.zzZ(zzy7j, zzy7x, "refY", (float) zzy7o.zzX83);
        zzy7o.zzX82 = zzY7B.zzZ(zzy7j, zzy7x, "markerWidth", (float) zzy7o.zzX82);
        zzy7o.zzX81 = zzY7B.zzZ(zzy7j, zzy7x, "markerHeight", (float) zzy7o.zzX81);
        zzy7x.setWidth(zzy7o.zzX82);
        zzy7x.zzW4(zzy7o.zzX82);
        zzy7x.setHeight(zzy7o.zzX81);
        zzy7x.zzW3(zzy7o.zzX81);
        if (zzy7x.hasAttribute("orient")) {
            String strZzKM2 = zzy7x.zzKM("orient");
            int iZzTP = zzUR.zzTP(strZzKM2);
            if (iZzTP == 0) {
                zzy7o.zzX7Y = true;
            } else if (iZzTP != 1) {
                zzy7o.zzX80 = com.aspose.words.internal.zzJB.zzZs(strZzKM2);
            } else {
                zzy7o.zzX7X = true;
            }
        }
        zzy7j.zzPM(false);
        zzy7o.zzX7Z = zzY7S.zzW(zzy7j, zzy7x);
        zzy7j.zzZAD();
        zzZ(zzy7x, zzy7o);
        return zzy7o;
    }

    private com.aspose.words.internal.zzG zzY(long j, long j2, float f, boolean z) {
        double dZzZK = this.zzX80;
        if (this.zzX7Y || this.zzX7X) {
            dZzZK = com.aspose.words.internal.zzAN.zzZK(z ? Math.atan2(com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(j2), Float.intBitsToFloat((int) j) - Float.intBitsToFloat((int) j2)) : Math.atan2(com.aspose.words.internal.zzZPY.zzYC(j2) - com.aspose.words.internal.zzZPY.zzYC(j), Float.intBitsToFloat((int) j2) - Float.intBitsToFloat((int) j)));
        }
        if (this.zzX7Y && z) {
            dZzZK += 180.0d;
        }
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        float f2 = this.zzYIt;
        float f3 = this.zzYIs;
        if ("strokeWidth".equals(this.zzX85)) {
            float fPointToPixel = (float) ConvertUtil.pointToPixel(f);
            f2 *= fPointToPixel;
            f3 *= fPointToPixel;
        }
        long jZzG = com.aspose.words.internal.zzZPY.zzG(((float) this.zzX84) * f2, ((float) this.zzX83) * f3);
        zzg.zzZO().zzZ((float) dZzZK, jZzG, 0);
        zzg.zzZO().zzY(Math.min(f2, f3), 0);
        if (z) {
            zzg.zzZO().zzY(Float.intBitsToFloat((int) j) - Float.intBitsToFloat((int) jZzG), com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(jZzG), 1);
        } else {
            zzg.zzZO().zzY(Float.intBitsToFloat((int) j2) - Float.intBitsToFloat((int) jZzG), com.aspose.words.internal.zzZPY.zzYC(j2) - com.aspose.words.internal.zzZPY.zzYC(jZzG), 1);
        }
        zzg.zzX(this.zzX7Z.zz1());
        return zzg;
    }

    private static void zzZ(zzY7X zzy7x, zzY7O zzy7o) throws Exception {
        if (!zzy7x.zzY1x()) {
            com.aspose.words.internal.zzZQ4 zzzq4Zz0 = zzY7B.zz0(zzy7o.zzX7Z);
            if (com.aspose.words.internal.zzAN.zzL(zzy7o.zzX82, 3.0d)) {
                zzy7o.zzX82 = zzzq4Zz0.getWidth();
            }
            if (com.aspose.words.internal.zzAN.zzL(zzy7o.zzX81, 3.0d)) {
                zzy7o.zzX81 = zzzq4Zz0.getHeight();
                return;
            }
            return;
        }
        zzY7A zzy7aZzY1s = zzy7x.zzY1s();
        com.aspose.words.internal.OooO0O0.OooO00o(zzy7o.zzX7Z);
        if (com.aspose.words.internal.zzAN.zzL(zzy7o.zzX82, 3.0d)) {
            zzy7o.zzX82 = zzy7aZzY1s.getWidth();
        }
        if (com.aspose.words.internal.zzAN.zzL(zzy7o.zzX81, 3.0d)) {
            zzy7o.zzX81 = zzy7aZzY1s.getHeight();
        }
        if (com.aspose.words.internal.zzAN.zzL(zzy7o.zzX82, zzy7aZzY1s.getWidth()) && com.aspose.words.internal.zzAN.zzL(zzy7o.zzX81, zzy7aZzY1s.getHeight())) {
            return;
        }
        zzy7o.zzYIt = (float) (zzy7o.zzX82 / ((double) zzy7aZzY1s.getWidth()));
        zzy7o.zzYIs = (float) (zzy7o.zzX81 / ((double) zzy7aZzY1s.getHeight()));
    }

    public final com.aspose.words.internal.zzG zzR(long j, long j2, float f) {
        return zzY(j, j2, f, true);
    }

    public final com.aspose.words.internal.zzG zzS(long j, long j2, float f) {
        return zzY(j, j2, f, false);
    }
}
