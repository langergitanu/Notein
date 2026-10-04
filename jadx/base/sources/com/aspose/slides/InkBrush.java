package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.android.SizeF;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12015qq;

/* JADX INFO: loaded from: classes3.dex */
public class InkBrush implements IInkBrush {

    /* JADX INFO: renamed from: ck */
    private boolean f2529ck;

    /* JADX INFO: renamed from: du */
    private lzp f2530du;

    /* JADX INFO: renamed from: fa */
    private boolean f2532fa;

    /* JADX INFO: renamed from: h4 */
    private lzp f2533h4;

    /* JADX INFO: renamed from: k4 */
    private String f2535k4;

    /* JADX INFO: renamed from: up */
    private boolean f2539up;

    /* JADX INFO: renamed from: x1 */
    private String f2540x1;

    /* JADX INFO: renamed from: m9 */
    private C12003du f2537m9 = new C12003du();

    /* JADX INFO: renamed from: kk */
    private List<los> f2536kk = new List<>();

    /* JADX INFO: renamed from: to */
    private List<d7i> f2538to = new List<>();

    /* JADX INFO: renamed from: yj */
    private List<dd0> f2541yj = new List<>();

    /* JADX INFO: renamed from: c5 */
    private int f2528c5 = 0;

    /* JADX INFO: renamed from: jd */
    private int f2534jd = 1;

    /* JADX INFO: renamed from: dy */
    private int f2531dy = 255;

    /* JADX INFO: renamed from: c5 */
    public final lzp m1779c5() {
        return this.f2530du;
    }

    /* JADX INFO: renamed from: ck */
    public final int m1780ck() {
        return this.f2531dy;
    }

    /* JADX INFO: renamed from: du */
    public final String m1781du() {
        return this.f2535k4;
    }

    /* JADX INFO: renamed from: dy */
    public final List<d7i> m1782dy() {
        return this.f2538to;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m1783fa() {
        return this.f2529ck;
    }

    @Override // com.aspose.slides.IInkBrush
    public final Integer getColor() {
        return (Integer) C12003du.m56473x1(m1786k4());
    }

    @Override // com.aspose.slides.IInkBrush
    public final SizeF getSize() {
        return (SizeF) C12015qq.m56690k4(m1800x1());
    }

    /* JADX INFO: renamed from: h4 */
    public final String m1784h4() {
        return this.f2540x1;
    }

    /* JADX INFO: renamed from: jd */
    public final lzp m1785jd() {
        return this.f2533h4;
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m1786k4() {
        return C12003du.m56400k4(this.f2531dy, this.f2537m9.Clone());
    }

    /* JADX INFO: renamed from: kk */
    public final int m1793kk() {
        return this.f2528c5;
    }

    /* JADX INFO: renamed from: ks */
    public final List<dd0> m1796ks() {
        return this.f2541yj;
    }

    /* JADX INFO: renamed from: m9 */
    public final List<los> m1797m9() {
        return this.f2536kk;
    }

    @Override // com.aspose.slides.IInkBrush
    public final void setColor(Integer num) {
        m1788k4(C12003du.m56401k4(num));
    }

    @Override // com.aspose.slides.IInkBrush
    public final void setSize(SizeF sizeF) {
        m1789k4(C12015qq.m56689k4(sizeF));
    }

    /* JADX INFO: renamed from: to */
    public final int m1798to() {
        return this.f2534jd;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m1799up() {
        return this.f2532fa;
    }

    /* JADX INFO: renamed from: x1 */
    public C12015qq m1800x1() {
        return new C12015qq((float) wzw.m72987k4(m1779c5().m64643k4(), m1779c5().m64646x1()), (float) wzw.m72987k4(m1785jd().m64643k4(), m1785jd().m64646x1()));
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m1805yj() {
        return this.f2539up;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1787k4(int i) {
        this.f2528c5 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m1794kk(int i) {
        this.f2531dy = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1801x1(int i) {
        this.f2534jd = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m1788k4(C12003du c12003du) {
        c12003du.CloneTo(this.f2537m9);
    }

    /* JADX INFO: renamed from: kk */
    public final void m1795kk(boolean z) {
        this.f2539up = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1802x1(lzp lzpVar) {
        this.f2533h4 = lzpVar;
    }

    /* JADX INFO: renamed from: k4 */
    public void m1789k4(C12015qq c12015qq) {
        m1779c5().m64644k4(wzw.m72989x1(c12015qq.m56699x1(), m1779c5().m64646x1()));
        m1785jd().m64644k4(wzw.m72989x1(c12015qq.m56697kk(), m1779c5().m64646x1()));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1803x1(String str) {
        this.f2540x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1790k4(lzp lzpVar) {
        this.f2530du = lzpVar;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1804x1(boolean z) {
        this.f2532fa = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1791k4(String str) {
        this.f2535k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1792k4(boolean z) {
        this.f2529ck = z;
    }
}
