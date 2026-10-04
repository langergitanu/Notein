package com.aspose.slides.internal.p550zi;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p299ni.InterfaceC6900ck;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p299ni.InterfaceC6902dy;
import com.aspose.slides.internal.p299ni.InterfaceC6904h4;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p299ni.InterfaceC6909to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p515xz.C12754k4;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.um */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13613um extends AbstractC13605ks implements InterfaceC6900ck {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC6900ck f45198k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC6909to f45199kk;

    /* JADX INFO: renamed from: to */
    private int f45200to;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC6904h4 f45201x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.zi.um$du */
    public static class du implements InterfaceC6908m9 {

        /* JADX INFO: renamed from: k4 */
        private int[] f45202k4;

        /* JADX INFO: renamed from: x1 */
        private C12014ne f45203x1;

        public du(C12014ne c12014ne) {
            C12014ne c12014ne2 = new C12014ne();
            this.f45203x1 = c12014ne2;
            c12014ne.CloneTo(c12014ne2);
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6908m9
        /* JADX INFO: renamed from: k4 */
        public void mo9843k4(C12014ne c12014ne, int[] iArr, C12016rv c12016rv, C12016rv c12016rv2) {
            int iM56663c5;
            if (c12014ne.equals(C7019kk.m27451k4(this.f45203x1))) {
                this.f45202k4 = iArr;
                return;
            }
            C12014ne c12014neClone = C12014ne.m56656k4(this.f45203x1.Clone(), c12014ne.Clone()).Clone();
            if (c12014neClone.m56663c5() <= 0 || c12014neClone.m56683x1() <= 0) {
                return;
            }
            if (this.f45202k4 == null) {
                try {
                    this.f45202k4 = new int[(int) (((long) this.f45203x1.m56663c5()) * ((long) this.f45203x1.m56683x1()))];
                } catch (OverflowException unused) {
                    throw new C12754k4("Cannot allocate so many bytes. Use LoadPartialPixels instead.");
                } catch (OutOfMemoryError unused2) {
                    throw new C12754k4("Cannot allocate so many bytes. Use LoadPartialPixels instead.");
                }
            }
            int i = 0;
            if (c12014ne.m56681to() == this.f45203x1.m56681to() && c12014ne.m56668h4() == this.f45203x1.m56668h4()) {
                int iM56663c52 = this.f45203x1.m56663c5() * (c12014ne.m56666dy() - this.f45203x1.m56666dy());
                if (iM56663c52 < 0) {
                    i = iM56663c52 * (-1);
                    iM56663c52 = 0;
                }
                System.arraycopy(iArr, i, this.f45202k4, iM56663c52, c12014neClone.m56683x1() * c12014neClone.m56663c5());
                return;
            }
            int iM56666dy = c12014ne.m56666dy() - this.f45203x1.m56666dy();
            if (iM56666dy < 0) {
                iM56663c5 = c12014ne.m56663c5() * (this.f45203x1.m56666dy() - c12014ne.m56666dy());
                iM56666dy = 0;
            } else {
                iM56663c5 = 0;
            }
            int iM56681to = c12014ne.m56681to() - this.f45203x1.m56681to();
            if (iM56681to < 0) {
                iM56663c5 += iM56681to * (-1);
                iM56681to = 0;
            }
            while (i < c12014neClone.m56683x1()) {
                System.arraycopy(iArr, (c12014ne.m56663c5() * i) + iM56663c5, this.f45202k4, (this.f45203x1.m56663c5() * iM56666dy) + iM56681to, c12014neClone.m56663c5());
                i++;
                iM56666dy++;
            }
        }

        /* JADX INFO: renamed from: k4 */
        public int[] m62819k4() {
            return this.f45202k4;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.zi.um$k4 */
    public static class k4 implements InterfaceC6902dy {

        /* JADX INFO: renamed from: k4 */
        private final InterfaceC6908m9 f45204k4;

        /* JADX INFO: renamed from: x1 */
        private final AbstractC13613um f45205x1;

        public k4(AbstractC13613um abstractC13613um, InterfaceC6908m9 interfaceC6908m9) {
            this.f45205x1 = abstractC13613um;
            this.f45204k4 = interfaceC6908m9;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6902dy
        /* JADX INFO: renamed from: k4 */
        public void mo9818k4(C12014ne c12014ne) {
            this.f45204k4.mo9843k4(c12014ne.Clone(), this.f45205x1.m62817x1(c12014ne.Clone()), c12014ne.m56665du().Clone(), new C12016rv(c12014ne.m56668h4(), c12014ne.m56670k4()));
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.zi.um$kk */
    public static class kk implements InterfaceC6902dy {

        /* JADX INFO: renamed from: k4 */
        private final InterfaceC6900ck f45206k4;

        /* JADX INFO: renamed from: x1 */
        private final InterfaceC6908m9 f45207x1;

        public kk(InterfaceC6900ck interfaceC6900ck, InterfaceC6908m9 interfaceC6908m9) {
            this.f45206k4 = interfaceC6900ck;
            this.f45207x1 = interfaceC6908m9;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6902dy
        /* JADX INFO: renamed from: k4 */
        public void mo9818k4(C12014ne c12014ne) {
            this.f45206k4.mo10018x1(c12014ne.Clone(), this.f45207x1);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.zi.um$to */
    public static class to implements InterfaceC6900ck {

        /* JADX INFO: renamed from: k4 */
        private final AbstractC13613um f45208k4;

        public to(AbstractC13613um abstractC13613um) {
            this.f45208k4 = abstractC13613um;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
        /* JADX INFO: renamed from: ix */
        public boolean mo10016ix() {
            return true;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
        /* JADX INFO: renamed from: k4 */
        public void mo10017k4(C12014ne c12014ne, C13616v4 c13616v4, InterfaceC6899c5 interfaceC6899c5) {
            this.f45208k4.m62806k4(c12014ne.Clone(), interfaceC6899c5, c13616v4);
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6900ck
        /* JADX INFO: renamed from: x1 */
        public void mo10018x1(C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) {
            this.f45208k4.m62807k4(c12014ne.Clone(), interfaceC6908m9);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.zi.um$x1 */
    public static class x1 implements InterfaceC6902dy {

        /* JADX INFO: renamed from: k4 */
        private final InterfaceC6899c5 f45209k4;

        /* JADX INFO: renamed from: kk */
        private final C13616v4 f45210kk;

        /* JADX INFO: renamed from: x1 */
        private final AbstractC13613um f45211x1;

        public x1(AbstractC13613um abstractC13613um, InterfaceC6899c5 interfaceC6899c5, C13616v4 c13616v4) {
            this.f45211x1 = abstractC13613um;
            this.f45209k4 = interfaceC6899c5;
            this.f45210kk = c13616v4;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6902dy
        /* JADX INFO: renamed from: k4 */
        public void mo9818k4(C12014ne c12014ne) {
            this.f45209k4.mo16292k4(c12014ne.Clone(), this.f45211x1.m62808k4(c12014ne.Clone(), this.f45210kk), c12014ne.m56665du().Clone(), new C12016rv(c12014ne.m56668h4(), c12014ne.m56670k4()));
        }
    }

    public AbstractC13613um() {
        this.f45198k4 = new to(this);
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
    /* JADX INFO: renamed from: ix */
    public boolean mo10016ix() {
        m62823m9();
        return this.f45198k4.mo10016ix();
    }

    /* JADX INFO: renamed from: k4 */
    public void m62805k4(InterfaceC6900ck interfaceC6900ck) {
        if (interfaceC6900ck == null) {
            throw new ArgumentNullException("value");
        }
        InterfaceC6900ck interfaceC6900ck2 = this.f45198k4;
        if (interfaceC6900ck != interfaceC6900ck2) {
            IDisposable iDisposable = (IDisposable) C7019kk.m27452k4((Object) interfaceC6900ck2, IDisposable.class);
            if (iDisposable != null) {
                iDisposable.dispose();
            }
            this.f45198k4 = interfaceC6900ck;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo10010k4(C12014ne c12014ne, int[] iArr);

    /* JADX INFO: renamed from: kk */
    public void m62809kk(C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) {
        C13617wl.m62840k4(c12014ne.Clone(), new kk(this.f45198k4, interfaceC6908m9));
    }

    /* JADX INFO: renamed from: ne */
    public int m62812ne() {
        return this.f45200to;
    }

    /* JADX INFO: renamed from: rv */
    public InterfaceC6904h4 m62813rv() {
        return this.f45201x1;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks, com.aspose.slides.internal.p550zi.AbstractC13599fa, com.aspose.slides.internal.p550zi.C13614up
    /* JADX INFO: renamed from: to */
    public void mo24306to() {
        IDisposable iDisposable = (IDisposable) C7019kk.m27452k4((Object) this.f45198k4, IDisposable.class);
        if (iDisposable != null) {
            iDisposable.dispose();
        }
        this.f45198k4 = null;
        super.mo24306to();
    }

    /* JADX INFO: renamed from: u4 */
    public boolean mo24307u4() {
        return false;
    }

    /* JADX INFO: renamed from: uz */
    public int mo24308uz() {
        return 0;
    }

    /* JADX INFO: renamed from: wl */
    public InterfaceC6900ck m62815wl() {
        return this.f45198k4;
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6900ck
    /* JADX INFO: renamed from: x1 */
    public void mo10018x1(C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) {
        m62823m9();
        m62803k4(c12014ne.Clone(), true, interfaceC6908m9);
    }

    /* JADX INFO: renamed from: x6 */
    public InterfaceC6909to m62818x6() {
        return this.f45199kk;
    }

    public AbstractC13613um(InterfaceC6901du interfaceC6901du) {
        super(interfaceC6901du);
        this.f45198k4 = new to(this);
    }

    /* JADX INFO: renamed from: k4 */
    public void m62806k4(C12014ne c12014ne, InterfaceC6899c5 interfaceC6899c5, C13616v4 c13616v4) {
        C13617wl.m62840k4(c12014ne.Clone(), new x1(this, interfaceC6899c5, c13616v4));
    }

    /* JADX INFO: renamed from: kk */
    public void m62810kk(C12014ne c12014ne, int[] iArr) {
        m62816x1(c12014ne.Clone(), iArr);
    }

    /* JADX INFO: renamed from: to */
    public int[] m62814to(C12014ne c12014ne) {
        return m62811kk(c12014ne.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public void m62816x1(C12014ne c12014ne, int[] iArr) {
        m62823m9();
        m62800k4(c12014ne.Clone(), iArr, true);
    }

    /* JADX INFO: renamed from: k4 */
    public void m62807k4(C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) {
        C13617wl.m62840k4(c12014ne.Clone(), new k4(this, interfaceC6908m9));
    }

    /* JADX INFO: renamed from: kk */
    public int[] m62811kk(C12014ne c12014ne) {
        m62823m9();
        du duVar = new du(c12014ne.Clone());
        m62803k4(c12014ne.Clone(), true, (InterfaceC6908m9) duVar);
        return duVar.m62819k4();
    }

    /* JADX INFO: renamed from: x1 */
    public int[] m62817x1(C12014ne c12014ne) {
        int iMo27031x1 = m62755ck() != null ? m62755ck().mo27031x1(0) : 0;
        try {
            int iM56663c5 = (int) (((long) c12014ne.m56663c5()) * ((long) c12014ne.m56683x1()));
            int[] iArr = new int[iM56663c5];
            for (int i = 0; i < iM56663c5; i++) {
                iArr[i] = iMo27031x1;
            }
            return iArr;
        } catch (OverflowException unused) {
            throw new OutOfMemoryException();
        }
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
    /* JADX INFO: renamed from: k4 */
    public void mo10017k4(C12014ne c12014ne, C13616v4 c13616v4, InterfaceC6899c5 interfaceC6899c5) {
        m62823m9();
        m62801k4(c12014ne.Clone(), true, c13616v4, interfaceC6899c5);
    }

    /* JADX INFO: renamed from: k4 */
    private void m62800k4(C12014ne c12014ne, int[] iArr, boolean z) {
        m62823m9();
        if (z) {
            mo10010k4(c12014ne.Clone(), iArr);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m62808k4(C12014ne c12014ne, C13616v4 c13616v4) {
        int iM62830kk;
        if (c13616v4 == null) {
            throw new ArgumentNullException("rawDataSettings");
        }
        int iM56681to = c12014ne.m56681to();
        int iM56668h4 = c12014ne.m56668h4();
        if (iM56681to == 0 && iM56668h4 == mo10012up()) {
            iM62830kk = c13616v4.m62830kk();
        } else {
            int iM62788to = c13616v4.m62824k4().m62788to();
            iM62830kk = (((iM62788to * iM56668h4) + 7) / 8) - ((iM56681to * iM62788to) / 8);
        }
        try {
            return new byte[(int) (((long) iM62830kk) * ((long) c12014ne.m56683x1()))];
        } catch (OverflowException unused) {
            throw new OutOfMemoryException();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m62801k4(C12014ne c12014ne, boolean z, C13616v4 c13616v4, InterfaceC6899c5 interfaceC6899c5) {
        m62823m9();
        m62758k4(c12014ne.Clone()).CloneTo(c12014ne);
        byte[] bArr = new byte[4];
        m62802k4(c12014ne.Clone(), bArr, z, c13616v4, interfaceC6899c5);
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m62802k4(C12014ne c12014ne, byte[] bArr, boolean z, C13616v4 c13616v4, InterfaceC6899c5 interfaceC6899c5) {
        this.f45198k4.mo10017k4(c12014ne.Clone(), c13616v4, interfaceC6899c5);
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private int[] m62803k4(C12014ne c12014ne, boolean z, InterfaceC6908m9 interfaceC6908m9) {
        m62823m9();
        m62758k4(c12014ne.Clone()).CloneTo(c12014ne);
        return m62804k4(c12014ne.Clone(), new int[1], z, interfaceC6908m9);
    }

    /* JADX INFO: renamed from: k4 */
    private int[] m62804k4(C12014ne c12014ne, int[] iArr, boolean z, InterfaceC6908m9 interfaceC6908m9) {
        m62809kk(c12014ne.Clone(), interfaceC6908m9);
        return null;
    }
}
