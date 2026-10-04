package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7330bl;
import com.aspose.slides.internal.p332p7.C7338bo;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7422cn;
import com.aspose.slides.internal.p332p7.C8407o6;
import com.aspose.slides.internal.p332p7.C9408zw;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: loaded from: classes3.dex */
class ab7 {
    /* JADX INFO: renamed from: k4 */
    public static void m3465k4(ldn ldnVar, AbstractC4685kk<C7330bl> abstractC4685kk, u8s u8sVar) {
        if (ldnVar == null) {
            throw new ArgumentNullException("runProperties");
        }
        if (abstractC4685kk == null) {
            throw new ArgumentNullException("addDelegate");
        }
        ldn ldnVar2 = new ldn();
        C7330bl c7330blInvoke = abstractC4685kk.invoke();
        if (ldnVar.m64372h4() != ldnVar2.m64372h4()) {
            c7330blInvoke.m28982x1(diq.m5107k4(ldnVar.m64372h4()));
        }
        if (ldnVar.m64371du().m67302x1()) {
            C7422cn c7422cn = new C7422cn();
            c7422cn.m29689k4(ldnVar.m64371du().m67297k4().byteValue());
            c7330blInvoke.m28976k4(c7422cn);
        }
        if (ldnVar.m64376k4() != ldnVar2.m64376k4()) {
            c7330blInvoke.m28978k4(diq.m5107k4(ldnVar.m64376k4()));
        }
        if (ldnVar.m64384x1() != ldnVar2.m64384x1()) {
            c7330blInvoke.m28975k4(new C7394ca("nor", diq.m5107k4(ldnVar.m64384x1())));
        }
        if (ldnVar.m64378kk() != ldnVar2.m64378kk()) {
            C7338bo c7338bo = new C7338bo();
            c7338bo.m29020k4(C14649ut.m71890fa(ldnVar.m64378kk()));
            c7330blInvoke.m28974k4(c7338bo);
        }
        if (ldnVar.m64381to() != ldnVar2.m64381to()) {
            C8407o6 c8407o6 = new C8407o6();
            c8407o6.m38024k4(C14649ut.m71901yj(ldnVar.m64381to()));
            c7330blInvoke.m28977k4(c8407o6);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3466k4(ldn ldnVar, C7330bl c7330bl, gnb gnbVar) {
        if (c7330bl.m28972h4() != null) {
            ldnVar.m64379kk(c7330bl.m28972h4().m45981k4() == 1 || c7330bl.m28972h4().m45981k4() == 0);
        }
        if (c7330bl.m28971du() != null) {
            ldnVar.m64374k4(new C14093tq<>(Byte.valueOf(c7330bl.m28971du().m29688k4())));
        }
        if (c7330bl.m28973k4() != null) {
            ldnVar.m64375k4(c7330bl.m28973k4().m45981k4() == 1 || c7330bl.m28973k4().m45981k4() == 0);
        }
        if (c7330bl.m28980to() != null) {
            ldnVar.m64383x1(diq.m5109x1((C9408zw) C7019kk.m27452k4((Object) c7330bl.m28980to().m29542x1(), C9408zw.class)));
        }
        if (c7330bl.m28981x1() != null) {
            ldnVar.m64373k4(C14649ut.m71887ck(c7330bl.m28981x1().m29019k4()));
        }
        if (c7330bl.m28979kk() != null) {
            ldnVar.m64382x1(C14649ut.m71899up(c7330bl.m28979kk().m38023k4()));
        }
    }
}
