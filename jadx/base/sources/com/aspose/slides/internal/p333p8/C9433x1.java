package com.aspose.slides.internal.p333p8;

import com.aspose.slides.internal.p020ae.C1364kk;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p329p4.C7189m9;
import com.aspose.slides.internal.p329p4.C7190to;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.p8.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9433x1 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private final C7190to f34318k4;

    /* JADX INFO: renamed from: x1 */
    private C9429kk f34319x1;

    public C9433x1() {
        C7190to c7190to = new C7190to();
        this.f34318k4 = c7190to;
        c7190to.m27833k4(new C7187kk());
        C7187kk c7187kk = new C7187kk();
        c7190to.m27837kk().m27815x1(C7182dy.f19468iq, c7187kk);
        C7182dy c7182dy = C7182dy.f19711xz;
        c7187kk.m27815x1(c7182dy, C7182dy.f19684wp);
        c7187kk.m27815x1(C7182dy.f19608rm, C7182dy.m27765x1("1.4"));
        C7187kk c7187kk2 = new C7187kk();
        C7182dy c7182dy2 = C7182dy.f19683wm;
        c7187kk.m27815x1(c7182dy2, c7187kk2);
        c7187kk2.m27815x1(c7182dy, c7182dy2);
        c7187kk2.m27815x1(C7182dy.f19530mi, new C7186k4());
        c7187kk2.m27815x1(C7182dy.f19552nv, C7189m9.m27821k4());
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        if (this.f34318k4.m27839to()) {
            return;
        }
        this.f34318k4.dispose();
    }

    /* JADX INFO: renamed from: k4 */
    public final C9429kk m46196k4() {
        C7190to c7190to;
        if (this.f34319x1 == null && (c7190to = this.f34318k4) != null && c7190to.m27837kk() != null) {
            C7187kk c7187kk = (C7187kk) this.f34318k4.m27837kk().mo27768h4(C7182dy.f19468iq);
            if (c7187kk != null) {
                this.f34319x1 = new C9429kk(this, c7187kk);
            } else {
                this.f34319x1 = new C9429kk(this);
            }
        }
        return this.f34319x1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m46197kk() {
        if (m46196k4() != null) {
            return m46196k4().m46161k4().size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: to */
    public final C7190to m46198to() {
        return this.f34318k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9423du m46199x1() {
        C7187kk c7187kk;
        C7190to c7190to = this.f34318k4;
        if (c7190to == null || c7190to.m27837kk() == null || (c7187kk = (C7187kk) this.f34318k4.m27837kk().mo27768h4(C7182dy.f19448hc)) == null) {
            return null;
        }
        return new C9423du(c7187kk);
    }

    private C9433x1(C7190to c7190to) {
        this.f34318k4 = c7190to;
    }

    /* JADX INFO: renamed from: k4 */
    public static C9433x1 m46195k4(AbstractC3150x6 abstractC3150x6) {
        return new C9433x1(new C1364kk(abstractC3150x6).mo8078h4());
    }
}
