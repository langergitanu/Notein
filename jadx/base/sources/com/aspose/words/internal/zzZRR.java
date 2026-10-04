package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRR {
    public static int zzRC(int i) {
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        int iAlpha = Color.alpha(i);
        return zzV(zzZo(iRed, iAlpha), zzZo(iGreen, iAlpha), zzZo(iBlue, iAlpha), iAlpha);
    }

    public static int zzRD(int i) {
        return (i >> 24) & 255;
    }

    public static int zzRE(int i) {
        return (i >> 16) & 255;
    }

    public static int zzRF(int i) {
        return (i >> 8) & 255;
    }

    public static Bitmap zzS(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static byte[] zzT(Bitmap bitmap) {
        IntBuffer intBufferAllocate = IntBuffer.allocate(bitmap.getHeight() * bitmap.getWidth());
        bitmap.copyPixelsToBuffer(intBufferAllocate);
        int[] iArrArray = intBufferAllocate.array();
        byte[] bArr = new byte[iArrArray.length];
        for (int i = 0; i < iArrArray.length; i++) {
            bArr[i] = (byte) iArrArray[i];
        }
        return bArr;
    }

    public static boolean zzU(Bitmap bitmap) {
        return bitmap.isPremultiplied();
    }

    private static int zzV(int i, int i2, int i3, int i4) {
        return i | (i2 << 8) | (i3 << 16) | (i4 << 24);
    }

    public static void zzY(Bitmap bitmap, boolean z) {
        if (bitmap == null) {
            return;
        }
        bitmap.setHasAlpha(z);
    }

    private static int zzZo(int i, int i2) {
        int i3 = (i * i2) + 128;
        return (i3 + (i3 >> 8)) >> 8;
    }
}
