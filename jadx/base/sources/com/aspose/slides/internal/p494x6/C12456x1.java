package com.aspose.slides.internal.p494x6;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p297ne.C6884yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p453uz.C11576fa;
import com.aspose.slides.internal.p453uz.C11581kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.x6.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C12456x1 extends AbstractC12455k4 {

    /* JADX INFO: renamed from: k4 */
    private final int f41458k4;

    /* JADX INFO: renamed from: kk */
    private final IGenericList<C11576fa> f41459kk;

    /* JADX INFO: renamed from: x1 */
    private final C11581kk f41460x1;

    public C12456x1(int i, C11581kk c11581kk, IGenericList<C11576fa> iGenericList) {
        super((byte) 1);
        this.f41458k4 = i;
        this.f41460x1 = c11581kk;
        this.f41459kk = iGenericList;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m58014k4() {
        return this.f41458k4;
    }

    @Override // com.aspose.slides.internal.p494x6.AbstractC12455k4
    public String toString() {
        float fM26948x1;
        double dM26948x1;
        double d;
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("linear-gradient(");
        String strM66711k4 = C14113y2.f47374k4;
        int iM58014k4 = m58014k4();
        if (iM58014k4 == 0) {
            strM66711k4 = TranslateLanguage.TAGALOG;
        } else if (iM58014k4 == 1) {
            strM66711k4 = TranslateLanguage.TURKISH;
        } else if (iM58014k4 == 2) {
            strM66711k4 = "bl";
        } else if (iM58014k4 == 3) {
            strM66711k4 = "br";
        } else if (iM58014k4 == 4 && m58015x1() != null) {
            switch (m58015x1().m54593m9().m26946k4()) {
                case 10:
                    fM26948x1 = m58015x1().m54593m9().m26948x1();
                    break;
                case 11:
                    dM26948x1 = ((double) m58015x1().m54593m9().m26948x1()) * 180.0d;
                    d = 3.141592653589793d;
                    fM26948x1 = (float) (dM26948x1 / d);
                    break;
                case 12:
                    dM26948x1 = m58015x1().m54593m9().m26948x1();
                    d = 0.9d;
                    fM26948x1 = (float) (dM26948x1 / d);
                    break;
                default:
                    fM26948x1 = 0.0f;
                    break;
            }
            strM66711k4 = C14064he.m66711k4(fM26948x1, (InterfaceC14073kp) C6344m9.f18038k4);
        }
        c6765kpOooO00o.m26792k4(strM66711k4);
        IGenericEnumerator<C11576fa> it = this.f41459kk.iterator();
        while (it.hasNext()) {
            try {
                C11576fa next = it.next();
                c6765kpOooO00o.m26796k4(", #{0}", C14057f9.m66587k4(next.m54579m9().m56506h4(), "X4"));
                if (next.m54578dy() != null && next.m54578dy().m26946k4() == 1) {
                    c6765kpOooO00o.m26790k4(C6884yj.f18824k4, " {0}", C14064he.m66711k4(next.m54578dy().m26948x1() / 100.0f, (InterfaceC14073kp) C6344m9.f18038k4));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c6765kpOooO00o.m26792k4(")");
        return c6765kpOooO00o.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final C11581kk m58015x1() {
        return this.f41460x1;
    }
}
