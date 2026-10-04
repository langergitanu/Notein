package com.aspose.slides.internal.p407st;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.cl */
/* JADX INFO: loaded from: classes4.dex */
public class C10390cl implements IGenericCloneable<C10390cl> {

    /* JADX INFO: renamed from: k4 */
    private boolean f36907k4;

    /* JADX INFO: renamed from: kk */
    private boolean f36908kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f36909x1;

    public C10390cl() {
        m50565k4(false);
        m50571x1(false);
        m50567kk(false);
    }

    /* JADX INFO: renamed from: du */
    public boolean m50561du() {
        return this.f36907k4;
    }

    /* JADX INFO: renamed from: k4 */
    public int m50562k4() {
        return 2;
    }

    /* JADX INFO: renamed from: kk */
    public void m50567kk(boolean z) {
        this.f36907k4 = z;
    }

    /* JADX INFO: renamed from: to */
    public boolean m50569to() {
        return this.f36909x1;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C10390cl cloneT() {
        return new C10390cl(m50568kk(), m50569to(), m50561du());
    }

    public C10390cl(C3134k4 c3134k4) {
        m50563k4(c3134k4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m50563k4(C3134k4 c3134k4) {
        short sM13381rv = c3134k4.m13381rv();
        m50565k4((sM13381rv & 1) != 0);
        m50571x1((sM13381rv & 2) != 0);
        m50567kk((sM13381rv & 4) != 0);
    }

    /* JADX INFO: renamed from: kk */
    public boolean m50568kk() {
        return this.f36908kk;
    }

    /* JADX INFO: renamed from: x1 */
    public void m50571x1(boolean z) {
        this.f36909x1 = z;
    }

    public C10390cl(boolean z, boolean z2, boolean z3) {
        m50565k4(z);
        m50571x1(z2);
        m50567kk(z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX INFO: renamed from: k4 */
    public void m50564k4(C3149x1 c3149x1) {
        boolean zM50568kk = m50568kk();
        ?? r0 = zM50568kk;
        if (m50569to()) {
            r0 = (zM50568kk ? 1 : 0) | 2;
        }
        int i = r0;
        if (m50561du()) {
            i = (r0 == true ? 1 : 0) | 4;
        }
        c3149x1.m13446k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m50565k4(boolean z) {
        this.f36908kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m50566k4(C10390cl c10390cl) {
        return m50568kk() == c10390cl.m50568kk() && m50569to() == c10390cl.m50569to() && m50561du() == c10390cl.m50561du();
    }
}
