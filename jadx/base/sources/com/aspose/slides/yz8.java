package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7836hc;
import com.aspose.slides.internal.p332p7.C8041jv;
import com.aspose.slides.internal.p332p7.C8245m6;
import com.aspose.slides.internal.p332p7.C8493p6;
import com.aspose.slides.internal.p332p7.C8541pr;
import com.aspose.slides.internal.p332p7.C8734s2;
import com.aspose.slides.internal.p332p7.C8865tf;
import com.aspose.slides.internal.p332p7.C8904tx;

/* JADX INFO: loaded from: classes3.dex */
class yz8 {
    /* JADX INFO: renamed from: k4 */
    public static void m74182k4(f7k f7kVar, C8245m6 c8245m6, C0899df[] c0899dfArr, C13791lr[] c13791lrArr) {
        C7836hc c7836hcM34975k4;
        C13791lr[] c13791lrArr2;
        long j;
        long j2;
        C0899df[] c0899dfArr2;
        C8541pr c8541prM36713k4 = c8245m6.m36713k4();
        int i = 0;
        for (byte b : f7kVar.m6043m9()) {
            C7394ca c7394caM39060k4 = c8541prM36713k4.m39060k4(f7k.f4995k4.m12964k4(b & 255));
            if (b == 1) {
                c7836hcM34975k4 = ((C8041jv) c7394caM39060k4.m29542x1()).m34975k4();
                c13791lrArr2 = c13791lrArr;
                j = f7kVar.m6041k4()[i];
                j2 = f7kVar.m6041k4()[i + 1];
                c0899dfArr2 = c0899dfArr;
            } else if (b != 2) {
                if (b == 3) {
                    C8734s2 c8734s2 = (C8734s2) c7394caM39060k4.m29542x1();
                    c8734s2.m40728k4(C0914ds.m5228k4(f7kVar.m6041k4()[i], c0899dfArr, c13791lrArr));
                    c8734s2.m40734x1(C0914ds.m5228k4(f7kVar.m6041k4()[i + 1], c0899dfArr, c13791lrArr));
                    int i2 = i + 3;
                    c8734s2.m40730kk(C0914ds.m5228k4(f7kVar.m6041k4()[i + 2], c0899dfArr, c13791lrArr));
                    i += 4;
                    c8734s2.m40732to(C0914ds.m5228k4(f7kVar.m6041k4()[i2], c0899dfArr, c13791lrArr));
                } else if (b == 4) {
                    C8904tx c8904tx = (C8904tx) c7394caM39060k4.m29542x1();
                    m74183k4(c8904tx.m41977k4(), f7kVar.m6041k4()[i], f7kVar.m6041k4()[i + 1], c0899dfArr, c13791lrArr);
                    m74183k4(c8904tx.m41978x1(), f7kVar.m6041k4()[i + 2], f7kVar.m6041k4()[i + 3], c0899dfArr, c13791lrArr);
                    i += 4;
                } else if (b == 5) {
                    C8865tf c8865tf = (C8865tf) c7394caM39060k4.m29542x1();
                    m74183k4(c8865tf.m41699k4(), f7kVar.m6041k4()[i], f7kVar.m6041k4()[i + 1], c0899dfArr, c13791lrArr);
                    m74183k4(c8865tf.m41701x1(), f7kVar.m6041k4()[i + 2], f7kVar.m6041k4()[i + 3], c0899dfArr, c13791lrArr);
                    m74183k4(c8865tf.m41700kk(), f7kVar.m6041k4()[i + 4], f7kVar.m6041k4()[i + 5], c0899dfArr, c13791lrArr);
                    i += 6;
                }
            } else {
                c13791lrArr2 = c13791lrArr;
                c7836hcM34975k4 = ((C8493p6) c7394caM39060k4.m29542x1()).m38624k4();
                c0899dfArr2 = c0899dfArr;
                j = f7kVar.m6041k4()[i];
                j2 = f7kVar.m6041k4()[i + 1];
            }
            m74183k4(c7836hcM34975k4, j, j2, c0899dfArr2, c13791lrArr2);
            i += 2;
        }
        c8541prM36713k4.m39062k4(f7kVar.m6045x1() / 12700.0d);
        c8541prM36713k4.m39068x1(f7kVar.m6042kk() / 12700.0d);
        c8541prM36713k4.m39061k4(f7kVar.m6031du());
        c8541prM36713k4.m39064k4(f7kVar.m6032h4());
        c8541prM36713k4.m39069x1(f7kVar.m6044to());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74183k4(C7836hc c7836hc, long j, long j2, C0899df[] c0899dfArr, C13791lr[] c13791lrArr) {
        c7836hc.m33275k4(C0914ds.m5228k4(j, c0899dfArr, c13791lrArr));
        c7836hc.m33277x1(C0914ds.m5228k4(j2, c0899dfArr, c13791lrArr));
    }
}
