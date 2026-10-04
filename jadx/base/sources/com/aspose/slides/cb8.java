package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: loaded from: classes3.dex */
class cb8 implements IDisposable {

    /* JADX INFO: renamed from: kk */
    private boolean f4302kk;

    /* JADX INFO: renamed from: x1 */
    private C11896dy f4303x1;

    /* JADX INFO: renamed from: to */
    private static final byte[] f4301to = {0, 1, 1, -127};

    /* JADX INFO: renamed from: k4 */
    public static final cb8 f4300k4 = new cb8();

    public cb8() {
        this.f4303x1 = new C11896dy();
        this.f4302kk = false;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m4533k4(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4532k4(C12026yj c12026yj, AbstractC12024x1 abstractC12024x1, C0886d8 c0886d8) {
        if (c0886d8 != null && this.f4303x1.m55525du() > 0) {
            c0886d8.m4993k4(this.f4303x1, 0.5f);
        }
        if (c0886d8 == null || this.f4303x1.m55525du() <= 0) {
            return;
        }
        c0886d8.m4992k4(this.f4303x1);
    }

    public cb8(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12025x6 c12025x64, boolean z) {
        this.f4303x1 = new C11896dy();
        this.f4302kk = false;
        byte[] bArr = (byte[]) f4301to.clone();
        if (z) {
            bArr[3] = (byte) ((bArr[3] & 255) | 128);
        }
        this.f4303x1 = new C11896dy(new C12025x6[]{c12025x6, c12025x62, c12025x63, c12025x64}, bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public void m4533k4(boolean z) {
        if (this.f4302kk) {
            return;
        }
        if (z) {
            this.f4303x1.dispose();
        }
        this.f4302kk = true;
    }
}
