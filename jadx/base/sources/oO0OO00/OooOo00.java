package oO0OO00;

import java.io.IOException;
import oO0OO00.C32889OooOOOo;
import oO0OOOO0.AbstractC32954OooO0oo;
import oO0OOOO0.C32951OooO0Oo;
import oO0OOOO0.C32952OooO0o0;
import oO0OOOO0.C32965OooOo0O;
import oO0OOOO0.InterfaceC32958OooOOOo;
import oO0OOOO0.OooO00o;
import oO0OOOO0.OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo00 extends AbstractC32954OooO0oo.OooO0OO<OooOo00> {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final OooO00o f118507Oooo0 = new OooO00o();

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final OooOo00 f118508Oooo00o;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final oO0OOOO0.OooO0OO f118509OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f118510OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f118511OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f118512OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f118513OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C32889OooOOOo f118514OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public C32889OooOOOo f118515OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f118516OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public byte f118517Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f118518Oooo00O;

    public static class OooO00o extends oO0OOOO0.OooO0O0<OooOo00> {
        @Override // oO0OOOO0.InterfaceC32959OooOOo
        public final Object OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
            return new OooOo00(c32951OooO0Oo, oooO0o);
        }
    }

    public static final class OooO0O0 extends AbstractC32954OooO0oo.OooO0O0<OooOo00, OooO0O0> {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f118519OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f118520OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public C32889OooOOOo f118521OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f118522OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public int f118523OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public C32889OooOOOo f118524OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public int f118525Oooo000;

        public OooO0O0() {
            C32889OooOOOo c32889OooOOOo = C32889OooOOOo.f118363Oooo;
            this.f118521OooOoo = c32889OooOOOo;
            this.f118524OooOooo = c32889OooOOOo;
        }

        @Override // oO0OOOO0.OooO00o.AbstractC20287OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final /* bridge */ /* synthetic */ OooO00o.AbstractC20287OooO00o Oooo0OO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            OooO0oo(c32951OooO0Oo, oooO0o);
            return this;
        }

        @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
        /* JADX INFO: renamed from: OooO0OO */
        public final AbstractC32954OooO0oo.OooO00o clone() {
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.OooO0oO(OooO0o());
            return oooO0O0;
        }

        @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
        public final /* bridge */ /* synthetic */ AbstractC32954OooO0oo.OooO00o OooO0Oo(AbstractC32954OooO0oo abstractC32954OooO0oo) {
            OooO0oO((OooOo00) abstractC32954OooO0oo);
            return this;
        }

        public final OooOo00 OooO0o() {
            OooOo00 oooOo00 = new OooOo00(this);
            int i = this.f118519OooOoO;
            int i2 = (i & 1) != 1 ? 0 : 1;
            oooOo00.f118510OooOoO = this.f118520OooOoOO;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            oooOo00.f118512OooOoOO = this.f118522OooOoo0;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            oooOo00.f118514OooOoo0 = this.f118521OooOoo;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            oooOo00.f118513OooOoo = this.f118523OooOooO;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            oooOo00.f118515OooOooO = this.f118524OooOooo;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            oooOo00.f118516OooOooo = this.f118525Oooo000;
            oooOo00.f118511OooOoO0 = i2;
            return oooOo00;
        }

        public final void OooO0oO(OooOo00 oooOo00) {
            C32889OooOOOo c32889OooOOOo;
            C32889OooOOOo c32889OooOOOo2;
            if (oooOo00 == OooOo00.f118508Oooo00o) {
                return;
            }
            int i = oooOo00.f118511OooOoO0;
            if ((i & 1) == 1) {
                int i2 = oooOo00.f118510OooOoO;
                this.f118519OooOoO = 1 | this.f118519OooOoO;
                this.f118520OooOoOO = i2;
            }
            if ((i & 2) == 2) {
                int i3 = oooOo00.f118512OooOoOO;
                this.f118519OooOoO = 2 | this.f118519OooOoO;
                this.f118522OooOoo0 = i3;
            }
            if ((i & 4) == 4) {
                C32889OooOOOo c32889OooOOOo3 = oooOo00.f118514OooOoo0;
                if ((this.f118519OooOoO & 4) != 4 || (c32889OooOOOo2 = this.f118521OooOoo) == C32889OooOOOo.f118363Oooo) {
                    this.f118521OooOoo = c32889OooOOOo3;
                } else {
                    C32889OooOOOo.OooO0OO oooO0OOOooOOO0 = C32889OooOOOo.OooOOO0(c32889OooOOOo2);
                    oooO0OOOooOOO0.OooO0oO(c32889OooOOOo3);
                    this.f118521OooOoo = oooO0OOOooOOO0.OooO0o();
                }
                this.f118519OooOoO |= 4;
            }
            int i4 = oooOo00.f118511OooOoO0;
            if ((i4 & 8) == 8) {
                int i5 = oooOo00.f118513OooOoo;
                this.f118519OooOoO = 8 | this.f118519OooOoO;
                this.f118523OooOooO = i5;
            }
            if ((i4 & 16) == 16) {
                C32889OooOOOo c32889OooOOOo4 = oooOo00.f118515OooOooO;
                if ((this.f118519OooOoO & 16) != 16 || (c32889OooOOOo = this.f118524OooOooo) == C32889OooOOOo.f118363Oooo) {
                    this.f118524OooOooo = c32889OooOOOo4;
                } else {
                    C32889OooOOOo.OooO0OO oooO0OOOooOOO02 = C32889OooOOOo.OooOOO0(c32889OooOOOo);
                    oooO0OOOooOOO02.OooO0oO(c32889OooOOOo4);
                    this.f118524OooOooo = oooO0OOOooOOO02.OooO0o();
                }
                this.f118519OooOoO |= 16;
            }
            if ((oooOo00.f118511OooOoO0 & 32) == 32) {
                int i6 = oooOo00.f118516OooOooo;
                this.f118519OooOoO = 32 | this.f118519OooOoO;
                this.f118525Oooo000 = i6;
            }
            OooO0o0(oooOo00);
            this.f119081OooOo0o = this.f119081OooOo0o.OooO0OO(oooOo00.f118509OooOo);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0oo(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            OooOo00 oooOo00 = null;
            try {
                try {
                    OooOo00.f118507Oooo0.getClass();
                    OooO0oO(new OooOo00(c32951OooO0Oo, oooO0o));
                } catch (oO0OOOO0.OooOO0 e) {
                    OooOo00 oooOo002 = (OooOo00) e.f119095OooOo0o;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        oooOo00 = oooOo002;
                        if (oooOo00 != null) {
                            OooO0oO(oooOo00);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (oooOo00 != null) {
                }
                throw th;
            }
        }

        @Override // oO0OOOO0.OooO00o.AbstractC20287OooO00o, oO0OOOO0.InterfaceC32958OooOOOo.OooO00o
        public final /* bridge */ /* synthetic */ InterfaceC32958OooOOOo.OooO00o Oooo0OO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            OooO0oo(c32951OooO0Oo, oooO0o);
            return this;
        }

        @Override // oO0OOOO0.InterfaceC32958OooOOOo.OooO00o
        public final InterfaceC32958OooOOOo build() {
            OooOo00 oooOo00OooO0o = OooO0o();
            if (oooOo00OooO0o.isInitialized()) {
                return oooOo00OooO0o;
            }
            throw new C32965OooOo0O();
        }

        @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
        public final Object clone() throws CloneNotSupportedException {
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.OooO0oO(OooO0o());
            return oooO0O0;
        }
    }

    static {
        OooOo00 oooOo00 = new OooOo00(0);
        f118508Oooo00o = oooOo00;
        oooOo00.f118510OooOoO = 0;
        oooOo00.f118512OooOoOO = 0;
        C32889OooOOOo c32889OooOOOo = C32889OooOOOo.f118363Oooo;
        oooOo00.f118514OooOoo0 = c32889OooOOOo;
        oooOo00.f118513OooOoo = 0;
        oooOo00.f118515OooOooO = c32889OooOOOo;
        oooOo00.f118516OooOooo = 0;
    }

    public OooOo00() {
        throw null;
    }

    public OooOo00(OooO0O0 oooO0O0) {
        super(oooO0O0);
        this.f118517Oooo000 = (byte) -1;
        this.f118518Oooo00O = -1;
        this.f118509OooOo = oooO0O0.f119081OooOo0o;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException {
        getSerializedSize();
        AbstractC32954OooO0oo.OooO0OO.OooO00o oooO00o = new AbstractC32954OooO0oo.OooO0OO.OooO00o(this);
        if ((this.f118511OooOoO0 & 1) == 1) {
            c32952OooO0o0.OooOOO0(1, this.f118510OooOoO);
        }
        if ((this.f118511OooOoO0 & 2) == 2) {
            c32952OooO0o0.OooOOO0(2, this.f118512OooOoOO);
        }
        if ((this.f118511OooOoO0 & 4) == 4) {
            c32952OooO0o0.OooOOOO(3, this.f118514OooOoo0);
        }
        if ((this.f118511OooOoO0 & 16) == 16) {
            c32952OooO0o0.OooOOOO(4, this.f118515OooOooO);
        }
        if ((this.f118511OooOoO0 & 8) == 8) {
            c32952OooO0o0.OooOOO0(5, this.f118513OooOoo);
        }
        if ((this.f118511OooOoO0 & 32) == 32) {
            c32952OooO0o0.OooOOO0(6, this.f118516OooOooo);
        }
        oooO00o.OooO00o(200, c32952OooO0o0);
        c32952OooO0o0.OooOOo(this.f118509OooOo);
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final InterfaceC32958OooOOOo getDefaultInstanceForType() {
        return f118508Oooo00o;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final int getSerializedSize() {
        int i = this.f118518Oooo00O;
        if (i != -1) {
            return i;
        }
        int iOooO0O0 = (this.f118511OooOoO0 & 1) == 1 ? C32952OooO0o0.OooO0O0(1, this.f118510OooOoO) : 0;
        if ((this.f118511OooOoO0 & 2) == 2) {
            iOooO0O0 += C32952OooO0o0.OooO0O0(2, this.f118512OooOoOO);
        }
        if ((this.f118511OooOoO0 & 4) == 4) {
            iOooO0O0 += C32952OooO0o0.OooO0Oo(3, this.f118514OooOoo0);
        }
        if ((this.f118511OooOoO0 & 16) == 16) {
            iOooO0O0 += C32952OooO0o0.OooO0Oo(4, this.f118515OooOooO);
        }
        if ((this.f118511OooOoO0 & 8) == 8) {
            iOooO0O0 += C32952OooO0o0.OooO0O0(5, this.f118513OooOoo);
        }
        if ((this.f118511OooOoO0 & 32) == 32) {
            iOooO0O0 += C32952OooO0o0.OooO0O0(6, this.f118516OooOooo);
        }
        int size = this.f118509OooOo.size() + OooO0o0() + iOooO0O0;
        this.f118518Oooo00O = size;
        return size;
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final boolean isInitialized() {
        byte b = this.f118517Oooo000;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f118511OooOoO0;
        if ((i & 2) != 2) {
            this.f118517Oooo000 = (byte) 0;
            return false;
        }
        if ((i & 4) == 4 && !this.f118514OooOoo0.isInitialized()) {
            this.f118517Oooo000 = (byte) 0;
            return false;
        }
        if ((this.f118511OooOoO0 & 16) == 16 && !this.f118515OooOooO.isInitialized()) {
            this.f118517Oooo000 = (byte) 0;
            return false;
        }
        if (OooO0Oo()) {
            this.f118517Oooo000 = (byte) 1;
            return true;
        }
        this.f118517Oooo000 = (byte) 0;
        return false;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final InterfaceC32958OooOOOo.OooO00o newBuilderForType() {
        return new OooO0O0();
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final InterfaceC32958OooOOOo.OooO00o toBuilder() {
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.OooO0oO(this);
        return oooO0O0;
    }

    public OooOo00(int i) {
        this.f118517Oooo000 = (byte) -1;
        this.f118518Oooo00O = -1;
        this.f118509OooOo = oO0OOOO0.OooO0OO.f119053OooOo0o;
    }

    public OooOo00(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
        this.f118517Oooo000 = (byte) -1;
        this.f118518Oooo00O = -1;
        boolean z = false;
        this.f118510OooOoO = 0;
        this.f118512OooOoOO = 0;
        C32889OooOOOo c32889OooOOOo = C32889OooOOOo.f118363Oooo;
        this.f118514OooOoo0 = c32889OooOOOo;
        this.f118513OooOoo = 0;
        this.f118515OooOooO = c32889OooOOOo;
        this.f118516OooOooo = 0;
        OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
        C32952OooO0o0 c32952OooO0o0OooOO0 = C32952OooO0o0.OooOO0(oooO0O0, 1);
        while (!z) {
            try {
                try {
                    int iOooOOO = c32951OooO0Oo.OooOOO();
                    if (iOooOOO != 0) {
                        if (iOooOOO == 8) {
                            this.f118511OooOoO0 |= 1;
                            this.f118510OooOoO = c32951OooO0Oo.OooOO0O();
                        } else if (iOooOOO != 16) {
                            C32889OooOOOo.OooO0OO oooO0OOOooOOO0 = null;
                            if (iOooOOO == 26) {
                                if ((this.f118511OooOoO0 & 4) == 4) {
                                    C32889OooOOOo c32889OooOOOo2 = this.f118514OooOoo0;
                                    c32889OooOOOo2.getClass();
                                    oooO0OOOooOOO0 = C32889OooOOOo.OooOOO0(c32889OooOOOo2);
                                }
                                C32889OooOOOo c32889OooOOOo3 = (C32889OooOOOo) c32951OooO0Oo.OooO0oO(C32889OooOOOo.f118364OoooO00, oooO0o);
                                this.f118514OooOoo0 = c32889OooOOOo3;
                                if (oooO0OOOooOOO0 != null) {
                                    oooO0OOOooOOO0.OooO0oO(c32889OooOOOo3);
                                    this.f118514OooOoo0 = oooO0OOOooOOO0.OooO0o();
                                }
                                this.f118511OooOoO0 |= 4;
                            } else if (iOooOOO == 34) {
                                if ((this.f118511OooOoO0 & 16) == 16) {
                                    C32889OooOOOo c32889OooOOOo4 = this.f118515OooOooO;
                                    c32889OooOOOo4.getClass();
                                    oooO0OOOooOOO0 = C32889OooOOOo.OooOOO0(c32889OooOOOo4);
                                }
                                C32889OooOOOo c32889OooOOOo5 = (C32889OooOOOo) c32951OooO0Oo.OooO0oO(C32889OooOOOo.f118364OoooO00, oooO0o);
                                this.f118515OooOooO = c32889OooOOOo5;
                                if (oooO0OOOooOOO0 != null) {
                                    oooO0OOOooOOO0.OooO0oO(c32889OooOOOo5);
                                    this.f118515OooOooO = oooO0OOOooOOO0.OooO0o();
                                }
                                this.f118511OooOoO0 |= 16;
                            } else if (iOooOOO == 40) {
                                this.f118511OooOoO0 |= 8;
                                this.f118513OooOoo = c32951OooO0Oo.OooOO0O();
                            } else if (iOooOOO != 48) {
                                if (!OooO(c32951OooO0Oo, c32952OooO0o0OooOO0, oooO0o, iOooOOO)) {
                                }
                            } else {
                                this.f118511OooOoO0 |= 32;
                                this.f118516OooOooo = c32951OooO0Oo.OooOO0O();
                            }
                        } else {
                            this.f118511OooOoO0 |= 2;
                            this.f118512OooOoOO = c32951OooO0Oo.OooOO0O();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        c32952OooO0o0OooOO0.OooO();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f118509OooOo = oooO0O0.OooOOO0();
                        throw th2;
                    }
                    this.f118509OooOo = oooO0O0.OooOOO0();
                    OooO0oo();
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
        try {
            c32952OooO0o0OooOO0.OooO();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f118509OooOo = oooO0O0.OooOOO0();
            throw th3;
        }
        this.f118509OooOo = oooO0O0.OooOOO0();
        OooO0oo();
    }
}
