package com.aspose.slides.internal.p506xo;

import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7187kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.xo.m9 */
/* JADX INFO: loaded from: classes5.dex */
public class C12587m9 {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC12588to m58746k4() {
        return new C12589up("Helvetica");
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12588to m58747k4(C7187kk c7187kk) {
        C7182dy c7182dy = (C7182dy) c7187kk.mo27768h4(C7182dy.f19711xz);
        if (c7182dy != null && !C7182dy.f19461i5.equals(c7182dy)) {
            throw new IOException("Unknown font type is encountered: " + c7182dy);
        }
        C7182dy c7182dy2 = (C7182dy) c7187kk.mo27768h4(C7182dy.f19585pu);
        if (c7182dy2 != null) {
            return c7182dy2.equals(C7182dy.f19660uu) ? new C12589up(c7187kk) : c7182dy2.equals(C7182dy.f19334ae) ? new C12581dy(c7187kk) : c7182dy2.equals(C7182dy.f19523m5) ? new C12584jd(c7187kk) : c7182dy2.equals(C7182dy.f19509la) ? new C12591yj(c7187kk) : c7182dy2.equals(C7182dy.f19466il) ? new C12579ck(c7187kk) : c7182dy2.equals(C7182dy.f19741zj) ? new C12590x1(c7187kk) : c7182dy2.equals(C7182dy.f19336ai) ? new C12586kk(c7187kk) : new C12589up(c7187kk);
        }
        throw new IOException("A SubType entry is not found in font data.");
    }
}
