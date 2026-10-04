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
public class ka1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f25535k4 = ulh.m42487k4("short");

    /* JADX INFO: renamed from: ks */
    private static final C7017h4 f25536ks = new C7017h4("style:name", "number:language", "number:country", "number:title", "style:volatile", "number:transliteration-format", "number:transliteration-language", "number:transliteration-country", "number:transliteration-style", "number:automatic-order", "text-properties", "text", "number", "currency-symbol", "map");

    /* JADX INFO: renamed from: c5 */
    private String f25537c5;

    /* JADX INFO: renamed from: ck */
    private boolean f25538ck;

    /* JADX INFO: renamed from: du */
    private String f25539du;

    /* JADX INFO: renamed from: dy */
    private String f25540dy;

    /* JADX INFO: renamed from: fa */
    private zob f25541fa;

    /* JADX INFO: renamed from: h4 */
    private byte f25542h4;

    /* JADX INFO: renamed from: jd */
    private int f25543jd;

    /* JADX INFO: renamed from: kk */
    private String f25544kk;

    /* JADX INFO: renamed from: m9 */
    private String f25545m9;

    /* JADX INFO: renamed from: to */
    private String f25546to;

    /* JADX INFO: renamed from: up */
    private List<C7394ca> f25547up;

    /* JADX INFO: renamed from: x1 */
    private String f25548x1;

    /* JADX INFO: renamed from: yj */
    private List<abb> f25549yj;

    public ka1() {
        m35235x1();
    }

    public ka1(final AbstractC13912i5 abstractC13912i5) {
        m35235x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ka1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (ka1.f25536ks.m27428k4(str)) {
                    case 0:
                        ka1.this.f25548x1 = str2;
                        break;
                    case 1:
                        ka1.this.f25544kk = str2;
                        break;
                    case 2:
                        ka1.this.f25546to = str2;
                        break;
                    case 3:
                        ka1.this.f25539du = str2;
                        break;
                    case 4:
                        ka1.this.f25542h4 = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 5:
                        ka1.this.f25545m9 = str2;
                        break;
                    case 6:
                        ka1.this.f25540dy = str2;
                        break;
                    case 7:
                        ka1.this.f25537c5 = str2;
                        break;
                    case 8:
                        ka1.this.f25543jd = ulh.m42487k4(str2);
                        break;
                    case 9:
                        ka1.this.f25538ck = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ka1.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (ka1.f25536ks.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 10:
                        ka1.this.f25541fa = new zob(abstractC13912i5);
                        return true;
                    case 11:
                        abstractC13912i5.mo65026h4();
                        OooOO0O.OooO0O0("text", abstractC13912i5.mo65042rv(), ka1.this.f25547up);
                        return true;
                    case 12:
                        f8s f8sVar = new f8s(abstractC13912i5);
                        list = ka1.this.f25547up;
                        c7394ca = new C7394ca("number", f8sVar);
                        break;
                    case 13:
                        s8a s8aVar = new s8a(abstractC13912i5);
                        list = ka1.this.f25547up;
                        c7394ca = new C7394ca("currency-symbol", s8aVar);
                        break;
                    case 14:
                        ka1.this.f25549yj.addItem(new abb(abstractC13912i5));
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
    private void m35235x1() {
        this.f25542h4 = (byte) -1;
        this.f25545m9 = "1";
        this.f25543jd = f25535k4;
        this.f25538ck = false;
        this.f25547up = new List<>();
        this.f25549yj = new List<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[SYNTHETIC] */
    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        Throwable th;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("style:name", this.f25548x1);
        if (this.f25544kk != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:language", this.f25544kk);
        }
        if (this.f25546to != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:country", this.f25546to);
        }
        if (this.f25539du != null) {
            if (c3059ii.mo12952k4("http://www.w3.org/2001/XMLSchema") == null) {
                c3059ii.m12954to("xmlns", "xs", null, "http://www.w3.org/2001/XMLSchema");
            }
            c3059ii.m12955x1("number:title", this.f25539du);
        }
        byte b = this.f25542h4;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (b != -1) {
            c3059ii.m12955x1("style:volatile", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        if (!"1".equals(this.f25545m9)) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:transliteration-format", this.f25545m9);
        }
        if (this.f25540dy != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:transliteration-language", this.f25540dy);
        }
        if (this.f25537c5 != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:transliteration-country", this.f25537c5);
        }
        int i = this.f25543jd;
        if (i != f25535k4) {
            c3059ii.m12955x1("number:transliteration-style", ulh.m42488k4(i));
        }
        if (this.f25538ck) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            if (this.f25538ck) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("number:automatic-order", str3);
        }
        zob zobVar = this.f25541fa;
        if (zobVar != null) {
            zobVar.mo6846k4("style", c3059ii, "text-properties");
        }
        List.Enumerator<C7394ca> it = this.f25547up.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f25536ks.m27428k4(next.m29539k4())) {
                    case 11:
                        c3059ii2 = c3059ii;
                        try {
                            m29301k4("number", c3059ii2, "text", (String) next.m29541kk(), false);
                            c3059ii = c3059ii2;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                throw th;
                            }
                            it.dispose();
                            throw th;
                        }
                        break;
                    case 12:
                        ((f8s) next.m29541kk()).mo6846k4("number", c3059ii, next.m29539k4());
                        c3059ii2 = c3059ii;
                        c3059ii = c3059ii2;
                        break;
                    case 13:
                        try {
                            ((s8a) next.m29541kk()).mo6846k4("number", c3059ii, next.m29539k4());
                            c3059ii2 = c3059ii;
                            c3059ii = c3059ii2;
                            break;
                        } catch (Throwable th3) {
                            th = th3;
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            }
                        }
                        break;
                    default:
                        c3059ii2 = c3059ii;
                        c3059ii = c3059ii2;
                        break;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        C3059ii c3059ii3 = c3059ii;
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator<abb> it2 = this.f25549yj.iterator();
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
