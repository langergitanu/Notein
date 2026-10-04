package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.i9 */
/* JADX INFO: loaded from: classes3.dex */
final class C2763i9 extends AbstractC2876qp {

    /* JADX INFO: renamed from: c5 */
    private final C2711eb f8616c5;

    /* JADX INFO: renamed from: du */
    private final C2778ji f8617du;

    /* JADX INFO: renamed from: dy */
    private final C2891s1 f8618dy;

    /* JADX INFO: renamed from: k4 */
    private C2688cl f8620k4;

    /* JADX INFO: renamed from: x1 */
    private C2692d2 f8624x1;

    /* JADX INFO: renamed from: kk */
    private double f8621kk = 0.0d;

    /* JADX INFO: renamed from: to */
    private double f8623to = 0.0d;

    /* JADX INFO: renamed from: h4 */
    private double f8619h4 = 0.0d;

    /* JADX INFO: renamed from: m9 */
    private Dictionary<Integer, Integer> f8622m9 = new Dictionary<>();

    public C2763i9(C2711eb c2711eb, C2891s1 c2891s1, C2778ji c2778ji) {
        this.f8616c5 = c2711eb;
        this.f8618dy = c2891s1;
        this.f8617du = c2778ji;
        for (int i = 0; i < 9; i++) {
            this.f8622m9.addItem(Integer.valueOf(i), 0);
        }
        m12313x1();
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC2679c1 m12307k4(C2957x2 c2957x2) {
        if (c2957x2.m12587k4().m12267x1() == null) {
            return null;
        }
        C2696dd c2696dd = (C2696dd) C7019kk.m27452k4((Object) c2957x2.m12587k4().m12267x1(), C2696dd.class);
        return c2696dd != null ? new C2696dd(new C2939vm(m12312x1(c2957x2)), c2696dd.m12202x1()) : c2957x2.m12587k4().m12267x1().cloneT();
    }

    /* JADX INFO: renamed from: x1 */
    private int m12312x1(C2957x2 c2957x2) {
        C2696dd c2696dd = (C2696dd) C7019kk.m27452k4((Object) c2957x2.m12587k4().m12267x1(), C2696dd.class);
        if (c2696dd == null) {
            return 0;
        }
        int iM12384k4 = c2957x2.m12587k4().m12243dy() != null ? c2957x2.m12587k4().m12243dy().m12384k4() : 0;
        if (c2696dd.m12199k4() != null) {
            this.f8622m9.set_Item(Integer.valueOf(iM12384k4), Integer.valueOf(c2696dd.m12199k4().m12582k4()));
        } else {
            this.f8622m9.set_Item(Integer.valueOf(iM12384k4), Integer.valueOf(this.f8622m9.get_Item(Integer.valueOf(iM12384k4)).intValue() + 1));
        }
        int iIntValue = this.f8622m9.get_Item(Integer.valueOf(iM12384k4)).intValue();
        while (true) {
            iM12384k4++;
            if (iM12384k4 >= 9) {
                return iIntValue;
            }
            this.f8622m9.set_Item(Integer.valueOf(iM12384k4), 0);
        }
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2871qe
    /* JADX INFO: renamed from: kk */
    public C2867q6 mo12122kk() {
        return this.f8618dy.m12521x1();
    }

    /* JADX INFO: renamed from: k4 */
    private void m12308k4() {
        this.f8624x1.m12187k4(this.f8620k4);
        this.f8620k4 = this.f8624x1.m12186k4();
    }

    /* JADX INFO: renamed from: x1 */
    private void m12313x1() {
        C2867q6 c2867q6M12521x1 = this.f8618dy.m12521x1();
        for (C2957x2 c2957x2 : this.f8616c5.m12228x1()) {
            C2692d2 c2692d2 = new C2692d2(c2957x2.m12587k4(), this.f8617du);
            this.f8624x1 = c2692d2;
            c2692d2.m12489k4(new C2706dw(this.f8621kk, this.f8623to));
            this.f8620k4 = this.f8624x1.m12186k4();
            if (c2957x2.m12587k4().m12267x1() != null) {
                this.f8620k4.m12178k4(C2996zg.m12644k4().m12645k4(m12307k4(c2957x2), c2957x2.m12587k4().m12261kk(), c2957x2.m12587k4().m12265to(), c2957x2.m12587k4().m12242du(), c2957x2.m12592x1()[0].m12205to(), this.f8618dy.m12521x1()));
            }
            for (AbstractC2701dn abstractC2701dn : c2957x2.m12592x1()) {
                C2726fc c2726fc = (C2726fc) C7019kk.m27452k4((Object) abstractC2701dn, C2726fc.class);
                if (c2726fc != null) {
                    m12309k4(c2726fc, c2867q6M12521x1);
                } else {
                    C2984yq c2984yq = (C2984yq) C7019kk.m27452k4((Object) abstractC2701dn, C2984yq.class);
                    if (c2984yq != null) {
                        m12311k4(c2984yq);
                    } else {
                        C2892s2 c2892s2 = (C2892s2) C7019kk.m27452k4((Object) abstractC2701dn, C2892s2.class);
                        if (c2892s2 != null) {
                            m12310k4(c2892s2);
                        }
                    }
                }
            }
            m12308k4();
            m12492k4(this.f8624x1);
            this.f8623to = this.f8624x1.mo12122kk().m12484x1() + this.f8623to;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m12309k4(C2726fc c2726fc, C2867q6 c2867q6) {
        C2778ji c2778jiM12205to = c2726fc.m12205to();
        C2918tx c2918tx = new C2918tx(c2778jiM12205to, this.f8618dy.m12521x1());
        if (c2726fc.m12205to().m12371m9() > this.f8619h4) {
            this.f8619h4 = c2726fc.m12205to().m12371m9();
        }
        for (int i = 0; i < c2726fc.m12238k4().length(); i++) {
            c2918tx.m12548k4(c2726fc.m12238k4().charAt(i));
            if (c2918tx.mo12122kk().m12482k4() + this.f8620k4.mo12122kk().m12482k4() > c2867q6.m12482k4()) {
                if (this.f8620k4.m12491h4().length != 0 && c2918tx.m12546dy().length() > 1) {
                    c2918tx.m12545c5();
                }
                this.f8620k4.m12179k4(c2918tx);
                m12308k4();
                c2918tx = new C2918tx(c2778jiM12205to, this.f8618dy.m12521x1());
            }
        }
        this.f8620k4.m12179k4(c2918tx);
    }

    /* JADX INFO: renamed from: k4 */
    private void m12310k4(C2892s2 c2892s2) {
        if (c2892s2.m12205to().m12371m9() > this.f8619h4) {
            this.f8619h4 = c2892s2.m12205to().m12371m9();
        }
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    private void m12311k4(C2984yq c2984yq) {
        if (c2984yq.m12205to().m12371m9() > this.f8619h4) {
            this.f8619h4 = c2984yq.m12205to().m12371m9();
        }
        this.f8620k4.m12179k4(new C2918tx(c2984yq.m12205to(), this.f8618dy.m12521x1()));
        m12308k4();
    }
}
