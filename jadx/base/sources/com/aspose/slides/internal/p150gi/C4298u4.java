package com.aspose.slides.internal.p150gi;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.u4 */
/* JADX INFO: loaded from: classes.dex */
public class C4298u4 extends C4277ix {

    /* JADX INFO: renamed from: m9 */
    private int[][] f11720m9;

    public C4298u4(AbstractC4275gi abstractC4275gi) {
        super(abstractC4275gi);
        this.f11720m9 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17275k4(int[][] iArr) {
        if (iArr == null) {
            throw new NullReferenceException();
        }
        for (int i = 0; i < iArr.length; i++) {
            int[] iArr2 = iArr[i];
            if (iArr2 == null || iArr2.length != 4) {
                throw new ArgumentException(C14113y2.m67408k4("bad sub-array @ [", C14057f9.m66591x1(i), "]"));
            }
        }
        this.f11720m9 = iArr;
    }

    @Override // com.aspose.slides.internal.p150gi.C4277ix
    /* JADX INFO: renamed from: x1 */
    public AbstractC4282kp mo17241x1(AbstractC3533um abstractC3533um) {
        AbstractC4282kp abstractC4282kpMo17241x1 = super.mo17241x1(abstractC3533um);
        if (abstractC4282kpMo17241x1 == null) {
            abstractC4282kpMo17241x1 = this.f11673k4.mo17212k4(abstractC3533um);
        }
        int[] iArr = this.f11720m9[0];
        AbstractC4282kp abstractC4282kpM14394k4 = abstractC3533um.m14394k4(abstractC3533um.m14392k4(iArr[0], iArr[1], iArr[2], iArr[3]));
        if (abstractC4282kpM14394k4 != null) {
            this.f11673k4.mo17138k4(abstractC4282kpMo17241x1, 3072, abstractC4282kpM14394k4);
        }
        int[] iArr2 = this.f11720m9[1];
        AbstractC4282kp abstractC4282kpM14394k42 = abstractC3533um.m14394k4(abstractC3533um.m14392k4(iArr2[0], iArr2[1], iArr2[2], iArr2[3]));
        if (abstractC4282kpM14394k42 != null) {
            this.f11673k4.mo17138k4(abstractC4282kpMo17241x1, 2560, abstractC4282kpM14394k42);
        }
        return abstractC4282kpMo17241x1;
    }

    @Override // com.aspose.slides.internal.p150gi.C4277ix
    /* JADX INFO: renamed from: k4 */
    public boolean mo17239k4(AbstractC3533um abstractC3533um) {
        if (super.mo17239k4(abstractC3533um)) {
            return true;
        }
        int i = 0;
        while (true) {
            int[][] iArr = this.f11720m9;
            if (i >= iArr.length) {
                return false;
            }
            if (abstractC3533um.mo14065x1(iArr[i][0]) != null) {
                return true;
            }
            i++;
        }
    }
}
