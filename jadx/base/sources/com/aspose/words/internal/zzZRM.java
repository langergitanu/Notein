package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRM {
    private boolean zz55;
    private zzZOP zz56;
    private final zzZRF zz57 = new zzZRF();
    private final int zzwi;
    private static final Rect zz54 = new Rect(0, 0, 3264, 2448);
    private static final BitmapFactory.Options zz53 = zzz(1, false);

    public zzZRM(zzZOP zzzop, int i) {
        this.zz56 = zzzop;
        this.zzwi = i;
    }

    private static boolean zzQ(Bitmap bitmap) {
        return bitmap == null || bitmap.getConfig() == Bitmap.Config.ALPHA_8 || bitmap.getConfig() == Bitmap.Config.RGB_565 || bitmap.getConfig() == Bitmap.Config.ARGB_4444 || bitmap.getConfig() == Bitmap.Config.ARGB_8888;
    }

    private static int zzZ(zzEG zzeg, Rect rect) {
        int i = 1;
        if (rect != null && !rect.isEmpty() && zzeg != null) {
            int height = zzeg.getHeight();
            int width = zzeg.getWidth();
            int iHeight = rect.height();
            int iWidth = rect.width();
            if (height <= iHeight && width <= iWidth) {
                return 1;
            }
            int i2 = height / 2;
            int i3 = width / 2;
            while (i2 / i >= iHeight && i3 / i >= iWidth) {
                i *= 2;
            }
        }
        return i;
    }

    private static BitmapFactory.Options zzz(int i, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = z;
        if (z) {
            return options;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inSampleSize = i;
        options.inMutable = true;
        options.inScaled = false;
        return options;
    }

    public final Bitmap zzlN() throws Exception {
        boolean zHasAlpha;
        zzZOP zzzop = this.zz56;
        if (zzzop == null || zzzop.getLength() == 0) {
            return zzXR.zzWR();
        }
        long position = this.zz56.getPosition();
        if (this.zzwi == 6) {
            this.zz57.zzZL(this.zz56);
            zHasAlpha = this.zz57.hasAlpha();
            this.zz56.zzH(position);
        } else {
            zHasAlpha = false;
        }
        zzZK7 zzzk7 = new zzZK7(this.zz56);
        BitmapFactory.Options optionsZzz = zzz(1, true);
        BitmapFactory.decodeStream(zzzk7, null, optionsZzz);
        this.zz56.zzH(position);
        int iZzZ = zzZ(zzEG.zzX(optionsZzz.outWidth, optionsZzz.outHeight, 96.0d), zz54);
        boolean z = iZzZ != 1;
        this.zz55 = z;
        BitmapFactory.Options optionsZzz2 = z ? zzz(iZzZ, false) : zz53;
        this.zz56.zzH(position);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(zzzk7, null, optionsZzz2);
        if (this.zzwi == 6) {
            zzZRR.zzY(bitmapDecodeStream, zHasAlpha);
        }
        if (!zzQ(bitmapDecodeStream)) {
            bitmapDecodeStream = bitmapDecodeStream.copy(Bitmap.Config.ARGB_8888, true);
        }
        this.zz56.zzH(position);
        return bitmapDecodeStream;
    }
}
