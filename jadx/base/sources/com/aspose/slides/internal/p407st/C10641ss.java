package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.words.EditingLanguage;
import com.huawei.hms.network.embedded.C18208i0;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.ss */
/* JADX INFO: loaded from: classes4.dex */
public class C10641ss extends AbstractC10376bv implements InterfaceC10673uw {

    /* JADX INFO: renamed from: up */
    private static final int[] f37376up = {1001, Integer.MAX_VALUE, EditingLanguage.ENGLISH_US, Integer.MAX_VALUE, 1010, Integer.MAX_VALUE, CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED, Integer.MAX_VALUE, EditingLanguage.FINNISH, Integer.MAX_VALUE, 4080, 1, 2000, Integer.MAX_VALUE, 4057, 3, 4057, 4, 4080, 0, 4080, 2, 1025, Integer.MAX_VALUE, EditingLanguage.ITALIAN_ITALY, Integer.MAX_VALUE, EditingLanguage.BULGARIAN, Integer.MAX_VALUE, EditingLanguage.DANISH, Integer.MAX_VALUE, C18208i0.f55081h, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: c5 */
    private C10414e0 f37377c5;

    /* JADX INFO: renamed from: du */
    private C10639so f37378du;

    /* JADX INFO: renamed from: dy */
    private C10433f7 f37379dy;

    /* JADX INFO: renamed from: fa */
    private long f37380fa;

    /* JADX INFO: renamed from: h4 */
    private C10639so f37381h4;

    /* JADX INFO: renamed from: jd */
    private long f37382jd = 255;

    /* JADX INFO: renamed from: k4 */
    private C10696wp f37383k4;

    /* JADX INFO: renamed from: kk */
    private C10631s7 f37384kk;

    /* JADX INFO: renamed from: m9 */
    private C10706x4 f37385m9;

    /* JADX INFO: renamed from: to */
    private C10706x4 f37386to;

    /* JADX INFO: renamed from: x1 */
    private C10513kp f37387x1;

    public C10641ss() {
        m51409um().m51917k4(1000);
    }

    /* JADX INFO: renamed from: ar */
    public final C10690w8 m51699ar() {
        return (C10690w8) m50508kk(EditingLanguage.TAJIK);
    }

    /* JADX INFO: renamed from: c5 */
    public final C10513kp m51700c5() {
        C10513kp c10513kp = this.f37387x1;
        if (c10513kp != null) {
            return c10513kp;
        }
        C10513kp c10513kp2 = (C10513kp) m50508kk(1010);
        this.f37387x1 = c10513kp2;
        if (c10513kp2 == null && m50505fa()) {
            C10513kp c10513kp3 = new C10513kp();
            this.f37387x1 = c10513kp3;
            m50507k4(c10513kp3);
        }
        return this.f37387x1;
    }

    /* JADX INFO: renamed from: ck */
    public final C10631s7 m51701ck() {
        C10631s7 c10631s7 = this.f37384kk;
        if (c10631s7 != null) {
            return c10631s7;
        }
        C10631s7 c10631s72 = (C10631s7) m50508kk(EditingLanguage.FINNISH);
        this.f37384kk = c10631s72;
        if (c10631s72 == null && m50505fa()) {
            C10631s7 c10631s73 = new C10631s7();
            this.f37384kk = c10631s73;
            c10631s73.m50512x1(true);
            m50507k4(this.f37384kk);
        }
        return this.f37384kk;
    }

    /* JADX INFO: renamed from: du */
    public final C10696wp m51702du() {
        C10696wp c10696wp = this.f37383k4;
        if (c10696wp != null) {
            return c10696wp;
        }
        C10696wp c10696wp2 = (C10696wp) m50508kk(1001);
        this.f37383k4 = c10696wp2;
        return c10696wp2;
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10673uw
    /* JADX INFO: renamed from: dy */
    public final long mo51092dy() {
        return this.f37380fa;
    }

    /* JADX INFO: renamed from: h4 */
    public final C10433f7 m51703h4() {
        C10433f7 c10433f7 = this.f37379dy;
        if (c10433f7 != null) {
            return c10433f7;
        }
        C10433f7 c10433f72 = (C10433f7) m50508kk(EditingLanguage.ENGLISH_US);
        this.f37379dy = c10433f72;
        return c10433f72;
    }

    /* JADX INFO: renamed from: ix */
    public final C10706x4 m51704ix() {
        C10706x4 c10706x4 = this.f37385m9;
        if (c10706x4 != null) {
            return c10706x4;
        }
        C10706x4 c10706x42 = (C10706x4) m50506k4(4080, (short) 0);
        this.f37385m9 = c10706x42;
        return c10706x42;
    }

    /* JADX INFO: renamed from: jd */
    public final C10499jv m51705jd() {
        return (C10499jv) m50508kk(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10495ji m51706k4(C10431f3 c10431f3, long j) {
        if (c10431f3 == null) {
            throw new ArgumentNullException("slide");
        }
        C10706x4 c10706x4M51709ks = m51709ks();
        if (c10706x4M51709ks == null) {
            c10706x4M51709ks = new C10706x4();
            c10706x4M51709ks.m51409um().m51920k4((short) 1);
            m50507k4(c10706x4M51709ks);
            this.f37386to = c10706x4M51709ks;
        }
        C10495ji c10495ji = new C10495ji(null);
        c10706x4M51709ks.m51969x1().m52061k4(c10495ji);
        c10495ji.m51008k4(c10431f3.mo51092dy());
        c10495ji.m51014x1(true);
        c10495ji.m51013x1(j);
        c10431f3.m51364x1(c10495ji.m51011to());
        if (m50505fa()) {
            c10431f3.m50512x1(true);
        }
        return c10495ji;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv
    /* JADX INFO: renamed from: kk */
    public int[] mo50413kk() {
        return f37376up;
    }

    /* JADX INFO: renamed from: ks */
    public final C10706x4 m51709ks() {
        C10706x4 c10706x4 = this.f37386to;
        if (c10706x4 != null) {
            return c10706x4;
        }
        C10706x4 c10706x42 = (C10706x4) m50506k4(4080, (short) 1);
        this.f37386to = c10706x42;
        return c10706x42;
    }

    /* JADX INFO: renamed from: m9 */
    public final C10433f7 m51710m9() {
        C10433f7 c10433f7 = this.f37379dy;
        if (c10433f7 != null) {
            return c10433f7;
        }
        C10433f7 c10433f72 = (C10433f7) m50508kk(EditingLanguage.ENGLISH_US);
        this.f37379dy = c10433f72;
        if (c10433f72 == null) {
            C10433f7 c10433f73 = new C10433f7();
            this.f37379dy = c10433f73;
            c10433f73.m50513yj().addItem(new C10404dl());
            m50507k4(this.f37379dy);
        }
        return this.f37379dy;
    }

    /* JADX INFO: renamed from: ne */
    public final C10639so m51711ne() {
        C10639so c10639so = this.f37381h4;
        if (c10639so != null) {
            return c10639so;
        }
        C10639so c10639so2 = (C10639so) m50506k4(4057, (short) 4);
        this.f37381h4 = c10639so2;
        if (c10639so2 == null && m50505fa()) {
            C10639so c10639so3 = new C10639so();
            this.f37381h4 = c10639so3;
            c10639so3.m51409um().m51920k4((short) 4);
            this.f37381h4.m50512x1(true);
            m50507k4(this.f37381h4);
        }
        return this.f37381h4;
    }

    /* JADX INFO: renamed from: qq */
    public final C10468hl m51712qq() {
        return (C10468hl) m50508kk(C18208i0.f55081h);
    }

    /* JADX INFO: renamed from: rv */
    public final C10414e0 m51713rv() {
        C10414e0 c10414e0 = this.f37377c5;
        if (c10414e0 != null) {
            return c10414e0;
        }
        C10414e0 c10414e02 = (C10414e0) m50508kk(2000);
        this.f37377c5 = c10414e02;
        if (c10414e02 == null && m50505fa()) {
            C10414e0 c10414e03 = new C10414e0();
            this.f37377c5 = c10414e03;
            c10414e03.m50512x1(true);
            m50507k4(this.f37377c5);
        }
        return this.f37377c5;
    }

    /* JADX INFO: renamed from: to */
    public final long m51714to() {
        long j = this.f37382jd + 1;
        this.f37382jd = j;
        return j;
    }

    /* JADX INFO: renamed from: u4 */
    public final C10706x4 m51715u4() {
        return (C10706x4) m50506k4(4080, (short) 2);
    }

    /* JADX INFO: renamed from: uz */
    public final C10506k9 m51716uz() {
        return (C10506k9) m50508kk(EditingLanguage.BULGARIAN);
    }

    /* JADX INFO: renamed from: wl */
    public final C10447g8 m51717wl() {
        return (C10447g8) m50508kk(EditingLanguage.DANISH);
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C10395d2> m51718x1(long j) {
        List<C10395d2> listM52057k4;
        int i = 0;
        while (true) {
            C10706x4 c10706x4M51709ks = null;
            if (i >= 3) {
                return null;
            }
            if (i == 0) {
                c10706x4M51709ks = m51709ks();
            } else if (i == 1) {
                c10706x4M51709ks = m51704ix();
            } else if (i == 2) {
                c10706x4M51709ks = m51715u4();
            }
            if (c10706x4M51709ks != null && (listM52057k4 = c10706x4M51709ks.m51969x1().m52057k4(j)) != null) {
                return listM52057k4;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: x6 */
    public final C10639so m51721x6() {
        C10639so c10639so = this.f37378du;
        if (c10639so != null) {
            return c10639so;
        }
        C10639so c10639so2 = (C10639so) m50506k4(4057, (short) 3);
        this.f37378du = c10639so2;
        if (c10639so2 == null && m50505fa()) {
            C10639so c10639so3 = new C10639so();
            this.f37378du = c10639so3;
            c10639so3.m51409um().m51920k4((short) 3);
            this.f37378du.m50512x1(true);
            m50507k4(this.f37378du);
        }
        return this.f37378du;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10495ji m51707k4(C10618r9 c10618r9) {
        C10706x4 c10706x4M51715u4 = m51715u4();
        if (c10706x4M51715u4 == null) {
            c10706x4M51715u4 = new C10706x4();
            c10706x4M51715u4.m51409um().m51920k4((short) 2);
            m50507k4(c10706x4M51715u4);
        }
        C10495ji c10495ji = new C10495ji(null);
        c10706x4M51715u4.m51969x1().m52061k4(c10495ji);
        c10495ji.m51008k4(c10618r9.mo51092dy());
        c10495ji.m51013x1(m51714to());
        return c10495ji;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10495ji m51719x1(C10431f3 c10431f3, long j) {
        if (c10431f3 == null) {
            throw new ArgumentNullException("slide");
        }
        C10706x4 c10706x4M51704ix = m51704ix();
        if (c10706x4M51704ix == null) {
            c10706x4M51704ix = new C10706x4();
            m50507k4(c10706x4M51704ix);
            this.f37385m9 = c10706x4M51704ix;
        }
        C10495ji c10495ji = new C10495ji(null);
        c10706x4M51704ix.m51969x1().m52061k4(c10495ji);
        c10495ji.m51008k4(c10431f3.mo51092dy());
        c10495ji.m51014x1(true);
        c10495ji.m51007k4(0);
        c10495ji.m51013x1(j);
        c10431f3.m51364x1(c10495ji.m51011to());
        if (m50505fa()) {
            c10431f3.m50512x1(true);
        }
        return c10495ji;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10495ji m51708k4(C10678v6 c10678v6, long j) {
        if (c10678v6 == null) {
            throw new ArgumentNullException("master");
        }
        C10706x4 c10706x4M51709ks = m51709ks();
        if (c10706x4M51709ks == null) {
            c10706x4M51709ks = new C10706x4();
            c10706x4M51709ks.m51409um().m51920k4((short) 1);
            m50507k4(c10706x4M51709ks);
            this.f37386to = c10706x4M51709ks;
        }
        C10495ji c10495ji = new C10495ji(null);
        c10706x4M51709ks.m51969x1().m52061k4(c10495ji);
        c10495ji.m51008k4(c10678v6.mo51092dy());
        c10495ji.m51014x1(false);
        c10495ji.m51013x1(j);
        c10678v6.m51364x1(c10495ji.m51011to());
        if (m50505fa()) {
            c10678v6.m50512x1(true);
        }
        return c10495ji;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51720x1() {
        C10696wp c10696wp = new C10696wp();
        m50513yj().addItem(c10696wp);
        c10696wp.m51935k4(new C12023wl(5760, 4320));
        c10696wp.m51946x1(new C12023wl(4320, 5760));
        c10696wp.m51938kk(new C12023wl(5, 10));
        c10696wp.m51934k4(0L);
        c10696wp.m51945x1(0L);
        c10696wp.m51933k4(1);
        c10696wp.m51944x1(0);
        c10696wp.m51936k4(false);
        c10696wp.m51947x1(false);
        c10696wp.m51939kk(false);
        c10696wp.m51942to(true);
        C10476i5 c10476i5 = new C10476i5();
        m51700c5().m50513yj().addItem(c10476i5);
        C10565nx c10565nx = new C10565nx();
        c10476i5.m50513yj().addItem(c10565nx);
        c10565nx.m51385k4(1);
        m50513yj().addItem(new C10654tq());
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10673uw
    /* JADX INFO: renamed from: k4 */
    public final void mo51093k4(long j) {
        this.f37380fa = j;
    }
}
