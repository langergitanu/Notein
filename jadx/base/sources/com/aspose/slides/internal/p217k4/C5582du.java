package com.aspose.slides.internal.p217k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.du */
/* JADX INFO: loaded from: classes.dex */
public class C5582du implements Cloneable {

    /* JADX INFO: renamed from: k4 */
    protected long[] f15384k4;

    public C5582du() {
        this(64);
    }

    /* JADX INFO: renamed from: c5 */
    private static final int m22931c5(int i) {
        return i >> 6;
    }

    /* JADX INFO: renamed from: dy */
    private final int m22932dy(int i) {
        return (i >> 6) + 1;
    }

    /* JADX INFO: renamed from: h4 */
    private void m22933h4(int i) {
        long[] jArr = new long[i];
        System.arraycopy(this.f15384k4, 0, jArr, 0, Math.min(i, this.f15384k4.length));
        this.f15384k4 = jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static C5582du m22934k4(int i) {
        C5582du c5582du = new C5582du(i + 1);
        c5582du.m22943x1(i);
        return c5582du;
    }

    /* JADX INFO: renamed from: m9 */
    private static final long m22937m9(int i) {
        return 1 << (i & 63);
    }

    public Object clone() {
        try {
            C5582du c5582du = (C5582du) super.clone();
            long[] jArr = new long[this.f15384k4.length];
            c5582du.f15384k4 = jArr;
            long[] jArr2 = this.f15384k4;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            return c5582du;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    /* JADX INFO: renamed from: du */
    public void m22938du(int i) {
        int iM22931c5 = m22931c5(i);
        long[] jArr = this.f15384k4;
        if (iM22931c5 < jArr.length) {
            jArr[iM22931c5] = jArr[iM22931c5] & (~m22937m9(i));
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5582du)) {
            return false;
        }
        C5582du c5582du = (C5582du) obj;
        int iMin = Math.min(this.f15384k4.length, c5582du.f15384k4.length);
        for (int i = 0; i < iMin; i++) {
            if (this.f15384k4[i] != c5582du.f15384k4[i]) {
                return false;
            }
        }
        if (this.f15384k4.length > iMin) {
            int i2 = iMin + 1;
            while (true) {
                long[] jArr = this.f15384k4;
                if (i2 >= jArr.length) {
                    break;
                }
                if (jArr[i2] != 0) {
                    return false;
                }
                i2++;
            }
        } else if (c5582du.f15384k4.length > iMin) {
            int i3 = iMin + 1;
            while (true) {
                long[] jArr2 = c5582du.f15384k4;
                if (i3 >= jArr2.length) {
                    break;
                }
                if (jArr2[i3] != 0) {
                    return false;
                }
                i3++;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: kk */
    public void m22941kk(int i) {
        long[] jArr = new long[Math.max(this.f15384k4.length << 1, m22932dy(i))];
        long[] jArr2 = this.f15384k4;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        this.f15384k4 = jArr;
    }

    /* JADX INFO: renamed from: to */
    public boolean m22942to(int i) {
        if (i < 0) {
            return false;
        }
        int iM22931c5 = m22931c5(i);
        long[] jArr = this.f15384k4;
        return iM22931c5 < jArr.length && (jArr[iM22931c5] & m22937m9(i)) != 0;
    }

    public String toString() {
        return m22940k4((String[]) null);
    }

    /* JADX INFO: renamed from: x1 */
    public void m22943x1(int i) {
        int iM22931c5 = m22931c5(i);
        if (iM22931c5 >= this.f15384k4.length) {
            m22941kk(i);
        }
        long[] jArr = this.f15384k4;
        jArr[iM22931c5] = jArr[iM22931c5] | m22937m9(i);
    }

    public C5582du(int i) {
        this.f15384k4 = new long[((i - 1) >> 6) + 1];
    }

    /* JADX INFO: renamed from: k4 */
    public static C5582du m22935k4(int i, int i2) {
        C5582du c5582du = new C5582du(Math.max(i, i2) + 1);
        c5582du.m22943x1(i);
        c5582du.m22943x1(i2);
        return c5582du;
    }

    /* JADX INFO: renamed from: x1 */
    public void m22944x1(C5582du c5582du) {
        if (c5582du == null) {
            return;
        }
        long[] jArr = c5582du.f15384k4;
        if (jArr.length > this.f15384k4.length) {
            m22933h4(jArr.length);
        }
        for (int iMin = Math.min(this.f15384k4.length, c5582du.f15384k4.length) - 1; iMin >= 0; iMin--) {
            long[] jArr2 = this.f15384k4;
            jArr2[iMin] = jArr2[iMin] | c5582du.f15384k4[iMin];
        }
    }

    public C5582du(long[] jArr) {
        this.f15384k4 = jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static C5582du m22936k4(int i, int i2, int i3) {
        C5582du c5582du = new C5582du();
        c5582du.m22943x1(i);
        c5582du.m22943x1(i2);
        c5582du.m22943x1(i3);
        return c5582du;
    }

    /* JADX INFO: renamed from: k4 */
    public C5582du m22939k4(C5582du c5582du) {
        if (c5582du == null) {
            return this;
        }
        C5582du c5582du2 = (C5582du) clone();
        c5582du2.m22944x1(c5582du);
        return c5582du2;
    }

    /* JADX INFO: renamed from: k4 */
    public String m22940k4(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer("{");
        boolean z = false;
        for (int i = 0; i < (this.f15384k4.length << 6); i++) {
            if (m22942to(i)) {
                if (i > 0 && z) {
                    stringBuffer.append(",");
                }
                if (strArr != null) {
                    stringBuffer.append(strArr[i]);
                } else {
                    stringBuffer.append(i);
                }
                z = true;
            }
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
