package com.aspose.slides.internal.p413t1;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C4951af;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p191it.AbstractC5120du;
import com.aspose.slides.internal.p472w8.C11896dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.t1.ak */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10806ak extends AbstractC5120du {
    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: du */
    public void mo16615du(C5061vw c5061vw, C4201h4 c4201h4) {
        C4951af c4951af = (C4951af) c5061vw;
        C11896dy c11896dy = new C11896dy();
        int iM58232k4 = (int) c4951af.m20784x1().m58232k4();
        int iM58236x1 = (int) c4951af.m20784x1().m58236x1();
        if (iM58232k4 > c4951af.m20780k4().m58250h4()) {
            iM58232k4 = c4951af.m20780k4().m58250h4();
        }
        int i = iM58232k4;
        if (iM58236x1 > c4951af.m20780k4().m58256m9()) {
            iM58236x1 = c4951af.m20780k4().m58256m9();
        }
        int i2 = iM58236x1;
        c11896dy.m55539k4(c4951af.m20780k4().m58251k4(), c4951af.m20780k4().m58259x1(), i, i2, 180.0f, 90.0f);
        float f = i / 2.0f;
        c11896dy.m55574x1(c4951af.m20780k4().m58251k4() + f, c4951af.m20780k4().m58259x1(), c4951af.m20780k4().m58254kk() - f, c4951af.m20780k4().m58259x1());
        c11896dy.m55539k4(c4951af.m20780k4().m58254kk() - i, c4951af.m20780k4().m58259x1(), i, i2, -90.0f, 90.0f);
        int i3 = i2 / 2;
        c11896dy.m55576x1(c4951af.m20780k4().m58254kk(), c4951af.m20780k4().m58259x1() + i3, c4951af.m20780k4().m58254kk(), c4951af.m20780k4().m58257to() - i3);
        c11896dy.m55539k4(c4951af.m20780k4().m58254kk() - i, c4951af.m20780k4().m58257to() - i2, i, i2, 0.0f, 90.0f);
        c11896dy.m55574x1(c4951af.m20780k4().m58254kk() - f, c4951af.m20780k4().m58257to(), c4951af.m20780k4().m58251k4() + f, c4951af.m20780k4().m58257to());
        c11896dy.m55539k4(c4951af.m20780k4().m58251k4(), c4951af.m20780k4().m58257to() - i2, i, i2, 90.0f, 90.0f);
        c11896dy.m55576x1(c4951af.m20780k4().m58251k4(), c4951af.m20780k4().m58257to() - i3, c4951af.m20780k4().m58251k4(), c4951af.m20780k4().m58259x1() + i3);
        c11896dy.m55567m9();
        if (c4201h4.m16781yj()) {
            c4201h4.m16755up().m55540k4(c11896dy, false);
        } else {
            mo16659k4(c11896dy, c4201h4);
        }
    }

    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: h4 */
    public boolean mo16667h4(C5061vw c5061vw, C4201h4 c4201h4) {
        return !c4201h4.m16781yj();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo16659k4(C11896dy c11896dy, C4201h4 c4201h4);
}
