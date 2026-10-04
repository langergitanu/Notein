package com.aspose.slides.internal.p332p7;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class o9e extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f27763jd = new C7017h4(RequestParameters.POSITION, "polar", "map", "invx", "invy", "switch", "xrange", "yrange", "radiusrange");

    /* JADX INFO: renamed from: c5 */
    private String f27764c5;

    /* JADX INFO: renamed from: du */
    private int f27765du;

    /* JADX INFO: renamed from: dy */
    private String f27766dy;

    /* JADX INFO: renamed from: h4 */
    private int f27767h4;

    /* JADX INFO: renamed from: k4 */
    private String f27768k4;

    /* JADX INFO: renamed from: kk */
    private String f27769kk;

    /* JADX INFO: renamed from: m9 */
    private String f27770m9;

    /* JADX INFO: renamed from: to */
    private int f27771to;

    /* JADX INFO: renamed from: x1 */
    private String f27772x1;

    public o9e() {
        m38072x1();
    }

    public o9e(AbstractC13912i5 abstractC13912i5) {
        m38072x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.o9e.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (o9e.f27763jd.m27428k4(str)) {
                    case 0:
                        o9e.this.f27768k4 = str2;
                        break;
                    case 1:
                        o9e.this.f27772x1 = str2;
                        break;
                    case 2:
                        o9e.this.f27769kk = str2;
                        break;
                    case 3:
                        o9e.this.f27771to = m9s.m36733k4(str2);
                        break;
                    case 4:
                        o9e.this.f27765du = m9s.m36733k4(str2);
                        break;
                    case 5:
                        o9e.this.f27767h4 = m7n.m36723k4(str2);
                        break;
                    case 6:
                        o9e.this.f27770m9 = str2;
                        break;
                    case 7:
                        o9e.this.f27766dy = str2;
                        break;
                    case 8:
                        o9e.this.f27764c5 = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m38072x1() {
        this.f27771to = 0;
        this.f27765du = 0;
        this.f27767h4 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38073k4(String str) {
        this.f27768k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m38074x1(String str) {
        this.f27770m9 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f27768k4;
        if (str3 != null) {
            c3059ii.m12955x1(RequestParameters.POSITION, str3);
        }
        String str4 = this.f27772x1;
        if (str4 != null) {
            c3059ii.m12955x1("polar", str4);
        }
        String str5 = this.f27769kk;
        if (str5 != null) {
            c3059ii.m12955x1("map", str5);
        }
        int i = this.f27771to;
        if (i != 0) {
            c3059ii.m12955x1("invx", m9s.m36734k4(i));
        }
        int i2 = this.f27765du;
        if (i2 != 0) {
            c3059ii.m12955x1("invy", m9s.m36734k4(i2));
        }
        int i3 = this.f27767h4;
        if (i3 != 0) {
            c3059ii.m12955x1("switch", m7n.m36724k4(i3));
        }
        String str6 = this.f27770m9;
        if (str6 != null) {
            c3059ii.m12955x1("xrange", str6);
        }
        String str7 = this.f27766dy;
        if (str7 != null) {
            c3059ii.m12955x1("yrange", str7);
        }
        String str8 = this.f27764c5;
        if (str8 != null) {
            c3059ii.m12955x1("radiusrange", str8);
        }
        c3059ii.mo21898jd();
    }
}
