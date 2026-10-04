package com.aspose.slides.internal.p202jd;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p126fa.AbstractC3913yj;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p368qq.AbstractC9922k4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p368qq.InterfaceC9938x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.dq */
/* JADX INFO: loaded from: classes.dex */
public class C5255dq extends AbstractC3913yj {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "border-radius";
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 51;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3913yj
    /* JADX INFO: renamed from: k4 */
    public void mo15609k4(C6344m9 c6344m9, InterfaceC9938x6 interfaceC9938x6, InterfaceC9933up interfaceC9933up, boolean z) {
        IGenericList<InterfaceC9933up> iGenericListM67204k4;
        List list = new List();
        IGenericList list2 = new List();
        IGenericEnumerator<InterfaceC9933up> it = AbstractC9922k4.m48835k4(interfaceC9933up).iterator();
        IGenericList iGenericList = list;
        while (it.hasNext()) {
            try {
                InterfaceC9933up next = it.next();
                if (next.mo48850k4() != 4) {
                    iGenericList.addItem(next);
                } else {
                    if (iGenericList == list2) {
                        throw m15602k4(next.mo48850k4());
                    }
                    iGenericList = list2;
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
        IGenericList iGenericListM15599k4 = m15599k4(list, InterfaceC9933up.class);
        if (list2.size() != 0) {
            list2 = m15599k4(list2, InterfaceC9933up.class);
        }
        if (list2.size() != 0) {
            m15610k4(interfaceC9938x6, "border-top-left-radius", AbstractC14092to.m67204k4((Object[]) new InterfaceC9933up[]{(InterfaceC9933up) iGenericListM15599k4.get_Item(0), (InterfaceC9933up) list2.get_Item(0)}), z);
            m15610k4(interfaceC9938x6, "border-top-right-radius", AbstractC14092to.m67204k4((Object[]) new InterfaceC9933up[]{(InterfaceC9933up) iGenericListM15599k4.get_Item(1), (InterfaceC9933up) list2.get_Item(1)}), z);
            m15610k4(interfaceC9938x6, "border-bottom-right-radius", AbstractC14092to.m67204k4((Object[]) new InterfaceC9933up[]{(InterfaceC9933up) iGenericListM15599k4.get_Item(2), (InterfaceC9933up) list2.get_Item(2)}), z);
            iGenericListM67204k4 = AbstractC14092to.m67204k4((Object[]) new InterfaceC9933up[]{(InterfaceC9933up) iGenericListM15599k4.get_Item(3), (InterfaceC9933up) list2.get_Item(3)});
        } else {
            m15610k4(interfaceC9938x6, "border-top-left-radius", AbstractC14092to.m67204k4((Object[]) new InterfaceC9933up[]{(InterfaceC9933up) iGenericListM15599k4.get_Item(0)}), z);
            m15610k4(interfaceC9938x6, "border-top-right-radius", AbstractC14092to.m67204k4((Object[]) new InterfaceC9933up[]{(InterfaceC9933up) iGenericListM15599k4.get_Item(1)}), z);
            m15610k4(interfaceC9938x6, "border-bottom-right-radius", AbstractC14092to.m67204k4((Object[]) new InterfaceC9933up[]{(InterfaceC9933up) iGenericListM15599k4.get_Item(2)}), z);
            iGenericListM67204k4 = AbstractC14092to.m67204k4((Object[]) new InterfaceC9933up[]{(InterfaceC9933up) iGenericListM15599k4.get_Item(3)});
        }
        m15610k4(interfaceC9938x6, "border-bottom-left-radius", iGenericListM67204k4, z);
    }
}
