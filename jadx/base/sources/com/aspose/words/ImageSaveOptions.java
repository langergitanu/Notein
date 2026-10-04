package com.aspose.words;

import android.graphics.PointF;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes6.dex */
public class ImageSaveOptions extends FixedPageSaveOptions implements Cloneable {
    private int zzZCv;
    private com.aspose.words.internal.zzPV zzYju = com.aspose.words.internal.zzPV.zzI5;
    private int zz8u = 5;
    private float zzEn = 96.0f;
    private float zzUj = 96.0f;
    private int zzYjt = 2;
    private int zzYjs = 0;
    private float zzYjr = 0.5f;
    private float zzYjq = 0.5f;
    private float zzPp = 1.0f;
    private long zzYjp = 0;
    private int zzYjo = 1;
    private boolean zzYjn = true;
    private int zzYjm = 0;
    private byte zzYjl = UnsignedBytes.MAX_POWER_OF_TWO;
    private boolean zzYjk = true;

    public ImageSaveOptions(int i) {
        zzGe(i);
        getMetafileRenderingOptions().setRenderingMode(2);
    }

    private void zzGe(int i) {
        if (i != 44) {
            switch (i) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                    break;
                default:
                    throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
            }
        }
        this.zzZCv = i;
    }

    private void zzXG(long j) {
        if (((int) j) <= 0 || ((int) (j >>> 32)) <= 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzYjp = j;
    }

    public ImageSaveOptions deepClone() {
        return (ImageSaveOptions) memberwiseClone();
    }

    public float getHorizontalResolution() {
        return this.zzEn;
    }

    public float getImageBrightness() {
        return this.zzYjr;
    }

    public int getImageColorMode() {
        return this.zzYjs;
    }

    public float getImageContrast() {
        return this.zzYjq;
    }

    public PointF getImageSize() {
        return com.aspose.words.internal.zzZPX.zzYB(this.zzYjp);
    }

    @Override // com.aspose.words.FixedPageSaveOptions
    public int getJpegQuality() {
        return super.getJpegQuality();
    }

    @Override // com.aspose.words.FixedPageSaveOptions
    public MetafileRenderingOptions getMetafileRenderingOptions() {
        return super.getMetafileRenderingOptions();
    }

    @Override // com.aspose.words.FixedPageSaveOptions
    public PageSet getPageSet() {
        return super.getPageSet();
    }

    public int getPaperColor() {
        return this.zzYju.zzPG();
    }

    public int getPixelFormat() {
        return this.zz8u;
    }

    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return this.zzZCv;
    }

    public float getScale() {
        return this.zzPp;
    }

    public byte getThresholdForFloydSteinbergDithering() {
        return this.zzYjl;
    }

    public int getTiffBinarizationMethod() {
        return this.zzYjm;
    }

    public int getTiffCompression() {
        return this.zzYjt;
    }

    public boolean getUseGdiEmfRenderer() {
        return this.zzYjk;
    }

    public float getVerticalResolution() {
        return this.zzUj;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setHorizontalResolution(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzEn = f;
    }

    public void setImageBrightness(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzYjr = f;
    }

    public void setImageColorMode(int i) {
        this.zzYjs = i;
    }

    public void setImageContrast(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzYjq = f;
    }

    public void setImageSize(PointF pointF) {
        zzXG(com.aspose.words.internal.zzZPX.zzY(pointF));
    }

    @Override // com.aspose.words.FixedPageSaveOptions
    public void setJpegQuality(int i) {
        super.setJpegQuality(i);
    }

    @Override // com.aspose.words.FixedPageSaveOptions
    public void setPageSet(PageSet pageSet) {
        super.setPageSet(pageSet);
    }

    public void setPaperColor(int i) {
        this.zzYju = com.aspose.words.internal.zzPV.zzYR(i);
    }

    public void setPixelFormat(int i) {
        this.zz8u = i;
    }

    public void setResolution(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzUj = f;
        this.zzEn = f;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        zzGe(i);
    }

    public void setScale(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzPp = f;
    }

    public void setThresholdForFloydSteinbergDithering(byte b) {
        this.zzYjl = b;
    }

    public void setTiffBinarizationMethod(int i) {
        this.zzYjm = i;
    }

    public void setTiffCompression(int i) {
        this.zzYjt = i;
    }

    public void setUseGdiEmfRenderer(boolean z) {
        this.zzYjk = z;
    }

    public void setVerticalResolution(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzUj = f;
    }

    public final void zzV8(boolean z) {
        this.zzYjn = z;
    }

    public final com.aspose.words.internal.zz02 zzX(com.aspose.words.internal.zzH6 zzh6) {
        com.aspose.words.internal.zz02 zz02Var = new com.aspose.words.internal.zz02(zzh6);
        zz02Var.zzZ(zzh6.zzHq());
        zz02Var.setJpegQuality(getJpegQuality());
        zz02Var.zzZ(getMetafileRenderingOptions().zzZ(zzh6, getOptimizeOutput()));
        if (getExportGeneratorName()) {
            zz02Var.zzb("Aspose.Words for Android via Java 24.3.0");
        }
        return zz02Var;
    }

    public final com.aspose.words.internal.zzZY5 zzY(com.aspose.words.internal.zzH6 zzh6) {
        com.aspose.words.internal.zzZY5 zzzy5 = new com.aspose.words.internal.zzZY5(zzh6);
        zzzy5.zzZ(zzh6.zzHq());
        zzzy5.setPrettyFormat(getPrettyFormat());
        zzzy5.setExportEmbeddedImages(true);
        zzzy5.setTextOutputMode(2);
        zzzy5.setJpegQuality(getJpegQuality());
        zzzy5.setShowPageBorder(false);
        zzzy5.zzZ(getMetafileRenderingOptions().zzZ(zzh6, getOptimizeOutput()));
        zzzy5.setFitToViewPort(false);
        if (getExportGeneratorName()) {
            zzzy5.zzb("Aspose.Words for Android via Java 24.3.0");
        }
        return zzzy5;
    }

    public final boolean zzYVN() {
        return this.zzYjn;
    }

    public final int zzYVO() {
        int i = this.zzYjm;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        throw new IllegalArgumentException();
    }

    public final int zzYVP() {
        int i = this.zzYjt;
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 4;
        }
        throw new IllegalArgumentException();
    }

    public final int zzYVQ() {
        switch (this.zz8u) {
            case 0:
                return 135173;
            case 1:
                return 135174;
            case 2:
                return 397319;
            case 3:
                return 137224;
            case 4:
                return 139273;
            case 5:
                return 2498570;
            case 6:
                return 925707;
            case 7:
                return 1060876;
            case 8:
                return 3424269;
            case 9:
                return 1851406;
            case 10:
                return 196865;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final int zzYVR() {
        int i = this.zzYjs;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalArgumentException();
    }

    public final com.aspose.words.internal.zzPV zzYVS() {
        return this.zzYju;
    }

    public final void zzYVT() {
        this.zzYjo = 1;
    }

    public final long zzYVU() {
        return this.zzYjp;
    }

    @Override // com.aspose.words.FixedPageSaveOptions
    public final boolean zzZ9d() {
        return false;
    }
}
