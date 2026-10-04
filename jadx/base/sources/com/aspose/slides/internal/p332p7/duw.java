package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class duw extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f21894k4 = ulh.m42487k4("short");

    /* JADX INFO: renamed from: yj */
    private static final C7017h4 f21895yj = new C7017h4("style:name", "number:language", "number:country", "number:title", "style:volatile", "number:transliteration-format", "number:transliteration-language", "number:transliteration-country", "number:transliteration-style", "text-properties", "number", "scientific-number", "fraction", "text", "map");

    /* JADX INFO: renamed from: c5 */
    private String f21896c5;

    /* JADX INFO: renamed from: ck */
    private zob f21897ck;

    /* JADX INFO: renamed from: du */
    private String f21898du;

    /* JADX INFO: renamed from: dy */
    private String f21899dy;

    /* JADX INFO: renamed from: fa */
    private List<C7394ca> f21900fa;

    /* JADX INFO: renamed from: h4 */
    private byte f21901h4;

    /* JADX INFO: renamed from: jd */
    private int f21902jd;

    /* JADX INFO: renamed from: kk */
    private String f21903kk;

    /* JADX INFO: renamed from: m9 */
    private String f21904m9;

    /* JADX INFO: renamed from: to */
    private String f21905to;

    /* JADX INFO: renamed from: up */
    private List<abb> f21906up;

    /* JADX INFO: renamed from: x1 */
    private String f21907x1;

    public duw() {
        m30657x1();
    }

    public duw(final AbstractC13912i5 abstractC13912i5) {
        m30657x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.duw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (duw.f21895yj.m27428k4(str)) {
                    case 0:
                        duw.this.f21907x1 = str2;
                        break;
                    case 1:
                        duw.this.f21903kk = str2;
                        break;
                    case 2:
                        duw.this.f21905to = str2;
                        break;
                    case 3:
                        duw.this.f21898du = str2;
                        break;
                    case 4:
                        duw.this.f21901h4 = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 5:
                        duw.this.f21904m9 = str2;
                        break;
                    case 6:
                        duw.this.f21899dy = str2;
                        break;
                    case 7:
                        duw.this.f21896c5 = str2;
                        break;
                    case 8:
                        duw.this.f21902jd = ulh.m42487k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.duw.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (duw.f21895yj.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 9:
                        duw.this.f21897ck = new zob(abstractC13912i5);
                        return true;
                    case 10:
                        f8s f8sVar = new f8s(abstractC13912i5);
                        list = duw.this.f21900fa;
                        c7394ca = new C7394ca("number", f8sVar);
                        break;
                    case 11:
                        jz7 jz7Var = new jz7(abstractC13912i5);
                        list = duw.this.f21900fa;
                        c7394ca = new C7394ca("scientific-number", jz7Var);
                        break;
                    case 12:
                        wzi wziVar = new wzi(abstractC13912i5);
                        list = duw.this.f21900fa;
                        c7394ca = new C7394ca("fraction", wziVar);
                        break;
                    case 13:
                        abstractC13912i5.mo65026h4();
                        OooOO0O.OooO0O0("text", abstractC13912i5.mo65042rv(), duw.this.f21900fa);
                        return true;
                    case 14:
                        duw.this.f21906up.addItem(new abb(abstractC13912i5));
                        return true;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m30657x1() {
        this.f21901h4 = (byte) -1;
        this.f21904m9 = "1";
        this.f21902jd = f21894k4;
        this.f21900fa = new List<>();
        this.f21906up = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("style:name", this.f21907x1);
        if (this.f21903kk != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:language", this.f21903kk);
        }
        if (this.f21905to != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:country", this.f21905to);
        }
        if (this.f21898du != null) {
            if (c3059ii.mo12952k4("http://www.w3.org/2001/XMLSchema") == null) {
                c3059ii.m12954to("xmlns", "xs", null, "http://www.w3.org/2001/XMLSchema");
            }
            c3059ii.m12955x1("number:title", this.f21898du);
        }
        byte b = this.f21901h4;
        if (b != -1) {
            c3059ii.m12955x1("style:volatile", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        if (!"1".equals(this.f21904m9)) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:transliteration-format", this.f21904m9);
        }
        if (this.f21899dy != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:transliteration-language", this.f21899dy);
        }
        if (this.f21896c5 != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:transliteration-country", this.f21896c5);
        }
        int i = this.f21902jd;
        if (i != f21894k4) {
            c3059ii.m12955x1("number:transliteration-style", ulh.m42488k4(i));
        }
        zob zobVar = this.f21897ck;
        if (zobVar != null) {
            zobVar.mo6846k4("style", c3059ii, "text-properties");
        }
        List.Enumerator<C7394ca> it = this.f21900fa.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f21895yj.m27428k4(next.m29539k4())) {
                    case 10:
                        c3059ii2 = c3059ii;
                        ((f8s) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 11:
                        c3059ii2 = c3059ii;
                        ((jz7) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 12:
                        c3059ii2 = c3059ii;
                        ((wzi) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 13:
                        c3059ii2 = c3059ii;
                        try {
                            m29301k4("number", c3059ii2, "text", (String) next.m29541kk(), false);
                            continue;
                            c3059ii = c3059ii2;
                        } catch (Throwable th) {
                            th = th;
                        }
                        break;
                    default:
                        c3059ii2 = c3059ii;
                        continue;
                        c3059ii = c3059ii2;
                        break;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            Throwable th3 = th;
            if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                throw th3;
            }
            it.dispose();
            throw th3;
        }
        C3059ii c3059ii3 = c3059ii;
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator<abb> it2 = this.f21906up.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4("style", c3059ii3, "map");
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        c3059ii3.mo21898jd();
    }
}
