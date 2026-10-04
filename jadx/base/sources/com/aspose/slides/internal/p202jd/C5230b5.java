package com.aspose.slides.internal.p202jd;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p126fa.AbstractC3897dy;
import com.aspose.slides.internal.p126fa.AbstractC3905m9;
import com.aspose.slides.internal.p126fa.AbstractC3913yj;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p368qq.AbstractC9922k4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p368qq.InterfaceC9938x6;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.b5 */
/* JADX INFO: loaded from: classes.dex */
public class C5230b5 extends AbstractC3913yj {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "list-style";
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 158;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3913yj
    /* JADX INFO: renamed from: k4 */
    public void mo15609k4(C6344m9 c6344m9, InterfaceC9938x6 interfaceC9938x6, InterfaceC9933up interfaceC9933up, boolean z) {
        C11068dy<AbstractC5788h4> c11068dyMo15596du = ((AbstractC3905m9) c6344m9.m26001m9(161)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du2 = ((AbstractC3905m9) c6344m9.m26001m9(160)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du3 = ((AbstractC3897dy) c6344m9.m26001m9(159)).mo15596du();
        List list = new List();
        List list2 = new List();
        List list3 = new List();
        IGenericEnumerator<InterfaceC9933up> it = AbstractC9922k4.m48835k4(interfaceC9933up).iterator();
        while (it.hasNext()) {
            try {
                InterfaceC9933up next = it.next();
                short sMo48850k4 = next.mo48850k4();
                if (sMo48850k4 == 12) {
                    list.addItem(next);
                    list2.addItem(next);
                } else if (sMo48850k4 != 24 && sMo48850k4 != 41) {
                    if (sMo48850k4 == 35) {
                        String strM67361du = C14113y2.m67361du(next.mo48784c5());
                        if (c11068dyMo15596du.m53498k4(strM67361du) != null) {
                            list.addItem(next);
                        }
                        if (c11068dyMo15596du2.m53498k4(strM67361du) != null) {
                            list2.addItem(next);
                        }
                        if (c11068dyMo15596du3.m53498k4(strM67361du) != null) {
                        }
                    } else if (sMo48850k4 != 36) {
                    }
                }
                list3.addItem(next);
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (list3.size() == 0) {
            list3.addItem(AbstractC9922k4.m48848x1((InterfaceC9933up) null, "none"));
        }
        m15610k4(interfaceC9938x6, "list-style-type", list, z);
        m15610k4(interfaceC9938x6, "list-style-position", list2, z);
        m15610k4(interfaceC9938x6, "list-style-image", list3, z);
    }
}
