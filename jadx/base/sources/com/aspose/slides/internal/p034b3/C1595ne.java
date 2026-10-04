package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p513xw.C12737w6;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.ne */
/* JADX INFO: loaded from: classes3.dex */
public class C1595ne {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, List<C12737w6>> f6177k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, List<InterfaceC1599u4>> f6180x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private List<String> f6178kk = new List<>();

    /* JADX INFO: renamed from: to */
    private List<String> f6179to = new List<>();

    /* JADX INFO: renamed from: k4 */
    public final void m8607k4(C12737w6 c12737w6) {
        String[] strArrMo8592to = c12737w6.mo8592to();
        if (strArrMo8592to != null) {
            for (String str : strArrMo8592to) {
                List<C12737w6>[] listArr = {null};
                boolean z = this.f6177k4.tryGetValue(str, listArr) && listArr[0].size() != 0;
                List<C12737w6> list = listArr[0];
                if (z) {
                    m8606k4(str, list);
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m8611kk(String str) {
        return this.f6179to.containsItem(str);
    }

    /* JADX INFO: renamed from: to */
    public final List<C12737w6> m8612to(String str) {
        Dictionary<String, List<C12737w6>> dictionary = this.f6177k4;
        if (dictionary != null && dictionary.size() != 0) {
            List<C12737w6>[] listArr = {null};
            boolean zTryGetValue = this.f6177k4.tryGetValue(str, listArr);
            List<C12737w6> list = listArr[0];
            if (zTryGetValue) {
                return list;
            }
        }
        return new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8613x1(String str) {
        this.f6179to.addItem(str);
        if (this.f6178kk.containsItem(str)) {
            this.f6178kk.removeItem(str);
            List<C12737w6> list = (List) C7019kk.m27452k4((Object) this.f6177k4.get_Item(str), List.class);
            List list2 = (List) C7019kk.m27452k4((Object) this.f6180x1.get_Item(str), List.class);
            if (list2 != null) {
                List.Enumerator it = list2.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC1599u4) it.next()).mo8590k4(str, list);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                this.f6180x1.removeItemByKey(str);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8608k4(String str) {
        this.f6178kk.addItem(str);
    }

    /* JADX INFO: renamed from: k4 */
    private void m8606k4(String str, List<C12737w6> list) {
        boolean zM27456k4;
        List[] listArr = {null};
        boolean zTryGetValue = this.f6180x1.tryGetValue(str, listArr);
        List list2 = listArr[0];
        if (zTryGetValue) {
            List.Enumerator it = list2.iterator();
            while (it.hasNext()) {
                try {
                    InterfaceC1599u4 interfaceC1599u4 = (InterfaceC1599u4) it.next();
                    if (this.f6178kk.containsItem(str)) {
                        if (zM27456k4) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        interfaceC1599u4.mo8590k4(str, list);
                        this.f6179to.addItem(str);
                        this.f6180x1.removeItemByKey(str);
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
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8609k4(String str, InterfaceC1599u4 interfaceC1599u4) {
        List<InterfaceC1599u4>[] listArr = {null};
        boolean zTryGetValue = this.f6180x1.tryGetValue(str, listArr);
        List<InterfaceC1599u4> list = listArr[0];
        if (!zTryGetValue) {
            list = new List<>();
            this.f6180x1.addItem(str, list);
        }
        list.addItem(interfaceC1599u4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8610k4(String str, C12737w6 c12737w6) {
        List[] listArr = {null};
        boolean zTryGetValue = this.f6177k4.tryGetValue(str, listArr);
        List list = listArr[0];
        if (zTryGetValue) {
            if (list.containsItem(c12737w6)) {
                return;
            }
            list.addItem(c12737w6);
            return;
        }
        List<C12737w6> list2 = new List<>();
        this.f6177k4.addItem(str, list2);
        list2.addItem(c12737w6);
        c12737w6.m59352x1(str);
        if (this.f6178kk.containsItem(str)) {
            return;
        }
        m8606k4(str, list2);
    }
}
