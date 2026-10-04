package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1T {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("sectPr");

    public static void zzY(zzYVB zzyvb) throws Exception {
        Document document = (Document) zzyvb.getDocument();
        CompositeNode compositeNode = (CompositeNode) zzyvb.zzYz7().getChild(3, 0, true);
        if (compositeNode == null) {
            zzyvb.zzT(new Section(document));
            zzyvb.zzT(new Body(document));
        } else {
            zzyvb.zzR(compositeNode);
        }
        zzZ3Z zzz3z = new zzZ3Z(zzyvb.getDocument(), zzyvb.zzYyZ());
        zzZ(zzyvb, zzz3z);
        zzz3z.zzW(zzyvb.zzZsD().zz5(), true);
        zzyvb.zztj(3);
        zzyvb.zztj(2);
    }

    private static void zzZ(zzYVB zzyvb, zzZ3Z zzz3z) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzyu4ZzZsD.zzj();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 0) {
                zzY11.zzXSx().zzY(zzyvb, zzz3z);
            } else {
                zzyvb.zzY((Body) zzyvb.zzYz7());
                zzyvb.zzSA(true);
            }
        }
        ((Body) zzyvb.zzYz7()).getParentSection().zzY(zzyvb.zzXUi.getCount() > 0 ? zzyvb.zzXUi : zzyvb.zzYyV());
    }
}
