package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.n8 */
/* JADX INFO: loaded from: classes4.dex */
public class C8317n8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f27170c5 = new C7017h4("parentLabelLayout", "regionLabelLayout", "visibility", "aggregation", "binning", "geography", "statistics", "subtotals", "extLst");

    /* JADX INFO: renamed from: du */
    private C7865hm f27171du;

    /* JADX INFO: renamed from: dy */
    private C7249ah f27172dy;

    /* JADX INFO: renamed from: h4 */
    private C8045jy f27173h4;

    /* JADX INFO: renamed from: k4 */
    private C8831t2 f27174k4;

    /* JADX INFO: renamed from: kk */
    private C7676fm f27175kk;

    /* JADX INFO: renamed from: m9 */
    private C8506pb f27176m9;

    /* JADX INFO: renamed from: to */
    private C7394ca f27177to;

    /* JADX INFO: renamed from: x1 */
    private C8480ox f27178x1;

    public C8317n8() {
    }

    /* JADX INFO: renamed from: du */
    public final C8045jy m37315du() {
        return this.f27173h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8506pb m37316h4() {
        return this.f27176m9;
    }

    /* JADX INFO: renamed from: kk */
    public final C7394ca m37324kk() {
        return this.f27177to;
    }

    /* JADX INFO: renamed from: to */
    public final C7865hm m37325to() {
        return this.f27171du;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7676fm m37326x1() {
        return this.f27175kk;
    }

    public C8317n8(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.n8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8317n8 c8317n8;
                C7394ca c7394ca;
                switch (C8317n8.f27170c5.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C8317n8.this.f27174k4 = new C8831t2(abstractC13912i5);
                        return true;
                    case 1:
                        C8317n8.this.f27178x1 = new C8480ox(abstractC13912i5);
                        return true;
                    case 2:
                        C8317n8.this.f27175kk = new C7676fm(abstractC13912i5);
                        return true;
                    case 3:
                        c8317n8 = C8317n8.this;
                        c7394ca = new C7394ca("aggregation", new C7788gq(abstractC13912i5));
                        break;
                    case 4:
                        c8317n8 = C8317n8.this;
                        c7394ca = new C7394ca("binning", new C8028jp(abstractC13912i5));
                        break;
                    case 5:
                        C8317n8.this.f27171du = new C7865hm(abstractC13912i5);
                        return true;
                    case 6:
                        C8317n8.this.f27173h4 = new C8045jy(abstractC13912i5);
                        return true;
                    case 7:
                        C8317n8.this.f27176m9 = new C8506pb(abstractC13912i5);
                        return true;
                    case 8:
                        C8317n8.this.f27172dy = new C7249ah(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                c8317n8.f27177to = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m37317k4(String str) {
        C7394ca c7394ca;
        if (this.f27177to != null) {
            throw new Exception("AggregationOrBinning already is initialized.");
        }
        int iM27428k4 = f27170c5.m27428k4(str);
        if (iM27428k4 == 3) {
            c7394ca = new C7394ca("aggregation", new C7788gq());
        } else {
            if (iM27428k4 != 4) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("binning", new C8028jp());
        }
        this.f27177to = c7394ca;
        return this.f27177to;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8831t2 m37318k4() {
        return this.f27174k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37319k4(C7676fm c7676fm) {
        this.f27175kk = c7676fm;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37320k4(C7865hm c7865hm) {
        this.f27171du = c7865hm;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37321k4(C8045jy c8045jy) {
        this.f27173h4 = c8045jy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37322k4(C8506pb c8506pb) {
        this.f27176m9 = c8506pb;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37323k4(C8831t2 c8831t2) {
        this.f27174k4 = c8831t2;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8831t2 c8831t2 = this.f27174k4;
        if (c8831t2 != null) {
            c8831t2.mo6846k4("cx", c3059ii, "parentLabelLayout");
        }
        C8480ox c8480ox = this.f27178x1;
        if (c8480ox != null) {
            c8480ox.mo6846k4("cx", c3059ii, "regionLabelLayout");
        }
        C7676fm c7676fm = this.f27175kk;
        if (c7676fm != null) {
            c7676fm.mo6846k4("cx", c3059ii, "visibility");
        }
        C7394ca c7394ca = this.f27177to;
        if (c7394ca != null) {
            int iM27428k4 = f27170c5.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 3) {
                ((C7788gq) this.f27177to.m29541kk()).mo6846k4("cx", c3059ii, this.f27177to.m29539k4());
            } else if (iM27428k4 == 4) {
                ((C8028jp) this.f27177to.m29541kk()).mo6846k4("cx", c3059ii, this.f27177to.m29539k4());
            }
        }
        C7865hm c7865hm = this.f27171du;
        if (c7865hm != null) {
            c7865hm.mo6846k4("cx", c3059ii, "geography");
        }
        C8045jy c8045jy = this.f27173h4;
        if (c8045jy != null) {
            c8045jy.mo6846k4("cx", c3059ii, "statistics");
        }
        C8506pb c8506pb = this.f27176m9;
        if (c8506pb != null) {
            c8506pb.mo6846k4("cx", c3059ii, "subtotals");
        }
        C7249ah c7249ah = this.f27172dy;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
