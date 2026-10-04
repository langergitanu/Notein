package com.aspose.words.internal;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRN {
    public static void zzX(Bitmap bitmap, zzZOP zzzop) throws Exception {
        if (bitmap == null) {
            zzZM(zzzop);
            return;
        }
        zzZRD zzzrd = new zzZRD();
        try {
            zzzrd.zzZK(zzzop);
            zzzrd.zzP(bitmap);
        } catch (Exception unused) {
        } finally {
            zzzrd.flush();
        }
    }

    public static void zzY(Bitmap bitmap, zzZOP zzzop) throws Exception {
        zzZK6 zzzk6;
        if (bitmap == null) {
            zzZM(zzzop);
            return;
        }
        zzZK6 zzzk62 = null;
        try {
            try {
                zzzk6 = new zzZK6(zzzop);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            zzZK3 zzzk3 = new zzZK3();
            zzzk3.zzX(zzzk6);
            zzzk3.zzM(bitmap);
            zzzk3.zzev();
            try {
                zzzk6.flush();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            try {
                zzzk6.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        } catch (Exception e4) {
            e = e4;
            zzzk62 = zzzk6;
            e.printStackTrace();
            if (zzzk62 != null) {
                try {
                    zzzk62.flush();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                try {
                    zzzk62.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th = th2;
            zzzk62 = zzzk6;
            if (zzzk62 != null) {
                try {
                    zzzk62.flush();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
                try {
                    zzzk62.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static void zzZ(Bitmap bitmap, OutputStream outputStream, int i) throws Exception {
        if (bitmap != null) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, outputStream);
        } else {
            outputStream.write(zzEF.zzDL());
        }
    }

    public static void zzZM(zzZOP zzzop) throws Exception {
        byte[] bArrZzDL = zzEF.zzDL();
        zzzop.write(bArrZzDL, 0, bArrZzDL.length);
    }

    public static void zzZ(Bitmap bitmap, OutputStream outputStream) throws Exception {
        if (bitmap != null) {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
        } else {
            outputStream.write(zzEF.zzDL());
        }
    }

    public static void zzY(zzXN zzxn, zzZOP zzzop, int i, int i2, byte b) throws Exception {
        new zzZWF().zzZ(zzxn, zzzop, i, i2, b);
    }
}
