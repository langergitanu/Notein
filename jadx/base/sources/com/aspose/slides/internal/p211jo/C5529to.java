package com.aspose.slides.internal.p211jo;

import com.aspose.slides.internal.p061cc.AbstractC2417k4;
import com.aspose.slides.internal.p166hg.AbstractC4523ai;
import com.aspose.slides.internal.p166hg.C4540gi;
import com.aspose.slides.internal.p166hg.C4562tq;
import com.aspose.slides.internal.p166hg.C4571w6;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p474wg.C11972ts;

/* JADX INFO: renamed from: com.aspose.slides.internal.jo.to */
/* JADX INFO: loaded from: classes.dex */
public class C5529to extends AbstractC2417k4 {

    /* JADX INFO: renamed from: k4 */
    private byte[] f15069k4;

    public C5529to(AbstractC4523ai abstractC4523ai) {
        super(abstractC4523ai, (byte) 1);
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: c5 */
    public void mo11833c5() {
        m18741k4(m11834ck().m18637dy());
        C4540gi c4540gi = new C4540gi();
        c4540gi.m18746kk(m11834ck().m18677wy());
        c4540gi.m18742k4(m11834ck().m18669to(28));
        this.f15069k4 = c4540gi.m18739h4();
        c4540gi.m18738du();
        m18742k4(this.f15069k4);
        m11834ck().m18653k4(C4571w6.m18908k4(m11834ck().m18639fa().m18835k4()));
        if (m11834ck().m18630c5() != null) {
            m18740k4(C7019kk.m27442k4(Integer.valueOf(m11834ck().m18630c5().length), 9));
            if (m11834ck().m18630c5().length > 0) {
                m18742k4(m11834ck().m18630c5());
            }
        } else {
            m18740k4(C7019kk.m27442k4((Object) 0, 9));
        }
        m18741k4(C7019kk.m27468x1(Integer.valueOf(m11834ck().m18683x6().size() * 2), 9));
        for (int i = 0; i < m11834ck().m18683x6().size(); i++) {
            m18741k4(m11834ck().m18683x6().get_Item(i).m18887jd());
        }
        m18740k4(C7019kk.m27442k4((Object) 1, 9));
        m18740k4((byte) m11834ck().m18644jd());
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: dy */
    public void mo11835dy() {
        C4562tq c4562tq = (C4562tq) m11834ck();
        super.mo11835dy();
        c4562tq.m18682x1(this.f15069k4);
        c4562tq.m18843k4(m11834ck().m18637dy());
        this.f15069k4 = null;
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: jd */
    public void mo11837jd() {
        mo11833c5();
        String strM18835k4 = m11834ck().m18639fa().m18835k4();
        if (C11972ts.m56134k4(strM18835k4, new C11972ts[]{null})) {
            return;
        }
        C4540gi c4540gi = new C4540gi();
        byte[] bArrMo26677to = AbstractC6747ar.m26635ix().mo26677to(strM18835k4);
        c4540gi.m18741k4(C7019kk.m27468x1((Object) 0, 9));
        c4540gi.m18741k4(C7019kk.m27468x1(Integer.valueOf(bArrMo26677to.length + 5), 9));
        c4540gi.m18741k4(C7019kk.m27468x1(Integer.valueOf(bArrMo26677to.length + 3), 9));
        c4540gi.m18740k4(C7019kk.m27442k4((Object) 0, 9));
        c4540gi.m18741k4(C7019kk.m27468x1(Integer.valueOf(bArrMo26677to.length), 9));
        c4540gi.m18742k4(bArrMo26677to);
        m18741k4(C7019kk.m27468x1(Long.valueOf(c4540gi.getLength()), 11));
        m18742k4(c4540gi.m18739h4());
    }
}
