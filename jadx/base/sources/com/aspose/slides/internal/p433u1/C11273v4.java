package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.AbstractC5539du;
import com.aspose.slides.internal.p213jw.C5532ak;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.v4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11273v4 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38847k4 = C7019kk.m27443k4((Class<?>) C5532ak.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38848x1 = new C7017h4("splitText", "get_elementContentWhitespace", "get_wholeText", "replaceWholeText");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C5532ak c5532ak = (C5532ak) abstractC6123ca.mo24769C_();
        int iM27428k4 = f38848x1.m27428k4(str);
        if (iM27428k4 == 0) {
            if (abstractC6123caArr.length == 1) {
                return m10084k4(c5532ak.m22609k4(abstractC6123caArr[0].m24794wy()), C7019kk.m27443k4((Class<?>) C5532ak.class));
            }
            throw new C6208y2("invalid arguments count.");
        }
        if (iM27428k4 == 1) {
            return m10086k4(c5532ak.m22610kk());
        }
        if (iM27428k4 == 2) {
            return m10085k4(c5532ak.m22613to());
        }
        if (iM27428k4 != 3) {
            throw new C6208y2("unknown function");
        }
        if (abstractC6123caArr.length == 1) {
            return m10084k4(c5532ak.m22605du(abstractC6123caArr[0].toString()), C7019kk.m27443k4((Class<?>) C5532ak.class));
        }
        throw new C6208y2("invalid arguments count.");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) AbstractC5539du.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("splitText");
        m10035kk("replaceWholeText");
        m10033k4("elementContentWhitespace", 1);
        m10033k4("wholeText", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38847k4;
    }
}
