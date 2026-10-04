package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class xmh extends AbstractC7020m9<xmh> {

    /* JADX INFO: renamed from: k4 */
    public static final xmh f50156k4 = new xmh(0.0d);

    /* JADX INFO: renamed from: du */
    public double f50157du;

    /* JADX INFO: renamed from: kk */
    public double f50158kk;

    /* JADX INFO: renamed from: to */
    public double f50159to;

    /* JADX INFO: renamed from: x1 */
    public double f50160x1;

    public xmh() {
    }

    /* JADX INFO: renamed from: kk */
    private boolean m73496kk(xmh xmhVar) {
        return xmhVar.f50160x1 == this.f50160x1 && xmhVar.f50158kk == this.f50158kk && xmhVar.f50159to == this.f50159to && xmhVar.f50157du == this.f50157du;
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof xmh) {
            return m73496kk((xmh) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Double.valueOf(this.f50160x1), Double.valueOf(this.f50158kk), Double.valueOf(this.f50159to), Double.valueOf(this.f50157du));
    }

    /* JADX INFO: renamed from: k4 */
    public final pj5 m73499k4() {
        return new pj5((float) this.f50160x1, (float) this.f50158kk, (float) this.f50159to, (float) this.f50157du);
    }

    public String toString() {
        return C14113y2.m67402k4("{0} {1} {2} {3}", Double.valueOf(this.f50160x1), Double.valueOf(this.f50158kk), Double.valueOf(this.f50159to), Double.valueOf(this.f50157du));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public xmh Clone() {
        xmh xmhVar = new xmh();
        CloneTo(xmhVar);
        return xmhVar;
    }

    public xmh(double d) {
        this.f50160x1 = d;
        this.f50158kk = d;
        this.f50159to = d;
        this.f50157du = d;
    }

    /* JADX INFO: renamed from: x1 */
    public static xmh m73497x1(xmh xmhVar, double d) {
        return new xmh(xmhVar.f50160x1 / d, xmhVar.f50158kk / d, xmhVar.f50159to / d, xmhVar.f50157du / d);
    }

    /* JADX INFO: renamed from: k4 */
    public final xmh m73500k4(xmh xmhVar) {
        return new xmh(C14044b3.m66437kk(this.f50160x1) ? xmhVar.f50160x1 : this.f50160x1, C14044b3.m66437kk(this.f50158kk) ? xmhVar.f50158kk : this.f50158kk, C14044b3.m66437kk(this.f50159to) ? xmhVar.f50159to : this.f50159to, C14044b3.m66437kk(this.f50157du) ? xmhVar.f50157du : this.f50157du);
    }

    public xmh(double d, double d2, double d3, double d4) {
        this.f50160x1 = d;
        this.f50158kk = d2;
        this.f50159to = d3;
        this.f50157du = d4;
    }

    /* JADX INFO: renamed from: k4 */
    public static xmh m73494k4(xmh xmhVar, double d) {
        return new xmh(xmhVar.f50160x1 * d, xmhVar.f50158kk * d, xmhVar.f50159to * d, xmhVar.f50157du * d);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public void CloneTo(xmh xmhVar) {
        xmhVar.f50160x1 = this.f50160x1;
        xmhVar.f50158kk = this.f50158kk;
        xmhVar.f50159to = this.f50159to;
        xmhVar.f50157du = this.f50157du;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m73495k4(xmh xmhVar, xmh xmhVar2) {
        return xmhVar.f50160x1 == xmhVar2.f50160x1 && xmhVar.f50158kk == xmhVar2.f50158kk && xmhVar.f50159to == xmhVar2.f50159to && xmhVar.f50157du == xmhVar2.f50157du;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m73498x1(xmh xmhVar, xmh xmhVar2) {
        return !m73495k4(xmhVar, xmhVar2);
    }
}
