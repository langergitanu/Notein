package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1Z {
    private String zzY3Q;
    private MarkdownSaveOptions zzY3R;
    private zzZ89 zzY3S;
    private zzZ1W zzY3U;
    private ShapeBase zzZBi;
    private String zzZS;

    public zzZ1Z(String str, MarkdownSaveOptions markdownSaveOptions, zzZ1W zzz1w) {
        this.zzZS = str;
        this.zzY3R = markdownSaveOptions;
        this.zzY3U = zzz1w;
    }

    private String getTitle() {
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(this.zzZBi, Shape.class);
        return shape != null ? shape.getImageData().getTitle() : this.zzZBi.getTitle();
    }

    private zzZ89 zzYIt() throws Exception {
        if (this.zzY3S == null) {
            this.zzY3S = new zzZ89(new zzZ8D(this.zzZS, null, this.zzY3R.getImagesFolder(), this.zzY3R.getImagesFolderAlias(), "", false, this.zzY3R.getImageSavingCallback()), this.zzY3R.getExportImagesAsBase64(), null);
        }
        return this.zzY3S;
    }

    private static boolean zzl(Shape shape) throws Exception {
        if (shape.getImageData() == null) {
            return false;
        }
        if (!shape.getImageData().isLinkOnly()) {
            return true;
        }
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(shape.getDocument(), Document.class);
        if (document != null) {
            try {
                com.aspose.words.internal.zzZOP zzzopZzW = zzZ8I.zzW(shape.getImageData().getSourceFullName(), document);
                try {
                    boolean z = zzzopZzW.getLength() != 0;
                    zzzopZzW.close();
                    return z;
                } catch (Throwable th) {
                    if (zzzopZzW != null) {
                        zzzopZzW.close();
                    }
                    throw th;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final String getText() {
        String strZzY = this.zzY3U.zzY(this.zzZBi, this.zzY3Q);
        String str = !com.aspose.words.internal.zzZKN.zzU3(getTitle()) ? com.aspose.words.internal.zzZKN.format(" \"{0}\"", getTitle()) : "";
        return !(this.zzY3R.zzYHQ() == 1 || !this.zzY3U.zzYO(this.zzY3Q, getTitle())) ? (com.aspose.words.internal.zzZKN.equals(this.zzZBi.getAlternativeText(), "") || (!com.aspose.words.internal.zzZKN.equals(strZzY, "") && com.aspose.words.internal.zzZKN.equals(androidx.core.content.OooO0OO.OooO00o(1, 1, strZzY), this.zzZBi.getAlternativeText()))) ? com.aspose.words.internal.zzZKN.format("!{0}", strZzY) : com.aspose.words.internal.zzZKN.format("{0}{1}{2}{3}", "![", this.zzZBi.getAlternativeText(), "]", strZzY) : com.aspose.words.internal.zzZKN.format("{0}{1}{2}{3}{4}{5}{6}", "![", this.zzZBi.getAlternativeText(), "]", '(', this.zzY3R.getExportImagesAsBase64() ? this.zzY3Q : com.aspose.words.internal.zzZVR.zzWj(this.zzY3Q), str, ')');
    }

    public final boolean zz7(ShapeBase shapeBase) throws Exception {
        if (!zzZ1E.zz0(shapeBase)) {
            return false;
        }
        this.zzZBi = shapeBase;
        zzZ8B zzz8bZzZ = zzYIt().zzZ(shapeBase, this.zzY3R.zzYZ3());
        if (zzz8bZzZ == null) {
            return false;
        }
        String strZzYVM = zzz8bZzZ.zzYVM();
        this.zzY3Q = strZzYVM;
        this.zzY3U.zzZ(this.zzZBi, strZzYVM);
        return true;
    }

    public final boolean zzm(Shape shape) throws Exception {
        if (!zzZ1E.zz0(shape)) {
            return false;
        }
        if (shape.getDocument().getResourceLoadingCallback() != null || zzl(shape)) {
            return zz7(shape);
        }
        this.zzZBi = shape;
        zzY1Z.zzZ(shape.getDocument().getWarningCallback(), 255, 8, com.aspose.words.internal.zzZKN.format("The image is not available: {0}.", shape.getImageData().getSourceFullName()));
        String sourceFullName = shape.getImageData().getSourceFullName();
        this.zzY3Q = sourceFullName;
        this.zzY3U.zzZ(this.zzZBi, sourceFullName);
        return true;
    }
}
