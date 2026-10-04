package com.aspose.slides.internal.p297ne;

import com.aspose.slides.internal.p237ks.AbstractC5902du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p453uz.C11579jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p478wl.C12147ne;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.ne.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6877kk extends C6874h4 {

    /* JADX INFO: renamed from: k4 */
    private int f18823k4;

    public C6877kk(AbstractC5902du abstractC5902du, int i) {
        super(abstractC5902du);
        this.f18823k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12003du m26917k4() {
        int i;
        int i2 = this.f18823k4;
        if (i2 == 0) {
            i = 48;
        } else if (i2 == 1) {
            i = 53;
        } else if (i2 == 2) {
            i = 59;
        } else {
            if (i2 != 3) {
                return C12003du.m56460uz();
            }
            i = 34;
        }
        return m26906x1(i);
    }

    /* JADX INFO: renamed from: kk */
    public final int m26918kk() {
        AbstractC14068j5 abstractC14068j5M27443k4;
        int i;
        int i2 = this.f18823k4;
        if (i2 == 0) {
            abstractC14068j5M27443k4 = C7019kk.m27443k4((Class<?>) C12147ne.class);
            i = 49;
        } else if (i2 == 1) {
            abstractC14068j5M27443k4 = C7019kk.m27443k4((Class<?>) C12147ne.class);
            i = 54;
        } else if (i2 == 2) {
            abstractC14068j5M27443k4 = C7019kk.m27443k4((Class<?>) C12147ne.class);
            i = 62;
        } else {
            if (i2 != 3) {
                return 0;
            }
            abstractC14068j5M27443k4 = C7019kk.m27443k4((Class<?>) C12147ne.class);
            i = 37;
        }
        return m26903k4(abstractC14068j5M27443k4, i);
    }

    /* JADX INFO: renamed from: x1 */
    public final C11579jd m26919x1() {
        int i = this.f18823k4;
        if (i == 0) {
            return new C11579jd(m26904k4(50));
        }
        if (i == 1) {
            return new C11579jd(m26904k4(55));
        }
        if (i == 2) {
            return new C11579jd(m26904k4(63));
        }
        if (i != 3) {
            return null;
        }
        return new C11579jd(m26904k4(38));
    }
}
