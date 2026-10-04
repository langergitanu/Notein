package com.aspose.slides.internal.p229ki;

import com.aspose.slides.p559ms.System.AbstractC14092to;
import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.wz */
/* JADX INFO: loaded from: classes.dex */
public final class C5755wz implements Comparator<C5694em> {

    /* JADX INFO: renamed from: k4 */
    private AbstractC5728qw[] f15803k4;

    /* JADX INFO: renamed from: kk */
    private int f15804kk;

    /* JADX INFO: renamed from: x1 */
    private Comparator[] f15805x1;

    public C5755wz() {
        this(3);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int compare(C5694em c5694em, C5694em c5694em2) {
        for (int i = 0; i < c5694em.m23233k4(); i++) {
            int iCompare = this.f15805x1[i].compare(c5694em.m23234k4(i), c5694em2.m23234k4(i));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return c5694em.m23237x1() - c5694em2.m23237x1();
    }

    public C5755wz(int i) {
        i = i <= 0 ? 3 : i;
        this.f15803k4 = new AbstractC5728qw[i];
        this.f15805x1 = new Comparator[i];
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC5728qw m23357k4(int i) {
        return this.f15803k4[i];
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23358k4(AbstractC5728qw abstractC5728qw, Comparator comparator) {
        int i = this.f15804kk;
        if (i == this.f15803k4.length) {
            AbstractC5728qw[] abstractC5728qwArr = new AbstractC5728qw[i * 2];
            Comparator[] comparatorArr = new Comparator[i * 2];
            for (int i2 = 0; i2 < this.f15804kk; i2++) {
                abstractC5728qwArr[i2] = this.f15803k4[i2];
                comparatorArr[i2] = this.f15805x1[i2];
            }
            this.f15803k4 = abstractC5728qwArr;
            this.f15805x1 = comparatorArr;
        }
        if (abstractC5728qw.mo23141h4() == 3 || abstractC5728qw.mo23141h4() == 5) {
            abstractC5728qw = new C5771zj(7, AbstractC14092to.m67204k4((Object[]) new AbstractC5728qw[]{abstractC5728qw}));
        }
        AbstractC5728qw[] abstractC5728qwArr2 = this.f15803k4;
        int i3 = this.f15804kk;
        abstractC5728qwArr2[i3] = abstractC5728qw;
        this.f15805x1[i3] = comparator;
        this.f15804kk = i3 + 1;
    }
}
