package com.aspose.slides.internal.p464vq;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3036b3;
import com.aspose.slides.internal.p077d8.C3042ca;
import com.aspose.slides.internal.p077d8.C3044dc;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p077d8.C3081ri;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.AbstractC3151yd;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p532yu.C13129ny;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.yj */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11861yj implements IDisposable {

    /* JADX INFO: renamed from: du */
    private AbstractC13912i5 f39954du;

    /* JADX INFO: renamed from: dy */
    private AbstractC3150x6 f39955dy;

    /* JADX INFO: renamed from: h4 */
    private C3059ii f39956h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC11721ck f39957k4;

    /* JADX INFO: renamed from: kk */
    private boolean f39958kk = false;

    /* JADX INFO: renamed from: m9 */
    private C3152yj f39959m9;

    /* JADX INFO: renamed from: to */
    private AbstractC11830up f39960to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC11742fa f39961x1;

    public AbstractC11861yj(AbstractC11830up abstractC11830up, AbstractC11721ck abstractC11721ck) {
        this.f39960to = abstractC11830up;
        this.f39957k4 = abstractC11721ck;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 m55440k4(AbstractC3150x6 abstractC3150x6) {
        if (!this.f39960to.m55418jd().m55346k4()) {
            return abstractC3150x6;
        }
        C6765kp c6765kp = new C6765kp(new C3148wl(abstractC3150x6).mo13427dy());
        SortedDictionary.Enumerator<String, String> it = AbstractC11760jd.f39763k4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                c6765kp.m26794k4((String) next.getKey(), (String) next.getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return new C3152yj(AbstractC6747ar.m26635ix().mo26677to(c6765kp.toString()));
    }

    /* JADX INFO: renamed from: ck */
    public final C3059ii m55442ck() {
        return this.f39956h4;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        AbstractC3150x6 abstractC3150x6 = this.f39955dy;
        if (abstractC3150x6 != null) {
            abstractC3150x6.dispose();
        }
    }

    /* JADX INFO: renamed from: du */
    public AbstractC11830up mo3467du() {
        return this.f39960to;
    }

    /* JADX INFO: renamed from: fa */
    public void mo55330fa() {
        this.f39960to.m55422k4(true);
    }

    /* JADX INFO: renamed from: h4 */
    public AbstractC11742fa mo3468h4() {
        return this.f39961x1;
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC13912i5 m55443jd() {
        return this.f39954du;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo3469k4(String... strArr);

    /* JADX INFO: renamed from: m9 */
    public AbstractC11721ck mo3471m9() {
        return this.f39957k4;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: up */
    public void mo55332up() {
        if (this.f39958kk) {
            throw new C11726dl(C14113y2.m67408k4("Parsing must be started once time per instance of PartParser. ", "One instance of PartParser corresponds to one part."));
        }
        this.f39958kk = true;
        this.f39959m9 = new C3152yj();
        C3059ii c3059ii = new C3059ii(this.f39959m9, AbstractC6747ar.m26635ix(), mo3467du().m55418jd().m55348m9());
        this.f39956h4 = c3059ii;
        c3059ii.m66262x1(4);
        this.f39956h4.m66258k4(mo3467du().m55418jd().m55349x1() ? 1 : 0);
        this.f39956h4.mo65747x1(true);
    }

    /* JADX INFO: renamed from: yj */
    public void mo55333yj() {
        this.f39956h4.m66257k4();
        this.f39956h4.mo21896h4();
        this.f39956h4.mo21893du();
        mo3467du().m55423k4(this.f39959m9.toArray());
    }

    public AbstractC11861yj(AbstractC11830up abstractC11830up, AbstractC11742fa abstractC11742fa) {
        this.f39960to = abstractC11830up;
        this.f39961x1 = abstractC11742fa;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC3151yd m55441k4(C13129ny c13129ny, boolean z) {
        AbstractC3150x6 abstractC3150x6M55440k4 = m55440k4(mo3467du().m55425m9());
        this.f39955dy = abstractC3150x6M55440k4;
        if (z) {
            try {
                AbstractC3150x6 abstractC3150x6M12777k4 = C3036b3.m12777k4(abstractC3150x6M55440k4);
                this.f39955dy.dispose();
                this.f39955dy = abstractC3150x6M12777k4;
            } catch (RuntimeException e) {
                this.f39955dy.dispose();
                throw e;
            }
        }
        long position = this.f39955dy.getPosition();
        C3042ca c3042caM12775k4 = C3036b3.m12775k4(this.f39955dy, false);
        this.f39955dy.seek(position, 0);
        return new C3081ri(this.f39955dy, c3042caM12775k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55444k4(C13129ny c13129ny, SortedList<String, String> sortedList, String str, boolean z, boolean z2) {
        if (this.f39958kk) {
            throw new Exception(C14113y2.m67408k4("Parsing must be started once time per instance of PartParser. ", "One instance of PartParser corresponds to one part."));
        }
        this.f39958kk = true;
        this.f39954du = C3044dc.m12834k4(m55441k4(c13129ny, z2), c13129ny, sortedList, str, z, false);
    }
}
