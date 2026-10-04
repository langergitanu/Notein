package com.aspose.slides.internal.p389s0;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.s0.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10120h4 {

    /* JADX INFO: renamed from: c5 */
    public long f36257c5;

    /* JADX INFO: renamed from: ck */
    public long f36258ck;

    /* JADX INFO: renamed from: du */
    public int f36259du;

    /* JADX INFO: renamed from: dy */
    public long f36260dy;

    /* JADX INFO: renamed from: fa */
    public int f36261fa;

    /* JADX INFO: renamed from: h4 */
    public int f36262h4;

    /* JADX INFO: renamed from: jd */
    public int f36263jd;

    /* JADX INFO: renamed from: k4 */
    public int f36264k4;

    /* JADX INFO: renamed from: kk */
    public int f36265kk;

    /* JADX INFO: renamed from: m9 */
    public long f36266m9;

    /* JADX INFO: renamed from: to */
    public int f36267to;

    /* JADX INFO: renamed from: x1 */
    public int f36268x1;

    public C10120h4() {
        this.f36264k4 = 33;
        this.f36268x1 = 3;
        this.f36265kk = 9;
        this.f36267to = 6;
        this.f36260dy = 4096L;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m49711k4() {
        return this.f36263jd * 512;
    }

    public C10120h4(C3134k4 c3134k4) {
        if (c3134k4.m13380ne() != -2226271756974174256L) {
            throw new InvalidOperationException("This is not a structured storage file.");
        }
        c3134k4.m13372dy(16);
        this.f36264k4 = c3134k4.m13382u4();
        int iM13382u4 = c3134k4.m13382u4();
        this.f36268x1 = iM13382u4;
        if ((iM13382u4 & 65535) > 3) {
            throw new NotSupportedException("This structured storage version is not supported.");
        }
        c3134k4.m13382u4();
        this.f36265kk = c3134k4.m13382u4();
        this.f36267to = c3134k4.m13382u4();
        c3134k4.m13382u4();
        c3134k4.m13384uz();
        this.f36259du = c3134k4.m13386x6();
        this.f36262h4 = c3134k4.m13386x6();
        this.f36266m9 = c3134k4.m13384uz();
        c3134k4.m13384uz();
        this.f36260dy = c3134k4.m13384uz();
        this.f36257c5 = c3134k4.m13384uz();
        this.f36263jd = c3134k4.m13386x6();
        this.f36258ck = c3134k4.m13384uz();
        this.f36261fa = c3134k4.m13386x6();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49712k4(C3149x1 c3149x1) {
        c3149x1.m13456x1(-2226271756974174256L);
        c3149x1.m13450k4(new byte[16]);
        c3149x1.m13446k4(this.f36264k4 & 65535);
        c3149x1.m13446k4(this.f36268x1 & 65535);
        c3149x1.m13446k4(65534);
        c3149x1.m13446k4(this.f36265kk & 65535);
        c3149x1.m13446k4(this.f36267to & 65535);
        c3149x1.m13448k4((short) 0);
        c3149x1.m13455x1(0);
        c3149x1.m13455x1(this.f36259du);
        c3149x1.m13455x1(this.f36262h4);
        c3149x1.m13447k4(this.f36266m9 & 4294967295L);
        c3149x1.m13455x1(0);
        c3149x1.m13447k4(this.f36260dy & 4294967295L);
        c3149x1.m13447k4(this.f36257c5 & 4294967295L);
        c3149x1.m13455x1(this.f36263jd);
        c3149x1.m13447k4(this.f36258ck & 4294967295L);
        c3149x1.m13455x1(this.f36261fa);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m49713k4(long j) {
        return j >= (this.f36260dy & 4294967295L);
    }
}
