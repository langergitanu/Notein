package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p482wr.C12262lr;
import com.aspose.slides.internal.p482wr.C12275wy;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.l7 */
/* JADX INFO: loaded from: classes4.dex */
public class C10521l7 extends List<C12262lr> {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC10589ph f37170k4;

    /* JADX INFO: renamed from: x1 */
    private C12275wy f37171x1;

    public C10521l7(InterfaceC10589ph interfaceC10589ph) {
        this.f37170k4 = interfaceC10589ph;
        m51153k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51153k4() {
        clear();
        C12275wy c12275wyM57431k4 = C12275wy.m57431k4(new C3152yj(this.f37170k4.mo51148to()));
        this.f37171x1 = c12275wyM57431k4;
        IGenericEnumerator<C12262lr> it = c12275wyM57431k4.iterator();
        while (it.hasNext()) {
            try {
                C12262lr next = it.next();
                if (!next.m57329ck()) {
                    addItem(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
