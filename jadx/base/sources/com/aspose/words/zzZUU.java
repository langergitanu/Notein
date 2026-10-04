package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZUU extends DocumentVisitor implements zzZ9F {
    private com.aspose.words.internal.zzZYG<com.aspose.words.internal.zzJO> zzYLA = new com.aspose.words.internal.zzZYG<>();
    private IWarningCallback zzYLu;
    private int zzYLv;
    private boolean zzYLw;
    private boolean zzYLx;
    private boolean zzYLy;
    private zzZYZ zzYLz;
    private zzYE2 zzYQL;

    private zzZUU(boolean z, boolean z2, boolean z3) {
        this.zzYLy = !z;
        this.zzYLx = z2;
        this.zzYLw = z3;
    }

    private com.aspose.words.internal.zzJO zzV(com.aspose.words.internal.zzZXH zzzxh, String str) {
        String str2 = com.aspose.words.internal.zzZKN.format("{0}+{1}", Integer.valueOf(zzzxh.getStyle()), str);
        com.aspose.words.internal.zzJO zzjoZzZ = this.zzYLA.get(str2);
        if (zzjoZzZ == null) {
            boolean z = zzzxh.zzpB().getSize() <= 4194304 && this.zzYLy;
            if (!z && this.zzYLy) {
                zzY0(com.aspose.words.internal.zzZKN.format("Font subset embedded for font '{0}' due to exceeding the maximum allowed size of {1:N0} bytes.", str, 4194304));
            }
            zzjoZzZ = zzZ(zzzxh, str, z | zzZjt());
            this.zzYLA.zzW(str2, zzjoZzZ);
        }
        if (zzZjt() && !zzjoZzZ.zzHo()) {
            this.zzYLA.set(str2, zzZ(zzzxh, str, true));
        }
        return zzjoZzZ;
    }

    private void zzY0(String str) {
        zzZ(this.zzYLu, str);
    }

    private boolean zzZjt() {
        return this.zzYLv > 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitDocumentStart(Document document) {
        this.zzYQL = new zzYE2(this, document.getCompatibilityOptions(), 1);
        this.zzYLz = document.zzZqy();
        this.zzYLu = document.getWarningCallback();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) {
        if (fieldEnd.getFieldType() != 68 && fieldEnd.getFieldType() != 36) {
            return 0;
        }
        this.zzYLv--;
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) {
        if (fieldStart.getFieldType() != 68 && fieldStart.getFieldType() != 36) {
            return 0;
        }
        this.zzYLv++;
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) throws Exception {
        if (!paragraph.zzZ0R()) {
            return 0;
        }
        this.zzYQL.zzZ(paragraph.getListLabel().zzYOu(), paragraph.getListLabel().getFont());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) throws Exception {
        if (run.getText().length() == 0) {
            return 0;
        }
        this.zzYQL.zzZ(run.getText(), run.getFont());
        return 0;
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzT(Font font) {
        zzY(font, "\u00ad", 0);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzU(Font font) {
        zzY(font, "\u00ad", 3);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzW(Font font) {
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzX(Font font) {
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzY(Font font) {
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZ(Font font, boolean z) {
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZnZ() {
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZo0() {
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZo1() {
    }

    public static FontInfoCollection zzX(DocumentBase documentBase, boolean z) throws Exception {
        zzZZF zzzzfZzZpV = documentBase.zzZpV();
        FontInfoCollection fontInfos = documentBase.getFontInfos();
        if (zzzzfZzZpV.zzYWy) {
            if (zzzzfZzZpV.zzYWw) {
                fontInfos = documentBase.getFontInfos().zzZ70();
            }
            fontInfos.zzY(zzY(documentBase, zzzzfZzZpV.zzYWw, zzzzfZzZpV.zzYWx, z));
            return fontInfos;
        }
        fontInfos.zzZ76();
        if (!zzzzfZzZpV.zzYWx && !zzzzfZzZpV.zzYWw) {
            return fontInfos;
        }
        zzZ(documentBase.getWarningCallback(), "Fonts are not embedded, despite either 'EmbedSystemFonts' or 'SaveSubsetFonts' is set to 'true' due to 'EmbedTrueTypeFonts' option is set to 'false'.");
        return fontInfos;
    }

    private static FontInfoCollection zzY(DocumentBase documentBase, boolean z, boolean z2, boolean z3) throws Exception {
        zzZUU zzzuu = new zzZUU(z, z2, z3);
        documentBase.accept(zzzuu);
        FontInfoCollection fontInfoCollection = new FontInfoCollection();
        Iterator<com.aspose.words.internal.zzJO> it = zzzuu.zzYLA.zzCJ().iterator();
        while (it.hasNext()) {
            fontInfoCollection.zzW(zzZ(documentBase, it.next(), z));
        }
        return fontInfoCollection;
    }

    private static void zzZ(IWarningCallback iWarningCallback, String str) {
        if (iWarningCallback == null) {
            return;
        }
        OooO00o.OooO0O0(iWarningCallback, 262144, 0, str);
    }

    public static FontInfoCollection zzZ(DocumentBase documentBase, boolean z, boolean z2, boolean z3) throws Exception {
        FontInfoCollection fontInfoCollectionZzY = zzY(documentBase, z, z2, z3);
        FontInfoCollection fontInfoCollectionZzZ70 = documentBase.getFontInfos().zzZ70();
        fontInfoCollectionZzZ70.zzY(fontInfoCollectionZzY);
        if (!z) {
            zzZ(fontInfoCollectionZzZ70, documentBase, z2, z3);
        }
        return fontInfoCollectionZzZ70;
    }

    private void zzY(Font font, String str, int i) {
        String fontName = font.getFontName(i);
        com.aspose.words.internal.zzZXH zzzxhZzZ = zzZ(fontName, font.zzBi(i), this.zzYLz, this.zzYLw);
        if (zzzxhZzZ == null) {
            return;
        }
        if (this.zzYLx || !com.aspose.words.internal.zzJF.zzZD(zzzxhZzZ.zzPh())) {
            com.aspose.words.internal.zzJO zzjoZzV = zzV(zzzxhZzZ, fontName);
            if (zzjoZzV.zzHo()) {
                return;
            }
            zzjoZzV.zzZL(str);
        }
    }

    private static FontInfo zzZ(DocumentBase documentBase, com.aspose.words.internal.zzJO zzjo, boolean z) throws Exception {
        FontInfo fontInfo;
        zzZUW zzzuwZzBf;
        FontInfo fontInfo2 = documentBase.getFontInfos().get(zzjo.getName());
        if (fontInfo2 != null) {
            fontInfo = fontInfo2.zzZ7b();
            fontInfo.zzZ76();
            if ((!z || zzjo.zzHo()) && (zzzuwZzBf = fontInfo2.zzBf(zzjo.getStyle())) != null && !zzzuwZzBf.zzZjy()) {
                fontInfo.zzY(zzzuwZzBf);
                return fontInfo;
            }
        } else {
            fontInfo = new FontInfo(zzjo.getName());
        }
        fontInfo.zzV(zzjo);
        return fontInfo;
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzV(Font font) {
        zzY(font, "‑", 3);
    }

    private static void zzZ(FontInfoCollection fontInfoCollection, DocumentBase documentBase, boolean z, boolean z2) throws Exception {
        for (FontInfo fontInfo : fontInfoCollection) {
            if (!fontInfo.zzBb(0) && (z || !com.aspose.words.internal.zzJF.zzZD(fontInfo.getName()))) {
                FontInfo fontInfo2 = documentBase.getFontInfos().get(fontInfo.getName());
                if (fontInfo2 != null && fontInfo2.zzBb(0)) {
                    fontInfo.zzY(fontInfo2);
                } else {
                    com.aspose.words.internal.zzZXH zzzxhZzZ = zzZ(fontInfo.getName(), 0, documentBase.zzZqy(), z2);
                    if (zzzxhZzZ != null && (z || !com.aspose.words.internal.zzJF.zzZD(zzzxhZzZ.zzPh()))) {
                        if (zzzxhZzZ.zzpB().getSize() > 4194304) {
                            zzZ(documentBase.getWarningCallback(), com.aspose.words.internal.zzZKN.format("Font '{0}' is not embedded due to exceeding the maximum allowed size of {1:N0} bytes.", zzzxhZzZ.zzPh(), 4194304));
                        } else {
                            fontInfo.zzI(zzzxhZzZ);
                        }
                    }
                }
            }
        }
    }

    private static com.aspose.words.internal.zzZXH zzZ(String str, int i, com.aspose.words.internal.zzGQ zzgq, boolean z) {
        com.aspose.words.internal.zzZXH zzzxhZzO = zzgq.zzO(str, i);
        if (zzzxhZzO == null) {
            return null;
        }
        if (!zzzxhZzO.zzHG() || z) {
            return zzzxhZzO;
        }
        return null;
    }

    private static com.aspose.words.internal.zzJO zzZ(com.aspose.words.internal.zzZXH zzzxh, String str, boolean z) {
        com.aspose.words.internal.zzJO zzjoZzZk = zzzxh.zzZk(z);
        zzjoZzZk.zzWN(zzzxh.getStyle());
        zzjoZzZk.setName(str);
        return zzjoZzZk;
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZ(Font font, String str, int i) {
        zzY(font, str, i);
    }
}
