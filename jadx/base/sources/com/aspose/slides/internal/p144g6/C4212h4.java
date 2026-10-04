package com.aspose.slides.internal.p144g6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p060ca.C2101gm;
import com.aspose.slides.internal.p060ca.C2132iq;
import com.aspose.slides.internal.p060ca.C2303tf;
import com.aspose.slides.internal.p085dk.C3173h4;
import com.aspose.slides.internal.p085dk.C3175k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.C10958h4;
import com.aspose.slides.internal.p420th.C10967qq;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p508xq.C12596h4;
import com.aspose.slides.internal.p508xq.C12597jd;
import com.aspose.slides.internal.p508xq.C12598k4;
import com.aspose.slides.internal.p508xq.C12601to;
import com.aspose.slides.internal.p508xq.C12602x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.g6.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C4212h4 {

    /* JADX INFO: renamed from: du */
    private C4216kk f11483du;

    /* JADX INFO: renamed from: fa */
    private int f11485fa;

    /* JADX INFO: renamed from: kk */
    private C3175k4 f11489kk;

    /* JADX INFO: renamed from: to */
    private C4210dy f11491to;

    /* JADX INFO: renamed from: x1 */
    private final C12601to f11492x1;

    /* JADX INFO: renamed from: k4 */
    private int f11488k4 = 1;

    /* JADX INFO: renamed from: h4 */
    private final List<String> f11486h4 = new List<>();

    /* JADX INFO: renamed from: m9 */
    private final List<String> f11490m9 = new List<>();

    /* JADX INFO: renamed from: dy */
    private final Dictionary<String, String> f11484dy = new Dictionary<>();

    /* JADX INFO: renamed from: c5 */
    private C12015qq f11481c5 = C12015qq.f40552k4.Clone();

    /* JADX INFO: renamed from: jd */
    private int f11487jd = 0;

    /* JADX INFO: renamed from: ck */
    private List<C4222up> f11482ck = new List<>();

    public C4212h4(C12601to c12601to) {
        this.f11492x1 = c12601to;
        m16915du();
    }

    /* JADX INFO: renamed from: du */
    private void m16915du() {
        this.f11483du = new C4216kk(this.f11492x1);
        C12596h4 c12596h4 = new C12596h4("/Documents/1/FixedDocument.fdoc", "application/vnd.ms-package.xps-fixeddocument+xml");
        this.f11492x1.m58793x1().m58814k4(c12596h4);
        C3175k4 c3175k4 = new C3175k4(c12596h4.m58803to(), false);
        this.f11489kk = c3175k4;
        c3175k4.m13584k4("FixedDocument");
        this.f11489kk.m13590kk("xmlns", "http://schemas.microsoft.com/xps/2005/06");
        m16919k4(c12596h4);
    }

    /* JADX INFO: renamed from: dy */
    private void m16916dy() {
        if (this.f11482ck.size() <= 0) {
            return;
        }
        C12596h4 c12596h4 = new C12596h4("/Documents/1/Structure/DocStructure.struct", "application/vnd.ms-package.xps-documentstructure+xml");
        this.f11492x1.m58793x1().m58814k4(c12596h4);
        C3175k4 c3175k4 = new C3175k4(c12596h4.m58803to(), false);
        c3175k4.m13584k4("DocumentStructure");
        c3175k4.m13590kk("xmlns", "http://schemas.microsoft.com/xps/2005/06/documentstructure");
        c3175k4.m13593x1("DocumentStructure.Outline");
        c3175k4.m13593x1("DocumentOutline");
        c3175k4.m13590kk("xml:lang", "en-US");
        List.Enumerator<C4222up> it = this.f11482ck.iterator();
        while (it.hasNext()) {
            try {
                C4222up next = it.next();
                c3175k4.m13593x1("OutlineEntry");
                c3175k4.m13590kk("OutlineLevel", C13850af.m65103k4(next.m16997k4()));
                c3175k4.m13590kk("Description", next.m16999x1());
                c3175k4.m13590kk("OutlineTarget", C14113y2.m67402k4("../../../FixedDocumentSequence.fdseq#{0}", next.m16998kk()));
                c3175k4.m13588kk();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3175k4.m13588kk();
        c3175k4.m13588kk();
        c3175k4.m13592x1();
        this.f11492x1.m58793x1().m58813k4("/Documents/1/FixedDocument.fdoc").m58799h4().m58784k4("http://schemas.microsoft.com/xps/2005/06/documentstructure", "/Documents/1/Structure/DocStructure.struct", false);
    }

    /* JADX INFO: renamed from: h4 */
    private void m16917h4() {
        C12596h4 c12596h4 = new C12596h4("/FixedDocumentSequence.fdseq", "application/vnd.ms-package.xps-fixeddocumentsequence+xml");
        this.f11492x1.m58793x1().m58814k4(c12596h4);
        C3175k4 c3175k4 = new C3175k4(c12596h4.m58803to(), false);
        c3175k4.m13584k4("FixedDocumentSequence");
        c3175k4.m13590kk("xmlns", "http://schemas.microsoft.com/xps/2005/06");
        c3175k4.m13593x1("DocumentReference");
        c3175k4.m13590kk("Source", "Documents/1/FixedDocument.fdoc");
        c3175k4.m13588kk();
        c3175k4.m13592x1();
        this.f11492x1.m58791kk().m58784k4("http://schemas.microsoft.com/xps/2005/06/fixedrepresentation", "/FixedDocumentSequence.fdseq", false);
        m16921x1(c12596h4);
    }

    /* JADX INFO: renamed from: k4 */
    private String m16918k4(String str, C12025x6 c12025x6) {
        if (this.f11490m9.containsItem(str)) {
            return C14113y2.f47374k4;
        }
        String strM16993k4 = this.f11483du.m16993k4(str);
        this.f11491to.m16908k4(strM16993k4, c12025x6.Clone());
        this.f11486h4.addItem(strM16993k4);
        this.f11490m9.addItem(str);
        return strM16993k4;
    }

    /* JADX INFO: renamed from: m9 */
    private void m16920m9() {
        this.f11483du.m16994k4(1, "Only built-in document properties will be output to XPS. All custom document properties will be lost");
        C12596h4 c12596h4 = new C12596h4("/docProps/core.xml", "application/vnd.openxmlformats-package.core-properties+xml");
        this.f11492x1.m58793x1().m58814k4(c12596h4);
        C12602x1.m58817k4(new C3175k4(c12596h4.m58803to(), false), this.f11483du.m16996to().m13575x1(), this.f11483du.m16996to().m13572to(), this.f11483du.m16996to().m13555du(), this.f11483du.m16996to().m13560h4(), this.f11483du.m16996to().m13570m9(), this.f11483du.m16996to().m13557dy(), this.f11483du.m16996to().m13552c5(), this.f11483du.m16996to().m13554ck().Clone(), this.f11483du.m16996to().m13559fa().Clone(), this.f11483du.m16996to().m13574up().Clone(), this.f11483du.m16996to().m13562jd());
        this.f11492x1.m58791kk().m58784k4("http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties", "/docProps/core.xml", false);
    }

    /* JADX INFO: renamed from: kk */
    public final C4210dy m16930kk() {
        return this.f11491to;
    }

    /* JADX INFO: renamed from: to */
    public final C4211fa m16931to() {
        return this.f11483du.m16961kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m16932x1() {
        List<String> list = this.f11486h4;
        if (list != null && list.size() > 0) {
            this.f11489kk.m13593x1("PageContent.LinkTargets");
            List.Enumerator<String> it = this.f11486h4.iterator();
            while (it.hasNext()) {
                try {
                    String next = it.next();
                    this.f11489kk.m13593x1("LinkTarget");
                    this.f11489kk.m13590kk("Name", next);
                    this.f11489kk.m13588kk();
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            this.f11486h4.clear();
            this.f11489kk.m13588kk();
        }
        this.f11489kk.m13588kk();
        this.f11491to.m16902k4();
        this.f11488k4++;
    }

    /* JADX INFO: renamed from: x1 */
    private void m16921x1(C12596h4 c12596h4) {
        C12596h4 c12596h42 = new C12596h4("/Metadata/Job_PT.xml", "application/vnd.ms-printing.printticket+xml");
        this.f11492x1.m58793x1().m58814k4(c12596h42);
        C4224x6.m17012k4(new C3175k4(c12596h42.m58803to(), true), this.f11481c5.Clone(), false);
        c12596h4.m58799h4().m58784k4("http://schemas.microsoft.com/xps/2005/06/printticket", c12596h42.m58800k4(), false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16922k4() {
        C12596h4 c12596h4M58813k4 = this.f11492x1.m58793x1().m58813k4("/Documents/1/FixedDocument.fdoc");
        Iterator<KeyValuePair<TKey, TValue>> it = this.f11483du.m16990du().iterator();
        while (it.hasNext()) {
            KeyValuePair keyValuePair = (KeyValuePair) it.next();
            if (C7019kk.m27469x1(keyValuePair.getValue(), C2303tf.class)) {
                C2101gm c2101gmM10581x6 = ((C2132iq) keyValuePair.getValue()).m10758x1().m10581x6();
                if ((c2101gmM10581x6.m10632to() & 4) == 0 || (c2101gmM10581x6.m10632to() & 8) != 0) {
                }
            }
            c12596h4M58813k4.m58799h4().m58784k4("http://schemas.microsoft.com/xps/2005/06/restricted-font", (String) keyValuePair.getKey(), false);
        }
        this.f11489kk.m13592x1();
        m16917h4();
        m16920m9();
        m16916dy();
        this.f11483du.mo16958k4();
        C12597jd.m58806k4(this.f11492x1, false);
        C12598k4.m58807k4(this.f11492x1, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16923k4(float f, float f2) {
        this.f11489kk.m13593x1("PageContent");
        this.f11489kk.m13590kk("Source", C14113y2.m67402k4("Pages/{0}.fpage", Integer.valueOf(this.f11488k4)));
        this.f11483du.m16959k4(this.f11488k4);
        C4216kk c4216kk = this.f11483du;
        C4210dy c4210dy = new C4210dy(c4216kk, new C4213ix(c4216kk.m16962x1().m58803to(), true), true);
        this.f11491to = c4210dy;
        c4210dy.m16903k4(this.f11488k4, f, f2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16924k4(int i, String str, String str2) {
        int i2 = this.f11485fa;
        if (i > i2) {
            i = i2 + 1;
        }
        this.f11482ck.addItem(new C4222up(i, str, str2));
        this.f11485fa = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16925k4(C3173h4 c3173h4) {
        this.f11483du.m16995k4(c3173h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16926k4(C4211fa c4211fa) {
        this.f11483du.m16960k4(c4211fa);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16927k4(C10958h4 c10958h4) {
        String strM16918k4 = m16918k4(c10958h4.m52936x1(), c10958h4.m52933k4().Clone());
        if (m16931to().m16914x1() <= 0 || c10958h4.m52935kk()) {
            return;
        }
        m16924k4(m16931to().m16914x1(), c10958h4.m52936x1(), strM16918k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16928k4(C10967qq c10967qq) {
        if (c10967qq.m53030x1() < m16931to().m16911k4()) {
            int i = this.f11487jd;
            this.f11487jd = i + 1;
            m16924k4(c10967qq.m53030x1() + 1, c10967qq.m53029kk(), m16918k4(C14113y2.m67402k4("outline_{0}", Integer.valueOf(i)), c10967qq.m53027k4().Clone()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16929k4(C12015qq c12015qq) {
        if (this.f11488k4 == 1) {
            c12015qq.CloneTo(this.f11481c5);
        }
        String strM67402k4 = C14113y2.m67402k4("{0}{1}", Float.valueOf(c12015qq.m56699x1()), Float.valueOf(c12015qq.m56697kk()));
        String[] strArr = {null};
        boolean zTryGetValue = this.f11484dy.tryGetValue(strM67402k4, strArr);
        String strM67402k42 = strArr[0];
        if (!zTryGetValue) {
            strM67402k42 = C14113y2.m67402k4("/Documents/1/Metadata/Page{0}_PT.xml", Integer.valueOf(this.f11488k4));
            this.f11484dy.set_Item(strM67402k4, strM67402k42);
            C12596h4 c12596h4 = new C12596h4(strM67402k42, "application/vnd.ms-printing.printticket+xml");
            this.f11492x1.m58793x1().m58814k4(c12596h4);
            C4224x6.m17012k4(new C3175k4(c12596h4.m58803to(), true), c12015qq.Clone(), true);
        }
        this.f11483du.m16962x1().m58799h4().m58784k4("http://schemas.microsoft.com/xps/2005/06/printticket", strM67402k42, false);
    }

    /* JADX INFO: renamed from: k4 */
    private void m16919k4(C12596h4 c12596h4) {
        C12596h4 c12596h42 = new C12596h4("/Metadata/MXDC_Empty_PT.xml", "application/vnd.ms-printing.printticket+xml");
        this.f11492x1.m58793x1().m58814k4(c12596h42);
        C4224x6.m17010k4(new C3175k4(c12596h42.m58803to(), true));
        c12596h4.m58799h4().m58784k4("http://schemas.microsoft.com/xps/2005/06/printticket", c12596h42.m58800k4(), false);
    }
}
