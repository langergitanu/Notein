package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class lwh extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f26564c5 = new C7017h4("table:source-field-name", "table:date-start", "table:start", "table:date-end", "table:end", "table:step", "table:grouped-by", "data-pilot-group");

    /* JADX INFO: renamed from: du */
    private String f26565du;

    /* JADX INFO: renamed from: dy */
    private List<d4x> f26566dy;

    /* JADX INFO: renamed from: h4 */
    private double f26567h4;

    /* JADX INFO: renamed from: k4 */
    private String f26568k4;

    /* JADX INFO: renamed from: kk */
    private String f26569kk;

    /* JADX INFO: renamed from: m9 */
    private int f26570m9;

    /* JADX INFO: renamed from: to */
    private String f26571to;

    /* JADX INFO: renamed from: x1 */
    private String f26572x1;

    public lwh() {
        m36495x1();
    }

    public lwh(final AbstractC13912i5 abstractC13912i5) {
        m36495x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lwh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (lwh.f26564c5.m27428k4(str)) {
                    case 0:
                        lwh.this.f26568k4 = str2;
                        break;
                    case 1:
                        lwh.this.f26572x1 = str2;
                        break;
                    case 2:
                        lwh.this.f26569kk = str2;
                        break;
                    case 3:
                        lwh.this.f26571to = str2;
                        break;
                    case 4:
                        lwh.this.f26565du = str2;
                        break;
                    case 5:
                        lwh.this.f26567h4 = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 6:
                        lwh.this.f26570m9 = t8l.m41577k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lwh.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (lwh.f26564c5.m27428k4(abstractC13912i5.mo65023fa()) != 7) {
                    return false;
                }
                lwh.this.f26566dy.addItem(new d4x(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m36495x1() {
        this.f26567h4 = Double.NaN;
        this.f26570m9 = 0;
        this.f26566dy = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:source-field-name", this.f26568k4);
        String str3 = this.f26572x1;
        if (str3 != null) {
            c3059ii.m12955x1("table:date-start", str3);
        }
        String str4 = this.f26569kk;
        if (str4 != null) {
            c3059ii.m12955x1("table:start", str4);
        }
        String str5 = this.f26571to;
        if (str5 != null) {
            c3059ii.m12955x1("table:date-end", str5);
        }
        String str6 = this.f26565du;
        if (str6 != null) {
            c3059ii.m12955x1("table:end", str6);
        }
        c3059ii.m12955x1("table:step", C13850af.m65101k4(this.f26567h4));
        c3059ii.m12955x1("table:grouped-by", t8l.m41578k4(this.f26570m9));
        List.Enumerator<d4x> it = this.f26566dy.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("table", c3059ii, "data-pilot-group");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
