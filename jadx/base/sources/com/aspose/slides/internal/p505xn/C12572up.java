package com.aspose.slides.internal.p505xn;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: com.aspose.slides.internal.xn.up */
/* JADX INFO: loaded from: classes5.dex */
public class C12572up {

    /* JADX INFO: renamed from: k4 */
    private int[] f42088k4 = new int[16];

    /* JADX INFO: renamed from: x1 */
    private int f42089x1;

    /* JADX INFO: renamed from: to */
    private void m58672to(int i) {
        int[] iArr = this.f42088k4;
        if (iArr.length < i) {
            int length = iArr.length == 0 ? 16 : iArr.length * 2;
            if (length >= i) {
                i = length;
            }
            m58674k4(i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public int m58673k4() {
        return this.f42089x1;
    }

    /* JADX INFO: renamed from: kk */
    public int m58675kk(int i) {
        int i2 = this.f42089x1;
        if (i2 == this.f42088k4.length) {
            m58672to(i2 + 1);
        }
        int[] iArr = this.f42088k4;
        int i3 = this.f42089x1;
        iArr[i3] = i;
        this.f42089x1 = i3 + 1;
        return i3;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (int i = 0; i < m58673k4(); i++) {
            c6765kp.m26805kk(m58676x1(i));
            if (i < m58673k4() - 1) {
                c6765kp.m26792k4(" ");
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public int m58676x1(int i) {
        if (i < 0 || i >= this.f42089x1) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        return this.f42088k4[i];
    }

    /* JADX INFO: renamed from: k4 */
    public void m58674k4(int i) {
        int[] iArr = this.f42088k4;
        if (i != iArr.length) {
            int i2 = this.f42089x1;
            if (i < i2) {
                throw new ArgumentOutOfRangeException("value");
            }
            if (i <= 0) {
                this.f42088k4 = new int[16];
                return;
            }
            int[] iArr2 = new int[i];
            if (i2 > 0) {
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) iArr), 0, AbstractC14092to.m67208k4((Object) iArr2), 0, this.f42089x1);
            }
            this.f42088k4 = iArr2;
        }
    }
}
