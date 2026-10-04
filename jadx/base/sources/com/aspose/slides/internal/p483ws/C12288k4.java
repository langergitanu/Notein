package com.aspose.slides.internal.p483ws;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p383rp.AbstractC10031du;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ws.k4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C12288k4 extends AbstractC10031du {

    /* JADX INFO: renamed from: k4 */
    private String f41156k4;

    public C12288k4(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: kk */
    private long m57550kk(C6304x1 c6304x1) {
        if (this.f41156k4 == null) {
            c6304x1.m62857k4(new byte[4]);
            return 4L;
        }
        byte[] bArrMo26677to = AbstractC6747ar.m26640kk("Latin1").mo26677to(this.f41156k4);
        c6304x1.m62857k4(bArrMo26677to);
        int iM67483k4 = C14116yg.m67483k4(1, 4 - bArrMo26677to.length);
        c6304x1.m62857k4(new byte[iM67483k4]);
        return C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Integer.valueOf(iM67483k4), 9)), 10) + C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Integer.valueOf(bArrMo26677to.length), 9)), 10)), 10);
    }

    /* JADX INFO: renamed from: ck */
    public String m57551ck() {
        return this.f41156k4;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: h4 */
    public long mo49282h4() {
        long jMo49284k4 = mo49284k4();
        if (C7019kk.m27435du(Long.valueOf(jMo49284k4), 10) <= 4) {
            return 0L;
        }
        return jMo49284k4;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: jd */
    public AbstractC10031du mo49283jd() {
        return new C12288k4(m49297kk());
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: k4 */
    public long mo49284k4() {
        if (this.f41156k4 == null) {
            return 1L;
        }
        return C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Integer.valueOf(AbstractC6747ar.m26640kk("Latin1").mo26658k4(this.f41156k4)), 9)), 10) + C7019kk.m27435du((Object) 1L, 10)), 10);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: m9 */
    public Object mo49287m9() {
        return this.f41156k4;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: to */
    public int mo49288to() {
        return 2;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: x1 */
    public long mo49289x1(C6304x1 c6304x1) {
        if (c6304x1 == null) {
            throw new ArgumentNullException("dataStream");
        }
        if (C7019kk.m27435du(Long.valueOf(mo49284k4()), 10) > 4) {
            return m57550kk(c6304x1);
        }
        return 0L;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: k4 */
    public void mo49296k4(AbstractC10031du abstractC10031du) {
        ((C12288k4) abstractC10031du).f41156k4 = this.f41156k4;
        super.mo49296k4(abstractC10031du);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: kk */
    public void mo49286kk(C6304x1 c6304x1, long j) {
        if (C7019kk.m27435du(Long.valueOf(mo49284k4()), 10) > 4) {
            c6304x1.m25855up(j);
        } else {
            m57550kk(c6304x1);
        }
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: x1 */
    public void mo49290x1(C6304x1 c6304x1, long j) {
        byte[] bArrM25849kk;
        int iM27462to;
        if (C7019kk.m27435du(Long.valueOf(j), 10) > 4) {
            c6304x1.m62854k4(C7019kk.m27438h4(Long.valueOf(c6304x1.m25854up()), 10), 0);
            bArrM25849kk = c6304x1.m25849kk(j);
        } else {
            byte[] bArr = new byte[4];
            c6304x1.m62860x1(bArr);
            bArrM25849kk = bArr;
        }
        if (bArrM25849kk == null || C7019kk.m27462to(Long.valueOf(j), 10) - 1 < 0) {
            return;
        }
        this.f41156k4 = AbstractC6747ar.m26640kk("Latin1").mo26682x1(bArrM25849kk, 0, iM27462to);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: k4 */
    public void mo49285k4(Object obj) {
        if (obj != null && !C7019kk.m27469x1(obj, String.class)) {
            throw new ArgumentException("Only string is supported.");
        }
        this.f41156k4 = (String) C7019kk.m27452k4(obj, String.class);
    }
}
