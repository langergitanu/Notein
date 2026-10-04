package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.ak */
/* JADX INFO: loaded from: classes3.dex */
public class C1615ak extends C1634k4 {
    public C1615ak(Dictionary<String, Object> dictionary) {
        super("loca");
        this.f6307dy = dictionary;
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public long mo8701k4(C1627f9 c1627f9) {
        return ((((long) (c1627f9.m8785m9().length + 1)) & 4294967295L) * (((Short) C7019kk.m27464to(c1627f9.m8775h4().get_Item("head").m8837k4("indexToLocFormat"), Short.TYPE)).shortValue() != 0 ? 4L : 2L)) & 4294967295L;
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public void mo8702k4(C1655vh c1655vh, C1627f9 c1627f9) {
        C1618bv[] c1618bvArr = (C1618bv[]) C7019kk.m27458kk(c1627f9.m8775h4().get_Item("glyf").m8837k4("glyfs"), C1618bv[].class);
        short sShortValue = ((Short) C7019kk.m27464to(c1627f9.m8777k4("head").get_Item("indexToLocFormat"), Short.TYPE)).shortValue();
        double d = sShortValue == 0 ? 0.5d : 1.0d;
        int length = c1627f9.m8785m9().length;
        long jM27435du = 0;
        for (int i = 0; i < length; i++) {
            if (sShortValue != 0) {
                c1655vh.m8999k4(jM27435du);
            } else {
                c1655vh.m8995k4((int) (C18177fb.f54859s & jM27435du));
            }
            jM27435du = ((jM27435du & 4294967295L) + (C7019kk.m27435du(Double.valueOf(((double) c1618bvArr[i].m8711x1()) * d), 14) & 4294967295L)) & 4294967295L;
        }
        if (sShortValue != 0) {
            c1655vh.m8999k4(jM27435du);
        } else {
            c1655vh.m8995k4((int) (jM27435du & C18177fb.f54859s));
        }
    }
}
