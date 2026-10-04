package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ib */
/* JADX INFO: loaded from: classes3.dex */
public class C2127ib extends C2170kx {
    @Override // com.aspose.slides.internal.p060ca.C2170kx, com.aspose.slides.internal.p060ca.AbstractC2406ze
    /* JADX INFO: renamed from: k4 */
    public void mo10714k4() {
        IGenericEnumerator<AbstractC2220nx> iGenericEnumeratorM11783kk;
        C2303tf c2303tf = (C2303tf) this.f8349k4;
        C2398z1 c2398z1Mo10802up = c2303tf.mo10802up();
        C2334v6 c2334v6 = C2334v6.f8105k4;
        if (!c2398z1Mo10802up.m11785x1(c2334v6)) {
            c2303tf.mo10802up().m11782k4(c2334v6);
        }
        C2398z1 c2398z1 = new C2398z1();
        C2398z1 c2398z12 = new C2398z1();
        IGenericEnumerator<AbstractC2220nx> iGenericEnumeratorM11783kk2 = c2303tf.mo10802up().m11783kk();
        while (iGenericEnumeratorM11783kk2.hasNext()) {
            try {
                AbstractC2220nx next = iGenericEnumeratorM11783kk2.next();
                c2398z1.m11781k4();
                ((C2132iq) c2303tf.mo10804yj()).m10744k4(next, c2398z1);
                if (c2398z1.m11784x1() > 0) {
                    iGenericEnumeratorM11783kk = c2398z1.m11783kk();
                    while (iGenericEnumeratorM11783kk.hasNext()) {
                        try {
                            AbstractC2220nx next2 = iGenericEnumeratorM11783kk.next();
                            if (!c2303tf.mo10802up().m11785x1(next2) && !c2398z12.m11785x1(next2)) {
                                c2398z12.m11782k4(next2);
                            }
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) iGenericEnumeratorM11783kk, (Class<IDisposable>) IDisposable.class)) {
                        iGenericEnumeratorM11783kk.dispose();
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) iGenericEnumeratorM11783kk2, (Class<IDisposable>) IDisposable.class)) {
                    iGenericEnumeratorM11783kk2.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) iGenericEnumeratorM11783kk2, (Class<IDisposable>) IDisposable.class)) {
            iGenericEnumeratorM11783kk2.dispose();
        }
        iGenericEnumeratorM11783kk = c2398z12.m11783kk();
        while (iGenericEnumeratorM11783kk.hasNext()) {
            try {
                AbstractC2220nx next3 = iGenericEnumeratorM11783kk.next();
                if (!c2303tf.mo10802up().m11785x1(next3)) {
                    c2303tf.mo10802up().m11782k4(next3);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) iGenericEnumeratorM11783kk, (Class<IDisposable>) IDisposable.class)) {
                    iGenericEnumeratorM11783kk.dispose();
                }
            }
        }
        super.mo10714k4();
    }
}
