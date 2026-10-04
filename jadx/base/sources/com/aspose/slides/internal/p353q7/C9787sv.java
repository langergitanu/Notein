package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p119f0.C3840to;
import com.aspose.slides.internal.p119f0.C3841x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12561ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.sv */
/* JADX INFO: loaded from: classes4.dex */
public class C9787sv {

    /* JADX INFO: renamed from: k4 */
    private final C12561ix f35377k4;

    /* JADX INFO: renamed from: kk */
    private final C9790ts f35378kk;

    /* JADX INFO: renamed from: to */
    private boolean f35379to;

    /* JADX INFO: renamed from: x1 */
    private final C12561ix f35380x1;

    public C9787sv(C9790ts c9790ts, boolean z) {
        this(c9790ts, z, false);
    }

    /* JADX INFO: renamed from: to */
    private void m48150to() {
        C3840to c3840to = (C3840to) C7019kk.m27452k4((Object) this.f35378kk.m48239wl().m48294k4(), C3840to.class);
        int i = 0;
        if (c3840to == null) {
            C3841x1 c3841x1 = (C3841x1) C7019kk.m27452k4((Object) this.f35378kk.m48239wl().m48294k4(), C3841x1.class);
            if (c3841x1 != null) {
                while (i < 65535) {
                    this.f35377k4.m58585k4(i, Integer.valueOf(c3841x1.mo15360k4(i)));
                    i = (char) (i + 1);
                }
                return;
            }
            return;
        }
        int iM15375k4 = c3840to.m15375k4();
        while (i < iM15375k4) {
            int i2 = c3840to.m15378x1()[i];
            for (int i3 = c3840to.m15377kk()[i]; i3 <= i2; i3++) {
                char c = (char) i3;
                this.f35377k4.m58585k4(c, Integer.valueOf(this.f35378kk.m48221m9().m48107x1(c).m48287x1()));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m48151k4(int i) {
        Object objM58580du = this.f35377k4.m58580du(i);
        if (objM58580du != null) {
            return ((Integer) C7019kk.m27464to(objM58580du, Integer.TYPE)).intValue();
        }
        C9797wp c9797wpM48107x1 = this.f35378kk.m48221m9().m48107x1(i);
        if (i == 65535 && c9797wpM48107x1.m48287x1() != 65535) {
            c9797wpM48107x1 = new C9797wp(0, 0, c9797wpM48107x1.m48285kk(), c9797wpM48107x1.m48286to());
        }
        return m48152k4(c9797wpM48107x1, i);
    }

    /* JADX INFO: renamed from: kk */
    public final C9790ts m48156kk() {
        return this.f35378kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12561ix m48157x1() {
        return this.f35377k4;
    }

    public C9787sv(C9790ts c9790ts, boolean z, boolean z2) {
        this.f35377k4 = new C12561ix();
        this.f35380x1 = new C12561ix();
        this.f35378kk = c9790ts;
        this.f35379to = z2;
        if (c9790ts.m48225qq() || z) {
            m48150to();
        } else {
            m48151k4(65535);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m48152k4(C9797wp c9797wp, int i) {
        this.f35377k4.m58580du(i);
        Object objM58580du = this.f35380x1.m58580du(c9797wp.m48287x1());
        if (objM58580du != null) {
            Integer num = (Integer) C7019kk.m27464to(objM58580du, Integer.TYPE);
            int iIntValue = num.intValue();
            if (this.f35377k4.m58589x1(i)) {
                this.f35377k4.m58588x1(i, num);
                return iIntValue;
            }
            this.f35377k4.m58585k4(i, num);
            return iIntValue;
        }
        int iM58582k4 = this.f35380x1.m58582k4();
        this.f35380x1.m58585k4(c9797wp.m48287x1(), Integer.valueOf(iM58582k4));
        if (this.f35377k4.m58589x1(i)) {
            this.f35377k4.m58588x1(i, Integer.valueOf(iM58582k4));
            return iM58582k4;
        }
        this.f35377k4.m58585k4(i, Integer.valueOf(iM58582k4));
        return iM58582k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<Integer, C9786ss> m48153k4() {
        C9760bz c9760bz = new C9760bz();
        C9790ts c9790ts = this.f35378kk;
        return c9760bz.m48008k4(c9790ts, this.f35380x1, c9790ts.m48175c5());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48154k4(AbstractC3150x6 abstractC3150x6, boolean z, boolean z2) {
        C9760bz c9760bz = new C9760bz();
        if (this.f35378kk.m48225qq() && this.f35379to) {
            c9760bz.m48014k4(this.f35378kk, abstractC3150x6);
        } else {
            c9760bz.m48015k4(this.f35378kk, this.f35377k4, this.f35380x1, abstractC3150x6, z, z2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48155k4(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            m48152k4(this.f35378kk.m48221m9().m48107x1(cCharAt), cCharAt);
        }
    }
}
