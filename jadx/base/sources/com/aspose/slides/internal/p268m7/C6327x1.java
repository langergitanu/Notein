package com.aspose.slides.internal.p268m7;

import com.aspose.slides.internal.p167hh.C4586to;
import com.aspose.slides.internal.p272md.C6376h4;
import com.aspose.slides.internal.p274mh.C6385kk;
import com.aspose.slides.internal.p347px.C9579bv;
import com.aspose.slides.internal.p475wh.C12004dy;
import java.util.HashMap;

/* JADX INFO: renamed from: com.aspose.slides.internal.m7.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6327x1 {

    /* JADX INFO: renamed from: k4 */
    private static HashMap<Integer, C12004dy> f17994k4 = new HashMap<>(3);

    /* JADX INFO: renamed from: k4 */
    public static C12004dy m25894k4(Integer num) {
        if (!f17994k4.containsKey(num)) {
            m25895k4();
        }
        return f17994k4.get(num);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m25895k4() {
        C6385kk c6385kk = new C6385kk();
        int i = 0;
        for (C12004dy c12004dy : c6385kk.m26211k4()) {
            C9579bv c9579bvMo18944ck = ((C4586to) c6385kk.m26208k4(c12004dy.m56527du(), 0)).mo18944ck();
            if (c9579bvMo18944ck != null) {
                C6376h4 c6376h4 = new C6376h4(c9579bvMo18944ck.m46793ks());
                if (c6376h4.m26203to() == 9 && !f17994k4.containsKey(2)) {
                    f17994k4.put(2, c12004dy);
                    i++;
                }
                if (c6376h4.m26204x1() == 11 || c6376h4.m26204x1() == 12 || c6376h4.m26204x1() == 13) {
                    if (!f17994k4.containsKey(1)) {
                        f17994k4.put(1, c12004dy);
                        i++;
                    }
                } else if (c6376h4.m26204x1() != 1 && !f17994k4.containsKey(0)) {
                    f17994k4.put(0, c12004dy);
                    i++;
                }
            }
            if (i >= 3) {
                break;
            }
        }
        if (i < 3) {
            if (!f17994k4.containsKey(2)) {
                f17994k4.put(2, null);
            }
            if (!f17994k4.containsKey(1)) {
                f17994k4.put(1, null);
            }
            if (f17994k4.containsKey(0)) {
                return;
            }
            f17994k4.put(0, null);
        }
    }
}
