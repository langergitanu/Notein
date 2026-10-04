package com.aspose.slides.internal.p092du;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: com.aspose.slides.internal.du.yw */
/* JADX INFO: loaded from: classes3.dex */
public class C3371yw extends AbstractC3345vh {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f9734k4 = new C7017h4("first-line", "first-letter", "before", "after", "first", "left", "right", "link", "visited", "focus", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "hover", "target", "default", "selection", RequestParameters.MARKER);

    @Override // com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public String mo13929k4(int i) {
        switch (i) {
            case 1:
                return "first-line";
            case 2:
                return "first-letter";
            case 3:
                return "after";
            case 4:
                return "before";
            case 5:
                return RequestParameters.MARKER;
            case 6:
                return "first";
            case 7:
                return "left";
            case 8:
                return "right";
            case 9:
                return "link";
            case 10:
                return "visited";
            case 11:
                return "focus";
            case 12:
                return AppMeasurementSdk.ConditionalUserProperty.ACTIVE;
            case 13:
                return "hover";
            case 14:
                return "target";
            case 15:
                return "default";
            case 16:
                return "selection";
            default:
                throw new ArgumentException("value");
        }
    }

    @Override // com.aspose.slides.internal.p092du.AbstractC3345vh, com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public boolean mo13930k4(String str, int[] iArr) {
        switch (f9734k4.m27428k4(str)) {
            case 0:
                iArr[0] = 1;
                return true;
            case 1:
                iArr[0] = 2;
                return true;
            case 2:
                iArr[0] = 4;
                return true;
            case 3:
                iArr[0] = 3;
                return true;
            case 4:
                iArr[0] = 6;
                return true;
            case 5:
                iArr[0] = 7;
                return true;
            case 6:
                iArr[0] = 8;
                return true;
            case 7:
                iArr[0] = 9;
                return true;
            case 8:
                iArr[0] = 10;
                return true;
            case 9:
                iArr[0] = 11;
                return true;
            case 10:
                iArr[0] = 12;
                return true;
            case 11:
                iArr[0] = 13;
                return true;
            case 12:
                iArr[0] = 14;
                return true;
            case 13:
                iArr[0] = 15;
                return true;
            case 14:
                iArr[0] = 16;
                return true;
            case 15:
                iArr[0] = 5;
                return true;
            default:
                iArr[0] = ((Integer) C7019kk.m27467x1(Integer.TYPE)).intValue();
                return false;
        }
    }
}
