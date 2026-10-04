package com.aspose.slides.internal.p404sp;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p087dm.C3188m9;
import com.aspose.slides.internal.p136fr.C4113k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.sp.du */
/* JADX INFO: loaded from: classes4.dex */
public class C10307du {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f36727kk = new C7017h4("%", "rem", "em", "ex", "px", "cm", "mm", BackupFile.EXTENSION_NOTEIN_FILE, TranslateLanguage.PORTUGUESE, "pc", "");

    /* JADX INFO: renamed from: k4 */
    private float f36728k4;

    /* JADX INFO: renamed from: x1 */
    private int f36729x1;

    public C10307du() {
    }

    /* JADX INFO: renamed from: kk */
    public static C10307du m50263kk(float f) {
        C10307du c10307du = new C10307du();
        c10307du.m50267k4(1);
        c10307du.m50266k4(f);
        return c10307du;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m50265k4() {
        return this.f36728k4;
    }

    public String toString() {
        String strM66711k4 = C14064he.m66711k4(m50265k4(), (InterfaceC14073kp) C11697x1.m55250kk());
        switch (m50269x1()) {
            case 2:
                return C14113y2.m67408k4(strM66711k4, "%");
            case 3:
                return C14113y2.m67408k4(strM66711k4, "em");
            case 4:
                return C14113y2.m67408k4(strM66711k4, "ex");
            case 5:
                return C14113y2.m67408k4(strM66711k4, "px");
            case 6:
                return C14113y2.m67408k4(strM66711k4, "cm");
            case 7:
                return C14113y2.m67408k4(strM66711k4, "mm");
            case 8:
                return C14113y2.m67408k4(strM66711k4, BackupFile.EXTENSION_NOTEIN_FILE);
            case 9:
                return C14113y2.m67408k4(strM66711k4, TranslateLanguage.PORTUGUESE);
            case 10:
                return C14113y2.m67408k4(strM66711k4, "pc");
            default:
                return strM66711k4;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final int m50269x1() {
        return this.f36729x1;
    }

    public C10307du(float f, int i) {
        m50266k4(f);
        m50267k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public static C10307du m50261k4(String str) {
        int i;
        C10307du c10307du = new C10307du();
        if (C14113y2.m67411k4(str)) {
            throw new Exception("No number were provided");
        }
        int iM67439x1 = C14113y2.m67439x1(str, new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'});
        if (iM67439x1 < 0) {
            throw new Exception("No number were provided");
        }
        int i2 = iM67439x1 + 1;
        c10307du.m50266k4(C14064he.m66707k4(C14113y2.m67443x1(str, 0, i2), C11697x1.m55250kk()));
        switch (f36727kk.m27428k4(C14113y2.m67422kk(str, i2))) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 13;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 9;
                break;
            case 9:
                c10307du.m50267k4(10);
                return c10307du;
            case 10:
                c10307du.m50267k4(1);
                return c10307du;
            default:
                throw new C3188m9(1, "Invalid SvgLength", str);
        }
        c10307du.m50267k4(i);
        return c10307du;
    }

    /* JADX INFO: renamed from: x1 */
    public static C10307du m50264x1(float f) {
        C10307du c10307du = new C10307du();
        c10307du.m50267k4(2);
        c10307du.m50266k4(f);
        return c10307du;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m50268kk() {
        return m50269x1() == 2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10307du m50262k4(String str, C10307du c10307du) {
        try {
            return m50261k4(str);
        } catch (RuntimeException e) {
            if (C14113y2.m67411k4(str) || C4113k4.f11284k4) {
                return c10307du;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50266k4(float f) {
        this.f36728k4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50267k4(int i) {
        this.f36729x1 = i;
    }
}
