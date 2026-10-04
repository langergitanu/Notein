package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7218a7;
import com.aspose.slides.internal.p332p7.C7345bt;
import com.aspose.slides.internal.p332p7.C8210lt;
import com.aspose.slides.internal.p332p7.C9063vs;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class b3x {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f4119k4 = new C7017h4("width", "height", "color", "transparency", "tip", "rasterOp", "antiAliased", "fitToCurve", "ignorePressure", "ellipse", "rectangle", "drop", "noOperation", "copyPen", "maskPen");

    /* JADX INFO: renamed from: k4 */
    public static void m3990k4(Ink ink, InkBrush inkBrush, C7218a7 c7218a7) {
        lzp lzpVarM1779c5;
        if (c7218a7 == null) {
            return;
        }
        inkBrush.m1791k4(c7218a7.m27964k4());
        inkBrush.m1803x1(c7218a7.m27971x1());
        if (c7218a7.m27969kk() != null) {
            for (C7345bt c7345bt : c7218a7.m27969kk()) {
                C7017h4 c7017h4 = f4119k4;
                switch (c7017h4.m27428k4(c7345bt.m29115k4())) {
                    case 0:
                        inkBrush.m1790k4(new lzp());
                        inkBrush.m1779c5().m64644k4(C14044b3.m66428k4(c7345bt.m29119x1(), C11697x1.m55250kk()));
                        lzpVarM1779c5 = inkBrush.m1779c5();
                        break;
                    case 1:
                        inkBrush.m1802x1(new lzp());
                        inkBrush.m1785jd().m64644k4(C14044b3.m66428k4(c7345bt.m29119x1(), C11697x1.m55250kk()));
                        lzpVarM1779c5 = inkBrush.m1785jd();
                        break;
                    case 2:
                        int iM66583k4 = C14057f9.m66583k4(C14113y2.m67422kk(c7345bt.m29119x1(), 1), 512);
                        inkBrush.m1788k4(C12003du.m56398k4(0, (iM66583k4 >> 16) & 255, (iM66583k4 >> 8) & 255, iM66583k4 & 255).Clone());
                        continue;
                        break;
                    case 3:
                        inkBrush.m1794kk(C14057f9.m66585k4(c7345bt.m29119x1(), C11697x1.m55250kk()));
                        continue;
                        break;
                    case 4:
                        switch (c7017h4.m27428k4(c7345bt.m29119x1())) {
                            case 9:
                                inkBrush.m1787k4(0);
                                break;
                            case 10:
                                inkBrush.m1787k4(1);
                                break;
                            case 11:
                                inkBrush.m1787k4(2);
                                continue;
                            default:
                                throw new NotImplementedException();
                        }
                        break;
                    case 5:
                        switch (c7017h4.m27428k4(c7345bt.m29119x1())) {
                            case 12:
                                inkBrush.m1801x1(0);
                                break;
                            case 13:
                                inkBrush.m1801x1(1);
                                break;
                            case 14:
                                inkBrush.m1801x1(2);
                                continue;
                            default:
                                throw new NotImplementedException();
                        }
                        break;
                    case 6:
                        inkBrush.m1792k4("1".equals(c7345bt.m29119x1()));
                        continue;
                        break;
                    case 7:
                        inkBrush.m1804x1("1".equals(c7345bt.m29119x1()));
                        continue;
                        break;
                    case 8:
                        inkBrush.m1795kk("1".equals(c7345bt.m29119x1()));
                        continue;
                        break;
                    default:
                        dd0 dd0Var = new dd0();
                        dd0Var.m5065k4(c7345bt.m29115k4());
                        dd0Var.m5067x1(c7345bt.m29119x1());
                        inkBrush.m1796ks().addItem(dd0Var);
                        continue;
                        break;
                }
                lzpVarM1779c5.m64645k4(c7345bt.m29117kk());
            }
        }
        if (c7218a7.m27970to() != null && c7218a7.m27970to().length > 0) {
            for (C9063vs c9063vs : c7218a7.m27970to()) {
                los losVar = new los();
                jsv.m63543k4(ink, losVar, c9063vs);
                inkBrush.m1797m9().addItem(losVar);
            }
        }
        if (c7218a7.m27963du() == null || c7218a7.m27963du().length <= 0) {
            return;
        }
        for (C8210lt c8210lt : c7218a7.m27963du()) {
            d7i d7iVar = new d7i();
            c7d.m4500k4(ink, d7iVar, c8210lt);
            inkBrush.m1782dy().addItem(d7iVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3991k4(InkBrush inkBrush, C7218a7 c7218a7) {
        List.Enumerator<los> it;
        c7218a7.m27968k4(inkBrush.m1781du());
        c7218a7.m27972x1(inkBrush.m1784h4());
        if (inkBrush.m1779c5() != null) {
            C7345bt c7345bt = new C7345bt();
            c7345bt.m29116k4("width");
            c7345bt.m29118kk(inkBrush.m1779c5().m64646x1());
            c7345bt.m29120x1(C14044b3.m66432k4(inkBrush.m1779c5().m64643k4(), (InterfaceC14073kp) C11697x1.m55250kk()));
            c7218a7.m27965k4(c7345bt);
        }
        if (inkBrush.m1785jd() != null) {
            C7345bt c7345bt2 = new C7345bt();
            c7345bt2.m29116k4("height");
            c7345bt2.m29118kk(inkBrush.m1785jd().m64646x1());
            c7345bt2.m29120x1(C14044b3.m66432k4(inkBrush.m1785jd().m64643k4(), (InterfaceC14073kp) C11697x1.m55250kk()));
            c7218a7.m27965k4(c7345bt2);
        }
        if (!inkBrush.m1786k4().m56504dy()) {
            C7345bt c7345bt3 = new C7345bt();
            c7345bt3.m29116k4("color");
            c7345bt3.m29120x1(C14113y2.m67408k4("#", C14098up.m67320k4(inkBrush.m1786k4().m56507jd(), "X2"), C14098up.m67320k4(inkBrush.m1786k4().m56502ck(), "X2"), C14098up.m67320k4(inkBrush.m1786k4().m56505fa(), "X2")));
            c7218a7.m27965k4(c7345bt3);
        }
        if (inkBrush.m1780ck() != 255) {
            C7345bt c7345bt4 = new C7345bt();
            c7345bt4.m29116k4("transparency");
            c7345bt4.m29120x1(C14057f9.m66586k4(inkBrush.m1780ck(), (InterfaceC14073kp) C11697x1.m55250kk()));
            c7218a7.m27965k4(c7345bt4);
        }
        if (inkBrush.m1793kk() != 0) {
            C7345bt c7345bt5 = new C7345bt();
            c7345bt5.m29116k4("tip");
            c7345bt5.m29120x1(inkBrush.m1793kk() == 1 ? "rectangle" : "drop");
            c7218a7.m27965k4(c7345bt5);
        }
        if (inkBrush.m1798to() != 1) {
            C7345bt c7345bt6 = new C7345bt();
            c7345bt6.m29116k4("rasterOp");
            c7345bt6.m29120x1(inkBrush.m1798to() == 2 ? "maskPen" : "noOperation");
            c7218a7.m27965k4(c7345bt6);
        }
        if (inkBrush.m1783fa()) {
            C7345bt c7345bt7 = new C7345bt();
            c7345bt7.m29116k4("antiAliased");
            c7345bt7.m29120x1("1");
            c7218a7.m27965k4(c7345bt7);
        }
        if (inkBrush.m1799up()) {
            C7345bt c7345bt8 = new C7345bt();
            c7345bt8.m29116k4("fitToCurve");
            c7345bt8.m29120x1("1");
            c7218a7.m27965k4(c7345bt8);
        }
        if (inkBrush.m1805yj()) {
            C7345bt c7345bt9 = new C7345bt();
            c7345bt9.m29116k4("ignorePressure");
            c7345bt9.m29120x1("1");
            c7218a7.m27965k4(c7345bt9);
        }
        if (inkBrush.m1797m9() != null && inkBrush.m1797m9().size() > 0) {
            it = inkBrush.m1797m9().iterator();
            while (it.hasNext()) {
                try {
                    los next = it.next();
                    C9063vs c9063vs = new C9063vs();
                    jsv.m63544k4(next, c9063vs);
                    c7218a7.m27967k4(c9063vs);
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        if (inkBrush.m1782dy() != null && inkBrush.m1782dy().size() > 0) {
            it = inkBrush.m1782dy().iterator();
            while (it.hasNext()) {
                try {
                    d7i next2 = it.next();
                    C8210lt c8210lt = new C8210lt();
                    c7d.m4501k4(next2, c8210lt);
                    c7218a7.m27966k4(c8210lt);
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        if (inkBrush.m1796ks().size() > 0) {
            List.Enumerator<dd0> it2 = inkBrush.m1796ks().iterator();
            while (it2.hasNext()) {
                try {
                    dd0 next3 = it2.next();
                    C7345bt c7345bt10 = new C7345bt();
                    c7345bt10.m29116k4(next3.m5064k4());
                    c7345bt10.m29120x1(next3.m5066x1());
                    c7218a7.m27965k4(c7345bt10);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
        }
    }
}
