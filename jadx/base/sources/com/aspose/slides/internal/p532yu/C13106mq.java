package com.aspose.slides.internal.p532yu;

import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.mq */
/* JADX INFO: loaded from: classes5.dex */
public class C13106mq extends C13126nm {

    /* JADX INFO: renamed from: k4 */
    private String f44114k4;

    /* JADX INFO: renamed from: kk */
    private C13086lm f44115kk;

    /* JADX INFO: renamed from: x1 */
    private int f44116x1 = 0;

    /* JADX INFO: renamed from: du */
    public final void m61184du(String str) {
        String str2 = this.f44114k4;
        if (str2 != null) {
            this.f44115kk = new C13049jf(str2, str);
        } else {
            this.f44115kk = new C13086lm();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final int m61185h4() {
        int i = this.f44116x1;
        if (i == 0) {
            return 3;
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m61186k4() {
        return this.f44116x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m61189kk(String str) {
        String str2 = this.f44114k4;
        if (str2 != null) {
            this.f44115kk = new C13086lm(str2, str);
        } else {
            this.f44115kk = new C13086lm();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C13086lm m61190x1() {
        return this.f44115kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static C13106mq m61181k4(C13106mq c13106mq, C13106mq c13106mq2, boolean z) {
        C13086lm c13086lmM61103x1 = C13086lm.m61103x1(c13106mq.m61190x1(), c13106mq2.m61190x1(), z);
        if (c13086lmM61103x1 == null) {
            return null;
        }
        C13106mq c13106mq3 = new C13106mq();
        c13106mq3.f44115kk = c13086lmM61103x1;
        c13106mq3.m61187k4(c13106mq.m61186k4());
        c13106mq3.m61293x1(c13106mq.m61292to());
        return c13106mq3;
    }

    /* JADX INFO: renamed from: x1 */
    public static C13106mq m61183x1(C13106mq c13106mq, C13106mq c13106mq2, boolean z) {
        C13086lm c13086lmM61101k4 = C13086lm.m61101k4(c13106mq.m61190x1(), c13106mq2.m61190x1(), z);
        if (c13086lmM61101k4 == null) {
            return null;
        }
        C13106mq c13106mq3 = new C13106mq();
        c13106mq3.f44115kk = c13086lmM61101k4;
        c13106mq3.f44116x1 = c13106mq.f44116x1;
        c13106mq3.m61293x1(c13106mq.m61292to());
        return c13106mq3;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61187k4(int i) {
        this.f44116x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61191x1(String str) {
        this.f44114k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m61182k4(C13106mq c13106mq, C13106mq c13106mq2) {
        return C13086lm.m61102k4(c13106mq.m61190x1(), c13106mq2.m61190x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m61188k4(C13890ei c13890ei) {
        return this.f44115kk.mo61008k4(c13890ei.m65284k4());
    }
}
