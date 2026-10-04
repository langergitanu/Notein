package com.aspose.slides.internal.p529yn;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p231kk.C5779c5;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.x6 */
/* JADX INFO: loaded from: classes5.dex */
public class C12881x6 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43385k4 = C7019kk.m27443k4((Class<?>) C5779c5.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f43386x1 = new C7017h4("get_identifier", "get_listStyle", "get_separator");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        String strM23392k4;
        C5779c5 c5779c5 = (C5779c5) abstractC6123ca.mo24769C_();
        int iM27428k4 = f43386x1.m27428k4(str);
        if (iM27428k4 == 0) {
            strM23392k4 = c5779c5.m23392k4();
        } else if (iM27428k4 == 1) {
            strM23392k4 = c5779c5.m23394x1();
        } else {
            if (iM27428k4 != 2) {
                throw new C6208y2("unknown function");
            }
            strM23392k4 = c5779c5.m23393kk();
        }
        return m10085k4(strM23392k4);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("identifier", 1);
        m10033k4("listStyle", 1);
        m10033k4("separator", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f43385k4;
    }
}
