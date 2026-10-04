package com.aspose.words;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes6.dex */
public final class Watermark {
    private zzZ8S zzWVs;
    private Document zzYTQ;

    public Watermark(Document document, zzZ8S zzz8s) {
        this.zzYTQ = document;
        this.zzWVs = zzz8s;
    }

    private void add(Shape shape) throws Exception {
        remove();
        this.zzWVs.add(shape);
    }

    private static void zzV(Shape shape, String str) {
        shape.setName(com.aspose.words.internal.zzZKN.format("{0}{1}", str, Integer.valueOf(shape.getId())));
        shape.setRelativeHorizontalPosition(0);
        shape.setRelativeVerticalPosition(0);
        shape.setWrapType(3);
        shape.setVerticalAlignment(2);
        shape.setHorizontalAlignment(2);
        shape.setBehindText(true);
    }

    private static void zzY(Shape shape, ImageWatermarkOptions imageWatermarkOptions, Document document) throws Exception {
        double scale = imageWatermarkOptions.getScale();
        double widthPoints = shape.getImageData().getImageSize().getWidthPoints();
        double heightPoints = shape.getImageData().getImageSize().getHeightPoints();
        if (imageWatermarkOptions.zzYVK()) {
            PageSetup pageSetup = document.getFirstSection().getPageSetup();
            scale = ((double) pageSetup.zzYRX()) / widthPoints;
            double d = heightPoints * scale;
            double dZzYRW = pageSetup.zzYRW();
            if (d > dZzYRW) {
                scale = dZzYRW / heightPoints;
            }
        }
        shape.zzWf(com.aspose.words.internal.zzZKQ.zzR(widthPoints * scale, 2));
        shape.zzWe(com.aspose.words.internal.zzZKQ.zzR(heightPoints * scale, 2));
    }

    private void zzZ(Shape shape, ImageWatermarkOptions imageWatermarkOptions, Document document) throws Exception {
        if (imageWatermarkOptions == null) {
            imageWatermarkOptions = new ImageWatermarkOptions();
        }
        zzY(shape, imageWatermarkOptions, document);
        if (imageWatermarkOptions.isWashout()) {
            shape.getImageData().setContrast(0.15d);
            shape.getImageData().setBrightness(0.85d);
        }
        zzV(shape, "WordPictureWatermark");
        add(shape);
    }

    private static void zzyV(String str) {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: text");
        }
        if (com.aspose.words.internal.zzZYD.zzXh(str)) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: text");
        }
        com.aspose.words.internal.zzZ4.zzZ(str.length(), 0.0d, 0.0d, 200.0d, 200.0d, true, "text");
    }

    public final int getType() {
        Shape shape = this.zzWVs.get();
        if (shape == null) {
            return 2;
        }
        shape.zzY98();
        if (shape.zzY97()) {
            return 0;
        }
        return shape.zzY96() ? 1 : 2;
    }

    public final void remove() {
        this.zzWVs.remove();
    }

    public final void setImage(Bitmap bitmap) throws Exception {
        setImage(bitmap, new ImageWatermarkOptions());
    }

    public final void setText(String str) throws Exception {
        setText(str, new TextWatermarkOptions());
    }

    public final void setImage(Bitmap bitmap, ImageWatermarkOptions imageWatermarkOptions) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) bitmap, "image");
        Shape shape = new Shape(this.zzYTQ, 75);
        shape.getImageData().setImage(bitmap);
        zzZ(shape, imageWatermarkOptions, this.zzYTQ);
    }

    public final void setText(String str, TextWatermarkOptions textWatermarkOptions) throws Exception {
        zzyV(str);
        if (textWatermarkOptions == null) {
            textWatermarkOptions = new TextWatermarkOptions();
        }
        add(zzZ(str, textWatermarkOptions, this.zzYTQ));
    }

    public final void setImage(String str, ImageWatermarkOptions imageWatermarkOptions) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "imagePath");
        Shape shape = new Shape(this.zzYTQ, 75);
        shape.getImageData().setImage(str);
        zzZ(shape, imageWatermarkOptions, this.zzYTQ);
    }

    private Shape zzZ(String str, TextWatermarkOptions textWatermarkOptions, Document document) {
        Shape shape = new Shape(document, 136);
        shape.getTextPath().setText(str);
        shape.getTextPath().setFontFamily(textWatermarkOptions.getFontFamily());
        shape.setRotation(textWatermarkOptions.getLayout());
        if (textWatermarkOptions.isSemitrasparent()) {
            shape.getFill().setOpacity(0.5d);
        }
        zzZ(shape, textWatermarkOptions, document);
        shape.getFill().setForeColor(textWatermarkOptions.getColor());
        shape.setStrokeColor(textWatermarkOptions.getColor());
        shape.getFont().setSize(1.0d);
        zzV(shape, "PowerPlusWaterMarkObject");
        return shape;
    }

    private static void zzZ(Shape shape, TextWatermarkOptions textWatermarkOptions, Document document) {
        long jZz6 = document.zzZqy().zzY(shape.getTextPath().getFontFamily(), textWatermarkOptions.zzXVY() ? 1.0f : textWatermarkOptions.getFontSize(), 0).zz6(shape.getTextPath().getText());
        if (textWatermarkOptions.zzXVY()) {
            jZz6 = zzZ(jZz6, textWatermarkOptions, document);
        }
        shape.zzWf(com.aspose.words.internal.zzZKQ.zzR(Float.intBitsToFloat((int) jZz6), 2));
        shape.zzWe(com.aspose.words.internal.zzZKQ.zzR(com.aspose.words.internal.zzZPW.zzYz(jZz6), 2));
    }

    private static long zzZ(long j, TextWatermarkOptions textWatermarkOptions, Document document) {
        PageSetup pageSetup = document.getFirstSection().getPageSetup();
        float fZzYRX = pageSetup.zzYRX();
        float fZzYRW = pageSetup.zzYRW();
        int i = (int) j;
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(j) / Float.intBitsToFloat(i);
        if (textWatermarkOptions.getLayout() == 315) {
            float fMin = (Math.min(fZzYRW, fZzYRX) * ((float) Math.sqrt(2.0d))) / (1.0f + fZzYz);
            return com.aspose.words.internal.zzZPW.zzG(fMin, fZzYz * fMin);
        }
        if (com.aspose.words.internal.zzZPW.zzYz(j) >= Float.intBitsToFloat(i)) {
            return com.aspose.words.internal.zzZPW.zzG(fZzYRW / fZzYz, fZzYRW);
        }
        return com.aspose.words.internal.zzZPW.zzG(fZzYRX, fZzYz * fZzYRX);
    }
}
