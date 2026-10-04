package com.aspose.slides.internal.p245la;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p185il.C5102k4;
import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p299ni.InterfaceC6900ck;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p470w5.C11887kk;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.AbstractC13599fa;
import com.aspose.slides.internal.p550zi.AbstractC13605ks;
import com.aspose.slides.internal.p550zi.AbstractC13613um;
import com.aspose.slides.internal.p550zi.C13616v4;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.la.h4 */
/* JADX INFO: loaded from: classes.dex */
public final class C6015h4 extends AbstractC13613um {

    /* JADX INFO: renamed from: k4 */
    private final C6019to f17022k4;

    /* JADX INFO: renamed from: kk */
    private C11887kk f17023kk;

    /* JADX INFO: renamed from: to */
    private boolean f17024to;

    /* JADX INFO: renamed from: x1 */
    private final List<InterfaceC6018m9> f17025x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.la.h4$k4 */
    public static class k4 implements InterfaceC6900ck {

        /* JADX INFO: renamed from: k4 */
        private final C6015h4 f17026k4;

        public k4(C6015h4 c6015h4) {
            this.f17026k4 = c6015h4;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
        /* JADX INFO: renamed from: ix */
        public boolean mo10016ix() {
            return this.f17026k4.f17023kk.mo10016ix();
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
        /* JADX INFO: renamed from: k4 */
        public void mo10017k4(C12014ne c12014ne, C13616v4 c13616v4, InterfaceC6899c5 interfaceC6899c5) {
            this.f17026k4.f17023kk.mo10017k4(c12014ne.Clone(), c13616v4, interfaceC6899c5);
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6900ck
        /* JADX INFO: renamed from: x1 */
        public void mo10018x1(C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) {
            if (this.f17026k4.f17023kk == null) {
                throw new C5102k4("Cannot load pixels as no active GIF frame exists. Select an active frame first.");
            }
            this.f17026k4.f17023kk.mo10018x1(c12014ne.Clone(), interfaceC6908m9);
        }
    }

    public C6015h4(C6019to c6019to, InterfaceC6018m9[] interfaceC6018m9Arr, InterfaceC6901du interfaceC6901du, boolean z, C11887kk c11887kk) {
        super(interfaceC6901du);
        this.f17025x1 = new List<>();
        this.f17022k4 = c6019to;
        for (InterfaceC6018m9 interfaceC6018m9 : interfaceC6018m9Arr) {
            AbstractC13605ks abstractC13605ks = (AbstractC13605ks) C7019kk.m27452k4((Object) interfaceC6018m9, AbstractC13605ks.class);
            if (abstractC13605ks != null) {
                abstractC13605ks.m62760k4(this);
            }
        }
        this.f17025x1.addRange(AbstractC14092to.m67204k4((Object[]) interfaceC6018m9Arr));
        this.f17024to = z;
        this.f17023kk = c11887kk;
        m62805k4(new k4(this));
    }

    /* JADX INFO: renamed from: ar */
    public C6019to m24301ar() {
        return this.f17022k4;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: jd */
    public int mo10009jd() {
        return C7019kk.m27462to(Integer.valueOf(this.f17022k4.m24324kk()), 8);
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13599fa
    /* JADX INFO: renamed from: kk */
    public final void mo10011kk() {
        InterfaceC6018m9[] interfaceC6018m9ArrM24304ks = m24304ks();
        for (int i = 0; i < interfaceC6018m9ArrM24304ks.length; i++) {
            if (C7019kk.m27469x1(interfaceC6018m9ArrM24304ks[i], AbstractC13599fa.class)) {
                ((AbstractC13599fa) C7019kk.m27452k4((Object) interfaceC6018m9ArrM24304ks[i], AbstractC13599fa.class)).mo10011kk();
            }
        }
    }

    /* JADX INFO: renamed from: ks */
    public InterfaceC6018m9[] m24304ks() {
        return this.f17025x1.toArray(new InterfaceC6018m9[0]);
    }

    /* JADX INFO: renamed from: qq */
    public void m24305qq() {
        m62823m9();
        this.f17025x1.clear();
        this.f17023kk = null;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13613um, com.aspose.slides.internal.p550zi.AbstractC13605ks, com.aspose.slides.internal.p550zi.AbstractC13599fa, com.aspose.slides.internal.p550zi.C13614up
    /* JADX INFO: renamed from: to */
    public void mo24306to() {
        List.Enumerator<InterfaceC6018m9> it = this.f17025x1.iterator();
        while (it.hasNext()) {
            try {
                IDisposable iDisposable = (IDisposable) C7019kk.m27452k4((Object) it.next(), IDisposable.class);
                if (iDisposable != null) {
                    iDisposable.dispose();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f17025x1.clear();
        this.f17023kk = null;
        super.mo24306to();
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13613um
    /* JADX INFO: renamed from: u4 */
    public boolean mo24307u4() {
        return this.f17023kk.mo24307u4();
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: up */
    public int mo10012up() {
        return C7019kk.m27462to(Integer.valueOf(this.f17022k4.m24326x1()), 8);
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13613um
    /* JADX INFO: renamed from: uz */
    public int mo24308uz() {
        return this.f17023kk.mo24308uz();
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13599fa
    /* JADX INFO: renamed from: x1 */
    public void mo10013x1(AbstractC3150x6 abstractC3150x6) {
        m62823m9();
        C13618wy c13618wy = new C13618wy(abstractC3150x6);
        try {
            this.f17022k4.m24322k4(c13618wy);
            if (m62755ck() != null) {
                C6013du.m24295k4(c13618wy, m62755ck());
            }
            List.Enumerator<InterfaceC6018m9> it = this.f17025x1.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo24316k4(c13618wy.m62861x1());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (this.f17024to) {
                c13618wy.m62855k4((byte) 59);
            }
            c13618wy.m62862x1(c13618wy.m62853k4());
            c13618wy.dispose();
        } catch (Throwable th) {
            c13618wy.dispose();
            throw th;
        }
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: yj */
    public int mo24310yj() {
        if (m62755ck() == null || C7019kk.m27462to(Byte.valueOf(this.f17022k4.m24320k4()), 6) >= m62755ck().mo27029k4()) {
            return 0;
        }
        return m62755ck().mo27031x1(C7019kk.m27462to(Byte.valueOf(this.f17022k4.m24320k4()), 6));
    }

    /* JADX INFO: renamed from: k4 */
    public void m24302k4(InterfaceC6018m9 interfaceC6018m9) {
        m62823m9();
        if (interfaceC6018m9 == null) {
            throw new ArgumentNullException("block");
        }
        AbstractC13605ks abstractC13605ks = (AbstractC13605ks) C7019kk.m27452k4((Object) interfaceC6018m9, AbstractC13605ks.class);
        if (abstractC13605ks != null && abstractC13605ks.m62754c5() != null && abstractC13605ks.m62754c5() != this) {
            throw new ArgumentOutOfRangeException("block", "The block belongs to other image and cannot be added to this GIF image.");
        }
        this.f17025x1.addItem(interfaceC6018m9);
        if (abstractC13605ks != null) {
            abstractC13605ks.m62760k4(this);
        }
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: x1 */
    public void mo24309x1(InterfaceC6901du interfaceC6901du, InterfaceC6901du interfaceC6901du2) {
        if (interfaceC6901du2 != null && interfaceC6901du2.mo27029k4() != 2 && interfaceC6901du2.mo27029k4() != 4 && interfaceC6901du2.mo27029k4() != 8 && interfaceC6901du2.mo27029k4() != 16 && interfaceC6901du2.mo27029k4() != 32 && interfaceC6901du2.mo27029k4() != 64 && interfaceC6901du2.mo27029k4() != 128 && interfaceC6901du2.mo27029k4() != 256) {
            throw new C5102k4("The color palette cannot be changed as palette specified should contain entries count equal to power of 2. Minimal palette size is 2, maximal is 256.");
        }
        super.mo24309x1(interfaceC6901du, interfaceC6901du2);
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: k4 */
    public void mo24303k4(InterfaceC6901du interfaceC6901du, InterfaceC6901du interfaceC6901du2) {
        this.f17022k4.m24323k4(interfaceC6901du2 != null);
        if (interfaceC6901du2 != null) {
            this.f17022k4.m24321k4(interfaceC6901du2.mo27029k4());
        }
        super.mo24303k4(interfaceC6901du, interfaceC6901du2);
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13599fa
    /* JADX INFO: renamed from: x1 */
    public final boolean mo10014x1() {
        InterfaceC6018m9[] interfaceC6018m9ArrM24304ks = m24304ks();
        boolean zMo10014x1 = true;
        for (int i = 0; i < interfaceC6018m9ArrM24304ks.length; i++) {
            if (C7019kk.m27469x1(interfaceC6018m9ArrM24304ks[i], AbstractC13599fa.class) && !(zMo10014x1 = ((AbstractC13599fa) C7019kk.m27452k4((Object) interfaceC6018m9ArrM24304ks[i], AbstractC13599fa.class)).mo10014x1())) {
                return zMo10014x1;
            }
        }
        return zMo10014x1;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13613um
    /* JADX INFO: renamed from: k4 */
    public void mo10010k4(C12014ne c12014ne, int[] iArr) {
        C11887kk c11887kk = this.f17023kk;
        if (c11887kk == null) {
            throw new C5102k4("Cannot save pixels as no active GIF frame exists. Select an active frame first.");
        }
        c11887kk.m62816x1(c12014ne.Clone(), iArr);
    }
}
