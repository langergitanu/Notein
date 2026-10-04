package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYEV {
    private static byte[] zz1(Document document) throws Exception {
        zzZW2 zzzw2 = new zzZW2();
        zzzw2.zzW(new zzYDZ(document, null, "", new OoxmlSaveOptions()));
        zzZXS zzzxs = new zzZXS(zzzw2, null);
        zzZXS.zzZ(document.zzZqI(), (zzZXR) zzzxs, false);
        com.aspose.words.internal.zz73.zzZ((com.aspose.words.internal.zz79) zzzxs.zzZmf(), true);
        com.aspose.words.internal.zz7C.zzZ((com.aspose.words.internal.zz79) zzzxs.zzZmf(), true);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzzxs.zzZmf().zzL(zzzor);
        return zzzor.zzWy();
    }

    public static void zzZ(zzYEM zzyem) throws Exception {
        if (zzyem.zzYeq() && zzyem.getDocument().zzZqI() != null) {
            zzYHZ zzyhzZzYfW = zzyem.zzYfW();
            byte[] bArrZz1 = zz1(zzyem.getDocument());
            zzyhzZzYfW.zzCC("\\*\\themedata");
            zzyhzZzYfW.zzFh();
            int i = 10;
            for (byte b : bArrZz1) {
                zzyhzZzYfW.zzJ(b);
                i++;
                if (i == 129) {
                    zzyhzZzYfW.zzFg();
                    i = 0;
                }
            }
            zzyhzZzYfW.zzYj3();
            zzyhzZzYfW.zzFg();
        }
    }
}
