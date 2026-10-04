package oO0OO00;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import oO0OO00.C32886OooO0oO;
import oO0OOOO0.AbstractC32954OooO0oo;
import oO0OOOO0.C32951OooO0Oo;
import oO0OOOO0.C32952OooO0o0;
import oO0OOOO0.C32965OooOo0O;
import oO0OOOO0.InterfaceC32958OooOOOo;
import oO0OOOO0.InterfaceC32960OooOOo0;
import oO0OOOO0.OooO;
import oO0OOOO0.OooO00o;
import oO0OOOO0.OooO0OO;

/* JADX INFO: renamed from: oO0OO00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32884OooO0o0 extends AbstractC32954OooO0oo implements InterfaceC32960OooOOo0 {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final C32884OooO0o0 f118172OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final OooO00o f118173Oooo000 = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f118174OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO0OOOO0.OooO0OO f118175OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public List<C32886OooO0oO> f118176OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public OooO0OO f118177OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C32886OooO0oO f118178OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public byte f118179OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public EnumC32885OooO0Oo f118180OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f118181OooOooO;

    /* JADX INFO: renamed from: oO0OO00.OooO0o0$OooO00o */
    public static class OooO00o extends oO0OOOO0.OooO0O0<C32884OooO0o0> {
        @Override // oO0OOOO0.InterfaceC32959OooOOo
        public final Object OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
            return new C32884OooO0o0(c32951OooO0Oo, oooO0o);
        }
    }

    /* JADX INFO: renamed from: oO0OO00.OooO0o0$OooO0O0 */
    public static final class OooO0O0 extends AbstractC32954OooO0oo.OooO00o<C32884OooO0o0, OooO0O0> implements InterfaceC32960OooOOo0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f118182OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public OooO0OO f118184OooOoO0 = OooO0OO.RETURNS_CONSTANT;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public List<C32886OooO0oO> f118183OooOoO = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public C32886OooO0oO f118185OooOoOO = C32886OooO0oO.f118198Oooo00o;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public EnumC32885OooO0Oo f118186OooOoo0 = EnumC32885OooO0Oo.AT_MOST_ONCE;

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
            OooO0o((C32884OooO0o0) abstractC32954OooO0oo);
            return this;
        }

        public final void OooO0o(C32884OooO0o0 c32884OooO0o0) {
            C32886OooO0oO c32886OooO0oO;
            if (c32884OooO0o0 == C32884OooO0o0.f118172OooOooo) {
                return;
            }
            if ((c32884OooO0o0.f118174OooOo & 1) == 1) {
                OooO0OO oooO0OO = c32884OooO0o0.f118177OooOoO0;
                oooO0OO.getClass();
                this.f118182OooOo |= 1;
                this.f118184OooOoO0 = oooO0OO;
            }
            if (!c32884OooO0o0.f118176OooOoO.isEmpty()) {
                if (this.f118183OooOoO.isEmpty()) {
                    this.f118183OooOoO = c32884OooO0o0.f118176OooOoO;
                    this.f118182OooOo &= -3;
                } else {
                    if ((this.f118182OooOo & 2) != 2) {
                        this.f118183OooOoO = new ArrayList(this.f118183OooOoO);
                        this.f118182OooOo |= 2;
                    }
                    this.f118183OooOoO.addAll(c32884OooO0o0.f118176OooOoO);
                }
            }
            if ((c32884OooO0o0.f118174OooOo & 2) == 2) {
                C32886OooO0oO c32886OooO0oO2 = c32884OooO0o0.f118178OooOoOO;
                if ((this.f118182OooOo & 4) != 4 || (c32886OooO0oO = this.f118185OooOoOO) == C32886OooO0oO.f118198Oooo00o) {
                    this.f118185OooOoOO = c32886OooO0oO2;
                } else {
                    C32886OooO0oO.OooO0O0 oooO0O0 = new C32886OooO0oO.OooO0O0();
                    oooO0O0.OooO0o(c32886OooO0oO);
                    oooO0O0.OooO0o(c32886OooO0oO2);
                    this.f118185OooOoOO = oooO0O0.OooO0o0();
                }
                this.f118182OooOo |= 4;
            }
            if ((c32884OooO0o0.f118174OooOo & 4) == 4) {
                EnumC32885OooO0Oo enumC32885OooO0Oo = c32884OooO0o0.f118180OooOoo0;
                enumC32885OooO0Oo.getClass();
                this.f118182OooOo |= 8;
                this.f118186OooOoo0 = enumC32885OooO0Oo;
            }
            this.f119081OooOo0o = this.f119081OooOo0o.OooO0OO(c32884OooO0o0.f118175OooOo0o);
        }

        public final C32884OooO0o0 OooO0o0() {
            C32884OooO0o0 c32884OooO0o0 = new C32884OooO0o0(this);
            int i = this.f118182OooOo;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c32884OooO0o0.f118177OooOoO0 = this.f118184OooOoO0;
            if ((i & 2) == 2) {
                this.f118183OooOoO = Collections.unmodifiableList(this.f118183OooOoO);
                this.f118182OooOo &= -3;
            }
            c32884OooO0o0.f118176OooOoO = this.f118183OooOoO;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            c32884OooO0o0.f118178OooOoOO = this.f118185OooOoOO;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            c32884OooO0o0.f118180OooOoo0 = this.f118186OooOoo0;
            c32884OooO0o0.f118174OooOo = i2;
            return c32884OooO0o0;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0oO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            C32884OooO0o0 c32884OooO0o0 = null;
            try {
                try {
                    C32884OooO0o0.f118173Oooo000.getClass();
                    OooO0o(new C32884OooO0o0(c32951OooO0Oo, oooO0o));
                } catch (oO0OOOO0.OooOO0 e) {
                    C32884OooO0o0 c32884OooO0o02 = (C32884OooO0o0) e.f119095OooOo0o;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c32884OooO0o0 = c32884OooO0o02;
                        if (c32884OooO0o0 != null) {
                            OooO0o(c32884OooO0o0);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c32884OooO0o0 != null) {
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
            C32884OooO0o0 c32884OooO0o0OooO0o0 = OooO0o0();
            if (c32884OooO0o0OooO0o0.isInitialized()) {
                return c32884OooO0o0OooO0o0;
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

    /* JADX INFO: renamed from: oO0OO00.OooO0o0$OooO0OO */
    public enum OooO0OO implements OooO.OooO00o {
        RETURNS_CONSTANT(0),
        CALLS(1),
        RETURNS_NOT_NULL(2);


        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f118191OooOo0o;

        OooO0OO(int i) {
            this.f118191OooOo0o = i;
        }

        @Override // oO0OOOO0.OooO.OooO00o
        public final int getNumber() {
            return this.f118191OooOo0o;
        }
    }

    /* JADX INFO: renamed from: oO0OO00.OooO0o0$OooO0Oo, reason: case insensitive filesystem */
    public enum EnumC32885OooO0Oo implements OooO.OooO00o {
        AT_MOST_ONCE(0),
        EXACTLY_ONCE(1),
        AT_LEAST_ONCE(2);


        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f118196OooOo0o;

        EnumC32885OooO0Oo(int i) {
            this.f118196OooOo0o = i;
        }

        @Override // oO0OOOO0.OooO.OooO00o
        public final int getNumber() {
            return this.f118196OooOo0o;
        }
    }

    static {
        C32884OooO0o0 c32884OooO0o0 = new C32884OooO0o0();
        f118172OooOooo = c32884OooO0o0;
        c32884OooO0o0.f118177OooOoO0 = OooO0OO.RETURNS_CONSTANT;
        c32884OooO0o0.f118176OooOoO = Collections.EMPTY_LIST;
        c32884OooO0o0.f118178OooOoOO = C32886OooO0oO.f118198Oooo00o;
        c32884OooO0o0.f118180OooOoo0 = EnumC32885OooO0Oo.AT_MOST_ONCE;
    }

    public C32884OooO0o0(OooO0O0 oooO0O0) {
        this.f118179OooOoo = (byte) -1;
        this.f118181OooOooO = -1;
        this.f118175OooOo0o = oooO0O0.f119081OooOo0o;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException {
        getSerializedSize();
        if ((this.f118174OooOo & 1) == 1) {
            c32952OooO0o0.OooOO0o(1, this.f118177OooOoO0.f118191OooOo0o);
        }
        for (int i = 0; i < this.f118176OooOoO.size(); i++) {
            c32952OooO0o0.OooOOOO(2, this.f118176OooOoO.get(i));
        }
        if ((this.f118174OooOo & 2) == 2) {
            c32952OooO0o0.OooOOOO(3, this.f118178OooOoOO);
        }
        if ((this.f118174OooOo & 4) == 4) {
            c32952OooO0o0.OooOO0o(4, this.f118180OooOoo0.f118196OooOo0o);
        }
        c32952OooO0o0.OooOOo(this.f118175OooOo0o);
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final int getSerializedSize() {
        int i = this.f118181OooOooO;
        if (i != -1) {
            return i;
        }
        int iOooO00o = (this.f118174OooOo & 1) == 1 ? C32952OooO0o0.OooO00o(1, this.f118177OooOoO0.f118191OooOo0o) : 0;
        for (int i2 = 0; i2 < this.f118176OooOoO.size(); i2++) {
            iOooO00o += C32952OooO0o0.OooO0Oo(2, this.f118176OooOoO.get(i2));
        }
        if ((this.f118174OooOo & 2) == 2) {
            iOooO00o += C32952OooO0o0.OooO0Oo(3, this.f118178OooOoOO);
        }
        if ((this.f118174OooOo & 4) == 4) {
            iOooO00o += C32952OooO0o0.OooO00o(4, this.f118180OooOoo0.f118196OooOo0o);
        }
        int size = this.f118175OooOo0o.size() + iOooO00o;
        this.f118181OooOooO = size;
        return size;
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final boolean isInitialized() {
        byte b = this.f118179OooOoo;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f118176OooOoO.size(); i++) {
            if (!this.f118176OooOoO.get(i).isInitialized()) {
                this.f118179OooOoo = (byte) 0;
                return false;
            }
        }
        if ((this.f118174OooOo & 2) != 2 || this.f118178OooOoOO.isInitialized()) {
            this.f118179OooOoo = (byte) 1;
            return true;
        }
        this.f118179OooOoo = (byte) 0;
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

    public C32884OooO0o0() {
        this.f118179OooOoo = (byte) -1;
        this.f118181OooOooO = -1;
        this.f118175OooOo0o = oO0OOOO0.OooO0OO.f119053OooOo0o;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public C32884OooO0o0(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
        this.f118179OooOoo = (byte) -1;
        this.f118181OooOooO = -1;
        OooO0OO oooO0OO = OooO0OO.RETURNS_CONSTANT;
        this.f118177OooOoO0 = oooO0OO;
        this.f118176OooOoO = Collections.EMPTY_LIST;
        this.f118178OooOoOO = C32886OooO0oO.f118198Oooo00o;
        EnumC32885OooO0Oo enumC32885OooO0Oo = EnumC32885OooO0Oo.AT_MOST_ONCE;
        this.f118180OooOoo0 = enumC32885OooO0Oo;
        OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
        C32952OooO0o0 c32952OooO0o0OooOO0 = C32952OooO0o0.OooOO0(oooO0O0, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iOooOOO = c32951OooO0Oo.OooOOO();
                    if (iOooOOO != 0) {
                        EnumC32885OooO0Oo enumC32885OooO0Oo2 = null;
                        OooO0OO oooO0OO2 = null;
                        C32886OooO0oO.OooO0O0 oooO0O02 = null;
                        if (iOooOOO == 8) {
                            int iOooOO0O = c32951OooO0Oo.OooOO0O();
                            if (iOooOO0O == 0) {
                                oooO0OO2 = oooO0OO;
                            } else if (iOooOO0O == 1) {
                                oooO0OO2 = OooO0OO.CALLS;
                            } else if (iOooOO0O == 2) {
                                oooO0OO2 = OooO0OO.RETURNS_NOT_NULL;
                            }
                            if (oooO0OO2 == null) {
                                c32952OooO0o0OooOO0.OooOo0O(iOooOOO);
                                c32952OooO0o0OooOO0.OooOo0O(iOooOO0O);
                            } else {
                                this.f118174OooOo |= 1;
                                this.f118177OooOoO0 = oooO0OO2;
                            }
                        } else if (iOooOOO == 18) {
                            int i = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i != 2) {
                                this.f118176OooOoO = new ArrayList();
                                c = 2;
                            }
                            this.f118176OooOoO.add((C32886OooO0oO) c32951OooO0Oo.OooO0oO(C32886OooO0oO.f118197Oooo0, oooO0o));
                        } else if (iOooOOO == 26) {
                            if ((this.f118174OooOo & 2) == 2) {
                                C32886OooO0oO c32886OooO0oO = this.f118178OooOoOO;
                                c32886OooO0oO.getClass();
                                oooO0O02 = new C32886OooO0oO.OooO0O0();
                                oooO0O02.OooO0o(c32886OooO0oO);
                            }
                            C32886OooO0oO c32886OooO0oO2 = (C32886OooO0oO) c32951OooO0Oo.OooO0oO(C32886OooO0oO.f118197Oooo0, oooO0o);
                            this.f118178OooOoOO = c32886OooO0oO2;
                            if (oooO0O02 != null) {
                                oooO0O02.OooO0o(c32886OooO0oO2);
                                this.f118178OooOoOO = oooO0O02.OooO0o0();
                            }
                            this.f118174OooOo |= 2;
                        } else if (iOooOOO != 32) {
                            if (!c32951OooO0Oo.OooOOo0(iOooOOO, c32952OooO0o0OooOO0)) {
                            }
                        } else {
                            int iOooOO0O2 = c32951OooO0Oo.OooOO0O();
                            if (iOooOO0O2 == 0) {
                                enumC32885OooO0Oo2 = enumC32885OooO0Oo;
                            } else if (iOooOO0O2 == 1) {
                                enumC32885OooO0Oo2 = EnumC32885OooO0Oo.EXACTLY_ONCE;
                            } else if (iOooOO0O2 == 2) {
                                enumC32885OooO0Oo2 = EnumC32885OooO0Oo.AT_LEAST_ONCE;
                            }
                            if (enumC32885OooO0Oo2 == null) {
                                c32952OooO0o0OooOO0.OooOo0O(iOooOOO);
                                c32952OooO0o0OooOO0.OooOo0O(iOooOO0O2);
                            } else {
                                this.f118174OooOo |= 4;
                                this.f118180OooOoo0 = enumC32885OooO0Oo2;
                            }
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 2) == 2) {
                        this.f118176OooOoO = Collections.unmodifiableList(this.f118176OooOoO);
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
        if (((c == true ? 1 : 0) & 2) == 2) {
            this.f118176OooOoO = Collections.unmodifiableList(this.f118176OooOoO);
        }
        try {
            c32952OooO0o0OooOO0.OooO();
        } catch (IOException unused2) {
        } finally {
            this.f118175OooOo0o = oooO0O0.OooOOO0();
        }
    }
}
