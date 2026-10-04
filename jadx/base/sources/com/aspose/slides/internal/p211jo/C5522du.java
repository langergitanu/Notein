package com.aspose.slides.internal.p211jo;

import com.aspose.slides.internal.p061cc.AbstractC2417k4;
import com.aspose.slides.internal.p166hg.AbstractC4523ai;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p174hz.C4779zj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p525yi.C12824h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.jo.du */
/* JADX INFO: loaded from: classes.dex */
public class C5522du extends AbstractC2417k4 {
    public C5522du(AbstractC4523ai abstractC4523ai) {
        super(abstractC4523ai, (byte) 16);
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: c5 */
    public void mo11833c5() {
        m22590k4(false);
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: jd */
    public void mo11837jd() {
        m22590k4(true);
    }

    /* JADX INFO: renamed from: k4 */
    public void m22590k4(boolean z) {
        AbstractC4751tq abstractC4751tqM18773kk;
        byte[] bArrM18886ix = m11834ck().m18684xk().m18754k4().m18886ix();
        if (m11834ck().m18632ck().m18772k4()) {
            abstractC4751tqM18773kk = new C12824h4();
            abstractC4751tqM18773kk.mo19639k4(m11834ck().m18632ck().m18774to().Clone());
        } else {
            abstractC4751tqM18773kk = m11834ck().m18632ck().m18773kk();
        }
        byte[] bArrM19841k4 = new C4779zj(abstractC4751tqM18773kk).m19841k4(bArrM18886ix);
        if (z) {
            m18741k4(C7019kk.m27468x1(Integer.valueOf(bArrM19841k4.length), 9));
        }
        m18742k4(bArrM19841k4);
        m11834ck().m18684xk().m18754k4().mo18734k4(bArrM18886ix);
        m11834ck().m18684xk().m18754k4().mo18733k4();
        abstractC4751tqM18773kk.m19594x1();
    }
}
