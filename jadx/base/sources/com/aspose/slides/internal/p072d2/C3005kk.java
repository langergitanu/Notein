package com.aspose.slides.internal.p072d2;

import android.graphics.Bitmap;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p066cl.AbstractC2619c5;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p162h8.C4511k4;
import com.aspose.slides.internal.p245la.C6013du;
import com.aspose.slides.internal.p245la.C6019to;
import com.aspose.slides.internal.p245la.InterfaceC6018m9;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p385rr.C10052k4;
import com.aspose.slides.internal.p470w5.C11887kk;
import com.aspose.slides.internal.p470w5.C11888to;
import com.aspose.slides.internal.p550zi.C13594c5;
import com.aspose.slides.internal.p550zi.C13618wy;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.aspose.slides.internal.d2.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C3005kk extends AbstractC2619c5 {

    /* JADX INFO: renamed from: du */
    private static byte f8831du = -1;

    /* JADX INFO: renamed from: h4 */
    private static boolean f8832h4 = false;

    /* JADX INFO: renamed from: kk */
    private static byte f8833kk;

    /* JADX INFO: renamed from: to */
    private static byte f8834to;

    /* JADX INFO: renamed from: c5 */
    private C13618wy f8835c5;

    /* JADX INFO: renamed from: m9 */
    private boolean f8837m9 = false;

    /* JADX INFO: renamed from: dy */
    private boolean f8836dy = false;

    /* JADX INFO: renamed from: com.aspose.slides.internal.d2.kk$k4 */
    public class k4 {

        /* JADX INFO: renamed from: kk */
        private InterfaceC6901du f8839kk;

        /* JADX INFO: renamed from: x1 */
        private byte f8840x1;

        public k4(byte b, InterfaceC6901du interfaceC6901du) {
            this.f8840x1 = b;
            this.f8839kk = interfaceC6901du;
        }

        /* JADX INFO: renamed from: k4 */
        public byte m12660k4() {
            return this.f8840x1;
        }

        /* JADX INFO: renamed from: kk */
        public k4 m12661kk() {
            if (this.f8839kk != null) {
                this.f8840x1 = (byte) 1;
                int i = 2;
                while (i < this.f8839kk.mo27029k4()) {
                    i <<= 1;
                    this.f8840x1 = (byte) (this.f8840x1 + 1);
                }
                if ((this.f8840x1 & 255) > 8) {
                    this.f8840x1 = (byte) 8;
                    i = 256;
                }
                if (i != this.f8839kk.mo27029k4()) {
                    int[] iArrMo27032x1 = this.f8839kk.mo27032x1();
                    int[] iArrM49684k4 = C10052k4.m49684k4(i);
                    System.arraycopy(iArrMo27032x1, 0, iArrM49684k4, 0, Math.min(iArrM49684k4.length, iArrMo27032x1.length));
                    this.f8839kk = new C13594c5(iArrM49684k4);
                }
                if ((this.f8840x1 & 255) < 2) {
                    this.f8840x1 = (byte) 2;
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: x1 */
        public InterfaceC6901du m12662x1() {
            return this.f8839kk;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private byte m12651k4(InterfaceC6901du interfaceC6901du) {
        return new k4((byte) 0, interfaceC6901du).m12661kk().m12660k4();
    }

    /* JADX INFO: renamed from: kk */
    private InterfaceC6901du m12657kk(InterfaceC2624k4 interfaceC2624k4) {
        int iMo11975du = interfaceC2624k4.mo11975du();
        int iMo11978h4 = interfaceC2624k4.mo11978h4();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        for (int i2 = 0; i2 < iMo11978h4; i2++) {
            for (int i3 = 0; i3 < iMo11975du; i3++) {
                linkedHashSet.add(Integer.valueOf(interfaceC2624k4.mo11980k4(i3, i2)));
            }
        }
        int[] iArr = new int[linkedHashSet.size()];
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return new C13594c5(iArr);
    }

    /* JADX INFO: renamed from: to */
    private byte m12658to(InterfaceC2624k4 interfaceC2624k4) {
        return (byte) -1;
    }

    @Override // com.aspose.slides.internal.p066cl.AbstractC2619c5
    /* JADX INFO: renamed from: x1 */
    public void mo11962x1(InterfaceC2624k4 interfaceC2624k4) throws IOException {
        if (!this.f8837m9) {
            throw new InvalidOperationException("need to call prepareWriteSequence method");
        }
        if (this.f8430k4 == null) {
            throw new InvalidOperationException("output == null!");
        }
        if (interfaceC2624k4 == null) {
            throw new IllegalArgumentException("image == null!");
        }
        C4511k4 c4511k4 = (C4511k4) C7019kk.m27452k4((Object) interfaceC2624k4.mo11989m9(), C4511k4.class);
        InterfaceC6901du interfaceC6901duM12652k4 = m12652k4(interfaceC2624k4, c4511k4);
        if (this.f8836dy) {
            m12653k4(interfaceC2624k4, c4511k4, interfaceC6901duM12652k4, this.f8835c5);
            m12655k4(interfaceC6901duM12652k4, this.f8835c5);
            m12654k4(c4511k4);
            this.f8836dy = false;
        }
        m12659x1(interfaceC2624k4, c4511k4, interfaceC6901duM12652k4, this.f8835c5);
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC6901du m12652k4(InterfaceC2624k4 interfaceC2624k4, C4511k4 c4511k4) {
        return new k4((byte) 0, c4511k4 != null ? c4511k4.m18598x1().m62755ck() : m12657kk(interfaceC2624k4)).m12661kk().m12662x1();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.graphics.Bitmap, com.alipay.share.sdk.openapi.APApiImlV1] */
    /* JADX INFO: renamed from: x1 */
    private void m12659x1(InterfaceC2624k4 interfaceC2624k4, C4511k4 c4511k4, InterfaceC6901du interfaceC6901du, C13618wy c13618wy) {
        if (c4511k4 != null) {
            C11887kk c11887kkM18597k4 = c4511k4.m18597k4();
            C11888to c11888toM55492bv = c11887kkM18597k4.m55492bv();
            if (c11888toM55492bv != null) {
                c11888toM55492bv.mo24316k4(c13618wy.m62861x1());
            }
            c11887kkM18597k4.m62728k4(c13618wy.m62861x1());
            return;
        }
        byte bM12658to = m12658to(interfaceC2624k4);
        new C11888to(0, bM12658to != -1, bM12658to, false, bM12658to >= 0 ? 2 : 0).mo24316k4(c13618wy.m62861x1());
        C11887kk c11887kk = new C11887kk(0, 0, interfaceC2624k4.mo11975du(), interfaceC2624k4.mo11978h4(), interfaceC6901du, false, f8832h4, m12651k4(interfaceC6901du));
        ?? r2 = (Bitmap) interfaceC2624k4.mo11984k4();
        int[] iArr = new int[r2.getHeight() * r2.getWidth()];
        r2.getWidth();
        r2.getWidth();
        r2.getHeight();
        r2.getZFBVersionCode();
        c11887kk.m62810kk(c11887kk.m62756dy(), iArr);
        c11887kk.m62728k4(c13618wy.m62861x1());
    }

    @Override // com.aspose.slides.internal.p066cl.AbstractC2619c5
    /* JADX INFO: renamed from: kk */
    public void mo11960kk() throws IOException {
        AbstractC3150x6 abstractC3150x6 = this.f8430k4;
        if (abstractC3150x6 == null) {
            throw new InvalidOperationException("stream is null");
        }
        this.f8837m9 = true;
        this.f8836dy = true;
        this.f8835c5 = new C13618wy(abstractC3150x6);
    }

    @Override // com.aspose.slides.internal.p066cl.AbstractC2619c5
    /* JADX INFO: renamed from: to */
    public void mo11961to() throws IOException {
        m12656k4(this.f8835c5);
        C13618wy c13618wy = this.f8835c5;
        if (c13618wy != null) {
            c13618wy.dispose();
        }
        this.f8837m9 = false;
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
        C4511k4 c4511k4 = (C4511k4) C7019kk.m27452k4((Object) interfaceC2624k4.mo11989m9(), C4511k4.class);
        if (c4511k4 != null) {
            c4511k4.m18598x1().m62728k4(this.f8430k4);
            this.f8430k4.flush();
            return;
        }
        C13618wy c13618wy = new C13618wy(this.f8430k4);
        try {
            InterfaceC6901du interfaceC6901duM12652k4 = m12652k4(interfaceC2624k4, (C4511k4) null);
            m12653k4(interfaceC2624k4, null, interfaceC6901duM12652k4, c13618wy);
            m12655k4(interfaceC6901duM12652k4, c13618wy);
            m12659x1(interfaceC2624k4, null, interfaceC6901duM12652k4, c13618wy);
            m12656k4(c13618wy);
        } finally {
            c13618wy.dispose();
        }
    }

    @Override // com.aspose.slides.internal.p066cl.AbstractC2619c5
    /* JADX INFO: renamed from: x1 */
    public boolean mo11963x1() {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m12653k4(InterfaceC2624k4 interfaceC2624k4, C4511k4 c4511k4, InterfaceC6901du interfaceC6901du, C13618wy c13618wy) {
        C6019to c6019toM24301ar = c4511k4 != null ? c4511k4.m18598x1().m24301ar() : null;
        if (c6019toM24301ar == null) {
            c6019toM24301ar = new C6019to(interfaceC2624k4.mo11975du(), interfaceC2624k4.mo11978h4(), interfaceC6901du == null ? C6019to.m24317k4(0, false, false, f8833kk) : C6019to.m24317k4(interfaceC6901du.mo27029k4(), true, false, f8833kk), f8831du, f8834to);
        }
        c6019toM24301ar.m24322k4(c13618wy);
    }

    /* JADX INFO: renamed from: k4 */
    private void m12654k4(C4511k4 c4511k4) {
        if (c4511k4 != null) {
            for (InterfaceC6018m9 interfaceC6018m9 : c4511k4.m18598x1().m24304ks()) {
                if (!(interfaceC6018m9 instanceof C11888to) && !(interfaceC6018m9 instanceof C11887kk)) {
                    interfaceC6018m9.mo24316k4(this.f8835c5.m62861x1());
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m12655k4(InterfaceC6901du interfaceC6901du, C13618wy c13618wy) {
        if (interfaceC6901du != null) {
            C6013du.m24295k4(c13618wy, interfaceC6901du);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m12656k4(C13618wy c13618wy) {
        c13618wy.m62855k4((byte) 59);
        c13618wy.m62862x1(c13618wy.m62853k4());
    }
}
