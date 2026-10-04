package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYU {
    private static ImportFormatOptions zzYRc = zzZov();
    private NodeImporter zzYRK;
    private zzZZN zzYRb = new zzZZN();

    private zzZYU(DocumentBase documentBase, DocumentBase documentBase2) {
        this.zzYRK = new NodeImporter(documentBase2, documentBase, 1, zzYRc);
    }

    private void execute() throws Exception {
        zzH(zzZow());
        Section lastSection = zzZow().getLastSection();
        ArrayList<Integer> arrayListZzZ = null;
        for (Section section : zz9Z().getSections()) {
            Section section2 = (Section) this.zzYRK.zzZ((Node) section, true, (zzZA5) this.zzYRb);
            if (section.zzYVf()) {
                arrayListZzZ = zzZ(section2.getHeadersFooters());
                section2.getPageSetup().setSectionStart(2);
                section2.getPageSetup().setRestartPageNumbering(true);
            } else {
                if (section2.getHeadersFooters().hasHeaders()) {
                    zzZS(arrayListZzZ);
                } else if (zzZU(arrayListZzZ)) {
                    section2.getPageSetup().setHeaderDistance(0.0d);
                }
                if (section2.getHeadersFooters().zzZ4Z()) {
                    zzZR(arrayListZzZ);
                } else if (zzZT(arrayListZzZ)) {
                    section2.getPageSetup().setFooterDistance(0.0d);
                }
            }
            zzZow().appendChild(section2);
        }
        zzZMS zzzmsZzB1 = zzZow().zzZpU().zzB1(0);
        zzZMS zzzmsZzB12 = zz9Z().zzZpU().zzB1(0);
        boolean z = this.zzYRb.zzZrS() && !zzZ(zzzmsZzB1, zzzmsZzB12);
        boolean z2 = this.zzYRb.zzZrR() && zzZow().zzZpV().zzYVO != zz9Z().zzZpV().zzYVO;
        if (z || z2) {
            zzZZM zzzzm = new zzZZM(lastSection);
            zzZow().accept(zzzzm);
            if (z && !zzzzm.zzZrS()) {
                zzZMS zzzms = (zzZMS) this.zzYRK.importNode(zzzmsZzB12, true);
                zzzms.zzY(zzZow());
                zzZow().zzZpU().zzZ(0, zzzms);
            }
            if (z2 && !zzzzm.zzZrR()) {
                zzZow().zzZpV().zzYVO = zz9Z().zzZpV().zzYVO;
            }
        }
        zzZox();
        this.zzYRK.zzYAk();
    }

    private Document zz9Z() {
        return (Document) this.zzYRK.zzYAh().zzYVJ();
    }

    private static boolean zzFK(int i) {
        return i == 0 || i == 4 || i == 1;
    }

    private static void zzH(Document document) {
        Paragraph lastParagraph = document.getLastSection().getBody().getLastParagraph();
        Shape shape = (Shape) lastParagraph.getChild(18, 0, true);
        if (shape != null && shape.zzY9P() && shape.getRelativeVerticalPosition() == 2) {
            lastParagraph.getParentNode().appendChild(new Paragraph(document));
        }
    }

    private static ArrayList<Integer> zzI(Document document) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Iterator<T> it = document.getSections().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((Section) it.next()).getHeadersFooters().iterator();
            while (it2.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, Integer.valueOf(((HeaderFooter) it2.next()).getHeaderFooterType()));
            }
        }
        return arrayList;
    }

    private void zzX(StructuredDocumentTag structuredDocumentTag) throws Exception {
        if ("Title".equals(structuredDocumentTag.getXmlMapping().getPropertyName())) {
            String title = zzZow().getBuiltInDocumentProperties().getTitle();
            zzZow().getBuiltInDocumentProperties().setTitle(zz9Z().getBuiltInDocumentProperties().getTitle());
            structuredDocumentTag.getXmlMapping().zzXQI();
            structuredDocumentTag.getXmlMapping().delete();
            zzZow().getBuiltInDocumentProperties().setTitle(title);
        }
    }

    public static void zzZ(Document document, Document... documentArr) throws Exception {
        for (int i = 0; i <= 0; i++) {
            new zzZYU(document, documentArr[0]).execute();
        }
    }

    private static void zzZR(ArrayList<Integer> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!zzFK(arrayList.get(size).intValue())) {
                arrayList.remove(size);
            }
        }
    }

    private static void zzZS(ArrayList<Integer> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (zzFK(arrayList.get(size).intValue())) {
                arrayList.remove(size);
            }
        }
    }

    private static boolean zzZT(ArrayList<Integer> arrayList) {
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue == 2 || iIntValue == 5 || iIntValue == 3) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzZU(ArrayList<Integer> arrayList) {
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue == 0 || iIntValue == 4 || iIntValue == 1) {
                return true;
            }
        }
        return false;
    }

    private static ImportFormatOptions zzZov() {
        ImportFormatOptions importFormatOptions = new ImportFormatOptions();
        importFormatOptions.zzYVq();
        importFormatOptions.setIgnoreHeaderFooter(false);
        importFormatOptions.setIgnoreTextBoxes(false);
        importFormatOptions.setKeepSourceNumbering(true);
        return importFormatOptions;
    }

    private Document zzZow() {
        return (Document) this.zzYRK.zzYAh().zzYVI();
    }

    private void zzZox() throws Exception {
        Iterator<StructuredDocumentTag> it = this.zzYRb.zzZrT().iterator();
        while (it.hasNext()) {
            zzX(it.next());
        }
    }

    private static boolean zzZ(zzZMS zzzms, zzZMS zzzms2) {
        if (zzzms != null) {
            return zzzms.zzY(zzzms2);
        }
        return zzzms2 == null;
    }

    private ArrayList<Integer> zzZ(HeaderFooterCollection headerFooterCollection) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayListZzI = zzI(zzZow());
        if (!headerFooterCollection.hasHeaders() && zzZU(arrayListZzI)) {
            headerFooterCollection.getParentSection().getPageSetup().setHeaderDistance(0.0d);
        }
        if (!headerFooterCollection.zzZ4Z() && zzZT(arrayListZzI)) {
            headerFooterCollection.getParentSection().getPageSetup().setFooterDistance(0.0d);
        }
        for (Integer num : arrayListZzI) {
            int iIntValue = num.intValue();
            HeaderFooter byHeaderFooterType = headerFooterCollection.getByHeaderFooterType(iIntValue);
            boolean z = true;
            if (byHeaderFooterType != null && byHeaderFooterType.getChild(8, 0, true) != null) {
                z = false;
            }
            headerFooterCollection.linkToPrevious(iIntValue, false);
            if (z) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, num);
                HeaderFooter byHeaderFooterType2 = headerFooterCollection.getByHeaderFooterType(iIntValue);
                byHeaderFooterType2.getFirstParagraph();
                byHeaderFooterType2.getFirstParagraph().zzYp5().set(190, 0);
                byHeaderFooterType2.getFirstParagraph().zzYp5().set(130, zzZU.zzZF6);
            }
        }
        return arrayList;
    }
}
