package com.aspose.slides.internal.p251li;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.lr */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6068lr extends AbstractC6084u4 {

    /* JADX INFO: renamed from: k4 */
    private int f17192k4;

    public AbstractC6068lr() {
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m24576k4((AbstractC6068lr) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m24574fa() {
        return m24433h4(15);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return (super.hashCode() * 397) ^ this.f17192k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24575k4(boolean z) {
        m24436k4(15, z);
    }

    /* JADX INFO: renamed from: to */
    public final void m24577to(int i) {
        this.f17192k4 = i;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, BrushId: {1}", super.toString(), Integer.valueOf(this.f17192k4));
    }

    /* JADX INFO: renamed from: up */
    public final int m24578up() {
        return this.f17192k4;
    }

    public AbstractC6068lr(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24576k4(AbstractC6068lr abstractC6068lr) {
        return m24438k4((C6045bz) abstractC6068lr) && this.f17192k4 == abstractC6068lr.f17192k4;
    }
}
