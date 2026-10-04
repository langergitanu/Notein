package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.inner.api.NetworkService;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class zh8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f33903kk = new C7017h4("config:name", "config-item", "config-item-set", "config-item-map-named", "config-item-map-indexed");

    /* JADX INFO: renamed from: k4 */
    private String f33904k4;

    /* JADX INFO: renamed from: x1 */
    private List<C7394ca> f33905x1;

    public zh8() {
        m45621x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m45621x1() {
        this.f33905x1 = new List<>();
    }

    public zh8(final AbstractC13912i5 abstractC13912i5) {
        m45621x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zh8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (zh8.f33903kk.m27428k4(str) != 0) {
                    return false;
                }
                zh8.this.f33904k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zh8.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = zh8.f33903kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    iih iihVar = new iih(abstractC13912i5);
                    list = zh8.this.f33905x1;
                    c7394ca = new C7394ca("config-item", iihVar);
                } else if (iM27428k4 == 2) {
                    zh8 zh8Var = new zh8(abstractC13912i5);
                    list = zh8.this.f33905x1;
                    c7394ca = new C7394ca("config-item-set", zh8Var);
                } else if (iM27428k4 == 3) {
                    wh5 wh5Var = new wh5(abstractC13912i5);
                    list = zh8.this.f33905x1;
                    c7394ca = new C7394ca("config-item-map-named", wh5Var);
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    lzp lzpVar = new lzp(abstractC13912i5);
                    list = zh8.this.f33905x1;
                    c7394ca = new C7394ca("config-item-map-indexed", lzpVar);
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m45623x1(String str) {
        this.f33904k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m45622k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f33903kk.m27428k4(str);
        if (iM27428k4 == 1) {
            c7394ca = new C7394ca("config-item", new iih());
        } else if (iM27428k4 == 2) {
            c7394ca = new C7394ca("config-item-set", new zh8());
        } else if (iM27428k4 == 3) {
            c7394ca = new C7394ca("config-item-map-named", new wh5());
        } else {
            if (iM27428k4 != 4) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("config-item-map-indexed", new lzp());
        }
        this.f33905x1.addItem(c7394ca);
        return c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("config:name", this.f33904k4);
        List.Enumerator<C7394ca> it = this.f33905x1.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f33903kk.m27428k4(next.m29539k4());
                if (iM27428k4 == 1) {
                    ((iih) next.m29541kk()).mo6846k4(NetworkService.Constants.CONFIG_SERVICE, c3059ii, next.m29539k4());
                } else if (iM27428k4 == 2) {
                    ((zh8) next.m29541kk()).mo6846k4(NetworkService.Constants.CONFIG_SERVICE, c3059ii, next.m29539k4());
                } else if (iM27428k4 == 3) {
                    ((wh5) next.m29541kk()).mo6846k4(NetworkService.Constants.CONFIG_SERVICE, c3059ii, next.m29539k4());
                } else if (iM27428k4 == 4) {
                    ((lzp) next.m29541kk()).mo6846k4(NetworkService.Constants.CONFIG_SERVICE, c3059ii, next.m29539k4());
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
        c3059ii.mo21898jd();
    }
}
