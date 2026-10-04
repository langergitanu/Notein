package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.C10362av;
import com.aspose.slides.internal.p407st.C10404dl;
import com.aspose.slides.internal.p407st.C10422ei;
import com.aspose.slides.internal.p407st.C10433f7;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10494jf;
import com.aspose.slides.internal.p407st.C10498jn;
import com.aspose.slides.internal.p407st.C10580ou;
import com.aspose.slides.internal.p407st.C10626rv;
import com.aspose.slides.internal.p407st.C10641ss;
import com.aspose.slides.internal.p407st.C10659tx;
import com.aspose.slides.internal.p407st.C10713xi;
import com.aspose.slides.internal.p407st.C10727y5;
import com.aspose.slides.internal.p407st.C10750zf;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18358t1;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.za */
/* JADX INFO: loaded from: classes3.dex */
class C14878za {
    /* JADX INFO: renamed from: k4 */
    public static Hyperlink m74359k4(C10422ei c10422ei, ri7 ri7Var) {
        C10659tx c10659txM51042k4;
        C10626rv c10626rvM51005to;
        C10580ou c10580ouM50780h4;
        if (ri7Var == null) {
            return Hyperlink.getNoAction();
        }
        a3u a3uVarM64712du = ri7Var.m70149up().m64712du();
        C10641ss c10641ssM71951m9 = a3uVarM64712du.m71951m9();
        Hyperlink noAction = Hyperlink.getNoAction();
        String strM51659x1 = "";
        C10494jf c10494jfM74360k4 = (c10641ssM71951m9.m51713rv() == null || c10641ssM71951m9.m51713rv().m50723to() == null) ? null : m74360k4(c10641ssM71951m9, c10422ei, "", false);
        byte bM50756to = c10422ei.m50756to();
        if (bM50756to == 1) {
            C10626rv c10626rvM52136to = ((C10750zf) c10422ei.m51402ak()).m52136to();
            if (c10626rvM52136to != null) {
                noAction = new Hyperlink(false, c10626rvM52136to.m51659x1(), 13);
            }
        } else if (bM50756to == 2) {
            C10626rv c10626rvM52136to2 = ((C10750zf) c10422ei.m51402ak()).m52136to();
            if (c10626rvM52136to2 != null) {
                noAction = new Hyperlink(true, c10626rvM52136to2.m51659x1(), 14);
            }
        } else if (bM50756to == 3) {
            switch (c10422ei.m50747du()) {
                case 0:
                    noAction = Hyperlink.getNoAction();
                    break;
                case 1:
                    noAction = Hyperlink.getNextSlide();
                    break;
                case 2:
                    noAction = Hyperlink.getPreviousSlide();
                    break;
                case 3:
                    noAction = Hyperlink.getFirstSlide();
                    break;
                case 4:
                    noAction = Hyperlink.getLastSlide();
                    break;
                case 5:
                    noAction = Hyperlink.getLastVievedSlide();
                    break;
                case 6:
                    noAction = Hyperlink.getEndShow();
                    break;
            }
        } else if (bM50756to == 4) {
            C10433f7 c10433f7M51703h4 = c10641ssM71951m9.m51703h4();
            if (c10433f7M51703h4 != null && (c10580ouM50780h4 = c10433f7M51703h4.m50780h4(c10422ei.m50754kk())) != null) {
                if (c10422ei.m50748dy() == 7) {
                    C10626rv c10626rvM51447h4 = c10580ouM50780h4.m51447h4();
                    if (c10626rvM51447h4 != null) {
                        noAction = new Hyperlink(false, C14113y2.m67408k4("#", c10626rvM51447h4.m51659x1()), 8);
                    } else if (c10580ouM50780h4.m51446du() != null) {
                        noAction = new Hyperlink(c10580ouM50780h4.m51446du().m51659x1());
                    } else if (c10580ouM50780h4.m51448to() != null) {
                        noAction = new Hyperlink(false, c10580ouM50780h4.m51448to().m51659x1(), 8);
                    }
                    a3uVarM64712du.m3190ne().addItem(noAction);
                } else {
                    C10626rv c10626rvM51446du = c10580ouM50780h4.m51446du();
                    C10626rv c10626rvM51448to = c10580ouM50780h4.m51448to();
                    if (c10626rvM51446du != null) {
                        strM51659x1 = c10626rvM51446du.m51659x1();
                        C10626rv c10626rvM51447h42 = c10580ouM50780h4.m51447h4();
                        if (c10626rvM51447h42 != null) {
                            strM51659x1 = C14113y2.m67408k4(strM51659x1, "#", c10626rvM51447h42.m51659x1());
                        }
                    } else if (c10626rvM51448to != null) {
                        strM51659x1 = c10626rvM51448to.m51659x1();
                    }
                    if (!C14113y2.m67411k4(strM51659x1)) {
                        int iM67429to = C14113y2.m67429to(strM51659x1, ParagraphCollection.f2953k4[0]);
                        if (iM67429to > 0 && C14113y2.m67364dy(strM51659x1, IOUtils.LINE_SEPARATOR_WINDOWS) != iM67429to) {
                            strM51659x1 = C14113y2.m67401k4(strM51659x1, "\r", IOUtils.LINE_SEPARATOR_WINDOWS);
                        }
                        noAction = c10422ei.m50748dy() == 10 ? new Hyperlink(true, strM51659x1, 10) : c10422ei.m50748dy() == 9 ? new Hyperlink(true, strM51659x1, 11) : new Hyperlink(strM51659x1);
                        if (c10626rvM51448to != null) {
                            noAction.m1699to().m4796k4(c10626rvM51448to.m51659x1());
                        }
                    }
                }
            }
        } else if (bM50756to == 6) {
            noAction = Hyperlink.getMedia();
        }
        if (c10494jfM74360k4 != null && (c10626rvM51005to = c10494jfM74360k4.m51005to()) != null) {
            noAction.setTooltip(c10626rvM51005to.m51659x1());
        }
        if (c10422ei.m50749h4()) {
            noAction.setStopSoundOnClick(c10422ei.m50755m9());
        }
        if ((c10422ei.m50757x1() & 4294967295L) > 0 && (c10659txM51042k4 = a3uVarM64712du.m71951m9().m51705jd().m51042k4((int) c10422ei.m50757x1())) != null && c10659txM51042k4.m51783du() != null && c10659txM51042k4.m51784h4() != null) {
            noAction.setSound(a3uVarM64712du.m3179k4(c10659txM51042k4));
            if (c10659txM51042k4.m51788x1() != null) {
                ((Audio) noAction.getSound()).m255k4().m72979k4(c10659txM51042k4.m51788x1().m51659x1());
            }
        }
        if (Hyperlink.op_Equality(noAction, Hyperlink.getNoAction()) && c10422ei.m50748dy() == -1) {
            return null;
        }
        return noAction;
    }

    /* JADX INFO: renamed from: k4 */
    private static C10494jf m74360k4(C10641ss c10641ss, C10422ei c10422ei, String str, boolean z) {
        C10498jn c10498jnM51596x1;
        if ((c10422ei.m50754kk() & 4294967295L) != 0 && (c10498jnM51596x1 = c10641ss.m51713rv().m50723to().m51596x1()) != null) {
            for (C10494jf c10494jf : c10498jnM51596x1.m51037m9()) {
                if (c10494jf.m51006x1().m50448x1() == c10422ei.m50754kk()) {
                    return c10494jf;
                }
            }
            if (z) {
                C10494jf c10494jf2 = new C10494jf();
                c10498jnM51596x1.m50513yj().addItem(c10494jf2);
                C10362av c10362av = new C10362av();
                c10494jf2.m50513yj().addItem(c10362av);
                c10362av.m50447k4(c10422ei.m50754kk());
                if (str == null) {
                    str = "";
                }
                c10494jf2.m50507k4(new C10626rv(str, (short) 0));
                C10713xi c10713xi = new C10713xi();
                c10494jf2.m50513yj().addItem(c10713xi);
                c10713xi.m51977k4(1L);
                return c10494jf2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10750zf m74361k4(Hyperlink hyperlink, String str, y2n y2nVar) {
        List<AbstractC10571o4> listM50513yj;
        C10626rv c10626rv;
        if (hyperlink == null) {
            return null;
        }
        C10750zf c10750zf = new C10750zf(null);
        C10422ei c10422ei = new C10422ei();
        c10750zf.m50513yj().addItem(c10422ei);
        if (hyperlink.getSound() != null) {
            c10422ei.m50752k4(((long) nmb.m68089k4(hyperlink.getSound(), y2nVar)) & 4294967295L);
            if (hyperlink.getActionType() == 0) {
                c10422ei.m50758x1((byte) -1);
                return c10750zf;
            }
        } else if (hyperlink.getStopSoundOnClick()) {
            c10422ei.m50760x1(true);
            c10422ei.m50753k4(true);
            if (hyperlink.getActionType() == 0) {
                c10422ei.m50758x1((byte) -1);
                return c10750zf;
            }
        }
        if (hyperlink.getActionType() == 12) {
            c10422ei.m50750k4((byte) 6);
            c10422ei.m50758x1((byte) -1);
            return c10750zf;
        }
        C10641ss c10641ssM50965m9 = y2nVar.m71954x1().m51483du().m50965m9();
        C10433f7 c10433f7M51710m9 = c10641ssM50965m9.m51710m9();
        C10404dl c10404dlM50785x1 = c10433f7M51710m9.m50785x1();
        long jM50689x1 = c10404dlM50785x1.m50689x1();
        c10404dlM50785x1.m50688k4(1 + jM50689x1);
        C10580ou c10580ou = new C10580ou();
        c10433f7M51710m9.m50513yj().addItem(c10580ou);
        C10362av c10362av = new C10362av();
        c10580ou.m50513yj().addItem(c10362av);
        c10362av.m50447k4(jM50689x1);
        c10422ei.m50759x1(jM50689x1);
        hyperlink.m1699to();
        if (C18358t1.g.f56183c.equals(hyperlink.m1698m9()) || Hyperlink.op_Equality(hyperlink, Hyperlink.getNoAction())) {
            c10422ei.m50750k4((byte) 0);
            return c10750zf;
        }
        if (hyperlink.getExternalUrlOriginal() != null) {
            if (hyperlink.getActionType() == 14) {
                c10422ei.m50750k4((byte) 2);
                c10750zf.m50513yj().addItem(new C10626rv(hyperlink.getExternalUrlOriginal(), (short) 2));
                return c10750zf;
            }
            String externalUrlOriginal = hyperlink.getExternalUrlOriginal();
            if (C14113y2.m67411k4(str)) {
                c10580ou.m50513yj().addItem(new C10626rv(externalUrlOriginal, (short) 0));
            } else {
                c10580ou.m50513yj().addItem(new C10626rv(str, (short) 0));
            }
            if (C14113y2.m67359c5(externalUrlOriginal, "#")) {
                c10580ou.m50513yj().addItem(new C10626rv(C14113y2.m67443x1(externalUrlOriginal, 0, C14113y2.m67418kk(externalUrlOriginal, '#')), (short) 1));
                listM50513yj = c10580ou.m50513yj();
                c10626rv = new C10626rv(C14113y2.m67396k4(externalUrlOriginal, 0, C14113y2.m67418kk(externalUrlOriginal, '#') + 1), (short) 3);
            } else {
                listM50513yj = c10580ou.m50513yj();
                c10626rv = new C10626rv(externalUrlOriginal, (short) 1);
            }
            listM50513yj.addItem(c10626rv);
            c10422ei.m50750k4((byte) 4);
            if (hyperlink.getActionType() == 10) {
                c10422ei.m50758x1((byte) 10);
            } else if (hyperlink.getActionType() == 11) {
                c10422ei.m50758x1((byte) 9);
            } else {
                c10422ei.m50758x1((byte) 8);
            }
            m74360k4(c10641ssM50965m9, c10422ei, hyperlink.getTooltip(), true);
            return c10750zf;
        }
        if (hyperlink.m1699to().m4793k4() != null) {
            if (hyperlink.m1699to().m4793k4().getPresentation() != y2nVar.m71946k4()) {
                c10422ei.m50750k4((byte) 0);
                return c10750zf;
            }
            y2nVar.m73727wl().addItem(c10580ou, hyperlink.m1699to().m4793k4());
            c10422ei.m50750k4((byte) 4);
            c10422ei.m50758x1((byte) 7);
            m74360k4(c10641ssM50965m9, c10422ei, hyperlink.getTooltip(), true);
            return c10750zf;
        }
        if (hyperlink.getActionType() != 4 && hyperlink.getActionType() != 3 && hyperlink.getActionType() != 2 && hyperlink.getActionType() != 5 && hyperlink.getActionType() != 7 && hyperlink.getActionType() != 6) {
            if (hyperlink.getActionType() != 8 || hyperlink.m1698m9() == null) {
                if (hyperlink.getActionType() == 13) {
                    c10422ei.m50750k4((byte) 1);
                    c10750zf.m50513yj().addItem(new C10626rv(C14113y2.m67401k4(hyperlink.m1690du(), "ppaction://macro?name=", ""), (short) 2));
                }
                return c10750zf;
            }
            c10580ou.m50513yj().addItem(new C10626rv(hyperlink.m1698m9(), (short) 3));
            c10422ei.m50750k4((byte) 4);
            c10422ei.m50751k4(0);
            c10422ei.m50758x1((byte) 7);
            m74360k4(c10641ssM50965m9, c10422ei, hyperlink.getTooltip(), true);
            return c10750zf;
        }
        c10422ei.m50750k4((byte) 3);
        c10422ei.m50758x1((byte) 1);
        switch (hyperlink.getActionType()) {
            case 2:
                c10580ou.m50513yj().addItem(new C10626rv("FIRST", (short) 0));
                c10580ou.m50513yj().addItem(new C10626rv("-1,-1,FIRST", (short) 3));
                c10422ei.m50758x1((byte) 2);
                c10422ei.m50751k4(3);
                break;
            case 3:
                c10580ou.m50513yj().addItem(new C10626rv("PREV", (short) 0));
                c10580ou.m50513yj().addItem(new C10626rv("-1,-1,PREV", (short) 3));
                c10422ei.m50758x1((byte) 1);
                c10422ei.m50751k4(2);
                break;
            case 4:
                c10580ou.m50513yj().addItem(new C10626rv("NEXT", (short) 0));
                c10580ou.m50513yj().addItem(new C10626rv("-1,-1,NEXT", (short) 3));
                c10422ei.m50758x1((byte) 0);
                c10422ei.m50751k4(1);
                break;
            case 5:
                c10580ou.m50513yj().addItem(new C10626rv("LAST", (short) 0));
                c10580ou.m50513yj().addItem(new C10626rv("-1,-1,LAST", (short) 3));
                c10422ei.m50758x1((byte) 3);
                c10422ei.m50751k4(4);
                break;
            case 6:
                c10580ou.m50513yj().addItem(new C10626rv("ENDSHOW", (short) 0));
                c10580ou.m50513yj().addItem(new C10626rv("-1,-1,ENDSHOW", (short) 3));
                c10422ei.m50751k4(6);
                break;
            case 7:
                c10580ou.m50513yj().addItem(new C10626rv("VIEWED", (short) 0));
                c10580ou.m50513yj().addItem(new C10626rv("-1,-1,VIEWED", (short) 3));
                c10422ei.m50751k4(5);
                break;
        }
        m74360k4(c10641ssM50965m9, c10422ei, hyperlink.getTooltip(), true);
        return c10750zf;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74362k4(Hyperlink hyperlink, boolean z, uz3 uz3Var) {
        C10750zf c10750zfM74361k4;
        C10462h9 c10462h9M72000ix = uz3Var.m72000ix();
        if (c10462h9M72000ix == null || (c10750zfM74361k4 = m74361k4(hyperlink, (String) null, uz3Var.m3738du().m70215k4())) == null) {
            return;
        }
        c10750zfM74361k4.m51407kk((short) (!z ? 1 : 0));
        c10462h9M72000ix.mo50862jd().m50507k4(c10750zfM74361k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74363k4(Hyperlink hyperlink, boolean z, String str, C10727y5 c10727y5, y2n y2nVar) {
        C10750zf c10750zfM74361k4;
        if (c10727y5 == null || (c10750zfM74361k4 = m74361k4(hyperlink, str, y2nVar)) == null) {
            return;
        }
        c10750zfM74361k4.m51407kk((short) (!z ? 1 : 0));
        c10727y5.m52061k4((AbstractC10571o4) c10750zfM74361k4);
    }
}
