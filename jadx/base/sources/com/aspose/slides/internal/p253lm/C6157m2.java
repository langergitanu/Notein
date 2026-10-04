package com.aspose.slides.internal.p253lm;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p030av.AbstractC1563k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.m2 */
/* JADX INFO: loaded from: classes4.dex */
public class C6157m2 extends AbstractC6131e0 {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, AbstractC6131e0> f17394k4 = new Dictionary<>();

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<String, AbstractC6131e0> m24919k4() {
        return this.f17394k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24920k4(C6143ii c6143ii) {
        Dictionary<String, AbstractC6131e0> dictionaryM24919k4;
        String strM24847k4;
        C6143ii c6143iiM24854x1;
        if (c6143ii.m24847k4() == null) {
            c6143ii.m24851k4(C14113y2.m67368h4(AbstractC1563k4.m8353k4(C7019kk.m27443k4((Class<?>) C6209y4.class)).mo8354k4(c6143ii.m24852kk())));
            c6143ii.m24848k4(0);
        }
        if (m24919k4().containsKey(c6143ii.m24847k4())) {
            C6143ii c6143ii2 = (C6143ii) C7019kk.m27452k4((Object) m24919k4().get_Item(c6143ii.m24847k4()), C6143ii.class);
            if (c6143ii2 == null) {
                throw new C6208y2("A property cannot be both an accessor and data");
            }
            int iM24852kk = c6143ii.m24852kk();
            if (iM24852kk != 0) {
                if (iM24852kk == 1) {
                    c6143ii2.m24855x1(c6143ii);
                    return;
                } else {
                    if (iM24852kk != 2) {
                        return;
                    }
                    c6143ii2.m24850k4(c6143ii);
                    return;
                }
            }
            if (c6143ii.m24852kk() != 0) {
                throw new C6208y2("A property cannot be both an accessor and data");
            }
            dictionaryM24919k4 = m24919k4();
            strM24847k4 = c6143ii.m24847k4();
            c6143iiM24854x1 = c6143ii.m24854x1();
        } else {
            this.f17394k4.addItem(c6143ii.m24847k4(), c6143ii);
            int iM24852kk2 = c6143ii.m24852kk();
            if (iM24852kk2 != 0) {
                if (iM24852kk2 == 1) {
                    c6143ii.m24855x1(c6143ii);
                    return;
                } else {
                    if (iM24852kk2 != 2) {
                        return;
                    }
                    c6143ii.m24850k4(c6143ii);
                    return;
                }
            }
            dictionaryM24919k4 = m24919k4();
            strM24847k4 = c6143ii.m24847k4();
            c6143iiM24854x1 = c6143ii;
        }
        dictionaryM24919k4.set_Item(strM24847k4, c6143iiM24854x1);
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6178sq
    /* JADX INFO: renamed from: k4 */
    public void mo24749k4(InterfaceC6166os interfaceC6166os) {
        interfaceC6166os.mo10061k4(this);
    }
}
