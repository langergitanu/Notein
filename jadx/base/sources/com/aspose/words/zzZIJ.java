package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZIJ {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static HashMap<zzL4, Integer> zzYrb;
    private zzQH zzYrc;

    static {
        HashMap<zzL4, Integer> map = new HashMap<>();
        zzYrb = map;
        com.aspose.words.internal.zzZQF.zzY(map, zzL4.zzZmv, 0);
        com.aspose.words.internal.zzZQF.zzY(zzYrb, zzL4.zzZmt, 1);
        com.aspose.words.internal.zzZQF.zzY(zzYrb, zzL4.zzZmu, 2);
        com.aspose.words.internal.zzZQF.zzY(zzYrb, zzL4.zzZms, 3);
        com.aspose.words.internal.zzZQF.zzY(zzYrb, zzL4.zzZmr, 4);
        com.aspose.words.internal.zzZQF.zzY(zzYrb, zzL4.zzZmp, 5);
        com.aspose.words.internal.zzZQF.zzY(zzYrb, zzL4.zzZmq, 6);
        com.aspose.words.internal.zzZQF.zzY(zzYrb, zzL4.zzZmh, 7);
        com.aspose.words.internal.zzZQF.zzY(zzYrb, zzL4.zzZmn, 8);
        com.aspose.words.internal.zzZQF.zzY(zzYrb, zzL4.zzZmk, 9);
        com.aspose.words.internal.zzZQF.zzY(zzYrb, zzL4.zzZmj, 10);
        com.aspose.words.internal.zzZQF.zzY(zzYrb, zzL4.zzZmo, 11);
        com.aspose.words.internal.zzZQF.zzY(zzYrb, zzL4.zzZml, 12);
        com.aspose.words.internal.zzZQF.zzY(zzYrb, zzL4.zzZmi, 13);
        com.aspose.words.internal.zzZQF.zzY(zzYrb, zzL4.zzZmm, 14);
        com.aspose.words.internal.zzZQF.zzY(zzYrb, zzL4.zzZno, 15);
        zzUR = new com.aspose.words.internal.zzZHW("address", "article", "aside", "audio", "blockquote", "body", "canvas", "div", "dl", "dd", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", TranslateLanguage.CROATIAN, "html", "header", "hgroup", "li", "noscript", "ol", ContextChain.TAG_PRODUCT, "pre", "table", "tfoot", "ul", "video", "xmp", "listing");
    }

    public zzZIJ(zzQH zzqh) {
        this.zzYrc = zzqh;
    }

    public static int zzI(zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("display");
        if (zzptZzSx != null && zzYrb.containsKey(zzptZzSx.zzZWj().zzZVx())) {
            return zzYrb.get(zzptZzSx.zzZWj().zzZVx()).intValue();
        }
        return 0;
    }

    public static boolean zzKO(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                return true;
            default:
                return false;
        }
    }

    public static boolean zzT(zzZAS zzzas, zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("display");
        return (zzptZzSx == null || zzptZzSx.zzZWj().zzP(zzL4.zzZno)) ? zzKO(zzzas.zzZTQ()) : (zzptZzSx.zzZWj().zzP(zzL4.zzZmv) || zzptZzSx.zzZWj().zzP(zzL4.zzZmu)) ? false : true;
    }

    public final boolean zzZ(zzZAS zzzas, Collection<zzLT> collection) {
        com.aspose.words.internal.zzZQC zzzqc = new com.aspose.words.internal.zzZQC();
        for (zzZBM zzzbmZzZ2Q = zzzas; zzzbmZzZ2Q != null; zzzbmZzZ2Q = zzzbmZzZ2Q.zzZ2Q()) {
            zzzqc.push(zzzbmZzZ2Q);
        }
        zzMJ zzmjZzX = this.zzYrc.zzX(collection);
        while (zzzqc.size() != 0) {
            zzmjZzX.zzR((zzZBM) zzzqc.pop());
        }
        return zzT(zzzas, zzmjZzX.zzZWe());
    }
}
