package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.k4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2581k4 extends AbstractC2562bv implements InterfaceC2571e0 {

    /* JADX INFO: renamed from: k4 */
    private String f8412k4;

    /* JADX INFO: renamed from: kk */
    private String f8413kk;

    /* JADX INFO: renamed from: x1 */
    private String f8414x1;

    public AbstractC2581k4(String str, String str2, String str3) {
        this.f8412k4 = str;
        this.f8414x1 = str2;
        this.f8413kk = str3;
    }

    @Override // com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: du */
    public String mo11890du() {
        return this.f8413kk == null ? C14113y2.m67407k4('[', this.f8414x1, ']') : C14113y2.m67407k4('[', this.f8414x1, "=\"", this.f8413kk, "\"]");
    }

    /* JADX INFO: renamed from: k4 */
    public String m11898k4() {
        return this.f8412k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m11900kk() {
        return this.f8413kk;
    }

    @Override // com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: to */
    public int mo11901to() {
        return 10;
    }

    /* JADX INFO: renamed from: x1 */
    public String m11902x1() {
        return this.f8414x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m11899k4(InterfaceC12769ix interfaceC12769ix) {
        return this.f8412k4 == null ? interfaceC12769ix.mo22721to(m11902x1()) : C18358t1.g.f56183c.equals(m11898k4()) ? interfaceC12769ix.mo22724x1(this.f8412k4, m11902x1()) : interfaceC12769ix.mo22724x1(m11888h4().m23401a_().m26017du().mo13292k4(m11898k4()), m11902x1());
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m11903x1(InterfaceC12769ix interfaceC12769ix) {
        return this.f8412k4 == null ? interfaceC12769ix.mo22698c5(m11902x1()) : C18358t1.g.f56183c.equals(m11898k4()) ? interfaceC12769ix.mo22705h4(this.f8412k4, m11902x1()) : interfaceC12769ix.mo22705h4(m11888h4().m23401a_().m26017du().mo13292k4(m11898k4()), m11902x1());
    }

    @Override // com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        return this.f8413kk == null ? interfaceC12769ix.mo22698c5(this.f8414x1) : C14113y2.m67363du(interfaceC12769ix.mo22721to(this.f8414x1), this.f8413kk);
    }
}
