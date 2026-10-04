package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.sh */
/* JADX INFO: loaded from: classes3.dex */
class C14456sh implements InterfaceC0782az {

    /* JADX INFO: renamed from: k4 */
    private final List<InterfaceC0782az> f48849k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private final String f48850x1;

    public C14456sh(String str) {
        this.f48850x1 = str;
    }

    @Override // com.aspose.slides.InterfaceC0782az
    /* JADX INFO: renamed from: k4 */
    public final mtk mo3871k4(C1095fc c1095fc) {
        List list = new List(this.f48849k4.size());
        IGenericEnumerator<InterfaceC0782az> it = m70625x1().iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next().mo3871k4(c1095fc).Clone());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return C14563ti.m71187k4(m70623k4(), list, c1095fc);
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp(m70623k4());
        c6765kp.m26780k4('(');
        IGenericEnumerator<InterfaceC0782az> it = m70625x1().iterator();
        while (it.hasNext()) {
            try {
                c6765kp.m26796k4("{0}, ", it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (this.f48849k4.size() > 0) {
            c6765kp.m26809x1(c6765kp.m26807x1() - 2, 2);
        }
        c6765kp.m26780k4(')');
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final IGenericEnumerable<InterfaceC0782az> m70625x1() {
        return this.f48849k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m70623k4() {
        return this.f48850x1;
    }

    @Override // com.aspose.slides.InterfaceC0782az
    /* JADX INFO: renamed from: k4 */
    public final String mo3872k4(C0909dp c0909dp) {
        C6765kp c6765kp = new C6765kp(m70623k4());
        c6765kp.m26780k4('(');
        IGenericEnumerator<InterfaceC0782az> it = m70625x1().iterator();
        while (it.hasNext()) {
            try {
                c6765kp.m26796k4("{0}, ", it.next().mo3872k4(c0909dp));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (this.f48849k4.size() > 0) {
            c6765kp.m26809x1(c6765kp.m26807x1() - 2, 2);
        }
        c6765kp.m26780k4(')');
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70624k4(InterfaceC0782az interfaceC0782az) {
        this.f48849k4.addItem(interfaceC0782az);
    }
}
