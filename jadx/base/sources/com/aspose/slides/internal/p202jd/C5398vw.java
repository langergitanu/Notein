package com.aspose.slides.internal.p202jd;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p126fa.AbstractC3904ks;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.internal.p447up.C11537ks;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.vw */
/* JADX INFO: loaded from: classes.dex */
public class C5398vw extends AbstractC3904ks {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15596du() {
        return null;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3904ks, com.aspose.slides.internal.p126fa.AbstractC3905m9, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        List list = new List();
        C6765kp c6765kp = new C6765kp();
        do {
            short sMo48850k4 = interfaceC9933up.mo48850k4();
            if (sMo48850k4 != 0) {
                if (sMo48850k4 == 12) {
                    return C5813x1.k4.f16146k4;
                }
                if (sMo48850k4 != 35) {
                    if (sMo48850k4 != 36) {
                        throw m15602k4(interfaceC9933up.mo48850k4());
                    }
                    list.addItem(C11537ks.m54523kk(interfaceC9933up.mo48784c5()));
                } else if (c6765kp.m26807x1() != 0) {
                    c6765kp.m26792k4(" ").m26792k4(interfaceC9933up.mo48784c5());
                } else {
                    c6765kp.m26792k4(interfaceC9933up.mo48784c5());
                }
            } else if (c6765kp.m26807x1() != 0) {
                list.addItem(C11537ks.m54523kk(c6765kp.toString()));
                c6765kp = new C6765kp();
            }
            interfaceC9933up = interfaceC9933up.mo48851kk();
        } while (interfaceC9933up != null);
        if (c6765kp.m26807x1() != 0) {
            list.addItem(C11537ks.m54523kk(c6765kp.toString()));
        }
        return new C5796m9(list);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return new C5796m9();
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 114;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "font-family";
    }
}
