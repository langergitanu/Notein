package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQP {
    public static String zzM0(String str) {
        return zzW(str, false, true);
    }

    public static String zzM1(String str) {
        return zzW(str, false, false);
    }

    private static zzYWB zzR(zzZR8 zzzr8) {
        return !zzzr8.zzZg9().zz13() ? zzzr8.zzZg9() : zzzr8.zzZga();
    }

    public static void zzS(zzZR8 zzzr8) throws Exception {
        zzR(zzzr8).remove();
    }

    private static String zzW(String str, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(str.length());
        boolean z3 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"' || cCharAt == '\\') {
                sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
            }
            sb.append(cCharAt);
            z3 = z3 || com.aspose.words.internal.zzZKU.zzG(cCharAt);
        }
        if (!z && (z2 || sb.length() == 0 || z3)) {
            sb.insert(0, '\"').append('\"');
        }
        return sb.toString();
    }

    private static void zzX(zzZR1 zzzr1, String str, String str2) {
        DocumentBuilder documentBuilder = new DocumentBuilder(zzzr1.getField().getStart().zzYBb());
        zzZ(zzzr1, documentBuilder);
        documentBuilder.write(com.aspose.words.internal.zzZKN.format(" {0}", str));
        if (str2 != null) {
            zzZ(documentBuilder, true, str2, false);
        }
    }

    private static void zzY(zzZR1 zzzr1, String str, String str2) {
        if (zzzr1.zzZfC().size() == 0) {
            zzX(zzzr1, str, str2);
            return;
        }
        DocumentBuilder documentBuilder = new DocumentBuilder(zzzr1.getField().getStart().zzYBb());
        zzX(zzzr1, documentBuilder);
        documentBuilder.write(str);
        if (str2 != null) {
            zzZ(documentBuilder, true, str2, false);
        }
        documentBuilder.write(" ");
    }

    public static void zzZ(zzZR1 zzzr1, String str, String str2) {
        if (zzZPC.zzLK(str)) {
            zzY(zzzr1, str, str2);
        } else {
            zzX(zzzr1, str, str2);
        }
    }

    public static void zzZ(zzZPC zzzpc) throws Exception {
        zzYWB zzywb;
        if (zzzpc.zzZcc() == null) {
            zzywb = zzzpc.zzZga();
        } else {
            zzywb = new zzYWB(zzzpc.zzZga().zzYA2(), zzzpc.zzZcc().zzZga().zzYA1());
        }
        zzywb.remove();
    }

    private static void zzX(zzZR1 zzzr1, DocumentBuilder documentBuilder) {
        documentBuilder.moveTo(zzzr1.zzZfF().zzZga().zzYA2().getNode());
    }

    public static void zzZ(zzZR1 zzzr1, String[] strArr, boolean z) {
        boolean z2;
        DocumentBuilder documentBuilder = new DocumentBuilder(zzzr1.getField().getStart().zzYBb());
        boolean zZzY = zzzr1.zzZfC().size() != 0 ? zzY(zzzr1, documentBuilder) : false;
        boolean z3 = zZzY;
        if (zZzY) {
            z2 = false;
        } else {
            zzZ(zzzr1, documentBuilder);
            z2 = true;
        }
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            boolean z4 = z && i == strArr.length - 1;
            zzZ(documentBuilder, z2, str, z4);
            if (z3 && !z4) {
                documentBuilder.write(" ");
            }
            i++;
        }
    }

    private static boolean zzY(zzZR1 zzzr1, DocumentBuilder documentBuilder) {
        zzZPC zzzpc;
        zzZR8 zzzr8ZzDH = zzzr1.zzDH(zzzr1.zzZfD().size() - 1);
        if (zzzr8ZzDH == null) {
            zzX(zzzr1, documentBuilder);
            return true;
        }
        Iterator<Object> it = zzzr1.zzMf().iterator();
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                zzzpc = null;
                break;
            }
            Object next = it.next();
            if (z) {
                zzzpc = (zzZPC) next;
                break;
            }
            if (next == zzzr8ZzDH) {
                z = true;
            }
        }
        if (zzzpc == null) {
            return false;
        }
        documentBuilder.moveTo(zzzpc.zzZga().zzYA2().getNode());
        return true;
    }

    public static void zzZ(zzZR1 zzzr1, zzZR8 zzzr8, String str, boolean z) throws Exception {
        DocumentBuilder documentBuilder = new DocumentBuilder(zzzr1.getField().getStart().zzYBb());
        zzYWB zzywbZzR = zzR(zzzr8);
        documentBuilder.moveTo(zzywbZzR.zzYA2().getNode());
        zzZ(documentBuilder, false, str, z);
        zzywbZzR.remove();
    }

    private static void zzZ(zzZR1 zzzr1, DocumentBuilder documentBuilder) {
        documentBuilder.moveTo(zzzr1.getField().zzZgr());
    }

    private static void zzZ(DocumentBuilder documentBuilder, boolean z, String str, boolean z2) {
        if (z) {
            documentBuilder.write(" ");
        }
        documentBuilder.write(str == null ? "\"\"" : zzW(str, z2, false));
    }
}
