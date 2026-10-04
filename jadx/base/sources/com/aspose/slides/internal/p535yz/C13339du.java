package com.aspose.slides.internal.p535yz;

import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.logging.type.LogSeverity;
import com.microsoft.identity.common.java.marker.PerfConstants;

/* JADX INFO: renamed from: com.aspose.slides.internal.yz.du */
/* JADX INFO: loaded from: classes5.dex */
public class C13339du {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f44700k4 = new C7017h4(PerfConstants.ScenarioConstants.SCENARIO_NON_BROKERED_ACQUIRE_TOKEN_SILENTLY, PerfConstants.ScenarioConstants.SCENARIO_BROKERED_ACQUIRE_TOKEN_SILENTLY, PerfConstants.ScenarioConstants.SCENARIO_GENERATE_AT_POP_ASYMMETRIC_KEYPAIR, "lighter", "normal", "400", "500", "bolder", "600", "bold", "700", "800", "900");

    /* JADX INFO: renamed from: k4 */
    public static int m61993k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return 400;
        }
        switch (f44700k4.m27428k4(C14113y2.m67361du(C14113y2.m67440x1(str)))) {
            case 0:
                return 100;
            case 1:
                return 200;
            case 2:
                return 300;
            case 3:
                return 399;
            case 4:
            case 5:
            default:
                return 400;
            case 6:
                return 500;
            case 7:
                return 401;
            case 8:
                return 600;
            case 9:
            case 10:
                return LogSeverity.ALERT_VALUE;
            case 11:
                return LogSeverity.EMERGENCY_VALUE;
            case 12:
                return SQLitePersistence.MAX_ARGS;
        }
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m61995kk(int i) {
        return m61996x1(i) >= 600;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m61996x1(int i) {
        if (i == 401) {
            return 600;
        }
        if (i == 399) {
            return 400;
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m61994k4(int i) {
        return i != 100 ? i != 200 ? i != 300 ? i != 399 ? i != 401 ? i != 500 ? i != 600 ? i != 700 ? i != 800 ? i != 900 ? "normal" : "900" : "800" : "bold" : "600" : "500" : "bolder" : "lighter" : PerfConstants.ScenarioConstants.SCENARIO_GENERATE_AT_POP_ASYMMETRIC_KEYPAIR : PerfConstants.ScenarioConstants.SCENARIO_BROKERED_ACQUIRE_TOKEN_SILENTLY : PerfConstants.ScenarioConstants.SCENARIO_NON_BROKERED_ACQUIRE_TOKEN_SILENTLY;
    }
}
