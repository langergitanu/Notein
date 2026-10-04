package com.aspose.slides.internal.p077d8;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.u1 */
/* JADX INFO: loaded from: classes3.dex */
class C3090u1 {

    /* JADX INFO: renamed from: k4 */
    private final byte[] f9176k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f9177x1;

    public C3090u1(byte[] bArr) {
        this.f9176k4 = bArr;
        m13129to();
    }

    /* JADX INFO: renamed from: to */
    private void m13129to() {
        if (this.f9176k4.length < 8) {
            return;
        }
        C3152yj c3152yj = new C3152yj(this.f9176k4);
        try {
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            try {
                c3134k4.m13384uz();
                if (m13128k4(c3134k4.m13384uz())) {
                    this.f9177x1 = true;
                }
            } finally {
                c3134k4.dispose();
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13130k4() {
        return this.f9177x1;
    }

    /* JADX INFO: renamed from: kk */
    public final String m13131kk() {
        return "mp4";
    }

    /* JADX INFO: renamed from: x1 */
    public final String m13132x1() {
        return "video/mp4";
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m13128k4(long j) {
        return "ftyp".equals(AbstractC6747ar.m26635ix().m26681x1(C14069jd.m66776k4(j)));
    }
}
