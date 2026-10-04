package com.aspose.slides.internal.p113eo;

import com.aspose.slides.internal.p076d6.AbstractC3028kk;
import com.aspose.slides.internal.p076d6.C3025du;
import com.aspose.slides.internal.p076d6.C3026h4;
import com.aspose.slides.internal.p076d6.C3029m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p474wg.AbstractC11994yg;
import com.aspose.slides.internal.p474wg.C11950kp;
import com.aspose.slides.internal.p474wg.C11975um;
import com.aspose.slides.internal.p474wg.C11986x1;
import com.aspose.slides.internal.p474wg.InterfaceC11926c6;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.eo.x1 */
/* JADX INFO: loaded from: classes.dex */
class C3779x1 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC3028kk f10290k4;

    /* JADX INFO: renamed from: k4 */
    public C11986x1 m15103k4(String str, AbstractC11994yg abstractC11994yg, InterfaceC11926c6 interfaceC11926c6) {
        C11950kp c11950kpMo55894k4;
        C3025du c3025du;
        C11975um c11975um = (C11975um) C7019kk.m27452k4((Object) abstractC11994yg, C11975um.class);
        if (c11975um == null || (c11950kpMo55894k4 = interfaceC11926c6.mo55894k4(c11975um.mo56240yj(), "NTLM")) == null) {
            return null;
        }
        String strM56003x1 = c11950kpMo55894k4.m56003x1();
        String strM56001k4 = c11950kpMo55894k4.m56001k4();
        String strM56002kk = c11950kpMo55894k4.m56002kk();
        if (strM56003x1 == null || "".equals(strM56003x1)) {
            return null;
        }
        boolean z = false;
        if (C14113y2.m67411k4(strM56001k4)) {
            int iM67429to = C14113y2.m67429to(strM56003x1, IOUtils.DIR_SEPARATOR_WINDOWS);
            if (iM67429to == -1) {
                iM67429to = C14113y2.m67429to(strM56003x1, IOUtils.DIR_SEPARATOR_UNIX);
            }
            if (iM67429to >= 0) {
                strM56001k4 = C14113y2.m67443x1(strM56003x1, 0, iM67429to);
                strM56003x1 = C14113y2.m67422kk(strM56003x1, iM67429to + 1);
            }
        }
        AbstractC3028kk abstractC3028kk = this.f10290k4;
        if (abstractC3028kk != null) {
            if (abstractC3028kk.m12751x1() == 1) {
                if (str == null) {
                    this.f10290k4 = null;
                    return null;
                }
                C3026h4 c3026h4 = new C3026h4(C14080ne.m66934jd(str));
                if (strM56002kk == null) {
                    strM56002kk = "";
                }
                C3029m9 c3029m9 = new C3029m9(c3026h4);
                c3029m9.m12758kk(strM56003x1);
                c3029m9.m12759x1(strM56002kk);
                c3029m9.m12757k4(strM56001k4);
                this.f10290k4 = c3029m9;
            } else if (str == null || C14113y2.m67363du(str, C14113y2.f47374k4)) {
                c3025du = new C3025du();
                c3025du.m12734k4(strM56001k4);
                c3025du.m12737x1("");
            }
            z = true;
            return new C11986x1("NTLM " + C14080ne.m66952k4(this.f10290k4.mo12736kk()), z);
        }
        c3025du = new C3025du();
        c3025du.m12734k4(strM56001k4);
        c3025du.m12737x1("");
        c3025du.m12750k4(c3025du.m12749k4() | 524288);
        this.f10290k4 = c3025du;
        return new C11986x1("NTLM " + C14080ne.m66952k4(this.f10290k4.mo12736kk()), z);
    }
}
