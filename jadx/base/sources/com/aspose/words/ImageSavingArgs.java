package com.aspose.words;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class ImageSavingArgs {
    private String zzYjA;
    private boolean zzYjh;
    private boolean zzYji;
    private OutputStream zzYjj;
    private ShapeBase zzZBi;

    public ImageSavingArgs(ShapeBase shapeBase, boolean z, String str) {
        this.zzZBi = shapeBase;
        this.zzYji = z;
        this.zzYjA = str;
    }

    public ShapeBase getCurrentShape() {
        return this.zzZBi;
    }

    public Document getDocument() {
        return this.zzZBi.zzYBb();
    }

    public String getImageFileName() {
        return this.zzYjA;
    }

    public OutputStream getImageStream() {
        return this.zzYjj;
    }

    public boolean getKeepImageStreamOpen() {
        return this.zzYjh;
    }

    public boolean isImageAvailable() {
        return this.zzYji;
    }

    public void setImageFileName(String str) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "ImageFileName");
        if (!com.aspose.words.internal.zzZKN.equals(com.aspose.words.internal.zzZOQ.zzVh(str), str)) {
            throw new IllegalArgumentException("ImageFileName must be a file name without path.");
        }
        this.zzYjA = str;
    }

    public void setImageStream(OutputStream outputStream) {
        this.zzYjj = outputStream;
    }

    public void setKeepImageStreamOpen(boolean z) {
        this.zzYjh = z;
    }

    public final zzY3P zzZVm() {
        return new zzY3P(this.zzYjj, this.zzYjh);
    }

    public final boolean zzro() {
        return this.zzYjj != null;
    }
}
