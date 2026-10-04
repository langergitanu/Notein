package com.aspose.words.internal;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRI extends zzZRJ {
    public zzZRI(zzP0 zzp0) throws Throwable {
        zzZRA zzzraZzU = zzU(zzp0);
        if (zzzraZzU == null) {
            zzZ(zzZRJ.zz4U);
            this.zzVJ = zzXN.zzWR();
        } else {
            zzZ(zzzraZzU.getShader());
            this.zzVJ = zzzraZzU.getBitmap();
        }
    }

    public static zzZQ4 zzT(zzP0 zzp0) {
        try {
            return zzP6.zzS(zzp0.zzUu());
        } catch (Exception e) {
            e.printStackTrace();
            return new zzZQ4(0.0f, 0.0f, 100.0f, 100.0f);
        }
    }

    private static zzZRA zzU(zzP0 zzp0) throws Throwable {
        zzZQ8 zzzq8ZzE;
        zzZQ8 zzzq8 = null;
        try {
            zzzq8ZzE = zz6K.zzE(zzp0.zzUu());
            try {
                zzZRA zzzra = new zzZRA(zzzq8ZzE);
                zzzra.zzZ(new PointF(Float.intBitsToFloat((int) zzp0.zzNV()), zzZPY.zzYC(zzp0.zzNV())));
                if (zzp0.zzNT() != null) {
                    zzzra.zzRw(zzp0.zzNT().zzPG());
                }
                zzzra.zzX(zzAL.zzG(zzp0.zzNb()));
                zzzra.zzXR(zzp0.zzNa());
                if (zzp0.zzNU() != null) {
                    zzZ(zzp0, zzzra);
                }
                if (zzp0.zzOP() != null) {
                    zzzra.zzZ(zzY(zzp0));
                }
                if (zzzq8ZzE != null) {
                    zzzq8ZzE.close();
                }
                return zzzra;
            } catch (Exception unused) {
                if (zzzq8ZzE != null) {
                    zzzq8ZzE.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                zzzq8 = zzzq8ZzE;
                if (zzzq8 != null) {
                    zzzq8.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            zzzq8ZzE = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static zzT7 zzY(zzPL zzpl) {
        int[] iArr = new int[zzpl.zzOP().length];
        float[] fArr = new float[zzpl.zzOP().length];
        for (int i = 0; i < zzpl.zzOP().length; i++) {
            iArr[i] = zzpl.zzOP()[i].zzZy().zzPG();
            fArr[i] = zzpl.zzOP()[i].zzOG();
        }
        return new zzT7(fArr, iArr);
    }

    private static void zzZ(zzP0 zzp0, zzZRA zzzra) {
        int[] iArr = new int[zzp0.zzNU().length];
        for (int i = 0; i < zzp0.zzNU().length; i++) {
            iArr[i] = zzp0.zzNU()[i].zzPG();
        }
        zzzra.zzR(iArr);
    }
}
