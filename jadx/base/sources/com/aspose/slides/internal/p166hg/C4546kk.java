package com.aspose.slides.internal.p166hg;

import com.aspose.slides.internal.p029au.AbstractC1562k4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p118ex.C3813ck;
import com.aspose.slides.internal.p118ex.C3817h4;
import com.aspose.slides.internal.p118ex.C3819jd;
import com.aspose.slides.internal.p118ex.C3823m9;
import com.aspose.slides.internal.p474wg.C11975um;
import com.aspose.slides.internal.p474wg.C11980vj;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4546kk extends C4566up {

    /* JADX INFO: renamed from: ck */
    private C11975um f12681ck;

    /* JADX INFO: renamed from: fa */
    private int f12682fa;

    public C4546kk(AbstractC3150x6 abstractC3150x6, C3819jd c3819jd, C11975um c11975um, byte[] bArr) {
        super(abstractC3150x6, c11975um.m56209k4().m66678du(), false, C11980vj.m56255kk(), c3819jd);
        this.f12681ck = c11975um;
        this.f12682fa = 0;
        if (bArr != null) {
            m18861x1().write(bArr, 0, bArr.length);
        }
        super.m18710k4(C11980vj.m56257x1());
        ((C4566up) this).f12750x1.mo27432x1(new C4561to(this));
        ((C4566up) this).f12747kk.mo27432x1(new C4533du(this));
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m18762k4() {
        switch (this.f12682fa) {
            case -2146762487:
            case -2146762486:
                return true;
            default:
                return false;
        }
    }

    @Override // com.aspose.slides.internal.p166hg.C4566up
    /* JADX INFO: renamed from: k4 */
    public boolean mo18763k4(C3817h4 c3817h4, int[] iArr) {
        AbstractC1562k4 abstractC1562k4M56256to;
        boolean z = true;
        boolean z2 = iArr.length > 0;
        this.f12682fa = z2 ? iArr[0] : 0;
        if (C11980vj.m56253k4() == null) {
            z = z2;
        } else if (!C11980vj.m56253k4().mo55905k4(this.f12681ck.m56236wl(), c3817h4, this.f12681ck, this.f12682fa)) {
            return false;
        }
        if (m18860to() || (abstractC1562k4M56256to = C11980vj.m56256to()) == null) {
            return z;
        }
        int length = iArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            i = i3 == -2146762490 ? i | 1 : i3 == -2146762481 ? i | 2 : i | 4;
        }
        C3823m9 c3823m9 = new C3823m9(c3817h4.m15278ck());
        C3813ck c3813ck = new C3813ck();
        if (!c3813ck.m15254k4(c3823m9)) {
            i |= 4;
        }
        return abstractC1562k4M56256to.m8351k4(this.f12681ck, c3823m9, c3813ck, i);
    }
}
