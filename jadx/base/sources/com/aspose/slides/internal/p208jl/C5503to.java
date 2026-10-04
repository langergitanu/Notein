package com.aspose.slides.internal.p208jl;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p185il.C5102k4;
import com.aspose.slides.internal.p245la.C6013du;
import com.aspose.slides.internal.p245la.C6017kk;
import com.aspose.slides.internal.p245la.InterfaceC6018m9;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p470w5.C11887kk;
import com.aspose.slides.internal.p550zi.C13594c5;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.jl.to */
/* JADX INFO: loaded from: classes.dex */
public class C5503to extends AbstractC5504x1 {
    @Override // com.aspose.slides.internal.p245la.InterfaceC6014dy
    /* JADX INFO: renamed from: k4 */
    public InterfaceC6018m9 mo22586k4(C13618wy c13618wy, InterfaceC6901du interfaceC6901du) {
        boolean z;
        byte b;
        int iM62847c5;
        byte[] bArrM24299x1 = C6013du.m24299x1(c13618wy, 10);
        if (C7019kk.m27462to(Byte.valueOf(bArrM24299x1[0]), 6) != 44) {
            throw new C5102k4("Extension label is unexpected for image descriptor block.");
        }
        boolean z2 = true;
        int iM66769k4 = C14069jd.m66769k4(bArrM24299x1, 1);
        int iM66769k42 = C14069jd.m66769k4(bArrM24299x1, 3);
        int iM66769k43 = C14069jd.m66769k4(bArrM24299x1, 5);
        int iM66769k44 = C14069jd.m66769k4(bArrM24299x1, 7);
        int i = 9;
        byte b2 = bArrM24299x1[9];
        InterfaceC6901du interfaceC6901duM24294k4 = (C7019kk.m27462to(Byte.valueOf(b2), 6) & 128) != 0 ? C6013du.m24294k4(c13618wy, 2 << (C7019kk.m27462to(Byte.valueOf(b2), 6) & 7)) : null;
        byte bM27442k4 = C7019kk.m27442k4(Integer.valueOf(c13618wy.m62847c5()), 9);
        long jM62859kk = c13618wy.m62859kk();
        long jM62853k4 = c13618wy.m62853k4();
        long jM27438h4 = jM62853k4;
        byte bM27442k42 = 1;
        while (C7019kk.m27462to(Byte.valueOf(bM27442k42), 6) != 0 && (iM62847c5 = c13618wy.m62847c5()) >= 0) {
            long j = jM27438h4 + 1;
            bM27442k42 = C7019kk.m27442k4(Integer.valueOf(iM62847c5), i);
            b = b2;
            long jM67492kk = C14116yg.m67492kk(C7019kk.m27438h4(Byte.valueOf(bM27442k42), 6) + j, jM62859kk) - j;
            long j2 = jM62859kk;
            if (C7019kk.m27462to(Byte.valueOf(bM27442k42), 6) != jM67492kk) {
                z = true;
                c13618wy.m62854k4(jM67492kk, 1);
                break;
            }
            c13618wy.m62854k4(C7019kk.m27438h4(Byte.valueOf(bM27442k42), 6), 1);
            jM27438h4 = C7019kk.m27438h4(Byte.valueOf(bM27442k42), 6) + j;
            z2 = true;
            jM62859kk = j2;
            b2 = b;
            i = 9;
        }
        z = z2;
        b = b2;
        boolean z3 = z;
        C6017kk c6017kk = new C6017kk(c13618wy, jM62853k4, (C7019kk.m27462to(Byte.valueOf(b), 6) & 64) != 0 ? z : false, new C13594c5(C11887kk.m55488kk(interfaceC6901duM24294k4, interfaceC6901du).mo27032x1()), iM66769k43, iM66769k44, C7019kk.m27462to(Byte.valueOf(bM27442k4), 6));
        boolean z4 = (C7019kk.m27462to(Byte.valueOf(b), 6) & 32) > 0 ? z3 : false;
        if ((C7019kk.m27462to(Byte.valueOf(b), 6) & 64) <= 0) {
            z3 = false;
        }
        C11887kk c11887kk = new C11887kk(c6017kk, iM66769k4, iM66769k42, iM66769k43, iM66769k44, interfaceC6901duM24294k4, z4, z3, bM27442k4);
        c11887kk.m62729k4(c13618wy);
        return c11887kk;
    }

    @Override // com.aspose.slides.internal.p245la.InterfaceC6014dy
    /* JADX INFO: renamed from: k4 */
    public boolean mo22587k4(C13618wy c13618wy) {
        if (c13618wy != null) {
            return c13618wy.m62847c5() == 44;
        }
        throw new ArgumentNullException("streamContainer");
    }
}
