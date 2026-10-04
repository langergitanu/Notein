package com.aspose.slides.internal.p253lm;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p055c4.AbstractC1946kk;
import com.aspose.slides.internal.p204jf.C5445k4;
import com.aspose.slides.internal.p204jf.C5446x1;
import com.aspose.slides.internal.p217k4.C5587jd;
import com.aspose.slides.internal.p217k4.C5589kk;
import com.aspose.slides.internal.p217k4.C5598um;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.jw */
/* JADX INFO: loaded from: classes4.dex */
public class C6149jw {

    /* JADX INFO: renamed from: k4 */
    public final C6184ts f17367k4;

    public C6149jw() {
        this(5);
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC6123ca m24869k4(C6218zm c6218zm) {
        this.f17367k4.mo10076k4(c6218zm);
        return this.f17367k4.mo10039c5();
    }

    /* JADX INFO: renamed from: kk */
    private String m24871kk(String str) {
        C6765kp c6765kp = new C6765kp();
        while (this.f17367k4.m25053k4().size() > 0) {
            c6765kp.m26810x1(this.f17367k4.m25053k4().pop());
        }
        if (c6765kp.m26807x1() > 0) {
            c6765kp.m26786k4(0, C14113y2.m67408k4(C14052dq.m66570kk(), "------ Stack Trace:", C14052dq.m66570kk()));
        }
        return C14113y2.m67408k4(str, C14052dq.m66570kk()) + c6765kp;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC6123ca m24874x1(String str) {
        if (str == null) {
            throw new ArgumentException("Script can't be null", "script");
        }
        try {
            return m24869k4(m24870k4(str));
        } catch (C6158m4 e) {
            C6128dq c6128dq = (C6128dq) C7019kk.m27452k4((Object) e.m24921k4(), C6128dq.class);
            throw new C6208y2(m24871kk(c6128dq != null ? c6128dq.mo24769C_().toString() : e.getMessage()), e);
        } catch (RuntimeException e2) {
            throw new C6208y2(m24871kk(e2.getMessage()), e2);
        }
    }

    private C6149jw(int i) {
        this.f17367k4 = new C6184ts(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC6173qw m24872k4() {
        return this.f17367k4.mo10078to();
    }

    /* JADX INFO: renamed from: k4 */
    public static C6218zm m24870k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return null;
        }
        C5446x1 c5446x1 = new C5446x1(new C5587jd(new C5445k4(new C5589kk(str))));
        try {
            C6218zm c6218zm = c5446x1.m22456ii().f14848kk;
            if (c5446x1.m22470m9() == null || c5446x1.m22470m9().size() <= 0) {
                return c6218zm;
            }
            throw new C6208y2(C14113y2.m67403k4(C14052dq.m66570kk(), c5446x1.m22470m9().toArray(new String[0])));
        } catch (C5598um e) {
            throw new C6208y2(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24873k4(AbstractC1946kk abstractC1946kk) {
        m24872k4().mo24970k4(abstractC1946kk);
    }
}
