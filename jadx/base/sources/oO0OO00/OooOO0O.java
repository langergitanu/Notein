package oO0OO00;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import oO0OO00.C32892OooOOoo;
import oO0OO00.C32895OooOo0O;
import oO0OOOO0.AbstractC32954OooO0oo;
import oO0OOOO0.C32951OooO0Oo;
import oO0OOOO0.C32952OooO0o0;
import oO0OOOO0.C32965OooOo0O;
import oO0OOOO0.InterfaceC32958OooOOOo;
import oO0OOOO0.OooO00o;
import oO0OOOO0.OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O extends AbstractC32954OooO0oo.OooO0OO<OooOO0O> {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final OooOO0O f118261Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final OooO00o f118262Oooo00o = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final oO0OOOO0.OooO0OO f118263OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public List<C32887OooO0oo> f118264OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f118265OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public List<OooOOO0> f118266OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public C32892OooOOoo f118267OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public List<C32891OooOOo0> f118268OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public C32895OooOo0O f118269OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public byte f118270OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f118271Oooo000;

    public static class OooO00o extends oO0OOOO0.OooO0O0<OooOO0O> {
        @Override // oO0OOOO0.InterfaceC32959OooOOo
        public final Object OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
            return new OooOO0O(c32951OooO0Oo, oooO0o);
        }
    }

    public static final class OooO0O0 extends AbstractC32954OooO0oo.OooO0O0<OooOO0O, OooO0O0> {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f118272OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public List<C32887OooO0oo> f118273OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public List<C32891OooOOo0> f118274OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public List<OooOOO0> f118275OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public C32892OooOOoo f118276OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public C32895OooOo0O f118277OooOooo;

        public OooO0O0() {
            List list = Collections.EMPTY_LIST;
            this.f118273OooOoOO = list;
            this.f118275OooOoo0 = list;
            this.f118274OooOoo = list;
            this.f118276OooOooO = C32892OooOOoo.f118467OooOoo;
            this.f118277OooOooo = C32895OooOo0O.f118526OooOoOO;
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
            OooO0oO((OooOO0O) abstractC32954OooO0oo);
            return this;
        }

        public final OooOO0O OooO0o() {
            OooOO0O oooOO0O = new OooOO0O(this);
            int i = this.f118272OooOoO;
            if ((i & 1) == 1) {
                this.f118273OooOoOO = Collections.unmodifiableList(this.f118273OooOoOO);
                this.f118272OooOoO &= -2;
            }
            oooOO0O.f118264OooOoO = this.f118273OooOoOO;
            if ((this.f118272OooOoO & 2) == 2) {
                this.f118275OooOoo0 = Collections.unmodifiableList(this.f118275OooOoo0);
                this.f118272OooOoO &= -3;
            }
            oooOO0O.f118266OooOoOO = this.f118275OooOoo0;
            if ((this.f118272OooOoO & 4) == 4) {
                this.f118274OooOoo = Collections.unmodifiableList(this.f118274OooOoo);
                this.f118272OooOoO &= -5;
            }
            oooOO0O.f118268OooOoo0 = this.f118274OooOoo;
            int i2 = (i & 8) != 8 ? 0 : 1;
            oooOO0O.f118267OooOoo = this.f118276OooOooO;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            oooOO0O.f118269OooOooO = this.f118277OooOooo;
            oooOO0O.f118265OooOoO0 = i2;
            return oooOO0O;
        }

        public final void OooO0oO(OooOO0O oooOO0O) {
            C32895OooOo0O c32895OooOo0O;
            C32892OooOOoo c32892OooOOoo;
            if (oooOO0O == OooOO0O.f118261Oooo00O) {
                return;
            }
            if (!oooOO0O.f118264OooOoO.isEmpty()) {
                if (this.f118273OooOoOO.isEmpty()) {
                    this.f118273OooOoOO = oooOO0O.f118264OooOoO;
                    this.f118272OooOoO &= -2;
                } else {
                    if ((this.f118272OooOoO & 1) != 1) {
                        this.f118273OooOoOO = new ArrayList(this.f118273OooOoOO);
                        this.f118272OooOoO |= 1;
                    }
                    this.f118273OooOoOO.addAll(oooOO0O.f118264OooOoO);
                }
            }
            if (!oooOO0O.f118266OooOoOO.isEmpty()) {
                if (this.f118275OooOoo0.isEmpty()) {
                    this.f118275OooOoo0 = oooOO0O.f118266OooOoOO;
                    this.f118272OooOoO &= -3;
                } else {
                    if ((this.f118272OooOoO & 2) != 2) {
                        this.f118275OooOoo0 = new ArrayList(this.f118275OooOoo0);
                        this.f118272OooOoO |= 2;
                    }
                    this.f118275OooOoo0.addAll(oooOO0O.f118266OooOoOO);
                }
            }
            if (!oooOO0O.f118268OooOoo0.isEmpty()) {
                if (this.f118274OooOoo.isEmpty()) {
                    this.f118274OooOoo = oooOO0O.f118268OooOoo0;
                    this.f118272OooOoO &= -5;
                } else {
                    if ((this.f118272OooOoO & 4) != 4) {
                        this.f118274OooOoo = new ArrayList(this.f118274OooOoo);
                        this.f118272OooOoO |= 4;
                    }
                    this.f118274OooOoo.addAll(oooOO0O.f118268OooOoo0);
                }
            }
            if ((oooOO0O.f118265OooOoO0 & 1) == 1) {
                C32892OooOOoo c32892OooOOoo2 = oooOO0O.f118267OooOoo;
                if ((this.f118272OooOoO & 8) != 8 || (c32892OooOOoo = this.f118276OooOooO) == C32892OooOOoo.f118467OooOoo) {
                    this.f118276OooOooO = c32892OooOOoo2;
                } else {
                    C32892OooOOoo.OooO0O0 oooO0O0OooO0Oo = C32892OooOOoo.OooO0Oo(c32892OooOOoo);
                    oooO0O0OooO0Oo.OooO0o(c32892OooOOoo2);
                    this.f118276OooOooO = oooO0O0OooO0Oo.OooO0o0();
                }
                this.f118272OooOoO |= 8;
            }
            if ((oooOO0O.f118265OooOoO0 & 2) == 2) {
                C32895OooOo0O c32895OooOo0O2 = oooOO0O.f118269OooOooO;
                if ((this.f118272OooOoO & 16) != 16 || (c32895OooOo0O = this.f118277OooOooo) == C32895OooOo0O.f118526OooOoOO) {
                    this.f118277OooOooo = c32895OooOo0O2;
                } else {
                    C32895OooOo0O.OooO0O0 oooO0O0 = new C32895OooOo0O.OooO0O0();
                    oooO0O0.OooO0o(c32895OooOo0O);
                    oooO0O0.OooO0o(c32895OooOo0O2);
                    this.f118277OooOooo = oooO0O0.OooO0o0();
                }
                this.f118272OooOoO |= 16;
            }
            OooO0o0(oooOO0O);
            this.f119081OooOo0o = this.f119081OooOo0o.OooO0OO(oooOO0O.f118263OooOo);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0oo(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            OooOO0O oooOO0O = null;
            try {
                try {
                    OooOO0O.f118262Oooo00o.getClass();
                    OooO0oO(new OooOO0O(c32951OooO0Oo, oooO0o));
                } catch (oO0OOOO0.OooOO0 e) {
                    OooOO0O oooOO0O2 = (OooOO0O) e.f119095OooOo0o;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        oooOO0O = oooOO0O2;
                        if (oooOO0O != null) {
                            OooO0oO(oooOO0O);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (oooOO0O != null) {
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
            OooOO0O oooOO0OOooO0o = OooO0o();
            if (oooOO0OOooO0o.isInitialized()) {
                return oooOO0OOooO0o;
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
        OooOO0O oooOO0O = new OooOO0O(0);
        f118261Oooo00O = oooOO0O;
        List list = Collections.EMPTY_LIST;
        oooOO0O.f118264OooOoO = list;
        oooOO0O.f118266OooOoOO = list;
        oooOO0O.f118268OooOoo0 = list;
        oooOO0O.f118267OooOoo = C32892OooOOoo.f118467OooOoo;
        oooOO0O.f118269OooOooO = C32895OooOo0O.f118526OooOoOO;
    }

    public OooOO0O() {
        throw null;
    }

    public OooOO0O(OooO0O0 oooO0O0) {
        super(oooO0O0);
        this.f118270OooOooo = (byte) -1;
        this.f118271Oooo000 = -1;
        this.f118263OooOo = oooO0O0.f119081OooOo0o;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException {
        getSerializedSize();
        AbstractC32954OooO0oo.OooO0OO.OooO00o oooO00o = new AbstractC32954OooO0oo.OooO0OO.OooO00o(this);
        for (int i = 0; i < this.f118264OooOoO.size(); i++) {
            c32952OooO0o0.OooOOOO(3, this.f118264OooOoO.get(i));
        }
        for (int i2 = 0; i2 < this.f118266OooOoOO.size(); i2++) {
            c32952OooO0o0.OooOOOO(4, this.f118266OooOoOO.get(i2));
        }
        for (int i3 = 0; i3 < this.f118268OooOoo0.size(); i3++) {
            c32952OooO0o0.OooOOOO(5, this.f118268OooOoo0.get(i3));
        }
        if ((this.f118265OooOoO0 & 1) == 1) {
            c32952OooO0o0.OooOOOO(30, this.f118267OooOoo);
        }
        if ((this.f118265OooOoO0 & 2) == 2) {
            c32952OooO0o0.OooOOOO(32, this.f118269OooOooO);
        }
        oooO00o.OooO00o(200, c32952OooO0o0);
        c32952OooO0o0.OooOOo(this.f118263OooOo);
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final InterfaceC32958OooOOOo getDefaultInstanceForType() {
        return f118261Oooo00O;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final int getSerializedSize() {
        int i = this.f118271Oooo000;
        if (i != -1) {
            return i;
        }
        int iOooO0Oo = 0;
        for (int i2 = 0; i2 < this.f118264OooOoO.size(); i2++) {
            iOooO0Oo += C32952OooO0o0.OooO0Oo(3, this.f118264OooOoO.get(i2));
        }
        for (int i3 = 0; i3 < this.f118266OooOoOO.size(); i3++) {
            iOooO0Oo += C32952OooO0o0.OooO0Oo(4, this.f118266OooOoOO.get(i3));
        }
        for (int i4 = 0; i4 < this.f118268OooOoo0.size(); i4++) {
            iOooO0Oo += C32952OooO0o0.OooO0Oo(5, this.f118268OooOoo0.get(i4));
        }
        if ((this.f118265OooOoO0 & 1) == 1) {
            iOooO0Oo += C32952OooO0o0.OooO0Oo(30, this.f118267OooOoo);
        }
        if ((this.f118265OooOoO0 & 2) == 2) {
            iOooO0Oo += C32952OooO0o0.OooO0Oo(32, this.f118269OooOooO);
        }
        int size = this.f118263OooOo.size() + OooO0o0() + iOooO0Oo;
        this.f118271Oooo000 = size;
        return size;
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final boolean isInitialized() {
        byte b = this.f118270OooOooo;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f118264OooOoO.size(); i++) {
            if (!this.f118264OooOoO.get(i).isInitialized()) {
                this.f118270OooOooo = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f118266OooOoOO.size(); i2++) {
            if (!this.f118266OooOoOO.get(i2).isInitialized()) {
                this.f118270OooOooo = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f118268OooOoo0.size(); i3++) {
            if (!this.f118268OooOoo0.get(i3).isInitialized()) {
                this.f118270OooOooo = (byte) 0;
                return false;
            }
        }
        if ((this.f118265OooOoO0 & 1) == 1 && !this.f118267OooOoo.isInitialized()) {
            this.f118270OooOooo = (byte) 0;
            return false;
        }
        if (OooO0Oo()) {
            this.f118270OooOooo = (byte) 1;
            return true;
        }
        this.f118270OooOooo = (byte) 0;
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

    public OooOO0O(int i) {
        this.f118270OooOooo = (byte) -1;
        this.f118271Oooo000 = -1;
        this.f118263OooOo = oO0OOOO0.OooO0OO.f119053OooOo0o;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public OooOO0O(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
        this.f118270OooOooo = (byte) -1;
        this.f118271Oooo000 = -1;
        List list = Collections.EMPTY_LIST;
        this.f118264OooOoO = list;
        this.f118266OooOoOO = list;
        this.f118268OooOoo0 = list;
        this.f118267OooOoo = C32892OooOOoo.f118467OooOoo;
        this.f118269OooOooO = C32895OooOo0O.f118526OooOoOO;
        OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
        C32952OooO0o0 c32952OooO0o0OooOO0 = C32952OooO0o0.OooOO0(oooO0O0, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iOooOOO = c32951OooO0Oo.OooOOO();
                        if (iOooOOO != 0) {
                            if (iOooOOO == 26) {
                                int i2 = (i == true ? 1 : 0) & 1;
                                i = i;
                                if (i2 != 1) {
                                    this.f118264OooOoO = new ArrayList();
                                    i = (i == true ? 1 : 0) | 1;
                                }
                                this.f118264OooOoO.add((C32887OooO0oo) c32951OooO0Oo.OooO0oO(C32887OooO0oo.f118223OoooO0, oooO0o));
                            } else if (iOooOOO == 34) {
                                int i3 = (i == true ? 1 : 0) & 2;
                                i = i;
                                if (i3 != 2) {
                                    this.f118266OooOoOO = new ArrayList();
                                    i = (i == true ? 1 : 0) | 2;
                                }
                                this.f118266OooOoOO.add((OooOOO0) c32951OooO0Oo.OooO0oO(OooOOO0.f118319OoooO0, oooO0o));
                            } else if (iOooOOO != 42) {
                                C32895OooOo0O.OooO0O0 oooO0O02 = null;
                                C32892OooOOoo.OooO0O0 oooO0O0OooO0Oo = null;
                                if (iOooOOO == 242) {
                                    if ((this.f118265OooOoO0 & 1) == 1) {
                                        C32892OooOOoo c32892OooOOoo = this.f118267OooOoo;
                                        c32892OooOOoo.getClass();
                                        oooO0O0OooO0Oo = C32892OooOOoo.OooO0Oo(c32892OooOOoo);
                                    }
                                    C32892OooOOoo c32892OooOOoo2 = (C32892OooOOoo) c32951OooO0Oo.OooO0oO(C32892OooOOoo.f118468OooOooO, oooO0o);
                                    this.f118267OooOoo = c32892OooOOoo2;
                                    if (oooO0O0OooO0Oo != null) {
                                        oooO0O0OooO0Oo.OooO0o(c32892OooOOoo2);
                                        this.f118267OooOoo = oooO0O0OooO0Oo.OooO0o0();
                                    }
                                    this.f118265OooOoO0 |= 1;
                                } else if (iOooOOO != 258) {
                                    if (!OooO(c32951OooO0Oo, c32952OooO0o0OooOO0, oooO0o, iOooOOO)) {
                                    }
                                } else {
                                    if ((this.f118265OooOoO0 & 2) == 2) {
                                        C32895OooOo0O c32895OooOo0O = this.f118269OooOooO;
                                        c32895OooOo0O.getClass();
                                        oooO0O02 = new C32895OooOo0O.OooO0O0();
                                        oooO0O02.OooO0o(c32895OooOo0O);
                                    }
                                    C32895OooOo0O c32895OooOo0O2 = (C32895OooOo0O) c32951OooO0Oo.OooO0oO(C32895OooOo0O.f118527OooOoo0, oooO0o);
                                    this.f118269OooOooO = c32895OooOo0O2;
                                    if (oooO0O02 != null) {
                                        oooO0O02.OooO0o(c32895OooOo0O2);
                                        this.f118269OooOooO = oooO0O02.OooO0o0();
                                    }
                                    this.f118265OooOoO0 |= 2;
                                }
                            } else {
                                int i4 = (i == true ? 1 : 0) & 4;
                                i = i;
                                if (i4 != 4) {
                                    this.f118268OooOoo0 = new ArrayList();
                                    i = (i == true ? 1 : 0) | 4;
                                }
                                this.f118268OooOoo0.add((C32891OooOOo0) c32951OooO0Oo.OooO0oO(C32891OooOOo0.f118443Oooo0o0, oooO0o));
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        oO0OOOO0.OooOO0 oooOO02 = new oO0OOOO0.OooOO0(e.getMessage());
                        oooOO02.f119095OooOo0o = this;
                        throw oooOO02;
                    }
                } catch (oO0OOOO0.OooOO0 e2) {
                    e2.f119095OooOo0o = this;
                    throw e2;
                }
            } catch (Throwable th) {
                if (((i == true ? 1 : 0) & 1) == 1) {
                    this.f118264OooOoO = Collections.unmodifiableList(this.f118264OooOoO);
                }
                if (((i == true ? 1 : 0) & 2) == 2) {
                    this.f118266OooOoOO = Collections.unmodifiableList(this.f118266OooOoOO);
                }
                if (((i == true ? 1 : 0) & 4) == 4) {
                    this.f118268OooOoo0 = Collections.unmodifiableList(this.f118268OooOoo0);
                }
                try {
                    c32952OooO0o0OooOO0.OooO();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f118263OooOo = oooO0O0.OooOOO0();
                    throw th2;
                }
                this.f118263OooOo = oooO0O0.OooOOO0();
                OooO0oo();
                throw th;
            }
        }
        if (((i == true ? 1 : 0) & 1) == 1) {
            this.f118264OooOoO = Collections.unmodifiableList(this.f118264OooOoO);
        }
        if (((i == true ? 1 : 0) & 2) == 2) {
            this.f118266OooOoOO = Collections.unmodifiableList(this.f118266OooOoOO);
        }
        if (((i == true ? 1 : 0) & 4) == 4) {
            this.f118268OooOoo0 = Collections.unmodifiableList(this.f118268OooOoo0);
        }
        try {
            c32952OooO0o0OooOO0.OooO();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f118263OooOo = oooO0O0.OooOOO0();
            throw th3;
        }
        this.f118263OooOo = oooO0O0.OooOOO0();
        OooO0oo();
    }
}
