package com.aspose.slides.internal.p329p4;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p020ae.C1366x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p4.to */
/* JADX INFO: loaded from: classes4.dex */
public class C7190to extends C7185jd implements IDisposable {

    /* JADX INFO: renamed from: du */
    private float f19760du;

    /* JADX INFO: renamed from: dy */
    private boolean f19761dy;

    /* JADX INFO: renamed from: h4 */
    private String f19762h4;

    /* JADX INFO: renamed from: m9 */
    private C7187kk f19765m9;

    /* JADX INFO: renamed from: to */
    private boolean f19766to;

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<C7188ks, Long> f19767x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private final List<C7180ck> f19764kk = new List<>();

    /* JADX INFO: renamed from: k4 */
    private Dictionary<C7188ks, C7184h4> f19763k4 = new Dictionary<>();

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        Dictionary.ValueCollection.Enumerator<C7188ks, C7184h4> it = this.f19763k4.getValues().iterator();
        while (it.hasNext()) {
            try {
                C7184h4 next = it.next();
                if (next.m27772kk() != null && C7019kk.m27469x1(next.m27772kk(), C7180ck.class)) {
                    ((C7180ck) next.m27772kk()).dispose();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m27828x1(true);
    }

    /* JADX INFO: renamed from: du */
    public final boolean m27829du() {
        return (m27837kk() == null || m27837kk().mo27768h4(C7182dy.f19539n0) == null) ? false : true;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m27830h4() {
        List.Enumerator<C7184h4> it = m27831k4(C7182dy.f19613ru).iterator();
        while (it.hasNext()) {
            try {
                C1366x1 c1366x1 = new C1366x1((C7180ck) it.next().m27772kk(), this);
                c1366x1.m8105kk();
                List.Enumerator<C7185jd> it2 = c1366x1.m8106to().iterator();
                while (it2.hasNext()) {
                    try {
                        C7184h4 c7184h4 = (C7184h4) it2.next();
                        C7188ks c7188ks = new C7188ks(c7184h4);
                        if (!this.f19763k4.containsKey(c7188ks) || this.f19763k4.get_Item(c7188ks) == null || this.f19763k4.get_Item(c7188ks).m27772kk() == null || (this.f19767x1.containsKey(c7188ks) && this.f19767x1.get_Item(c7188ks).longValue() == (-r2.m27769k4().m27752kk()))) {
                            m27832k4(c7188ks).m27771k4(c7184h4.m27772kk());
                        }
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

    /* JADX INFO: renamed from: k4 */
    public final List<C7184h4> m27831k4(C7182dy c7182dy) {
        List<C7184h4> list = new List<>();
        Dictionary.ValueCollection.Enumerator<C7188ks, C7184h4> it = this.f19763k4.getValues().iterator();
        while (it.hasNext()) {
            try {
                C7184h4 next = it.next();
                C7185jd c7185jdM27772kk = next.m27772kk();
                if (C7019kk.m27469x1(c7185jdM27772kk, C7187kk.class)) {
                    try {
                        C7185jd c7185jdMo27767fa = ((C7187kk) c7185jdM27772kk).mo27767fa(C7182dy.f19711xz);
                        if (c7185jdMo27767fa != null && C7019kk.m27469x1(c7185jdMo27767fa, C7182dy.class) && ((C7182dy) c7185jdMo27767fa).equals(c7182dy)) {
                            list.addItem(next);
                        }
                    } catch (RuntimeException unused) {
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: kk */
    public final C7187kk m27837kk() {
        return this.f19765m9;
    }

    /* JADX INFO: renamed from: m9 */
    public final List<C7185jd> m27838m9() {
        if (this.f19763k4 == null) {
            this.f19763k4 = new Dictionary<>();
        }
        List<C7185jd> list = new List<>(this.f19763k4.getValues().size());
        Dictionary.ValueCollection.Enumerator<C7188ks, C7184h4> it = this.f19763k4.getValues().iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m27839to() {
        return this.f19761dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m27840x1() {
        return this.f19760du;
    }

    /* JADX INFO: renamed from: x1 */
    private void m27827x1(String str) {
        this.f19762h4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7184h4 m27832k4(C7188ks c7188ks) {
        if (c7188ks == null) {
            return new C7184h4(null);
        }
        if (this.f19763k4.containsKey(c7188ks)) {
            return this.f19763k4.get_Item(c7188ks);
        }
        C7184h4 c7184h4 = new C7184h4(c7188ks.m27819k4(), c7188ks.m27820x1());
        this.f19763k4.addItem(c7188ks, c7184h4);
        return c7184h4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m27825k4(float f) {
        this.f19760du = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m27828x1(boolean z) {
        this.f19761dy = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27833k4(C7187kk c7187kk) {
        this.f19765m9 = c7187kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27834k4(C7187kk c7187kk, Dictionary<C7188ks, Long> dictionary) {
        m27833k4(c7187kk);
        Dictionary.Enumerator<C7188ks, Long> it = dictionary.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (!this.f19767x1.containsKey((C7188ks) next.getKey())) {
                    this.f19767x1.addItem((C7188ks) next.getKey(), (Long) next.getValue());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m27828x1(false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27835k4(String str) {
        if (!C14113y2.m67448x1(str, "%PDF-")) {
            m27826k4(true);
        }
        m27825k4(C14064he.m66707k4(C14113y2.m67443x1(str, 5, C14116yg.m67507x1(str.length(), 8) - 5), C11697x1.m55250kk()));
        m27827x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    private void m27826k4(boolean z) {
        this.f19766to = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m27836k4() {
        return this.f19766to;
    }
}
