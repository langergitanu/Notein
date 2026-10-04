package com.aspose.slides.internal.p070cx;

import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p309o2.AbstractC6972x1;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p329p4.InterfaceC7193yj;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.cx.h4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2646h4 implements InterfaceC7193yj {

    /* JADX INFO: renamed from: k4 */
    private C7187kk f8488k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC6972x1 f8489x1;

    public AbstractC2646h4(C7187kk c7187kk) {
        m12105x1(c7187kk);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC2646h4 m12104k4(C7187kk c7187kk) {
        int iM27796k4 = c7187kk.m27796k4(C7182dy.f19647tx, 0);
        switch (iM27796k4) {
            case 1:
                return new C2650to(c7187kk);
            case 2:
                return new C2647k4(c7187kk);
            case 3:
                return new C2645dy(c7187kk);
            case 4:
                return new C2648kk(c7187kk);
            case 5:
                return new C2644du(c7187kk);
            case 6:
                return new C2651x1(c7187kk);
            case 7:
                return new C2643c5(c7187kk);
            default:
                throw new IOException(C14113y2.m67402k4("Unknown shading type {0}", Integer.valueOf(iM27796k4)));
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m12105x1(C7187kk c7187kk) {
        this.f8488k4 = c7187kk;
    }

    @Override // com.aspose.slides.internal.p329p4.InterfaceC7193yj
    /* JADX INFO: renamed from: c5 */
    public final C7185jd mo8461c5() {
        return m12107to();
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC6972x1 m12106du() {
        C7185jd c7185jdMo27768h4;
        if (this.f8489x1 == null && (c7185jdMo27768h4 = ((C7187kk) mo8461c5()).mo27768h4(C7182dy.f19664v0)) != null) {
            this.f8489x1 = AbstractC6972x1.m27263k4(c7185jdMo27768h4);
        }
        return this.f8489x1;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract int mo12103k4();

    /* JADX INFO: renamed from: to */
    public final C7187kk m12107to() {
        return this.f8488k4;
    }
}
