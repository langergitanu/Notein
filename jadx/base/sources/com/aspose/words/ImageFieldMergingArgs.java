package com.aspose.words;

import android.graphics.Bitmap;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class ImageFieldMergingArgs extends FieldMergingArgsBase {
    private Bitmap zz4r;
    private com.aspose.words.internal.zzZOP zz56;
    private MergeFieldImageDimension zzYDn;
    private MergeFieldImageDimension zzYDo;
    private String zzYjA;
    private Shape zzZ2R;

    public ImageFieldMergingArgs(Document document, String str, int i, FieldMergeField fieldMergeField, String str2, String str3, Object obj, MergeFieldImageDimension mergeFieldImageDimension, MergeFieldImageDimension mergeFieldImageDimension2) {
        super(document, str, i, fieldMergeField, str2, str3, obj);
        setImageWidth(mergeFieldImageDimension);
        setImageHeight(mergeFieldImageDimension2);
    }

    public Bitmap getImage() {
        return this.zz4r;
    }

    public String getImageFileName() {
        return this.zzYjA;
    }

    public MergeFieldImageDimension getImageHeight() {
        return this.zzYDn;
    }

    public InputStream getImageStream() {
        return com.aspose.words.internal.zzZOP.zzZG(this.zz56);
    }

    public MergeFieldImageDimension getImageWidth() {
        return this.zzYDo;
    }

    public Shape getShape() {
        return this.zzZ2R;
    }

    public void setImage(Bitmap bitmap) {
        this.zz4r = bitmap;
    }

    public void setImageFileName(String str) {
        this.zzYjA = str;
    }

    public void setImageHeight(MergeFieldImageDimension mergeFieldImageDimension) {
        this.zzYDn = mergeFieldImageDimension;
    }

    public void setImageStream(InputStream inputStream) {
        this.zz56 = com.aspose.words.internal.zzZOP.zzY(inputStream);
    }

    public void setImageWidth(MergeFieldImageDimension mergeFieldImageDimension) {
        this.zzYDo = mergeFieldImageDimension;
    }

    public void setShape(Shape shape) {
        this.zzZ2R = shape;
    }

    public final com.aspose.words.internal.zzZOP zzYVV() {
        return this.zz56;
    }
}
