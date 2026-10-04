package com.aspose.slides.internal.p475wh;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p167hh.AbstractC4584k4;
import com.aspose.slides.internal.p167hh.C4587x1;
import com.aspose.slides.internal.p274mh.AbstractC6384k4;
import com.aspose.slides.internal.p274mh.C6385kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p316of.C7035kk;
import com.aspose.slides.internal.p316of.C7036m9;
import com.aspose.slides.internal.p316of.C7037to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.dy */
/* JADX INFO: loaded from: classes5.dex */
public final class C12004dy implements Cloneable {

    /* JADX INFO: renamed from: k4 */
    private static final C12004dy f40510k4;

    /* JADX INFO: renamed from: kk */
    private static final C12004dy f40511kk;

    /* JADX INFO: renamed from: to */
    private static final C6385kk f40512to = new C6385kk();

    /* JADX INFO: renamed from: x1 */
    private static final C12004dy f40513x1;

    /* JADX INFO: renamed from: du */
    private AbstractC6384k4 f40514du;

    /* JADX INFO: renamed from: dy */
    private boolean f40515dy;

    /* JADX INFO: renamed from: h4 */
    private String f40516h4;

    /* JADX INFO: renamed from: m9 */
    private C4587x1 f40517m9;

    static {
        C12004dy c12004dyM27506k4 = C7037to.m27506k4(2);
        C12004dy c12004dyM27506k42 = C7037to.m27506k4(1);
        C12004dy c12004dyM27506k43 = C7037to.m27506k4(0);
        f40510k4 = c12004dyM27506k4;
        f40513x1 = c12004dyM27506k42;
        f40511kk = c12004dyM27506k43;
    }

    public C12004dy(String str) {
        this(str, null);
    }

    /* JADX INFO: renamed from: c5 */
    private AbstractC4584k4.k4 m56517c5(int i) {
        return m56518dy(i).mo18927jd();
    }

    /* JADX INFO: renamed from: dy */
    private AbstractC4584k4 m56518dy(int i) {
        AbstractC4584k4 abstractC4584k4M18946k4 = this.f40517m9.m18946k4(i, true);
        if (abstractC4584k4M18946k4 != null) {
            return abstractC4584k4M18946k4;
        }
        AbstractC4584k4 abstractC4584k4M26208k4 = this.f40514du.m26208k4(m56527du(), i);
        this.f40517m9.m18948k4(abstractC4584k4M26208k4);
        return abstractC4584k4M26208k4;
    }

    /* JADX INFO: renamed from: jd */
    private boolean m56520jd(int i) {
        return m56533m9(i) != null;
    }

    /* JADX INFO: renamed from: du */
    public int m56526du(int i) {
        return m56517c5(i).m18941to();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12004dy) && C14113y2.m67382k4(m56527du(), ((C12004dy) obj).m56527du(), true) == 0;
    }

    /* JADX INFO: renamed from: h4 */
    public void m56528h4() {
    }

    public int hashCode() {
        return m56527du().toLowerCase().hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public float m56530k4(int i, char c, float f) {
        return m56518dy(i).mo18928k4(c, f);
    }

    /* JADX INFO: renamed from: kk */
    public int m56532kk(int i) {
        return m56517c5(i).m18940kk();
    }

    /* JADX INFO: renamed from: m9 */
    public AbstractC4584k4 m56533m9(int i) {
        AbstractC4584k4 abstractC4584k4M18946k4 = this.f40517m9.m18946k4(i, false);
        return abstractC4584k4M18946k4 == null ? this.f40517m9.m18950x1()[0] : abstractC4584k4M18946k4;
    }

    /* JADX INFO: renamed from: to */
    public int m56535to(int i) {
        return m56517c5(i).m18939k4();
    }

    public String toString() {
        return C14113y2.m67402k4("[{0}: Name={1}]", C12004dy.class.getName(), m56527du());
    }

    /* JADX INFO: renamed from: x1 */
    public int m56536x1(int i) {
        return m56517c5(i).m18942x1();
    }

    public C12004dy(String str, AbstractC6384k4 abstractC6384k4) {
        m56521k4(str, abstractC6384k4);
    }

    /* JADX INFO: renamed from: dy */
    private C4587x1 m56519dy() {
        return this.f40514du.m26209k4(m56527du());
    }

    /* JADX INFO: renamed from: kk */
    public static C12004dy m56523kk() {
        return (C12004dy) f40513x1.m56534m9();
    }

    /* JADX INFO: renamed from: to */
    public static C12004dy m56524to() {
        return (C12004dy) f40511kk.m56534m9();
    }

    /* JADX INFO: renamed from: x1 */
    public static C12004dy m56525x1() {
        return (C12004dy) f40510k4.m56534m9();
    }

    /* JADX INFO: renamed from: du */
    public String m56527du() {
        return this.f40516h4;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m56529h4(int i) {
        if (this.f40515dy) {
            return m56520jd(i);
        }
        boolean z = m56518dy(i) != null;
        if (z) {
            return z;
        }
        if (m56519dy().m18949kk() == 0) {
            return m56520jd(i);
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public String m56531k4(int i) {
        try {
            return this.f40517m9.m18947k4();
        } catch (Exception unused) {
            return m56527du();
        }
    }

    /* JADX INFO: renamed from: m9 */
    public Object m56534m9() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m56521k4(String str, AbstractC6384k4 abstractC6384k4) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        if (abstractC6384k4 == null) {
            abstractC6384k4 = (AbstractC6384k4) C7019kk.m27453k4((C6385kk) C7035kk.m27494k4(), f40512to);
        }
        this.f40514du = abstractC6384k4;
        C4587x1 c4587x1M26209k4 = this.f40514du.m26209k4(str);
        this.f40517m9 = c4587x1M26209k4;
        if (c4587x1M26209k4 == null && !str.equals(C7036m9.m27504k4(str))) {
            this.f40517m9 = this.f40514du.m26209k4(str);
        }
        C4587x1 c4587x1 = this.f40517m9;
        if (c4587x1 == null) {
            throw new ArgumentException(C14113y2.m67402k4("FontFamily '{0}' not found", str), str);
        }
        String strM18947k4 = c4587x1.m18947k4();
        this.f40516h4 = strM18947k4;
        String lowerCase = strM18947k4.toLowerCase();
        this.f40515dy = "sansserif".equals(lowerCase) || "serif".equals(lowerCase) || "monospaced".equals(lowerCase) || "dialog".equals(lowerCase) || "dialoginput".equals(lowerCase);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12004dy[] m56522k4() {
        return f40512to.m26211k4();
    }
}
