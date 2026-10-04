package com.aspose.slides.internal.p092du;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;

/* JADX INFO: renamed from: com.aspose.slides.internal.du.c6 */
/* JADX INFO: loaded from: classes3.dex */
public class C3262c6 extends AbstractC3345vh {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f9626k4 = new C7017h4("below", FirebaseAnalytics.Param.LEVEL, "above", "higher", "lower");

    @Override // com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public String mo13929k4(int i) {
        if (i == 0) {
            return "below";
        }
        if (i == 1) {
            return FirebaseAnalytics.Param.LEVEL;
        }
        if (i == 2) {
            return "above";
        }
        if (i == 3) {
            return "higher";
        }
        if (i == 4) {
            return "lower";
        }
        throw new ArgumentException("value");
    }

    @Override // com.aspose.slides.internal.p092du.AbstractC3345vh, com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public boolean mo13930k4(String str, int[] iArr) {
        int iM27428k4 = f9626k4.m27428k4(C14113y2.m67368h4(str));
        if (iM27428k4 == 0) {
            iArr[0] = 0;
            return true;
        }
        if (iM27428k4 == 1) {
            iArr[0] = 1;
            return true;
        }
        if (iM27428k4 == 2) {
            iArr[0] = 2;
            return true;
        }
        if (iM27428k4 == 3) {
            iArr[0] = 3;
            return true;
        }
        if (iM27428k4 != 4) {
            throw new ArgumentException(ResponseType.TOKEN);
        }
        iArr[0] = 4;
        return true;
    }
}
