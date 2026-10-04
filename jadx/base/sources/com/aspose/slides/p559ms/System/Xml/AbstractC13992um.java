package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.um */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13992um extends AbstractC10929m9 {

    /* JADX INFO: renamed from: k4 */
    private C13945ne f47026k4;

    /* JADX INFO: renamed from: to */
    private int f47027to;

    /* JADX INFO: renamed from: x1 */
    private int f47028x1;

    public AbstractC13992um(C13945ne c13945ne) {
        this.f47026k4 = (C13945ne) c13945ne.deepClone();
        this.f47028x1 = 0;
        this.f47027to = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m66271k4(int i) {
        this.f47027to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo65156k4(AbstractC13901ga abstractC13901ga);

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: kk */
    public AbstractC10925du mo21834kk() {
        return this.f47026k4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: to */
    public int mo21835to() {
        return this.f47027to;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: x1 */
    public boolean mo21770x1() {
        while (true) {
            if (this.f47026k4.mo21878x6()) {
                this.f47028x1++;
            } else {
                if (this.f47028x1 == 0) {
                    return false;
                }
                while (!this.f47026k4.mo21865rv()) {
                    int i = this.f47028x1 - 1;
                    this.f47028x1 = i;
                    if (i == 0 || !this.f47026k4.mo21864ne()) {
                        return false;
                    }
                }
            }
            AbstractC13901ga abstractC13901ga = (AbstractC13901ga) this.f47026k4.mo21844fa();
            if (abstractC13901ga.getNodeType() == 1 && mo65156k4(abstractC13901ga)) {
                this.f47027to++;
                return true;
            }
        }
    }

    public AbstractC13992um(AbstractC13992um abstractC13992um) {
        this.f47026k4 = (C13945ne) abstractC13992um.f47026k4.deepClone();
        this.f47028x1 = abstractC13992um.f47028x1;
        this.f47027to = abstractC13992um.f47027to;
    }
}
