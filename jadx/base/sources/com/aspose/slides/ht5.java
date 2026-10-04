package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C8629qv;

/* JADX INFO: loaded from: classes3.dex */
class ht5 {
    /* JADX INFO: renamed from: k4 */
    public static ohe m7291k4(C8629qv c8629qv) {
        if (c8629qv == null) {
            return new ohe(oju.f47834kk.Clone(), oju.f47835to.Clone());
        }
        oju ojuVar = new oju(c8629qv.m39690k4() / 100.0f, c8629qv.m39696x1() / 100.0f);
        return new ohe(ojuVar.Clone(), oju.m68622x1(new oju(1.0f - (c8629qv.m39692kk() / 100.0f), 1.0f - (c8629qv.m39694to() / 100.0f)), ojuVar).Clone().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7292k4(ohe oheVar, AbstractC4685kk<C8629qv> abstractC4685kk) {
        C8629qv c8629qvInvoke = abstractC4685kk.invoke();
        if (bia.m4216x1(oheVar.Clone())) {
            m7293k4(oheVar.Clone(), c8629qvInvoke);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7293k4(ohe oheVar, C8629qv c8629qv) {
        c8629qv.m39691k4(oheVar.f47808k4.f47836k4 * 100.0f);
        c8629qv.m39697x1(oheVar.f47808k4.f47837x1 * 100.0f);
        oju ojuVarClone = oheVar.m68567k4().Clone();
        c8629qv.m39693kk((1.0f - ojuVarClone.f47836k4) * 100.0f);
        c8629qv.m39695to((1.0f - ojuVarClone.f47837x1) * 100.0f);
    }
}
