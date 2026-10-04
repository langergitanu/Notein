package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.dw */
/* JADX INFO: loaded from: classes3.dex */
final class C0918dw {

    /* JADX INFO: renamed from: du */
    private final C0816bg f4669du;

    /* JADX INFO: renamed from: dy */
    private long f4670dy;

    /* JADX INFO: renamed from: h4 */
    private final C14326q3 f4671h4;

    /* JADX INFO: renamed from: k4 */
    FillFormat f4672k4;

    /* JADX INFO: renamed from: kk */
    private byte f4673kk = -1;

    /* JADX INFO: renamed from: m9 */
    private final InterfaceC14397rj f4674m9;

    /* JADX INFO: renamed from: to */
    private final ColorFormat f4675to;

    /* JADX INFO: renamed from: x1 */
    EffectFormat f4676x1;

    public C0918dw(InterfaceC14397rj interfaceC14397rj, FillFormat fillFormat, EffectFormat effectFormat, ColorFormat colorFormat, C14326q3 c14326q3, C0816bg c0816bg) {
        this.f4674m9 = interfaceC14397rj;
        this.f4672k4 = fillFormat;
        this.f4676x1 = effectFormat;
        this.f4675to = colorFormat;
        this.f4671h4 = c14326q3;
        this.f4669du = c0816bg;
    }

    /* JADX INFO: renamed from: c5 */
    private void m5288c5() {
        this.f4670dy++;
    }

    /* JADX INFO: renamed from: du */
    public final int m5289du() {
        return (int) (((m5291h4().m4202du() & 4294967295L) % 1000) & C18177fb.f54859s);
    }

    /* JADX INFO: renamed from: dy */
    public final long m5290dy() {
        return ((((((this.f4670dy & 4294967295L) + (this.f4672k4.getVersion() & 4294967295L)) & 4294967295L) + (this.f4676x1.getVersion() & 4294967295L)) & 4294967295L) + (this.f4675to.getVersion() & 4294967295L)) & 4294967295L;
    }

    public boolean equals(Object obj) {
        Background background = (Background) C7019kk.m27452k4(obj, Background.class);
        if (background != null && m5296m9().m69392k4().equals(background.m335du().m69392k4()) && m5291h4().m4203k4() == background.m338to().m4203k4() && (m5291h4().m4202du() & 4294967295L) == (4294967295L & background.m338to().m4202du()) && m5291h4().m4209kk() == background.m338to().m4209kk() && C3085sv.m13089k4(m5292k4(), background.getType()) && C3085sv.m13090k4(m5295kk(), background.getEffectFormat())) {
            byte bM5292k4 = m5292k4();
            if (bM5292k4 != 0) {
                if (bM5292k4 == 1 && !C3085sv.m13090k4(m5298x1(), background.getFillFormat())) {
                    return false;
                }
            } else if (!C3085sv.m13090k4(m5297to(), background.getStyleColor()) || !C3085sv.m13089k4(m5289du() & 65535, background.getStyleIndex() & 65535)) {
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    public final C0816bg m5291h4() {
        return this.f4669du;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m5292k4() {
        return this.f4673kk;
    }

    /* JADX INFO: renamed from: kk */
    public final IEffectFormat m5295kk() {
        return this.f4676x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final C14326q3 m5296m9() {
        return this.f4671h4;
    }

    /* JADX INFO: renamed from: to */
    public final IColorFormat m5297to() {
        return this.f4675to;
    }

    /* JADX INFO: renamed from: x1 */
    public final IFillFormat m5298x1() {
        return this.f4672k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5293k4(byte b) {
        this.f4673kk = b;
        m5288c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5294k4(int i) {
        int i2 = i & 65535;
        if (i2 == 0) {
            m5291h4().m4205k4(0L);
        } else {
            m5291h4().m4205k4(((long) (i2 + 1000)) & 4294967295L);
        }
        m5288c5();
    }
}
