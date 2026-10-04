package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8336nf;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.xn */
/* JADX INFO: loaded from: classes3.dex */
class C14808xn implements Comparable<C14808xn> {

    /* JADX INFO: renamed from: k4 */
    private final C8336nf f50161k4;

    public C14808xn(int i) {
        C8336nf c8336nf = new C8336nf();
        this.f50161k4 = c8336nf;
        c8336nf.m37479k4(C14113y2.m67408k4("{", C14113y2.m67358c5(C14047bz.m66536x1().toString()), "}"));
        c8336nf.m37477k4(i);
        c8336nf.m37475h4(C14113y2.f47374k4);
        c8336nf.m37481kk(C14113y2.f47374k4);
        c8336nf.m37484to("0");
        c8336nf.m37473du("0");
    }

    /* JADX INFO: renamed from: x1 */
    public static C8336nf m73503x1(C14808xn c14808xn) {
        return c14808xn.f50161k4;
    }

    /* JADX INFO: renamed from: du */
    public final String m73504du() {
        return this.f50161k4.m37474h4();
    }

    /* JADX INFO: renamed from: h4 */
    public final String m73505h4() {
        return this.f50161k4.m37482m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m73506k4() {
        return this.f50161k4.m37485x1();
    }

    /* JADX INFO: renamed from: kk */
    public final String m73511kk() {
        return this.f50161k4.m37480kk();
    }

    /* JADX INFO: renamed from: to */
    public final long m73512to() {
        return this.f50161k4.m37472du();
    }

    public C14808xn(C8336nf c8336nf) {
        this.f50161k4 = c8336nf;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C14808xn c14808xn) {
        if ((m73512to() & 4294967295L) > (c14808xn.m73512to() & 4294967295L)) {
            return 1;
        }
        return (m73512to() & 4294967295L) < (4294967295L & c14808xn.m73512to()) ? -1 : 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m73513x1() {
        return this.f50161k4.m37483to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73508k4(C14648us c14648us) {
        if (c14648us == null) {
            throw new ArgumentNullException("point");
        }
        this.f50161k4.m37484to(c14648us.m71876to());
        c14648us.m71871k4(this.f50161k4.m37476k4());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73514x1(C14648us c14648us) {
        if (c14648us == null) {
            throw new ArgumentNullException("point");
        }
        this.f50161k4.m37473du(c14648us.m71876to());
        c14648us.m71871k4(this.f50161k4.m37476k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73509k4(C14648us c14648us, C14664v5 c14664v5) {
        if (c14648us == null) {
            throw new ArgumentNullException("point");
        }
        this.f50161k4.m37487x1(c14648us.m71876to());
        IGenericEnumerator<C14808xn> it = c14664v5.iterator();
        long j = 0;
        while (it.hasNext()) {
            try {
                C14808xn next = it.next();
                if (next != this && C14113y2.m67363du(next.m73511kk(), m73511kk()) && next.m73506k4() == m73506k4()) {
                    j++;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f50161k4.m37478k4(j);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73515x1(C14648us c14648us, C14664v5 c14664v5) {
        if (c14648us == null) {
            throw new ArgumentNullException("point");
        }
        this.f50161k4.m37481kk(c14648us.m71876to());
        IGenericEnumerator<C14808xn> it = c14664v5.iterator();
        long j = 0;
        while (it.hasNext()) {
            try {
                C14808xn next = it.next();
                if (next != this && C14113y2.m67363du(next.m73513x1(), m73513x1()) && next.m73506k4() == m73506k4()) {
                    j++;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f50161k4.m37486x1(j);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73510k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("layoutId");
        }
        this.f50161k4.m37475h4(str);
    }
}
