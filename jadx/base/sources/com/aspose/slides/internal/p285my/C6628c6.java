package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.C4931ts;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.c6 */
/* JADX INFO: loaded from: classes4.dex */
public class C6628c6 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18371k4 = C7019kk.m27443k4((Class<?>) C4931ts.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18372x1 = new C7017h4("get_cite", "set_cite", "get_dateTime", "set_dateTime");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        String strM20594qw;
        C4931ts c4931ts = (C4931ts) abstractC6123ca.mo24769C_();
        int iM27428k4 = f18372x1.m27428k4(str);
        if (iM27428k4 != 0) {
            if (iM27428k4 == 1) {
                c4931ts.m20596wl(abstractC6123caArr[0].toString());
            } else if (iM27428k4 == 2) {
                strM20594qw = c4931ts.m20595tq();
            } else {
                if (iM27428k4 != 3) {
                    throw new C6208y2("unknown function");
                }
                c4931ts.m20593qq(abstractC6123caArr[0].toString());
            }
            return m10080h4();
        }
        strM20594qw = c4931ts.m20594qw();
        return m10085k4(strM20594qw);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) C12804k4.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("cite", 3);
        m10033k4("dateTime", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18371k4;
    }
}
