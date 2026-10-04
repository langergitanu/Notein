package com.aspose.slides.internal.p550zi;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14091t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.du */
/* JADX INFO: loaded from: classes5.dex */
public class C13597du extends AbstractC7020m9<C13597du> {

    /* JADX INFO: renamed from: k4 */
    static final /* synthetic */ boolean f45154k4 = true;

    /* JADX INFO: renamed from: x1 */
    private static final C13597du f45155x1 = new C13597du();

    /* JADX INFO: renamed from: kk */
    private boolean f45156kk;

    /* JADX INFO: renamed from: to */
    private long f45157to;

    public C13597du() {
    }

    public Object clone() {
        return Clone();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public C13597du Clone() {
        C13597du c13597du = new C13597du();
        CloneTo(c13597du);
        return c13597du;
    }

    public boolean equals(Object obj) {
        if (!f45154k4 && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C13597du) {
            return m62715x1((C13597du) obj);
        }
        return false;
    }

    public int hashCode() {
        return C14091t6.m67182k4(this.f45157to) ^ C14051ck.m66552k4(this.f45156kk);
    }

    /* JADX INFO: renamed from: k4 */
    public byte m62717k4() {
        return (byte) ((this.f45157to >> 24) & 255);
    }

    /* JADX INFO: renamed from: kk */
    public byte m62719kk() {
        return (byte) ((this.f45157to >> 8) & 255);
    }

    /* JADX INFO: renamed from: to */
    public byte m62720to() {
        return (byte) (this.f45157to & 255);
    }

    /* JADX INFO: renamed from: x1 */
    public byte m62721x1() {
        return (byte) ((this.f45157to >> 16) & 255);
    }

    private C13597du(long j) {
        this.f45157to = j;
        this.f45156kk = true;
    }

    /* JADX INFO: renamed from: k4 */
    public static C13597du m62712k4(int i, int i2, int i3, int i4) {
        m62713k4(i, "cyan");
        m62713k4(i2, "magenta");
        m62713k4(i3, "yellow");
        m62713k4(i4, "black");
        return new C13597du(m62714x1(i, i2, i3, i4));
    }

    /* JADX INFO: renamed from: x1 */
    private static long m62714x1(int i, int i2, int i3, int i4) {
        return ((long) ((i << 24) | (i2 << 16) | (i3 << 8) | i4)) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m62713k4(int i, String str) {
        if (i < 0 || i > 255) {
            throw new ArgumentOutOfRangeException("name");
        }
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m62715x1(C13597du c13597du) {
        return c13597du.f45156kk == this.f45156kk && c13597du.f45157to == this.f45157to;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C13597du c13597du) {
        c13597du.f45156kk = this.f45156kk;
        c13597du.f45157to = this.f45157to;
    }
}
