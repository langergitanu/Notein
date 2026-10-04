package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.inner.api.NetworkService;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class v1c extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f31486x1 = new C7017h4("config-item-set");

    /* JADX INFO: renamed from: k4 */
    private List<zh8> f31487k4;

    public v1c() {
        m42652kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m42652kk() {
        this.f31487k4 = new List<>();
    }

    public v1c(final AbstractC13912i5 abstractC13912i5) {
        m42652kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.v1c.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (v1c.f31486x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                v1c.this.f31487k4.addItem(new zh8(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final zh8 m42654k4() {
        zh8 zh8Var = new zh8();
        this.f31487k4.addItem(zh8Var);
        return zh8Var;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<zh8> it = this.f31487k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4(NetworkService.Constants.CONFIG_SERVICE, c3059ii, "config-item-set");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
