package com.aspose.slides.internal.p147ga;

import android.support.v4.media.session.PlaybackStateCompat;
import com.aspose.slides.internal.p049bx.C1884ks;
import com.aspose.slides.internal.p049bx.C1894x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p110ek.C3749k4;
import com.aspose.slides.internal.p260ly.AbstractC6280ne;
import com.aspose.slides.internal.p260ly.C6288wl;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.ga.ks */
/* JADX INFO: loaded from: classes.dex */
public class C4241ks extends AbstractC4233ck {

    /* JADX INFO: renamed from: k4 */
    private final long f11551k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f11552x1;

    public C4241ks(long j, boolean z) {
        this.f11551k4 = j;
        this.f11552x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public void m17070k4(C3149x1 c3149x1, AbstractC6280ne abstractC6280ne) {
        C6288wl c6288wl = (C6288wl) abstractC6280ne;
        new C1884ks().m9804k4(c3149x1, c6288wl.m25670k4());
        c3149x1.m13447k4(c6288wl.m25683x1() & 4294967295L);
        C3749k4.m15047k4(c3149x1.m13442k4(), this.f11552x1 ? 2 : 1);
        c3149x1.m13447k4(c6288wl.m25678kk() & 4294967295L);
        c3149x1.m13447k4(c6288wl.m25681to() & 4294967295L);
        new C1894x6().m9814k4(c3149x1, c6288wl.m25668h4());
        C3749k4.m15047k4(c3149x1.m13442k4(), 4);
        c3149x1.m13447k4(c6288wl.m25680m9() & 4294967295L);
        c3149x1.m13442k4().seek(this.f11551k4 + (c6288wl.m25678kk() & 4294967295L), 0);
        c3149x1.m13450k4(c6288wl.m25666dy());
        c3149x1.m13442k4().seek(this.f11551k4 + (c6288wl.m25680m9() & 4294967295L), 0);
        int iM25683x1 = (int) c6288wl.m25683x1();
        int i = iM25683x1 << 2;
        boolean z = (c6288wl.m25681to() & PlaybackStateCompat.ACTION_PLAY_FROM_URI) == PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        if (z) {
            i = iM25683x1 << 3;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < (c6288wl.m25683x1() & 4294967295L)) {
            i2++;
            int i5 = i3 + 1;
            System.arraycopy(C14069jd.m66776k4(c6288wl.m25667fa()[i3]), 0, bArr, i4, 4);
            int i6 = i4 + 4;
            if (z) {
                i3 += 2;
                System.arraycopy(C14069jd.m66776k4(c6288wl.m25667fa()[i5]), 0, bArr, i6, 4);
                i4 += 8;
            } else {
                i4 = i6;
                i3 = i5;
            }
        }
        c3149x1.m13450k4(bArr);
    }
}
