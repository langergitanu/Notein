package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.C4887b3;
import com.aspose.slides.internal.p182ii.C4918ne;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.yd */
/* JADX INFO: loaded from: classes4.dex */
public class C6676yd extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18466k4 = C7019kk.m27443k4((Class<?>) C4887b3.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18467x1 = new C7017h4("get_form", "get_accessKey", "set_accessKey", "get_htmlFor", "set_htmlFor");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C4887b3 c4887b3 = (C4887b3) abstractC6123ca.mo24769C_();
        int iM27428k4 = f18467x1.m27428k4(str);
        if (iM27428k4 == 0) {
            return m10084k4(c4887b3.m20233qw(), C7019kk.m27443k4((Class<?>) C4918ne.class));
        }
        if (iM27428k4 == 1) {
            return m10085k4(c4887b3.m20234tq());
        }
        if (iM27428k4 == 2) {
            c4887b3.m20235wl(abstractC6123caArr[0].toString());
        } else {
            if (iM27428k4 == 3) {
                return m10085k4(c4887b3.m20230j2());
            }
            if (iM27428k4 != 4) {
                throw new C6208y2("unknown function");
            }
            c4887b3.m20232qq(abstractC6123caArr[0].toString());
        }
        return m10080h4();
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) C12804k4.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("form", 1);
        m10033k4("accessKey", 3);
        m10033k4("htmlFor", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18466k4;
    }
}
