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
import oO0OOOO0.OooO;
import oO0OOOO0.OooO00o;
import oO0OOOO0.OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o extends AbstractC32954OooO0oo implements InterfaceC32960OooOOo0 {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final OooO00o f118008OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final C20262OooO00o f118009OooOooO = new C20262OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f118010OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO0OOOO0.OooO0OO f118011OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public List<OooO0O0> f118012OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f118013OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public byte f118014OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f118015OooOoo0;

    /* JADX INFO: renamed from: oO0OO00.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C20262OooO00o extends oO0OOOO0.OooO0O0<OooO00o> {
        @Override // oO0OOOO0.InterfaceC32959OooOOo
        public final Object OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
            return new OooO00o(c32951OooO0Oo, oooO0o);
        }
    }

    public static final class OooO0OO extends AbstractC32954OooO0oo.OooO00o<OooO00o, OooO0OO> implements InterfaceC32960OooOOo0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f118071OooOo;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public List<OooO0O0> f118072OooOoO = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f118073OooOoO0;

        @Override // oO0OOOO0.OooO00o.AbstractC20287OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final /* bridge */ /* synthetic */ OooO00o.AbstractC20287OooO00o Oooo0OO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            OooO0oO(c32951OooO0Oo, oooO0o);
            return this;
        }

        @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
        /* JADX INFO: renamed from: OooO0OO */
        public final AbstractC32954OooO0oo.OooO00o clone() {
            OooO0OO oooO0OO = new OooO0OO();
            oooO0OO.OooO0o(OooO0o0());
            return oooO0OO;
        }

        @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
        public final /* bridge */ /* synthetic */ AbstractC32954OooO0oo.OooO00o OooO0Oo(AbstractC32954OooO0oo abstractC32954OooO0oo) {
            OooO0o((OooO00o) abstractC32954OooO0oo);
            return this;
        }

        public final void OooO0o(OooO00o oooO00o) {
            if (oooO00o == OooO00o.f118008OooOoo) {
                return;
            }
            if ((oooO00o.f118010OooOo & 1) == 1) {
                int i = oooO00o.f118013OooOoO0;
                this.f118071OooOo = 1 | this.f118071OooOo;
                this.f118073OooOoO0 = i;
            }
            if (!oooO00o.f118012OooOoO.isEmpty()) {
                if (this.f118072OooOoO.isEmpty()) {
                    this.f118072OooOoO = oooO00o.f118012OooOoO;
                    this.f118071OooOo &= -3;
                } else {
                    if ((this.f118071OooOo & 2) != 2) {
                        this.f118072OooOoO = new ArrayList(this.f118072OooOoO);
                        this.f118071OooOo |= 2;
                    }
                    this.f118072OooOoO.addAll(oooO00o.f118012OooOoO);
                }
            }
            this.f119081OooOo0o = this.f119081OooOo0o.OooO0OO(oooO00o.f118011OooOo0o);
        }

        public final OooO00o OooO0o0() {
            OooO00o oooO00o = new OooO00o(this);
            int i = this.f118071OooOo;
            int i2 = (i & 1) != 1 ? 0 : 1;
            oooO00o.f118013OooOoO0 = this.f118073OooOoO0;
            if ((i & 2) == 2) {
                this.f118072OooOoO = Collections.unmodifiableList(this.f118072OooOoO);
                this.f118071OooOo &= -3;
            }
            oooO00o.f118012OooOoO = this.f118072OooOoO;
            oooO00o.f118010OooOo = i2;
            return oooO00o;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0oO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            OooO00o oooO00o = null;
            try {
                try {
                    OooO0o((OooO00o) OooO00o.f118009OooOooO.OooO00o(c32951OooO0Oo, oooO0o));
                } catch (oO0OOOO0.OooOO0 e) {
                    OooO00o oooO00o2 = (OooO00o) e.f119095OooOo0o;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        oooO00o = oooO00o2;
                        if (oooO00o != null) {
                            OooO0o(oooO00o);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (oooO00o != null) {
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
            OooO00o oooO00oOooO0o0 = OooO0o0();
            if (oooO00oOooO0o0.isInitialized()) {
                return oooO00oOooO0o0;
            }
            throw new C32965OooOo0O();
        }

        @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
        public final Object clone() throws CloneNotSupportedException {
            OooO0OO oooO0OO = new OooO0OO();
            oooO0OO.OooO0o(OooO0o0());
            return oooO0OO;
        }
    }

    static {
        OooO00o oooO00o = new OooO00o();
        f118008OooOoo = oooO00o;
        oooO00o.f118013OooOoO0 = 0;
        oooO00o.f118012OooOoO = Collections.EMPTY_LIST;
    }

    public OooO00o(OooO0OO oooO0OO) {
        this.f118014OooOoOO = (byte) -1;
        this.f118015OooOoo0 = -1;
        this.f118011OooOo0o = oooO0OO.f119081OooOo0o;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException {
        getSerializedSize();
        if ((this.f118010OooOo & 1) == 1) {
            c32952OooO0o0.OooOOO0(1, this.f118013OooOoO0);
        }
        for (int i = 0; i < this.f118012OooOoO.size(); i++) {
            c32952OooO0o0.OooOOOO(2, this.f118012OooOoO.get(i));
        }
        c32952OooO0o0.OooOOo(this.f118011OooOo0o);
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final int getSerializedSize() {
        int i = this.f118015OooOoo0;
        if (i != -1) {
            return i;
        }
        int iOooO0O0 = (this.f118010OooOo & 1) == 1 ? C32952OooO0o0.OooO0O0(1, this.f118013OooOoO0) : 0;
        for (int i2 = 0; i2 < this.f118012OooOoO.size(); i2++) {
            iOooO0O0 += C32952OooO0o0.OooO0Oo(2, this.f118012OooOoO.get(i2));
        }
        int size = this.f118011OooOo0o.size() + iOooO0O0;
        this.f118015OooOoo0 = size;
        return size;
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final boolean isInitialized() {
        byte b = this.f118014OooOoOO;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f118010OooOo & 1) != 1) {
            this.f118014OooOoOO = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f118012OooOoO.size(); i++) {
            if (!this.f118012OooOoO.get(i).isInitialized()) {
                this.f118014OooOoOO = (byte) 0;
                return false;
            }
        }
        this.f118014OooOoOO = (byte) 1;
        return true;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final InterfaceC32958OooOOOo.OooO00o newBuilderForType() {
        return new OooO0OO();
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final InterfaceC32958OooOOOo.OooO00o toBuilder() {
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.OooO0o(this);
        return oooO0OO;
    }

    public static final class OooO0O0 extends AbstractC32954OooO0oo implements InterfaceC32960OooOOo0 {

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final OooO0O0 f118016OooOoo;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final C20263OooO00o f118017OooOooO = new C20263OooO00o();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f118018OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final oO0OOOO0.OooO0OO f118019OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public OooO0OO f118020OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f118021OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public byte f118022OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f118023OooOoo0;

        /* JADX INFO: renamed from: oO0OO00.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        public static class C20263OooO00o extends oO0OOOO0.OooO0O0<OooO0O0> {
            @Override // oO0OOOO0.InterfaceC32959OooOOo
            public final Object OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
                return new OooO0O0(c32951OooO0Oo, oooO0o);
            }
        }

        /* JADX INFO: renamed from: oO0OO00.OooO00o$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C20264OooO0O0 extends AbstractC32954OooO0oo.OooO00o<OooO0O0, C20264OooO0O0> implements InterfaceC32960OooOOo0 {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f118024OooOo;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public OooO0OO f118025OooOoO = OooO0OO.f118028Oooo0o0;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public int f118026OooOoO0;

            @Override // oO0OOOO0.OooO00o.AbstractC20287OooO00o
            /* JADX INFO: renamed from: OooO0O0 */
            public final /* bridge */ /* synthetic */ OooO00o.AbstractC20287OooO00o Oooo0OO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
                OooO0oO(c32951OooO0Oo, oooO0o);
                return this;
            }

            @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
            /* JADX INFO: renamed from: OooO0OO */
            public final AbstractC32954OooO0oo.OooO00o clone() {
                C20264OooO0O0 c20264OooO0O0 = new C20264OooO0O0();
                c20264OooO0O0.OooO0o(OooO0o0());
                return c20264OooO0O0;
            }

            @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
            public final /* bridge */ /* synthetic */ AbstractC32954OooO0oo.OooO00o OooO0Oo(AbstractC32954OooO0oo abstractC32954OooO0oo) {
                OooO0o((OooO0O0) abstractC32954OooO0oo);
                return this;
            }

            public final void OooO0o(OooO0O0 oooO0O0) {
                OooO0OO oooO0OO;
                if (oooO0O0 == OooO0O0.f118016OooOoo) {
                    return;
                }
                int i = oooO0O0.f118018OooOo;
                if ((i & 1) == 1) {
                    int i2 = oooO0O0.f118021OooOoO0;
                    this.f118024OooOo = 1 | this.f118024OooOo;
                    this.f118026OooOoO0 = i2;
                }
                if ((i & 2) == 2) {
                    OooO0OO oooO0OO2 = oooO0O0.f118020OooOoO;
                    if ((this.f118024OooOo & 2) != 2 || (oooO0OO = this.f118025OooOoO) == OooO0OO.f118028Oooo0o0) {
                        this.f118025OooOoO = oooO0OO2;
                    } else {
                        OooO0OO.C20266OooO0O0 c20266OooO0O0 = new OooO0OO.C20266OooO0O0();
                        c20266OooO0O0.OooO0o(oooO0OO);
                        c20266OooO0O0.OooO0o(oooO0OO2);
                        this.f118025OooOoO = c20266OooO0O0.OooO0o0();
                    }
                    this.f118024OooOo |= 2;
                }
                this.f119081OooOo0o = this.f119081OooOo0o.OooO0OO(oooO0O0.f118019OooOo0o);
            }

            public final OooO0O0 OooO0o0() {
                OooO0O0 oooO0O0 = new OooO0O0(this);
                int i = this.f118024OooOo;
                int i2 = (i & 1) != 1 ? 0 : 1;
                oooO0O0.f118021OooOoO0 = this.f118026OooOoO0;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                oooO0O0.f118020OooOoO = this.f118025OooOoO;
                oooO0O0.f118018OooOo = i2;
                return oooO0O0;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void OooO0oO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
                OooO0O0 oooO0O0 = null;
                try {
                    try {
                        OooO0O0.f118017OooOooO.getClass();
                        OooO0o(new OooO0O0(c32951OooO0Oo, oooO0o));
                    } catch (oO0OOOO0.OooOO0 e) {
                        OooO0O0 oooO0O02 = (OooO0O0) e.f119095OooOo0o;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            oooO0O0 = oooO0O02;
                            if (oooO0O0 != null) {
                                OooO0o(oooO0O0);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (oooO0O0 != null) {
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
                OooO0O0 OooO0o02 = OooO0o0();
                if (OooO0o02.isInitialized()) {
                    return OooO0o02;
                }
                throw new C32965OooOo0O();
            }

            @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
            public final Object clone() throws CloneNotSupportedException {
                C20264OooO0O0 c20264OooO0O0 = new C20264OooO0O0();
                c20264OooO0O0.OooO0o(OooO0o0());
                return c20264OooO0O0;
            }
        }

        static {
            OooO0O0 oooO0O0 = new OooO0O0();
            f118016OooOoo = oooO0O0;
            oooO0O0.f118021OooOoO0 = 0;
            oooO0O0.f118020OooOoO = OooO0OO.f118028Oooo0o0;
        }

        public OooO0O0(C20264OooO0O0 c20264OooO0O0) {
            this.f118022OooOoOO = (byte) -1;
            this.f118023OooOoo0 = -1;
            this.f118019OooOo0o = c20264OooO0O0.f119081OooOo0o;
        }

        @Override // oO0OOOO0.InterfaceC32958OooOOOo
        public final void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException {
            getSerializedSize();
            if ((this.f118018OooOo & 1) == 1) {
                c32952OooO0o0.OooOOO0(1, this.f118021OooOoO0);
            }
            if ((this.f118018OooOo & 2) == 2) {
                c32952OooO0o0.OooOOOO(2, this.f118020OooOoO);
            }
            c32952OooO0o0.OooOOo(this.f118019OooOo0o);
        }

        @Override // oO0OOOO0.InterfaceC32958OooOOOo
        public final int getSerializedSize() {
            int i = this.f118023OooOoo0;
            if (i != -1) {
                return i;
            }
            int iOooO0O0 = (this.f118018OooOo & 1) == 1 ? C32952OooO0o0.OooO0O0(1, this.f118021OooOoO0) : 0;
            if ((this.f118018OooOo & 2) == 2) {
                iOooO0O0 += C32952OooO0o0.OooO0Oo(2, this.f118020OooOoO);
            }
            int size = this.f118019OooOo0o.size() + iOooO0O0;
            this.f118023OooOoo0 = size;
            return size;
        }

        @Override // oO0OOOO0.InterfaceC32960OooOOo0
        public final boolean isInitialized() {
            byte b = this.f118022OooOoOO;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            int i = this.f118018OooOo;
            if ((i & 1) != 1) {
                this.f118022OooOoOO = (byte) 0;
                return false;
            }
            if ((i & 2) != 2) {
                this.f118022OooOoOO = (byte) 0;
                return false;
            }
            if (this.f118020OooOoO.isInitialized()) {
                this.f118022OooOoOO = (byte) 1;
                return true;
            }
            this.f118022OooOoOO = (byte) 0;
            return false;
        }

        @Override // oO0OOOO0.InterfaceC32958OooOOOo
        public final InterfaceC32958OooOOOo.OooO00o newBuilderForType() {
            return new C20264OooO0O0();
        }

        @Override // oO0OOOO0.InterfaceC32958OooOOOo
        public final InterfaceC32958OooOOOo.OooO00o toBuilder() {
            C20264OooO0O0 c20264OooO0O0 = new C20264OooO0O0();
            c20264OooO0O0.OooO0o(this);
            return c20264OooO0O0;
        }

        public static final class OooO0OO extends AbstractC32954OooO0oo implements InterfaceC32960OooOOo0 {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public static final C20265OooO00o f118027Oooo0o = new C20265OooO00o();

            /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
            public static final OooO0OO f118028Oooo0o0;

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f118029OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final oO0OOOO0.OooO0OO f118030OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public long f118031OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public EnumC20267OooO0OO f118032OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public float f118033OooOoOO;

            /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
            public int f118034OooOoo;

            /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
            public double f118035OooOoo0;

            /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
            public int f118036OooOooO;

            /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
            public int f118037OooOooo;

            /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
            public int f118038Oooo0;

            /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
            public OooO00o f118039Oooo000;

            /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
            public List<OooO0OO> f118040Oooo00O;

            /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
            public int f118041Oooo00o;

            /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
            public byte f118042Oooo0O0;

            /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
            public int f118043Oooo0OO;

            /* JADX INFO: renamed from: oO0OO00.OooO00o$OooO0O0$OooO0OO$OooO00o, reason: collision with other inner class name */
            public static class C20265OooO00o extends oO0OOOO0.OooO0O0<OooO0OO> {
                @Override // oO0OOOO0.InterfaceC32959OooOOo
                public final Object OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
                    return new OooO0OO(c32951OooO0Oo, oooO0o);
                }
            }

            /* JADX INFO: renamed from: oO0OO00.OooO00o$OooO0O0$OooO0OO$OooO0O0, reason: collision with other inner class name */
            public static final class C20266OooO0O0 extends AbstractC32954OooO0oo.OooO00o<OooO0OO, C20266OooO0O0> implements InterfaceC32960OooOOo0 {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f118044OooOo;

                /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
                public long f118045OooOoO;

                /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
                public float f118047OooOoOO;

                /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
                public int f118048OooOoo;

                /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
                public double f118049OooOoo0;

                /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
                public int f118050OooOooO;

                /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
                public int f118051OooOooo;

                /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
                public int f118052Oooo0;

                /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
                public int f118055Oooo00o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public EnumC20267OooO0OO f118046OooOoO0 = EnumC20267OooO0OO.BYTE;

                /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
                public OooO00o f118053Oooo000 = OooO00o.f118008OooOoo;

                /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
                public List<OooO0OO> f118054Oooo00O = Collections.EMPTY_LIST;

                @Override // oO0OOOO0.OooO00o.AbstractC20287OooO00o
                /* JADX INFO: renamed from: OooO0O0 */
                public final /* bridge */ /* synthetic */ OooO00o.AbstractC20287OooO00o Oooo0OO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
                    OooO0oO(c32951OooO0Oo, oooO0o);
                    return this;
                }

                @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
                /* JADX INFO: renamed from: OooO0OO */
                public final AbstractC32954OooO0oo.OooO00o clone() {
                    C20266OooO0O0 c20266OooO0O0 = new C20266OooO0O0();
                    c20266OooO0O0.OooO0o(OooO0o0());
                    return c20266OooO0O0;
                }

                @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
                public final /* bridge */ /* synthetic */ AbstractC32954OooO0oo.OooO00o OooO0Oo(AbstractC32954OooO0oo abstractC32954OooO0oo) {
                    OooO0o((OooO0OO) abstractC32954OooO0oo);
                    return this;
                }

                public final void OooO0o(OooO0OO oooO0OO) {
                    OooO00o oooO00o;
                    if (oooO0OO == OooO0OO.f118028Oooo0o0) {
                        return;
                    }
                    if ((oooO0OO.f118029OooOo & 1) == 1) {
                        EnumC20267OooO0OO enumC20267OooO0OO = oooO0OO.f118032OooOoO0;
                        enumC20267OooO0OO.getClass();
                        this.f118044OooOo = 1 | this.f118044OooOo;
                        this.f118046OooOoO0 = enumC20267OooO0OO;
                    }
                    int i = oooO0OO.f118029OooOo;
                    if ((i & 2) == 2) {
                        long j = oooO0OO.f118031OooOoO;
                        this.f118044OooOo |= 2;
                        this.f118045OooOoO = j;
                    }
                    if ((i & 4) == 4) {
                        float f = oooO0OO.f118033OooOoOO;
                        this.f118044OooOo = 4 | this.f118044OooOo;
                        this.f118047OooOoOO = f;
                    }
                    if ((i & 8) == 8) {
                        double d = oooO0OO.f118035OooOoo0;
                        this.f118044OooOo |= 8;
                        this.f118049OooOoo0 = d;
                    }
                    if ((i & 16) == 16) {
                        int i2 = oooO0OO.f118034OooOoo;
                        this.f118044OooOo = 16 | this.f118044OooOo;
                        this.f118048OooOoo = i2;
                    }
                    if ((i & 32) == 32) {
                        int i3 = oooO0OO.f118036OooOooO;
                        this.f118044OooOo = 32 | this.f118044OooOo;
                        this.f118050OooOooO = i3;
                    }
                    if ((i & 64) == 64) {
                        int i4 = oooO0OO.f118037OooOooo;
                        this.f118044OooOo = 64 | this.f118044OooOo;
                        this.f118051OooOooo = i4;
                    }
                    if ((i & 128) == 128) {
                        OooO00o oooO00o2 = oooO0OO.f118039Oooo000;
                        if ((this.f118044OooOo & 128) != 128 || (oooO00o = this.f118053Oooo000) == OooO00o.f118008OooOoo) {
                            this.f118053Oooo000 = oooO00o2;
                        } else {
                            OooO0OO oooO0OO2 = new OooO0OO();
                            oooO0OO2.OooO0o(oooO00o);
                            oooO0OO2.OooO0o(oooO00o2);
                            this.f118053Oooo000 = oooO0OO2.OooO0o0();
                        }
                        this.f118044OooOo |= 128;
                    }
                    if (!oooO0OO.f118040Oooo00O.isEmpty()) {
                        if (this.f118054Oooo00O.isEmpty()) {
                            this.f118054Oooo00O = oooO0OO.f118040Oooo00O;
                            this.f118044OooOo &= -257;
                        } else {
                            if ((this.f118044OooOo & 256) != 256) {
                                this.f118054Oooo00O = new ArrayList(this.f118054Oooo00O);
                                this.f118044OooOo |= 256;
                            }
                            this.f118054Oooo00O.addAll(oooO0OO.f118040Oooo00O);
                        }
                    }
                    int i5 = oooO0OO.f118029OooOo;
                    if ((i5 & 256) == 256) {
                        int i6 = oooO0OO.f118041Oooo00o;
                        this.f118044OooOo |= 512;
                        this.f118055Oooo00o = i6;
                    }
                    if ((i5 & 512) == 512) {
                        int i7 = oooO0OO.f118038Oooo0;
                        this.f118044OooOo |= 1024;
                        this.f118052Oooo0 = i7;
                    }
                    this.f119081OooOo0o = this.f119081OooOo0o.OooO0OO(oooO0OO.f118030OooOo0o);
                }

                public final OooO0OO OooO0o0() {
                    OooO0OO oooO0OO = new OooO0OO(this);
                    int i = this.f118044OooOo;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    oooO0OO.f118032OooOoO0 = this.f118046OooOoO0;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    oooO0OO.f118031OooOoO = this.f118045OooOoO;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    oooO0OO.f118033OooOoOO = this.f118047OooOoOO;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    oooO0OO.f118035OooOoo0 = this.f118049OooOoo0;
                    if ((i & 16) == 16) {
                        i2 |= 16;
                    }
                    oooO0OO.f118034OooOoo = this.f118048OooOoo;
                    if ((i & 32) == 32) {
                        i2 |= 32;
                    }
                    oooO0OO.f118036OooOooO = this.f118050OooOooO;
                    if ((i & 64) == 64) {
                        i2 |= 64;
                    }
                    oooO0OO.f118037OooOooo = this.f118051OooOooo;
                    if ((i & 128) == 128) {
                        i2 |= 128;
                    }
                    oooO0OO.f118039Oooo000 = this.f118053Oooo000;
                    if ((i & 256) == 256) {
                        this.f118054Oooo00O = Collections.unmodifiableList(this.f118054Oooo00O);
                        this.f118044OooOo &= -257;
                    }
                    oooO0OO.f118040Oooo00O = this.f118054Oooo00O;
                    if ((i & 512) == 512) {
                        i2 |= 256;
                    }
                    oooO0OO.f118041Oooo00o = this.f118055Oooo00o;
                    if ((i & 1024) == 1024) {
                        i2 |= 512;
                    }
                    oooO0OO.f118038Oooo0 = this.f118052Oooo0;
                    oooO0OO.f118029OooOo = i2;
                    return oooO0OO;
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void OooO0oO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
                    OooO0OO oooO0OO = null;
                    try {
                        try {
                            OooO0OO.f118027Oooo0o.getClass();
                            OooO0o(new OooO0OO(c32951OooO0Oo, oooO0o));
                        } catch (oO0OOOO0.OooOO0 e) {
                            OooO0OO oooO0OO2 = (OooO0OO) e.f119095OooOo0o;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                oooO0OO = oooO0OO2;
                                if (oooO0OO != null) {
                                    OooO0o(oooO0OO);
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
                    OooO0oO(c32951OooO0Oo, oooO0o);
                    return this;
                }

                @Override // oO0OOOO0.InterfaceC32958OooOOOo.OooO00o
                public final InterfaceC32958OooOOOo build() {
                    OooO0OO oooO0OOOooO0o0 = OooO0o0();
                    if (oooO0OOOooO0o0.isInitialized()) {
                        return oooO0OOOooO0o0;
                    }
                    throw new C32965OooOo0O();
                }

                @Override // oO0OOOO0.AbstractC32954OooO0oo.OooO00o
                public final Object clone() throws CloneNotSupportedException {
                    C20266OooO0O0 c20266OooO0O0 = new C20266OooO0O0();
                    c20266OooO0O0.OooO0o(OooO0o0());
                    return c20266OooO0O0;
                }
            }

            /* JADX INFO: renamed from: oO0OO00.OooO00o$OooO0O0$OooO0OO$OooO0OO, reason: collision with other inner class name */
            public enum EnumC20267OooO0OO implements OooO.OooO00o {
                BYTE(0),
                CHAR(1),
                SHORT(2),
                INT(3),
                LONG(4),
                FLOAT(5),
                DOUBLE(6),
                BOOLEAN(7),
                STRING(8),
                CLASS(9),
                ENUM(10),
                ANNOTATION(11),
                ARRAY(12);


                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final int f118070OooOo0o;

                EnumC20267OooO0OO(int i) {
                    this.f118070OooOo0o = i;
                }

                public static EnumC20267OooO0OO OooO00o(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // oO0OOOO0.OooO.OooO00o
                public final int getNumber() {
                    return this.f118070OooOo0o;
                }
            }

            static {
                OooO0OO oooO0OO = new OooO0OO();
                f118028Oooo0o0 = oooO0OO;
                oooO0OO.OooO0Oo();
            }

            public OooO0OO(C20266OooO0O0 c20266OooO0O0) {
                this.f118042Oooo0O0 = (byte) -1;
                this.f118043Oooo0OO = -1;
                this.f118030OooOo0o = c20266OooO0O0.f119081OooOo0o;
            }

            @Override // oO0OOOO0.InterfaceC32958OooOOOo
            public final void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException {
                getSerializedSize();
                if ((this.f118029OooOo & 1) == 1) {
                    c32952OooO0o0.OooOO0o(1, this.f118032OooOoO0.f118070OooOo0o);
                }
                if ((this.f118029OooOo & 2) == 2) {
                    long j = this.f118031OooOoO;
                    c32952OooO0o0.OooOo(2, 0);
                    c32952OooO0o0.OooOo0o((j >> 63) ^ (j << 1));
                }
                if ((this.f118029OooOo & 4) == 4) {
                    float f = this.f118033OooOoOO;
                    c32952OooO0o0.OooOo(3, 5);
                    c32952OooO0o0.OooOo00(Float.floatToRawIntBits(f));
                }
                if ((this.f118029OooOo & 8) == 8) {
                    double d = this.f118035OooOoo0;
                    c32952OooO0o0.OooOo(4, 1);
                    c32952OooO0o0.OooOo0(Double.doubleToRawLongBits(d));
                }
                if ((this.f118029OooOo & 16) == 16) {
                    c32952OooO0o0.OooOOO0(5, this.f118034OooOoo);
                }
                if ((this.f118029OooOo & 32) == 32) {
                    c32952OooO0o0.OooOOO0(6, this.f118036OooOooO);
                }
                if ((this.f118029OooOo & 64) == 64) {
                    c32952OooO0o0.OooOOO0(7, this.f118037OooOooo);
                }
                if ((this.f118029OooOo & 128) == 128) {
                    c32952OooO0o0.OooOOOO(8, this.f118039Oooo000);
                }
                for (int i = 0; i < this.f118040Oooo00O.size(); i++) {
                    c32952OooO0o0.OooOOOO(9, this.f118040Oooo00O.get(i));
                }
                if ((this.f118029OooOo & 512) == 512) {
                    c32952OooO0o0.OooOOO0(10, this.f118038Oooo0);
                }
                if ((this.f118029OooOo & 256) == 256) {
                    c32952OooO0o0.OooOOO0(11, this.f118041Oooo00o);
                }
                c32952OooO0o0.OooOOo(this.f118030OooOo0o);
            }

            public final void OooO0Oo() {
                this.f118032OooOoO0 = EnumC20267OooO0OO.BYTE;
                this.f118031OooOoO = 0L;
                this.f118033OooOoOO = 0.0f;
                this.f118035OooOoo0 = 0.0d;
                this.f118034OooOoo = 0;
                this.f118036OooOooO = 0;
                this.f118037OooOooo = 0;
                this.f118039Oooo000 = OooO00o.f118008OooOoo;
                this.f118040Oooo00O = Collections.EMPTY_LIST;
                this.f118041Oooo00o = 0;
                this.f118038Oooo0 = 0;
            }

            @Override // oO0OOOO0.InterfaceC32958OooOOOo
            public final int getSerializedSize() {
                int i = this.f118043Oooo0OO;
                if (i != -1) {
                    return i;
                }
                int iOooO00o = (this.f118029OooOo & 1) == 1 ? C32952OooO0o0.OooO00o(1, this.f118032OooOoO0.f118070OooOo0o) : 0;
                if ((this.f118029OooOo & 2) == 2) {
                    long j = this.f118031OooOoO;
                    iOooO00o += C32952OooO0o0.OooO0oO((j >> 63) ^ (j << 1)) + C32952OooO0o0.OooO0oo(2);
                }
                if ((this.f118029OooOo & 4) == 4) {
                    iOooO00o += C32952OooO0o0.OooO0oo(3) + 4;
                }
                if ((this.f118029OooOo & 8) == 8) {
                    iOooO00o += C32952OooO0o0.OooO0oo(4) + 8;
                }
                if ((this.f118029OooOo & 16) == 16) {
                    iOooO00o += C32952OooO0o0.OooO0O0(5, this.f118034OooOoo);
                }
                if ((this.f118029OooOo & 32) == 32) {
                    iOooO00o += C32952OooO0o0.OooO0O0(6, this.f118036OooOooO);
                }
                if ((this.f118029OooOo & 64) == 64) {
                    iOooO00o += C32952OooO0o0.OooO0O0(7, this.f118037OooOooo);
                }
                if ((this.f118029OooOo & 128) == 128) {
                    iOooO00o += C32952OooO0o0.OooO0Oo(8, this.f118039Oooo000);
                }
                for (int i2 = 0; i2 < this.f118040Oooo00O.size(); i2++) {
                    iOooO00o += C32952OooO0o0.OooO0Oo(9, this.f118040Oooo00O.get(i2));
                }
                if ((this.f118029OooOo & 512) == 512) {
                    iOooO00o += C32952OooO0o0.OooO0O0(10, this.f118038Oooo0);
                }
                if ((this.f118029OooOo & 256) == 256) {
                    iOooO00o += C32952OooO0o0.OooO0O0(11, this.f118041Oooo00o);
                }
                int size = this.f118030OooOo0o.size() + iOooO00o;
                this.f118043Oooo0OO = size;
                return size;
            }

            @Override // oO0OOOO0.InterfaceC32960OooOOo0
            public final boolean isInitialized() {
                byte b = this.f118042Oooo0O0;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if ((this.f118029OooOo & 128) == 128 && !this.f118039Oooo000.isInitialized()) {
                    this.f118042Oooo0O0 = (byte) 0;
                    return false;
                }
                for (int i = 0; i < this.f118040Oooo00O.size(); i++) {
                    if (!this.f118040Oooo00O.get(i).isInitialized()) {
                        this.f118042Oooo0O0 = (byte) 0;
                        return false;
                    }
                }
                this.f118042Oooo0O0 = (byte) 1;
                return true;
            }

            @Override // oO0OOOO0.InterfaceC32958OooOOOo
            public final InterfaceC32958OooOOOo.OooO00o newBuilderForType() {
                return new C20266OooO0O0();
            }

            @Override // oO0OOOO0.InterfaceC32958OooOOOo
            public final InterfaceC32958OooOOOo.OooO00o toBuilder() {
                C20266OooO0O0 c20266OooO0O0 = new C20266OooO0O0();
                c20266OooO0O0.OooO0o(this);
                return c20266OooO0O0;
            }

            public OooO0OO() {
                this.f118042Oooo0O0 = (byte) -1;
                this.f118043Oooo0OO = -1;
                this.f118030OooOo0o = oO0OOOO0.OooO0OO.f119053OooOo0o;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            public OooO0OO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
                OooO0OO oooO0OO;
                this.f118042Oooo0O0 = (byte) -1;
                this.f118043Oooo0OO = -1;
                OooO0Oo();
                OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
                C32952OooO0o0 c32952OooO0o0OooOO0 = C32952OooO0o0.OooOO0(oooO0O0, 1);
                boolean z = false;
                char c = 0;
                while (true) {
                    ?? OooOOo02 = 256;
                    if (!z) {
                        try {
                            try {
                                int iOooOOO = c32951OooO0Oo.OooOOO();
                                switch (iOooOOO) {
                                    case 0:
                                        z = true;
                                        break;
                                    case 8:
                                        int iOooOO0O = c32951OooO0Oo.OooOO0O();
                                        EnumC20267OooO0OO enumC20267OooO0OOOooO00o = EnumC20267OooO0OO.OooO00o(iOooOO0O);
                                        if (enumC20267OooO0OOOooO00o == null) {
                                            c32952OooO0o0OooOO0.OooOo0O(iOooOOO);
                                            c32952OooO0o0OooOO0.OooOo0O(iOooOO0O);
                                        } else {
                                            this.f118029OooOo |= 1;
                                            this.f118032OooOoO0 = enumC20267OooO0OOOooO00o;
                                        }
                                        break;
                                    case 16:
                                        this.f118029OooOo |= 2;
                                        long jOooOO0o = c32951OooO0Oo.OooOO0o();
                                        this.f118031OooOoO = (-(jOooOO0o & 1)) ^ (jOooOO0o >>> 1);
                                        break;
                                    case 29:
                                        this.f118029OooOo |= 4;
                                        this.f118033OooOoOO = Float.intBitsToFloat(c32951OooO0Oo.OooO());
                                        break;
                                    case 33:
                                        this.f118029OooOo |= 8;
                                        this.f118035OooOoo0 = Double.longBitsToDouble(c32951OooO0Oo.OooOO0());
                                        break;
                                    case 40:
                                        this.f118029OooOo |= 16;
                                        this.f118034OooOoo = c32951OooO0Oo.OooOO0O();
                                        break;
                                    case 48:
                                        this.f118029OooOo |= 32;
                                        this.f118036OooOooO = c32951OooO0Oo.OooOO0O();
                                        break;
                                    case 56:
                                        this.f118029OooOo |= 64;
                                        this.f118037OooOooo = c32951OooO0Oo.OooOO0O();
                                        break;
                                    case 66:
                                        if ((this.f118029OooOo & 128) == 128) {
                                            OooO00o oooO00o = this.f118039Oooo000;
                                            oooO00o.getClass();
                                            oooO0OO = new OooO0OO();
                                            oooO0OO.OooO0o(oooO00o);
                                        } else {
                                            oooO0OO = null;
                                        }
                                        OooO00o oooO00o2 = (OooO00o) c32951OooO0Oo.OooO0oO(OooO00o.f118009OooOooO, oooO0o);
                                        this.f118039Oooo000 = oooO00o2;
                                        if (oooO0OO != null) {
                                            oooO0OO.OooO0o(oooO00o2);
                                            this.f118039Oooo000 = oooO0OO.OooO0o0();
                                        }
                                        this.f118029OooOo |= 128;
                                        break;
                                    case 74:
                                        if ((c & 256) != 256) {
                                            this.f118040Oooo00O = new ArrayList();
                                            c = 256;
                                        }
                                        this.f118040Oooo00O.add((OooO0OO) c32951OooO0Oo.OooO0oO(f118027Oooo0o, oooO0o));
                                        break;
                                    case 80:
                                        this.f118029OooOo |= 512;
                                        this.f118038Oooo0 = c32951OooO0Oo.OooOO0O();
                                        break;
                                    case 88:
                                        this.f118029OooOo |= 256;
                                        this.f118041Oooo00o = c32951OooO0Oo.OooOO0O();
                                        break;
                                    default:
                                        OooOOo02 = c32951OooO0Oo.OooOOo0(iOooOOO, c32952OooO0o0OooOO0);
                                        if (OooOOo02 == 0) {
                                            z = true;
                                        }
                                        break;
                                }
                            } catch (oO0OOOO0.OooOO0 e) {
                                e.f119095OooOo0o = this;
                                throw e;
                            } catch (IOException e2) {
                                oO0OOOO0.OooOO0 oooOO02 = new oO0OOOO0.OooOO0(e2.getMessage());
                                oooOO02.f119095OooOo0o = this;
                                throw oooOO02;
                            }
                        } catch (Throwable th) {
                            if ((c & 256) == OooOOo02) {
                                this.f118040Oooo00O = Collections.unmodifiableList(this.f118040Oooo00O);
                            }
                            try {
                                c32952OooO0o0OooOO0.OooO();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            throw th;
                        }
                    } else {
                        if ((c & 256) == 256) {
                            this.f118040Oooo00O = Collections.unmodifiableList(this.f118040Oooo00O);
                        }
                        try {
                            c32952OooO0o0OooOO0.OooO();
                            return;
                        } catch (IOException unused2) {
                            return;
                        } finally {
                            this.f118030OooOo0o = oooO0O0.OooOOO0();
                        }
                    }
                }
            }
        }

        public OooO0O0() {
            this.f118022OooOoOO = (byte) -1;
            this.f118023OooOoo0 = -1;
            this.f118019OooOo0o = oO0OOOO0.OooO0OO.f119053OooOo0o;
        }

        public OooO0O0(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
            OooO0OO.C20266OooO0O0 c20266OooO0O0;
            this.f118022OooOoOO = (byte) -1;
            this.f118023OooOoo0 = -1;
            boolean z = false;
            this.f118021OooOoO0 = 0;
            this.f118020OooOoO = OooO0OO.f118028Oooo0o0;
            OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
            C32952OooO0o0 c32952OooO0o0OooOO0 = C32952OooO0o0.OooOO0(oooO0O0, 1);
            while (!z) {
                try {
                    try {
                        int iOooOOO = c32951OooO0Oo.OooOOO();
                        if (iOooOOO != 0) {
                            if (iOooOOO == 8) {
                                this.f118018OooOo |= 1;
                                this.f118021OooOoO0 = c32951OooO0Oo.OooOO0O();
                            } else if (iOooOOO != 18) {
                                if (!c32951OooO0Oo.OooOOo0(iOooOOO, c32952OooO0o0OooOO0)) {
                                }
                            } else {
                                if ((this.f118018OooOo & 2) == 2) {
                                    OooO0OO oooO0OO = this.f118020OooOoO;
                                    oooO0OO.getClass();
                                    c20266OooO0O0 = new OooO0OO.C20266OooO0O0();
                                    c20266OooO0O0.OooO0o(oooO0OO);
                                } else {
                                    c20266OooO0O0 = null;
                                }
                                OooO0OO oooO0OO2 = (OooO0OO) c32951OooO0Oo.OooO0oO(OooO0OO.f118027Oooo0o, oooO0o);
                                this.f118020OooOoO = oooO0OO2;
                                if (c20266OooO0O0 != null) {
                                    c20266OooO0O0.OooO0o(oooO0OO2);
                                    this.f118020OooOoO = c20266OooO0O0.OooO0o0();
                                }
                                this.f118018OooOo |= 2;
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
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
            try {
                c32952OooO0o0OooOO0.OooO();
            } catch (IOException unused2) {
            } finally {
                this.f118019OooOo0o = oooO0O0.OooOOO0();
            }
        }
    }

    public OooO00o() {
        this.f118014OooOoOO = (byte) -1;
        this.f118015OooOoo0 = -1;
        this.f118011OooOo0o = oO0OOOO0.OooO0OO.f119053OooOo0o;
    }

    public OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
        this.f118014OooOoOO = (byte) -1;
        this.f118015OooOoo0 = -1;
        boolean z = false;
        this.f118013OooOoO0 = 0;
        this.f118012OooOoO = Collections.EMPTY_LIST;
        OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
        C32952OooO0o0 c32952OooO0o0OooOO0 = C32952OooO0o0.OooOO0(oooO0O0, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iOooOOO = c32951OooO0Oo.OooOOO();
                        if (iOooOOO != 0) {
                            if (iOooOOO == 8) {
                                this.f118010OooOo |= 1;
                                this.f118013OooOoO0 = c32951OooO0Oo.OooOO0O();
                            } else if (iOooOOO != 18) {
                                if (!c32951OooO0Oo.OooOOo0(iOooOOO, c32952OooO0o0OooOO0)) {
                                }
                            } else {
                                if ((c & 2) != 2) {
                                    this.f118012OooOoO = new ArrayList();
                                    c = 2;
                                }
                                this.f118012OooOoO.add((OooO0O0) c32951OooO0Oo.OooO0oO(OooO0O0.f118017OooOooO, oooO0o));
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
                if ((c & 2) == 2) {
                    this.f118012OooOoO = Collections.unmodifiableList(this.f118012OooOoO);
                }
                try {
                    c32952OooO0o0OooOO0.OooO();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    throw th2;
                }
                throw th;
            }
        }
        if ((c & 2) == 2) {
            this.f118012OooOoO = Collections.unmodifiableList(this.f118012OooOoO);
        }
        try {
            c32952OooO0o0OooOO0.OooO();
        } catch (IOException unused2) {
        } finally {
            this.f118011OooOo0o = oooO0O0.OooOOO0();
        }
    }
}
