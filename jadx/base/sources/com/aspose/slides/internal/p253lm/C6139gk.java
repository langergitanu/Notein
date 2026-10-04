package com.aspose.slides.internal.p253lm;

import com.aspose.slides.p559ms.System.C14050ca;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.gk */
/* JADX INFO: loaded from: classes4.dex */
public class C6139gk extends C6198wp {

    /* JADX INFO: renamed from: du */
    private C14050ca f17347du;

    /* JADX INFO: renamed from: to */
    private InterfaceC6173qw f17348to;

    public C6139gk(InterfaceC6173qw interfaceC6173qw, String str, C6116bs c6116bs) {
        super(c6116bs);
        this.f17347du = new C14050ca();
        ((C6198wp) this).f17519k4 = str;
        this.f17348to = interfaceC6173qw;
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        C6212yg c6212ygMo24977um;
        double dM67466c5;
        if ("abs".equals(((C6198wp) this).f17519k4)) {
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = C14116yg.m67475k4(abstractC6123caArr[0].mo24775x1());
        } else if ("asin".equals(((C6198wp) this).f17519k4)) {
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = C14116yg.m67467ck(abstractC6123caArr[0].mo24775x1());
        } else if ("atan".equals(((C6198wp) this).f17519k4)) {
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = C14116yg.m67471fa(abstractC6123caArr[0].mo24775x1());
        } else if ("atan2".equals(((C6198wp) this).f17519k4)) {
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = C14116yg.m67498to(abstractC6123caArr[0].mo24775x1(), abstractC6123caArr[1].mo24775x1());
        } else if ("ceil".equals(((C6198wp) this).f17519k4)) {
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = C14116yg.m67501x1(abstractC6123caArr[0].mo24775x1());
        } else if ("cos".equals(((C6198wp) this).f17519k4)) {
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = C14116yg.m67470dy(abstractC6123caArr[0].mo24775x1());
        } else if ("exp".equals(((C6198wp) this).f17519k4)) {
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = C14116yg.m67500up(abstractC6123caArr[0].mo24775x1());
        } else if ("floor".equals(((C6198wp) this).f17519k4)) {
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = C14116yg.m67490kk(abstractC6123caArr[0].mo24775x1());
        } else if ("log".equals(((C6198wp) this).f17519k4)) {
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = C14116yg.m67511yj(abstractC6123caArr[0].mo24775x1());
        } else if ("max".equals(((C6198wp) this).f17519k4)) {
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = C14116yg.m67502x1(abstractC6123caArr[0].mo24775x1(), abstractC6123caArr[1].mo24775x1());
        } else if ("min".equals(((C6198wp) this).f17519k4)) {
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = C14116yg.m67491kk(abstractC6123caArr[0].mo24775x1(), abstractC6123caArr[1].mo24775x1());
        } else if ("pow".equals(((C6198wp) this).f17519k4)) {
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = C14116yg.m67469du(abstractC6123caArr[0].mo24775x1(), abstractC6123caArr[1].mo24775x1());
        } else if ("random".equals(((C6198wp) this).f17519k4)) {
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = this.f17347du.m66551x1();
        } else if ("round".equals(((C6198wp) this).f17519k4)) {
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = C14116yg.m67497to(abstractC6123caArr[0].mo24775x1());
        } else if ("sin".equals(((C6198wp) this).f17519k4)) {
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = C14116yg.m67495m9(abstractC6123caArr[0].mo24775x1());
        } else if ("sqrt".equals(((C6198wp) this).f17519k4)) {
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = C14116yg.m67496rv(abstractC6123caArr[0].mo24775x1());
        } else {
            if (!"tan".equals(((C6198wp) this).f17519k4)) {
                throw new C6208y2("unknown math function");
            }
            c6212ygMo24977um = this.f17348to.mo24977um();
            dM67466c5 = C14116yg.m67466c5(abstractC6123caArr[0].mo24775x1());
        }
        C6214yn c6214ynM25186k4 = c6212ygMo24977um.m25186k4(dM67466c5);
        interfaceC6132em.mo10079x1(c6214ynM25186k4);
        return c6214ynM25186k4;
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    public String toString() {
        return C14113y2.m67402k4("function {0}", m25131fa());
    }
}
