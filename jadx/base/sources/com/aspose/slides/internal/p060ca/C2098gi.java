package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.gi */
/* JADX INFO: loaded from: classes3.dex */
class C2098gi implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f7242k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f7243x1;

    public C2098gi(AbstractC3150x6 abstractC3150x6) {
        this(abstractC3150x6, true);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        if (this.f7243x1) {
            this.f7242k4.close();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10588k4(byte b) {
        this.f7242k4.writeByte(b);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10593x1(byte b) {
        this.f7242k4.writeByte(b);
    }

    public C2098gi(AbstractC3150x6 abstractC3150x6, boolean z) {
        this.f7242k4 = abstractC3150x6;
        this.f7243x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10589k4(int i) {
        this.f7242k4.writeByte((byte) (C7019kk.m27457kk(Integer.valueOf(i), 8) >> 8));
        this.f7242k4.writeByte(C7019kk.m27442k4(Integer.valueOf(i), 8));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10590k4(int i, int i2) {
        while (true) {
            int i3 = i - 1;
            if (i <= 0) {
                return;
            }
            this.f7242k4.writeByte((byte) (i2 >> (i * 8)));
            i = i3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10591k4(long j) {
        this.f7242k4.seek(j, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10592k4(byte[] bArr) {
        this.f7242k4.write(bArr, 0, bArr.length);
    }
}
