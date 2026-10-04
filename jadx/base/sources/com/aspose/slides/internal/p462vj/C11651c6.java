package com.aspose.slides.internal.p462vj;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p393s7.C10155jd;
import com.aspose.slides.internal.p393s7.C10159m9;
import com.aspose.slides.internal.p393s7.C10161to;
import com.aspose.slides.internal.p409sv.C10766b3;
import com.aspose.slides.internal.p486wy.C12314dy;
import com.aspose.slides.internal.p486wy.C12320ks;
import com.aspose.slides.internal.p513xw.C12712m2;
import com.aspose.slides.internal.p513xw.C12724ss;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.c6 */
/* JADX INFO: loaded from: classes4.dex */
public class C11651c6 extends AbstractC11681yd {

    /* JADX INFO: renamed from: c5 */
    private C10766b3 f39279c5;

    /* JADX INFO: renamed from: jd */
    private C10161to f39280jd;

    public C11651c6(C10766b3 c10766b3) {
        super(c10766b3);
        this.f39279c5 = c10766b3;
    }

    /* JADX INFO: renamed from: k4 */
    private int m54819k4(String str) {
        int iM49984x1 = 0;
        for (int i = 0; i < str.length(); i++) {
            iM49984x1 += this.f39280jd.m49984x1(str.charAt(i));
        }
        return iM49984x1;
    }

    @Override // com.aspose.slides.internal.p462vj.AbstractC11681yd
    /* JADX INFO: renamed from: b3 */
    public C12314dy mo54821b3() {
        C12320ks c12320ks = (C12320ks) ((AbstractC11681yd) this).f39494fa;
        C12320ks c12320ks2 = new C12320ks();
        C12712m2.m59048k4(c12320ks2, this.f39279c5.mo14334yd());
        c12320ks2.m8679x1(c12320ks.m8678x1());
        c12320ks2.m8670kk(c12320ks.mo8658e_());
        c12320ks2.m57573ks(c12320ks.m57577um());
        c12320ks2.m57593fa(c12320ks.m57597wl());
        c12320ks2.m8667k4(7, this.f39279c5.m52186bz().Clone());
        Dictionary.Enumerator<Integer, Object> it = c12320ks.m8674ne().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                c12320ks2.m8674ne().set_Item(next.getKey(), next.getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m54820k4(c12320ks2);
        return c12320ks2;
    }

    @Override // com.aspose.slides.internal.p462vj.AbstractC11681yd
    /* JADX INFO: renamed from: x1 */
    public C12314dy mo54818x1(C12724ss c12724ss) {
        C12320ks c12320ks = new C12320ks();
        String strM59338h4 = m59235um().m59338h4();
        int iM54819k4 = m54819k4(strM59338h4);
        c12320ks.m57605k4(strM59338h4, 0);
        c12320ks.m8679x1(iM54819k4);
        c12320ks.m8670kk(this.f39280jd.m49969du() - this.f39280jd.m49972h4());
        c12320ks.m57593fa(this.f39280jd.m49969du());
        C12712m2.m59046k4(c12320ks, this.f39280jd);
        c12320ks.m8667k4(7, this.f39279c5.m52186bz().Clone());
        C12712m2.m59047k4(c12320ks, this.f39279c5.m52192s7());
        C12712m2.m59044k4(c12320ks, this.f39279c5.m52188g8());
        return c12320ks;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x6 */
    public void mo49031x6() {
        C10159m9 c10159m9Mo14168c_ = this.f39279c5.mo14107n_().mo14168c_();
        C10155jd[] c10155jdArrM17246k4 = this.f39279c5.m52187e0().m17246k4(c10159m9Mo14168c_);
        this.f39280jd = c10159m9Mo14168c_.m49955k4(c10155jdArrM17246k4[0], this.f39279c5.m52187e0().f11682k4.mo9886x1(this), c10155jdArrM17246k4[0].m49936du());
        m55029k4(this.f39279c5.m52191qm());
    }

    @Override // com.aspose.slides.internal.p462vj.AbstractC11681yd
    /* JADX INFO: renamed from: k4 */
    public C11662kk mo54822k4(C12724ss c12724ss) {
        return new C11662kk(this.f39280jd, this.f39279c5.m52189gi().m17133to(this).mo9877dy().mo9886x1(this), this.f39279c5.m52194sv(), this.f39279c5.m52195wp(), this.f39279c5.m52193ss(), this.f39279c5.m52190kp(), c12724ss.m59137ar());
    }

    /* JADX INFO: renamed from: k4 */
    private void m54820k4(C12320ks c12320ks) {
        c12320ks.m57608yd();
        c12320ks.m57605k4(m59235um().m59338h4(), 0);
        c12320ks.m57576rv(m54819k4(c12320ks.mo57603b3()) - c12320ks.m8678x1());
        this.f39496rv.f39502x1 = C1375h4.m8145k4(c12320ks.m8678x1());
    }
}
