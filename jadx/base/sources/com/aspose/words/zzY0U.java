package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0U extends zzYUK {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("hdr", "ftr", "footnotePr", "endnotePr", "annotation");
    private zzY1U zzWV6;

    public static void zzm(zzYVB zzyvb) throws Exception {
        if (zzyvb.zzYyW()) {
            zzyvb.zzZsD().zzYyH();
            return;
        }
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzyvb.zzYz7(), Paragraph.class);
        Section parentSection = ((Body) (paragraph != null ? paragraph.getParentStory() : zzyvb.zzYz7())).getParentSection();
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        int iZzf = zzYUL.zzf(zzyu4ZzZsD.zzV(C18437z2.f56754h, ""), "hdr".equals(zzyu4ZzZsD.getLocalName()));
        HeaderFooter headerFooter = new HeaderFooter(parentSection.getDocument(), iZzf);
        zzyvb.zzSB(true);
        zzY11.zzXSx();
        zzyvb.zzQ(headerFooter);
        headerFooter.isLinkedToPrevious((headerFooter.hasChildNodes() || parentSection.getHeadersFooters().getByHeaderFooterType(iZzf) == null) ? false : true);
        zzyvb.zzSB(false);
        zzyvb.zzZ(parentSection, headerFooter);
    }

    @Override // com.aspose.words.zzYUK
    public final void zzZ(String str, zzYVB zzyvb, zzYCZ zzycz, boolean z, boolean z2) throws Exception {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0 || iZzTP == 1) {
            zzm(zzyvb);
            return;
        }
        if (iZzTP == 2 || iZzTP == 3) {
            zzY1O.zzZ(zzyvb, str, zzycz);
        } else {
            if (iZzTP != 4) {
                return;
            }
            this.zzWV6.zzZ(zzycz, zzyvb);
        }
    }

    public final void zzZ(zzY1U zzy1u) {
        this.zzWV6 = zzy1u;
    }
}
