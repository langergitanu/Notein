package com.aspose.slides.internal.p418tf;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p184ik.C5092dy;
import com.aspose.slides.internal.p184ik.C5098m9;
import com.aspose.slides.internal.p184ik.C5100up;
import com.aspose.slides.internal.p184ik.C5101x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.AbstractC13965r5;
import com.aspose.slides.p559ms.System.Xml.C13963qw;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13896f9;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13899g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.tf.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10931x1 implements InterfaceC10927k4 {

    /* JADX INFO: renamed from: c5 */
    private Dictionary<C5100up, C5100up> f38015c5;

    /* JADX INFO: renamed from: du */
    private int f38016du;

    /* JADX INFO: renamed from: dy */
    private boolean f38017dy;

    /* JADX INFO: renamed from: h4 */
    private int f38018h4;

    /* JADX INFO: renamed from: jd */
    private Dictionary<String, C5100up> f38019jd;

    /* JADX INFO: renamed from: k4 */
    private C5092dy[] f38020k4;

    /* JADX INFO: renamed from: kk */
    private C5092dy[] f38021kk;

    /* JADX INFO: renamed from: m9 */
    private AbstractC13883dt f38022m9;

    /* JADX INFO: renamed from: to */
    private int f38023to;

    /* JADX INFO: renamed from: x1 */
    private C5092dy[] f38024x1;

    public C10931x1() {
        this.f38022m9 = new C13963qw();
    }

    @Override // com.aspose.slides.internal.p418tf.InterfaceC10927k4
    public final AbstractC10925du createNavigator() {
        return new C5098m9(this.f38024x1, this.f38016du, null, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m52704k4(String str, C5092dy[][] c5092dyArr) {
        C5100up c5100up = new C5100up();
        Dictionary<String, C5100up> dictionary = this.f38019jd;
        if (dictionary == null || !dictionary.containsKey(str)) {
            c5092dyArr[0] = null;
            return 0;
        }
        this.f38019jd.get_Item(str).CloneTo(c5100up);
        c5092dyArr[0] = c5100up.m21882k4();
        return c5100up.m21884x1();
    }

    /* JADX INFO: renamed from: kk */
    public final int m52713kk(C5092dy[][] c5092dyArr) {
        c5092dyArr[0] = this.f38021kk;
        return this.f38018h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m52715x1(C5092dy[][] c5092dyArr) {
        c5092dyArr[0] = this.f38024x1;
        return this.f38016du;
    }

    public C10931x1(AbstractC13912i5 abstractC13912i5, int i) {
        if (abstractC13912i5 == null) {
            throw new ArgumentNullException("reader");
        }
        m52709k4(abstractC13912i5, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m52705k4(C5092dy[] c5092dyArr, int i, C5092dy[][] c5092dyArr2) {
        C5100up c5100up = new C5100up(c5092dyArr, i);
        Dictionary<C5100up, C5100up> dictionary = this.f38015c5;
        if (dictionary == null || !dictionary.containsKey(c5100up.Clone())) {
            c5092dyArr2[0] = null;
            return 0;
        }
        this.f38015c5.get_Item(c5100up.Clone()).CloneTo(c5100up);
        c5092dyArr2[0] = c5100up.m21882k4();
        return c5100up.m21884x1();
    }

    /* JADX INFO: renamed from: kk */
    public final void m52714kk(C5092dy[] c5092dyArr, int i) {
        this.f38021kk = c5092dyArr;
        this.f38018h4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52716x1(C5092dy[] c5092dyArr, int i) {
        this.f38024x1 = c5092dyArr;
        this.f38016du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m52706k4(C5092dy[][] c5092dyArr) {
        c5092dyArr[0] = this.f38020k4;
        return this.f38023to;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m52717x1() {
        return this.f38017dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13883dt m52707k4() {
        return this.f38022m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13965r5 m52708k4(int i, String str) {
        return new C5101x1(this, null, str, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52709k4(AbstractC13912i5 abstractC13912i5, int i) {
        String strMo65023fa;
        String strMo65042rv;
        String strMo65042rv2;
        if (abstractC13912i5 == null) {
            throw new ArgumentNullException("reader");
        }
        InterfaceC13896f9 interfaceC13896f9 = (InterfaceC13896f9) C7019kk.m27452k4((Object) abstractC13912i5, InterfaceC13896f9.class);
        if (interfaceC13896f9 == null || !interfaceC13896f9.ag_()) {
            interfaceC13896f9 = null;
        }
        this.f38017dy = interfaceC13896f9 != null;
        this.f38022m9 = abstractC13912i5.mo65059yd();
        C5101x1 c5101x1 = new C5101x1(this, interfaceC13896f9, abstractC13912i5.mo65040ne(), 0);
        try {
            boolean z = abstractC13912i5.mo65039m9() == 0;
            int iMo65058x6 = abstractC13912i5.mo65058x6();
            String strMo65268x1 = this.f38022m9.mo65268x1("http://www.w3.org/2000/xmlns/");
            if (!z || abstractC13912i5.mo65026h4()) {
                do {
                    if (!z) {
                        if (abstractC13912i5.mo65058x6() < iMo65058x6) {
                            return;
                        }
                    }
                    switch (abstractC13912i5.mo65028jd()) {
                        case 1:
                            boolean zMo65048u4 = abstractC13912i5.mo65048u4();
                            c5101x1.m21916to(abstractC13912i5.mo65060yj(), abstractC13912i5.mo65023fa(), abstractC13912i5.mo65050up(), abstractC13912i5.mo65040ne());
                            while (abstractC13912i5.mo65047to()) {
                                String strMo65050up = abstractC13912i5.mo65050up();
                                if (strMo65050up == strMo65268x1) {
                                    if (abstractC13912i5.mo65060yj().length() == 0) {
                                        strMo65023fa = C14113y2.f47374k4;
                                        strMo65042rv = abstractC13912i5.mo65042rv();
                                    } else {
                                        strMo65023fa = abstractC13912i5.mo65023fa();
                                        strMo65042rv = abstractC13912i5.mo65042rv();
                                    }
                                    c5101x1.mo21919x1(strMo65023fa, strMo65042rv);
                                } else {
                                    c5101x1.mo21915to(abstractC13912i5.mo65060yj(), abstractC13912i5.mo65023fa(), strMo65050up);
                                    c5101x1.m21906k4(abstractC13912i5.mo65042rv(), 4);
                                    c5101x1.mo21917x1();
                                }
                            }
                            if (zMo65048u4) {
                                c5101x1.m21912kk(true);
                            }
                            break;
                        case 3:
                        case 4:
                            c5101x1.m21906k4(abstractC13912i5.mo65042rv(), 4);
                            break;
                        case 5:
                            abstractC13912i5.mo65016b3();
                            break;
                        case 7:
                            c5101x1.m21914m9(abstractC13912i5.mo65023fa(), abstractC13912i5.mo65042rv(), abstractC13912i5.mo65040ne());
                            break;
                        case 8:
                            c5101x1.mo21897h4(abstractC13912i5.mo65042rv());
                            break;
                        case 10:
                            InterfaceC13899g8 interfaceC13899g8Mo65054wy = abstractC13912i5.mo65054wy();
                            if (interfaceC13899g8Mo65054wy != null) {
                                c5101x1.m21904k4(interfaceC13899g8Mo65054wy);
                            }
                            break;
                        case 13:
                            if (i == 2 && (!z || abstractC13912i5.mo65058x6() != 0)) {
                                strMo65042rv2 = abstractC13912i5.mo65042rv();
                                c5101x1.m21906k4(strMo65042rv2, 6);
                            }
                            break;
                        case 14:
                            if (abstractC13912i5.mo65051uz() == 2) {
                                c5101x1.m21906k4(abstractC13912i5.mo65042rv(), 5);
                            } else if (i == 2 && (!z || abstractC13912i5.mo65058x6() != 0)) {
                                strMo65042rv2 = abstractC13912i5.mo65042rv();
                                c5101x1.m21906k4(strMo65042rv2, 6);
                            }
                            break;
                        case 15:
                            c5101x1.m21912kk(false);
                            break;
                    }
                } while (abstractC13912i5.mo65026h4());
            }
        } finally {
            c5101x1.mo21893du();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52710k4(String str, C5092dy[] c5092dyArr, int i) {
        if (this.f38019jd == null) {
            this.f38019jd = new Dictionary<>();
        }
        if (this.f38019jd.containsKey(str)) {
            return;
        }
        this.f38019jd.addItem(str, new C5100up(c5092dyArr, i));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52711k4(C5092dy[] c5092dyArr, int i) {
        this.f38020k4 = c5092dyArr;
        this.f38023to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52712k4(C5092dy[] c5092dyArr, int i, C5092dy[] c5092dyArr2, int i2) {
        if (this.f38015c5 == null) {
            this.f38015c5 = new Dictionary<>();
        }
        this.f38015c5.addItem(new C5100up(c5092dyArr, i), new C5100up(c5092dyArr2, i2));
    }
}
