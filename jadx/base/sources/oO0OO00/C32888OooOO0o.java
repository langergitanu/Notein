package oO0OO00;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import oO0OO00.OooOO0O;
import oO0OO00.OooOOO;
import oO0OO00.OooOOOO;
import oO0OOOO0.AbstractC32954OooO0oo;
import oO0OOOO0.C32951OooO0Oo;
import oO0OOOO0.C32952OooO0o0;
import oO0OOOO0.C32965OooOo0O;
import oO0OOOO0.InterfaceC32958OooOOOo;
import oO0OOOO0.OooO00o;
import oO0OOOO0.OooO0OO;

/* JADX INFO: renamed from: oO0OO00.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32888OooOO0o extends AbstractC32954OooO0oo.OooO0OO<C32888OooOO0o> {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final C32888OooOO0o f118278Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final OooO00o f118279Oooo00O = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final oO0OOOO0.OooO0OO f118280OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public OooOOOO f118281OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f118282OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public OooOOO f118283OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public List<oO0OO00.OooO0O0> f118284OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public OooOO0O f118285OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public byte f118286OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f118287OooOooo;

    /* JADX INFO: renamed from: oO0OO00.OooOO0o$OooO00o */
    public static class OooO00o extends oO0OOOO0.OooO0O0<C32888OooOO0o> {
        @Override // oO0OOOO0.InterfaceC32959OooOOo
        public final Object OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
            return new C32888OooOO0o(c32951OooO0Oo, oooO0o);
        }
    }

    /* JADX INFO: renamed from: oO0OO00.OooOO0o$OooO0O0 */
    public static final class OooO0O0 extends AbstractC32954OooO0oo.OooO0O0<C32888OooOO0o, OooO0O0> {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f118288OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public OooOOOO f118289OooOoOO = OooOOOO.f118355OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public OooOOO f118291OooOoo0 = OooOOO.f118293OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public OooOO0O f118290OooOoo = OooOO0O.f118261Oooo00O;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public List<oO0OO00.OooO0O0> f118292OooOooO = Collections.EMPTY_LIST;

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
            OooO0oO((C32888OooOO0o) abstractC32954OooO0oo);
            return this;
        }

        public final C32888OooOO0o OooO0o() {
            C32888OooOO0o c32888OooOO0o = new C32888OooOO0o(this);
            int i = this.f118288OooOoO;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c32888OooOO0o.f118281OooOoO = this.f118289OooOoOO;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c32888OooOO0o.f118283OooOoOO = this.f118291OooOoo0;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c32888OooOO0o.f118285OooOoo0 = this.f118290OooOoo;
            if ((i & 8) == 8) {
                this.f118292OooOooO = Collections.unmodifiableList(this.f118292OooOooO);
                this.f118288OooOoO &= -9;
            }
            c32888OooOO0o.f118284OooOoo = this.f118292OooOooO;
            c32888OooOO0o.f118282OooOoO0 = i2;
            return c32888OooOO0o;
        }

        public final void OooO0oO(C32888OooOO0o c32888OooOO0o) {
            OooOO0O oooOO0O;
            OooOOO oooOOO;
            OooOOOO oooOOOO;
            if (c32888OooOO0o == C32888OooOO0o.f118278Oooo000) {
                return;
            }
            if ((c32888OooOO0o.f118282OooOoO0 & 1) == 1) {
                OooOOOO oooOOOO2 = c32888OooOO0o.f118281OooOoO;
                if ((this.f118288OooOoO & 1) != 1 || (oooOOOO = this.f118289OooOoOO) == OooOOOO.f118355OooOoOO) {
                    this.f118289OooOoOO = oooOOOO2;
                } else {
                    OooOOOO.OooO0O0 oooO0O0 = new OooOOOO.OooO0O0();
                    oooO0O0.OooO0o(oooOOOO);
                    oooO0O0.OooO0o(oooOOOO2);
                    this.f118289OooOoOO = oooO0O0.OooO0o0();
                }
                this.f118288OooOoO |= 1;
            }
            if ((c32888OooOO0o.f118282OooOoO0 & 2) == 2) {
                OooOOO oooOOO2 = c32888OooOO0o.f118283OooOoOO;
                if ((this.f118288OooOoO & 2) != 2 || (oooOOO = this.f118291OooOoo0) == OooOOO.f118293OooOoOO) {
                    this.f118291OooOoo0 = oooOOO2;
                } else {
                    OooOOO.OooO0O0 oooO0O02 = new OooOOO.OooO0O0();
                    oooO0O02.OooO0o(oooOOO);
                    oooO0O02.OooO0o(oooOOO2);
                    this.f118291OooOoo0 = oooO0O02.OooO0o0();
                }
                this.f118288OooOoO |= 2;
            }
            if ((c32888OooOO0o.f118282OooOoO0 & 4) == 4) {
                OooOO0O oooOO0O2 = c32888OooOO0o.f118285OooOoo0;
                if ((this.f118288OooOoO & 4) != 4 || (oooOO0O = this.f118290OooOoo) == OooOO0O.f118261Oooo00O) {
                    this.f118290OooOoo = oooOO0O2;
                } else {
                    OooOO0O.OooO0O0 oooO0O03 = new OooOO0O.OooO0O0();
                    oooO0O03.OooO0oO(oooOO0O);
                    oooO0O03.OooO0oO(oooOO0O2);
                    this.f118290OooOoo = oooO0O03.OooO0o();
                }
                this.f118288OooOoO |= 4;
            }
            if (!c32888OooOO0o.f118284OooOoo.isEmpty()) {
                if (this.f118292OooOooO.isEmpty()) {
                    this.f118292OooOooO = c32888OooOO0o.f118284OooOoo;
                    this.f118288OooOoO &= -9;
                } else {
                    if ((this.f118288OooOoO & 8) != 8) {
                        this.f118292OooOooO = new ArrayList(this.f118292OooOooO);
                        this.f118288OooOoO |= 8;
                    }
                    this.f118292OooOooO.addAll(c32888OooOO0o.f118284OooOoo);
                }
            }
            OooO0o0(c32888OooOO0o);
            this.f119081OooOo0o = this.f119081OooOo0o.OooO0OO(c32888OooOO0o.f118280OooOo);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0oo(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            C32888OooOO0o c32888OooOO0o = null;
            try {
                try {
                    C32888OooOO0o.f118279Oooo00O.getClass();
                    OooO0oO(new C32888OooOO0o(c32951OooO0Oo, oooO0o));
                } catch (oO0OOOO0.OooOO0 e) {
                    C32888OooOO0o c32888OooOO0o2 = (C32888OooOO0o) e.f119095OooOo0o;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c32888OooOO0o = c32888OooOO0o2;
                        if (c32888OooOO0o != null) {
                            OooO0oO(c32888OooOO0o);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c32888OooOO0o != null) {
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
            C32888OooOO0o c32888OooOO0oOooO0o = OooO0o();
            if (c32888OooOO0oOooO0o.isInitialized()) {
                return c32888OooOO0oOooO0o;
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
        C32888OooOO0o c32888OooOO0o = new C32888OooOO0o(0);
        f118278Oooo000 = c32888OooOO0o;
        c32888OooOO0o.f118281OooOoO = OooOOOO.f118355OooOoOO;
        c32888OooOO0o.f118283OooOoOO = OooOOO.f118293OooOoOO;
        c32888OooOO0o.f118285OooOoo0 = OooOO0O.f118261Oooo00O;
        c32888OooOO0o.f118284OooOoo = Collections.EMPTY_LIST;
    }

    public C32888OooOO0o() {
        throw null;
    }

    public C32888OooOO0o(OooO0O0 oooO0O0) {
        super(oooO0O0);
        this.f118286OooOooO = (byte) -1;
        this.f118287OooOooo = -1;
        this.f118280OooOo = oooO0O0.f119081OooOo0o;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException {
        getSerializedSize();
        AbstractC32954OooO0oo.OooO0OO.OooO00o oooO00o = new AbstractC32954OooO0oo.OooO0OO.OooO00o(this);
        if ((this.f118282OooOoO0 & 1) == 1) {
            c32952OooO0o0.OooOOOO(1, this.f118281OooOoO);
        }
        if ((this.f118282OooOoO0 & 2) == 2) {
            c32952OooO0o0.OooOOOO(2, this.f118283OooOoOO);
        }
        if ((this.f118282OooOoO0 & 4) == 4) {
            c32952OooO0o0.OooOOOO(3, this.f118285OooOoo0);
        }
        for (int i = 0; i < this.f118284OooOoo.size(); i++) {
            c32952OooO0o0.OooOOOO(4, this.f118284OooOoo.get(i));
        }
        oooO00o.OooO00o(200, c32952OooO0o0);
        c32952OooO0o0.OooOOo(this.f118280OooOo);
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final InterfaceC32958OooOOOo getDefaultInstanceForType() {
        return f118278Oooo000;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final int getSerializedSize() {
        int i = this.f118287OooOooo;
        if (i != -1) {
            return i;
        }
        int iOooO0Oo = (this.f118282OooOoO0 & 1) == 1 ? C32952OooO0o0.OooO0Oo(1, this.f118281OooOoO) : 0;
        if ((this.f118282OooOoO0 & 2) == 2) {
            iOooO0Oo += C32952OooO0o0.OooO0Oo(2, this.f118283OooOoOO);
        }
        if ((this.f118282OooOoO0 & 4) == 4) {
            iOooO0Oo += C32952OooO0o0.OooO0Oo(3, this.f118285OooOoo0);
        }
        for (int i2 = 0; i2 < this.f118284OooOoo.size(); i2++) {
            iOooO0Oo += C32952OooO0o0.OooO0Oo(4, this.f118284OooOoo.get(i2));
        }
        int size = this.f118280OooOo.size() + OooO0o0() + iOooO0Oo;
        this.f118287OooOooo = size;
        return size;
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final boolean isInitialized() {
        byte b = this.f118286OooOooO;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f118282OooOoO0 & 2) == 2 && !this.f118283OooOoOO.isInitialized()) {
            this.f118286OooOooO = (byte) 0;
            return false;
        }
        if ((this.f118282OooOoO0 & 4) == 4 && !this.f118285OooOoo0.isInitialized()) {
            this.f118286OooOooO = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f118284OooOoo.size(); i++) {
            if (!this.f118284OooOoo.get(i).isInitialized()) {
                this.f118286OooOooO = (byte) 0;
                return false;
            }
        }
        if (OooO0Oo()) {
            this.f118286OooOooO = (byte) 1;
            return true;
        }
        this.f118286OooOooO = (byte) 0;
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

    public C32888OooOO0o(int i) {
        this.f118286OooOooO = (byte) -1;
        this.f118287OooOooo = -1;
        this.f118280OooOo = oO0OOOO0.OooO0OO.f119053OooOo0o;
    }

    public C32888OooOO0o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
        this.f118286OooOooO = (byte) -1;
        this.f118287OooOooo = -1;
        this.f118281OooOoO = OooOOOO.f118355OooOoOO;
        this.f118283OooOoOO = OooOOO.f118293OooOoOO;
        this.f118285OooOoo0 = OooOO0O.f118261Oooo00O;
        this.f118284OooOoo = Collections.EMPTY_LIST;
        OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
        C32952OooO0o0 c32952OooO0o0OooOO0 = C32952OooO0o0.OooOO0(oooO0O0, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iOooOOO = c32951OooO0Oo.OooOOO();
                    if (iOooOOO != 0) {
                        OooOO0O.OooO0O0 oooO0O02 = null;
                        OooOOOO.OooO0O0 oooO0O03 = null;
                        OooOOO.OooO0O0 oooO0O04 = null;
                        if (iOooOOO == 10) {
                            if ((this.f118282OooOoO0 & 1) == 1) {
                                OooOOOO oooOOOO = this.f118281OooOoO;
                                oooOOOO.getClass();
                                oooO0O03 = new OooOOOO.OooO0O0();
                                oooO0O03.OooO0o(oooOOOO);
                            }
                            OooOOOO oooOOOO2 = (OooOOOO) c32951OooO0Oo.OooO0oO(OooOOOO.f118356OooOoo0, oooO0o);
                            this.f118281OooOoO = oooOOOO2;
                            if (oooO0O03 != null) {
                                oooO0O03.OooO0o(oooOOOO2);
                                this.f118281OooOoO = oooO0O03.OooO0o0();
                            }
                            this.f118282OooOoO0 |= 1;
                        } else if (iOooOOO == 18) {
                            if ((this.f118282OooOoO0 & 2) == 2) {
                                OooOOO oooOOO = this.f118283OooOoOO;
                                oooOOO.getClass();
                                oooO0O04 = new OooOOO.OooO0O0();
                                oooO0O04.OooO0o(oooOOO);
                            }
                            OooOOO oooOOO2 = (OooOOO) c32951OooO0Oo.OooO0oO(OooOOO.f118294OooOoo0, oooO0o);
                            this.f118283OooOoOO = oooOOO2;
                            if (oooO0O04 != null) {
                                oooO0O04.OooO0o(oooOOO2);
                                this.f118283OooOoOO = oooO0O04.OooO0o0();
                            }
                            this.f118282OooOoO0 |= 2;
                        } else if (iOooOOO == 26) {
                            if ((this.f118282OooOoO0 & 4) == 4) {
                                OooOO0O oooOO0O = this.f118285OooOoo0;
                                oooOO0O.getClass();
                                oooO0O02 = new OooOO0O.OooO0O0();
                                oooO0O02.OooO0oO(oooOO0O);
                            }
                            OooOO0O oooOO0O2 = (OooOO0O) c32951OooO0Oo.OooO0oO(OooOO0O.f118262Oooo00o, oooO0o);
                            this.f118285OooOoo0 = oooOO0O2;
                            if (oooO0O02 != null) {
                                oooO0O02.OooO0oO(oooOO0O2);
                                this.f118285OooOoo0 = oooO0O02.OooO0o();
                            }
                            this.f118282OooOoO0 |= 4;
                        } else if (iOooOOO != 34) {
                            if (!OooO(c32951OooO0Oo, c32952OooO0o0OooOO0, oooO0o, iOooOOO)) {
                            }
                        } else {
                            int i = (c == true ? 1 : 0) & '\b';
                            c = c;
                            if (i != 8) {
                                this.f118284OooOoo = new ArrayList();
                                c = '\b';
                            }
                            this.f118284OooOoo.add((oO0OO00.OooO0O0) c32951OooO0Oo.OooO0oO(oO0OO00.OooO0O0.f118075Oooooo0, oooO0o));
                        }
                    }
                    z = true;
                } catch (oO0OOOO0.OooOO0 e) {
                    e.f119095OooOo0o = this;
                    throw e;
                } catch (IOException e2) {
                    oO0OOOO0.OooOO0 oooOO02 = new oO0OOOO0.OooOO0(e2.getMessage());
                    oooOO02.f119095OooOo0o = this;
                    throw oooOO02;
                }
            } catch (Throwable th) {
                if (((c == true ? 1 : 0) & '\b') == 8) {
                    this.f118284OooOoo = Collections.unmodifiableList(this.f118284OooOoo);
                }
                try {
                    c32952OooO0o0OooOO0.OooO();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f118280OooOo = oooO0O0.OooOOO0();
                    throw th2;
                }
                this.f118280OooOo = oooO0O0.OooOOO0();
                OooO0oo();
                throw th;
            }
        }
        if (((c == true ? 1 : 0) & '\b') == 8) {
            this.f118284OooOoo = Collections.unmodifiableList(this.f118284OooOoo);
        }
        try {
            c32952OooO0o0OooOO0.OooO();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f118280OooOo = oooO0O0.OooOOO0();
            throw th3;
        }
        this.f118280OooOo = oooO0O0.OooOOO0();
        OooO0oo();
    }
}
