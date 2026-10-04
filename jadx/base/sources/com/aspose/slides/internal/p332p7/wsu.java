package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes4.dex */
public class wsu extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f32542k4 = a4w.m27938k4("always");

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f32543m9 = new C7017h4("draw:name", "draw:protected", "draw:display", NoteMeta.PROPERTY_TITLE, "desc");

    /* JADX INFO: renamed from: du */
    private String f32544du;

    /* JADX INFO: renamed from: h4 */
    private String f32545h4;

    /* JADX INFO: renamed from: kk */
    private boolean f32546kk;

    /* JADX INFO: renamed from: to */
    private int f32547to;

    /* JADX INFO: renamed from: x1 */
    private String f32548x1;

    public wsu() {
        m44026to();
    }

    /* JADX INFO: renamed from: to */
    private void m44026to() {
        this.f32546kk = false;
        this.f32547to = f32542k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m44030x1() {
        return this.f32547to;
    }

    public wsu(final AbstractC13912i5 abstractC13912i5) {
        m44026to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wsu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = wsu.f32543m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    wsu.this.f32548x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    wsu.this.f32546kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                wsu.this.f32547to = a4w.m27938k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wsu.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = wsu.f32543m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    wsu.this.f32544du = abstractC13912i5.mo65052v4();
                    if (abstractC13912i5.mo65048u4()) {
                        return true;
                    }
                    while (abstractC13912i5.mo65028jd() != 15) {
                        abstractC13912i5.mo65026h4();
                        wsu wsuVar = wsu.this;
                        wsuVar.f32544du = C14113y2.m67400k4(wsuVar.f32544du, abstractC13912i5.mo65052v4());
                    }
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                wsu.this.f32545h4 = abstractC13912i5.mo65052v4();
                if (abstractC13912i5.mo65048u4()) {
                    return true;
                }
                while (abstractC13912i5.mo65028jd() != 15) {
                    abstractC13912i5.mo65026h4();
                    wsu wsuVar2 = wsu.this;
                    wsuVar2.f32545h4 = C14113y2.m67400k4(wsuVar2.f32545h4, abstractC13912i5.mo65052v4());
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m44029k4() {
        return this.f32548x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        wsu wsuVar;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f32548x1;
        if (str3 != null) {
            c3059ii.m12955x1("draw:name", str3);
        }
        boolean z = this.f32546kk;
        if (z) {
            c3059ii.m12955x1("draw:protected", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        int i = this.f32547to;
        if (i != f32542k4) {
            c3059ii.m12955x1("draw:display", a4w.m27939k4(i));
        }
        String str4 = this.f32544du;
        if (str4 != null) {
            wsuVar = this;
            c3059ii2 = c3059ii;
            wsuVar.m29301k4("svg", c3059ii2, NoteMeta.PROPERTY_TITLE, str4, false);
        } else {
            wsuVar = this;
            c3059ii2 = c3059ii;
        }
        String str5 = wsuVar.f32545h4;
        if (str5 != null) {
            wsuVar.m29301k4("svg", c3059ii2, "desc", str5, false);
        }
        c3059ii2.mo21898jd();
    }
}
