package com.aspose.slides.internal.p021af;

import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p521y9.C12804k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.af.x1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1369x1 {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC12769ix f5942k4;

    /* JADX INFO: renamed from: kk */
    private C1369x1 f5943kk;

    /* JADX INFO: renamed from: to */
    private C12007ix f5944to;

    /* JADX INFO: renamed from: x1 */
    private C1367k4 f5945x1;

    public C1369x1(InterfaceC12769ix interfaceC12769ix, C12007ix c12007ix, C1367k4 c1367k4) {
        C12007ix c12007ix2 = new C12007ix();
        this.f5944to = c12007ix2;
        this.f5942k4 = interfaceC12769ix;
        this.f5945x1 = c1367k4;
        c12007ix.CloneTo(c12007ix2);
    }

    /* JADX INFO: renamed from: k4 */
    public final C1369x1 m8123k4() {
        if (this.f5943kk == null) {
            InterfaceC12769ix interfaceC12769ix = this.f5942k4;
            while (true) {
                if (interfaceC12769ix.mo22646kp() == null || interfaceC12769ix.mo22646kp().mo22608fa() != 1) {
                    break;
                }
                interfaceC12769ix = (C12804k4) interfaceC12769ix.mo22646kp();
                C12007ix c12007ixClone = C12007ix.f40519k4.Clone();
                C12007ix[] c12007ixArr = {c12007ixClone};
                boolean zM8116k4 = this.f5945x1.m8116k4(interfaceC12769ix, c12007ixArr);
                c12007ixArr[0].CloneTo(c12007ixClone);
                if (zM8116k4) {
                    this.f5943kk = new C1369x1(interfaceC12769ix, c12007ixClone.Clone(), this.f5945x1);
                    break;
                }
            }
        }
        return this.f5943kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C12007ix m8124kk() {
        return this.f5944to;
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC12769ix m8125x1() {
        return this.f5942k4;
    }
}
