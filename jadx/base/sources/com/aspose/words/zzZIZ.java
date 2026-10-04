package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzZIZ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("h1", "h2", "h3", "h4", "h5", "h6", "dir", "menu", "ol", "ul", "blockquote", "dl", "figure", "listing", "plaintext", "pre", "xmp", ContextChain.TAG_PRODUCT, TranslateLanguage.CROATIAN);

    private static double zzQ(zzZAS zzzas) {
        boolean z = false;
        for (zzZBM zzzbmZzZ2Q = zzzas.zzZ2Q(); zzzbmZzZ2Q != null && !z; zzzbmZzZ2Q = zzzbmZzZ2Q.zzZ2Q()) {
            if ("ol".equals(zzzbmZzZ2Q.zzZTQ()) || "ul".equals(zzzbmZzZ2Q.zzZTQ()) || "dir".equals(zzzbmZzZ2Q.zzZTQ()) || "menu".equals(zzzbmZzZ2Q.zzZTQ())) {
                z = true;
            }
        }
        return z ? 0.0d : 1.0d;
    }

    private static double zzR(zzZAS zzzas) {
        int i = 0;
        for (zzZBM zzzbmZzZ2Q = zzzas.zzZ2Q(); zzzbmZzZ2Q != null && i < 5; zzzbmZzZ2Q = zzzbmZzZ2Q.zzZ2Q()) {
            if ("article".equals(zzzbmZzZ2Q.zzZTQ()) || "aside".equals(zzzbmZzZ2Q.zzZTQ()) || "nav".equals(zzzbmZzZ2Q.zzZTQ()) || "section".equals(zzzbmZzZ2Q.zzZTQ())) {
                i++;
            }
        }
        return zzzN(i);
    }

    public static double zzS(zzZAS zzzas) {
        switch (zzUR.zzTP(zzzas.zzZTQ())) {
            case 0:
                return zzR(zzzas);
            case 1:
                return zzzN(1);
            case 2:
                return zzzN(2);
            case 3:
                return zzzN(3);
            case 4:
                return zzzN(4);
            case 5:
                return zzzN(5);
            case 6:
            case 7:
            case 8:
            case 9:
                return zzQ(zzzas);
            case 17:
                if (zzzas.isImplicit()) {
                    return 0.0d;
                }
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return 1.0d;
            case 18:
                return 0.5d;
            default:
                return 0.0d;
        }
    }

    public static boolean zzT(zzZAS zzzas) {
        return !com.aspose.words.internal.zzAN.zzZD(zzS(zzzas));
    }

    private static double zzzN(int i) {
        double[] dArr = {0.67d, 0.83d, 1.0d, 1.33d, 1.67d, 2.33d};
        if (i < 0 || i >= 6) {
            return 1.0d;
        }
        return dArr[i];
    }
}
