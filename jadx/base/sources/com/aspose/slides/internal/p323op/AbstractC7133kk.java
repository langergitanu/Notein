package com.aspose.slides.internal.p323op;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.op.kk */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7133kk {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC7133kk f19246k4;

    public AbstractC7133kk() {
        this.f19246k4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    private void m27681k4(AbstractC7133kk abstractC7133kk, C6765kp c6765kp) {
        AbstractC7133kk abstractC7133kk2 = abstractC7133kk.f19246k4;
        if (abstractC7133kk2 != null) {
            m27681k4(abstractC7133kk2, c6765kp);
        }
        c6765kp.m26791k4(abstractC7133kk).m26792k4(" :: ");
    }

    public boolean equals(Object obj) {
        AbstractC7133kk abstractC7133kk;
        if (obj == null || (abstractC7133kk = (AbstractC7133kk) C7019kk.m27452k4(obj, AbstractC7133kk.class)) == null) {
            return false;
        }
        AbstractC7133kk abstractC7133kk2 = this.f19246k4;
        if (abstractC7133kk2 == null && abstractC7133kk.f19246k4 == null) {
            return true;
        }
        boolean z = abstractC7133kk2 == null;
        AbstractC7133kk abstractC7133kk3 = abstractC7133kk.f19246k4;
        if ((abstractC7133kk3 == null) || z) {
            return false;
        }
        return abstractC7133kk2.equals(abstractC7133kk3);
    }

    public int hashCode() {
        if (this.f19246k4 == null) {
            return 0;
        }
        return r0.hashCode() - 324743029;
    }

    public String toString() {
        if (this.f19246k4 == null) {
            return "";
        }
        C6765kp c6765kp = new C6765kp();
        m27681k4(this.f19246k4, c6765kp);
        return c6765kp.toString();
    }

    public AbstractC7133kk(AbstractC7133kk abstractC7133kk) {
        this.f19246k4 = abstractC7133kk;
    }
}
