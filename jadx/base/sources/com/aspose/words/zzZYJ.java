package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYJ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("id", "altChunk", "altChunkPr", "matchSrc");

    public static void zzY(zzYVB zzyvb) throws Exception {
        while (true) {
            zzyvb.zzZmh();
            zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
            String value = "";
            while (zzyu4ZzZsD.zzi()) {
                if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 0) {
                    zzyu4ZzZsD.zzZ(16777216, 9, zzyu4ZzZsD.getLocalName());
                } else {
                    value = zzyu4ZzZsD.getValue();
                }
            }
            int iZzY = 0;
            while (zzyu4ZzZsD.zzQ("altChunk")) {
                int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
                if (iZzTP != 1) {
                    if (iZzTP != 2) {
                        zzyu4ZzZsD.zzk();
                    } else {
                        iZzY = zzY(zzyu4ZzZsD, iZzY);
                    }
                }
            }
            zzZ((zzZXT) zzyvb, value, iZzY);
            return;
        }
    }

    private static void zzZ(zzZXT zzzxt, String str, int i) throws Exception {
        boolean z;
        int i2;
        com.aspose.words.internal.zz77 zz77VarZzYe = zzzxt.zzYe(zzzxt.zzY9(str));
        if (zz77VarZzYe == null) {
            return;
        }
        byte[] bArrZzWy = zz77VarZzYe.zzxk().zzWy();
        FileFormatInfo fileFormatInfoZzY = new zzZOD().zzY(new com.aspose.words.internal.zzZOR(bArrZzWy), null);
        if (fileFormatInfoZzY.getLoadFormat() == 255) {
            return;
        }
        LoadOptions loadOptionsZz1s = zzzxt.zzYyZ().zz1s();
        loadOptionsZz1s.setProgressCallback(null);
        Document documentZzZ = zzZ(bArrZzWy, fileFormatInfoZzY.getLoadFormat(), zzzxt, loadOptionsZz1s, i);
        Node lastChild = zzzxt.zzYz7().getLastChild();
        zzZ(documentZzZ, zzzxt);
        boolean z2 = zzzxt.zzYz7().getNodeType() == 8;
        if (zzzxt.zzYz7().getNodeType() == 28) {
            z = ((StructuredDocumentTag) zzzxt.zzYz7()).getParentNode().getNodeType() == 8;
            i2 = 28;
        } else {
            z = z2;
            i2 = 8;
        }
        CompositeNode compositeNodeZzYz7 = zzzxt.zzYz7();
        if (z) {
            zzzxt.zztj(i2);
        }
        CompositeNode paragraph = i2 != 28 ? new Paragraph(zzzxt.getDocument()) : new StructuredDocumentTag(zzzxt.getDocument(), 1);
        zzzxt.zzT(paragraph);
        if (paragraph.getNodeType() == 8) {
            zzzxt.zzXA(paragraph);
            zzzxt.zzZsD().zzXy((Paragraph) paragraph);
        }
        if (z) {
            zzzxt.zztj(i2);
            zzzxt.zzT((CompositeNode) compositeNodeZzYz7.deepClone(false));
        }
        if (!z) {
            zzzxt.zztj(i2);
        }
        zzzxt.zzZ(new zzZYK(paragraph, lastChild, documentZzZ, i, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    private static int zzY(zzYU4 zzyu4, int i) {
        while (zzyu4.zzQ("altChunkPr")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 3) {
                zzyu4.zzZ(16777216, 9, zzyu4.getLocalName());
            } else {
                i = zzyu4.zzYyD();
            }
        }
        return i ? 1 : 0;
    }

    private static void zzY(DocumentBase documentBase, DocumentBase documentBase2) {
        documentBase2.zzZq2().zzX(documentBase.zzZq2());
    }

    private static Document zzZ(byte[] bArr, int i, zzZXT zzzxt, LoadOptions loadOptions, int i2) throws Exception {
        Document documentZzZrE;
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(bArr);
        DocumentBase document = zzzxt.getDocument();
        if (i != 50 && i != 51) {
            return new Document(zzzor, new LoadOptions(loadOptions), false);
        }
        Document document2 = new Document(0);
        ArrayList<zzZYK> arrayListZzZmc = zzzxt.zzZmc();
        if (arrayListZzZmc.size() > 0) {
            ArrayList<zzZ4J> arrayListZzYOX = null;
            for (int size = arrayListZzZmc.size() - 1; size >= 0; size--) {
                arrayListZzYOX = arrayListZzZmc.get(size).zzZn2().getLists().zzYOX();
                if (arrayListZzYOX.size() > 0) {
                    break;
                }
            }
            Collections.sort(arrayListZzYOX);
            document2.getLists().zzxk(arrayListZzYOX.size() > 0 ? ((zzZ4J) C21505OooO0Oo.OooO00o(1, arrayListZzYOX)).zzYP8() : 0);
        }
        zzY(document, document2);
        Iterator<zzZYK> it = arrayListZzZmc.iterator();
        while (it.hasNext()) {
            zzY(it.next().zzZn2(), document2);
        }
        if (i2 == 0) {
            document.getStyles().zzY36().zzZ(document2.getStyles().zzY36());
            document.getStyles().zzY37().zzZ(document2.getStyles().zzY37());
        }
        HtmlLoadOptions htmlLoadOptions = new HtmlLoadOptions(loadOptions);
        htmlLoadOptions.zzZ0B();
        if (document.getNodeType() == 1) {
            documentZzZrE = (Document) document;
        } else {
            documentZzZrE = ((GlossaryDocument) document).zzZrE();
        }
        if (documentZzZrE.getCompatibilityOptions().getMswVersion() != 0) {
            document2.getCompatibilityOptions().setMswVersion(documentZzZrE.getCompatibilityOptions().getMswVersion());
        } else {
            document2.getCompatibilityOptions().optimizeFor(loadOptions.getMswVersion());
        }
        document2.zzZ(zzzor, htmlLoadOptions);
        return document2;
    }

    private static void zzZ(Document document, zzYVB zzyvb) {
        if (zzyvb.zzZsD().zzYyz().length() == 0) {
            return;
        }
        Node nodeZzZYr = document.getFirstSection().getBody().zzZYr();
        Paragraph paragraph = nodeZzZYr.getNodeType() == 8 ? (Paragraph) nodeZzZYr : null;
        if (paragraph != null) {
            paragraph.prependChild(new Run(document, zzyvb.zzZsD().zzYyz().toString(), new zzYEF()));
            zzyvb.zzZsD().zzYyz().setLength(0);
        } else {
            ((zzZXT) zzyvb).zzJ(zzyvb.getDocument());
        }
    }
}
