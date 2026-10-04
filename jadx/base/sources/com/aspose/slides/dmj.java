package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class dmj {
    /* JADX INFO: renamed from: k4 */
    public static List<C7394ca> m5158k4(IGenericList<C7394ca> iGenericList) {
        if (iGenericList == null) {
            throw new ArgumentNullException("elementsList");
        }
        if (iGenericList.size() == 0) {
            throw new ArgumentException("elementsList");
        }
        List<C7394ca> list = new List<>(iGenericList.size());
        IGenericEnumerator<C7394ca> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if (!"list".equals(next.m29539k4())) {
                    throw new InvalidOperationException();
                }
                com.aspose.slides.internal.p332p7.lxj lxjVar = (com.aspose.slides.internal.p332p7.lxj) next.m29542x1();
                if (lxjVar.m36511du().length != 1) {
                    throw new InvalidOperationException();
                }
                com.aspose.slides.internal.p332p7.aq8 aq8Var = lxjVar.m36511du()[0];
                if (aq8Var.m28416k4().size() != 1) {
                    throw new InvalidOperationException();
                }
                if (aq8Var.m28416k4().size() != 1) {
                    throw new InvalidOperationException();
                }
                if (!ContextChain.TAG_PRODUCT.equals(aq8Var.m28416k4().get_Item(0).m29539k4()) && !"list".equals(aq8Var.m28416k4().get_Item(0).m29539k4())) {
                    throw new InvalidOperationException();
                }
                if ("list".equals(aq8Var.m28416k4().get_Item(0).m29539k4())) {
                    ((com.aspose.slides.internal.p332p7.lxj) aq8Var.m28416k4().get_Item(0).m29542x1()).m36513k4(lxjVar.m36514kk());
                }
                list.addItem(aq8Var.m28416k4().get_Item(0));
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
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m5161x1(String str) {
        return C14113y2.m67359c5(str, "OpenOffice.org_project/680m");
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m5159k4(com.aspose.slides.internal.p332p7.vtn vtnVar, com.aspose.slides.internal.p332p7.pb4 pb4Var, String str) {
        if (vtnVar == null) {
            throw new ArgumentNullException("frameElementData");
        }
        if (pb4Var == null) {
            throw new ArgumentNullException("textBoxElement");
        }
        if (vtnVar.m43307up() != 1 || vtnVar.m43293fa() != 2 || m5160k4(str) || !m5161x1(str) || pb4Var.m38779k4().size() == 0) {
            return false;
        }
        List.Enumerator<C7394ca> it = pb4Var.m38779k4().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if (!"list".equals(next.m29539k4())) {
                    return false;
                }
                com.aspose.slides.internal.p332p7.lxj lxjVar = (com.aspose.slides.internal.p332p7.lxj) next.m29542x1();
                if (lxjVar.m36511du().length != 1) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return false;
                }
                com.aspose.slides.internal.p332p7.aq8 aq8Var = lxjVar.m36511du()[0];
                if (aq8Var.m28416k4().size() != 1) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return false;
                }
                if (ContextChain.TAG_PRODUCT.equals(aq8Var.m28416k4().get_Item(0).m29539k4())) {
                    com.aspose.slides.internal.p332p7.ok7 ok7Var = (com.aspose.slides.internal.p332p7.ok7) aq8Var.m28416k4().get_Item(0).m29542x1();
                    if (ok7Var.m38327kk().size() >= 1 && "_TEXT".equals(ok7Var.m38327kk().get_Item(0).m29539k4())) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        return false;
                    }
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
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m5160k4(String str) {
        return C14113y2.m67411k4(str) || C14113y2.m67359c5(str, "OpenOffice/4") || C14113y2.m67359c5(str, "OpenOffice.org_project/4");
    }
}
