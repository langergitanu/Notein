package com.aspose.slides.internal.p202jd;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p126fa.AbstractC3905m9;
import com.aspose.slides.internal.p126fa.AbstractC3913yj;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p368qq.AbstractC9922k4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p368qq.InterfaceC9938x6;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.ou */
/* JADX INFO: loaded from: classes.dex */
public class C5343ou extends AbstractC3913yj {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "font-variant";
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 120;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    @Override // com.aspose.slides.internal.p126fa.AbstractC3913yj
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo15609k4(C6344m9 c6344m9, InterfaceC9938x6 interfaceC9938x6, InterfaceC9933up interfaceC9933up, boolean z) throws Throwable {
        Class<IDisposable> cls;
        Class<IDisposable> cls2;
        Class<IDisposable> cls3 = IDisposable.class;
        C11068dy<AbstractC5788h4> c11068dyMo15596du = ((AbstractC3905m9) c6344m9.m26001m9(126)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du2 = ((AbstractC3905m9) c6344m9.m26001m9(121)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du3 = ((AbstractC3905m9) c6344m9.m26001m9(122)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du4 = ((AbstractC3905m9) c6344m9.m26001m9(123)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du5 = ((AbstractC3905m9) c6344m9.m26001m9(124)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du6 = ((AbstractC3905m9) c6344m9.m26001m9(125)).mo15596du();
        List list = new List();
        List list2 = new List();
        List list3 = new List();
        List list4 = new List();
        List list5 = new List();
        List list6 = new List();
        IGenericEnumerator<InterfaceC9933up> it = AbstractC9922k4.m48835k4(interfaceC9933up).iterator();
        while (it.hasNext()) {
            try {
                try {
                    IGenericEnumerator<InterfaceC9933up> iGenericEnumerator = it;
                    try {
                        InterfaceC9933up next = it.next();
                        cls2 = cls3;
                        try {
                            short sMo48850k4 = next.mo48850k4();
                            if (sMo48850k4 == 12) {
                                list.addItem(next);
                                list2.addItem(next);
                                list3.addItem(next);
                                list4.addItem(next);
                                list5.addItem(next);
                                list6.addItem(next);
                            } else {
                                if (sMo48850k4 != 35) {
                                    throw m15602k4(next.mo48850k4());
                                }
                                String strM67361du = C14113y2.m67361du(next.mo48784c5());
                                if ("normal".equals(strM67361du) || "initial".equals(strM67361du)) {
                                    try {
                                        InterfaceC9933up interfaceC9933upM48848x1 = AbstractC9922k4.m48848x1((InterfaceC9933up) null, "normal");
                                        list.addItem(interfaceC9933upM48848x1);
                                        list2.addItem(interfaceC9933upM48848x1);
                                        list3.addItem(interfaceC9933upM48848x1);
                                        list4.addItem(interfaceC9933upM48848x1);
                                        list5.addItem(interfaceC9933upM48848x1);
                                        list6.addItem(interfaceC9933upM48848x1);
                                    } catch (Throwable th) {
                                        th = th;
                                        it = iGenericEnumerator;
                                        cls = cls2;
                                        if (C7019kk.m27456k4((Iterator) it, cls)) {
                                        }
                                        throw th;
                                    }
                                } else if (c11068dyMo15596du.m53498k4(strM67361du) != null) {
                                    list.addItem(next);
                                } else if (c11068dyMo15596du2.m53498k4(strM67361du) != null) {
                                    list2.addItem(next);
                                } else if (c11068dyMo15596du3.m53498k4(strM67361du) != null) {
                                    list3.addItem(next);
                                } else if (c11068dyMo15596du4.m53498k4(strM67361du) != null) {
                                    list4.addItem(next);
                                } else if (c11068dyMo15596du5.m53498k4(strM67361du) != null) {
                                    list5.addItem(next);
                                } else {
                                    if (c11068dyMo15596du6.m53498k4(strM67361du) == null) {
                                        throw m15605x1(strM67361du);
                                    }
                                    list6.addItem(next);
                                }
                            }
                            it = iGenericEnumerator;
                            cls3 = cls2;
                        } catch (Throwable th2) {
                            th = th2;
                            it = iGenericEnumerator;
                            cls = cls2;
                            if (C7019kk.m27456k4((Iterator) it, cls)) {
                                it.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cls2 = cls3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cls2 = cls3;
                }
            } catch (Throwable th5) {
                th = th5;
                cls = cls3;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, cls3)) {
            it.dispose();
        }
        m15610k4(interfaceC9938x6, "font-variant-alternates", list, z);
        m15610k4(interfaceC9938x6, "font-variant-caps", list2, z);
        m15610k4(interfaceC9938x6, "font-variant-east-asian", list3, z);
        m15610k4(interfaceC9938x6, "font-variant-ligatures", list4, z);
        m15610k4(interfaceC9938x6, "font-variant-numeric", list5, z);
        m15610k4(interfaceC9938x6, "font-variant-position", list6, z);
    }
}
