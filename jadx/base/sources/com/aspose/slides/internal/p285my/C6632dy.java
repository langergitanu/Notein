package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.C4897dy;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C6632dy extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18379k4 = C7019kk.m27443k4((Class<?>) C4897dy.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18380x1 = new C7017h4("get_aLink", "set_aLink", "get_background", "set_background", "get_bgColor", "set_bgColor", "get_link", "set_link", "get_text", "set_text", "get_vLink", "set_vLink");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        String strM20326qw;
        C4897dy c4897dy = (C4897dy) abstractC6123ca.mo24769C_();
        switch (f18380x1.m27428k4(str)) {
            case 0:
                strM20326qw = c4897dy.m20326qw();
                return m10085k4(strM20326qw);
            case 1:
                c4897dy.m20331wl(abstractC6123caArr[0].toString());
                return m10080h4();
            case 2:
                strM20326qw = c4897dy.m20327tq();
                return m10085k4(strM20326qw);
            case 3:
                c4897dy.m20325qq(abstractC6123caArr[0].toString());
                return m10080h4();
            case 4:
                strM20326qw = c4897dy.m20323j2();
                return m10085k4(strM20326qw);
            case 5:
                c4897dy.m20320ar(abstractC6123caArr[0].toString());
                return m10080h4();
            case 6:
                strM20326qw = c4897dy.m20330w6();
                return m10085k4(strM20326qw);
            case 7:
                c4897dy.m20328um(abstractC6123caArr[0].toString());
                return m10080h4();
            case 8:
                strM20326qw = c4897dy.m20324os();
                return m10085k4(strM20326qw);
            case 9:
                c4897dy.m20321bv(abstractC6123caArr[0].toString());
                return m10080h4();
            case 10:
                strM20326qw = c4897dy.m20322em();
                return m10085k4(strM20326qw);
            case 11:
                c4897dy.m20329v4(abstractC6123caArr[0].toString());
                return m10080h4();
            default:
                throw new C6208y2("unknown function");
        }
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) C12804k4.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("aLink", 3);
        m10033k4("background", 3);
        m10033k4("bgColor", 3);
        m10033k4("link", 3);
        m10033k4("text", 3);
        m10033k4("vLink", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18379k4;
    }
}
