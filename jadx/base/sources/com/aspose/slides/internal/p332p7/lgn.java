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
public class lgn extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f26300c5 = new C7017h4("fo:background-color", "fo:margin-left", "fo:margin-right", "style:protect", "text:dont-balance-text-columns", "style:writing-mode", "background-image", "columns", "notes-configuration");

    /* JADX INFO: renamed from: du */
    private byte f26301du;

    /* JADX INFO: renamed from: dy */
    private List<C8249m9> f26302dy;

    /* JADX INFO: renamed from: h4 */
    private int f26303h4;

    /* JADX INFO: renamed from: k4 */
    private String f26304k4;

    /* JADX INFO: renamed from: kk */
    private String f26305kk;

    /* JADX INFO: renamed from: m9 */
    private List<C7394ca> f26306m9;

    /* JADX INFO: renamed from: to */
    private boolean f26307to;

    /* JADX INFO: renamed from: x1 */
    private String f26308x1;

    public lgn() {
        m36135x1();
    }

    public lgn(AbstractC13912i5 abstractC13912i5) {
        List<C7394ca> list;
        C7394ca c7394ca;
        m36135x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lgn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = lgn.f26300c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    lgn.this.f26304k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    lgn.this.f26308x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    lgn.this.f26305kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    lgn.this.f26307to = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 4) {
                    lgn.this.f26301du = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                lgn.this.f26303h4 = fon.m31926k4(str2);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            do {
                if (abstractC13912i5.mo65028jd() != 15 || !C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    if (abstractC13912i5.mo65028jd() == 1) {
                        int iM27428k4 = f26300c5.m27428k4(abstractC13912i5.mo65023fa());
                        if (iM27428k4 == 6) {
                            fq4 fq4Var = new fq4(abstractC13912i5);
                            list = this.f26306m9;
                            c7394ca = new C7394ca("background-image", fq4Var);
                        } else if (iM27428k4 == 7) {
                            cl1 cl1Var = new cl1(abstractC13912i5);
                            list = this.f26306m9;
                            c7394ca = new C7394ca("columns", cl1Var);
                        } else if (iM27428k4 != 8) {
                            this.f26302dy.addItem(new C8249m9(abstractC13912i5));
                        } else {
                            r5t r5tVar = new r5t(abstractC13912i5);
                            list = this.f26306m9;
                            c7394ca = new C7394ca("notes-configuration", r5tVar);
                        }
                        list.addItem(c7394ca);
                        break;
                    }
                    break;
                }
                return;
            } while (!abstractC13912i5.mo65015ar());
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m36135x1() {
        this.f26301du = (byte) -1;
        this.f26303h4 = 0;
        this.f26306m9 = new List<>();
        this.f26302dy = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f26304k4;
        if (str3 != null) {
            c3059ii.m12955x1("fo:background-color", str3);
        }
        String str4 = this.f26308x1;
        if (str4 != null) {
            c3059ii.m12955x1("fo:margin-left", str4);
        }
        String str5 = this.f26305kk;
        if (str5 != null) {
            c3059ii.m12955x1("fo:margin-right", str5);
        }
        boolean z = this.f26307to;
        String str6 = TelemetryEventStrings.Value.FALSE;
        c3059ii.m12955x1("style:protect", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        byte b = this.f26301du;
        if (b != -1) {
            if (b == 1) {
                str6 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("text:dont-balance-text-columns", str6);
        }
        int i = this.f26303h4;
        if (i != 0) {
            c3059ii.m12955x1("style:writing-mode", fon.m31927k4(i));
        }
        List.Enumerator<C7394ca> it = this.f26306m9.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f26300c5.m27428k4(next.m29539k4());
                if (iM27428k4 == 6) {
                    ((fq4) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 7) {
                    ((cl1) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 8) {
                    ((r5t) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
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
        List.Enumerator<C8249m9> it2 = this.f26302dy.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4("", c3059ii, "");
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
