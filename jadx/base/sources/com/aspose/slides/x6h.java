package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7355bw;
import com.aspose.slides.internal.p332p7.C7479df;
import com.aspose.slides.internal.p332p7.C7983j9;
import com.aspose.slides.internal.p332p7.C8357nl;
import com.aspose.slides.internal.p332p7.C8385nw;
import com.aspose.slides.internal.p332p7.C9340z3;
import com.aspose.slides.internal.p332p7.C9375zk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class x6h {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f49988k4 = new C7017h4("threshold", "resolution", "quantization", "noise", "accuracy", "crossCoupling", "skew", "minBandwidth", "peakRate", "distortion");

    /* JADX INFO: renamed from: k4 */
    public static void m73148k4(Ink ink, y1b y1bVar, C7355bw c7355bw) {
        if (c7355bw == null) {
            return;
        }
        y1bVar.m73671k4(c7355bw.m29186k4());
        y1bVar.m73678x1(c7355bw.m29198x1());
        y1bVar.m73673kk(c7355bw.m29193kk());
        y1bVar.m73676to(c7355bw.m29196to());
        y1bVar.m73661du(c7355bw.m29179du());
        y1bVar.m73664h4(c7355bw.m29183h4());
        if (c7355bw.m29195m9() != null) {
            cow cowVar = new cow();
            emp.m5601k4(ink, cowVar, c7355bw.m29195m9());
            y1bVar.m73668k4(cowVar);
        }
        if (c7355bw.m29181dy() != null) {
            nd7 nd7Var = new nd7();
            hhy.m7157k4(ink, nd7Var, c7355bw.m29181dy());
            y1bVar.m73670k4(nd7Var);
        }
        if (c7355bw.m29177c5() != null) {
            y1bVar.m73667k4(C14044b3.m66428k4(c7355bw.m29177c5().m34602k4(), C11697x1.m55250kk()));
        }
        if (c7355bw.m29185jd() != null) {
            mga mgaVar = new mga();
            gdv.m6497k4(ink, mgaVar, c7355bw.m29185jd());
            y1bVar.m73669k4(mgaVar);
        }
        if (c7355bw.m29178ck() != null && c7355bw.m29178ck().length > 0) {
            throw new NotImplementedException("SourcePropertyList");
        }
        if (c7355bw.m29182fa() == null || c7355bw.m29182fa().m45637k4().length <= 0) {
            return;
        }
        for (C7479df c7479df : c7355bw.m29182fa().m45637k4()) {
            qi5 qi5VarM4708x1 = y1bVar.m73674m9() != null ? y1bVar.m73674m9().m4708x1(c7479df.m30322k4()) : null;
            if (qi5VarM4708x1 != null) {
                switch (f49988k4.m27428k4(c7479df.m30328x1())) {
                    case 0:
                        qi5VarM4708x1.m69639kk(C13850af.m65132uz(c7479df.m30324kk()));
                        qi5VarM4708x1.m69629h4(c7479df.m30326to());
                        break;
                    case 1:
                        qi5VarM4708x1.m69650to(C13850af.m65132uz(c7479df.m30324kk()));
                        qi5VarM4708x1.m69645m9(c7479df.m30326to());
                        break;
                    case 2:
                        qi5VarM4708x1.m69640kk(C14057f9.m66582k4(c7479df.m30324kk()));
                        break;
                    case 3:
                        qi5VarM4708x1.m69621du(C13850af.m65132uz(c7479df.m30324kk()));
                        break;
                    case 4:
                        qi5VarM4708x1.m69628h4(C13850af.m65132uz(c7479df.m30324kk()));
                        qi5VarM4708x1.m69625dy(c7479df.m30326to());
                        break;
                    case 5:
                        qi5VarM4708x1.m69644m9(C13850af.m65132uz(c7479df.m30324kk()));
                        break;
                    case 6:
                        qi5VarM4708x1.m69624dy(C13850af.m65132uz(c7479df.m30324kk()));
                        break;
                    case 7:
                        qi5VarM4708x1.m69651to(C14057f9.m66582k4(c7479df.m30324kk()));
                        break;
                    case 8:
                        qi5VarM4708x1.m69617c5(C13850af.m65132uz(c7479df.m30324kk()));
                        break;
                    case 9:
                        qi5VarM4708x1.m69632jd(C13850af.m65132uz(c7479df.m30324kk()));
                        qi5VarM4708x1.m69618c5(c7479df.m30326to());
                        break;
                    default:
                        throw new NotImplementedException();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73149k4(y1b y1bVar, C7355bw c7355bw) {
        c7355bw.m29192k4(y1bVar.m73666k4());
        c7355bw.m29199x1(y1bVar.m73677x1());
        c7355bw.m29194kk(y1bVar.m73672kk());
        c7355bw.m29197to(y1bVar.m73675to());
        c7355bw.m29180du(y1bVar.m73660du());
        c7355bw.m29184h4(y1bVar.m73663h4());
        if (y1bVar.m73674m9() != null) {
            C9340z3 c9340z3 = new C9340z3();
            emp.m5602k4(y1bVar.m73674m9(), c9340z3);
            c7355bw.m29190k4(c9340z3);
        }
        if (y1bVar.m73662dy() != null && y1bVar.m73662dy().m67996x1() != 0.0d) {
            C8385nw c8385nw = new C8385nw();
            hhy.m7158k4(y1bVar.m73662dy(), c8385nw);
            c7355bw.m29189k4(c8385nw);
        }
        if (y1bVar.m73658c5() != 0.0d) {
            C7983j9 c7983j9 = new C7983j9();
            c7983j9.m34603k4(C14044b3.m66432k4(y1bVar.m73658c5(), (InterfaceC14073kp) C11697x1.m55250kk()));
            c7355bw.m29187k4(c7983j9);
        }
        if (y1bVar.m73665jd() != null) {
            C8357nl c8357nl = new C8357nl();
            gdv.m6498k4(y1bVar.m73665jd(), c8357nl);
            c7355bw.m29188k4(c8357nl);
        }
        if (y1bVar.m73659ck() != null && y1bVar.m73659ck().size() > 0) {
            throw new NotImplementedException("WriteSourcePropertyList");
        }
        C9375zk c9375zk = new C9375zk();
        if (y1bVar.m73674m9() != null && y1bVar.m73674m9().m4707x1().size() > 0) {
            List.Enumerator<qi5> it = y1bVar.m73674m9().m4707x1().iterator();
            while (it.hasNext()) {
                try {
                    qi5 next = it.next();
                    C7479df c7479df = new C7479df();
                    if (next.m69654up() != 0.0d) {
                        c7479df.m30323k4(next.m69657x1());
                        c7479df.m30329x1("resolution");
                        c7479df.m30325kk(C13850af.m65101k4(next.m69654up()));
                        c7479df.m30327to(next.m69662yj());
                        c9375zk.m45636k4(c7479df);
                    }
                    if (next.m69619ck() != 0.0d) {
                        C7479df c7479df2 = new C7479df();
                        c7479df2.m30323k4(next.m69657x1());
                        c7479df2.m30329x1("threshold");
                        c7479df2.m30325kk(C13850af.m65101k4(next.m69619ck()));
                        c7479df2.m30327to(next.m69626fa());
                        c9375zk.m45636k4(c7479df2);
                    }
                    if (next.m69642ks() != 0) {
                        C7479df c7479df3 = new C7479df();
                        c7479df3.m30323k4(next.m69657x1());
                        c7479df3.m30329x1("quantization");
                        c7479df3.m30325kk(C14057f9.m66586k4(next.m69642ks(), (InterfaceC14073kp) C11697x1.m55250kk()));
                        c9375zk.m45636k4(c7479df3);
                    }
                    if (next.m69648rv() != 0.0d) {
                        C7479df c7479df4 = new C7479df();
                        c7479df4.m30323k4(next.m69657x1());
                        c7479df4.m30329x1("noise");
                        c7479df4.m30325kk(C13850af.m65101k4(next.m69648rv()));
                        c9375zk.m45636k4(c7479df4);
                    }
                    if (next.m69661x6() != 0.0d) {
                        C7479df c7479df5 = new C7479df();
                        c7479df5.m30323k4(next.m69657x1());
                        c7479df5.m30329x1("accuracy");
                        c7479df5.m30325kk(C13850af.m65101k4(next.m69661x6()));
                        c7479df5.m30327to(next.m69646ne());
                        c9375zk.m45636k4(c7479df5);
                    }
                    if (next.m69630ix() != 0.0d) {
                        C7479df c7479df6 = new C7479df();
                        c7479df6.m30323k4(next.m69657x1());
                        c7479df6.m30329x1("crossCoupling");
                        c7479df6.m30325kk(C13850af.m65101k4(next.m69630ix()));
                        c9375zk.m45636k4(c7479df6);
                    }
                    if (next.m69653u4() != 0.0d) {
                        C7479df c7479df7 = new C7479df();
                        c7479df7.m30323k4(next.m69657x1());
                        c7479df7.m30329x1("skew");
                        c7479df7.m30325kk(C13850af.m65101k4(next.m69653u4()));
                        c9375zk.m45636k4(c7479df7);
                    }
                    if (next.m69655uz() != 0) {
                        C7479df c7479df8 = new C7479df();
                        c7479df8.m30323k4(next.m69657x1());
                        c7479df8.m30329x1("minBandwidth");
                        c7479df8.m30325kk(C14057f9.m66586k4(next.m69655uz(), (InterfaceC14073kp) C11697x1.m55250kk()));
                        c9375zk.m45636k4(c7479df8);
                    }
                    if (next.m69656wl() != 0.0d) {
                        C7479df c7479df9 = new C7479df();
                        c7479df9.m30323k4(next.m69657x1());
                        c7479df9.m30329x1("peakRate");
                        c7479df9.m30325kk(C13850af.m65101k4(next.m69656wl()));
                        c9375zk.m45636k4(c7479df9);
                    }
                    if (next.m69647qq() != 0.0d) {
                        C7479df c7479df10 = new C7479df();
                        c7479df10.m30323k4(next.m69657x1());
                        c7479df10.m30329x1("distortion");
                        c7479df10.m30325kk(C13850af.m65101k4(next.m69647qq()));
                        c7479df10.m30327to(next.m69615ar());
                        c9375zk.m45636k4(c7479df10);
                    }
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        if (c9375zk.m45637k4().length > 0) {
            c7355bw.m29191k4(c9375zk);
        }
    }
}
