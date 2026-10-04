package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p051bz.C1921qq;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p380ri.C10009ck;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.bv */
/* JADX INFO: loaded from: classes.dex */
public class C4263bv extends C4274g8 {

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.bv$k4 */
    public static class k4 extends AbstractC4275gi implements Cloneable {

        /* JADX INFO: renamed from: m9 */
        private static final int[] f11598m9 = {103, 101, 144, 106, 107, 108};

        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: k4 */
        public AbstractC4282kp mo14415k4(AbstractC3533um abstractC3533um, String str, AbstractC3524ks abstractC3524ks) {
            k4 k4Var;
            String strM49139k4;
            int i;
            int length;
            AbstractC4275gi abstractC4275giM14312x1;
            AbstractC4282kp abstractC4282kpMo17217k4;
            try {
                C4263bv c4263bv = new C4263bv();
                c4263bv.m17253k4(str);
                if (C14113y2.m67363du(str, "inherit")) {
                    int length2 = f11598m9.length;
                    while (true) {
                        length2--;
                        if (length2 < 0) {
                            break;
                        }
                        c4263bv.m17124k4(abstractC3533um.m14400m9(f11598m9[length2]), length2);
                    }
                    strM49139k4 = str;
                    i = 1;
                } else {
                    int length3 = f11598m9.length;
                    while (true) {
                        length3--;
                        if (length3 < 0) {
                            break;
                        }
                        c4263bv.m17124k4(null, length3);
                    }
                    k4Var = this;
                    try {
                        if (k4Var.mo17217k4(str) != null) {
                            return null;
                        }
                        int iM67429to = C14113y2.m67429to(str, ControlChar.SPACE_CHAR);
                        int iM67429to2 = C14113y2.m67429to(str, '\'') == -1 ? C14113y2.m67429to(str, '\"') : C14113y2.m67429to(str, '\'');
                        if (iM67429to == -1 || (iM67429to2 != -1 && iM67429to > iM67429to2)) {
                            throw new C1921qq(C14113y2.m67408k4("Invalid property value: ", "font=\"", str, "\""));
                        }
                        int iM67372k4 = iM67429to + 1;
                        str.getClass();
                        int iM67429to3 = C14113y2.m67429to(str, ',');
                        boolean z = false;
                        while (!z) {
                            if (iM67429to3 == -1) {
                                if (iM67429to2 != -1) {
                                    iM67372k4 = iM67429to2;
                                }
                                c4263bv.m17124k4(AbstractC3524ks.m14312x1(f11598m9[1]).mo14415k4(abstractC3533um, C14113y2.m67422kk(str, iM67372k4), abstractC3524ks), 1);
                                z = true;
                            } else {
                                if (iM67429to2 == -1 || iM67429to2 >= iM67429to3) {
                                    iM67372k4 = C14113y2.m67372k4(str, ControlChar.SPACE_CHAR, iM67429to3) + 1;
                                } else {
                                    iM67372k4 = iM67429to2;
                                    iM67429to2 = -1;
                                }
                                iM67429to3 = -1;
                            }
                        }
                        int i2 = iM67372k4 - 1;
                        int iM67372k42 = C14113y2.m67372k4(str, ControlChar.SPACE_CHAR, iM67372k4 - 2);
                        int i3 = iM67372k42 + 1;
                        strM49139k4 = C10009ck.m49139k4(str, i3, i2);
                        int iM67429to4 = C14113y2.m67429to(strM49139k4, IOUtils.DIR_SEPARATOR_UNIX);
                        if (iM67429to4 == -1) {
                            i = 1;
                            length = strM49139k4.length();
                        } else {
                            i = 1;
                            length = iM67429to4;
                        }
                        String strM49139k42 = C10009ck.m49139k4(strM49139k4, 0, length);
                        int[] iArr = f11598m9;
                        AbstractC4282kp abstractC4282kpMo14415k4 = AbstractC3524ks.m14312x1(iArr[0]).mo14415k4(abstractC3533um, strM49139k42, abstractC3524ks);
                        abstractC3533um.mo14064k4(iArr[0], abstractC4282kpMo14415k4);
                        c4263bv.m17124k4(abstractC4282kpMo14415k4, 0);
                        if (iM67429to4 != -1) {
                            c4263bv.m17124k4(AbstractC3524ks.m14312x1(iArr[2]).mo14415k4(abstractC3533um, C14113y2.m67422kk(strM49139k4, iM67429to4 + 1), abstractC3524ks), 2);
                        }
                        if (i3 != 0) {
                            String strM49139k43 = C10009ck.m49139k4(str, 0, iM67372k42);
                            int iM67429to5 = C14113y2.m67429to(strM49139k43, ControlChar.SPACE_CHAR);
                            int i4 = 0;
                            while (true) {
                                if (iM67429to5 == -1) {
                                    iM67429to5 = strM49139k43.length();
                                }
                                String strM49139k44 = C10009ck.m49139k4(strM49139k43, i4, iM67429to5);
                                int i5 = 6;
                                while (true) {
                                    i5--;
                                    if (i5 < 3) {
                                        break;
                                    }
                                    if (((C4274g8) c4263bv).f11657k4.get_Item(i5) == null && (abstractC4282kpMo17217k4 = abstractC4275giM14312x1.mo17217k4((strM49139k44 = (abstractC4275giM14312x1 = AbstractC3524ks.m14312x1(f11598m9[i5])).m17225kk(strM49139k44)))) != null) {
                                        c4263bv.m17124k4(abstractC4282kpMo17217k4, i5);
                                    }
                                }
                                i4 = iM67429to5 + 1;
                                int iM67434x1 = C14113y2.m67434x1(strM49139k43, ControlChar.SPACE_CHAR, i4);
                                if (iM67429to5 == strM49139k43.length()) {
                                    break;
                                }
                                iM67429to5 = iM67434x1;
                            }
                            strM49139k4 = strM49139k43;
                        }
                    } catch (C1921qq e) {
                        e = e;
                        e.m59590k4(abstractC3533um.m14393k4().m14106m_());
                        e.m9888k4(k4Var.m17229to());
                        throw e;
                    }
                }
                if (((C4274g8) c4263bv).f11657k4.get_Item(0) == null || ((C4274g8) c4263bv).f11657k4.get_Item(i) == null) {
                    throw new C1921qq(C14113y2.m67408k4("Invalid property value: ", "font-size and font-family are required for the font shorthand", "\nfont=\"", strM49139k4, "\""));
                }
                return c4263bv;
            } catch (C1921qq e2) {
                e = e2;
                k4Var = this;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m17124k4(AbstractC4282kp abstractC4282kp, int i) {
        while (((C4274g8) this).f11657k4.size() < i + 1) {
            ((C4274g8) this).f11657k4.addItem(null);
        }
        ((C4274g8) this).f11657k4.set_Item(i, abstractC4282kp);
    }
}
