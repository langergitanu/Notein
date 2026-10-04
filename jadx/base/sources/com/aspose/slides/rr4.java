package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7447cx;
import com.aspose.slides.internal.p332p7.C7670fk;
import com.aspose.slides.internal.p332p7.C8732s1;
import com.aspose.slides.internal.p407st.C10351a8;
import com.aspose.slides.internal.p407st.C10357al;
import com.aspose.slides.internal.p407st.C10378by;
import com.aspose.slides.internal.p407st.C10391cu;
import com.aspose.slides.internal.p407st.C10409du;
import com.aspose.slides.internal.p407st.C10454gm;
import com.aspose.slides.internal.p407st.C10486iy;
import com.aspose.slides.internal.p407st.C10562nk;
import com.aspose.slides.internal.p407st.C10698ws;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: loaded from: classes3.dex */
class rr4 {
    /* JADX INFO: renamed from: k4 */
    private static long m70323k4(C10378by c10378by) {
        return ((long) (C12003du.m56397k4(c10378by.m50519x1(), c10378by.m50517kk(), c10378by.m50518to()).m56506h4() & 16777215)) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m70330x1(com.aspose.slides.internal.p332p7.nbb nbbVar, C10698ws c10698ws, gi8 gi8Var) {
        if (nbbVar == null) {
            throw new ArgumentNullException();
        }
        if (c10698ws == null) {
            throw new ArgumentNullException();
        }
        com.aspose.slides.internal.p332p7.no7 no7VarM37354h4 = nbbVar.m37354h4();
        C10486iy c10486iy = new C10486iy();
        c10698ws.m50513yj().addItem(c10486iy);
        l1y.m64243k4(no7VarM37354h4, c10486iy);
        l1y.m64246x1(no7VarM37354h4, c10486iy);
        C10351a8 c10351a8 = new C10351a8();
        if (nbbVar.m37359to() != -1) {
            if (!c10698ws.m51949x1().m50842h4()) {
                throw new InvalidOperationException();
            }
            C10391cu c10391cu = new C10391cu(nbbVar.m37359to() == 0 ? 0 : 1);
            c10391cu.m51407kk((short) 4);
            c10351a8.m50513yj().addItem(c10391cu);
        }
        if (nbbVar.m37352du() != -1) {
            if (!c10698ws.m51949x1().m50848m9()) {
                throw new InvalidOperationException();
            }
            C10391cu c10391cu2 = new C10391cu(nbbVar.m37352du() != 0 ? 1 : 0);
            c10391cu2.m51407kk((short) 5);
            c10351a8.m50513yj().addItem(c10391cu2);
        }
        if (no7VarM37354h4.m37763du() == 1) {
            C10391cu c10391cu3 = new C10391cu(1);
            c10391cu3.m51407kk((short) 6);
            c10351a8.m50513yj().addItem(c10391cu3);
        }
        if (c10351a8.m50513yj().size() > 0) {
            c10486iy.m50513yj().addItem(c10351a8);
        }
        fut.m6321k4(no7VarM37354h4.m37771m9(), c10486iy, gi8Var);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70324k4(C7394ca.k4 k4Var, C10378by c10378by, m4c m4cVar) {
        int iM50514k4 = (int) c10378by.m50514k4();
        if (iM50514k4 == 0) {
            ((C7670fk) k4Var.mo2788k4("srgbClr").m29542x1()).m31802k4(m70323k4(c10378by));
        } else {
            if (iM50514k4 != 2) {
                throw new NotImplementedException();
            }
            ((C8732s1) k4Var.mo2788k4("schemeClr").m29542x1()).m40716k4(0);
            m4cVar.m64712du().m3185k4("Color scheme is not parsed.", 1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70325k4(com.aspose.slides.internal.p332p7.nbb nbbVar, C10357al c10357al, m4c m4cVar) {
        if (c10357al.m50704du() == null) {
            throw new InvalidOperationException();
        }
        C10698ws c10698wsM50704du = c10357al.m50704du();
        l1y.m64242k4(nbbVar.m37354h4(), c10357al, c10698wsM50704du.m51948to(), m4cVar);
        m70329k4(nbbVar, c10698wsM50704du, m4cVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70326k4(com.aspose.slides.internal.p332p7.nbb nbbVar, C10409du c10409du, gi8 gi8Var) {
        if (nbbVar == null) {
            return;
        }
        if (c10409du == null) {
            throw new InvalidOperationException();
        }
        C10698ws c10698ws = new C10698ws();
        c10409du.m50513yj().addItem(c10698ws);
        m70328k4(nbbVar, c10698ws, gi8Var);
        m70330x1(nbbVar, c10698ws, gi8Var);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70327k4(com.aspose.slides.internal.p332p7.nbb nbbVar, C10562nk c10562nk, m4c m4cVar) {
        if (c10562nk.m50704du() == null) {
            throw new InvalidOperationException();
        }
        C10698ws c10698wsM50704du = c10562nk.m50704du();
        l1y.m64245k4(nbbVar.m37354h4(), c10562nk, c10698wsM50704du.m51948to(), m4cVar);
        m70329k4(nbbVar, c10698wsM50704du, m4cVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70328k4(com.aspose.slides.internal.p332p7.nbb nbbVar, C10698ws c10698ws, gi8 gi8Var) {
        if (nbbVar == null) {
            throw new ArgumentNullException();
        }
        if (c10698ws == null) {
            throw new ArgumentNullException();
        }
        C10454gm c10454gm = new C10454gm();
        c10698ws.m50513yj().addItem(c10454gm);
        if (nbbVar.m37358m9() != null) {
            c10454gm.m50844k4(true);
            if (nbbVar.m37358m9().m39904k4() == null) {
                throw new InvalidOperationException();
            }
            if ("rgb".equals(nbbVar.m37358m9().m39904k4().m29539k4())) {
                com.aspose.slides.internal.p332p7.zmd zmdVar = (com.aspose.slides.internal.p332p7.zmd) nbbVar.m37358m9().m39904k4().m29542x1();
                c10454gm.m50843k4(new C10378by(0L, ubb.m71602k4(zmdVar.m45685k4()), ubb.m71602k4(zmdVar.m45689x1()), ubb.m71602k4(zmdVar.m45687kk())));
            } else {
                gi8Var.m6691k4("Writing of the animation color behavior failed.", 1);
            }
        } else {
            c10454gm.m50844k4(false);
        }
        if (nbbVar.m37353dy() != null) {
            c10454gm.m50853x1(true);
            if (nbbVar.m37353dy().m29964k4() == null) {
                throw new InvalidOperationException();
            }
            if ("srgbClr".equals(nbbVar.m37353dy().m29964k4().m29539k4())) {
                C7670fk c7670fk = (C7670fk) nbbVar.m37353dy().m29964k4().m29542x1();
                c7670fk.m31802k4(c7670fk.m31800k4() & 16777215);
                C12003du c12003duClone = C12003du.m56396k4((int) c7670fk.m31800k4()).Clone();
                c10454gm.m50852x1(new C10378by(0L, c12003duClone.m56507jd() & 255, c12003duClone.m56502ck() & 255, c12003duClone.m56505fa() & 255));
            } else {
                gi8Var.m6691k4("Writing of the animation color behavior failed.", 1);
            }
        } else {
            c10454gm.m50853x1(false);
        }
        if (nbbVar.m37351c5() != null) {
            c10454gm.m50847kk(true);
            if (nbbVar.m37351c5().m29964k4() == null) {
                throw new InvalidOperationException();
            }
            if ("srgbClr".equals(nbbVar.m37351c5().m29964k4().m29539k4())) {
                C7670fk c7670fk2 = (C7670fk) nbbVar.m37351c5().m29964k4().m29542x1();
                c7670fk2.m31802k4(16777215 & c7670fk2.m31800k4());
                C12003du c12003duClone2 = C12003du.m56396k4((int) c7670fk2.m31800k4()).Clone();
                c10454gm.m50846kk(new C10378by(0L, c12003duClone2.m56507jd() & 255, c12003duClone2.m56502ck() & 255, c12003duClone2.m56505fa() & 255));
            } else {
                gi8Var.m6691k4("Writing of the animation color behavior failed.", 1);
            }
        } else {
            c10454gm.m50847kk(false);
        }
        if (nbbVar.m37359to() != -1) {
            c10454gm.m50849to(true);
        } else {
            c10454gm.m50849to(false);
        }
        if (nbbVar.m37352du() != -1) {
            c10454gm.m50840du(true);
        } else {
            c10454gm.m50840du(false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70329k4(com.aspose.slides.internal.p332p7.nbb nbbVar, C10698ws c10698ws, m4c m4cVar) {
        if (c10698ws == null) {
            throw new InvalidOperationException();
        }
        if (c10698ws.m51949x1().m50850to()) {
            final C7447cx c7447cxM37360x1 = nbbVar.m37360x1();
            m70324k4(new C7394ca.k4() { // from class: com.aspose.slides.rr4.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c7447cxM37360x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_ColorElementData.AddColor(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c7447cxM37360x1.m29965k4(str);
                }
            }, c10698ws.m51949x1().m50851x1(), m4cVar);
        }
        if (c10698ws.m51949x1().m50841du()) {
            final C7447cx c7447cxM37357kk = nbbVar.m37357kk();
            m70324k4(new C7394ca.k4() { // from class: com.aspose.slides.rr4.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c7447cxM37357kk) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_ColorElementData.AddColor(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c7447cxM37357kk.m29965k4(str);
                }
            }, c10698ws.m51949x1().m50845kk(), m4cVar);
        }
        if (c10698ws.m51948to().m50974du() != null) {
            C10391cu c10391cu = (C10391cu) C7019kk.m27452k4((Object) c10698ws.m51948to().m50974du().m50415k4((short) 4), C10391cu.class);
            if (c10391cu != null) {
                int iM50572du = c10391cu.m50572du();
                if (iM50572du == 0) {
                    nbbVar.m37356k4((byte) 0);
                } else if (iM50572du != 1) {
                    nbbVar.m37356k4((byte) -1);
                } else {
                    nbbVar.m37356k4((byte) 1);
                }
            }
            C10391cu c10391cu2 = (C10391cu) C7019kk.m27452k4((Object) c10698ws.m51948to().m50974du().m50415k4((short) 5), C10391cu.class);
            if (c10391cu2 != null) {
                int iM50572du2 = c10391cu2.m50572du();
                if (iM50572du2 == 0) {
                    nbbVar.m37361x1((byte) 0);
                } else if (iM50572du2 != 1) {
                    nbbVar.m37361x1((byte) -1);
                } else {
                    nbbVar.m37361x1((byte) 1);
                }
            }
            C10391cu c10391cu3 = (C10391cu) C7019kk.m27452k4((Object) c10698ws.m51948to().m50974du().m50415k4((short) 6), C10391cu.class);
            if (c10391cu3 == null || c10391cu3.m50572du() != 1) {
                return;
            }
            nbbVar.m37354h4().m37773to((byte) 1);
        }
    }
}
