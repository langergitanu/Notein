package com.aspose.slides.internal.p081de;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3183dy;
import com.aspose.slides.internal.p087dm.C3185jd;
import com.aspose.slides.internal.p099e3.C3550du;
import com.aspose.slides.internal.p115eq.C3783ck;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p115eq.C3787h4;
import com.aspose.slides.internal.p115eq.C3791ks;
import com.aspose.slides.internal.p115eq.C3794up;
import com.aspose.slides.internal.p115eq.C3795x1;
import com.aspose.slides.internal.p115eq.InterfaceC3793to;
import com.aspose.slides.internal.p136fr.C4116x1;
import com.aspose.slides.internal.p298nh.AbstractC6890h4;
import com.aspose.slides.internal.p321on.C7125kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.de.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C3154kk {

    /* JADX INFO: renamed from: du */
    private final C3786fa f9364du;

    /* JADX INFO: renamed from: dy */
    private final int f9365dy;

    /* JADX INFO: renamed from: h4 */
    private final C3791ks f9366h4;

    /* JADX INFO: renamed from: k4 */
    public String f9367k4;

    /* JADX INFO: renamed from: kk */
    private final C3787h4 f9368kk;

    /* JADX INFO: renamed from: m9 */
    private C3154kk f9369m9;

    /* JADX INFO: renamed from: to */
    private C3783ck f9370to;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC3793to f9371x1;

    public C3154kk() {
        this(new C3795x1());
    }

    /* JADX INFO: renamed from: x1 */
    private void m13474x1(String str) {
        for (C3154kk c3154kk = this.f9369m9; c3154kk != null; c3154kk = c3154kk.f9369m9) {
            if (C14113y2.m67432to(c3154kk.f9367k4, str, (short) 5)) {
                throw new C3183dy("External resources loading cycle detected.");
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C3152yj m13475k4(String str, float f) {
        return m13476k4(str, 0, 0, f);
    }

    public C3154kk(InterfaceC3793to interfaceC3793to) {
        this.f9365dy = 1;
        this.f9371x1 = interfaceC3793to;
        this.f9370to = new C3783ck();
        this.f9368kk = new C3787h4();
        C3786fa c3786fa = new C3786fa();
        this.f9364du = c3786fa;
        this.f9366h4 = new C3791ks(c3786fa);
    }

    /* JADX INFO: renamed from: k4 */
    public final C3152yj m13476k4(String str, int i, int i2, float f) {
        return m13477k4(str, m13478k4(str), i, i2, f);
    }

    public C3154kk(InterfaceC3793to interfaceC3793to, C3154kk c3154kk) {
        this(interfaceC3793to);
        this.f9369m9 = c3154kk;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [int, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r3v1, types: [double, int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r4v3, types: [double, int] */
    /* JADX INFO: renamed from: k4 */
    public final C3152yj m13477k4(String str, C3185jd c3185jd, int i, int i2, float f) {
        this.f9367k4 = str;
        m13474x1(str);
        C3550du c3550duM13678k4 = c3185jd.m13678k4();
        if (c3550duM13678k4 == null) {
            return null;
        }
        C12015qq c12015qqClone = c3550duM13678k4.mo13679k4(this.f9364du, new C12015qq(this.f9364du.m15131kk(i), this.f9364du.m15131kk(i2))).m56570m9().Clone();
        C12015qq c12015qqClone2 = C12549du.m58495k4(c12015qqClone.m56699x1() * f, c12015qqClone.m56697kk() * f).Clone();
        C3156x1 c3156x1 = new C3156x1(1, StringBuffer.append((int) c12015qqClone2.m56699x1()), StringBuffer.append((int) c12015qqClone2.m56697kk()));
        try {
            AbstractC6890h4 abstractC6890h4M26992k4 = AbstractC6890h4.m26992k4(c3156x1);
            try {
                abstractC6890h4M26992k4.mo9702kk(2);
                abstractC6890h4M26992k4.mo9705x1(2);
                abstractC6890h4M26992k4.mo9698k4(new C11913yj(c12015qqClone2.m56699x1() / c12015qqClone.m56699x1(), 0.0f, 0.0f, c12015qqClone2.m56697kk() / c12015qqClone.m56697kk(), 0.0f, 0.0f));
                new C3155to(abstractC6890h4M26992k4, this, this.f9370to, this.f9364du, this.f9368kk, this.f9366h4, this.f9371x1).m13496x1(c3185jd.f9466h4, c12015qqClone.Clone(), null);
                abstractC6890h4M26992k4.dispose();
                C3152yj c3152yj = new C3152yj();
                c3156x1.mo13499a_(c3152yj);
                c3152yj.seek(0L, 0);
                return c3152yj;
            } catch (Throwable th) {
                if (abstractC6890h4M26992k4 != null) {
                    abstractC6890h4M26992k4.dispose();
                }
                throw th;
            }
        } finally {
            c3156x1.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C3185jd m13478k4(String str) {
        this.f9370to = new C3783ck();
        C3185jd c3185jdM16477k4 = C4116x1.m16477k4(str);
        C3181c5 c3181c5 = c3185jdM16477k4.f9466h4;
        C3794up.m15157k4(c3181c5, this.f9370to, this.f9371x1);
        C3794up.m15156k4(c3181c5, this.f9370to);
        C7125kk.m27658k4(c3181c5);
        C3794up.m15160k4(c3181c5, this.f9371x1, this.f9368kk);
        return c3185jdM16477k4;
    }
}
