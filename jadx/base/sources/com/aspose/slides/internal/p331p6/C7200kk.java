package com.aspose.slides.internal.p331p6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p121f3.C3844k4;
import com.aspose.slides.internal.p343pr.C9484x1;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.C10931x1;
import com.aspose.slides.internal.p418tf.InterfaceC10927k4;
import com.aspose.slides.internal.p430tx.C11186g8;
import com.aspose.slides.internal.p430tx.C11207os;
import com.aspose.slides.internal.p430tx.C11210qw;
import com.aspose.slides.internal.p430tx.C11212rv;
import com.aspose.slides.internal.p430tx.C11234xw;
import com.aspose.slides.internal.p430tx.C11235y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.AbstractC13958qb;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import com.aspose.slides.p559ms.System.Xml.C13995uw;

/* JADX INFO: renamed from: com.aspose.slides.internal.p6.kk */
/* JADX INFO: loaded from: classes4.dex */
public final class C7200kk {

    /* JADX INFO: renamed from: du */
    private C11210qw f19774du;

    /* JADX INFO: renamed from: kk */
    private C11207os f19776kk;

    /* JADX INFO: renamed from: to */
    private List<C11235y2> f19777to;

    /* JADX INFO: renamed from: k4 */
    private AbstractC13943n5 f19775k4 = null;

    /* JADX INFO: renamed from: x1 */
    private boolean f19778x1 = false;

    /* JADX INFO: renamed from: k4 */
    private AbstractC13943n5 m27861k4() {
        return this.f19778x1 ? this.f19775k4 : C9484x1.m46682k4();
    }

    /* JADX INFO: renamed from: x1 */
    private void m27863x1() {
        if (this.f19776kk == null) {
            throw new InvalidOperationException(C13968ri.m65818k4("No stylesheet was loaded."));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27864k4(AbstractC10925du abstractC10925du, C7202to c7202to, AbstractC13958qb abstractC13958qb, AbstractC13943n5 abstractC13943n5) {
        m27863x1();
        new C11234xw(abstractC10925du, c7202to, abstractC13943n5, this.f19776kk, this.f19777to, this.f19774du).m54187k4(abstractC13958qb);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27865k4(AbstractC10925du abstractC10925du, AbstractC13943n5 abstractC13943n5) {
        if (abstractC10925du == null) {
            throw new ArgumentNullException("stylesheet");
        }
        m27862k4(abstractC10925du, abstractC13943n5, (C3844k4) null);
    }

    /* JADX INFO: renamed from: k4 */
    private void m27862k4(AbstractC10925du abstractC10925du, AbstractC13943n5 abstractC13943n5, C3844k4 c3844k4) {
        C11212rv c11212rv = new C11212rv();
        C11186g8 c11186g8 = new C11186g8(abstractC10925du);
        if (abstractC13943n5 == null) {
            abstractC13943n5 = C13995uw.f47035k4;
        }
        c11212rv.m53937k4(c11186g8, abstractC13943n5, c3844k4);
        this.f19776kk = c11212rv.m53915dy();
        this.f19777to = c11212rv.m53926jd();
        this.f19774du = c11212rv.m53907c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27866k4(InterfaceC10927k4 interfaceC10927k4, C7202to c7202to, AbstractC13958qb abstractC13958qb) {
        if (interfaceC10927k4 == null) {
            throw new ArgumentNullException("input");
        }
        m27864k4(interfaceC10927k4.createNavigator(), c7202to, abstractC13958qb, m27861k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27867k4(InterfaceC10927k4 interfaceC10927k4, AbstractC13943n5 abstractC13943n5) {
        if (interfaceC10927k4 == null) {
            throw new ArgumentNullException("stylesheet");
        }
        m27865k4(interfaceC10927k4.createNavigator(), abstractC13943n5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27868k4(AbstractC13912i5 abstractC13912i5, AbstractC13943n5 abstractC13943n5) {
        m27867k4(new C10931x1(abstractC13912i5, 2), abstractC13943n5);
    }
}
