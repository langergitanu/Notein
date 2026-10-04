package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.xu */
/* JADX INFO: loaded from: classes3.dex */
class C14818xu {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f50204k4 = new C7017h4("rgb", "hsl");

    /* JADX INFO: renamed from: k4 */
    public static void m73606k4(IColorEffect iColorEffect, C7394ca.k4 k4Var, com.aspose.slides.internal.p332p7.no7[] no7VarArr) {
        com.aspose.slides.internal.p332p7.nbb nbbVar = (com.aspose.slides.internal.p332p7.nbb) k4Var.mo2788k4("animClr").m29542x1();
        no7VarArr[0] = nbbVar.m37354h4();
        nbbVar.m37356k4((byte) iColorEffect.getColorSpace());
        if (iColorEffect.getFrom().getColorType() != -1) {
            C1246ib.m7612x1(iColorEffect.getFrom(), nbbVar.m37360x1());
        }
        if (iColorEffect.getTo().getColorType() != -1) {
            C1246ib.m7612x1(iColorEffect.getTo(), nbbVar.m37357kk());
        }
        nbbVar.m37361x1((byte) iColorEffect.getDirection());
        if (C14064he.m66715kk(iColorEffect.getBy().getValue0()) || C14064he.m66715kk(iColorEffect.getBy().getValue1()) || C14064he.m66715kk(iColorEffect.getBy().getValue2()) || nbbVar.m37359to() == -1) {
            return;
        }
        nbbVar.m37355k4();
        byte bM37359to = nbbVar.m37359to();
        com.aspose.slides.internal.p332p7.r7t r7tVarM37358m9 = nbbVar.m37358m9();
        if (bM37359to != 1) {
            com.aspose.slides.internal.p332p7.zmd zmdVar = (com.aspose.slides.internal.p332p7.zmd) r7tVarM37358m9.m39905k4("rgb").m29542x1();
            zmdVar.m45686k4(iColorEffect.getBy().getValue0() * 100.0f);
            zmdVar.m45690x1(iColorEffect.getBy().getValue1() * 100.0f);
            zmdVar.m45688kk(iColorEffect.getBy().getValue2() * 100.0f);
            return;
        }
        com.aspose.slides.internal.p332p7.zny znyVar = (com.aspose.slides.internal.p332p7.zny) r7tVarM37358m9.m39905k4("hsl").m29542x1();
        iColorEffect.getBy().setValue0(iColorEffect.getBy().getValue0() % 360.0f);
        if (iColorEffect.getBy().getValue0() < 0.0f) {
            iColorEffect.getBy().setValue0(iColorEffect.getBy().getValue0() + 360.0f);
        }
        znyVar.m45707k4(iColorEffect.getBy().getValue0());
        znyVar.m45711x1(iColorEffect.getBy().getValue1() * 100.0f);
        znyVar.m45709kk(iColorEffect.getBy().getValue2() * 100.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73607k4(IColorEffect iColorEffect, com.aspose.slides.internal.p332p7.nbb nbbVar) {
        IColorOffset by;
        float fM45687kk;
        if (nbbVar == null) {
            throw new InvalidOperationException();
        }
        C1246ib.m7611k4(iColorEffect.getFrom(), nbbVar.m37353dy());
        C1246ib.m7611k4(iColorEffect.getTo(), nbbVar.m37351c5());
        iColorEffect.setDirection(nbbVar.m37352du());
        iColorEffect.setColorSpace(nbbVar.m37359to());
        if (nbbVar.m37358m9() != null) {
            int iM27428k4 = f50204k4.m27428k4(nbbVar.m37358m9().m39904k4().m29539k4());
            if (iM27428k4 == 0) {
                com.aspose.slides.internal.p332p7.zmd zmdVar = (com.aspose.slides.internal.p332p7.zmd) nbbVar.m37358m9().m39904k4().m29542x1();
                iColorEffect.getBy().setValue0(zmdVar.m45685k4() / 100.0f);
                iColorEffect.getBy().setValue1(zmdVar.m45689x1() / 100.0f);
                by = iColorEffect.getBy();
                fM45687kk = zmdVar.m45687kk();
            } else {
                if (iM27428k4 != 1) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", nbbVar.m37358m9().m39904k4().m29539k4(), "\""));
                }
                com.aspose.slides.internal.p332p7.zny znyVar = (com.aspose.slides.internal.p332p7.zny) nbbVar.m37358m9().m39904k4().m29542x1();
                iColorEffect.getBy().setValue0(znyVar.m45706k4());
                iColorEffect.getBy().setValue0(iColorEffect.getBy().getValue0() % 360.0f);
                if (iColorEffect.getBy().getValue0() < 0.0f) {
                    iColorEffect.getBy().setValue0(iColorEffect.getBy().getValue0() + 360.0f);
                }
                iColorEffect.getBy().setValue1(znyVar.m45710x1() / 100.0f);
                by = iColorEffect.getBy();
                fM45687kk = znyVar.m45708kk();
            }
            by.setValue2(fM45687kk / 100.0f);
        }
    }
}
