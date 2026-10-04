package com.aspose.slides.internal.p257ls;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p419tg.C10934du;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p525yi.C12828kk;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.ls.du */
/* JADX INFO: loaded from: classes4.dex */
public class C6225du extends C10934du {

    /* JADX INFO: renamed from: du */
    private int f17643du;

    /* JADX INFO: renamed from: to */
    private boolean f17644to;

    public C6225du() {
        this.f38027k4 = "2.5.29.19";
        this.f17643du = -1;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m25216h4() {
        return this.f17644to;
    }

    @Override // com.aspose.slides.internal.p419tg.C10934du
    /* JADX INFO: renamed from: k4 */
    public void mo25217k4() {
        this.f17644to = false;
        this.f17643du = -1;
        C12842x1 c12842x1 = new C12842x1(this.f38028kk.m59717to());
        if (c12842x1.m59718x1() != 48) {
            throw new ArgumentException("Invalid BasicConstraints extension");
        }
        C12842x1 c12842x1M59710k4 = c12842x1.m59710k4(0);
        if (c12842x1M59710k4 != null && c12842x1M59710k4.m59718x1() == 1) {
            this.f17644to = c12842x1M59710k4.m59717to()[0] == 255;
            c12842x1M59710k4 = c12842x1.m59710k4(1);
        }
        if (c12842x1M59710k4 == null || c12842x1M59710k4.m59718x1() != 2) {
            return;
        }
        this.f17643du = C12828kk.m59648k4(c12842x1M59710k4);
    }

    @Override // com.aspose.slides.internal.p419tg.C10934du
    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("Subject Type=");
        c6765kpOooO00o.m26792k4(this.f17644to ? "CA" : "End Entity");
        c6765kpOooO00o.m26792k4(C14052dq.f47188k4);
        c6765kpOooO00o.m26792k4("Path Length Constraint=");
        int i = this.f17643du;
        c6765kpOooO00o.m26792k4(i == -1 ? "None" : C14057f9.m66586k4(i, (InterfaceC14073kp) C11697x1.m55250kk()));
        c6765kpOooO00o.m26792k4(C14052dq.f47188k4);
        return c6765kpOooO00o.toString();
    }

    @Override // com.aspose.slides.internal.p419tg.C10934du
    /* JADX INFO: renamed from: x1 */
    public void mo25218x1() {
        int i;
        C12842x1 c12842x1 = new C12842x1(PatternStyle.Wave);
        if (this.f17644to) {
            c12842x1.m59712k4(new C12842x1((byte) 1, new byte[]{-1}));
        }
        if (this.f17644to && (i = this.f17643du) >= 0) {
            c12842x1.m59712k4(C12828kk.m59649k4(i));
        }
        C12842x1 c12842x12 = new C12842x1((byte) 4);
        this.f38028kk = c12842x12;
        c12842x12.m59712k4(c12842x1);
    }

    public C6225du(C10934du c10934du) {
        super(c10934du);
    }
}
