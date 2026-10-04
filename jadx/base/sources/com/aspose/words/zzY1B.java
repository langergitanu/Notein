package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1B extends zzYV1 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("annotation", "subDoc", "r", "hlink", "oMath", "oMathPara", "st");
    private zzY1C zzWVa;

    public zzY1B(zzY1C zzy1c) {
        this.zzWVa = zzy1c;
    }

    private void zzq(zzYVB zzyvb) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        SmartTag smartTag = new SmartTag(zzyvb.getDocument());
        smartTag.setUri(zzyu4ZzZsD.getNamespaceURI());
        smartTag.setElement(zzyu4ZzZsD.getLocalName());
        zzyvb.zzT(smartTag);
        while (zzyu4ZzZsD.zzi()) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 6) {
                smartTag.getProperties().zzZ(new CustomXmlProperty(zzyu4ZzZsD.getLocalName(), zzyu4ZzZsD.getNamespaceURI(), zzyu4ZzZsD.getValue()));
            }
        }
        zzY(zzyvb, null);
        zzyvb.zztj(27);
    }

    private static void zzr(zzYVB zzyvb) throws Exception {
        if (!zzyvb.zzZmv()) {
            throw new IllegalStateException("Unexpected token for WordML");
        }
        int iZzTP = zzUR.zzTP(zzyvb.zzZsD().getLocalName());
        if (iZzTP == 4) {
            zzY16.zzM(zzyvb);
        } else if (iZzTP != 5) {
            zzyvb.zzZsD().zzk();
        } else {
            zzY16.zzN(zzyvb);
        }
    }

    @Override // com.aspose.words.zzYV1
    public final void zzX(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
        if (iZzTP == 0) {
            zzY1U.zzY(zzyvb);
            return;
        }
        if (iZzTP == 1) {
            zzyvb.zzYz7().zzA(new SubDocument(zzyvb.getDocument(), com.aspose.words.internal.zzZVR.zz2(((Document) zzyvb.getDocument()).getOriginalFileName(), zzyu4ZzZsD.zzV("link", ""))));
            return;
        }
        if (iZzTP == 2) {
            zzY11.zzXSw().zzY(zzyvb);
            return;
        }
        if (iZzTP == 3) {
            this.zzWVa.zzY(zzyvb);
            return;
        }
        if (iZzTP == 4 || iZzTP == 5) {
            zzr(zzyvb);
        } else if (zzyvb.zzZmk()) {
            zzq(zzyvb);
        } else {
            if (zzY11.zzXSw().zzL(zzyvb, new zzYEF())) {
                return;
            }
            zzY(zzyvb, null);
        }
    }

    @Override // com.aspose.words.zzYV1
    public final void zzY(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzyu4ZzZsD.zzj();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            zzX(zzyvb, zzyef);
        }
    }
}
