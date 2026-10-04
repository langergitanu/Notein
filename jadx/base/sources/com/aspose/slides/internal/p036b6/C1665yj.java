package com.aspose.slides.internal.p036b6;

import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.yj */
/* JADX INFO: loaded from: classes3.dex */
public class C1665yj {

    /* JADX INFO: renamed from: du */
    private static C1665yj[] f6374du = {new C1665yj("version", 0, "SID", null), new C1665yj("notice", 1, "SID", null), new C1665yj("copyright", 1200, "SID", null), new C1665yj("fullName", 2, "SID", null), new C1665yj(CommonConstant.KEY_FAMILY_NAME, 3, "SID", null), new C1665yj("weight", 4, "SID", null), new C1665yj("isFixedPitch", 1201, "number", 0), new C1665yj("italicAngle", 1202, "number", 0), new C1665yj("underlinePosition", 1203, "number", -100), new C1665yj("underlineThickness", 1204, "number", 50), new C1665yj("paintType", 1205, "number", 0), new C1665yj("charstringType", 1206, "number", 2), new C1665yj("fontMatrix", 1207, "real|real|real|real|real|real", new double[]{0.001d, 0.0d, 0.0d, 0.001d, 0.0d, 0.0d}), new C1665yj("uniqueId", 13, "number", null), new C1665yj("fontBBox", 5, "number|number|number|number", new int[]{0, 0, 0, 0}), new C1665yj("strokeWidth", 1208, "number", 0), new C1665yj("xuid", 14, "", null), new C1665yj("charset", 15, "offset", 0), new C1665yj("encoding", 16, "offset", 0), new C1665yj("charStrings", 17, "offset", 0), new C1665yj("private", 18, "number|offset", new int[]{0, 0})};

    /* JADX INFO: renamed from: h4 */
    private static C1665yj[] f6375h4 = {new C1665yj("subrs", 19, "offset", 0), new C1665yj("defaultWidthX", 20, "number", 0), new C1665yj("nominalWidthX", 21, "number", 0)};

    /* JADX INFO: renamed from: k4 */
    private String f6376k4;

    /* JADX INFO: renamed from: kk */
    private String f6377kk;

    /* JADX INFO: renamed from: to */
    private Object f6378to;

    /* JADX INFO: renamed from: x1 */
    private long f6379x1;

    public C1665yj(String str, long j, String str2, Object obj) {
        m9050k4(str);
        m9048k4(j);
        m9051x1(str2);
        m9049k4(obj);
    }

    /* JADX INFO: renamed from: du */
    public static C1665yj[] m9046du() {
        return f6374du;
    }

    /* JADX INFO: renamed from: h4 */
    public static C1665yj[] m9047h4() {
        return f6375h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m9052k4() {
        return this.f6376k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m9053kk() {
        return this.f6377kk;
    }

    /* JADX INFO: renamed from: to */
    public final Object m9054to() {
        return this.f6378to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m9055x1() {
        return this.f6379x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m9048k4(long j) {
        this.f6379x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    private void m9051x1(String str) {
        this.f6377kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    private void m9049k4(Object obj) {
        this.f6378to = obj;
    }

    /* JADX INFO: renamed from: k4 */
    private void m9050k4(String str) {
        this.f6376k4 = str;
    }
}
