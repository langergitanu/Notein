package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.C13950o3;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.up */
/* JADX INFO: loaded from: classes5.dex */
public class C13241up {

    /* JADX INFO: renamed from: kk */
    public static final C13241up f44416kk = new C13241up();

    /* JADX INFO: renamed from: du */
    private C13068kk f44417du;

    /* JADX INFO: renamed from: h4 */
    private C13068kk[] f44418h4;

    /* JADX INFO: renamed from: k4 */
    public C13890ei f44419k4;

    /* JADX INFO: renamed from: to */
    private int f44420to;

    /* JADX INFO: renamed from: x1 */
    public C13890ei f44421x1;

    private C13241up() {
        C13890ei c13890ei = C13890ei.f46456k4;
        this.f44419k4 = c13890ei;
        this.f44421x1 = c13890ei;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m61636k4() {
        return this.f44420to;
    }

    /* JADX INFO: renamed from: kk */
    public final C13068kk[] m61637kk() {
        return this.f44418h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13068kk m61638x1() {
        return this.f44417du;
    }

    public C13241up(C12887a0 c12887a0, C13950o3 c13950o3) {
        C13890ei c13890ei = C13890ei.f46456k4;
        this.f44419k4 = c13890ei;
        this.f44421x1 = c13890ei;
        this.f44419k4 = c12887a0.m59986m9();
        try {
            this.f44417du = new C13068kk(c12887a0.m59987x1().m61420k4(), false, c13950o3);
            C12908be c12908beM59980h4 = c12887a0.m59980h4();
            this.f44418h4 = new C13068kk[c12908beM59980h4.size()];
            for (int i = 0; i < c12908beM59980h4.size(); i++) {
                try {
                    this.f44418h4[i] = new C13068kk(((C13168qe) c12908beM59980h4.get_Item(i)).m61420k4(), true, c13950o3);
                } catch (XmlSchemaException e) {
                    e.setSource(c12887a0.m59980h4().get_Item(i));
                    throw e;
                }
            }
            if (C7019kk.m27469x1(c12887a0, C13262wg.class)) {
                this.f44420to = 0;
            } else if (C7019kk.m27469x1(c12887a0, C13308yl.class)) {
                this.f44420to = 1;
            } else {
                this.f44420to = 2;
                this.f44421x1 = ((C13145p3) c12887a0).m61353c5();
            }
        } catch (XmlSchemaException e2) {
            e2.setSource(c12887a0.m59987x1());
            throw e2;
        }
    }
}
