package com.aspose.slides;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p193iv.C5133k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.nw */
/* JADX INFO: loaded from: classes3.dex */
class C14203nw {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        r7 = new com.aspose.slides.p559ms.System.Xml.C13970rs(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        r7.mo65026h4();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        return new com.aspose.slides.internal.p332p7.vyd(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        r7.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        throw r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.aspose.slides.internal.p332p7.vyd m68231k4(int i) {
        int i2 = 0;
        loop0: while (true) {
            int[] iArr = jdt.f45473x1;
            if (i2 >= iArr.length) {
                return null;
            }
            if (iArr[i2] == i) {
                XmlDocument xmlDocument = new XmlDocument();
                xmlDocument.setXmlResolver(null);
                xmlDocument.load(C5133k4.m21997k4("OdpCustomShapes.xml"));
                IEnumerator it = xmlDocument.getElementsByTagName("enhanced-geometry", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0").iterator();
                while (it.hasNext()) {
                    try {
                        C13981tl c13981tl = (C13981tl) it.next();
                        if (C14113y2.m67363du(c13981tl.m65912to("enhanced-path", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"), jdt.f45472k4[i2])) {
                            break loop0;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it).dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68232k4(GeometryShape geometryShape, com.aspose.slides.internal.p332p7.vyd vydVar, pkv pkvVar) {
        if (geometryShape == null) {
            throw new ArgumentNullException("shape");
        }
        if (vydVar == null) {
            throw new ArgumentNullException("enhancedGeometryElement");
        }
        C0735a7 c0735a7M1591yj = geometryShape.m1591yj();
        if (c0735a7M1591yj.m3311h4() == null || c0735a7M1591yj.m3311h4().length == 0) {
            return;
        }
        String strM67400k4 = C14113y2.f47374k4;
        String[] strArr = new String[0];
        if (c0735a7M1591yj.m3334x1() != null) {
            strArr = new String[c0735a7M1591yj.m3334x1().length];
            int i = 0;
            for (C13791lr c13791lr : c0735a7M1591yj.m3334x1()) {
                if (c13791lr != null && !c13791lr.m64510to()) {
                    strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67408k4(" ", C13850af.m65104k4(c13791lr.m64504k4())));
                    strArr[i] = c13791lr.m64509kk();
                    i++;
                }
            }
        }
        String strM67440x1 = C14113y2.m67440x1(strM67400k4);
        if (C14113y2.m67411k4(strM67440x1)) {
            strM67440x1 = null;
        }
        vydVar.m43423to(strM67440x1);
        C6765kp c6765kp = new C6765kp();
        for (f7k f7kVar : c0735a7M1591yj.m3311h4()) {
            c6765kp.m26792k4(C14113y2.m67408k4(f7kVar.m6035k4(c0735a7M1591yj.m3309du(), c0735a7M1591yj.m3334x1(), strArr), " N "));
        }
        vydVar.m43421kk(c6765kp.toString());
        long jM6045x1 = c0735a7M1591yj.m3311h4()[0].m6045x1();
        long jM6042kk = c0735a7M1591yj.m3311h4()[0].m6042kk();
        if ((jM6045x1 == 0 || jM6042kk == 0) && (c0735a7M1591yj.m3309du() == null || c0735a7M1591yj.m3309du().length == 0)) {
            C12007ix c12007ix = new C12007ix(C12025x6.f40591k4.Clone(), ((ShapeFrame) geometryShape.getFrame()).m2660k4().m56570m9().Clone());
            for (IGeometryPath iGeometryPath : geometryShape.getGeometryPaths()) {
                C12007ix.m56549x1(c12007ix.Clone(), ShapeUtil.m2666k4(iGeometryPath).m55523c5().Clone()).CloneTo(c12007ix);
            }
            jM6045x1 = C7019kk.m27438h4(Float.valueOf(c12007ix.m56550c5() * 12700.0f), 13);
            jM6042kk = C7019kk.m27438h4(Float.valueOf(c12007ix.m56575x1() * 12700.0f), 13);
        }
        if (jM6045x1 == 0) {
            jM6045x1 = 21600;
        }
        Long lValueOf = Long.valueOf(jM6045x1);
        if (jM6042kk == 0) {
            jM6042kk = 21600;
        }
        vydVar.m43427x1(C14113y2.m67402k4("0 0 {0} {1}", lValueOf, Long.valueOf(jM6042kk)));
        vydVar.m43419k4("non-primitive");
        m68233k4(c0735a7M1591yj, strArr, vydVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68233k4(C0735a7 c0735a7, String[] strArr, com.aspose.slides.internal.p332p7.vyd vydVar) {
        if (c0735a7.m3309du() != null) {
            for (int i = 0; i < c0735a7.m3309du().length; i++) {
                C0899df c0899df = c0735a7.m3309du()[i];
                if (!c0899df.m5087x1()) {
                    com.aspose.slides.internal.p332p7.gh7 gh7VarM43418k4 = vydVar.m43418k4();
                    gh7VarM43418k4.m32534k4(c0899df.m5080k4());
                    gh7VarM43418k4.m32536x1(c0899df.m5081k4(c0735a7.m3309du(), c0735a7.m3334x1(), strArr));
                }
            }
        }
        if (vydVar.m43425up().length > 0 || !C14113y2.m67411k4(vydVar.m43422m9())) {
            int i2 = 0;
            for (String str : C13760l2.f45924k4) {
                if (!C14113y2.m67363du(str, "0")) {
                    com.aspose.slides.internal.p332p7.gh7 gh7VarM43418k42 = vydVar.m43418k4();
                    gh7VarM43418k42.m32534k4(C13760l2.f45925x1[i2]);
                    gh7VarM43418k42.m32536x1(str);
                }
                i2++;
            }
        }
    }
}
