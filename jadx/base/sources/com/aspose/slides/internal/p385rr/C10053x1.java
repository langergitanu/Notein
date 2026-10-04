package com.aspose.slides.internal.p385rr;

import com.aspose.slides.internal.p550zi.C13602jd;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.rr.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10053x1 extends C13602jd {

    /* JADX INFO: renamed from: k4 */
    private final int[] f36243k4;

    /* JADX INFO: renamed from: x1 */
    private final Map<Integer, Integer> f36244x1;

    public C10053x1(int[] iArr) {
        super(iArr);
        this.f36244x1 = new HashMap();
        this.f36243k4 = iArr;
    }

    /* JADX INFO: renamed from: x1 */
    private int m49685x1(int i) {
        int i2 = (i >> 24) & 255;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 8) & 255;
        int i5 = i & 255;
        int[] iArr = this.f36243k4;
        int i6 = Integer.MAX_VALUE;
        int i7 = 0;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            int i9 = iArr[i8];
            if (i9 == i) {
                return i8;
            }
            int i10 = ((i9 >> 16) & 255) - i3;
            int i11 = i10 * i10;
            if (i11 < i6) {
                int i12 = ((i9 >> 8) & 255) - i4;
                int i13 = (i12 * i12) + i11;
                if (i13 < i6) {
                    int i14 = (i9 & 255) - i5;
                    int i15 = (i14 * i14) + i13;
                    if (i15 < i6) {
                        int i16 = (i9 >>> 24) - i2;
                        int i17 = (i16 * i16) + i15;
                        if (i17 < i6) {
                            i7 = i8;
                            i6 = i17;
                        }
                    }
                }
            }
        }
        return i7;
    }

    @Override // com.aspose.slides.internal.p550zi.C13602jd
    /* JADX INFO: renamed from: k4 */
    public int mo49686k4(int i) {
        Integer numValueOf = this.f36244x1.get(Integer.valueOf(i));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(m49685x1(i));
            this.f36244x1.put(Integer.valueOf(i), numValueOf);
        }
        return numValueOf.intValue();
    }
}
