package com.aspose.slides.internal.p208jl;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p185il.C5102k4;
import com.aspose.slides.internal.p245la.C6013du;
import com.aspose.slides.internal.p245la.InterfaceC6018m9;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p470w5.C11886k4;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.jl.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5501k4 extends AbstractC5504x1 {
    @Override // com.aspose.slides.internal.p245la.InterfaceC6014dy
    /* JADX INFO: renamed from: k4 */
    public InterfaceC6018m9 mo22586k4(C13618wy c13618wy, InterfaceC6901du interfaceC6901du) {
        byte[] bArrM24299x1 = C6013du.m24299x1(c13618wy, 14);
        if (C7019kk.m27462to(Byte.valueOf(bArrM24299x1[0]), 6) != C7019kk.m27462to((Object) (byte) 33, 6)) {
            throw new C5102k4("Extension introducer is unexpected for gif application extension block.");
        }
        if (C7019kk.m27462to(Byte.valueOf(bArrM24299x1[1]), 6) != C7019kk.m27462to((Object) (byte) -1, 6)) {
            throw new C5102k4("Extension label is unexpected for gif application extension block.");
        }
        int iM27462to = C7019kk.m27462to(Byte.valueOf(bArrM24299x1[2]), 6);
        if (iM27462to != C7019kk.m27462to((Object) (byte) 11, 6)) {
            if (!AbstractC6747ar.m26650yj().mo26682x1(bArrM24299x1, 3, 11).equals("ICCRGBG1012") || iM27462to <= 11) {
                throw new C5102k4("Block size is incorrect for gif application extension block.");
            }
            c13618wy.m62854k4(iM27462to - 11, 1);
        }
        String strMo26682x1 = AbstractC6747ar.m26650yj().mo26682x1(bArrM24299x1, 3, 8);
        byte[] bArr = new byte[3];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrM24299x1), 11, AbstractC14092to.m67208k4((Object) bArr), 0, 3);
        return new C11886k4(strMo26682x1, bArr, C6013du.m24298k4(c13618wy));
    }

    @Override // com.aspose.slides.internal.p245la.InterfaceC6014dy
    /* JADX INFO: renamed from: k4 */
    public boolean mo22587k4(C13618wy c13618wy) {
        if (c13618wy == null) {
            throw new ArgumentNullException("streamContainer");
        }
        byte[] bArr = new byte[2];
        return c13618wy.m62860x1(bArr) == 2 && C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) == C7019kk.m27462to((Object) (byte) 33, 6) && C7019kk.m27462to(Byte.valueOf(bArr[1]), 6) == C7019kk.m27462to((Object) (byte) -1, 6);
    }
}
