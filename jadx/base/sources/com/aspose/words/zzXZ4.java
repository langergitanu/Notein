package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZ4 implements zzZBS {
    private com.aspose.words.internal.zzZL1 zzZZ;
    private DocumentBuilder zzZwh;

    public zzXZ4(com.aspose.words.internal.zzZOP zzzop, Document document) {
        this.zzZZ = com.aspose.words.internal.zzZSN.zzZS(zzzop);
        this.zzZwh = new DocumentBuilder(document);
        document.getStyles().getByStyleIdentifier(0).zzZYh().remove(190);
        document.getStyles().getByStyleIdentifier(0).zzZYh().remove(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4);
    }

    private void zzXQN() {
        if (this.zzZwh.getDocument().getWarningCallback() != null && "FictionBook".equals(this.zzZZ.getName()) && "http://www.gribuser.ru/xml/fictionbook/2.0".equals(this.zzZZ.getNamespaceURI())) {
            this.zzZwh.getDocument().getWarningCallback().warning(new WarningInfo(256, 26, "The original file load format is FB2, which is not supported by Aspose.Words. The file is loaded as an XML document."));
        }
    }

    private void zzXQO() {
        int depth = this.zzZZ.getDepth() - 1;
        if (depth > 0) {
            this.zzZwh.getCurrentParagraph().zzZYj().zzwa(depth <= 10 ? depth * StyleIdentifier.LIST_TABLE_4_ACCENT_5 : 4320);
        } else if (this.zzZwh.getCurrentParagraph().zzZYj().zzYM7() > 0) {
            this.zzZwh.getCurrentParagraph().zzZYj().remove(1160);
        }
    }

    private static String zzZW(String str, boolean z) {
        String strReplace = str.replace(IOUtils.LINE_SEPARATOR_WINDOWS, " ").replace("\r", " ").replace(IOUtils.LINE_SEPARATOR_UNIX, " ");
        return !z ? com.aspose.words.internal.zzZKN.zzTX(strReplace.replace("\t", " ")) : strReplace;
    }

    @Override // com.aspose.words.zzZBS
    public final boolean isEncrypted() {
        return false;
    }

    @Override // com.aspose.words.zzZBS
    public final com.aspose.words.internal.zzZOP zz1x() {
        return null;
    }

    @Override // com.aspose.words.zzZBS
    public final void zzIh() {
        int nodeType = this.zzZZ.getNodeType();
        boolean z = true;
        while (this.zzZZ.read()) {
            int nodeType2 = this.zzZZ.getNodeType();
            if (nodeType2 == 1) {
                if (z) {
                    zzXQN();
                    z = false;
                } else {
                    this.zzZwh.insertParagraph();
                }
                zzXQO();
            } else if (nodeType2 == 2) {
                if (nodeType == 2) {
                    this.zzZwh.insertParagraph();
                }
                zzXQO();
            } else if (nodeType2 == 4 || nodeType2 == 24) {
                zzXQO();
                this.zzZwh.write(zzZW(this.zzZZ.getValue(), this.zzZZ.zzfh()));
            }
            if (this.zzZZ.getNodeType() == 1 || this.zzZZ.getNodeType() == 2 || this.zzZZ.getNodeType() == 4) {
                nodeType = this.zzZZ.getNodeType();
            }
        }
    }
}
