package com.aspose.slides.internal.p529yn;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5802sv;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.qq */
/* JADX INFO: loaded from: classes5.dex */
public class C12873qq extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43369k4 = C7019kk.m27443k4((Class<?>) C5802sv.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f43370x1 = new C7017h4("get_top", "get_right", "get_bottom", "get_left");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC5803to abstractC5803toM23694k4;
        C5802sv c5802sv = (C5802sv) abstractC6123ca.mo24769C_();
        int iM27428k4 = f43370x1.m27428k4(str);
        if (iM27428k4 == 0) {
            abstractC5803toM23694k4 = c5802sv.m23694k4();
        } else if (iM27428k4 == 1) {
            abstractC5803toM23694k4 = c5802sv.m23697x1();
        } else if (iM27428k4 == 2) {
            abstractC5803toM23694k4 = c5802sv.m23695kk();
        } else {
            if (iM27428k4 != 3) {
                throw new C6208y2("unknown function");
            }
            abstractC5803toM23694k4 = c5802sv.m23696to();
        }
        return m10084k4(abstractC5803toM23694k4, C7019kk.m27443k4((Class<?>) AbstractC5803to.class));
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("top", 1);
        m10033k4("right", 1);
        m10033k4("bottom", 1);
        m10033k4("left", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f43369k4;
    }
}
