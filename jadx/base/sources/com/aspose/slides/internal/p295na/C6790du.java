package com.aspose.slides.internal.p295na;

import com.aspose.slides.internal.p199j5.C5193h4;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.na.du */
/* JADX INFO: loaded from: classes4.dex */
class C6790du {
    /* JADX INFO: renamed from: k4 */
    public static boolean m26861k4(InterfaceC12777qq interfaceC12777qq, int i) {
        int i2 = C5193h4.f14201k4;
        if ((i & i2) == i2) {
            return true;
        }
        if ((i & 1) == 1 && interfaceC12777qq.mo22608fa() == 1) {
            return true;
        }
        if ((i & 2) == 2 && interfaceC12777qq.mo22608fa() == 2) {
            return true;
        }
        if ((i & 4) == 4 && interfaceC12777qq.mo22608fa() == 3) {
            return true;
        }
        if ((i & 8) == 8 && interfaceC12777qq.mo22608fa() == 4) {
            return true;
        }
        if ((i & 16) == 16 && interfaceC12777qq.mo22608fa() == 5) {
            return true;
        }
        if ((i & 32) == 32 && interfaceC12777qq.mo22608fa() == 6) {
            return true;
        }
        if ((i & 64) == 64 && interfaceC12777qq.mo22608fa() == 7) {
            return true;
        }
        if ((i & 128) == 128 && interfaceC12777qq.mo22608fa() == 8) {
            return true;
        }
        if ((i & 256) == 256 && interfaceC12777qq.mo22608fa() == 9) {
            return true;
        }
        if ((i & 512) == 512 && interfaceC12777qq.mo22608fa() == 10) {
            return true;
        }
        if ((i & 1024) == 1024 && interfaceC12777qq.mo22608fa() == 11) {
            return true;
        }
        return (i & 2048) == 2048 && interfaceC12777qq.mo22608fa() == 12;
    }
}
