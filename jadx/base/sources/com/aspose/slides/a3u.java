package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p077d8.C3100wp;
import com.aspose.slides.internal.p407st.C10431f3;
import com.aspose.slides.internal.p407st.C10591pk;
import com.aspose.slides.internal.p407st.C10659tx;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.internal.p505xn.C12577yj;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
final class a3u extends C14652uw {

    /* JADX INFO: renamed from: c5 */
    private C14047bz[] f3754c5;

    /* JADX INFO: renamed from: ck */
    private C12577yj<Long, qah> f3755ck;

    /* JADX INFO: renamed from: du */
    private long f3756du;

    /* JADX INFO: renamed from: dy */
    private SortedList<Long, C0703k4> f3757dy;

    /* JADX INFO: renamed from: fa */
    private final Dictionary<C10659tx, Audio> f3758fa;

    /* JADX INFO: renamed from: h4 */
    private gnb f3759h4;

    /* JADX INFO: renamed from: ix */
    private byte[] f3760ix;

    /* JADX INFO: renamed from: jd */
    private List<Hyperlink> f3761jd;

    /* JADX INFO: renamed from: k4 */
    int f3762k4;

    /* JADX INFO: renamed from: kk */
    int f3763kk;

    /* JADX INFO: renamed from: ks */
    private Dictionary<Integer, jio> f3764ks;

    /* JADX INFO: renamed from: m9 */
    private Dictionary<Long, m4c> f3765m9;

    /* JADX INFO: renamed from: ne */
    private IGenericList<IFontData> f3766ne;

    /* JADX INFO: renamed from: rv */
    private List<Long> f3767rv;

    /* JADX INFO: renamed from: to */
    boolean f3768to;

    /* JADX INFO: renamed from: up */
    private C14670va f3769up;

    /* JADX INFO: renamed from: x1 */
    int f3770x1;

    /* JADX INFO: renamed from: x6 */
    private m4c f3771x6;

    /* JADX INFO: renamed from: yj */
    private Dictionary<ISlide, C10431f3> f3772yj;

    /* JADX INFO: renamed from: com.aspose.slides.a3u$k4 */
    public static class C0703k4 {

        /* JADX INFO: renamed from: k4 */
        private SortedList<Integer, m4c> f3773k4 = new SortedList<>();

        /* JADX INFO: renamed from: k4 */
        public final SortedList<Integer, m4c> m3202k4() {
            return this.f3773k4;
        }
    }

    public a3u(C10591pk c10591pk, Presentation presentation, InterruptionToken interruptionToken) {
        super(c10591pk, presentation, interruptionToken);
        this.f3765m9 = new Dictionary<>();
        this.f3757dy = new SortedList<>();
        this.f3761jd = new List<>();
        this.f3755ck = new C12577yj<>(Long.class, qah.class);
        this.f3758fa = new Dictionary<>();
        this.f3772yj = new Dictionary<>();
        this.f3764ks = new Dictionary<>();
        this.f3767rv = new List<>();
        this.f3762k4 = 0;
        this.f3770x1 = 0;
        this.f3763kk = 0;
        this.f3768to = false;
        this.f3759h4 = new gnb(m71946k4(), interruptionToken);
    }

    /* JADX INFO: renamed from: ar */
    public final boolean m3176ar() {
        return true;
    }

    /* JADX INFO: renamed from: bv */
    public final long m3177bv() {
        return this.f3756du;
    }

    /* JADX INFO: renamed from: ix */
    public final C12577yj<Long, qah> m3178ix() {
        return this.f3755ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final IAudio m3179k4(C10659tx c10659tx) {
        Audio[] audioArr = {null};
        boolean zTryGetValue = this.f3758fa.tryGetValue(c10659tx, audioArr);
        Audio audio = audioArr[0];
        if (!zTryGetValue) {
            audio = (Audio) m71946k4().getAudios().addAudio(c10659tx.m51784h4().m52102x1());
            if (c10659tx.m51788x1() != null) {
                String strM51659x1 = c10659tx.m51788x1().m51659x1();
                if (!C14113y2.m67411k4(strM51659x1) && C12565ks.m58627kk(strM51659x1)) {
                    audio.m255k4().m72979k4(strM51659x1);
                }
            }
            this.f3758fa.addItem(c10659tx, audio);
        }
        return audio;
    }

    /* JADX INFO: renamed from: ks */
    public final gnb m3188ks() {
        return this.f3759h4;
    }

    /* JADX INFO: renamed from: lr */
    public final long m3189lr() {
        long jM3177bv = m3177bv();
        m3198x1(1 + jM3177bv);
        return jM3177bv;
    }

    /* JADX INFO: renamed from: ne */
    public final List<Hyperlink> m3190ne() {
        return this.f3761jd;
    }

    /* JADX INFO: renamed from: qq */
    public final boolean m3191qq() {
        return false;
    }

    /* JADX INFO: renamed from: rv */
    public final C14670va m3192rv() {
        return this.f3769up;
    }

    /* JADX INFO: renamed from: u4 */
    public final Dictionary<Long, m4c> m3193u4() {
        return this.f3765m9;
    }

    /* JADX INFO: renamed from: um */
    public final m4c m3194um() {
        return this.f3771x6;
    }

    /* JADX INFO: renamed from: uz */
    public final SortedList<Long, C0703k4> m3195uz() {
        return this.f3757dy;
    }

    /* JADX INFO: renamed from: v4 */
    public final byte[] m3196v4() {
        return this.f3760ix;
    }

    /* JADX INFO: renamed from: wl */
    public final Dictionary<Integer, jio> m3197wl() {
        return this.f3764ks;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3198x1(long j) {
        this.f3756du = j;
    }

    /* JADX INFO: renamed from: x6 */
    public final C14047bz[] m3200x6() {
        return this.f3754c5;
    }

    /* JADX INFO: renamed from: yd */
    public final IGenericList<IFontData> m3201yd() {
        if (this.f3766ne == null) {
            this.f3766ne = new List();
            C13827mb c13827mbM6639k4 = m71946k4().m2389rv().m6639k4();
            int iM64807kk = c13827mbM6639k4.m64807kk();
            for (int i = 0; i < iM64807kk; i++) {
                this.f3766ne.addItem(c13827mbM6639k4.m64812x1(i).m70073x1());
            }
        }
        return this.f3766ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final IBaseSlide m3180k4(long j) {
        m4c[] m4cVarArr = {null};
        this.f3765m9.tryGetValue(Long.valueOf(j), m4cVarArr);
        m4c m4cVar = m4cVarArr[0];
        if (m4cVar != null) {
            return m4cVar.m64735up();
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3199x1(m4c m4cVar) {
        if (m4cVar.m64709c5() == null) {
            return;
        }
        long jM51011to = m4cVar.m64709c5().m51011to();
        if (this.f3765m9.containsKey(Long.valueOf(jM51011to))) {
            this.f3765m9.set_Item(Long.valueOf(jM51011to), m4cVar);
        } else {
            this.f3765m9.addItem(Long.valueOf(jM51011to), m4cVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3181k4(long j, int i, m4c m4cVar) {
        C0703k4 c0703k4;
        if (this.f3757dy.containsKey(Long.valueOf(j))) {
            c0703k4 = this.f3757dy.get_Item(Long.valueOf(j));
        } else {
            C0703k4 c0703k42 = new C0703k4();
            this.f3757dy.addItem(Long.valueOf(j), c0703k42);
            c0703k4 = c0703k42;
        }
        if (c0703k4.m3202k4().containsKey(Integer.valueOf(i))) {
            return;
        }
        c0703k4.m3202k4().addItem(Integer.valueOf(i), m4cVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3182k4(m4c m4cVar) {
        if (m4cVar == null) {
            return;
        }
        this.f3771x6 = m4cVar;
        m4cVar.m64725kk(true);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3183k4(C14670va c14670va) {
        this.f3769up = c14670va;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3184k4(String str) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3185k4(String str, int i) {
        if (m71946k4().m2349du() == null || m71946k4().m2349du().getWarningCallback() == null) {
            return;
        }
        new C3100wp(str, i).sendWarning(m71946k4().m2349du().getWarningCallback());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3186k4(byte[] bArr) {
        this.f3760ix = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3187k4(C14047bz[] c14047bzArr) {
        this.f3754c5 = c14047bzArr;
    }
}
