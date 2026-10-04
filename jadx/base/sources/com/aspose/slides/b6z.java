package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7317be;
import com.aspose.slides.internal.p332p7.C7447cx;
import com.aspose.slides.internal.p332p7.C8491p4;
import com.aspose.slides.internal.p332p7.C8638qy;
import com.aspose.slides.internal.p332p7.C8820sx;
import com.aspose.slides.internal.p332p7.C9226xq;
import com.aspose.slides.p559ms.System.AbstractC14085qw;

/* JADX INFO: loaded from: classes3.dex */
class b6z {

    /* JADX INFO: renamed from: com.aspose.slides.b6z$k4 */
    public static abstract class AbstractC0806k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract IThreeDFormat mo3782k4();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4032k4(IThreeDFormat iThreeDFormat, AbstractC4685kk<C8820sx> abstractC4685kk, AbstractC4685kk<C8638qy> abstractC4685kk2, AbstractC4685kk<C7317be> abstractC4685kk3) {
        boolean z;
        if (iThreeDFormat == null) {
            return;
        }
        ThreeDFormat threeDFormat = (ThreeDFormat) iThreeDFormat;
        spu spuVarM3011to = threeDFormat.m3011to();
        if (threeDFormat.m3005h4() == -1 && threeDFormat.m3010m9() == -1) {
            z = false;
        } else {
            final C8820sx c8820sxInvoke = abstractC4685kk.invoke();
            C0699a0.m3135x1(iThreeDFormat.getCamera(), c8820sxInvoke.m41422x1());
            jul.m63554x1(iThreeDFormat.getLightRig(), c8820sxInvoke.m41420kk());
            C13814ly.m64613k4(spuVarM3011to.m70721kk(), new AbstractC4685kk<C9226xq>() { // from class: com.aspose.slides.b6z.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8820sxInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_Scene3DElementData.AddBackdrop()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C9226xq invoke() {
                    return c8820sxInvoke.m41419k4();
                }
            });
            z = true;
        }
        if (abstractC4685kk2 != null) {
            if ((z && iThreeDFormat.getMaterial() != -1) || ((iThreeDFormat.getMaterial() != -1 && iThreeDFormat.getMaterial() != 14) || iThreeDFormat.getContourWidth() != 0.0d || iThreeDFormat.getExtrusionHeight() != 0.0d || threeDFormat.m3004dy() != -1 || threeDFormat.m3001c5() != -1)) {
                final C8638qy c8638qyInvoke = abstractC4685kk2.invoke();
                c8638qyInvoke.m39760kk(iThreeDFormat.getContourWidth());
                c8638qyInvoke.m39764x1(iThreeDFormat.getExtrusionHeight());
                c8638qyInvoke.m39757k4(iThreeDFormat.getDepth());
                c8638qyInvoke.m39758k4(iThreeDFormat.getMaterial() != -1 ? iThreeDFormat.getMaterial() : 14);
                k7a.m63710k4(iThreeDFormat.getBevelTop(), new AbstractC4685kk<C8491p4>() { // from class: com.aspose.slides.b6z.3
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8638qyInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_Shape3DElementData.AddBevelT()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C8491p4 invoke() {
                        return c8638qyInvoke.m39756k4();
                    }
                });
                k7a.m63710k4(iThreeDFormat.getBevelBottom(), new AbstractC4685kk<C8491p4>() { // from class: com.aspose.slides.b6z.4
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8638qyInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_Shape3DElementData.AddBevelB()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C8491p4 invoke() {
                        return c8638qyInvoke.m39763x1();
                    }
                });
                C1246ib.m7607k4(iThreeDFormat.getExtrusionColor(), new AbstractC4685kk<C7447cx>() { // from class: com.aspose.slides.b6z.5
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8638qyInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_Shape3DElementData.AddExtrusionClr()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C7447cx invoke() {
                        return c8638qyInvoke.m39759kk();
                    }
                });
                C1246ib.m7607k4(iThreeDFormat.getContourColor(), new AbstractC4685kk<C7447cx>() { // from class: com.aspose.slides.b6z.6
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8638qyInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_Shape3DElementData.AddContourClr()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C7447cx invoke() {
                        return c8638qyInvoke.m39762to();
                    }
                });
            }
        }
        if (spuVarM3011to.m70720k4()) {
            abstractC4685kk3.invoke().m28866k4(spuVarM3011to.m70723x1());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4033k4(final IThreeDFormat iThreeDFormat, C8820sx c8820sx, C8638qy c8638qy, C7317be c7317be) {
        m4034k4(new AbstractC0806k4() { // from class: com.aspose.slides.b6z.1
            @Override // com.aspose.slides.b6z.AbstractC0806k4
            /* JADX INFO: renamed from: k4 */
            public IThreeDFormat mo3782k4() {
                return iThreeDFormat;
            }
        }, c8820sx, c8638qy, c7317be);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4034k4(AbstractC0806k4 abstractC0806k4, C8820sx c8820sx, C8638qy c8638qy, C7317be c7317be) {
        if (c8638qy != null) {
            IThreeDFormat iThreeDFormatMo3782k4 = abstractC0806k4.mo3782k4();
            iThreeDFormatMo3782k4.setContourWidth(c8638qy.m39761m9());
            iThreeDFormatMo3782k4.setExtrusionHeight(c8638qy.m39754h4());
            iThreeDFormatMo3782k4.setDepth(c8638qy.m39751du());
            iThreeDFormatMo3782k4.setMaterial(c8638qy.m39752dy());
            k7a.m63711k4(iThreeDFormatMo3782k4.getBevelTop(), c8638qy.m39749c5());
            k7a.m63711k4(iThreeDFormatMo3782k4.getBevelBottom(), c8638qy.m39755jd());
            C1246ib.m7611k4(iThreeDFormatMo3782k4.getContourColor(), c8638qy.m39753fa());
            C1246ib.m7611k4(iThreeDFormatMo3782k4.getExtrusionColor(), c8638qy.m39750ck());
        }
        if (c8820sx != null) {
            IThreeDFormat iThreeDFormatMo3782k42 = abstractC0806k4.mo3782k4();
            C0699a0.m3134k4(iThreeDFormatMo3782k42.getCamera(), c8820sx.m41422x1());
            jul.m63553k4(iThreeDFormatMo3782k42.getLightRig(), c8820sx.m41420kk());
            C13814ly.m64614k4(((ThreeDFormat) iThreeDFormatMo3782k42).m3011to().m70721kk(), c8820sx.m41421to());
        }
        if (c7317be != null) {
            spu spuVarM3011to = ((ThreeDFormat) abstractC0806k4.mo3782k4()).m3011to();
            spuVarM3011to.m70719k4(true);
            spuVarM3011to.m70717k4((float) c7317be.m28865k4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m4035k4(IThreeDFormat iThreeDFormat, boolean z) {
        ThreeDFormat threeDFormat = (ThreeDFormat) iThreeDFormat;
        return threeDFormat.m3009k4(z) || threeDFormat.m3011to().m70720k4();
    }
}
