package com.aspose.slides.internal.p329p4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p112en.C3769h4;
import com.aspose.slides.internal.p112en.C3773m9;
import com.aspose.slides.internal.p112en.InterfaceC3764c5;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p255lq.C6221x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.p4.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C7180ck extends C7187kk implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private final List<C3769h4> f19327k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC3150x6 f19328kk;

    /* JADX INFO: renamed from: x1 */
    private final AbstractC3150x6 f19329x1;

    public C7180ck(C7187kk c7187kk, AbstractC3150x6 abstractC3150x6) {
        super(c7187kk);
        C6005k4.m24261k4(c7187kk != null);
        C6005k4.m24261k4(abstractC3150x6 != null);
        this.f19329x1 = abstractC3150x6;
        this.f19327k4 = new List<>();
    }

    /* JADX INFO: renamed from: h4 */
    private List<C3769h4> m27754h4() {
        this.f19328kk = new C3152yj();
        this.f19329x1.seek(0L, 0);
        C13447k4.m62556k4(this.f19329x1, this.f19328kk);
        C7185jd c7185jdMo27761to = mo27761to();
        List<C3769h4> list = new List<>();
        if (c7185jdMo27761to == null) {
            return list;
        }
        if (C7019kk.m27469x1(c7185jdMo27761to, C7182dy.class)) {
            list.addItem(m27758x1((C7182dy) c7185jdMo27761to, 0));
            return list;
        }
        if (!C7019kk.m27469x1(c7185jdMo27761to, C7186k4.class)) {
            throw new IOException(C14113y2.m67402k4("Unknown filter type is encountered: {0}", c7185jdMo27761to));
        }
        list.addRange(m27755k4((C7186k4) c7185jdMo27761to));
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private List<C3769h4> m27755k4(C7186k4 c7186k4) {
        int iM27757x1;
        return (c7186k4.m27778k4() <= 1 || (iM27757x1 = m27757x1(c7186k4)) == -1) ? m27756k4(c7186k4, 0) : m27756k4(c7186k4, iM27757x1);
    }

    /* JADX INFO: renamed from: x1 */
    private int m27757x1(C7186k4 c7186k4) {
        for (int i = 0; i < c7186k4.m27778k4(); i++) {
            if (((C7182dy) c7186k4.m27785kk(i)) == C7182dy.f19742zm) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        AbstractC3150x6 abstractC3150x6 = this.f19328kk;
        if (abstractC3150x6 != null) {
            abstractC3150x6.dispose();
            this.f19328kk = null;
        }
    }

    /* JADX INFO: renamed from: du */
    public final C3769h4 m27759du() {
        return this.f19327k4.size() < 1 ? C3769h4.m15096k4() : (C3769h4) OooO0O0.OooO00o(this.f19327k4, 1);
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC3150x6 mo27760kk() {
        if (this.f19328kk == null) {
            this.f19327k4.addRange(m27754h4());
        }
        C6005k4.m24261k4(this.f19328kk != null);
        C3152yj c3152yj = new C3152yj();
        this.f19328kk.seek(0L, 0);
        C6221x1.m25204k4(this.f19328kk, c3152yj, 2048);
        return c3152yj;
    }

    /* JADX INFO: renamed from: to */
    public C7185jd mo27761to() {
        return mo27768h4(C7182dy.f19737ze);
    }

    /* JADX INFO: renamed from: k4 */
    private List<C3769h4> m27756k4(C7186k4 c7186k4, int i) {
        List<C3769h4> list = new List<>();
        if (i >= 0 && i < c7186k4.m27778k4()) {
            list.addItem(m27758x1((C7182dy) c7186k4.m27785kk(i), i));
        }
        for (int i2 = 0; i2 < c7186k4.m27778k4(); i2++) {
            if (i2 != i) {
                list.addItem(m27758x1((C7182dy) c7186k4.m27785kk(i2), i2));
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    private C3769h4 m27758x1(C7182dy c7182dy, int i) {
        C6005k4.m24261k4(c7182dy != null);
        InterfaceC3764c5 interfaceC3764c5M15098k4 = new C3773m9().m15098k4(c7182dy);
        AbstractC3150x6 abstractC3150x6 = this.f19328kk;
        if (abstractC3150x6 != null) {
            abstractC3150x6.dispose();
        }
        this.f19328kk = new C3152yj();
        this.f19329x1.seek(0L, 0);
        return interfaceC3764c5M15098k4.mo15090k4(this.f19329x1, this.f19328kk, this, i);
    }
}
