package o000oo0o;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicBoolean;
import o000oo0.InterfaceC24687Oooo0O0;
import o000oo0.InterfaceC24688Oooo0OO;
import o000oo0O.C24706OooO0Oo;
import o000oo0o.InterfaceC24709OooO0O0;
import o000ooo.C24746OooO00o;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34426OooOO0o;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: renamed from: o000oo0o.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24723OooOOo implements InterfaceC24688Oooo0OO, InterfaceC24729OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24717OooOO0O f83814OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f83815OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34426OooOO0o<OooO0OO> f83816OooO0OO = new C34426OooOO0o<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicBoolean f83817OooO0Oo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o000oo0o.OooOOo$OooO00o */
    public final class OooO00o implements InterfaceC24749OooO0Oo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final long f83818OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC24749OooO0Oo f83819OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C24723OooOOo f83820OooOoO0;

        public OooO00o(C24723OooOOo c24723OooOOo, InterfaceC24749OooO0Oo delegate) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(delegate, "delegate");
            this.f83820OooOoO0 = c24723OooOOo;
            this.f83819OooOo0o = delegate;
            this.f83818OooOo = C24706OooO0Oo.OooO00o();
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void OooO0o(int i, long j) {
            if (this.f83820OooOoO0.f83817OooO0Oo.get()) {
                C24746OooO00o.OooO0oO(21, "Statement is recycled");
                throw null;
            }
            if (this.f83818OooOo == C24706OooO0Oo.OooO00o()) {
                this.f83819OooOo0o.OooO0o(i, j);
            } else {
                C24746OooO00o.OooO0oO(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void OooO0oO(int i) {
            if (this.f83820OooOoO0.f83817OooO0Oo.get()) {
                C24746OooO00o.OooO0oO(21, "Statement is recycled");
                throw null;
            }
            if (this.f83818OooOo == C24706OooO0Oo.OooO00o()) {
                this.f83819OooOo0o.OooO0oO(i);
            } else {
                C24746OooO00o.OooO0oO(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void OooOOOO(double d, int i) {
            if (this.f83820OooOoO0.f83817OooO0Oo.get()) {
                C24746OooO00o.OooO0oO(21, "Statement is recycled");
                throw null;
            }
            if (this.f83818OooOo == C24706OooO0Oo.OooO00o()) {
                this.f83819OooOo0o.OooOOOO(d, i);
            } else {
                C24746OooO00o.OooO0oO(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws Exception {
            if (this.f83820OooOoO0.f83817OooO0Oo.get()) {
                C24746OooO00o.OooO0oO(21, "Statement is recycled");
                throw null;
            }
            if (this.f83818OooOo == C24706OooO0Oo.OooO00o()) {
                this.f83819OooOo0o.close();
            } else {
                C24746OooO00o.OooO0oO(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final byte[] getBlob(int i) {
            if (this.f83820OooOoO0.f83817OooO0Oo.get()) {
                C24746OooO00o.OooO0oO(21, "Statement is recycled");
                throw null;
            }
            if (this.f83818OooOo == C24706OooO0Oo.OooO00o()) {
                return this.f83819OooOo0o.getBlob(i);
            }
            C24746OooO00o.OooO0oO(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final int getColumnCount() {
            if (this.f83820OooOoO0.f83817OooO0Oo.get()) {
                C24746OooO00o.OooO0oO(21, "Statement is recycled");
                throw null;
            }
            if (this.f83818OooOo == C24706OooO0Oo.OooO00o()) {
                return this.f83819OooOo0o.getColumnCount();
            }
            C24746OooO00o.OooO0oO(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final String getColumnName(int i) {
            if (this.f83820OooOoO0.f83817OooO0Oo.get()) {
                C24746OooO00o.OooO0oO(21, "Statement is recycled");
                throw null;
            }
            if (this.f83818OooOo == C24706OooO0Oo.OooO00o()) {
                return this.f83819OooOo0o.getColumnName(i);
            }
            C24746OooO00o.OooO0oO(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final double getDouble(int i) {
            if (this.f83820OooOoO0.f83817OooO0Oo.get()) {
                C24746OooO00o.OooO0oO(21, "Statement is recycled");
                throw null;
            }
            if (this.f83818OooOo == C24706OooO0Oo.OooO00o()) {
                return this.f83819OooOo0o.getDouble(i);
            }
            C24746OooO00o.OooO0oO(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final long getLong(int i) {
            if (this.f83820OooOoO0.f83817OooO0Oo.get()) {
                C24746OooO00o.OooO0oO(21, "Statement is recycled");
                throw null;
            }
            if (this.f83818OooOo == C24706OooO0Oo.OooO00o()) {
                return this.f83819OooOo0o.getLong(i);
            }
            C24746OooO00o.OooO0oO(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final boolean isNull(int i) {
            if (this.f83820OooOoO0.f83817OooO0Oo.get()) {
                C24746OooO00o.OooO0oO(21, "Statement is recycled");
                throw null;
            }
            if (this.f83818OooOo == C24706OooO0Oo.OooO00o()) {
                return this.f83819OooOo0o.isNull(i);
            }
            C24746OooO00o.OooO0oO(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void o000000O(int i, String value) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            if (this.f83820OooOoO0.f83817OooO0Oo.get()) {
                C24746OooO00o.OooO0oO(21, "Statement is recycled");
                throw null;
            }
            if (this.f83818OooOo == C24706OooO0Oo.OooO00o()) {
                this.f83819OooOo0o.o000000O(i, value);
            } else {
                C24746OooO00o.OooO0oO(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void o0000O0(byte[] value) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            if (this.f83820OooOoO0.f83817OooO0Oo.get()) {
                C24746OooO00o.OooO0oO(21, "Statement is recycled");
                throw null;
            }
            if (this.f83818OooOo == C24706OooO0Oo.OooO00o()) {
                this.f83819OooOo0o.o0000O0(value);
            } else {
                C24746OooO00o.OooO0oO(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final String o000OoO(int i) {
            if (this.f83820OooOoO0.f83817OooO0Oo.get()) {
                C24746OooO00o.OooO0oO(21, "Statement is recycled");
                throw null;
            }
            if (this.f83818OooOo == C24706OooO0Oo.OooO00o()) {
                return this.f83819OooOo0o.o000OoO(i);
            }
            C24746OooO00o.OooO0oO(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final boolean o00oO0o() {
            if (this.f83820OooOoO0.f83817OooO0Oo.get()) {
                C24746OooO00o.OooO0oO(21, "Statement is recycled");
                throw null;
            }
            if (this.f83818OooOo == C24706OooO0Oo.OooO00o()) {
                return this.f83819OooOo0o.o00oO0o();
            }
            C24746OooO00o.OooO0oO(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void reset() {
            if (this.f83820OooOoO0.f83817OooO0Oo.get()) {
                C24746OooO00o.OooO0oO(21, "Statement is recycled");
                throw null;
            }
            if (this.f83818OooOo == C24706OooO0Oo.OooO00o()) {
                this.f83819OooOo0o.reset();
            } else {
                C24746OooO00o.OooO0oO(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: o000oo0o.OooOOo$OooO0O0 */
    public final class OooO0O0<T> implements InterfaceC24687Oooo0O0<T>, InterfaceC24729OooOo0o {
        public OooO0O0() {
        }

        @Override // o000oo0o.InterfaceC24729OooOo0o
        public final InterfaceC24747OooO0O0 OooO00o() {
            return C24723OooOOo.this.f83814OooO00o;
        }

        @Override // o000oo0.OooOOOO
        public final Object OooO0O0(String str, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
            return C24723OooOOo.this.OooO0O0(str, interfaceC32507OooOO0o, abstractC32479OooO0OO);
        }
    }

    /* JADX INFO: renamed from: o000oo0o.OooOOo$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f83822OooO00o;

        public OooO0OO(int i) {
            this.f83822OooO00o = i;
        }
    }

    public C24723OooOOo(C24717OooOO0O c24717OooOO0O, boolean z) {
        this.f83814OooO00o = c24717OooOO0O;
        this.f83815OooO0O0 = z;
    }

    @Override // o000oo0o.InterfaceC24729OooOo0o
    public final InterfaceC24747OooO0O0 OooO00o() {
        return this.f83814OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o000oo0.OooOOOO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C24728OooOo0O c24728OooOo0O;
        C24717OooOO0O c24717OooOO0O;
        C24723OooOOo c24723OooOOo;
        if (abstractC32479OooO0OO instanceof C24728OooOo0O) {
            c24728OooOo0O = (C24728OooOo0O) abstractC32479OooO0OO;
            int i = c24728OooOo0O.f83862OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24728OooOo0O.f83862OooOoo = i - Integer.MIN_VALUE;
            } else {
                c24728OooOo0O = new C24728OooOo0O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c24728OooOo0O.f83861OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24728OooOo0O.f83862OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (this.f83817OooO0Oo.get()) {
                C24746OooO00o.OooO0oO(21, "Connection is recycled");
                throw null;
            }
            C24708OooO00o c24708OooO00o = (C24708OooO00o) c24728OooOo0O.getContext().get(C24708OooO00o.f83757OooOo);
            if (c24708OooO00o == null || c24708OooO00o.f83758OooOo0o != this) {
                C24746OooO00o.OooO0oO(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            c24728OooOo0O.f83858OooOo0o = this;
            c24728OooOo0O.f83857OooOo = str;
            c24728OooOo0O.f83860OooOoO0 = interfaceC32507OooOO0o;
            c24717OooOO0O = this.f83814OooO00o;
            c24728OooOo0O.f83859OooOoO = c24717OooOO0O;
            c24728OooOo0O.f83862OooOoo = 1;
            if (c24717OooOO0O.f83785OooOo.OooO00o(c24728OooOo0O) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c24723OooOOo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C24717OooOO0O c24717OooOO0O2 = c24728OooOo0O.f83859OooOoO;
            interfaceC32507OooOO0o = c24728OooOo0O.f83860OooOoO0;
            String str2 = c24728OooOo0O.f83857OooOo;
            c24723OooOOo = c24728OooOo0O.f83858OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c24717OooOO0O = c24717OooOO0O2;
            str = str2;
        }
        try {
            OooO00o oooO00o = new OooO00o(c24723OooOOo, c24723OooOOo.f83814OooO00o.o0ooOOo(str));
            try {
                Object objInvoke = interfaceC32507OooOO0o.invoke(oooO00o);
                oooO00o.close();
                return objInvoke;
            } finally {
            }
        } finally {
            c24717OooOO0O.OooOOO0(null);
        }
    }

    @Override // o000oo0.InterfaceC24688Oooo0OO
    public final Object OooO0OO(AbstractC32476OooO abstractC32476OooO) {
        if (this.f83817OooO0Oo.get()) {
            C24746OooO00o.OooO0oO(21, "Connection is recycled");
            throw null;
        }
        C24708OooO00o c24708OooO00o = (C24708OooO00o) abstractC32476OooO.getContext().get(C24708OooO00o.f83757OooOo);
        if (c24708OooO00o != null && c24708OooO00o.f83758OooOo0o == this) {
            return Boolean.valueOf(!this.f83816OooO0OO.isEmpty());
        }
        C24746OooO00o.OooO0oO(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // o000oo0.InterfaceC24688Oooo0OO
    public final Object OooO0Oo(InterfaceC24688Oooo0OO.OooO00o oooO00o, InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32476OooO abstractC32476OooO) {
        if (this.f83817OooO0Oo.get()) {
            C24746OooO00o.OooO0oO(21, "Connection is recycled");
            throw null;
        }
        C24708OooO00o c24708OooO00o = (C24708OooO00o) abstractC32476OooO.getContext().get(C24708OooO00o.f83757OooOo);
        if (c24708OooO00o != null && c24708OooO00o.f83758OooOo0o == this) {
            return OooO0oO(oooO00o, interfaceC32508OooOOOo, abstractC32476OooO);
        }
        C24746OooO00o.OooO0oO(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C24727OooOo00 c24727OooOo00;
        C24723OooOOo c24723OooOOo;
        C24717OooOO0O c24717OooOO0O;
        if (abstractC32479OooO0OO instanceof C24727OooOo00) {
            c24727OooOo00 = (C24727OooOo00) abstractC32479OooO0OO;
            int i = c24727OooOo00.f83856OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24727OooOo00.f83856OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c24727OooOo00 = new C24727OooOo00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c24727OooOo00.f83853OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24727OooOo00.f83856OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c24727OooOo00.f83852OooOo0o = this;
            C24717OooOO0O c24717OooOO0O2 = this.f83814OooO00o;
            c24727OooOo00.f83851OooOo = c24717OooOO0O2;
            c24727OooOo00.f83854OooOoO0 = z;
            c24727OooOo00.f83856OooOoo0 = 1;
            if (c24717OooOO0O2.f83785OooOo.OooO00o(c24727OooOo00) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c24723OooOOo = this;
            c24717OooOO0O = c24717OooOO0O2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c24727OooOo00.f83854OooOoO0;
            c24717OooOO0O = c24727OooOo00.f83851OooOo;
            c24723OooOOo = c24727OooOo00.f83852OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            C34426OooOO0o<OooO0OO> c34426OooOO0o = c24723OooOOo.f83816OooO0OO;
            if (c34426OooOO0o.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            OooO0OO oooO0OO = (OooO0OO) C34431OooOo0.OooOoo0(c34426OooOO0o);
            C24717OooOO0O c24717OooOO0O3 = c24723OooOOo.f83814OooO00o;
            if (z) {
                oooO0OO.getClass();
                if (c34426OooOO0o.isEmpty()) {
                    C24746OooO00o.OooO0o0(c24717OooOO0O3, "END TRANSACTION");
                } else {
                    C24746OooO00o.OooO0o0(c24717OooOO0O3, "RELEASE SAVEPOINT '" + oooO0OO.f83822OooO00o + '\'');
                }
            } else if (c34426OooOO0o.isEmpty()) {
                C24746OooO00o.OooO0o0(c24717OooOO0O3, "ROLLBACK TRANSACTION");
            } else {
                C24746OooO00o.OooO0o0(c24717OooOO0O3, "ROLLBACK TRANSACTION TO SAVEPOINT '" + oooO0OO.f83822OooO00o + '\'');
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c24717OooOO0O.OooOOO0(null);
            return c32460OooOooO;
        } catch (Throwable th) {
            c24717OooOO0O.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(InterfaceC24688Oooo0OO.OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C24725OooOOoo c24725OooOOoo;
        C24717OooOO0O c24717OooOO0O;
        C24723OooOOo c24723OooOOo;
        if (abstractC32479OooO0OO instanceof C24725OooOOoo) {
            c24725OooOOoo = (C24725OooOOoo) abstractC32479OooO0OO;
            int i = c24725OooOOoo.f83836OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24725OooOOoo.f83836OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c24725OooOOoo = new C24725OooOOoo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c24725OooOOoo.f83833OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24725OooOOoo.f83836OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c24725OooOOoo.f83832OooOo0o = this;
            c24725OooOOoo.f83831OooOo = oooO00o;
            c24717OooOO0O = this.f83814OooO00o;
            c24725OooOOoo.f83834OooOoO0 = c24717OooOO0O;
            c24725OooOOoo.f83836OooOoo0 = 1;
            if (c24717OooOO0O.f83785OooOo.OooO00o(c24725OooOOoo) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c24723OooOOo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C24717OooOO0O c24717OooOO0O2 = c24725OooOOoo.f83834OooOoO0;
            InterfaceC24688Oooo0OO.OooO00o oooO00o2 = c24725OooOOoo.f83831OooOo;
            c24723OooOOo = c24725OooOOoo.f83832OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c24717OooOO0O = c24717OooOO0O2;
            oooO00o = oooO00o2;
        }
        try {
            C34426OooOO0o<OooO0OO> c34426OooOO0o = c24723OooOOo.f83816OooO0OO;
            int i3 = c34426OooOO0o.f123447OooOoO0;
            boolean zIsEmpty = c34426OooOO0o.isEmpty();
            C24717OooOO0O c24717OooOO0O3 = c24723OooOOo.f83814OooO00o;
            if (zIsEmpty) {
                int iOrdinal = oooO00o.ordinal();
                if (iOrdinal == 0) {
                    C24746OooO00o.OooO0o0(c24717OooOO0O3, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    C24746OooO00o.OooO0o0(c24717OooOO0O3, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new C32442OooOO0o();
                    }
                    C24746OooO00o.OooO0o0(c24717OooOO0O3, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                C24746OooO00o.OooO0o0(c24717OooOO0O3, "SAVEPOINT '" + i3 + '\'');
            }
            c34426OooOO0o.addLast(new OooO0OO(i3));
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c24717OooOO0O.OooOOO0(null);
            return c32460OooOooO;
        } catch (Throwable th) {
            c24717OooOO0O.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(1:(1:(2:15|16)(4:17|75|18|69))(2:22|23))(2:24|25))(6:26|81|27|(1:44)|45|(1:63)(1:48)))(1:31))(5:32|(1:34)|35|(1:38)|63)|77|39|(4:42|(0)|45|(0))|63|(2:(1:72)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a8, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
    
        r13 = r12;
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
    
        r0.f83846OooOo0o = null;
        r0.f83845OooOo = null;
        r0.f83850OooOoo0 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ba, code lost:
    
        if (r13.OooO0o(false, r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bd, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00be, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bf, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c0, code lost:
    
        r9 = r12;
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c4, code lost:
    
        r0.f83846OooOo0o = r9;
        r0.f83845OooOo = r12;
        r0.f83850OooOoo0 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ce, code lost:
    
        if (r13.OooO0o(false, r0) != r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d1, code lost:
    
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d7, code lost:
    
        oO00ooO.C32435OooO0Oo.OooO00o(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00db, code lost:
    
        throw r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(InterfaceC24688Oooo0OO.OooO00o oooO00o, InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C24726OooOo0 c24726OooOo0;
        C24723OooOOo c24723OooOOo;
        C24723OooOOo c24723OooOOo2;
        int i;
        boolean z;
        if (abstractC32479OooO0OO instanceof C24726OooOo0) {
            c24726OooOo0 = (C24726OooOo0) abstractC32479OooO0OO;
            int i2 = c24726OooOo0.f83850OooOoo0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c24726OooOo0.f83850OooOoo0 = i2 - Integer.MIN_VALUE;
            } else {
                c24726OooOo0 = new C24726OooOo0(this, abstractC32479OooO0OO);
            }
        }
        Object objInvoke = c24726OooOo0.f83847OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c24726OooOo0.f83850OooOoo0;
        Throwable th = null;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objInvoke);
            if (oooO00o == null) {
                oooO00o = InterfaceC24688Oooo0OO.OooO00o.f83659OooOo0o;
            }
            c24726OooOo0.f83846OooOo0o = this;
            c24726OooOo0.f83845OooOo = interfaceC32508OooOOOo;
            c24726OooOo0.f83850OooOoo0 = 1;
            if (OooO0o0(oooO00o, c24726OooOo0) != enumC32485OooO00o) {
                c24723OooOOo = this;
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                i = c24726OooOo0.f83848OooOoO0;
                c24723OooOOo2 = (C24723OooOOo) c24726OooOo0.f83846OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objInvoke);
                    z = i != 0;
                    c24726OooOo0.f83846OooOo0o = objInvoke;
                    c24726OooOo0.f83850OooOoo0 = 3;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    try {
                        if (!(th3 instanceof InterfaceC24709OooO0O0.OooO00o)) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return c24723OooOOo2.OooO0o(z, c24726OooOo0) != enumC32485OooO00o ? enumC32485OooO00o : objInvoke;
            }
            if (i3 == 3) {
                Object obj = c24726OooOo0.f83846OooOo0o;
                C32446OooOOOo.OooO0O0(objInvoke);
                return obj;
            }
            if (i3 == 4) {
                Object obj2 = c24726OooOo0.f83846OooOo0o;
                C32446OooOOOo.OooO0O0(objInvoke);
                return obj2;
            }
            if (i3 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th = (Throwable) c24726OooOo0.f83845OooOo;
            Throwable th5 = (Throwable) c24726OooOo0.f83846OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objInvoke);
            } catch (SQLException e) {
                e = e;
                if (th5 == null) {
                }
            }
            throw th;
        }
        interfaceC32508OooOOOo = (InterfaceC32508OooOOOo) c24726OooOo0.f83845OooOo;
        c24723OooOOo = (C24723OooOOo) c24726OooOo0.f83846OooOo0o;
        C32446OooOOOo.OooO0O0(objInvoke);
        OooO0O0 oooO0O0 = c24723OooOOo.new OooO0O0();
        c24726OooOo0.f83846OooOo0o = c24723OooOOo;
        c24726OooOo0.f83845OooOo = null;
        c24726OooOo0.f83848OooOoO0 = 1;
        c24726OooOo0.f83850OooOoo0 = 2;
        objInvoke = interfaceC32508OooOOOo.invoke(oooO0O0, c24726OooOo0);
        if (objInvoke != enumC32485OooO00o) {
            c24723OooOOo2 = c24723OooOOo;
            i = 1;
            if (i != 0) {
            }
            c24726OooOo0.f83846OooOo0o = objInvoke;
            c24726OooOo0.f83850OooOoo0 = 3;
            if (c24723OooOOo2.OooO0o(z, c24726OooOo0) != enumC32485OooO00o) {
            }
        }
    }
}
