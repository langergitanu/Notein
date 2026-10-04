package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWP extends zzYUM {
    private int zzYNb;
    private int zzYNc = 0;
    private zzZXR zzYPg;

    public zzZWP(zzZXR zzzxr) {
        this.zzYPg = zzzxr;
    }

    private void zzO(char c, int i) {
        String strZzt7 = (c != 11 || i == 0) ? null : zzYUQ.zzt7(i);
        if (c == 11 && i == 0) {
            this.zzYPg.zzZlV().zzZ("w:br", (String) null);
        } else {
            this.zzYPg.zzZlV().zzX("w:br", "w:type", zzYUQ.zzX(c, true), "w:clear", strZzt7);
        }
    }

    private void zzX(Inline inline) throws Exception {
        String text = inline.getText();
        boolean zIsDeleteRevision = inline.isDeleteRevision();
        zzZYD zzzydZzZlV = this.zzYPg.zzZlV();
        int i = 0;
        for (int i2 = 0; i2 < text.length(); i2++) {
            char cCharAt = text.charAt(i2);
            if (cCharAt == 2) {
                zzY(text, i, i2, zIsDeleteRevision);
                zzZkg();
            } else if (cCharAt == 3) {
                zzY(text, i, i2, zIsDeleteRevision);
                zzzydZzZlV.zzZ("w:separator", (String) null);
            } else if (cCharAt == 4) {
                zzY(text, i, i2, zIsDeleteRevision);
                zzzydZzZlV.zzZ("w:continuationSeparator", (String) null);
            } else if (cCharAt == 5) {
                zzY(text, i, i2, zIsDeleteRevision);
                zzzydZzZlV.zzZ("w:annotationRef", (String) null);
            } else if (cCharAt == '\t') {
                zzY(text, i, i2, zIsDeleteRevision);
                zzZkf();
            } else if (cCharAt == 30) {
                zzZ(text, i, i2, inline);
                zzzydZzZlV.zzZ("w:noBreakHyphen", (String) null);
            } else if (cCharAt != 31) {
                switch (cCharAt) {
                    case 11:
                    case '\f':
                    case 14:
                        zzY(text, i, i2, zIsDeleteRevision);
                        zzO(text.charAt(i2), inline.zzZYh().zzZUF());
                        break;
                    case '\r':
                        zzY(text, i, i2, zIsDeleteRevision);
                        zzzydZzZlV.zzZ("w:cr", (String) null);
                        break;
                    default:
                        switch (cCharAt) {
                            case 8234:
                            case 8235:
                            case 8237:
                            case 8238:
                                zzY(text, i, i2, zIsDeleteRevision);
                                if (i2 > 0) {
                                    zzT(inline.zzZYh());
                                }
                                zzZ(text.charAt(i2), inline.getParentParagraph());
                                int i3 = i2 + 1;
                                if (i3 < text.length() && !com.aspose.words.internal.zzY6.zzT(text.charAt(i3))) {
                                    zzW(inline);
                                }
                                break;
                            case 8236:
                                zzZ(text, i, i2, inline);
                                zzZ(text, i2, i2 + 1, inline);
                                break;
                        }
                        break;
                }
            } else {
                zzZ(text, i, i2, inline);
                zzzydZzZlV.zzZ("w:softHyphen", (String) null);
            }
            i = i2 + 1;
        }
        zzY(text, i, text.length(), zIsDeleteRevision);
    }

    private boolean zzZke() {
        return this.zzYNb > 0;
    }

    private void zzZkf() {
        this.zzYPg.zzZlV().zzZ("w:tab", (String) null);
    }

    private void zzZkg() {
        this.zzYPg.zzZlV().zzZ(this.zzYNc == 0 ? "w:footnoteRef" : "w:endnoteRef", (String) null);
    }

    public final void zzEC(int i) {
        this.zzYNc = i;
    }

    @Override // com.aspose.words.zzYUM
    public final void zzT(zzYEF zzyef) throws Exception {
        if (zzZke()) {
            zzZYD zzzydZzZlV = this.zzYPg.zzZlV();
            zzzydZzZlV.zzp();
            if (zzyef.zzYrW()) {
                zzzydZzZlV.zzp();
            }
            if (zzyef.zzYrV()) {
                zzzydZzZlV.zzp();
            }
            if (zzyef.zzXS4()) {
                zzzydZzZlV.zzp();
            }
            if (zzyef.zzXS3()) {
                zzzydZzZlV.zzp();
            }
            this.zzYNb--;
        }
    }

    @Override // com.aspose.words.zzYUM
    public final void zzW(Inline inline) throws Exception {
        zzZ(inline.zzZYh(), inline, true);
    }

    @Override // com.aspose.words.zzYUM
    public final void zzY(Inline inline) throws Exception {
        String text = inline.getText();
        if (inline.zzZYh().contains(885)) {
            zzZ(this.zzYPg, inline);
            return;
        }
        if (com.aspose.words.internal.zzZYD.zzXk(text)) {
            if (text.charAt(0) == 1) {
                return;
            }
            if (inline.zzYUT()) {
                for (int i = 0; i < text.length(); i++) {
                    zzW(inline);
                    this.zzYPg.zzZlV().zzX("w:sym", "w:font", zzU1.zzZ(inline.zzZYh().zzYdQ(), this.zzYPg.getDocument().zzZqI()), "w:char", com.aspose.words.internal.zzJB.zzWu(text.charAt(i)));
                    zzT(inline.zzZYh());
                }
                return;
            }
            int i2 = this.zzYNb;
            if (!com.aspose.words.internal.zzY6.zzT(text.charAt(0))) {
                zzW(inline);
            }
            zzX(inline);
            if (this.zzYNb > i2) {
                zzT(inline.zzZYh());
            }
        }
    }

    public final void zzZ(zzYEF zzyef, zzZ9G zzz9g, boolean z) throws Exception {
        this.zzYNb++;
        zzZYD zzzydZzZlV = this.zzYPg.zzZlV();
        if (zzyef.zzYrV()) {
            zzzydZzZlV.zzZ(zzyef.getInsertRevision(), this.zzYPg.zzZpW());
        }
        if (zzyef.zzYrW()) {
            zzzydZzZlV.zzZ(zzyef.getDeleteRevision(), this.zzYPg.zzZpW());
        }
        if (zzyef.zzXS4()) {
            zzzydZzZlV.zzZ(zzyef.getMoveFromRevision(), this.zzYPg.zzZpW());
        }
        if (zzyef.zzXS3()) {
            zzzydZzZlV.zzZ(zzyef.getMoveToRevision(), this.zzYPg.zzZpW());
        }
        zzzydZzZlV.zzY(zzzydZzZlV.zzYyI() ? "m:r" : "w:r");
        if (z) {
            zzzydZzZlV.zz0("w:rsidRPr", zzYU3.zzZl(zzyef.zzPk(30)));
            if (zzyef.zzVE(40)) {
                String strZzZl = zzYU3.zzZl(zzyef.zzPk(40));
                if (!com.aspose.words.internal.zzZKN.equals(strZzZl, zzzydZzZlV.zzZmL())) {
                    zzzydZzZlV.zz0("w:rsidR", strZzZl);
                }
            }
        }
        zzZWR.zzZkh().zzZ(zzyef, zzz9g, false, this.zzYPg);
    }

    private void zzZ(String str, int i, int i2, Inline inline) throws Exception {
        zzY(str, i, i2, inline.isDeleteRevision());
        if (i2 == 0 || i2 >= str.length()) {
            return;
        }
        zzT(inline.zzZYh());
        zzW(inline);
    }

    private void zzY(String str, int i, int i2, boolean z) {
        String str2;
        if (i >= i2) {
            return;
        }
        zzZYD zzzydZzZlV = this.zzYPg.zzZlV();
        if (this.zzYPg.zzZlU()) {
            str2 = z ? "w:delInstrText" : "w:instrText";
        } else if (z && !zzzydZzZlV.zzYyI()) {
            str2 = "w:delText";
        } else {
            str2 = zzzydZzZlV.zzYyI() ? "m:t" : "w:t";
        }
        zzzydZzZlV.zzY(str2);
        if (str.charAt(i) == ' ' || str.charAt(i2 - 1) == ' ') {
            zzzydZzZlV.zzX("xml:space", "preserve");
        }
        zzzydZzZlV.writeString(C22241OooO0Oo.OooO00o(i2, i, i, i, str));
        zzzydZzZlV.zzp();
    }

    private void zzZ(char c, Paragraph paragraph) {
        String str = com.aspose.words.internal.zzZKN.format("w:{0}", com.aspose.words.internal.zzY6.zzV(c));
        this.zzYPg.zzZlV().zzW(str, "w:val", com.aspose.words.internal.zzY6.zzU(c));
        this.zzYPg.zzw(paragraph).push(str);
    }
}
