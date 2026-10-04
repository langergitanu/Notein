package com.aspose.slides.internal.p182ii;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.rv */
/* JADX INFO: loaded from: classes.dex */
public class C4924rv extends C1569kk implements InterfaceC4915m2 {

    /* JADX INFO: renamed from: kk */
    private C4918ne f13506kk;

    public C4924rv(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        interfaceC1566du.mo8386k4(this);
        m8451x1(interfaceC1566du);
        interfaceC1566du.mo8423x1(this);
    }

    /* JADX INFO: renamed from: qw */
    public final C4918ne m20516qw() {
        if (this.f13506kk == null) {
            this.f13506kk = (C4918ne) m8440k4(C4918ne.class);
        }
        return this.f13506kk;
    }

    @Override // com.aspose.slides.internal.p182ii.InterfaceC4915m2
    /* JADX INFO: renamed from: k4 */
    public final void mo20231k4(C4918ne c4918ne) {
        this.f13506kk = c4918ne;
    }
}
