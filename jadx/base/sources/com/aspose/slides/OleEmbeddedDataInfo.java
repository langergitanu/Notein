package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: loaded from: classes3.dex */
public class OleEmbeddedDataInfo implements IOleEmbeddedDataInfo {

    /* JADX INFO: renamed from: k4 */
    private byte[] f2868k4;

    /* JADX INFO: renamed from: x1 */
    private String f2869x1;

    public OleEmbeddedDataInfo() {
    }

    @Override // com.aspose.slides.IOleEmbeddedDataInfo
    public final byte[] getEmbeddedFileData() {
        return this.f2868k4;
    }

    @Override // com.aspose.slides.IOleEmbeddedDataInfo
    public final String getEmbeddedFileExtension() {
        return this.f2869x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2069k4(String str) {
        this.f2869x1 = str;
    }

    public OleEmbeddedDataInfo(byte[] bArr, String str) {
        if (bArr == null) {
            throw new ArgumentNullException("embeddedFileData");
        }
        m2070k4(bArr);
        m2069k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2070k4(byte[] bArr) {
        this.f2868k4 = bArr;
    }
}
