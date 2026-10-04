package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZ6J extends zzZ6L {
    private OfficeMath zzYfg;
    private zzZ13 zzYfh;

    public zzZ6J(OfficeMath officeMath) {
        this.zzYfg = officeMath;
    }

    public final int getAlignment() {
        zzZ02 zzz02 = (zzZ02) com.aspose.words.internal.zzZKW.zzZ(this.zzYfg.zzZsL(), zzZ02.class);
        Paragraph paragraph = (Paragraph) this.zzYfg.getAncestor(8);
        boolean z = paragraph != null && paragraph.getParentNode().getNodeType() == 28 && (paragraph.zzYB3() || paragraph.zz9I());
        if (zzz02 == null || z) {
            if (z) {
                return paragraph.getParagraphFormat().getAlignment();
            }
            return 1;
        }
        int justification = zzz02.getJustification();
        if (justification == 1) {
            return 10;
        }
        if (justification != 2) {
            return justification != 4 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.aspose.words.zzZ6L
    public final String getHRef() {
        return "";
    }

    @Override // com.aspose.words.zzZ6L
    public final double getHeight() throws Exception {
        zzYS4();
        return com.aspose.words.internal.zzZPW.zzYz(this.zzYV);
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean getHidden() {
        return false;
    }

    @Override // com.aspose.words.zzZ6L
    public final Node getNode() {
        return this.zzYfg;
    }

    @Override // com.aspose.words.zzZ6L
    public final String getScreenTip() {
        return null;
    }

    @Override // com.aspose.words.zzZ6L
    public final long getSize() throws Exception {
        return com.aspose.words.internal.zzZPW.zzG(zzYS1().zzZj().getWidth(), zzYS1().zzZj().getHeight());
    }

    @Override // com.aspose.words.zzZ6L
    public final double getWidth() throws Exception {
        zzYS4();
        return Float.intBitsToFloat((int) this.zzYV);
    }

    @Override // com.aspose.words.zzZ6L
    public final int getWrapType() {
        return 0;
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean hasChart() {
        return false;
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean hasChildNodes() {
        return false;
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean hasImage() {
        return false;
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean hasSmartArt() {
        return false;
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean isImage() {
        return false;
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean isInline() {
        return true;
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean isWordArt() {
        return false;
    }

    @Override // com.aspose.words.zzZ6L
    public final void zzV(zzY9X zzy9x) {
        this.zzYfj = zzy9x;
    }

    public final zzZ13 zzYS1() throws Exception {
        if (this.zzYfh == null) {
            this.zzYfh = zzV(this.zzYfg);
        }
        return this.zzYfh;
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean zzYS7() {
        return false;
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean zzYS8() {
        return true;
    }

    @Override // com.aspose.words.zzZ6L
    public final String zzZe() {
        return "";
    }

    private static zzZ13 zzV(OfficeMath officeMath) throws Exception {
        return new zzYON().zzo(officeMath);
    }
}
