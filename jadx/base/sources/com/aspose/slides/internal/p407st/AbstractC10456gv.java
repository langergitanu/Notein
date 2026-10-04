package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.gv */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10456gv extends AbstractC10376bv {
    public AbstractC10456gv() {
        m51409um().m51917k4(5000);
        m51409um().m51920k4((short) 0);
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC10368be[] m50854c5() {
        List list = new List();
        for (int i = 0; i < m50513yj().size(); i++) {
            AbstractC10368be abstractC10368be = (AbstractC10368be) C7019kk.m27452k4((Object) m50513yj().get_Item(i), AbstractC10368be.class);
            if (abstractC10368be != null && abstractC10368be.m50513yj().size() > 1 && C7019kk.m27469x1(abstractC10368be.m50513yj().get_Item(1), C10460h4.class)) {
                list.addItem(abstractC10368be);
            }
        }
        return (AbstractC10368be[]) list.toArray(new AbstractC10368be[0]);
    }

    /* JADX INFO: renamed from: dy */
    public final C10467hj[] m50855dy() {
        List list = new List();
        for (int i = 0; i < m50513yj().size(); i++) {
            AbstractC10571o4 abstractC10571o4 = m50513yj().get_Item(i);
            C10467hj c10467hj = abstractC10571o4 instanceof C10467hj ? (C10467hj) abstractC10571o4 : null;
            if (c10467hj != null) {
                list.addItem(c10467hj);
            }
        }
        int size = list.size();
        C10467hj[] c10467hjArr = new C10467hj[size];
        for (int i2 = 0; i2 < size; i2++) {
            c10467hjArr[i2] = (C10467hj) list.get_Item(i2);
        }
        return c10467hjArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC10368be m50856k4(String str) {
        for (int i = 0; i < m50513yj().size(); i++) {
            if ((m50513yj().get_Item(i).m51404bv() & 65535) == 5002) {
                AbstractC10368be abstractC10368be = (AbstractC10368be) m50513yj().get_Item(i);
                if (abstractC10368be.m50513yj().size() > 0 && (65535 & abstractC10368be.m50513yj().get_Item(0).m51404bv()) == 4026 && C14113y2.m67363du(((C10626rv) abstractC10368be.m50513yj().get_Item(0)).m51659x1(), str)) {
                    return (AbstractC10368be) m50513yj().get_Item(i);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50857k4(int i) {
        AbstractC10368be c10379bz;
        AbstractC10368be abstractC10368be;
        if (i == 0) {
            m50512x1(true);
            c10379bz = new C10379bz();
        } else {
            if (i != 1 && i != 2) {
                abstractC10368be = null;
                m50513yj().addItem(abstractC10368be);
            }
            c10379bz = new C10610qp();
        }
        c10379bz.m50464k4(i);
        abstractC10368be = c10379bz;
        m50513yj().addItem(abstractC10368be);
    }
}
