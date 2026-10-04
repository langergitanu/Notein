package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.AbstractC4908jd;
import com.aspose.slides.internal.p182ii.C4897dy;
import com.aspose.slides.internal.p182ii.C4913ks;
import com.aspose.slides.internal.p213jw.AbstractC5558v4;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p231kk.InterfaceC5785e0;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p253lm.InterfaceC6183tq;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p487wz.C12328k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C6677yj extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18468k4 = C7019kk.m27443k4((Class<?>) C4913ks.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18469x1 = new C7017h4("get_title", "set_title", "get_referrer", "get_domain", "get_URL", "get_body", "set_body", "get_images", "get_applets", "get_links", "get_forms", "get_anchors", "get_cookie", "set_cookie", "get_defaultView", "open", "close", "getElementsByName", "normalizeDocument");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C4913ks c4913ks = (C4913ks) abstractC6123ca.mo24769C_();
        switch (f18469x1.m27428k4(str)) {
            case 0:
                return m10085k4(c4913ks.m20428gi());
            case 1:
                c4913ks.m20442u4(abstractC6123caArr[0].toString());
                break;
            case 2:
                return m10085k4(c4913ks.m20439s7());
            case 3:
                return m10085k4(c4913ks.m20427f9());
            case 4:
                return m10085k4(c4913ks.m20440t6());
            case 5:
                return m10084k4(c4913ks.m20450xw(), C7019kk.m27443k4((Class<?>) C4897dy.class));
            case 6:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                c4913ks.m20434k4((C4897dy) abstractC6123caArr[0].mo24769C_());
                break;
                break;
            case 7:
                return m10084k4(c4913ks.m20444vh(), C7019kk.m27443k4((Class<?>) AbstractC4908jd.class));
            case 8:
                return m10084k4(c4913ks.m20438qw(), C7019kk.m27443k4((Class<?>) AbstractC4908jd.class));
            case 9:
                return m10084k4(c4913ks.m20441tq(), C7019kk.m27443k4((Class<?>) AbstractC4908jd.class));
            case 10:
                return m10084k4(c4913ks.m20429j2(), C7019kk.m27443k4((Class<?>) AbstractC4908jd.class));
            case 11:
                return m10084k4(c4913ks.m20446w6(), C7019kk.m27443k4((Class<?>) AbstractC4908jd.class));
            case 12:
                return m10085k4(c4913ks.m20437os());
            case 13:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                c4913ks.m20443uz(abstractC6123caArr[0].toString());
                break;
                break;
            case 14:
                return m10084k4(c4913ks.m20426em(), C7019kk.m27443k4((Class<?>) InterfaceC5785e0.class));
            case 15:
            case 16:
            case 18:
                break;
            case 17:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                AbstractC6123ca abstractC6123caM10084k4 = m10084k4(c4913ks.m20447wl(abstractC6123caArr[0].toString()), C7019kk.m27443k4((Class<?>) AbstractC5558v4.class));
                abstractC6123caM10084k4.m24792k4((InterfaceC6183tq) C7019kk.m27452k4((Object) m10081k4(C7019kk.m27443k4((Class<?>) C12328k4.class)), InterfaceC6183tq.class));
                return abstractC6123caM10084k4;
            default:
                throw new C6208y2("unknown function");
        }
        return m10080h4();
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) C5552rv.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("open");
        m10035kk("close");
        m10035kk("getElementsByName");
        m10035kk("normalizeDocument");
        m10033k4(NoteMeta.PROPERTY_TITLE, 3);
        m10033k4("referrer", 1);
        m10033k4("domain", 1);
        m10033k4("URL", 1);
        m10033k4("body", 3);
        m10033k4("images", 1);
        m10033k4("applets", 1);
        m10033k4("links", 1);
        m10033k4("forms", 1);
        m10033k4("anchors", 1);
        m10033k4("cookie", 3);
        m10033k4("defaultView", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18468k4;
    }
}
