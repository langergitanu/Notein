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
public final class OooOOO extends AbstractC32954OooO0oo implements InterfaceC32960OooOOo0 {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final OooOOO f118293OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final OooO00o f118294OooOoo0 = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List<OooO0OO> f118295OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO0OOOO0.OooO0OO f118296OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f118297OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public byte f118298OooOoO0;

    public static class OooO00o extends oO0OOOO0.OooO0O0<OooOOO> {
        @Override // oO0OOOO0.InterfaceC32959OooOOo
        public final Object OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
            return new OooOOO(c32951OooO0Oo, oooO0o);
        }
    }

    public static final class OooO0O0 extends AbstractC32954OooO0oo.OooO00o<OooOOO, OooO0O0> implements InterfaceC32960OooOOo0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f118299OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public List<OooO0OO> f118300OooOoO0 = Collections.EMPTY_LIST;

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
            OooO0o((OooOOO) abstractC32954OooO0oo);
            return this;
        }

        public final void OooO0o(OooOOO oooOOO) {
            if (oooOOO == OooOOO.f118293OooOoOO) {
                return;
            }
            if (!oooOOO.f118295OooOo.isEmpty()) {
                if (this.f118300OooOoO0.isEmpty()) {
                    this.f118300OooOoO0 = oooOOO.f118295OooOo;
                    this.f118299OooOo &= -2;
                } else {
                    if ((this.f118299OooOo & 1) != 1) {
                        this.f118300OooOoO0 = new ArrayList(this.f118300OooOoO0);
                        this.f118299OooOo |= 1;
                    }
                    this.f118300OooOoO0.addAll(oooOOO.f118295OooOo);
                }
            }
            this.f119081OooOo0o = this.f119081OooOo0o.OooO0OO(oooOOO.f118296OooOo0o);
        }

        public final OooOOO OooO0o0() {
            OooOOO oooOOO = new OooOOO(this);
            if ((this.f118299OooOo & 1) == 1) {
                this.f118300OooOoO0 = Collections.unmodifiableList(this.f118300OooOoO0);
                this.f118299OooOo &= -2;
            }
            oooOOO.f118295OooOo = this.f118300OooOoO0;
            return oooOOO;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0oO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            OooOOO oooOOO = null;
            try {
                try {
                    OooOOO.f118294OooOoo0.getClass();
                    OooO0o(new OooOOO(c32951OooO0Oo, oooO0o));
                } catch (oO0OOOO0.OooOO0 e) {
                    OooOOO oooOOO2 = (OooOOO) e.f119095OooOo0o;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        oooOOO = oooOOO2;
                        if (oooOOO != null) {
                            OooO0o(oooOOO);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (oooOOO != null) {
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
            OooOOO oooOOOOooO0o0 = OooO0o0();
            if (oooOOOOooO0o0.isInitialized()) {
                return oooOOOOooO0o0;
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
        OooOOO oooOOO = new OooOOO();
        f118293OooOoOO = oooOOO;
        oooOOO.f118295OooOo = Collections.EMPTY_LIST;
    }

    public OooOOO(OooO0O0 oooO0O0) {
        this.f118298OooOoO0 = (byte) -1;
        this.f118297OooOoO = -1;
        this.f118296OooOo0o = oooO0O0.f119081OooOo0o;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.f118295OooOo.size(); i++) {
            c32952OooO0o0.OooOOOO(1, this.f118295OooOo.get(i));
        }
        c32952OooO0o0.OooOOo(this.f118296OooOo0o);
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final int getSerializedSize() {
        int i = this.f118297OooOoO;
        if (i != -1) {
            return i;
        }
        int iOooO0Oo = 0;
        for (int i2 = 0; i2 < this.f118295OooOo.size(); i2++) {
            iOooO0Oo += C32952OooO0o0.OooO0Oo(1, this.f118295OooOo.get(i2));
        }
        int size = this.f118296OooOo0o.size() + iOooO0Oo;
        this.f118297OooOoO = size;
        return size;
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final boolean isInitialized() {
        byte b = this.f118298OooOoO0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f118295OooOo.size(); i++) {
            if (!this.f118295OooOo.get(i).isInitialized()) {
                this.f118298OooOoO0 = (byte) 0;
                return false;
            }
        }
        this.f118298OooOoO0 = (byte) 1;
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

    public static final class OooO0OO extends AbstractC32954OooO0oo implements InterfaceC32960OooOOo0 {

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final OooO0OO f118301OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public static final OooO00o f118302OooOooo = new OooO00o();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f118303OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final oO0OOOO0.OooO0OO f118304OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f118305OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f118306OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public EnumC20269OooO0OO f118307OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public int f118308OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public byte f118309OooOoo0;

        public static class OooO00o extends oO0OOOO0.OooO0O0<OooO0OO> {
            @Override // oO0OOOO0.InterfaceC32959OooOOo
            public final Object OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
                return new OooO0OO(c32951OooO0Oo);
            }
        }

        public static final class OooO0O0 extends AbstractC32954OooO0oo.OooO00o<OooO0OO, OooO0O0> implements InterfaceC32960OooOOo0 {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f118310OooOo;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public int f118311OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public int f118312OooOoO0 = -1;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public EnumC20269OooO0OO f118313OooOoOO = EnumC20269OooO0OO.PACKAGE;

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
                OooO0o((OooO0OO) abstractC32954OooO0oo);
                return this;
            }

            public final void OooO0o(OooO0OO oooO0OO) {
                if (oooO0OO == OooO0OO.f118301OooOooO) {
                    return;
                }
                int i = oooO0OO.f118303OooOo;
                if ((i & 1) == 1) {
                    int i2 = oooO0OO.f118306OooOoO0;
                    this.f118310OooOo = 1 | this.f118310OooOo;
                    this.f118312OooOoO0 = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = oooO0OO.f118305OooOoO;
                    this.f118310OooOo = 2 | this.f118310OooOo;
                    this.f118311OooOoO = i3;
                }
                if ((i & 4) == 4) {
                    EnumC20269OooO0OO enumC20269OooO0OO = oooO0OO.f118307OooOoOO;
                    enumC20269OooO0OO.getClass();
                    this.f118310OooOo = 4 | this.f118310OooOo;
                    this.f118313OooOoOO = enumC20269OooO0OO;
                }
                this.f119081OooOo0o = this.f119081OooOo0o.OooO0OO(oooO0OO.f118304OooOo0o);
            }

            public final OooO0OO OooO0o0() {
                OooO0OO oooO0OO = new OooO0OO(this);
                int i = this.f118310OooOo;
                int i2 = (i & 1) != 1 ? 0 : 1;
                oooO0OO.f118306OooOoO0 = this.f118312OooOoO0;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                oooO0OO.f118305OooOoO = this.f118311OooOoO;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                oooO0OO.f118307OooOoOO = this.f118313OooOoOO;
                oooO0OO.f118303OooOo = i2;
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
                        OooO0OO.f118302OooOooo.getClass();
                        OooO0o(new OooO0OO(c32951OooO0Oo));
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
                OooO0O0 oooO0O0 = new OooO0O0();
                oooO0O0.OooO0o(OooO0o0());
                return oooO0O0;
            }
        }

        /* JADX INFO: renamed from: oO0OO00.OooOOO$OooO0OO$OooO0OO, reason: collision with other inner class name */
        public enum EnumC20269OooO0OO implements OooO.OooO00o {
            CLASS(0),
            PACKAGE(1),
            LOCAL(2);


            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final int f118318OooOo0o;

            EnumC20269OooO0OO(int i) {
                this.f118318OooOo0o = i;
            }

            @Override // oO0OOOO0.OooO.OooO00o
            public final int getNumber() {
                return this.f118318OooOo0o;
            }
        }

        static {
            OooO0OO oooO0OO = new OooO0OO();
            f118301OooOooO = oooO0OO;
            oooO0OO.f118306OooOoO0 = -1;
            oooO0OO.f118305OooOoO = 0;
            oooO0OO.f118307OooOoOO = EnumC20269OooO0OO.PACKAGE;
        }

        public OooO0OO(OooO0O0 oooO0O0) {
            this.f118309OooOoo0 = (byte) -1;
            this.f118308OooOoo = -1;
            this.f118304OooOo0o = oooO0O0.f119081OooOo0o;
        }

        @Override // oO0OOOO0.InterfaceC32958OooOOOo
        public final void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException {
            getSerializedSize();
            if ((this.f118303OooOo & 1) == 1) {
                c32952OooO0o0.OooOOO0(1, this.f118306OooOoO0);
            }
            if ((this.f118303OooOo & 2) == 2) {
                c32952OooO0o0.OooOOO0(2, this.f118305OooOoO);
            }
            if ((this.f118303OooOo & 4) == 4) {
                c32952OooO0o0.OooOO0o(3, this.f118307OooOoOO.f118318OooOo0o);
            }
            c32952OooO0o0.OooOOo(this.f118304OooOo0o);
        }

        @Override // oO0OOOO0.InterfaceC32958OooOOOo
        public final int getSerializedSize() {
            int i = this.f118308OooOoo;
            if (i != -1) {
                return i;
            }
            int iOooO0O0 = (this.f118303OooOo & 1) == 1 ? C32952OooO0o0.OooO0O0(1, this.f118306OooOoO0) : 0;
            if ((this.f118303OooOo & 2) == 2) {
                iOooO0O0 += C32952OooO0o0.OooO0O0(2, this.f118305OooOoO);
            }
            if ((this.f118303OooOo & 4) == 4) {
                iOooO0O0 += C32952OooO0o0.OooO00o(3, this.f118307OooOoOO.f118318OooOo0o);
            }
            int size = this.f118304OooOo0o.size() + iOooO0O0;
            this.f118308OooOoo = size;
            return size;
        }

        @Override // oO0OOOO0.InterfaceC32960OooOOo0
        public final boolean isInitialized() {
            byte b = this.f118309OooOoo0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if ((this.f118303OooOo & 2) == 2) {
                this.f118309OooOoo0 = (byte) 1;
                return true;
            }
            this.f118309OooOoo0 = (byte) 0;
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

        public OooO0OO() {
            this.f118309OooOoo0 = (byte) -1;
            this.f118308OooOoo = -1;
            this.f118304OooOo0o = oO0OOOO0.OooO0OO.f119053OooOo0o;
        }

        public OooO0OO(C32951OooO0Oo c32951OooO0Oo) throws oO0OOOO0.OooOO0 {
            EnumC20269OooO0OO enumC20269OooO0OO;
            this.f118309OooOoo0 = (byte) -1;
            this.f118308OooOoo = -1;
            this.f118306OooOoO0 = -1;
            boolean z = false;
            this.f118305OooOoO = 0;
            EnumC20269OooO0OO enumC20269OooO0OO2 = EnumC20269OooO0OO.PACKAGE;
            this.f118307OooOoOO = enumC20269OooO0OO2;
            OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
            C32952OooO0o0 c32952OooO0o0OooOO0 = C32952OooO0o0.OooOO0(oooO0O0, 1);
            while (!z) {
                try {
                    try {
                        int iOooOOO = c32951OooO0Oo.OooOOO();
                        if (iOooOOO != 0) {
                            if (iOooOOO == 8) {
                                this.f118303OooOo |= 1;
                                this.f118306OooOoO0 = c32951OooO0Oo.OooOO0O();
                            } else if (iOooOOO == 16) {
                                this.f118303OooOo |= 2;
                                this.f118305OooOoO = c32951OooO0Oo.OooOO0O();
                            } else if (iOooOOO != 24) {
                                if (!c32951OooO0Oo.OooOOo0(iOooOOO, c32952OooO0o0OooOO0)) {
                                }
                            } else {
                                int iOooOO0O = c32951OooO0Oo.OooOO0O();
                                if (iOooOO0O == 0) {
                                    enumC20269OooO0OO = EnumC20269OooO0OO.CLASS;
                                } else if (iOooOO0O != 1) {
                                    enumC20269OooO0OO = iOooOO0O != 2 ? null : EnumC20269OooO0OO.LOCAL;
                                } else {
                                    enumC20269OooO0OO = enumC20269OooO0OO2;
                                }
                                if (enumC20269OooO0OO == null) {
                                    c32952OooO0o0OooOO0.OooOo0O(iOooOOO);
                                    c32952OooO0o0OooOO0.OooOo0O(iOooOO0O);
                                } else {
                                    this.f118303OooOo |= 4;
                                    this.f118307OooOoOO = enumC20269OooO0OO;
                                }
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
                this.f118304OooOo0o = oooO0O0.OooOOO0();
            }
        }
    }

    public OooOOO() {
        this.f118298OooOoO0 = (byte) -1;
        this.f118297OooOoO = -1;
        this.f118296OooOo0o = oO0OOOO0.OooO0OO.f119053OooOo0o;
    }

    public OooOOO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
        this.f118298OooOoO0 = (byte) -1;
        this.f118297OooOoO = -1;
        this.f118295OooOo = Collections.EMPTY_LIST;
        OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
        C32952OooO0o0 c32952OooO0o0OooOO0 = C32952OooO0o0.OooOO0(oooO0O0, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iOooOOO = c32951OooO0Oo.OooOOO();
                    if (iOooOOO != 0) {
                        if (iOooOOO != 10) {
                            if (!c32951OooO0Oo.OooOOo0(iOooOOO, c32952OooO0o0OooOO0)) {
                            }
                        } else {
                            if (!z2) {
                                this.f118295OooOo = new ArrayList();
                                z2 = true;
                            }
                            this.f118295OooOo.add((OooO0OO) c32951OooO0Oo.OooO0oO(OooO0OO.f118302OooOooo, oooO0o));
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
                if (z2) {
                    this.f118295OooOo = Collections.unmodifiableList(this.f118295OooOo);
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
        if (z2) {
            this.f118295OooOo = Collections.unmodifiableList(this.f118295OooOo);
        }
        try {
            c32952OooO0o0OooOO0.OooO();
        } catch (IOException unused2) {
        } finally {
            this.f118296OooOo0o = oooO0O0.OooOOO0();
        }
    }
}
