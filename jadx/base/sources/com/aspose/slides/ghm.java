package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.internal.p172hu.AbstractC4687to;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ghm {

    /* JADX INFO: renamed from: k4 */
    static final Dictionary<String, i7n> f5250k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC14897zn f5251kk = null;

    /* JADX INFO: renamed from: x1 */
    private final Presentation f5252x1;

    static {
        Dictionary<String, i7n> dictionary = new Dictionary<>(AbstractC14070jw.m66790x1());
        f5250k4 = dictionary;
        dictionary.addItem("wingdings", new i7n(new int[]{0, 128, 256}, new float[]{Float.NaN, 0.5f, Float.NaN}));
        dictionary.addItem("wingdings 2", new i7n(new int[]{0, 128, 256}, new float[]{Float.NaN, 0.5f, Float.NaN}));
        dictionary.addItem("wingdings 3", new i7n(new int[]{0, 128, 256}, new float[]{Float.NaN, 0.5f, Float.NaN}));
    }

    public ghm(Presentation presentation) {
        this.f5252x1 = presentation;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m6663k4(nrw nrwVar, float f, int[] iArr) {
        int i;
        fqc fqcVar = nrwVar.f47603k4;
        iArr[0] = 0;
        float defaultTabSize = fqcVar.getDefaultTabSize() <= 0.0f ? 1.0E-5f : fqcVar.getDefaultTabSize();
        float f2 = f % defaultTabSize;
        float fM67497to = (((double) f2) <= 1.0E-5d || ((double) (defaultTabSize - f2)) <= 0.1d || t5o.m70967k4(nrwVar)) ? f : (float) C14116yg.m67497to(f - 1.0E-4f);
        ITabEffectiveData[] tabs = fqcVar.getTabs();
        if (tabs.length > 0) {
            if (tabs[0].getPosition() == 0.0d && f == 0.0f) {
                i = 0;
            } else {
                i = 0;
                while (i < tabs.length && ((float) tabs[i].getPosition()) <= f + 1.0E-5f) {
                    i++;
                }
            }
            if (i < tabs.length) {
                ITabEffectiveData iTabEffectiveData = tabs[i];
                if (f < fqcVar.getMarginLeft() && iTabEffectiveData.getPosition() > fqcVar.getMarginLeft()) {
                    return fqcVar.getMarginLeft() - f;
                }
                iArr[0] = iTabEffectiveData.getAlignment();
                if (iTabEffectiveData.getPosition() == 0.0d && f == 0.0f) {
                    return Float.MIN_VALUE;
                }
                return (float) (iTabEffectiveData.getPosition() - ((double) f));
            }
            if (i == tabs.length) {
                ITabEffectiveData iTabEffectiveData2 = tabs[i - 1];
                double d = f;
                if (iTabEffectiveData2.getPosition() - d >= 0.001d || (C14116yg.m67475k4(iTabEffectiveData2.getPosition() - d) > 0.001d && C14116yg.m67497to(iTabEffectiveData2.getPosition()) >= C14116yg.m67497to(d))) {
                    return (float) (iTabEffectiveData2.getPosition() - d);
                }
            }
        }
        return f < fqcVar.getMarginLeft() ? fqcVar.getMarginLeft() - f : (((float) C14116yg.m67490kk((fM67497to / defaultTabSize) + 1.0f)) * defaultTabSize) - f;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m6667k4(nrw nrwVar, InterfaceC14631uf interfaceC14631uf, InterfaceC14631uf interfaceC14631uf2, C14251ot c14251ot, qy7 qy7Var, int i, boolean z, AbstractC4687to<InterfaceC14631uf, qy7> abstractC4687to, C14293pl[] c14293plArr) {
        C14293pl.f48090to.CloneTo(c14293plArr[0]);
        if (interfaceC14631uf.mo6442du() == 57346 && interfaceC14631uf.mo6450to() != null) {
            C14293pl c14293pl = new C14293pl();
            c14293plArr[0] = c14293pl;
            c14293pl.f48093x1 = interfaceC14631uf.mo6450to().f45757to.m69272x1().f5390x1.f49850x1;
            c14293plArr[0].f48091k4 = interfaceC14631uf.mo6450to().f45757to.m69272x1().f5390x1.m72912k4();
            return interfaceC14631uf.mo6450to().f45757to.m69272x1().f5389k4;
        }
        qy7 qy7VarInvoke = qy7Var;
        float fM56699x1 = 0.0f;
        InterfaceC14631uf interfaceC14631uf3 = interfaceC14631uf;
        while (true) {
            C14214o4 c14214o4 = new C14214o4(nrwVar, interfaceC14631uf3, c14251ot, z);
            int iMo6448kk = Integer.MIN_VALUE;
            if (interfaceC14631uf3.mo6446k4().m70034x1() + interfaceC14631uf3.mo6444h4() != i && i != Integer.MIN_VALUE) {
                iMo6448kk = interfaceC14631uf3.mo6443dy().mo6448kk();
            }
            int i2 = iMo6448kk;
            InterfaceC14631uf[] interfaceC14631ufArr = {interfaceC14631uf3};
            dm1 dm1VarClone = C14425s0.m70399k4(nrwVar, interfaceC14631ufArr, interfaceC14631uf2, c14214o4).Clone();
            InterfaceC14631uf interfaceC14631uf4 = interfaceC14631ufArr[0];
            if (qy7VarInvoke.m69921up() == 2) {
                dm1VarClone.m5155x1().CloneTo(dm1VarClone);
            }
            C14293pl c14293pl2 = new C14293pl();
            C14293pl[] c14293plArr2 = {c14293pl2};
            C12015qq c12015qqClone = m6670k4(dm1VarClone.f4610kk, c14251ot, qy7VarInvoke, true, i2, c14293plArr2).Clone();
            c14293plArr2[0].CloneTo(c14293pl2);
            C14293pl.m69131k4(c14293plArr[0].Clone(), c14293pl2.Clone()).CloneTo(c14293plArr[0]);
            fM56699x1 += c12015qqClone.m56699x1();
            if (!interfaceC14631uf4.mo6447k4(interfaceC14631uf2)) {
                return fM56699x1;
            }
            qy7VarInvoke = abstractC4687to.invoke(interfaceC14631uf4);
            interfaceC14631uf3 = interfaceC14631uf4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C12015qq m6664k4(AbstractC14897zn abstractC14897zn, String str, C14251ot c14251ot, qy7 qy7Var, boolean z, int i) {
        qy7 qy7VarCloneT;
        i7n i7nVar = null;
        if (qy7Var.m69912ne() != null) {
            i7n[] i7nVarArr = {null};
            f5250k4.tryGetValue(qy7Var.m69912ne(), i7nVarArr);
            i7nVar = i7nVarArr[0];
        }
        if (i7nVar == null || !z) {
            return abstractC14897zn.m74610k4(str, c14251ot, qy7Var, i);
        }
        C12015qq c12015qq = new C12015qq(0.0f, 0.0f);
        int i2 = 0;
        while (i2 < str.length()) {
            int[] iArr = {i2};
            String strM7540k4 = i7nVar.m7540k4(str, iArr);
            i2 = iArr[0];
            float fM7539k4 = i7nVar.m7539k4(strM7540k4.charAt(0)) * qy7Var.m69915rv();
            if (C14064he.m66715kk(fM7539k4)) {
                qy7VarCloneT = qy7Var;
            } else {
                qy7VarCloneT = qy7Var.cloneT();
                qy7VarCloneT.m69927x1(fM7539k4);
            }
            C12015qq c12015qqClone = abstractC14897zn.m74610k4(strM7540k4, c14251ot, qy7VarCloneT, i).Clone();
            c12015qq.m56695k4(c12015qqClone.m56699x1() + c12015qq.m56699x1());
            c12015qq.m56700x1(C14116yg.m67481k4(c12015qq.m56697kk(), c12015qqClone.m56697kk()));
        }
        return c12015qq;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m6668k4(String str, C14251ot c14251ot, qy7 qy7Var) {
        C14293pl c14293pl = new C14293pl();
        C14293pl[] c14293plArr = {c14293pl};
        C12015qq c12015qqClone = m6670k4(str, c14251ot, qy7Var, true, Integer.MIN_VALUE, c14293plArr).Clone();
        c14293plArr[0].CloneTo(c14293pl);
        return c12015qqClone;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m6669k4(String str, C14251ot c14251ot, qy7 qy7Var, int i) {
        return m6664k4(m6666k4(), str, c14251ot, qy7Var, true, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C12015qq m6670k4(String str, C14251ot c14251ot, qy7 qy7Var, boolean z, int i, C14293pl[] c14293plArr) {
        C0762at c0762at;
        float fM56699x1;
        int i2;
        int i3;
        qy7 qy7VarM3728k4;
        int i4;
        String strM67441x1;
        byte b;
        ghm ghmVar = this;
        qy7 qy7Var2 = qy7Var;
        List list = new List();
        List list2 = new List();
        String strM56527du = c14251ot.m68811k4().m56651x1().m56527du();
        String strM3815k4 = ay6.m3815k4(str, strM56527du);
        if (strM3815k4.length() > 0 && strM56527du.equalsIgnoreCase("Futura Medium")) {
            strM3815k4 = strM3815k4.replaceAll("…", "...");
        }
        float fM56699x12 = 0.0f;
        qy7 qy7Var3 = qy7Var2;
        int i5 = 0;
        int i6 = 0;
        C0762at c0762at2 = null;
        int i7 = 0;
        for (int length = strM3815k4.length(); i5 < length; length = i2) {
            boolean zM67515du = C14117yj.m67515du(strM3815k4, i5);
            int iM67525k4 = zM67515du ? C14117yj.m67525k4(strM3815k4.charAt(i5), strM3815k4.charAt(i5 + 1)) : strM3815k4.charAt(i5);
            float f = fM56699x12;
            if (C3047dy.f8970k4.containsItem(Character.valueOf((char) iM67525k4))) {
                int i8 = iM67525k4 & 3;
                if (i8 != 1) {
                    i3 = 1;
                    if (i8 != 2) {
                        int size = list.size();
                        if (size > 0) {
                            int i9 = size - 1;
                            i4 = i9 == 0 ? 1 : 0;
                            list.removeAt(i9);
                        } else {
                            i4 = 0;
                        }
                        i2 = length;
                    } else {
                        i4 = list.size() == 0 ? 1 : 0;
                        i7 |= i4;
                        int i10 = i5 + 1;
                        if (i10 < length) {
                            i2 = length;
                            if (strM3815k4.charAt(i10) == 8237) {
                                list.addItem((byte) 0);
                                i5 = i10;
                            }
                        } else {
                            i2 = length;
                        }
                        b = (byte) -1;
                    }
                    if (i4 != 0) {
                        i5 += zM67515du ? 2 : i3;
                        fM56699x12 = f;
                    } else {
                        qy7VarM3728k4 = qy7Var2;
                    }
                } else {
                    i2 = length;
                    i3 = 1;
                    i4 = list.size() == 0 ? 1 : 0;
                    i7 |= i4;
                    b = (byte) 1;
                }
                list.addItem(b);
                if (i4 != 0) {
                }
            } else {
                i2 = length;
                i3 = 1;
                if (ghmVar.m6675k4(c14251ot, qy7Var2, iM67525k4)) {
                    if (c0762at2 == null) {
                        c0762at2 = new C0762at(ghmVar.f5252x1, qy7Var2);
                    }
                    qy7VarM3728k4 = c0762at2.m3728k4(iM67525k4);
                } else {
                    qy7VarM3728k4 = qy7Var2;
                }
                if (i7 != 0) {
                    i7 = 0;
                    i4 = 0;
                    qy7Var3 = qy7VarM3728k4;
                } else {
                    i4 = 0;
                }
            }
            if ((i4 | (qy7Var3 != qy7VarM3728k4 ? i3 : 0)) != 0) {
                int i11 = (iM67525k4 == 8236 ? i3 : 0) + i5;
                if (i6 < i11) {
                    if (list2.size() > 0) {
                        List.Enumerator it = list2.iterator();
                        strM67441x1 = "";
                        while (it.hasNext()) {
                            try {
                                byte bByteValue = ((Byte) C7019kk.m27464to(it.next(), Byte.TYPE)).byteValue();
                                if (bByteValue <= 0) {
                                    strM67441x1 = C14113y2.m67441x1(strM67441x1, (char) 8238);
                                }
                                if (bByteValue >= 0) {
                                    strM67441x1 = C14113y2.m67441x1(strM67441x1, (char) 8237);
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
                        list2.clear();
                    } else {
                        strM67441x1 = "";
                    }
                    String strM67400k4 = C14113y2.m67400k4(strM67441x1, C14113y2.m67443x1(strM3815k4, i6, i11 - i6));
                    if (list.size() > 0) {
                        list2.addRange(list);
                        strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67389k4((char) 8236, list.size()));
                    }
                    fM56699x12 = m6664k4(m6666k4(), strM67400k4, qy7Var3.m69882b3(), qy7Var3, z, i).Clone().m56699x1() + f;
                    i6 = i11;
                } else {
                    fM56699x12 = f;
                }
                qy7Var3 = qy7VarM3728k4;
            } else {
                fM56699x12 = f;
            }
            if (zM67515du) {
                i3 = 2;
            }
            i5 += i3;
            ghmVar = this;
            qy7Var2 = qy7Var;
        }
        float f2 = fM56699x12;
        if (i6 < i5) {
            c0762at = c0762at2;
            fM56699x1 = m6664k4(m6666k4(), C14113y2.m67443x1(strM3815k4, i6, i5 - i6), qy7Var3.m69882b3(), qy7Var3, z, i).Clone().m56699x1() + f2;
        } else {
            c0762at = c0762at2;
            fM56699x1 = f2;
        }
        if (c0762at != null) {
            C14251ot[] c14251otArr = {null};
            boolean zM3729k4 = c0762at.m3729k4(c14251otArr);
            C14251ot c14251ot2 = c14251otArr[0];
            if (zM3729k4) {
                m6665k4(c14251ot2.m68811k4()).CloneTo(c14293plArr[0]);
                return new C12015qq(fM56699x1, c14293plArr[0].f48091k4);
            }
        }
        m6665k4(qy7Var.m69882b3().m68811k4()).CloneTo(c14293plArr[0]);
        return new C12015qq(fM56699x1, c14293plArr[0].f48091k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m6671k4(String str, C14251ot c14251ot, qy7 qy7Var, float[] fArr) {
        C14293pl c14293pl = new C14293pl();
        C14293pl[] c14293plArr = {c14293pl};
        C12015qq c12015qqClone = m6670k4(str, c14251ot, qy7Var, true, Integer.MIN_VALUE, c14293plArr).Clone();
        c14293plArr[0].CloneTo(c14293pl);
        fArr[0] = c14293pl.f48093x1;
        return c12015qqClone;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m6672k4(String str, qy7 qy7Var) {
        C14251ot c14251otM69882b3 = qy7Var.m69882b3();
        C14293pl c14293pl = new C14293pl();
        C14293pl[] c14293plArr = {c14293pl};
        C12015qq c12015qqClone = m6670k4(str, c14251otM69882b3, qy7Var, true, Integer.MIN_VALUE, c14293plArr).Clone();
        c14293plArr[0].CloneTo(c14293pl);
        return c12015qqClone;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m6673k4(String str, qy7 qy7Var, boolean z) {
        C14251ot c14251otM69882b3 = qy7Var.m69882b3();
        C14293pl c14293pl = new C14293pl();
        C14293pl[] c14293plArr = {c14293pl};
        C12015qq c12015qqClone = m6670k4(str, c14251otM69882b3, qy7Var, z, Integer.MIN_VALUE, c14293plArr).Clone();
        c14293plArr[0].CloneTo(c14293pl);
        return c12015qqClone;
    }

    /* JADX INFO: renamed from: k4 */
    public static C14293pl m6665k4(C12013m9 c12013m9) {
        C14293pl c14293pl = new C14293pl();
        C12004dy c12004dyM56651x1 = c12013m9.m56651x1();
        c14293pl.f48091k4 = c12013m9.m56636c5() < 1.245f ? 2.0f : c12013m9.m56636c5() * 1.6f;
        float fM56536x1 = c12004dyM56651x1.m56536x1(c12013m9.m56642jd());
        float fM56532kk = c12004dyM56651x1.m56532kk(c12013m9.m56642jd());
        float f = fM56536x1 + fM56532kk;
        float fM56526du = c12004dyM56651x1.m56526du(c12013m9.m56642jd());
        float f2 = c14293pl.f48091k4;
        c14293pl.f48093x1 = (fM56532kk * f2) / f;
        c14293pl.f48092kk = ((fM56526du - f) * f2) / fM56526du;
        return c14293pl;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC14897zn m6666k4() {
        if (this.f5251kk == null) {
            this.f5251kk = new omq(new C12009k4(32, 32), 32.0f, 32.0f, true);
        }
        return this.f5251kk;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6674k4(AbstractC14897zn abstractC14897zn, String str, C12007ix c12007ix, qy7 qy7Var) {
        AbstractC14897zn abstractC14897zn2;
        qy7 qy7VarCloneT;
        i7n[] i7nVarArr = {null};
        f5250k4.tryGetValue(qy7Var.m69912ne(), i7nVarArr);
        i7n i7nVar = i7nVarArr[0];
        float fM56557jd = c12007ix.m56557jd();
        if (i7nVar != null) {
            int i = 0;
            while (i < str.length()) {
                int[] iArr = {i};
                String strM7540k4 = i7nVar.m7540k4(str, iArr);
                i = iArr[0];
                float fM7539k4 = i7nVar.m7539k4(strM7540k4.charAt(0)) * qy7Var.m69915rv();
                if (C14064he.m66715kk(fM7539k4)) {
                    qy7VarCloneT = qy7Var;
                } else {
                    qy7VarCloneT = qy7Var.cloneT();
                    qy7VarCloneT.m69927x1(fM7539k4);
                }
                C12015qq c12015qqClone = m6666k4().m74611k4(strM7540k4, qy7VarCloneT).Clone();
                abstractC14897zn.mo64343k4(strM7540k4, new C12007ix(fM56557jd, c12007ix.m56551ck(), c12015qqClone.m56699x1(), c12007ix.m56575x1()), qy7VarCloneT);
                fM56557jd += c12015qqClone.m56699x1();
            }
            return;
        }
        if (!C7019kk.m27469x1(abstractC14897zn, vhx.class)) {
            int i2 = 1;
            if (str.length() <= 1 || qy7Var.m69917to().m3903h4() || !C3047dy.m12855ix(str.charAt(0))) {
                abstractC14897zn2 = abstractC14897zn;
            } else {
                int iM67525k4 = C14117yj.m67525k4(str.charAt(0), str.charAt(1));
                if (C3047dy.m12869k4(iM67525k4)) {
                    List<Integer> list = new List<>();
                    while (true) {
                        list.addItem(Integer.valueOf(iM67525k4));
                        int i3 = i2 + 1;
                        if (i3 < str.length()) {
                            char cCharAt = str.charAt(i3);
                            if (C3047dy.m12855ix(str.charAt(i3))) {
                                i2 += 2;
                                iM67525k4 = C14117yj.m67525k4(str.charAt(i3), str.charAt(i2));
                            } else {
                                i2 = i3;
                                iM67525k4 = cCharAt;
                            }
                            if (!C3047dy.m12893x1(iM67525k4) && iM67525k4 != 8205 && !C3047dy.m12874kk(iM67525k4)) {
                                break;
                            } else {
                                abstractC14897zn = abstractC14897zn;
                            }
                        } else {
                            break;
                        }
                    }
                    C5659x1 c5659x1M68819x1 = qy7Var.m69882b3().m68819x1();
                    C12009k4 c12009k4M48200k4 = c5659x1M68819x1.m23120k4().m48200k4(list);
                    if (c12009k4M48200k4 != null) {
                        try {
                            abstractC14897zn.mo64339k4(c12009k4M48200k4, c12007ix.m56557jd(), (c12007ix.m56551ck() - c5659x1M68819x1.m23111c5()) + ((c5659x1M68819x1.m23112ck() - c12007ix.m56575x1()) / 2.0f), c12007ix.m56550c5(), c12009k4M48200k4.mo15757m9() / (c12009k4M48200k4.mo15760yj() / c12007ix.m56550c5()));
                            return;
                        } finally {
                            c12009k4M48200k4.dispose();
                        }
                    }
                    abstractC14897zn2 = abstractC14897zn;
                    if (c12009k4M48200k4 != null) {
                    }
                }
            }
        }
        abstractC14897zn2.mo64343k4(str, c12007ix.Clone(), qy7Var);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m6675k4(C14251ot c14251ot, qy7 qy7Var, int i) {
        boolean zM68814k4 = c14251ot.m68814k4(i);
        if (c14251ot.m68818to() || C14113y2.m67359c5(qy7Var.m69912ne(), c14251ot.m68811k4().m56648m9())) {
            return (i < 32 || zM68814k4 || c14251ot.m68813k4((char) i)) ? false : true;
        }
        return true;
    }
}
