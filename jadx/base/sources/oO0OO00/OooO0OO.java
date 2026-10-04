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
import oO0OOOO0.OooO00o;
import oO0OOOO0.OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO extends AbstractC32954OooO0oo.OooO0OO<OooO0OO> {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final OooO0OO f118142OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final OooO00o f118143Oooo000 = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final oO0OOOO0.OooO0OO f118144OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f118145OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f118146OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public List<OooOo00> f118147OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public byte f118148OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public List<Integer> f118149OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f118150OooOooO;

    public static class OooO00o extends oO0OOOO0.OooO0O0<OooO0OO> {
        @Override // oO0OOOO0.InterfaceC32959OooOOo
        public final Object OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
            return new OooO0OO(c32951OooO0Oo, oooO0o);
        }
    }

    public static final class OooO0O0 extends AbstractC32954OooO0oo.OooO0O0<OooO0OO, OooO0O0> {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f118151OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f118152OooOoOO = 6;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public List<Integer> f118153OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public List<OooOo00> f118154OooOoo0;

        public OooO0O0() {
            List list = Collections.EMPTY_LIST;
            this.f118154OooOoo0 = list;
            this.f118153OooOoo = list;
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
            OooO0oO((OooO0OO) abstractC32954OooO0oo);
            return this;
        }

        public final OooO0OO OooO0o() {
            OooO0OO oooO0OO = new OooO0OO(this);
            int i = this.f118151OooOoO;
            int i2 = (i & 1) != 1 ? 0 : 1;
            oooO0OO.f118145OooOoO = this.f118152OooOoOO;
            if ((i & 2) == 2) {
                this.f118154OooOoo0 = Collections.unmodifiableList(this.f118154OooOoo0);
                this.f118151OooOoO &= -3;
            }
            oooO0OO.f118147OooOoOO = this.f118154OooOoo0;
            if ((this.f118151OooOoO & 4) == 4) {
                this.f118153OooOoo = Collections.unmodifiableList(this.f118153OooOoo);
                this.f118151OooOoO &= -5;
            }
            oooO0OO.f118149OooOoo0 = this.f118153OooOoo;
            oooO0OO.f118146OooOoO0 = i2;
            return oooO0OO;
        }

        public final void OooO0oO(OooO0OO oooO0OO) {
            if (oooO0OO == OooO0OO.f118142OooOooo) {
                return;
            }
            if ((oooO0OO.f118146OooOoO0 & 1) == 1) {
                int i = oooO0OO.f118145OooOoO;
                this.f118151OooOoO = 1 | this.f118151OooOoO;
                this.f118152OooOoOO = i;
            }
            if (!oooO0OO.f118147OooOoOO.isEmpty()) {
                if (this.f118154OooOoo0.isEmpty()) {
                    this.f118154OooOoo0 = oooO0OO.f118147OooOoOO;
                    this.f118151OooOoO &= -3;
                } else {
                    if ((this.f118151OooOoO & 2) != 2) {
                        this.f118154OooOoo0 = new ArrayList(this.f118154OooOoo0);
                        this.f118151OooOoO |= 2;
                    }
                    this.f118154OooOoo0.addAll(oooO0OO.f118147OooOoOO);
                }
            }
            if (!oooO0OO.f118149OooOoo0.isEmpty()) {
                if (this.f118153OooOoo.isEmpty()) {
                    this.f118153OooOoo = oooO0OO.f118149OooOoo0;
                    this.f118151OooOoO &= -5;
                } else {
                    if ((this.f118151OooOoO & 4) != 4) {
                        this.f118153OooOoo = new ArrayList(this.f118153OooOoo);
                        this.f118151OooOoO |= 4;
                    }
                    this.f118153OooOoo.addAll(oooO0OO.f118149OooOoo0);
                }
            }
            OooO0o0(oooO0OO);
            this.f119081OooOo0o = this.f119081OooOo0o.OooO0OO(oooO0OO.f118144OooOo);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0oo(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            OooO0OO oooO0OO = null;
            try {
                try {
                    OooO0OO.f118143Oooo000.getClass();
                    OooO0oO(new OooO0OO(c32951OooO0Oo, oooO0o));
                } catch (oO0OOOO0.OooOO0 e) {
                    OooO0OO oooO0OO2 = (OooO0OO) e.f119095OooOo0o;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        oooO0OO = oooO0OO2;
                        if (oooO0OO != null) {
                            OooO0oO(oooO0OO);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (oooO0OO != null) {
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
            OooO0OO oooO0OOOooO0o = OooO0o();
            if (oooO0OOOooO0o.isInitialized()) {
                return oooO0OOOooO0o;
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
        OooO0OO oooO0OO = new OooO0OO(0);
        f118142OooOooo = oooO0OO;
        oooO0OO.f118145OooOoO = 6;
        List list = Collections.EMPTY_LIST;
        oooO0OO.f118147OooOoOO = list;
        oooO0OO.f118149OooOoo0 = list;
    }

    public OooO0OO() {
        throw null;
    }

    public OooO0OO(OooO0O0 oooO0O0) {
        super(oooO0O0);
        this.f118148OooOoo = (byte) -1;
        this.f118150OooOooO = -1;
        this.f118144OooOo = oooO0O0.f119081OooOo0o;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException {
        getSerializedSize();
        AbstractC32954OooO0oo.OooO0OO.OooO00o oooO00o = new AbstractC32954OooO0oo.OooO0OO.OooO00o(this);
        if ((this.f118146OooOoO0 & 1) == 1) {
            c32952OooO0o0.OooOOO0(1, this.f118145OooOoO);
        }
        for (int i = 0; i < this.f118147OooOoOO.size(); i++) {
            c32952OooO0o0.OooOOOO(2, this.f118147OooOoOO.get(i));
        }
        for (int i2 = 0; i2 < this.f118149OooOoo0.size(); i2++) {
            c32952OooO0o0.OooOOO0(31, this.f118149OooOoo0.get(i2).intValue());
        }
        oooO00o.OooO00o(19000, c32952OooO0o0);
        c32952OooO0o0.OooOOo(this.f118144OooOo);
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final InterfaceC32958OooOOOo getDefaultInstanceForType() {
        return f118142OooOooo;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final int getSerializedSize() {
        int i = this.f118150OooOooO;
        if (i != -1) {
            return i;
        }
        int iOooO0O0 = (this.f118146OooOoO0 & 1) == 1 ? C32952OooO0o0.OooO0O0(1, this.f118145OooOoO) : 0;
        for (int i2 = 0; i2 < this.f118147OooOoOO.size(); i2++) {
            iOooO0O0 += C32952OooO0o0.OooO0Oo(2, this.f118147OooOoOO.get(i2));
        }
        int iOooO0OO = 0;
        for (int i3 = 0; i3 < this.f118149OooOoo0.size(); i3++) {
            iOooO0OO += C32952OooO0o0.OooO0OO(this.f118149OooOoo0.get(i3).intValue());
        }
        int size = this.f118144OooOo.size() + OooO0o0() + (this.f118149OooOoo0.size() * 2) + iOooO0O0 + iOooO0OO;
        this.f118150OooOooO = size;
        return size;
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final boolean isInitialized() {
        byte b = this.f118148OooOoo;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f118147OooOoOO.size(); i++) {
            if (!this.f118147OooOoOO.get(i).isInitialized()) {
                this.f118148OooOoo = (byte) 0;
                return false;
            }
        }
        if (OooO0Oo()) {
            this.f118148OooOoo = (byte) 1;
            return true;
        }
        this.f118148OooOoo = (byte) 0;
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

    public OooO0OO(int i) {
        this.f118148OooOoo = (byte) -1;
        this.f118150OooOooO = -1;
        this.f118144OooOo = oO0OOOO0.OooO0OO.f119053OooOo0o;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public OooO0OO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
        this.f118148OooOoo = (byte) -1;
        this.f118150OooOooO = -1;
        this.f118145OooOoO = 6;
        List list = Collections.EMPTY_LIST;
        this.f118147OooOoOO = list;
        this.f118149OooOoo0 = list;
        OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
        C32952OooO0o0 c32952OooO0o0OooOO0 = C32952OooO0o0.OooOO0(oooO0O0, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iOooOOO = c32951OooO0Oo.OooOOO();
                    if (iOooOOO != 0) {
                        if (iOooOOO == 8) {
                            this.f118146OooOoO0 |= 1;
                            this.f118145OooOoO = c32951OooO0Oo.OooOO0O();
                        } else if (iOooOOO == 18) {
                            if ((i & 2) != 2) {
                                this.f118147OooOoOO = new ArrayList();
                                i |= 2;
                            }
                            this.f118147OooOoOO.add((OooOo00) c32951OooO0Oo.OooO0oO(OooOo00.f118507Oooo0, oooO0o));
                        } else if (iOooOOO == 248) {
                            if ((i & 4) != 4) {
                                this.f118149OooOoo0 = new ArrayList();
                                i |= 4;
                            }
                            this.f118149OooOoo0.add(Integer.valueOf(c32951OooO0Oo.OooOO0O()));
                        } else if (iOooOOO != 250) {
                            if (!OooO(c32951OooO0Oo, c32952OooO0o0OooOO0, oooO0o, iOooOOO)) {
                            }
                        } else {
                            int iOooO0Oo = c32951OooO0Oo.OooO0Oo(c32951OooO0Oo.OooOO0O());
                            if ((i & 4) != 4 && c32951OooO0Oo.OooO0O0() > 0) {
                                this.f118149OooOoo0 = new ArrayList();
                                i |= 4;
                            }
                            while (c32951OooO0Oo.OooO0O0() > 0) {
                                this.f118149OooOoo0.add(Integer.valueOf(c32951OooO0Oo.OooOO0O()));
                            }
                            c32951OooO0Oo.OooO0OO(iOooO0Oo);
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 2) == 2) {
                        this.f118147OooOoOO = Collections.unmodifiableList(this.f118147OooOoOO);
                    }
                    if ((i & 4) == 4) {
                        this.f118149OooOoo0 = Collections.unmodifiableList(this.f118149OooOoo0);
                    }
                    try {
                        c32952OooO0o0OooOO0.OooO();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f118144OooOo = oooO0O0.OooOOO0();
                        throw th2;
                    }
                    this.f118144OooOo = oooO0O0.OooOOO0();
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
        if ((i & 2) == 2) {
            this.f118147OooOoOO = Collections.unmodifiableList(this.f118147OooOoOO);
        }
        if ((i & 4) == 4) {
            this.f118149OooOoo0 = Collections.unmodifiableList(this.f118149OooOoo0);
        }
        try {
            c32952OooO0o0OooOO0.OooO();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f118144OooOo = oooO0O0.OooOOO0();
            throw th3;
        }
        this.f118144OooOo = oooO0O0.OooOOO0();
        OooO0oo();
    }
}
