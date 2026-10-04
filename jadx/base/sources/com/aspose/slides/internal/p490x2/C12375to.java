package com.aspose.slides.internal.p490x2;

import android.graphics.Bitmap;
import com.aspose.slides.internal.p066cl.InterfaceC2620du;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: com.aspose.slides.internal.x2.to */
/* JADX INFO: loaded from: classes5.dex */
class C12375to implements InterfaceC2620du {

    /* JADX INFO: renamed from: k4 */
    private Bitmap f41361k4;

    /* JADX INFO: renamed from: kk */
    private short[] f41362kk;

    /* JADX INFO: renamed from: x1 */
    private ShortBuffer f41363x1;

    public C12375to(Bitmap bitmap) {
        this.f41361k4 = bitmap;
        short[] sArr = new short[bitmap.getByteCount() / 2];
        this.f41362kk = sArr;
        ShortBuffer shortBufferWrap = ShortBuffer.wrap(sArr);
        this.f41363x1 = shortBufferWrap;
        this.f41361k4.copyPixelsToBuffer(shortBufferWrap);
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2625kk
    /* JADX INFO: renamed from: k4 */
    public int mo11994k4(int i) {
        return this.f41362kk[i];
    }

    /* JADX INFO: renamed from: kk */
    public short[] m57965kk() {
        return this.f41362kk;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2625kk
    /* JADX INFO: renamed from: x1 */
    public void mo11997x1() {
        this.f41361k4 = null;
        this.f41363x1 = null;
        this.f41362kk = null;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2625kk
    /* JADX INFO: renamed from: k4 */
    public void mo11995k4() {
        this.f41363x1.clear();
        this.f41361k4.copyPixelsFromBuffer(this.f41363x1);
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2625kk
    /* JADX INFO: renamed from: k4 */
    public void mo11996k4(int i, int i2) {
        this.f41362kk[i] = (short) i2;
    }
}
