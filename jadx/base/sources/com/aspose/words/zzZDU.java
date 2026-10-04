package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZDU implements zzZ8W {
    private boolean zzYkj;
    private Map<String, zzYC3> zzYkk;
    private zzZFF zzYpP;
    private zzYU4 zzZ7n;
    private DocumentBuilder zzZwh;

    public zzZDU(DocumentBuilder documentBuilder, Map<String, String> map, Map<String, zzYC3> map2, zzZFF zzzff, String str) {
        this.zzZwh = documentBuilder;
        this.zzYkk = map2;
        this.zzYpP = zzzff;
        this.zzZ7n = new zzYU4(str, map);
    }

    @Override // com.aspose.words.zzZ8W
    public final DocumentBase getDocument() {
        return this.zzZwh.getDocument();
    }

    @Override // com.aspose.words.zzZ8W
    public final zzYC3 zzJI(String str) {
        if (com.aspose.words.internal.zzZKN.zzS(str, "#", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            str = str.substring(1);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(str) && this.zzYkk.containsKey(str)) {
            return this.zzYkk.get(str);
        }
        return null;
    }

    @Override // com.aspose.words.zzZ8W
    public final ShapeBase zzJJ(String str) {
        return null;
    }

    @Override // com.aspose.words.zzZ8W
    public final boolean zzNM(String str) throws Exception {
        return this.zzYpP.zzZ4(this.zzZwh.getDocument().getBaseUri(), str) == null;
    }

    @Override // com.aspose.words.zzZ8W
    public final byte[] zzNO(String str) throws Exception {
        return this.zzYpP.zzZ4(this.zzZwh.getDocument().getBaseUri(), str);
    }

    @Override // com.aspose.words.zzZ8W
    public final zzZBL zzNP(String str) {
        return null;
    }

    @Override // com.aspose.words.zzZ8W
    public final void zzVb(boolean z) {
        this.zzYkj = z;
    }

    @Override // com.aspose.words.zzZ8W
    public final String zzY9(String str) {
        return str;
    }

    @Override // com.aspose.words.zzZ8W
    public final boolean zzYXm() {
        return this.zzYkj;
    }

    @Override // com.aspose.words.zzZ8W
    public final void zzZ(String str, ShapeBase shapeBase) {
    }

    @Override // com.aspose.words.zzZ8W
    public final void zzZml() {
    }

    @Override // com.aspose.words.zzZ8W
    public final zzYU4 zzZsD() {
        return this.zzZ7n;
    }

    @Override // com.aspose.words.zzZ8W
    public final void zzb(ShapeBase shapeBase) {
    }

    @Override // com.aspose.words.zzZ8W
    public final boolean zzs(ShapeBase shapeBase) throws Exception {
        Paragraph paragraph = new Paragraph(this.zzZwh.getDocument());
        shapeBase.appendChild(paragraph);
        Paragraph currentParagraph = this.zzZwh.getCurrentParagraph();
        this.zzZwh.moveTo(paragraph);
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzU(sb, "<html>");
        while (!this.zzZ7n.zzP("textbox") && this.zzZ7n.zzQ("textbox")) {
            com.aspose.words.internal.zzZNH.zzU(sb, this.zzZ7n.zzf());
        }
        com.aspose.words.internal.zzZNH.zzU(sb, "</html>");
        new zzZFI(new zzZFH(), 50, this.zzYpP).zzZ(sb.toString(), this.zzZwh, 0, true);
        this.zzZwh.moveTo(currentParagraph);
        return false;
    }

    @Override // com.aspose.words.zzZ8W
    public final void zzZ(String str, zzYC3 zzyc3) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzYkk.put(str, zzyc3);
        }
    }
}
