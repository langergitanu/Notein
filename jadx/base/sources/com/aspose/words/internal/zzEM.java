package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.aspose.words.internal.zzZR7;

/* JADX INFO: loaded from: classes5.dex */
public final class zzEM extends zzZR8 {

    public static class zzZ implements zzH6 {
        private static zzH3 zzwm;

        public /* synthetic */ zzZ(zzH3 zzh3, byte b) {
            this(zzh3);
        }

        @Override // com.aspose.words.internal.zzH6
        public final zzH6 zzFE() {
            return this;
        }

        @Override // com.aspose.words.internal.zzH6
        public final zzF8 zzFF() {
            return zzZWM.zz8Q;
        }

        @Override // com.aspose.words.internal.zzH6
        public final zzH3 zzFG() {
            return zzwm;
        }

        @Override // com.aspose.words.internal.zzH6
        public final zzF4 zzHq() {
            return zz7M.zznW;
        }

        private zzZ(zzH3 zzh3) {
            zzwm = zzh3;
        }
    }

    @Override // com.aspose.words.internal.zzZR8
    public final Bitmap zzZ(zzZOP zzzop, zzZR7.zzZ zzz) throws Exception {
        zzZ zzz2 = new zzZ(zzz.zzlx() == null ? (zzH3) zzZXT.zzqd() : (zzH3) zzz.zzlx(), (byte) 0);
        zz8T zz8t = new zz8T(zzzop);
        zzz.zzZo(zz8t.getHorizontalResolution());
        zzz.zzZn(zz8t.getVerticalResolution());
        zzA6 zza6 = new zzA6(zzz2);
        zza6.setRenderingMode(1);
        zza6.setEmulateRasterOperations(zzz.zzlB());
        zzA3 zza3ZzZ = zzA3.zzZ(zz8t, zza6, 0L);
        long jZzlA = zzz.zzlA();
        if (jZzlA == 0) {
            jZzlA = zz8t.zzyQ().getSize();
        }
        int iAbs = Math.abs((int) jZzlA);
        int iAbs2 = Math.abs((int) (jZzlA >>> 32));
        if (zzz.zzlz() > 0 && iAbs > zzz.zzlz() && iAbs2 > zzz.zzlz()) {
            if (iAbs < iAbs2) {
                iAbs2 = (int) (iAbs2 / (iAbs / zzz.zzlz()));
                iAbs = zzz.zzlz();
            } else {
                iAbs = (int) (iAbs / (iAbs2 / zzz.zzlz()));
                iAbs2 = zzz.zzlz();
            }
        }
        float f = iAbs;
        float f2 = iAbs2;
        long jZzG = zzZPW.zzG(f, f2);
        zzG zzgZzZN = zza3ZzZ.zzZN(jZzG);
        if (zzgZzZN == null) {
            throw new IllegalArgumentException("The image format is not supported. FileFormat=" + zzKF.toString(zzz.zzlD().intValue()));
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iAbs, iAbs2, Bitmap.Config.ARGB_8888);
        zzA6 zza62 = new zzA6(zzz2);
        zza62.setRenderingMode(1);
        zzIX zzix = new zzIX();
        zzix.zzX(4);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        zzJ8 zzj8 = new zzJ8(null, zza62, zzix);
        zzj8.zzH0();
        zzj8.zzZ(zzgZzZN, jZzG, canvas, 0.0f, 0.0f, f, f2);
        zzj8.dispose();
        return bitmapCreateBitmap;
    }
}
