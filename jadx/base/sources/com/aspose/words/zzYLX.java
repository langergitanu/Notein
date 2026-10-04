package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYLX {
    private static void zzY(com.aspose.words.internal.zzOU zzou, int i, IWarningCallback iWarningCallback) {
        switch (i) {
            case 0:
                zzou.setDashStyle(0);
                break;
            case 1:
                zzou.setDashStyle(1);
                break;
            case 2:
                zzou.setDashStyle(2);
                break;
            case 3:
                zzou.setDashStyle(3);
                break;
            case 4:
                zzou.setDashStyle(4);
                break;
            case 5:
                zzou.zzW(new float[]{1.0f, 3.0f});
                break;
            case 6:
                zzou.zzW(new float[]{4.0f, 3.0f});
                break;
            case 7:
                zzou.zzW(new float[]{8.0f, 3.0f});
                break;
            case 8:
                zzou.zzW(new float[]{4.0f, 3.0f, 1.0f, 3.0f});
                break;
            case 9:
                zzou.zzW(new float[]{8.0f, 3.0f, 1.0f, 3.0f});
                break;
            case 10:
                zzou.zzW(new float[]{8.0f, 3.0f, 1.0f, 3.0f, 1.0f, 3.0f});
                break;
            default:
                zzou.setDashStyle(0);
                if (iWarningCallback != null) {
                    OooO00o.OooO0O0(iWarningCallback, 16777216, 4, "Unsupported dash style specified. Using defaults instead.");
                }
                break;
        }
    }

    public static com.aspose.words.internal.zzOU zzZ(Stroke stroke, float f, IWarningCallback iWarningCallback) throws Exception {
        int lineFillType = stroke.getLineFillType();
        com.aspose.words.internal.zzOU zzou = lineFillType != 1 ? (lineFillType == 2 || lineFillType == 3) ? new com.aspose.words.internal.zzOU(new com.aspose.words.internal.zzOH(stroke.getImageBytes(), (byte) 0)) : new com.aspose.words.internal.zzOU(zzXN.zzY(stroke.zz8Q(), stroke.getOpacity())) : new com.aspose.words.internal.zzOU(zzXN.zzZ(stroke.getImageBytes(), stroke.zz8Q(), stroke.zzZBx(), (float) stroke.getOpacity()));
        zzou.zzXW(zzYCC.zzmh(stroke.getJoinStyle()));
        zzou.setWidth(f);
        zzZ(zzou, stroke.getLineStyle(), iWarningCallback);
        zzY(zzou, stroke.getDashStyle(), iWarningCallback);
        int iZzmg = zzYCC.zzmg(stroke.getEndCap());
        zzou.zzXV(zzYCC.zzmf(stroke.getEndCap()));
        zzou.zzXX(iZzmg);
        zzou.setEndCap(iZzmg);
        return zzou;
    }

    private static void zzZ(com.aspose.words.internal.zzOU zzou, int i, IWarningCallback iWarningCallback) {
        if (i == 0) {
            zzou.zzV(new float[]{0.0f, 1.0f});
            return;
        }
        if (i == 1) {
            zzou.zzV(new float[]{0.0f, 0.33333334f, 0.6666667f, 1.0f});
            return;
        }
        if (i == 2) {
            zzou.zzV(new float[]{0.0f, 0.6f, 0.8f, 1.0f});
            return;
        }
        if (i == 3) {
            zzou.zzV(new float[]{0.0f, 0.2f, 0.4f, 1.0f});
            return;
        }
        if (i != 4) {
            zzou.zzV(new float[]{0.0f, 1.0f});
            if (iWarningCallback != null) {
                OooO00o.OooO0O0(iWarningCallback, 16777216, 4, "Unsupported line style specified. Using defaults instead.");
                return;
            }
            return;
        }
        zzou.zzV(new float[]{0.0f, 0.16666667f, 0.33333334f, 0.6666667f, 0.8333333f, 1.0f});
    }
}
