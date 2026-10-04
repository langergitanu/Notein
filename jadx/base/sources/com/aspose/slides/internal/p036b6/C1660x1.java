package com.aspose.slides.internal.p036b6;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1660x1 {
    /* JADX INFO: renamed from: k4 */
    public static C1631h4[][] m9032k4(C1631h4 c1631h4, C1631h4 c1631h42, C1631h4 c1631h43, C1631h4 c1631h44) {
        if (c1631h4.m8817kk() == c1631h42.m8817kk() && c1631h4.m8818to() == c1631h42.m8818to() && c1631h43.m8817kk() == c1631h44.m8817kk() && c1631h43.m8818to() == c1631h44.m8818to()) {
            return new C1631h4[][]{new C1631h4[]{c1631h4, new C1631h4((c1631h44.m8817kk() + c1631h4.m8817kk()) / 2.0d, (c1631h44.m8818to() + c1631h4.m8818to()) / 2.0d), c1631h44}};
        }
        double dM8817kk = ((c1631h42.m8817kk() * 3.0d) + (c1631h44.m8817kk() - (c1631h43.m8817kk() * 3.0d))) - c1631h4.m8817kk();
        double dM8818to = ((c1631h42.m8818to() * 3.0d) + (c1631h44.m8818to() - (c1631h43.m8818to() * 3.0d))) - c1631h4.m8818to();
        if ((dM8818to * dM8818to) + (dM8817kk * dM8817kk) <= 4.0d) {
            return new C1631h4[][]{m9033x1(c1631h4, c1631h42, c1631h43, c1631h44)};
        }
        C1631h4 c1631h45 = new C1631h4((c1631h4.m8817kk() + ((c1631h42.m8817kk() * 3.0d) + ((c1631h43.m8817kk() * 3.0d) + c1631h44.m8817kk()))) / 8.0d, (c1631h4.m8818to() + ((c1631h42.m8818to() * 3.0d) + ((c1631h43.m8818to() * 3.0d) + c1631h44.m8818to()))) / 8.0d);
        return new C1631h4[][]{m9033x1(c1631h4, new C1631h4((c1631h42.m8817kk() + c1631h4.m8817kk()) / 2.0d, (c1631h42.m8818to() + c1631h4.m8818to()) / 2.0d), new C1631h4((c1631h43.m8817kk() + ((c1631h42.m8817kk() * 2.0d) + c1631h4.m8817kk())) / 4.0d, (c1631h43.m8818to() + ((c1631h42.m8818to() * 2.0d) + c1631h4.m8818to())) / 4.0d), c1631h45), m9033x1(c1631h45, new C1631h4(((c1631h43.m8817kk() * 2.0d) + (c1631h42.m8817kk() + c1631h44.m8817kk())) / 4.0d, ((c1631h43.m8818to() * 2.0d) + (c1631h42.m8818to() + c1631h44.m8818to())) / 4.0d), new C1631h4((c1631h43.m8817kk() + c1631h44.m8817kk()) / 2.0d, (c1631h43.m8818to() + c1631h44.m8818to()) / 2.0d), c1631h44)};
    }

    /* JADX INFO: renamed from: x1 */
    private static C1631h4[] m9033x1(C1631h4 c1631h4, C1631h4 c1631h42, C1631h4 c1631h43, C1631h4 c1631h44) {
        return new C1631h4[]{c1631h4, new C1631h4((((c1631h42.m8817kk() * 3.0d) + ((c1631h43.m8817kk() * 3.0d) - c1631h44.m8817kk())) - c1631h4.m8817kk()) / 4.0d, (((c1631h42.m8818to() * 3.0d) + ((c1631h43.m8818to() * 3.0d) - c1631h44.m8818to())) - c1631h4.m8818to()) / 4.0d), c1631h44};
    }
}
