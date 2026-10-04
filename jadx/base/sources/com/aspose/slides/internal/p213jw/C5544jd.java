package com.aspose.slides.internal.p213jw;

import com.aspose.slides.internal.p032b1.C1568k4;
import com.aspose.slides.internal.p032b1.C1572x1;
import com.aspose.slides.internal.p149gf.C4257kk;
import com.aspose.slides.internal.p149gf.C4258to;
import com.aspose.slides.internal.p149gf.C4259x1;
import com.aspose.slides.internal.p182ii.C4913ks;
import com.aspose.slides.internal.p231kk.C5792kk;
import com.aspose.slides.internal.p231kk.InterfaceC5775ar;
import com.aspose.slides.internal.p231kk.InterfaceC5795lr;
import com.aspose.slides.internal.p263m2.InterfaceC6305du;
import com.aspose.slides.internal.p263m2.InterfaceC6307k4;
import com.aspose.slides.internal.p263m2.InterfaceC6308kk;
import com.aspose.slides.internal.p263m2.InterfaceC6310to;
import com.aspose.slides.internal.p263m2.InterfaceC6311x1;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p517y2.C12786x1;
import com.aspose.slides.internal.p517y2.InterfaceC12764ck;
import com.aspose.slides.internal.p517y2.InterfaceC12776ne;
import com.aspose.slides.internal.p517y2.InterfaceC12778rv;
import com.aspose.slides.internal.p530yo.C12884x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.jd */
/* JADX INFO: loaded from: classes.dex */
public class C5544jd implements InterfaceC5795lr, InterfaceC6307k4, InterfaceC12764ck {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f15233to = new C7017h4("CORE", "CSS", "LS");

    /* JADX INFO: renamed from: kk */
    private C5546kk f15235kk;

    /* JADX INFO: renamed from: k4 */
    private C5792kk f15234k4 = new C5792kk();

    /* JADX INFO: renamed from: x1 */
    private C1568k4 f15236x1 = new C1568k4();

    public C5544jd(C5546kk c5546kk) {
        this.f15235kk = c5546kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C1568k4 m22726k4() {
        return this.f15236x1;
    }

    @Override // com.aspose.slides.internal.p263m2.InterfaceC6307k4
    /* JADX INFO: renamed from: kk */
    public final InterfaceC6311x1 mo22731kk() {
        return new C4259x1();
    }

    @Override // com.aspose.slides.internal.p263m2.InterfaceC6307k4
    /* JADX INFO: renamed from: to */
    public final InterfaceC6308kk mo22733to() {
        return new C4257kk();
    }

    @Override // com.aspose.slides.internal.p263m2.InterfaceC6307k4
    /* JADX INFO: renamed from: x1 */
    public final InterfaceC6305du mo22734x1() {
        return new C12884x1(this.f15235kk);
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5795lr
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC5775ar mo22727k4(String str, String str2) {
        return this.f15234k4.m23677k4(str, str2);
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12764ck
    /* JADX INFO: renamed from: kk */
    public final Object mo22732kk(String str, String str2) {
        return this;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12764ck
    /* JADX INFO: renamed from: x1 */
    public boolean mo22735x1(String str, String str2) {
        int iM27428k4 = f15233to.m27428k4(str);
        return iM27428k4 == 0 || iM27428k4 == 1 || iM27428k4 == 2;
    }

    @Override // com.aspose.slides.internal.p263m2.InterfaceC6307k4
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC6310to mo22728k4(int i, String str) {
        if ((i & 65535) != 2) {
            return new C4258to(1, this.f15235kk, str);
        }
        throw new C12786x1((byte) 9, "NOT_SUPPORTED_ERR");
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC12776ne m22729k4(String str, String str2, String str3) {
        return new C1572x1(str, str2, str3, null, null);
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12764ck
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12778rv mo22730k4(String str, String str2, InterfaceC12776ne interfaceC12776ne) {
        C4913ks c4913ks = new C4913ks(this.f15235kk);
        c4913ks.m22805to().mo65707k4(C14113y2.f47374k4, str);
        if (interfaceC12776ne != null) {
            c4913ks.m22655to(interfaceC12776ne);
        }
        return c4913ks;
    }
}
