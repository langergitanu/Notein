package com.aspose.slides.internal.p118ex;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.rv */
/* JADX INFO: loaded from: classes.dex */
public class C3826rv extends AbstractC7020m9<C3826rv> {

    /* JADX INFO: renamed from: k4 */
    static final /* synthetic */ boolean f10434k4 = true;

    /* JADX INFO: renamed from: kk */
    private String f10435kk;

    /* JADX INFO: renamed from: x1 */
    private int f10436x1;

    public C3826rv() {
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!f10434k4 && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C3826rv) {
            return m15333x1((C3826rv) obj);
        }
        return false;
    }

    public int hashCode() {
        int i = this.f10436x1 * 31;
        String str = this.f10435kk;
        return i + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public int m15334k4() {
        return this.f10436x1;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C3826rv Clone() {
        C3826rv c3826rv = new C3826rv();
        CloneTo(c3826rv);
        return c3826rv;
    }

    public C3826rv(int i) {
        this.f10436x1 = i;
        this.f10435kk = m15332x1(i);
    }

    /* JADX INFO: renamed from: x1 */
    public static String m15332x1(int i) {
        if (i != 1 && i != 2) {
            switch (i) {
                case 4:
                case 8:
                case 16:
                case 32:
                case 64:
                case 128:
                case 256:
                case 512:
                case 1024:
                case 2048:
                case 4096:
                case 8192:
                case 16384:
                case 32768:
                case 65536:
                case 131072:
                case 262144:
                case 524288:
                case 16777216:
                case 33554432:
                    break;
                default:
                    return C14113y2.f47374k4;
            }
        }
        return C14113y2.m67402k4(C14042ak.m66410k4(C3834x6.class, i), new Object[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public void m15335k4(int i) {
        this.f10436x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m15333x1(C3826rv c3826rv) {
        return c3826rv.f10436x1 == this.f10436x1 && C14067j2.m66728k4(c3826rv.f10435kk, this.f10435kk);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C3826rv c3826rv) {
        c3826rv.f10436x1 = this.f10436x1;
        c3826rv.f10435kk = this.f10435kk;
    }

    /* JADX INFO: renamed from: k4 */
    public void m15337k4(String str) {
        this.f10435kk = str;
    }
}
