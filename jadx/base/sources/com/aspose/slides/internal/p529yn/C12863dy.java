package com.aspose.slides.internal.p529yn;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.dy */
/* JADX INFO: loaded from: classes5.dex */
public class C12863dy extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43348k4 = C7019kk.m27443k4((Class<?>) InterfaceC5797ne.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f43349x1 = new C7017h4("get_type", "get_cssText", "set_cssText", "get_parentStyleSheet", "get_parentRule");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        InterfaceC5797ne interfaceC5797ne = (InterfaceC5797ne) abstractC6123ca.mo24769C_();
        int iM27428k4 = f43349x1.m27428k4(str);
        if (iM27428k4 == 0) {
            return m10082k4(interfaceC5797ne.mo23403k4());
        }
        if (iM27428k4 == 1) {
            return m10085k4(interfaceC5797ne.mo23406x1());
        }
        if (iM27428k4 == 2) {
            if (abstractC6123caArr.length != 1) {
                throw new C6208y2("invalid arguments count.");
            }
            interfaceC5797ne.mo23684x1(abstractC6123caArr[0].toString());
            return m10080h4();
        }
        if (iM27428k4 == 3) {
            return m10084k4(interfaceC5797ne.mo23405to(), C14067j2.m66727k4(interfaceC5797ne.mo23405to()));
        }
        if (iM27428k4 == 4) {
            return m10084k4(interfaceC5797ne.mo23402du(), C14067j2.m66727k4(interfaceC5797ne.mo23402du()));
        }
        throw new C6208y2("unknown function");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4(C18437z2.f56754h, 1);
        m10033k4("cssText", 3);
        m10033k4("parentStyleSheet", 1);
        m10033k4("parentRule", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f43348k4;
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public void mo10031k4(AbstractC6123ca abstractC6123ca) {
        m10032k4(abstractC6123ca, "CSS_INHERIT", m10082k4(0.0d));
        m10032k4(abstractC6123ca, "STYLE_RULE", m10082k4(1.0d));
        m10032k4(abstractC6123ca, "CHARSET_RULE", m10082k4(2.0d));
        m10032k4(abstractC6123ca, "IMPORT_RULE", m10082k4(3.0d));
        m10032k4(abstractC6123ca, "MEDIA_RULE", m10082k4(4.0d));
        m10032k4(abstractC6123ca, "FONT_FACE_RULE", m10082k4(5.0d));
        m10032k4(abstractC6123ca, "PAGE_RULE", m10082k4(6.0d));
        super.mo10031k4(abstractC6123ca);
    }
}
