package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class ny0 implements IResourceLoadingArgs {

    /* JADX INFO: renamed from: k4 */
    private String f47652k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f47653kk = new byte[0];

    /* JADX INFO: renamed from: x1 */
    private String f47654x1;

    public ny0(String str) {
        this.f47652k4 = str;
        this.f47654x1 = str;
    }

    @Override // com.aspose.slides.IResourceLoadingArgs
    public final String getOriginalUri() {
        return this.f47652k4;
    }

    @Override // com.aspose.slides.IResourceLoadingArgs
    public final String getUri() {
        return this.f47654x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m68286k4() {
        return this.f47653kk;
    }

    @Override // com.aspose.slides.IResourceLoadingArgs
    public final void setData(byte[] bArr) {
        this.f47653kk = bArr;
    }

    @Override // com.aspose.slides.IResourceLoadingArgs
    public final void setUri(String str) {
        this.f47654x1 = str;
    }
}
