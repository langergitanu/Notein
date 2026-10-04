package oO0OO00;

import java.io.IOException;
import oO0OOOO0.AbstractC32954OooO0oo;
import oO0OOOO0.C32951OooO0Oo;
import oO0OOOO0.C32952OooO0o0;
import oO0OOOO0.C32965OooOo0O;
import oO0OOOO0.InterfaceC32958OooOOOo;
import oO0OOOO0.InterfaceC32960OooOOo0;
import oO0OOOO0.OooO00o;
import oO0OOOO0.OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOOO extends AbstractC32954OooO0oo implements InterfaceC32960OooOOo0 {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final OooOOOO f118355OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final OooO00o f118356OooOoo0 = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public oO0OOOO0.OooOOO f118357OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO0OOOO0.OooO0OO f118358OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f118359OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public byte f118360OooOoO0;

    public static class OooO00o extends oO0OOOO0.OooO0O0<OooOOOO> {
        @Override // oO0OOOO0.InterfaceC32959OooOOo
        public final Object OooO00o(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws oO0OOOO0.OooOO0 {
            return new OooOOOO(c32951OooO0Oo);
        }
    }

    public static final class OooO0O0 extends AbstractC32954OooO0oo.OooO00o<OooOOOO, OooO0O0> implements InterfaceC32960OooOOo0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f118361OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public oO0OOOO0.OooOOO f118362OooOoO0 = oO0OOOO0.OooOOO0.f119099OooOo;

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
            OooO0o((OooOOOO) abstractC32954OooO0oo);
            return this;
        }

        public final void OooO0o(OooOOOO oooOOOO) {
            if (oooOOOO == OooOOOO.f118355OooOoOO) {
                return;
            }
            if (!oooOOOO.f118357OooOo.isEmpty()) {
                if (this.f118362OooOoO0.isEmpty()) {
                    this.f118362OooOoO0 = oooOOOO.f118357OooOo;
                    this.f118361OooOo &= -2;
                } else {
                    if ((this.f118361OooOo & 1) != 1) {
                        this.f118362OooOoO0 = new oO0OOOO0.OooOOO0(this.f118362OooOoO0);
                        this.f118361OooOo |= 1;
                    }
                    this.f118362OooOoO0.addAll(oooOOOO.f118357OooOo);
                }
            }
            this.f119081OooOo0o = this.f119081OooOo0o.OooO0OO(oooOOOO.f118358OooOo0o);
        }

        public final OooOOOO OooO0o0() {
            OooOOOO oooOOOO = new OooOOOO(this);
            if ((this.f118361OooOo & 1) == 1) {
                this.f118362OooOoO0 = this.f118362OooOoO0.getUnmodifiableView();
                this.f118361OooOo &= -2;
            }
            oooOOOO.f118357OooOo = this.f118362OooOoO0;
            return oooOOOO;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0oO(C32951OooO0Oo c32951OooO0Oo, oO0OOOO0.OooO0o oooO0o) throws Throwable {
            OooOOOO oooOOOO = null;
            try {
                try {
                    OooOOOO.f118356OooOoo0.getClass();
                    OooO0o(new OooOOOO(c32951OooO0Oo));
                } catch (oO0OOOO0.OooOO0 e) {
                    OooOOOO oooOOOO2 = (OooOOOO) e.f119095OooOo0o;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        oooOOOO = oooOOOO2;
                        if (oooOOOO != null) {
                            OooO0o(oooOOOO);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (oooOOOO != null) {
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
            OooOOOO oooOOOOOooO0o0 = OooO0o0();
            if (oooOOOOOooO0o0.isInitialized()) {
                return oooOOOOOooO0o0;
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
        OooOOOO oooOOOO = new OooOOOO();
        f118355OooOoOO = oooOOOO;
        oooOOOO.f118357OooOo = oO0OOOO0.OooOOO0.f119099OooOo;
    }

    public OooOOOO(OooO0O0 oooO0O0) {
        this.f118360OooOoO0 = (byte) -1;
        this.f118359OooOoO = -1;
        this.f118358OooOo0o = oooO0O0.f119081OooOo0o;
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.f118357OooOo.size(); i++) {
            oO0OOOO0.OooO0OO byteString = this.f118357OooOo.getByteString(i);
            c32952OooO0o0.OooOo(1, 2);
            c32952OooO0o0.OooOo0O(byteString.size());
            c32952OooO0o0.OooOOo(byteString);
        }
        c32952OooO0o0.OooOOo(this.f118358OooOo0o);
    }

    @Override // oO0OOOO0.InterfaceC32958OooOOOo
    public final int getSerializedSize() {
        int i = this.f118359OooOoO;
        if (i != -1) {
            return i;
        }
        int size = 0;
        for (int i2 = 0; i2 < this.f118357OooOo.size(); i2++) {
            oO0OOOO0.OooO0OO byteString = this.f118357OooOo.getByteString(i2);
            size += byteString.size() + C32952OooO0o0.OooO0o(byteString.size());
        }
        int size2 = this.f118358OooOo0o.size() + this.f118357OooOo.size() + size;
        this.f118359OooOoO = size2;
        return size2;
    }

    @Override // oO0OOOO0.InterfaceC32960OooOOo0
    public final boolean isInitialized() {
        byte b = this.f118360OooOoO0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f118360OooOoO0 = (byte) 1;
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

    public OooOOOO() {
        this.f118360OooOoO0 = (byte) -1;
        this.f118359OooOoO = -1;
        this.f118358OooOo0o = oO0OOOO0.OooO0OO.f119053OooOo0o;
    }

    public OooOOOO(C32951OooO0Oo c32951OooO0Oo) throws oO0OOOO0.OooOO0 {
        this.f118360OooOoO0 = (byte) -1;
        this.f118359OooOoO = -1;
        this.f118357OooOo = oO0OOOO0.OooOOO0.f119099OooOo;
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
                            oO0OOOO0.OooOOOO oooOOOOOooO0o0 = c32951OooO0Oo.OooO0o0();
                            if (!z2) {
                                this.f118357OooOo = new oO0OOOO0.OooOOO0();
                                z2 = true;
                            }
                            this.f118357OooOo.o00000OO(oooOOOOOooO0o0);
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.f118357OooOo = this.f118357OooOo.getUnmodifiableView();
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
        if (z2) {
            this.f118357OooOo = this.f118357OooOo.getUnmodifiableView();
        }
        try {
            c32952OooO0o0OooOO0.OooO();
        } catch (IOException unused2) {
        } finally {
            this.f118358OooOo0o = oooO0O0.OooOOO0();
        }
    }
}
