package com.aspose.words.internal;

import android.graphics.Bitmap;
import com.aspose.words.internal.zzZR7;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZR4 extends zzZR8 {
    private static Bitmap zzZI(zzZOP zzzop) throws Exception {
        Throwable th;
        long position;
        try {
            position = zzzop.getPosition();
            try {
                zzzop.zzH(0L);
                zzZK2 zzzk2 = new zzZK2();
                zzzk2.zzV(new zzZK7(zzzop));
                Bitmap bitmapZzQi = zzzk2.zzQi(0);
                if (bitmapZzQi == null) {
                    throw new IllegalStateException("GifDecoder didn't manage to read this image, try Android's native decoder.");
                }
                zzzop.zzH(position);
                return bitmapZzQi;
            } catch (Throwable th2) {
                th = th2;
                zzzop.zzH(position);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            position = 0;
        }
    }

    private static Bitmap zzZJ(zzZOP zzzop) throws Exception {
        Throwable th;
        long position;
        try {
            position = zzzop.getPosition();
            try {
                zzzop.zzH(0L);
                zzZJV zzzjv = new zzZJV();
                zzzjv.zzZE(zzzop);
                Bitmap bitmap = zzzjv.getBitmap();
                zzzop.zzH(position);
                return bitmap;
            } catch (Throwable th2) {
                th = th2;
                zzzop.zzH(position);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            position = 0;
        }
    }

    @Override // com.aspose.words.internal.zzZR8
    public final Bitmap zzZ(zzZOP zzzop, zzZR7.zzZ zzz) throws Exception {
        Bitmap bitmapZzZJ = null;
        if (zzzop != null && zzzop.getLength() != 0) {
            Integer numZzlD = zzz.zzlD();
            long position = zzzop.getPosition();
            try {
                bitmapZzZJ = numZzlD.intValue() == 8 ? zzZJ(zzzop) : numZzlD.intValue() == 9 ? zzZI(zzzop) : zzZ(zzzop, numZzlD);
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            zzzop.zzH(position);
            if (bitmapZzZJ == null && th != null) {
                throw new zzX8(th.getMessage());
            }
        }
        return bitmapZzZJ;
    }

    private static Bitmap zzZ(zzZOP zzzop, Integer num) throws Exception {
        long position = zzzop.getPosition();
        try {
            return new zzZRM(zzzop, num.intValue()).zzlN();
        } finally {
            zzzop.zzH(position);
        }
    }
}
