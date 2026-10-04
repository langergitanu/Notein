package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYF {
    public static void zzZ(zzYVB zzyvb, zzZXA zzzxa) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        zzyvb.zzXB(new Run(zzyvb.getDocument(), Character.toString(com.aspose.words.internal.zzY6.zzT(localName, zzyu4ZzZsD.zzV("val", "ltr"))), new zzYEF()));
        zzyu4ZzZsD.zzj();
        while (zzyu4ZzZsD.zzQ(localName)) {
            zzzxa.zzF(zzyvb);
        }
        zzyvb.zzXB(new Run(zzyvb.getDocument(), Character.toString((char) 8236), new zzYEF()));
    }
}
