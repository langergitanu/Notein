package com.aspose.words.internal;

import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* JADX INFO: loaded from: classes5.dex */
final class zz1C implements zzZOY, AutoCloseable {
    private zzZRJ zzfl;
    private Paint zzfm;

    private zz1C() {
    }

    private static boolean zzK(zzOU zzou) {
        if (zzou.getWidth() == 1.0f) {
            return zzou.zzNH() == null || zzou.zzNH().length == 0;
        }
        return false;
    }

    private static Paint.Cap zzL(zzOU zzou) {
        int iZzNN = zzou.zzNN();
        if (iZzNN == 1) {
            return Paint.Cap.SQUARE;
        }
        if (iZzNN == 2) {
            return Paint.Cap.ROUND;
        }
        int endCap = zzou.getEndCap();
        return endCap != 1 ? endCap != 2 ? (zzou.getDashStyle() == 0 || zzou.zzNJ() != 2) ? Paint.Cap.BUTT : Paint.Cap.ROUND : Paint.Cap.ROUND : Paint.Cap.SQUARE;
    }

    private static boolean zzM(zzOU zzou) {
        return zzou.zzNH() != null && zzou.zzNH().length > 1;
    }

    private static zz1C zzN(zzOU zzou) throws Exception {
        zz1C zz1c = new zz1C();
        Paint paint = new Paint();
        if (zzou.zzZ1() != null) {
            zzZRJ zzzrjZzW = zzXH.zzW(zzou.zzZ1());
            zz1c.zzfl = zzzrjZzW;
            int iZzPH = zzou.zzZ1().zzPH();
            if (iZzPH == 0) {
                paint.setColor(zzzrjZzW.getPaint().getColor());
            } else if (iZzPH == 1 || iZzPH == 2 || iZzPH == 3 || iZzPH == 5) {
                paint.set(zzzrjZzW.getPaint());
            }
        }
        paint.setStrokeWidth(zzou.getWidth());
        paint.setStrokeCap(zzL(zzou));
        paint.setStrokeJoin(zzTz(zzou.zzNM()));
        paint.setStrokeMiter(zzou.zzNL());
        paint.setStyle(Paint.Style.STROKE);
        zz1c.zzfm = paint;
        return zz1c;
    }

    private static Paint.Join zzTz(int i) {
        if (i == 0) {
            return Paint.Join.MITER;
        }
        if (i == 1) {
            return Paint.Join.BEVEL;
        }
        if (i != 2 && i == 3) {
            return Paint.Join.MITER;
        }
        return Paint.Join.ROUND;
    }

    public static zz1C zzZ(zzOU zzou, Matrix matrix, boolean z) throws Exception {
        zzAL zzal = new zzAL(matrix);
        zz1C zz1cZzN = zzN(zzou);
        Paint paint = zz1cZzN.zzfm;
        float width = zzou.getWidth();
        if (z && width == 0.0f) {
            width = 1.0f;
        }
        if (zzM(zzou)) {
            float fZzAK = zzal.zzAK();
            if (fZzAK < 0.1f && width == 1.0f) {
                width = 1.3333334f / fZzAK;
            } else if (width < 1.0f) {
                width = 1.0f;
            }
            float[] fArr = (float[]) zzou.zzNH().clone();
            if (zzAN.zzZP(fArr.length)) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                System.arraycopy(fArr, 0, fArr2, fArr.length, fArr.length);
                fArr = fArr2;
            }
            zzZ(paint.getStrokeCap(), width, fArr);
            paint.setPathEffect(new DashPathEffect(fArr, Math.max(width, 1.0f) * zzou.zzNK()));
            paint.setStrokeWidth(width);
        } else {
            width = zzZ(zzou, zzal);
        }
        paint.setStrokeWidth(width);
        if (zzou.zzNI() == 7) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
        return zz1cZzN;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        dispose();
    }

    @Override // com.aspose.words.internal.zzZOY
    public final void dispose() throws Exception {
        zzZRJ zzzrj = this.zzfl;
        if (zzzrj != null) {
            zzzrj.close();
            this.zzfl = null;
        }
        if (this.zzfm != null) {
            this.zzfm = null;
        }
    }

    public final Paint getPaint() {
        return this.zzfm;
    }

    private static void zzZ(Paint.Cap cap, float f, float[] fArr) {
        float fMax = Math.max(f, 1.0f);
        boolean z = cap != Paint.Cap.BUTT;
        for (int i = 0; i < fArr.length; i++) {
            if (zzAN.zzZP(i)) {
                float f2 = fArr[i];
                if (z) {
                    f2 += 1.0f;
                }
                fArr[i] = f2 * fMax;
            } else {
                float f3 = fArr[i];
                if (z) {
                    f3 -= 1.0f;
                }
                fArr[i] = Math.max(f3, 0.01f) * fMax;
            }
        }
    }

    private static float zzZ(zzOU zzou, zzAL zzal) {
        float width = zzou.getWidth();
        if (zzK(zzou) && zzAL.zzY(zzal.zzAL())) {
            return 0.0f;
        }
        if (!zzM(zzou)) {
            float fZzAK = zzal.zzAK();
            if (fZzAK != 0.0f && fZzAK * width < 1.0f) {
                return 0.0f;
            }
        }
        return width;
    }
}
