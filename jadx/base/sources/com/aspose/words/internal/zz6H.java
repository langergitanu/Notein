package com.aspose.words.internal;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.io.Closeable;

/* JADX INFO: loaded from: classes5.dex */
final class zz6H implements Closeable {
    private final float zzlA = 1.3333334f;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void zzZ(Canvas canvas, zzZG zzzg, zzZQ8 zzzq8, boolean z, zzZQ4 zzzq4) throws Exception {
        boolean z2 = zzzg.zzZ2() != null && zzzg.zzZ2().zzNI() == 7;
        PorterDuffXfermode porterDuffXfermode = z2 ? new PorterDuffXfermode(PorterDuff.Mode.SRC_IN) : null;
        if (zzzg.zzZ1() != null) {
            Matrix matrix = canvas.getMatrix();
            zzPY zzpyZzZ1 = zzzg.zzZ1();
            if (zzpyZzZ1.zzPH() == 5) {
                Path path = new Path(zzzq8);
                zzZRJ zzzrjZzZ = zzZ(canvas, path, matrix, zzpyZzZ1, zzzq4);
                if (z2) {
                    try {
                        zzzrjZzZ.getPaint().setXfermode(porterDuffXfermode);
                    } catch (Throwable th) {
                        if (zzzrjZzZ != null) {
                            try {
                                zzzrjZzZ.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                canvas.drawPath(path, zzzrjZzZ.getPaint());
                zzzrjZzZ.close();
            } else {
                zzZRJ zzzrjZzY = zzXH.zzY(zzpyZzZ1, zzzq4);
                if (z2) {
                    try {
                        zzzrjZzY.getPaint().setXfermode(porterDuffXfermode);
                    } catch (Throwable th3) {
                        if (zzzrjZzY != null) {
                            try {
                                zzzrjZzY.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
                canvas.drawPath(zzzq8, zzzrjZzY.getPaint());
                zzzrjZzY.close();
            }
            canvas.setMatrix(matrix);
        }
        if (zzzg.zzZ2() != null) {
            canvas.save();
            zzAL zzal = new zzAL(canvas.getMatrix());
            if (zzal.zzAK() <= 0.0f || zzal.zzAK() >= 0.02f) {
                zz1C zz1cZzZ = zz1C.zzZ(zzzg.zzZ2(), canvas.getMatrix(), z);
                try {
                    canvas.drawPath(zzzq8, zz1cZzZ.getPaint());
                    zz1cZzZ.close();
                } catch (Throwable th5) {
                    if (zz1cZzZ != null) {
                        try {
                            zz1cZzZ.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                    }
                    throw th5;
                }
            } else {
                zzZ(canvas, zzzg, zzzq8, zzal);
            }
            canvas.restore();
        }
    }

    private static zzZRJ zzZ(Canvas canvas, Path path, Matrix matrix, zzPY zzpy, zzZQ4 zzzq4) throws Exception {
        zzZQ4 zzzq4ZzT = zzZRI.zzT((zzP0) zzpy);
        if (zzzq4ZzT.getWidth() >= 10.0f && zzzq4ZzT.getHeight() >= 10.0f) {
            return zzXH.zzY(zzpy, zzzq4);
        }
        float fMax = Math.max(zzzq4ZzT.getWidth(), zzzq4ZzT.getHeight()) / 100.0f;
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preScale(fMax, fMax);
        canvas.setMatrix(matrix2);
        zzP0 zzp0 = (zzP0) zzpy.zzPI();
        float f = 1.0f / fMax;
        zzP9 zzp9 = new zzP9();
        zzp9.zzY(f, (int) f);
        zzp0.zzUu().zzY(zzp9);
        long jZzNV = zzp0.zzNV();
        zzp0.zzo(zzZPY.zzG(Float.intBitsToFloat((int) jZzNV) * f, zzZPY.zzYC(jZzNV) * f));
        Matrix matrix3 = new Matrix();
        matrix3.setScale(f, f);
        path.transform(matrix3);
        return zzXH.zzY(zzp0, zzzq4);
    }

    private void zzZ(Canvas canvas, zzZG zzzg, Path path, zzAL zzal) throws Exception {
        zzOU zzouZzNQ = zzzg.zzZ2().zzNQ();
        float scaleX = this.zzlA / zzal.getScaleX();
        float scaleY = this.zzlA / zzal.getScaleY();
        float f = 1.0f / scaleX;
        float f2 = 1.0f / scaleY;
        float fMax = Math.max(Math.abs(Math.min(f, f2) * zzouZzNQ.getWidth()), 0.0f);
        Path path2 = new Path(path);
        Matrix matrix = new Matrix();
        matrix.setScale(f, f2);
        path2.transform(matrix);
        zzouZzNQ.setWidth(fMax);
        zz1C zz1cZzZ = zz1C.zzZ(zzouZzNQ, new Matrix(), false);
        try {
            canvas.save();
            canvas.scale(scaleX, scaleY);
            canvas.drawPath(path2, zz1cZzZ.getPaint());
            canvas.restore();
            zz1cZzZ.close();
        } catch (Throwable th) {
            if (zz1cZzZ != null) {
                try {
                    zz1cZzZ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
