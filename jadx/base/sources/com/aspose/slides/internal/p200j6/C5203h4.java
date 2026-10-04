package com.aspose.slides.internal.p200j6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p333p8.C9421c5;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.j6.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C5203h4 {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC5200du m22209k4(C7185jd c7185jd) {
        return m22210k4(c7185jd, (Dictionary<String, AbstractC5200du>) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC5200du m22210k4(C7185jd c7185jd, Dictionary<String, AbstractC5200du> dictionary) {
        return m22211k4(c7185jd, dictionary, null);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC5200du m22211k4(C7185jd c7185jd, Dictionary<String, AbstractC5200du> dictionary, C9421c5 c9421c5) {
        if (C7019kk.m27469x1(c7185jd, C7182dy.class)) {
            return m22212k4(((C7182dy) c7185jd).m27766k4(), dictionary);
        }
        if (!C7019kk.m27469x1(c7185jd, C7186k4.class)) {
            throw new IOException(C14113y2.m67402k4("Unknown colorspace type '{0}'", c7185jd));
        }
        C7186k4 c7186k4 = (C7186k4) c7185jd;
        String strM27766k4 = ((C7182dy) c7186k4.m27787x1(0)).m27766k4();
        if (C14113y2.m67363du(strM27766k4, C5212x1.m22233x1())) {
            return new C5212x1(c7186k4);
        }
        if (C14113y2.m67363du(strM27766k4, C5202fa.m22207k4())) {
            return C5202fa.f14208k4;
        }
        if (C14113y2.m67363du(strM27766k4, C5204jd.m22213k4())) {
            return new C5204jd();
        }
        if (C14113y2.m67363du(strM27766k4, C5201dy.m22205k4())) {
            return C5201dy.f14206k4;
        }
        if (C14113y2.m67363du(strM27766k4, C5206kk.m22216x1())) {
            return new C5206kk(c7186k4);
        }
        if (C14113y2.m67363du(strM27766k4, C5199ck.m22196k4())) {
            return new C5199ck(c7186k4);
        }
        if (C14113y2.m67363du(strM27766k4, C5214yj.m22243x1()) || C14113y2.m67363du(strM27766k4, C5214yj.m22241h4())) {
            return new C5214yj(c7186k4, c9421c5);
        }
        if (C14113y2.m67363du(strM27766k4, C5207ks.m22217k4())) {
            return new C5207ks(c7186k4);
        }
        if (C14113y2.m67363du(strM27766k4, C5213x6.m22234k4())) {
            return new C5213x6(c7186k4);
        }
        if (C14113y2.m67363du(strM27766k4, C5211up.m22230x1())) {
            return new C5211up(c7186k4);
        }
        if (C14113y2.m67363du(strM27766k4, C5209rv.m22225k4())) {
            return new C5209rv(c7186k4);
        }
        throw new IOException(C14113y2.m67402k4("Unknown colorspace array type '{0}'", strM27766k4));
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC5200du m22212k4(String str, Dictionary<String, AbstractC5200du> dictionary) {
        if (C14113y2.m67363du(str, C5201dy.m22205k4()) || C14113y2.m67363du(str, C5201dy.m22206x1())) {
            return C5201dy.f14206k4;
        }
        if (C14113y2.m67363du(str, C5202fa.m22207k4()) || C14113y2.m67363du(str, C5202fa.m22208x1())) {
            return C5202fa.f14208k4;
        }
        if (C14113y2.m67363du(str, C5204jd.m22213k4()) || C14113y2.m67363du(str, C5204jd.m22214x1())) {
            return new C5204jd();
        }
        if (dictionary != null && dictionary.containsKey(str)) {
            return dictionary.get_Item(str);
        }
        if (C14113y2.m67363du(str, C5207ks.m22217k4())) {
            return new C5207ks();
        }
        if (C14113y2.m67363du(str, C5209rv.m22225k4())) {
            return new C5209rv();
        }
        throw new IOException(C14113y2.m67402k4("Unknown colorspace '{0}'", str));
    }
}
