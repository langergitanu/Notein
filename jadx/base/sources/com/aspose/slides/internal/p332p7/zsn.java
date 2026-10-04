package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class zsn extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f34150dy = new C7017h4("text:table-name", "text:table-type", "text:database-name", "style:num-format", "style:num-letter-sync", "text:value", "connection-resource", "_TEXT");

    /* JADX INFO: renamed from: du */
    private byte f34151du;

    /* JADX INFO: renamed from: h4 */
    private long f34152h4;

    /* JADX INFO: renamed from: k4 */
    private String f34153k4;

    /* JADX INFO: renamed from: kk */
    private String f34154kk;

    /* JADX INFO: renamed from: m9 */
    private List<C7394ca> f34155m9;

    /* JADX INFO: renamed from: to */
    private String f34156to;

    /* JADX INFO: renamed from: x1 */
    private int f34157x1;

    public zsn() {
        m45947x1();
    }

    public zsn(AbstractC13912i5 abstractC13912i5) {
        m45947x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zsn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = zsn.f34150dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    zsn.this.f34153k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    zsn.this.f34157x1 = tgm.m41711k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    zsn.this.f34154kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    zsn.this.f34156to = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    zsn.this.f34151du = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                zsn.this.f34152h4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    if (f34150dy.m27428k4(abstractC13912i5.mo65023fa()) == 6) {
                        this.f34155m9.addItem(new C7394ca("connection-resource", new r1l(abstractC13912i5)));
                        break;
                    } else {
                        abstractC13912i5.mo65208bv();
                        if (abstractC13912i5.mo65015ar()) {
                            break;
                        }
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    OooOO0O.OooO0O0("_TEXT", abstractC13912i5.mo65042rv(), this.f34155m9);
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m45947x1() {
        this.f34157x1 = 0;
        this.f34151du = (byte) -1;
        this.f34152h4 = 4294967295L;
        this.f34155m9 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:table-name", this.f34153k4);
        int i = this.f34157x1;
        if (i != 0) {
            c3059ii.m12955x1("text:table-type", tgm.m41712k4(i));
        }
        String str3 = this.f34154kk;
        if (str3 != null) {
            c3059ii.m12955x1("text:database-name", str3);
        }
        String str4 = this.f34156to;
        if (str4 != null) {
            c3059ii.m12955x1("style:num-format", str4);
        }
        byte b = this.f34151du;
        if (b != -1) {
            c3059ii.m12955x1("style:num-letter-sync", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j = this.f34152h4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("text:value", C13850af.m65147x1(j));
        }
        List.Enumerator<C7394ca> it = this.f34155m9.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f34150dy.m27428k4(next.m29539k4());
                if (iM27428k4 == 6) {
                    ((r1l) next.m29541kk()).mo6846k4("form", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 7) {
                    c3059ii.mo21918x1((String) next.m29541kk());
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3059ii.mo21898jd();
    }
}
