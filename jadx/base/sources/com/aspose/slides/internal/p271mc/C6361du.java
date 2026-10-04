package com.aspose.slides.internal.p271mc;

import OooOO0.OooO0OO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.mc.du */
/* JADX INFO: loaded from: classes4.dex */
public final class C6361du {

    /* JADX INFO: renamed from: k4 */
    private C6364h4[] f18122k4;

    /* JADX INFO: renamed from: kk */
    private int f18123kk;

    /* JADX INFO: renamed from: to */
    private float f18124to;

    /* JADX INFO: renamed from: x1 */
    private int f18125x1;

    public C6361du() {
        this(101, 0.75f);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m26124k4(int i) {
        C6364h4[] c6364h4Arr = this.f18122k4;
        for (C6364h4 c6364h4M26151to = c6364h4Arr[(Integer.MAX_VALUE & i) % c6364h4Arr.length]; c6364h4M26151to != null; c6364h4M26151to = c6364h4M26151to.m26151to()) {
            if (c6364h4M26151to.m26146k4() == i && c6364h4M26151to.m26152x1() == i) {
                return c6364h4M26151to.m26149kk();
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: kk */
    public final int[] m26127kk() {
        int i;
        int[] iArr = new int[this.f18125x1];
        int length = this.f18122k4.length;
        int i2 = 0;
        C6364h4 c6364h4 = null;
        while (true) {
            if (c6364h4 == null) {
                while (true) {
                    i = length - 1;
                    if (length <= 0 || (c6364h4 = this.f18122k4[i]) != null) {
                        break;
                    }
                    length = i;
                }
                length = i;
            }
            if (c6364h4 == null) {
                return iArr;
            }
            C6364h4 c6364h4M26151to = c6364h4.m26151to();
            iArr[i2] = c6364h4.m26152x1();
            c6364h4 = c6364h4M26151to;
            i2++;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m26128x1(int i) {
        C6364h4[] c6364h4Arr = this.f18122k4;
        for (C6364h4 c6364h4M26151to = c6364h4Arr[(Integer.MAX_VALUE & i) % c6364h4Arr.length]; c6364h4M26151to != null; c6364h4M26151to = c6364h4M26151to.m26151to()) {
            if (c6364h4M26151to.m26146k4() == i && c6364h4M26151to.m26152x1() == i) {
                return true;
            }
        }
        return false;
    }

    public C6361du(int i, float f) {
        if (i < 0) {
            throw new ArgumentException(C14113y2.m67402k4("Illegal capacity '{0}'", Integer.valueOf(i)));
        }
        if (f <= 0.0f) {
            throw new ArgumentException(C14113y2.m67402k4("Illegal load '{0}'", Float.valueOf(f)));
        }
        this.f18124to = f;
        this.f18122k4 = new C6364h4[i];
        this.f18123kk = OooO0OO.OooO0OO(i, f, 13);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26125k4() {
        C6364h4[] c6364h4Arr = this.f18122k4;
        int length = c6364h4Arr.length;
        int i = (length * 2) + 1;
        C6364h4[] c6364h4Arr2 = new C6364h4[i];
        this.f18123kk = OooO0OO.OooO0OO(i, this.f18124to, 13);
        this.f18122k4 = c6364h4Arr2;
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return;
            }
            C6364h4 c6364h4 = c6364h4Arr[i2];
            while (c6364h4 != null) {
                C6364h4 c6364h4M26151to = c6364h4.m26151to();
                int iM26146k4 = (c6364h4.m26146k4() & Integer.MAX_VALUE) % i;
                c6364h4.m26148k4(c6364h4Arr2[iM26146k4]);
                c6364h4Arr2[iM26146k4] = c6364h4;
                c6364h4 = c6364h4M26151to;
            }
            length = i2;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final int[] m26129x1() {
        int[] iArrM26127kk = m26127kk();
        AbstractC14092to.m67193du(AbstractC14092to.m67208k4((Object) iArrM26127kk));
        return iArrM26127kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26126k4(int i, int i2) {
        C6364h4[] c6364h4Arr = this.f18122k4;
        int length = (Integer.MAX_VALUE & i) % c6364h4Arr.length;
        for (C6364h4 c6364h4M26151to = c6364h4Arr[length]; c6364h4M26151to != null; c6364h4M26151to = c6364h4M26151to.m26151to()) {
            if (c6364h4M26151to.m26146k4() == i && c6364h4M26151to.m26152x1() == i) {
                c6364h4M26151to.m26150kk(i2);
                return;
            }
        }
        if (this.f18125x1 >= this.f18123kk) {
            m26125k4();
            m26126k4(i, i2);
            return;
        }
        C6364h4 c6364h4 = new C6364h4();
        c6364h4.m26147k4(i);
        c6364h4.m26153x1(i);
        c6364h4.m26150kk(i2);
        c6364h4.m26148k4(c6364h4Arr[length]);
        c6364h4Arr[length] = c6364h4;
        this.f18125x1++;
    }
}
