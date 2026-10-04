package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p077d8.C3060ix;
import com.aspose.slides.internal.p077d8.C3072m9;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3088tq;
import com.aspose.slides.internal.p077d8.C3114yo;
import com.aspose.slides.internal.p077d8.InterfaceC3096vh;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.va */
/* JADX INFO: loaded from: classes3.dex */
class C14670va {

    /* JADX INFO: renamed from: k4 */
    final C3088tq f49483k4;

    /* JADX INFO: renamed from: x1 */
    final C3088tq f49484x1;

    public C14670va() {
        this.f49483k4 = new C3088tq(new C3152yj(C3088tq.m13121k4(C3088tq.f9164x1.Clone())));
        this.f49484x1 = new C3088tq(new C3152yj(C3088tq.m13121k4(C3088tq.f9163k4.Clone())));
    }

    /* JADX INFO: renamed from: ar */
    private void m72105ar() {
        C3088tq c3088tq = this.f49484x1;
        if (c3088tq == null || (c3088tq.m13124kk() & 4294967295L) == 0) {
            throw new PptException("Presentation doesn't have SummaryInformation stream.");
        }
    }

    /* JADX INFO: renamed from: yj */
    private long m72107yj(String str) {
        m72154uz();
        if (this.f49483k4.m13122du() == null) {
            this.f49483k4.m13126x1();
        }
        if (this.f49483k4.m13122du().m13050x1().m12906k4().containsValue(str)) {
            this.f49483k4.m13122du().m13030k4(str);
        }
        long jM13048kk = this.f49483k4.m13122du().m13048kk();
        if ((4294967295L & jM13048kk) < 3) {
            return 3L;
        }
        return jM13048kk;
    }

    /* JADX INFO: renamed from: c5 */
    public final C14084qq m72108c5() {
        C3088tq c3088tq = this.f49484x1;
        if (c3088tq == null || c3088tq.m13125to() == null) {
            return C14084qq.m67081jd();
        }
        if (m72106k4(12L)) {
            return C14084qq.f47299x1;
        }
        C14084qq c14084qq = new C14084qq();
        C14084qq[] c14084qqArr = {c14084qq};
        this.f49484x1.m13125to().m13038k4(12L, c14084qqArr);
        c14084qqArr[0].CloneTo(c14084qq);
        return c14084qq;
    }

    /* JADX INFO: renamed from: ck */
    public final String m72110ck() {
        C3088tq c3088tq = this.f49483k4;
        if (c3088tq == null || c3088tq.m13125to() == null) {
            return "";
        }
        String[] strArr = {null};
        this.f49483k4.m13125to().m13039k4(3L, strArr);
        return strArr[0];
    }

    /* JADX INFO: renamed from: du */
    public final String m72112du() {
        C3088tq c3088tq = this.f49484x1;
        if (c3088tq == null || c3088tq.m13125to() == null) {
            return "";
        }
        String[] strArr = {null};
        this.f49484x1.m13125to().m13039k4(6L, strArr);
        return strArr[0];
    }

    /* JADX INFO: renamed from: dy */
    public final C14077m4 m72114dy() {
        C3088tq c3088tq = this.f49484x1;
        if (c3088tq != null && c3088tq.m13125to() != null) {
            C14084qq c14084qq = new C14084qq();
            C14084qq[] c14084qqArr = {c14084qq};
            boolean zM13038k4 = this.f49484x1.m13125to().m13038k4(10L, c14084qqArr);
            c14084qqArr[0].CloneTo(c14084qq);
            if (zM13038k4) {
                return new C14077m4(c14084qq.m67157x6());
            }
        }
        return C14077m4.f47265kk;
    }

    /* JADX INFO: renamed from: fa */
    public final String m72116fa() {
        C3088tq c3088tq = this.f49483k4;
        if (c3088tq == null || c3088tq.m13125to() == null) {
            return "";
        }
        String[] strArr = {null};
        this.f49483k4.m13125to().m13039k4(14L, strArr);
        return strArr[0];
    }

    /* JADX INFO: renamed from: h4 */
    public final String m72118h4() {
        C3088tq c3088tq = this.f49484x1;
        if (c3088tq == null || c3088tq.m13125to() == null) {
            return "";
        }
        String[] strArr = {null};
        this.f49484x1.m13125to().m13039k4(8L, strArr);
        return strArr[0];
    }

    /* JADX INFO: renamed from: ix */
    public final String m72120ix() {
        C3088tq c3088tq = this.f49483k4;
        if (c3088tq != null && c3088tq.m13122du() != null) {
            long[] jArr = {0};
            boolean zM13044k4 = this.f49483k4.m13122du().m13044k4("_PID_LINKBASE", jArr);
            long j = jArr[0];
            if (zM13044k4) {
                C3072m9[] c3072m9Arr = {null};
                this.f49483k4.m13122du().m13037k4(j, c3072m9Arr);
                C3072m9 c3072m9 = c3072m9Arr[0];
                if (c3072m9 != null) {
                    return c3072m9.toString();
                }
            }
        }
        return C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: jd */
    public final C14084qq m72121jd() {
        C3088tq c3088tq = this.f49484x1;
        if (c3088tq == null || c3088tq.m13125to() == null) {
            return C14084qq.m67081jd();
        }
        if (m72106k4(13L)) {
            return C14084qq.f47299x1;
        }
        C14084qq c14084qq = new C14084qq();
        C14084qq[] c14084qqArr = {c14084qq};
        this.f49484x1.m13125to().m13038k4(13L, c14084qqArr);
        c14084qqArr[0].CloneTo(c14084qq);
        return c14084qq;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m72123k4() {
        C3088tq c3088tq = this.f49484x1;
        if (c3088tq == null || c3088tq.m13125to() == null) {
            return "";
        }
        String[] strArr = {null};
        this.f49484x1.m13125to().m13039k4(2L, strArr);
        return strArr[0];
    }

    /* JADX INFO: renamed from: kk */
    public final String m72140kk() {
        C3088tq c3088tq = this.f49484x1;
        if (c3088tq == null || c3088tq.m13125to() == null) {
            return "";
        }
        String[] strArr = {null};
        this.f49484x1.m13125to().m13039k4(4L, strArr);
        return strArr[0];
    }

    /* JADX INFO: renamed from: ks */
    public final String m72143ks() {
        C3088tq c3088tq = this.f49484x1;
        if (c3088tq == null || c3088tq.m13125to() == null) {
            return "";
        }
        String[] strArr = {null};
        this.f49484x1.m13125to().m13039k4(18L, strArr);
        return strArr[0];
    }

    /* JADX INFO: renamed from: m9 */
    public final C14084qq m72144m9() {
        C3088tq c3088tq = this.f49484x1;
        if (c3088tq == null || c3088tq.m13125to() == null) {
            return C14084qq.m67081jd();
        }
        if (m72106k4(11L)) {
            return C14084qq.f47299x1;
        }
        C14084qq c14084qq = new C14084qq();
        C14084qq[] c14084qqArr = {c14084qq};
        this.f49484x1.m13125to().m13038k4(11L, c14084qqArr);
        c14084qqArr[0].CloneTo(c14084qq);
        return c14084qq;
    }

    /* JADX INFO: renamed from: ne */
    public final int m72146ne() {
        C3088tq c3088tq = this.f49483k4;
        int i = 0;
        if (c3088tq == null || c3088tq.m13122du() == null || this.f49483k4.m13122du().m13050x1() == null) {
            return 0;
        }
        IGenericEnumerator<KeyValuePair<Long, String>> it = this.f49483k4.m13122du().m13050x1().m12906k4().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<Long, String> next = it.next();
                if (!C14113y2.m67363du(next.getValue(), "_PID_HLINKS")) {
                    if (this.f49483k4.m13122du().m13032k4(next.getKey().longValue())) {
                        i++;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: qq */
    public final C3088tq m72147qq() {
        return this.f49484x1;
    }

    /* JADX INFO: renamed from: rv */
    public final String m72148rv() {
        C3088tq c3088tq = this.f49484x1;
        if (c3088tq == null || c3088tq.m13125to() == null) {
            return "";
        }
        String[] strArr = {null};
        this.f49484x1.m13125to().m13039k4(7L, strArr);
        return strArr[0];
    }

    /* JADX INFO: renamed from: to */
    public final String m72149to() {
        C3088tq c3088tq = this.f49484x1;
        if (c3088tq == null || c3088tq.m13125to() == null) {
            return "";
        }
        String[] strArr = {null};
        this.f49484x1.m13125to().m13039k4(5L, strArr);
        return strArr[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r2 = (com.aspose.slides.internal.p077d8.C3060ix) r3.getValue();
     */
    /* JADX INFO: renamed from: u4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3060ix m72151u4() {
        C3088tq c3088tq = this.f49483k4;
        C3060ix c3060ix = null;
        if (c3088tq == null || c3088tq.m13122du() == null) {
            return null;
        }
        IGenericEnumerator<KeyValuePair<Long, InterfaceC3096vh>> it = this.f49483k4.m13122du().m13029k4().iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    break;
                }
                KeyValuePair<Long, InterfaceC3096vh> next = it.next();
                if (C7019kk.m27469x1(next.getValue(), C3060ix.class)) {
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c3060ix;
    }

    /* JADX INFO: renamed from: up */
    public final String m72152up() {
        C3088tq c3088tq = this.f49483k4;
        if (c3088tq == null || c3088tq.m13125to() == null) {
            return "";
        }
        String[] strArr = {null};
        this.f49483k4.m13125to().m13039k4(15L, strArr);
        return strArr[0];
    }

    /* JADX INFO: renamed from: uz */
    public final void m72154uz() {
        C3088tq c3088tq = this.f49483k4;
        if (c3088tq == null || (c3088tq.m13124kk() & 4294967295L) == 0) {
            throw new PptException("Presentation doesn't have DocumentSummaryInformation stream.");
        }
    }

    /* JADX INFO: renamed from: wl */
    public final C3088tq m72155wl() {
        return this.f49483k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m72156x1() {
        C3088tq c3088tq = this.f49484x1;
        if (c3088tq == null || c3088tq.m13125to() == null) {
            return "";
        }
        String[] strArr = {null};
        this.f49484x1.m13125to().m13039k4(3L, strArr);
        return strArr[0];
    }

    /* JADX INFO: renamed from: x6 */
    public final int m72160x6() {
        C3088tq c3088tq = this.f49484x1;
        if (c3088tq != null && c3088tq.m13125to() != null) {
            try {
                String[] strArr = {null};
                this.f49484x1.m13125to().m13039k4(9L, strArr);
                String str = strArr[0];
                if (C14113y2.m67411k4(str)) {
                    return 0;
                }
                return C14057f9.m66582k4(str);
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
            }
        }
        return 0;
    }

    public C14670va(C3088tq c3088tq, C3088tq c3088tq2) {
        this.f49483k4 = c3088tq;
        this.f49484x1 = c3088tq2;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m72109c5(String str) {
        m72154uz();
        this.f49483k4.m13125to().m13029k4().set_Item(15L, new C3114yo(str));
    }

    /* JADX INFO: renamed from: ck */
    public final void m72111ck(String str) {
        m72105ar();
        this.f49484x1.m13125to().m13029k4().set_Item(18L, new C3114yo(str));
    }

    /* JADX INFO: renamed from: du */
    public final void m72113du(String str) {
        m72105ar();
        this.f49484x1.m13125to().m13029k4().set_Item(6L, new C3114yo(str));
    }

    /* JADX INFO: renamed from: dy */
    public final void m72115dy(String str) {
        m72154uz();
        this.f49483k4.m13125to().m13029k4().set_Item(14L, new C3114yo(str));
    }

    /* JADX INFO: renamed from: fa */
    public final void m72117fa(String str) {
        m72105ar();
        this.f49484x1.m13125to().m13029k4().set_Item(7L, new C3114yo(str));
    }

    /* JADX INFO: renamed from: h4 */
    public final void m72119h4(String str) {
        m72105ar();
        this.f49484x1.m13125to().m13029k4().set_Item(8L, new C3114yo(str));
    }

    /* JADX INFO: renamed from: jd */
    public final void m72122jd(String str) {
        m72154uz();
        this.f49483k4.m13125to().m13029k4().set_Item(2L, new C3114yo(str));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72124k4(int i) {
        m72105ar();
        this.f49484x1.m13125to().m13029k4().set_Item(9L, new C3114yo(C14057f9.m66586k4(i, (InterfaceC14073kp) C11697x1.m55250kk())));
    }

    /* JADX INFO: renamed from: kk */
    public final void m72141kk(C14084qq c14084qq) {
        m72105ar();
        this.f49484x1.m13125to().m13029k4().set_Item(13L, new C3114yo(c14084qq.Clone()));
    }

    /* JADX INFO: renamed from: m9 */
    public final void m72145m9(String str) {
        m72154uz();
        this.f49483k4.m13125to().m13029k4().set_Item(3L, new C3114yo(str));
    }

    /* JADX INFO: renamed from: to */
    public final void m72150to(String str) {
        m72105ar();
        this.f49484x1.m13125to().m13029k4().set_Item(5L, new C3114yo(str));
    }

    /* JADX INFO: renamed from: up */
    public final void m72153up(String str) {
        if (C14113y2.m67411k4(str)) {
            return;
        }
        m72154uz();
        if ((this.f49483k4.m13124kk() & 4294967295L) < 2) {
            this.f49483k4.m13126x1();
        }
        C3072m9 c3072m9 = new C3072m9();
        c3072m9.m12984k4(str);
        this.f49483k4.m13122du().m13031k4("_PID_LINKBASE", new C3114yo(c3072m9));
    }

    /* JADX INFO: renamed from: x1 */
    public final String m72157x1(int i) {
        if (i >= 0 && i < m72146ne() && this.f49483k4.m13122du() != null && this.f49483k4.m13122du().m13050x1() != null) {
            IGenericEnumerator<KeyValuePair<Long, String>> it = this.f49483k4.m13122du().m13050x1().m12906k4().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                try {
                    KeyValuePair<Long, String> next = it.next();
                    String value = next.getValue();
                    if (!C14113y2.m67363du(value, "_PID_HLINKS")) {
                        if (this.f49483k4.m13122du().m13032k4(next.getKey().longValue())) {
                            int i3 = i2 + 1;
                            if (i2 == i) {
                                return value;
                            }
                            i2 = i3;
                        } else {
                            continue;
                        }
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
        }
        throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Property index is out of range.");
    }

    /* JADX INFO: renamed from: yj */
    public final String m72161yj() {
        C3088tq c3088tq = this.f49483k4;
        if (c3088tq == null || c3088tq.m13125to() == null) {
            return "";
        }
        String[] strArr = {null};
        this.f49483k4.m13125to().m13039k4(2L, strArr);
        return strArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72125k4(C14077m4 c14077m4) {
        m72105ar();
        C14084qq c14084qqClone = C14084qq.m67120x1(0L).Clone();
        if (c14077m4.m66813du() > 0 && c14077m4.m66813du() < C14084qq.f47293kk.m67157x6()) {
            C14084qq.m67120x1(c14077m4.m66813du()).CloneTo(c14084qqClone);
        }
        this.f49484x1.m13125to().m13029k4().set_Item(10L, new C3114yo(c14084qqClone.Clone()));
    }

    /* JADX INFO: renamed from: kk */
    public final void m72142kk(String str) {
        m72105ar();
        this.f49484x1.m13125to().m13029k4().set_Item(4L, new C3114yo(str));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m72158x1(C14084qq c14084qq) {
        m72105ar();
        this.f49484x1.m13125to().m13029k4().set_Item(12L, new C3114yo(c14084qq.Clone()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72126k4(C14084qq c14084qq) {
        m72105ar();
        this.f49484x1.m13125to().m13029k4().set_Item(11L, new C3114yo(c14084qq.Clone()));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m72159x1(String str) {
        m72105ar();
        this.f49484x1.m13125to().m13029k4().set_Item(3L, new C3114yo(str));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72127k4(String str) {
        m72105ar();
        this.f49484x1.m13125to().m13029k4().set_Item(2L, new C3114yo(str));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72128k4(String str, double d) {
        long jM72107yj = m72107yj(str);
        this.f49483k4.m13122du().m13029k4().set_Item(Long.valueOf(jM72107yj), new C3114yo(d));
        this.f49483k4.m13122du().m13050x1().m12906k4().set_Item(Long.valueOf(jM72107yj), str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72129k4(String str, float f) {
        long jM72107yj = m72107yj(str);
        this.f49483k4.m13122du().m13029k4().set_Item(Long.valueOf(jM72107yj), new C3114yo(f));
        this.f49483k4.m13122du().m13050x1().m12906k4().set_Item(Long.valueOf(jM72107yj), str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72130k4(String str, int i) {
        long jM72107yj = m72107yj(str);
        this.f49483k4.m13122du().m13029k4().set_Item(Long.valueOf(jM72107yj), new C3114yo(i));
        this.f49483k4.m13122du().m13050x1().m12906k4().set_Item(Long.valueOf(jM72107yj), str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72131k4(String str, C14084qq c14084qq) {
        long jM72107yj = m72107yj(str);
        this.f49483k4.m13122du().m13029k4().set_Item(Long.valueOf(jM72107yj), new C3114yo(c14084qq.Clone()));
        this.f49483k4.m13122du().m13050x1().m12906k4().set_Item(Long.valueOf(jM72107yj), str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72132k4(String str, String str2) {
        long jM72107yj = m72107yj(str);
        this.f49483k4.m13122du().m13029k4().set_Item(Long.valueOf(jM72107yj), new C3114yo(str2));
        this.f49483k4.m13122du().m13050x1().m12906k4().set_Item(Long.valueOf(jM72107yj), str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72133k4(String str, boolean z) {
        long jM72107yj = m72107yj(str);
        this.f49483k4.m13122du().m13029k4().set_Item(Long.valueOf(jM72107yj), new C3114yo(z));
        this.f49483k4.m13122du().m13050x1().m12906k4().set_Item(Long.valueOf(jM72107yj), str);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m72106k4(long j) {
        long[] jArr = {0};
        this.f49484x1.m13125to().m13036k4(j, jArr);
        return jArr[0] == 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m72134k4(String str, double[] dArr) {
        if (this.f49483k4.m13122du() != null) {
            return this.f49483k4.m13122du().m13041k4(str, dArr);
        }
        dArr[0] = 0.0d;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m72135k4(String str, float[] fArr) {
        if (this.f49483k4.m13122du() != null) {
            return this.f49483k4.m13122du().m13042k4(str, fArr);
        }
        fArr[0] = 0.0f;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m72136k4(String str, int[] iArr) {
        if (this.f49483k4.m13122du() != null) {
            return this.f49483k4.m13122du().m13043k4(str, iArr);
        }
        iArr[0] = 0;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m72137k4(String str, C14084qq[] c14084qqArr) {
        if (this.f49483k4.m13122du() != null) {
            return this.f49483k4.m13122du().m13045k4(str, c14084qqArr);
        }
        C14084qq.m67120x1(0L).CloneTo(c14084qqArr[0]);
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m72138k4(String str, String[] strArr) {
        if (this.f49483k4.m13122du() != null) {
            return this.f49483k4.m13122du().m13046k4(str, strArr);
        }
        strArr[0] = C14113y2.f47374k4;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m72139k4(String str, boolean[] zArr) {
        if (this.f49483k4.m13122du() != null) {
            return this.f49483k4.m13122du().m13047k4(str, zArr);
        }
        zArr[0] = false;
        return false;
    }
}
