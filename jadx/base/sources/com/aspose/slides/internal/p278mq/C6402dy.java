package com.aspose.slides.internal.p278mq;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p128fc.C3924ck;
import com.aspose.slides.internal.p271mc.C6365jd;
import com.aspose.slides.internal.p271mc.C6370up;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.mq.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C6402dy implements InterfaceC6407to {

    /* JADX INFO: renamed from: du */
    private boolean f18193du;

    /* JADX INFO: renamed from: k4 */
    private final List<C3924ck> f18194k4 = new List<>();

    /* JADX INFO: renamed from: kk */
    private C11913yj f18195kk;

    /* JADX INFO: renamed from: to */
    private C11913yj f18196to;

    /* JADX INFO: renamed from: x1 */
    private List<C12380dy> f18197x1;

    public C6402dy() {
        List<C12380dy> list = new List<>();
        this.f18197x1 = list;
        list.addItem(new C12380dy("^\\."));
        this.f18197x1.addItem(new C12380dy("^\\d+\\."));
        this.f18197x1.addItem(new C12380dy("^\\[\\d+\\]"));
        this.f18197x1.addItem(new C12380dy("^\\d+\\)"));
        this.f18197x1.addItem(new C12380dy("^[A-Z]\\."));
        this.f18197x1.addItem(new C12380dy("^[a-z]\\."));
        this.f18197x1.addItem(new C12380dy("^[A-Z]\\)"));
        this.f18197x1.addItem(new C12380dy("^[a-z]\\)"));
        this.f18197x1.addItem(new C12380dy("^[IVXL]+\\."));
        this.f18197x1.addItem(new C12380dy("^[ivxl]+\\."));
    }

    /* JADX INFO: renamed from: k4 */
    private float m26271k4(float f, float f2) {
        return ((float) C14116yg.m67497to((((double) f) * ((double) f2)) * 1000.0d)) / 1000.0f;
    }

    /* JADX INFO: renamed from: m9 */
    private List<C6365jd> m26277m9() {
        boolean z;
        C3924ck c3924ck;
        List<C6365jd> list = new List<>();
        C6365jd c6365jd = new C6365jd();
        List list2 = new List();
        List.Enumerator<C3924ck> it = this.f18194k4.iterator();
        C3924ck c3924ck2 = null;
        float f = -1.0f;
        float fM15651to = -1.0f;
        float fM15646k4 = -1.0f;
        float fM15652x1 = -3.4028235E38f;
        float fM67481k4 = -1.0f;
        boolean z2 = true;
        while (it.hasNext()) {
            try {
                C3924ck next = it.next();
                int length = next.m15650m9().length();
                float fM15641ck = next.m15641ck();
                float f2 = (fM15641ck == 0.0f || fM15641ck == Float.NaN) ? Float.MAX_VALUE : f < 0.0f ? 0.5f * fM15641ck : 0.5f * ((fM15641ck + f) / 2.0f);
                fM15651to = fM15651to < 0.0f ? next.m15651to() / length : ((next.m15651to() / length) + fM15651to) / 2.0f;
                float f3 = 0.3f * fM15651to;
                float f4 = fM15646k4 != -1.0f ? f3 > f2 ? fM15646k4 + f2 : fM15646k4 + f3 : -3.4028235E38f;
                if (list2.size() > 0) {
                    C3924ck c3924ck3 = (C3924ck) list2.get_Item(list2.size() - 1);
                    if (m26274k4(next.m15652x1(), next.m15649kk(), fM15652x1, fM67481k4)) {
                        z = false;
                    } else {
                        if (m26276k4(c3924ck3, next, c3924ck2, fM67481k4)) {
                            c6365jd.m26154k4(new C6370up((C3924ck[]) list2.toArray(new C3924ck[0])));
                            if (!C14113y2.m67411k4(c6365jd.m26157x1())) {
                                list.addItem(c6365jd);
                            }
                            c6365jd = new C6365jd();
                            z = true;
                        } else {
                            z = false;
                        }
                        c3924ck2 = next;
                        if (!z) {
                            fM67481k4 = -1.0f;
                            fM15652x1 = -3.4028235E38f;
                        }
                    }
                    if (z || m26275k4(c3924ck3, next)) {
                        c3924ck = c3924ck2;
                    } else {
                        c3924ck = c3924ck2;
                        c6365jd.m26154k4(new C6370up((C3924ck[]) list2.toArray(new C3924ck[0])));
                        if (!C14113y2.m67411k4(c6365jd.m26157x1())) {
                            list.addItem(c6365jd);
                        }
                        c6365jd = new C6365jd();
                        z = true;
                    }
                    if (!z && f4 != -3.4028235E38f && f4 < next.m15646k4() && c3924ck3.m15650m9() != null && !C14113y2.m67424kk(c3924ck3.m15650m9(), " ")) {
                        list2.addItem(new C3924ck(c3924ck3.m15646k4(), c3924ck3.m15652x1(), c3924ck3.m15651to(), c3924ck3.m15649kk(), " ", c3924ck3.m15642du(), c3924ck3.m15644h4(), c3924ck3.m15643dy().Clone(), c3924ck3.m15641ck()));
                    }
                    if (!z && m26279x1(c3924ck3, next)) {
                        c6365jd.m26154k4(new C6370up((C3924ck[]) list2.toArray(new C3924ck[0])));
                        z = true;
                    }
                    if (!z && c3924ck3.m15644h4() != next.m15644h4()) {
                        c6365jd.m26154k4(new C6370up((C3924ck[]) list2.toArray(new C3924ck[0])));
                        z = true;
                    }
                    if (z) {
                        list2.clear();
                    }
                    if (c3924ck3 != null && next.m15642du() == c3924ck3.m15642du()) {
                        int i = (next.m15644h4() > c3924ck3.m15644h4() ? 1 : (next.m15644h4() == c3924ck3.m15644h4() ? 0 : -1));
                    }
                    if (z2) {
                        c3924ck2 = c3924ck3;
                        z2 = false;
                    } else {
                        c3924ck2 = c3924ck;
                    }
                }
                if (next.m15652x1() >= fM15652x1) {
                    fM15652x1 = next.m15652x1();
                }
                fM15646k4 = next.m15646k4() + next.m15651to();
                fM67481k4 = C14116yg.m67481k4(fM67481k4, next.m15649kk());
                list2.addItem(next);
                f = fM15641ck;
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (list2.size() > 0) {
            c6365jd.m26154k4(new C6370up((C3924ck[]) list2.toArray(new C3924ck[0])));
            if (!C14113y2.m67411k4(c6365jd.m26157x1())) {
                list.addItem(c6365jd);
            }
        }
        return list;
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6407to
    /* JADX INFO: renamed from: du */
    public final boolean mo26281du() {
        return this.f18193du;
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6407to
    /* JADX INFO: renamed from: h4 */
    public final void mo26282h4() {
        this.f18194k4.clear();
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6407to
    /* JADX INFO: renamed from: kk */
    public final C11913yj mo26287kk() {
        return this.f18196to;
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6407to
    /* JADX INFO: renamed from: to */
    public final List<C6365jd> mo26288to() {
        return m26277m9();
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6407to
    /* JADX INFO: renamed from: x1 */
    public final C11913yj mo26289x1() {
        return this.f18195kk;
    }

    /* JADX INFO: renamed from: x1 */
    private C12380dy m26278x1(C3924ck c3924ck) {
        return m26272k4(c3924ck.m15650m9(), this.f18197x1);
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6407to
    /* JADX INFO: renamed from: k4 */
    public final List<C3924ck> mo26283k4() {
        return this.f18194k4;
    }

    /* JADX INFO: renamed from: k4 */
    private C12380dy m26272k4(String str, List<C12380dy> list) {
        List.Enumerator<C12380dy> it = list.iterator();
        while (it.hasNext()) {
            try {
                C12380dy next = it.next();
                if (next.m57989x1(str).mo58006to()) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6407to
    /* JADX INFO: renamed from: x1 */
    public final void mo26290x1(C11913yj c11913yj) {
        this.f18196to = c11913yj;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m26279x1(C3924ck c3924ck, C3924ck c3924ck2) {
        return ((double) (c3924ck.m15644h4() - c3924ck2.m15644h4())) > 0.1d || !C14113y2.m67363du(c3924ck.m15642du().m58769ks(), c3924ck2.m15642du().m58769ks()) || C12003du.m56476x1(c3924ck.m15643dy(), c3924ck2.m15643dy());
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6407to
    /* JADX INFO: renamed from: k4 */
    public final void mo26284k4(C3924ck c3924ck) {
        if (c3924ck == null) {
            throw new ArgumentNullException("DecodedText instance for AddText method can not be null.");
        }
        this.f18194k4.addItem(c3924ck);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (r8.m15640c5() == false) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m26280x1(C3924ck c3924ck, C3924ck c3924ck2, C3924ck c3924ck3, float f) {
        C12380dy c12380dyM26278x1;
        boolean z;
        if (c3924ck3 == null) {
            z = true;
        } else {
            float fM67480k4 = C14116yg.m67480k4(c3924ck.m15652x1() - c3924ck2.m15652x1());
            float fM26271k4 = m26271k4(2.5f, f);
            float fM15646k4 = c3924ck.m15646k4() - c3924ck3.m15646k4();
            float fM26271k42 = m26271k4(2.0f, c3924ck.m15641ck());
            float fM26271k43 = m26271k4(0.25f, c3924ck.m15651to());
            if (fM67480k4 <= fM26271k4) {
                if (fM15646k4 <= fM26271k42) {
                    if (fM15646k4 >= (-c3924ck.m15641ck())) {
                        if (C14116yg.m67480k4(fM15646k4) < fM26271k43) {
                            if (c3924ck3.m15645jd()) {
                                c3924ck.m15653x1(true);
                            } else if (!c3924ck3.m15640c5() || (c12380dyM26278x1 = m26278x1(c3924ck3)) == null || c12380dyM26278x1 != m26278x1(c3924ck)) {
                            }
                        }
                        z = false;
                    } else if (c3924ck3.m15640c5()) {
                        z = false;
                    }
                }
            }
        }
        if (z) {
            c3924ck.m15648k4(true);
        }
        return z;
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6407to
    /* JADX INFO: renamed from: k4 */
    public final void mo26285k4(C11913yj c11913yj) {
        this.f18195kk = c11913yj;
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6407to
    /* JADX INFO: renamed from: k4 */
    public final void mo26286k4(boolean z) {
        this.f18193du = z;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m26273k4(float f, float f2, float f3) {
        return f2 < f + f3 && f2 > f - f3;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m26274k4(float f, float f2, float f3, float f4) {
        if (m26273k4(f, f3, 0.1f)) {
            return true;
        }
        if (f3 > f || f3 < f - f2) {
            return f <= f3 && f >= f3 - f4;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m26275k4(C3924ck c3924ck, C3924ck c3924ck2) {
        float fM15652x1 = c3924ck.m15652x1();
        return c3924ck2.m15646k4() > c3924ck.m15646k4() && c3924ck2.m15646k4() < c3924ck.m15646k4() + (c3924ck2.m15651to() + c3924ck.m15651to()) && c3924ck.m15649kk() + fM15652x1 >= c3924ck2.m15652x1() && fM15652x1 <= c3924ck2.m15652x1();
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m26276k4(C3924ck c3924ck, C3924ck c3924ck2, C3924ck c3924ck3, float f) {
        return m26280x1(c3924ck, c3924ck2, c3924ck3, f);
    }
}
