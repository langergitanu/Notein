package com.aspose.slides.internal.p404sp;

import com.aspose.slides.internal.p136fr.C4113k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice;

/* JADX INFO: renamed from: com.aspose.slides.internal.sp.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C10312kk {

    /* JADX INFO: renamed from: k4 */
    private boolean f36735k4;

    /* JADX INFO: renamed from: kk */
    private boolean f36736kk;

    /* JADX INFO: renamed from: x1 */
    private int f36737x1;

    public C10312kk() {
        m50281k4(false);
        m50280k4(5);
        m50282x1(false);
    }

    /* JADX INFO: renamed from: k4 */
    public static C10312kk m50279k4(String str) {
        C10312kk c10312kk = new C10312kk();
        if (str != null) {
            try {
                if (!C14113y2.m67411k4(C14113y2.m67440x1(str))) {
                    String strM67368h4 = C14113y2.m67368h4(C14113y2.m67440x1(str));
                    String strM67440x1 = C14113y2.m67440x1(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(strM67368h4, "defer", ""), "meet", ""), AzureActiveDirectorySlice.SLICE_PARAMETER, ""));
                    c10312kk.m50281k4(C14113y2.m67448x1(strM67368h4, "defer"));
                    c10312kk.m50282x1(C14113y2.m67424kk(strM67368h4, AzureActiveDirectorySlice.SLICE_PARAMETER));
                    c10312kk.m50280k4(C10311k4.m50277k4(strM67440x1));
                    return c10312kk;
                }
            } catch (RuntimeException e) {
                if (!C4113k4.f11284k4) {
                    throw e;
                }
            }
        }
        return c10312kk;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m50284kk() {
        return this.f36736kk;
    }

    public String toString() {
        if (m50285x1() == 0) {
            return "none";
        }
        C6765kp c6765kp = new C6765kp();
        if (m50283k4()) {
            c6765kp.m26792k4("defer ");
        }
        c6765kp.m26792k4(C10311k4.m50278k4(m50285x1()));
        c6765kp.m26792k4(C14113y2.m67408k4(" ", m50284kk() ? AzureActiveDirectorySlice.SLICE_PARAMETER : "meet"));
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m50285x1() {
        return this.f36737x1;
    }

    public C10312kk(int i) {
        m50280k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    private void m50280k4(int i) {
        this.f36737x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    private void m50282x1(boolean z) {
        this.f36736kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    private void m50281k4(boolean z) {
        this.f36735k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m50283k4() {
        return this.f36735k4;
    }
}
