package com.aspose.slides.internal.p463vm;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.vm.rv */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11694rv implements InterfaceC14059g8, Cloneable {

    /* JADX INFO: renamed from: to */
    public static int f39621to;

    /* JADX INFO: renamed from: du */
    int f39622du = -1;

    /* JADX INFO: renamed from: k4 */
    private boolean f39623k4;

    /* JADX INFO: renamed from: k4 */
    public static long m55228k4(int i, int i2, int i3, int i4) {
        if (i < 0 || i >= 24 || i2 < 0 || i2 >= 60 || i3 < 0 || i3 >= 60) {
            throw new ArgumentOutOfRangeException(null);
        }
        if (i4 < 0 || i4 >= 1000) {
            throw new ArgumentOutOfRangeException("millisecond");
        }
        return (((long) i4) * 10000) + m55229kk(i, i2, i3);
    }

    /* JADX INFO: renamed from: kk */
    public static long m55229kk(int i, int i2, int i3) {
        long j = (((long) i2) * 60) + (((long) i) * 3600) + ((long) i3);
        if (j > 922337203685L || j < -922337203685L) {
            throw new ArgumentOutOfRangeException("Overflow_TimeSpanTooLong");
        }
        return j * 10000000;
    }

    public Object clone() {
        AbstractC11694rv abstractC11694rv = (AbstractC11694rv) deepClone();
        abstractC11694rv.m55231k4(false);
        return abstractC11694rv;
    }

    /* JADX INFO: renamed from: du */
    public int mo55082du() {
        return this.f39622du;
    }

    /* JADX INFO: renamed from: du */
    public abstract int mo55083du(C14084qq c14084qq);

    /* JADX INFO: renamed from: h4 */
    public abstract int mo55084h4();

    /* JADX INFO: renamed from: k4 */
    public abstract int mo55085k4(C14084qq c14084qq);

    /* JADX INFO: renamed from: k4 */
    public abstract C14084qq mo55086k4(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    /* JADX INFO: renamed from: kk */
    public abstract int mo55088kk(C14084qq c14084qq);

    /* JADX INFO: renamed from: m9 */
    public void m55232m9() {
        if (this.f39623k4) {
            throw new InvalidOperationException("InvalidOperation_ReadOnly");
        }
    }

    /* JADX INFO: renamed from: to */
    public abstract int mo55090to(C14084qq c14084qq);

    /* JADX INFO: renamed from: to */
    public C14084qq mo55091to() {
        return C14084qq.f47299x1.Clone();
    }

    /* JADX INFO: renamed from: x1 */
    public abstract int mo55092x1(C14084qq c14084qq);

    /* JADX INFO: renamed from: x1 */
    public abstract int[] mo55093x1();

    /* JADX INFO: renamed from: k4 */
    public C14084qq m55230k4(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return mo55086k4(i, i2, i3, i4, i5, i6, i7, 0);
    }

    /* JADX INFO: renamed from: kk */
    public C14084qq mo55089kk() {
        return C14084qq.f47293kk.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo55087k4(int i) {
        m55232m9();
        this.f39622du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55231k4(boolean z) {
        this.f39623k4 = z;
    }
}
