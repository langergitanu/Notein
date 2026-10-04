package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class kjw extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private String f25704c5;

    /* JADX INFO: renamed from: ck */
    private String f25705ck;

    /* JADX INFO: renamed from: du */
    private int f25706du;

    /* JADX INFO: renamed from: dy */
    private String f25707dy;

    /* JADX INFO: renamed from: fa */
    private List<odi> f25708fa;

    /* JADX INFO: renamed from: h4 */
    private String f25709h4;

    /* JADX INFO: renamed from: jd */
    private String f25710jd;

    /* JADX INFO: renamed from: kk */
    private int f25711kk;

    /* JADX INFO: renamed from: m9 */
    private String f25712m9;

    /* JADX INFO: renamed from: to */
    private String f25713to;

    /* JADX INFO: renamed from: k4 */
    public static final int f25701k4 = bjb.m28917k4("objectBoundingBox");

    /* JADX INFO: renamed from: x1 */
    public static final int f25703x1 = jwp.m35046k4("pad");

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f25702up = new C7017h4("svg:gradientUnits", "svg:gradientTransform", "svg:spreadMethod", "draw:name", "draw:display-name", "svg:x1", "svg:y1", "svg:x2", "svg:y2", "stop");

    public kjw() {
        m35448x1();
    }

    public kjw(final AbstractC13912i5 abstractC13912i5) {
        m35448x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kjw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (kjw.f25702up.m27428k4(str)) {
                    case 0:
                        kjw.this.f25711kk = bjb.m28917k4(str2);
                        break;
                    case 1:
                        kjw.this.f25713to = str2;
                        break;
                    case 2:
                        kjw.this.f25706du = jwp.m35046k4(str2);
                        break;
                    case 3:
                        kjw.this.f25709h4 = str2;
                        break;
                    case 4:
                        kjw.this.f25712m9 = str2;
                        break;
                    case 5:
                        kjw.this.f25707dy = str2;
                        break;
                    case 6:
                        kjw.this.f25704c5 = str2;
                        break;
                    case 7:
                        kjw.this.f25710jd = str2;
                        break;
                    case 8:
                        kjw.this.f25705ck = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kjw.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (kjw.f25702up.m27428k4(abstractC13912i5.mo65023fa()) != 9) {
                    return false;
                }
                kjw.this.f25708fa.addItem(new odi(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m35448x1() {
        this.f25711kk = f25701k4;
        this.f25706du = f25703x1;
        this.f25707dy = "0%";
        this.f25704c5 = "0%";
        this.f25710jd = "100%";
        this.f25705ck = "100%";
        this.f25708fa = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f25711kk;
        if (i != f25701k4) {
            c3059ii.m12955x1("svg:gradientUnits", bjb.m28918k4(i));
        }
        String str3 = this.f25713to;
        if (str3 != null) {
            c3059ii.m12955x1("svg:gradientTransform", str3);
        }
        int i2 = this.f25706du;
        if (i2 != f25703x1) {
            c3059ii.m12955x1("svg:spreadMethod", jwp.m35047k4(i2));
        }
        c3059ii.m12955x1("draw:name", this.f25709h4);
        String str4 = this.f25712m9;
        if (str4 != null) {
            c3059ii.m12955x1("draw:display-name", str4);
        }
        if (!"0%".equals(this.f25707dy)) {
            c3059ii.m12955x1("svg:x1", this.f25707dy);
        }
        if (!"0%".equals(this.f25704c5)) {
            c3059ii.m12955x1("svg:y1", this.f25704c5);
        }
        if (!"100%".equals(this.f25710jd)) {
            c3059ii.m12955x1("svg:x2", this.f25710jd);
        }
        if (!"100%".equals(this.f25705ck)) {
            c3059ii.m12955x1("svg:y2", this.f25705ck);
        }
        List.Enumerator<odi> it = this.f25708fa.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("svg", c3059ii, "stop");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
