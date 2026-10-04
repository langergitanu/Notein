package com.aspose.words.internal;

import android.graphics.Bitmap;
import com.aspose.words.internal.zzZR7;
import com.aspose.words.internal.zzZR9;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZR8 extends zzZR9.zzZ<zzZR8> {
    private static boolean zz3Q = false;

    private Bitmap zzZ(zzZOP zzzop, zzZR7.zzZ zzz, Throwable th) throws Exception {
        zzZR9.zzZ<T> zzz2 = this.zz3R;
        if (zzz2 != 0) {
            if (th != null) {
                zzz2.zz3S = th;
            }
            return ((zzZR8) zzz2).zzY(zzzop, zzz);
        }
        zzzop.close();
        if (th == null) {
            return null;
        }
        throw new Exception(th);
    }

    public final Bitmap zzY(zzZOP zzzop, zzZR7.zzZ zzz) throws Exception {
        if (zzzop == null || zzzop.getLength() == 0) {
            return null;
        }
        long position = zzzop.getPosition();
        if (zzz == null) {
            zzz = new zzZR7.zzZ();
        }
        try {
            Bitmap bitmapZzZ = zzZ(zzzop, zzz);
            if (bitmapZzZ == null) {
                zzzop.zzH(position);
                return zzZ(zzzop, zzz, null);
            }
            if (zz3Q) {
                System.out.println("Image was read by ".concat(getClass().getName()));
            }
            return bitmapZzZ;
        } catch (Throwable th) {
            if (zz3Q) {
                System.err.println("Current reader " + getClass().getName() + " throws " + th + " try next=" + this.zz3R);
            }
            zzzop.zzH(position);
            return zzZ(zzzop, zzz, th);
        }
    }

    public abstract Bitmap zzZ(zzZOP zzzop, zzZR7.zzZ zzz) throws Exception;
}
