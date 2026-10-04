package com.aspose.slides.internal.p253lm;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6150k4 extends C6198wp {
    public C6150k4(C6179ss c6179ss) {
        super(c6179ss.m25138rv());
        m25174k4("length", c6179ss.m24965ck().mo24977um().m25186k4(2.0d), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        Object objMo10078to;
        AbstractC6123ca[] abstractC6123caArr2;
        AbstractC6123ca abstractC6123ca;
        AbstractC6123ca abstractC6123ca2;
        C6198wp c6198wp = (C6198wp) C7019kk.m27452k4((Object) abstractC6211yd, C6198wp.class);
        if (c6198wp == null) {
            throw new ArgumentException("the target of call() must be a function");
        }
        if (abstractC6123caArr.length < 1 || (abstractC6123ca2 = abstractC6123caArr[0]) == C6163nh.f17403k4) {
            objMo10078to = interfaceC6132em.mo10078to();
        } else {
            objMo10078to = abstractC6123ca2;
            if (abstractC6123ca2 == C6185u1.f17479k4) {
            }
        }
        AbstractC6211yd abstractC6211yd2 = (AbstractC6211yd) C7019kk.m27452k4(objMo10078to, AbstractC6211yd.class);
        if (abstractC6123caArr.length < 2 || (abstractC6123ca = abstractC6123caArr[1]) == C6185u1.f17479k4) {
            abstractC6123caArr2 = AbstractC6123ca.f17309kk;
        } else {
            C6116bs c6116bs = (C6116bs) C7019kk.m27452k4((Object) abstractC6123ca, C6116bs.class);
            if (c6116bs == null) {
                throw new C6158m4(interfaceC6132em.mo10078to().mo24981wl().m25165h4("second argument must be an array"));
            }
            abstractC6123caArr2 = new AbstractC6123ca[c6116bs.mo24948kk()];
            for (int i = 0; i < c6116bs.mo24948kk(); i++) {
                abstractC6123caArr2[i] = c6116bs.mo25032k4(C14057f9.m66591x1(i));
            }
        }
        interfaceC6132em.mo10069k4(c6198wp, abstractC6211yd2, abstractC6123caArr2);
        return interfaceC6132em.mo10039c5();
    }
}
