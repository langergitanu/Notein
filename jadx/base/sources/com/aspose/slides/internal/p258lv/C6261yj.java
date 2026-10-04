package com.aspose.slides.internal.p258lv;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p085dk.C3173h4;
import com.aspose.slides.internal.p085dk.C3175k4;
import com.aspose.slides.internal.p294n9.C6783wp;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C6261yj extends C6257wy {
    public C6261yj(C6258x1 c6258x1) {
        super(c6258x1);
    }

    /* JADX INFO: renamed from: x1 */
    private static String m25415x1(C3173h4 c3173h4) {
        C3152yj c3152yj = new C3152yj();
        try {
            C6783wp c6783wp = new C6783wp(false);
            C3175k4 c3175k4 = new C3175k4(c3152yj, c6783wp, false);
            c3175k4.m13584k4("rdf:RDF");
            c3175k4.m13590kk("xmlns:rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
            c3175k4.m13593x1("rdf:Description");
            c3175k4.m13590kk("rdf:about", C14113y2.f47374k4);
            c3175k4.m13590kk("xmlns:dc", "http://purl.org/dc/elements/1.1");
            c3175k4.m13586k4("dc:format", "application/x-shockwave-flash");
            c3175k4.m13586k4("dc:title", c3173h4.m13575x1());
            c3175k4.m13586k4("dc:description", c3173h4.m13570m9());
            c3175k4.m13586k4("dc:publisher", c3173h4.m13564k4());
            c3175k4.m13586k4("dc:creator", c3173h4.m13555du());
            c3175k4.m13586k4("dc:date", c3173h4.m13559fa().m67150u4());
            c3175k4.m13588kk();
            c3175k4.m13592x1();
            return c6783wp.m26681x1(c3152yj.getBuffer());
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25416k4(C3173h4 c3173h4) {
        C6260yd c6260yd = new C6260yd(m25385m9());
        c6260yd.m25413k4();
        m25384h4().m25288k4(m25415x1(c3173h4));
        c6260yd.m25414k4(77);
    }
}
