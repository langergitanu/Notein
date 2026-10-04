package com.aspose.slides.internal.p420th;

import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.ak */
/* JADX INFO: loaded from: classes4.dex */
public class C10947ak extends AbstractC10981yj {

    /* JADX INFO: renamed from: dy */
    private static final C5659x1 f38145dy = C9763ck.m48030to().m48331k4("Times New Roman", 12.0f, 0);

    /* JADX INFO: renamed from: c5 */
    private boolean f38146c5;

    /* JADX INFO: renamed from: du */
    private int f38147du;

    /* JADX INFO: renamed from: h4 */
    private C5656k4 f38148h4;

    /* JADX INFO: renamed from: jd */
    private float f38149jd;

    /* JADX INFO: renamed from: k4 */
    private String f38150k4;

    /* JADX INFO: renamed from: kk */
    private C12015qq f38151kk;

    /* JADX INFO: renamed from: m9 */
    private C5659x1 f38152m9;

    /* JADX INFO: renamed from: to */
    private boolean f38153to;

    /* JADX INFO: renamed from: x1 */
    private String f38154x1;

    public C10947ak() {
        String str = C14113y2.f47374k4;
        this.f38150k4 = str;
        this.f38154x1 = str;
        this.f38151kk = C12015qq.f40552k4.Clone();
        this.f38147du = 0;
        this.f38148h4 = C5656k4.f15518dy;
        this.f38152m9 = f38145dy;
        this.f38146c5 = false;
        this.f38149jd = 0.0f;
    }

    /* JADX INFO: renamed from: ck */
    public final C12015qq m52858ck() {
        return this.f38151kk;
    }

    /* JADX INFO: renamed from: du */
    public final String m52859du() {
        return this.f38153to ? this.f38154x1 : this.f38150k4;
    }

    /* JADX INFO: renamed from: fa */
    public final C5656k4 m52860fa() {
        return this.f38148h4;
    }

    /* JADX INFO: renamed from: jd */
    public final C5659x1 m52861jd() {
        return this.f38152m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52862k4(C5659x1 c5659x1) {
        this.f38152m9 = c5659x1;
    }

    /* JADX INFO: renamed from: kk */
    public final String m52866kk() {
        return this.f38150k4;
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10981yj
    /* JADX INFO: renamed from: to */
    public C12007ix mo52867to() {
        return new C12007ix(m53142h4().Clone(), m52858ck().Clone());
    }

    /* JADX INFO: renamed from: up */
    public final float m52868up() {
        return this.f38149jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m52869x1() {
        return this.f38147du;
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m52870yj() {
        return this.f38146c5;
    }

    public C10947ak(C12025x6 c12025x6, String str, C12015qq c12015qq, boolean z) {
        super(new C12025x6(c12025x6.m56897x1() - 1.75f, c12025x6.m56895kk()), str);
        String str2 = C14113y2.f47374k4;
        this.f38150k4 = str2;
        this.f38154x1 = str2;
        this.f38151kk = C12015qq.f40552k4.Clone();
        this.f38147du = 0;
        this.f38148h4 = C5656k4.f15518dy;
        this.f38152m9 = f38145dy;
        this.f38146c5 = false;
        this.f38149jd = 0.0f;
        this.f38151kk = new C12015qq(c12015qq.m56699x1() + 3.5f, c12015qq.m56697kk());
        this.f38153to = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52863k4(C12015qq c12015qq) {
        c12015qq.CloneTo(this.f38151kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52864k4(String str) {
        this.f38150k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m52865k4() {
        return this.f38153to;
    }
}
