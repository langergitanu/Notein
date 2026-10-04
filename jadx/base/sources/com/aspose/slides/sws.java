package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7462d6;
import com.aspose.slides.internal.p332p7.C7484di;
import com.aspose.slides.internal.p332p7.C7707fw;
import com.aspose.slides.internal.p332p7.C7733g6;
import com.aspose.slides.internal.p332p7.C8245m6;
import com.aspose.slides.internal.p332p7.C8397nz;
import com.aspose.slides.internal.p332p7.C8541pr;
import com.aspose.slides.internal.p332p7.C8618qp;
import com.aspose.slides.internal.p332p7.C8727s0;
import com.aspose.slides.internal.p332p7.C8985uy;
import com.aspose.slides.internal.p332p7.C9333z0;
import com.aspose.slides.internal.p332p7.C9365zg;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13970rs;
import com.aspose.slides.p559ms.System.Xml.C13981tl;

/* JADX INFO: loaded from: classes3.dex */
class sws {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f48939k4 = new C7017h4("custGeom", "prstGeom", "lineSketchNone", "lineSketchCurved", "lineSketchFreehand", "lineSketchScribble");

    /* JADX INFO: renamed from: k4 */
    public static C13981tl m70813k4(AbstractC7414ck abstractC7414ck) {
        C13981tl documentElement;
        if (abstractC7414ck == null || abstractC7414ck.mo29643k4().length == 0 || (documentElement = com.aspose.slides.internal.p332p7.d0s.m29999k4(abstractC7414ck, "{C807C97D-BFC1-408E-A445-0C87EB9F89A2}").getDocumentElement()) == null) {
            return null;
        }
        return (C13981tl) fyw.m6354k4(documentElement, "lineSketchStyleProps", "http://schemas.microsoft.com/office/drawing/2018/sketchyshapes");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70814k4(ISketchFormat iSketchFormat, AbstractC7414ck abstractC7414ck) {
        C13981tl c13981tlM70813k4 = m70813k4(abstractC7414ck);
        if (c13981tlM70813k4 != null) {
            C13970rs c13970rs = new C13970rs(c13981tlM70813k4);
            c13970rs.mo65026h4();
            C7462d6 c7462d6 = new C7462d6(c13970rs);
            SketchFormat sketchFormat = (SketchFormat) iSketchFormat;
            if (c7462d6.m30151kk() != null) {
                sketchFormat.m2676k4(new C0735a7());
                int iM27428k4 = f48939k4.m27428k4(c7462d6.m30151kk().m29539k4());
                if (iM27428k4 == 0) {
                    C7707fw c7707fw = (C7707fw) c7462d6.m30151kk().m29542x1();
                    Dictionary[] dictionaryArr = {null};
                    sketchFormat.m2670du().m3322k4(C0914ds.m5238k4(c7707fw.m32102h4(), (C13791lr[]) null, (Dictionary<String, Integer>[]) dictionaryArr));
                    Dictionary dictionary = dictionaryArr[0];
                    sketchFormat.m2670du().m3317k4(0);
                    List<C0899df> listM5226k4 = C0914ds.m5226k4(c7707fw.m32106m9(), (Dictionary<String, Integer>) dictionary);
                    sketchFormat.m2670du().m3321k4(C0914ds.m5236k4(c7707fw.m32098c5(), (Dictionary<String, Integer>) dictionary, listM5226k4));
                    sketchFormat.m2670du().m3323k4(C0914ds.m5239k4(c7707fw.m32101dy(), (Dictionary<String, Integer>) dictionary, listM5226k4));
                    C8727s0 c8727s0M32103jd = c7707fw.m32103jd();
                    if (c8727s0M32103jd != null) {
                        sketchFormat.m2670du().m3324k4(new C14843yd[1]);
                        sketchFormat.m2670du().m3329m9()[0] = new C14843yd(c8727s0M32103jd.m40653k4(), c8727s0M32103jd.m40659x1(), dictionary, listM5226k4);
                        sketchFormat.m2670du().m3332x1(new C14843yd[1]);
                        sketchFormat.m2670du().m3310dy()[0] = new C14843yd(c8727s0M32103jd.m40655kk(), c8727s0M32103jd.m40657to(), dictionary, listM5226k4);
                    }
                    C8245m6 c8245m6M32099ck = c7707fw.m32099ck();
                    if (c8245m6M32099ck != null) {
                        List list = new List();
                        for (C8541pr c8541pr : c8245m6M32099ck.m36714x1()) {
                            list.addItem(new f7k(c8541pr, (Dictionary<String, Integer>) dictionary, listM5226k4));
                        }
                        sketchFormat.m2670du().m3320k4((f7k[]) list.toArray(new f7k[0]));
                    }
                    sketchFormat.m2670du().m3319k4(listM5226k4.toArray(new C0899df[0]));
                } else {
                    if (iM27428k4 != 1) {
                        throw new Exception(C14113y2.m67408k4("Unknown element \"", c7462d6.m30151kk().m29539k4(), "\""));
                    }
                    C9365zg c9365zg = (C9365zg) c7462d6.m30151kk().m29542x1();
                    sketchFormat.m2670du().m3317k4(c9365zg.m45601x1());
                    sketchFormat.m2670du().m3318k4(C13753kz.m64234k4(c9365zg.m45601x1()));
                    if (sketchFormat.m2670du().m3312jd() == null) {
                        return;
                    }
                    sketchFormat.m2670du().m3322k4(C0914ds.m5238k4(c9365zg.m45600kk(), sketchFormat.m2670du().m3312jd().m64270k4(), (Dictionary<String, Integer>[]) new Dictionary[]{null}));
                }
            }
            sketchFormat.m2673k4(c7462d6.m30153x1());
            C7394ca c7394caM34850k4 = c7462d6.m30152to().m34850k4();
            sketchFormat.setSketchType(-1);
            if (c7394caM34850k4 != null) {
                int iM27428k42 = f48939k4.m27428k4(c7394caM34850k4.m29539k4());
                if (iM27428k42 == 2) {
                    sketchFormat.setSketchType(0);
                    return;
                }
                if (iM27428k42 == 3) {
                    sketchFormat.setSketchType(1);
                } else if (iM27428k42 == 4) {
                    sketchFormat.setSketchType(2);
                } else {
                    if (iM27428k42 != 5) {
                        return;
                    }
                    sketchFormat.setSketchType(3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70815k4(ISketchFormat iSketchFormat, C8985uy c8985uy) {
        SketchFormat sketchFormat = (SketchFormat) iSketchFormat;
        if (sketchFormat.getSketchType() != -1) {
            C3152yj c3152yj = new C3152yj();
            C3059ii c3059ii = new C3059ii(c3152yj, AbstractC6747ar.m26650yj(), 0);
            c3059ii.mo12953k4("a", "ext", "http://schemas.openxmlformats.org/drawingml/2006/main");
            c3059ii.m12955x1("uri", "{C807C97D-BFC1-408E-A445-0C87EB9F89A2}");
            C7462d6 c7462d6 = new C7462d6();
            c7462d6.m30150k4(sketchFormat.m2678to());
            int sketchType = sketchFormat.getSketchType();
            c7462d6.m30149k4().m34851k4(sketchType != 1 ? sketchType != 2 ? sketchType != 3 ? "lineSketchNone" : "lineSketchScribble" : "lineSketchFreehand" : "lineSketchCurved");
            if (sketchFormat.m2670du().m3308ck() != -1) {
                C0899df[] c0899dfArrM3309du = sketchFormat.m2670du().m3309du();
                C13791lr[] c13791lrArrM3334x1 = sketchFormat.m2670du().m3334x1();
                C14663v4[] c14663v4ArrM3330to = sketchFormat.m2670du().m3330to();
                C1253ij[] c1253ijArrM3328kk = sketchFormat.m2670du().m3328kk();
                if (sketchFormat.m2670du().m3308ck() == 0) {
                    final C7707fw c7707fw = (C7707fw) c7462d6.m30148k4("custGeom").m29542x1();
                    C0914ds.m5233k4(c13791lrArrM3334x1, new AbstractC4685kk<C7733g6>() { // from class: com.aspose.slides.sws.1
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c7707fw) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_CustomGeometry2DElementData.AddAvLst()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C7733g6 invoke() {
                            return c7707fw.m32104k4();
                        }
                    });
                    C0914ds.m5231k4(c0899dfArrM3309du, c13791lrArrM3334x1, new AbstractC4685kk<C7733g6>() { // from class: com.aspose.slides.sws.2
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c7707fw) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_CustomGeometry2DElementData.AddGdLst()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C7733g6 invoke() {
                            return c7707fw.m32108x1();
                        }
                    });
                    C0914ds.m5235k4(c14663v4ArrM3330to, c0899dfArrM3309du, c13791lrArrM3334x1, new AbstractC4685kk<C9333z0>() { // from class: com.aspose.slides.sws.3
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c7707fw) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_CustomGeometry2DElementData.AddAhLst()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C9333z0 invoke() {
                            return c7707fw.m32105kk();
                        }
                    });
                    C0914ds.m5232k4(c1253ijArrM3328kk, c0899dfArrM3309du, c13791lrArrM3334x1, new AbstractC4685kk<C7484di>() { // from class: com.aspose.slides.sws.4
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c7707fw) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_CustomGeometry2DElementData.AddCxnLst()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C7484di invoke() {
                            return c7707fw.m32107to();
                        }
                    });
                    C14843yd[] c14843ydArrM3329m9 = sketchFormat.m2670du().m3329m9();
                    if (c14843ydArrM3329m9 != null) {
                        C8727s0 c8727s0M32100du = c7707fw.m32100du();
                        c8727s0M32100du.m40654k4(C0914ds.m5228k4(c14843ydArrM3329m9[0].m73856k4(), c0899dfArrM3309du, c13791lrArrM3334x1));
                        c8727s0M32100du.m40660x1(C0914ds.m5228k4(c14843ydArrM3329m9[0].m73858x1(), c0899dfArrM3309du, c13791lrArrM3334x1));
                        c8727s0M32100du.m40656kk(C0914ds.m5228k4(sketchFormat.m2670du().m3310dy()[0].m73856k4(), c0899dfArrM3309du, c13791lrArrM3334x1));
                        c8727s0M32100du.m40658to(C0914ds.m5228k4(sketchFormat.m2670du().m3310dy()[0].m73858x1(), c0899dfArrM3309du, c13791lrArrM3334x1));
                    }
                    if (sketchFormat.m2670du().m3311h4() != null) {
                        for (f7k f7kVar : sketchFormat.m2670du().m3311h4()) {
                            yz8.m74182k4(f7kVar, c7707fw.m32099ck(), c0899dfArrM3309du, c13791lrArrM3334x1);
                        }
                    }
                } else {
                    C9365zg c9365zg = (C9365zg) c7462d6.m30148k4("prstGeom").m29542x1();
                    C0914ds.m5234k4(c13791lrArrM3334x1, c9365zg.m45598k4());
                    c9365zg.m45599k4(sketchFormat.m2670du().m3307c5());
                }
            }
            c7462d6.mo6846k4("", c3059ii, "lineSketchStyleProps");
            c3059ii.mo21898jd();
            c3059ii.mo21896h4();
            c3059ii.mo21893du();
            String strM26681x1 = AbstractC6747ar.m26650yj().m26681x1(c3152yj.toArray());
            C8397nz c8397nz = new C8397nz();
            ((C8618qp) c8397nz.mo29646x1()).mo28310k4(strM26681x1);
            c8985uy.m42631k4(c8397nz);
        }
    }
}
