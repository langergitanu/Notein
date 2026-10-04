package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZLV {
    private String mValue;
    private com.aspose.words.internal.zzPV zzHv;
    private boolean zzYvu;
    private int zzYvv;
    private int zzYvw;
    private int zzYvx;
    private boolean zzYvy;
    private Document zzYvz;
    private String zzjy;

    private zzZLV(DocumentBase documentBase) throws Exception {
        this.zzYvz = documentBase.zzZpS();
    }

    private static int zzAB(int i) {
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzT(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        float width;
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) zzg);
        if (this.zzYvy || zzzq4.getWidth() <= zzzq4ZzZ.getWidth()) {
            width = 0.0f;
        } else {
            int i = this.zzYvv;
            if (i == 2) {
                width = zzzq4.getWidth() - zzzq4ZzZ.getWidth();
            } else if (i == 3) {
                width = (zzzq4.getWidth() - zzzq4ZzZ.getWidth()) / 2.0f;
            }
        }
        float height = this.zzYvu ? (zzzq4.getHeight() - zzzq4ZzZ.getHeight()) / 2.0f : 0.0f;
        if (zzg.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        }
        zzg.zzZO().zzY(zzzq4.getX() + width, zzzq4.getY() + height, 0);
    }

    public static zzZLV zzZ(TextBoxControl textBoxControl, DocumentBase documentBase) throws Exception {
        zzZLV zzzlv = new zzZLV(documentBase);
        zzzlv.mValue = textBoxControl.getValue();
        zzzlv.zzYvy = textBoxControl.getWordWrap() && textBoxControl.getMultiline();
        zzzlv.zzjy = textBoxControl.getFontName();
        zzzlv.zzYvx = textBoxControl.zz1D();
        zzzlv.zzYvw = textBoxControl.zz1C();
        zzzlv.zzYvv = textBoxControl.zz1B();
        zzzlv.zzHv = com.aspose.words.internal.zzPV.zzYR(textBoxControl.getForeColor());
        zzzlv.zzYvu = false;
        return zzzlv;
    }

    private Shape zzZb(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        Shape shape = new Shape(this.zzYvz, 202);
        shape.setWidth(zzzq4.getWidth());
        shape.setHeight(zzzq4.getHeight());
        shape.setStroked(false);
        shape.setFilled(false);
        shape.getTextBox().setInternalMarginLeft(0.0d);
        shape.getTextBox().setInternalMarginRight(0.0d);
        shape.getTextBox().setInternalMarginTop(0.0d);
        shape.getTextBox().setInternalMarginBottom(0.0d);
        shape.getTextBox().setLayoutFlow(0);
        shape.getTextBox().setTextBoxWrapMode(this.zzYvy ? 0 : 2);
        shape.getTextBox().setFitShapeToText(false);
        Paragraph paragraph = new Paragraph(this.zzYvz);
        paragraph.zzZYj().setAlignment(zzAB(this.zzYvv));
        paragraph.zzZYj().zzYpt();
        shape.appendChild(paragraph);
        Run run = new Run(this.zzYvz, this.mValue);
        run.zzZYh().setSize((int) ((((long) this.zzYvx) & 4294967295L) / 10));
        run.zzZYh().zzvA((int) ((((long) this.zzYvx) & 4294967295L) / 10));
        run.zzZYh().setName(this.zzjy);
        run.zzZYh().zzQ(60, zzZU.zzYW((this.zzYvw & 1) != 0));
        run.zzZYh().zzQ(70, zzZU.zzYW((2 & this.zzYvw) != 0));
        run.zzZYh().setUnderline((this.zzYvw & 4) != 0 ? 1 : 0);
        run.zzZYh().zzQ(80, zzZU.zzYW((this.zzYvw & 8) != 0));
        run.zzZYh().zzY(this.zzHv);
        paragraph.appendChild(run);
        return shape;
    }

    public final com.aspose.words.internal.zzZL zzZc(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        Shape shapeZzZb = zzZb(zzzq4);
        this.zzYvz.getFirstSection().getBody().getFirstParagraph().appendChild(shapeZzZb);
        PageSetup pageSetup = this.zzYvz.getFirstSection().getPageSetup();
        double pageWidth = pageSetup.getPageWidth() - ((double) pageSetup.zzYRX());
        double pageHeight = pageSetup.getPageHeight() - ((double) pageSetup.zzYRW());
        pageSetup.setPageWidth(Math.max(pageSetup.getPageWidth(), this.zzYvy ? shapeZzZb.getWidth() + pageWidth : 1584.0d));
        pageSetup.setPageHeight(Math.max(pageSetup.getPageHeight(), shapeZzZb.getHeight() + pageHeight));
        ShapeRenderer shapeRenderer = shapeZzZb.getShapeRenderer();
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX((com.aspose.words.internal.zzZL) shapeRenderer.zzyv());
        zzT(zzg, zzzq4);
        return zzg;
    }

    public static zzZLV zzZ(zzZ78 zzz78, DocumentBase documentBase) throws Exception {
        zzZLV zzzlv = new zzZLV(documentBase);
        zzzlv.mValue = zzz78.getCaption();
        zzzlv.zzYvy = zzz78.getWordWrap();
        zzzlv.zzjy = zzz78.getFontName();
        zzzlv.zzYvx = zzz78.zz1D();
        zzzlv.zzYvw = zzz78.zz1C();
        zzzlv.zzYvv = zzz78.zz1B();
        zzzlv.zzHv = com.aspose.words.internal.zzPV.zzYR(zzz78.getForeColor());
        zzzlv.zzYvu = false;
        return zzzlv;
    }

    public static zzZLV zzZ(zzVY zzvy, DocumentBase documentBase) throws Exception {
        zzZLV zzzlv = new zzZLV(documentBase);
        zzzlv.mValue = zzvy.getCaption();
        zzzlv.zzYvy = zzvy.getWordWrap();
        zzzlv.zzjy = zzvy.getFontName();
        zzzlv.zzYvx = zzvy.zz1D();
        zzzlv.zzYvw = zzvy.zz1C();
        zzzlv.zzYvv = zzvy.zz1B();
        zzzlv.zzHv = com.aspose.words.internal.zzPV.zzKa;
        zzzlv.zzYvu = true;
        return zzzlv;
    }

    public static zzZLV zzZ(zzUX zzux, DocumentBase documentBase) throws Exception {
        zzZLV zzzlv = new zzZLV(documentBase);
        zzzlv.mValue = zzux.getValue();
        zzzlv.zzYvy = false;
        zzzlv.zzjy = zzux.getFontName();
        zzzlv.zzYvx = zzux.zz1D();
        zzzlv.zzYvw = zzux.zz1C();
        zzzlv.zzYvv = zzux.zz1B();
        zzzlv.zzHv = com.aspose.words.internal.zzPV.zzYR(zzux.getForeColor());
        zzzlv.zzYvu = false;
        return zzzlv;
    }

    public static zzZLV zzZ(zzZ4L zzz4l, DocumentBase documentBase) throws Exception {
        zzZLV zzzlv = new zzZLV(documentBase);
        zzzlv.mValue = zzz4l.zzYP7();
        zzzlv.zzYvy = false;
        zzzlv.zzjy = zzz4l.getFontName();
        zzzlv.zzYvx = zzz4l.zz1D();
        zzzlv.zzYvw = zzz4l.zz1C();
        zzzlv.zzYvv = zzz4l.zz1B();
        zzzlv.zzHv = com.aspose.words.internal.zzPV.zzYR(zzz4l.getForeColor());
        zzzlv.zzYvu = false;
        return zzzlv;
    }

    public static zzZLV zzZ(zzYNN zzynn, DocumentBase documentBase) throws Exception {
        zzZLV zzzlv = new zzZLV(documentBase);
        zzzlv.mValue = zzynn.getCaption();
        zzzlv.zzYvy = zzynn.getWordWrap();
        zzzlv.zzjy = zzynn.getFontName();
        zzzlv.zzYvx = zzynn.zz1D();
        zzzlv.zzYvw = zzynn.zz1C();
        zzzlv.zzYvv = zzynn.zz1B();
        zzzlv.zzHv = com.aspose.words.internal.zzPV.zzKa;
        zzzlv.zzYvu = true;
        return zzzlv;
    }

    public static zzZLV zzZ(zzY50 zzy50, DocumentBase documentBase) throws Exception {
        int foreColor;
        zzZLV zzzlv = new zzZLV(documentBase);
        zzzlv.mValue = zzy50.getCaption();
        zzzlv.zzYvy = zzy50.getWordWrap();
        zzzlv.zzjy = zzy50.getFontName();
        zzzlv.zzYvx = zzy50.zz1D();
        zzzlv.zzYvw = zzy50.zz1C();
        zzzlv.zzYvv = zzy50.zz1B();
        if (zzYO6.zzD4(zzy50.getValue()) == -1) {
            foreColor = com.aspose.words.internal.zzZQ2.zz2z;
        } else {
            foreColor = zzy50.getForeColor();
        }
        zzzlv.zzHv = com.aspose.words.internal.zzPV.zzYR(foreColor);
        zzzlv.zzYvu = true;
        return zzzlv;
    }

    public static zzZLV zzZ(zzUW zzuw, DocumentBase documentBase) throws Exception {
        zzZLV zzzlv = new zzZLV(documentBase);
        zzzlv.mValue = zzuw.getCaption();
        zzzlv.zzYvy = zzuw.getWordWrap();
        zzzlv.zzjy = zzuw.getFontName();
        zzzlv.zzYvx = zzuw.zz1D();
        zzzlv.zzYvw = zzuw.zz1C();
        zzzlv.zzYvv = 1;
        zzzlv.zzHv = com.aspose.words.internal.zzPV.zzYR(zzuw.getForeColor());
        zzzlv.zzYvu = true;
        return zzzlv;
    }
}
