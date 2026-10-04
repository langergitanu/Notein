package com.aspose.slides.internal.p022ai;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArithmeticException;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ai.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1375h4 implements Cloneable {

    /* JADX INFO: renamed from: k4 */
    public static final C1375h4 f5962k4 = m8145k4(0);

    /* JADX INFO: renamed from: kk */
    public int f5963kk;

    /* JADX INFO: renamed from: to */
    public int f5964to;

    /* JADX INFO: renamed from: x1 */
    public int f5965x1;

    private C1375h4(int i, int i2, int i3) {
        this.f5965x1 = i;
        this.f5963kk = i2;
        this.f5964to = i3;
    }

    /* JADX INFO: renamed from: c5 */
    public Object m8148c5() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final Object clone() {
        return m8148c5();
    }

    /* JADX INFO: renamed from: du */
    public final int m8149du() {
        return this.f5964to - this.f5963kk;
    }

    /* JADX INFO: renamed from: dy */
    public final C1375h4 m8151dy(int i) {
        if (this.f5963kk >= i) {
            return this;
        }
        int i2 = this.f5964to;
        if (i2 <= i) {
            i2 = i;
        }
        return m8146k4(this.f5965x1, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14067j2.m66727k4(this) == C14067j2.m66727k4(obj)) {
            C1375h4 c1375h4 = (C1375h4) obj;
            if (this.f5963kk == c1375h4.f5963kk && this.f5964to == c1375h4.f5964to && this.f5965x1 == c1375h4.f5965x1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    public final C1375h4 m8153h4(int i) {
        if (this.f5965x1 >= i) {
            return this;
        }
        int iM67483k4 = C14116yg.m67483k4(i, this.f5963kk);
        return m8146k4(i, iM67483k4, C14116yg.m67483k4(iM67483k4, this.f5964to));
    }

    public int hashCode() {
        return (((this.f5965x1 * 31) + this.f5963kk) * 31) + this.f5964to;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m8155k4() {
        return this.f5965x1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m8157kk() {
        return this.f5964to;
    }

    /* JADX INFO: renamed from: m9 */
    public final C1375h4 m8159m9(int i) {
        int i2 = this.f5964to;
        if (i2 >= i) {
            return this;
        }
        int i3 = this.f5963kk;
        if (i2 == i3) {
            i3 = i;
        }
        return m8146k4(this.f5965x1, i3, i);
    }

    /* JADX INFO: renamed from: to */
    public final int m8161to() {
        return this.f5963kk - this.f5965x1;
    }

    public String toString() {
        return C14113y2.m67408k4("MinOptMax[min = ", C14057f9.m66591x1(this.f5965x1), ", opt = ", C14057f9.m66591x1(this.f5963kk), ", max = ", C14057f9.m66591x1(this.f5964to), "]");
    }

    /* JADX INFO: renamed from: x1 */
    public final int m8163x1() {
        return this.f5963kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static C1375h4 m8145k4(int i) {
        return new C1375h4(i, i, i);
    }

    /* JADX INFO: renamed from: du */
    public final C1375h4 m8150du(int i) {
        if (i >= 0) {
            return i == 1 ? this : m8146k4(this.f5965x1 * i, this.f5963kk * i, this.f5964to * i);
        }
        throw new ArgumentException(C14113y2.m67408k4("factor < 0; was: ", C14057f9.m66591x1(i)));
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m8152dy() {
        int i = this.f5965x1;
        int i2 = this.f5963kk;
        return (i == i2 && i2 == this.f5964to) ? false : true;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m8154h4() {
        return (this.f5965x1 == 0 && this.f5964to == 0) ? false : true;
    }

    /* JADX INFO: renamed from: kk */
    public final C1375h4 m8158kk(int i) {
        return m8146k4(this.f5965x1 - i, this.f5963kk, this.f5964to);
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m8160m9() {
        return this.f5965x1 == this.f5964to;
    }

    /* JADX INFO: renamed from: to */
    public final C1375h4 m8162to(int i) {
        return m8146k4(this.f5965x1, this.f5963kk, this.f5964to + i);
    }

    /* JADX INFO: renamed from: x1 */
    public final C1375h4 m8164x1(int i) {
        return new C1375h4(this.f5965x1 + i, this.f5963kk + i, this.f5964to + i);
    }

    /* JADX INFO: renamed from: k4 */
    public static C1375h4 m8146k4(int i, int i2, int i3) {
        if (i > i2) {
            throw new ArgumentException(C14113y2.m67408k4("min (", C14057f9.m66591x1(i), ") > opt (", C14057f9.m66591x1(i2), ")"));
        }
        if (i3 >= i2) {
            return new C1375h4(i, i2, i3);
        }
        throw new ArgumentException(C14113y2.m67408k4("max (", C14057f9.m66591x1(i3), ") < opt (", C14057f9.m66591x1(i2), ")"));
    }

    /* JADX INFO: renamed from: x1 */
    public final C1375h4 m8165x1(C1375h4 c1375h4) {
        m8147k4(m8161to(), c1375h4.m8161to(), "shrink");
        m8147k4(m8149du(), c1375h4.m8149du(), "stretch");
        return new C1375h4(this.f5965x1 - c1375h4.f5965x1, this.f5963kk - c1375h4.f5963kk, this.f5964to - c1375h4.f5964to);
    }

    /* JADX INFO: renamed from: k4 */
    public final C1375h4 m8156k4(C1375h4 c1375h4) {
        return new C1375h4(this.f5965x1 + c1375h4.f5965x1, this.f5963kk + c1375h4.f5963kk, this.f5964to + c1375h4.f5964to);
    }

    /* JADX INFO: renamed from: k4 */
    private void m8147k4(int i, int i2, String str) {
        if (i < i2) {
            throw new ArithmeticException(C14113y2.m67408k4("Cannot subtract a MinOptMax from another MinOptMax that has less ", str, " (", C14057f9.m66591x1(i), " < ", C14057f9.m66591x1(i2), ")"));
        }
    }
}
