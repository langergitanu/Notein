package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8528pk;
import com.aspose.slides.internal.p407st.AbstractC10590pi;
import com.aspose.slides.internal.p407st.C10409du;
import com.aspose.slides.internal.p407st.C10465hg;
import com.aspose.slides.internal.p407st.C10485ix;
import com.aspose.slides.internal.p407st.C10486iy;
import com.aspose.slides.internal.p407st.C10499jv;
import com.aspose.slides.internal.p407st.C10529ls;
import com.aspose.slides.internal.p407st.C10561ni;
import com.aspose.slides.internal.p407st.C10633sa;
import com.aspose.slides.internal.p407st.C10649tg;
import com.aspose.slides.internal.p407st.C10659tx;
import com.aspose.slides.internal.p407st.C10732yi;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class fut {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f5135k4 = new C7017h4("sldTgt", "sndTgt", "spTgt", TranslateLanguage.BULGARIAN, "txEl", "graphicEl", "oleChartEl", "charRg", "pRg");

    /* JADX INFO: renamed from: k4 */
    private static byte m6315k4(int i) {
        if (i == 0) {
            return (byte) 0;
        }
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                b = 3;
                if (i != 3) {
                    if (i == 4) {
                        return (byte) 4;
                    }
                    throw new NotImplementedException();
                }
            }
        }
        return b;
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m6328kk(com.aspose.slides.internal.p332p7.ycb ycbVar, C10529ls c10529ls, m4c m4cVar) {
        C10649tg c10649tg = (C10649tg) C7019kk.m27452k4((Object) c10529ls, C10649tg.class);
        if (c10649tg == null) {
            return false;
        }
        com.aspose.slides.internal.p332p7.sdd sddVar = (com.aspose.slides.internal.p332p7.sdd) ycbVar.m44925k4("spTgt").m29542x1();
        if (m4cVar.m64738wl().containsKey(Long.valueOf(c10649tg.m51749x1()))) {
            sddVar.m40967x1(C13850af.m65147x1(c10649tg.m51749x1()));
        }
        if (c10649tg.m51219du() == 0) {
            return true;
        }
        if (c10649tg.m51219du() == 6) {
            sddVar.m40963k4(TranslateLanguage.BULGARIAN);
            return true;
        }
        if (c10649tg.m51219du() != 2) {
            return true;
        }
        com.aspose.slides.internal.p332p7.a9h a9hVar = (com.aspose.slides.internal.p332p7.a9h) ((com.aspose.slides.internal.p332p7.nhj) sddVar.m40963k4("txEl").m29542x1()).m37518k4("charRg").m29542x1();
        a9hVar.m28056k4(((long) c10649tg.m51747kk()) & 4294967295L);
        a9hVar.m28058x1(((long) c10649tg.m51748to()) & 4294967295L);
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public static long m6329x1(String str, gi8 gi8Var) {
        long jM65124ne = C13850af.m65124ne(str);
        if (gi8Var.m6698x1().containsKey(Long.valueOf(jM65124ne))) {
            return gi8Var.m6698x1().get_Item(Long.valueOf(jM65124ne)).m72010wl().m52045x1();
        }
        throw new InvalidOperationException();
    }

    /* JADX INFO: renamed from: k4 */
    private static int m6316k4(byte b) {
        int i = 1;
        if (b != 1) {
            i = 2;
            if (b != 2) {
                i = 3;
                if (b != 3) {
                    i = 4;
                    if (b != 4) {
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m6330x1(com.aspose.slides.internal.p332p7.ycb ycbVar, AbstractC10590pi abstractC10590pi, m4c m4cVar) {
        C10529ls c10529ls = (C10529ls) C7019kk.m27452k4((Object) abstractC10590pi, C10529ls.class);
        if (c10529ls == null) {
            throw new InvalidOperationException();
        }
        m6326k4(ycbVar, c10529ls, m4cVar);
        m6331x1(ycbVar, c10529ls, m4cVar);
        m6328kk(ycbVar, c10529ls, m4cVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static IShape m6317k4(gi8 gi8Var, String str) {
        Dictionary.Enumerator<IShape, Long> it = gi8Var.m6687k4().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (C14113y2.m67363du(C13850af.m65147x1(((Long) next.getValue()).longValue()), str)) {
                    return (IShape) next.getKey();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m6331x1(com.aspose.slides.internal.p332p7.ycb ycbVar, C10529ls c10529ls, m4c m4cVar) {
        C10732yi c10732yi = (C10732yi) C7019kk.m27452k4((Object) c10529ls, C10732yi.class);
        if (c10732yi == null) {
            return false;
        }
        com.aspose.slides.internal.p332p7.sdd sddVar = (com.aspose.slides.internal.p332p7.sdd) ycbVar.m44925k4("spTgt").m29542x1();
        if (m4cVar.m64738wl().containsKey(Long.valueOf(c10732yi.m52075x1()))) {
            sddVar.m40967x1(C13850af.m65147x1(c10732yi.m52075x1()));
        }
        com.aspose.slides.internal.p332p7.hof hofVar = (com.aspose.slides.internal.p332p7.hof) sddVar.m40963k4("oleChartEl").m29542x1();
        hofVar.m33556k4(m6315k4(c10732yi.m52073kk()));
        if (c10732yi.m52074to() < 0) {
            return true;
        }
        hofVar.m33557k4(((long) c10732yi.m52074to()) & 4294967295L);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6318k4(com.aspose.slides.internal.p332p7.sdd sddVar, C10485ix c10485ix, gi8 gi8Var) {
        if (sddVar == null) {
            throw new InvalidOperationException();
        }
        if (c10485ix == null) {
            throw new InvalidOperationException();
        }
        if (sddVar.m40966x1() == null) {
            if (m6327k4(sddVar.m40964k4(), gi8Var)) {
                C10649tg c10649tg = new C10649tg();
                c10485ix.m50513yj().addItem(c10649tg);
                IShape iShapeM6317k4 = m6317k4(gi8Var, sddVar.m40964k4());
                if (C7019kk.m27469x1(iShapeM6317k4, IAudioFrame.class)) {
                    c10649tg.m51220kk(3);
                } else if (C7019kk.m27469x1(iShapeM6317k4, IVideoFrame.class)) {
                    c10649tg.m51220kk(4);
                } else {
                    c10649tg.m51220kk(0);
                }
                c10649tg.m51746k4(m6329x1(sddVar.m40964k4(), gi8Var));
                c10649tg.m51745k4(-1);
                c10649tg.m51750x1(-1);
                return;
            }
            return;
        }
        C7017h4 c7017h4 = f5135k4;
        int iM27428k4 = c7017h4.m27428k4(sddVar.m40966x1().m29539k4());
        if (iM27428k4 == 3) {
            C10649tg c10649tg2 = new C10649tg();
            c10485ix.m50513yj().addItem(c10649tg2);
            c10649tg2.m51220kk(6);
            c10649tg2.m51746k4(m6329x1(sddVar.m40964k4(), gi8Var));
            c10649tg2.m51745k4(-1);
            c10649tg2.m51750x1(-1);
            return;
        }
        if (iM27428k4 != 4) {
            if (iM27428k4 == 5) {
                C10649tg c10649tg3 = new C10649tg();
                c10485ix.m50513yj().addItem(c10649tg3);
                c10649tg3.m51220kk(0);
                c10649tg3.m51746k4(m6329x1(sddVar.m40964k4(), gi8Var));
                c10649tg3.m51745k4(-1);
                c10649tg3.m51750x1(-1);
                return;
            }
            if (iM27428k4 != 6) {
                gi8Var.m6691k4("Writing of the animation target failed.", 1);
                return;
            }
            com.aspose.slides.internal.p332p7.hof hofVar = (com.aspose.slides.internal.p332p7.hof) C7019kk.m27452k4((Object) sddVar.m40966x1().m29542x1(), com.aspose.slides.internal.p332p7.hof.class);
            C10732yi c10732yi = new C10732yi();
            c10485ix.m50513yj().addItem(c10732yi);
            c10732yi.m51220kk(5);
            c10732yi.m52072k4(m6329x1(sddVar.m40964k4(), gi8Var));
            c10732yi.m52071k4(m6316k4(hofVar.m33555k4()));
            c10732yi.m52076x1((int) hofVar.m33558x1());
            return;
        }
        com.aspose.slides.internal.p332p7.nhj nhjVar = (com.aspose.slides.internal.p332p7.nhj) sddVar.m40966x1().m29542x1();
        if (nhjVar.m37517k4() == null) {
            return;
        }
        com.aspose.slides.internal.p332p7.a9h a9hVar = (com.aspose.slides.internal.p332p7.a9h) nhjVar.m37517k4().m29542x1();
        int iM27428k42 = c7017h4.m27428k4(nhjVar.m37517k4().m29539k4());
        if (iM27428k42 == 7) {
            C10649tg c10649tg4 = new C10649tg();
            c10485ix.m50513yj().addItem(c10649tg4);
            c10649tg4.m51220kk(2);
            c10649tg4.m51746k4(m6329x1(sddVar.m40964k4(), gi8Var));
            c10649tg4.m51745k4((int) a9hVar.m28055k4());
            c10649tg4.m51750x1((int) a9hVar.m28057x1());
            return;
        }
        if (iM27428k42 != 8) {
            gi8Var.m6691k4("Writing of the animation target failed.", 1);
            return;
        }
        C10649tg c10649tg5 = new C10649tg();
        c10485ix.m50513yj().addItem(c10649tg5);
        c10649tg5.m51220kk(2);
        c10649tg5.m51746k4(m6329x1(sddVar.m40964k4(), gi8Var));
        m6325k4(c10649tg5, (IAutoShape) m6317k4(gi8Var, sddVar.m40964k4()), a9hVar.m28055k4(), a9hVar.m28057x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6319k4(com.aspose.slides.internal.p332p7.ycb ycbVar, C10409du c10409du, gi8 gi8Var) {
        if (ycbVar == null) {
            return;
        }
        C10485ix c10485ix = new C10485ix();
        c10409du.m50513yj().addItem(c10485ix);
        m6320k4(ycbVar, c10485ix, gi8Var);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6320k4(com.aspose.slides.internal.p332p7.ycb ycbVar, C10485ix c10485ix, gi8 gi8Var) {
        if (ycbVar == null || ycbVar.m44924k4() == null) {
            throw new InvalidOperationException();
        }
        if (c10485ix == null) {
            throw new InvalidOperationException();
        }
        C7394ca c7394caM44924k4 = ycbVar.m44924k4();
        int iM27428k4 = f5135k4.m27428k4(c7394caM44924k4.m29539k4());
        if (iM27428k4 == 0) {
            c10485ix.m50513yj().addItem(new C10633sa());
            return;
        }
        if (iM27428k4 != 1) {
            if (iM27428k4 != 2) {
                gi8Var.m6691k4("Writing of the animation target failed.", 1);
                return;
            } else {
                m6318k4((com.aspose.slides.internal.p332p7.sdd) c7394caM44924k4.m29542x1(), c10485ix, gi8Var);
                return;
            }
        }
        C10465hg c10465hg = new C10465hg();
        c10485ix.m50513yj().addItem(c10465hg);
        C8528pk c8528pk = (C8528pk) c7394caM44924k4.m29542x1();
        c10465hg.m51220kk(3);
        long[] jArr = {0};
        boolean zM67463k4 = C14114y9.m67463k4(c8528pk.m38951k4(), jArr);
        long j = jArr[0];
        if (zM67463k4) {
            c10465hg.m50894k4(j);
        } else {
            if (C14113y2.m67411k4(c8528pk.m38951k4()) || !C14113y2.m67448x1(c8528pk.m38951k4(), "rId")) {
                throw new InvalidOperationException();
            }
            c10465hg.m50894k4(((long) gi8Var.m6697x1(c8528pk.m38951k4())) & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6321k4(com.aspose.slides.internal.p332p7.ycb ycbVar, C10486iy c10486iy, gi8 gi8Var) {
        if (ycbVar == null) {
            return;
        }
        C10485ix c10485ix = new C10485ix();
        m6320k4(ycbVar, c10485ix, gi8Var);
        if (c10485ix.m50513yj().size() > 0) {
            c10486iy.m50513yj().addItem(c10485ix);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6322k4(com.aspose.slides.internal.p332p7.ycb ycbVar, C10561ni c10561ni, gi8 gi8Var) {
        if (ycbVar == null) {
            return;
        }
        C10485ix c10485ix = new C10485ix();
        c10561ni.m50513yj().addItem(c10485ix);
        m6320k4(ycbVar, c10485ix, gi8Var);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6323k4(com.aspose.slides.internal.p332p7.ycb ycbVar, AbstractC10590pi abstractC10590pi) {
        if (((C10633sa) C7019kk.m27452k4((Object) abstractC10590pi, C10633sa.class)) == null) {
            throw new InvalidOperationException();
        }
        ycbVar.m44925k4("sldTgt");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6324k4(com.aspose.slides.internal.p332p7.ycb ycbVar, AbstractC10590pi abstractC10590pi, m4c m4cVar) {
        if (abstractC10590pi == null) {
            return;
        }
        int iM51923to = abstractC10590pi.m51409um().m51923to();
        if (iM51923to == 11003) {
            m6330x1(ycbVar, abstractC10590pi, m4cVar);
        } else {
            if (iM51923to != 11009) {
                throw new NotImplementedException();
            }
            m6323k4(ycbVar, abstractC10590pi);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6325k4(C10649tg c10649tg, IAutoShape iAutoShape, long j, long j2) {
        int iM63184k4 = C13670j2.m63184k4(iAutoShape, j);
        int iM63204x1 = C13670j2.m63204x1(iAutoShape, j2);
        if (iM63184k4 == -1 || iM63204x1 == -1) {
            return;
        }
        c10649tg.m51745k4(iM63184k4);
        c10649tg.m51750x1(iM63204x1);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m6326k4(com.aspose.slides.internal.p332p7.ycb ycbVar, C10529ls c10529ls, m4c m4cVar) {
        C10465hg c10465hg = (C10465hg) C7019kk.m27452k4((Object) c10529ls, C10465hg.class);
        if (c10465hg == null) {
            return false;
        }
        a3u a3uVarM64712du = m4cVar.m64712du();
        C10499jv c10499jvM51705jd = a3uVarM64712du.m71951m9().m51705jd();
        if (c10499jvM51705jd == null) {
            return false;
        }
        C8528pk c8528pk = (C8528pk) ycbVar.m44925k4("sndTgt").m29542x1();
        C10659tx c10659txM51042k4 = c10499jvM51705jd.m51042k4((int) c10465hg.m50895x1());
        if (c10659txM51042k4 == null || c10659txM51042k4.m51783du() == null) {
            return true;
        }
        c8528pk.m38952k4(c10659txM51042k4.m51783du().m51659x1());
        if (c10659txM51042k4.m51788x1() != null) {
            c8528pk.m38956x1(c10659txM51042k4.m51788x1().m51659x1());
        }
        if (c10659txM51042k4.m51784h4() == null) {
            return true;
        }
        a3uVarM64712du.m3179k4(c10659txM51042k4);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m6327k4(String str, gi8 gi8Var) {
        if (str == null) {
            return false;
        }
        return gi8Var.m6698x1().containsKey(Long.valueOf(C13850af.m65124ne(str)));
    }
}
