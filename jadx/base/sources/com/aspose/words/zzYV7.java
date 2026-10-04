package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYV7 {
    private zzYV1 zzXTJ;

    public zzYV7(zzYV1 zzyv1) {
        this.zzXTJ = zzyv1;
    }

    public final void zzW(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        DocumentBase document = zzyvb.getDocument();
        String strZzV = zzyu4ZzZsD.zzV("instr", "");
        int iZzLE = zzZOO.zzLE(com.aspose.words.internal.zzZKN.zzR(com.aspose.words.internal.zzZKN.zzU(strZzV, ControlChar.SPACE_CHAR), ControlChar.SPACE_CHAR)[0]);
        FieldStart fieldStart = new FieldStart(document, new zzYEF(), iZzLE);
        zzyvb.zzXB(fieldStart);
        zzyvb.zzXB(new Run(document, strZzV));
        zzyvb.zzXB(new FieldSeparator(document, new zzYEF(), iZzLE));
        fieldStart.isLocked(zzYU4.zzGX(zzyu4ZzZsD.zzV("fldLock", "off")));
        this.zzXTJ.zzY(zzyvb, zzyef);
        zzZAM zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(zzyvb.zzYz7().getLastChild(), zzZAM.class);
        zzyvb.zzXB(new FieldEnd(document, (zzzam == null || zzzam.getRunPr_IInline().zzYrW()) ? new zzYEF() : (zzYEF) zzzam.getRunPr_IInline().zzbn(), iZzLE, true));
    }
}
