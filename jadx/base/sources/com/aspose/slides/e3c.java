package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7211a4;
import com.aspose.slides.internal.p332p7.C7429cp;
import com.aspose.slides.internal.p332p7.C8607ql;
import com.aspose.slides.internal.p332p7.C8992v2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class e3c {
    /* JADX INFO: renamed from: k4 */
    public static void m5339k4(MathParagraph mathParagraph, C8992v2 c8992v2, gnb gnbVar) {
        if (mathParagraph == null) {
            throw new ArgumentNullException("mathParagraph");
        }
        if (c8992v2 == null) {
            throw new ArgumentNullException("mathParagraphElementData");
        }
        mathParagraph.m2001x1();
        if (c8992v2.m42666x1() != null && c8992v2.m42666x1().m29712k4() != null) {
            mathParagraph.setJustification(C14649ut.m71894kk(c8992v2.m42666x1().m29712k4().m39528k4()));
        }
        for (C7211a4 c7211a4 : c8992v2.m42665kk()) {
            MathBlock mathBlock = new MathBlock();
            uf9.m71683k4(mathBlock, c7211a4, gnbVar);
            mathParagraph.add(mathBlock);
        }
        mathParagraph.m1998k4(true);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5340k4(MathParagraph mathParagraph, C8992v2 c8992v2, u8s u8sVar) {
        if (mathParagraph == null) {
            throw new ArgumentNullException("mathParagraph");
        }
        if (c8992v2 == null) {
            throw new ArgumentNullException("mathParagraphElementData");
        }
        C8607ql c8607ql = new C8607ql();
        c8607ql.m39529k4(C14649ut.m71898to(mathParagraph.getJustification()));
        C7429cp c7429cp = new C7429cp();
        c7429cp.m29713k4(c8607ql);
        c8992v2.m42664k4(c7429cp);
        IGenericEnumerator<IMathBlock> it = mathParagraph.iterator();
        while (it.hasNext()) {
            try {
                uf9.m71682k4(it.next(), c8992v2.m42663k4(), u8sVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
