package com.aspose.slides.internal.p184ik;

import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ik.du */
/* JADX INFO: loaded from: classes.dex */
public class C5091du extends AbstractC5096k4 {

    /* JADX INFO: renamed from: to */
    private int f13993to;

    public C5091du(C5091du c5091du) {
        super(c5091du);
        this.f13993to = c5091du.f13993to;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5091du(this);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: x1 */
    public boolean mo21770x1() {
        if (this.f14023x1 == 0) {
            if (!this.f14022k4.mo21868to(this.f13993to)) {
                return false;
            }
        } else if (!this.f14022k4.mo21842du(this.f13993to)) {
            return false;
        }
        this.f14023x1++;
        return true;
    }

    public C5091du(C5098m9 c5098m9, int i) {
        super(c5098m9);
        this.f13993to = i;
    }
}
