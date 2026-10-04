package com.aspose.words;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public abstract class NodeRendererBase {
    private com.aspose.words.internal.zzZQ4 zzG8;
    private com.aspose.words.internal.zzZQ4 zzZBh;
    private DocumentBase zzZCL;
    private com.aspose.words.internal.zzG zzbp;

    public NodeRendererBase() {
        com.aspose.words.internal.zzZQ4 zzzq4 = com.aspose.words.internal.zzZQ4.zz2T;
        this.zzG8 = zzzq4;
        this.zzZBh = zzzq4;
    }

    private com.aspose.words.internal.zzZQ5 zzN(float f, float f2, float f3) throws Exception {
        return com.aspose.words.internal.zzSA.zzZ(zzYzF(), f, f2, f3);
    }

    private com.aspose.words.internal.zzZQ5 zzO(float f, float f2, float f3) {
        return com.aspose.words.internal.zzSA.zzZ(this.zzG8, f, f2, f3);
    }

    private long zzP(float f, float f2, float f3) {
        return com.aspose.words.internal.zzSA.zzY(this.zzG8.getSize(), f, f2, f3);
    }

    private long zzY(Canvas canvas, float f, float f2, float f3) throws Exception {
        return new com.aspose.words.internal.zzJ8(this.zzZCL.zzZqx().zzZo7()).zzZ(this.zzbp, this.zzG8.getSize(), canvas, f, f2, f3);
    }

    private static float zzYd(float f) {
        if (0.0f >= f || f >= 0.51f) {
            return f;
        }
        return 0.0f;
    }

    private void zzYzE() throws Exception {
        this.zzZBh = new com.aspose.words.internal.zzZK().zzZ((com.aspose.words.internal.zzZL) this.zzbp);
    }

    private Document zzZrE() {
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(this.zzZCL, Document.class);
        if (document != null) {
            return document;
        }
        GlossaryDocument glossaryDocument = (GlossaryDocument) com.aspose.words.internal.zzZKW.zzZ(this.zzZCL, GlossaryDocument.class);
        if (glossaryDocument != null) {
            return glossaryDocument.zzZrE();
        }
        return null;
    }

    public Rect getBoundsInPixels(float f, float f2, float f3) {
        return com.aspose.words.internal.zzZQ5.zzO(zzO(f, f2, f3));
    }

    public RectF getBoundsInPoints() {
        return com.aspose.words.internal.zzZQ4.zz8(this.zzG8);
    }

    public Rect getOpaqueBoundsInPixels(float f, float f2, float f3) throws Exception {
        return com.aspose.words.internal.zzZQ5.zzO(zzN(f, f2, f3));
    }

    public RectF getOpaqueBoundsInPoints() throws Exception {
        return com.aspose.words.internal.zzZQ4.zz8(zzYzF());
    }

    public PointF getSizeInPixels(float f, float f2, float f3) {
        return com.aspose.words.internal.zzZPX.zzYB(zzP(f, f2, f3));
    }

    public PointF getSizeInPoints() {
        return com.aspose.words.internal.zzZPW.zzYB(this.zzG8.getSize());
    }

    public PointF renderToScale(Canvas canvas, float f, float f2, float f3) throws Exception {
        return com.aspose.words.internal.zzZPW.zzYB(zzY(canvas, f, f2, f3));
    }

    public float renderToSize(Canvas canvas, float f, float f2, float f3, float f4) throws Exception {
        return new com.aspose.words.internal.zzJ8(this.zzZCL.zzZqx().zzZo7()).zzZ(this.zzbp, this.zzG8.getSize(), canvas, f, f2, f3, f4);
    }

    public void save(String str, ImageSaveOptions imageSaveOptions) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "fileName");
        if (imageSaveOptions == null) {
            imageSaveOptions = (ImageSaveOptions) SaveOptions.createSaveOptions(str);
        }
        com.aspose.words.internal.zzZOS zzzosZzVl = com.aspose.words.internal.zzZOU.zzVl(str);
        try {
            zzZ(zzzosZzVl, imageSaveOptions);
        } finally {
            zzzosZzVl.close();
        }
    }

    public final void zz5(com.aspose.words.internal.zzG zzg) {
        this.zzbp = zzg;
    }

    public final com.aspose.words.internal.zzZQ4 zzYzF() throws Exception {
        if (com.aspose.words.internal.zzZQ4.zzV(this.zzZBh, com.aspose.words.internal.zzZQ4.zz2T)) {
            zzYzE();
        }
        return this.zzZBh;
    }

    public final com.aspose.words.internal.zzZQ4 zzYzG() {
        return this.zzG8;
    }

    public final void zzZ(com.aspose.words.internal.zzZOP zzzop, ImageSaveOptions imageSaveOptions) throws Exception {
        if (zzzop == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: stream");
        }
        if (imageSaveOptions == null) {
            imageSaveOptions = new ImageSaveOptions(101);
        }
        ImageSaveOptions imageSaveOptions2 = imageSaveOptions;
        long size = this.zzG8.getSize();
        if (com.aspose.words.internal.zzZPW.zzYy(size) && this.zzbp.getCount() == 0) {
            com.aspose.words.internal.zzZP zzzp = new com.aspose.words.internal.zzZP(com.aspose.words.internal.zzZPY.zzG(0.0f, 0.0f), com.aspose.words.internal.zzZPW.zzG(32.0f, 32.0f), com.aspose.words.internal.zzEF.zzDL());
            this.zzbp.zzX(zzzp);
            size = zzzp.getSize();
        }
        zzYDY.zzZ(this.zzbp, size, zzzop, imageSaveOptions2, this.zzZCL.zzZqx());
    }

    public final void zzZ5(com.aspose.words.internal.zzZQ4 zzzq4) {
        float f;
        float fZzOc;
        float fZzOe;
        float fZzOd;
        this.zzG8 = zzzq4;
        float f2 = -zzzq4.zzZm();
        float f3 = -zzzq4.zzZo();
        float fZzYd = zzYd(f2);
        float fZzYd2 = zzYd(f3);
        if (this.zzbp.zzZO() != null) {
            float fZzOf = this.zzbp.zzZO().zzOf();
            fZzOe = this.zzbp.zzZO().zzOe();
            fZzOd = this.zzbp.zzZO().zzOd();
            fZzOc = this.zzbp.zzZO().zzOc();
            f = fZzOf;
        } else {
            f = 1.0f;
            fZzOc = 1.0f;
            fZzOe = 0.0f;
            fZzOd = 0.0f;
        }
        this.zzbp.zzW(new com.aspose.words.internal.zzP9(f, fZzOe, fZzOd, fZzOc, fZzYd, fZzYd2));
    }

    public final com.aspose.words.internal.zzG zzyv() {
        return this.zzbp;
    }

    public Rect getBoundsInPixels(float f, float f2) {
        return com.aspose.words.internal.zzZQ5.zzO(zzO(f, f2, f2));
    }

    public Rect getOpaqueBoundsInPixels(float f, float f2) throws Exception {
        return com.aspose.words.internal.zzZQ5.zzO(zzN(f, f2, f2));
    }

    public PointF getSizeInPixels(float f, float f2) {
        return com.aspose.words.internal.zzZPX.zzYB(zzP(f, f2, f2));
    }

    public void save(String str, SvgSaveOptions svgSaveOptions) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "fileName");
        if (svgSaveOptions == null) {
            svgSaveOptions = (SvgSaveOptions) SaveOptions.createSaveOptions(str);
        }
        com.aspose.words.internal.zzZOS zzzosZzVl = com.aspose.words.internal.zzZOU.zzVl(str);
        try {
            zzZ(zzzosZzVl, svgSaveOptions);
        } finally {
            zzzosZzVl.close();
        }
    }

    public final void zzY(DocumentBase documentBase) {
        this.zzZCL = documentBase;
    }

    private void zzZ(com.aspose.words.internal.zzZOP zzzop, SvgSaveOptions svgSaveOptions) throws Exception {
        if (zzzop != null) {
            if (svgSaveOptions == null) {
                svgSaveOptions = new SvgSaveOptions();
            }
            long size = this.zzG8.getSize();
            if (com.aspose.words.internal.zzZPW.zzYy(size) && this.zzbp.getCount() == 0) {
                com.aspose.words.internal.zzZP zzzp = new com.aspose.words.internal.zzZP(com.aspose.words.internal.zzZPY.zzG(0.0f, 0.0f), com.aspose.words.internal.zzZPW.zzG(32.0f, 32.0f), com.aspose.words.internal.zzEF.zzDL());
                this.zzbp.zzX(zzzp);
                size = zzzp.getSize();
            }
            zzYDY.zzZ(this.zzbp, size, zzzop, svgSaveOptions.zzZW(zzZrE()), this.zzZCL.zzZqx());
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: stream");
    }

    public void save(OutputStream outputStream, ImageSaveOptions imageSaveOptions) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzZ(zzzor, imageSaveOptions);
        zzzor.zzH(0L);
        com.aspose.words.internal.zzZKB.zzZ(zzzor, outputStream);
    }

    public void save(OutputStream outputStream, SvgSaveOptions svgSaveOptions) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzZ(zzzor, svgSaveOptions);
        zzzor.zzH(0L);
        com.aspose.words.internal.zzZKB.zzZ(zzzor, outputStream);
    }
}
