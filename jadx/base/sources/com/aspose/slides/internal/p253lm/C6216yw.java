package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.yw */
/* JADX INFO: loaded from: classes4.dex */
public class C6216yw extends C6198wp {

    /* JADX INFO: renamed from: to */
    private InterfaceC6173qw f17585to;

    public C6216yw(InterfaceC6173qw interfaceC6173qw, String str, C6116bs c6116bs) {
        super(c6116bs);
        ((C6198wp) this).f17519k4 = str;
        this.f17585to = interfaceC6173qw;
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC6123ca m25194x1(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return abstractC6211yd;
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC6123ca m25195du(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (!abstractC6211yd.m25177kk(abstractC6123caArr[0])) {
            return this.f17585to.mo24972ks().m25187c5();
        }
        return this.f17585to.mo24972ks().m25189k4((abstractC6211yd.mo25031k4(abstractC6123caArr[0]).m24795yd() & 2) == 0);
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC6123ca abstractC6123caM25178ss;
        if ("toString".equals(((C6198wp) this).f17519k4) || "toLocaleString".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25178ss = m25196k4(abstractC6211yd, abstractC6123caArr);
        } else if ("valueOf".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25178ss = m25194x1(abstractC6211yd, abstractC6123caArr);
        } else if ("hasOwnProperty".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25178ss = m25198kk(abstractC6211yd, abstractC6123caArr);
        } else if ("isPrototypeOf".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25178ss = m25199to(abstractC6211yd, abstractC6123caArr);
        } else if ("propertyIsEnumerable".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25178ss = m25195du(abstractC6211yd, abstractC6123caArr);
        } else if ("getPrototypeOf".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25178ss = m25197k4(abstractC6123caArr);
        } else if ("defineProperty".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25178ss = m25200x1(abstractC6123caArr);
        } else if ("__lookupGetter__".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25178ss = m25179wp(abstractC6211yd, abstractC6123caArr);
        } else {
            if (!"__lookupSetter__".equals(((C6198wp) this).f17519k4)) {
                throw new C6208y2("unknown object function");
            }
            abstractC6123caM25178ss = m25178ss(abstractC6211yd, abstractC6123caArr);
        }
        interfaceC6132em.mo10079x1(abstractC6123caM25178ss);
        return abstractC6123caM25178ss;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC6123ca m25198kk(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return this.f17585to.mo24972ks().m25189k4(abstractC6211yd.m25177kk(abstractC6123caArr[0]));
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC6123ca m25199to(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if ("Object".equals(abstractC6211yd.mo24774to()) && m25175k4(abstractC6211yd)) {
            return this.f17585to.mo24972ks().m25188jd();
        }
        return this.f17585to.mo24972ks().m25187c5();
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    public String toString() {
        return C14113y2.m67402k4("function {0}", m25131fa());
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6123ca m25196k4(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return this.f17585to.mo24980v4().m25068h4(C14113y2.m67408k4("[object ", abstractC6211yd.mo24774to(), "]"));
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC6123ca m25200x1(AbstractC6123ca[] abstractC6123caArr) {
        AbstractC6123ca abstractC6123ca = abstractC6123caArr[0];
        if (!C7019kk.m27469x1(abstractC6123ca, AbstractC6211yd.class)) {
            throw new C6158m4(this.f17585to.mo24981wl().m25166jd());
        }
        AbstractC6211yd abstractC6211yd = (AbstractC6211yd) abstractC6123ca;
        abstractC6211yd.mo25036k4(AbstractC6155lr.m24907k4(this.f17585to, abstractC6211yd, abstractC6123caArr[1].toString(), abstractC6123caArr[2]));
        return abstractC6123ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6123ca m25197k4(AbstractC6123ca[] abstractC6123caArr) {
        if (!"Object".equals(abstractC6123caArr[0].mo24774to())) {
            throw new C6158m4(this.f17585to.mo24981wl().m25166jd());
        }
        AbstractC6211yd abstractC6211yd = (C6116bs) C7019kk.m27452k4((Object) abstractC6123caArr[0], C6116bs.class);
        if (abstractC6211yd == null) {
            abstractC6211yd = C6163nh.f17403k4;
        }
        AbstractC6211yd abstractC6211yd2 = (C6116bs) C7019kk.m27452k4((Object) abstractC6211yd.mo25032k4("constructor"), C6116bs.class);
        if (abstractC6211yd2 == null) {
            abstractC6211yd2 = C6163nh.f17403k4;
        }
        return abstractC6211yd2.mo25032k4("prototype");
    }
}
