package com.aspose.slides.internal.p383rp;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p262m1.C6303kk;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p299ni.InterfaceC6900ck;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.AbstractC13605ks;
import com.aspose.slides.internal.p550zi.AbstractC13613um;
import com.aspose.slides.internal.p550zi.C13616v4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.rp.dy */
/* JADX INFO: loaded from: classes4.dex */
public final class C10032dy extends AbstractC13613um {

    /* JADX INFO: renamed from: k4 */
    private final List<C10037m9> f36080k4 = new List<>();

    /* JADX INFO: renamed from: kk */
    private C10037m9 f36081kk;

    /* JADX INFO: renamed from: x1 */
    private int f36082x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.dy$k4 */
    public static class k4 implements InterfaceC6900ck {

        /* JADX INFO: renamed from: k4 */
        private final C10032dy f36083k4;

        public k4(C10032dy c10032dy) {
            this.f36083k4 = c10032dy;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
        /* JADX INFO: renamed from: ix */
        public boolean mo10016ix() {
            return this.f36083k4.f36081kk.mo10016ix();
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
        /* JADX INFO: renamed from: k4 */
        public void mo10017k4(C12014ne c12014ne, C13616v4 c13616v4, InterfaceC6899c5 interfaceC6899c5) {
            this.f36083k4.m62823m9();
            this.f36083k4.f36081kk.mo10017k4(c12014ne.Clone(), c13616v4, interfaceC6899c5);
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6900ck
        /* JADX INFO: renamed from: x1 */
        public void mo10018x1(C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) {
            this.f36083k4.m62823m9();
            this.f36083k4.m49307qq().mo10018x1(c12014ne.Clone(), interfaceC6908m9);
        }
    }

    public C10032dy(C10037m9[] c10037m9Arr) {
        this.f36082x1 = 18761;
        if (c10037m9Arr == null) {
            throw new ArgumentNullException("frames");
        }
        if (c10037m9Arr.length > 0) {
            m49305k4(c10037m9Arr);
            m49304k4(c10037m9Arr[0]);
            this.f36082x1 = m49307qq().m49351qq().m26576kk();
        }
        m62805k4(new k4(this));
    }

    /* JADX INFO: renamed from: ar */
    public C10037m9[] m49303ar() {
        m62823m9();
        C10037m9[] c10037m9Arr = new C10037m9[this.f36080k4.size()];
        this.f36080k4.copyToTArray(c10037m9Arr, 0);
        return c10037m9Arr;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: jd */
    public int mo10009jd() {
        m62823m9();
        return m49307qq().mo10009jd();
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13599fa
    /* JADX INFO: renamed from: kk */
    public final void mo10011kk() {
        for (C10037m9 c10037m9 : m49303ar()) {
            c10037m9.mo10011kk();
        }
    }

    /* JADX INFO: renamed from: ks */
    public int m49306ks() {
        m62823m9();
        return this.f36082x1;
    }

    /* JADX INFO: renamed from: qq */
    public C10037m9 m49307qq() {
        m62823m9();
        C10037m9 c10037m9 = this.f36081kk;
        if (c10037m9 != null) {
            return c10037m9;
        }
        throw new InvalidOperationException("TiffImageException: There is no active frame selected.");
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13613um, com.aspose.slides.internal.p550zi.AbstractC13605ks, com.aspose.slides.internal.p550zi.AbstractC13599fa, com.aspose.slides.internal.p550zi.C13614up
    /* JADX INFO: renamed from: to */
    public void mo24306to() {
        m62823m9();
        Iterator<C10037m9> it = this.f36080k4.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.f36080k4.clear();
        this.f36081kk = null;
        super.mo24306to();
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: up */
    public int mo10012up() {
        m62823m9();
        return m49307qq().mo10012up();
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13599fa
    /* JADX INFO: renamed from: x1 */
    public void mo10013x1(AbstractC3150x6 abstractC3150x6) {
        m62823m9();
        m49300k4(C6303kk.m25828k4(abstractC3150x6, this.f36082x1));
    }

    /* JADX INFO: renamed from: k4 */
    private void m49300k4(C6304x1 c6304x1) {
        m62823m9();
        c6304x1.m62861x1().seek(0L, 0);
        C10030ck.m49274k4(c6304x1);
        for (int i = 0; i < this.f36080k4.size(); i++) {
            C10037m9 c10037m9 = this.f36080k4.get_Item(i);
            boolean z = true;
            if (i != this.f36080k4.size() - 1) {
                z = false;
            }
            C10037m9.m49348k4(c10037m9, c6304x1, z, c10037m9.m49351qq(), c10037m9.m49349ar());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m49304k4(C10037m9 c10037m9) {
        m62823m9();
        if (c10037m9 != null && c10037m9.m62754c5() != this) {
            throw new InvalidOperationException("TiffImageException: The active frame cannot be set as it belongs to another image.");
        }
        this.f36081kk = c10037m9;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13599fa
    /* JADX INFO: renamed from: x1 */
    public final boolean mo10014x1() {
        boolean zMo10014x1 = true;
        for (C10037m9 c10037m9 : m49303ar()) {
            zMo10014x1 = c10037m9.mo10014x1();
            if (!zMo10014x1) {
                return zMo10014x1;
            }
        }
        return zMo10014x1;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13613um
    /* JADX INFO: renamed from: k4 */
    public void mo10010k4(C12014ne c12014ne, int[] iArr) {
        m62823m9();
        m49307qq().m62816x1(c12014ne.Clone(), iArr);
    }

    /* JADX INFO: renamed from: k4 */
    public void m49305k4(C10037m9[] c10037m9Arr) {
        m62823m9();
        if (c10037m9Arr == null) {
            throw new ArgumentNullException("TiffImageException: Frames parameter is null");
        }
        for (int i = 0; i < c10037m9Arr.length; i++) {
            C10037m9 c10037m9 = c10037m9Arr[i];
            if (c10037m9 == null) {
                throw new ArgumentNullException("TiffImageException: Frame is null or not TiffFrame type");
            }
            if (c10037m9.m62754c5() != this && c10037m9Arr[i].m62754c5() != null) {
                throw new ArgumentException("TiffImageException: Frame belongs to other image");
            }
        }
        for (C10037m9 c10037m92 : c10037m9Arr) {
            c10037m92.m62760k4((AbstractC13605ks) this);
        }
        this.f36080k4.addRange(AbstractC14092to.m67204k4((Object[]) c10037m9Arr));
    }
}
