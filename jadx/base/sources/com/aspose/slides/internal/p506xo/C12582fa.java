package com.aspose.slides.internal.p506xo;

import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p060ca.AbstractC2313tw;
import com.aspose.slides.internal.p060ca.C2033cj;
import com.aspose.slides.internal.p060ca.C2096ga;
import com.aspose.slides.internal.p060ca.C2286s7;
import com.aspose.slides.internal.p060ca.C2350wl;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p333p8.C9427jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.xo.fa */
/* JADX INFO: loaded from: classes5.dex */
public class C12582fa extends AbstractC12578c5 {
    public C12582fa(C7187kk c7187kk) {
        super(c7187kk);
        m58736k4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m58736k4() {
        try {
            AbstractC2313tw abstractC2313twM11469k4 = AbstractC2313tw.m11469k4(new C2033cj(2, new C2350wl(m58738wl())));
            if (abstractC2313twM11469k4 != null) {
                C7019kk.m27469x1(abstractC2313twM11469k4, C2286s7.class);
            }
        } catch (C2096ga unused) {
        }
    }

    /* JADX INFO: renamed from: m9 */
    private String m58737m9(byte[] bArr, int i, int i2) {
        if (m58776x6().mo58729h4() != null) {
            return null;
        }
        return m58773to(bArr, i, i2);
    }

    /* JADX INFO: renamed from: wl */
    private byte[] m58738wl() {
        C9427jd c9427jdM58739fa;
        AbstractC12580du abstractC12580duM58776x6 = m58776x6();
        if (abstractC12580duM58776x6 == null || !C7019kk.m27469x1(abstractC12580duM58776x6, C12583h4.class) || (c9427jdM58739fa = ((C12583h4) abstractC12580duM58776x6).m58739fa()) == null) {
            throw new IOException();
        }
        return c9427jdM58739fa.m46154k4();
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12578c5, com.aspose.slides.internal.p506xo.AbstractC12588to
    /* JADX INFO: renamed from: kk */
    public String mo58718kk(byte[] bArr, int i, int i2) {
        String strM58737m9 = m58737m9(bArr, i, i2);
        if (strM58737m9 == null) {
            return null;
        }
        return strM58737m9;
    }
}
