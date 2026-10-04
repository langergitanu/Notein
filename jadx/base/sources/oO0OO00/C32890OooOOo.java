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
import oO0OOOO0.OooO;
import oO0OOOO0.OooO00o;
import oO0OOOO0.OooO0OO;

/* JADX INFO: renamed from: oO0OO00.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32890OooOOo extends AbstractC32954OooO0oo.OooO0OO<C32890OooOOo> {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final C32890OooOOo f118417Oooo0;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final OooO00o f118418Oooo0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final oO0OOOO0.OooO0OO f118419OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f118420OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f118421OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f118422OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public OooO0OO f118423OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f118424OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public List<C32889OooOOOo> f118425OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public List<Integer> f118426OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f118427Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public byte f118428Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f118429Oooo00o;

    /* JADX INFO: renamed from: oO0OO00.OooOOo$OooO00o */
    public static class OooO00o extends oO0OOOO0.OooO0O0<C32890OooOOo> {
        @Override // oO0OOOO0.InterfaceC32959OooOOo
        public final Object OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
            return new C32890OooOOo(c32951OooO0Oo, oooO0o);
        }
    }

    /* JADX INFO: renamed from: oO0OO00.OooOOo$OooO0O0 */
    public static final class OooO0O0 extends AbstractC32954OooO0oo.OooO0O0<C32890OooOOo, OooO0O0> {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f118430OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f118431OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public boolean f118432OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f118433OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public OooO0OO f118434OooOooO = OooO0OO.INV;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public List<C32889OooOOOo> f118435OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public List<Integer> f118436Oooo000;

        public OooO0O0() {
            List list = Collections.EMPTY_LIST;
            this.f118435OooOooo = list;
            this.f118436Oooo000 = list;
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
            OooO0oO((C32890OooOOo) abstractC32954OooO0oo);
            return this;
        }

        public final C32890OooOOo OooO0o() {
            C32890OooOOo c32890OooOOo = new C32890OooOOo(this);
            int i = this.f118430OooOoO;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c32890OooOOo.f118420OooOoO = this.f118431OooOoOO;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c32890OooOOo.f118422OooOoOO = this.f118433OooOoo0;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c32890OooOOo.f118424OooOoo0 = this.f118432OooOoo;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c32890OooOOo.f118423OooOoo = this.f118434OooOooO;
            if ((i & 16) == 16) {
                this.f118435OooOooo = Collections.unmodifiableList(this.f118435OooOooo);
                this.f118430OooOoO &= -17;
            }
            c32890OooOOo.f118425OooOooO = this.f118435OooOooo;
            if ((this.f118430OooOoO & 32) == 32) {
                this.f118436Oooo000 = Collections.unmodifiableList(this.f118436Oooo000);
                this.f118430OooOoO &= -33;
            }
            c32890OooOOo.f118426OooOooo = this.f118436Oooo000;
            c32890OooOOo.f118421OooOoO0 = i2;
            return c32890OooOOo;
        }

        public final void OooO0oO(C32890OooOOo c32890OooOOo) {
            if (c32890OooOOo == C32890OooOOo.f118417Oooo0) {
                return;
            }
            int i = c32890OooOOo.f118421OooOoO0;
            if ((i & 1) == 1) {
                int i2 = c32890OooOOo.f118420OooOoO;
                this.f118430OooOoO = 1 | this.f118430OooOoO;
                this.f118431OooOoOO = i2;
            }
            if ((i & 2) == 2) {
                int i3 = c32890OooOOo.f118422OooOoOO;
                this.f118430OooOoO = 2 | this.f118430OooOoO;
                this.f118433OooOoo0 = i3;
            }
            if ((i & 4) == 4) {
                boolean z = c32890OooOOo.f118424OooOoo0;
                this.f118430OooOoO = 4 | this.f118430OooOoO;
                this.f118432OooOoo = z;
            }
            if ((i & 8) == 8) {
                OooO0OO oooO0OO = c32890OooOOo.f118423OooOoo;
                oooO0OO.getClass();
                this.f118430OooOoO = 8 | this.f118430OooOoO;
                this.f118434OooOooO = oooO0OO;
            }
            if (!c32890OooOOo.f118425OooOooO.isEmpty()) {
                if (this.f118435OooOooo.isEmpty()) {
                    this.f118435OooOooo = c32890OooOOo.f118425OooOooO;
                    this.f118430OooOoO &= -17;
                } else {
                    if ((this.f118430OooOoO & 16) != 16) {
                        this.f118435OooOooo = new ArrayList(this.f118435OooOooo);
                        this.f118430OooOoO |= 16;
                    }
                    this.f118435OooOooo.addAll(c32890OooOOo.f118425OooOooO);
                }
            }
            if (!c32890OooOOo.f118426OooOooo.isEmpty()) {
                if (this.f118436Oooo000.isEmpty()) {
                    this.f118436Oooo000 = c32890OooOOo.f118426OooOooo;
                    this.f118430OooOoO &= -33;
                } else {
                    if ((this.f118430OooOoO & 32) != 32) {
                        this.f118436Oooo000 = new ArrayList(this.f118436Oooo000);
                        this.f118430OooOoO |= 32;
                    }
                    this.f118436Oooo000.addAll(c32890OooOOo.f118426OooOooo);
                }
            }
            OooO0o0(c32890OooOOo);
            this.f119081OooOo0o = this.f119081OooOo0o.OooO0OO(c32890OooOOo.f118419OooOo);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0oo(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            C32890OooOOo c32890OooOOo = null;
            try {
                try {
                    C32890OooOOo.f118418Oooo0O0.getClass();
                    OooO0oO(new C32890OooOOo(c32951OooO0Oo, oooO0o));
                } catch (oO0OOOO0.OooOO0 e) {
                    C32890OooOOo c32890OooOOo2 = (C32890OooOOo) e.f119095OooOo0o;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c32890OooOOo = c32890OooOOo2;
                        if (c32890OooOOo != null) {
                            OooO0oO(c32890OooOOo);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c32890OooOOo != null) {
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
            C32890OooOOo c32890OooOOoOooO0o = OooO0o();
            if (c32890OooOOoOooO0o.isInitialized()) {
                return c32890OooOOoOooO0o;
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

    /* JADX INFO: renamed from: oO0OO00.OooOOo$OooO0OO */
    public enum OooO0OO implements OooO.OooO00o {
        IN(0),
        OUT(1),
        INV(2);


        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f118441OooOo0o;

        OooO0OO(int i) {
            this.f118441OooOo0o = i;
        }

        @Override // oO0OOOO0.OooO.OooO00o
        public final int getNumber() {
            return this.f118441OooOo0o;
        }
    }

    static {
        C32890OooOOo c32890OooOOo = new C32890OooOOo(0);
        f118417Oooo0 = c32890OooOOo;
        c32890OooOOo.f118420OooOoO = 0;
        c32890OooOOo.f118422OooOoOO = 0;
        c32890OooOOo.f118424OooOoo0 = false;
        c32890OooOOo.f118423OooOoo = OooO0OO.INV;
        List list = Collections.EMPTY_LIST;
        c32890OooOOo.f118425OooOooO = list;
        c32890OooOOo.f118426OooOooo = list;
    }

    public C32890OooOOo() {
        throw null;
    }

    public C32890OooOOo(OooO0O0 oooO0O0) {
        super(oooO0O0);
        this.f118427Oooo000 = -1;
        this.f118428Oooo00O = (byte) -1;
        this.f118429Oooo00o = -1;
        this.f118419OooOo = oooO0O0.f119081OooOo0o;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException {
        getSerializedSize();
        AbstractC32954OooO0oo.OooO0OO.OooO00o oooO00o = new AbstractC32954OooO0oo.OooO0OO.OooO00o(this);
        if ((this.f118421OooOoO0 & 1) == 1) {
            c32952OooO0o0.OooOOO0(1, this.f118420OooOoO);
        }
        if ((this.f118421OooOoO0 & 2) == 2) {
            c32952OooO0o0.OooOOO0(2, this.f118422OooOoOO);
        }
        if ((this.f118421OooOoO0 & 4) == 4) {
            boolean z = this.f118424OooOoo0;
            c32952OooO0o0.OooOo(3, 0);
            c32952OooO0o0.OooOOo0(z ? 1 : 0);
        }
        if ((this.f118421OooOoO0 & 8) == 8) {
            c32952OooO0o0.OooOO0o(4, this.f118423OooOoo.f118441OooOo0o);
        }
        for (int i = 0; i < this.f118425OooOooO.size(); i++) {
            c32952OooO0o0.OooOOOO(5, this.f118425OooOooO.get(i));
        }
        if (this.f118426OooOooo.size() > 0) {
            c32952OooO0o0.OooOo0O(50);
            c32952OooO0o0.OooOo0O(this.f118427Oooo000);
        }
        for (int i2 = 0; i2 < this.f118426OooOooo.size(); i2++) {
            c32952OooO0o0.OooOOO(this.f118426OooOooo.get(i2).intValue());
        }
        oooO00o.OooO00o(1000, c32952OooO0o0);
        c32952OooO0o0.OooOOo(this.f118419OooOo);
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final InterfaceC32958OooOOOo getDefaultInstanceForType() {
        return f118417Oooo0;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final int getSerializedSize() {
        int i = this.f118429Oooo00o;
        if (i != -1) {
            return i;
        }
        int iOooO0O0 = (this.f118421OooOoO0 & 1) == 1 ? C32952OooO0o0.OooO0O0(1, this.f118420OooOoO) : 0;
        if ((this.f118421OooOoO0 & 2) == 2) {
            iOooO0O0 += C32952OooO0o0.OooO0O0(2, this.f118422OooOoOO);
        }
        if ((this.f118421OooOoO0 & 4) == 4) {
            iOooO0O0 += C32952OooO0o0.OooO0oo(3) + 1;
        }
        if ((this.f118421OooOoO0 & 8) == 8) {
            iOooO0O0 += C32952OooO0o0.OooO00o(4, this.f118423OooOoo.f118441OooOo0o);
        }
        for (int i2 = 0; i2 < this.f118425OooOooO.size(); i2++) {
            iOooO0O0 += C32952OooO0o0.OooO0Oo(5, this.f118425OooOooO.get(i2));
        }
        int iOooO0OO = 0;
        for (int i3 = 0; i3 < this.f118426OooOooo.size(); i3++) {
            iOooO0OO += C32952OooO0o0.OooO0OO(this.f118426OooOooo.get(i3).intValue());
        }
        int iOooO0OO2 = iOooO0O0 + iOooO0OO;
        if (!this.f118426OooOooo.isEmpty()) {
            iOooO0OO2 = iOooO0OO2 + 1 + C32952OooO0o0.OooO0OO(iOooO0OO);
        }
        this.f118427Oooo000 = iOooO0OO;
        int size = this.f118419OooOo.size() + OooO0o0() + iOooO0OO2;
        this.f118429Oooo00o = size;
        return size;
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final boolean isInitialized() {
        byte b = this.f118428Oooo00O;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f118421OooOoO0;
        if ((i & 1) != 1) {
            this.f118428Oooo00O = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.f118428Oooo00O = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f118425OooOooO.size(); i2++) {
            if (!this.f118425OooOooO.get(i2).isInitialized()) {
                this.f118428Oooo00O = (byte) 0;
                return false;
            }
        }
        if (OooO0Oo()) {
            this.f118428Oooo00O = (byte) 1;
            return true;
        }
        this.f118428Oooo00O = (byte) 0;
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

    public C32890OooOOo(int i) {
        this.f118427Oooo000 = -1;
        this.f118428Oooo00O = (byte) -1;
        this.f118429Oooo00o = -1;
        this.f118419OooOo = oO0OOOO0.OooO0OO.f119053OooOo0o;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public C32890OooOOo(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
        OooO0OO oooO0OO;
        this.f118427Oooo000 = -1;
        this.f118428Oooo00O = (byte) -1;
        this.f118429Oooo00o = -1;
        this.f118420OooOoO = 0;
        this.f118422OooOoOO = 0;
        this.f118424OooOoo0 = false;
        OooO0OO oooO0OO2 = OooO0OO.INV;
        this.f118423OooOoo = oooO0OO2;
        List list = Collections.EMPTY_LIST;
        this.f118425OooOooO = list;
        this.f118426OooOooo = list;
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
                            this.f118421OooOoO0 |= 1;
                            this.f118420OooOoO = c32951OooO0Oo.OooOO0O();
                        } else if (iOooOOO == 16) {
                            this.f118421OooOoO0 |= 2;
                            this.f118422OooOoOO = c32951OooO0Oo.OooOO0O();
                        } else if (iOooOOO == 24) {
                            this.f118421OooOoO0 |= 4;
                            this.f118424OooOoo0 = c32951OooO0Oo.OooOO0o() != 0;
                        } else if (iOooOOO == 32) {
                            int iOooOO0O = c32951OooO0Oo.OooOO0O();
                            if (iOooOO0O == 0) {
                                oooO0OO = OooO0OO.IN;
                            } else if (iOooOO0O != 1) {
                                oooO0OO = iOooOO0O != 2 ? null : oooO0OO2;
                            } else {
                                oooO0OO = OooO0OO.OUT;
                            }
                            if (oooO0OO == null) {
                                c32952OooO0o0OooOO0.OooOo0O(iOooOOO);
                                c32952OooO0o0OooOO0.OooOo0O(iOooOO0O);
                            } else {
                                this.f118421OooOoO0 |= 8;
                                this.f118423OooOoo = oooO0OO;
                            }
                        } else if (iOooOOO == 42) {
                            if ((i & 16) != 16) {
                                this.f118425OooOooO = new ArrayList();
                                i |= 16;
                            }
                            this.f118425OooOooO.add((C32889OooOOOo) c32951OooO0Oo.OooO0oO(C32889OooOOOo.f118364OoooO00, oooO0o));
                        } else if (iOooOOO == 48) {
                            if ((i & 32) != 32) {
                                this.f118426OooOooo = new ArrayList();
                                i |= 32;
                            }
                            this.f118426OooOooo.add(Integer.valueOf(c32951OooO0Oo.OooOO0O()));
                        } else if (iOooOOO != 50) {
                            if (!OooO(c32951OooO0Oo, c32952OooO0o0OooOO0, oooO0o, iOooOOO)) {
                            }
                        } else {
                            int iOooO0Oo = c32951OooO0Oo.OooO0Oo(c32951OooO0Oo.OooOO0O());
                            if ((i & 32) != 32 && c32951OooO0Oo.OooO0O0() > 0) {
                                this.f118426OooOooo = new ArrayList();
                                i |= 32;
                            }
                            while (c32951OooO0Oo.OooO0O0() > 0) {
                                this.f118426OooOooo.add(Integer.valueOf(c32951OooO0Oo.OooOO0O()));
                            }
                            c32951OooO0Oo.OooO0OO(iOooO0Oo);
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.f118425OooOooO = Collections.unmodifiableList(this.f118425OooOooO);
                    }
                    if ((i & 32) == 32) {
                        this.f118426OooOooo = Collections.unmodifiableList(this.f118426OooOooo);
                    }
                    try {
                        c32952OooO0o0OooOO0.OooO();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f118419OooOo = oooO0O0.OooOOO0();
                        throw th2;
                    }
                    this.f118419OooOo = oooO0O0.OooOOO0();
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
        if ((i & 16) == 16) {
            this.f118425OooOooO = Collections.unmodifiableList(this.f118425OooOooO);
        }
        if ((i & 32) == 32) {
            this.f118426OooOooo = Collections.unmodifiableList(this.f118426OooOooo);
        }
        try {
            c32952OooO0o0OooOO0.OooO();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f118419OooOo = oooO0O0.OooOOO0();
            throw th3;
        }
        this.f118419OooOo = oooO0O0.OooOOO0();
        OooO0oo();
    }
}
