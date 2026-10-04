package com.aspose.slides.internal.p072d2;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p066cl.AbstractC2619c5;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p262m1.C6303kk;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p383rp.C10029c5;
import com.aspose.slides.internal.p383rp.C10037m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p490x2.C12372k4;
import java.io.IOException;

/* JADX INFO: renamed from: com.aspose.slides.internal.d2.to */
/* JADX INFO: loaded from: classes3.dex */
public class C3006to extends AbstractC2619c5 {

    /* JADX INFO: renamed from: kk */
    private boolean f8843kk = false;

    /* JADX INFO: renamed from: to */
    private int f8845to = 0;

    /* JADX INFO: renamed from: du */
    private boolean f8841du = false;

    /* JADX INFO: renamed from: h4 */
    private C6304x1 f8842h4 = null;

    /* JADX INFO: renamed from: m9 */
    private long[] f8844m9 = null;

    /* JADX INFO: renamed from: k4 */
    private C6304x1 m12663k4(int i) {
        C6304x1 c6304x1M25828k4 = C6303kk.m25828k4(this.f8430k4, i);
        c6304x1M25828k4.m62861x1().seek(0L, 0);
        c6304x1M25828k4.m25839k4((short) i);
        c6304x1M25828k4.m25839k4((short) 42);
        c6304x1M25828k4.m25855up(8L);
        return c6304x1M25828k4;
    }

    @Override // com.aspose.slides.internal.p066cl.AbstractC2619c5
    /* JADX INFO: renamed from: kk */
    public void mo11960kk() throws IOException {
        if (this.f8430k4 == null) {
            throw new InvalidOperationException("stream is null");
        }
        this.f8843kk = true;
        this.f8841du = true;
        this.f8845to = 0;
        this.f8842h4 = null;
    }

    @Override // com.aspose.slides.internal.p066cl.AbstractC2619c5
    /* JADX INFO: renamed from: to */
    public void mo11961to() throws IOException {
        this.f8841du = false;
        this.f8843kk = false;
        this.f8845to = 0;
        this.f8844m9 = null;
        this.f8842h4.dispose();
        this.f8842h4 = null;
    }

    @Override // com.aspose.slides.internal.p066cl.AbstractC2619c5
    /* JADX INFO: renamed from: x1 */
    public void mo11962x1(InterfaceC2624k4 interfaceC2624k4) throws IOException {
        if (!this.f8843kk) {
            throw new InvalidOperationException("need to call prepareWriteSequence method");
        }
        if (this.f8430k4 == null) {
            throw new InvalidOperationException("output == null!");
        }
        if (interfaceC2624k4 == null) {
            throw new IllegalArgumentException("image == null!");
        }
        int[] iArr = {this.f8845to};
        C10037m9 c10037m9M12664k4 = m12664k4(interfaceC2624k4, iArr);
        int i = iArr[0];
        this.f8845to = i;
        if (this.f8841du) {
            this.f8842h4 = m12663k4(i);
            this.f8841du = false;
        }
        m12665k4(this.f8842h4, c10037m9M12664k4, true);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.graphics.Bitmap, com.alipay.share.sdk.openapi.APApiImlV1] */
    /* JADX INFO: renamed from: k4 */
    private C10037m9 m12664k4(InterfaceC2624k4 interfaceC2624k4, int[] iArr) {
        float f;
        C12372k4 c12372k4 = (C12372k4) interfaceC2624k4;
        int iMo11975du = c12372k4.mo11975du();
        int iMo11978h4 = c12372k4.mo11978h4();
        int[] iArr2 = new int[iMo11975du * iMo11978h4];
        c12372k4.mo11984k4().getZFBVersionCode();
        int i = iArr[0];
        C6740x1 c6740x1 = new C6740x1(3);
        long j = iMo11978h4;
        c6740x1.m26570k4(j);
        c6740x1.m26581m9(2);
        c6740x1.m26565h4(2);
        float fMo11992x1 = c12372k4.mo11992x1();
        float fMo11988kk = c12372k4.mo11988kk();
        if (fMo11992x1 != 0.0f) {
            f = 100.0f;
            c6740x1.m26571k4(new C10029c5(Float.valueOf(fMo11992x1 * 100.0f).longValue(), 100L));
        } else {
            f = 100.0f;
        }
        if (fMo11988kk != 0.0f) {
            c6740x1.m26595x1(new C10029c5(Float.valueOf(fMo11988kk * f).longValue(), 100L));
        }
        if (c6740x1.m26559ck() != 1) {
            c6740x1.m26561du(1);
        }
        c6740x1.m26596x1(new int[]{2, 2, 2, 2});
        c6740x1.m26578kk(iMo11975du);
        c6740x1.m26594x1(j);
        C10037m9 c10037m9 = new C10037m9(c6740x1, iMo11975du, iMo11978h4);
        c10037m9.m62810kk(new C12014ne(0, 0, iMo11975du, iMo11978h4), iArr2);
        iArr[0] = c6740x1.m26576kk();
        return c10037m9;
    }

    @Override // com.aspose.slides.internal.p066cl.AbstractC2619c5
    /* JADX INFO: renamed from: x1 */
    public boolean mo11963x1() {
        return true;
    }

    @Override // com.aspose.slides.internal.p066cl.AbstractC2619c5
    /* JADX INFO: renamed from: k4 */
    public void mo11957k4(InterfaceC2624k4 interfaceC2624k4) throws IOException {
        if (this.f8430k4 == null) {
            throw new InvalidOperationException("output == null!");
        }
        if (interfaceC2624k4 == null) {
            throw new IllegalArgumentException("image == null!");
        }
        this.f8845to = 19789;
        int[] iArr = {19789};
        C10037m9 c10037m9M12664k4 = m12664k4(interfaceC2624k4, iArr);
        int i = iArr[0];
        this.f8845to = i;
        C6304x1 c6304x1M12663k4 = m12663k4(i);
        m12665k4(c6304x1M12663k4, c10037m9M12664k4, false);
        c6304x1M12663k4.dispose();
    }

    /* JADX INFO: renamed from: k4 */
    private void m12665k4(C6304x1 c6304x1, C10037m9 c10037m9, boolean z) {
        C6740x1 c6740x1M49351qq;
        int i;
        int iM26560du = c10037m9.m49351qq().m26560du();
        if (iM26560du != 1) {
            if (iM26560du == 6) {
                c6740x1M49351qq = c10037m9.m49351qq();
                i = 7;
            }
            long[][] jArr = {this.f8844m9};
            C10037m9.m49348k4(c10037m9, c6304x1, !z, c10037m9.m49351qq(), c10037m9.m49349ar());
            this.f8844m9 = jArr[0];
        }
        c6740x1M49351qq = c10037m9.m49351qq();
        i = 5;
        c6740x1M49351qq.m26593x1(i);
        long[][] jArr2 = {this.f8844m9};
        C10037m9.m49348k4(c10037m9, c6304x1, !z, c10037m9.m49351qq(), c10037m9.m49349ar());
        this.f8844m9 = jArr2[0];
    }
}
