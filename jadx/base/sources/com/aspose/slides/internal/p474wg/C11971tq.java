package com.aspose.slides.internal.p474wg;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p205ji.AbstractC5470v4;
import com.aspose.slides.internal.p205ji.C5458kk;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.tq */
/* JADX INFO: loaded from: classes5.dex */
class C11971tq implements InterfaceC14083qm {

    /* JADX INFO: renamed from: du */
    private Object f40348du;

    /* JADX INFO: renamed from: dy */
    private final Object f40349dy = new Object();

    /* JADX INFO: renamed from: h4 */
    private boolean f40350h4;

    /* JADX INFO: renamed from: k4 */
    private C5458kk f40351k4;

    /* JADX INFO: renamed from: kk */
    private boolean f40352kk;

    /* JADX INFO: renamed from: m9 */
    private Exception f40353m9;

    /* JADX INFO: renamed from: to */
    private AbstractC11979vh f40354to;

    /* JADX INFO: renamed from: x1 */
    private boolean f40355x1;

    private C11971tq(AbstractC11979vh abstractC11979vh) {
        this.f40354to = abstractC11979vh;
    }

    /* JADX INFO: renamed from: jd */
    private void m56115jd() {
        if (this.f40350h4) {
            return;
        }
        this.f40350h4 = true;
        AbstractC11979vh abstractC11979vh = this.f40354to;
        if (abstractC11979vh == null) {
            return;
        }
        abstractC11979vh.mo55973k4(this);
    }

    /* JADX INFO: renamed from: c5 */
    public Exception m56118c5() {
        return this.f40353m9;
    }

    /* JADX INFO: renamed from: du */
    public void m56119du() {
        AbstractC11979vh abstractC11979vh;
        if (this.f40350h4 || (abstractC11979vh = this.f40354to) == null) {
            return;
        }
        this.f40350h4 = true;
        abstractC11979vh.mo55973k4(this);
    }

    /* JADX INFO: renamed from: dy */
    public boolean m56120dy() {
        return this.f40353m9 != null;
    }

    /* JADX INFO: renamed from: h4 */
    public void m56121h4() {
        if (mo18728kk()) {
            return;
        }
        mo18731x1().m22558du();
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
    /* JADX INFO: renamed from: k4 */
    public Object mo18725k4() {
        return this.f40348du;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
    /* JADX INFO: renamed from: kk */
    public boolean mo18728kk() {
        boolean z;
        synchronized (this.f40349dy) {
            z = this.f40352kk;
        }
        return z;
    }

    /* JADX INFO: renamed from: m9 */
    public boolean m56125m9() {
        return this.f40355x1;
    }

    /* JADX INFO: renamed from: to */
    public void m56126to() {
        this.f40350h4 = false;
        this.f40353m9 = null;
        synchronized (this.f40349dy) {
            try {
                this.f40352kk = false;
                C5458kk c5458kk = this.f40351k4;
                if (c5458kk != null) {
                    c5458kk.m22563k4();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
    /* JADX INFO: renamed from: x1 */
    public AbstractC5470v4 mo18731x1() {
        synchronized (this.f40349dy) {
            try {
                if (this.f40351k4 == null) {
                    this.f40351k4 = new C5458kk(this.f40352kk);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f40351k4;
    }

    public C11971tq(AbstractC14078m9 abstractC14078m9, Object obj) {
        this.f40348du = obj;
        this.f40354to = new C11944j2(this, abstractC14078m9);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m56116k4(AbstractC11963qw abstractC11963qw, AbstractC11979vh abstractC11979vh) {
        C11971tq c11971tq = new C11971tq(abstractC11979vh);
        try {
            if (abstractC11963qw.mo55877k4(c11971tq)) {
                return;
            }
            c11971tq.m56122k4(true);
        } catch (Exception e) {
            c11971tq.m56123k4(true, e);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m56127x1(boolean z) {
        this.f40355x1 = z;
        this.f40353m9 = null;
        synchronized (this.f40349dy) {
            try {
                this.f40352kk = true;
                C5458kk c5458kk = this.f40351k4;
                if (c5458kk != null) {
                    c5458kk.mo22555x1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m56117k4(ReentrantLock reentrantLock, AbstractC11963qw abstractC11963qw, AbstractC11979vh abstractC11979vh) {
        m56116k4(new C11981w6(abstractC11963qw, reentrantLock), new C11960os(reentrantLock, abstractC11979vh));
    }

    /* JADX INFO: renamed from: x1 */
    public void m56128x1(boolean z, Exception exception) {
        this.f40355x1 = z;
        this.f40353m9 = exception;
        synchronized (this.f40349dy) {
            try {
                this.f40352kk = true;
                C5458kk c5458kk = this.f40351k4;
                if (c5458kk != null) {
                    c5458kk.mo22555x1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m56122k4(boolean z) {
        m56127x1(z);
        m56115jd();
    }

    /* JADX INFO: renamed from: k4 */
    public void m56123k4(boolean z, Exception exception) {
        m56128x1(z, exception);
        m56115jd();
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m56124k4(int i, boolean z) {
        if (mo18728kk()) {
            return true;
        }
        return mo18731x1().m22560k4(i, z);
    }
}
