package com.aspose.slides;

import com.aspose.slides.internal.p332p7.AbstractC7414ck;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class xxx extends AbstractC14463so {

    /* JADX INFO: renamed from: k4 */
    private final SlideShowTransition f50229k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC7414ck f50230kk;

    /* JADX INFO: renamed from: x1 */
    private String f50231x1;

    public xxx(SlideShowTransition slideShowTransition) {
        this.f50229k4 = slideShowTransition;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m73637k4() {
        return this.f50231x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m73641kk() {
        this.f50230kk = null;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC7414ck m73642x1() {
        return this.f50230kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73638k4(AbstractC7414ck abstractC7414ck) {
        this.f50230kk = abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73639k4(String str) {
        this.f50231x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m73640k4(xxx xxxVar) {
        AbstractC7414ck abstractC7414ck;
        if (xxxVar == null) {
            return false;
        }
        return !((this.f50230kk == null) ^ (xxxVar.f50230kk == null)) && C14113y2.m67363du(this.f50231x1, xxxVar.f50231x1) && ((abstractC7414ck = this.f50230kk) == null || AbstractC14092to.m67208k4((Object) abstractC7414ck.mo29643k4()).equals(AbstractC14092to.m67208k4((Object) xxxVar.f50230kk.mo29643k4())));
    }
}
