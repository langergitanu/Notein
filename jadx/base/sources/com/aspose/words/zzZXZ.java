package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXZ {
    public static void zzZ(zzZXS zzzxs) throws Exception {
        int i = 1;
        int i2 = 1;
        for (CustomXmlPart customXmlPart : zzzxs.getDocument().getCustomXmlParts()) {
            int i3 = i + 1;
            com.aspose.words.internal.zz77 zz77VarZzZ = zzzxs.zzZmf().zzZ(zzzxs.zzZme(), com.aspose.words.internal.zzZKN.format("/customXml/item{0}.xml", Integer.valueOf(i)), "application/xml", zzzxs.zzZmp().zzZkF());
            zz77VarZzZ.zz5(new com.aspose.words.internal.zzZOR(customXmlPart.getData()));
            Ref<String> ref = new Ref<>(null);
            int i4 = i2 + 1;
            zzZYD zzzydZzY = zzzxs.zzY(zz77VarZzZ, com.aspose.words.internal.zzZKN.format("/customXml/itemProps{0}.xml", Integer.valueOf(i2)), "application/vnd.openxmlformats-officedocument.customXmlProperties+xml", zzzxs.zzZmp().zzZkw(), ref);
            ref.get();
            zzKO.zzZ(customXmlPart, zzzydZzY, zzzydZzY.zzZtY() == 2);
            i2 = i4;
            i = i3;
        }
    }
}
