package com.aspose.slides.internal.p208jl;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p185il.C5102k4;
import com.aspose.slides.internal.p245la.C6013du;
import com.aspose.slides.internal.p245la.InterfaceC6018m9;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p470w5.C11884du;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.jl.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C5500h4 extends AbstractC5504x1 {
    @Override // com.aspose.slides.internal.p245la.InterfaceC6014dy
    /* JADX INFO: renamed from: k4 */
    public InterfaceC6018m9 mo22586k4(C13618wy c13618wy, InterfaceC6901du interfaceC6901du) {
        byte[] bArrM24299x1 = C6013du.m24299x1(c13618wy, C7019kk.m27462to(Byte.valueOf(C11884du.f40014k4), 6));
        if (C7019kk.m27462to(Byte.valueOf(bArrM24299x1[0]), 6) != C7019kk.m27462to((Object) (byte) 33, 6)) {
            throw new C5102k4("Extension introducer is unexpected for plain text extension block.");
        }
        if (C7019kk.m27462to(Byte.valueOf(bArrM24299x1[1]), 6) != C7019kk.m27462to((Object) (byte) 1, 6)) {
            throw new C5102k4("Extension label is unexpected for plain text extension block.");
        }
        if (C7019kk.m27462to(Byte.valueOf(bArrM24299x1[2]), 6) == C7019kk.m27462to((Object) (byte) 12, 6)) {
            return new C11884du(C14069jd.m66769k4(bArrM24299x1, 3), C14069jd.m66769k4(bArrM24299x1, 5), C14069jd.m66769k4(bArrM24299x1, 7), C14069jd.m66769k4(bArrM24299x1, 9), bArrM24299x1[11], bArrM24299x1[12], bArrM24299x1[13], bArrM24299x1[14], C6013du.m24298k4(c13618wy));
        }
        throw new C5102k4("Extension block size is unexpected for plain text extension block.");
    }

    @Override // com.aspose.slides.internal.p245la.InterfaceC6014dy
    /* JADX INFO: renamed from: k4 */
    public boolean mo22587k4(C13618wy c13618wy) {
        if (c13618wy == null) {
            throw new ArgumentNullException("streamContainer");
        }
        byte[] bArr = new byte[2];
        return c13618wy.m62860x1(bArr) == 2 && C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) == C7019kk.m27462to((Object) (byte) 33, 6) && C7019kk.m27462to(Byte.valueOf(bArr[1]), 6) == C7019kk.m27462to((Object) (byte) 1, 6);
    }
}
