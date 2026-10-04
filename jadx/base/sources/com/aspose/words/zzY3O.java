package com.aspose.words;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzY3O {
    public static byte[] zzZ(zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox, Document document) throws Exception {
        byte[] bArrZzn = null;
        if (zzzra.zzYGE.zzXzH.zzYHJ == 0) {
            return null;
        }
        zzzox.zzq().zzH(zzzra.zzYGE.zzXzH.zzYHK);
        if ((zzzox.zzX9() & 65535) != 65535) {
            throw new IllegalStateException("Wrong signature of the document variables storage.");
        }
        int iZzXa = zzzox.zzXa();
        zzzox.zzXa();
        String[] strArr = new String[iZzXa];
        for (int i = 0; i < iZzXa; i++) {
            strArr[i] = zzZZR.zzZ(zzzox, true, false);
            zzzox.zzXc();
        }
        for (int i2 = 0; i2 < iZzXa; i2++) {
            if ("Sign".equals(strArr[i2])) {
                bArrZzn = zzzox.zzn((zzzox.zzX9() & 65535) * 2);
            } else {
                document.getVariables().add(strArr[i2], zzZZR.zzZ(zzzox, true, false));
            }
        }
        return bArrZzn;
    }

    private static String[] zzZP(Document document) {
        int count = document.getVariables().getCount();
        int i = 0;
        boolean z = (document.getVbaProject() == null || document.getVbaProject().getSignature() == null) ? false : true;
        if (z) {
            count++;
        }
        String[] strArr = new String[count];
        Iterator<Map.Entry<String, String>> it = document.getVariables().iterator();
        while (it.hasNext()) {
            strArr[i] = it.next().getKey();
            i++;
        }
        if (z) {
            strArr[count - 1] = "Sign";
        }
        Arrays.sort(strArr, zzZZ4.zzYTS);
        return strArr;
    }

    public static int zzZ(Document document, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        String[] strArrZzZP = zzZP(document);
        if (strArrZzZP.length == 0) {
            return 0;
        }
        zzzow.zzJ((short) -1);
        zzzow.zzK((short) strArrZzZP.length);
        zzzow.zzK((short) 4);
        for (String str : strArrZzZP) {
            zzZZQ.zzZ(str, Integer.MAX_VALUE, zzzow, true, false);
            zzzow.zzl(0);
        }
        for (String str2 : strArrZzZP) {
            if (!"Sign".equals(str2)) {
                zzZZQ.zzZ(document.getVariables().get(str2), Integer.MAX_VALUE, zzzow, true, false);
            } else {
                byte[] signature = document.getVbaProject() != null ? document.getVbaProject().getSignature() : null;
                if (signature != null) {
                    zzzow.zzJ((short) (signature.length / 2));
                    zzzow.writeBytes(signature);
                }
            }
        }
        return ((int) zzzow.zzq().getPosition()) - position;
    }
}
