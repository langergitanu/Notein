package com.aspose.slides.internal.p389s0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;

/* JADX INFO: renamed from: com.aspose.slides.internal.s0.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10117c5 {

    /* JADX INFO: renamed from: k4 */
    private final List<Long> f36249k4 = new List<>();

    public C10117c5() {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49694k4(long j) {
        this.f36249k4.addItem(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: kk */
    public final C3152yj m49696kk() {
        C3152yj c3152yj = new C3152yj();
        C3149x1 c3149x1 = new C3149x1(c3152yj, AbstractC6747ar.m26643rv());
        for (long j = 0; (j & 4294967295L) < this.f36249k4.size(); j++) {
            c3149x1.m13447k4(4294967295L & m49698x1(j));
        }
        return c3152yj;
    }

    /* JADX INFO: renamed from: to */
    public final int m49697to() {
        return this.f36249k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final long m49698x1(long j) {
        return this.f36249k4.get_Item((int) j).longValue() & 4294967295L;
    }

    public C10117c5(AbstractC3150x6 abstractC3150x6) {
        abstractC3150x6.setPosition(0L);
        m49695k4(abstractC3150x6, ((int) abstractC3150x6.getLength()) / 4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49695k4(AbstractC3150x6 abstractC3150x6, int i) {
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6, AbstractC6747ar.m26643rv());
        for (int i2 = 0; i2 < i; i2++) {
            this.f36249k4.addItem(Long.valueOf(c3134k4.m13384uz()));
        }
    }
}
