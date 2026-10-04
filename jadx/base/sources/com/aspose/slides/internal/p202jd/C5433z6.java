package com.aspose.slides.internal.p202jd;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
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
import com.aspose.words.StyleIdentifier;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.z6 */
/* JADX INFO: loaded from: classes.dex */
public class C5433z6 extends AbstractC3913yj {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "target";
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return StyleIdentifier.GRID_TABLE_4_ACCENT_3;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3913yj
    /* JADX INFO: renamed from: k4 */
    public void mo15609k4(C6344m9 c6344m9, InterfaceC9938x6 interfaceC9938x6, InterfaceC9933up interfaceC9933up, boolean z) {
        C11068dy<AbstractC5788h4> c11068dyMo15596du = ((AbstractC3905m9) c6344m9.m26001m9(StyleIdentifier.GRID_TABLE_3_ACCENT_3)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du2 = ((AbstractC3905m9) c6344m9.m26001m9(StyleIdentifier.GRID_TABLE_2_ACCENT_3)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du3 = ((AbstractC3905m9) c6344m9.m26001m9(StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_3)).mo15596du();
        List list = new List();
        List list2 = new List();
        List list3 = new List();
        IGenericEnumerator<InterfaceC9933up> it = AbstractC9922k4.m48835k4(interfaceC9933up).iterator();
        while (it.hasNext()) {
            try {
                InterfaceC9933up next = it.next();
                short sMo48850k4 = next.mo48850k4();
                if (sMo48850k4 == 35) {
                    String strM67361du = C14113y2.m67361du(next.mo48784c5());
                    if (c11068dyMo15596du.m53498k4(strM67361du) != null) {
                        list.addItem(next);
                    }
                    if (c11068dyMo15596du2.m53498k4(strM67361du) != null) {
                        list2.addItem(next);
                    }
                    if (c11068dyMo15596du3.m53498k4(strM67361du) != null) {
                        list3.addItem(next);
                    }
                } else if (sMo48850k4 == 36) {
                    list.addItem(next);
                }
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
        m15610k4(interfaceC9938x6, "target-name", list, z);
        m15610k4(interfaceC9938x6, "target-new", list2, z);
        m15610k4(interfaceC9938x6, "target-position", list3, z);
    }
}
