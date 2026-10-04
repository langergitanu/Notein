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
public class uf9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f31254k4 = ulh.m42487k4("short");

    /* JADX INFO: renamed from: yj */
    private static final C7017h4 f31255yj = new C7017h4("style:name", "number:language", "number:country", "number:title", "style:volatile", "number:transliteration-format", "number:transliteration-language", "number:transliteration-country", "number:transliteration-style", "text-properties", "text-content", "text", "map");

    /* JADX INFO: renamed from: c5 */
    private String f31256c5;

    /* JADX INFO: renamed from: ck */
    private zob f31257ck;

    /* JADX INFO: renamed from: du */
    private String f31258du;

    /* JADX INFO: renamed from: dy */
    private String f31259dy;

    /* JADX INFO: renamed from: fa */
    private List<C7394ca> f31260fa;

    /* JADX INFO: renamed from: h4 */
    private byte f31261h4;

    /* JADX INFO: renamed from: jd */
    private int f31262jd;

    /* JADX INFO: renamed from: kk */
    private String f31263kk;

    /* JADX INFO: renamed from: m9 */
    private String f31264m9;

    /* JADX INFO: renamed from: to */
    private String f31265to;

    /* JADX INFO: renamed from: up */
    private List<abb> f31266up;

    /* JADX INFO: renamed from: x1 */
    private String f31267x1;

    public uf9() {
        m42366x1();
    }

    public uf9(final AbstractC13912i5 abstractC13912i5) {
        m42366x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.uf9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (uf9.f31255yj.m27428k4(str)) {
                    case 0:
                        uf9.this.f31267x1 = str2;
                        break;
                    case 1:
                        uf9.this.f31263kk = str2;
                        break;
                    case 2:
                        uf9.this.f31265to = str2;
                        break;
                    case 3:
                        uf9.this.f31258du = str2;
                        break;
                    case 4:
                        uf9.this.f31261h4 = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 5:
                        uf9.this.f31264m9 = str2;
                        break;
                    case 6:
                        uf9.this.f31259dy = str2;
                        break;
                    case 7:
                        uf9.this.f31256c5 = str2;
                        break;
                    case 8:
                        uf9.this.f31262jd = ulh.m42487k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.uf9.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (uf9.f31255yj.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 9:
                        uf9.this.f31257ck = new zob(abstractC13912i5);
                        return true;
                    case 10:
                        uf9.this.f31260fa.addItem(new C7394ca("text-content", new t8a(abstractC13912i5)));
                        return true;
                    case 11:
                        abstractC13912i5.mo65026h4();
                        OooOO0O.OooO0O0("text", abstractC13912i5.mo65042rv(), uf9.this.f31260fa);
                        return true;
                    case 12:
                        uf9.this.f31266up.addItem(new abb(abstractC13912i5));
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m42366x1() {
        this.f31261h4 = (byte) -1;
        this.f31264m9 = "1";
        this.f31262jd = f31254k4;
        this.f31260fa = new List<>();
        this.f31266up = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("style:name", this.f31267x1);
        if (this.f31263kk != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:language", this.f31263kk);
        }
        if (this.f31265to != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:country", this.f31265to);
        }
        if (this.f31258du != null) {
            if (c3059ii.mo12952k4("http://www.w3.org/2001/XMLSchema") == null) {
                c3059ii.m12954to("xmlns", "xs", null, "http://www.w3.org/2001/XMLSchema");
            }
            c3059ii.m12955x1("number:title", this.f31258du);
        }
        byte b = this.f31261h4;
        if (b != -1) {
            c3059ii.m12955x1("style:volatile", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        if (!"1".equals(this.f31264m9)) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:transliteration-format", this.f31264m9);
        }
        if (this.f31259dy != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:transliteration-language", this.f31259dy);
        }
        if (this.f31256c5 != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:transliteration-country", this.f31256c5);
        }
        int i = this.f31262jd;
        if (i != f31254k4) {
            c3059ii.m12955x1("number:transliteration-style", ulh.m42488k4(i));
        }
        zob zobVar = this.f31257ck;
        if (zobVar != null) {
            zobVar.mo6846k4("style", c3059ii, "text-properties");
        }
        List.Enumerator<C7394ca> it = this.f31260fa.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f31255yj.m27428k4(next.m29539k4());
                if (iM27428k4 == 10) {
                    c3059ii2 = c3059ii;
                    ((t8a) next.m29541kk()).mo6846k4("number", c3059ii2, next.m29539k4());
                } else if (iM27428k4 != 11) {
                    c3059ii2 = c3059ii;
                } else {
                    c3059ii2 = c3059ii;
                    try {
                        m29301k4("number", c3059ii2, "text", (String) next.m29541kk(), false);
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            throw th2;
                        }
                        it.dispose();
                        throw th2;
                    }
                }
                c3059ii = c3059ii2;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        C3059ii c3059ii3 = c3059ii;
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator<abb> it2 = this.f31266up.iterator();
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
