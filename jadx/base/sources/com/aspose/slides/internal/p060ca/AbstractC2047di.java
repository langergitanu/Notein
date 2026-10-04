package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.di */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2047di implements InterfaceC2416zz {

    /* JADX INFO: renamed from: c5 */
    private static final Dictionary<String, String> f7066c5 = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    protected C2392yn f7067du;

    /* JADX INFO: renamed from: dy */
    private AbstractC2119hu f7068dy;

    /* JADX INFO: renamed from: h4 */
    protected C2052dp f7069h4;

    /* JADX INFO: renamed from: k4 */
    protected C2080f7 f7070k4;

    /* JADX INFO: renamed from: kk */
    protected C2095g9 f7071kk;

    /* JADX INFO: renamed from: m9 */
    protected InterfaceC2079f5 f7072m9;

    /* JADX INFO: renamed from: to */
    protected C2193mc f7073to;

    /* JADX INFO: renamed from: x1 */
    protected C2272r7 f7074x1;

    public AbstractC2047di() {
        this(new C2052dp());
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2416zz
    /* JADX INFO: renamed from: j2 */
    public final InterfaceC2079f5 mo10363j2() {
        return this.f7072m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC2119hu m10364k4() {
        return this.f7068dy;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract C2412zn mo10365k4(C2317u4 c2317u4);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo10367k4(C2412zn c2412zn);

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2416zz
    /* JADX INFO: renamed from: qw */
    public final C2095g9 mo10369qw() {
        return this.f7071kk;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2416zz
    /* JADX INFO: renamed from: tq */
    public final C2193mc mo10370tq() {
        return this.f7073to;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2416zz
    /* JADX INFO: renamed from: w6 */
    public final C2052dp mo10371w6() {
        return this.f7069h4;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2416zz
    /* JADX INFO: renamed from: x1 */
    public final void mo10372x1(C2317u4 c2317u4) {
        try {
            C2412zn c2412znMo10365k4 = mo10365k4(c2317u4);
            while (c2412znMo10365k4.m11830h4()) {
                mo10367k4(c2412znMo10365k4);
            }
        } catch (RuntimeException e) {
            throw new C2105gz("Could not run font program", e);
        }
    }

    public AbstractC2047di(C2052dp c2052dp) {
        this.f7073to = new C2193mc();
        this.f7070k4 = new C2080f7();
        this.f7074x1 = new C2272r7();
        this.f7071kk = new C2095g9();
        this.f7067du = new C2392yn();
        this.f7069h4 = c2052dp;
        this.f7072m9 = C2006b1.m10229k4().m10231x1().mo10237k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10366k4(AbstractC2119hu abstractC2119hu) {
        this.f7068dy = abstractC2119hu;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10368k4(String str) {
        String strM67408k4 = C14113y2.m67408k4(C14067j2.m66727k4(this).mo48629x6(), str);
        Dictionary<String, String> dictionary = f7066c5;
        if (dictionary.containsKey(strM67408k4)) {
            return;
        }
        synchronized (dictionary) {
            try {
                if (!dictionary.containsKey(strM67408k4)) {
                    dictionary.addItem(strM67408k4, str);
                    this.f7072m9.mo10504k4(C14113y2.m67402k4("PostScript error. Operator \"{0}\" is not supported.", str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
