package com.aspose.slides.internal.p211jo;

import com.aspose.slides.internal.p061cc.AbstractC2417k4;
import com.aspose.slides.internal.p166hg.AbstractC4523ai;
import com.aspose.slides.internal.p166hg.AbstractC4570vj;
import com.aspose.slides.internal.p166hg.C4545k4;
import com.aspose.slides.internal.p166hg.C4555qw;
import com.aspose.slides.internal.p166hg.C4571w6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.jo.c5 */
/* JADX INFO: loaded from: classes.dex */
public class C5520c5 extends AbstractC2417k4 {

    /* JADX INFO: renamed from: k4 */
    private int f15056k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f15057kk;

    /* JADX INFO: renamed from: to */
    private AbstractC4570vj f15058to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f15059x1;

    public C5520c5(AbstractC4523ai abstractC4523ai, byte[] bArr) {
        super(abstractC4523ai, (byte) 2, bArr);
    }

    /* JADX INFO: renamed from: x1 */
    private void m22588x1(short s) {
        int iM18678x1 = m11834ck().m18678x1(s);
        if ((m11834ck().m18661m9() & iM18678x1) != iM18678x1 && (m11834ck().m18661m9() & (-1073741824)) != -1073741824) {
            throw new C4545k4((byte) 70, "Incorrect protocol version received from server");
        }
        m11834ck().m18648k4(iM18678x1);
        m11834ck().m18651k4(C4555qw.m18831k4(false, iM18678x1));
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: c5 */
    public void mo11833c5() {
        mo11837jd();
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: dy */
    public void mo11835dy() {
        super.mo11835dy();
        m11834ck().m18653k4(this.f15057kk);
        m11834ck().m18658kk(this.f15059x1);
        m11834ck().m18684xk().m18755k4(this.f15058to);
        m11834ck().m18679x1(this.f15056k4);
        m11834ck().m18681x1(true);
        int length = m11834ck().m18674uz().length;
        int length2 = m11834ck().m18676wl().length;
        int i = length + length2;
        byte[] bArr = new byte[i];
        C14058fa.m66596k4(m11834ck().m18674uz(), 0, bArr, 0, length);
        C14058fa.m66596k4(m11834ck().m18676wl(), 0, bArr, length, length2);
        m11834ck().m18667to(bArr);
        byte[] bArr2 = new byte[i];
        C14058fa.m66596k4(m11834ck().m18676wl(), 0, bArr2, 0, length2);
        C14058fa.m66596k4(m11834ck().m18674uz(), 0, bArr2, length2, length);
        m11834ck().m18635du(bArr2);
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: jd */
    public void mo11837jd() {
        AbstractC4523ai abstractC4523aiM11834ck;
        boolean zM11832k4;
        m22588x1(m18745kk());
        this.f15059x1 = m18744k4(32);
        int iM27462to = C7019kk.m27462to(Byte.valueOf(m18748x1()), 6);
        if (iM27462to > 0) {
            this.f15057kk = m18744k4(iM27462to);
            C4571w6.m18906k4(m11834ck().m18639fa().m18835k4(), this.f15057kk);
            abstractC4523aiM11834ck = m11834ck();
            zM11832k4 = AbstractC2417k4.m11832k4(this.f15057kk, m11834ck().m18630c5());
        } else {
            abstractC4523aiM11834ck = m11834ck();
            zM11832k4 = false;
        }
        abstractC4523aiM11834ck.m18652k4(zM11832k4);
        short sM18745kk = m18745kk();
        if (m11834ck().m18683x6().m18877x1(sM18745kk) == -1) {
            throw new C4545k4((byte) 71, "Invalid cipher suite received from server");
        }
        this.f15058to = m11834ck().m18683x6().m18874k4(sM18745kk);
        this.f15056k4 = C7019kk.m27462to(Byte.valueOf(m18748x1()), 6);
    }
}
