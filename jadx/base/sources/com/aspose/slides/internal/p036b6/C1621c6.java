package com.aspose.slides.internal.p036b6;

import com.aspose.slides.p559ms.System.C14081nv;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.c6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1621c6 implements Comparable<C1621c6> {

    /* JADX INFO: renamed from: du */
    private int f6238du;

    /* JADX INFO: renamed from: h4 */
    private int f6239h4;

    /* JADX INFO: renamed from: k4 */
    private int f6240k4;

    /* JADX INFO: renamed from: kk */
    private int f6241kk;

    /* JADX INFO: renamed from: m9 */
    private byte[] f6242m9;

    /* JADX INFO: renamed from: to */
    private int f6243to;

    /* JADX INFO: renamed from: x1 */
    private int f6244x1;

    public C1621c6(int i, int i2, int i3, int i4, int i5, int i6) {
        m8721k4(i);
        m8724x1(i2);
        m8722kk(i3);
        m8723to(i4);
        m8719du(i5);
        m8720h4(i6);
    }

    /* JADX INFO: renamed from: du */
    public final int m8725du() {
        return this.f6238du;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m8726h4() {
        return this.f6239h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m8727k4() {
        return this.f6240k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m8730kk() {
        return this.f6241kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte[] m8731m9() {
        return this.f6242m9;
    }

    /* JADX INFO: renamed from: to */
    public final int m8732to() {
        return this.f6243to;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m8733x1() {
        return this.f6244x1;
    }

    /* JADX INFO: renamed from: du */
    private void m8719du(int i) {
        this.f6238du = i;
    }

    /* JADX INFO: renamed from: h4 */
    private void m8720h4(int i) {
        this.f6239h4 = i;
    }

    /* JADX INFO: renamed from: kk */
    private void m8722kk(int i) {
        this.f6241kk = i;
    }

    /* JADX INFO: renamed from: to */
    private void m8723to(int i) {
        this.f6243to = i;
    }

    /* JADX INFO: renamed from: x1 */
    private void m8724x1(int i) {
        this.f6244x1 = i;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1621c6 c1621c6) {
        int iM8732to;
        int iM8732to2;
        if ((m8727k4() & 65535) != (c1621c6.m8727k4() & 65535)) {
            iM8732to = m8727k4();
            iM8732to2 = c1621c6.m8727k4();
        } else if ((m8733x1() & 65535) != (c1621c6.m8733x1() & 65535)) {
            iM8732to = m8733x1();
            iM8732to2 = c1621c6.m8733x1();
        } else if ((m8730kk() & 65535) != (c1621c6.m8730kk() & 65535)) {
            iM8732to = m8730kk();
            iM8732to2 = c1621c6.m8730kk();
        } else {
            if ((m8732to() & 65535) == (65535 & c1621c6.m8732to())) {
                return 0;
            }
            iM8732to = m8732to();
            iM8732to2 = c1621c6.m8732to();
        }
        return C14081nv.m67062k4(iM8732to, iM8732to2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m8721k4(int i) {
        this.f6240k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8729k4(byte[] bArr) {
        this.f6242m9 = bArr;
    }
}
