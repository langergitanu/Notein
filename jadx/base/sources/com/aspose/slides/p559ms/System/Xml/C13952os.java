package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.os */
/* JADX INFO: loaded from: classes5.dex */
public class C13952os extends AbstractC13965r5 {

    /* JADX INFO: renamed from: c5 */
    private boolean f46688c5;

    /* JADX INFO: renamed from: ck */
    private String f46689ck;

    /* JADX INFO: renamed from: du */
    private C13890ei f46690du;

    /* JADX INFO: renamed from: dy */
    private boolean f46691dy;

    /* JADX INFO: renamed from: fa */
    private int f46692fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f46693h4;

    /* JADX INFO: renamed from: jd */
    private String f46694jd;

    /* JADX INFO: renamed from: k4 */
    private AbstractC13965r5 f46695k4;

    /* JADX INFO: renamed from: kk */
    private Dictionary<C13890ei, Integer> f46696kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f46697m9;

    /* JADX INFO: renamed from: to */
    private C13908h4 f46698to;

    /* JADX INFO: renamed from: x1 */
    private boolean f46699x1;

    public C13952os(AbstractC13965r5 abstractC13965r5, C13907h0 c13907h0) {
        this.f46695k4 = abstractC13965r5;
        this.f46694jd = c13907h0.m65422ix();
        this.f46689ck = c13907h0.m65439u4();
        if (c13907h0.m65441up() != 0) {
            if (c13907h0.m65441up() == 1) {
                if (this.f46694jd == null && this.f46689ck == null) {
                    return;
                }
                this.f46693h4 = true;
                return;
            }
            return;
        }
        if (this.f46694jd != null) {
            this.f46693h4 = true;
            this.f46697m9 = true;
        }
        if (c13907h0.m65443wl() && c13907h0.m65442uz() == 1) {
            this.f46697m9 = true;
        }
        if (c13907h0.m65433ks().size() > 0) {
            this.f46698to = new C13908h4();
            this.f46696kk = new Dictionary<>();
            this.f46690du = new C13890ei();
            List.Enumerator<C13890ei> it = c13907h0.m65433ks().iterator();
            while (it.hasNext()) {
                try {
                    this.f46696kk.set_Item(it.next(), 0);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            this.f46698to.m65450k4(false);
        }
    }

    /* JADX INFO: renamed from: up */
    private void m65715up() {
        this.f46699x1 = false;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: a_ */
    public void mo21891a_(char[] cArr, int i, int i2) {
        if (this.f46688c5 || !(this.f46699x1 || m65714m9())) {
            this.f46695k4.mo21891a_(cArr, i, i2);
        } else {
            this.f46695k4.mo21894du(C14113y2.m67406k4(cArr, i, i2));
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    public boolean aa_() {
        return this.f46695k4.aa_();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21893du() {
        this.f46695k4.mo21893du();
        if (this.f46697m9 && !this.f46691dy) {
            throw new XmlException("Document does not have a root element.", C14113y2.f47374k4);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: dy */
    public void mo21895dy(String str) {
        if (this.f46688c5 || !(this.f46699x1 || m65714m9())) {
            this.f46695k4.mo21895dy(str);
        } else {
            this.f46695k4.mo21894du(str);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21896h4() {
        this.f46695k4.mo21896h4();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21899k4() {
        this.f46695k4.mo21899k4();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: kk */
    public void mo21910kk(String str) {
        m65715up();
        this.f46695k4.mo21910kk(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: m9 */
    public void mo21913m9(String str) {
        if (this.f46688c5 || !(this.f46699x1 || m65714m9())) {
            this.f46695k4.mo21913m9(str);
        } else {
            this.f46695k4.mo21894du(str);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: to */
    public void mo65316to() {
        this.f46695k4.mo65316to();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21917x1() {
        this.f46688c5 = false;
        this.f46695k4.mo21917x1();
    }

    /* JADX INFO: renamed from: m9 */
    private boolean m65714m9() {
        if (this.f46696kk == null || !this.f46698to.m65452x1()) {
            return false;
        }
        this.f46699x1 = true;
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21894du(String str) {
        this.f46695k4.mo21894du(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21897h4(String str) {
        m65715up();
        this.f46695k4.mo21897h4(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21900k4(char c) {
        m65715up();
        this.f46695k4.mo21900k4(c);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: kk */
    public void mo21911kk(String str, String str2, String str3) {
        m65715up();
        this.f46695k4.mo21911kk(str, str2, str3);
        if (this.f46697m9) {
            this.f46692fa--;
        }
        if (this.f46696kk != null) {
            this.f46698to.m65451k4();
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: to */
    public void mo65317to(String str) {
        this.f46695k4.mo65317to(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21918x1(String str) {
        if (this.f46688c5 || !(this.f46699x1 || m65714m9())) {
            this.f46695k4.mo21918x1(str);
        } else {
            this.f46695k4.mo21894du(str);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21901k4(char c, char c2) {
        m65715up();
        this.f46695k4.mo21901k4(c, c2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: to */
    public void mo21915to(String str, String str2, String str3) {
        this.f46688c5 = true;
        this.f46695k4.mo21915to(str, str2, str3);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21919x1(String str, String str2) {
        this.f46695k4.mo21919x1(str, str2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21902k4(int i) {
        this.f46695k4.mo21902k4(i);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21920x1(String str, String str2, String str3) {
        m65715up();
        this.f46695k4.mo21920x1(str, str2, str3);
        if (this.f46697m9) {
            this.f46692fa--;
        }
        if (this.f46696kk != null) {
            this.f46698to.m65451k4();
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo65716k4(InterfaceC13980t6 interfaceC13980t6) {
        this.f46792c6 = interfaceC13980t6;
        this.f46695k4.mo65716k4(interfaceC13980t6);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21905k4(String str) {
        this.f46695k4.mo21905k4(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21907k4(String str, String str2) {
        m65715up();
        this.f46695k4.mo21907k4(str, str2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo12953k4(String str, String str2, String str3) {
        m65715up();
        if (this.f46697m9) {
            int i = this.f46692fa;
            if (i == 0 && this.f46691dy) {
                throw new XmlException("Document cannot have multiple document elements.", C14113y2.f47374k4);
            }
            this.f46692fa = i + 1;
            this.f46691dy = true;
        }
        if (this.f46693h4) {
            this.f46695k4.mo21908k4(str.length() != 0 ? C14113y2.m67408k4(str, C18241k5.f55433h, str2) : str2, this.f46689ck, this.f46694jd, null);
            this.f46693h4 = false;
        }
        this.f46695k4.mo12953k4(str, str2, str3);
        if (this.f46696kk != null) {
            this.f46690du.m65290x1(str2, str3);
            this.f46698to.m65450k4(this.f46696kk.containsKey(this.f46690du));
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21908k4(String str, String str2, String str3, String str4) {
        if (this.f46689ck == null && this.f46694jd == null) {
            this.f46695k4.mo21908k4(str, str2, str3, str4);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21909k4(char[] cArr, int i, int i2) {
        if (this.f46688c5 || !(this.f46699x1 || m65714m9())) {
            this.f46695k4.mo21909k4(cArr, i, i2);
        } else {
            this.f46695k4.mo21894du(C14113y2.m67406k4(cArr, i, i2));
        }
    }
}
