package com.aspose.words;

import com.aspose.words.internal.C22243OooO0Oo;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz7F {
    private zz7H zzZjg;

    private zz7F(zz7H zz7h) {
        this.zzZjg = zz7h;
    }

    public static com.aspose.words.internal.zzG zzY(zz7H zz7h, zzZC2 zzzc2) throws Exception {
        return new zz7F(zz7h).zzY(zzzc2);
    }

    public static com.aspose.words.internal.zzZG zzZ(zz7H zz7h, zzZC2 zzzc2) {
        return new zz7F(zz7h).zzZ(zzzc2);
    }

    private com.aspose.words.internal.zzG zzY(zzZC2 zzzc2) throws Exception {
        this.zzZjg.zzZAP().zzp(zzzc2.zzZve(), zzzc2.zzZvd());
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        Iterator<zz45> it = this.zzZjg.zzZAN().iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZG zzzgZzZ = zz42.zzZ(it.next(), zzzc2);
            if (zzzgZzZ != null) {
                zzg.zzX(zzzgZzZ);
            }
        }
        zzZ(zzg, zzzc2);
        return zzg;
    }

    private com.aspose.words.internal.zzZG zzZ(zzZC2 zzzc2) {
        this.zzZjg.zzZAP().zzp(zzzc2.zzZve(), zzzc2.zzZvd());
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        Iterator<zz45> it = this.zzZjg.zzZAN().iterator();
        while (it.hasNext()) {
            zz42.zzZ(it.next(), zzzg, zzzc2);
        }
        if (zzzg.zzZ0().getCount() == 0) {
            return null;
        }
        return zzzg;
    }

    private void zzZ(com.aspose.words.internal.zzG zzg, zzZC2 zzzc2) {
        if (zzzc2.zzZva() && DrawToolFactory.LASSO_TYPE_RECT.equals(this.zzZjg.zzZAO()) && zzg.getCount() == 1) {
            com.aspose.words.internal.zzZG zzzg = (com.aspose.words.internal.zzZG) zzg.zzN(0);
            if (zzzg.zzZ0().getCount() == 1 && zzzg.zzZ2() != null) {
                com.aspose.words.internal.zzP5 zzp5 = zzzg.zzZ0().zzO7().get(0);
                if (zzp5.getCount() != 3) {
                    return;
                }
                double dMin = Math.min(zzzc2.zzZve(), zzzc2.zzZvd());
                float width = zzzg.zzZ2().getWidth() / (dMin < ((double) zzzg.zzZ2().getWidth()) ? (float) dMin : 2.0f);
                float f = -width;
                zzZ(zzp5, 0, f, f, width, f);
                zzZ(zzp5, 1, width, f, width, width);
                zzZ(zzp5, 2, width, width, f, width);
            }
        }
    }

    private static void zzZ(com.aspose.words.internal.zzP5 zzp5, int i, float f, float f2, float f3, float f4) {
        com.aspose.words.internal.zzOS zzos = (com.aspose.words.internal.zzOS) com.aspose.words.internal.zzZKW.zzZ(zzp5.zzNY().get(i), com.aspose.words.internal.zzOS.class);
        if (zzos != null) {
            zzZ(zzos.zzNu(), 0, f, f2);
            zzZ(zzos.zzNu(), 1, f3, f4);
        }
    }

    private static void zzZ(com.aspose.words.internal.zz0Q zz0q, int i, float f, float f2) {
        long j = zz0q.get(i);
        zz0q.set(i, C22243OooO0Oo.OooO00o(f2, Float.intBitsToFloat((int) j) + f, j));
    }
}
