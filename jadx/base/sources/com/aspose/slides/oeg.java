package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7803gv;
import com.aspose.slides.internal.p332p7.C7859hj;
import com.aspose.slides.internal.p332p7.C9259y5;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class oeg {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f47758k4 = new C7017h4("font", "fontRef");

    /* JADX INFO: renamed from: k4 */
    public static void m68478k4(uc0 uc0Var, AbstractC4685kk<C9259y5> abstractC4685kk) {
        if (uc0Var.m71655dy()) {
            final C9259y5 c9259y5Invoke = abstractC4685kk.invoke();
            byte bM71660kk = uc0Var.m71660kk();
            if (bM71660kk == 1) {
                C14617u6.m71493x1(uc0Var.m71663to(), (C7859hj) c9259y5Invoke.m44817x1("font").m29542x1());
            } else if (bM71660kk == 2) {
                final C7803gv c7803gv = (C7803gv) c9259y5Invoke.m44817x1("fontRef").m29542x1();
                C1246ib.m7609k4(uc0Var.m71654du(), new C7394ca.k4() { // from class: com.aspose.slides.oeg.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c7803gv) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_FontReferenceElementData.AddColor(System.String)";
                    }

                    @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                    /* JADX INFO: renamed from: k4 */
                    public C7394ca mo2788k4(String str) {
                        return c7803gv.m32939k4(str);
                    }
                });
                c7803gv.m32940k4(uc0Var.m71656h4());
            }
            C1246ib.m7609k4(uc0Var.m71662m9(), new C7394ca.k4() { // from class: com.aspose.slides.oeg.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9259y5Invoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TableStyleTextStyleElementData.AddColor(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c9259y5Invoke.m44811k4(str);
                }
            });
            c9259y5Invoke.m44812k4(uc0Var.m71657k4());
            c9259y5Invoke.m44818x1(uc0Var.m71665x1());
            c9259y5Invoke.m44813k4(uc0Var.m71653c5().m70574k4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68479k4(uc0 uc0Var, C9259y5 c9259y5) {
        if (c9259y5 == null) {
            return;
        }
        C7394ca c7394caM44814kk = c9259y5.m44814kk();
        if (c7394caM44814kk == null) {
            uc0Var.m71661kk((byte) 0);
        } else {
            int iM27428k4 = f47758k4.m27428k4(c7394caM44814kk.m29539k4());
            if (iM27428k4 == 0) {
                C7859hj c7859hj = (C7859hj) c7394caM44814kk.m29542x1();
                uc0Var.m71661kk((byte) 1);
                C14617u6.m71490k4(uc0Var.m71663to(), c7859hj);
            } else {
                if (iM27428k4 != 1) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394caM44814kk.m29539k4(), "\""));
                }
                C7803gv c7803gv = (C7803gv) c7394caM44814kk.m29542x1();
                uc0Var.m71661kk((byte) 2);
                C1246ib.m7610k4(uc0Var.m71654du(), c7803gv.m32942x1());
                uc0Var.m71664to(c7803gv.m32938k4());
            }
        }
        C1246ib.m7610k4(uc0Var.m71662m9(), c9259y5.m44815to());
        uc0Var.m71658k4((byte) c9259y5.m44810k4());
        uc0Var.m71666x1((byte) c9259y5.m44816x1());
        uc0Var.m71653c5().m70575k4(c9259y5.m44809du());
    }
}
