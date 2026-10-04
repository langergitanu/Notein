package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p235kp.C5895k4;
import com.aspose.slides.internal.p235kp.C5896kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p513xw.C12737w6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.up */
/* JADX INFO: loaded from: classes3.dex */
public class C1601up extends AbstractC1590k4 implements InterfaceC1599u4 {

    /* JADX INFO: renamed from: du */
    private String f6187du;

    /* JADX INFO: renamed from: h4 */
    private C12737w6 f6188h4;

    /* JADX INFO: renamed from: kk */
    private String f6189kk;

    /* JADX INFO: renamed from: m9 */
    private Dictionary<String, List<C1601up>> f6190m9;

    /* JADX INFO: renamed from: to */
    private boolean f6191to;

    /* JADX INFO: renamed from: x1 */
    private List<C1601up> f6192x1;

    public C1601up() {
        this.f6192x1 = new List<>();
        this.f6189kk = null;
        this.f6191to = true;
        this.f6188h4 = null;
        this.f6190m9 = new Dictionary<>();
        this.f6187du = null;
        this.f6166k4 = 2;
        this.f6191to = true;
    }

    /* JADX INFO: renamed from: k4 */
    private C1601up m8627k4(C5895k4 c5895k4) {
        C1601up c1601up = new C1601up(c5895k4);
        for (int i = 0; i < c5895k4.m23747g8().size(); i++) {
            c1601up.m8629k4(m8627k4(c5895k4.m23747g8().get_Item(i)));
        }
        return c1601up;
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1588ix
    /* JADX INFO: renamed from: du */
    public String mo8576du() {
        return "Bookmarks";
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1599u4
    /* JADX INFO: renamed from: kk */
    public final boolean mo8591kk() {
        Dictionary<String, List<C1601up>> dictionary = this.f6190m9;
        return dictionary == null || dictionary.size() == 0;
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1599u4
    /* JADX INFO: renamed from: to */
    public final String[] mo8592to() {
        String[] strArr = new String[this.f6190m9.getKeys().size()];
        this.f6190m9.getKeys().copyTo(AbstractC14092to.m67208k4((Object) strArr), 0);
        return strArr;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m8630x1() {
        return this.f6187du;
    }

    public C1601up(C5895k4 c5895k4) {
        this.f6192x1 = new List<>();
        this.f6189kk = null;
        this.f6191to = true;
        this.f6188h4 = null;
        this.f6190m9 = new Dictionary<>();
        this.f6189kk = c5895k4.m23746e0();
        this.f6191to = c5895k4.m23748qm();
        this.f6187du = c5895k4.m23745bz();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8629k4(C1601up c1601up) {
        this.f6192x1.addItem(c1601up);
        if (c1601up.f6188h4 == null) {
            m8628k4(c1601up.m8630x1(), c1601up);
            for (String str : c1601up.mo8592to()) {
                m8628k4(str, c1601up);
            }
        }
    }

    public C1601up(C5896kk c5896kk) {
        this.f6192x1 = new List<>();
        this.f6189kk = null;
        this.f6191to = true;
        this.f6188h4 = null;
        this.f6190m9 = new Dictionary<>();
        this.f6187du = null;
        this.f6166k4 = 2;
        this.f6191to = true;
        for (int i = 0; i < c5896kk.m23749ts().size(); i++) {
            m8629k4(m8627k4(c5896kk.m23749ts().get_Item(i)));
        }
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1599u4
    /* JADX INFO: renamed from: k4 */
    public final void mo8590k4(String str, List<C12737w6> list) {
        if (C14113y2.m67363du(str, this.f6187du)) {
            this.f6188h4 = list.get_Item(0);
        }
        List[] listArr = {null};
        boolean zTryGetValue = this.f6190m9.tryGetValue(str, listArr);
        List list2 = listArr[0];
        if (zTryGetValue) {
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
        }
        this.f6190m9.removeItemByKey(str);
    }

    /* JADX INFO: renamed from: k4 */
    private void m8628k4(String str, C1601up c1601up) {
        List<C1601up>[] listArr = {null};
        boolean zTryGetValue = this.f6190m9.tryGetValue(str, listArr);
        List<C1601up> list = listArr[0];
        if (!zTryGetValue) {
            list = new List<>();
            this.f6190m9.addItem(str, list);
        }
        list.addItem(c1601up);
    }
}
