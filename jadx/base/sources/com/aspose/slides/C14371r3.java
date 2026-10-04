package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8806su;

/* JADX INFO: renamed from: com.aspose.slides.r3 */
/* JADX INFO: loaded from: classes3.dex */
class C14371r3 {
    /* JADX INFO: renamed from: k4 */
    public static void m70014k4(IErrorBarsFormat iErrorBarsFormat, C8806su c8806su, gnb gnbVar) {
        iErrorBarsFormat.setVisible(true);
        int i = 0;
        if (c8806su.m41310dy() != null) {
            int iM36503k4 = c8806su.m41310dy().m36503k4();
            if (iM36503k4 == 2) {
                iErrorBarsFormat.setType(1);
            } else if (iM36503k4 != 3) {
                iErrorBarsFormat.setType(0);
            } else {
                iErrorBarsFormat.setType(2);
            }
        }
        if (c8806su.m41307c5() != null) {
            int iM44084k4 = c8806su.m41307c5().m44084k4();
            if (iM44084k4 == 1) {
                iErrorBarsFormat.setValueType(i);
            } else {
                if (iM44084k4 != 3) {
                    i = 4;
                    if (iM44084k4 != 4) {
                        if (iM44084k4 != 5) {
                            iErrorBarsFormat.setValueType(1);
                        }
                        iErrorBarsFormat.setValueType(i);
                    } else {
                        iErrorBarsFormat.setValueType(3);
                    }
                } else {
                    iErrorBarsFormat.setValueType(2);
                }
                iErrorBarsFormat.setValue((float) c8806su.m41320up().m29595k4());
            }
        }
        C14864yx.m74128k4(iErrorBarsFormat.getFormat(), c8806su.m41322yj(), gnbVar);
        if (c8806su.m41313jd() != null) {
            iErrorBarsFormat.setEndCap(!c8806su.m41313jd().m41467k4());
        }
        ((ErrorBarsFormat) C7019kk.m27452k4((Object) iErrorBarsFormat, ErrorBarsFormat.class)).m1423k4().m69460k4(c8806su.m41317ks());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70015k4(IErrorBarsFormat iErrorBarsFormat, final C8806su c8806su, u8s u8sVar) {
        int type = iErrorBarsFormat.getType();
        int i = 2;
        if (type == 1) {
            c8806su.m41310dy().m36504k4(2);
        } else if (type != 2) {
            c8806su.m41310dy().m36504k4(1);
        } else {
            c8806su.m41310dy().m36504k4(3);
        }
        int valueType = iErrorBarsFormat.getValueType();
        if (valueType == 0) {
            c8806su.m41307c5().m44085k4(1);
        } else if (valueType == 1) {
            c8806su.m41307c5().m44085k4(i);
            c8806su.m41309du().m29596k4(iErrorBarsFormat.getValue());
        } else if (valueType != 2) {
            i = 4;
            if (valueType != 3) {
                if (valueType == 4) {
                    c8806su.m41307c5().m44085k4(5);
                }
            }
            c8806su.m41307c5().m44085k4(i);
            c8806su.m41309du().m29596k4(iErrorBarsFormat.getValue());
        } else {
            c8806su.m41307c5().m44085k4(3);
            c8806su.m41309du().m29596k4(iErrorBarsFormat.getValue());
        }
        c8806su.m41321x1().m41466k4(!iErrorBarsFormat.hasEndCap());
        C14864yx.m74127k4(iErrorBarsFormat.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.r3.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8806su) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_ErrBarsElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return c8806su.m41312h4();
            }
        }, u8sVar, null, false);
        c8806su.m41315k4(((ErrorBarsFormat) C7019kk.m27452k4((Object) iErrorBarsFormat, ErrorBarsFormat.class)).m1423k4().m69459k4());
    }
}
