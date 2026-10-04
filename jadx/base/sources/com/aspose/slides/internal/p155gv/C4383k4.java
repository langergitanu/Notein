package com.aspose.slides.internal.p155gv;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gv.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4383k4 {

    /* JADX INFO: renamed from: k4 */
    private final String f11918k4;

    /* JADX INFO: renamed from: kk */
    private final int f11919kk;

    /* JADX INFO: renamed from: x1 */
    private final String f11920x1;

    /* JADX INFO: renamed from: to */
    private static final C4383k4 f11917to = new C4383k4("DeviceGray", "G", 1);

    /* JADX INFO: renamed from: du */
    private static final C4383k4 f11913du = new C4383k4("DeviceRGB", "RGB", 3);

    /* JADX INFO: renamed from: h4 */
    private static final C4383k4 f11915h4 = new C4383k4("DeviceCMYK", "CMYK", 4);

    /* JADX INFO: renamed from: m9 */
    private static final C4383k4 f11916m9 = new C4383k4("Indexed", "I", 1);

    /* JADX INFO: renamed from: dy */
    private static final C4383k4 f11914dy = new C4383k4("Pattern", C14113y2.f47374k4, 0);

    private C4383k4(String str, String str2, int i) {
        this.f11918k4 = str;
        this.f11920x1 = str2;
        this.f11919kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4383k4 m17714k4() {
        return f11917to;
    }

    /* JADX INFO: renamed from: kk */
    public static C4383k4 m17716kk() {
        return f11916m9;
    }

    /* JADX INFO: renamed from: to */
    public static C4383k4 m17717to() {
        return f11914dy;
    }

    /* JADX INFO: renamed from: x1 */
    public static C4383k4 m17718x1() {
        return f11913du;
    }

    /* JADX INFO: renamed from: du */
    public final String m17719du() {
        return this.f11918k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m17720h4() {
        return this.f11919kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4383k4 m17715k4(int i) {
        if (i == 0) {
            return m17718x1();
        }
        if (i == 1) {
            return m17716kk();
        }
        if (i == 2) {
            return m17714k4();
        }
        throw new InvalidOperationException("Unknown bitmap color space.");
    }
}
