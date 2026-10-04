package com.aspose.slides.internal.p393s7;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.logging.type.LogSeverity;

/* JADX INFO: renamed from: com.aspose.slides.internal.s7.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C10150ck {

    /* JADX INFO: renamed from: k4 */
    private static final String[] f36525k4 = {"italic", "oblique", "inclined"};

    /* JADX INFO: renamed from: x1 */
    private static final String[] f36528x1 = {"light"};

    /* JADX INFO: renamed from: kk */
    private static final String[] f36526kk = {"medium"};

    /* JADX INFO: renamed from: to */
    private static final String[] f36527to = {"demi", "semi"};

    /* JADX INFO: renamed from: du */
    private static final String[] f36523du = {"bold"};

    /* JADX INFO: renamed from: h4 */
    private static final String[] f36524h4 = {"extrabold", "extra bold", "black", "heavy", "ultra", "super"};

    /* JADX INFO: renamed from: k4 */
    public static int m49926k4(String str) {
        try {
            return C14116yg.m67507x1(C14116yg.m67483k4((C14057f9.m66582k4(str) / 100) * 100, 100), SQLitePersistence.MAX_ARGS);
        } catch (RuntimeException e) {
            if (!C7019kk.m27469x1(e, FormatException.class)) {
                throw e;
            }
            if (C14113y2.m67363du(str, "normal")) {
                return 400;
            }
            if (C14113y2.m67363du(str, "bold")) {
                return LogSeverity.ALERT_VALUE;
            }
            throw new ArgumentException(C14113y2.m67408k4("Illegal value for font weight: '", str, "'. Use one of: 100, 200, 300, ", "400, 500, 600, 700, 800, 900, ", "normal (=400), bold (=700)"));
        }
    }
}
