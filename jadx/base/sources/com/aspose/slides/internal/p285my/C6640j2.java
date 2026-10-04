package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.C4888bs;
import com.aspose.slides.internal.p182ii.C4918ne;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.j2 */
/* JADX INFO: loaded from: classes4.dex */
public class C6640j2 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18395k4 = C7019kk.m27443k4((Class<?>) C4888bs.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18396x1 = new C7017h4("get_defaultValue", "set_defaultValue", "get_form", "get_accessKey", "set_accessKey", "get_cols", "set_cols", "get_disabled", "set_disabled", "get_name", "set_name", "get_readOnly", "set_readOnly", "get_rows", "set_rows", "get_tabIndex", "set_tabIndex", "get_type", "get_value", "set_value", "blur", "focus", "select");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C4888bs c4888bs = (C4888bs) abstractC6123ca.mo24769C_();
        switch (f18396x1.m27428k4(str)) {
            case 0:
                return m10085k4(c4888bs.m20249qw());
            case 1:
                c4888bs.m20254wl(abstractC6123caArr[0].toString());
                break;
            case 2:
                return m10084k4(c4888bs.m20251tq(), C7019kk.m27443k4((Class<?>) C4918ne.class));
            case 3:
                return m10085k4(c4888bs.m20242j2());
            case 4:
                c4888bs.m20248qq(abstractC6123caArr[0].toString());
                break;
            case 5:
                return m10082k4(c4888bs.m20253w6());
            case 6:
                c4888bs.m20243k4(abstractC6123caArr[0].m24794wy());
                break;
            case 7:
                return m10086k4(c4888bs.m20247os());
            case 8:
                c4888bs.m20244k4(abstractC6123caArr[0].mo24772k4());
                break;
            case 9:
                return m10085k4(c4888bs.m20241em());
            case 10:
                c4888bs.m20238ar(abstractC6123caArr[0].toString());
                break;
            case 11:
                return m10086k4(c4888bs.m20256zj());
            case 12:
                c4888bs.m20246kk(abstractC6123caArr[0].mo24772k4());
                break;
            case 13:
                return m10082k4(c4888bs.m20237ai());
            case 14:
                c4888bs.m20255x1(abstractC6123caArr[0].m24794wy());
                break;
            case 15:
                return m10082k4(c4888bs.m20250ri());
            case 16:
                c4888bs.m20245kk(abstractC6123caArr[0].m24794wy());
                break;
            case 17:
                return m10085k4(c4888bs.m20240ca());
            case 18:
                return m10085k4(c4888bs.m20239bs());
            case 19:
                c4888bs.m20252um(abstractC6123caArr[0].toString());
                break;
            case 20:
            case 21:
            case 22:
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
        m10035kk("Blur");
        m10035kk("Focus");
        m10035kk("Select");
        m10033k4("defaultValue", 3);
        m10033k4("form", 1);
        m10033k4("accessKey", 3);
        m10033k4("cols", 3);
        m10033k4("disabled", 3);
        m10033k4("name", 3);
        m10033k4("readOnly", 3);
        m10033k4("rows", 3);
        m10033k4("tabIndex", 3);
        m10033k4(C18437z2.f56754h, 1);
        m10033k4("value", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18395k4;
    }
}
