package com.aspose.slides.internal.p253lm;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C6204x6 extends C6198wp {
    public C6204x6(C6179ss c6179ss) {
        super(c6179ss.m25138rv());
        m25174k4("length", c6179ss.m24965ck().mo24977um().m25186k4(1.0d), 1);
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
        C6198wp c6198wp = (C6198wp) C7019kk.m27452k4((Object) abstractC6211yd, C6198wp.class);
        if (c6198wp == null) {
            throw new ArgumentException("the target of call() must be a function");
        }
        if (abstractC6123caArr.length < 1 || (abstractC6123ca = abstractC6123caArr[0]) == C6163nh.f17403k4) {
            objMo10078to = interfaceC6132em.mo10078to();
        } else {
            objMo10078to = abstractC6123ca;
            if (abstractC6123ca == C6185u1.f17479k4) {
            }
        }
        AbstractC6211yd abstractC6211yd2 = (AbstractC6211yd) C7019kk.m27452k4(objMo10078to, AbstractC6211yd.class);
        if (abstractC6123caArr.length < 2 || abstractC6123caArr[1] == C6185u1.f17479k4) {
            abstractC6123caArr2 = AbstractC6123ca.f17309kk;
        } else {
            abstractC6123caArr2 = new AbstractC6123ca[abstractC6123caArr.length - 1];
            System.arraycopy(abstractC6123caArr, 1, abstractC6123caArr2, 0, abstractC6123caArr.length - 1);
        }
        interfaceC6132em.mo10069k4(c6198wp, abstractC6211yd2, abstractC6123caArr2);
        return interfaceC6132em.mo10039c5();
    }
}
