package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.dm */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0906dm {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC0906dm f4607k4;

    /* JADX INFO: renamed from: x1 */
    private final C14648us f4608x1;

    public AbstractC0906dm(AbstractC0906dm abstractC0906dm, C14648us c14648us) {
        this.f4607k4 = abstractC0906dm;
        this.f4608x1 = c14648us;
    }

    /* JADX INFO: renamed from: ck */
    public abstract List<AbstractC0906dm> mo4070ck();

    /* JADX INFO: renamed from: fa */
    public AbstractC0906dm mo5141fa() {
        return this.f4607k4;
    }

    /* JADX INFO: renamed from: ix */
    public final AbstractC0906dm m5142ix() {
        if (mo5141fa() == null) {
            return null;
        }
        List<AbstractC0906dm> listMo4070ck = this.f4607k4.mo4070ck();
        for (int i = 0; i < listMo4070ck.size(); i++) {
            if (i != listMo4070ck.size() - 1 && listMo4070ck.get_Item(i) == this) {
                return listMo4070ck.get_Item(i + 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5143k4(C1101fi c1101fi) {
        c1101fi.m6185k4(this.f4608x1);
        List.Enumerator<AbstractC0906dm> it = mo4070ck().iterator();
        while (it.hasNext()) {
            try {
                it.next().m5143k4(c1101fi);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ks */
    public final String m5144ks() {
        return this.f4608x1.m71876to();
    }

    /* JADX INFO: renamed from: ne */
    public final AbstractC0906dm m5145ne() {
        if (mo5141fa() == null) {
            return null;
        }
        List<AbstractC0906dm> listMo4070ck = this.f4607k4.mo4070ck();
        for (int i = 0; i < listMo4070ck.size(); i++) {
            if (i != 0 && listMo4070ck.get_Item(i) == this) {
                return listMo4070ck.get_Item(i - 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: rv */
    public final int m5146rv() {
        AbstractC0906dm abstractC0906dmMo5141fa = this.f4607k4;
        if (abstractC0906dmMo5141fa == null) {
            return 0;
        }
        int i = 1;
        while (abstractC0906dmMo5141fa.f4607k4 != null) {
            abstractC0906dmMo5141fa = abstractC0906dmMo5141fa.mo5141fa();
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: up */
    public final C14648us m5147up() {
        return this.f4608x1;
    }

    /* JADX INFO: renamed from: x6 */
    public final int m5148x6() {
        AbstractC0906dm abstractC0906dm = this.f4607k4;
        if (abstractC0906dm == null) {
            return 1;
        }
        List<AbstractC0906dm> listMo4070ck = abstractC0906dm.mo4070ck();
        for (int i = 0; i < listMo4070ck.size(); i++) {
            if (listMo4070ck.get_Item(i) == this) {
                return i + 1;
            }
        }
        throw new InvalidOperationException("Invalid state of node. Node are not attached to parent");
    }

    /* JADX INFO: renamed from: yj */
    public final int m5149yj() {
        return this.f4608x1.m71865du();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo4093k4(C14664v5 c14664v5) {
        List<AbstractC0906dm> listMo4070ck = mo4070ck();
        for (int i = 0; i < listMo4070ck.size(); i++) {
            AbstractC0906dm abstractC0906dm = listMo4070ck.get_Item(i);
            if (abstractC0906dm.m5149yj() == 1 || abstractC0906dm.m5149yj() == 2) {
                AbstractC0906dm abstractC0906dm2 = listMo4070ck.get_Item(i - 1);
                AbstractC0906dm abstractC0906dm3 = listMo4070ck.get_Item(i + 1);
                C14808xn c14808xn = new C14808xn(1);
                c14808xn.m73509k4(this.f4608x1, c14664v5);
                c14808xn.m73515x1(abstractC0906dm.f4608x1, c14664v5);
                c14808xn.m73508k4(abstractC0906dm2.f4608x1);
                c14808xn.m73514x1(abstractC0906dm3.f4608x1);
                c14664v5.m72075k4(c14808xn);
                if (abstractC0906dm.mo4070ck().size() > 0) {
                    abstractC0906dm.mo4093k4(c14664v5);
                }
            }
        }
    }
}
