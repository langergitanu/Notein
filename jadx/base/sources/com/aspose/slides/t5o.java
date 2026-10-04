package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.tx9;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class t5o {
    /* JADX INFO: renamed from: k4 */
    public static boolean m70967k4(InterfaceC0901dh interfaceC0901dh) {
        if (interfaceC0901dh.mo5100x1().mo6272k4().getType() <= 0) {
            return false;
        }
        if (interfaceC0901dh.mo5098k4()) {
            return true;
        }
        IGenericEnumerator<InterfaceC14342qd> it = interfaceC0901dh.mo5099kk().iterator();
        while (it.hasNext()) {
            try {
                InterfaceC14342qd next = it.next();
                r7c r7cVar = (r7c) C7019kk.m27452k4((Object) next, r7c.class);
                if (!C14113y2.m67411k4(next.mo4792k4()) || (r7cVar != null && C7019kk.m27469x1(r7cVar.f48542kk, MathPortion.class))) {
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T extends InterfaceC0901dh> String[] m70968k4(IGenericEnumerable<T> iGenericEnumerable, int i, boolean z) {
        String strMo64221x1;
        String[] strArr = new String[i];
        int[] iArr = new int[10];
        InterfaceC0901dh[] interfaceC0901dhArr = new InterfaceC0901dh[10];
        IGenericEnumerator<T> it = iGenericEnumerable.iterator();
        T t = null;
        int i2 = 0;
        while (it.hasNext()) {
            try {
                T next = it.next();
                InterfaceC1134g7 interfaceC1134g7Mo5100x1 = next.mo5100x1();
                if (m70967k4(next)) {
                    byte type = interfaceC1134g7Mo5100x1.mo6272k4().getType();
                    if (type == 1) {
                        strMo64221x1 = interfaceC1134g7Mo5100x1.mo6272k4().mo64221x1();
                        if (z && strMo64221x1.length() > 1 && !C14117yj.m67514du(strMo64221x1.charAt(0))) {
                            strMo64221x1 = C14113y2.m67389k4(strMo64221x1.charAt(0), 1);
                        }
                    } else if (type != 2) {
                        strMo64221x1 = null;
                    } else {
                        InterfaceC0901dh interfaceC0901dh = interfaceC0901dhArr[interfaceC1134g7Mo5100x1.mo6278x1()];
                        if (interfaceC0901dh != null && m70967k4(interfaceC0901dh) && ((t == null || interfaceC1134g7Mo5100x1.mo6278x1() <= t.mo5100x1().mo6278x1()) && interfaceC0901dh.mo5100x1().mo6272k4().mo64218k4() && 2 == interfaceC0901dh.mo5100x1().mo6272k4().getType() && interfaceC1134g7Mo5100x1.mo6272k4().getNumberedBulletStyle() == interfaceC0901dh.mo5100x1().mo6272k4().getNumberedBulletStyle() && interfaceC1134g7Mo5100x1.mo6272k4().getNumberedBulletStartWith() == interfaceC0901dh.mo5100x1().mo6272k4().getNumberedBulletStartWith())) {
                            short sMo6278x1 = interfaceC1134g7Mo5100x1.mo6278x1();
                            iArr[sMo6278x1] = iArr[sMo6278x1] + 1;
                        } else {
                            iArr[interfaceC1134g7Mo5100x1.mo6278x1()] = interfaceC1134g7Mo5100x1.mo6272k4().getNumberedBulletStartWith();
                        }
                        C6765kp c6765kp = new C6765kp();
                        tx9.AbstractC14608k4 abstractC14608k4M71403kk = tx9.m71403kk();
                        byte numberedBulletStyle = interfaceC1134g7Mo5100x1.mo6272k4().getNumberedBulletStyle();
                        if (numberedBulletStyle < 0) {
                            numberedBulletStyle = 3;
                        }
                        if (numberedBulletStyle < tx9.m71419x1().length) {
                            abstractC14608k4M71403kk = tx9.m71419x1()[numberedBulletStyle];
                        }
                        if (numberedBulletStyle < tx9.m71402k4().length) {
                            c6765kp.m26796k4(tx9.m71402k4()[numberedBulletStyle], abstractC14608k4M71403kk.mo71423k4(iArr[interfaceC1134g7Mo5100x1.mo6278x1()]));
                        } else {
                            c6765kp.m26792k4(abstractC14608k4M71403kk.mo71423k4(iArr[interfaceC1134g7Mo5100x1.mo6278x1()]));
                        }
                        strMo64221x1 = c6765kp.toString();
                    }
                    interfaceC0901dhArr[interfaceC1134g7Mo5100x1.mo6278x1()] = next;
                } else {
                    if (interfaceC1134g7Mo5100x1.mo6272k4().getType() == 0) {
                        interfaceC0901dhArr[interfaceC1134g7Mo5100x1.mo6278x1()] = null;
                    }
                    strMo64221x1 = null;
                }
                strArr[i2] = strMo64221x1;
                i2++;
                t = next;
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
        return strArr;
    }
}
