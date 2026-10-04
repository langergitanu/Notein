package com.aspose.words;

import android.os.Bundle;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.net.URISyntaxException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZDZ {
    private static String[] zzYko = {"ms-its:", "mk:@msitstore:", "its:"};

    private static String zzJV(String str) {
        for (String str2 : zzYko) {
            if (com.aspose.words.internal.zzZYD.zzg(str, str2)) {
                return str2;
            }
        }
        return null;
    }

    private static String zzJW(String str) {
        boolean z;
        if (!str.contains("./")) {
            return str;
        }
        ArrayList<String> arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            z = true;
            if (i >= str.length() + 1) {
                break;
            }
            if (i >= str.length() || str.charAt(i) == '/') {
                String strSubstring = str.substring(i3, i2 + i3);
                if (!".".equals(strSubstring)) {
                    if (!"..".equals(strSubstring)) {
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, strSubstring);
                    } else if (arrayList.size() > 0) {
                        Class.getSimpleName();
                    }
                }
                i3 = i + 1;
                i2 = 0;
            } else {
                i2++;
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : arrayList) {
            if (!z) {
                sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            }
            com.aspose.words.internal.zzZNH.zzU(sb, str2);
            z = false;
        }
        return sb.toString();
    }

    public static String zzJX(String str) {
        try {
            com.aspose.words.internal.zzZKL zzzkl = new com.aspose.words.internal.zzZKL(str, (byte) 0);
            return zzzkl.zzf4() ? zzzkl.zzf3() : com.aspose.words.internal.zzZKL.zzTU(str);
        } catch (URISyntaxException unused) {
            return str;
        }
    }

    public static String zzJY(String str) {
        int iZzT;
        if (com.aspose.words.internal.zzZYD.zzXk(str) && zzJV(str) != null && (iZzT = com.aspose.words.internal.zzZKN.zzT(str, "::/", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) >= 0) {
            return str.substring(iZzT + 3);
        }
        return null;
    }

    public static boolean zzYR(String str, String str2) throws Exception {
        String strZzJV;
        int iZzT;
        int length;
        if (!com.aspose.words.internal.zzZYD.zzXk(str2) || (strZzJV = zzJV(str)) == null || (iZzT = com.aspose.words.internal.zzZKN.zzT(str, "::/", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) < 0 || (length = iZzT - strZzJV.length()) <= 0 || (str.length() - iZzT) - 3 <= 0) {
            return false;
        }
        String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(com.aspose.words.internal.zzZVR.zzWt(str.substring(strZzJV.length(), strZzJV.length() + length)));
        String strZzU22 = com.aspose.words.internal.zzZKN.zzU2(str2);
        return (com.aspose.words.internal.zzZVR.zzWC(strZzU2) && com.aspose.words.internal.zzZVR.zzWC(strZzU22)) ? com.aspose.words.internal.zzZKN.equals(strZzU2, strZzU22) : com.aspose.words.internal.zzZKN.equals(com.aspose.words.internal.zzZOQ.zzVh(strZzU2), com.aspose.words.internal.zzZOQ.zzVh(strZzU22));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String zzYS(String str, String str2) {
        String strSubstring;
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        if (!com.aspose.words.internal.zzZKN.zzS(str2, "/", i)) {
            int iIndexOf = str2.indexOf(47);
            if (iIndexOf < 0) {
                iIndexOf = str2.length();
            }
            if (com.aspose.words.internal.zzZKN.zzZ(str2, ':', 0, iIndexOf) >= 0) {
                boolean zZzS = com.aspose.words.internal.zzZKN.zzS(str2, "/", i);
                strSubstring = str2;
                if (zZzS) {
                    strSubstring = str2.substring(1);
                }
            } else {
                int iLastIndexOf = str.lastIndexOf(47);
                strSubstring = str2;
                if (iLastIndexOf >= 0) {
                    strSubstring = Bundle.getInt(str.substring(0, iLastIndexOf + 1));
                }
            }
        }
        return zzJW(strSubstring);
    }

    public static String zzYT(String str, String str2) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str) || !com.aspose.words.internal.zzZYD.zzXk(str2)) {
            return "";
        }
        String strZzWy = com.aspose.words.internal.zzZVR.zzWy(str);
        return zzJW(com.aspose.words.internal.zzZKN.zzU2(com.aspose.words.internal.zzZVR.zz3(".".equals(strZzWy) ? "" : strZzWy, com.aspose.words.internal.zzZKN.zzZ(str2, IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX))));
    }
}
