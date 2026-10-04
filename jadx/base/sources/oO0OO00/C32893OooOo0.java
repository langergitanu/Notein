package oO0OO00;

import java.io.IOException;
import oO0OOOO0.AbstractC32954OooO0oo;
import oO0OOOO0.C32951OooO0Oo;
import oO0OOOO0.C32952OooO0o0;
import oO0OOOO0.C32965OooOo0O;
import oO0OOOO0.InterfaceC32958OooOOOo;
import oO0OOOO0.InterfaceC32960OooOOo0;
import oO0OOOO0.OooO;
import oO0OOOO0.OooO00o;
import oO0OOOO0.OooO0OO;

/* JADX INFO: renamed from: oO0OO00.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32893OooOo0 extends AbstractC32954OooO0oo implements InterfaceC32960OooOOo0 {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final C32893OooOo0 f118478Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final OooO00o f118479Oooo00o = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f118480OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO0OOOO0.OooO0OO f118481OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f118482OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f118483OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public OooO0OO f118484OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f118485OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f118486OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public EnumC32894OooO0Oo f118487OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public byte f118488OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f118489Oooo000;

    /* JADX INFO: renamed from: oO0OO00.OooOo0$OooO00o */
    public static class OooO00o extends oO0OOOO0.OooO0O0<C32893OooOo0> {
        @Override // oO0OOOO0.InterfaceC32959OooOOo
        public final Object OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
            return new C32893OooOo0(c32951OooO0Oo);
        }
    }

    /* JADX INFO: renamed from: oO0OO00.OooOo0$OooO0O0 */
    public static final class OooO0O0 extends AbstractC32954OooO0oo.OooO00o<C32893OooOo0, OooO0O0> implements InterfaceC32960OooOOo0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f118490OooOo;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f118491OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f118492OooOoO0;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public int f118494OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f118495OooOoo0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public OooO0OO f118493OooOoOO = OooO0OO.ERROR;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public EnumC32894OooO0Oo f118496OooOooO = EnumC32894OooO0Oo.LANGUAGE_VERSION;

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
            OooO0o((C32893OooOo0) abstractC32954OooO0oo);
            return this;
        }

        public final void OooO0o(C32893OooOo0 c32893OooOo0) {
            if (c32893OooOo0 == C32893OooOo0.f118478Oooo00O) {
                return;
            }
            int i = c32893OooOo0.f118480OooOo;
            if ((i & 1) == 1) {
                int i2 = c32893OooOo0.f118483OooOoO0;
                this.f118490OooOo = 1 | this.f118490OooOo;
                this.f118492OooOoO0 = i2;
            }
            if ((i & 2) == 2) {
                int i3 = c32893OooOo0.f118482OooOoO;
                this.f118490OooOo = 2 | this.f118490OooOo;
                this.f118491OooOoO = i3;
            }
            if ((i & 4) == 4) {
                OooO0OO oooO0OO = c32893OooOo0.f118484OooOoOO;
                oooO0OO.getClass();
                this.f118490OooOo = 4 | this.f118490OooOo;
                this.f118493OooOoOO = oooO0OO;
            }
            int i4 = c32893OooOo0.f118480OooOo;
            if ((i4 & 8) == 8) {
                int i5 = c32893OooOo0.f118486OooOoo0;
                this.f118490OooOo = 8 | this.f118490OooOo;
                this.f118495OooOoo0 = i5;
            }
            if ((i4 & 16) == 16) {
                int i6 = c32893OooOo0.f118485OooOoo;
                this.f118490OooOo = 16 | this.f118490OooOo;
                this.f118494OooOoo = i6;
            }
            if ((i4 & 32) == 32) {
                EnumC32894OooO0Oo enumC32894OooO0Oo = c32893OooOo0.f118487OooOooO;
                enumC32894OooO0Oo.getClass();
                this.f118490OooOo = 32 | this.f118490OooOo;
                this.f118496OooOooO = enumC32894OooO0Oo;
            }
            this.f119081OooOo0o = this.f119081OooOo0o.OooO0OO(c32893OooOo0.f118481OooOo0o);
        }

        public final C32893OooOo0 OooO0o0() {
            C32893OooOo0 c32893OooOo0 = new C32893OooOo0(this);
            int i = this.f118490OooOo;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c32893OooOo0.f118483OooOoO0 = this.f118492OooOoO0;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c32893OooOo0.f118482OooOoO = this.f118491OooOoO;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c32893OooOo0.f118484OooOoOO = this.f118493OooOoOO;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c32893OooOo0.f118486OooOoo0 = this.f118495OooOoo0;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            c32893OooOo0.f118485OooOoo = this.f118494OooOoo;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            c32893OooOo0.f118487OooOooO = this.f118496OooOooO;
            c32893OooOo0.f118480OooOo = i2;
            return c32893OooOo0;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0oO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            C32893OooOo0 c32893OooOo0 = null;
            try {
                try {
                    C32893OooOo0.f118479Oooo00o.getClass();
                    OooO0o(new C32893OooOo0(c32951OooO0Oo));
                } catch (oO0OOOO0.OooOO0 e) {
                    C32893OooOo0 c32893OooOo02 = (C32893OooOo0) e.f119095OooOo0o;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c32893OooOo0 = c32893OooOo02;
                        if (c32893OooOo0 != null) {
                            OooO0o(c32893OooOo0);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c32893OooOo0 != null) {
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
            C32893OooOo0 c32893OooOo0OooO0o0 = OooO0o0();
            if (c32893OooOo0OooO0o0.isInitialized()) {
                return c32893OooOo0OooO0o0;
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

    /* JADX INFO: renamed from: oO0OO00.OooOo0$OooO0OO */
    public enum OooO0OO implements OooO.OooO00o {
        WARNING(0),
        ERROR(1),
        HIDDEN(2);


        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f118501OooOo0o;

        OooO0OO(int i) {
            this.f118501OooOo0o = i;
        }

        @Override // oO0OOOO0.OooO.OooO00o
        public final int getNumber() {
            return this.f118501OooOo0o;
        }
    }

    /* JADX INFO: renamed from: oO0OO00.OooOo0$OooO0Oo, reason: case insensitive filesystem */
    public enum EnumC32894OooO0Oo implements OooO.OooO00o {
        LANGUAGE_VERSION(0),
        COMPILER_VERSION(1),
        API_VERSION(2);


        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f118506OooOo0o;

        EnumC32894OooO0Oo(int i) {
            this.f118506OooOo0o = i;
        }

        @Override // oO0OOOO0.OooO.OooO00o
        public final int getNumber() {
            return this.f118506OooOo0o;
        }
    }

    static {
        C32893OooOo0 c32893OooOo0 = new C32893OooOo0();
        f118478Oooo00O = c32893OooOo0;
        c32893OooOo0.f118483OooOoO0 = 0;
        c32893OooOo0.f118482OooOoO = 0;
        c32893OooOo0.f118484OooOoOO = OooO0OO.ERROR;
        c32893OooOo0.f118486OooOoo0 = 0;
        c32893OooOo0.f118485OooOoo = 0;
        c32893OooOo0.f118487OooOooO = EnumC32894OooO0Oo.LANGUAGE_VERSION;
    }

    public C32893OooOo0(OooO0O0 oooO0O0) {
        this.f118488OooOooo = (byte) -1;
        this.f118489Oooo000 = -1;
        this.f118481OooOo0o = oooO0O0.f119081OooOo0o;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException {
        getSerializedSize();
        if ((this.f118480OooOo & 1) == 1) {
            c32952OooO0o0.OooOOO0(1, this.f118483OooOoO0);
        }
        if ((this.f118480OooOo & 2) == 2) {
            c32952OooO0o0.OooOOO0(2, this.f118482OooOoO);
        }
        if ((this.f118480OooOo & 4) == 4) {
            c32952OooO0o0.OooOO0o(3, this.f118484OooOoOO.f118501OooOo0o);
        }
        if ((this.f118480OooOo & 8) == 8) {
            c32952OooO0o0.OooOOO0(4, this.f118486OooOoo0);
        }
        if ((this.f118480OooOo & 16) == 16) {
            c32952OooO0o0.OooOOO0(5, this.f118485OooOoo);
        }
        if ((this.f118480OooOo & 32) == 32) {
            c32952OooO0o0.OooOO0o(6, this.f118487OooOooO.f118506OooOo0o);
        }
        c32952OooO0o0.OooOOo(this.f118481OooOo0o);
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final int getSerializedSize() {
        int i = this.f118489Oooo000;
        if (i != -1) {
            return i;
        }
        int iOooO0O0 = (this.f118480OooOo & 1) == 1 ? C32952OooO0o0.OooO0O0(1, this.f118483OooOoO0) : 0;
        if ((this.f118480OooOo & 2) == 2) {
            iOooO0O0 += C32952OooO0o0.OooO0O0(2, this.f118482OooOoO);
        }
        if ((this.f118480OooOo & 4) == 4) {
            iOooO0O0 += C32952OooO0o0.OooO00o(3, this.f118484OooOoOO.f118501OooOo0o);
        }
        if ((this.f118480OooOo & 8) == 8) {
            iOooO0O0 += C32952OooO0o0.OooO0O0(4, this.f118486OooOoo0);
        }
        if ((this.f118480OooOo & 16) == 16) {
            iOooO0O0 += C32952OooO0o0.OooO0O0(5, this.f118485OooOoo);
        }
        if ((this.f118480OooOo & 32) == 32) {
            iOooO0O0 += C32952OooO0o0.OooO00o(6, this.f118487OooOooO.f118506OooOo0o);
        }
        int size = this.f118481OooOo0o.size() + iOooO0O0;
        this.f118489Oooo000 = size;
        return size;
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final boolean isInitialized() {
        byte b = this.f118488OooOooo;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f118488OooOooo = (byte) 1;
        return true;
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

    public C32893OooOo0() {
        this.f118488OooOooo = (byte) -1;
        this.f118489Oooo000 = -1;
        this.f118481OooOo0o = oO0OOOO0.OooO0OO.f119053OooOo0o;
    }

    public C32893OooOo0(C32951OooO0Oo c32951OooO0Oo) throws oO0OOOO0.OooOO0 {
        this.f118488OooOooo = (byte) -1;
        this.f118489Oooo000 = -1;
        boolean z = false;
        this.f118483OooOoO0 = 0;
        this.f118482OooOoO = 0;
        OooO0OO oooO0OO = OooO0OO.ERROR;
        this.f118484OooOoOO = oooO0OO;
        this.f118486OooOoo0 = 0;
        this.f118485OooOoo = 0;
        EnumC32894OooO0Oo enumC32894OooO0Oo = EnumC32894OooO0Oo.LANGUAGE_VERSION;
        this.f118487OooOooO = enumC32894OooO0Oo;
        OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
        C32952OooO0o0 c32952OooO0o0OooOO0 = C32952OooO0o0.OooOO0(oooO0O0, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iOooOOO = c32951OooO0Oo.OooOOO();
                        if (iOooOOO != 0) {
                            if (iOooOOO == 8) {
                                this.f118480OooOo |= 1;
                                this.f118483OooOoO0 = c32951OooO0Oo.OooOO0O();
                            } else if (iOooOOO != 16) {
                                EnumC32894OooO0Oo enumC32894OooO0Oo2 = null;
                                OooO0OO oooO0OO2 = null;
                                if (iOooOOO == 24) {
                                    int iOooOO0O = c32951OooO0Oo.OooOO0O();
                                    if (iOooOO0O == 0) {
                                        oooO0OO2 = OooO0OO.WARNING;
                                    } else if (iOooOO0O == 1) {
                                        oooO0OO2 = oooO0OO;
                                    } else if (iOooOO0O == 2) {
                                        oooO0OO2 = OooO0OO.HIDDEN;
                                    }
                                    if (oooO0OO2 == null) {
                                        c32952OooO0o0OooOO0.OooOo0O(iOooOOO);
                                        c32952OooO0o0OooOO0.OooOo0O(iOooOO0O);
                                    } else {
                                        this.f118480OooOo |= 4;
                                        this.f118484OooOoOO = oooO0OO2;
                                    }
                                } else if (iOooOOO == 32) {
                                    this.f118480OooOo |= 8;
                                    this.f118486OooOoo0 = c32951OooO0Oo.OooOO0O();
                                } else if (iOooOOO == 40) {
                                    this.f118480OooOo |= 16;
                                    this.f118485OooOoo = c32951OooO0Oo.OooOO0O();
                                } else if (iOooOOO != 48) {
                                    if (!c32951OooO0Oo.OooOOo0(iOooOOO, c32952OooO0o0OooOO0)) {
                                    }
                                } else {
                                    int iOooOO0O2 = c32951OooO0Oo.OooOO0O();
                                    if (iOooOO0O2 == 0) {
                                        enumC32894OooO0Oo2 = enumC32894OooO0Oo;
                                    } else if (iOooOO0O2 == 1) {
                                        enumC32894OooO0Oo2 = EnumC32894OooO0Oo.COMPILER_VERSION;
                                    } else if (iOooOO0O2 == 2) {
                                        enumC32894OooO0Oo2 = EnumC32894OooO0Oo.API_VERSION;
                                    }
                                    if (enumC32894OooO0Oo2 == null) {
                                        c32952OooO0o0OooOO0.OooOo0O(iOooOOO);
                                        c32952OooO0o0OooOO0.OooOo0O(iOooOO0O2);
                                    } else {
                                        this.f118480OooOo |= 32;
                                        this.f118487OooOooO = enumC32894OooO0Oo2;
                                    }
                                }
                            } else {
                                this.f118480OooOo |= 2;
                                this.f118482OooOoO = c32951OooO0Oo.OooOO0O();
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
                    throw th2;
                }
                throw th;
            }
        }
        try {
            c32952OooO0o0OooOO0.OooO();
        } catch (IOException unused2) {
        } finally {
            this.f118481OooOo0o = oooO0O0.OooOOO0();
        }
    }
}
