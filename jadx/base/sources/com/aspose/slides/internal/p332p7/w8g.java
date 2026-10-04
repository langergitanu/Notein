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
public class w8g extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private int f32230c5;

    /* JADX INFO: renamed from: du */
    private boolean f32231du;

    /* JADX INFO: renamed from: dy */
    private int f32232dy;

    /* JADX INFO: renamed from: h4 */
    private String f32233h4;

    /* JADX INFO: renamed from: jd */
    private List<edw> f32234jd;

    /* JADX INFO: renamed from: kk */
    private String f32235kk;

    /* JADX INFO: renamed from: m9 */
    private int f32236m9;

    /* JADX INFO: renamed from: to */
    private String f32237to;

    /* JADX INFO: renamed from: x1 */
    private String f32238x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f32229k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f32228ck = new C7017h4("draw:code", "draw:object", "draw:archive", "draw:may-script", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate", "param");

    public w8g() {
        m43584x1();
    }

    public w8g(final AbstractC13912i5 abstractC13912i5) {
        m43584x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.w8g.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (w8g.f32228ck.m27428k4(str)) {
                    case 0:
                        w8g.this.f32238x1 = str2;
                        break;
                    case 1:
                        w8g.this.f32235kk = str2;
                        break;
                    case 2:
                        w8g.this.f32237to = str2;
                        break;
                    case 3:
                        w8g.this.f32231du = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        w8g.this.f32233h4 = str2;
                        break;
                    case 5:
                        w8g.this.f32236m9 = bhu.m28903k4(str2);
                        break;
                    case 6:
                        w8g.this.f32232dy = bdd.m28828k4(str2);
                        break;
                    case 7:
                        w8g.this.f32230c5 = qs5.m39644k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.w8g.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (w8g.f32228ck.m27428k4(abstractC13912i5.mo65023fa()) != 8) {
                    return false;
                }
                w8g.this.f32234jd.addItem(new edw(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m43584x1() {
        this.f32231du = false;
        this.f32236m9 = f32229k4;
        this.f32232dy = 0;
        this.f32230c5 = 0;
        this.f32234jd = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f32238x1;
        if (str3 != null) {
            c3059ii.m12955x1("draw:code", str3);
        }
        String str4 = this.f32235kk;
        if (str4 != null) {
            c3059ii.m12955x1("draw:object", str4);
        }
        String str5 = this.f32237to;
        if (str5 != null) {
            c3059ii.m12955x1("draw:archive", str5);
        }
        boolean z = this.f32231du;
        if (z) {
            c3059ii.m12955x1("draw:may-script", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str6 = this.f32233h4;
        if (str6 != null) {
            c3059ii.m12955x1("xlink:href", str6);
        }
        int i = this.f32236m9;
        if (i != f32229k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f32232dy;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:show", bdd.m28829k4(i2));
        }
        int i3 = this.f32230c5;
        if (i3 != 0) {
            c3059ii.m12955x1("xlink:actuate", qs5.m39645k4(i3));
        }
        List.Enumerator<edw> it = this.f32234jd.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("draw", c3059ii, "param");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
