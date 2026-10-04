package com.aspose.slides.internal.p406ss;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C10337m9 extends AbstractC3524ks {

    /* JADX INFO: renamed from: h4 */
    private Dictionary<String, C10339qq> f36805h4;

    /* JADX INFO: renamed from: m9 */
    private Dictionary<String, C10333jd> f36806m9;

    public C10337m9(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    /* JADX INFO: renamed from: e0 */
    private void m50371e0() {
        Dictionary.ValueCollection.Enumerator<String, C10333jd> it = this.f36806m9.getValues().iterator();
        while (it.hasNext()) {
            try {
                List.Enumerator<InterfaceC10331h4> it2 = it.next().m50357ts().iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().mo50317k4(this);
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: ts */
    private void m50372ts() {
        Dictionary dictionary = new Dictionary();
        Dictionary.ValueCollection.Enumerator<String, C10339qq> it = this.f36805h4.getValues().iterator();
        while (it.hasNext()) {
            try {
                Dictionary.ValueCollection.Enumerator<String, AbstractC10327ck> it2 = it.next().m50388ts().getValues().iterator();
                while (it2.hasNext()) {
                    try {
                        AbstractC10327ck next = it2.next();
                        if (dictionary.containsKey(next.m50335bz())) {
                            String str = (String) dictionary.get_Item(next.m50335bz());
                            if (!C14113y2.m67363du(str, next.mo50345ts())) {
                                m14118up().mo14351k4(this, next.m50335bz(), str, next.mo50345ts(), m14106m_());
                            }
                        }
                        dictionary.set_Item(next.m50335bz(), next.mo50345ts());
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: du */
    public final C10339qq m50373du(String str) {
        if (this.f36805h4.containsKey(str)) {
            return this.f36805h4.get_Item(str);
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (this.f9851to == null) {
            m14123x1("(simple-page-master|page-sequence-master)+");
        }
        m50372ts();
        m50371e0();
    }

    /* JADX INFO: renamed from: h4 */
    public final C10333jd m50374h4(String str) {
        if (this.f36806m9.containsKey(str)) {
            return this.f36806m9.get_Item(str);
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 38;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m50377m9(String str) {
        Dictionary.ValueCollection.Enumerator<String, C10339qq> it = this.f36805h4.getValues().iterator();
        while (it.hasNext()) {
            try {
                if (it.next().m50380du(str)) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "layout-master-set";
    }

    /* JADX INFO: renamed from: dy */
    private boolean m50370dy(String str) {
        return this.f36805h4.containsKey(str) || this.f36806m9.containsKey(str);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        mo14126yj().m50404k4(this);
        this.f36805h4 = new Dictionary<>();
        this.f36806m9 = new Dictionary<>();
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (!C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str) || C14113y2.m67363du(str2, "simple-page-master") || C14113y2.m67363du(str2, "page-sequence-master")) {
            return;
        }
        m14103kk(interfaceC3757h4, str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50375k4(C10339qq c10339qq) {
        String strM50378bz = c10339qq.m50378bz();
        if (m50370dy(strM50378bz)) {
            m14118up().mo14355kk(this, m14105ks(), strM50378bz, c10339qq.m14106m_());
        }
        this.f36805h4.addItem(strM50378bz, c10339qq);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50376k4(String str, C10333jd c10333jd) {
        if (m50370dy(str)) {
            m14118up().mo14355kk(this, m14105ks(), str, c10333jd.m14106m_());
        }
        this.f36806m9.addItem(str, c10333jd);
    }
}
