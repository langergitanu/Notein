package com.aspose.slides.internal.p464vq;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.internal.p077d8.C3044dc;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p085dk.AbstractC3174jd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p482wr.C12262lr;
import com.aspose.slides.internal.p482wr.C12275wy;
import com.aspose.slides.internal.p508xq.C12596h4;
import com.aspose.slides.internal.p508xq.C12599kk;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.tq */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11819tq extends AbstractC11760jd implements IDisposable {

    /* JADX INFO: renamed from: du */
    private List<String> f39868du;

    /* JADX INFO: renamed from: h4 */
    private IGenericList<AbstractC3150x6> f39869h4;

    /* JADX INFO: renamed from: kk */
    private C11723d3 f39870kk;

    /* JADX INFO: renamed from: m9 */
    private Dictionary<String, C12262lr> f39871m9;

    /* JADX INFO: renamed from: to */
    private List<C11791os> f39872to;

    /* JADX INFO: renamed from: x1 */
    protected SortedList<String, C11791os> f39873x1;

    /* JADX INFO: renamed from: du */
    public static String m55386du(String str) {
        String strM67443x1;
        int iM67418kk = C14113y2.m67418kk(str, IOUtils.DIR_SEPARATOR_UNIX);
        if (iM67418kk >= 0) {
            int i = iM67418kk + 1;
            strM67443x1 = C14113y2.m67443x1(str, 0, i);
            str = C14113y2.m67422kk(str, i);
        } else {
            strM67443x1 = "";
        }
        return C14113y2.m67408k4(strM67443x1, "_rels/", str, ".rels");
    }

    /* JADX INFO: renamed from: up */
    private void m55387up() {
        IGenericEnumerator<C11791os> it = this.f39873x1.getValues().iterator();
        while (it.hasNext()) {
            try {
                C11791os next = it.next();
                m55341h4();
                if (C7019kk.m27469x1(next.m55372fa(), C11738ew.class)) {
                    next.m55373k4(m55402kk(next.m55427x1()));
                    next.m55422k4(true);
                    this.f39872to.addItem(next);
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
        it = this.f39873x1.getValues().iterator();
        while (it.hasNext()) {
            try {
                C11791os next2 = it.next();
                if (C7019kk.m27469x1(next2.m55372fa(), AbstractC11714bv.class)) {
                    next2.m55373k4(m55406x1(next2.m55427x1()));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C11723d3 c11723d3M55406x1 = m55406x1("/");
        this.f39870kk = c11723d3M55406x1;
        if (c11723d3M55406x1 == null) {
            throw new C11726dl(C14113y2.m67402k4("Error reading pptx presentation: can't find \"{0}\" entry.", m55386du("/")));
        }
        mo55278k4(this.f39873x1.getValues());
        for (C11709bg c11709bg : this.f39870kk.m55309k4(AbstractC11870zf.f39988k4)) {
            c11709bg.m55293kk().m55422k4(true);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final C11791os[] m55388c5() {
        C11791os[] c11791osArr = new C11791os[this.f39873x1.getValues().size()];
        this.f39873x1.getValues().copyToTArray(c11791osArr, 0);
        return c11791osArr;
    }

    /* JADX INFO: renamed from: ck */
    public final void m55389ck() {
        m55340du();
        if (this.f39873x1 == null) {
            this.f39873x1 = new SortedList<>(AbstractC14070jw.m66790x1());
        }
        if (this.f39872to == null) {
            this.f39872to = new List<>();
        }
        if (this.f39869h4 == null) {
            this.f39869h4 = new List();
        }
        C11791os c11791os = new C11791os(this, m55386du("/"), new C11738ew(), null);
        c11791os.m55373k4(new C11723d3(this));
        this.f39873x1.addItem(c11791os.m55427x1(), c11791os);
        this.f39870kk = c11791os.m55377up();
        this.f39868du = new List<>();
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        int size = this.f39869h4.size();
        AbstractC3150x6[] abstractC3150x6Arr = new AbstractC3150x6[size];
        this.f39869h4.copyToTArray(abstractC3150x6Arr, 0);
        this.f39869h4.clear();
        for (int i = 0; i < size; i++) {
            abstractC3150x6Arr[i].dispose();
        }
    }

    /* JADX INFO: renamed from: dy */
    public final C11723d3 m55390dy() {
        return this.f39870kk;
    }

    /* JADX INFO: renamed from: fa */
    public final void m55391fa() {
        if (m55392h4("/[Content_Types].xml") != null) {
            this.f39873x1.removeItemByKey("/[Content_Types].xml");
        }
        C11773lr.m55351k4(this);
    }

    /* JADX INFO: renamed from: h4 */
    public final C11791os m55392h4(String str) {
        C11791os[] c11791osArr = {null};
        this.f39873x1.tryGetValue(str, c11791osArr);
        return c11791osArr[0];
    }

    /* JADX INFO: renamed from: jd */
    public final C11791os[] m55393jd() {
        return this.f39872to.toArray(new C11791os[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final C11791os m55394k4(String str, AbstractC11760jd.k4 k4Var, AbstractC11812sq abstractC11812sq) {
        return m55395k4(str, k4Var, abstractC11812sq, null);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo55278k4(IGenericList<C11791os> iGenericList);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo55279k4(C11791os c11791os);

    /* JADX INFO: renamed from: kk */
    public final C11723d3 m55402kk(String str) {
        AbstractC3150x6 abstractC3150x6M55405to = m55405to(str);
        int iM67418kk = C14113y2.m67418kk(str, IOUtils.DIR_SEPARATOR_UNIX);
        String strM67443x1 = iM67418kk >= 0 ? C14113y2.m67443x1(str, 0, iM67418kk - 6) : "";
        if (abstractC3150x6M55405to == null) {
            return null;
        }
        try {
            C11738ew c11738ew = (C11738ew) C11826u5.m55410k4("application/vnd.openxmlformats-package.relationships+xml");
            AbstractC13912i5 abstractC13912i5M12834k4 = C3044dc.m12834k4(new C3148wl(abstractC3150x6M55405to, true), c11738ew.mo55274to(), c11738ew.mo55298du(), c11738ew.mo55273k4(), c11738ew.mo55335h4(), false);
            C11723d3 c11723d3 = new C11723d3(this);
            c11723d3.m55308k4(abstractC13912i5M12834k4, strM67443x1);
            return c11723d3;
        } catch (RuntimeException e) {
            throw new C11726dl(C14113y2.m67408k4("Error reading \"", str, "\" relationships part"), e);
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final void m55404m9(String str) {
        this.f39868du.addItem(str);
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC3150x6 m55405to(String str) {
        C11791os[] c11791osArr = {null};
        boolean z = this.f39873x1.tryGetValue(str, c11791osArr) && c11791osArr[0] != null;
        C11791os c11791os = c11791osArr[0];
        if (z) {
            return c11791os.m55425m9();
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final C11723d3 m55406x1(String str) {
        C11791os c11791osM55392h4 = m55392h4(m55386du(str));
        return c11791osM55392h4 == null ? new C11723d3(this) : c11791osM55392h4.m55377up();
    }

    /* JADX INFO: renamed from: k4 */
    public final C11791os m55395k4(String str, AbstractC11760jd.k4 k4Var, AbstractC11812sq abstractC11812sq, byte[] bArr) {
        if (k4Var != null) {
            String strM67402k4 = C14113y2.m67402k4(str, Integer.valueOf(k4Var.mo5039k4()));
            while (this.f39868du.containsItem(strM67402k4)) {
                strM67402k4 = C14113y2.m67402k4(str, Integer.valueOf(k4Var.mo5039k4()));
            }
            str = strM67402k4;
        }
        C11791os c11791os = new C11791os(this, str, abstractC11812sq, bArr);
        if (C7019kk.m27469x1(abstractC11812sq, C11738ew.class)) {
            throw new ArgumentException(C14113y2.m67408k4("You can't directly add part of RelationshipsPartType content type. ", "RelationshipsPartType-part is added automatically."));
        }
        if (C7019kk.m27469x1(abstractC11812sq, AbstractC11714bv.class)) {
            c11791os.m55376ks();
        }
        m55408x1(c11791os);
        return c11791os;
    }

    /* JADX INFO: renamed from: kk */
    public final void m55403kk(C11791os c11791os) {
        if (c11791os == null) {
            throw new ArgumentNullException("relationshipsEntry");
        }
        if (!C7019kk.m27469x1(c11791os.m55372fa(), C11738ew.class)) {
            throw new InvalidDataException("The part content has not relationships content type.");
        }
        C3152yj c3152yj = new C3152yj();
        try {
            c11791os.m55377up().m55307k4(c3152yj, c11791os.m55427x1());
            c11791os.m55423k4(c3152yj.toArray());
        } finally {
            c3152yj.dispose();
        }
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd
    /* JADX INFO: renamed from: to */
    public void mo55326to() {
        if (this.f39873x1 == null) {
            this.f39873x1 = new SortedList<>(AbstractC14070jw.m66790x1());
        }
        if (this.f39872to == null) {
            this.f39872to = new List<>();
        }
        if (this.f39869h4 == null) {
            this.f39869h4 = new List();
        }
        this.f39871m9 = new Dictionary<>();
        IGenericEnumerator<C12262lr> it = m55347kk().iterator();
        while (it.hasNext()) {
            try {
                C12262lr next = it.next();
                if (!next.m57329ck()) {
                    next.m57343k4(C14113y2.m67393k4(next.m57356to(), IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX));
                    m55398k4(next);
                }
                this.f39871m9.set_Item(next.m57356to(), next);
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
        C11773lr.m55350k4(this.f39873x1);
        this.f39871m9 = null;
        m55387up();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m55407x1(AbstractC3150x6 abstractC3150x6, boolean z, AbstractC3174jd abstractC3174jd) {
        m55344k4(abstractC3150x6, z, abstractC3174jd);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55396k4(AbstractC3150x6 abstractC3150x6) {
        C12599kk c12599kk = new C12599kk();
        IGenericEnumerator<C11791os> it = this.f39873x1.getValues().iterator();
        while (it.hasNext()) {
            try {
                C11791os next = it.next();
                if (C7019kk.m27469x1(next.m55372fa(), C11738ew.class)) {
                    if (next.m55377up().m55301k4() != 0) {
                        m55403kk(next);
                    }
                }
                AbstractC3150x6 abstractC3150x6M55425m9 = next.m55425m9();
                this.f39869h4.addItem(abstractC3150x6M55425m9);
                C12596h4 c12596h4 = new C12596h4(next.m55427x1(), next.m55372fa().mo55273k4());
                c12596h4.m58801k4(abstractC3150x6M55425m9);
                c12599kk.m58793x1().m58814k4(c12596h4);
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
        c12599kk.mo58790k4(abstractC3150x6);
        abstractC3150x6.flush();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m55408x1(C11791os c11791os) {
        c11791os.m55420k4(this);
        this.f39873x1.addItem(c11791os.m55427x1(), c11791os);
        mo55279k4(c11791os);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55397k4(AbstractC3150x6 abstractC3150x6, AbstractC3174jd abstractC3174jd) {
        m55344k4(abstractC3150x6, true, abstractC3174jd);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55398k4(C12262lr c12262lr) {
        C11791os c11791os = new C11791os(this, c12262lr);
        this.f39873x1.addItem(c11791os.m55427x1(), c11791os);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55399k4(C12275wy c12275wy) {
        m55391fa();
        IGenericEnumerator<C11791os> it = this.f39873x1.getValues().iterator();
        while (it.hasNext()) {
            try {
                C11791os next = it.next();
                if (C7019kk.m27469x1(next.m55372fa(), C11738ew.class)) {
                    if (next.m55377up().m55301k4() != 0) {
                        m55403kk(next);
                    }
                }
                c12275wy.m57479k4(!next.m55372fa().mo55297kk());
                AbstractC3150x6 abstractC3150x6M55425m9 = next.m55425m9();
                this.f39869h4.addItem(abstractC3150x6M55425m9);
                c12275wy.m57472k4(next.m55424kk(), (String) null, abstractC3150x6M55425m9);
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
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55400k4(C12596h4 c12596h4) {
        C11791os c11791os = new C11791os(this, c12596h4.m58800k4(), C11826u5.m55410k4(c12596h4.m58802kk()), c12596h4.m58798du().toArray());
        this.f39873x1.addItem(c11791os.m55427x1(), c11791os);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55401k4(C12599kk c12599kk, AbstractC3174jd abstractC3174jd) {
        if (this.f39873x1 == null) {
            this.f39873x1 = new SortedList<>(AbstractC14070jw.m66790x1());
        }
        if (this.f39872to == null) {
            this.f39872to = new List<>();
        }
        if (this.f39869h4 == null) {
            this.f39869h4 = new List();
        }
        IGenericEnumerator<C12596h4> it = c12599kk.m58793x1().iterator();
        while (it.hasNext()) {
            try {
                m55400k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m55387up();
    }
}
