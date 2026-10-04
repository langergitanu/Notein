package com.aspose.words;

import com.google.logging.type.LogSeverity;

/* JADX INFO: loaded from: classes6.dex */
final class zzYT {
    private static boolean isMirrored(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 9:
                return false;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static com.aspose.words.internal.zzG zzZ(zzZ6P zzz6p) throws Exception {
        Shape backgroundShape = zzz6p.zzYfy.getBackgroundShape();
        if (backgroundShape == null) {
            return null;
        }
        zzYCF zzycf = new zzYCF(null, zzz6p.zzYfy.getWarningCallback(), zzz6p.zzYfy.zzZqf());
        zzycf.zzYau();
        int fillType = backgroundShape.zzY9J().getFillType();
        boolean zHasImage = backgroundShape.hasImage();
        long jZzG = zHasImage ? com.aspose.words.internal.zzZPW.zzG(zzz6p.getWidth(), zzz6p.getHeight()) : zzZ(backgroundShape.zzY9J());
        com.aspose.words.internal.zzG zzgZzZ = zzycf.zzZ(new zzYC5((ShapeBase) backgroundShape, jZzG), false);
        zzgZzZ.zzW((com.aspose.words.internal.zzP9) null);
        return zHasImage ? zzgZzZ : zzZ(zzz6p, fillType, jZzG, zzgZzZ);
    }

    private static long zzZ(zzZAW zzzaw) throws Exception {
        int fillType = zzzaw.getFillType();
        int width = LogSeverity.EMERGENCY_VALUE;
        int height = 600;
        float f = 1.0f;
        switch (fillType) {
            case 0:
            case 1:
            case 4:
            case 6:
            case 8:
            case 9:
                break;
            case 2:
            case 3:
                if (com.aspose.words.internal.zzZ1.zzX(zzzaw.getImageBytes())) {
                    com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(zzzaw.getImageBytes());
                    width = zzegZzZT.getWidth();
                    height = zzegZzZT.getHeight();
                }
                break;
            case 5:
            case 7:
                f = 0.5f;
                break;
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: fillType");
        }
        return com.aspose.words.internal.zzZPW.zzG(((float) com.aspose.words.internal.zzSA.pixelToPoint(width)) * f, ((float) com.aspose.words.internal.zzSA.pixelToPoint(height)) * f);
    }

    private static com.aspose.words.internal.zzG zzZ(zzZ6P zzz6p, int i, long j, com.aspose.words.internal.zzG zzg) throws Exception {
        float fIntBitsToFloat = Float.intBitsToFloat((int) j);
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(j);
        float f = fIntBitsToFloat * 0.5f;
        float f2 = 0.5f * fZzYz;
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        boolean zIsMirrored = isMirrored(i);
        float f3 = 1.0f;
        float f4 = 0.0f;
        while (f4 < zzz6p.getHeight()) {
            float f5 = 1.0f;
            float f6 = 0.0f;
            while (f6 < zzz6p.getWidth()) {
                com.aspose.words.internal.zzG zzgZzZJ = zzg.zzZJ();
                zzgZzZJ.zzW(new com.aspose.words.internal.zzP9());
                zzgZzZJ.zzZO().zzY(-f, -f2, 1);
                zzgZzZJ.zzZO().zzZ(f5, f3, 1);
                zzgZzZJ.zzZO().zzY(f, f2, 1);
                zzgZzZJ.zzZO().zzY(f6, f4, 1);
                zzg2.zzX((com.aspose.words.internal.zzZL) zzgZzZJ);
                f6 += fIntBitsToFloat;
                if (zIsMirrored) {
                    f5 = -f5;
                }
            }
            f4 += fZzYz;
            if (zIsMirrored) {
                f3 = -f3;
            }
        }
        return zzg2;
    }
}
