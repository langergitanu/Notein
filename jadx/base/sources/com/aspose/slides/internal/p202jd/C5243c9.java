package com.aspose.slides.internal.p202jd;

import com.aspose.slides.OooO0OO;
import com.aspose.slides.internal.p126fa.AbstractC3909u4;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.C9919h4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p447up.C11528c5;
import com.aspose.slides.internal.p447up.C11533h4;
import com.aspose.slides.internal.p447up.C11537ks;
import com.aspose.slides.internal.p447up.C11543x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.c9 */
/* JADX INFO: loaded from: classes.dex */
public class C5243c9 extends AbstractC3909u4 {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        AbstractC5788h4 c11533h4;
        C11537ks c11537ks;
        C5796m9 c5796m9 = new C5796m9();
        while (interfaceC9933up != null) {
            short sMo48850k4 = interfaceC9933up.mo48850k4();
            if (sMo48850k4 == 0) {
                c11533h4 = new C11533h4(interfaceC9933up);
            } else if (sMo48850k4 == 24 || sMo48850k4 == 36) {
                c11533h4 = new C11543x6(interfaceC9933up.mo48784c5());
            } else {
                if (sMo48850k4 != 41) {
                    throw C9919h4.m48827k4(interfaceC9933up.mo48850k4());
                }
                if (interfaceC9933up.mo48820dy() != null) {
                    String strM67400k4 = C14113y2.f47374k4;
                    for (InterfaceC9933up interfaceC9933upMo48820dy = interfaceC9933up.mo48820dy(); interfaceC9933upMo48820dy != null; interfaceC9933upMo48820dy = interfaceC9933upMo48820dy.mo48851kk()) {
                        short sMo48850k42 = interfaceC9933upMo48820dy.mo48850k4();
                        if (sMo48850k42 != 35 && sMo48850k42 != 36) {
                            throw C9919h4.m48827k4(interfaceC9933up.mo48850k4());
                        }
                        if (strM67400k4.length() != 0) {
                            strM67400k4 = C14113y2.m67400k4(strM67400k4, " ");
                        }
                        strM67400k4 = C14113y2.m67400k4(strM67400k4, interfaceC9933upMo48820dy.mo48784c5());
                    }
                    c11537ks = new C11537ks(strM67400k4);
                } else {
                    c11537ks = null;
                }
                String strMo48821m9 = interfaceC9933up.mo48821m9();
                if (c11537ks != null) {
                    c5796m9.m23683x1(new C11528c5(OooO0OO.OooO00o(1, 0, strMo48821m9, strMo48821m9), c11537ks));
                } else {
                    c5796m9.m23683x1(new C11528c5(OooO0OO.OooO00o(1, 0, strMo48821m9, strMo48821m9), new AbstractC5788h4[0]));
                }
                interfaceC9933up = interfaceC9933up.mo48851kk();
            }
            c5796m9.m23683x1(c11533h4);
            interfaceC9933up = interfaceC9933up.mo48851kk();
        }
        return c5796m9;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return new C5796m9();
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_3;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "src";
    }
}
