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
public class wun extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f32585k4 = ulh.m42487k4("short");

    /* JADX INFO: renamed from: x1 */
    public static final int f32586x1 = yvz.m45188k4("fixed");

    /* JADX INFO: renamed from: x6 */
    private static final C7017h4 f32587x6 = new C7017h4("style:name", "number:language", "number:country", "number:title", "style:volatile", "number:transliteration-format", "number:transliteration-language", "number:transliteration-country", "number:transliteration-style", "number:automatic-order", "number:format-source", "text-properties", "day", "month", "year", "era", "day-of-week", "week-of-year", "quarter", "hours", "am-pm", "minutes", "seconds", "text", "map");

    /* JADX INFO: renamed from: c5 */
    private String f32588c5;

    /* JADX INFO: renamed from: ck */
    private int f32589ck;

    /* JADX INFO: renamed from: du */
    private String f32590du;

    /* JADX INFO: renamed from: dy */
    private String f32591dy;

    /* JADX INFO: renamed from: fa */
    private boolean f32592fa;

    /* JADX INFO: renamed from: h4 */
    private String f32593h4;

    /* JADX INFO: renamed from: jd */
    private String f32594jd;

    /* JADX INFO: renamed from: kk */
    private String f32595kk;

    /* JADX INFO: renamed from: ks */
    private List<C7394ca> f32596ks;

    /* JADX INFO: renamed from: m9 */
    private byte f32597m9;

    /* JADX INFO: renamed from: rv */
    private List<abb> f32598rv;

    /* JADX INFO: renamed from: to */
    private String f32599to;

    /* JADX INFO: renamed from: up */
    private int f32600up;

    /* JADX INFO: renamed from: yj */
    private zob f32601yj;

    public wun() {
        m44081x1();
    }

    public wun(final AbstractC13912i5 abstractC13912i5) {
        m44081x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wun.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (wun.f32587x6.m27428k4(str)) {
                    case 0:
                        wun.this.f32595kk = str2;
                        break;
                    case 1:
                        wun.this.f32599to = str2;
                        break;
                    case 2:
                        wun.this.f32590du = str2;
                        break;
                    case 3:
                        wun.this.f32593h4 = str2;
                        break;
                    case 4:
                        wun.this.f32597m9 = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 5:
                        wun.this.f32591dy = str2;
                        break;
                    case 6:
                        wun.this.f32588c5 = str2;
                        break;
                    case 7:
                        wun.this.f32594jd = str2;
                        break;
                    case 8:
                        wun.this.f32589ck = ulh.m42487k4(str2);
                        break;
                    case 9:
                        wun.this.f32592fa = C13850af.m65068c5(str2);
                        break;
                    case 10:
                        wun.this.f32600up = yvz.m45188k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wun.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (wun.f32587x6.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 11:
                        wun.this.f32601yj = new zob(abstractC13912i5);
                        return true;
                    case 12:
                        jkn jknVar = new jkn(abstractC13912i5);
                        list = wun.this.f32596ks;
                        c7394ca = new C7394ca("day", jknVar);
                        break;
                    case 13:
                        edy edyVar = new edy(abstractC13912i5);
                        list = wun.this.f32596ks;
                        c7394ca = new C7394ca("month", edyVar);
                        break;
                    case 14:
                        tac tacVar = new tac(abstractC13912i5);
                        list = wun.this.f32596ks;
                        c7394ca = new C7394ca("year", tacVar);
                        break;
                    case 15:
                        hj3 hj3Var = new hj3(abstractC13912i5);
                        list = wun.this.f32596ks;
                        c7394ca = new C7394ca("era", hj3Var);
                        break;
                    case 16:
                        s1a s1aVar = new s1a(abstractC13912i5);
                        list = wun.this.f32596ks;
                        c7394ca = new C7394ca("day-of-week", s1aVar);
                        break;
                    case 17:
                        zfk zfkVar = new zfk(abstractC13912i5);
                        list = wun.this.f32596ks;
                        c7394ca = new C7394ca("week-of-year", zfkVar);
                        break;
                    case 18:
                        ue7 ue7Var = new ue7(abstractC13912i5);
                        list = wun.this.f32596ks;
                        c7394ca = new C7394ca("quarter", ue7Var);
                        break;
                    case 19:
                        td3 td3Var = new td3(abstractC13912i5);
                        list = wun.this.f32596ks;
                        c7394ca = new C7394ca("hours", td3Var);
                        break;
                    case 20:
                        t4w t4wVar = new t4w(abstractC13912i5);
                        list = wun.this.f32596ks;
                        c7394ca = new C7394ca("am-pm", t4wVar);
                        break;
                    case 21:
                        xxd xxdVar = new xxd(abstractC13912i5);
                        list = wun.this.f32596ks;
                        c7394ca = new C7394ca("minutes", xxdVar);
                        break;
                    case 22:
                        wo2 wo2Var = new wo2(abstractC13912i5);
                        list = wun.this.f32596ks;
                        c7394ca = new C7394ca("seconds", wo2Var);
                        break;
                    case 23:
                        abstractC13912i5.mo65026h4();
                        OooOO0O.OooO0O0("text", abstractC13912i5.mo65042rv(), wun.this.f32596ks);
                        return true;
                    case 24:
                        wun.this.f32598rv.addItem(new abb(abstractC13912i5));
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
    private void m44081x1() {
        this.f32597m9 = (byte) -1;
        this.f32591dy = "1";
        this.f32589ck = f32585k4;
        this.f32592fa = false;
        this.f32600up = f32586x1;
        this.f32596ks = new List<>();
        this.f32598rv = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("style:name", this.f32595kk);
        if (this.f32599to != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:language", this.f32599to);
        }
        if (this.f32590du != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:country", this.f32590du);
        }
        if (this.f32593h4 != null) {
            if (c3059ii.mo12952k4("http://www.w3.org/2001/XMLSchema") == null) {
                c3059ii.m12954to("xmlns", "xs", null, "http://www.w3.org/2001/XMLSchema");
            }
            c3059ii.m12955x1("number:title", this.f32593h4);
        }
        byte b = this.f32597m9;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (b != -1) {
            c3059ii.m12955x1("style:volatile", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        if (!"1".equals(this.f32591dy)) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:transliteration-format", this.f32591dy);
        }
        if (this.f32588c5 != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:transliteration-language", this.f32588c5);
        }
        if (this.f32594jd != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:transliteration-country", this.f32594jd);
        }
        int i = this.f32589ck;
        if (i != f32585k4) {
            c3059ii.m12955x1("number:transliteration-style", ulh.m42488k4(i));
        }
        if (this.f32592fa) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            if (this.f32592fa) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("number:automatic-order", str3);
        }
        int i2 = this.f32600up;
        if (i2 != f32586x1) {
            c3059ii.m12955x1("number:format-source", yvz.m45189k4(i2));
        }
        zob zobVar = this.f32601yj;
        if (zobVar != null) {
            zobVar.mo6846k4("style", c3059ii, "text-properties");
        }
        List.Enumerator<C7394ca> it = this.f32596ks.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f32587x6.m27428k4(next.m29539k4())) {
                    case 12:
                        c3059ii2 = c3059ii;
                        ((jkn) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 13:
                        c3059ii2 = c3059ii;
                        ((edy) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 14:
                        c3059ii2 = c3059ii;
                        ((tac) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 15:
                        c3059ii2 = c3059ii;
                        ((hj3) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 16:
                        c3059ii2 = c3059ii;
                        ((s1a) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 17:
                        c3059ii2 = c3059ii;
                        ((zfk) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 18:
                        c3059ii2 = c3059ii;
                        ((ue7) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 19:
                        c3059ii2 = c3059ii;
                        ((td3) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 20:
                        c3059ii2 = c3059ii;
                        ((t4w) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 21:
                        c3059ii2 = c3059ii;
                        ((xxd) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 22:
                        c3059ii2 = c3059ii;
                        ((wo2) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 23:
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
        List.Enumerator<abb> it2 = this.f32598rv.iterator();
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
