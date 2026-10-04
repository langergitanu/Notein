package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.InterfaceC9759bv;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.vy */
/* JADX INFO: loaded from: classes3.dex */
class C14717vy {

    /* JADX INFO: renamed from: k4 */
    private static final Object f49711k4 = new Object();

    /* JADX INFO: renamed from: kk */
    private final InterfaceC9759bv f49712kk;

    /* JADX INFO: renamed from: x1 */
    private final C1183h3 f49713x1;

    public C14717vy(int i, InterfaceC9759bv interfaceC9759bv) {
        this.f49713x1 = new C1183h3(i);
        this.f49712kk = interfaceC9759bv;
    }

    /* JADX INFO: renamed from: x1 */
    private C14251ot m72579x1(String str, byte b, int i, float f, int i2, boolean z) {
        synchronized (f49711k4) {
            try {
                IGenericEnumerator<C14251ot> it = this.f49713x1.m6977x1().iterator();
                while (it.hasNext()) {
                    try {
                        C14251ot next = it.next();
                        if (C14251ot.m68807k4(next, str, b, i, i2, f, z)) {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            return next;
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C12013m9 m72580k4(String str, float f, int i) {
        return this.f49712kk.mo3693k4(str, f, i);
    }

    public C14717vy(InterfaceC9759bv interfaceC9759bv) {
        this.f49713x1 = new C1183h3();
        this.f49712kk = interfaceC9759bv;
    }

    /* JADX INFO: renamed from: k4 */
    public C14251ot mo63749k4(InterfaceC9759bv interfaceC9759bv, String str, byte b, int i, float f, int i2, boolean z) {
        return C14614u3.m71480k4(str, i2, interfaceC9759bv, z, f, b, i, false);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m72584x1() {
        synchronized (f49711k4) {
            this.f49713x1.m6974k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C14251ot m72581k4(String str, byte b, int i, float f, int i2, boolean z) {
        C14251ot c14251otM72579x1 = m72579x1(str, b, i, f, i2, z);
        if (c14251otM72579x1 != null) {
            return c14251otM72579x1;
        }
        C14251ot c14251otMo63749k4 = mo63749k4(this.f49712kk, str, b, i, f, i2, z);
        if (c14251otMo63749k4 != null) {
            m72583k4(c14251otMo63749k4);
        }
        return c14251otMo63749k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m72582k4() {
        m72584x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72583k4(C14251ot c14251ot) {
        synchronized (f49711k4) {
            this.f49713x1.m6975k4(c14251ot);
            this.f49713x1.m6976kk();
        }
    }
}
