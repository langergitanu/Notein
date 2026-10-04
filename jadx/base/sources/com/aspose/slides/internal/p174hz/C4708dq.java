package com.aspose.slides.internal.p174hz;

import com.aspose.slides.internal.p525yi.C12834rv;
import com.aspose.slides.internal.p525yi.C12843x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.dq */
/* JADX INFO: loaded from: classes.dex */
public class C4708dq extends AbstractC4732lr {

    /* JADX INFO: renamed from: k4 */
    static boolean f13131k4 = "1".equals(C12834rv.m59677k4());

    /* JADX INFO: renamed from: h4 */
    private boolean f13132h4;

    public C4708dq() {
        this(C12843x6.m59721k4(8));
        m19589x1(f13131k4);
    }

    /* JADX INFO: renamed from: x1 */
    public void m19589x1(boolean z) {
        this.f13132h4 = z;
        m19675k4(z ? 64 : 128);
    }

    public C4708dq(byte[] bArr) {
        m19589x1(f13131k4);
        m19676k4("SHA384");
        this.f13126kk = 384;
        mo19577k4(bArr);
    }
}
