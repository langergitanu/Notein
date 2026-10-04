package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public final class DecoderFallbackException extends ArgumentException {

    /* JADX INFO: renamed from: k4 */
    private byte[] f4890k4;

    /* JADX INFO: renamed from: x1 */
    private int f4891x1;

    public DecoderFallbackException(String str, byte[] bArr, int i) {
        super(str);
        this.f4890k4 = bArr;
        this.f4891x1 = i;
    }

    public final byte[] getBytesUnknown() {
        return this.f4890k4;
    }

    public final int getIndex() {
        return this.f4891x1;
    }
}
