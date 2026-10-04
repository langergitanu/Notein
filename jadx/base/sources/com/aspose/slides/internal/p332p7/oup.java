package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class oup extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f28107k4 = ulh.m42487k4("short");

    /* JADX INFO: renamed from: x1 */
    public static final int f28108x1 = yvz.m45188k4("fixed");

    /* JADX INFO: renamed from: x6 */
    private static final C7017h4 f28109x6 = new C7017h4("number:truncate-on-overflow", "style:name", "number:language", "number:country", "number:title", "style:volatile", "number:transliteration-format", "number:transliteration-language", "number:transliteration-country", "number:transliteration-style", "number:format-source", "text-properties", "hours", "am-pm", "minutes", "seconds", "text", "map");

    /* JADX INFO: renamed from: c5 */
    private String f28110c5;

    /* JADX INFO: renamed from: ck */
    private String f28111ck;

    /* JADX INFO: renamed from: du */
    private String f28112du;

    /* JADX INFO: renamed from: dy */
    private byte f28113dy;

    /* JADX INFO: renamed from: fa */
    private int f28114fa;

    /* JADX INFO: renamed from: h4 */
    private String f28115h4;

    /* JADX INFO: renamed from: jd */
    private String f28116jd;

    /* JADX INFO: renamed from: kk */
    private boolean f28117kk;

    /* JADX INFO: renamed from: ks */
    private List<C7394ca> f28118ks;

    /* JADX INFO: renamed from: m9 */
    private String f28119m9;

    /* JADX INFO: renamed from: rv */
    private List<abb> f28120rv;

    /* JADX INFO: renamed from: to */
    private String f28121to;

    /* JADX INFO: renamed from: up */
    private int f28122up;

    /* JADX INFO: renamed from: yj */
    private zob f28123yj;

    public oup() {
        m38468x1();
    }

    public oup(final AbstractC13912i5 abstractC13912i5) {
        m38468x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.oup.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (oup.f28109x6.m27428k4(str)) {
                    case 0:
                        oup.this.f28117kk = C13850af.m65068c5(str2);
                        break;
                    case 1:
                        oup.this.f28121to = str2;
                        break;
                    case 2:
                        oup.this.f28112du = str2;
                        break;
                    case 3:
                        oup.this.f28115h4 = str2;
                        break;
                    case 4:
                        oup.this.f28119m9 = str2;
                        break;
                    case 5:
                        oup.this.f28113dy = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 6:
                        oup.this.f28110c5 = str2;
                        break;
                    case 7:
                        oup.this.f28116jd = str2;
                        break;
                    case 8:
                        oup.this.f28111ck = str2;
                        break;
                    case 9:
                        oup.this.f28114fa = ulh.m42487k4(str2);
                        break;
                    case 10:
                        oup.this.f28122up = yvz.m45188k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.oup.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (oup.f28109x6.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 11:
                        oup.this.f28123yj = new zob(abstractC13912i5);
                        return true;
                    case 12:
                        td3 td3Var = new td3(abstractC13912i5);
                        list = oup.this.f28118ks;
                        c7394ca = new C7394ca("hours", td3Var);
                        break;
                    case 13:
                        t4w t4wVar = new t4w(abstractC13912i5);
                        list = oup.this.f28118ks;
                        c7394ca = new C7394ca("am-pm", t4wVar);
                        break;
                    case 14:
                        xxd xxdVar = new xxd(abstractC13912i5);
                        list = oup.this.f28118ks;
                        c7394ca = new C7394ca("minutes", xxdVar);
                        break;
                    case 15:
                        wo2 wo2Var = new wo2(abstractC13912i5);
                        list = oup.this.f28118ks;
                        c7394ca = new C7394ca("seconds", wo2Var);
                        break;
                    case 16:
                        abstractC13912i5.mo65026h4();
                        OooOO0O.OooO0O0("text", abstractC13912i5.mo65042rv(), oup.this.f28118ks);
                        return true;
                    case 17:
                        oup.this.f28120rv.addItem(new abb(abstractC13912i5));
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
    private void m38468x1() {
        this.f28117kk = true;
        this.f28113dy = (byte) -1;
        this.f28110c5 = "1";
        this.f28114fa = f28107k4;
        this.f28122up = f28108x1;
        this.f28118ks = new List<>();
        this.f28120rv = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f28117kk;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (!z) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:truncate-on-overflow", this.f28117kk ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.m12955x1("style:name", this.f28121to);
        if (this.f28112du != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:language", this.f28112du);
        }
        if (this.f28115h4 != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:country", this.f28115h4);
        }
        if (this.f28119m9 != null) {
            if (c3059ii.mo12952k4("http://www.w3.org/2001/XMLSchema") == null) {
                c3059ii.m12954to("xmlns", "xs", null, "http://www.w3.org/2001/XMLSchema");
            }
            c3059ii.m12955x1("number:title", this.f28119m9);
        }
        byte b = this.f28113dy;
        if (b != -1) {
            if (b == 1) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("style:volatile", str3);
        }
        if (!"1".equals(this.f28110c5)) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:transliteration-format", this.f28110c5);
        }
        if (this.f28116jd != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:transliteration-language", this.f28116jd);
        }
        if (this.f28111ck != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:transliteration-country", this.f28111ck);
        }
        int i = this.f28114fa;
        if (i != f28107k4) {
            c3059ii.m12955x1("number:transliteration-style", ulh.m42488k4(i));
        }
        int i2 = this.f28122up;
        if (i2 != f28108x1) {
            c3059ii.m12955x1("number:format-source", yvz.m45189k4(i2));
        }
        zob zobVar = this.f28123yj;
        if (zobVar != null) {
            zobVar.mo6846k4("style", c3059ii, "text-properties");
        }
        List.Enumerator<C7394ca> it = this.f28118ks.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f28109x6.m27428k4(next.m29539k4())) {
                    case 12:
                        c3059ii2 = c3059ii;
                        ((td3) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 13:
                        c3059ii2 = c3059ii;
                        ((t4w) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 14:
                        c3059ii2 = c3059ii;
                        ((xxd) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 15:
                        c3059ii2 = c3059ii;
                        ((wo2) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 16:
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
        List.Enumerator<abb> it2 = this.f28120rv.iterator();
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
