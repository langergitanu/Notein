package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXC {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(C18437z2.f56754h, "id");

    public static void zzY(zzYVB zzyvb) throws Exception {
        zzZXT zzzxt = (zzZXT) zzyvb;
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        boolean zEquals = "headerReference".equals(zzyu4ZzZsD.getLocalName());
        String value = null;
        String value2 = null;
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                value = zzyu4ZzZsD.getValue();
            } else if (iZzTP == 1) {
                value2 = zzyu4ZzZsD.getValue();
            }
        }
        HeaderFooter headerFooter = new HeaderFooter(zzzxt.getDocument(), zzYUL.zzf(value, zEquals));
        zzzxt.zzNK(value2);
        zzzxt.zzSB(true);
        zzZWW.zzZl2();
        zzzxt.zzQ(headerFooter);
        headerFooter.isLinkedToPrevious(false);
        zzzxt.zzSB(false);
        zzzxt.zzZmi();
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzzxt.zzYz7(), Paragraph.class);
        zzzxt.zzZ(((Body) (paragraph != null ? paragraph.getParentStory() : zzzxt.zzYz7())).getParentSection(), headerFooter);
    }
}
