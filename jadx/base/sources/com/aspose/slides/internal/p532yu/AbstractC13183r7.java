package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.r7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13183r7 {

    /* JADX INFO: renamed from: c5 */
    protected Object f44241c5;

    /* JADX INFO: renamed from: ck */
    protected long f44242ck;

    /* JADX INFO: renamed from: du */
    protected int f44243du;

    /* JADX INFO: renamed from: dy */
    protected String f44244dy;

    /* JADX INFO: renamed from: fa */
    protected List<String> f44245fa;

    /* JADX INFO: renamed from: h4 */
    protected C12943dd f44246h4;

    /* JADX INFO: renamed from: jd */
    protected long f44247jd;

    /* JADX INFO: renamed from: kk */
    protected String f44248kk;

    /* JADX INFO: renamed from: m9 */
    protected AbstractC12892ae f44249m9;

    /* JADX INFO: renamed from: to */
    protected boolean f44250to;

    /* JADX INFO: renamed from: x1 */
    protected C13890ei f44251x1;

    public AbstractC13183r7() {
        this.f44251x1 = C13890ei.f46456k4;
        this.f44250to = false;
    }

    /* JADX INFO: renamed from: ak */
    public final String m61427ak() {
        String str = this.f44244dy;
        return str != null ? str : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: ar */
    public final String m61428ar() {
        String str = this.f44248kk;
        return str == null ? C14113y2.f47374k4 : str;
    }

    /* JADX INFO: renamed from: b3 */
    public final AbstractC12892ae m61429b3() {
        return this.f44249m9;
    }

    /* JADX INFO: renamed from: bv */
    public final int m61430bv() {
        return this.f44243du;
    }

    /* JADX INFO: renamed from: dq */
    public final Object m61431dq() {
        return this.f44241c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61432k4(long j) {
        this.f44247jd = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m61439kk(String str) {
        if (this.f44245fa == null) {
            this.f44245fa = new List<>();
        }
        this.f44245fa.addItem(str);
    }

    /* JADX INFO: renamed from: lr */
    public final long m61441lr() {
        return this.f44242ck;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m61442m9(int i) {
        this.f44243du = i;
    }

    /* JADX INFO: renamed from: qq */
    public final C13890ei m61443qq() {
        return this.f44251x1;
    }

    /* JADX INFO: renamed from: to */
    public final void m61444to(String str) {
        this.f44244dy = str;
    }

    /* JADX INFO: renamed from: um */
    public final boolean m61445um() {
        return this.f44250to;
    }

    /* JADX INFO: renamed from: v4 */
    public final long m61446v4() {
        return this.f44247jd;
    }

    /* JADX INFO: renamed from: wy */
    public final List<String> m61447wy() {
        return this.f44245fa;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61448x1(long j) {
        this.f44242ck = j;
    }

    /* JADX INFO: renamed from: yd */
    public final C12943dd m61451yd() {
        return this.f44246h4;
    }

    public AbstractC13183r7(C13890ei c13890ei, String str) {
        C13890ei c13890ei2 = C13890ei.f46456k4;
        this.f44250to = false;
        this.f44251x1 = c13890ei;
        this.f44248kk = str;
        this.f44247jd = -1L;
        this.f44242ck = -1L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61433k4(List<String> list) {
        this.f44245fa = list;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m61440kk(Object obj) {
        int i = this.f44243du;
        if (i != 3 && i != 4) {
            return true;
        }
        Object obj2 = this.f44241c5;
        return obj2 != null && this.f44249m9.mo60031k4(obj, obj2);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61449x1(String str) {
        this.f44248kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61434k4(AbstractC12892ae abstractC12892ae) {
        this.f44249m9 = abstractC12892ae;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m61450x1(Object obj) {
        return !(this.f44249m9.mo60016c5() == 8 || this.f44249m9.mo60016c5() == 9) || this.f44245fa.containsItem(obj.toString());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61435k4(C12943dd c12943dd) {
        this.f44246h4 = c12943dd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61436k4(C13890ei c13890ei) {
        this.f44251x1 = c13890ei;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61437k4(Object obj) {
        this.f44241c5 = obj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61438k4(boolean z) {
        this.f44250to = z;
    }
}
