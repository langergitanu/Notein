package com.aspose.slides.internal.p150gi;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p051bz.C1921qq;
import com.aspose.slides.internal.p051bz.C1931x6;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p150gi.C4274g8;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.tq */
/* JADX INFO: loaded from: classes.dex */
public class C4296tq extends C4274g8.k4 {
    public C4296tq(int i) {
        super(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    @Override // com.aspose.slides.internal.p150gi.C4274g8.k4, com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
        C4274g8 c4274g8 = (C4274g8) super.mo17139x1(abstractC4282kp, abstractC3533um, abstractC3524ks);
        List<AbstractC4282kp> listMo17208t_ = c4274g8.mo17208t_();
        int size = listMo17208t_.size();
        boolean z = false;
        int i = -1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int iMo17251du = -1;
        while (true) {
            size += i;
            if (size < 0) {
                return c4274g8;
            }
            AbstractC4282kp abstractC4282kpMo17217k4 = listMo17208t_.get_Item(size);
            if (C7019kk.m27469x1(abstractC4282kpMo17217k4, C1931x6.class)) {
                abstractC4282kpMo17217k4 = mo17217k4(abstractC4282kpMo17217k4.mo9926j_());
                listMo17208t_.set_Item(size, abstractC4282kpMo17217k4);
            }
            if (abstractC4282kpMo17217k4 != null) {
                iMo17251du = abstractC4282kpMo17217k4.mo17251du();
            }
            if (iMo17251du != 17 && iMo17251du != 77 && iMo17251du != 86) {
                if (iMo17251du != 95) {
                    if (iMo17251du != 103 && iMo17251du != 153) {
                        switch (iMo17251du) {
                            case 90:
                            case 91:
                            case 92:
                                break;
                            default:
                                throw new C1921qq("Invalid value specified: " + abstractC4282kp);
                        }
                    }
                } else {
                    if ((z2 | z3 | z4) || z5) {
                        throw new C1921qq("Invalid combination of values");
                    }
                    z = true;
                    i = -1;
                }
            }
            if (z) {
                throw new C1921qq("'none' specified, no additional values allowed");
            }
            if (iMo17251du == 17) {
                if (!z5) {
                    z5 = true;
                }
            } else if (iMo17251du == 77) {
                if (!z4) {
                    z4 = true;
                }
            } else if (iMo17251du != 86) {
                if (iMo17251du != 103) {
                    if (iMo17251du != 153) {
                        switch (iMo17251du) {
                            case 90:
                                break;
                            case 91:
                                break;
                            case 92:
                                break;
                            default:
                                throw new C1921qq("Invalid combination of values");
                        }
                    }
                    if (!z2) {
                        z2 = true;
                    }
                } else if (!z3) {
                    z3 = true;
                }
            }
            i = -1;
        }
    }
}
