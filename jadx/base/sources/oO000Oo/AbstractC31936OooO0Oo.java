package oO000Oo;

import com.google.common.base.Preconditions;
import java.io.InputStream;
import oO000Oo.InterfaceC32049o0000oOO;
import oO000Oo.OooO00o;
import oO000Oo.o000000O;
import oO0OO0OO.C32909OooO0oo;
import oO0OOo0o.InterfaceC33064OooOO0o;

/* JADX INFO: renamed from: oO000Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31936OooO0Oo implements InterfaceC32048o0000oO0 {

    /* JADX INFO: renamed from: oO000Oo.OooO0Oo$OooO00o */
    public static abstract class OooO00o implements o000000O.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public InterfaceC31955OooOoO f113949OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object f113950OooO0O0 = new Object();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o000 f113951OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o000000O f113952OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f113953OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f113954OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f113955OooO0oO;

        public OooO00o(int i, C32043o0000o c32043o0000o, o000 o000Var) {
            this.f113951OooO0OO = (o000) Preconditions.checkNotNull(o000Var, "transportTracer");
            o000000O o000000o2 = new o000000O(this, i, c32043o0000o, o000Var);
            this.f113952OooO0Oo = o000000o2;
            this.f113949OooO00o = o000000o2;
        }

        @Override // oO000Oo.o000000O.OooO00o
        public final void OooO00o(InterfaceC32049o0000oOO.OooO00o oooO00o) {
            ((OooO00o.OooO0O0) this).f113936OooOO0.OooO00o(oooO00o);
        }

        public final void OooO0Oo(int i) {
            boolean z;
            boolean zOooO0o0;
            synchronized (this.f113950OooO0O0) {
                Preconditions.checkState(this.f113953OooO0o, "onStreamAllocated was not called, but it seems the stream is active");
                int i2 = this.f113954OooO0o0;
                z = false;
                boolean z2 = i2 < 32768;
                int i3 = i2 - i;
                this.f113954OooO0o0 = i3;
                boolean z3 = i3 < 32768;
                if (!z2 && z3) {
                    z = true;
                }
            }
            if (z) {
                synchronized (this.f113950OooO0O0) {
                    zOooO0o0 = OooO0o0();
                }
                if (zOooO0o0) {
                    ((OooO00o.OooO0O0) this).f113936OooOO0.onReady();
                }
            }
        }

        public final boolean OooO0o0() {
            boolean z;
            synchronized (this.f113950OooO0O0) {
                try {
                    z = this.f113953OooO0o && this.f113954OooO0o0 < 32768 && !this.f113955OooO0oO;
                } finally {
                }
            }
            return z;
        }
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void OooO00o(int i) {
        OooO00o oooO00oOooOOOO = OooOOOO();
        oooO00oOooOOOO.getClass();
        oO00o00.OooO0O0.OooO0O0();
        OooO0OO oooO0OO = new OooO0OO(oooO00oOooOOOO, i);
        synchronized (((C32909OooO0oo.OooO0O0) oooO00oOooOOOO).f118697OooOo0o) {
            oooO0OO.run();
        }
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void OooO0O0(InterfaceC33064OooOO0o interfaceC33064OooOO0o) {
        ((oO000Oo.OooO00o) this).f113924OooO0O0.OooO0O0((InterfaceC33064OooOO0o) Preconditions.checkNotNull(interfaceC33064OooOO0o, "compressor"));
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void OooO0o0(boolean z) {
        ((oO000Oo.OooO00o) this).f113924OooO0O0.OooO0o0(z);
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void OooO0oO(InputStream inputStream) {
        Preconditions.checkNotNull(inputStream, "message");
        try {
            if (!((oO000Oo.OooO00o) this).f113924OooO0O0.isClosed()) {
                ((oO000Oo.OooO00o) this).f113924OooO0O0.OooO0o(inputStream);
            }
        } finally {
            C31989OoooO0O.OooO0O0(inputStream);
        }
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void OooO0oo() {
        OooO00o oooO00oOooOOOO = OooOOOO();
        o000000O o000000o2 = oooO00oOooOOOO.f113952OooO0Oo;
        o000000o2.f114329OooOo0o = oooO00oOooOOOO;
        oooO00oOooOOOO.f113949OooO00o = o000000o2;
    }

    public abstract OooO00o OooOOOO();

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void flush() {
        InterfaceC31988OoooO00 interfaceC31988OoooO00 = ((oO000Oo.OooO00o) this).f113924OooO0O0;
        if (interfaceC31988OoooO00.isClosed()) {
            return;
        }
        interfaceC31988OoooO00.flush();
    }
}
