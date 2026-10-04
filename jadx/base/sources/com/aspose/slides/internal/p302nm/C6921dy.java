package com.aspose.slides.internal.p302nm;

import android.os.Bundle;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.internal.p138fu.C4127k4;
import com.aspose.slides.internal.p138fu.C4132to;
import com.aspose.slides.internal.p456v5.C11604du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.nm.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C6921dy {

    /* JADX INFO: renamed from: k4 */
    private final double f18859k4;

    /* JADX INFO: renamed from: kk */
    private final double f18860kk;

    /* JADX INFO: renamed from: to */
    private final double f18861to;

    /* JADX INFO: renamed from: x1 */
    private final double f18862x1;

    public C6921dy(double d, double d2, double d3, double d4) {
        this.f18859k4 = d;
        this.f18862x1 = d2;
        this.f18860kk = d3;
        this.f18861to = d4;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m27124k4(byte[] bArr, C6921dy c6921dy) {
        return C11604du.m54651k4(bArr).Clone().hashCode() ^ ((c6921dy == null || !c6921dy.m27132x1()) ? 0 : c6921dy.hashCode());
    }

    public int hashCode() {
        return (((C4132to.m16576k4(this.f18859k4) >> 1) ^ (C4132to.m16576k4(this.f18862x1) << 3)) ^ (C4132to.m16576k4(this.f18860kk) << 1)) ^ (C4132to.m16576k4(this.f18861to) >> 3);
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0069: INVOKE (r7 I:void) = (r13v3 ?? I:java.lang.String), (r14 I:java.lang.String) STATIC call: android.os.Bundle.putString(java.lang.String, java.lang.String):void A[MD:(java.lang.String, java.lang.String):void (c)], block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x004a: INVOKE (r5 I:void) = (r7v4 ?? I:java.lang.String), (r8 I:java.lang.String) STATIC call: android.os.Bundle.putString(java.lang.String, java.lang.String):void A[MD:(java.lang.String, java.lang.String):void (c)], block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r13v3, types: [double, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [double, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [double, void] */
    /* JADX WARN: Type inference failed for: r7v9, types: [double, void] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX INFO: renamed from: x1 */
    public final C12007ix m27131x1(C12007ix c12007ix) {
        ?? PutString;
        ?? PutString2;
        double dM67491kk = 1.0d / (1.0d - C14116yg.m67491kk(0.0d, this.f18859k4 + this.f18862x1));
        double dM67491kk2 = 1.0d / (1.0d - C14116yg.m67491kk(0.0d, this.f18860kk + this.f18861to));
        double d = -C14116yg.m67491kk(0.0d, this.f18859k4);
        double d2 = -C14116yg.m67491kk(0.0d, this.f18862x1);
        double d3 = -C14116yg.m67491kk(0.0d, this.f18860kk);
        double d4 = -C14116yg.m67491kk(0.0d, this.f18861to);
        c12007ix.m56571to();
        ?? PutString3 = Bundle.putString(c12007ix.m56550c5(), PutString);
        double dM56550c5 = ((1.0d - (d2 * dM67491kk)) * ((double) c12007ix.m56550c5())) + ((double) c12007ix.m56571to());
        c12007ix.m56554dy();
        return C12007ix.m56541k4((float) PutString3, (float) Bundle.putString(c12007ix.m56575x1(), PutString2), (float) dM56550c5, (float) (((1.0d - (d4 * dM67491kk2)) * ((double) c12007ix.m56575x1())) + ((double) c12007ix.m56554dy())));
    }

    /* JADX INFO: renamed from: k4 */
    public static int m27125k4(byte[] bArr, C6921dy c6921dy, C6920du c6920du) {
        int iM27124k4 = m27124k4(bArr, c6921dy);
        return c6920du != null ? (iM27124k4 * 397) ^ c6920du.hashCode() : iM27124k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m27132x1() {
        return this.f18859k4 > 0.0d || this.f18862x1 > 0.0d || this.f18860kk > 0.0d || this.f18861to > 0.0d;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4127k4 m27127k4(byte[] bArr) {
        C4127k4 c4127k4 = new C4127k4(bArr);
        try {
            return c4127k4.m16538k4(m27129k4(new C12014ne(0, 0, c4127k4.m16549x1(), c4127k4.m16546kk())).Clone().Clone());
        } finally {
            c4127k4.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m27128k4(C12007ix c12007ix) {
        double dM56550c5 = (((double) c12007ix.m56550c5()) * this.f18859k4) + ((double) c12007ix.m56571to());
        double dOooO0O0 = C21532OooOOo.OooO0O0(1.0d, this.f18862x1, c12007ix.m56550c5(), c12007ix.m56571to());
        return C12007ix.m56541k4((float) dM56550c5, (float) ((((double) c12007ix.m56575x1()) * this.f18860kk) + ((double) c12007ix.m56554dy())), (float) dOooO0O0, (float) C21532OooOOo.OooO0O0(1.0d, this.f18861to, c12007ix.m56575x1(), c12007ix.m56554dy()));
    }

    /* JADX INFO: renamed from: k4 */
    public final C12014ne m27129k4(C12014ne c12014ne) {
        double dM67502x1 = (C14116yg.m67502x1(0.0d, this.f18859k4) * ((double) c12014ne.m56663c5())) + ((double) c12014ne.m56681to());
        double dM67502x12 = ((1.0d - C14116yg.m67502x1(0.0d, this.f18862x1)) * ((double) c12014ne.m56663c5())) + ((double) c12014ne.m56681to());
        return C12014ne.m56654k4(C12565ks.m58608k4(dM67502x1), C12565ks.m58608k4((C14116yg.m67502x1(0.0d, this.f18860kk) * ((double) c12014ne.m56683x1())) + ((double) c12014ne.m56666dy())), C12565ks.m58608k4(dM67502x12), C12565ks.m58608k4(((1.0d - C14116yg.m67502x1(0.0d, this.f18861to)) * ((double) c12014ne.m56683x1())) + ((double) c12014ne.m56666dy())));
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m27130k4() {
        return this.f18859k4 == 0.0d && this.f18862x1 == 0.0d && this.f18860kk == 0.0d && this.f18861to == 0.0d;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m27126k4(C6921dy c6921dy) {
        return c6921dy == null || c6921dy.m27130k4();
    }
}
