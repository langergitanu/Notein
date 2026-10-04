package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZY0 {
    public static void zzZ(zzZXU zzzxu, IWarningCallback iWarningCallback) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzZme = zzzxu.zzZme();
        for (com.aspose.words.internal.zz75 zz75Var : zz77VarZzZme.zzxn()) {
            if (com.aspose.words.internal.zzZKN.equals(zz75Var.getType(), zzzxu.zzZmp().zzZkF())) {
                zzZ(zzzxu, zz77VarZzZme.zzZ(zz75Var), iWarningCallback);
            }
        }
    }

    private static void zzZ(zzZXU zzzxu, String str, IWarningCallback iWarningCallback) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzYd = zzzxu.zzYd(str);
        if (!"application/inkml+xml".equals(zz77VarZzYd.getContentType()) && "application/xml".equals(zz77VarZzYd.getContentType())) {
            CustomXmlPart customXmlPart = new CustomXmlPart();
            customXmlPart.setData(com.aspose.words.internal.zzZYQ.zzZX(zz77VarZzYd.zzR1()));
            com.aspose.words.internal.zz77 zz77VarZzZ = zzzxu.zzZ(zz77VarZzYd, zzzxu.zzZmp().zzZkw());
            if (zz77VarZzZ != null) {
                zzKP.zzZ(zz77VarZzZ.zzR1(), customXmlPart, iWarningCallback);
            } else if (iWarningCallback != null) {
                iWarningCallback.warning(new WarningInfo(1, 9, com.aspose.words.internal.zzZKN.format("Custom XML part properties are missed for {0}.", str)));
            }
            zzzxu.getDocument().getCustomXmlParts().add(customXmlPart);
        }
    }
}
