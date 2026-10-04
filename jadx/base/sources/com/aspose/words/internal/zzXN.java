package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.internal.zzZR5;
import com.aspose.words.internal.zzZR7;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
public final class zzXN extends zzEK {
    private boolean zzVt;

    /* JADX INFO: renamed from: com.aspose.words.internal.zzXN$1 */
    public static /* synthetic */ class C149241 {
        static final /* synthetic */ int[] zzVs;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            zzVs = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzVs[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzVs[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zzVs[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private zzXN() {
    }

    public static Bitmap zzT(zzZOP zzzop) throws Exception {
        return zzZ(zzzop, zzEF.zzB(zzzop), (zzEG) null, (zzGQ) null, true).zzDW();
    }

    public static byte[] zzV(byte[] bArr) {
        return bArr;
    }

    public static boolean zzW(byte[] bArr) throws Exception {
        int iZzZU = zzEF.zzZU(bArr);
        if (iZzZU == 2 || iZzZU == 3) {
            return true;
        }
        return zzT(new zzZOR(bArr)).hasAlpha();
    }

    private zzZQ5 zzWG() {
        return new zzZQ5(0, 0, zzDW().getWidth(), zzDW().getHeight());
    }

    public static Bitmap zzWR() {
        return zzXR.zzWR();
    }

    private void zzZ(Bitmap bitmap, int i, zzEG zzeg) {
        if (bitmap.getWidth() < zzeg.getWidth() || bitmap.getHeight() < zzeg.getHeight()) {
            bitmap = zzZ(bitmap, zzeg);
        }
        zzY(bitmap, i, zzeg);
    }

    public final int getPixel(int i, int i2) {
        return zzDW().getPixel(i, i2);
    }

    public final int getPixelFormat() {
        int i = C149241.zzVs[zzDW().getConfig().ordinal()];
        if (i == 1) {
            return 262144;
        }
        if (i != 2) {
            return i != 3 ? 2498570 : 397319;
        }
        return 135174;
    }

    public final void setPixel(int i, int i2, int i3) {
        zzDW().setPixel(i, i2, i3);
    }

    public final zzOT zzB(boolean z) {
        if (z) {
            return zzXR.zzZ(zzDW());
        }
        zzZ(zzDW().getConfig());
        return zzXR.zzZ(zzDW(), false);
    }

    public final void zzU(zzZOP zzzop) throws Exception {
        zzZR5.zzZ zzzZzR = new zzZR5.zzZ().zzR(zzWG());
        new zzZR5().zzlu().zzlt().zzZ(zzDW(), zzzop, zzzZzR);
        zzV(zzzZzR.zzln());
    }

    public final boolean zzWA() {
        return zzDW().getConfig() == Bitmap.Config.ARGB_8888;
    }

    public final boolean zzWB() {
        return this.zzVt;
    }

    public final void zzWC() {
        zzV(zzZRR.zzS(zzDW()));
    }

    public final zzXN zzWD() {
        Bitmap.Config config = zzDW().getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        return config == config2 ? this : new zzXN(zzZ(zzDW(), zzWG(), config2));
    }

    public final zzOT zzWE() throws Throwable {
        zzXN zzxnZzWD;
        try {
            zzxnZzWD = zzWD();
        } catch (Throwable th) {
            th = th;
            zzxnZzWD = null;
        }
        try {
            zzOT zzotZzB = zzxnZzWD.zzB(false);
            if (zzxnZzWD != this) {
                zzxnZzWD.dispose();
            }
            return zzotZzB;
        } catch (Throwable th2) {
            th = th2;
            if (zzxnZzWD != this && zzxnZzWD != null) {
                zzxnZzWD.dispose();
            }
            throw th;
        }
    }

    public final byte[] zzWF() {
        zzZ(zzDW().getConfig());
        if (!zzDW().hasAlpha()) {
            return null;
        }
        zzOT zzotZzZ = zzXR.zzZ(zzDW(), true);
        if (zzotZzZ.zzND()) {
            return zzotZzZ.zzNE();
        }
        return null;
    }

    public final int zzWH() {
        return zzZ(zzDW().getConfig());
    }

    public final void zzWI() {
        zzWC();
    }

    public final zzXQ zzWz() {
        return new zzXQ(zzDW());
    }

    public final void zzY(zzZOP zzzop, int i) throws Exception {
        zzZR5.zzZ zzzZzR = new zzZR5.zzZ().zzU(Integer.valueOf(i)).zzZm(getHorizontalResolution()).zzZl(getVerticalResolution()).zzZ9(this.zzVt).zzR(zzWG());
        new zzZR5().zzlu().zzlt().zzY(zzDW(), zzzop, zzzZzR);
        zzV(zzzZzR.zzln());
    }

    public zzXN(int i, int i2) {
        this(i, i2, 96.0f, 96.0f);
    }

    public final void zzV(zzPV zzpv) {
        if (zzpv == null || zzPV.zzZ(zzpv, zzPV.zzHZ)) {
            zzpv = zzPV.zzI5;
        }
        zzU(zzpv);
    }

    public zzXN(int i, int i2, float f, float f2) {
        this(i, i2, f, f2, Bitmap.Config.ARGB_8888);
    }

    public zzXN(int i, int i2, float f, float f2, int i3) {
        this(i, i2, f, f2, zzZQ7.zzRm(i3));
    }

    private static Bitmap zzZ(Bitmap bitmap, zzEG zzeg) {
        int width = zzeg.getWidth();
        int height = zzeg.getHeight();
        int width2 = (width - bitmap.getWidth()) / 2;
        int height2 = (height - bitmap.getHeight()) / 2;
        if (width2 > 0) {
            width2--;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(false);
        paint.setFilterBitmap(false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        canvas.drawBitmap(bitmap, width2, height2, paint);
        return bitmapCreateBitmap;
    }

    public final void zzW(zzZOP zzzop) throws Exception {
        new zzZR5().zzlu().zzlt().zzW(zzDW(), zzzop);
    }

    private zzXN(int i, int i2, float f, float f2, Bitmap.Config config) {
        zzZ(Bitmap.createBitmap(i, i2, config), 7, zzEG.zzZ(i, i2, f, f2));
    }

    private void zzU(zzPV zzpv) {
        zzXN zzxn = new zzXN(getWidth(), getHeight(), getHorizontalResolution(), getVerticalResolution(), 137224);
        zzZQ5 zzzq5ZzWG = zzWG();
        zzZ(zzzq5ZzWG, zzxn, zzzq5ZzWG, zzpv);
        zzV(zzxn.zzDW());
        zzxn.zzV((Bitmap) null);
    }

    public final void zzV(zzZOP zzzop) throws Exception {
        zzZR5.zzZ zzzZzR = new zzZR5.zzZ().zzZm(getHorizontalResolution()).zzZl(getVerticalResolution()).zzR(zzWG());
        new zzZR5().zzlu().zzlt().zzX(zzDW(), zzzop, zzzZzR);
        zzV(zzzZzR.zzln());
    }

    public zzXN(int i, int i2, int i3, byte[] bArr) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, zzZQ7.zzRm(i3));
            zzXR.zzZ(bitmapCreateBitmap, bArr, i3);
            zzZ(bitmapCreateBitmap, 7, zzEG.zzZ(i, i2, 96.0d, 96.0d));
        } catch (Throwable th) {
            throw new zzX8(th.toString());
        }
    }

    public zzXN(byte[] bArr) throws Exception {
        this(bArr, (zzEG) null);
    }

    public zzXN(byte[] bArr, zzEG zzeg) throws Exception {
        this(bArr, zzeg, (byte) 0);
    }

    public final void zzZ(zzZQ5 zzzq5, zzXN zzxn, zzZQ5 zzzq52) {
        zzZ(zzzq5, zzxn, zzzq52, (zzPV) null);
    }

    private zzXN(byte[] bArr, zzEG zzeg, byte b) throws Exception {
        this((zzZOP) new zzZOR(bArr), zzeg, true, (zzGQ) null);
    }

    public final void zzZ(zzZQ4 zzzq4, zzXN zzxn, zzZQ4 zzzq42, boolean z, boolean z2) {
        Canvas canvas = new Canvas(zzxn.zzDW());
        int i = z ? -1 : 1;
        int i2 = z2 ? -1 : 1;
        Matrix matrix = new Matrix();
        matrix.setValues(new float[]{i, 0.0f, 0.0f, 0.0f, i2, 0.0f, 0.0f, 0.0f, 1.0f});
        float x = zzzq42.getX();
        if (z) {
            x = (-x) - zzzq42.getWidth();
        }
        float y = zzzq42.getY();
        if (z2) {
            y = (-y) - zzzq42.getHeight();
        }
        float fRound = Math.round(x);
        float fRound2 = Math.round(y);
        float fRound3 = Math.round(zzzq42.getWidth() + x);
        float fRound4 = Math.round(zzzq42.getHeight() + y);
        Rect rect = new Rect(Math.round(zzzq4.getX()), Math.round(zzzq4.getY()), Math.round(zzzq4.zzkw()), Math.round(zzzq4.zzZn()));
        RectF rectF = new RectF(fRound, fRound2, fRound3, fRound4);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(zzDW(), rect, rectF, zzJ8.zzza);
    }

    public zzXN(zzZOP zzzop) throws Exception {
        this(zzzop, (zzGQ) null);
    }

    public zzXN(zzZOP zzzop, zzGQ zzgq) throws Exception {
        this(zzzop, (zzEG) null, true, zzgq);
    }

    private zzXN(zzZOP zzzop, zzEG zzeg, boolean z, zzGQ zzgq) throws Exception {
        zzZOP zzzopZzQ = zzSJ.zzQ(zzzop);
        int iZzB = zzEF.zzB(zzzopZzQ);
        if (iZzB == 0 && zzEF.zzv(zzzopZzQ)) {
            byte[] bArrZzZ = zzEF.zzZ(new zzZOX(zzzopZzQ), (int) zzzopZzQ.getLength());
            iZzB = zzEF.zzZU(bArrZzZ);
            zzzopZzQ = new zzZOR(bArrZzZ);
        }
        if (zzEF.zzVV(iZzB)) {
            zzXN zzxnZzZ = zzZ(zzzopZzQ, iZzB, zzeg, zzgq, true);
            zzZ(zzxnZzZ.zzDW(), iZzB, zzxnZzZ.zzQ());
            zzZ(zzxnZzZ.zzQ(), iZzB);
            this.zzVt = zzxnZzZ.zzVt;
            return;
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(iZzB, "Parameter is not valid. FileFormat="));
    }

    public final zzXN zzZ(zzZQ5 zzzq5) {
        if (zzzq5.isEmpty() && zzAN.zzH(zzDW().getWidth(), zzzq5.getWidth()) && zzAN.zzH(zzDW().getHeight(), zzzq5.getHeight())) {
            return new zzXN(zzDW().copy(Bitmap.Config.ARGB_8888, true));
        }
        zzZQ5 zzzq5ZzY = zzZQ5.zzY(zzzq5, zzWG());
        zzXN zzxn = new zzXN(Bitmap.createBitmap(zzDW(), zzzq5ZzY.getLeft(), zzzq5ZzY.getTop(), zzzq5ZzY.getWidth(), zzzq5ZzY.getHeight()), getHorizontalResolution(), getVerticalResolution());
        zzxn.zzVX(getImageType());
        return zzxn;
    }

    public zzXN(zzOH zzoh) throws Exception {
        if (zzoh.zzPH() == 2) {
            byte[] imageBytes = zzoh.getImageBytes();
            int iZzZU = zzEF.zzZU(imageBytes);
            if (zzEF.zzVV(iZzZU)) {
                zzXN zzxnZzZ = zzZ((zzZOP) new zzZOR(imageBytes), iZzZU, (zzEG) null, (zzGQ) null, true);
                Bitmap bitmapZzDW = zzxnZzZ.zzDW();
                zzEG zzegZzQ = zzxnZzZ.zzQ();
                zzZQ4 zzzq4ZzNd = zzoh.zzNd();
                if (!zzZQ4.zzV(zzzq4ZzNd, zzZQ4.zz2T)) {
                    zzZQ5 zzzq5Zzkv = zzzq4ZzNd.zzkv();
                    zzZQ5 zzzq5 = new zzZQ5(0, 0, zzzq5Zzkv.getWidth(), zzzq5Zzkv.getHeight());
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzzq5.getWidth(), zzzq5.getHeight(), Bitmap.Config.ARGB_8888);
                    zzXR.zzZ(bitmapZzDW, zzzq5Zzkv, bitmapCreateBitmap, zzzq5);
                    zzegZzQ = zzEG.zzZ(0, 0, zzzq5.getWidth(), zzzq5.getHeight(), zzxnZzZ.zzQ().getHorizontalResolution(), zzxnZzZ.zzQ().getVerticalResolution());
                    bitmapZzDW = bitmapCreateBitmap;
                }
                zzZ(zzZRQ.zzZ(zzoh.zzNf(), zzZRQ.zzZ(zzoh.zzNe(), bitmapZzDW)), iZzZU, zzegZzQ);
                zzZ(zzegZzQ, iZzZU);
                this.zzVt = zzxnZzZ.zzVt;
                return;
            }
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(iZzZU, "Parameter is not valid. FileFormat="));
        }
        throw new IllegalArgumentException("Texture brush is expected.");
    }

    public final zzXN zzZ(zzZQ5 zzzq5, long j, float f, float f2) {
        try {
            return zzZ(zzzq5, j, f, f2, false);
        } catch (Exception unused) {
            return zzZ(zzzq5, j, f, f2, true);
        }
    }

    private zzXN zzZ(zzZQ5 zzzq5, long j, float f, float f2, boolean z) {
        zzZQ5 zzzq5ZzY = zzZQ5.zzY(zzWG(), zzzq5);
        return new zzXN(zzZRP.zzZ(Bitmap.createBitmap(zzDW(), zzzq5ZzY.getLeft(), zzzq5ZzY.getTop(), zzzq5ZzY.getWidth(), zzzq5ZzY.getHeight()), (int) j, (int) (j >>> 32), z), f, f2);
    }

    public final void zzZ(zzZOP zzzop, int i) throws Exception {
        zzDV();
        switch (i) {
            case 5:
                zzY(zzzop, 80);
                return;
            case 6:
                zzV(zzzop);
                return;
            case 7:
                zzU(zzzop);
                return;
            case 8:
                getPixelFormat();
                zzZ(zzzop, 6, 0, UnsignedBytes.MAX_POWER_OF_TWO);
                return;
            case 9:
                zzW(zzzop);
                return;
            default:
                throw new IllegalStateException("Cannot save in this image format.");
        }
    }

    public final void zzZ(zzZOP zzzop, int i, int i2, byte b) throws Exception {
        new zzZR5().zzlu().zzlt().zzW(zzDW(), zzzop, new zzZR5.zzZ().zzS(Integer.valueOf(i)).zzV(Integer.valueOf(i2)).zzZm(getHorizontalResolution()).zzZl(getVerticalResolution()).zzC(b));
    }

    public zzXN(Bitmap bitmap) {
        zzZ(bitmap, 7, zzEG.zzZ(bitmap.getWidth(), bitmap.getHeight(), 96.0d, 96.0d));
    }

    private static int zzZ(Bitmap.Config config) {
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444 || config == Bitmap.Config.ARGB_8888) {
            return 0;
        }
        throw new IllegalStateException("Unknown bitmap type.");
    }

    public static void zzZ(Bitmap bitmap, zzZOP zzzop) throws Exception {
        zzXN zzxn = new zzXN(bitmap);
        zzxn.zzV(zzzop);
        zzxn.zzV((Bitmap) null);
    }

    private zzXN(Bitmap bitmap, float f, float f2) {
        zzZ(bitmap, 7, zzEG.zzZ(bitmap.getWidth(), bitmap.getHeight(), f, f2));
    }

    private static zzXN zzZ(zzZOP zzzop, int i, zzEG zzeg, zzGQ zzgq, boolean z) throws Exception {
        Bitmap bitmapZzWR;
        zzEG zzegZzX;
        if (i != 0) {
            zzZR7 zzzr7 = new zzZR7();
            zzZR7.zzZ zzzZzW = new zzZR7.zzZ().zzW(Integer.valueOf(i));
            long position = zzzop.getPosition();
            try {
                try {
                    zzzop.zzH(0L);
                    if (zzEF.zzVW(i)) {
                        zzzZzW.zzW(Integer.valueOf(i)).zzZa(z).zzYO(zzeg != null ? zzZPX.zzZm(zzeg.getWidth(), zzeg.getHeight()) : 0L).zzly().zzZ(zzgq);
                        bitmapZzWR = zzzr7.zzlF().zzlE().zzY(zzzop, zzzZzW);
                        zzegZzX = zzEG.zzZ(bitmapZzWR.getWidth(), bitmapZzWR.getHeight(), zzzZzW.zzlw(), zzzZzW.zzlv());
                    } else if (i == 8) {
                        zzegZzX = zzEF.zzX(zzzop, i);
                        bitmapZzWR = zzZ(zzzop, zzzr7.zzlG().zzlE(), zzzZzW);
                    } else {
                        zzegZzX = zzEF.zzX(zzzop, i);
                        bitmapZzWR = zzZ(zzzop, zzzr7.zzlG().zzlE(), zzzZzW);
                    }
                } catch (Throwable unused) {
                    bitmapZzWR = zzXR.zzWR();
                    zzegZzX = zzEG.zzX(bitmapZzWR.getWidth(), bitmapZzWR.getHeight(), 96.0d);
                }
                zzXN zzxn = new zzXN();
                zzxn.zzZ(zzegZzX);
                zzxn.zzV(bitmapZzWR);
                zzxn.zzVt = zzzZzW.zzlC();
                return zzxn;
            } finally {
                zzzop.zzH(position);
            }
        }
        throw new IllegalArgumentException("The image format is not supported. FileFormat=" + zzKF.toString(i));
    }

    private static Bitmap zzZ(zzZOP zzzop, zzZR8 zzzr8, zzZR7.zzZ zzz) {
        try {
            return zzzr8.zzY(zzzop, zzz);
        } catch (Exception e) {
            throw new zzX8(e);
        }
    }

    private static Bitmap zzZ(Bitmap bitmap, zzZQ5 zzzq5, Bitmap.Config config) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
        zzXR.zzZ(bitmap, zzzq5, bitmapCreateBitmap, zzzq5);
        return bitmapCreateBitmap;
    }

    public final void zzZ(zzTM zztm) {
        zzPV zzpvZzX = zzPV.zzX(0, 0, 0, 0);
        zzPV zzpv = zzPV.zzKa;
        zzXN zzxn = new zzXN(getWidth(), getHeight(), getHorizontalResolution(), getVerticalResolution(), Bitmap.Config.ARGB_8888);
        for (int i = 0; i < zzDW().getWidth(); i++) {
            for (int i2 = 0; i2 < zzDW().getHeight(); i2++) {
                zzxn.zzDW().setPixel(i, i2, zztm.zzT(new zzPV(zzDW().getPixel(i, i2))) ? zzpvZzX.toArgb() : zzpv.toArgb());
            }
        }
        zzV(zzxn.zzDW());
        zzxn.zzV((Bitmap) null);
    }

    public final void zzZ(int i, int i2, zzPV zzpv) {
        zzDW().setPixel(i, i2, zzpv.toArgb());
    }

    private void zzZ(zzZQ5 zzzq5, zzXN zzxn, zzZQ5 zzzq52, zzPV zzpv) {
        zzXR.zzZ(zzDW(), zzzq5, zzxn.zzDW(), zzzq52, zzpv);
    }

    public final void zzZ(zzPJ zzpj) {
        zzV(zzZRQ.zzZ(zzDW(), zzpj));
    }

    public final void zzZ(zzEQ zzeq) {
        if (zzEF.zz6(zzDW().getWidth(), zzDW().getHeight())) {
            return;
        }
        if (zzeq.getColorMode() == 2) {
            zzV(zzZRQ.zzY(zzZRQ.zzZ(zzDW(), zzeq.zzDY(), zzeq.zzDZ()), zzeq.getColorMode()));
        } else {
            zzV(zzZRQ.zzZ(zzZRQ.zzY(zzDW(), zzeq.getColorMode()), zzeq.zzDY(), zzeq.zzDZ()));
        }
    }
}
