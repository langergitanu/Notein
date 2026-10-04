package com.aspose.slides.internal.p208jl;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p185il.C5102k4;
import com.aspose.slides.internal.p245la.C6013du;
import com.aspose.slides.internal.p245la.InterfaceC6018m9;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p470w5.C11888to;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.jl.du */
/* JADX INFO: loaded from: classes.dex */
public class C5499du extends AbstractC5504x1 {
    @Override // com.aspose.slides.internal.p245la.InterfaceC6014dy
    /* JADX INFO: renamed from: k4 */
    public InterfaceC6018m9 mo22586k4(C13618wy c13618wy, InterfaceC6901du interfaceC6901du) {
        byte[] bArrM24299x1 = C6013du.m24299x1(c13618wy, 8);
        if (C7019kk.m27462to(Byte.valueOf(bArrM24299x1[0]), 6) != C7019kk.m27462to((Object) (byte) 33, 6)) {
            throw new C5102k4("Extension introducer is unexpected for graphics control block.");
        }
        if (C7019kk.m27462to(Byte.valueOf(bArrM24299x1[1]), 6) != C7019kk.m27462to((Object) (byte) -7, 6)) {
            throw new C5102k4("Extension label is unexpected for graphics control block.");
        }
        if (C7019kk.m27462to(Byte.valueOf(bArrM24299x1[2]), 6) != C7019kk.m27462to((Object) (byte) 4, 6)) {
            throw new C5102k4("Extension block size is unexpected for graphics control block.");
        }
        if (C7019kk.m27462to(Byte.valueOf(bArrM24299x1[7]), 6) == 0) {
            return new C11888to(bArrM24299x1[3], C14069jd.m66769k4(bArrM24299x1, 4), bArrM24299x1[6]);
        }
        throw new C5102k4("Extension block terminator value is unexpected for graphics control block.");
    }

    @Override // com.aspose.slides.internal.p245la.InterfaceC6014dy
    /* JADX INFO: renamed from: k4 */
    public boolean mo22587k4(C13618wy c13618wy) {
        if (c13618wy == null) {
            throw new ArgumentNullException("streamContainer");
        }
        byte[] bArr = new byte[2];
        return c13618wy.m62860x1(bArr) == 2 && C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) == 33 && C7019kk.m27462to(Byte.valueOf(bArr[1]), 6) == 249;
    }
}
