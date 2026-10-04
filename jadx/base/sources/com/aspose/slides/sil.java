package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10458gz;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.C10511kn;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class sil extends ri7 {

    /* JADX INFO: renamed from: du */
    private int f48856du;

    /* JADX INFO: renamed from: kk */
    private boolean f48857kk;

    /* JADX INFO: renamed from: to */
    private List<qah> f48858to;

    public sil(qah qahVar) {
        super(qahVar);
        this.f48857kk = false;
        this.f48858to = new List<>();
        this.f48856du = 0;
        if (m70153yj() != null) {
            this.f48856du = m70153yj().f48856du + 1;
        } else {
            this.f48857kk = true;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m70640k4(AbstractC10571o4 abstractC10571o4) {
        AbstractC10458gz abstractC10458gz = (AbstractC10458gz) C7019kk.m27452k4((Object) abstractC10571o4, AbstractC10458gz.class);
        if (abstractC10458gz == null) {
            return;
        }
        qah qahVar = new qah(abstractC10458gz, this);
        sil silVar = (sil) C7019kk.m27452k4((Object) qahVar.m69481du(), sil.class);
        if (silVar == null) {
            qahVar.m69481du().mo6946c5();
        } else {
            silVar.m70647x1();
        }
    }

    /* JADX INFO: renamed from: du */
    public final List<AbstractC10571o4> m70641du() {
        return m70644kk().m50513yj();
    }

    /* JADX INFO: renamed from: h4 */
    public final List<qah> m70642h4() {
        return this.f48858to;
    }

    /* JADX INFO: renamed from: kk */
    public final C10511kn m70644kk() {
        return (C10511kn) this.f48596k4.m69495x1();
    }

    /* JADX INFO: renamed from: m9 */
    public final ShapeCollection m70645m9() {
        return this.f48596k4.m69482dy() == 4 ? ((Table) this.f48599x1).m2594xw() : this.f48596k4.m69482dy() == 7 ? ((LegacyDiagram) this.f48599x1).m2594xw() : ((GroupShape) this.f48599x1).f2428k4;
    }

    /* JADX INFO: renamed from: to */
    public final GroupShape m70646to() {
        if (this.f48599x1 == null) {
            m70142jd();
        }
        return (GroupShape) this.f48599x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m70647x1() {
        if (this.f48596k4.m69492rv()) {
            List.Enumerator<AbstractC10571o4> it = m70641du().iterator();
            boolean z = false;
            while (it.hasNext()) {
                try {
                    AbstractC10571o4 next = it.next();
                    if (z) {
                        m70640k4(next);
                    }
                    z = true;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            mo6946c5();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m70643k4() {
        if (this.f48599x1 != null) {
            return false;
        }
        if (!this.f48857kk) {
            throw new InvalidDataException("The trying to initialize a non-root group-shape!");
        }
        BaseSlide baseSlideM64735up = m70149up().m64735up();
        GroupShape groupShape = new GroupShape(baseSlideM64735up);
        baseSlideM64735up.f1077kk = groupShape;
        this.f48599x1 = groupShape;
        m70646to().m2557k4(new LineFormat(m70646to()));
        m70646to().m2577to(1L);
        return true;
    }
}
