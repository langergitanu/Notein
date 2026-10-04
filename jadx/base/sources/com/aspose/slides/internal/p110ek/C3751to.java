package com.aspose.slides.internal.p110ek;

import com.aspose.slides.internal.p018aa.C1324ks;
import com.aspose.slides.internal.p018aa.C1327rv;
import com.aspose.slides.internal.p018aa.C1334x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p488x0.C12337ix;
import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.internal.p488x0.C12350uz;

/* JADX INFO: renamed from: com.aspose.slides.internal.ek.to */
/* JADX INFO: loaded from: classes.dex */
public class C3751to {
    /* JADX INFO: renamed from: k4 */
    public static C12343ne[] m15056k4(long j, C3134k4 c3134k4) {
        int i = (int) (j & 4294967295L);
        C12343ne[] c12343neArr = new C12343ne[i];
        C1324ks c1324ks = new C1324ks();
        for (int i2 = 0; i2 < i; i2++) {
            c12343neArr[i2] = (C12343ne) c1324ks.m7809k4(c3134k4);
        }
        return c12343neArr;
    }

    /* JADX INFO: renamed from: kk */
    public static C12350uz[] m15058kk(long j, C3134k4 c3134k4) {
        int i = (int) (j & 4294967295L);
        C12350uz[] c12350uzArr = new C12350uz[i];
        C1334x6 c1334x6 = new C1334x6();
        for (int i2 = 0; i2 < i; i2++) {
            c12350uzArr[i2] = (C12350uz) c1334x6.m7819k4(c3134k4);
        }
        return c12350uzArr;
    }

    /* JADX INFO: renamed from: x1 */
    public static C12337ix[] m15059x1(long j, C3134k4 c3134k4) {
        int i = (int) (j & 4294967295L);
        C12337ix[] c12337ixArr = new C12337ix[i];
        C1327rv c1327rv = new C1327rv();
        for (int i2 = 0; i2 < i; i2++) {
            c12337ixArr[i2] = (C12337ix) c1327rv.m7812k4(c3134k4);
        }
        return c12337ixArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12350uz[] m15057k4(int i, C3134k4 c3134k4) {
        return m15058kk(((long) i) & 4294967295L, c3134k4);
    }
}
