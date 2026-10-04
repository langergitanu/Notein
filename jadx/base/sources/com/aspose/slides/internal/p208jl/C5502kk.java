package com.aspose.slides.internal.p208jl;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p185il.C5102k4;
import com.aspose.slides.internal.p245la.C6013du;
import com.aspose.slides.internal.p245la.InterfaceC6018m9;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p470w5.C11889x1;
import com.aspose.slides.internal.p550zi.C13618wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.jl.kk */
/* JADX INFO: loaded from: classes.dex */
public class C5502kk extends AbstractC5504x1 {
    @Override // com.aspose.slides.internal.p245la.InterfaceC6014dy
    /* JADX INFO: renamed from: k4 */
    public InterfaceC6018m9 mo22586k4(C13618wy c13618wy, InterfaceC6901du interfaceC6901du) {
        byte[] bArrM24299x1 = C6013du.m24299x1(c13618wy, 2);
        if (C7019kk.m27462to(Byte.valueOf(bArrM24299x1[0]), 6) != C7019kk.m27462to((Object) (byte) 33, 6)) {
            throw new C5102k4("Extension introducer is unexpected for gif comment block.");
        }
        if (C7019kk.m27462to(Byte.valueOf(bArrM24299x1[1]), 6) != C7019kk.m27462to((Object) (byte) -2, 6)) {
            throw new C5102k4("Extension label is unexpected for gif comment block.");
        }
        byte[] bArrM24298k4 = C6013du.m24298k4(c13618wy);
        return new C11889x1(AbstractC6747ar.m26650yj().mo26682x1(bArrM24298k4, 0, bArrM24298k4.length));
    }

    @Override // com.aspose.slides.internal.p245la.InterfaceC6014dy
    /* JADX INFO: renamed from: k4 */
    public boolean mo22587k4(C13618wy c13618wy) {
        if (c13618wy == null) {
            throw new ArgumentNullException("streamContainer");
        }
        byte[] bArr = new byte[2];
        return c13618wy.m62860x1(bArr) == 2 && C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) == C7019kk.m27462to((Object) (byte) 33, 6) && C7019kk.m27462to(Byte.valueOf(bArr[1]), 6) == C7019kk.m27462to((Object) (byte) -2, 6);
    }
}
