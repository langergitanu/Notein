package com.aspose.slides.internal.p541z6;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z6.h4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13445h4 implements InterfaceC13441ck {

    /* JADX INFO: renamed from: du */
    private final InterfaceC13446jd f45024du;

    /* JADX INFO: renamed from: h4 */
    private C3130fa f45025h4;

    /* JADX INFO: renamed from: k4 */
    private final Object f45026k4;

    /* JADX INFO: renamed from: kk */
    private boolean f45027kk;

    /* JADX INFO: renamed from: to */
    private final InterfaceC13440c5 f45028to;

    /* JADX INFO: renamed from: x1 */
    private String f45029x1;

    public C13445h4() {
        this.f45026k4 = new Object();
        this.f45027kk = false;
        this.f45028to = new C13448kk();
        this.f45024du = new C13442du();
    }

    /* JADX INFO: renamed from: x1 */
    private void m62554x1() {
        for (String str : C3142to.m13420k4(this.f45024du.mo62547x1(), C14113y2.m67402k4("{0}*", this.f45024du.mo62546kk()))) {
            try {
                C3130fa c3130faM13353k4 = C3131h4.m13353k4(C3141rv.m13412x1(str, ".pid"), 3, 3, 0);
                if (c3130faM13353k4 != null) {
                    c3130faM13353k4.dispose();
                }
                try {
                    C3142to.m13419k4(str, true);
                } catch (RuntimeException e) {
                    this.f45028to.mo62542k4(e.toString());
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        synchronized (this.f45026k4) {
            try {
                if (this.f45027kk) {
                    C3130fa c3130fa = this.f45025h4;
                    if (c3130fa != null) {
                        c3130fa.close();
                        C3131h4.m13365x1(this.f45029x1);
                    }
                    C3142to.m13424x1(this.f45024du.mo62545k4());
                } else if (C3142to.m13421kk(this.f45024du.mo62545k4())) {
                    C3142to.m13424x1(this.f45024du.mo62545k4());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13441ck
    public final boolean getInitialized() {
        boolean z;
        synchronized (this.f45026k4) {
            z = this.f45027kk;
        }
        return z;
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13441ck
    public final String getNextTempFilePath() {
        String strM13412x1;
        String strM66538k4 = C14047bz.m66536x1().m66538k4("N");
        synchronized (this.f45026k4) {
            try {
                if (!this.f45027kk) {
                    throw new InvalidOperationException("Blob temp file service is not initialized successfully");
                }
                strM13412x1 = C3141rv.m13412x1(this.f45024du.mo62545k4(), strM66538k4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return strM13412x1;
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13441ck
    public final void init() {
        synchronized (this.f45026k4) {
            try {
                if (this.f45027kk) {
                    throw new InvalidOperationException("Already initialized");
                }
                m62554x1();
                this.f45029x1 = C3141rv.m13412x1(this.f45024du.mo62545k4(), ".pid");
                try {
                    C3142to.m13416k4(this.f45024du.mo62545k4());
                    this.f45025h4 = new C3130fa(this.f45029x1, 1);
                    this.f45027kk = true;
                } catch (RuntimeException e) {
                    this.f45028to.mo62542k4(e.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC13446jd m62555k4() {
        return this.f45024du;
    }

    public C13445h4(InterfaceC13440c5 interfaceC13440c5, InterfaceC13446jd interfaceC13446jd) {
        this.f45026k4 = new Object();
        this.f45027kk = false;
        if (interfaceC13440c5 == null) {
            throw new ArgumentNullException("errorHandler");
        }
        if (interfaceC13446jd == null) {
            throw new ArgumentNullException("tempFileInfo");
        }
        this.f45028to = interfaceC13440c5;
        this.f45024du = interfaceC13446jd;
    }

    public C13445h4(String str) {
        this.f45026k4 = new Object();
        this.f45027kk = false;
        this.f45028to = new C13448kk();
        this.f45024du = new C13442du(str);
    }
}
