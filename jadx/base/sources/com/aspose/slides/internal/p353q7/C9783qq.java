package com.aspose.slides.internal.p353q7;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.slides.internal.p505xn.C12570to;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.qq */
/* JADX INFO: loaded from: classes4.dex */
public class C9783qq extends AbstractC9768f9 {

    /* JADX INFO: renamed from: c5 */
    public short f35350c5;

    /* JADX INFO: renamed from: ck */
    public short f35351ck;

    /* JADX INFO: renamed from: du */
    public int f35352du;

    /* JADX INFO: renamed from: dy */
    public short f35353dy;

    /* JADX INFO: renamed from: fa */
    public short f35354fa;

    /* JADX INFO: renamed from: h4 */
    public short f35355h4;

    /* JADX INFO: renamed from: jd */
    public short f35356jd;

    /* JADX INFO: renamed from: k4 */
    public long f35357k4;

    /* JADX INFO: renamed from: kk */
    public short f35358kk;

    /* JADX INFO: renamed from: ks */
    public short f35359ks;

    /* JADX INFO: renamed from: m9 */
    public short f35360m9;

    /* JADX INFO: renamed from: rv */
    public short f35361rv;

    /* JADX INFO: renamed from: to */
    public short f35362to;

    /* JADX INFO: renamed from: up */
    public short f35363up;

    /* JADX INFO: renamed from: x1 */
    public short f35364x1;

    /* JADX INFO: renamed from: x6 */
    public int f35365x6;

    /* JADX INFO: renamed from: yj */
    public short f35366yj;

    public C9783qq(C12564kk c12564kk) {
        long jM58604kk = c12564kk.m58604kk();
        this.f35357k4 = jM58604kk;
        if ((jM58604kk & 4294967295L) != 65536) {
            throw new NotSupportedException("Unsupported font head version.");
        }
        this.f35364x1 = c12564kk.m58605to();
        this.f35358kk = c12564kk.m58605to();
        this.f35362to = c12564kk.m58605to();
        this.f35352du = c12564kk.m58600du();
        this.f35355h4 = c12564kk.m58605to();
        this.f35360m9 = c12564kk.m58605to();
        this.f35353dy = c12564kk.m58605to();
        this.f35350c5 = c12564kk.m58605to();
        this.f35356jd = c12564kk.m58605to();
        this.f35351ck = c12564kk.m58605to();
        this.f35354fa = c12564kk.m58605to();
        this.f35363up = c12564kk.m58605to();
        this.f35366yj = c12564kk.m58605to();
        this.f35359ks = c12564kk.m58605to();
        this.f35361rv = c12564kk.m58605to();
        this.f35365x6 = c12564kk.m58600du();
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9768f9
    /* JADX INFO: renamed from: k4 */
    public void mo48051k4(C12570to c12570to) {
        c12570to.m58669k4(this.f35357k4);
        c12570to.m58671x1(this.f35364x1);
        c12570to.m58671x1(this.f35358kk);
        c12570to.m58671x1(this.f35362to);
        c12570to.m58671x1(this.f35352du & 65535);
        c12570to.m58671x1(this.f35355h4);
        c12570to.m58671x1(this.f35360m9);
        c12570to.m58671x1(this.f35353dy);
        c12570to.m58671x1(this.f35350c5);
        c12570to.m58671x1(this.f35356jd);
        c12570to.m58671x1(this.f35351ck);
        c12570to.m58671x1(this.f35354fa);
        c12570to.m58671x1(this.f35363up);
        c12570to.m58671x1(this.f35366yj);
        c12570to.m58671x1(this.f35359ks);
        c12570to.m58671x1(this.f35361rv);
        c12570to.m58671x1(this.f35365x6 & 65535);
    }
}
