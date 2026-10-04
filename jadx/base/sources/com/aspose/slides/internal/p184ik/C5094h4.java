package com.aspose.slides.internal.p184ik;

import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ik.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C5094h4 extends AbstractC5096k4 {

    /* JADX INFO: renamed from: du */
    private int f14005du;

    /* JADX INFO: renamed from: h4 */
    private boolean f14006h4;

    /* JADX INFO: renamed from: to */
    private C5098m9 f14007to;

    public C5094h4(C5094h4 c5094h4) {
        super(c5094h4);
        this.f14007to = c5094h4.f14007to;
        this.f14005du = c5094h4.f14005du;
        this.f14006h4 = c5094h4.f14006h4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5094h4(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo21770x1() {
        if (this.f14006h4) {
            this.f14006h4 = false;
            if (!this.f14022k4.m21850jd(this.f14005du)) {
                if (!this.f14022k4.mo21854k4(this.f14005du, this.f14007to)) {
                    return false;
                }
            }
        }
        this.f14023x1++;
        return true;
    }

    public C5094h4(C5098m9 c5098m9, int i, boolean z) {
        super(c5098m9);
        this.f14005du = i;
        this.f14006h4 = z;
        if (c5098m9.mo21857kk() != 0) {
            C5098m9 c5098m92 = new C5098m9(c5098m9);
            this.f14007to = c5098m92;
            c5098m92.m52697um();
        }
    }
}
