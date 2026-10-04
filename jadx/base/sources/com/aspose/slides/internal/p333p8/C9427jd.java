package com.aspose.slides.internal.p333p8;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p255lq.C6221x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7180ck;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7183fa;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.InterfaceC7193yj;
import com.aspose.slides.internal.p348q1.C9609k4;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p8.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C9427jd implements InterfaceC7193yj {

    /* JADX INFO: renamed from: k4 */
    private final C7180ck f34308k4;

    public C9427jd(C7180ck c7180ck) {
        this.f34308k4 = c7180ck;
    }

    /* JADX INFO: renamed from: k4 */
    public static C9427jd m46153k4(C7185jd c7185jd) {
        if (C7019kk.m27469x1(c7185jd, C7180ck.class)) {
            return new C9427jd((C7180ck) C7019kk.m27452k4((Object) c7185jd, C7180ck.class));
        }
        if (C7019kk.m27469x1(c7185jd, C7186k4.class) && ((C7186k4) c7185jd).m27778k4() > 0) {
            return new C9427jd(new C7183fa((C7186k4) C7019kk.m27452k4((Object) c7185jd, C7186k4.class)));
        }
        if (c7185jd == null) {
            return null;
        }
        throw new IOException(C14113y2.m67402k4("Unknown type is encountered: {0}", C14067j2.m66727k4(c7185jd).mo48629x6()));
    }

    @Override // com.aspose.slides.internal.p329p4.InterfaceC7193yj
    /* JADX INFO: renamed from: c5 */
    public final C7185jd mo8461c5() {
        return this.f34308k4;
    }

    /* JADX INFO: renamed from: kk */
    public final List<C7182dy> m46155kk() {
        List<C7182dy> list = new List<>();
        C7185jd c7185jdMo27761to = this.f34308k4.mo27761to();
        if (!C7019kk.m27469x1(c7185jdMo27761to, C7182dy.class)) {
            return C7019kk.m27469x1(c7185jdMo27761to, C7186k4.class) ? ((C7186k4) C7019kk.m27452k4((Object) c7185jdMo27761to, C7186k4.class)).m27780k4(C7182dy.class) : list;
        }
        C7182dy c7182dy = (C7182dy) C7019kk.m27452k4((Object) c7185jdMo27761to, C7182dy.class);
        return new C9609k4(c7182dy, c7182dy, this.f34308k4, C7182dy.f19737ze);
    }

    /* JADX INFO: renamed from: x1 */
    public final C7180ck m46156x1() {
        return this.f34308k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m46154k4() {
        C3152yj c3152yj = new C3152yj();
        AbstractC3150x6 abstractC3150x6Mo27760kk = null;
        try {
            abstractC3150x6Mo27760kk = this.f34308k4.mo27760kk();
            C6221x1.m25204k4(abstractC3150x6Mo27760kk, c3152yj, 4096);
            return C6221x1.m25205k4(c3152yj);
        } finally {
            if (abstractC3150x6Mo27760kk != null) {
                abstractC3150x6Mo27760kk.dispose();
            }
        }
    }
}
