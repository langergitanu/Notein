package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.C5537ck;
import com.aspose.slides.internal.p213jw.C5544jd;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C11255dy extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38816k4 = C7019kk.m27443k4((Class<?>) C5537ck.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38817x1 = new C7017h4("item", "get_length");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C5537ck c5537ck = (C5537ck) abstractC6123ca.mo24769C_();
        int iM27428k4 = f38817x1.m27428k4(str);
        if (iM27428k4 != 0) {
            if (iM27428k4 == 1) {
                return m10082k4(c5537ck.m22681k4());
            }
            throw new C6208y2("unknown function");
        }
        if (abstractC6123caArr.length == 1) {
            return m10084k4(c5537ck.m22682k4(abstractC6123caArr[0].m24794wy()), C7019kk.m27443k4((Class<?>) C5544jd.class));
        }
        throw new C6208y2("invalid arguments count.");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("item");
        m10033k4("length", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38816k4;
    }
}
