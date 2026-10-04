package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
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
public class w7y extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f32208du = new C7017h4("style:name", "style:display-name", "text:consecutive-numbering", "list-level-style-number", "list-level-style-bullet", "list-level-style-image");

    /* JADX INFO: renamed from: k4 */
    private String f32209k4;

    /* JADX INFO: renamed from: kk */
    private boolean f32210kk;

    /* JADX INFO: renamed from: to */
    private List<C7394ca> f32211to;

    /* JADX INFO: renamed from: x1 */
    private String f32212x1;

    public w7y() {
        m43542to();
    }

    /* JADX INFO: renamed from: to */
    private void m43542to() {
        this.f32210kk = false;
        this.f32211to = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C7394ca> m43546x1() {
        return this.f32211to;
    }

    public w7y(final AbstractC13912i5 abstractC13912i5) {
        m43542to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.w7y.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = w7y.f32208du.m27428k4(str);
                if (iM27428k4 == 0) {
                    w7y.this.f32209k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    w7y.this.f32212x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                w7y.this.f32210kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.w7y.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = w7y.f32208du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    pcw pcwVar = new pcw(abstractC13912i5);
                    list = w7y.this.f32211to;
                    c7394ca = new C7394ca("list-level-style-number", pcwVar);
                } else if (iM27428k4 == 4) {
                    him himVar = new him(abstractC13912i5);
                    list = w7y.this.f32211to;
                    c7394ca = new C7394ca("list-level-style-bullet", himVar);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    tiw tiwVar = new tiw(abstractC13912i5);
                    list = w7y.this.f32211to;
                    c7394ca = new C7394ca("list-level-style-image", tiwVar);
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m43544k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f32208du.m27428k4(str);
        if (iM27428k4 == 3) {
            c7394ca = new C7394ca("list-level-style-number", new pcw());
        } else if (iM27428k4 == 4) {
            c7394ca = new C7394ca("list-level-style-bullet", new him());
        } else {
            if (iM27428k4 != 5) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("list-level-style-image", new tiw());
        }
        this.f32211to.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m43545k4() {
        return this.f32209k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m43547x1(String str) {
        this.f32209k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("style:name", this.f32209k4);
        String str3 = this.f32212x1;
        if (str3 != null) {
            c3059ii.m12955x1("style:display-name", str3);
        }
        boolean z = this.f32210kk;
        if (z) {
            c3059ii.m12955x1("text:consecutive-numbering", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        List.Enumerator<C7394ca> it = this.f32211to.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f32208du.m27428k4(next.m29539k4());
                if (iM27428k4 == 3) {
                    ((pcw) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 4) {
                    ((him) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 5) {
                    ((tiw) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
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
