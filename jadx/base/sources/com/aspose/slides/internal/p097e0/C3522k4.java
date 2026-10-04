package com.aspose.slides.internal.p097e0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p051bz.C1921qq;
import com.aspose.slides.internal.p150gi.AbstractC4275gi;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4262b3;
import com.aspose.slides.internal.p150gi.C4297ts;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3522k4 extends C4262b3 {
    @Override // com.aspose.slides.internal.p150gi.C4262b3
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo14305k4(int i, AbstractC4282kp abstractC4282kp, AbstractC4275gi abstractC4275gi, AbstractC3533um abstractC3533um) {
        List<AbstractC4282kp> listMo17208t_ = abstractC4282kp.mo17208t_();
        if (listMo17208t_ != null) {
            if (listMo17208t_.size() == 1) {
                return new C4297ts(listMo17208t_.get_Item(0));
            }
            if (listMo17208t_.size() == 2) {
                return new C4297ts(listMo17208t_.get_Item(0), listMo17208t_.get_Item(1));
            }
        }
        throw new C1921qq("list with 1 or 2 length values expected");
    }
}
