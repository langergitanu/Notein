package com.aspose.slides.internal.p505xn;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: com.aspose.slides.internal.xn.ix */
/* JADX INFO: loaded from: classes5.dex */
public class C12561ix implements Cloneable {

    /* JADX INFO: renamed from: kk */
    private int f42071kk;

    /* JADX INFO: renamed from: k4 */
    private int[] f42070k4 = new int[16];

    /* JADX INFO: renamed from: x1 */
    private Object[] f42072x1 = new Object[16];

    /* JADX INFO: renamed from: m9 */
    private void m58579m9(int i) {
        int[] iArr = this.f42070k4;
        int length = iArr.length == 0 ? 16 : iArr.length * 2;
        if (length >= i) {
            i = length;
        }
        m58584k4(i);
    }

    /* JADX INFO: renamed from: du */
    public final Object m58580du(int i) {
        int iM58581h4 = m58581h4(i);
        if (iM58581h4 >= 0) {
            return this.f42072x1[iM58581h4];
        }
        return null;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m58581h4(int i) {
        int iM58596k4 = C12563k4.m58596k4(this.f42070k4, 0, this.f42071kk, i);
        if (iM58596k4 >= 0) {
            return iM58596k4;
        }
        return -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m58582k4() {
        return this.f42071kk;
    }

    /* JADX INFO: renamed from: kk */
    public final Object m58586kk(int i) {
        if (i < 0 || i >= this.f42071kk) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        return this.f42072x1[i];
    }

    /* JADX INFO: renamed from: to */
    public final int m58587to(int i) {
        if (i < 0 || i >= this.f42071kk) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        return this.f42070k4[i];
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58588x1(int i, Object obj) {
        int iM58596k4 = C12563k4.m58596k4(this.f42070k4, 0, this.f42071kk, i);
        if (iM58596k4 >= 0) {
            this.f42072x1[iM58596k4] = obj;
        } else {
            m58578k4(~iM58596k4, i, obj);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m58583k4(Object obj) {
        return AbstractC14092to.m67202k4(this.f42072x1, obj, 0, this.f42071kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m58589x1(int i) {
        return m58581h4(i) >= 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58584k4(int i) {
        int[] iArr = this.f42070k4;
        if (i != iArr.length) {
            int i2 = this.f42071kk;
            if (i < i2) {
                throw new ArgumentOutOfRangeException("value");
            }
            if (i <= 0) {
                this.f42070k4 = new int[16];
                this.f42072x1 = new Object[16];
                return;
            }
            int[] iArr2 = new int[i];
            Object[] objArr = new Object[i];
            if (i2 > 0) {
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) iArr), 0, AbstractC14092to.m67208k4((Object) iArr2), 0, this.f42071kk);
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f42072x1), 0, AbstractC14092to.m67208k4((Object) objArr), 0, this.f42071kk);
            }
            this.f42070k4 = iArr2;
            this.f42072x1 = objArr;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m58578k4(int i, int i2, Object obj) {
        int i3 = this.f42071kk;
        if (i3 == this.f42070k4.length) {
            m58579m9(i3 + 1);
        }
        if (i < this.f42071kk) {
            int i4 = i + 1;
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f42070k4), i, AbstractC14092to.m67208k4((Object) this.f42070k4), i4, this.f42071kk - i);
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f42072x1), i, AbstractC14092to.m67208k4((Object) this.f42072x1), i4, this.f42071kk - i);
        }
        this.f42070k4[i] = i2;
        this.f42072x1[i] = obj;
        this.f42071kk++;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58585k4(int i, Object obj) {
        int iM58596k4 = C12563k4.m58596k4(this.f42070k4, 0, this.f42071kk, i);
        if (iM58596k4 >= 0) {
            throw new ArgumentException("duplicate");
        }
        m58578k4(~iM58596k4, i, obj);
    }
}
