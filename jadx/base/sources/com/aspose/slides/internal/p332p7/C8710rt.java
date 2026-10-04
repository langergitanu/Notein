package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.rt */
/* JADX INFO: loaded from: classes4.dex */
public class C8710rt extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f29718kk = new C7017h4("Id", "SignatureProperty");

    /* JADX INFO: renamed from: k4 */
    private String f29719k4;

    /* JADX INFO: renamed from: x1 */
    private List<C8870ti> f29720x1;

    public C8710rt() {
        m40530to();
    }

    /* JADX INFO: renamed from: to */
    private void m40530to() {
        this.f29720x1 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C8870ti[] m40532x1() {
        return this.f29720x1.toArray(new C8870ti[0]);
    }

    public C8710rt(final AbstractC13912i5 abstractC13912i5) {
        m40530to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rt.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8710rt.f29718kk.m27428k4(str) != 0) {
                    return false;
                }
                C8710rt.this.f29719k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.rt.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8710rt.f29718kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C8710rt.this.f29720x1.addItem(new C8870ti(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8870ti m40531k4() {
        C8870ti c8870ti = new C8870ti();
        this.f29720x1.addItem(c8870ti);
        return c8870ti;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f29719k4;
        if (str3 != null) {
            c3059ii.m12955x1("Id", str3);
        }
        List.Enumerator<C8870ti> it = this.f29720x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("", c3059ii, "SignatureProperty");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
