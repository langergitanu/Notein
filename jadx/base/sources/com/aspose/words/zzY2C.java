package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
class zzY2C {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("t", TelemetryEventStrings.Value.TRUE, "1", "f", TelemetryEventStrings.Value.FALSE, "0");

    public static void zzS(ShapeBase shapeBase, int i, String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            shapeBase.setShapeAttr(i, Integer.valueOf(com.aspose.words.internal.zzJB.parseInt(str)));
        }
    }

    public static void zzT(ShapeBase shapeBase, int i, String str) {
        zzX(shapeBase, i, new zzY2G(str));
    }

    public static void zzU(ShapeBase shapeBase, int i, String str) {
        zzZ(shapeBase, i, str, !"0".equals(str));
    }

    public static void zzV(ShapeBase shapeBase, int i, String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0 || iZzTP == 1 || iZzTP == 2) {
            shapeBase.setShapeAttr(i, Boolean.TRUE);
        } else {
            if (iZzTP != 3 && iZzTP != 4 && iZzTP != 5) {
                throw new IllegalStateException("Unexpected ST_TrueFalse value.");
            }
            shapeBase.setShapeAttr(i, Boolean.FALSE);
        }
    }

    public static void zzW(ShapeBase shapeBase, int i, String str) {
        zzY2G zzy2g = new zzY2G(str);
        if (zzy2g.zzYmB()) {
            shapeBase.setShapeAttr(i, Integer.valueOf(zzy2g.zzXT1()));
        }
    }

    public static void zzX(ShapeBase shapeBase, int i, String str) {
        zzZ(shapeBase, i, new zzY2G(str));
    }

    public static zzY2G[] zzXW(String str, String str2) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ',');
        zzY2G[] zzy2gArr = new zzY2G[strArrZzR.length];
        for (int i = 0; i < strArrZzR.length; i++) {
            zzy2gArr[i] = new zzY2G(strArrZzR[i], str2);
        }
        return zzy2gArr;
    }

    public static void zzY(ShapeBase shapeBase, int i, zzY2G zzy2g) {
        if (zzy2g.zzXTa()) {
            shapeBase.setShapeAttr(i, Integer.valueOf(zzy2g.zzXT2()));
        }
    }

    public static void zzZ(ShapeBase shapeBase, int i, zzY2G zzy2g) {
        if (zzy2g.isFixed()) {
            shapeBase.setShapeAttr(i, Integer.valueOf(zzy2g.zzXT0()));
        }
    }

    public static void zzX(ShapeBase shapeBase, int i, zzY2G zzy2g) {
        if (zzy2g.zzXT9()) {
            shapeBase.setShapeAttr(i, Integer.valueOf(zzy2g.zzXT7()));
        }
    }

    public static void zzY(ShapeBase shapeBase, int i, int i2, String str) {
        zzY2G[] zzy2gArrZzXW = zzXW(str, "");
        zzZ(shapeBase, i, zzy2gArrZzXW[0]);
        if (zzy2gArrZzXW.length > 1) {
            zzZ(shapeBase, i2, zzy2gArrZzXW[1]);
        }
    }

    public static void zzZ(ShapeBase shapeBase, int i, String str, boolean z) {
        try {
            zzV(shapeBase, i, str);
        } catch (IllegalStateException unused) {
            shapeBase.setShapeAttr(i, Boolean.valueOf(z));
        }
    }

    public static void zzZ(ShapeBase shapeBase, int i, String str, String str2, String str3) {
        if (com.aspose.words.internal.zzZKN.equals(str3, str)) {
            shapeBase.setShapeAttr(i, Boolean.TRUE);
        } else if (com.aspose.words.internal.zzZKN.equals(str3, str2)) {
            shapeBase.setShapeAttr(i, Boolean.FALSE);
        }
    }
}
