package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.ar */
/* JADX INFO: loaded from: classes.dex */
public class C4261ar extends AbstractC4271e0 {

    /* JADX INFO: renamed from: k4 */
    public static final C4261ar f11596k4 = new C4261ar(0.0d, "mpt", 1.0f);

    /* JADX INFO: renamed from: x1 */
    private final int f11597x1;

    private C4261ar(double d, String str, float f) {
        this.f11597x1 = m17121x1(d, str, f);
    }

    /* JADX INFO: renamed from: x1 */
    private static int m17121x1(double d, String str, float f) {
        double d2;
        if (C14113y2.m67363du(str, "px")) {
            d2 = f * 1000.0f;
        } else if (C14113y2.m67363du(BackupFile.EXTENSION_NOTEIN_FILE, str)) {
            d2 = 72000.0d;
        } else if (C14113y2.m67363du("cm", str)) {
            d2 = 28346.4567d;
        } else if (C14113y2.m67363du("mm", str)) {
            d2 = 2834.64567d;
        } else if (C14113y2.m67363du(TranslateLanguage.PORTUGUESE, str)) {
            d2 = 1000.0d;
        } else {
            if (!C14113y2.m67363du("pc", str)) {
                if (!C14113y2.m67363du("mpt", str)) {
                    d = 0.0d;
                }
                return C7019kk.m27462to(Double.valueOf(d), 14);
            }
            d2 = 12000.0d;
        }
        d *= d2;
        return C7019kk.m27462to(Double.valueOf(d), 14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4261ar c4261ar = (C4261ar) C7019kk.m27452k4(obj, C4261ar.class);
        return c4261ar != null && c4261ar.f11597x1 == this.f11597x1;
    }

    public int hashCode() {
        return this.f11597x1;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: k4 */
    public double mo9879k4() {
        return this.f11597x1;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: kk */
    public boolean mo9883kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: to */
    public int mo9884to() {
        return this.f11597x1;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    public String toString() {
        return C14113y2.m67408k4(C14057f9.m66591x1(this.f11597x1), "mpt");
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: k4 */
    public double mo9880k4(InterfaceC1981h4 interfaceC1981h4) {
        return this.f11597x1;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: x1 */
    public int mo9886x1(InterfaceC1981h4 interfaceC1981h4) {
        return this.f11597x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4261ar m17118k4(double d) {
        return m17120k4(d, "mpt", 1.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4261ar m17119k4(double d, String str) {
        return m17120k4(d, str, 1.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4261ar m17120k4(double d, String str, float f) {
        return d == 0.0d ? f11596k4 : new C4261ar(d, str, f);
    }
}
