package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p060ca.C1996ae;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.po */
/* JADX INFO: loaded from: classes3.dex */
public class C2248po extends C2377xv {

    /* JADX INFO: renamed from: k4 */
    private C1996ae f7741k4;

    /* JADX INFO: renamed from: kk */
    private Dictionary<Integer, AbstractC2011be> f7742kk;

    /* JADX INFO: renamed from: to */
    private Dictionary<Integer, C1996ae.x1> f7743to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC2011be f7744x1;

    public C2248po(C1996ae c1996ae, C2132iq c2132iq, C2092fz c2092fz) {
        super(null, c2132iq, c2092fz);
        this.f7743to = null;
        this.f7741k4 = c1996ae;
        this.f7744x1 = new C2350wl(((C1996ae.du) c1996ae.m10136h4()).m10139k4());
        this.f7742kk = new Dictionary<>(c1996ae.m10138to().size());
        this.f7743to = c1996ae.m10138to();
    }

    @Override // com.aspose.slides.internal.p060ca.C2377xv
    /* JADX INFO: renamed from: k4 */
    public AbstractC2011be mo11248k4() {
        return this.f7744x1;
    }

    @Override // com.aspose.slides.internal.p060ca.C2377xv
    /* JADX INFO: renamed from: k4 */
    public AbstractC2011be mo11249k4(int i) {
        AbstractC2011be[] abstractC2011beArr = {null};
        boolean zTryGetValue = this.f7742kk.tryGetValue(Integer.valueOf(i), abstractC2011beArr);
        AbstractC2011be abstractC2011be = abstractC2011beArr[0];
        if (zTryGetValue) {
            return abstractC2011be;
        }
        if (!this.f7743to.containsKey(Integer.valueOf(i))) {
            return null;
        }
        C2350wl c2350wl = new C2350wl(((C1996ae.h4) this.f7743to.get_Item(Integer.valueOf(i))).m10149h4());
        this.f7742kk.set_Item(Integer.valueOf(i), c2350wl);
        return c2350wl;
    }
}
