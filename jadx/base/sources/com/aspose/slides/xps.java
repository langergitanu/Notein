package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7516dv;
import com.aspose.slides.internal.p332p7.C8401o2;
import com.aspose.slides.internal.p332p7.C8629qv;
import com.aspose.slides.internal.p332p7.C9220xo;
import com.aspose.slides.internal.p332p7.C9373zi;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class xps {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f50176k4 = new C7017h4("tile", "stretch");

    /* JADX INFO: renamed from: k4 */
    public static void m73532k4(PictureFillFormat pictureFillFormat, C9220xo c9220xo, gnb gnbVar) {
        Cell cell;
        if (c9220xo == null) {
            return;
        }
        zn7 zn7VarM2255m9 = pictureFillFormat.m2255m9();
        dr1.m5221k4(pictureFillFormat.getPicture(), c9220xo.m44547du(), gnbVar);
        C8629qv c8629qvM44548h4 = c9220xo.m44548h4();
        if (c8629qvM44548h4 != null) {
            pictureFillFormat.m2253k4(new pj5(c8629qvM44548h4.m39690k4(), c8629qvM44548h4.m39696x1(), c8629qvM44548h4.m39692kk(), c8629qvM44548h4.m39694to()));
        }
        pictureFillFormat.setDpi(c9220xo.m44553kk() == 4294967295L ? -1 : (int) c9220xo.m44553kk());
        pictureFillFormat.m2254k4(c9220xo.m44555to() != 0);
        if (C7019kk.m27469x1(pictureFillFormat.getParent_IPresentationComponent(), Background.class)) {
            pictureFillFormat.setPictureFillMode(0);
            zn7VarM2255m9.m74647k4(tbp.f49088kk.Clone());
        } else {
            pictureFillFormat.setPictureFillMode(1);
            zn7VarM2255m9.m74645k4(new ohe(oju.f47834kk.Clone(), oju.f47835to.Clone()));
        }
        if (c9220xo.m44554m9() != null) {
            int iM27428k4 = f50176k4.m27428k4(c9220xo.m44554m9().m29539k4());
            if (iM27428k4 != 0) {
                if (iM27428k4 != 1) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c9220xo.m44554m9().m29539k4(), "\""));
                }
                C9373zi c9373zi = (C9373zi) c9220xo.m44554m9().m29542x1();
                pictureFillFormat.setPictureFillMode(1);
                zn7VarM2255m9.m74645k4(ht5.m7291k4(c9373zi.m45632x1()).Clone());
                return;
            }
            C7516dv c7516dv = (C7516dv) c9220xo.m44554m9().m29542x1();
            pictureFillFormat.setPictureFillMode(0);
            zn7VarM2255m9.m74647k4(new tbp(C14044b3.m66437kk(c7516dv.m30668k4()) ? 0.0d : c7516dv.m30668k4(), C14044b3.m66437kk(c7516dv.m30675x1()) ? 0.0d : c7516dv.m30675x1()));
            zn7VarM2255m9.m74646k4(new oju(C14064he.m66715kk(c7516dv.m30673kk()) ? 1.0f : c7516dv.m30673kk() / 100.0f, C14064he.m66715kk(c7516dv.m30674to()) ? 1.0f : c7516dv.m30674to() / 100.0f));
            zn7VarM2255m9.m74644k4(c7516dv.m30666du() == -1 ? 0 : c7516dv.m30666du());
            zn7VarM2255m9.m74643k4(c7516dv.m30667h4() != -1 ? c7516dv.m30667h4() : (byte) 0);
            return;
        }
        if (!gnbVar.m6800x6() || (cell = (Cell) C7019kk.m27452k4((Object) pictureFillFormat.getParent_IPresentationComponent(), Cell.class)) == null || cell.getWidth() <= 0.0d || cell.getHeight() <= 0.0d) {
            return;
        }
        double width = cell.getWidth();
        double height = cell.getHeight();
        double width2 = C14044b3.m66437kk(cell.m461ck().getBorderLeft().getWidth()) ? 0.0d : cell.m461ck().getBorderLeft().getWidth() / 2.0d;
        double width3 = C14044b3.m66437kk(cell.m461ck().getBorderRight().getWidth()) ? 0.0d : cell.m461ck().getBorderRight().getWidth() / 2.0d;
        double width4 = C14044b3.m66437kk(cell.m461ck().getBorderTop().getWidth()) ? 0.0d : cell.m461ck().getBorderTop().getWidth() / 2.0d;
        double width5 = C14044b3.m66437kk(cell.m461ck().getBorderBottom().getWidth()) ? 0.0d : cell.m461ck().getBorderBottom().getWidth() / 2.0d;
        C8629qv c8629qv = new C8629qv();
        c8629qv.m39691k4((-((float) ((cell.getOffsetX() + width2) / width))) * 100.0f);
        c8629qv.m39697x1((-((float) ((cell.getOffsetY() + width4) / height))) * 100.0f);
        c8629qv.m39693kk((-((float) (((((double) cell.getTable().getWidth()) - (cell.getOffsetX() + width)) + width3) / width))) * 100.0f);
        c8629qv.m39695to((-((float) (((((double) cell.getTable().getHeight()) - (cell.getOffsetY() + height)) + width5) / height))) * 100.0f);
        zn7VarM2255m9.m74645k4(ht5.m7291k4(c8629qv).Clone());
        pictureFillFormat.setPictureFillMode(1);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73533k4(PictureFillFormat pictureFillFormat, final C9220xo c9220xo, u8s u8sVar) {
        zn7 zn7VarM2255m9 = pictureFillFormat.m2255m9();
        c9220xo.m44552k4(pictureFillFormat.getDpi() != 96 ? 4294967295L & ((long) pictureFillFormat.getDpi()) : 4294967295L);
        if (!pictureFillFormat.m2247du()) {
            c9220xo.m44551k4((byte) 0);
        }
        dr1.m5218k4(pictureFillFormat.getPicture(), new AbstractC4685kk<C8401o2>() { // from class: com.aspose.slides.xps.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9220xo) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_BlipFillPropertiesElementData.AddBlip()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8401o2 invoke() {
                return c9220xo.m44550k4();
            }
        }, u8sVar);
        if (bia.m4216x1(zn7VarM2255m9.m74652x1().m4218k4().Clone())) {
            c9220xo.m44556x1();
            pj5 pj5VarClone = pictureFillFormat.m2256to().Clone();
            c9220xo.m44548h4().m39691k4(pj5VarClone.f48081x1);
            c9220xo.m44548h4().m39697x1(pj5VarClone.f48079kk);
            c9220xo.m44548h4().m39693kk(pj5VarClone.f48080to);
            c9220xo.m44548h4().m39695to(pj5VarClone.f48078du);
        }
        if (pictureFillFormat.getPictureFillMode() != 0) {
            if (pictureFillFormat.getPictureFillMode() == 1) {
                final C9373zi c9373zi = (C9373zi) c9220xo.m44549k4("stretch").m29542x1();
                ht5.m7292k4(zn7VarM2255m9.m74642k4().Clone(), new AbstractC4685kk<C8629qv>() { // from class: com.aspose.slides.xps.2
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c9373zi) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_StretchInfoPropertiesElementData.AddFillRect()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C8629qv invoke() {
                        return c9373zi.m45631k4();
                    }
                });
                return;
            }
            return;
        }
        C7516dv c7516dv = (C7516dv) c9220xo.m44549k4("tile").m29542x1();
        c7516dv.m30670k4(zn7VarM2255m9.m74649kk().f49090k4);
        c7516dv.m30676x1(zn7VarM2255m9.m74649kk().f49091x1);
        c7516dv.m30671k4(zn7VarM2255m9.m74651to().f47836k4 * 100.0f);
        c7516dv.m30677x1(zn7VarM2255m9.m74651to().f47837x1 * 100.0f);
        c7516dv.m30672k4(zn7VarM2255m9.m74639du());
        c7516dv.m30669k4(zn7VarM2255m9.m74641h4());
    }
}
