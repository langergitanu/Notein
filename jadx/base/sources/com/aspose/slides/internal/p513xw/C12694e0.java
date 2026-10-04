package com.aspose.slides.internal.p513xw;

import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p294n9.C6765kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.e0 */
/* JADX INFO: loaded from: classes5.dex */
public class C12694e0 extends AbstractC12729ts {

    /* JADX INFO: renamed from: k4 */
    private int f42228k4;

    /* JADX INFO: renamed from: kk */
    private C12700h4 f42229kk;

    /* JADX INFO: renamed from: x1 */
    private int f42230x1;

    public C12694e0(int i, int i2, int i3, C12700h4 c12700h4, C12717os c12717os, boolean z) {
        super(i, c12717os, z);
        this.f42228k4 = i2;
        this.f42230x1 = i3;
        this.f42229kk = c12700h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12700h4 m58929h4() {
        return this.f42229kk;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12729ts
    /* JADX INFO: renamed from: ix */
    public int mo58930ix() {
        return this.f42230x1;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12729ts
    /* JADX INFO: renamed from: ne */
    public int mo58931ne() {
        return this.f42228k4;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp(64);
        if (m59251ks()) {
            c6765kp.m26792k4("aux. ");
        }
        c6765kp.m26792k4("glue");
        c6765kp.m26792k4(" w=").m26805kk(m59252rv());
        c6765kp.m26792k4(" stretch=").m26805kk(mo58931ne());
        c6765kp.m26792k4(" shrink=").m26805kk(mo58930ix());
        if (!m58929h4().equals(C12700h4.f42239k4)) {
            c6765kp.m26792k4(" adj-class=").m26791k4(m58929h4());
        }
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12723s7
    /* JADX INFO: renamed from: x_ */
    public boolean mo58932x_() {
        return true;
    }

    public C12694e0(int i, int i2, int i3, C12717os c12717os, boolean z) {
        super(i, c12717os, z);
        this.f42228k4 = i2;
        this.f42230x1 = i3;
        this.f42229kk = C12700h4.f42239k4;
    }

    public C12694e0(C1375h4 c1375h4, C12717os c12717os, boolean z) {
        super(c1375h4.m8163x1(), c12717os, z);
        this.f42228k4 = c1375h4.m8149du();
        this.f42230x1 = c1375h4.m8161to();
        this.f42229kk = C12700h4.f42239k4;
    }
}
