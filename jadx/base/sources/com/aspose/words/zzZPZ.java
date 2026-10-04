package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPZ {
    private String zzYDk;
    private MergeFieldImageDimension zzYDn;
    private MergeFieldImageDimension zzYDo;
    private int zzYDp;
    private String zzZpC;

    public final String getFieldName() {
        return this.zzYDk;
    }

    public final MergeFieldImageDimension getImageHeight() {
        return this.zzYDn;
    }

    public final MergeFieldImageDimension getImageWidth() {
        return this.zzYDo;
    }

    public final String getPrefix() {
        return this.zzZpC;
    }

    public final void setFieldName(String str) {
        this.zzYDk = str;
    }

    public final void setImageHeight(MergeFieldImageDimension mergeFieldImageDimension) {
        this.zzYDn = mergeFieldImageDimension;
    }

    public final void setImageWidth(MergeFieldImageDimension mergeFieldImageDimension) {
        this.zzYDo = mergeFieldImageDimension;
    }

    public final void setPrefix(String str) {
        this.zzZpC = str;
    }

    public final void zzDe(int i) {
        this.zzYDp = i;
    }

    public final String zzZd3() {
        return FieldMergeField.zzZa(this.zzZpC, this.zzYDk);
    }

    public final int zzZd4() {
        return this.zzYDp;
    }
}
