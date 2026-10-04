package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidCastException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7966ix;
import com.aspose.slides.internal.p332p7.AbstractC8333ne;
import com.aspose.slides.internal.p332p7.C8073kc;
import com.aspose.slides.internal.p332p7.C8505pa;
import com.aspose.slides.internal.p332p7.C8601qh;
import com.aspose.slides.internal.p332p7.C8641qz;
import com.aspose.slides.internal.p332p7.C8767sf;
import com.aspose.slides.internal.p332p7.C8952ug;

/* JADX INFO: renamed from: com.aspose.slides.dc */
/* JADX INFO: loaded from: classes3.dex */
class C0894dc {
    /* JADX INFO: renamed from: k4 */
    public static void m5040k4(IAutoShape iAutoShape, AbstractC8333ne abstractC8333ne, bjs bjsVar) {
        if (abstractC8333ne == null) {
            return;
        }
        if (iAutoShape == null) {
            throw new ArgumentNullException("autoShape");
        }
        Shape shape = (Shape) C7019kk.m27452k4((Object) iAutoShape, Shape.class);
        if (shape == null) {
            throw new InvalidCastException("Cannot cast the parameter 'autoShape' to the type 'Shape'.");
        }
        C0880d4 c0880d4 = (C0880d4) C7019kk.m27452k4((Object) shape.mo272to(), C0880d4.class);
        if (c0880d4 == null) {
            throw new InvalidCastException("Cannot cast asShape.PPTUnsupportedProps to the type 'AutoShapePPTXUnsupportedProps'.");
        }
        if (C7019kk.m27469x1(abstractC8333ne, com.aspose.slides.internal.p332p7.dm6.class)) {
            iAutoShape.setUseBackgroundFill(abstractC8333ne.mo30433dy());
        } else if (C7019kk.m27469x1(abstractC8333ne, C8641qz.class)) {
            abstractC8333ne.mo30435k4().mo30406k4().m31575k4(0L);
            c0880d4.m4910k4(abstractC8333ne.mo37448c5());
            c0880d4.m4917x1(abstractC8333ne.mo37451jd());
            c0880d4.m4911k4(abstractC8333ne.mo37449ck());
            c0880d4.m4918x1(abstractC8333ne.mo37450fa());
        } else if (C7019kk.m27469x1(abstractC8333ne, C8073kc.class)) {
            c0880d4.m4913kk(abstractC8333ne.mo35277up());
            c0880d4.m4909k4(abstractC8333ne.mo35278yj());
        }
        C13677j9.m63254k4(iAutoShape, abstractC8333ne.mo30441x1(), bjsVar.m4229k4());
        AbstractC7966ix abstractC7966ixMo30435k4 = abstractC8333ne.mo30435k4();
        axn.m3764k4(iAutoShape, abstractC7966ixMo30435k4.mo30407kk(), bjsVar);
        axn.m3762k4(iAutoShape, abstractC7966ixMo30435k4.mo30406k4(), bjsVar);
        C8767sf c8767sfMo30408x1 = abstractC7966ixMo30435k4.mo30408x1();
        C14895zm.m74570k4(iAutoShape.getAutoShapeLock(), c8767sfMo30408x1.m41000kk());
        tgm.m71152k4(iAutoShape, abstractC8333ne.mo30438kk());
        c0880d4.m70450x1(c8767sfMo30408x1.m41001to());
        C8952ug c8952ugMo30432du = abstractC8333ne.mo30432du();
        if (c8952ugMo30432du != null) {
            hn7.m7241k4(((AutoShape) iAutoShape).m276ck(), c8952ugMo30432du, bjsVar.m4229k4());
        } else {
            iAutoShape.addTextFrame("");
        }
        ((AutoShape) iAutoShape).m284k4(c8767sfMo30408x1.m41002x1());
        c0880d4.m4908k4(abstractC8333ne.mo30439m9());
        shape.mo277dy();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5041k4(IAutoShape iAutoShape, final AbstractC8333ne abstractC8333ne, sdp sdpVar, C14786xh c14786xh) {
        C0880d4 c0880d4Mo268du = ((AutoShape) iAutoShape).mo268du();
        u8s u8sVarM70580k4 = sdpVar.m70580k4();
        if (!C7019kk.m27469x1(abstractC8333ne, com.aspose.slides.internal.p332p7.dm6.class)) {
            if (C7019kk.m27469x1(abstractC8333ne, C8641qz.class)) {
                c0880d4Mo268du.m69040k4(c14786xh.m73360x1());
                abstractC8333ne.mo37452k4(c0880d4Mo268du.m4916x1());
                abstractC8333ne.mo37454x1(c0880d4Mo268du.m4912kk());
                abstractC8333ne.mo37455x1(c0880d4Mo268du.m4915to());
                abstractC8333ne.mo37453kk(c0880d4Mo268du.m4902du());
            } else if (C7019kk.m27469x1(abstractC8333ne, C8073kc.class)) {
                abstractC8333ne.mo35276kk(c0880d4Mo268du.m4904h4());
                abstractC8333ne.mo35275k4(c0880d4Mo268du.m4914m9());
            }
            if (sdpVar.m70586x1() != null && iAutoShape.getTextFrame() != null && iAutoShape.getTextFrame().getTextFrameFormat().getAutofitType() == 1) {
                jq6.m63494x1(((TextFrame) iAutoShape.getTextFrame()).f3523to);
            }
            AbstractC7966ix abstractC7966ixMo30435k4 = abstractC8333ne.mo30435k4();
            axn.m3765k4(iAutoShape, abstractC7966ixMo30435k4.mo30407kk(), u8sVarM70580k4);
            axn.m3763k4(iAutoShape, abstractC7966ixMo30435k4.mo30406k4(), u8sVarM70580k4);
            final C8767sf c8767sfMo30408x1 = abstractC7966ixMo30435k4.mo30408x1();
            C14895zm.m74569k4(iAutoShape.getAutoShapeLock(), new AbstractC4685kk<C8505pa>() { // from class: com.aspose.slides.dc.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8767sfMo30408x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_NonVisualDrawingShapePropsElementData.AddSpLocks()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8505pa invoke() {
                    return c8767sfMo30408x1.m40997k4();
                }
            });
            c8767sfMo30408x1.m40998k4(c0880d4Mo268du.m70447ck());
            tgm.m71153k4(iAutoShape.getShapeStyle(), new AbstractC4685kk<C8601qh>() { // from class: com.aspose.slides.dc.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(abstractC8333ne) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.BaseCT_ShapeElementData.AddStyle()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8601qh invoke() {
                    return abstractC8333ne.mo30440to();
                }
            });
            if (iAutoShape.getPlaceholder() != null || iAutoShape.getPlaceholder().getType() != 14) {
                hn7.m7240k4(iAutoShape.getTextFrame(), new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.dc.3
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(abstractC8333ne) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.BaseCT_ShapeElementData.AddTxBody()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C8952ug invoke() {
                        return abstractC8333ne.mo30434h4();
                    }
                }, u8sVarM70580k4);
            }
            C13677j9.m63255k4(iAutoShape, abstractC8333ne.mo30441x1(), u8sVarM70580k4);
            c8767sfMo30408x1.m40999k4(iAutoShape.isTextBox());
        }
        abstractC8333ne.mo30437k4(iAutoShape.getUseBackgroundFill());
        abstractC8333ne.mo30436k4(c0880d4Mo268du.m4905k4());
        if (sdpVar.m70586x1() != null) {
            jq6.m63494x1(((TextFrame) iAutoShape.getTextFrame()).f3523to);
        }
        AbstractC7966ix abstractC7966ixMo30435k42 = abstractC8333ne.mo30435k4();
        axn.m3765k4(iAutoShape, abstractC7966ixMo30435k42.mo30407kk(), u8sVarM70580k4);
        axn.m3763k4(iAutoShape, abstractC7966ixMo30435k42.mo30406k4(), u8sVarM70580k4);
        final C8767sf c8767sfMo30408x12 = abstractC7966ixMo30435k42.mo30408x1();
        C14895zm.m74569k4(iAutoShape.getAutoShapeLock(), new AbstractC4685kk<C8505pa>() { // from class: com.aspose.slides.dc.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8767sfMo30408x12) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_NonVisualDrawingShapePropsElementData.AddSpLocks()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8505pa invoke() {
                return c8767sfMo30408x12.m40997k4();
            }
        });
        c8767sfMo30408x12.m40998k4(c0880d4Mo268du.m70447ck());
        tgm.m71153k4(iAutoShape.getShapeStyle(), new AbstractC4685kk<C8601qh>() { // from class: com.aspose.slides.dc.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(abstractC8333ne) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.BaseCT_ShapeElementData.AddStyle()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8601qh invoke() {
                return abstractC8333ne.mo30440to();
            }
        });
        if (iAutoShape.getPlaceholder() != null) {
            hn7.m7240k4(iAutoShape.getTextFrame(), new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.dc.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(abstractC8333ne) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.BaseCT_ShapeElementData.AddTxBody()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8952ug invoke() {
                    return abstractC8333ne.mo30434h4();
                }
            }, u8sVarM70580k4);
        }
        C13677j9.m63255k4(iAutoShape, abstractC8333ne.mo30441x1(), u8sVarM70580k4);
        c8767sfMo30408x12.m40999k4(iAutoShape.isTextBox());
    }
}
