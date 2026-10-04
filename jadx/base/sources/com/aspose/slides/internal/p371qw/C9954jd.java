package com.aspose.slides.internal.p371qw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p481wp.AbstractC12228lr;
import com.aspose.slides.internal.p481wp.C12219du;
import com.aspose.slides.internal.p513xw.C12717os;
import com.aspose.slides.internal.p513xw.InterfaceC12711lr;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: renamed from: com.aspose.slides.internal.qw.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C9954jd extends C12717os {

    /* JADX INFO: renamed from: k4 */
    public List<C9960x1> f35890k4;

    /* JADX INFO: renamed from: kk */
    private C12219du f35891kk;

    /* JADX INFO: renamed from: to */
    private C12219du f35892to;

    /* JADX INFO: renamed from: x1 */
    protected int f35893x1;

    public C9954jd(InterfaceC12711lr interfaceC12711lr, List<C9960x1> list, C12219du c12219du) {
        super(interfaceC12711lr);
        this.f35890k4 = list;
        this.f35891kk = c12219du;
        this.f35892to = c12219du;
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC12228lr m48967dy() {
        return this.f35890k4.get_Item(0).f35969k4.m57138up();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12219du m48968k4() {
        return this.f35892to;
    }

    /* JADX INFO: renamed from: m9 */
    public final C12219du m48971m9() {
        return this.f35891kk;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m48972to(int i) {
        return ((1 << i) & this.f35893x1) != 0;
    }

    @Override // com.aspose.slides.internal.p513xw.C12717os
    public String toString() {
        C6765kp c6765kp = new C6765kp("TableContentPosition:");
        c6765kp.m26805kk(m59073du());
        c6765kp.m26792k4("[");
        c6765kp.m26805kk(this.f35891kk.m57019k4()).m26792k4("/");
        boolean zM48972to = m48972to(1);
        String str = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        c6765kp.m26792k4(zM48972to ? "F" : CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
        if (m48972to(2)) {
            str = "L";
        }
        c6765kp.m26792k4(str).m26792k4("]");
        c6765kp.m26792k4("(");
        c6765kp.m26791k4(this.f35890k4);
        c6765kp.m26792k4(")");
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.internal.p513xw.C12717os
    /* JADX INFO: renamed from: w_ */
    public boolean mo48915w_() {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48969k4(int i, boolean z) {
        int i2;
        if (z) {
            i2 = (1 << i) | this.f35893x1;
        } else {
            i2 = (~(1 << i)) & this.f35893x1;
        }
        this.f35893x1 = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48970k4(C12219du c12219du) {
        this.f35892to = c12219du;
    }
}
