package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZK4 {
    public static int[] zzN(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ARGB_8888 ? new int[]{8, 8, 8, 8} : bitmap.getConfig() == Bitmap.Config.ARGB_4444 ? new int[]{4, 4, 4, 4} : bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? new int[]{1, 1, 1, 1} : bitmap.getConfig() == Bitmap.Config.RGB_565 ? new int[]{8, 8, 8} : new int[]{8, 8, 8};
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

    public static byte[] zzZ(Bitmap bitmap, boolean z, boolean z2) {
        IntBuffer intBufferAllocate = IntBuffer.allocate(bitmap.getHeight() * bitmap.getWidth());
        bitmap.copyPixelsToBuffer(intBufferAllocate);
        int[] iArrArray = intBufferAllocate.array();
        byte[] bArr = new byte[iArrArray.length];
        for (int i = 0; i < iArrArray.length; i++) {
            byte b = (byte) (z ? (iArrArray[i] & 128) >> 7 : iArrArray[i]);
            bArr[i] = b;
            if (z2) {
                bArr[i] = (byte) (b ^ 255);
            }
        }
        return bArr;
    }
}
