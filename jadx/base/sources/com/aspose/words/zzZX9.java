package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZX9 extends zzYV0 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("recipientData");

    @Override // com.aspose.words.zzYV0
    public final void zzZ(zzYVB zzyvb, Odso odso) throws Exception {
        zzZXT zzzxt = (zzZXT) zzyvb;
        zzzxt.zzNK(zzzxt.zzZsD().zzV("id", null));
        try {
            zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
            if (!com.aspose.words.internal.zzZKN.equals(zzyu4ZzZsD.getNamespaceURI(), zzZX5.zz9(1, zzzxt.zzZqn().zzYr9()))) {
                zzzxt.zzZmi();
                return;
            }
            while (zzyu4ZzZsD.zzQ("recipients")) {
                if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 0) {
                    zzyu4ZzZsD.zzk();
                } else {
                    super.zzZ(zzzxt, odso);
                }
            }
            zzzxt.zzZmi();
        } catch (Throwable th) {
            zzzxt.zzZmi();
            throw th;
        }
    }
}
