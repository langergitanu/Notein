package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.C4904h4;
import com.aspose.slides.internal.p231kk.InterfaceC5790jd;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6638h4 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18391k4 = C7019kk.m27443k4((Class<?>) C4904h4.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18392x1 = new C7017h4("get_href", "set_href", "get_target", "set_target", "get_style");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C4904h4 c4904h4 = (C4904h4) abstractC6123ca.mo24769C_();
        int iM27428k4 = f18392x1.m27428k4(str);
        if (iM27428k4 == 0) {
            return m10085k4(c4904h4.m20364qw());
        }
        if (iM27428k4 == 1) {
            c4904h4.m20366wl(abstractC6123caArr[0].toString());
        } else {
            if (iM27428k4 == 2) {
                return m10085k4(c4904h4.m20365tq());
            }
            if (iM27428k4 != 3) {
                if (iM27428k4 == 4) {
                    return m10084k4(c4904h4.m8446vh(), C7019kk.m27443k4((Class<?>) InterfaceC5790jd.class));
                }
                throw new C6208y2("unknown function");
            }
            c4904h4.m20363qq(abstractC6123caArr[0].toString());
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
        m10033k4("href", 3);
        m10033k4("target", 3);
        m10033k4("style", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18391k4;
    }
}
