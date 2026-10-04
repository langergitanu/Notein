package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZSM {
    private static String zzY(zzOP zzop) {
        int iZzNa = zzop.zzNa();
        return iZzNa != 0 ? (iZzNa == 1 || iZzNa == 2 || iZzNa == 3) ? "Reflect" : "Pad" : "Repeat";
    }

    public static void zzZ(zzZS1 zzzs1, zzZSK zzzsk, zzPY zzpy, zzZQ4 zzzq4) throws Exception {
        int iZzPH = zzpy.zzPH();
        if (iZzPH == 0) {
            zzZ(zzzs1, (zzOI) zzpy);
            return;
        }
        if (iZzPH == 1) {
            zzZ(zzzs1, zzzsk, (zzPK) zzpy);
            return;
        }
        if (iZzPH == 2) {
            zzZ(zzzs1, zzzsk, (zzOH) zzpy);
            return;
        }
        if (iZzPH == 3) {
            zzZ(zzzs1, (zzPA) zzpy);
            return;
        }
        if (iZzPH == 4) {
            zzZ(zzzs1, zzzsk, (zzOP) zzpy, zzzq4);
        } else {
            if (iZzPH != 5) {
                throw new UnsupportedOperationException("Unsupported brush type.");
            }
            zzzsk.zzG9();
            zzZ(zzzs1, zzzsk, zzXH.zzZ((zzP0) zzpy));
        }
    }

    private static void zzZ(zzZS1 zzzs1, zzZSK zzzsk, zzOP zzop, zzZQ4 zzzq4) throws Exception {
        if (zzop.zzNq().zzPv() > 0.0f) {
            zzP0 zzp0ZzX = zzOO.zzX(zzop, zzzq4);
            zzzsk.zzG9();
            zzZ(zzzs1, zzzsk, zzXH.zzZ(zzp0ZzX));
            return;
        }
        zzOP zzopZzH = zzop.zzH(zzzq4);
        zzzs1.zzY("RadialGradientBrush");
        zzzs1.zzX("MappingMode", "Absolute");
        long jZzPt = zzopZzH.zzNs().zzPt();
        long jZzPt2 = zzopZzH.zzNr().zzPt();
        float fZzPv = zzopZzH.zzNp().zzPv();
        int i = (int) jZzPt;
        float fIntBitsToFloat = Float.intBitsToFloat(i) > 0.0f ? Float.intBitsToFloat(i) : 0.0f;
        if (zzZPY.zzYC(jZzPt) > fIntBitsToFloat) {
            fIntBitsToFloat = zzZPY.zzYC(jZzPt);
        }
        int i2 = (int) jZzPt2;
        if (Float.intBitsToFloat(i2) > fIntBitsToFloat) {
            fIntBitsToFloat = Float.intBitsToFloat(i2);
        }
        if (zzZPY.zzYC(jZzPt2) > fIntBitsToFloat) {
            fIntBitsToFloat = zzZPY.zzYC(jZzPt2);
        }
        if (fZzPv > fIntBitsToFloat) {
            fIntBitsToFloat = fZzPv;
        }
        zzP9 zzp9ZzNb = zzopZzH.zzNb();
        if (fIntBitsToFloat > 1000.0f) {
            float f = 1000.0f / fIntBitsToFloat;
            zzP9 zzp9 = new zzP9(f, 0.0f, 0.0f, f, 0.0f, 0.0f);
            zzp9ZzNb = zzp9ZzNb != null ? zzp9ZzNb.zzOh() : new zzP9();
            zzp9ZzNb.zzY(1.0f / f, 0);
            jZzPt = zzp9.zzR(jZzPt);
            jZzPt2 = zzp9.zzR(jZzPt2);
            fZzPv *= zzp9.zzOf();
        }
        if (!zzP9.zzO(zzp9ZzNb)) {
            zzzs1.zzW("Transform", zzp9ZzNb);
        }
        zzzs1.zzW("Center", jZzPt);
        zzzs1.zzW("GradientOrigin", jZzPt2);
        zzzs1.zzX("RadiusX", fZzPv);
        zzzs1.zzX("RadiusY", fZzPv);
        zzzs1.zzX("SpreadMethod", zzY(zzopZzH));
        zzzs1.zzY("RadialGradientBrush.GradientStops");
        for (zzPI zzpi : zzopZzH.zzOP()) {
            zzZ(zzzs1, zzpi.zzZy(), zzpi.zzOG());
        }
        zzzs1.zzp();
        zzzs1.zzp();
    }

    public static void zzZ(zzZS1 zzzs1, zzZSK zzzsk, byte[] bArr, zzEP zzep, zzZQ4 zzzq4, int i, zzP9 zzp9) throws Exception {
        zzZS9 zzzs9ZzR = zzzsk.zzR(bArr, zzep);
        zzzs1.zzY("ImageBrush");
        zzzs1.zzX("ImageSource", zzzs9ZzR.getUri());
        zzEG zzegZzm4 = zzzs9ZzR.zzm4();
        zzzs1.zzY("Viewbox", new zzZQ4(0.0f, 0.0f, (float) zzZSJ.zzZp(zzegZzm4.getWidthPoints()), (float) zzZSJ.zzZp(zzegZzm4.getHeightPoints())));
        if (!zzEP.zzZ(zzep)) {
            zzzq4 = zzep.zzw(zzzq4);
        }
        zzzs1.zzY("Viewport", new zzZQ4(zzzq4.getX(), zzzq4.getY(), zzzq4.getWidth() > 0.0f ? zzzq4.getWidth() : (float) zzegZzm4.getWidthPoints(), zzzq4.getHeight() > 0.0f ? zzzq4.getHeight() : (float) zzegZzm4.getHeightPoints()));
        zzzs1.zzX("ViewboxUnits", "Absolute");
        zzzs1.zzX("ViewportUnits", "Absolute");
        if (zzp9 != null) {
            zzzs1.zzW("Transform", zzp9);
        }
        zzzs1.zzX("TileMode", zzZSJ.zzRG(i));
        zzzs1.zzp();
    }

    private static void zzZ(zzZS1 zzzs1, zzOI zzoi) throws Exception {
        zzzs1.zzY("SolidColorBrush");
        zzzs1.zzZ("Color", zzoi.zzZy());
        zzzs1.zzp();
    }

    private static void zzZ(zzZS1 zzzs1, zzPA zzpa) throws Exception {
        zzzs1.zzY("LinearGradientBrush");
        zzzs1.zzX("MappingMode", "Absolute");
        zzzs1.zzZ("StartPoint", zzpa.zzOw().getX(), zzpa.zzOw().getY());
        zzzs1.zzZ("EndPoint", zzpa.zzOw().zzkw(), zzpa.zzOw().zzZo());
        zzzs1.zzX("SpreadMethod", "Repeat");
        if (zzpa.zzNb() != null) {
            zzzs1.zzW("Transform", zzpa.zzNb());
        }
        zzzs1.zzY("LinearGradientBrush.GradientStops");
        if (zzpa.zzOP() == null) {
            zzZ(zzzs1, zzpa.zzOv(), 0.0f);
            zzZ(zzzs1, zzpa.zzOu(), 1.0f);
        } else {
            for (zzPI zzpi : zzpa.zzOP()) {
                zzZ(zzzs1, zzpi.zzZy(), zzpi.zzOG());
            }
        }
        zzzs1.zzp();
        zzzs1.zzp();
    }

    private static void zzZ(zzZS1 zzzs1, zzPV zzpv, float f) throws Exception {
        zzzs1.zzY("GradientStop");
        zzzs1.zzZ("Color", zzpv);
        zzzs1.zzX("Offset", f);
        zzzs1.zzp();
    }

    private static void zzZ(zzZS1 zzzs1, zzZSK zzzsk, zzPK zzpk) throws Exception {
        zzZ(zzzs1, zzzsk, zzIK.zzZ(zzpk), null, zzZQ4.zz2T, 0, null);
    }

    private static void zzZ(zzZS1 zzzs1, zzZSK zzzsk, zzOH zzoh) throws Exception {
        byte[] bArrZzDL;
        try {
            zzXN zzxn = new zzXN(zzoh);
            try {
                bArrZzDL = zzzsk.zzmn().zzW(zzxn);
            } finally {
                zzxn.dispose();
            }
        } catch (Exception unused) {
            zzzsk.zzT(2, "Image can not be processed. Possibly unsupported image format.");
            bArrZzDL = zzEF.zzDL();
        }
        byte[] bArr = bArrZzDL;
        zzEG zzegZzZT = zzEF.zzZT(bArr);
        zzZ(zzzs1, zzzsk, bArr, null, new zzZQ4(0.0f, 0.0f, zzegZzZT.getWidth(), zzegZzZT.getHeight()), zzoh.zzNa(), zzoh.zzNb().zzOh());
    }
}
