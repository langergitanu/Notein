package com.aspose.slides.internal.p420th;

import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p302nm.C6920du;
import com.aspose.slides.internal.p302nm.C6921dy;
import com.aspose.slides.internal.p302nm.C6923jd;
import com.aspose.slides.internal.p460vf.C11639kk;
import com.aspose.slides.internal.p460vf.C11641x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.u4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10970u4 extends AbstractC10973uz implements Cloneable {

    /* JADX INFO: renamed from: du */
    private C10959ix f38244du;

    /* JADX INFO: renamed from: dy */
    private String f38245dy;

    /* JADX INFO: renamed from: h4 */
    private C6920du f38246h4;

    /* JADX INFO: renamed from: k4 */
    private C12025x6 f38247k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f38248kk;

    /* JADX INFO: renamed from: m9 */
    private int f38249m9;

    /* JADX INFO: renamed from: to */
    private C6921dy f38250to;

    /* JADX INFO: renamed from: x1 */
    private C12015qq f38251x1;

    public C10970u4(C12025x6 c12025x6, C12015qq c12015qq, byte[] bArr) {
        this(c12025x6.Clone(), c12015qq.Clone(), bArr, null);
    }

    /* JADX INFO: renamed from: fa */
    private C10970u4 m53059fa() {
        return (C10970u4) m53066ck();
    }

    /* JADX INFO: renamed from: k4 */
    public static C10970u4 m53060k4(C10970u4 c10970u4) {
        C10970u4 c10970u4M53059fa = c10970u4.m53059fa();
        c10970u4M53059fa.m53079k4(C6923jd.m27138x1());
        c10970u4M53059fa.m53074k4((C6921dy) null);
        return c10970u4M53059fa;
    }

    /* JADX INFO: renamed from: up */
    private C10970u4 m53063up() {
        try {
            C10970u4 c10970u4M53059fa = m53059fa();
            c10970u4M53059fa.m53079k4(C6923jd.m27137k4(m53082to(), c10970u4M53059fa.m53080kk().Clone()));
            return c10970u4M53059fa;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static float m53064x1(C10951c5 c10951c5) {
        C10976wy c10976wy = new C10976wy();
        c10976wy.m53127k4((AbstractC10973uz) c10951c5);
        if (!c10976wy.m53129kk()) {
            return 1.0f;
        }
        float fM67481k4 = C14116yg.m67481k4(C14116yg.m67480k4(c10976wy.m53126k4()), C14116yg.m67480k4(c10976wy.m53130x1()));
        if (fM67481k4 < 32767.0f) {
            return 1.0f;
        }
        return 32766.0f / fM67481k4;
    }

    /* JADX INFO: renamed from: c5 */
    public final int m53065c5() {
        return this.f38249m9;
    }

    /* JADX INFO: renamed from: ck */
    public Object m53066ck() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: du */
    public final int m53067du() {
        return C12549du.m58515x1(this.f38248kk);
    }

    /* JADX INFO: renamed from: dy */
    public final C6920du m53068dy() {
        return this.f38246h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final C6921dy m53069h4() {
        return this.f38250to;
    }

    /* JADX INFO: renamed from: jd */
    public final String m53070jd() {
        return this.f38245dy;
    }

    /* JADX INFO: renamed from: kk */
    public final C12007ix m53080kk() {
        return new C12007ix(this.f38247k4.Clone(), this.f38251x1.Clone());
    }

    /* JADX INFO: renamed from: m9 */
    public final C10959ix m53081m9() {
        return this.f38244du;
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m53082to() {
        return this.f38248kk;
    }

    public C10970u4(C12025x6 c12025x6, C12015qq c12015qq, byte[] bArr, C6921dy c6921dy) {
        this.f38247k4 = C12025x6.f40591k4.Clone();
        this.f38251x1 = C12015qq.f40552k4.Clone();
        this.f38246h4 = null;
        this.f38249m9 = 2;
        c12025x6.CloneTo(this.f38247k4);
        c12015qq.CloneTo(this.f38251x1);
        this.f38250to = c6921dy;
        this.f38248kk = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10970u4 m53071k4(AbstractC10972up abstractC10972up, C11641x1 c11641x1, boolean z, boolean z2) {
        switch (m53067du()) {
            case 0:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return this;
            case 1:
            case 2:
                return m53061k4(z2, c11641x1, z, abstractC10972up);
            case 3:
            default:
                return m53060k4(this);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C12015qq m53083x1() {
        return this.f38251x1;
    }

    public C10970u4(C12025x6 c12025x6, C12015qq c12015qq, byte[] bArr, C6921dy c6921dy, C6920du c6920du) {
        this(c12025x6.Clone(), c12015qq.Clone(), bArr, c6921dy);
        this.f38246h4 = c6920du;
    }

    /* JADX INFO: renamed from: k4 */
    private C10970u4 m53061k4(boolean z, C11641x1 c11641x1, boolean z2, AbstractC10972up abstractC10972up) {
        C10951c5 c10951c5M54764k4;
        if (z) {
            return m53063up();
        }
        C11639kk c11639kk = new C11639kk();
        try {
            C10951c5[] c10951c5Arr = {null};
            c10951c5M54764k4 = c11641x1.m54764k4(this, c11639kk, c10951c5Arr);
            C10951c5 c10951c5 = c10951c5Arr[0];
            if (z2) {
                m53062k4(c10951c5);
            }
        } catch (RuntimeException unused) {
        }
        if (c11639kk.m54744k4()) {
            return m53063up();
        }
        abstractC10972up.m53112x1((AbstractC10973uz) c10951c5M54764k4);
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12025x6 m53072k4() {
        return this.f38247k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53073k4(int i) {
        this.f38249m9 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53074k4(C6921dy c6921dy) {
        this.f38250to = c6921dy;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m53062k4(C10951c5 c10951c5) {
        float fM53064x1 = m53064x1(c10951c5);
        if (fM53064x1 >= 1.0f) {
            return;
        }
        C10949b3 c10949b3 = new C10949b3();
        c10949b3.m52888k4(true);
        c10949b3.m52887k4(c10951c5, fM53064x1);
        if (c10951c5.mo52909to() == null) {
            c10951c5.m52904k4(new C4317dy());
        }
        float f = 1.0f / fM53064x1;
        c10951c5.mo52909to().m17336k4(f, f, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53075k4(C10959ix c10959ix) {
        this.f38244du = c10959ix;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53076k4(C12015qq c12015qq) {
        c12015qq.CloneTo(this.f38251x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53077k4(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f38247k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53078k4(String str) {
        this.f38245dy = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53079k4(byte[] bArr) {
        this.f38248kk = bArr;
    }
}
