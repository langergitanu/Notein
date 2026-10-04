package com.aspose.slides.internal.p490x2;

import android.graphics.Bitmap;
import com.aspose.slides.internal.p066cl.InterfaceC2627to;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.aspose.slides.internal.x2.kk */
/* JADX INFO: loaded from: classes5.dex */
class C12373kk implements InterfaceC2627to {

    /* JADX INFO: renamed from: k4 */
    private Bitmap f41358k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f41359kk;

    /* JADX INFO: renamed from: x1 */
    private ByteBuffer f41360x1;

    public C12373kk(Bitmap bitmap) {
        this.f41358k4 = bitmap;
        byte[] bArr = new byte[bitmap.getByteCount()];
        this.f41359kk = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f41360x1 = byteBufferWrap;
        this.f41358k4.copyPixelsToBuffer(byteBufferWrap);
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2625kk
    /* JADX INFO: renamed from: k4 */
    public int mo11994k4(int i) {
        return this.f41359kk[i];
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2627to
    /* JADX INFO: renamed from: kk */
    public byte[] mo11998kk() {
        return this.f41359kk;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2625kk
    /* JADX INFO: renamed from: x1 */
    public void mo11997x1() {
        this.f41358k4 = null;
        this.f41360x1 = null;
        this.f41359kk = null;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2625kk
    /* JADX INFO: renamed from: k4 */
    public void mo11995k4() {
        this.f41360x1.clear();
        this.f41358k4.copyPixelsFromBuffer(this.f41360x1);
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2625kk
    /* JADX INFO: renamed from: k4 */
    public void mo11996k4(int i, int i2) {
        this.f41359kk[i] = (byte) i2;
    }
}
