package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.AbstractC4941wp;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.AbstractC5558v4;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.g8 */
/* JADX INFO: loaded from: classes4.dex */
public class C6636g8 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18387k4 = C7019kk.m27443k4((Class<?>) AbstractC4941wp.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18388x1 = new C7017h4("get_length", "Item", "namedItem");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC4941wp abstractC4941wp = (AbstractC4941wp) abstractC6123ca.mo24769C_();
        int iM27428k4 = f18388x1.m27428k4(str);
        if (iM27428k4 == 0) {
            return m10082k4(abstractC4941wp.mo20312k4());
        }
        if (iM27428k4 == 1) {
            if (abstractC6123caArr.length == 1) {
                return m10084k4(abstractC4941wp.mo20314k4(abstractC6123caArr[0].m24794wy()), C7019kk.m27443k4((Class<?>) AbstractC5535bv.class));
            }
            throw new C6208y2("invalid arguments count.");
        }
        if (iM27428k4 != 2) {
            throw new C6208y2("unknown function");
        }
        if (abstractC6123caArr.length == 1) {
            return m10084k4(abstractC4941wp.mo20519k4(abstractC6123caArr[0].toString()), C7019kk.m27443k4((Class<?>) AbstractC5535bv.class));
        }
        throw new C6208y2("invalid arguments count.");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) AbstractC5558v4.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("NamedItem");
        m10035kk("Item");
        m10033k4("length", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18387k4;
    }
}
