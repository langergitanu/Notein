package com.aspose.slides.internal.p206jj;

import android.support.v4.media.session.PlaybackStateCompat;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p019ac.AbstractC1349ne;
import com.aspose.slides.internal.p019ac.C1357wl;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p190is.C5114k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p319ok.C7110ks;
import com.aspose.slides.internal.p319ok.C7120x6;
import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.jj.ne */
/* JADX INFO: loaded from: classes.dex */
public class C5488ne extends AbstractC5496yj {

    /* JADX INFO: renamed from: k4 */
    private final long f15054k4;

    /* JADX INFO: renamed from: x1 */
    private final int f15055x1;

    public C5488ne(long j, int i) {
        this.f15054k4 = j;
        if (i != 1 && i != 2) {
            throw new ArgumentOutOfRangeException("stringBufferCharLength");
        }
        this.f15055x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC1349ne m22578k4(C3134k4 c3134k4) {
        C1357wl c1357wl = new C1357wl();
        c1357wl.m8010k4((C12514ne) new C7110ks().m27634k4(c3134k4));
        c1357wl.m8009k4(c3134k4.m13384uz());
        C5114k4.m21962k4(c3134k4.m13371ck(), this.f15055x1 == 1 ? 1 : 2);
        c1357wl.m8022x1(c3134k4.m13384uz());
        c1357wl.m8017kk(c3134k4.m13384uz() & 4294967295L);
        c1357wl.m8011k4((C12521uz) new C7120x6().m27644k4(c3134k4));
        C5114k4.m21962k4(c3134k4.m13371ck(), 4);
        c1357wl.m8020to(c3134k4.m13384uz());
        c3134k4.m13371ck().seek(this.f15054k4 + (c1357wl.m8016kk() & 4294967295L), 0);
        byte[] bArrM13372dy = c3134k4.m13372dy(((int) c1357wl.m8021x1()) << this.f15055x1);
        if (this.f15055x1 == 1) {
            c1357wl.m8012k4(AbstractC6747ar.m26650yj().mo26682x1(bArrM13372dy, 0, (int) c1357wl.m8021x1()));
            c1357wl.m8013k4(AbstractC6747ar.m26650yj().mo26677to(c1357wl.m8005dy()));
        } else {
            c1357wl.m8012k4(AbstractC6747ar.m26643rv().mo26682x1(bArrM13372dy, 0, ((int) c1357wl.m8021x1()) << 1));
            c1357wl.m8013k4(AbstractC6747ar.m26643rv().mo26677to(c1357wl.m8005dy()));
        }
        c3134k4.m13371ck().seek(this.f15054k4 + (c1357wl.m8018m9() & 4294967295L), 0);
        byte[] bArrM13372dy2 = c3134k4.m13372dy((c1357wl.m8019to() & PlaybackStateCompat.ACTION_PLAY_FROM_URI) == PlaybackStateCompat.ACTION_PLAY_FROM_URI ? ((int) c1357wl.m8021x1()) * 8 : ((int) c1357wl.m8021x1()) * 4);
        int iM8021x1 = (int) c1357wl.m8021x1();
        long[] jArr = new long[iM8021x1];
        for (int i = 0; i < iM8021x1; i++) {
            jArr[i] = C14069jd.m66784x1(bArrM13372dy2, i << 2);
        }
        c1357wl.m8014k4(jArr);
        return c1357wl;
    }
}
