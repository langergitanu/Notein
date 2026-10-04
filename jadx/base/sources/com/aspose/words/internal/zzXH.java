package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzXH {
    private static final RectF zzVh;
    private static final zzZQ4 zzVi;

    static {
        zzZQ4 zzzq4 = new zzZQ4(0.0f, 0.0f, 100.0f, 100.0f);
        zzVi = zzzq4;
        zzVh = new RectF(zzzq4.zzZm(), zzzq4.zzZo(), zzzq4.zzkw(), zzzq4.zzZn());
    }

    public static zzZRJ zzW(zzPY zzpy) throws Exception {
        if (zzpy == null) {
            return null;
        }
        return zzY(zzpy, zzZQ4.zz2T);
    }

    public static zzZRJ zzY(zzPY zzpy, zzZQ4 zzzq4) throws Exception {
        int iZzPH = zzpy.zzPH();
        if (iZzPH == 0) {
            return new zzZRH(zzT4.zzS(((zzOI) zzpy).zzZy()));
        }
        if (iZzPH == 1) {
            return new zzZRL(zzZ((zzPK) zzpy));
        }
        if (iZzPH == 2) {
            return new zzZRG((zzOH) zzpy);
        }
        if (iZzPH == 3) {
            return new zzZRK((zzPA) zzpy);
        }
        if (iZzPH == 4) {
            return zzZ((zzOP) zzpy, zzzq4);
        }
        if (iZzPH == 5) {
            return new zzZRI((zzP0) zzpy);
        }
        throw new IllegalArgumentException("Unknown brush type.");
    }

    private static zzZRJ zzZ(zzOP zzop, zzZQ4 zzzq4) throws Exception {
        return new zzZRI(zzOO.zzX(zzop, zzzq4));
    }

    public static zzOH zzW(zzPA zzpa) throws Exception {
        zzP9 zzp9ZzNb = zzpa.zzNb();
        zzpa.zzL((zzP9) null);
        zzZRK zzzrk = new zzZRK(zzpa);
        try {
            zzOH zzohZzZ = zzZ(zzpa.zzOw(), zzzrk.getPaint(), (Bitmap) null);
            zzzrk.close();
            zzpa.zzL(zzp9ZzNb);
            zzohZzZ.zzNb().zzZ(zzp9ZzNb, 1);
            zzohZzZ.zzXR(zzpa.zzNa() != 4 ? zzpa.zzNa() : 3);
            return zzohZzZ;
        } catch (Throwable th) {
            try {
                zzzrk.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] zzZ(zzPK zzpk) {
        try {
            return zzIK.zzZ(zzpk);
        } catch (Exception e) {
            e.printStackTrace();
            try {
                return zzEF.zzDL();
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    private static zzOH zzZ(zzZQ4 zzzq4, Paint paint, Bitmap bitmap) {
        int width = bitmap != null ? bitmap.getWidth() : (int) zzVh.width();
        int height = bitmap != null ? bitmap.getHeight() : (int) zzVh.width();
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        zzP9 zzp9ZzZ = zzP9.zzZ(zzzq4, new zzZQ4(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()));
        RectF rectF = new RectF(zzzq4.zzZm(), zzzq4.zzZo(), zzzq4.zzkw(), zzzq4.zzZn());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        Canvas canvas = new Canvas(bitmap);
        canvas.setMatrix(zzAL.zzG(zzp9ZzZ));
        canvas.drawRect(rectF, paint);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        zzOH zzoh = new zzOH(byteArrayOutputStream.toByteArray(), (byte) 0);
        zzoh.zzL(zzp9ZzZ.zzOo());
        return zzoh;
    }

    public static zzOH zzY(zzOP zzop, zzZQ4 zzzq4) throws Exception {
        return zzZ(zzOO.zzX(zzop, zzzq4), zzzq4);
    }

    public static zzOH zzZ(zzP0 zzp0) throws Exception {
        return zzZ(zzp0, zzZQ4.zz2T);
    }

    public static zzOH zzZ(zzP0 zzp0, zzZQ4 zzzq4) throws Exception {
        if (zzp0 == null) {
            return null;
        }
        zzP8 zzp8ZzO8 = zzp0.zzUu().zzO8();
        zzP9 zzp9ZzNb = zzp0.zzNb();
        long jZzR = zzp9ZzNb.zzR(zzp0.zzNV());
        zzp8ZzO8.zzY(zzp9ZzNb);
        zzP0 zzp02 = new zzP0(zzp8ZzO8, jZzR);
        zzp02.zzY(zzp0.zzNU());
        zzp02.zzY(zzp0.zzOP());
        zzp02.zzJ(zzp0.zzNT());
        zzp02.zzY(zzp0.zzON());
        zzp02.zzZ(zzp0.zzOO());
        zzp02.zzXR(zzp0.zzNa());
        zzZRJ zzzrjZzW = zzW(zzp02);
        try {
            zzZQ4 zzzq4ZzY = zzP6.zzY(zzp02.zzUu(), 0.0f);
            zzOH zzohZzZ = zzZ(zzzq4ZzY, zzzrjZzW.getPaint(), zzZ(zzp02, zzzq4ZzY, zzzq4));
            zzohZzZ.zzXR(zzp0.zzNa());
            zzzrjZzW.close();
            return zzohZzZ;
        } catch (Throwable th) {
            if (zzzrjZzW != null) {
                try {
                    zzzrjZzW.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static Bitmap zzZ(zzP0 zzp0, zzZQ4 zzzq4, zzZQ4 zzzq42) {
        zzPV zzpvZzNT;
        int iMax = zzzq42 != null ? Math.max(Math.min(100, (int) Math.ceil(Math.max(zzzq42.getWidth(), zzzq4.getWidth()))), 10) : 100;
        int iMax2 = zzzq42 != null ? Math.max(Math.min(100, (int) Math.ceil(Math.max(zzzq42.getHeight(), zzzq4.getHeight()))), 10) : 100;
        int iMax3 = Math.max(iMax, iMax2);
        zzXN zzxn = new zzXN(iMax3, Math.max(iMax3, iMax2));
        if (zzp0.zzOP() != null && zzp0.zzOP().length > 0) {
            zzpvZzNT = zzp0.zzOP()[0].zzZy();
        } else if (zzp0.zzNU() != null && zzp0.zzNU().length > 0) {
            zzpvZzNT = zzp0.zzNU()[0];
        } else {
            zzpvZzNT = zzp0.zzNT();
        }
        zzP9 zzp9ZzZ = zzP9.zzZ(zzzq4, new zzZQ4(0.0f, 0.0f, zzxn.getWidth(), zzxn.getHeight()));
        if (zzp0.zzNb() != null) {
            zzp9ZzZ.zzZ(zzp0.zzNb(), 0);
        }
        zzIY zziy = new zzIY(zzxn);
        try {
            try {
                zziy.zzZ(zzpvZzNT, zzxn.getWidth(), zzxn.getHeight());
                zzPV zzpv = zzPV.zzIs;
                if (zzpvZzNT == zzpv) {
                    zzpv = zzPV.zzKa;
                }
                zzZQ8 zzzq8ZzE = zz6K.zzE(zzp0.zzUu());
                Canvas canvasZzGH = zziy.zzGH();
                canvasZzGH.setMatrix(zzAL.zzG(zzp9ZzZ));
                zzZRH zzzrh = new zzZRH(zzT4.zzS(zzpv));
                try {
                    canvasZzGH.drawPath(zzzq8ZzE, zzzrh.getPaint());
                    zzzrh.close();
                    zzPJ zzpj = new zzPJ();
                    zzpj.zzY(new zzTM(zzpv, zzpv));
                    zzxn.zzZ(zzpj);
                } catch (Throwable th) {
                    try {
                        zzzrh.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            zziy.dispose();
            return zzxn.zzDW();
        } catch (Throwable th3) {
            zziy.dispose();
            throw th3;
        }
    }
}
