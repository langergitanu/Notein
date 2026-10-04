package com.aspose.slides.internal.p367qp;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p205ji.C5447ar;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.microsoft.identity.common.java.providers.microsoft.MicrosoftAuthorizationResponse;

/* JADX INFO: renamed from: com.aspose.slides.internal.qp.to */
/* JADX INFO: loaded from: classes4.dex */
public class C9909to implements IDisposable {

    /* JADX INFO: renamed from: du */
    private final Object f35770du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC9910x1 f35771h4;

    /* JADX INFO: renamed from: k4 */
    public final AbstractC7018k4<AbstractC9910x1> f35772k4;

    /* JADX INFO: renamed from: kk */
    private boolean f35773kk;

    /* JADX INFO: renamed from: to */
    private C5447ar f35774to;

    /* JADX INFO: renamed from: x1 */
    private double f35775x1;

    public C9909to() {
        this(C7019kk.m27433c5(100, 9));
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        m48773kk(true);
        C14094ts.m67303k4(this);
    }

    public void finalize() throws Throwable {
        m48773kk(false);
        super.finalize();
    }

    /* JADX INFO: renamed from: kk */
    public void m48772kk() {
        m48775x1(true);
    }

    /* JADX INFO: renamed from: x1 */
    public void m48774x1() {
        m48775x1(false);
    }

    public C9909to(double d) {
        this.f35775x1 = 100.0d;
        this.f35773kk = true;
        this.f35770du = new Object();
        this.f35772k4 = new C9904du(this);
        if (d > 2.147483647E9d) {
            throw new ArgumentException(C14113y2.m67408k4("Invalid value: ", C14044b3.m66425h4(d)), MicrosoftAuthorizationResponse.INTERVAL);
        }
        this.f35773kk = true;
        m48769k4(d);
    }

    /* JADX INFO: renamed from: k4 */
    public void m48769k4(double d) {
        if (d <= 0.0d) {
            throw new ArgumentException(C14113y2.m67408k4("Invalid value: ", C14044b3.m66425h4(d)));
        }
        synchronized (this.f35770du) {
            try {
                this.f35775x1 = d;
                C5447ar c5447ar = this.f35774to;
                if (c5447ar != null) {
                    c5447ar.m22518k4(C7019kk.m27462to(Double.valueOf(d), 14), this.f35773kk ? C7019kk.m27462to(Double.valueOf(this.f35775x1), 14) : 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public void m48773kk(boolean z) {
        if (z) {
            m48774x1();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m48775x1(boolean z) {
        synchronized (this.f35770du) {
            try {
                C5447ar c5447ar = this.f35774to;
                if ((c5447ar != null) != z) {
                    if (z) {
                        this.f35774to = new C5447ar(new C9908m9(this), this, C7019kk.m27462to(Double.valueOf(this.f35775x1), 14), this.f35773kk ? C7019kk.m27462to(Double.valueOf(this.f35775x1), 14) : 0);
                    } else {
                        c5447ar.dispose();
                        this.f35774to = null;
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m48768k4(Object obj) {
        C9909to c9909to = (C9909to) obj;
        if (c9909to.m48771k4()) {
            AbstractC9910x1 abstractC9910x1 = c9909to.f35771h4;
            if (!c9909to.f35773kk) {
                c9909to.m48775x1(false);
            }
            if (abstractC9910x1 == null) {
                return;
            }
            try {
                abstractC9910x1.invoke(c9909to, new C9906k4(C14084qq.m67081jd().Clone()));
            } catch (RuntimeException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m48770k4(boolean z) {
        this.f35773kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m48771k4() {
        boolean z;
        synchronized (this.f35770du) {
            z = this.f35774to != null;
        }
        return z;
    }
}
