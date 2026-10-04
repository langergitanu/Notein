package com.aspose.slides.internal.p405sq;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p237ks.C5909to;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p423to.C11071kk;
import com.aspose.slides.internal.p478wl.C12195xi;

/* JADX INFO: renamed from: com.aspose.slides.internal.sq.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C10317dy extends AbstractC10321m9 {

    /* JADX INFO: renamed from: k4 */
    private C5909to f36746k4;

    public C10317dy(C1569kk c1569kk, C5909to c5909to) {
        super(c1569kk);
        this.f36746k4 = c5909to;
    }

    /* JADX INFO: renamed from: k4 */
    public String m50303k4() {
        int iM26920k4 = this.f36746k4.m23829j2().m26920k4();
        if (iM26920k4 == 0) {
            return "none";
        }
        C6765kp c6765kp = new C6765kp();
        if ((iM26920k4 & 8) == 8) {
            c6765kp.m26792k4(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12195xi.class), 8));
        }
        if ((iM26920k4 & 4) == 4) {
            if (c6765kp.m26807x1() != 0) {
                c6765kp.m26792k4(" ");
            }
            c6765kp.m26792k4(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12195xi.class), 4));
        }
        if ((iM26920k4 & 2) == 2) {
            if (c6765kp.m26807x1() != 0) {
                c6765kp.m26792k4(" ");
            }
            c6765kp.m26792k4(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12195xi.class), 2));
        }
        if ((iM26920k4 & 1) == 1) {
            if (c6765kp.m26807x1() != 0) {
                c6765kp.m26792k4(" ");
            }
            c6765kp.m26792k4(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12195xi.class), 1));
        }
        return c6765kp.toString();
    }
}
