package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzZX8 extends zzYUZ {
    private zzZXR zzYPg;

    private void zzI(String str, String str2, String str3) {
        if (com.aspose.words.internal.zzZYD.zzXk(str3)) {
            zzZYD zzzydZzZlV = this.zzYPg.zzZlV();
            zzzydZzZlV.zzZj(str, zzzydZzZlV.zzZmN().zzxn().zzZ(str2, str3, true));
        }
    }

    private String zzX(Odso odso) throws Exception {
        if (odso.getRecipientDatas().getCount() == 0) {
            return null;
        }
        Ref<String> ref = new Ref<>(null);
        zzZXR zzzxr = this.zzYPg;
        zzZYD zzzydZzY = zzzxr.zzY(zzzxr.zzZlV().zzZmN(), "recipientData.xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.mailMergeRecipientData+xml", this.zzYPg.zzZmp().zzZkq(), ref);
        String str = ref.get();
        zzzydZzY.zzNU("w:recipients");
        for (OdsoRecipientData odsoRecipientData : odso.getRecipientDatas()) {
            zzzydZzY.zzY("w:recipientData");
            zzzydZzY.zzy("w:active", odsoRecipientData.getActive());
            zzzydZzY.zzZl("w:column", odsoRecipientData.getColumn());
            zzzydZzY.zzV("w:uniqueTag", odsoRecipientData.getUniqueTag());
            zzzydZzY.zzp();
        }
        zzzydZzY.endDocument();
        return str;
    }

    @Override // com.aspose.words.zzYUZ
    public final void zzMU(String str) {
        zzI("w:src", this.zzYPg.zzZmp().zzZks(), com.aspose.words.internal.zzZVR.zzWv(str));
    }

    @Override // com.aspose.words.zzYUZ
    public final void zzMV(String str) {
        zzI("w:headerSource", this.zzYPg.zzZmp().zzZkr(), str);
    }

    @Override // com.aspose.words.zzYUZ
    public final void zzMW(String str) {
        zzI("w:dataSource", this.zzYPg.zzZmp().zzZks(), str);
    }

    @Override // com.aspose.words.zzYUZ
    public final void zzY(Odso odso) {
        this.zzYPg.zzZlV().zzYz("w:type", zzZ2L.zzZP(odso.getDataSourceType(), true));
        this.zzYPg.zzZlV().zze("w:fHdr", odso.getFirstRowContainsColumnNames());
    }

    public final void zzZ(MailMergeSettings mailMergeSettings, zzZXR zzzxr) throws Exception {
        this.zzYPg = zzzxr;
        zzZ(mailMergeSettings, (zzZ9W) zzzxr);
    }

    @Override // com.aspose.words.zzYUZ
    public final void zzZ(Odso odso) throws Exception {
        String strZzX = zzX(odso);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzX)) {
            this.zzYPg.zzZlV().zzZj("w:recipientData", strZzX);
        }
    }
}
