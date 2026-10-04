package com.aspose.slides.internal.p174hz;

import com.aspose.slides.internal.p525yi.C12834rv;
import com.aspose.slides.internal.p525yi.C12843x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.xk */
/* JADX INFO: loaded from: classes.dex */
public class C4769xk extends AbstractC4732lr {

    /* JADX INFO: renamed from: k4 */
    static boolean f13333k4 = "1".equals(C12834rv.m59677k4());

    /* JADX INFO: renamed from: h4 */
    private boolean f13334h4;

    public C4769xk() {
        this(C12843x6.m59721k4(8));
        m19821x1(f13333k4);
    }

    /* JADX INFO: renamed from: x1 */
    public void m19821x1(boolean z) {
        this.f13334h4 = z;
        m19675k4(z ? 64 : 128);
    }

    public C4769xk(byte[] bArr) {
        m19821x1(f13333k4);
        m19676k4("SHA512");
        this.f13126kk = 512;
        mo19577k4(bArr);
    }
}
