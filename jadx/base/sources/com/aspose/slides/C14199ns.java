package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7892hz;
import com.aspose.slides.internal.p332p7.C8403o4;
import com.aspose.slides.internal.p332p7.C8439og;
import com.aspose.slides.internal.p332p7.C8629qv;
import com.aspose.slides.internal.p332p7.C9121wm;
import com.aspose.slides.internal.p332p7.C9302yq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ns */
/* JADX INFO: loaded from: classes3.dex */
class C14199ns {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f47607k4 = new C7017h4("lin", "path");

    /* JADX INFO: renamed from: k4 */
    public static void m68195k4(IGradientFormat iGradientFormat, C8403o4 c8403o4) {
        if (c8403o4 == null) {
            return;
        }
        GradientFormat gradientFormat = (GradientFormat) iGradientFormat;
        gradientFormat.setTileFlip(c8403o4.m37988kk());
        gradientFormat.m1613to().m4220k4(ht5.m7291k4(c8403o4.m37989m9()).Clone());
        gradientFormat.setGradientDirection(-1);
        if (c8403o4.m37983h4() != null) {
            int iM27428k4 = f47607k4.m27428k4(c8403o4.m37983h4().m29539k4());
            if (iM27428k4 == 0) {
                C7892hz c7892hz = (C7892hz) c8403o4.m37983h4().m29542x1();
                gradientFormat.setGradientShape((byte) 0);
                gradientFormat.setLinearGradientAngle(c7892hz.m33744k4());
                gradientFormat.setLinearGradientScaled(c7892hz.m33747x1());
            } else {
                if (iM27428k4 != 1) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c8403o4.m37983h4().m29539k4(), "\""));
                }
                C9302yq c9302yq = (C9302yq) c8403o4.m37983h4().m29542x1();
                int iM45090x1 = c9302yq.m45090x1();
                if (iM45090x1 == 1) {
                    gradientFormat.setGradientShape((byte) 3);
                } else if (iM45090x1 == 2) {
                    gradientFormat.setGradientShape((byte) 2);
                } else if (iM45090x1 != 3) {
                    gradientFormat.setGradientShape((byte) -1);
                } else {
                    gradientFormat.setGradientShape((byte) 1);
                }
                if (c9302yq.m45089kk() != null) {
                    gradientFormat.m1607k4(c9302yq.m45089kk().m39690k4() / 100.0f, c9302yq.m45089kk().m39696x1() / 100.0f, (1.0f - (c9302yq.m45089kk().m39692kk() / 100.0f)) - (c9302yq.m45089kk().m39690k4() / 100.0f), (1.0f - (c9302yq.m45089kk().m39694to() / 100.0f)) - (c9302yq.m45089kk().m39696x1() / 100.0f));
                } else {
                    gradientFormat.m1607k4(0.0f, 0.0f, 1.0f, 1.0f);
                }
            }
        }
        gradientFormat.getGradientStops().clear();
        if (c8403o4.m37982du() != null) {
            for (C8439og c8439og : c8403o4.m37982du().m43753x1()) {
                IGradientStop iGradientStopM1628to = ((GradientStopCollection) gradientFormat.getGradientStops()).m1628to();
                iGradientStopM1628to.setPosition(c8439og.m38246k4() / 100.0f);
                C1246ib.m7610k4(iGradientStopM1628to.getColor(), c8439og.m38249x1());
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m68196x1(IGradientFormat iGradientFormat, C8403o4 c8403o4) {
        int i;
        if (iGradientFormat.getGradientStops().size() >= 2) {
            C9121wm c9121wmM37985k4 = c8403o4.m37985k4();
            IGenericEnumerator<IGradientStop> it = iGradientFormat.getGradientStops().iterator();
            while (it.hasNext()) {
                try {
                    IGradientStop next = it.next();
                    final C8439og c8439ogM43752k4 = c9121wmM37985k4.m43752k4();
                    c8439ogM43752k4.m38248k4(next.getPosition() * 100.0f);
                    C1246ib.m7609k4(next.getColor(), new C7394ca.k4() { // from class: com.aspose.slides.ns.1
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c8439ogM43752k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_GradientStopElementData.AddColor(System.String)";
                        }

                        @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                        /* JADX INFO: renamed from: k4 */
                        public C7394ca mo2788k4(String str) {
                            return c8439ogM43752k4.m38247k4(str);
                        }
                    });
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        c8403o4.m37987k4(iGradientFormat.getTileFlip());
        if (iGradientFormat.getGradientShape() == 0) {
            C7892hz c7892hz = (C7892hz) c8403o4.m37984k4("lin").m29542x1();
            c7892hz.m33746k4(iGradientFormat.getLinearGradientAngle());
            c7892hz.m33745k4(iGradientFormat.getLinearGradientScaled());
        } else if (iGradientFormat.getGradientShape() != -1) {
            final C9302yq c9302yq = (C9302yq) c8403o4.m37984k4("path").m29542x1();
            byte gradientShape = iGradientFormat.getGradientShape();
            if (gradientShape != -1) {
                i = 3;
                if (gradientShape != 1) {
                    if (gradientShape == 2) {
                        c9302yq.m45088k4(2);
                    } else {
                        if (gradientShape != 3) {
                            throw new Exception();
                        }
                        c9302yq.m45088k4(1);
                    }
                }
                ht5.m7292k4(((GradientFormat) iGradientFormat).m1605h4().Clone(), new AbstractC4685kk<C8629qv>() { // from class: com.aspose.slides.ns.2
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c9302yq) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_PathShadePropertiesElementData.AddFillToRect()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C8629qv invoke() {
                        return c9302yq.m45087k4();
                    }
                });
            } else {
                i = 0;
            }
            c9302yq.m45088k4(i);
            ht5.m7292k4(((GradientFormat) iGradientFormat).m1605h4().Clone(), new AbstractC4685kk<C8629qv>() { // from class: com.aspose.slides.ns.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9302yq) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_PathShadePropertiesElementData.AddFillToRect()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8629qv invoke() {
                    return c9302yq.m45087k4();
                }
            });
        }
        ohe oheVarClone = ((GradientFormat) iGradientFormat).m1613to().m4218k4().Clone();
        if (bia.m4216x1(oheVarClone.Clone())) {
            ht5.m7293k4(oheVarClone.Clone(), c8403o4.m37991x1());
        }
    }
}
