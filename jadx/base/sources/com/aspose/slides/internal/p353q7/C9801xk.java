package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12561ix;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.slides.internal.p505xn.C12570to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.xk */
/* JADX INFO: loaded from: classes4.dex */
public class C9801xk extends AbstractC9768f9 {

    /* JADX INFO: renamed from: c5 */
    public int f35514c5;

    /* JADX INFO: renamed from: ck */
    public int[] f35515ck;

    /* JADX INFO: renamed from: du */
    public int f35516du;

    /* JADX INFO: renamed from: dy */
    public int f35517dy;

    /* JADX INFO: renamed from: fa */
    public List<String> f35518fa;

    /* JADX INFO: renamed from: h4 */
    public int f35519h4;

    /* JADX INFO: renamed from: jd */
    public int f35520jd;

    /* JADX INFO: renamed from: k4 */
    public int f35521k4;

    /* JADX INFO: renamed from: kk */
    public short f35522kk;

    /* JADX INFO: renamed from: m9 */
    public int f35523m9;

    /* JADX INFO: renamed from: to */
    public short f35524to;

    /* JADX INFO: renamed from: x1 */
    public int f35525x1;

    public C9801xk(C12564kk c12564kk) {
        this.f35521k4 = c12564kk.m58606x1();
        this.f35525x1 = c12564kk.m58606x1();
        this.f35522kk = c12564kk.m58605to();
        this.f35524to = c12564kk.m58605to();
        this.f35516du = c12564kk.m58606x1();
        this.f35519h4 = c12564kk.m58606x1();
        this.f35523m9 = c12564kk.m58606x1();
        this.f35517dy = c12564kk.m58606x1();
        this.f35514c5 = c12564kk.m58606x1();
        int i = this.f35521k4;
        if (i != 65536) {
            if (i != 131072) {
                if (i != 196608) {
                    throw new InvalidOperationException("Unexpected PostScript table version.");
                }
                return;
            }
            int iM58600du = c12564kk.m58600du() & 65535;
            this.f35520jd = iM58600du;
            this.f35515ck = new int[iM58600du];
            int iM67483k4 = 0;
            for (int i2 = 0; i2 < this.f35515ck.length; i2++) {
                int iM58600du2 = c12564kk.m58600du() & 65535;
                this.f35515ck[i2] = iM58600du2;
                if (iM58600du2 <= 32767) {
                    iM67483k4 = C14116yg.m67483k4(iM58600du2, iM67483k4);
                }
            }
            int i3 = iM67483k4 - 257;
            i3 = i3 < 0 ? 0 : i3;
            this.f35518fa = new List<>(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                this.f35518fa.addItem(m48310k4(c12564kk));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static String m48310k4(C12564kk c12564kk) {
        return AbstractC6747ar.m26650yj().m26681x1(c12564kk.m58603k4(c12564kk.m58601h4() & 255));
    }

    /* JADX INFO: renamed from: x1 */
    private void m48312x1(C12561ix c12561ix) {
        int[] iArr = new int[c12561ix.m58582k4()];
        List<String> list = new List<>();
        for (int i = 0; i < c12561ix.m58582k4(); i++) {
            int iM58587to = c12561ix.m58587to(i);
            int iIntValue = ((Integer) C7019kk.m27464to(c12561ix.m58586kk(i), Integer.TYPE)).intValue();
            int i2 = this.f35515ck[iM58587to];
            if (i2 < 258 || i2 > 32767) {
                iArr[iIntValue] = i2 & 65535;
            } else {
                list.addItem(this.f35518fa.get_Item(i2 - 258));
                iArr[iIntValue] = (list.size() + 257) & 65535;
            }
        }
        this.f35520jd = c12561ix.m58582k4() & 65535;
        this.f35515ck = iArr;
        this.f35518fa = list;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48313k4(C12561ix c12561ix) {
        this.f35519h4 = 0;
        this.f35523m9 = 0;
        this.f35517dy = 0;
        this.f35514c5 = 0;
        int i = this.f35521k4;
        if (i != 65536) {
            if (i == 131072) {
                m48312x1(c12561ix);
            } else if (i != 196608) {
                throw new InvalidOperationException("Unexpected PostScript table version.");
            }
        }
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9768f9
    /* JADX INFO: renamed from: k4 */
    public void mo48051k4(C12570to c12570to) {
        c12570to.m58668k4(this.f35521k4);
        c12570to.m58668k4(this.f35525x1);
        c12570to.m58671x1(this.f35522kk);
        c12570to.m58671x1(this.f35524to);
        c12570to.m58668k4(this.f35516du);
        c12570to.m58668k4(this.f35519h4);
        c12570to.m58668k4(this.f35523m9);
        c12570to.m58668k4(this.f35517dy);
        c12570to.m58668k4(this.f35514c5);
        int i = this.f35521k4;
        if (i != 65536) {
            if (i != 131072) {
                if (i != 196608) {
                    throw new InvalidOperationException("Unexpected PostScript table version.");
                }
                return;
            }
            c12570to.m58671x1(this.f35520jd);
            for (int i2 : this.f35515ck) {
                c12570to.m58671x1(i2);
            }
            for (int i3 = 0; i3 < this.f35518fa.size(); i3++) {
                m48311k4(this.f35518fa.get_Item(i3), c12570to);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m48311k4(String str, C12570to c12570to) {
        if (str.length() > 255) {
            throw new InvalidOperationException("The PostScript glyph name is too long.");
        }
        byte[] bArrMo26677to = AbstractC6747ar.m26650yj().mo26677to(str);
        c12570to.m58667k4((byte) bArrMo26677to.length);
        c12570to.m58670k4(bArrMo26677to, 0, bArrMo26677to.length);
    }
}
