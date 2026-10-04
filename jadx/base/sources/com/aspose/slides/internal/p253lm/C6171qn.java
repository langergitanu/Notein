package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12381h4;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.qn */
/* JADX INFO: loaded from: classes4.dex */
public class C6171qn extends C6198wp {

    /* JADX INFO: renamed from: to */
    private InterfaceC6173qw f17417to;

    public C6171qn(InterfaceC6173qw interfaceC6173qw, String str, C6116bs c6116bs) {
        super(c6116bs);
        ((C6198wp) this).f17519k4 = str;
        this.f17417to = interfaceC6173qw;
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC6123ca abstractC6123caM24963kk;
        if ("toString".equals(((C6198wp) this).f17519k4) || "toLocaleString".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24963kk = m24962k4(abstractC6211yd, abstractC6123caArr);
        } else if ("lastIndex".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24963kk = m24961k4((C6195vw) C7019kk.m27452k4((Object) abstractC6211yd, C6195vw.class), abstractC6123caArr);
        } else if ("exec".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24963kk = m24964x1((C6195vw) C7019kk.m27452k4((Object) abstractC6211yd, C6195vw.class), abstractC6123caArr);
        } else {
            if (!"test".equals(((C6198wp) this).f17519k4)) {
                throw new C6208y2("unknown error function");
            }
            abstractC6123caM24963kk = m24963kk((C6195vw) C7019kk.m27452k4((Object) abstractC6211yd, C6195vw.class), abstractC6123caArr);
        }
        interfaceC6132em.mo10079x1(abstractC6123caM24963kk);
        return abstractC6123caM24963kk;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC6123ca m24963kk(C6195vw c6195vw, AbstractC6123ca[] abstractC6123caArr) {
        return this.f17417to.mo24972ks().m25189k4(m24964x1(c6195vw, abstractC6123caArr) != C6185u1.f17479k4);
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    public String toString() {
        return C14113y2.m67402k4("function {0}", m25131fa());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1 A[DONT_GENERATE, PHI: r10
      0x00c1: PHI (r10v6 java.util.Iterator<com.aspose.slides.internal.x4.to>) = 
      (r10v4 java.util.Iterator<com.aspose.slides.internal.x4.to>)
      (r10v11 java.util.Iterator<com.aspose.slides.internal.x4.to>)
     binds: [B:28:0x00bf, B:14:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC6123ca m24964x1(C6195vw c6195vw, AbstractC6123ca[] abstractC6123caArr) {
        Iterator<C12385to> it;
        C6182to c6182toM24811m9 = this.f17417to.mo24983yj().m24811m9();
        String string = abstractC6123caArr[0].toString();
        c6182toM24811m9.mo25037k4("input", this.f17417to.mo24980v4().m25068h4(string));
        C12381h4 c12381h4M57980x1 = C12380dy.m57980x1(string, c6195vw.m25129up(), c6195vw.m25128ks());
        if (c12381h4M57980x1.m57991k4() <= 0) {
            return c6182toM24811m9;
        }
        if (c6195vw.m25127jd()) {
            it = c12381h4M57980x1.iterator();
            int i = 0;
            while (it.hasNext()) {
                try {
                    int i2 = i + 1;
                    c6182toM24811m9.mo25035k4(this.f17417to.mo24977um().m25186k4(i), this.f17417to.mo24980v4().m25068h4(it.next().mo57995kk()));
                    i = i2;
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            }
        } else {
            it = c12381h4M57980x1.m57992k4(0).m58004du().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                try {
                    int i4 = i3 + 1;
                    c6182toM24811m9.mo25035k4(this.f17417to.mo24977um().m25186k4(i3), this.f17417to.mo24980v4().m25068h4(it.next().mo57995kk()));
                    i3 = i4;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                }
            }
        }
        c6182toM24811m9.mo25037k4(FirebaseAnalytics.Param.INDEX, this.f17417to.mo24977um().m25186k4(c12381h4M57980x1.m57992k4(0).mo57994k4()));
        return c6182toM24811m9;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC6123ca m24961k4(C6195vw c6195vw, AbstractC6123ca[] abstractC6123caArr) {
        return c6195vw.mo25032k4("lastIndex");
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6123ca m24962k4(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return this.f17417to.mo24980v4().m25068h4(abstractC6211yd.toString());
    }
}
