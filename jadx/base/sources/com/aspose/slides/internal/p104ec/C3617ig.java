package com.aspose.slides.internal.p104ec;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p356qb.C9815c5;
import com.aspose.slides.internal.p356qb.C9820h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.ig */
/* JADX INFO: loaded from: classes3.dex */
public class C3617ig {

    /* JADX INFO: renamed from: k4 */
    private C3613gf f10049k4;

    /* JADX INFO: renamed from: kk */
    private Dictionary<String, C3647um> f10050kk;

    /* JADX INFO: renamed from: x1 */
    private C3604ck f10051x1;

    public C3617ig(int i, String str) {
        this.f10050kk = new Dictionary<>();
        this.f10049k4 = new C3613gf();
        this.f10051x1 = new C3604ck(i, str);
    }

    /* JADX INFO: renamed from: du */
    private void m14747du(C9815c5 c9815c5) {
        C9820h4 c9820h4 = new C9820h4("dir");
        this.f10051x1.m14709k4(c9820h4);
        c9815c5.m48340du(c9820h4);
    }

    /* JADX INFO: renamed from: h4 */
    private void m14748h4(C9815c5 c9815c5) {
        List.Enumerator<C3664yj> it = this.f10051x1.m14710kk().m14700x1().iterator();
        while (it.hasNext()) {
            try {
                C3664yj next = it.next();
                C9820h4 c9820h4 = (C9820h4) C7019kk.m27452k4((Object) c9815c5.m48344to(next.m14860k4().m14786x1()), C9820h4.class);
                if (c9820h4 == null) {
                    throw new InvalidOperationException();
                }
                if (c9820h4.m48375fa() > 0) {
                    this.f10050kk.addItem(next.m14860k4().m14786x1(), new C3647um(c9820h4, next, this.f10051x1));
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
    }

    /* JADX INFO: renamed from: kk */
    private void m14750kk(C9815c5 c9815c5) {
        C9820h4 c9820h4 = new C9820h4("_VBA_PROJECT");
        this.f10049k4.m14736k4(c9820h4);
        c9815c5.m48340du(c9820h4);
    }

    /* JADX INFO: renamed from: m9 */
    private void m14751m9(C9815c5 c9815c5) {
        Dictionary.Enumerator<String, C3647um> it = this.f10050kk.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                C9820h4 c9820h4 = new C9820h4((String) next.getKey());
                ((C3647um) next.getValue()).m14809k4(c9820h4);
                c9815c5.m48340du(c9820h4);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m14752to(C9815c5 c9815c5) {
        C9820h4 c9820h4 = (C9820h4) C7019kk.m27452k4((Object) c9815c5.m48344to("dir"), C9820h4.class);
        if (c9820h4 == null) {
            throw new C3620j5("Can't read VBA project");
        }
        if (c9820h4.m48375fa() > 0) {
            this.f10051x1 = new C3604ck(c9820h4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C3604ck m14754k4() {
        return this.f10051x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final Dictionary<String, C3647um> m14758x1() {
        return this.f10050kk;
    }

    public C3617ig(C9815c5 c9815c5) {
        this.f10050kk = new Dictionary<>();
        if (c9815c5 == null) {
            throw new ArgumentNullException();
        }
        if (!"VBA".equals(c9815c5.m48372ck())) {
            throw new InvalidOperationException();
        }
        m14753x1(c9815c5);
        m14752to(c9815c5);
        m14748h4(c9815c5);
    }

    /* JADX INFO: renamed from: k4 */
    private C3647um m14749k4(C3664yj c3664yj) {
        C3647um c3647um = new C3647um(c3664yj, this.f10051x1);
        this.f10050kk.addItem(c3664yj.m14860k4().m14786x1(), c3647um);
        return c3647um;
    }

    /* JADX INFO: renamed from: x1 */
    private void m14753x1(C9815c5 c9815c5) {
        C9820h4 c9820h4 = (C9820h4) C7019kk.m27452k4((Object) c9815c5.m48344to("_VBA_PROJECT"), C9820h4.class);
        if (c9820h4 == null) {
            throw new C3620j5("Can't read VBA project");
        }
        if (c9820h4.m48375fa() > 0) {
            this.f10049k4 = new C3613gf(c9820h4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C3647um m14755k4(String str) {
        if (this.f10050kk.containsKey(str)) {
            throw new ArgumentException(C14113y2.m67402k4("Module with name {0} already exists", str));
        }
        return m14749k4(this.f10051x1.m14707k4(str));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m14759x1(String str) {
        if (!this.f10050kk.containsKey(str)) {
            throw new ArgumentException(C14113y2.m67402k4("Module with name {0} is not exists", str));
        }
        this.f10051x1.m14712x1(str);
        this.f10050kk.removeItemByKey(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14756k4(C9815c5 c9815c5) {
        m14750kk(c9815c5);
        m14747du(c9815c5);
        m14751m9(c9815c5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14757k4(String str, String str2) {
        int iM14815x1 = this.f10051x1.m14706k4().m14839k4().m14815x1() & 65535;
        C3653w6 c3653w6 = new C3653w6(iM14815x1);
        c3653w6.m14829k4(new C3609em(iM14815x1, str));
        c3653w6.m14830k4(new C3637ri(iM14815x1, str2));
        this.f10051x1.m14708k4(c3653w6);
    }
}
