package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.C5556up;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C11259jd extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38823k4 = C7019kk.m27443k4((Class<?>) C5556up.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38824x1 = new C7017h4("get_lineNumber", "get_columnNumber", "get_byteOffset", "get_utf16Offset", "get_relatedNode", "get_uri");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C5556up c5556up = (C5556up) abstractC6123ca.mo24769C_();
        int iM27428k4 = f38824x1.m27428k4(str);
        if (iM27428k4 == 0) {
            return m10082k4(c5556up.m22832k4());
        }
        if (iM27428k4 == 1) {
            return m10082k4(c5556up.m22835x1());
        }
        if (iM27428k4 == 2) {
            return m10082k4(c5556up.m22833kk());
        }
        if (iM27428k4 == 3) {
            return m10082k4(c5556up.m22834to());
        }
        if (iM27428k4 == 4) {
            InterfaceC12777qq interfaceC12777qqM22830du = c5556up.m22830du();
            return interfaceC12777qqM22830du == null ? m10080h4() : m10084k4(interfaceC12777qqM22830du, C14067j2.m66727k4(interfaceC12777qqM22830du));
        }
        if (iM27428k4 == 5) {
            return m10085k4(c5556up.m22831h4());
        }
        throw new C6208y2("unknown function");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("lineNumber", 1);
        m10033k4("columnNumber", 1);
        m10033k4("byteOffset", 1);
        m10033k4("utf16Offset", 1);
        m10033k4("relatedNode", 1);
        m10033k4("uri", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38823k4;
    }
}
