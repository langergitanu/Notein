package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY17 extends zzYUZ {
    private zzYU6 zzXSu;

    @Override // com.aspose.words.zzYUZ
    public final void zzMU(String str) {
        this.zzXSu.zzYz("w:src", str);
    }

    @Override // com.aspose.words.zzYUZ
    public final void zzMV(String str) {
        this.zzXSu.zzYz("w:headerSource", str);
    }

    @Override // com.aspose.words.zzYUZ
    public final void zzMW(String str) {
        this.zzXSu.zzYz("w:dataSource", str);
    }

    @Override // com.aspose.words.zzYUZ
    public final void zzY(Odso odso) {
        this.zzXSu.zzYz("w:jdsoType", zzZ2L.zzZP(odso.getDataSourceType(), false));
        if (odso.getFirstRowContainsColumnNames()) {
            this.zzXSu.zzZl("w:fHdr", 1);
        }
    }

    public final void zzZ(MailMergeSettings mailMergeSettings, zzY0P zzy0p) throws Exception {
        this.zzXSu = zzy0p.zzZm2();
        zzZ(mailMergeSettings, (zzZ9W) zzy0p);
    }

    @Override // com.aspose.words.zzYUZ
    public final void zzZ(Odso odso) {
        for (OdsoRecipientData odsoRecipientData : odso.getRecipientDatas()) {
            this.zzXSu.zzY("w:recipientData");
            if (!odsoRecipientData.getActive()) {
                this.zzXSu.zzZl("w:active", 0);
            }
            this.zzXSu.zzv("w:column", odsoRecipientData.getColumn(), 0);
            this.zzXSu.zzv("w:hash", odsoRecipientData.getHash(), 0);
            byte[] uniqueTag = odsoRecipientData.getUniqueTag();
            if (uniqueTag != null) {
                this.zzXSu.zzYz("w:uniqueTag", com.aspose.words.internal.zzZO0.zzhU().zzZn(uniqueTag));
            }
            this.zzXSu.zzp();
        }
    }
}
