package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY40 extends DocumentVisitor {
    private int zzX0J;
    private int zzX0K = com.aspose.words.internal.zzSA.zzr(12.0d);

    private static void zzW(zzYMX zzymx, int i) {
        if (i < 0) {
            zzymx.zzQ(1160, Integer.valueOf((((Integer) zzymx.zzPj(1165)).intValue() != 0 ? zzymx.zzYM7() : 0) + (-i)));
        }
    }

    private boolean zzY(Paragraph paragraph, int i, int i2) {
        int iIntValue;
        zzYMX zzymxZzZYj = paragraph.zzZYj();
        Object obj = zzymxZzZYj.get(i);
        int iIntValue2 = 0;
        if ((zzymxZzZYj.getLineSpacingRule() == 1 && ((i == 1205 && zzymxZzZYj.get(1200) != null) || (i == 1225 && zzymxZzZYj.get(1220) != null))) || obj == null || (iIntValue = ((Integer) obj).intValue()) == 0) {
            return false;
        }
        if (i != 1155 && i != 1165) {
            if (i == 1175) {
                int iIntValue3 = ((Integer) zzZ7R.zzZ(paragraph, 190, 0)).intValue() * 10;
                Iterator<T> it = paragraph.getChildNodes(0, false).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        iIntValue2 = iIntValue3;
                        break;
                    }
                    zzZAM zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ((Node) it.next(), zzZAM.class);
                    if (zzzam != null) {
                        iIntValue2 = ((Integer) zzZ7R.zzZ(zzzam, 190, 0)).intValue() * 10;
                        break;
                    }
                }
            } else if (i == 1205 || i == 1225) {
                iIntValue2 = this.zzX0K;
            }
        } else {
            iIntValue2 = this.zzX0J;
        }
        zzymxZzZYj.zzQ(i2, Integer.valueOf((int) com.aspose.words.internal.zzZKQ.zzZa((((double) iIntValue) / 100.0d) * ((double) iIntValue2))));
        return true;
    }

    private static int zzZQ(Document document) {
        return com.aspose.words.internal.zzSA.zzr((document.getStyles().zzZ7(0, false) != null ? (Integer) r2.zzZa(190, true) : (Integer) zzYEF.zzOt(190)).intValue()) / 2;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBodyStart(Body body) {
        this.zzX0K = body.getParentSection().zzYvR().zzYLd() == 0 ? com.aspose.words.internal.zzSA.zzr(12.0d) : body.getParentSection().zzYvR().zzYPY();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitDocumentStart(Document document) {
        this.zzX0J = zzZQ(document);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitHeaderFooterStart(HeaderFooter headerFooter) {
        this.zzX0K = com.aspose.words.internal.zzSA.zzr(12.0d);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) {
        zzY(paragraph, 1205, 1200);
        zzY(paragraph, 1225, 1220);
        zzY(paragraph, EditingLanguage.CORSICAN, EditingLanguage.BRETON);
        boolean zZzY = zzY(paragraph, 1165, 1160);
        if (!zzY(paragraph, 1175, EditingLanguage.CENTRAL_KURDISH_IRAQ) && !zZzY) {
            return 0;
        }
        zzW(paragraph.zzZYj(), ((Integer) paragraph.fetchParaAttr(EditingLanguage.CENTRAL_KURDISH_IRAQ)).intValue());
        return 0;
    }
}
