package com.aspose.words.internal;

import android.graphics.Bitmap;
import com.aspose.words.internal.zzZR5;
import com.aspose.words.internal.zzZR9;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZR6 extends zzZR9.zzZ<zzZR6> {
    private static boolean zz3Q = false;

    public void zzR(Bitmap bitmap, zzZOP zzzop, zzZR5.zzZ zzz) throws Exception {
        throw new UnsupportedOperationException("This writer cannot write TIFF");
    }

    public void zzS(Bitmap bitmap, zzZOP zzzop, zzZR5.zzZ zzz) throws Exception {
        throw new UnsupportedOperationException("This writer cannot write BMP");
    }

    public void zzT(Bitmap bitmap, zzZOP zzzop, zzZR5.zzZ zzz) throws Exception {
        throw new UnsupportedOperationException("This writer cannot write JPEG");
    }

    public void zzU(Bitmap bitmap, zzZOP zzzop, zzZR5.zzZ zzz) throws Exception {
        throw new UnsupportedOperationException("This writer cannot write PNG");
    }

    public void zzV(Bitmap bitmap, zzZOP zzzop, zzZR5.zzZ zzz) throws Exception {
        throw new UnsupportedOperationException("This writer cannot write GIF");
    }

    public final void zzW(Bitmap bitmap, zzZOP zzzop) throws Exception {
        zzZ(bitmap, zzzop, 9, (zzZR5.zzZ) null);
    }

    public final void zzX(Bitmap bitmap, zzZOP zzzop, zzZR5.zzZ zzz) throws Exception {
        zzZ(bitmap, zzzop, 6, zzz);
    }

    public final void zzY(Bitmap bitmap, zzZOP zzzop, zzZR5.zzZ zzz) throws Exception {
        zzZ(bitmap, zzzop, 5, zzz);
    }

    public final void zzZ(Bitmap bitmap, zzZOP zzzop, zzZR5.zzZ zzz) throws Exception {
        zzZ(bitmap, zzzop, 7, zzz);
    }

    private void zzZ(Bitmap bitmap, zzZOP zzzop, int i, zzZR5.zzZ zzz) throws Exception {
        if (zzz == null) {
            zzz = new zzZR5.zzZ();
        }
        zzz.zzT(Integer.valueOf(i));
        long position = zzzop.getPosition();
        try {
            switch (zzz.zzlp().intValue()) {
                case 5:
                    zzT(bitmap, zzzop, zzz);
                    break;
                case 6:
                    zzU(bitmap, zzzop, zzz);
                    break;
                case 7:
                    zzS(bitmap, zzzop, zzz);
                    break;
                case 8:
                    zzR(bitmap, zzzop, zzz);
                    break;
                case 9:
                    zzV(bitmap, zzzop, zzz);
                    break;
            }
            if (zz3Q) {
                System.out.println("Image was written by ".concat(getClass().getName()));
            }
        } catch (Throwable th) {
            if (zz3Q) {
                th.printStackTrace();
            }
            zzzop.zzH(position);
            zzZ(bitmap, zzzop, zzz, th);
        }
    }

    public final void zzW(Bitmap bitmap, zzZOP zzzop, zzZR5.zzZ zzz) throws Exception {
        zzZ(bitmap, zzzop, 8, zzz);
    }

    private void zzZ(Bitmap bitmap, zzZOP zzzop, zzZR5.zzZ zzz, Throwable th) throws Exception {
        zzZR9.zzZ<T> zzz2 = this.zz3R;
        if (zzz2 != 0) {
            zzz2.zz3S = th;
            zzZR6 zzzr6 = (zzZR6) zzz2;
            switch (zzz.zzlp().intValue()) {
                case 5:
                    zzzr6.zzY(bitmap, zzzop, zzz);
                    return;
                case 6:
                    zzzr6.zzX(bitmap, zzzop, zzz);
                    return;
                case 7:
                    zzzr6.zzZ(bitmap, zzzop, zzz);
                    return;
                case 8:
                    zzzr6.zzW(bitmap, zzzop, zzz);
                    return;
                case 9:
                    zzzr6.zzW(bitmap, zzzop);
                    return;
                default:
                    return;
            }
        }
        throw new Exception(th);
    }
}
