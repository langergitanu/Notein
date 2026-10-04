package oO0OO00;

import java.io.IOException;
import oO0OOOO0.AbstractC32954OooO0oo;
import oO0OOOO0.C32951OooO0Oo;
import oO0OOOO0.C32952OooO0o0;
import oO0OOOO0.C32965OooOo0O;
import oO0OOOO0.InterfaceC32958OooOOOo;
import oO0OOOO0.OooO00o;
import oO0OOOO0.OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o extends AbstractC32954OooO0oo.OooO0OO<OooO0o> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final OooO0o f118163OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final OooO00o f118164OooOooO = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final oO0OOOO0.OooO0OO f118165OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f118166OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f118167OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public byte f118168OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f118169OooOoo0;

    public static class OooO00o extends oO0OOOO0.OooO0O0<OooO0o> {
        @Override // oO0OOOO0.InterfaceC32959OooOOo
        public final Object OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
            return new OooO0o(c32951OooO0Oo, oooO0o);
        }
    }

    public static final class OooO0O0 extends AbstractC32954OooO0oo.OooO0O0<OooO0o, OooO0O0> {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f118170OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f118171OooOoOO;

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
            OooO0o oooO0o = new OooO0o(this);
            int i = (this.f118170OooOoO & 1) != 1 ? 0 : 1;
            oooO0o.f118166OooOoO = this.f118171OooOoOO;
            oooO0o.f118167OooOoO0 = i;
            oooO0O0.OooO0o(oooO0o);
            return oooO0O0;
        }

        @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
        public final /* bridge */ /* synthetic */ AbstractC32954OooO0oo.OooO00o OooO0Oo(AbstractC32954OooO0oo abstractC32954OooO0oo) {
            OooO0o((OooO0o) abstractC32954OooO0oo);
            return this;
        }

        public final void OooO0o(OooO0o oooO0o) {
            if (oooO0o == OooO0o.f118163OooOoo) {
                return;
            }
            if ((oooO0o.f118167OooOoO0 & 1) == 1) {
                int i = oooO0o.f118166OooOoO;
                this.f118170OooOoO = 1 | this.f118170OooOoO;
                this.f118171OooOoOO = i;
            }
            OooO0o0(oooO0o);
            this.f119081OooOo0o = this.f119081OooOo0o.OooO0OO(oooO0o.f118165OooOo);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0oO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            OooO0o oooO0o2 = null;
            try {
                try {
                    OooO0o.f118164OooOooO.getClass();
                    OooO0o(new OooO0o(c32951OooO0Oo, oooO0o));
                } catch (oO0OOOO0.OooOO0 e) {
                    OooO0o oooO0o3 = (OooO0o) e.f119095OooOo0o;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        oooO0o2 = oooO0o3;
                        if (oooO0o2 != null) {
                            OooO0o(oooO0o2);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (oooO0o2 != null) {
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
            OooO0o oooO0o = new OooO0o(this);
            int i = (this.f118170OooOoO & 1) != 1 ? 0 : 1;
            oooO0o.f118166OooOoO = this.f118171OooOoOO;
            oooO0o.f118167OooOoO0 = i;
            if (oooO0o.isInitialized()) {
                return oooO0o;
            }
            throw new C32965OooOo0O();
        }

        @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
        public final Object clone() throws CloneNotSupportedException {
            OooO0O0 oooO0O0 = new OooO0O0();
            OooO0o oooO0o = new OooO0o(this);
            int i = (this.f118170OooOoO & 1) != 1 ? 0 : 1;
            oooO0o.f118166OooOoO = this.f118171OooOoOO;
            oooO0o.f118167OooOoO0 = i;
            oooO0O0.OooO0o(oooO0o);
            return oooO0O0;
        }
    }

    static {
        OooO0o oooO0o = new OooO0o(0);
        f118163OooOoo = oooO0o;
        oooO0o.f118166OooOoO = 0;
    }

    public OooO0o() {
        throw null;
    }

    public OooO0o(OooO0O0 oooO0O0) {
        super(oooO0O0);
        this.f118168OooOoOO = (byte) -1;
        this.f118169OooOoo0 = -1;
        this.f118165OooOo = oooO0O0.f119081OooOo0o;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException {
        getSerializedSize();
        AbstractC32954OooO0oo.OooO0OO.OooO00o oooO00o = new AbstractC32954OooO0oo.OooO0OO.OooO00o(this);
        if ((this.f118167OooOoO0 & 1) == 1) {
            c32952OooO0o0.OooOOO0(1, this.f118166OooOoO);
        }
        oooO00o.OooO00o(200, c32952OooO0o0);
        c32952OooO0o0.OooOOo(this.f118165OooOo);
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final InterfaceC32958OooOOOo getDefaultInstanceForType() {
        return f118163OooOoo;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final int getSerializedSize() {
        int i = this.f118169OooOoo0;
        if (i != -1) {
            return i;
        }
        int size = this.f118165OooOo.size() + OooO0o0() + ((this.f118167OooOoO0 & 1) == 1 ? C32952OooO0o0.OooO0O0(1, this.f118166OooOoO) : 0);
        this.f118169OooOoo0 = size;
        return size;
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final boolean isInitialized() {
        byte b = this.f118168OooOoOO;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (OooO0Oo()) {
            this.f118168OooOoOO = (byte) 1;
            return true;
        }
        this.f118168OooOoOO = (byte) 0;
        return false;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final InterfaceC32958OooOOOo.OooO00o newBuilderForType() {
        return new OooO0O0();
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final InterfaceC32958OooOOOo.OooO00o toBuilder() {
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.OooO0o(this);
        return oooO0O0;
    }

    public OooO0o(int i) {
        this.f118168OooOoOO = (byte) -1;
        this.f118169OooOoo0 = -1;
        this.f118165OooOo = oO0OOOO0.OooO0OO.f119053OooOo0o;
    }

    public OooO0o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
        this.f118168OooOoOO = (byte) -1;
        this.f118169OooOoo0 = -1;
        boolean z = false;
        this.f118166OooOoO = 0;
        OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
        C32952OooO0o0 c32952OooO0o0OooOO0 = C32952OooO0o0.OooOO0(oooO0O0, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iOooOOO = c32951OooO0Oo.OooOOO();
                        if (iOooOOO != 0) {
                            if (iOooOOO != 8) {
                                if (!OooO(c32951OooO0Oo, c32952OooO0o0OooOO0, oooO0o, iOooOOO)) {
                                }
                            } else {
                                this.f118167OooOoO0 |= 1;
                                this.f118166OooOoO = c32951OooO0Oo.OooOO0O();
                            }
                        }
                        z = true;
                    } catch (oO0OOOO0.OooOO0 e) {
                        e.f119095OooOo0o = this;
                        throw e;
                    }
                } catch (IOException e2) {
                    oO0OOOO0.OooOO0 oooOO02 = new oO0OOOO0.OooOO0(e2.getMessage());
                    oooOO02.f119095OooOo0o = this;
                    throw oooOO02;
                }
            } catch (Throwable th) {
                try {
                    c32952OooO0o0OooOO0.OooO();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f118165OooOo = oooO0O0.OooOOO0();
                    throw th2;
                }
                this.f118165OooOo = oooO0O0.OooOOO0();
                OooO0oo();
                throw th;
            }
        }
        try {
            c32952OooO0o0OooOO0.OooO();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f118165OooOo = oooO0O0.OooOOO0();
            throw th3;
        }
        this.f118165OooOo = oooO0O0.OooOOO0();
        OooO0oo();
    }
}
