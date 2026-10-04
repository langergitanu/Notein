package com.aspose.slides.internal.p211jo;

import com.aspose.slides.internal.p061cc.AbstractC2417k4;
import com.aspose.slides.internal.p118ex.C3817h4;
import com.aspose.slides.internal.p166hg.AbstractC4523ai;
import com.aspose.slides.internal.p166hg.C4540gi;
import com.aspose.slides.internal.p166hg.C4562tq;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.jo.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5526k4 extends AbstractC2417k4 {

    /* JADX INFO: renamed from: k4 */
    private boolean f15064k4;

    /* JADX INFO: renamed from: x1 */
    private C3817h4 f15065x1;

    public C5526k4(AbstractC4523ai abstractC4523ai) {
        super(abstractC4523ai, (byte) 11);
    }

    /* JADX INFO: renamed from: k4 */
    private C3817h4 m22598k4(C3817h4 c3817h4) {
        if (C14113y2.m67363du(c3817h4.m15277c5(), c3817h4.m15280dy())) {
            return null;
        }
        for (C3817h4 c3817h42 : m11834ck().m18639fa().m18841x1()) {
            if (C14113y2.m67363du(c3817h4.m15277c5(), c3817h4.m15280dy())) {
                return c3817h42;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: rv */
    private void m22599rv() {
        C4562tq c4562tq = (C4562tq) m11834ck();
        if (c4562tq.m18639fa().m18841x1() != null && c4562tq.m18639fa().m18841x1().size() > 0) {
            this.f15065x1 = c4562tq.m18842k4().m18862x1(m11834ck().m18639fa().m18841x1(), new C3817h4(m11834ck().m18632ck().m18775x1().get_Item(0).m52823c5()), m11834ck().m18639fa().m18835k4(), null);
        }
        c4562tq.m18639fa().m18836k4(this.f15065x1);
    }

    /* JADX INFO: renamed from: x6 */
    private void m22600x6() {
        C4540gi c4540gi = new C4540gi();
        C3817h4 c3817h4M22601m9 = m22601m9();
        while (c3817h4M22601m9 != null) {
            byte[] bArrM15278ck = c3817h4M22601m9.m15278ck();
            c4540gi.m18749x1(bArrM15278ck.length);
            c4540gi.m18742k4(bArrM15278ck);
            c3817h4M22601m9 = m22598k4(c3817h4M22601m9);
        }
        m18749x1(C7019kk.m27462to(Long.valueOf(c4540gi.getLength()), 11));
        m18742k4(c4540gi.m18739h4());
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: c5 */
    public void mo11833c5() {
        if (m22601m9() != null) {
            m22600x6();
        }
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: dy */
    public void mo11835dy() {
        super.mo11835dy();
        m18738du();
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: jd */
    public void mo11837jd() {
        if (m22601m9() != null) {
            m22600x6();
        } else {
            m18749x1(0);
        }
    }

    /* JADX INFO: renamed from: m9 */
    public C3817h4 m22601m9() {
        if (!this.f15064k4) {
            m22599rv();
            this.f15064k4 = true;
        }
        return this.f15065x1;
    }
}
