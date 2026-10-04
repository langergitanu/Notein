package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZIQ implements zzZBU {
    private HtmlSaveOptions zzYt2;

    public zzZIQ() {
        this.zzYt2 = HtmlSaveOptions.zzYZg();
    }

    @Override // com.aspose.words.zzZBU
    public final String zzZ8(Node node) throws Exception {
        node.getDocument();
        if (node.getNodeType() == 31) {
            throw new IllegalStateException("GlossaryDocument isn't supported!");
        }
        if (node.getDocument().getNodeType() == 31) {
            throw new IllegalStateException("Children nodes of GlossaryDocument aren't supported!");
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            node.getDocument();
            Document document = (Document) node.getDocument();
            IWarningCallback warningCallback = document.getWarningCallback();
            zzYDZ zzydz = new zzYDZ(document, zzzor, null, this.zzYt2);
            document.zzZq9().add(4);
            zzZYM zzzym = new zzZYM();
            zzzym.zzX(zzydz);
            OfficeMath officeMath = (OfficeMath) com.aspose.words.internal.zzZKW.zzZ(node, OfficeMath.class);
            if (officeMath != null && zzzym.zzZn7().containsKey(officeMath)) {
                node = zzzym.zzZn7().get(officeMath);
            }
            new zzZJ2(document, zzzor, null, this.zzYt2, zzydz, null, null).zzZb(node);
            zzzym.zzZnb();
            document.setWarningCallback(warningCallback);
            zzzor.zzH(0L);
            HtmlSaveOptions htmlSaveOptions = this.zzYt2;
            com.aspose.words.internal.zzZOO zzzoo = new com.aspose.words.internal.zzZOO(zzzor, htmlSaveOptions != null ? htmlSaveOptions.zzZ9Y() : com.aspose.words.internal.zzZO0.zzhV());
            try {
                String strZziv = zzzoo.zziv();
                zzzoo.close();
                zzzor.close();
                return strZziv;
            } catch (Throwable th) {
                zzzoo.close();
                throw th;
            }
        } catch (Throwable th2) {
            zzzor.close();
            throw th2;
        }
    }

    public zzZIQ(HtmlSaveOptions htmlSaveOptions) {
        this.zzYt2 = htmlSaveOptions;
    }
}
