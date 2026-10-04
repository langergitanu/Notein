package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.C4907j2;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.vj */
/* JADX INFO: loaded from: classes4.dex */
public class C6667vj extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18448k4 = C7019kk.m27443k4((Class<?>) C4907j2.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18449x1 = new C7017h4("get_align", "set_align", "get_ch", "set_ch", "get_chOff", "set_chOff", "get_span", "set_span", "get_vAlign", "set_vAlign", "get_width", "set_width");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C4907j2 c4907j2 = (C4907j2) abstractC6123ca.mo24769C_();
        switch (f18449x1.m27428k4(str)) {
            case 0:
                return m10085k4(c4907j2.m20391qw());
            case 1:
                c4907j2.m20395wl(abstractC6123caArr[0].toString());
                break;
            case 2:
                return m10085k4(c4907j2.m20392tq());
            case 3:
                c4907j2.m20390qq(abstractC6123caArr[0].toString());
                break;
            case 4:
                return m10085k4(c4907j2.m20387j2());
            case 5:
                c4907j2.m20384ar(abstractC6123caArr[0].toString());
                break;
            case 6:
                return m10082k4(c4907j2.m20394w6());
            case 7:
                c4907j2.m20388k4(abstractC6123caArr[0].m24794wy());
                break;
            case 8:
                return m10085k4(c4907j2.m20389os());
            case 9:
                c4907j2.m20393um(abstractC6123caArr[0].toString());
                break;
            case 10:
                return m10085k4(c4907j2.m20386em());
            case 11:
                c4907j2.m20385bv(abstractC6123caArr[0].toString());
                break;
            default:
                throw new C6208y2("unknown function");
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
        m10033k4("align", 3);
        m10033k4("ch", 3);
        m10033k4("chOff", 3);
        m10033k4("span", 3);
        m10033k4("vAlign", 3);
        m10033k4("width", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18448k4;
    }
}
