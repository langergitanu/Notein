package o000oo0o;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C24034Oooo00O;
import o000oo0.AbstractC24655OooO00o;
import o000oo0o.C24708OooO00o;
import o000ooo.C24746OooO00o;
import o000ooo.InterfaceC24747OooO0O0;
import o0Ooo0oO.C29437OooOO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O.C33549OooO00o;
import oO0o0O.EnumC33551OooO0OO;
import oO0o0OO.C33609OooO0oo;
import oO0o0Ooo.C33843OooOoO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o000oo0o.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24716OooOO0 implements InterfaceC24709OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C24724OooOOo0 f83780OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C24724OooOOo0 f83781OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AtomicBoolean f83782OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ThreadLocal<C24723OooOOo> f83783OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final long f83784OooOoOO;

    public C24716OooOO0(final AbstractC24655OooO00o.C19643OooO00o c19643OooO00o) {
        this.f83783OooOoO0 = new ThreadLocal<>();
        this.f83782OooOoO = new AtomicBoolean(false);
        int i = C33549OooO00o.f121147OooOoO;
        this.f83784OooOoOO = C29437OooOO0O.OooO0o(30, EnumC33551OooO0OO.f121152OooOoO);
        C24724OooOOo0 c24724OooOOo0 = new C24724OooOOo0(1, new oO0O000o.OooO00o() { // from class: o000oo0o.OooO0o0
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return c19643OooO00o.OooO00o(":memory:");
            }
        });
        this.f83781OooOo0o = c24724OooOOo0;
        this.f83780OooOo = c24724OooOOo0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143 A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #5 {all -> 0x006c, blocks: (B:22:0x0067, B:63:0x011a, B:68:0x0138, B:70:0x0143, B:81:0x0191, B:82:0x0198), top: B:115:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017a A[Catch: all -> 0x0190, TRY_LEAVE, TryCatch #1 {all -> 0x0190, blocks: (B:74:0x0174, B:76:0x017a, B:78:0x0186, B:79:0x0189), top: B:107:0x0174 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0191 A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #5 {all -> 0x006c, blocks: (B:22:0x0067, B:63:0x011a, B:68:0x0138, B:70:0x0143, B:81:0x0191, B:82:0x0198), top: B:115:0x0067 }] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6, types: [o000oo0o.OooOOo0] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [o000oo0o.OooOOo0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [o000oo0o.OooOOo0] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r6v14, types: [T, o000oo0o.OooOOo] */
    /* JADX WARN: Type inference failed for: r9v1, types: [o000oo0o.OooO0o] */
    @Override // o000oo0o.InterfaceC24709OooO0O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooOoO(boolean z, InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C24714OooO0oO c24714OooO0oO;
        Throwable th;
        ?? r4;
        C24034Oooo00O c24034Oooo00O;
        InterfaceC32508OooOOOo interfaceC32508OooOOOo2;
        ?? r14;
        C24034Oooo00O c24034Oooo00O2;
        InterfaceC34415OooO0oo context;
        C24716OooOO0 c24716OooOO0;
        Object obj;
        C24034Oooo00O c24034Oooo00O3;
        ?? r42;
        C24723OooOOo c24723OooOOo;
        final boolean z2 = z;
        if (abstractC32479OooO0OO instanceof C24714OooO0oO) {
            c24714OooO0oO = (C24714OooO0oO) abstractC32479OooO0OO;
            int i = c24714OooO0oO.f83776Oooo000;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24714OooO0oO.f83776Oooo000 = i - Integer.MIN_VALUE;
            } else {
                c24714OooO0oO = new C24714OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c24714OooO0oO.f83774OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24714OooO0oO.f83776Oooo000;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            if (this.f83782OooOoO.get()) {
                C24746OooO00o.OooO0oO(21, "Connection pool is closed");
                throw null;
            }
            ThreadLocal<C24723OooOOo> threadLocal = this.f83783OooOoO0;
            C24723OooOOo c24723OooOOo2 = threadLocal.get();
            C24708OooO00o.C19644OooO00o c19644OooO00o = C24708OooO00o.f83757OooOo;
            if (c24723OooOOo2 == null) {
                C24708OooO00o c24708OooO00o = (C24708OooO00o) c24714OooO0oO.getContext().get(c19644OooO00o);
                c24723OooOOo2 = c24708OooO00o != null ? c24708OooO00o.f83758OooOo0o : null;
            }
            if (c24723OooOOo2 == null) {
                ?? r3 = z2 ? this.f83781OooOo0o : this.f83780OooOo;
                C24034Oooo00O c24034Oooo00O4 = new C24034Oooo00O();
                try {
                    InterfaceC34415OooO0oo context2 = c24714OooO0oO.getContext();
                    long j = this.f83784OooOoOO;
                    ?? r9 = new oO0O000o.OooO00o() { // from class: o000oo0o.OooO0o
                        @Override // oO0O000o.OooO00o
                        public final Object invoke() {
                            C24716OooOO0 c24716OooOO02 = this.f83765OooOo0o;
                            c24716OooOO02.getClass();
                            String str = z2 ? "reader" : "writer";
                            StringBuilder sb = new StringBuilder();
                            sb.append("Timed out attempting to acquire a " + str + " connection.");
                            sb.append("\n\nWriter pool:\n");
                            c24716OooOO02.f83780OooOo.OooO0Oo(sb);
                            sb.append("Reader pool:");
                            sb.append('\n');
                            c24716OooOO02.f83781OooOo0o.OooO0Oo(sb);
                            try {
                                C24746OooO00o.OooO0oO(5, sb.toString());
                                throw null;
                            } catch (SQLException e) {
                                e.printStackTrace();
                                return C32460OooOooO.f116667OooO00o;
                            }
                        }
                    };
                    c24714OooO0oO.f83768OooOo0o = this;
                    c24714OooO0oO.f83767OooOo = interfaceC32508OooOOOo;
                    c24714OooO0oO.f83770OooOoO0 = r3;
                    c24714OooO0oO.f83769OooOoO = c24034Oooo00O4;
                    c24714OooO0oO.f83771OooOoOO = context2;
                    c24714OooO0oO.f83773OooOoo0 = c24034Oooo00O4;
                    c24714OooO0oO.f83772OooOoo = z2;
                    c24714OooO0oO.f83776Oooo000 = 3;
                    Object objOooO0O0 = r3.OooO0O0(j, r9, c24714OooO0oO);
                    if (objOooO0O0 != enumC32485OooO00o) {
                        interfaceC32508OooOOOo2 = interfaceC32508OooOOOo;
                        r14 = r3;
                        c24034Oooo00O2 = c24034Oooo00O4;
                        c24034Oooo00O = c24034Oooo00O2;
                        objOooO0o = objOooO0O0;
                        context = context2;
                        c24716OooOO0 = this;
                        C24717OooOO0O c24717OooOO0O = (C24717OooOO0O) objOooO0o;
                        c24717OooOO0O.getClass();
                        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
                        c24717OooOO0O.f83788OooOoO0 = context;
                        c24717OooOO0O.f83787OooOoO = new Throwable();
                        c24034Oooo00O2.f80942OooOo0o = new C24723OooOOo(c24717OooOO0O, c24716OooOO0.f83781OooOo0o == c24716OooOO0.f83780OooOo && z2);
                        obj = c24034Oooo00O.f80942OooOo0o;
                        if (obj != null) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r4 = r3;
                    c24034Oooo00O = c24034Oooo00O4;
                }
            } else {
                if (!z2 && c24723OooOOo2.f83815OooO0O0) {
                    C24746OooO00o.OooO0oO(1, "Cannot upgrade connection from reader to writer");
                    throw null;
                }
                if (c24714OooO0oO.getContext().get(c19644OooO00o) == null) {
                    C24708OooO00o c24708OooO00o2 = new C24708OooO00o(c24723OooOOo2);
                    kotlin.jvm.internal.OooOOO0.OooO0oO(threadLocal, "<this>");
                    InterfaceC34415OooO0oo interfaceC34415OooO0ooOooO00o = InterfaceC34415OooO0oo.OooO00o.OooO00o(c24708OooO00o2, new C33843OooOoO(c24723OooOOo2, threadLocal));
                    C24715OooO0oo c24715OooO0oo = new C24715OooO0oo(interfaceC32508OooOOOo, c24723OooOOo2, null);
                    c24714OooO0oO.f83776Oooo000 = 1;
                    Object objOooO0o2 = C33609OooO0oo.OooO0o(interfaceC34415OooO0ooOooO00o, c24715OooO0oo, c24714OooO0oO);
                    if (objOooO0o2 != enumC32485OooO00o) {
                        return objOooO0o2;
                    }
                } else {
                    c24714OooO0oO.f83776Oooo000 = 2;
                    Object objInvoke = interfaceC32508OooOOOo.invoke(c24723OooOOo2, c24714OooO0oO);
                    if (objInvoke != enumC32485OooO00o) {
                        return objInvoke;
                    }
                }
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            return objOooO0o;
        }
        if (i2 == 2) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            return objOooO0o;
        }
        if (i2 == 3) {
            z2 = c24714OooO0oO.f83772OooOoo;
            c24034Oooo00O2 = c24714OooO0oO.f83773OooOoo0;
            context = c24714OooO0oO.f83771OooOoOO;
            c24034Oooo00O = c24714OooO0oO.f83769OooOoO;
            C24724OooOOo0 c24724OooOOo0 = c24714OooO0oO.f83770OooOoO0;
            interfaceC32508OooOOOo2 = (InterfaceC32508OooOOOo) c24714OooO0oO.f83767OooOo;
            c24716OooOO0 = (C24716OooOO0) c24714OooO0oO.f83768OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0o);
                r14 = c24724OooOOo0;
                C24717OooOO0O c24717OooOO0O2 = (C24717OooOO0O) objOooO0o;
                c24717OooOO0O2.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
                c24717OooOO0O2.f83788OooOoO0 = context;
                c24717OooOO0O2.f83787OooOoO = new Throwable();
                c24034Oooo00O2.f80942OooOo0o = new C24723OooOOo(c24717OooOO0O2, c24716OooOO0.f83781OooOo0o == c24716OooOO0.f83780OooOo && z2);
                obj = c24034Oooo00O.f80942OooOo0o;
                if (obj != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                C24723OooOOo c24723OooOOo3 = (C24723OooOOo) obj;
                C24708OooO00o c24708OooO00o3 = new C24708OooO00o(c24723OooOOo3);
                ThreadLocal<C24723OooOOo> threadLocal2 = c24716OooOO0.f83783OooOoO0;
                kotlin.jvm.internal.OooOOO0.OooO0oO(threadLocal2, "<this>");
                InterfaceC34415OooO0oo interfaceC34415OooO0ooOooO00o2 = InterfaceC34415OooO0oo.OooO00o.OooO00o(c24708OooO00o3, new C33843OooOoO(c24723OooOOo3, threadLocal2));
                C24707OooO c24707OooO = new C24707OooO(interfaceC32508OooOOOo2, c24034Oooo00O, null);
                c24714OooO0oO.f83768OooOo0o = r14;
                c24714OooO0oO.f83767OooOo = c24034Oooo00O;
                c24714OooO0oO.f83770OooOoO0 = null;
                c24714OooO0oO.f83769OooOoO = null;
                c24714OooO0oO.f83771OooOoOO = null;
                c24714OooO0oO.f83773OooOoo0 = null;
                c24714OooO0oO.f83776Oooo000 = 4;
                objOooO0o = C33609OooO0oo.OooO0o(interfaceC34415OooO0ooOooO00o2, c24707OooO, c24714OooO0oO);
                if (objOooO0o != enumC32485OooO00o) {
                    c24034Oooo00O3 = c24034Oooo00O;
                    r42 = r14;
                    c24723OooOOo = (C24723OooOOo) c24034Oooo00O3.f80942OooOo0o;
                    if (c24723OooOOo != null) {
                    }
                    return objOooO0o;
                }
                return enumC32485OooO00o;
            } catch (Throwable th3) {
                th = th3;
                r4 = c24724OooOOo0;
            }
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24034Oooo00O3 = (C24034Oooo00O) c24714OooO0oO.f83767OooOo;
            C24724OooOOo0 c24724OooOOo02 = (C24724OooOOo0) c24714OooO0oO.f83768OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0o);
                r42 = c24724OooOOo02;
                try {
                    c24723OooOOo = (C24723OooOOo) c24034Oooo00O3.f80942OooOo0o;
                    if (c24723OooOOo != null) {
                        C24717OooOO0O c24717OooOO0O3 = c24723OooOOo.f83814OooO00o;
                        if (c24723OooOOo.f83817OooO0Oo.compareAndSet(false, true)) {
                            try {
                                C24746OooO00o.OooO0o0(c24717OooOO0O3, "ROLLBACK TRANSACTION");
                            } catch (SQLException unused) {
                            }
                        }
                        c24717OooOO0O3.f83788OooOoO0 = null;
                        c24717OooOO0O3.f83787OooOoO = null;
                        r42.OooO0o0(c24717OooOO0O3);
                    }
                } catch (Throwable unused2) {
                }
                return objOooO0o;
            } catch (Throwable th4) {
                c24034Oooo00O = c24034Oooo00O3;
                th = th4;
                r4 = c24724OooOOo02;
            }
        }
        try {
            throw th;
        } finally {
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f83782OooOoO.compareAndSet(false, true)) {
            this.f83781OooOo0o.OooO0OO();
            this.f83780OooOo.OooO0OO();
        }
    }

    public C24716OooOO0(final AbstractC24655OooO00o.C19643OooO00o c19643OooO00o, final String fileName, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fileName, "fileName");
        this.f83783OooOoO0 = new ThreadLocal<>();
        int i2 = 0;
        this.f83782OooOoO = new AtomicBoolean(false);
        int i3 = C33549OooO00o.f121147OooOoO;
        this.f83784OooOoOO = C29437OooOO0O.OooO0o(30, EnumC33551OooO0OO.f121152OooOoO);
        if (i > 0) {
            this.f83781OooOo0o = new C24724OooOOo0(i, new oO0O000o.OooO00o() { // from class: o000oo0o.OooO0OO
                @Override // oO0O000o.OooO00o
                public final Object invoke() throws Exception {
                    InterfaceC24747OooO0O0 interfaceC24747OooO0O0OooO00o = c19643OooO00o.OooO00o(fileName);
                    C24746OooO00o.OooO0o0(interfaceC24747OooO0O0OooO00o, "PRAGMA query_only = 1");
                    return interfaceC24747OooO0O0OooO00o;
                }
            });
            this.f83780OooOo = new C24724OooOOo0(1, new C24711OooO0Oo(i2, c19643OooO00o, fileName));
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
