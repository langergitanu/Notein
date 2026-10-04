package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzEH implements Closeable {
    private final zzGQ zzFh;
    private final boolean zzyU = true;
    private final boolean zzze;

    public zzEH(boolean z, zzGQ zzgq) {
        this.zzze = z;
        this.zzFh = zzgq;
    }

    private static Bitmap zzV(zzZP zzzp) throws Exception {
        zz3.zzZ(zzzp, zzzp.zzZb());
        return new zzXN(zzzp.getImageBytes()).zzDW();
    }

    private static byte[] zzW(byte[] bArr, zzEP zzep) {
        if (zzep != null) {
            try {
                if (zzep.zzDX()) {
                    zzXN zzxnZzZX = zzep.zzZX(bArr);
                    try {
                        zzZOR zzzor = new zzZOR();
                        zzxnZzZX.zzZ(zzzor, 6);
                        bArr = zzzor.zzWy();
                        return bArr;
                    } finally {
                        zzxnZzZX.dispose();
                    }
                }
            } catch (Exception e) {
                zzZHV.zzZ(e);
            }
        }
        return bArr;
    }

    private void zzY(Canvas canvas, zzZP zzzp) throws Exception {
        long size = zzzp.getSize();
        zzEP zzepZzZd = zzzp.zzZd();
        Matrix matrix = canvas.getMatrix();
        boolean zZzZ = zzZ(zzzp.zzZb());
        if (!zzEP.zzZ(zzepZzZd)) {
            byte[] bArrZzW = zzW(zzzp.getImageBytes(), zzepZzZd);
            zzzp = (zzZP) zzzp.zz1();
            zzzp.setImageBytes(bArrZzW);
        } else if (zZzZ) {
            zzzp = (zzZP) zzzp.zz1();
        }
        zzZP zzzp2 = zzzp;
        try {
            zzZ(canvas, zzEF.zzVW(zzzp2.getImageType()) ? zzZ(zzzp2, zZzZ, zzepZzZd, size, matrix) : zzV(zzzp2), zzepZzZd, zzzp2.zzZj());
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void zzZ(Canvas canvas, zzZP zzzp, zz6 zz6Var, zzA2 zza2, zzP9 zzp9) {
        try {
            zzZO.zzZ(zzzp, zz6Var, zza2, zzp9);
        } catch (Exception e) {
            zzZ(canvas, zzzp, e);
        }
    }

    public final void zzZ(Canvas canvas, zzZP zzzp) {
        canvas.save();
        try {
            zzY(canvas, zzzp);
        } catch (Exception e) {
            zzZ(canvas, zzzp, e);
        } finally {
            canvas.restore();
        }
    }

    private static Bitmap zzZ(zzZP zzzp, boolean z, zzEP zzep, long j, Matrix matrix) throws Exception {
        byte[] bArrZzDL;
        zzXN zzxn = new zzXN(zzzp.getImageBytes(), zzEP.zzZ(zzep) ? zzZ(matrix, j) : null);
        if (z) {
            zzZOR zzzor = new zzZOR();
            try {
                zzxn.zzZ(zzzor, 6);
                bArrZzDL = zzzor.zzWy();
            } finally {
                try {
                } finally {
                }
            }
            zzzp.setImageBytes(bArrZzDL);
            zz3.zzZ(zzzp, zzzp.zzZb());
            zzxn = new zzXN(zzzp.getImageBytes());
        }
        return zzxn.zzDW();
    }

    private static Bitmap zzY(Canvas canvas, Bitmap bitmap, RectF rectF) {
        zzAL zzal = new zzAL(canvas.getMatrix());
        float fAbs = Math.abs(Math.round(zzal.getScaleX() * rectF.width()));
        float fAbs2 = Math.abs(Math.round(zzal.getScaleY() * rectF.height()));
        float width = fAbs / bitmap.getWidth();
        float height = fAbs2 / bitmap.getHeight();
        if (Float.compare(0.0f, width) != 0 && Float.compare(0.0f, height) != 0 && (width <= 0.7f || height <= 0.7f)) {
            try {
                Bitmap bitmapZzZ = zzZRP.zzZ(bitmap, (int) fAbs, (int) fAbs2);
                boolean z = zzal.getScaleX() < 0.0f;
                boolean z2 = zzal.getScaleY() < 0.0f;
                zzal.scale(1.0f / Math.abs(zzal.getScaleX()), 1.0f / Math.abs(zzal.getScaleY()));
                if (z) {
                    zzal.zzAL().preTranslate(bitmapZzZ.getWidth(), 0.0f);
                }
                if (z2) {
                    zzal.zzAL().preTranslate(0.0f, bitmapZzZ.getHeight());
                }
                canvas.setMatrix(zzal.zzAL());
                Matrix matrix = new Matrix();
                matrix.preScale(zzal.getScaleX(), zzal.getScaleY());
                matrix.mapRect(rectF);
                if (bitmapZzZ != bitmap) {
                    bitmap.recycle();
                }
                return bitmapZzZ;
            } catch (Exception e) {
                zzZHV.zzZ(e);
            }
        }
        return bitmap;
    }

    private void zzZ(Canvas canvas, Bitmap bitmap, zzEP zzep, zzZQ4 zzzq4) {
        if (!zzEP.zzZ(zzep)) {
            zzzq4 = zzep.zzw(zzzq4);
        }
        zzZ(canvas, bitmap, new RectF(zzzq4.zzZm(), zzzq4.zzZo(), zzzq4.zzkw(), zzzq4.zzZn()));
    }

    private static void zzZ(Canvas canvas, Bitmap bitmap, RectF rectF) {
        canvas.save();
        Bitmap bitmapZzY = zzY(canvas, bitmap, rectF);
        canvas.drawBitmap(bitmapZzY, new Rect(0, 0, bitmapZzY.getWidth(), bitmapZzY.getHeight()), rectF, zzJ8.zzza);
        canvas.restore();
    }

    private static zzEG zzZ(Matrix matrix, long j) {
        zzAL zzal = new zzAL(matrix);
        float scaleX = zzal.getScaleX();
        float scaleY = zzal.getScaleY();
        return zzEG.zzZ(Math.abs(Math.round(Float.intBitsToFloat((int) j) * scaleX)), Math.abs(Math.round(zzZPW.zzYz(j) * scaleY)), 0.0d, 0.0d);
    }

    private static boolean zzZ(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof zzH5) {
                    return true;
                }
            }
        }
        return false;
    }

    private void zzZ(Canvas canvas, zzZP zzzp, Exception exc) {
        zzZHV.zzZ(exc);
        if (this.zzze) {
            try {
                zzY(canvas, zzZP.zzY(zzzp));
            } catch (Throwable th) {
                zzZHV.zzZ(th);
            }
        }
    }
}
