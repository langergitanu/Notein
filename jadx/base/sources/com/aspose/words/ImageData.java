package com.aspose.words;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class ImageData implements zzZD6 {
    private static com.aspose.words.internal.zzZQH<Integer, Integer> zzYjH;
    private zzZ8K zzYjG;
    private ShapeBase zzYjI;
    private BorderCollection zzZsJ;

    static {
        com.aspose.words.internal.zzZQH<Integer, Integer> zzzqh = new com.aspose.words.internal.zzZQH<>();
        zzYjH = zzzqh;
        zzzqh.zzB(3, Integer.valueOf(EditingLanguage.SPANISH_GUATEMALA));
        zzYjH.zzB(1, 4107);
        zzYjH.zzB(0, Integer.valueOf(EditingLanguage.FRENCH_SWITZERLAND));
        zzYjH.zzB(2, 4109);
    }

    public ImageData(ShapeBase shapeBase, Document document) {
        this.zzYjI = shapeBase;
        this.zzYjG = shapeBase.getMarkupLanguage() == 1 ? new zzZ8K(document, new zzZ8J(shapeBase), new zzY7C()) : new zzZ8K(document, new zzZVG(shapeBase), new zzY7C());
    }

    private void zz1(com.aspose.words.internal.zzPV zzpv) {
        zzQ(StyleIdentifier.INTENSE_REFERENCE, zzpv);
    }

    private void zzL(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        this.zzYjG.zzL(zzzop);
    }

    private Object zzPj(int i) {
        return this.zzYjI.fetchShapeAttr(i);
    }

    private void zzQ(int i, Object obj) {
        this.zzYjI.setShapeAttr(i, obj);
    }

    public static double zzWO(double d) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: percent");
        }
        if (d <= 0.5d) {
            return d * 2.0d;
        }
        if (d < 1.0d) {
            return 0.5d / (1.0d - d);
        }
        return Double.MAX_VALUE;
    }

    public static double zzWP(double d) {
        return d <= 1.0d ? d / 2.0d : (d - 0.5d) / d;
    }

    public static double zzWQ(double d) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: percent");
        }
        return d - 0.5d;
    }

    public static double zzWR(double d) {
        if (d < -0.5d || d > 0.5d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: escherBrightness");
        }
        return d + 0.5d;
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedBorderAttr(int i) {
        return this.zzYjI.fetchInheritedShapeAttr(i);
    }

    public void fitImageToShape() throws Exception {
        zzH0 zzh0ZzZwy;
        if (this.zzYjI.getMarkupLanguage() != 0) {
            Shape shape = (Shape) this.zzYjI;
            if (getImageBytes() != null && getImageBytes().length > 0) {
                shape.zzYbw();
            }
            shape.zzY9J().zzZBr();
            return;
        }
        zz53 zz53VarZzY9i = this.zzYjI.zzY9i();
        if (zz53VarZzY9i == null) {
            return;
        }
        int iZzZHY = zz53VarZzY9i.zzZHY();
        if (iZzZHY == 2) {
            zzh0ZzZwy = ((zz3V) zz53VarZzY9i).zzZwy();
        } else if (iZzZHY != 8) {
            return;
        } else {
            zzh0ZzZwy = (zzH0) com.aspose.words.internal.zzZKW.zzZ(((zz2O) zz53VarZzY9i).getFill(), zzH0.class);
        }
        if (zzh0ZzZwy == null) {
            return;
        }
        ImageSize imageSize = getImageSize();
        if (com.aspose.words.internal.zzAN.zzL(this.zzYjI.getWidth(), 0.0d) || com.aspose.words.internal.zzAN.zzL(this.zzYjI.getHeight(), 0.0d) || !imageSize.isValid()) {
            return;
        }
        double width = this.zzYjI.getWidth() / this.zzYjI.getHeight();
        double widthPixels = ((double) imageSize.getWidthPixels()) / ((double) imageSize.getHeightPixels());
        if (com.aspose.words.internal.zzAN.zzL(width, widthPixels)) {
            return;
        }
        zzGZ zzgz = new zzGZ();
        if (width > widthPixels) {
            double d = (1.0d - (widthPixels / width)) / 2.0d;
            zzgz.zzY(new zz3Z(d, 0.0d, d, 0.0d));
        } else {
            double d2 = (1.0d - (width / widthPixels)) / 2.0d;
            zzgz.zzY(new zz3Z(0.0d, d2, 0.0d, d2));
        }
        zzh0ZzZwy.zzZ(zzgz);
    }

    public boolean getBiLevel() {
        return this.zzYjI.zzY9h().getBiLevel();
    }

    public BorderCollection getBorders() {
        if (this.zzZsJ == null) {
            this.zzZsJ = new BorderCollection(this);
        }
        return this.zzZsJ;
    }

    public double getBrightness() {
        return this.zzYjI.zzY9h().getBrightness();
    }

    public int getChromaKey() {
        return zzYW3().zzPG();
    }

    public double getContrast() {
        return this.zzYjI.zzY9h().getContrast();
    }

    public double getCropBottom() {
        return this.zzYjI.zzY9h().getCropBottom();
    }

    public double getCropLeft() {
        return this.zzYjI.zzY9h().getCropLeft();
    }

    public double getCropRight() {
        return this.zzYjI.zzY9h().getCropRight();
    }

    public double getCropTop() {
        return this.zzYjI.zzY9h().getCropTop();
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectBorderAttr(int i) {
        return this.zzYjI.getDirectShapeAttr(i);
    }

    public boolean getGrayScale() {
        return this.zzYjI.zzY9h().getGrayScale();
    }

    public byte[] getImageBytes() throws Exception {
        return this.zzYjG.getImageBytes();
    }

    public ImageSize getImageSize() throws Exception {
        return this.zzYjG.getImageSize();
    }

    public int getImageType() throws Exception {
        return FileFormatUtil.zzC7(this.zzYjG.zzYW0());
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzZQH<Integer, Integer> getPossibleBorderKeys() {
        return zzYjH;
    }

    public String getSourceFullName() throws Exception {
        return this.zzYjG.getSourceFullName();
    }

    public String getTitle() {
        return (String) zzPj(EditingLanguage.GERMAN_LUXEMBOURG);
    }

    public boolean hasImage() throws Exception {
        return this.zzYjG.hasImage();
    }

    public boolean isLink() throws Exception {
        return this.zzYjG.isLink();
    }

    public boolean isLinkOnly() throws Exception {
        return this.zzYjG.isLinkOnly();
    }

    public void save(OutputStream outputStream) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzL(zzzor);
        zzzor.zzH(0L);
        com.aspose.words.internal.zzZKB.zzZ(zzzor, outputStream);
    }

    public void setBiLevel(boolean z) {
        this.zzYjI.zzY9h().setBiLevel(z);
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public void setBorderAttr(int i, Object obj) {
        zzQ(i, obj);
    }

    public void setBrightness(double d) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzYjI.zzY9h().setBrightness(d);
    }

    public void setChromaKey(int i) {
        zz1(com.aspose.words.internal.zzPV.zzYR(i));
    }

    public void setContrast(double d) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzYjI.zzY9h().setContrast(d);
    }

    public void setCropBottom(double d) {
        this.zzYjI.zzY9h().setCropBottom(d);
    }

    public void setCropLeft(double d) {
        this.zzYjI.zzY9h().setCropLeft(d);
    }

    public void setCropRight(double d) {
        this.zzYjI.zzY9h().setCropRight(d);
    }

    public void setCropTop(double d) {
        this.zzYjI.zzY9h().setCropTop(d);
    }

    public void setGrayScale(boolean z) {
        this.zzYjI.zzY9h().setGrayScale(z);
    }

    public void setImage(Bitmap bitmap) throws Exception {
        this.zzYjG.setImage(bitmap);
    }

    public void setImageBytes(byte[] bArr) throws Exception {
        this.zzYjG.setImageBytes(bArr);
    }

    public void setSourceFullName(String str) throws Exception {
        this.zzYjG.setSourceFullName(str);
    }

    public void setTitle(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzQ(EditingLanguage.GERMAN_LUXEMBOURG, str);
    }

    public byte[] toByteArray() throws Exception {
        return this.zzYjG.toByteArray();
    }

    public Bitmap toImage() throws Exception {
        return com.aspose.words.internal.zzXN.zzT(this.zzYjG.zzYVZ());
    }

    public InputStream toStream() throws Exception {
        return com.aspose.words.internal.zzZOP.zzZG(this.zzYjG.zzYVZ());
    }

    public final boolean zzY7(byte[] bArr) throws Exception {
        return this.zzYjG.zzY7(bArr);
    }

    public final int zzYW0() throws Exception {
        return this.zzYjG.zzYW0();
    }

    public final boolean zzYW1() {
        return this.zzYjI.getDirectShapeAttr(StyleIdentifier.INTENSE_REFERENCE) != null;
    }

    public final byte[] zzYW2() throws Exception {
        return this.zzYjG.zzYW2();
    }

    public final com.aspose.words.internal.zzPV zzYW3() {
        return (com.aspose.words.internal.zzPV) zzPj(StyleIdentifier.INTENSE_REFERENCE);
    }

    public final byte[] zzZ(byte[] bArr, zzYB5 zzyb5, zzYB5 zzyb52, int i) throws Exception {
        return this.zzYjG.zzZ(bArr, zzyb5, zzyb52, i);
    }

    public final void zzZ1(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        this.zzYjG.zzZ1(zzzop);
    }

    public final com.aspose.words.internal.zzEP zzZd() {
        return new com.aspose.words.internal.zzEP(getCropLeft(), getCropRight(), getCropTop(), getCropBottom());
    }

    public final boolean zzZjT() throws Exception {
        return this.zzYjG.zzZjT();
    }

    public void setImage(InputStream inputStream) throws Exception {
        zzZ1(com.aspose.words.internal.zzZKB.zzW(inputStream));
    }

    public void setImage(String str) throws Exception {
        this.zzYjG.setImage(str);
    }

    public void save(String str) throws Exception {
        this.zzYjG.save(str);
    }
}
