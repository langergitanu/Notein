package com.aspose.slides.internal.p487wz;

import com.aspose.slides.internal.p055c4.AbstractC1941c5;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wz.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C12329x1 extends AbstractC1941c5 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f41207k4 = new C7017h4("anchor", "big", "blink", "bold", "fixed", "fontcolor", "fontsize", "italics", "link", "small", "strike", "sub", "sup");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1941c5
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10019k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        String strM67402k4;
        switch (f41207k4.m27428k4(str)) {
            case 0:
                strM67402k4 = C14113y2.m67402k4("<a name=\"{1}\">{0}</a>", abstractC6123ca, abstractC6123caArr.length > 0 ? abstractC6123caArr[0].toString() : C14113y2.f47374k4);
                break;
            case 1:
                strM67402k4 = C14113y2.m67402k4("<big>{0}</big>", abstractC6123ca);
                break;
            case 2:
                strM67402k4 = C14113y2.m67402k4("<blink>{0}</blink>", abstractC6123ca);
                break;
            case 3:
                strM67402k4 = C14113y2.m67402k4("<b>{0}</b>", abstractC6123ca);
                break;
            case 4:
                strM67402k4 = C14113y2.m67402k4("<tt>{0}</tt>", abstractC6123ca);
                break;
            case 5:
                strM67402k4 = C14113y2.m67402k4("<font color=\"{1}\">{0}</font>", abstractC6123ca, abstractC6123caArr.length > 0 ? abstractC6123caArr[0].toString() : C14113y2.f47374k4);
                break;
            case 6:
                strM67402k4 = C14113y2.m67402k4("<font size=\"{1}\">{0}</font>", abstractC6123ca, abstractC6123caArr.length > 0 ? abstractC6123caArr[0].toString() : C14113y2.f47374k4);
                break;
            case 7:
                strM67402k4 = C14113y2.m67402k4("<i>{0}</i>", abstractC6123ca);
                break;
            case 8:
                strM67402k4 = C14113y2.m67402k4("<a href=\"{1}\">{0}</a>", abstractC6123ca, abstractC6123caArr.length > 0 ? abstractC6123caArr[0].toString() : C14113y2.f47374k4);
                break;
            case 9:
                strM67402k4 = C14113y2.m67402k4("<small>{0}</small>", abstractC6123ca);
                break;
            case 10:
                strM67402k4 = C14113y2.m67402k4("<strike>{0}</strike>", abstractC6123ca);
                break;
            case 11:
                strM67402k4 = C14113y2.m67402k4("<sub>{0}</sub>", abstractC6123ca);
                break;
            case 12:
                strM67402k4 = C14113y2.m67402k4("<sup>{0}</sup>", abstractC6123ca);
                break;
            default:
                return super.mo10019k4(str, abstractC6123ca, abstractC6123caArr);
        }
        return m10085k4(strM67402k4);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10022kk("anchor");
        m10022kk("big");
        m10022kk("blink");
        m10022kk("bold");
        m10022kk("fixed");
        m10022kk("fontcolor");
        m10022kk("fontsize");
        m10022kk("italics");
        m10022kk("link");
        m10022kk("small");
        m10022kk("strike");
        m10022kk("sub");
        m10022kk("sup");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1941c5
    /* JADX INFO: renamed from: k4 */
    public String mo10020k4() {
        return "String";
    }
}
