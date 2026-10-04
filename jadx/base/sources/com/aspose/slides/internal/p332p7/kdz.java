package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.miui.penengine.p596e.C18773h;

/* JADX INFO: loaded from: classes4.dex */
public class kdz extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f25604m9 = new C7017h4("text:level", "text:style-name", "text:continue-numbering", "text:start-value", "number", ContextChain.TAG_PRODUCT, C18773h.f57233c);

    /* JADX INFO: renamed from: du */
    private String f25605du;

    /* JADX INFO: renamed from: h4 */
    private C7394ca f25606h4;

    /* JADX INFO: renamed from: k4 */
    private long f25607k4;

    /* JADX INFO: renamed from: kk */
    private byte f25608kk;

    /* JADX INFO: renamed from: to */
    private long f25609to;

    /* JADX INFO: renamed from: x1 */
    private String f25610x1;

    public kdz() {
        m35306x1();
    }

    public kdz(final AbstractC13912i5 abstractC13912i5) {
        m35306x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kdz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = kdz.f25604m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    kdz.this.f25607k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    kdz.this.f25610x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    kdz.this.f25608kk = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                kdz.this.f25609to = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kdz.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                kdz kdzVar;
                C7394ca c7394ca;
                int iM27428k4 = kdz.f25604m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 != 4) {
                    if (iM27428k4 == 5) {
                        kdzVar = kdz.this;
                        c7394ca = new C7394ca(ContextChain.TAG_PRODUCT, new ok7(abstractC13912i5));
                    } else {
                        if (iM27428k4 != 6) {
                            return false;
                        }
                        kdzVar = kdz.this;
                        c7394ca = new C7394ca(C18773h.f57233c, new kmn(abstractC13912i5));
                    }
                    kdzVar.f25606h4 = c7394ca;
                    return true;
                }
                kdz.this.f25605du = abstractC13912i5.mo65052v4();
                if (abstractC13912i5.mo65048u4()) {
                    return true;
                }
                while (abstractC13912i5.mo65028jd() != 15) {
                    abstractC13912i5.mo65026h4();
                    kdz kdzVar2 = kdz.this;
                    kdzVar2.f25605du = C14113y2.m67400k4(kdzVar2.f25605du, abstractC13912i5.mo65052v4());
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m35306x1() {
        this.f25607k4 = 1L;
        this.f25608kk = (byte) -1;
        this.f25609to = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        kdz kdzVar;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f25607k4;
        if ((j & 4294967295L) != 1) {
            c3059ii.m12955x1("text:level", C13850af.m65147x1(j));
        }
        String str3 = this.f25610x1;
        if (str3 != null) {
            c3059ii.m12955x1("text:style-name", str3);
        }
        byte b = this.f25608kk;
        if (b != -1) {
            c3059ii.m12955x1("text:continue-numbering", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j2 = this.f25609to;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("text:start-value", C13850af.m65147x1(j2));
        }
        String str4 = this.f25605du;
        if (str4 != null) {
            kdzVar = this;
            c3059ii2 = c3059ii;
            kdzVar.m29301k4("text", c3059ii2, "number", str4, false);
        } else {
            kdzVar = this;
            c3059ii2 = c3059ii;
        }
        C7394ca c7394ca = kdzVar.f25606h4;
        if (c7394ca != null) {
            int iM27428k4 = f25604m9.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 5) {
                ((ok7) kdzVar.f25606h4.m29541kk()).mo6846k4("text", c3059ii2, kdzVar.f25606h4.m29539k4());
            } else if (iM27428k4 == 6) {
                ((kmn) kdzVar.f25606h4.m29541kk()).mo6846k4("text", c3059ii2, kdzVar.f25606h4.m29539k4());
            }
        }
        c3059ii2.mo21898jd();
    }
}
