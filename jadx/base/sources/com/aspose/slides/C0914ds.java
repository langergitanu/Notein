package com.aspose.slides;

import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7340bq;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7484di;
import com.aspose.slides.internal.p332p7.C7707fw;
import com.aspose.slides.internal.p332p7.C7733g6;
import com.aspose.slides.internal.p332p7.C7828h8;
import com.aspose.slides.internal.p332p7.C7836hc;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8213lv;
import com.aspose.slides.internal.p332p7.C8245m6;
import com.aspose.slides.internal.p332p7.C8541pr;
import com.aspose.slides.internal.p332p7.C8727s0;
import com.aspose.slides.internal.p332p7.C8869th;
import com.aspose.slides.internal.p332p7.C9333z0;
import com.aspose.slides.internal.p332p7.C9365zg;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.miui.penengine.p596e.C18773h;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ds */
/* JADX INFO: loaded from: classes3.dex */
class C0914ds {

    /* JADX INFO: renamed from: k4 */
    static final String[] f4643k4 = {"c", "w", C18773h.f57233c, "ss", "ls", "hc", "vc", "l", "t", "r", "b"};

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f4644x1 = new C7017h4("custGeom", "prstGeom", "ahXY", "ahPolar");

    /* JADX INFO: renamed from: k4 */
    public static List<C0899df> m5226k4(C7733g6 c7733g6, Dictionary<String, Integer> dictionary) {
        return m5227k4(c7733g6, dictionary, false);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m5240x1(IGeometryShape iGeometryShape, C8087kh c8087kh) {
        if (iGeometryShape.getShapeType() == -1) {
            return;
        }
        C13760l2 c13760l2M70448jd = ((GeometryShape) iGeometryShape).mo272to().m70448jd();
        C0899df[] c0899dfArrM64273to = c13760l2M70448jd.m64273to();
        C13791lr[] c13791lrArrM64270k4 = c13760l2M70448jd.m64270k4();
        C14663v4[] c14663v4ArrM64271kk = c13760l2M70448jd.m64271kk();
        C1253ij[] c1253ijArrM64276x1 = c13760l2M70448jd.m64276x1();
        if (iGeometryShape.getShapeType() != 0) {
            C9365zg c9365zg = (C9365zg) c8087kh.m35384kk("prstGeom").m29542x1();
            m5234k4(c13791lrArrM64270k4, c9365zg.m45598k4());
            c9365zg.m45599k4(c13760l2M70448jd.m64257dy());
            return;
        }
        final C7707fw c7707fw = (C7707fw) c8087kh.m35384kk("custGeom").m29542x1();
        m5233k4(c13791lrArrM64270k4, new AbstractC4685kk<C7733g6>() { // from class: com.aspose.slides.ds.1
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
        m5231k4(c0899dfArrM64273to, c13791lrArrM64270k4, new AbstractC4685kk<C7733g6>() { // from class: com.aspose.slides.ds.2
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
        m5235k4(c14663v4ArrM64271kk, c0899dfArrM64273to, c13791lrArrM64270k4, new AbstractC4685kk<C9333z0>() { // from class: com.aspose.slides.ds.3
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
        m5232k4(c1253ijArrM64276x1, c0899dfArrM64273to, c13791lrArrM64270k4, new AbstractC4685kk<C7484di>() { // from class: com.aspose.slides.ds.4
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
        C14843yd[] c14843ydArrM64258h4 = c13760l2M70448jd.m64258h4();
        if (c14843ydArrM64258h4 != null) {
            C8727s0 c8727s0M32100du = c7707fw.m32100du();
            c8727s0M32100du.m40654k4(m5228k4(c14843ydArrM64258h4[0].m73856k4(), c0899dfArrM64273to, c13791lrArrM64270k4));
            c8727s0M32100du.m40660x1(m5228k4(c14843ydArrM64258h4[0].m73858x1(), c0899dfArrM64273to, c13791lrArrM64270k4));
            c8727s0M32100du.m40656kk(m5228k4(c13760l2M70448jd.m64272m9()[0].m73856k4(), c0899dfArrM64273to, c13791lrArrM64270k4));
            c8727s0M32100du.m40658to(m5228k4(c13760l2M70448jd.m64272m9()[0].m73858x1(), c0899dfArrM64273to, c13791lrArrM64270k4));
        } else {
            C8727s0 c8727s0M32100du2 = c7707fw.m32100du();
            c8727s0M32100du2.m40654k4("l");
            c8727s0M32100du2.m40660x1("t");
            c8727s0M32100du2.m40656kk("r");
            c8727s0M32100du2.m40658to("b");
        }
        if (c13760l2M70448jd.m64256du() != null) {
            for (f7k f7kVar : c13760l2M70448jd.m64256du()) {
                yz8.m74182k4(f7kVar, c7707fw.m32099ck(), c0899dfArrM64273to, c13791lrArrM64270k4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static List<C0899df> m5227k4(C7733g6 c7733g6, Dictionary<String, Integer> dictionary, boolean z) {
        String[] strArr = f4643k4;
        int length = strArr.length;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            dictionary.set_Item(strArr[i3], Integer.valueOf(-i));
            i3++;
            i++;
        }
        if (c7733g6 == null) {
            return new List<>();
        }
        C8213lv[] c8213lvArrM32328x1 = c7733g6.m32328x1();
        List list = new List(c8213lvArrM32328x1.length);
        Dictionary dictionary2 = new Dictionary();
        for (C8213lv c8213lv : c8213lvArrM32328x1) {
            if (dictionary2.containsKey(c8213lv.m36442k4())) {
                list.set_Item(((Integer) dictionary2.get_Item(c8213lv.m36442k4())).intValue(), c8213lv);
            } else {
                dictionary2.addItem(c8213lv.m36442k4(), Integer.valueOf(list.size()));
                list.addItem(c8213lv);
            }
        }
        List<C0899df> list2 = new List<>(c8213lvArrM32328x1.length);
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                C8213lv c8213lv2 = (C8213lv) it.next();
                if (!z || c8213lv2.m36444x1() == null || !C14113y2.m67448x1(c8213lv2.m36444x1(), "val ")) {
                    String strM36442k4 = c8213lv2.m36442k4();
                    list2.addItem(new C0899df(strM36442k4, c8213lv2.m36444x1() != null ? c8213lv2.m36444x1() : "val 0", dictionary, list2));
                    int i4 = i2 + 1;
                    dictionary.set_Item(strM36442k4, Integer.valueOf(-(i2 + 12)));
                    i2 = i4;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return list2;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m5228k4(long j, C0899df[] c0899dfArr, C13791lr[] c13791lrArr) {
        return m5229k4(j, c0899dfArr, c13791lrArr, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m5229k4(long j, C0899df[] c0899dfArr, C13791lr[] c13791lrArr, boolean z) {
        if (j < -27273042329600L) {
            return j <= -27273042329612L ? c0899dfArr[(int) ((-27273042329612L) - j)].m5080k4() : f4643k4[(int) ((-27273042329601L) - j)];
        }
        if (j <= 27273042316900L) {
            return C13850af.m65104k4(j);
        }
        if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
            return c13791lrArr[(int) (j - 27273042316901L)].m64509kk();
        }
        if (z) {
            return null;
        }
        return C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5230k4(IGeometryShape iGeometryShape, C8087kh c8087kh) {
        if (c8087kh.m35387m9() == null) {
            return;
        }
        GeometryShape geometryShape = (GeometryShape) iGeometryShape;
        C13760l2 c13760l2M70448jd = geometryShape.mo272to().m70448jd();
        int iM27428k4 = f4644x1.m27428k4(c8087kh.m35387m9().m29539k4());
        if (iM27428k4 != 0) {
            if (iM27428k4 != 1) {
                throw new Exception(C14113y2.m67408k4("Unknown element \"", c8087kh.m35387m9().m29539k4(), "\""));
            }
            C9365zg c9365zg = (C9365zg) c8087kh.m35387m9().m29542x1();
            c13760l2M70448jd.m64262k4(c9365zg.m45601x1());
            c13760l2M70448jd.m64263k4(C13753kz.m64234k4(c9365zg.m45601x1()));
            if (c13760l2M70448jd.m64255c5() == null) {
                return;
            }
            c13760l2M70448jd.m64267k4(m5237k4(c9365zg.m45600kk(), c13760l2M70448jd.m64255c5().m64270k4(), c13760l2M70448jd, geometryShape.m1591yj(), new Dictionary[]{null}));
            return;
        }
        C7707fw c7707fw = (C7707fw) c8087kh.m35387m9().m29542x1();
        Dictionary[] dictionaryArr = {null};
        c13760l2M70448jd.m64267k4(m5237k4(c7707fw.m32102h4(), null, c13760l2M70448jd, geometryShape.m1591yj(), dictionaryArr));
        Dictionary dictionary = dictionaryArr[0];
        c13760l2M70448jd.m64262k4(0);
        List<C0899df> listM5226k4 = m5226k4(c7707fw.m32106m9(), (Dictionary<String, Integer>) dictionary);
        c13760l2M70448jd.m64266k4(m5236k4(c7707fw.m32098c5(), (Dictionary<String, Integer>) dictionary, listM5226k4));
        c13760l2M70448jd.m64268k4(m5239k4(c7707fw.m32101dy(), (Dictionary<String, Integer>) dictionary, listM5226k4));
        C8727s0 c8727s0M32103jd = c7707fw.m32103jd();
        if (c8727s0M32103jd != null) {
            c13760l2M70448jd.m64269k4(new C14843yd[1]);
            c13760l2M70448jd.m64258h4()[0] = new C14843yd(c8727s0M32103jd.m40653k4(), c8727s0M32103jd.m40659x1(), dictionary, listM5226k4);
            c13760l2M70448jd.m64275x1(new C14843yd[1]);
            c13760l2M70448jd.m64272m9()[0] = new C14843yd(c8727s0M32103jd.m40655kk(), c8727s0M32103jd.m40657to(), dictionary, listM5226k4);
        }
        C8245m6 c8245m6M32099ck = c7707fw.m32099ck();
        if (c8245m6M32099ck != null) {
            List list = new List();
            for (C8541pr c8541pr : c8245m6M32099ck.m36714x1()) {
                list.addItem(new f7k(c8541pr, (Dictionary<String, Integer>) dictionary, listM5226k4));
            }
            c13760l2M70448jd.m64265k4((f7k[]) list.toArray(new f7k[0]));
        }
        c13760l2M70448jd.m64264k4(listM5226k4.toArray(new C0899df[0]));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5231k4(C0899df[] c0899dfArr, C13791lr[] c13791lrArr, AbstractC4685kk<C7733g6> abstractC4685kk) {
        int i;
        if (c0899dfArr != null) {
            i = 0;
            for (C0899df c0899df : c0899dfArr) {
                if (!c0899df.m5087x1()) {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            return;
        }
        C7733g6 c7733g6Invoke = abstractC4685kk.invoke();
        for (C0899df c0899df2 : c0899dfArr) {
            if (!c0899df2.m5087x1()) {
                C8213lv c8213lvM32327k4 = c7733g6Invoke.m32327k4();
                c8213lvM32327k4.m36443k4(c0899df2.m5080k4());
                c8213lvM32327k4.m36445x1(C14275pc.m69013k4(c0899df2, c0899dfArr, c13791lrArr));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5232k4(C1253ij[] c1253ijArr, C0899df[] c0899dfArr, C13791lr[] c13791lrArr, AbstractC4685kk<C7484di> abstractC4685kk) {
        if (c1253ijArr == null || c1253ijArr.length == 0) {
            return;
        }
        C7484di c7484diInvoke = abstractC4685kk.invoke();
        for (C1253ij c1253ij : c1253ijArr) {
            C8869th c8869thM30362k4 = c7484diInvoke.m30362k4();
            c8869thM30362k4.m41725x1().m33275k4(m5228k4(c1253ij.m7640k4().m73856k4(), c0899dfArr, c13791lrArr));
            c8869thM30362k4.m41725x1().m33277x1(m5228k4(c1253ij.m7640k4().m73858x1(), c0899dfArr, c13791lrArr));
            c8869thM30362k4.m41724k4(m5228k4(c1253ij.m7642x1(), c0899dfArr, c13791lrArr));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5233k4(C13791lr[] c13791lrArr, AbstractC4685kk<C7733g6> abstractC4685kk) {
        if (c13791lrArr == null || c13791lrArr.length == 0) {
            return;
        }
        m5234k4(c13791lrArr, abstractC4685kk.invoke());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5234k4(C13791lr[] c13791lrArr, C7733g6 c7733g6) {
        if (c13791lrArr == null || c13791lrArr.length == 0) {
            return;
        }
        for (C13791lr c13791lr : c13791lrArr) {
            if (c13791lr != null && !c13791lr.m64510to()) {
                for (C13791lr c13791lr2 : c13791lrArr) {
                    if (c13791lr2 != null) {
                        C8213lv c8213lvM32327k4 = c7733g6.m32327k4();
                        c8213lvM32327k4.m36443k4(c13791lr2.m64509kk());
                        c8213lvM32327k4.m36445x1(C14113y2.m67408k4("val ", C13850af.m65104k4(c13791lr2.m64504k4())));
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5235k4(C14663v4[] c14663v4Arr, C0899df[] c0899dfArr, C13791lr[] c13791lrArr, AbstractC4685kk<C9333z0> abstractC4685kk) {
        C7836hc c7836hcM29041m9;
        if (c14663v4Arr == null || c14663v4Arr.length == 0) {
            return;
        }
        C9333z0 c9333z0Invoke = abstractC4685kk.invoke();
        for (C14663v4 c14663v4 : c14663v4Arr) {
            if (c14663v4.f49469k4) {
                C7828h8 c7828h8 = (C7828h8) c9333z0Invoke.m45318k4("ahPolar").m29542x1();
                c7828h8.m33217k4(m5229k4(c14663v4.f49473x1, c0899dfArr, c13791lrArr, true));
                c7828h8.m33222to(m5229k4(c14663v4.f49466du, c0899dfArr, c13791lrArr, true));
                c7828h8.m33224x1(m5229k4(c14663v4.f49470kk, c0899dfArr, c13791lrArr, true));
                c7828h8.m33213du(m5229k4(c14663v4.f49468h4, c0899dfArr, c13791lrArr, true));
                c7828h8.m33219kk(m5229k4(c14663v4.f49472to, c0899dfArr, c13791lrArr, true));
                c7828h8.m33215h4(m5229k4(c14663v4.f49471m9, c0899dfArr, c13791lrArr, true));
                c7828h8.m33220m9().m33275k4(m5229k4(c14663v4.f49467dy.m73856k4(), c0899dfArr, c13791lrArr, true));
                c7836hcM29041m9 = c7828h8.m33220m9();
            } else {
                C7340bq c7340bq = (C7340bq) c9333z0Invoke.m45318k4("ahXY").m29542x1();
                c7340bq.m29038k4(m5229k4(c14663v4.f49473x1, c0899dfArr, c13791lrArr, true));
                c7340bq.m29043to(m5229k4(c14663v4.f49466du, c0899dfArr, c13791lrArr, true));
                c7340bq.m29045x1(m5229k4(c14663v4.f49470kk, c0899dfArr, c13791lrArr, true));
                c7340bq.m29034du(m5229k4(c14663v4.f49468h4, c0899dfArr, c13791lrArr, true));
                c7340bq.m29040kk(m5229k4(c14663v4.f49472to, c0899dfArr, c13791lrArr, true));
                c7340bq.m29036h4(m5229k4(c14663v4.f49471m9, c0899dfArr, c13791lrArr, true));
                c7340bq.m29041m9().m33275k4(m5229k4(c14663v4.f49467dy.m73856k4(), c0899dfArr, c13791lrArr, true));
                c7836hcM29041m9 = c7340bq.m29041m9();
            }
            c7836hcM29041m9.m33277x1(m5229k4(c14663v4.f49467dy.m73858x1(), c0899dfArr, c13791lrArr, true));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C1253ij[] m5236k4(C7484di c7484di, Dictionary<String, Integer> dictionary, List<C0899df> list) {
        if (c7484di == null) {
            return null;
        }
        C8869th[] c8869thArrM30363x1 = c7484di.m30363x1();
        C1253ij[] c1253ijArr = new C1253ij[c8869thArrM30363x1.length];
        int length = c8869thArrM30363x1.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C8869th c8869th = c8869thArrM30363x1[i];
            C7836hc c7836hcM41725x1 = c8869th.m41725x1();
            c1253ijArr[i2] = new C1253ij(c7836hcM41725x1.m33274k4(), c7836hcM41725x1.m33276x1(), c8869th.m41723k4(), dictionary, list);
            i++;
            i2++;
        }
        return c1253ijArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C13791lr[] m5237k4(C7733g6 c7733g6, C13791lr[] c13791lrArr, C13760l2 c13760l2, C0735a7 c0735a7, Dictionary<String, Integer>[] dictionaryArr) {
        C13791lr[] c13791lrArr2;
        byte[] bArr;
        dictionaryArr[0] = new Dictionary<>();
        if (c7733g6 == null) {
            return c13791lrArr != null ? c13791lrArr : new C13791lr[0];
        }
        C8213lv[] c8213lvArrM32328x1 = c7733g6.m32328x1();
        if (c13791lrArr == null) {
            c13791lrArr2 = new C13791lr[c8213lvArrM32328x1.length];
            int i = 0;
            for (C8213lv c8213lv : c8213lvArrM32328x1) {
                i++;
                dictionaryArr[0].set_Item(c8213lv.m36442k4(), Integer.valueOf(i));
            }
        } else {
            int i2 = 0;
            while (i2 < c13791lrArr.length) {
                Dictionary<String, Integer> dictionary = dictionaryArr[0];
                String strM64509kk = c13791lrArr[i2].m64509kk();
                i2++;
                dictionary.set_Item(strM64509kk, Integer.valueOf(i2));
            }
            for (C8213lv c8213lv2 : c8213lvArrM32328x1) {
                if (!dictionaryArr[0].containsKey(c8213lv2.m36442k4())) {
                    i2++;
                    dictionaryArr[0].set_Item(c8213lv2.m36442k4(), Integer.valueOf(i2));
                }
            }
            C13791lr[] c13791lrArr3 = new C13791lr[i2];
            for (int i3 = 0; i3 < c13791lrArr.length; i3++) {
                c13791lrArr3[i3] = new C13791lr(c13791lrArr[i3]);
            }
            c13791lrArr2 = c13791lrArr3;
        }
        Dictionary dictionary2 = new Dictionary();
        double[] dArr = null;
        if (c0735a7 != null) {
            List<C0899df> listM5227k4 = m5227k4(c7733g6, (Dictionary<String, Integer>) dictionary2, true);
            if (listM5227k4.size() > 0) {
                byte[][] bArr2 = {null};
                double[][] dArr2 = {null};
                c0735a7.m3315k4(100000.0f, 100000.0f, listM5227k4.toArray(new C0899df[0]), bArr2, dArr2);
                byte[] bArr3 = bArr2[0];
                dArr = dArr2[0];
                bArr = bArr3;
            } else {
                bArr = null;
            }
        }
        for (C8213lv c8213lv3 : c8213lvArrM32328x1) {
            if (c8213lv3.m36444x1() == null || C14113y2.m67448x1(c8213lv3.m36444x1(), "val ")) {
                c13791lrArr2[dictionaryArr[0].get_Item(c8213lv3.m36442k4()).intValue() - 1] = new C13791lr(c8213lv3.m36442k4(), c8213lv3.m36444x1() != null ? c8213lv3.m36444x1() : "val 0");
            } else if (!C14113y2.m67411k4(c8213lv3.m36442k4()) && dictionary2.containsKey(c8213lv3.m36442k4()) && dArr != null && bArr != null) {
                c13791lrArr2[dictionaryArr[0].get_Item(c8213lv3.m36442k4()).intValue() - 1] = new C13791lr(c8213lv3.m36442k4(), C7019kk.m27438h4(Float.valueOf(c13760l2.m64259k4(dArr, bArr, ((long) ((Integer) dictionary2.get_Item(c8213lv3.m36442k4())).intValue()) - 27273042329600L)), 13));
            }
        }
        return c13791lrArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C13791lr[] m5238k4(C7733g6 c7733g6, C13791lr[] c13791lrArr, Dictionary<String, Integer>[] dictionaryArr) {
        return m5237k4(c7733g6, c13791lrArr, null, null, dictionaryArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14663v4[] m5239k4(C9333z0 c9333z0, Dictionary<String, Integer> dictionary, List<C0899df> list) {
        if (c9333z0 == null) {
            return null;
        }
        C14663v4[] c14663v4Arr = new C14663v4[c9333z0.m45317k4().size()];
        for (int i = 0; i < c9333z0.m45317k4().size(); i++) {
            C7394ca c7394ca = c9333z0.m45317k4().get_Item(i);
            int iM27428k4 = f4644x1.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 2) {
                C7340bq c7340bq = (C7340bq) c7394ca.m29542x1();
                String strM33274k4 = c7340bq.m29041m9().m33274k4();
                String strM33276x1 = c7340bq.m29041m9().m33276x1();
                String strM29037k4 = c7340bq.m29037k4();
                String strM29042to = c7340bq.m29042to();
                c14663v4Arr[i] = new C14663v4(false, strM29037k4, c7340bq.m29044x1(), c7340bq.m29039kk(), strM29042to, c7340bq.m29033du(), c7340bq.m29035h4(), strM33274k4, strM33276x1, dictionary, list);
            } else {
                if (iM27428k4 != 3) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394ca.m29539k4(), "\""));
                }
                C7828h8 c7828h8 = (C7828h8) c7394ca.m29542x1();
                String strM33274k42 = c7828h8.m33220m9().m33274k4();
                String strM33276x12 = c7828h8.m33220m9().m33276x1();
                String strM33216k4 = c7828h8.m33216k4();
                String strM33221to = c7828h8.m33221to();
                c14663v4Arr[i] = new C14663v4(true, strM33216k4, c7828h8.m33223x1(), c7828h8.m33218kk(), strM33221to, c7828h8.m33212du(), c7828h8.m33214h4(), strM33274k42, strM33276x12, dictionary, list);
            }
        }
        return c14663v4Arr;
    }
}
