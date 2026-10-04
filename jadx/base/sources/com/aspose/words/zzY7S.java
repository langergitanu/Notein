package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7S {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("pattern", "linearGradient", "radialGradient", "symbol", "defs", "g", "svg", "a", "path", DrawToolFactory.LASSO_TYPE_RECT, "circle", "ellipse", "line", "polyline", "polygon", "clipPath", "text", AbstractJwtRequest.ClaimNames.USE, "image", RequestParameters.MARKER, "mask", "xMinYMin", "xMidYMin", "xMaxYMin", "xMinYMid", "xMidYMid", "xMaxYMid", "xMinYMax", "xMidYMax", "xMaxYMax", "none");

    private static void zzR(zzY7J zzy7j, zzY7X zzy7x) {
        if (zzy7x.zzY1v()) {
            zzY7B.zzK(zzy7j, zzy7x);
        }
    }

    private static void zzS(zzY7J zzy7j, zzY7X zzy7x) throws Exception {
        zzy7j.zzPM(true);
        zzW(zzy7x, zzy7j);
        zzX(zzy7x, zzy7j);
        zzY7X zzy7xZzV = zzV(zzy7x, zzy7j);
        if (zzy7xZzV != null) {
            zzy7j.zzV(zzy7xZzV);
            if ("symbol".equals(zzy7xZzV.zzZTQ())) {
                zzW(zzy7j, zzy7xZzV);
            } else {
                zzV(zzy7j, zzy7xZzV);
            }
            zzy7j.zzU(zzy7xZzV);
        }
        zzy7j.zzZAD();
    }

    private static void zzT(zzY7J zzy7j, zzY7X zzy7x) throws Exception {
        Iterator<zzY7X> it = zzy7x.zzY1D().iterator();
        while (it.hasNext()) {
            zzV(zzy7j, it.next());
        }
    }

    private static void zzU(zzY7J zzy7j, zzY7X zzy7x) throws Exception {
        String strZzKM = zzy7x.zzKM("href");
        String strZzKM2 = zzy7x.zzKM("target");
        com.aspose.words.internal.zzG zzgZzW = zzW(zzy7j, zzy7x);
        if (strZzKM == null && strZzKM2 == null) {
            return;
        }
        zzgZzW.zzZ(new com.aspose.words.internal.zzZR(new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) zzgZzW), strZzKM, strZzKM2, null));
    }

    public static void zzV(zzY7J zzy7j, zzY7X zzy7x) throws Exception {
        if (zzy7x.getVisible()) {
            switch (zzUR.zzTP(zzy7x.zzZTQ())) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 15:
                case 19:
                case 20:
                    break;
                case 5:
                case 6:
                    zzW(zzy7j, zzy7x);
                    break;
                case 7:
                    zzU(zzy7j, zzy7x);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    zzY7G.zzQ(zzy7j, zzy7x);
                    break;
                case 16:
                    zzy7j.zzW(zzy7x);
                    break;
                case 17:
                    zzS(zzy7j, zzy7x);
                    break;
                case 18:
                    zzY7Q.zzQ(zzy7j, zzy7x);
                    break;
                default:
                    zzy7j.zzT(16777216, com.aspose.words.internal.zzZKN.format("Element '{0}' is unexpected at this location and will be ignored", zzy7x.zzZTQ()));
                    break;
            }
        }
    }

    public static com.aspose.words.internal.zzG zzW(zzY7J zzy7j, zzY7X zzy7x) throws Exception {
        if (zzy7x.zzQw().size() == 0 || zzy7x.hasAttribute("mask")) {
            return null;
        }
        com.aspose.words.internal.zzG zzgZzPM = zzy7j.zzPM(true);
        zzY(zzy7x, zzy7j);
        zzR(zzy7j, zzy7x);
        zzy7j.zzV(zzy7x);
        if (zzy7x.zzY1w()) {
            zzX(zzy7x, zzy7j);
        } else {
            zzW(zzy7x, zzy7j);
        }
        if (zzy7x.zzY1w() && !zzy7x.zzY1t() && zzy7x.zzY1x()) {
            zzy7j.zzPM(true);
            zzZ(zzy7x, zzy7j);
        }
        if (zzy7x.getVisible()) {
            zzT(zzy7j, zzy7x);
        }
        if (zzy7x.zzY1w() && !zzy7x.zzY1t() && zzy7x.zzY1x()) {
            zzy7j.zzZAD();
        }
        zzy7j.zzU(zzy7x);
        zzy7j.zzZAD();
        return zzgZzPM;
    }

    public static com.aspose.words.internal.zzPY zzX(zzY7J zzy7j, zzY7X zzy7x, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        int iZzTP = zzUR.zzTP(zzy7x.zzZTQ());
        if (iZzTP == 0) {
            return zzY7L.zzO(zzy7j, zzy7x);
        }
        if (iZzTP == 1 || iZzTP == 2) {
            return zzY7T.zzZ(zzy7j, zzy7x, zzzq4);
        }
        return null;
    }

    private static void zzY(zzY7X zzy7x, zzY7J zzy7j) throws Exception {
        String strZzSE = zzy7x.zzZWe().zzSE("clip-path");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSE)) {
            zzy7j.zzY0U().zzZ(zzy7j.zzAr(strZzSE));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzZ(zzY7X zzy7x, zzY7J zzy7j) {
        zzY7J zzy7j2;
        if (zzy7x.zzY1s() == null) {
            return;
        }
        zzY7A zzy7aZzY1s = zzy7x.zzY1s();
        com.aspose.words.internal.zzP9 zzp9ZzZO = zzy7j.zzY0U().zzZO() != null ? zzy7j.zzY0U().zzZO() : new com.aspose.words.internal.zzP9();
        double dZzY1z = zzy7x.zzY1z();
        double dZzY1y = zzy7x.zzY1y();
        if (!zzy7x.zzY1u() && zzy7x.zzY1v() && com.aspose.words.internal.zzAN.zzZD(dZzY1z) && com.aspose.words.internal.zzAN.zzZD(dZzY1y)) {
            dZzY1z = zzy7j.zzY0T().zzY1z();
            dZzY1y = zzy7j.zzY0T().zzY1y();
        }
        double d = dZzY1y;
        double d2 = dZzY1z;
        if (!com.aspose.words.internal.zzAN.zzZD(d2) || !com.aspose.words.internal.zzAN.zzZD(d)) {
            if (!com.aspose.words.internal.zzAN.zzf(zzy7aZzY1s.getWidth()) && !com.aspose.words.internal.zzAN.zzf(zzy7aZzY1s.getHeight()) && (!com.aspose.words.internal.zzAN.zzL(zzy7aZzY1s.getWidth(), d2) || !com.aspose.words.internal.zzAN.zzL(zzy7aZzY1s.getHeight(), d))) {
                zzy7j2 = zzy7j;
                zzZ(zzy7x, d2, d, zzy7j2, zzp9ZzZO);
            }
            zzp9ZzZO.zzY(-zzy7aZzY1s.zzZhx(), -zzy7aZzY1s.zzyq(), 0);
            if (zzp9ZzZO.isIdentity()) {
                zzy7j2.zzY0U().zzW(zzp9ZzZO);
                return;
            }
            return;
        }
        zzy7x.zzW4(zzy7aZzY1s.getWidth());
        zzy7x.zzW3(zzy7aZzY1s.getHeight());
        zzy7j2 = zzy7j;
        zzp9ZzZO.zzY(-zzy7aZzY1s.zzZhx(), -zzy7aZzY1s.zzyq(), 0);
        if (zzp9ZzZO.isIdentity()) {
        }
    }

    private static void zzX(zzY7X zzy7x, zzY7J zzy7j) {
        float fZzZ = zzY7B.zzZ(zzy7j, zzy7x, "x", 0.0f);
        float fZzZ2 = zzY7B.zzZ(zzy7j, zzy7x, "y", 0.0f);
        if (com.aspose.words.internal.zzAN.zzf(fZzZ) && com.aspose.words.internal.zzAN.zzf(fZzZ2)) {
            return;
        }
        zzZ(zzy7j);
        zzy7j.zzY0U().zzZO().zzY(fZzZ, fZzZ2, 0);
    }

    private static void zzY(zzY7X zzy7x, zzY7J zzy7j, float f) {
        float fZzY1z = (((float) zzy7j.zzY0T().zzY1z()) / 2.0f) - (f / 2.0f);
        zzZ(zzy7j);
        zzy7j.zzY0U().zzZO().zzY(fZzY1z, 0.0f, 0);
        if (com.aspose.words.internal.zzAN.zzZD(zzy7x.zzY1z())) {
            return;
        }
        zzy7j.zzY0U().zzZO().zzY((float) (((double) f) / zzy7x.zzY1z()), 0);
    }

    private static void zzY(zzY7X zzy7x, zzY7J zzy7j, float f, float f2) {
        if (zzy7x.zzY1v() || "symbol".equals(zzy7x.zzZTQ())) {
            f = (float) zzy7j.zzY0T().zzY1y();
            f2 = (float) zzy7j.zzY0T().zzY1z();
        }
        if (com.aspose.words.internal.zzAN.zzf(f) && com.aspose.words.internal.zzAN.zzf(f2)) {
            return;
        }
        if (!com.aspose.words.internal.zzAN.zzZD(zzy7x.zzY1z())) {
            zzZ(zzy7j);
            zzy7j.zzY0U().zzZO().zzY((float) (((double) f2) / zzy7x.zzY1z()), 0);
        } else {
            if (com.aspose.words.internal.zzAN.zzZD(zzy7x.zzY1y())) {
                return;
            }
            zzZ(zzy7j);
            zzy7j.zzY0U().zzZO().zzY((float) (((double) f) / zzy7x.zzY1y()), 0);
        }
    }

    private static zzY7X zzV(zzY7X zzy7x, zzY7J zzy7j) {
        zzY7X zzy7xZzAp;
        String strZzKM = zzy7x.zzKM("href");
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzKM) || (zzy7xZzAp = zzy7j.zzAp(strZzKM)) == null) {
            return null;
        }
        zzZ(zzy7xZzAp, zzy7j);
        if (zzy7xZzAp.zzY1q()) {
            zzZ(zzy7x, zzy7xZzAp, zzy7j);
        }
        zzY7X zzy7xZzL = zzy7xZzAp.zzL(zzy7x);
        zzy7j.zzZ(zzy7x.zzZWe(), zzy7xZzL);
        return zzy7xZzL;
    }

    private static void zzW(zzY7X zzy7x, zzY7J zzy7j) {
        zzy7j.zzY0U();
        com.aspose.words.internal.zzP9 zzp9ZzZ = zzY7B.zzZ(zzy7j, zzy7x, (com.aspose.words.internal.zzP9) null);
        if (zzp9ZzZ == null || zzp9ZzZ.isIdentity()) {
            return;
        }
        zzy7j.zzY0U().zzW(zzp9ZzZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[PHI: r4
      0x0034: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v0 java.lang.String), (r4v0 java.lang.String), (r4v24 java.lang.String) binds: [B:3:0x000e, B:5:0x0015, B:7:0x0019, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzZ(zzY7X zzy7x, double d, double d2, zzY7J zzy7j, com.aspose.words.internal.zzP9 zzp9) {
        boolean zEquals;
        double dMin;
        double height;
        double d3;
        float height2;
        float height3;
        String strZzKM = zzy7x.zzKM("preserveAspectRatio");
        String str = "xMidYMid";
        if (strZzKM != null) {
            String[] strArrZzJK = zzZDY.zzJK(strZzKM);
            if (strArrZzJK.length <= 0 || strArrZzJK.length >= 3) {
                zEquals = false;
            } else {
                String str2 = strArrZzJK[0];
                switch (zzUR.zzTP(str2)) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        str = str2;
                        break;
                }
                if (strArrZzJK.length > 1) {
                    zEquals = AzureActiveDirectorySlice.SLICE_PARAMETER.equals(strArrZzJK[1]);
                }
            }
        }
        zzY7A zzy7aZzY1s = zzy7x.zzY1s();
        if (zEquals) {
            dMin = Math.max(d / ((double) zzy7aZzY1s.getWidth()), d2 / ((double) zzy7aZzY1s.getHeight()));
        } else {
            dMin = Math.min(d / ((double) zzy7aZzY1s.getWidth()), d2 / ((double) zzy7aZzY1s.getHeight()));
        }
        double width = "none".equals(str) ? d / ((double) zzy7aZzY1s.getWidth()) : dMin;
        if ("none".equals(str)) {
            dMin = d2 / ((double) zzy7aZzY1s.getHeight());
        }
        zzp9.zzZ((float) width, (float) dMin, 0);
        int iZzTP = zzUR.zzTP(str);
        double width2 = 0.0d;
        switch (iZzTP) {
            case 22:
                height = 0.0d;
                width2 = (d / 2.0d) - ((((double) zzy7aZzY1s.getWidth()) * width) / 2.0d);
                break;
            case 23:
                height = 0.0d;
                width2 = d - (((double) zzy7aZzY1s.getWidth()) * width);
                break;
            case 24:
                height = (d2 / 2.0d) - ((((double) zzy7aZzY1s.getHeight()) * dMin) / 2.0d);
                break;
            case 25:
                width2 = (d / 2.0d) - ((((double) zzy7aZzY1s.getWidth()) * width) / 2.0d);
                d3 = d2 / 2.0d;
                height2 = zzy7aZzY1s.getHeight();
                height = d3 - ((((double) height2) * dMin) / 2.0d);
                break;
            case 26:
                width2 = d - (((double) zzy7aZzY1s.getWidth()) * width);
                d3 = d2 / 2.0d;
                height2 = zzy7aZzY1s.getHeight();
                height = d3 - ((((double) height2) * dMin) / 2.0d);
                break;
            case 27:
                height3 = zzy7aZzY1s.getHeight();
                height = d2 - (((double) height3) * dMin);
                break;
            case 28:
                width2 = (d / 2.0d) - ((((double) zzy7aZzY1s.getWidth()) * width) / 2.0d);
                height3 = zzy7aZzY1s.getHeight();
                height = d2 - (((double) height3) * dMin);
                break;
            case 29:
                width2 = d - (((double) zzy7aZzY1s.getWidth()) * width);
                height3 = zzy7aZzY1s.getHeight();
                height = d2 - (((double) height3) * dMin);
                break;
            default:
                height = 0.0d;
                break;
        }
        zzp9.zzY((float) width2, (float) height, 1);
        zzy7j.zzY0U().zzZ(com.aspose.words.internal.zzP8.zzM(new com.aspose.words.internal.zzZQ4(-(((float) (width2 / width)) - zzy7aZzY1s.zzZhx()), -(((float) (height / dMin)) - zzy7aZzY1s.zzyq()), (float) (d / width), (float) (d2 / dMin))));
    }

    private static void zzZ(zzY7X zzy7x, zzY7X zzy7x2, zzY7J zzy7j) {
        float fZzZ = zzY7B.zzZ(zzy7j, zzy7x, "height", 0.0f);
        float fZzZ2 = zzY7B.zzZ(zzy7j, zzy7x, "width", 0.0f);
        if (com.aspose.words.internal.zzAN.zzf(fZzZ) && com.aspose.words.internal.zzAN.zzf(fZzZ2)) {
            zzY(zzy7x2, zzy7j, fZzZ, fZzZ2);
            return;
        }
        if (com.aspose.words.internal.zzAN.zzf(fZzZ)) {
            zzY(zzy7x2, zzy7j, fZzZ2);
        } else if (com.aspose.words.internal.zzAN.zzf(fZzZ2)) {
            zzZ(zzy7x2, zzy7j, fZzZ);
        } else {
            zzZ(zzy7x2, zzy7j, fZzZ2, fZzZ);
        }
    }

    private static void zzZ(zzY7X zzy7x, zzY7J zzy7j, float f, float f2) {
        if (com.aspose.words.internal.zzAN.zzZD(zzy7x.zzY1y()) || com.aspose.words.internal.zzAN.zzZD(zzy7x.zzY1z())) {
            return;
        }
        zzZ(zzy7j);
        zzy7j.zzY0U().zzZO().zzZ((float) (((double) f) / zzy7x.zzY1z()), (float) (((double) f2) / zzy7x.zzY1y()), 0);
    }

    private static void zzZ(zzY7X zzy7x, zzY7J zzy7j, float f) {
        float fZzY1y = (((float) zzy7j.zzY0T().zzY1y()) / 2.0f) - (f / 2.0f);
        zzZ(zzy7j);
        zzy7j.zzY0U().zzZO().zzY(0.0f, fZzY1y, 0);
        if (com.aspose.words.internal.zzAN.zzZD(zzy7x.zzY1y())) {
            return;
        }
        zzy7j.zzY0U().zzZO().zzY((float) (((double) f) / zzy7x.zzY1y()), 0);
    }

    private static void zzZ(zzY7J zzy7j) {
        if (zzy7j.zzY0U().zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzy7j.zzY0U());
        }
    }
}
