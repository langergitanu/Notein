package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ug */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2320ug {

    /* JADX INFO: renamed from: du */
    protected List<AbstractC2166kq> f8013du = new List<>();

    /* JADX INFO: renamed from: k4 */
    protected long f8014k4;

    /* JADX INFO: renamed from: kk */
    protected C2275rm f8015kk;

    /* JADX INFO: renamed from: to */
    protected int f8016to;

    /* JADX INFO: renamed from: x1 */
    protected int f8017x1;

    /* JADX INFO: renamed from: k4 */
    public final int m11482k4() {
        return this.f8017x1;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo10708k4(List<Integer> list, C2212n9 c2212n9);

    /* JADX INFO: renamed from: kk */
    public final int m11484kk() {
        return this.f8016to;
    }

    /* JADX INFO: renamed from: to */
    public final List<AbstractC2166kq> m11485to() {
        return this.f8013du;
    }

    /* JADX INFO: renamed from: x1 */
    public final C2275rm m11486x1() {
        return this.f8015kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T extends AbstractC2166kq> T m11481k4(T t, C2212n9 c2212n9) {
        if ((t.m11355k4() & 4294967295L) == 0) {
            throw new C2243pd("Trying to load table with zero offset");
        }
        t.mo10153k4(c2212n9);
        return t;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11483k4(long j, C2212n9 c2212n9) {
        this.f8014k4 = j & 4294967295L;
        c2212n9.m11159k4(j & 4294967295L);
        this.f8017x1 = c2212n9.m11151fa();
        this.f8015kk = new C2275rm(c2212n9.m11151fa());
        List<Integer> listM11354x1 = AbstractC2282s0.m11354x1(c2212n9);
        this.f8016to = this.f8015kk.m11344x1() ? c2212n9.m11151fa() : 65535;
        mo10708k4(listM11354x1, c2212n9);
    }
}
