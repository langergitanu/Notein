package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.C3126c5;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC9120wl;
import com.aspose.slides.internal.p332p7.C7275aw;
import com.aspose.slides.internal.p332p7.C7317be;
import com.aspose.slides.internal.p332p7.C7341br;
import com.aspose.slides.internal.p332p7.C7351bv;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7591eq;
import com.aspose.slides.internal.p332p7.C7635f4;
import com.aspose.slides.internal.p332p7.C7693fr;
import com.aspose.slides.internal.p332p7.C7718g1;
import com.aspose.slides.internal.p332p7.C7720g2;
import com.aspose.slides.internal.p332p7.C7743gb;
import com.aspose.slides.internal.p332p7.C7945io;
import com.aspose.slides.internal.p332p7.C7972j1;
import com.aspose.slides.internal.p332p7.C8001jh;
import com.aspose.slides.internal.p332p7.C8066ka;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8207lr;
import com.aspose.slides.internal.p332p7.C8578q5;
import com.aspose.slides.internal.p332p7.C8638qy;
import com.aspose.slides.internal.p332p7.C8670re;
import com.aspose.slides.internal.p332p7.C8673rg;
import com.aspose.slides.internal.p332p7.C8689rn;
import com.aspose.slides.internal.p332p7.C8820sx;
import com.aspose.slides.internal.p332p7.C8828t1;
import com.aspose.slides.internal.p332p7.C8845t9;
import com.aspose.slides.internal.p332p7.C8875tk;
import com.aspose.slides.internal.p332p7.C8952ug;
import com.aspose.slides.internal.p332p7.C8954ui;
import com.aspose.slides.internal.p332p7.C8958uj;
import com.aspose.slides.internal.p332p7.C8985uy;
import com.aspose.slides.internal.p332p7.C9027vd;
import com.aspose.slides.internal.p332p7.C9230xs;
import com.aspose.slides.internal.p332p7.C9401zt;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.AbstractC11796qk;
import com.aspose.slides.internal.p464vq.AbstractC11812sq;
import com.aspose.slides.internal.p464vq.C11701ai;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11712bs;
import com.aspose.slides.internal.p464vq.C11723d3;
import com.aspose.slides.internal.p464vq.C11784ne;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11804ri;
import com.aspose.slides.internal.p505xn.C12577yj;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ko */
/* JADX INFO: loaded from: classes3.dex */
class C13741ko {

    /* JADX INFO: renamed from: k4 */
    private static C12577yj<Integer, k4> f45800k4;

    /* JADX INFO: renamed from: x1 */
    private static final Object f45802x1 = new Object();

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f45801kk = new C7017h4("areaChart", "area3DChart", "lineChart", "line3DChart", "stockChart", "radarChart", "scatterChart", "pieChart", "pie3DChart", "doughnutChart", "barChart", "bar3DChart", "ofPieChart", "surfaceChart", "surface3DChart", "bubbleChart");

    /* JADX INFO: renamed from: com.aspose.slides.ko$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private final int f45818k4;

        /* JADX INFO: renamed from: kk */
        private final int f45819kk;

        /* JADX INFO: renamed from: to */
        private List<Integer> f45820to;

        /* JADX INFO: renamed from: x1 */
        private final int f45821x1;

        public k4(int i, int i2, int i3) {
            this.f45818k4 = i;
            this.f45821x1 = i2;
            this.f45819kk = i3;
            List<Integer> list = new List<>();
            this.f45820to = list;
            list.addItem(Integer.valueOf(i3));
        }

        /* JADX INFO: renamed from: k4 */
        public final int m64083k4() {
            return this.f45818k4;
        }

        /* JADX INFO: renamed from: kk */
        public final int m64085kk() {
            return this.f45819kk;
        }

        /* JADX INFO: renamed from: x1 */
        public final int m64086x1() {
            return this.f45821x1;
        }

        public k4(int i, int i2, int i3, List<Integer> list) {
            this.f45818k4 = i;
            this.f45821x1 = i2;
            this.f45819kk = i3;
            List<Integer> list2 = new List<>(list);
            this.f45820to = list2;
            if (list2.containsItem(Integer.valueOf(i3))) {
                return;
            }
            this.f45820to.addItem(Integer.valueOf(i3));
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m64084k4(int i) {
            return i == this.f45819kk || this.f45820to.containsItem(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m64054k4(int i, AbstractC9120wl abstractC9120wl) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 25:
            case 28:
            case 31:
            case 32:
            case 34:
            case 35:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
                return i;
            case 3:
            case 7:
            case 11:
            case 15:
                return 3;
            case 4:
            case 8:
            case 12:
            case 16:
                return 4;
            case 5:
            case 9:
            case 13:
            case 17:
                return 5;
            case 6:
            case 10:
            case 14:
            case 18:
                return 6;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                int i2 = 19;
                if (i != 19 && i != 22) {
                    i2 = 20;
                    if (i != 20 && i != 23) {
                        i2 = 21;
                        if (i != 21 && i != 24) {
                            throw new Exception();
                        }
                    }
                }
                return i2;
            case 26:
            case 29:
                return 26;
            case 27:
            case 30:
                return 27;
            case 33:
            case 38:
            case 41:
            case 44:
                return 33;
            case 36:
            case 39:
            case 42:
            case 45:
                return 36;
            case 37:
            case 40:
            case 43:
            case 46:
                return 37;
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return 57;
            case 66:
            case 67:
                return 66;
            case 68:
            case 69:
                return abstractC9120wl.mo39412ak() != null ? abstractC9120wl.mo39412ak().m41467k4() ? 69 : 68 : i;
            case 70:
            case 71:
            case 72:
                if (i == 72) {
                    return i;
                }
                return 70;
            default:
                throw new Exception();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m64070x1(IChart iChart, C8207lr c8207lr, gnb gnbVar) {
        C11709bg c11709bgM55303k4;
        C0907dn c0907dnMo268du = ((Chart) iChart).mo268du();
        if (c8207lr.m36390u4() == null || (c11709bgM55303k4 = gnbVar.m55338u4().m55303k4(c0907dnMo268du.m5168jd().m36350x1())) == null) {
            return;
        }
        c0907dnMo268du.m5169k4(c11709bgM55303k4.m55294m9());
        c0907dnMo268du.m5187x1(c11709bgM55303k4.m55292k4());
        c0907dnMo268du.m5181kk(c11709bgM55303k4.m55291h4());
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03e7  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m64055k4(C8578q5 c8578q5, int i, int[] iArr) {
        boolean z;
        int i2 = 0;
        iArr[0] = 0;
        C7394ca c7394ca = c8578q5.m39344du().get_Item(i);
        int i3 = 2;
        switch (f45801kk.m27428k4(c7394ca.m29539k4())) {
            case 0:
                C8958uj c8958uj = (C8958uj) c7394ca.m29542x1();
                int i4 = (c8958uj.m42429g8() == null || c8958uj.m42429g8().m43838k4() != 3) ? (c8958uj.m42429g8() == null || c8958uj.m42429g8().m43838k4() != 1) ? 47 : 49 : 48;
                if (c8958uj.m42429g8() != null) {
                    iArr[0] = c8958uj.m42429g8().m43838k4();
                }
                return i4;
            case 1:
                C9230xs c9230xs = (C9230xs) c7394ca.m29542x1();
                int i5 = (c9230xs.m44624g8() == null || c9230xs.m44624g8().m43838k4() != 3) ? (c9230xs.m44624g8() == null || c9230xs.m44624g8().m43838k4() != 1) ? 50 : 52 : 51;
                if (c9230xs.m44624g8() != null) {
                    iArr[0] = c9230xs.m44624g8().m43838k4();
                }
                return i5;
            case 2:
                C8954ui c8954ui = (C8954ui) c7394ca.m29542x1();
                for (AbstractC9120wl abstractC9120wl : c8954ui.mo28526x1()) {
                    if (abstractC9120wl.aF_() == null || (abstractC9120wl.aF_() != null && abstractC9120wl.aF_().m38347to() != null && abstractC9120wl.aF_().m38347to().m28719k4() != 4)) {
                        z = true;
                        int i6 = 19;
                        if (c8954ui.m42399qm() != null) {
                            return 19;
                        }
                        if (c8954ui.m42399qm().m43838k4() == 2) {
                            if (z || (c8954ui.mo42398bz() != null && c8954ui.mo42398bz().m41467k4())) {
                                i6 = 22;
                            }
                        } else if (c8954ui.m42399qm().m43838k4() == 3) {
                            i6 = z ? 23 : 20;
                        } else if (c8954ui.m42399qm().m43838k4() == 1) {
                            i6 = z ? 24 : 21;
                        }
                        if (c8954ui.m42399qm() != null) {
                            iArr[0] = c8954ui.m42399qm().m43838k4();
                        }
                        return i6;
                    }
                }
                z = false;
                int i62 = 19;
                if (c8954ui.m42399qm() != null) {
                }
                break;
            case 3:
                C7972j1 c7972j1 = (C7972j1) c7394ca.m29542x1();
                if (c7972j1.m34547qm().m43838k4() != 2) {
                    throw new NotImplementedException();
                }
                if (c7972j1.m34547qm() != null) {
                    iArr[0] = c7972j1.m34547qm().m43838k4();
                }
                return 25;
            case 4:
                return 58;
            case 5:
                C8673rg c8673rg = (C8673rg) c7394ca.m29542x1();
                if (c8673rg.mo39985fa().m36205k4() == 3) {
                    return 72;
                }
                return c8673rg.mo39985fa().m36205k4() == 2 ? 71 : 70;
            case 6:
                C7743gb c7743gb = (C7743gb) c7394ca.m29542x1();
                if (c7743gb.mo32389xk().m41079k4() != 3 && c7743gb.mo32389xk().m41079k4() != 2 && c7743gb.mo32389xk().m41079k4() != 4) {
                    return (c7743gb.mo28526x1().length <= 0 || c7743gb.mo28526x1()[0].aF_() == null || c7743gb.mo28526x1()[0].aF_().m38347to() == null || c7743gb.mo28526x1()[0].aF_().m38347to().m28719k4() != 4) ? 54 : 55;
                }
                if (c7743gb.mo28526x1().length <= 0 || c7743gb.mo28526x1()[0].aF_() == null || c7743gb.mo28526x1()[0].aF_().m38347to() == null || c7743gb.mo28526x1()[0].aF_().m38347to().m28719k4() != 4) {
                    return (c7743gb.mo28526x1().length <= 0 || c7743gb.mo28526x1()[0].mo30765kk() == null || c7743gb.mo28526x1()[0].mo30765kk().m35368c5() == null || c7743gb.mo28526x1()[0].mo30765kk().m35368c5().m42635m9() == null || !"noFill".equals(c7743gb.mo28526x1()[0].mo30765kk().m35368c5().m42635m9().m29539k4())) ? 56 : 53;
                }
                return 57;
            case 7:
                AbstractC9120wl[] abstractC9120wlArrMo28526x1 = ((C7591eq) c7394ca.m29542x1()).mo28526x1();
                int length = abstractC9120wlArrMo28526x1.length;
                while (i2 < length) {
                    if (abstractC9120wlArrMo28526x1[i2].mo36036lr() != null) {
                        return 29;
                    }
                    i2++;
                }
                return 26;
            case 8:
                AbstractC9120wl[] abstractC9120wlArrMo28526x12 = ((C7693fr) c7394ca.m29542x1()).mo28526x1();
                int length2 = abstractC9120wlArrMo28526x12.length;
                while (i2 < length2) {
                    if (abstractC9120wlArrMo28526x12[i2].mo36036lr() != null) {
                        return 30;
                    }
                    i2++;
                }
                return 27;
            case 9:
                C8689rn c8689rn = (C8689rn) c7394ca.m29542x1();
                return (c8689rn.mo28526x1().length <= 0 || c8689rn.mo28526x1()[0].mo36036lr() == null) ? 66 : 67;
            case 10:
                C7945io c7945io = (C7945io) c7394ca.m29542x1();
                int i7 = 34;
                if (c7945io.aw_().m35985k4() == 1 && (c7945io.m34345sv() == null || c7945io.m34345sv().m32205k4() != 2)) {
                    if (c7945io.m34345sv() != null && c7945io.m34345sv().m32205k4() == 4) {
                        i7 = 35;
                    } else if (c7945io.m34345sv() != null && c7945io.m34345sv().m32205k4() == 1) {
                        i7 = 32;
                    }
                }
                if (c7945io.aw_().m35985k4() != 2) {
                    i3 = i7;
                } else if (c7945io.m34345sv() != null && c7945io.m34345sv().m32205k4() == 2) {
                    i3 = 0;
                } else if (c7945io.m34345sv() != null && c7945io.m34345sv().m32205k4() == 4) {
                    i3 = 1;
                } else if (c7945io.m34345sv() == null || c7945io.m34345sv().m32205k4() != 1) {
                }
                if (c7945io.m34345sv() != null) {
                    iArr[0] = c7945io.m34345sv().m32205k4();
                }
                return i3;
            case 11:
                C7635f4 c7635f4 = (C7635f4) c7394ca.m29542x1();
                int iIntValue = c7635f4.aw_().m35985k4() == 1 ? 33 : 3;
                int iM32205k4 = c7635f4.m31607g8() != null ? c7635f4.m31607g8().m32205k4() : 3;
                IGenericEnumerator<KeyValuePair<TKey, TValue>> it = m64057k4().iterator();
                while (true) {
                    try {
                        if (it.hasNext()) {
                            KeyValuePair keyValuePair = (KeyValuePair) it.next();
                            int iM35219k4 = c7635f4.mo31605c6() != null ? c7635f4.mo31605c6().m35219k4() : C8066ka.f25531k4;
                            if (c7635f4.aw_().m35985k4() == ((k4) keyValuePair.getValue()).m64083k4() && iM32205k4 == ((k4) keyValuePair.getValue()).m64086x1() && ((k4) keyValuePair.getValue()).m64084k4(iM35219k4)) {
                                iIntValue = ((Integer) keyValuePair.getKey()).intValue();
                                break;
                            }
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
                if (c7635f4.m31607g8() != null) {
                    iArr[0] = c7635f4.m31607g8().m32205k4();
                }
                return iIntValue;
            case 12:
                return ((C7275aw) c7394ca.m29542x1()).mo28509ck().m32946k4() == 1 ? 28 : 31;
            case 13:
                C9401zt c9401zt = (C9401zt) c7394ca.m29542x1();
                return (c9401zt.az_() == null || !c9401zt.az_().m41467k4()) ? 64 : 65;
            case 14:
                C8670re c8670re = (C8670re) c7394ca.m29542x1();
                return (c8670re.az_() == null || !c8670re.az_().m41467k4()) ? 62 : 63;
            case 15:
                C7720g2 c7720g2 = (C7720g2) c7394ca.m29542x1();
                return c7720g2.mo32251e0() != null ? c7720g2.mo32251e0().m41467k4() ? 69 : 68 : (c7720g2.mo28526x1().length <= 0 || c7720g2.mo28526x1()[0].mo39412ak() == null || !c7720g2.mo28526x1()[0].mo39412ak().m41467k4()) ? 68 : 69;
            default:
                throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394ca.m29539k4(), "\""));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m64056k4(String str, u8s u8sVar) {
        int iM71553ne = u8sVar.m71553ne();
        final String[] strArr = {C14113y2.m67408k4("/ppt/embeddings/Microsoft_Excel_Worksheet", C14057f9.m66591x1(iM71553ne), str)};
        return AbstractC14092to.m67253x1(u8sVar.mo4812qm().m55388c5(), new AbstractC14041ai<C11791os>() { // from class: com.aspose.slides.ko.7
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(C11791os c11791os) {
                return C14113y2.m67363du(c11791os.m55427x1(), strArr[0]);
            }
        }) == -1 ? iM71553ne : m64056k4(str, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static IGenericDictionary<Integer, k4> m64057k4() {
        synchronized (f45802x1) {
            try {
                if (f45800k4 == null) {
                    List list = new List();
                    list.addItem(0);
                    list.addItem(1);
                    list.addItem(2);
                    list.addItem(3);
                    list.addItem(4);
                    list.addItem(5);
                    C12577yj<Integer, k4> c12577yj = new C12577yj<>(Integer.class, k4.class);
                    f45800k4 = c12577yj;
                    c12577yj.addItem(4, new k4(2, 4, 0));
                    f45800k4.addItem(5, new k4(2, 1, 0));
                    f45800k4.addItem(7, new k4(2, 2, 3));
                    f45800k4.addItem(8, new k4(2, 4, 3));
                    f45800k4.addItem(9, new k4(2, 1, 3));
                    f45800k4.addItem(10, new k4(2, 3, 3));
                    f45800k4.addItem(11, new k4(2, 2, 1));
                    f45800k4.addItem(12, new k4(2, 4, 1));
                    f45800k4.addItem(13, new k4(2, 1, 1));
                    f45800k4.addItem(14, new k4(2, 3, 1));
                    f45800k4.addItem(15, new k4(2, 2, 4));
                    f45800k4.addItem(16, new k4(2, 4, 4));
                    f45800k4.addItem(17, new k4(2, 1, 4));
                    f45800k4.addItem(18, new k4(2, 3, 4));
                    f45800k4.addItem(33, new k4(1, 2, 0));
                    f45800k4.addItem(36, new k4(1, 4, 0));
                    f45800k4.addItem(37, new k4(1, 1, 0));
                    f45800k4.addItem(38, new k4(1, 2, 3));
                    f45800k4.addItem(39, new k4(1, 4, 3));
                    f45800k4.addItem(40, new k4(1, 1, 3));
                    f45800k4.addItem(41, new k4(1, 2, 1));
                    f45800k4.addItem(42, new k4(1, 4, 1));
                    f45800k4.addItem(44, new k4(1, 2, 4));
                    f45800k4.addItem(45, new k4(1, 4, 4));
                    f45800k4.addItem(46, new k4(1, 1, 4));
                    f45800k4.addItem(43, new k4(1, 1, 1));
                    f45800k4.addItem(3, new k4(2, 2, 0, list));
                    f45800k4.addItem(6, new k4(2, 3, 0, list));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f45800k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64058k4(IChart iChart, C8207lr c8207lr, bjs bjsVar) {
        iChart.setRoundedCorners(c8207lr.m36374fa() == null ? false : c8207lr.m36374fa().m41467k4());
        gnb gnbVarM4229k4 = bjsVar.m4229k4();
        bkf.m4241k4(iChart, c8207lr.m36391up());
        axn.m3766k4(iChart, c8207lr.m36386ne(), gnbVarM4229k4);
        C13691jl.m63398k4(iChart.getTextFormat(), c8207lr.m36376ix(), gnbVarM4229k4);
        C14576tt.m71303k4(iChart.getThemeManager(), gnbVarM4229k4);
        if (c8207lr.m36393wl() != null) {
            gnbVarM4229k4.m6786k4(true);
            new jlv(gnbVarM4229k4.m55338u4().m55303k4(c8207lr.m36393wl().m45299k4()).m55296x1(), gnbVarM4229k4).m63432k4(iChart, bjsVar);
            gnbVarM4229k4.m6786k4(false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64059k4(IChart iChart, C8207lr c8207lr, gnb gnbVar) {
        Chart chart = (Chart) iChart;
        C0907dn c0907dnMo268du = chart.mo268du();
        c0907dnMo268du.m5178k4(c8207lr.m36377jd() != null && c8207lr.m36377jd().m41467k4());
        c0907dnMo268du.m5177k4(c8207lr.m36371ck() == null ? null : c8207lr.m36371ck().m34960k4());
        c0907dnMo268du.m5172k4(c8207lr.m36384ks());
        c0907dnMo268du.m5173k4(c8207lr.m36388rv());
        c0907dnMo268du.m5176k4(c8207lr.m36392uz());
        C9027vd c9027vdM36396x6 = c8207lr.m36396x6();
        c0907dnMo268du.m5175k4(c9027vdM36396x6.m42952up());
        c0907dnMo268du.m5171k4(c8207lr.m36387qq());
        c0907dnMo268du.m5186x1(c9027vdM36396x6.m42948qq());
        C7351bv c7351bv = new C7351bv(c9027vdM36396x6.m42948qq());
        if (c7351bv.m29148k4() != null) {
            c0907dnMo268du.m5188x1(c7351bv.m29148k4().m41467k4());
        }
        C14349qj.m69669k4(chart, c8207lr.m36397yj());
        z8u.m74342k4(iChart, c9027vdM36396x6.m42957yj(), gnbVar);
        if (c8207lr.m36390u4() != null) {
            c0907dnMo268du.m5174k4(c8207lr.m36390u4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64060k4(IChart iChart, C8207lr c8207lr, com.aspose.slides.internal.p332p7.pij pijVar, C14786xh c14786xh) {
        m64061k4(iChart, c8207lr, c14786xh.m73359k4().m70580k4());
        m64065k4(iChart, pijVar, c14786xh.m73359k4());
        m64062k4(iChart, c8207lr, c14786xh);
        m64067k4(iChart, c8207lr.m36396x6().m42947ne(), c14786xh);
        m64069k4(iChart, c8207lr.m36396x6(), c14786xh.m73359k4().m70580k4());
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01cc A[PHI: r4
      0x01cc: PHI (r4v2 boolean) = (r4v0 boolean), (r4v3 boolean) binds: [B:71:0x01e7, B:66:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m64061k4(IChart iChart, final C8207lr c8207lr, u8s u8sVar) {
        C11709bg c11709bgM55311x1;
        String strM687m9;
        Chart chart = (Chart) iChart;
        C0907dn c0907dnMo268du = chart.mo268du();
        c8207lr.m36378k4().m41466k4(c0907dnMo268du.m5179k4());
        if (c0907dnMo268du.m5185x1() != null) {
            c8207lr.m36394x1().m34961k4(c0907dnMo268du.m5185x1());
        }
        c8207lr.m36379k4(c0907dnMo268du.m5180kk());
        c8207lr.m36395x1(c0907dnMo268du.m5183to());
        c8207lr.m36383kk(c0907dnMo268du.m5164du());
        final C9027vd c9027vdM36396x6 = c8207lr.m36396x6();
        c9027vdM36396x6.m42942k4(c0907dnMo268du.m5167h4());
        c8207lr.m36380k4(c0907dnMo268du.m5182m9());
        c9027vdM36396x6.m42943k4(c0907dnMo268du.m5162c5());
        C14349qj.m69668k4(chart, new AbstractC4685kk<C7341br>() { // from class: com.aspose.slides.ko.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8207lr) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.ChartSpaceElementData.AddClrMapOvr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7341br invoke() {
                return c8207lr.m36372du();
            }
        });
        z8u.m74343k4(iChart.getRotation3D(), new AbstractC4685kk<C7718g1>() { // from class: com.aspose.slides.ko.6
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9027vdM36396x6) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_ChartElementData.AddView3D()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7718g1 invoke() {
                return c9027vdM36396x6.m42944kk();
            }
        });
        ChartData chartData = (ChartData) iChart.getChartData();
        boolean z = false;
        boolean z2 = chartData.m553x1().mo5710kk() == 2;
        int iMo5712to = chartData.m553x1().mo5712to();
        AbstractC11812sq c11712bs = iMo5712to != 1 ? iMo5712to != 4 ? new C11712bs() : new C11701ai() : new C11804ri();
        c8207lr.m36381k4(c0907dnMo268du.m5168jd());
        if (c8207lr.m36390u4() == null) {
            c8207lr.m36373dy();
        }
        if (c0907dnMo268du.m5163ck() != 1) {
            if (z2) {
                strM687m9 = ((ChartDataWorkbook) chartData.getChartDataWorkbook()).m687m9();
            } else {
                int iMo5712to2 = chartData.m553x1().mo5712to();
                strM687m9 = iMo5712to2 != 1 ? iMo5712to2 != 4 ? ".xlsx" : ".xlsb" : ".xlsm";
            }
            C11791os c11791osM55394k4 = u8sVar.mo4812qm().m55394k4(C14113y2.m67408k4("/ppt/embeddings/Microsoft_Excel_Worksheet", C14057f9.m66591x1(m64056k4(strM687m9, u8sVar)), strM687m9), (AbstractC11760jd.k4) null, c11712bs);
            ett ettVarM553x1 = chartData.m553x1();
            if (z2) {
                c11791osM55394k4.m55423k4(ettVarM553x1.mo5701du().toArray());
            } else {
                c11791osM55394k4.m55423k4(ettVarM553x1.mo5702dy().toArray());
            }
            c11709bgM55311x1 = u8sVar.m55433g8().m55311x1(c11791osM55394k4);
        } else {
            if (c0907dnMo268du.m5184up() == null) {
                c0907dnMo268du.m5181kk(AbstractC11796qk.f39831k4.m55382k4());
            }
            String strM3658k4 = C0754al.m3658k4(chartData.m553x1().mo5703h4());
            C11709bg c11709bgM55305k4 = u8sVar.m55433g8().m55305k4(c0907dnMo268du.m5184up(), C14113y2.m67448x1(strM3658k4, "file:///") ? C14113y2.m67401k4(strM3658k4, " ", "%20") : strM3658k4, (byte) 1);
            if (z2 && C14113y2.m67448x1(strM3658k4, "file:///")) {
                C3126c5 c3126c5 = new C3126c5(C14113y2.m67401k4(strM3658k4, "file:///", C14113y2.f47374k4));
                if (c3126c5.m13333k4()) {
                    byte[] array = ((ChartData) iChart.getChartData()).m549k4().toArray();
                    c3126c5.m13335to();
                    C3130fa c3130fa = new C3130fa(c3126c5.m13430h4(), 1);
                    try {
                        c3130fa.write(array, 0, array.length);
                    } finally {
                        c3130fa.dispose();
                    }
                }
            }
            c11709bgM55311x1 = c11709bgM55305k4;
        }
        if (c8207lr.m36390u4() != null) {
            c8207lr.m36390u4().m36348k4(c11709bgM55311x1.m55289du());
        }
        if (c11709bgM55311x1.m55294m9() == 1) {
            if (c0907dnMo268du.m5168jd() != null) {
                if (c0907dnMo268du.m5168jd().m36349kk() != null && c0907dnMo268du.m5168jd().m36349kk().m41467k4()) {
                    z = true;
                }
                if (c8207lr.m36390u4().m36349kk() == null) {
                    c8207lr.m36390u4().m36347k4();
                }
            } else if (c8207lr.m36390u4().m36349kk() == null) {
            }
            c8207lr.m36390u4().m36349kk().m41466k4(z);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64062k4(IChart iChart, final C8207lr c8207lr, C14786xh c14786xh) {
        final u8s u8sVarM70580k4 = c14786xh.m73359k4().m70580k4();
        c8207lr.m36382kk().m41466k4(iChart.hasRoundedCorners());
        bkf.m4242x1(iChart, c8207lr.m36389to());
        if (iChart.getFillFormat().getFillType() != -1 || !iChart.getLineFormat().isFormatNotDefined() || !iChart.getEffectFormat().isNoEffects() || b6z.m4035k4(iChart.getThreeDFormat(), true)) {
            final C8087kh c8087khM36375h4 = c8207lr.m36375h4();
            C1169h1.m6956k4(iChart.getFillFormat(), new C7394ca.k4() { // from class: com.aspose.slides.ko.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    new StringBuilder();
                    C8087kh c8087kh = c8087khM36375h4;
                    return StringBuffer.toString();
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c8087khM36375h4.m35390x1(str);
                }
            }, u8sVarM70580k4);
            euh.m5726k4(iChart.getLineFormat(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.ko.8
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    new StringBuilder();
                    C8087kh c8087kh = c8087khM36375h4;
                    return StringBuffer.toString();
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8985uy invoke() {
                    return c8087khM36375h4.m35391x1();
                }
            });
            C1158gq.m6877k4(iChart.getEffectFormat(), new C7394ca.k4() { // from class: com.aspose.slides.ko.9
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    new StringBuilder();
                    C8087kh c8087kh = c8087khM36375h4;
                    return StringBuffer.toString();
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c8087khM36375h4.m35375k4(str);
                }
            }, u8sVarM70580k4);
            b6z.m4032k4(iChart.getThreeDFormat(), new AbstractC4685kk<C8820sx>() { // from class: com.aspose.slides.ko.10
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    new StringBuilder();
                    C8087kh c8087kh = c8087khM36375h4;
                    return StringBuffer.toString();
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8820sx invoke() {
                    return c8087khM36375h4.m35385kk();
                }
            }, new AbstractC4685kk<C8638qy>() { // from class: com.aspose.slides.ko.11
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    new StringBuilder();
                    C8087kh c8087kh = c8087khM36375h4;
                    return StringBuffer.toString();
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8638qy invoke() {
                    return c8087khM36375h4.m35388to();
                }
            }, (AbstractC4685kk<C7317be>) null);
        }
        C13691jl.m63395k4(iChart.getTextFormat(), new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.ko.12
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8207lr) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.ChartSpaceElementData.AddTxPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8952ug invoke() {
                return c8207lr.m36385m9();
            }
        }, u8sVarM70580k4);
        C14576tt.m71304k4(iChart.getThemeManager(), u8sVarM70580k4.m55433g8(), u8sVarM70580k4);
        if (iChart.getUserShapes() == null || iChart.getUserShapes().getShapes().size() <= 0) {
            return;
        }
        C11791os c11791osM55394k4 = u8sVarM70580k4.mo4812qm().m55394k4("/ppt/drawings/drawing{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.ko.13
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return C22209OooOo0O.OooO00o(u8sVarM70580k4, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextDrawingFileNumber()");
            }

            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
            /* JADX INFO: renamed from: k4 */
            public int mo5039k4() {
                return u8sVarM70580k4.m71524bv();
            }
        }, new C11784ne());
        new jlv(c11791osM55394k4, u8sVarM70580k4).m63433k4(iChart, c14786xh);
        c8207lr.m36370c5().m45300k4(u8sVarM70580k4.m55433g8().m55311x1(c11791osM55394k4).m55289du());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64063k4(IChart iChart, com.aspose.slides.internal.p332p7.pij pijVar, bjs bjsVar) {
        gnb gnbVarM4229k4 = bjsVar.m4229k4();
        C11723d3 c11723d3M55338u4 = gnbVarM4229k4.m55338u4();
        gnbVarM4229k4.m55337k4(bjsVar.m4235kk());
        C14297pp.m69181k4(iChart, pijVar, bjsVar);
        gnbVarM4229k4.m55337k4(c11723d3M55338u4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64064k4(IChart iChart, com.aspose.slides.internal.p332p7.pij pijVar, C8207lr c8207lr, C14144mu c14144mu) {
        if (c8207lr == null) {
            return;
        }
        m64059k4(iChart, c8207lr, c14144mu.m67731k4().m4229k4());
        m64070x1(iChart, c8207lr, c14144mu.m67731k4().m4229k4());
        m64063k4(iChart, pijVar, c14144mu.m67731k4());
        m64058k4(iChart, c8207lr, c14144mu.m67731k4());
        m64066k4(iChart, c8207lr.m36396x6().m42947ne(), c14144mu);
        m64068k4(iChart, c8207lr.m36396x6(), c14144mu.m67731k4().m4229k4());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64065k4(IChart iChart, com.aspose.slides.internal.p332p7.pij pijVar, sdp sdpVar) {
        u8s u8sVarM70580k4 = sdpVar.m70580k4();
        C11723d3 c11723d3M55433g8 = u8sVarM70580k4.m55433g8();
        u8sVarM70580k4.m55434k4(sdpVar.m70583kk());
        C14297pp.m69182k4(iChart, pijVar, sdpVar.m70580k4());
        u8sVarM70580k4.m55434k4(c11723d3M55433g8);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64066k4(IChart iChart, C8578q5 c8578q5, C14144mu c14144mu) {
        gnb gnbVarM4229k4 = c14144mu.m67731k4().m4229k4();
        C13816m0.m64658k4(iChart, c8578q5.m39351m9(), gnbVarM4229k4);
        C14211o1.m68297k4(iChart.getPlotArea(), c8578q5, gnbVarM4229k4);
        oen.m68491k4(iChart, gnbVarM4229k4, c8578q5, null);
        C14430s2.m70428k4(iChart.getChartData(), c8578q5, c14144mu);
        C14350qk.m69684k4(iChart.getAxes(), c8578q5, c14144mu);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64067k4(IChart iChart, final C8578q5 c8578q5, C14786xh c14786xh) {
        u8s u8sVarM70580k4 = c14786xh.m73359k4().m70580k4();
        C13816m0.m64657k4(iChart, new AbstractC4685kk<C8875tk>() { // from class: com.aspose.slides.ko.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8578q5) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_PlotAreaElementData.AddDTable()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8875tk invoke() {
                return c8578q5.m39354x1();
            }
        }, u8sVarM70580k4);
        C14211o1.m68298k4(iChart.getPlotArea(), c8578q5, u8sVarM70580k4);
        C14350qk.m69686k4(iChart, c8578q5, u8sVarM70580k4);
        C14430s2.m70426k4(iChart, c8578q5, c14786xh);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m64068k4(IChart iChart, C9027vd c9027vd, gnb gnbVar) {
        C13725ke.m63776k4(iChart.getChartTitle(), c9027vd.m42934ck(), gnbVar);
        if (c9027vd.m42934ck() == null) {
            String strM725jd = iChart.getChartData().getSeries().size() > 0 ? ((ChartData) iChart.getChartData()).m553x1().mo5710kk() != 2 ? ((ChartSeries) iChart.getChartData().getSeries().get_Item(0)).m725jd() : iChart.getChartData().getSeries().get_Item(0).getName().toString() : null;
            if (c9027vd.m42937fa() != null && !c9027vd.m42937fa().m41467k4() && iChart.getChartData().getSeries().size() == 1 && !C14113y2.m67411k4(strM725jd)) {
                iChart.setTitle(true);
            }
        }
        C14834y5.m73746k4(iChart.getFloor(), c9027vd.m42945ks(), gnbVar);
        C14834y5.m73746k4(iChart.getBackWall(), c9027vd.m42956x6(), gnbVar);
        C14834y5.m73746k4(iChart.getSideWall(), c9027vd.m42949rv(), gnbVar);
        zk1.m74554k4(iChart, c9027vd.m42939ix(), gnbVar);
        if (c9027vd.m42951u4() != null) {
            iChart.setPlotVisibleCellsOnly(c9027vd.m42951u4().m41467k4());
        }
        if (c9027vd.m42953uz() != null) {
            iChart.setDisplayBlanksAs(c9027vd.m42953uz().m39642k4());
        }
        if (c9027vd.m42954wl() != null) {
            iChart.setShowDataLabelsOverMaximum(c9027vd.m42954wl().m41467k4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64069k4(IChart iChart, final C9027vd c9027vd, u8s u8sVar) {
        C8828t1 c8828t1M42955x1;
        boolean z;
        if (iChart.hasTitle()) {
            C13725ke.m63777k4(iChart.getChartTitle(), c9027vd.m42941k4(), u8sVar);
            c8828t1M42955x1 = c9027vd.m42955x1();
            z = false;
        } else {
            c8828t1M42955x1 = c9027vd.m42955x1();
            z = true;
        }
        c8828t1M42955x1.m41466k4(z);
        C14834y5.m73745k4(iChart.getFloor(), new AbstractC4685kk<C8001jh>() { // from class: com.aspose.slides.ko.14
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9027vd) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_ChartElementData.AddFloor()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8001jh invoke() {
                return c9027vd.m42950to();
            }
        }, u8sVar);
        C14834y5.m73745k4(iChart.getBackWall(), new AbstractC4685kk<C8001jh>() { // from class: com.aspose.slides.ko.15
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9027vd) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_ChartElementData.AddBackWall()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8001jh invoke() {
                return c9027vd.m42938h4();
            }
        }, u8sVar);
        C14834y5.m73745k4(iChart.getSideWall(), new AbstractC4685kk<C8001jh>() { // from class: com.aspose.slides.ko.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9027vd) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_ChartElementData.AddSideWall()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8001jh invoke() {
                return c9027vd.m42935du();
            }
        }, u8sVar);
        zk1.m74553k4(iChart, new AbstractC4685kk<C8845t9>() { // from class: com.aspose.slides.ko.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9027vd) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_ChartElementData.AddLegend()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8845t9 invoke() {
                return c9027vd.m42946m9();
            }
        }, u8sVar);
        c9027vd.m42936dy().m41466k4(iChart.getPlotVisibleCellsOnly());
        c9027vd.m42933c5().m39643k4(iChart.getDisplayBlanksAs());
        c9027vd.m42940jd().m41466k4(iChart.getShowDataLabelsOverMaximum());
    }
}
