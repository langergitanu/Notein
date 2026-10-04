package com.aspose.slides.internal.p481wp;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10014k4;
import com.aspose.slides.internal.p513xw.C12691dq;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.du */
/* JADX INFO: loaded from: classes5.dex */
public class C12219du {

    /* JADX INFO: renamed from: du */
    private C1375h4 f40641du;

    /* JADX INFO: renamed from: k4 */
    private List<C12220dy> f40642k4;

    /* JADX INFO: renamed from: kk */
    private int f40643kk;

    /* JADX INFO: renamed from: to */
    private C1375h4 f40644to;

    /* JADX INFO: renamed from: x1 */
    private int f40645x1;

    public C12219du(int i, int i2, List<C12220dy> list) {
        new List();
        this.f40645x1 = i;
        this.f40643kk = i2;
        this.f40642k4 = list;
        List.Enumerator<C12220dy> it = list.iterator();
        while (it.hasNext()) {
            try {
                C12220dy next = it.next();
                if (C7019kk.m27469x1(next, C12236up.class)) {
                    ((C12236up) next).m57125h4(i);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final C12691dq m57013c5() {
        C12243yd c12243ydM57022kk = m57022kk();
        return c12243ydM57022kk != null ? C12691dq.m58907k4(c12243ydM57022kk.m57191sv()) : C12691dq.f42215k4;
    }

    /* JADX INFO: renamed from: ck */
    public final int m57014ck() {
        List.Enumerator<C12220dy> it = this.f40642k4.iterator();
        int iM49148k4 = 9;
        while (it.hasNext()) {
            try {
                C12220dy next = it.next();
                if (!next.m57032dy() && next.m57035jd() == 0 && next.mo57031du()) {
                    iM49148k4 = C10014k4.m49148k4(iM49148k4, next.mo57051x1().m57140v4());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return iM49148k4;
    }

    /* JADX INFO: renamed from: du */
    public final C1375h4 m57015du() {
        return this.f40641du;
    }

    /* JADX INFO: renamed from: dy */
    public final C12691dq m57016dy() {
        C12691dq c12691dqM58909k4 = C12691dq.f42215k4;
        C12243yd c12243ydM57022kk = m57022kk();
        if (c12243ydM57022kk != null) {
            c12691dqM58909k4 = C12691dq.m58907k4(c12243ydM57022kk.m57188g8());
        }
        List.Enumerator<C12220dy> it = this.f40642k4.iterator();
        while (it.hasNext()) {
            try {
                C12220dy next = it.next();
                if (!next.m57032dy() && next.m57035jd() == 0 && next.mo57031du()) {
                    c12691dqM58909k4 = c12691dqM58909k4.m58909k4(next.mo57051x1().m57137um());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c12691dqM58909k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final List<C12220dy> m57017h4() {
        return this.f40642k4;
    }

    /* JADX INFO: renamed from: jd */
    public final int m57018jd() {
        List.Enumerator<C12220dy> it = this.f40642k4.iterator();
        int iM49148k4 = 9;
        while (it.hasNext()) {
            try {
                C12220dy next = it.next();
                if (next.mo57045kk()) {
                    iM49148k4 = C10014k4.m49148k4(iM49148k4, next.mo57051x1().m57122bv());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return iM49148k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m57019k4() {
        return this.f40645x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C12243yd m57022kk() {
        return m57020k4(0).m57047m9();
    }

    /* JADX INFO: renamed from: m9 */
    public final C12691dq m57023m9() {
        C12691dq c12691dqM58909k4 = C12691dq.f42215k4;
        C12243yd c12243ydM57022kk = m57022kk();
        if (c12243ydM57022kk != null) {
            c12691dqM58909k4 = C12691dq.m58907k4(c12243ydM57022kk.m57190qm());
        }
        List.Enumerator<C12220dy> it = this.f40642k4.iterator();
        while (it.hasNext()) {
            try {
                C12220dy next = it.next();
                if (next.mo57045kk()) {
                    c12691dqM58909k4 = c12691dqM58909k4.m58909k4(next.mo57051x1().m57121ar());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c12691dqM58909k4;
    }

    /* JADX INFO: renamed from: to */
    public final C1375h4 m57024to() {
        return this.f40644to;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp("EffRow {");
        c6765kp.m26805kk(this.f40645x1);
        c6765kp.m26792k4(m57025x1() == 0 ? " in body" : m57025x1() == 1 ? " in header" : " in footer");
        c6765kp.m26792k4(", ").m26791k4(this.f40644to);
        c6765kp.m26792k4(", ").m26791k4(this.f40641du);
        c6765kp.m26792k4(", ").m26805kk(this.f40642k4.size()).m26792k4(" gu");
        c6765kp.m26792k4("}");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m57025x1() {
        return this.f40643kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12220dy m57020k4(int i) {
        return this.f40642k4.get_Item(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57026x1(C1375h4 c1375h4) {
        this.f40641du = c1375h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57021k4(C1375h4 c1375h4) {
        this.f40644to = c1375h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m57027x1(int i) {
        if (i == 0) {
            return m57020k4(0).m57046kk(0);
        }
        if (i == 1) {
            return m57020k4(0).m57046kk(1);
        }
        throw new ArgumentException(C14113y2.m67408k4("Illegal flag queried: ", C14057f9.m66591x1(i)));
    }
}
