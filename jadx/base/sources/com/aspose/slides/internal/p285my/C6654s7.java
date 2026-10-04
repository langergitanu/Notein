package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.AbstractC4941wp;
import com.aspose.slides.internal.p182ii.C4918ne;
import com.aspose.slides.internal.p182ii.C4946xw;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.s7 */
/* JADX INFO: loaded from: classes4.dex */
public class C6654s7 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18422k4 = C7019kk.m27443k4((Class<?>) C4946xw.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18423x1 = new C7017h4("get_type", "get_selectedIndex", "set_selectedIndex", "get_value", "set_value", "get_length", "set_length", "get_form", "get_options", "get_disabled", "set_disabled", "get_multiple", "set_multiple", "get_name", "set_name", "get_size", "set_size", "get_tabIndex", "set_tabIndex", "add", "remove", "blur", "focus");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C4946xw c4946xw = (C4946xw) abstractC6123ca.mo24769C_();
        switch (f18423x1.m27428k4(str)) {
            case 0:
                return m10085k4(c4946xw.m20765qw());
            case 1:
                return m10082k4(c4946xw.m20768tq());
            case 2:
                c4946xw.m20759k4(abstractC6123caArr[0].m24794wy());
                break;
            case 3:
                return m10085k4(c4946xw.m20758j2());
            case 4:
                c4946xw.m20770wl(abstractC6123caArr[0].toString());
                break;
            case 5:
                return m10082k4(c4946xw.m20769w6());
            case 6:
                c4946xw.m20771x1(abstractC6123caArr[0].m24794wy());
                break;
            case 7:
                return m10084k4(c4946xw.m20763os(), C7019kk.m27443k4((Class<?>) C4918ne.class));
            case 8:
                return m10084k4(c4946xw.m20757em(), C7019kk.m27443k4((Class<?>) AbstractC4941wp.class));
            case 9:
                return m10086k4(c4946xw.m20772zj());
            case 10:
                c4946xw.m20760k4(abstractC6123caArr[0].mo24772k4());
                break;
            case 11:
                return m10086k4(c4946xw.m20754ai());
            case 12:
                c4946xw.m20762kk(abstractC6123caArr[0].mo24772k4());
                break;
            case 13:
                return m10085k4(c4946xw.m20766ri());
            case 14:
                c4946xw.m20764qq(abstractC6123caArr[0].toString());
                break;
            case 15:
                return m10082k4(c4946xw.m20756ca());
            case 16:
                c4946xw.m20761kk(abstractC6123caArr[0].m24794wy());
                break;
            case 17:
                return m10082k4(c4946xw.m20755bs());
            case 18:
                c4946xw.m20767to(abstractC6123caArr[0].m24794wy());
                break;
            case 19:
                if (abstractC6123caArr.length != 2) {
                    throw new C6208y2("invalid arguments count.");
                }
                break;
            case 20:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                break;
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
        m10035kk("Add");
        m10035kk("Remove");
        m10035kk("Blur");
        m10035kk("Focus");
        m10033k4(C18437z2.f56754h, 1);
        m10033k4("selectedIndex", 3);
        m10033k4("value", 3);
        m10033k4("length", 3);
        m10033k4("form", 1);
        m10033k4("options", 1);
        m10033k4("disabled", 3);
        m10033k4("multiple", 3);
        m10033k4("name", 3);
        m10033k4("size", 3);
        m10033k4("tabIndex", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18422k4;
    }
}
