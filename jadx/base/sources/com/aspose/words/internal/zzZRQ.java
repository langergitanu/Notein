package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRQ {
    public static Bitmap zzY(Bitmap bitmap, int i) {
        zzPJ zzpj = new zzPJ();
        if (i == 0) {
            return bitmap;
        }
        if (i == 1) {
            zzpj.zzZ(zzPN.zzPo());
            return zzZ(bitmap, zzpj);
        }
        if (i != 2) {
            throw new IllegalStateException("Unknown color mode.");
        }
        zzpj.zzZ(zzPN.zzPo());
        zzpj.setThreshold(0.5f);
        return zzZ(bitmap, zzpj);
    }

    public static Bitmap zzZ(Bitmap bitmap, float f, float f2) {
        if (zzEQ.zzl(f2) && zzEQ.zzm(f)) {
            return bitmap;
        }
        zzPJ zzpj = new zzPJ();
        zzpj.zzZ(zzPN.zzX(f, f2));
        return zzZ(bitmap, zzpj);
    }

    public static Bitmap zzZ(Bitmap bitmap, zzPJ zzpj) {
        try {
            return zzY(zzpj.getThreshold(), zzZ(zzpj.zzOI(), zzZ(zzpj.zzOJ(), zzZ(zzpj.zzOH(), bitmap))));
        } catch (Exception unused) {
            return bitmap;
        }
    }

    private static Bitmap zzY(float f, Bitmap bitmap) {
        if (f < 0.0f || f > 1.0f) {
            return bitmap;
        }
        if (!bitmap.isMutable()) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        Bitmap bitmap2 = bitmap;
        float f2 = f * 255.0f;
        int width = bitmap2.getWidth() * bitmap2.getHeight();
        int[] iArr = new int[width];
        bitmap2.getPixels(iArr, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        for (int i = 0; i < width; i++) {
            int i2 = iArr[i];
            int iAlpha = Color.alpha(i2);
            int i3 = (((float) Color.red(i2)) >= f2 || ((float) Color.green(i2)) >= f2 || ((float) Color.blue(i2)) >= f2) ? 255 : 0;
            iArr[i] = Color.argb(iAlpha, i3, i3, i3);
        }
        bitmap2.setPixels(iArr, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        return bitmap2;
    }

    public static Bitmap zzZ(float f, Bitmap bitmap) {
        double d = f;
        if (d < 0.0d || d >= 1.0d) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAlpha((int) (f * 100.0f));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap zzZ(zzPV[] zzpvArr, Bitmap bitmap) {
        if (zzpvArr == null || zzpvArr.length < 2) {
            return bitmap;
        }
        if (!bitmap.isMutable()) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        }
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
        int length = zzpvArr.length / 2;
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            map.put(Integer.valueOf(zzpvArr[i3].zzPG()), Integer.valueOf(zzpvArr[i3 + 1].zzPG()));
        }
        for (int i4 = 0; i4 < i; i4++) {
            Integer num = (Integer) map.get(Integer.valueOf(iArr[i4]));
            if (num != null) {
                iArr[i4] = num.intValue();
            }
        }
        zzZRR.zzY(bitmap2, true);
        bitmap2.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap2;
    }

    private static Bitmap zzZ(zzPU[] zzpuArr, Bitmap bitmap) {
        if (zzpuArr == null || zzpuArr.length == 0) {
            return bitmap;
        }
        zzPV[] zzpvArr = new zzPV[zzpuArr.length * 2];
        int i = 0;
        for (zzPU zzpu : zzpuArr) {
            int i2 = i + 1;
            zzpvArr[i] = zzpu.zzPy();
            i += 2;
            zzpvArr[i2] = zzpu.zzPx();
        }
        return zzZ(zzpvArr, bitmap);
    }

    private static Bitmap zzZ(zzTM zztm, Bitmap bitmap) {
        if (zztm == null || (zztm.zzTS() == null && zztm.zzTR() == null)) {
            return bitmap;
        }
        if (!bitmap.isMutable() || bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        }
        Bitmap bitmap2 = bitmap;
        if (!bitmap2.hasAlpha()) {
            zzZRR.zzY(bitmap2, true);
        }
        int height = bitmap2.getHeight() * bitmap2.getWidth();
        int[] iArr = new int[height];
        bitmap2.getPixels(iArr, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        for (int i = 0; i < height; i++) {
            int i2 = iArr[i];
            int iRed = Color.red(i2);
            int iGreen = Color.green(i2);
            int iBlue = Color.blue(i2);
            if (zztm.zzV(iRed, iGreen, iBlue)) {
                iArr[i] = Color.argb(0, iRed, iGreen, iBlue);
            }
        }
        bitmap2.setPixels(iArr, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        return bitmap2;
    }

    private static Bitmap zzZ(zzPT zzpt, Bitmap bitmap) {
        if (zzpt == null || zzpt.zzPw()) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        if (!bitmapCreateBitmap.isMutable()) {
            bitmapCreateBitmap = bitmapCreateBitmap.copy(bitmapCreateBitmap.getConfig(), true);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        float[] fArr = new float[25];
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = 0;
            while (i3 < 5) {
                fArr[i] = zzpt.get(i3, i2);
                i3++;
                i++;
            }
        }
        fArr[4] = fArr[4] * 255.0f;
        fArr[9] = fArr[9] * 255.0f;
        fArr[14] = fArr[14] * 255.0f;
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(fArr)));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }
}
