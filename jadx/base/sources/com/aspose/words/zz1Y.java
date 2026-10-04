package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz1Y extends zzZ61 {
    private ArrayList<com.aspose.words.internal.zzZL> zzXz;

    private ArrayList<com.aspose.words.internal.zzZL> zzY(Paragraph paragraph, Shading shading, int[] iArr) throws Exception {
        Document documentZzZpS = paragraph.getDocument().zzZpS();
        Paragraph firstParagraph = documentZzZpS.getFirstSection().getBody().getFirstParagraph();
        documentZzZpS.getFirstSection().getPageSetup().setPageWidth(1584.0d);
        Iterator<T> it = paragraph.getRuns().iterator();
        while (true) {
            if (!it.hasNext()) {
                this.zzXz = new ArrayList<>();
                documentZzZpS.zzWA(true).zzqO(0).zzZ(this);
                return this.zzXz;
            }
            Run run = (Run) it.next();
            Run run2 = new Run(documentZzZpS, run.getText(), (zzYEF) run.zzZYh().zzbn());
            for (int i : iArr) {
                run2.zzZYh().remove(i);
            }
            if (com.aspose.words.internal.zzPV.zzZ(run.zzZYh().zzZy(), com.aspose.words.internal.zzPV.zzHZ)) {
                if (shading != null) {
                    run2.zzZYh().zzY(zzZN8.zzT(shading));
                } else {
                    run2.zzZYh().zzY(zzZQ.zzZ(paragraph, documentZzZpS.zzZqI()));
                }
            }
            firstParagraph.appendChild(run2);
        }
    }

    public static ArrayList<com.aspose.words.internal.zzZL> zzZ(Paragraph paragraph, Shading shading, int[] iArr) throws Exception {
        return new zz1Y().zzY(paragraph, shading, iArr);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzY(zzZ6U zzz6u) throws Exception {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXz, ((zzZ55) zzz6u.zzYgm).zzbF());
    }
}
