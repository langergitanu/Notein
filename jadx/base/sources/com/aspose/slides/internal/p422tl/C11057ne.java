package com.aspose.slides.internal.p422tl;

import android.support.v4.media.session.PlaybackStateCompat;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p018aa.C1324ks;
import com.aspose.slides.internal.p018aa.C1334x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.C3749k4;
import com.aspose.slides.internal.p260ly.AbstractC6280ne;
import com.aspose.slides.internal.p260ly.C6288wl;
import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.tl.ne */
/* JADX INFO: loaded from: classes4.dex */
public class C11057ne extends AbstractC11065yj {

    /* JADX INFO: renamed from: k4 */
    private final long f38383k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f38384x1;

    public C11057ne(long j, boolean z) {
        this.f38383k4 = j;
        this.f38384x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC6280ne m53489k4(C3134k4 c3134k4) {
        C6288wl c6288wl = new C6288wl();
        c6288wl.m25673k4((C12343ne) new C1324ks().m7809k4(c3134k4));
        c6288wl.m25672k4(c3134k4.m13384uz());
        C3749k4.m15047k4(c3134k4.m13371ck(), this.f38384x1 ? 2 : 1);
        c6288wl.m25684x1(c3134k4.m13384uz());
        c6288wl.m25679kk(c3134k4.m13384uz() & 4294967295L);
        c6288wl.m25674k4((C12350uz) new C1334x6().m7819k4(c3134k4));
        C3749k4.m15047k4(c3134k4.m13371ck(), 4);
        c6288wl.m25682to(c3134k4.m13384uz());
        int i = 0;
        c3134k4.m13371ck().seek(this.f38383k4 + (c6288wl.m25678kk() & 4294967295L), 0);
        c6288wl.m25675k4(c3134k4.m13372dy(((int) c6288wl.m25683x1()) * (this.f38384x1 ? 2 : 1)));
        if (this.f38384x1) {
            c6288wl.m25671k4(1200);
        }
        c3134k4.m13371ck().seek(this.f38383k4 + (c6288wl.m25680m9() & 4294967295L), 0);
        int iM25683x1 = (int) c6288wl.m25683x1();
        boolean z = (c6288wl.m25681to() & PlaybackStateCompat.ACTION_PLAY_FROM_URI) == PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        if (z) {
            iM25683x1 <<= 1;
        }
        List list = new List(iM25683x1);
        byte[] bArrM13372dy = c3134k4.m13372dy(iM25683x1 << 2);
        int i2 = 0;
        while (i < (c6288wl.m25683x1() & 4294967295L)) {
            i++;
            list.addItem(Long.valueOf(C14069jd.m66784x1(bArrM13372dy, i2)));
            int i3 = i2 + 4;
            if (z) {
                list.addItem(Long.valueOf(C14069jd.m66784x1(bArrM13372dy, i3)));
                i2 += 8;
            } else {
                i2 = i3;
            }
        }
        c6288wl.m25676k4(C12565ks.m58633x1((List<Long>) list));
        return c6288wl;
    }
}
