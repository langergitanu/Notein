package com.aspose.slides.internal.p306ny;

import com.aspose.slides.internal.p138fu.C4125h4;
import com.aspose.slides.internal.p138fu.C4126jd;
import com.aspose.slides.internal.p138fu.C4127k4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.ny.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6963x1 implements InterfaceC6962k4, IDisposable {

    /* JADX INFO: renamed from: du */
    private boolean f18945du;

    /* JADX INFO: renamed from: h4 */
    private Object f18946h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f18947k4;

    /* JADX INFO: renamed from: kk */
    private C4127k4 f18948kk;

    /* JADX INFO: renamed from: to */
    private C12019um f18949to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC12008jd f18950x1;

    public C6963x1() {
        this.f18947k4 = false;
        this.f18945du = true;
        Object obj = new Object();
        this.f18946h4 = obj;
        synchronized (obj) {
            C4127k4 c4127k4 = new C4127k4(1, 1);
            this.f18948kk = c4127k4;
            AbstractC12008jd abstractC12008jdM58494k4 = C12549du.m58494k4(c4127k4.m16534dy());
            this.f18950x1 = abstractC12008jdM58494k4;
            abstractC12008jdM58494k4.mo17574to(3);
            this.f18945du = true;
            C12019um c12019um = new C12019um(C12019um.m56799c5());
            this.f18949to = c12019um;
            c12019um.m56817kk(c12019um.m56816kk() | 2048);
        }
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m27220k4(true);
        C14094ts.m67303k4(this);
    }

    @Override // com.aspose.slides.internal.p306ny.InterfaceC6962k4
    /* JADX INFO: renamed from: k4 */
    public final C12015qq mo27216k4(String str, C5659x1 c5659x1) {
        C4126jd c4126jd = new C4126jd();
        try {
            return m27219k4(str, C4125h4.m16500k4(c5659x1, c4126jd));
        } finally {
            c4126jd.dispose();
        }
    }

    public C6963x1(AbstractC12008jd abstractC12008jd, C12019um c12019um) {
        this.f18947k4 = false;
        this.f18945du = true;
        Object obj = new Object();
        this.f18946h4 = obj;
        synchronized (obj) {
            this.f18950x1 = abstractC12008jd;
            this.f18949to = c12019um;
            this.f18945du = false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m27219k4(String str, C12013m9 c12013m9) {
        C12015qq c12015qqMo17490k4;
        synchronized (this.f18946h4) {
            try {
                String[] strArr = {str};
                boolean zM27218k4 = m27218k4(c12013m9, strArr);
                String str2 = strArr[0];
                c12015qqMo17490k4 = zM27218k4 ? this.f18950x1.mo17490k4(str2, c12013m9, C12025x6.f40591k4.Clone(), this.f18949to) : this.f18950x1.mo17490k4(str2, c12013m9, C12025x6.f40591k4.Clone(), this.f18949to);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c12015qqMo17490k4;
    }

    public C6963x1(C12019um c12019um) {
        this();
        synchronized (this.f18946h4) {
            this.f18949to = c12019um;
        }
    }

    @Override // com.aspose.slides.internal.p306ny.InterfaceC6962k4
    /* JADX INFO: renamed from: k4 */
    public final C12019um mo27217k4() {
        C12019um c12019um;
        synchronized (this.f18946h4) {
            c12019um = this.f18949to;
        }
        return c12019um;
    }

    /* JADX INFO: renamed from: k4 */
    public void m27220k4(boolean z) {
        if (this.f18947k4) {
            return;
        }
        synchronized (this.f18946h4) {
            try {
                if (this.f18945du) {
                    C4127k4 c4127k4 = this.f18948kk;
                    if (c4127k4 != null) {
                        c4127k4.dispose();
                        this.f18948kk = null;
                    }
                    AbstractC12008jd abstractC12008jd = this.f18950x1;
                    if (abstractC12008jd != null) {
                        abstractC12008jd.dispose();
                        this.f18950x1 = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f18947k4 = true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m27218k4(C12013m9 c12013m9, String[] strArr) {
        if (C14113y2.m67364dy(c12013m9.m56648m9(), "Tai") == -1) {
            return false;
        }
        String strM67401k4 = C14113y2.m67401k4(strArr[0], "ᦵ", "ᦵ◌");
        strArr[0] = strM67401k4;
        String strM67401k42 = C14113y2.m67401k4(strM67401k4, "ᦶ", "ᦶ◌");
        strArr[0] = strM67401k42;
        String strM67401k43 = C14113y2.m67401k4(strM67401k42, "ᦷ", "ᦷ◌");
        strArr[0] = strM67401k43;
        strArr[0] = C14113y2.m67401k4(strM67401k43, "ᦺ", "ᦺ◌");
        return true;
    }
}
