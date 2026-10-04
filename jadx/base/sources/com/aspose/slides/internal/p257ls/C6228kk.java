package com.aspose.slides.internal.p257ls;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p419tg.C10934du;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.ls.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6228kk extends C10934du {

    /* JADX INFO: renamed from: to */
    private int f17652to;

    public C6228kk() {
        this.f38027k4 = "2.16.840.1.113730.1.1";
    }

    @Override // com.aspose.slides.internal.p419tg.C10934du
    /* JADX INFO: renamed from: k4 */
    public void mo25217k4() {
        C12842x1 c12842x1 = new C12842x1(this.f38028kk.m59717to());
        if (C7019kk.m27462to(Byte.valueOf(c12842x1.m59718x1()), 6) != 3) {
            throw new ArgumentException("Invalid NetscapeCertType extension");
        }
        for (int i = 1; i < c12842x1.m59717to().length; i++) {
            this.f17652to = C7019kk.m27462to(Byte.valueOf(c12842x1.m59717to()[i]), 6) + (this.f17652to << 8);
        }
    }

    @Override // com.aspose.slides.internal.p419tg.C10934du
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        if (m25222k4(128)) {
            c6765kp.m26792k4("SSL Client Authentication");
        }
        if (m25222k4(64)) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(" , ");
            }
            c6765kp.m26792k4("SSL Server Authentication");
        }
        if (m25222k4(32)) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(" , ");
            }
            c6765kp.m26792k4("SMIME");
        }
        if (m25222k4(16)) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(" , ");
            }
            c6765kp.m26792k4("Object Signing");
        }
        if (m25222k4(4)) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(" , ");
            }
            c6765kp.m26792k4("SSL CA");
        }
        if (m25222k4(2)) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(" , ");
            }
            c6765kp.m26792k4("SMIME CA");
        }
        if (m25222k4(1)) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(" , ");
            }
            c6765kp.m26792k4("Object Signing CA");
        }
        c6765kp.m26792k4("(");
        c6765kp.m26792k4(C14057f9.m66588k4(this.f17652to, "X2", C11697x1.m55250kk()));
        c6765kp.m26792k4(")");
        c6765kp.m26792k4(C14052dq.m66570kk());
        return c6765kp.toString();
    }

    public C6228kk(C10934du c10934du) {
        super(c10934du);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m25222k4(int i) {
        int iM66999m9 = C14080ne.m66999m9(C7019kk.m27466x1(i), C11697x1.m55250kk());
        return (this.f17652to & iM66999m9) == iM66999m9;
    }
}
