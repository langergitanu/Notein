package com.aspose.slides.internal.p383rp;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;

/* JADX INFO: renamed from: com.aspose.slides.internal.rp.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10029c5 {

    /* JADX INFO: renamed from: k4 */
    private long f36074k4;

    /* JADX INFO: renamed from: x1 */
    private long f36075x1;

    public C10029c5() {
    }

    public boolean equals(Object obj) {
        return m49268k4(this, (C10029c5) C7019kk.m27452k4(obj, C10029c5.class));
    }

    public int hashCode() {
        return C7019kk.m27462to(Long.valueOf(C7019kk.m27435du(Long.valueOf(this.f36075x1), 10) ^ C7019kk.m27435du(Long.valueOf(this.f36074k4), 10)), 10);
    }

    /* JADX INFO: renamed from: k4 */
    public long m49269k4() {
        return this.f36074k4;
    }

    /* JADX INFO: renamed from: kk */
    public float m49270kk() {
        return C7019kk.m27437dy(Long.valueOf(this.f36075x1), 10) / C7019kk.m27437dy(Long.valueOf(this.f36074k4), 10);
    }

    /* JADX INFO: renamed from: to */
    public double m49271to() {
        return C7019kk.m27433c5(Long.valueOf(this.f36075x1), 10) / C7019kk.m27433c5(Long.valueOf(this.f36074k4), 10);
    }

    public String toString() {
        return C14113y2.m67407k4(C14044b3.m66433k4(m49271to(), "F2"), " (", C14114y9.m67465x1(this.f36075x1), "/", C14114y9.m67465x1(this.f36074k4), C7019kk.m27446k4(')'));
    }

    /* JADX INFO: renamed from: x1 */
    public long m49272x1() {
        return this.f36075x1;
    }

    public C10029c5(long j) {
        this.f36075x1 = j;
        this.f36074k4 = 1L;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m49268k4(C10029c5 c10029c5, C10029c5 c10029c52) {
        return (C14067j2.m66729x1(c10029c5, null) || C14067j2.m66729x1(c10029c52, null)) ? C14067j2.m66729x1(c10029c5, null) && C14067j2.m66729x1(c10029c52, null) : C7019kk.m27435du(Long.valueOf(c10029c5.f36075x1), 10) == C7019kk.m27435du(Long.valueOf(c10029c52.f36075x1), 10) && C7019kk.m27435du(Long.valueOf(c10029c5.f36074k4), 10) == C7019kk.m27435du(Long.valueOf(c10029c52.f36074k4), 10);
    }

    public C10029c5(long j, long j2) {
        this.f36075x1 = j;
        this.f36074k4 = j2;
    }
}
