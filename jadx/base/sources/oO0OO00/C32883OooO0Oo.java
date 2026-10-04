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
import oO0OOOO0.OooO00o;
import oO0OOOO0.OooO0OO;

/* JADX INFO: renamed from: oO0OO00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32883OooO0Oo extends AbstractC32954OooO0oo implements InterfaceC32960OooOOo0 {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final C32883OooO0Oo f118155OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final OooO00o f118156OooOoo0 = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List<C32884OooO0o0> f118157OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO0OOOO0.OooO0OO f118158OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f118159OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public byte f118160OooOoO0;

    /* JADX INFO: renamed from: oO0OO00.OooO0Oo$OooO00o */
    public static class OooO00o extends oO0OOOO0.OooO0O0<C32883OooO0Oo> {
        @Override // oO0OOOO0.InterfaceC32959OooOOo
        public final Object OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
            return new C32883OooO0Oo(c32951OooO0Oo, oooO0o);
        }
    }

    /* JADX INFO: renamed from: oO0OO00.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 extends AbstractC32954OooO0oo.OooO00o<C32883OooO0Oo, OooO0O0> implements InterfaceC32960OooOOo0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f118161OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public List<C32884OooO0o0> f118162OooOoO0 = Collections.EMPTY_LIST;

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
            OooO0o((C32883OooO0Oo) abstractC32954OooO0oo);
            return this;
        }

        public final void OooO0o(C32883OooO0Oo c32883OooO0Oo) {
            if (c32883OooO0Oo == C32883OooO0Oo.f118155OooOoOO) {
                return;
            }
            if (!c32883OooO0Oo.f118157OooOo.isEmpty()) {
                if (this.f118162OooOoO0.isEmpty()) {
                    this.f118162OooOoO0 = c32883OooO0Oo.f118157OooOo;
                    this.f118161OooOo &= -2;
                } else {
                    if ((this.f118161OooOo & 1) != 1) {
                        this.f118162OooOoO0 = new ArrayList(this.f118162OooOoO0);
                        this.f118161OooOo |= 1;
                    }
                    this.f118162OooOoO0.addAll(c32883OooO0Oo.f118157OooOo);
                }
            }
            this.f119081OooOo0o = this.f119081OooOo0o.OooO0OO(c32883OooO0Oo.f118158OooOo0o);
        }

        public final C32883OooO0Oo OooO0o0() {
            C32883OooO0Oo c32883OooO0Oo = new C32883OooO0Oo(this);
            if ((this.f118161OooOo & 1) == 1) {
                this.f118162OooOoO0 = Collections.unmodifiableList(this.f118162OooOoO0);
                this.f118161OooOo &= -2;
            }
            c32883OooO0Oo.f118157OooOo = this.f118162OooOoO0;
            return c32883OooO0Oo;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0oO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            C32883OooO0Oo c32883OooO0Oo = null;
            try {
                try {
                    C32883OooO0Oo.f118156OooOoo0.getClass();
                    OooO0o(new C32883OooO0Oo(c32951OooO0Oo, oooO0o));
                } catch (oO0OOOO0.OooOO0 e) {
                    C32883OooO0Oo c32883OooO0Oo2 = (C32883OooO0Oo) e.f119095OooOo0o;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c32883OooO0Oo = c32883OooO0Oo2;
                        if (c32883OooO0Oo != null) {
                            OooO0o(c32883OooO0Oo);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c32883OooO0Oo != null) {
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
            C32883OooO0Oo c32883OooO0OoOooO0o0 = OooO0o0();
            if (c32883OooO0OoOooO0o0.isInitialized()) {
                return c32883OooO0OoOooO0o0;
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
        C32883OooO0Oo c32883OooO0Oo = new C32883OooO0Oo();
        f118155OooOoOO = c32883OooO0Oo;
        c32883OooO0Oo.f118157OooOo = Collections.EMPTY_LIST;
    }

    public C32883OooO0Oo(OooO0O0 oooO0O0) {
        this.f118160OooOoO0 = (byte) -1;
        this.f118159OooOoO = -1;
        this.f118158OooOo0o = oooO0O0.f119081OooOo0o;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.f118157OooOo.size(); i++) {
            c32952OooO0o0.OooOOOO(1, this.f118157OooOo.get(i));
        }
        c32952OooO0o0.OooOOo(this.f118158OooOo0o);
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final int getSerializedSize() {
        int i = this.f118159OooOoO;
        if (i != -1) {
            return i;
        }
        int iOooO0Oo = 0;
        for (int i2 = 0; i2 < this.f118157OooOo.size(); i2++) {
            iOooO0Oo += C32952OooO0o0.OooO0Oo(1, this.f118157OooOo.get(i2));
        }
        int size = this.f118158OooOo0o.size() + iOooO0Oo;
        this.f118159OooOoO = size;
        return size;
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final boolean isInitialized() {
        byte b = this.f118160OooOoO0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f118157OooOo.size(); i++) {
            if (!this.f118157OooOo.get(i).isInitialized()) {
                this.f118160OooOoO0 = (byte) 0;
                return false;
            }
        }
        this.f118160OooOoO0 = (byte) 1;
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

    public C32883OooO0Oo() {
        this.f118160OooOoO0 = (byte) -1;
        this.f118159OooOoO = -1;
        this.f118158OooOo0o = oO0OOOO0.OooO0OO.f119053OooOo0o;
    }

    public C32883OooO0Oo(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
        this.f118160OooOoO0 = (byte) -1;
        this.f118159OooOoO = -1;
        this.f118157OooOo = Collections.EMPTY_LIST;
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
                                this.f118157OooOo = new ArrayList();
                                z2 = true;
                            }
                            this.f118157OooOo.add((C32884OooO0o0) c32951OooO0Oo.OooO0oO(C32884OooO0o0.f118173Oooo000, oooO0o));
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
                    this.f118157OooOo = Collections.unmodifiableList(this.f118157OooOo);
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
            this.f118157OooOo = Collections.unmodifiableList(this.f118157OooOo);
        }
        try {
            c32952OooO0o0OooOO0.OooO();
        } catch (IOException unused2) {
        } finally {
            this.f118158OooOo0o = oooO0O0.OooOOO0();
        }
    }
}
