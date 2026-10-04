package com.aspose.slides.internal.p213jw;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12764ck;
import com.aspose.slides.internal.p517y2.InterfaceC12767fa;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.fa */
/* JADX INFO: loaded from: classes.dex */
public class C5541fa {

    /* JADX INFO: renamed from: k4 */
    private C5537ck f15226k4 = new C5537ck();

    /* JADX INFO: renamed from: x1 */
    private C5546kk f15227x1;

    public C5541fa(C5546kk c5546kk) {
        this.f15227x1 = c5546kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12764ck m22695k4(String str) {
        IGenericEnumerator<InterfaceC12764ck> it = this.f15226k4.iterator();
        while (it.hasNext()) {
            try {
                InterfaceC12764ck next = it.next();
                if (next.mo22735x1(str, C14113y2.f47374k4)) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC12767fa m22697x1(String str) {
        C5537ck c5537ck = new C5537ck();
        IGenericEnumerator<InterfaceC12764ck> it = this.f15226k4.iterator();
        while (it.hasNext()) {
            try {
                InterfaceC12764ck next = it.next();
                if (next.mo22735x1(str, C14113y2.f47374k4)) {
                    c5537ck.m22683k4(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c5537ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m22696k4(C5544jd c5544jd) {
        this.f15226k4.m22683k4(c5544jd);
    }
}
