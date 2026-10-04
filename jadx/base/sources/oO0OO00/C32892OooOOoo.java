package oO0OO00;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import oO0OOOO0.AbstractC32954OooO0oo;
import oO0OOOO0.C32951OooO0Oo;
import oO0OOOO0.C32952OooO0o0;
import oO0OOOO0.C32965OooOo0O;
import oO0OOOO0.InterfaceC32958OooOOOo;
import oO0OOOO0.InterfaceC32960OooOOo0;
import oO0OOOO0.OooO00o;
import oO0OOOO0.OooO0OO;

/* JADX INFO: renamed from: oO0OO00.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32892OooOOoo extends AbstractC32954OooO0oo implements InterfaceC32960OooOOo0 {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final C32892OooOOoo f118467OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final OooO00o f118468OooOooO = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f118469OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO0OOOO0.OooO0OO f118470OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f118471OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public List<C32889OooOOOo> f118472OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public byte f118473OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f118474OooOoo0;

    /* JADX INFO: renamed from: oO0OO00.OooOOoo$OooO00o */
    public static class OooO00o extends oO0OOOO0.OooO0O0<C32892OooOOoo> {
        @Override // oO0OOOO0.InterfaceC32959OooOOo
        public final Object OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
            return new C32892OooOOoo(c32951OooO0Oo, oooO0o);
        }
    }

    /* JADX INFO: renamed from: oO0OO00.OooOOoo$OooO0O0 */
    public static final class OooO0O0 extends AbstractC32954OooO0oo.OooO00o<C32892OooOOoo, OooO0O0> implements InterfaceC32960OooOOo0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f118475OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public List<C32889OooOOOo> f118477OooOoO0 = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f118476OooOoO = -1;

        @Override // oO0OOOO0.OooO00o.AbstractC20287OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final /* bridge */ /* synthetic */ OooO00o.AbstractC20287OooO00o Oooo0OO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            OooO0oO(c32951OooO0Oo, oooO0o);
            return this;
        }

        @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
        /* JADX INFO: renamed from: OooO0OO */
        public final AbstractC32954OooO0oo.OooO00o clone() {
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.OooO0o(OooO0o0());
            return oooO0O0;
        }

        @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
        public final /* bridge */ /* synthetic */ AbstractC32954OooO0oo.OooO00o OooO0Oo(AbstractC32954OooO0oo abstractC32954OooO0oo) {
            OooO0o((C32892OooOOoo) abstractC32954OooO0oo);
            return this;
        }

        public final void OooO0o(C32892OooOOoo c32892OooOOoo) {
            if (c32892OooOOoo == C32892OooOOoo.f118467OooOoo) {
                return;
            }
            if (!c32892OooOOoo.f118472OooOoO0.isEmpty()) {
                if (this.f118477OooOoO0.isEmpty()) {
                    this.f118477OooOoO0 = c32892OooOOoo.f118472OooOoO0;
                    this.f118475OooOo &= -2;
                } else {
                    if ((this.f118475OooOo & 1) != 1) {
                        this.f118477OooOoO0 = new ArrayList(this.f118477OooOoO0);
                        this.f118475OooOo |= 1;
                    }
                    this.f118477OooOoO0.addAll(c32892OooOOoo.f118472OooOoO0);
                }
            }
            if ((c32892OooOOoo.f118469OooOo & 1) == 1) {
                int i = c32892OooOOoo.f118471OooOoO;
                this.f118475OooOo |= 2;
                this.f118476OooOoO = i;
            }
            this.f119081OooOo0o = this.f119081OooOo0o.OooO0OO(c32892OooOOoo.f118470OooOo0o);
        }

        public final C32892OooOOoo OooO0o0() {
            C32892OooOOoo c32892OooOOoo = new C32892OooOOoo(this);
            int i = this.f118475OooOo;
            if ((i & 1) == 1) {
                this.f118477OooOoO0 = Collections.unmodifiableList(this.f118477OooOoO0);
                this.f118475OooOo &= -2;
            }
            c32892OooOOoo.f118472OooOoO0 = this.f118477OooOoO0;
            int i2 = (i & 2) != 2 ? 0 : 1;
            c32892OooOOoo.f118471OooOoO = this.f118476OooOoO;
            c32892OooOOoo.f118469OooOo = i2;
            return c32892OooOOoo;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0oO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            C32892OooOOoo c32892OooOOoo = null;
            try {
                try {
                    C32892OooOOoo.f118468OooOooO.getClass();
                    OooO0o(new C32892OooOOoo(c32951OooO0Oo, oooO0o));
                } catch (oO0OOOO0.OooOO0 e) {
                    C32892OooOOoo c32892OooOOoo2 = (C32892OooOOoo) e.f119095OooOo0o;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c32892OooOOoo = c32892OooOOoo2;
                        if (c32892OooOOoo != null) {
                            OooO0o(c32892OooOOoo);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c32892OooOOoo != null) {
                }
                throw th;
            }
        }

        @Override // oO0OOOO0.OooO00o.AbstractC20287OooO00o, oO0OOOO0.InterfaceC32958OooOOOo.OooO00o
        public final /* bridge */ /* synthetic */ InterfaceC32958OooOOOo.OooO00o Oooo0OO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            OooO0oO(c32951OooO0Oo, oooO0o);
            return this;
        }

        @Override // oO0OOOO0.InterfaceC32958OooOOOo.OooO00o
        public final InterfaceC32958OooOOOo build() {
            C32892OooOOoo c32892OooOOooOooO0o0 = OooO0o0();
            if (c32892OooOOooOooO0o0.isInitialized()) {
                return c32892OooOOooOooO0o0;
            }
            throw new C32965OooOo0O();
        }

        @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
        public final Object clone() throws CloneNotSupportedException {
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.OooO0o(OooO0o0());
            return oooO0O0;
        }
    }

    static {
        C32892OooOOoo c32892OooOOoo = new C32892OooOOoo();
        f118467OooOoo = c32892OooOOoo;
        c32892OooOOoo.f118472OooOoO0 = Collections.EMPTY_LIST;
        c32892OooOOoo.f118471OooOoO = -1;
    }

    public C32892OooOOoo(OooO0O0 oooO0O0) {
        this.f118473OooOoOO = (byte) -1;
        this.f118474OooOoo0 = -1;
        this.f118470OooOo0o = oooO0O0.f119081OooOo0o;
    }

    public static OooO0O0 OooO0Oo(C32892OooOOoo c32892OooOOoo) {
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.OooO0o(c32892OooOOoo);
        return oooO0O0;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.f118472OooOoO0.size(); i++) {
            c32952OooO0o0.OooOOOO(1, this.f118472OooOoO0.get(i));
        }
        if ((this.f118469OooOo & 1) == 1) {
            c32952OooO0o0.OooOOO0(2, this.f118471OooOoO);
        }
        c32952OooO0o0.OooOOo(this.f118470OooOo0o);
    }

    public final OooO0O0 OooO0o0() {
        return OooO0Oo(this);
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final int getSerializedSize() {
        int i = this.f118474OooOoo0;
        if (i != -1) {
            return i;
        }
        int iOooO0O0 = 0;
        for (int i2 = 0; i2 < this.f118472OooOoO0.size(); i2++) {
            iOooO0O0 += C32952OooO0o0.OooO0Oo(1, this.f118472OooOoO0.get(i2));
        }
        if ((this.f118469OooOo & 1) == 1) {
            iOooO0O0 += C32952OooO0o0.OooO0O0(2, this.f118471OooOoO);
        }
        int size = this.f118470OooOo0o.size() + iOooO0O0;
        this.f118474OooOoo0 = size;
        return size;
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final boolean isInitialized() {
        byte b = this.f118473OooOoOO;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f118472OooOoO0.size(); i++) {
            if (!this.f118472OooOoO0.get(i).isInitialized()) {
                this.f118473OooOoOO = (byte) 0;
                return false;
            }
        }
        this.f118473OooOoOO = (byte) 1;
        return true;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final InterfaceC32958OooOOOo.OooO00o newBuilderForType() {
        return new OooO0O0();
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final InterfaceC32958OooOOOo.OooO00o toBuilder() {
        return OooO0Oo(this);
    }

    public C32892OooOOoo() {
        this.f118473OooOoOO = (byte) -1;
        this.f118474OooOoo0 = -1;
        this.f118470OooOo0o = oO0OOOO0.OooO0OO.f119053OooOo0o;
    }

    public C32892OooOOoo(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
        this.f118473OooOoOO = (byte) -1;
        this.f118474OooOoo0 = -1;
        this.f118472OooOoO0 = Collections.EMPTY_LIST;
        this.f118471OooOoO = -1;
        OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
        C32952OooO0o0 c32952OooO0o0OooOO0 = C32952OooO0o0.OooOO0(oooO0O0, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iOooOOO = c32951OooO0Oo.OooOOO();
                    if (iOooOOO != 0) {
                        if (iOooOOO == 10) {
                            if (!z2) {
                                this.f118472OooOoO0 = new ArrayList();
                                z2 = true;
                            }
                            this.f118472OooOoO0.add((C32889OooOOOo) c32951OooO0Oo.OooO0oO(C32889OooOOOo.f118364OoooO00, oooO0o));
                        } else if (iOooOOO != 16) {
                            if (!c32951OooO0Oo.OooOOo0(iOooOOO, c32952OooO0o0OooOO0)) {
                            }
                        } else {
                            this.f118469OooOo |= 1;
                            this.f118471OooOoO = c32951OooO0Oo.OooOO0O();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.f118472OooOoO0 = Collections.unmodifiableList(this.f118472OooOoO0);
                    }
                    try {
                        c32952OooO0o0OooOO0.OooO();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    throw th;
                }
            } catch (oO0OOOO0.OooOO0 e) {
                e.f119095OooOo0o = this;
                throw e;
            } catch (IOException e2) {
                oO0OOOO0.OooOO0 oooOO02 = new oO0OOOO0.OooOO0(e2.getMessage());
                oooOO02.f119095OooOo0o = this;
                throw oooOO02;
            }
        }
        if (z2) {
            this.f118472OooOoO0 = Collections.unmodifiableList(this.f118472OooOoO0);
        }
        try {
            c32952OooO0o0OooOO0.OooO();
        } catch (IOException unused2) {
        } finally {
            this.f118470OooOo0o = oooO0O0.OooOOO0();
        }
    }
}
