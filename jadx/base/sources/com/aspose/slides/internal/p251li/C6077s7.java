package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p396sc.C10181e0;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.s7 */
/* JADX INFO: loaded from: classes4.dex */
public class C6077s7 extends AbstractC6053e0 {
    public C6077s7() {
        m24449x1((short) 16414);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24615k4(byte b) {
        mo24437k4((short) (mo24431G_() & (-255)));
        mo24437k4((short) ((((byte) ((b & 255) << 1)) & 255) | mo24431G_()));
    }

    /* JADX INFO: renamed from: kk */
    public final byte m24617kk() {
        return (byte) ((mo24431G_() & 254) >> 1);
    }

    /* JADX INFO: renamed from: to */
    public final boolean m24618to() {
        return m24433h4(0);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, SmoothingMode: {1}, AntiAliasing: {2}", super.toString(), C14042ak.m66410k4(C10181e0.class, m24617kk()), Boolean.valueOf(m24618to()));
    }

    public C6077s7(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24616k4(boolean z) {
        m24436k4(0, z);
    }
}
