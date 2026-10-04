package com.aspose.slides.internal.p106ef;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p135fp.C4090du;
import com.aspose.slides.internal.p135fp.C4095jd;
import com.aspose.slides.internal.p135fp.C4103to;
import com.aspose.slides.internal.p135fp.C4106up;
import com.aspose.slides.internal.p135fp.C4111x6;
import com.aspose.slides.internal.p225ke.C5663h4;
import com.aspose.slides.internal.p225ke.C5667to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ef.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C3681x1 extends AbstractC3680to {

    /* JADX INFO: renamed from: dy */
    private final C4090du[] f10225dy;

    /* JADX INFO: renamed from: m9 */
    private final C4090du[] f10226m9;

    public C3681x1(C4106up c4106up) {
        super(c4106up);
        this.f10222kk = c4106up;
        this.f10225dy = new C4090du[10];
        this.f10226m9 = new C4090du[10];
        this.f10223to = c4106up.m16424up();
        this.f10219du = new C3677k4();
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3680to
    /* JADX INFO: renamed from: k4 */
    public void mo14887k4() {
        for (int i = 0; i < this.f10222kk.m16408h4().m16440h4(); i++) {
            C4095jd c4095jd = this.f10222kk.m16422to().m16362x1()[m14917x1().m16408h4().m16445kk()[i]];
            Dictionary.ValueCollection.Enumerator<Integer, C4090du> it = this.f10222kk.m16410k4().getValues().iterator();
            while (it.hasNext()) {
                C4090du next = it.next();
                if ((next.m16278jd() & 255) == 1) {
                    if ((next.m16284x1() & 255) == (c4095jd.m16321k4() & 255)) {
                        this.f10226m9[i] = next;
                    }
                } else if ((next.m16284x1() & 255) == (c4095jd.m16332x1() & 255)) {
                    this.f10225dy[i] = next;
                }
            }
        }
        this.f10219du = new C3677k4();
        this.f10223to = this.f10222kk.m16424up();
        this.f10221k4.m16307x1();
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3680to
    /* JADX INFO: renamed from: k4 */
    public boolean mo14888k4(C4111x6 c4111x6) {
        int i;
        C4103to[] c4103toArrM16451k4 = c4111x6.m16451k4();
        if (this.f10222kk.m16424up() != 0 && this.f10223to == 0) {
            mo14890to();
        }
        if (!this.f10220h4) {
            for (int i2 = 0; i2 < this.f10222kk.m16408h4().m16440h4(); i2++) {
                c4103toArrM16451k4[i2] = new C4103to();
                int[] iArr = {0};
                C3677k4[] c3677k4Arr = {this.f10219du};
                boolean zM14914k4 = m14914k4(this.f10225dy[i2], iArr, c3677k4Arr);
                int iM14908k4 = iArr[0];
                c3677k4Arr[0].CloneTo(this.f10219du);
                if (!zM14914k4) {
                    return false;
                }
                if (iM14908k4 != 0) {
                    c3677k4Arr[0] = this.f10219du;
                    boolean zM14913k4 = m14913k4(iM14908k4, c3677k4Arr);
                    c3677k4Arr[0].CloneTo(this.f10219du);
                    if (!zM14913k4) {
                        return false;
                    }
                    c3677k4Arr[0] = this.f10219du;
                    int iM14911x1 = AbstractC3680to.m14911x1(iM14908k4, c3677k4Arr);
                    c3677k4Arr[0].CloneTo(this.f10219du);
                    iM14908k4 = AbstractC3680to.m14908k4(iM14911x1, iM14908k4);
                }
                int iM14908k42 = iM14908k4 + this.f10224x1[this.f10222kk.m16408h4().m16445kk()[i2]];
                this.f10224x1[this.f10222kk.m16408h4().m16445kk()[i2]] = iM14908k42;
                c4103toArrM16451k4[i2].m16394k4()[0] = (short) iM14908k42;
                int i3 = 1;
                while (i3 < C5667to.f15654k4) {
                    iArr[0] = iM14908k42;
                    c3677k4Arr[0] = this.f10219du;
                    boolean zM14914k42 = m14914k4(this.f10226m9[i2], iArr, c3677k4Arr);
                    int i4 = iArr[0];
                    c3677k4Arr[0].CloneTo(this.f10219du);
                    if (!zM14914k42) {
                        return false;
                    }
                    int i5 = i4 >> 4;
                    int i6 = i4 & 15;
                    if (i6 != 0) {
                        i = i3 + i5;
                        c3677k4Arr[0] = this.f10219du;
                        boolean zM14913k42 = m14913k4(i6, c3677k4Arr);
                        c3677k4Arr[0].CloneTo(this.f10219du);
                        if (!zM14913k42) {
                            return false;
                        }
                        c3677k4Arr[0] = this.f10219du;
                        int iM14911x12 = AbstractC3680to.m14911x1(i6, c3677k4Arr);
                        c3677k4Arr[0].CloneTo(this.f10219du);
                        iM14908k42 = AbstractC3680to.m14908k4(iM14911x12, i6);
                        c4103toArrM16451k4[i2].m16394k4()[C5663h4.f15647k4[i]] = (short) iM14908k42;
                    } else {
                        if (i5 != 15) {
                            break;
                        }
                        i = i3 + 15;
                        iM14908k42 = i6;
                    }
                    i3 = i + 1;
                }
            }
        }
        c4111x6.m16450k4(c4103toArrM16451k4);
        this.f10223to--;
        return true;
    }
}
