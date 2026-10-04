package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p406ss.AbstractC10327ck;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C1593lr extends C1606x1 {

    /* JADX INFO: renamed from: c5 */
    private int f6170c5;

    /* JADX INFO: renamed from: ck */
    private C1609yj f6171ck;

    /* JADX INFO: renamed from: dy */
    protected C1608yd f6172dy;

    /* JADX INFO: renamed from: fa */
    private List<C1606x1> f6173fa;

    /* JADX INFO: renamed from: jd */
    private String f6174jd;

    public C1593lr(int i, String str, C1608yd c1608yd) {
        this.f6173fa = new List<>();
        this.f6170c5 = i;
        this.f6174jd = str;
        m8667k4(31, Boolean.TRUE);
        this.f6172dy = c1608yd;
    }

    /* JADX INFO: renamed from: b3 */
    public final List<C1606x1> m8593b3() {
        return this.f6173fa;
    }

    public Object clone() {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8594k4(C1581c5 c1581c5) {
        mo8582k4((C1606x1) c1581c5);
    }

    /* JADX INFO: renamed from: lr */
    public final C1608yd m8596lr() {
        return this.f6172dy;
    }

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    public String toString() {
        C6765kp c6765kp = new C6765kp(super.toString());
        c6765kp.m26792k4(" {regionName=").m26792k4(this.f6174jd);
        c6765kp.m26792k4(", regionClass=").m26805kk(this.f6170c5);
        c6765kp.m26792k4(", ctm=").m26791k4(this.f6171ck);
        c6765kp.m26792k4("}");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: wy */
    public final int m8597wy() {
        return this.f6170c5;
    }

    /* JADX INFO: renamed from: yd */
    public final C1609yj m8598yd() {
        return this.f6171ck;
    }

    public C1593lr(AbstractC10327ck abstractC10327ck, C1608yd c1608yd) {
        this(abstractC10327ck.mo14084ix(), abstractC10327ck.m50335bz(), c1608yd);
    }

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: k4 */
    public void mo8582k4(C1606x1 c1606x1) {
        this.f6173fa.addItem(c1606x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8595k4(C1609yj c1609yj) {
        this.f6171ck = c1609yj;
    }
}
