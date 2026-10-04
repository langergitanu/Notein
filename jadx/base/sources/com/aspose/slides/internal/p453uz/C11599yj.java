package com.aspose.slides.internal.p453uz;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p237ks.C5909to;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p447up.C11537ks;
import com.aspose.slides.internal.p492x4.AbstractC12384m9;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.uz.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C11599yj extends AbstractC11580k4 {

    /* JADX INFO: renamed from: k4 */
    private boolean f39153k4;

    /* JADX INFO: renamed from: kk */
    private List<k4> f39154kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f39155x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.uz.yj$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private int f39158k4;

        /* JADX INFO: renamed from: kk */
        private String f39159kk;

        /* JADX INFO: renamed from: x1 */
        private AbstractC5788h4 f39160x1;

        /* JADX INFO: renamed from: to */
        private static final C12380dy f39157to = new C12380dy("\\\\([\\n\\r\\f0-9a-fA-F]{1,6})\\s*", 0);

        /* JADX INFO: renamed from: du */
        private static final C12380dy f39156du = new C12380dy("[ ]{2,}", 0);

        public k4(int i) {
            this.f39158k4 = i;
        }

        /* JADX INFO: renamed from: k4 */
        public final int m54624k4() {
            return this.f39158k4;
        }

        /* JADX INFO: renamed from: kk */
        public final String m54625kk() {
            int i = this.f39158k4;
            if (3 == i || 2 == i) {
                return ((AbstractC5803to) m54626x1()).mo23706x1();
            }
            if (i == 0) {
                String strMo23706x1 = ((AbstractC5803to) m54626x1()).mo23706x1();
                if (C14113y2.m67429to(strMo23706x1, IOUtils.DIR_SEPARATOR_WINDOWS) != -1) {
                    strMo23706x1 = C14113y2.m67401k4(f39157to.m57982k4(strMo23706x1, new AbstractC12384m9() { // from class: com.aspose.slides.internal.uz.yj.k4.1
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return "Aspose.Css.Model.Properties.Values.ContentValue.ContentSegment.ReplaceEscapedIdentifiers(System.Text.RegularExpressions.Match)";
                        }

                        @Override // com.aspose.slides.internal.p492x4.AbstractC12384m9
                        /* JADX INFO: renamed from: k4 */
                        public String mo24906k4(C12385to c12385to) {
                            return k4.m54623x1(c12385to);
                        }
                    }), "\\", C14113y2.f47374k4);
                }
                return f39156du.m57987kk(strMo23706x1, " ");
            }
            if (4 == i || 5 == i) {
                return this.f39159kk;
            }
            return null;
        }

        /* JADX INFO: renamed from: x1 */
        public final AbstractC5788h4 m54626x1() {
            return this.f39160x1;
        }

        public k4(int i, AbstractC5788h4 abstractC5788h4) {
            this(i);
            this.f39160x1 = abstractC5788h4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: x1 */
        public static String m54623x1(C12385to c12385to) {
            int[] iArr = {0};
            return C14057f9.m66589k4(C14113y2.m67422kk(c12385to.mo57995kk(), 1), 515, C6344m9.f18038k4, iArr) ? C14113y2.m67389k4((char) iArr[0], 1) : C14113y2.f47374k4;
        }

        public k4(int i, String str) {
            this.f39158k4 = i;
            this.f39159kk = str;
        }
    }

    public C11599yj(AbstractC5788h4 abstractC5788h4, AbstractC5788h4 abstractC5788h42) {
        IGenericList<k4> iGenericListM54619c5;
        k4 k4Var;
        IGenericList<k4> iGenericListM54619c52;
        k4 k4Var2;
        super(abstractC5788h4);
        C11537ks c11537ks = C5813x1.k4.f15898b3;
        C5796m9 c5796m9 = abstractC5788h42 == c11537ks ? new C5796m9(new C11537ks(C14113y2.f47374k4), new C11537ks(C14113y2.f47374k4)) : (C5796m9) C7019kk.m27452k4((Object) abstractC5788h42, C5796m9.class);
        if (c11537ks == abstractC5788h4) {
            this.f39153k4 = true;
            return;
        }
        if (C5813x1.k4.f16504wy == abstractC5788h4) {
            this.f39155x1 = true;
            return;
        }
        this.f39154kk = new List<>();
        IGenericEnumerator<AbstractC5788h4> it = ((C5796m9) abstractC5788h4).iterator();
        while (it.hasNext()) {
            AbstractC5788h4 next = it.next();
            if (C5813x1.k4.f16498wr == next) {
                int iM23802k4 = C5909to.m23802k4();
                C5909to.m23804kk(iM23802k4 + 1);
                iGenericListM54619c5 = m54619c5();
                k4Var = new k4(4, m54617k4(c5796m9, iM23802k4));
            } else if (C5813x1.k4.f16083i2 != next) {
                if (C5813x1.k4.f16108iv != next) {
                    if (C5813x1.k4.f16316q9 != next) {
                        switch (((AbstractC5803to) next).m23700k4()) {
                            case 19:
                                iGenericListM54619c5 = m54619c5();
                                k4Var = new k4(0, next);
                                break;
                            case 20:
                                iGenericListM54619c5 = m54619c5();
                                k4Var = new k4(1, next);
                                break;
                            case 22:
                                iGenericListM54619c5 = m54619c5();
                                k4Var = new k4(3, next);
                                break;
                            case 23:
                                iGenericListM54619c5 = m54619c5();
                                k4Var = new k4(2, next);
                                break;
                        }
                    } else {
                        if (C5909to.m23802k4() != 0) {
                            C5909to.m23804kk(C5909to.m23802k4() - 1);
                        }
                        iGenericListM54619c52 = m54619c5();
                        k4Var2 = new k4(7);
                    }
                } else {
                    C5909to.m23804kk(C5909to.m23802k4() + 1);
                    iGenericListM54619c52 = m54619c5();
                    k4Var2 = new k4(6);
                }
                iGenericListM54619c52.addItem(k4Var2);
            } else if (C5909to.m23802k4() != 0) {
                int iM23802k42 = C5909to.m23802k4() - 1;
                C5909to.m23804kk(iM23802k42);
                m54619c5().addItem(new k4(5, m54618x1(c5796m9, iM23802k42)));
            } else {
                m54619c5().addItem(new k4(5));
            }
            iGenericListM54619c5.addItem(k4Var);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private String m54617k4(C5796m9 c5796m9, int i) {
        int iMo23681k4 = i * 2;
        if (iMo23681k4 >= c5796m9.mo23681k4()) {
            iMo23681k4 = c5796m9.mo23681k4() - 2;
        }
        return c5796m9.mo23682k4(iMo23681k4).mo23414h4();
    }

    /* JADX INFO: renamed from: x1 */
    private String m54618x1(C5796m9 c5796m9, int i) {
        int iMo23681k4 = (i * 2) + 1;
        if (iMo23681k4 >= c5796m9.mo23681k4()) {
            iMo23681k4 = c5796m9.mo23681k4() - 1;
        }
        return c5796m9.mo23682k4(iMo23681k4).mo23414h4();
    }

    /* JADX INFO: renamed from: c5 */
    public final IGenericList<k4> m54619c5() {
        return this.f39154kk;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m54620dy() {
        return this.f39155x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m54621m9() {
        return this.f39153k4;
    }

    @Override // com.aspose.slides.internal.p453uz.AbstractC11580k4
    /* JADX INFO: renamed from: to */
    public String mo54591to() {
        if (m54621m9() || m54620dy()) {
            return C14113y2.f47374k4;
        }
        C6765kp c6765kp = new C6765kp();
        for (int i = 0; i < this.f39154kk.size(); i++) {
            c6765kp.m26792k4(this.f39154kk.get_Item(i).m54625kk());
        }
        return c6765kp.toString();
    }
}
