package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYML {
    private double zzXGi;
    private boolean zzXGj;

    private void zzY(zzZ60 zzz60) {
        zzz60.zzZO(Math.max(zzz60.getMin(), this.zzXGi));
        this.zzXGi = 0.0d;
        this.zzXGj = false;
    }

    private void zzZ(Node node, zzZ60 zzz60) {
        int nodeType = node.getNodeType();
        if (nodeType != 17 && nodeType != 18) {
            if (nodeType != 21) {
                return;
            }
            Run run = (Run) node;
            com.aspose.words.internal.zzPM zzpmZzZ = zzZ(run.getFont(), run.zzYBb());
            String text = run.getText();
            zzZ(zzpmZzZ, text, zzz60);
            zzz60.zzZN(zzz60.getMax() + ((double) zzpmZzZ.zz7(text)));
            return;
        }
        ShapeBase shapeBase = (ShapeBase) node;
        if (shapeBase.isInline() || (shapeBase.getWrapType() == 2 && shapeBase.getWrapSide() == 0)) {
            zzz60.zzZO(Math.max(zzz60.getMin(), shapeBase.getWidth()));
            zzz60.zzZN(shapeBase.getWidth() + zzz60.getMax());
        }
    }

    public final zzZ60 zzYv(Paragraph paragraph) {
        zzZ60 zzz60 = new zzZ60();
        int i = 0;
        for (Node node : paragraph.getChildNodes(0, false)) {
            switch (node.getNodeType()) {
                case 22:
                    i++;
                    break;
                case 24:
                    if (!((FieldEnd) node).hasSeparator()) {
                    }
                case 23:
                    i--;
                    break;
                default:
                    if (i == 0) {
                        zzZ(node, zzz60);
                    }
                    break;
            }
            if (this.zzXGj) {
                zzY(zzz60);
            }
        }
        ParagraphFormat paragraphFormat = paragraph.getParagraphFormat();
        double rightIndent = paragraphFormat.getRightIndent() + paragraphFormat.getLeftIndent();
        if (paragraphFormat.getFirstLineIndent() < 0.0d) {
            rightIndent -= paragraphFormat.getFirstLineIndent();
        }
        zzz60.add(rightIndent);
        return zzz60;
    }

    private void zzZ(com.aspose.words.internal.zzPM zzpm, String str, zzZ60 zzz60) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (!com.aspose.words.internal.zzZKU.zzG(cCharAt) && cCharAt != '-') {
                if (!this.zzXGj) {
                    this.zzXGj = true;
                    i = i3;
                }
                i2++;
            } else if (this.zzXGj) {
                zzZ(zzpm, str, i, i2);
                zzY(zzz60);
                i2 = 0;
            }
        }
        if (this.zzXGj) {
            zzZ(zzpm, str, i, i2);
        }
    }

    private void zzZ(com.aspose.words.internal.zzPM zzpm, String str, int i, int i2) {
        this.zzXGi += (double) zzpm.zz7(str.substring(i, i2 + i));
    }

    private static com.aspose.words.internal.zzPM zzZ(Font font, Document document) {
        return document.zzZqy().zzY(font.getName(), (float) font.getSize(), font.zzza());
    }
}
