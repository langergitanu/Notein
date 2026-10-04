package com.aspose.slides.internal.p024al;

import com.alipay.share.sdk.plugin.APVersionCheck;
import com.aspose.slides.internal.p066cl.AbstractC2621dy;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p066cl.InterfaceC2626m9;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p383rp.C10032dy;
import com.aspose.slides.internal.p383rp.C10037m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p490x2.C12372k4;
import com.aspose.slides.internal.p507xp.C12592k4;
import java.io.IOException;

/* JADX INFO: renamed from: com.aspose.slides.internal.al.to */
/* JADX INFO: loaded from: classes3.dex */
public class C1393to extends AbstractC2621dy {

    /* JADX INFO: renamed from: x1 */
    private boolean f6041x1 = false;

    /* JADX INFO: renamed from: kk */
    private C10032dy f6039kk = null;

    /* JADX INFO: renamed from: to */
    private int f6040to = 0;

    /* JADX INFO: renamed from: k4 */
    private float m8286k4(C6740x1 c6740x1) {
        if (c6740x1.m26584rv() == null || c6740x1.m26584rv().m49269k4() == 0) {
            return 0.0f;
        }
        return c6740x1.m26584rv().m49270kk();
    }

    /* JADX INFO: renamed from: kk */
    private int m8288kk(C6740x1 c6740x1) {
        return 2498570;
    }

    /* JADX INFO: renamed from: x1 */
    private float m8289x1(C6740x1 c6740x1) {
        if (c6740x1.m26598x6() == null || c6740x1.m26598x6().m49269k4() == 0) {
            return 0.0f;
        }
        return c6740x1.m26598x6().m49270kk();
    }

    @Override // com.aspose.slides.internal.p066cl.AbstractC2621dy
    /* JADX INFO: renamed from: k4 */
    public int mo8278k4(boolean z) throws IOException {
        m8290x1();
        return this.f6040to;
    }

    @Override // com.aspose.slides.internal.p066cl.AbstractC2621dy
    /* JADX INFO: renamed from: x1 */
    public InterfaceC2626m9 mo8280x1(int i) {
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    private void m8290x1() throws IOException {
        if (this.f6041x1) {
            return;
        }
        AbstractC3150x6 abstractC3150x6 = this.f8432k4;
        if (abstractC3150x6 == null) {
            throw new IllegalArgumentException("input object was not set");
        }
        C10032dy c10032dyM58782k4 = C12592k4.m58782k4(abstractC3150x6);
        this.f6039kk = c10032dyM58782k4;
        if (c10032dyM58782k4 == null) {
            throw new IOException("Unable to read tiff Image");
        }
        this.f6040to = c10032dyM58782k4.m49303ar().length;
        this.f6041x1 = true;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.graphics.Bitmap, com.alipay.share.sdk.openapi.APApiImlV1] */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.content.Context, int] */
    @Override // com.aspose.slides.internal.p066cl.AbstractC2621dy
    /* JADX INFO: renamed from: k4 */
    public InterfaceC2624k4 mo8279k4(int i) throws IOException {
        m8290x1();
        m8287k4(i, true);
        if (i >= this.f6040to) {
            return null;
        }
        C10037m9 c10037m9 = this.f6039kk.m49303ar()[i];
        int iMo10012up = c10037m9.mo10012up();
        int iMo10009jd = c10037m9.mo10009jd();
        C12372k4 c12372k4M57960kk = C12372k4.m57960kk(iMo10012up, iMo10009jd, m8288kk(c10037m9.m49351qq()));
        c10037m9.m62811kk(new C12014ne(0, 0, iMo10012up, iMo10009jd));
        c12372k4M57960kk.mo11984k4().isZFBAppInstalled();
        float fM8286k4 = m8286k4(c10037m9.m49351qq());
        float fM8289x1 = m8289x1(c10037m9.m49351qq());
        if (fM8286k4 * fM8289x1 != 0.0f) {
            new APVersionCheck((int) Math.max(fM8286k4, fM8289x1));
        }
        return c12372k4M57960kk;
    }

    /* JADX INFO: renamed from: k4 */
    private void m8287k4(int i, boolean z) {
        if (i < 0 || (i > this.f6040to - 1 && !z)) {
            throw new IndexOutOfBoundsException("imageIndex < 0");
        }
    }
}
