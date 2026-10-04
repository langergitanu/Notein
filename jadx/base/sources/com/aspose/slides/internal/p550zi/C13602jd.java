package com.aspose.slides.internal.p550zi;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.android.material.internal.ViewUtils;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.jd */
/* JADX INFO: loaded from: classes5.dex */
public class C13602jd {

    /* JADX INFO: renamed from: k4 */
    private final k4 f45163k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.zi.jd$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private final C19072k4 f45164k4 = new C19072k4();

        /* JADX INFO: renamed from: com.aspose.slides.internal.zi.jd$k4$k4, reason: collision with other inner class name */
        public static class C19072k4 {

            /* JADX INFO: renamed from: k4 */
            private static final byte[] f45165k4 = {UnsignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 32, 16, 8, 4, 2, 1};

            /* JADX INFO: renamed from: kk */
            private final C19072k4[] f45166kk = new C19072k4[8];

            /* JADX INFO: renamed from: x1 */
            private final Dictionary<Integer, Integer> f45167x1 = new Dictionary<>();

            /* JADX INFO: renamed from: x1 */
            private static int m62738x1(int i, int i2) {
                byte b = f45165k4[i2];
                return (((i >> 16) & (b & 255)) == (b & 255) ? 4 : 0) | (((i >> 8) & (b & 255)) == (b & 255) ? 2 : 0) | ((i & (b & 255)) == (b & 255) ? 1 : 0);
            }

            /* JADX INFO: renamed from: k4 */
            public Dictionary<Integer, Integer> m62739k4(int i, int i2) {
                Dictionary<Integer, Integer> dictionary = this.f45167x1;
                if (i2 < 8) {
                    C19072k4 c19072k4 = this.f45166kk[m62738x1(i, i2)];
                    if (c19072k4 != null) {
                        return c19072k4.m62739k4(i, i2 + 1);
                    }
                }
                return dictionary;
            }

            /* JADX INFO: renamed from: k4 */
            public void m62740k4(int i, int i2, int i3) {
                this.f45167x1.addItem(Integer.valueOf(i2), Integer.valueOf(i));
                if (i3 < 8) {
                    int iM62738x1 = m62738x1(i, i3);
                    C19072k4[] c19072k4Arr = this.f45166kk;
                    if (c19072k4Arr[iM62738x1] == null) {
                        c19072k4Arr[iM62738x1] = new C19072k4();
                    }
                    this.f45166kk[iM62738x1].m62740k4(i, i2, i3 + 1);
                }
            }
        }

        /* JADX INFO: renamed from: k4 */
        public int m62736k4(int i) {
            int i2 = (i >> 16) & 255;
            int i3 = (i >> 8) & 255;
            int i4 = i & 255;
            Dictionary.Enumerator<Integer, Integer> it = this.f45164k4.m62739k4(i, 0).iterator();
            int i5 = ViewUtils.EDGE_TO_EDGE_FLAGS;
            int iIntValue = -1;
            while (it.hasNext()) {
                try {
                    KeyValuePair next = it.next();
                    int iM67482k4 = C14116yg.m67482k4(i2 - ((((Integer) next.getValue()).intValue() >> 16) & 255)) + C14116yg.m67482k4(i3 - ((((Integer) next.getValue()).intValue() >> 8) & 255)) + C14116yg.m67482k4(i4 - (((Integer) next.getValue()).intValue() & 255));
                    if (iM67482k4 < i5) {
                        iIntValue = ((Integer) next.getKey()).intValue();
                        i5 = iM67482k4;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return iIntValue;
        }

        /* JADX INFO: renamed from: k4 */
        public void m62737k4(int[] iArr) {
            for (int i = 0; i < iArr.length; i++) {
                this.f45164k4.m62740k4(iArr[i], i, 0);
            }
        }
    }

    public C13602jd(int[] iArr) {
        if (iArr == null) {
            throw new ArgumentNullException(RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        }
        if (iArr.length == 0) {
            throw new ArgumentOutOfRangeException(RemoteConfigConstants.ResponseFieldKey.ENTRIES, "At least one palette entry should be specified.");
        }
        k4 k4Var = new k4();
        this.f45163k4 = k4Var;
        k4Var.m62737k4(iArr);
    }

    /* JADX INFO: renamed from: k4 */
    public int mo49686k4(int i) {
        return this.f45163k4.m62736k4(i);
    }
}
