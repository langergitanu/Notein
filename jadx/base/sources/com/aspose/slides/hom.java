package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class hom {

    /* JADX INFO: renamed from: k4 */
    private final BaseSlide f5556k4;

    /* JADX INFO: renamed from: kk */
    private long f5557kk;

    /* JADX INFO: renamed from: to */
    private final Dictionary<Integer, Shape> f5558to = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private final com.aspose.slides.internal.p332p7.pkv f5559x1;

    public hom(BaseSlide baseSlide, com.aspose.slides.internal.p332p7.pkv pkvVar) {
        if (baseSlide == null) {
            throw new ArgumentNullException("slide");
        }
        this.f5556k4 = baseSlide;
        this.f5559x1 = pkvVar;
        this.f5557kk = ((m7264dy() & 4294967295L) + 1) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    private long m7260k4(List<Shape> list) {
        List.Enumerator<Shape> it = list.iterator();
        long index = 0;
        while (it.hasNext()) {
            try {
                Shape next = it.next();
                if ((next.getPlaceholder().getIndex() & 4294967295L) > (4294967295L & index)) {
                    index = next.getPlaceholder().getIndex();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return index;
    }

    /* JADX INFO: renamed from: x1 */
    private long m7262x1(BaseSlide baseSlide) {
        return m7260k4(m7261k4(baseSlide));
    }

    /* JADX INFO: renamed from: du */
    public final boolean m7263du() {
        return C7019kk.m27469x1(this.f5556k4, MasterHandoutSlide.class);
    }

    /* JADX INFO: renamed from: dy */
    public final long m7264dy() {
        IThemeable layoutSlide;
        if (m7271to() || m7263du()) {
            return 0L;
        }
        if (m7269kk()) {
            layoutSlide = ((LayoutSlide) m7266k4()).getMasterSlide();
        } else {
            if (!m7272x1()) {
                throw new InvalidOperationException();
            }
            layoutSlide = ((Slide) m7266k4()).getLayoutSlide();
        }
        return m7262x1((BaseSlide) layoutSlide);
    }

    /* JADX INFO: renamed from: h4 */
    public final Dictionary<Integer, Shape> m7265h4() {
        return this.f5558to;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m7269kk() {
        return C7019kk.m27469x1(this.f5556k4, LayoutSlide.class);
    }

    /* JADX INFO: renamed from: m9 */
    public final long m7270m9() {
        return this.f5557kk;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m7271to() {
        return C7019kk.m27469x1(this.f5556k4, MasterSlide.class);
    }

    /* JADX INFO: renamed from: k4 */
    public final BaseSlide m7266k4() {
        return this.f5556k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m7272x1() {
        return C7019kk.m27469x1(this.f5556k4, Slide.class);
    }

    /* JADX INFO: renamed from: k4 */
    private List<Shape> m7261k4(BaseSlide baseSlide) {
        List<Shape> list = new List<>();
        List.Enumerator<Shape> it = baseSlide.m385dy().iterator();
        while (it.hasNext()) {
            try {
                Shape next = it.next();
                if (((Placeholder) next.getPlaceholder()) != null) {
                    list.addItem(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public final Shape m7267k4(byte b) {
        IThemeable layoutSlide;
        if (m7271to() || m7263du()) {
            return null;
        }
        if (m7269kk()) {
            layoutSlide = ((LayoutSlide) m7266k4()).getMasterSlide();
        } else {
            if (!m7272x1()) {
                throw new InvalidOperationException();
            }
            layoutSlide = ((Slide) m7266k4()).getLayoutSlide();
        }
        return ((BaseSlide) layoutSlide).m391k4(b);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7268k4(long j) {
        this.f5557kk = j;
    }
}
