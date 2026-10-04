package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.ee */
/* JADX INFO: loaded from: classes4.dex */
public class C10419ee extends AbstractC10376bv {

    /* JADX INFO: renamed from: k4 */
    private List<C10671ur> f36962k4 = null;

    public C10419ee() {
        m51409um().m51917k4(C7019kk.m27457kk((Object) 61759, 9));
        m51409um().m51916k4((byte) 15);
    }

    /* JADX INFO: renamed from: du */
    private List<C10671ur> m50738du() {
        AbstractC10402dj abstractC10402dj;
        this.f36962k4 = new List<>();
        int i = 0;
        while (i < m50513yj().size()) {
            C10743z5 c10743z5 = m50513yj().get_Item(i) instanceof C10743z5 ? (C10743z5) m50513yj().get_Item(i) : null;
            if (c10743z5 == null) {
                break;
            }
            int i2 = i + 1;
            if (i2 < m50513yj().size()) {
                abstractC10402dj = m50513yj().get_Item(i2) instanceof AbstractC10402dj ? (AbstractC10402dj) m50513yj().get_Item(i2) : null;
                if (abstractC10402dj != null && abstractC10402dj.m51409um().m51922kk() == 0) {
                    i2 = i + 2;
                }
            } else {
                abstractC10402dj = null;
            }
            if (i2 < m50513yj().size()) {
                c10742z2 = m50513yj().get_Item(i2) instanceof C10742z2 ? (C10742z2) m50513yj().get_Item(i2) : null;
                if (c10742z2 != null && c10742z2.m51409um().m51922kk() == 1) {
                    i2++;
                }
            }
            i = i2;
            this.f36962k4.addItem(new C10671ur(c10743z5, abstractC10402dj, c10742z2));
        }
        return this.f36962k4;
    }

    /* JADX INFO: renamed from: to */
    public java.util.List<C10671ur> m50739to() {
        return List.toJava(m50740x1());
    }

    /* JADX INFO: renamed from: x1 */
    public List<C10671ur> m50740x1() {
        List<C10671ur> list = this.f36962k4;
        if (list != null) {
            return list;
        }
        List<C10671ur> listM50738du = m50738du();
        this.f36962k4 = listM50738du;
        return listM50738du;
    }
}
