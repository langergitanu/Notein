package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPB implements com.aspose.words.internal.zzHI {
    private static zzZPB zzYBK = new zzZPB();

    public static class zzW implements zzY {
        private Run zzYBI;
        private Run zzYBJ;

        private zzW() {
        }

        public final zzYWB zz9m() {
            if (this.zzYBJ == null || this.zzYBI == null) {
                return null;
            }
            return new zzYWB(this.zzYBJ, this.zzYBI);
        }

        @Override // com.aspose.words.zzZPB.zzY
        public final void zzT(Run run) {
            if (this.zzYBJ == null) {
                this.zzYBJ = run;
            }
            Run run2 = this.zzYBI;
            if (run2 == null) {
                this.zzYBI = run;
                return;
            }
            CompositeNode parentNode = run2.getParentNode();
            if (parentNode == null) {
                parentNode = new Paragraph(this.zzYBI.getDocument());
                parentNode.insertAfter(this.zzYBI, null);
            }
            parentNode.insertAfter(run, this.zzYBI);
            this.zzYBI = run;
        }

        public /* synthetic */ zzW(byte b) {
            this();
        }
    }

    public interface zzY {
        void zzT(Run run) throws Exception;
    }

    public static class zzZ implements zzZAZ, zzY {
        private DocumentBuilder zzZwh;

        public zzZ(DocumentBuilder documentBuilder) {
            this.zzZwh = documentBuilder;
        }

        @Override // com.aspose.words.zzZPB.zzY
        public final void zzT(Run run) {
            this.zzZwh.insertNode(run);
        }

        @Override // com.aspose.words.zzZAZ
        public final zzYEF zzZYh() {
            return this.zzZwh.zzZpG();
        }
    }

    private zzZPB() {
    }

    private static zzZ zzV(DocumentBuilder documentBuilder) {
        return new zzZ(documentBuilder);
    }

    private static void zzX(DocumentBuilder documentBuilder, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != 8194) {
                sb.append(cCharAt);
            } else {
                if (sb.length() > 0) {
                    documentBuilder.write(sb.toString());
                    sb = new StringBuilder();
                }
                documentBuilder.write(Character.toString(cCharAt));
            }
        }
        if (sb.length() > 0) {
            documentBuilder.write(sb.toString());
        }
    }

    public static void zzY(DocumentBuilder documentBuilder, String str) throws Exception {
        zzZ((Field) null, documentBuilder, str, false);
    }

    public static void zzZ(Field field, DocumentBuilder documentBuilder, String str) throws Exception {
        zzZ(field, documentBuilder, str, false);
    }

    private static zzW zzZbY() {
        return new zzW((byte) 0);
    }

    private static zzX zzZbZ() {
        return new zzX((byte) 0);
    }

    public static class zzX implements zzY {
        private ArrayList<Run> zzXK;

        private zzX() {
            this.zzXK = new ArrayList<>();
        }

        @Override // com.aspose.words.zzZPB.zzY
        public final void zzT(Run run) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXK, run);
        }

        public final ArrayList<Run> zzZbX() {
            return this.zzXK;
        }

        public /* synthetic */ zzX(byte b) {
            this();
        }
    }

    private static void zzY(Field field, DocumentBuilder documentBuilder, String str, boolean z) throws Exception {
        ArrayList<com.aspose.words.internal.zzY4> arrayListZzZ = com.aspose.words.internal.zzY4.zzZ(str, field != null ? field.zzZgE() : com.aspose.words.internal.zzSG.zzk(z), zzYBK);
        zzZ zzzZzV = zzV(documentBuilder);
        for (com.aspose.words.internal.zzY4 zzy4 : arrayListZzZ) {
            zzZ(zzy4, documentBuilder.getDocument(), zzzZzV, zzzZzV);
            if (com.aspose.words.internal.zzZYD.zzXk(zzy4.zzXv())) {
                documentBuilder.insertParagraph();
            }
        }
    }

    public static void zzZ(Field field, DocumentBuilder documentBuilder, zzZQ8 zzzq8) throws Exception {
        if (!zzzq8.zzZdW() || documentBuilder.getDocument().getFieldOptions().isBidiTextSupportedOnUpdate()) {
            zzZ(field, documentBuilder, zzzq8.zzZdX().zzEL(), false);
        } else {
            zzZ(documentBuilder, zzzq8.zzZdX());
        }
    }

    private static void zzZ(Field field, DocumentBuilder documentBuilder, String str, boolean z) throws Exception {
        if (!documentBuilder.getDocument().getFieldOptions().isBidiTextSupportedOnUpdate()) {
            zzX(documentBuilder, str);
        } else {
            zzY(field, documentBuilder, str, false);
        }
    }

    public static ArrayList<Run> zzZ(String str, Document document, zzZAZ zzzaz, boolean z) throws Exception {
        zzX zzxZzZbZ = zzZbZ();
        zzZ(str, document, zzxZzZbZ, zzzaz, z);
        return zzxZzZbZ.zzZbX();
    }

    public static zzYWB zzY(String str, Document document, zzZAZ zzzaz, boolean z) throws Exception {
        zzW zzwZzZbY = zzZbY();
        zzZ(str, document, zzwZzZbY, zzzaz, z);
        return zzwZzZbY.zz9m();
    }

    private static void zzX(DocumentBuilder documentBuilder, zzYIU zzyiu) {
        for (zzYIR zzyir : zzyiu.zzYkm()) {
            zzZ(documentBuilder, zzyir.getValue(), zzyir.zzZYh());
        }
    }

    private static void zzZ(DocumentBuilder documentBuilder, zzYIU zzyiu) {
        zzYIS zzyis = new zzYIS();
        Iterator<com.aspose.words.internal.zzHG> it = zzyiu.iterator();
        while (it.hasNext()) {
            zzYIV zzyiv = (zzYIV) it.next();
            if (zzyiv.zzFM() != 8194) {
                zzyis.zzZ(zzyiv);
            } else {
                if (zzyis.getLength() > 0) {
                    zzY(documentBuilder, zzyis.zzYkq());
                    zzyis = new zzYIS();
                }
                zzY(documentBuilder, zzyiv.zzYkq());
            }
        }
        if (zzyis.getLength() > 0) {
            zzY(documentBuilder, zzyis.zzYkq());
        }
    }

    private static void zzY(DocumentBuilder documentBuilder, zzYIU zzyiu) {
        zzYIU zzyiuZzY9 = zzyiu.zzY9(ControlChar.CR_LF, ControlChar.f50773CR).zzY9(ControlChar.f50774LF, ControlChar.f50773CR);
        int i = 0;
        while (i <= zzyiuZzY9.getLength()) {
            int iIndexOf = zzyiuZzY9.indexOf(Character.toString(ControlChar.PARAGRAPH_BREAK_CHAR), i);
            if (iIndexOf != -1) {
                int i2 = iIndexOf - i;
                if (i2 > 0) {
                    zzX(documentBuilder, zzyiuZzY9.zzW5(i, i2));
                }
                int iZzZpz = documentBuilder.zzZpz();
                if (iZzZpz == 0) {
                    Paragraph currentParagraph = documentBuilder.getCurrentParagraph();
                    documentBuilder.insertParagraph().zzC(currentParagraph.zzYp5());
                    currentParagraph.zzC(zzyiuZzY9.zzpn(iIndexOf).zzZYh());
                } else if (iZzZpz == 1) {
                    zzZ(documentBuilder, ControlChar.PARAGRAPH_BREAK, zzyiuZzY9.zzpn(iIndexOf).zzZYh());
                } else {
                    throw new IllegalArgumentException();
                }
                i = iIndexOf + 1;
            } else {
                int length = zzyiuZzY9.getLength() - i;
                if (length > 0) {
                    zzX(documentBuilder, zzyiuZzY9.zzW5(i, length));
                    return;
                }
                return;
            }
        }
    }

    private static void zzZ(String str, Document document, zzY zzy, zzZAZ zzzaz, boolean z) throws Exception {
        if (!com.aspose.words.internal.zzY4.zzJ(str)) {
            if (document.getFieldOptions().isBidiTextSupportedOnUpdate()) {
                zzZ(new com.aspose.words.internal.zzY4(str, z ? 1 : 0, zzYBK), document, zzy, zzzaz);
                return;
            } else {
                zzy.zzT(new Run(document, str, zzzaz.zzZYh()));
                return;
            }
        }
        throw new IllegalArgumentException("A single-line text was expected.\r\nParameter name: text");
    }

    private static void zzZ(com.aspose.words.internal.zzY4 zzy4, Document document, zzY zzy, zzZAZ zzzaz) throws Exception {
        for (com.aspose.words.internal.zzY3 zzy3 : zzy4.zzXu()) {
            if (com.aspose.words.internal.zzZYD.zzXk(zzy3.getText())) {
                zzYEF zzyefZzZYh = zzzaz.zzZYh();
                if (zzy3.zzXn()) {
                    zzyefZzZYh.zzW(zzZU.zzZF6);
                } else {
                    zzyefZzZYh.remove(StyleIdentifier.BIBLIOGRAPHY);
                }
                zzy.zzT(new Run(document, zzy3.getText(), zzyefZzZYh));
            }
        }
    }

    @Override // com.aspose.words.internal.zzHI
    public final void zzZ(com.aspose.words.internal.zzY4 zzy4, com.aspose.words.internal.zzY8[] zzy8Arr) {
        int embeddingLevel = zzy4.getEmbeddingLevel() & 255;
        for (com.aspose.words.internal.zzY8 zzy8 : zzy8Arr) {
            int iZzXw = zzy8.zzXw();
            if (iZzXw != 3 && iZzXw != 6) {
                embeddingLevel = zzy8.zzXx();
            } else {
                zzy8.zzr(embeddingLevel);
            }
        }
    }

    private static void zzZ(DocumentBuilder documentBuilder, String str, zzYEF zzyef) {
        zzYEF zzyef2 = (zzYEF) zzyef.zzbn();
        documentBuilder.zzZpG().zzZ(zzyef2, 40, 30);
        documentBuilder.insertNode(new Run(documentBuilder.getDocument(), str, zzyef2));
    }
}
