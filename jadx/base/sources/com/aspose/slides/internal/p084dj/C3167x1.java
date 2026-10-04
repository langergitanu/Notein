package com.aspose.slides.internal.p084dj;

import com.aspose.slides.internal.p180ib.C4804dy;
import com.aspose.slides.internal.p282mu.C6541k4;
import com.aspose.slides.internal.p472w8.C11913yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.dj.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C3167x1 {

    /* JADX INFO: renamed from: du */
    private float f9410du;

    /* JADX INFO: renamed from: h4 */
    private final float f9411h4;

    /* JADX INFO: renamed from: k4 */
    private final C4804dy f9412k4;

    /* JADX INFO: renamed from: kk */
    private float f9413kk;

    /* JADX INFO: renamed from: to */
    private boolean f9414to;

    /* JADX INFO: renamed from: x1 */
    private float f9415x1;

    public C3167x1(C11913yj c11913yj, C4804dy c4804dy, boolean z) {
        this(c11913yj, c4804dy, z, 2.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public float m13535k4(float f) {
        float fMax;
        if (f <= 0.0f) {
            f = 1.0f;
        }
        if (this.f9414to) {
            fMax = f * this.f9410du;
        } else {
            float fM19880kk = this.f9412k4.m19880kk();
            float f2 = this.f9415x1;
            float f3 = this.f9413kk;
            fMax = (f2 == f3 || f2 < f3) ? Math.max(f, this.f9411h4 / (f2 * fM19880kk)) : Math.max(f, this.f9411h4 / (f3 * fM19880kk));
        }
        return fMax * this.f9411h4;
    }

    public C3167x1(C11913yj c11913yj, C4804dy c4804dy, boolean z, float f) {
        this.f9415x1 = 1.0f;
        this.f9413kk = 1.0f;
        this.f9414to = false;
        this.f9410du = 1.0f;
        this.f9412k4 = c4804dy;
        this.f9411h4 = f;
        if (!z && c11913yj.m55761jd() != 0.0d && c11913yj.m55784up() != 0.0d) {
            this.f9415x1 = (float) c11913yj.m55761jd();
            this.f9413kk = (float) c11913yj.m55784up();
            return;
        }
        float[] fArrM26351k4 = C6541k4.m26351k4(c11913yj);
        if (fArrM26351k4.length == 2) {
            this.f9415x1 = Math.abs(fArrM26351k4[0]);
            this.f9413kk = Math.abs(fArrM26351k4[1]);
            return;
        }
        this.f9414to = true;
        float fM26355x1 = C6541k4.m26355x1(c11913yj);
        if (Math.abs(fM26355x1) > 0.0f) {
            this.f9410du = f / fM26355x1;
        }
    }
}
