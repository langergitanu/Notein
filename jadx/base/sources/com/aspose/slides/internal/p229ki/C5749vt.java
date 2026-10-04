package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.vt */
/* JADX INFO: loaded from: classes.dex */
public final class C5749vt extends AbstractC5750vw {

    /* JADX INFO: renamed from: m9 */
    private int f15799m9;

    public C5749vt(AbstractC5728qw abstractC5728qw, boolean z, String str, String str2, int i, boolean z2) {
        super(abstractC5728qw, str, str2, i, z, z2);
        this.f15799m9 = 0;
    }

    /* JADX INFO: renamed from: rv */
    private boolean m23353rv() {
        if (!this.f15832x1.mo21878x6()) {
            return false;
        }
        this.f15799m9++;
        return true;
    }

    /* JADX INFO: renamed from: x6 */
    private boolean m23354x6() {
        while (!this.f15832x1.mo21865rv()) {
            int i = this.f15799m9 - 1;
            this.f15799m9 = i;
            if (i == 0) {
                return false;
            }
            this.f15832x1.mo21864ne();
        }
        return true;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f15799m9 = 0;
        super.mo23138c5();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5749vt(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: m9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC10925du mo23142m9() {
        loop0: while (true) {
            if (this.f15799m9 != 0) {
                if (m23354x6()) {
                    while (!mo23355x1(this.f15832x1)) {
                    }
                    this.f15831to++;
                    break loop0;
                }
                continue;
            } else {
                AbstractC10925du abstractC10925duMo23142m9 = this.f15829k4.mo23142m9();
                this.f15832x1 = abstractC10925duMo23142m9;
                this.f15831to = 0;
                if (abstractC10925duMo23142m9 != null) {
                    if (!((AbstractC5750vw) this).f15800du || !mo23355x1(abstractC10925duMo23142m9)) {
                        this.f15832x1 = this.f15832x1.deepClone();
                        if (m23353rv()) {
                            while (!mo23355x1(this.f15832x1)) {
                                if (!m23353rv()) {
                                    break;
                                }
                            }
                            this.f15831to++;
                            break loop0;
                        }
                        continue;
                    } else {
                        this.f15831to = 1;
                        break;
                    }
                } else {
                    return null;
                }
            }
        }
        return this.f15832x1;
    }

    private C5749vt(C5749vt c5749vt) {
        super(c5749vt);
        this.f15799m9 = 0;
        this.f15799m9 = c5749vt.f15799m9;
    }
}
