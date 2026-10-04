package com.aspose.slides.internal.p389s0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;

/* JADX INFO: renamed from: com.aspose.slides.internal.s0.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C10123kk {

    /* JADX INFO: renamed from: k4 */
    private final List<C10126x1> f36269k4 = new List<>();

    /* JADX INFO: renamed from: k4 */
    public final int m49719k4() {
        return this.f36269k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final C3152yj m49723x1() {
        C3152yj c3152yj = new C3152yj();
        C3149x1 c3149x1 = new C3149x1(c3152yj, AbstractC6747ar.m26643rv());
        for (long j = 0; (4294967295L & j) < this.f36269k4.size(); j++) {
            m49720k4(j).m49731k4(c3149x1);
        }
        C10126x1 c10126x1 = new C10126x1();
        while (c3152yj.getLength() % 512 != 0) {
            c10126x1.m49731k4(c3149x1);
        }
        return c3152yj;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10126x1 m49720k4(long j) {
        return this.f36269k4.get_Item((int) j);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10126x1 m49721k4(C10126x1 c10126x1, long j) {
        long j2 = j & 4294967295L;
        if (j2 == 4294967295L || j2 < 0 || j2 >= this.f36269k4.size() || c10126x1 == m49720k4(j)) {
            return null;
        }
        return m49720k4(j);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49722k4(C10126x1 c10126x1) {
        this.f36269k4.addItem(c10126x1);
    }
}
