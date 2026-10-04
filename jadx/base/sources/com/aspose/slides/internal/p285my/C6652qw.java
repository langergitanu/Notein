package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.AbstractC4908jd;
import com.aspose.slides.internal.p182ii.C4899em;
import com.aspose.slides.internal.p182ii.C4930tq;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.qw */
/* JADX INFO: loaded from: classes4.dex */
public class C6652qw extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18418k4 = C7019kk.m27443k4((Class<?>) C4899em.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18419x1 = new C7017h4("get_rowIndex", "get_sectionRowIndex", "get_cells", "get_align", "set_align", "get_bgColor", "set_bgColor", "get_ch", "set_ch", "get_chOff", "set_chOff", "get_vAlign", "set_vAlign", "insertCell", "deleteCell");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C4899em c4899em = (C4899em) abstractC6123ca.mo24769C_();
        switch (f18419x1.m27428k4(str)) {
            case 0:
                return m10082k4(c4899em.m20340qw());
            case 1:
                return m10082k4(c4899em.m20341tq());
            case 2:
                return m10084k4(c4899em.m20336j2(), C7019kk.m27443k4((Class<?>) AbstractC4908jd.class));
            case 3:
                return m10085k4(c4899em.m20343w6());
            case 4:
                c4899em.m20344wl(abstractC6123caArr[0].toString());
                break;
            case 5:
                return m10085k4(c4899em.m20338os());
            case 6:
                c4899em.m20339qq(abstractC6123caArr[0].toString());
                break;
            case 7:
                return m10085k4(c4899em.m20335em());
            case 8:
                c4899em.m20333ar(abstractC6123caArr[0].toString());
                break;
            case 9:
                return m10085k4(c4899em.m20346zj());
            case 10:
                c4899em.m20342um(abstractC6123caArr[0].toString());
                break;
            case 11:
                return m10085k4(c4899em.m20332ai());
            case 12:
                c4899em.m20334bv(abstractC6123caArr[0].toString());
                break;
            case 13:
                if (abstractC6123caArr.length == 1) {
                    return m10084k4(c4899em.m20337k4(abstractC6123caArr[0].m24794wy()), C7019kk.m27443k4((Class<?>) C4930tq.class));
                }
                throw new C6208y2("invalid arguments count.");
            case 14:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                c4899em.m20345x1(abstractC6123caArr[0].m24794wy());
                break;
                break;
            default:
                throw new C6208y2("unknown function");
        }
        return m10080h4();
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) C12804k4.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("insertCell");
        m10035kk("deleteCell");
        m10033k4("rowIndex", 1);
        m10033k4("sectionRowIndex", 1);
        m10033k4("cells", 1);
        m10033k4("align", 3);
        m10033k4("bgColor", 3);
        m10033k4("ch", 3);
        m10033k4("chOff", 3);
        m10033k4("vAlign", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18418k4;
    }
}
