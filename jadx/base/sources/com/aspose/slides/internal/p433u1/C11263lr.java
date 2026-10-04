package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.C5538dq;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.lr */
/* JADX INFO: loaded from: classes4.dex */
public class C11263lr extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38831k4 = C7019kk.m27443k4((Class<?>) C5538dq.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38832x1 = new C7017h4("get_TypeName", "get_TypeNamespace", "isDerivedFrom");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C5538dq c5538dq = (C5538dq) abstractC6123ca.mo24769C_();
        int iM27428k4 = f38832x1.m27428k4(str);
        if (iM27428k4 == 0) {
            return m10085k4(c5538dq.m22684k4());
        }
        if (iM27428k4 == 1) {
            return m10085k4(c5538dq.m22686x1());
        }
        if (iM27428k4 != 2) {
            throw new C6208y2("unknown function");
        }
        if (abstractC6123caArr.length == 3) {
            return m10086k4(c5538dq.m22685k4(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString(), (byte) abstractC6123caArr[2].m24794wy()));
        }
        throw new C6208y2("invalid arguments count.");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("isDerivedFrom");
        m10033k4("typeName", 1);
        m10033k4("typeNamespace", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38831k4;
    }
}
