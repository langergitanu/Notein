package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0Q {
    private static HashMap<String, zzYZQ> zzY1k = new HashMap<>();

    static {
        zzy("normal", 0, 0);
        zzy("bold", 1, 0);
        zzy("italic", 2, 0);
        zzy("bold-italic", 3, 0);
        zzy("script", 2, 1);
        zzy("bold-script", 1, 1);
        zzy("fraktur", 2, 2);
        zzy("bold-fraktur", 1, 2);
        zzy("sans-serif", 0, 4);
        zzy("bold-sans-serif", 1, 4);
        zzy("sans-serif-italic", 2, 4);
        zzy("sans-serif-bold-italic", 3, 4);
        zzy("double-struck", 2, 3);
        zzy("monospace", 2, 5);
    }

    public static String zzIm(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        boolean z = true;
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            boolean z2 = cCharAt == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n';
            if (!z2) {
                if (z && sb.length() > 0) {
                    sb.append(ControlChar.SPACE_CHAR);
                }
                sb.append(cCharAt);
            }
            i++;
            z = z2;
        }
        return sb.toString();
    }

    public static zzYZQ zzIn(String str) {
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(zzY1k, str, ref);
        zzYZQ zzyzq = (zzYZQ) ref.get();
        if (zZzZ) {
            return zzyzq;
        }
        return null;
    }

    public static double zzIo(String str) {
        com.aspose.words.internal.zzZNT zzzntZzUX = new com.aspose.words.internal.zzZNR("^(-?[0-9]*\\.?[0-9]*)(em|ex|px|in|cm|mm|pt|pc|%)?$").zzUX(com.aspose.words.internal.zzZKN.zzTX(str));
        if (zzzntZzUX.zzhL() && zzzntZzUX.zzhJ().getCount() >= 2) {
            double dZzZs = com.aspose.words.internal.zzJB.zzZs(zzzntZzUX.zzhJ().zzQx(1).getValue());
            if (!Double.isNaN(dZzZs)) {
                return dZzZs;
            }
        }
        return 1.0d;
    }

    public static boolean zzO(String str, boolean z, boolean z2) {
        if (z) {
            return com.aspose.words.internal.zzZKN.equals(str, z2 ? "italic" : "normal");
        }
        return "normal".equals(str) || "italic".equals(str);
    }

    public static String zzWG(int i, int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i != 1 ? i != 2 ? i != 3 ? "normal" : "bold-italic" : "italic" : "bold" : "monospace" : i != 1 ? i != 2 ? i != 3 ? "sans-serif" : "sans-serif-bold-italic" : "sans-serif-italic" : "bold-sans-serif" : "double-struck" : i == 1 ? "bold-fraktur" : "fraktur" : i == 1 ? "bold-script" : "script";
    }

    private static void zzy(String str, int i, int i2) {
        com.aspose.words.internal.zzZQF.zzY(zzY1k, str, new zzYZQ(i, i2));
    }
}
