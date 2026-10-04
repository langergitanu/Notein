package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.s0 */
/* JADX INFO: loaded from: classes3.dex */
class C14425s0 {
    /* JADX INFO: renamed from: k4 */
    public static byte m70397k4(InterfaceC14631uf interfaceC14631uf, nrw nrwVar) {
        int iM70034x1 = interfaceC14631uf.mo6446k4().m70034x1() + interfaceC14631uf.mo6444h4();
        byte[] bArrM68191h4 = nrwVar.m68191h4();
        if (iM70034x1 < bArrM68191h4.length) {
            return bArrM68191h4[iM70034x1];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m70403kk(InterfaceC14631uf interfaceC14631uf, nrw nrwVar) {
        return m70405x1(m70397k4(interfaceC14631uf, nrwVar));
    }

    /* JADX INFO: renamed from: to */
    public static byte m70404to(InterfaceC14631uf interfaceC14631uf, nrw nrwVar) {
        return (byte) (((m70397k4(interfaceC14631uf, nrwVar) & 255) >> 4) & 3);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m70405x1(byte b) {
        return (b & 2) != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static dm1 m70398k4(nrw nrwVar, InterfaceC14631uf interfaceC14631uf, InterfaceC14631uf interfaceC14631uf2, C14214o4 c14214o4) {
        return m70399k4(nrwVar, new InterfaceC14631uf[]{interfaceC14631uf}, interfaceC14631uf2, c14214o4).Clone();
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m70406x1(InterfaceC14631uf interfaceC14631uf, nrw nrwVar) {
        return m70401k4(m70397k4(interfaceC14631uf, nrwVar));
    }

    /* JADX INFO: renamed from: k4 */
    public static dm1 m70399k4(nrw nrwVar, InterfaceC14631uf[] interfaceC14631ufArr, InterfaceC14631uf interfaceC14631uf, C14214o4 c14214o4) {
        InterfaceC14631uf interfaceC14631ufMo6449m9;
        nrw nrwVar2;
        C14214o4 c14214o42;
        if (interfaceC14631ufArr[0].mo6452x1(interfaceC14631uf)) {
            return new dm1("", c14214o4);
        }
        InterfaceC14631uf interfaceC14631uf2 = interfaceC14631ufArr[0];
        InterfaceC14631uf interfaceC14631ufMo6449m92 = interfaceC14631uf2;
        while (true) {
            if (C3047dy.m12855ix(interfaceC14631ufMo6449m92.mo6448kk())) {
                interfaceC14631ufMo6449m92 = interfaceC14631ufMo6449m92.mo6449m9();
            }
            interfaceC14631ufMo6449m9 = interfaceC14631ufMo6449m92.mo6449m9();
            nrwVar2 = nrwVar;
            InterfaceC14631uf interfaceC14631uf3 = interfaceC14631uf;
            c14214o42 = c14214o4;
            if (!m70402k4(nrwVar2, interfaceC14631ufMo6449m92, interfaceC14631ufMo6449m9, interfaceC14631ufArr[0], interfaceC14631uf3, c14214o42)) {
                break;
            }
            nrwVar = nrwVar2;
            interfaceC14631ufMo6449m92 = interfaceC14631ufMo6449m9;
            interfaceC14631uf = interfaceC14631uf3;
            c14214o4 = c14214o42;
        }
        InterfaceC14631uf interfaceC14631ufMo6443dy = interfaceC14631ufMo6449m9.mo6443dy();
        byte bM70404to = m70404to(interfaceC14631ufMo6443dy, nrwVar2);
        if ((bM70404to & 255) != 0 && (bM70404to & 1) != 0) {
            do {
                interfaceC14631ufMo6443dy = interfaceC14631ufMo6443dy.mo6449m9();
            } while ((m70404to(interfaceC14631ufMo6443dy, nrwVar2) & 1) != 0);
            interfaceC14631ufMo6449m9 = interfaceC14631ufMo6443dy.mo6449m9();
        }
        List list = new List();
        while (!interfaceC14631ufArr[0].mo6452x1(interfaceC14631ufMo6449m9)) {
            char cMo6448kk = interfaceC14631ufArr[0].mo6448kk();
            if (C3047dy.m12852dy(interfaceC14631ufArr[0].mo6448kk())) {
                if (interfaceC14631ufArr[0].mo6452x1(interfaceC14631ufMo6449m9.mo6443dy())) {
                    cMo6448kk = '-';
                } else {
                    interfaceC14631ufArr[0] = interfaceC14631ufArr[0].mo6449m9();
                }
            }
            if (C3047dy.m12885up(cMo6448kk) && !C3047dy.m12894x6(cMo6448kk)) {
                InterfaceC14631uf interfaceC14631ufMo6449m93 = interfaceC14631ufArr[0].mo6449m9();
                interfaceC14631ufArr[0] = interfaceC14631ufMo6449m93;
                if (interfaceC14631ufMo6449m93.mo6452x1(interfaceC14631ufMo6449m9)) {
                    break;
                }
                cMo6448kk = interfaceC14631ufArr[0].mo6448kk();
                if (C3047dy.m12885up(cMo6448kk)) {
                }
            }
            list.addItem(Character.valueOf(cMo6448kk));
            interfaceC14631ufArr[0] = interfaceC14631ufArr[0].mo6449m9();
        }
        char[] cArrM13093k4 = C3085sv.m13093k4((List<Character>) list);
        IGenericList iGenericListM67254x1 = AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) nrwVar2.m68191h4()));
        String strM67405k4 = C14113y2.m67405k4(cArrM13093k4);
        int iM70034x1 = interfaceC14631uf2.mo6446k4().m70034x1() + interfaceC14631uf2.mo6444h4();
        return new dm1(strM67405k4, C3047dy.m12859k4(cArrM13093k4, cArrM13093k4.length, iGenericListM67254x1, iM70034x1), C3047dy.m12860k4(C14113y2.m67365dy(strM67405k4), cArrM13093k4.length, (((Byte) iGenericListM67254x1.get_Item(iM70034x1)).byteValue() & 1) != 0), c14214o42);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m70400k4(InterfaceC14631uf interfaceC14631uf, InterfaceC14631uf interfaceC14631uf2) {
        if (interfaceC14631uf.mo6452x1(interfaceC14631uf2)) {
            return "";
        }
        List list = new List();
        while (interfaceC14631uf.mo6447k4(interfaceC14631uf2)) {
            list.addItem(Character.valueOf(interfaceC14631uf.mo6448kk()));
            interfaceC14631uf = interfaceC14631uf.mo6449m9();
        }
        return C14113y2.m67405k4(C3085sv.m13093k4((List<Character>) list));
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m70401k4(byte b) {
        return (b & 1) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m70402k4(nrw nrwVar, InterfaceC14631uf interfaceC14631uf, InterfaceC14631uf interfaceC14631uf2, InterfaceC14631uf interfaceC14631uf3, InterfaceC14631uf interfaceC14631uf4, C14214o4 c14214o4) {
        boolean z;
        if (!interfaceC14631uf2.mo6447k4(interfaceC14631uf4) || interfaceC14631uf2.mo6446k4().f48541k4.getSpacing() != interfaceC14631uf3.mo6446k4().f48541k4.getSpacing()) {
            return false;
        }
        boolean z2 = C3047dy.m12850du(interfaceC14631uf2.mo6442du()) == c14214o4.m68327h4() || (c14214o4.m68327h4() == 4 && (interfaceC14631uf2.mo6448kk() == 8205 || C3047dy.m12874kk((int) interfaceC14631uf2.mo6448kk())));
        if (c14214o4.m68332x1()) {
            char cMo6448kk = interfaceC14631uf.mo6448kk();
            if ((C14117yj.m67519h4(cMo6448kk) && C14117yj.m67517dy(cMo6448kk)) == (C14117yj.m67519h4(interfaceC14631uf2.mo6448kk()) && C14117yj.m67517dy(interfaceC14631uf2.mo6448kk()))) {
            }
        } else {
            z = !c14214o4.m68332x1() || c14214o4.m68329kk() == C14117yj.m67550yj(interfaceC14631uf2.mo6448kk());
        }
        return z2 && z && (m70406x1(interfaceC14631uf2, nrwVar) == c14214o4.m68330m9()) && !c14214o4.m68328k4();
    }
}
