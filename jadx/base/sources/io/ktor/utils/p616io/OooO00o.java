package io.ktor.utils.p616io;

import Oooo0oO.o0Oo0oo;
import OooooO0.C21286OooO0O0;
import OooooO0.C21292OooO0oo;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.fragment.app.C21904OooOoo0;
import io.ktor.utils.p616io.internal.AbstractC23996OooO0oO;
import io.ktor.utils.p616io.internal.C23994OooO0Oo;
import io.ktor.utils.p616io.internal.C23995OooO0o0;
import io.ktor.utils.p616io.internal.C24000OooOO0o;
import io.ktor.utils.p616io.internal.OooO;
import io.ktor.utils.p616io.internal.OooO00o;
import io.ktor.utils.p616io.internal.OooO0OO;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24030OooOoo;
import kotlin.jvm.internal.C24033OooOooo;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo000;
import oO00O.OooOO0O;
import oO00O0o.C32177OooO0o0;
import oO00O0oo.C32221OooO0oo;
import oO00OOoo.C32250OooO0O0;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0O.C32271OooO00o;
import oO00Oo0O.C32273OooO0Oo;
import oO00Oo0o.OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0OOo.C33707OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public class OooO00o implements InterfaceC23967Oooo00O, InterfaceC23986Ooooo0o, InterfaceC23990Oooooo, o0ooOOo, InterfaceC24008o0ooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final io.ktor.utils.p616io.internal.OooO00o<C32460OooOooO> f80501OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f80502OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0o<AbstractC23996OooO0oO.OooO0OO> f80503OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f80504OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f80505OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f80506OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final io.ktor.utils.p616io.internal.OooO0o f80507OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final io.ktor.utils.p616io.internal.OooO00o<Boolean> f80508OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0O0 f80509OooOO0;
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _readOp;
    private volatile /* synthetic */ Object _state;
    volatile /* synthetic */ Object _writeOp;
    private volatile InterfaceC33672o00ooo attachedJob;
    private volatile C23994OooO0Oo joining;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private volatile int writeSuspensionSize;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f80497OooOO0O = AtomicReferenceFieldUpdater.newUpdater(OooO00o.class, Object.class, "_state");

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f80498OooOO0o = AtomicReferenceFieldUpdater.newUpdater(OooO00o.class, Object.class, "_closed");

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f80500OooOOO0 = AtomicReferenceFieldUpdater.newUpdater(OooO00o.class, Object.class, "_readOp");

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f80499OooOOO = AtomicReferenceFieldUpdater.newUpdater(OooO00o.class, Object.class, "_writeOp");

    /* JADX INFO: renamed from: io.ktor.utils.io.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19592OooO00o extends OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {
        public C19592OooO00o() {
            super(1);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Throwable th) {
            Throwable th2 = th;
            OooO00o oooO00o = OooO00o.this;
            oooO00o.attachedJob = null;
            if (th2 != null) {
                Throwable th3 = th2;
                while (th3 instanceof CancellationException) {
                    if (th3.equals(th3.getCause())) {
                        break;
                    }
                    Throwable cause = th3.getCause();
                    if (cause == null) {
                        break;
                    }
                    th3 = cause;
                }
                th2 = th3;
                oooO00o.OooO0Oo(th2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {
        public OooO0O0() {
            super(1);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) throws Throwable {
            Continuation<? super C32460OooOooO> ucont = continuation;
            OooOOO0.OooO0oO(ucont, "ucont");
            int i = OooO00o.this.writeSuspensionSize;
            loop0: while (true) {
                io.ktor.utils.p616io.internal.OooO0O0 oooO0O0OooOooO = OooO00o.OooOooO(OooO00o.this);
                if (oooO0O0OooOooO != null) {
                    Oooo000.OooO00o(oooO0O0OooOooO.OooO00o());
                    throw null;
                }
                if (!OooO00o.this.o0000Ooo(i)) {
                    ucont.resumeWith(C32460OooOooO.f116667OooO00o);
                    break;
                }
                OooO00o oooO00o = OooO00o.this;
                Continuation continuationOooO0o0 = C21904OooOoo0.OooO0o0(ucont);
                OooO00o oooO00o2 = OooO00o.this;
                while (((Continuation) oooO00o._writeOp) == null) {
                    if (!oooO00o2.o0000Ooo(i)) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO00o.f80499OooOOO;
                    while (!atomicReferenceFieldUpdater.compareAndSet(oooO00o, null, continuationOooO0o0)) {
                        if (atomicReferenceFieldUpdater.get(oooO00o) != null) {
                            break;
                        }
                    }
                    if (oooO00o2.o0000Ooo(i)) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = OooO00o.f80499OooOOO;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(oooO00o, continuationOooO0o0, null)) {
                        if (atomicReferenceFieldUpdater2.get(oooO00o) != continuationOooO0o0) {
                            break loop0;
                        }
                    }
                }
                throw new IllegalStateException("Operation is already in progress");
            }
            OooO00o.this.OoooO00(i);
            if (OooO00o.this.o00oO0O()) {
                OooO00o.this.o00o0O();
            }
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    public OooO00o(boolean z) {
        this(z, C23995OooO0o0.f80809OooO0OO, 8);
    }

    public static final io.ktor.utils.p616io.internal.OooO0O0 OooOooO(OooO00o oooO00o) {
        return (io.ktor.utils.p616io.internal.OooO0O0) oooO00o._closed;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OoooO(OooO00o oooO00o, ByteBuffer byteBuffer, long j, long j2, long j3, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23949OooO0oO c23949OooO0oO;
        C24033OooOooo c24033OooOooo;
        if (abstractC32479OooO0OO instanceof C23949OooO0oO) {
            c23949OooO0oO = (C23949OooO0oO) abstractC32479OooO0OO;
            int i = c23949OooO0oO.f80553OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23949OooO0oO.f80553OooOoO = i - Integer.MIN_VALUE;
            } else {
                c23949OooO0oO = new C23949OooO0oO(oooO00o, abstractC32479OooO0OO);
            }
        }
        Object obj = c23949OooO0oO.f80551OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23949OooO0oO.f80553OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C24033OooOooo c24033OooOooo2 = new C24033OooOooo();
            int i3 = (int) (j2 <= 4088 ? j2 : 4088L);
            try {
                InterfaceC32507OooOO0o c23950OooO0oo = new C23950OooO0oo(j3, byteBuffer, j, c24033OooOooo2);
                c23949OooO0oO.f80552OooOo0o = c24033OooOooo2;
                c23949OooO0oO.f80553OooOoO = 1;
                if (oooO00o.o000oOoO(i3, c23950OooO0oo, c23949OooO0oO) == obj2) {
                    return obj2;
                }
            } catch (EOFException unused) {
            }
            c24033OooOooo = c24033OooOooo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24033OooOooo = c23949OooO0oO.f80552OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (EOFException unused2) {
            }
        }
        return new Long(c24033OooOooo.f80940OooOo0o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0163  */
    /* JADX WARN: Type inference failed for: r10v10, types: [T] */
    /* JADX WARN: Type inference failed for: r10v16, types: [T] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, oO00O0oo.OooO0oo$OooO00o] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v6, types: [oO0O000o.OooOOOo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OoooO0O(OooO00o oooO00o, C32221OooO0oo.OooO00o oooO00o2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooO0o oooO0o;
        C24034Oooo00O c24034Oooo00O;
        OooO00o oooO00o3;
        Throwable th;
        OooO00o oooO00o4;
        ?? r5;
        C24034Oooo00O c24034Oooo00O2;
        ?? r10;
        C24034Oooo00O c24034Oooo00O3;
        ?? r9;
        OooO00o oooO00o5;
        Throwable th2;
        C24034Oooo00O c24034Oooo00O4;
        ?? r102;
        C24034Oooo00O c24034Oooo00O5;
        AbstractC23996OooO0oO abstractC23996OooO0oO;
        AbstractC23996OooO0oO abstractC23996OooO0oO2;
        if (abstractC32479OooO0OO instanceof OooO0o) {
            oooO0o = (OooO0o) abstractC32479OooO0OO;
            int i = oooO0o.f80544OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f80544OooOooO = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(oooO00o, abstractC32479OooO0OO);
            }
        }
        Object obj = oooO0o.f80543OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0o.f80544OooOooO;
        C24000OooOO0o c24000OooOO0o = C24000OooOO0o.f80834OooO0O0;
        boolean z = true;
        switch (i2) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                Throwable thOooO0O0 = oooO00o.OooO0O0();
                if (thOooO0O0 != null) {
                    OooO0OO oooO0OO = new OooO0OO(thOooO0O0);
                    oooO0o.f80544OooOooO = 1;
                    Object objInvoke = oooO00o2.invoke(oooO0OO, oooO0o);
                    if (objInvoke != enumC32485OooO00o) {
                        return objInvoke;
                    }
                } else {
                    if (((AbstractC23996OooO0oO) oooO00o._state) != AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                        c24034Oooo00O = new C24034Oooo00O();
                        if (oooO00o.oo000o() != null) {
                            try {
                                if (((AbstractC23996OooO0oO) oooO00o._state).f80812OooO0O0._availableForRead$internal == 0) {
                                    oooO00o.o00Oo0();
                                    oooO00o.o0OOO0o();
                                } else {
                                    oooO0o.f80538OooOo0o = oooO00o;
                                    oooO0o.f80537OooOo = oooO00o2;
                                    oooO0o.f80540OooOoO0 = c24034Oooo00O;
                                    oooO0o.f80539OooOoO = oooO00o;
                                    oooO0o.f80541OooOoOO = c24034Oooo00O;
                                    oooO0o.f80544OooOooO = 3;
                                    Object objInvoke2 = oooO00o2.invoke(oooO00o, oooO0o);
                                    if (objInvoke2 != enumC32485OooO00o) {
                                        oooO00o4 = oooO00o;
                                        r5 = oooO00o2;
                                        oooO00o3 = oooO00o4;
                                        c24034Oooo00O2 = c24034Oooo00O;
                                        r10 = objInvoke2;
                                        c24034Oooo00O3 = c24034Oooo00O2;
                                        c24034Oooo00O2.f80942OooOo0o = r10;
                                        oooO00o3.o00Oo0();
                                        oooO00o3.o0OOO0o();
                                        c24034Oooo00O = c24034Oooo00O3;
                                        r9 = r5;
                                        oooO00o = oooO00o4;
                                        if (!z) {
                                            Throwable thOooO0O02 = oooO00o.OooO0O0();
                                            if (thOooO0O02 != null) {
                                                OooO0OO oooO0OO2 = new OooO0OO(thOooO0O02);
                                                oooO0o.f80538OooOo0o = null;
                                                oooO0o.f80537OooOo = null;
                                                oooO0o.f80540OooOoO0 = null;
                                                oooO0o.f80539OooOoO = null;
                                                oooO0o.f80541OooOoOO = null;
                                                oooO0o.f80544OooOooO = 4;
                                                Object objInvoke3 = r9.invoke(oooO0OO2, oooO0o);
                                                if (objInvoke3 != enumC32485OooO00o) {
                                                    return objInvoke3;
                                                }
                                            } else if (((AbstractC23996OooO0oO) oooO00o._state) == AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                                                oooO0o.f80538OooOo0o = null;
                                                oooO0o.f80537OooOo = null;
                                                oooO0o.f80540OooOoO0 = null;
                                                oooO0o.f80539OooOoO = null;
                                                oooO0o.f80541OooOoOO = null;
                                                oooO0o.f80544OooOooO = 5;
                                                Object objInvoke4 = r9.invoke(c24000OooOO0o, oooO0o);
                                                if (objInvoke4 != enumC32485OooO00o) {
                                                    return objInvoke4;
                                                }
                                            } else {
                                                try {
                                                    oooO0o.f80538OooOo0o = oooO00o;
                                                    oooO0o.f80537OooOo = c24034Oooo00O;
                                                    oooO0o.f80540OooOoO0 = c24034Oooo00O;
                                                    oooO0o.f80539OooOoO = null;
                                                    oooO0o.f80541OooOoOO = null;
                                                    oooO0o.f80544OooOooO = 6;
                                                    Object objInvoke5 = r9.invoke(oooO00o, oooO0o);
                                                    if (objInvoke5 != enumC32485OooO00o) {
                                                        oooO00o5 = oooO00o;
                                                        c24034Oooo00O4 = c24034Oooo00O;
                                                        r102 = objInvoke5;
                                                        c24034Oooo00O5 = c24034Oooo00O4;
                                                        c24034Oooo00O4.f80942OooOo0o = r102;
                                                        abstractC23996OooO0oO2 = (AbstractC23996OooO0oO) oooO00o5._state;
                                                        if (!abstractC23996OooO0oO2.OooO00o() && abstractC23996OooO0oO2 != AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                                                            if (!(abstractC23996OooO0oO2 instanceof AbstractC23996OooO0oO.C23997OooO0Oo) || (abstractC23996OooO0oO2 instanceof AbstractC23996OooO0oO.C23998OooO0o0)) {
                                                                oooO00o5.o00Oo0();
                                                            }
                                                            oooO00o5.o0OOO0o();
                                                        }
                                                        c24034Oooo00O = c24034Oooo00O5;
                                                    }
                                                } catch (Throwable th3) {
                                                    oooO00o5 = oooO00o;
                                                    th2 = th3;
                                                    abstractC23996OooO0oO = (AbstractC23996OooO0oO) oooO00o5._state;
                                                    if (!abstractC23996OooO0oO.OooO00o()) {
                                                        if (!(abstractC23996OooO0oO instanceof AbstractC23996OooO0oO.C23997OooO0Oo)) {
                                                            oooO00o5.o00Oo0();
                                                            oooO00o5.o0OOO0o();
                                                        }
                                                    }
                                                    throw th2;
                                                }
                                            }
                                        }
                                        return c24034Oooo00O.f80942OooOo0o;
                                    }
                                }
                            } catch (Throwable th4) {
                                oooO00o3 = oooO00o;
                                th = th4;
                                oooO00o3.o00Oo0();
                                oooO00o3.o0OOO0o();
                                throw th;
                            }
                        }
                        z = false;
                        r9 = oooO00o2;
                        if (!z) {
                        }
                        return c24034Oooo00O.f80942OooOo0o;
                    }
                    oooO0o.f80544OooOooO = 2;
                    Object objInvoke6 = oooO00o2.invoke(c24000OooOO0o, oooO0o);
                    if (objInvoke6 != enumC32485OooO00o) {
                        return objInvoke6;
                    }
                }
                return enumC32485OooO00o;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            case 2:
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            case 3:
                c24034Oooo00O2 = oooO0o.f80541OooOoOO;
                oooO00o3 = oooO0o.f80539OooOoO;
                c24034Oooo00O3 = oooO0o.f80540OooOoO0;
                InterfaceC32508OooOOOo interfaceC32508OooOOOo = (InterfaceC32508OooOOOo) oooO0o.f80537OooOo;
                oooO00o4 = oooO0o.f80538OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    r5 = interfaceC32508OooOOOo;
                    r10 = obj;
                    c24034Oooo00O2.f80942OooOo0o = r10;
                    oooO00o3.o00Oo0();
                    oooO00o3.o0OOO0o();
                    c24034Oooo00O = c24034Oooo00O3;
                    r9 = r5;
                    oooO00o = oooO00o4;
                    if (!z) {
                    }
                    return c24034Oooo00O.f80942OooOo0o;
                } catch (Throwable th5) {
                    th = th5;
                    oooO00o3.o00Oo0();
                    oooO00o3.o0OOO0o();
                    throw th;
                }
            case 4:
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            case 5:
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            case 6:
                c24034Oooo00O4 = oooO0o.f80540OooOoO0;
                c24034Oooo00O5 = (C24034Oooo00O) oooO0o.f80537OooOo;
                oooO00o5 = oooO0o.f80538OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    r102 = obj;
                    c24034Oooo00O4.f80942OooOo0o = r102;
                    abstractC23996OooO0oO2 = (AbstractC23996OooO0oO) oooO00o5._state;
                    if (!abstractC23996OooO0oO2.OooO00o()) {
                        if (!(abstractC23996OooO0oO2 instanceof AbstractC23996OooO0oO.C23997OooO0Oo)) {
                            oooO00o5.o00Oo0();
                            oooO00o5.o0OOO0o();
                        }
                        return c24034Oooo00O.f80942OooOo0o;
                    }
                    c24034Oooo00O = c24034Oooo00O5;
                    return c24034Oooo00O.f80942OooOo0o;
                } catch (Throwable th6) {
                    th2 = th6;
                    abstractC23996OooO0oO = (AbstractC23996OooO0oO) oooO00o5._state;
                    if (!abstractC23996OooO0oO.OooO00o() && abstractC23996OooO0oO != AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                        if (!(abstractC23996OooO0oO instanceof AbstractC23996OooO0oO.C23997OooO0Oo) || (abstractC23996OooO0oO instanceof AbstractC23996OooO0oO.C23998OooO0o0)) {
                            oooO00o5.o00Oo0();
                        }
                        oooO00o5.o0OOO0o();
                    }
                    throw th2;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static int OoooOo0(OooO00o oooO00o, C32271OooO00o c32271OooO00o) throws Throwable {
        int iOooO0oo;
        boolean z;
        int i = c32271OooO00o.f115949OooO0o0 - c32271OooO00o.f115946OooO0OO;
        int i2 = 0;
        do {
            ByteBuffer byteBufferOo000o = oooO00o.oo000o();
            if (byteBufferOo000o == null) {
                z = false;
                iOooO0oo = 0;
            } else {
                OooO oooO = ((AbstractC23996OooO0oO) oooO00o._state).f80812OooO0O0;
                try {
                    if (oooO._availableForRead$internal == 0) {
                        oooO00o.o00Oo0();
                        oooO00o.o0OOO0o();
                        z = false;
                        iOooO0oo = 0;
                    } else {
                        int i3 = c32271OooO00o.f115949OooO0o0 - c32271OooO00o.f115946OooO0OO;
                        iOooO0oo = oooO.OooO0oo(Math.min(byteBufferOo000o.remaining(), Math.min(i3, i)));
                        if (iOooO0oo <= 0) {
                            z = false;
                        } else {
                            if (i3 < byteBufferOo000o.remaining()) {
                                byteBufferOo000o.limit(byteBufferOo000o.position() + i3);
                            }
                            C21286OooO0O0.OooO0oO(c32271OooO00o, byteBufferOo000o);
                            oooO00o.Oooo0O0(byteBufferOo000o, oooO, iOooO0oo);
                            z = true;
                        }
                    }
                } finally {
                    oooO00o.o00Oo0();
                    oooO00o.o0OOO0o();
                }
            }
            i2 += iOooO0oo;
            i -= iOooO0oo;
            if (!z || c32271OooO00o.f115949OooO0o0 <= c32271OooO00o.f115946OooO0OO) {
                break;
            }
        } while (((AbstractC23996OooO0oO) oooO00o._state).f80812OooO0O0._availableForRead$internal > 0);
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object Ooooooo(OooO00o oooO00o, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23955OooOOoo c23955OooOOoo;
        StringBuilder sb;
        if (abstractC32479OooO0OO instanceof C23955OooOOoo) {
            c23955OooOOoo = (C23955OooOOoo) abstractC32479OooO0OO;
            int i2 = c23955OooOOoo.f80612OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c23955OooOOoo.f80612OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c23955OooOOoo = new C23955OooOOoo(oooO00o, abstractC32479OooO0OO);
            }
        }
        Object obj = c23955OooOOoo.f80610OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c23955OooOOoo.f80612OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            StringBuilder sb2 = new StringBuilder();
            c23955OooOOoo.f80611OooOo0o = sb2;
            c23955OooOOoo.f80612OooOoO = 1;
            Object objOooO = oooO00o.OooO(sb2, i, c23955OooOOoo);
            if (objOooO == obj2) {
                return obj2;
            }
            obj = objOooO;
            sb = sb2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb = c23955OooOOoo.f80611OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return sb.toString();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        if (r8.o00000Oo(r9, r0) != r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c9 -> B:43:0x00cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object o000000O(OooO00o oooO00o, byte b, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOo oooOo;
        OooO oooO;
        ByteBuffer buffer;
        byte b2;
        int i;
        C23994OooO0Oo c23994OooO0Oo;
        Throwable th;
        OooO00o oooO00o2;
        C23994OooO0Oo c23994OooO0Oo2;
        OooO00o oooO00o3;
        byte b3;
        if (abstractC32479OooO0OO instanceof OooOo) {
            oooOo = (OooOo) abstractC32479OooO0OO;
            int i2 = oooOo.f80621OooOooO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOo.f80621OooOooO = i2 - Integer.MIN_VALUE;
            } else {
                oooOo = new OooOo(oooO00o, abstractC32479OooO0OO);
            }
        }
        Object obj = oooOo.f80620OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (oooOo.f80621OooOooO) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                C23994OooO0Oo c23994OooO0Oo3 = oooO00o.joining;
                if (c23994OooO0Oo3 != null) {
                    o00O0O(oooO00o, c23994OooO0Oo3);
                }
                ByteBuffer byteBufferO00oO0o = oooO00o.o00oO0o();
                if (byteBufferO00oO0o == null) {
                    C23994OooO0Oo c23994OooO0Oo4 = oooO00o.joining;
                    OooOOO0.OooO0Oo(c23994OooO0Oo4);
                    if (((AbstractC23996OooO0oO) oooO00o._state) == AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                        oooOo.f80621OooOooO = 2;
                        throw null;
                    }
                    c23994OooO0Oo = c23994OooO0Oo4;
                    while (((AbstractC23996OooO0oO) oooO00o._state) != AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                        oooOo.f80614OooOo = c23994OooO0Oo;
                        oooOo.f80617OooOoO0 = oooO00o;
                        oooOo.f80615OooOo0o = b;
                        oooOo.f80621OooOooO = 4;
                        if (oooO00o.o00000Oo(1, oooOo) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
                    c23994OooO0Oo.getClass();
                    oooOo.f80614OooOo = null;
                    oooOo.f80617OooOoO0 = null;
                    oooOo.f80621OooOooO = 3;
                    throw null;
                }
                OooO oooO2 = ((AbstractC23996OooO0oO) oooO00o._state).f80812OooO0O0;
                if (oooO2.OooOO0O(1)) {
                    oooO00o.OoooOO0(byteBufferO00oO0o, oooO00o.f80505OooO0o, 1);
                    if (byteBufferO00oO0o.remaining() < 1) {
                        byteBufferO00oO0o.limit(byteBufferO00oO0o.capacity());
                        byteBufferO00oO0o.put(b);
                        oooO00o.Oooo0o0(byteBufferO00oO0o);
                    } else {
                        byteBufferO00oO0o.put(b);
                    }
                    oooO00o.Oooo0OO(byteBufferO00oO0o, oooO2, 1);
                    if (oooO2.OooO0Oo() || oooO00o.f80502OooO0O0) {
                        oooO00o.OoooO00(1);
                    }
                    oooO00o.o00Ooo();
                    oooO00o.o0OOO0o();
                    return C32460OooOooO.f116667OooO00o;
                }
                oooO = oooO2;
                buffer = byteBufferO00oO0o;
                b2 = b;
                i = 1;
                try {
                    oooOo.f80614OooOo = oooO;
                    oooOo.f80617OooOoO0 = oooO00o;
                    oooOo.f80616OooOoO = buffer;
                    oooOo.f80615OooOo0o = b2;
                    oooOo.f80618OooOoOO = i;
                    oooOo.f80621OooOooO = 5;
                } catch (Throwable th2) {
                    oooO00o2 = oooO00o;
                    th = th2;
                    oooO00o2.o00Ooo();
                    oooO00o2.o0OOO0o();
                    throw th;
                }
                break;
                break;
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 4:
                byte b4 = oooOo.f80615OooOo0o;
                OooO00o oooO00o4 = oooOo.f80617OooOoO0;
                c23994OooO0Oo = (C23994OooO0Oo) oooOo.f80614OooOo;
                C32446OooOOOo.OooO0O0(obj);
                b = b4;
                oooO00o = oooO00o4;
                while (((AbstractC23996OooO0oO) oooO00o._state) != AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                }
                c23994OooO0Oo.getClass();
                oooOo.f80614OooOo = null;
                oooOo.f80617OooOoO0 = null;
                oooOo.f80621OooOooO = 3;
                throw null;
            case 5:
                int i3 = oooOo.f80618OooOoOO;
                byte b5 = oooOo.f80615OooOo0o;
                buffer = oooOo.f80616OooOoO;
                oooO00o2 = oooOo.f80617OooOoO0;
                oooO = (OooO) oooOo.f80614OooOo;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    b2 = b5;
                    i = i3;
                    oooO00o = oooO00o2;
                    if (oooO00o.joining != null) {
                        oooO00o.o00Ooo();
                        C23994OooO0Oo c23994OooO0Oo5 = oooO00o.joining;
                        OooOOO0.OooO0Oo(c23994OooO0Oo5);
                        if (((AbstractC23996OooO0oO) oooO00o._state) == AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                            oooOo.f80614OooOo = null;
                            oooOo.f80617OooOoO0 = null;
                            oooOo.f80616OooOoO = null;
                            oooOo.f80621OooOooO = 6;
                            throw null;
                        }
                        c23994OooO0Oo2 = c23994OooO0Oo5;
                        oooO00o3 = oooO00o;
                        b3 = b2;
                        while (((AbstractC23996OooO0oO) oooO00o3._state) != AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                            oooOo.f80614OooOo = c23994OooO0Oo2;
                            oooOo.f80617OooOoO0 = oooO00o3;
                            oooOo.f80616OooOoO = null;
                            oooOo.f80615OooOo0o = b3;
                            oooOo.f80621OooOooO = 8;
                            if (oooO00o3.o00000Oo(1, oooOo) == enumC32485OooO00o) {
                                return enumC32485OooO00o;
                            }
                        }
                        c23994OooO0Oo2.getClass();
                        oooOo.f80614OooOo = null;
                        oooOo.f80617OooOoO0 = null;
                        oooOo.f80616OooOoO = null;
                        oooOo.f80621OooOooO = 7;
                        throw null;
                    }
                    if (oooO.OooOO0O(i)) {
                        OooOOO0.OooO0oO(buffer, "buffer");
                        oooO00o.OoooOO0(buffer, oooO00o.f80505OooO0o, i);
                        if (buffer.remaining() < i) {
                            buffer.limit(buffer.capacity());
                            buffer.put(b2);
                            oooO00o.Oooo0o0(buffer);
                        } else {
                            buffer.put(b2);
                        }
                        oooO00o.Oooo0OO(buffer, oooO, i);
                        if (oooO.OooO0Oo() || oooO00o.f80502OooO0O0) {
                            oooO00o.OoooO00(1);
                        }
                        oooO00o.o00Ooo();
                        oooO00o.o0OOO0o();
                        return C32460OooOooO.f116667OooO00o;
                    }
                    oooOo.f80614OooOo = oooO;
                    oooOo.f80617OooOoO0 = oooO00o;
                    oooOo.f80616OooOoO = buffer;
                    oooOo.f80615OooOo0o = b2;
                    oooOo.f80618OooOoOO = i;
                    oooOo.f80621OooOooO = 5;
                } catch (Throwable th3) {
                    th = th3;
                    oooO00o2.o00Ooo();
                    oooO00o2.o0OOO0o();
                    throw th;
                }
                break;
            case 8:
                b3 = oooOo.f80615OooOo0o;
                oooO00o3 = oooOo.f80617OooOoO0;
                c23994OooO0Oo2 = (C23994OooO0Oo) oooOo.f80614OooOo;
                C32446OooOOOo.OooO0O0(obj);
                while (((AbstractC23996OooO0oO) oooO00o3._state) != AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                }
                c23994OooO0Oo2.getClass();
                oooOo.f80614OooOo = null;
                oooOo.f80617OooOoO0 = null;
                oooOo.f80616OooOoO = null;
                oooOo.f80621OooOooO = 7;
                throw null;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
    
        if (r8.o00000Oo(r2, r0) != r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c6 -> B:43:0x00c9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object o00000OO(OooO00o oooO00o, short s, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23962OooOoo c23962OooOoo;
        ByteBuffer buffer;
        int i;
        OooO oooO;
        C23994OooO0Oo c23994OooO0Oo;
        Throwable th;
        OooO00o oooO00o2;
        OooO00o oooO00o3;
        short s2;
        C23994OooO0Oo c23994OooO0Oo2;
        if (abstractC32479OooO0OO instanceof C23962OooOoo) {
            c23962OooOoo = (C23962OooOoo) abstractC32479OooO0OO;
            int i2 = c23962OooOoo.f80675OooOooO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c23962OooOoo.f80675OooOooO = i2 - Integer.MIN_VALUE;
            } else {
                c23962OooOoo = new C23962OooOoo(oooO00o, abstractC32479OooO0OO);
            }
        }
        Object obj = c23962OooOoo.f80674OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (c23962OooOoo.f80675OooOooO) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                C23994OooO0Oo c23994OooO0Oo3 = oooO00o.joining;
                if (c23994OooO0Oo3 != null) {
                    o00O0O(oooO00o, c23994OooO0Oo3);
                }
                buffer = oooO00o.o00oO0o();
                i = 2;
                if (buffer == null) {
                    C23994OooO0Oo c23994OooO0Oo4 = oooO00o.joining;
                    OooOOO0.OooO0Oo(c23994OooO0Oo4);
                    if (((AbstractC23996OooO0oO) oooO00o._state) == AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                        c23962OooOoo.f80675OooOooO = 2;
                        throw null;
                    }
                    c23994OooO0Oo = c23994OooO0Oo4;
                    while (((AbstractC23996OooO0oO) oooO00o._state) != AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                        c23962OooOoo.f80668OooOo = c23994OooO0Oo;
                        c23962OooOoo.f80671OooOoO0 = oooO00o;
                        c23962OooOoo.f80669OooOo0o = s;
                        c23962OooOoo.f80675OooOooO = 4;
                        if (oooO00o.o00000Oo(1, c23962OooOoo) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
                    c23994OooO0Oo.getClass();
                    c23962OooOoo.f80668OooOo = null;
                    c23962OooOoo.f80671OooOoO0 = null;
                    c23962OooOoo.f80675OooOooO = 3;
                    throw null;
                }
                OooO oooO2 = ((AbstractC23996OooO0oO) oooO00o._state).f80812OooO0O0;
                if (oooO2.OooOO0O(2)) {
                    oooO00o.OoooOO0(buffer, oooO00o.f80505OooO0o, 2);
                    if (buffer.remaining() < 2) {
                        buffer.limit(buffer.capacity());
                        buffer.putShort(s);
                        oooO00o.Oooo0o0(buffer);
                    } else {
                        buffer.putShort(s);
                    }
                    oooO00o.Oooo0OO(buffer, oooO2, 2);
                    if (oooO2.OooO0Oo() || oooO00o.f80502OooO0O0) {
                        oooO00o.OoooO00(1);
                    }
                    oooO00o.o00Ooo();
                    oooO00o.o0OOO0o();
                    return C32460OooOooO.f116667OooO00o;
                }
                oooO = oooO2;
                try {
                    c23962OooOoo.f80668OooOo = oooO;
                    c23962OooOoo.f80671OooOoO0 = oooO00o;
                    c23962OooOoo.f80670OooOoO = buffer;
                    c23962OooOoo.f80669OooOo0o = s;
                    c23962OooOoo.f80672OooOoOO = i;
                    c23962OooOoo.f80675OooOooO = 5;
                } catch (Throwable th2) {
                    oooO00o2 = oooO00o;
                    th = th2;
                    oooO00o2.o00Ooo();
                    oooO00o2.o0OOO0o();
                    throw th;
                }
                break;
                break;
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 4:
                short s3 = c23962OooOoo.f80669OooOo0o;
                OooO00o oooO00o4 = c23962OooOoo.f80671OooOoO0;
                c23994OooO0Oo = (C23994OooO0Oo) c23962OooOoo.f80668OooOo;
                C32446OooOOOo.OooO0O0(obj);
                s = s3;
                oooO00o = oooO00o4;
                while (((AbstractC23996OooO0oO) oooO00o._state) != AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                }
                c23994OooO0Oo.getClass();
                c23962OooOoo.f80668OooOo = null;
                c23962OooOoo.f80671OooOoO0 = null;
                c23962OooOoo.f80675OooOooO = 3;
                throw null;
            case 5:
                int i3 = c23962OooOoo.f80672OooOoOO;
                s = c23962OooOoo.f80669OooOo0o;
                ByteBuffer byteBuffer = c23962OooOoo.f80670OooOoO;
                oooO00o2 = c23962OooOoo.f80671OooOoO0;
                oooO = (OooO) c23962OooOoo.f80668OooOo;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    buffer = byteBuffer;
                    i = i3;
                    oooO00o = oooO00o2;
                    if (oooO00o.joining != null) {
                        oooO00o.o00Ooo();
                        C23994OooO0Oo c23994OooO0Oo5 = oooO00o.joining;
                        OooOOO0.OooO0Oo(c23994OooO0Oo5);
                        if (((AbstractC23996OooO0oO) oooO00o._state) == AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                            c23962OooOoo.f80668OooOo = null;
                            c23962OooOoo.f80671OooOoO0 = null;
                            c23962OooOoo.f80670OooOoO = null;
                            c23962OooOoo.f80675OooOooO = 6;
                            throw null;
                        }
                        short s4 = s;
                        oooO00o3 = oooO00o;
                        s2 = s4;
                        c23994OooO0Oo2 = c23994OooO0Oo5;
                        while (((AbstractC23996OooO0oO) oooO00o3._state) != AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                            c23962OooOoo.f80668OooOo = c23994OooO0Oo2;
                            c23962OooOoo.f80671OooOoO0 = oooO00o3;
                            c23962OooOoo.f80670OooOoO = null;
                            c23962OooOoo.f80669OooOo0o = s2;
                            c23962OooOoo.f80675OooOooO = 8;
                            if (oooO00o3.o00000Oo(1, c23962OooOoo) == enumC32485OooO00o) {
                                return enumC32485OooO00o;
                            }
                        }
                        c23994OooO0Oo2.getClass();
                        c23962OooOoo.f80668OooOo = null;
                        c23962OooOoo.f80671OooOoO0 = null;
                        c23962OooOoo.f80670OooOoO = null;
                        c23962OooOoo.f80675OooOooO = 7;
                        throw null;
                    }
                    if (oooO.OooOO0O(i)) {
                        OooOOO0.OooO0oO(buffer, "buffer");
                        oooO00o.OoooOO0(buffer, oooO00o.f80505OooO0o, i);
                        if (buffer.remaining() < i) {
                            buffer.limit(buffer.capacity());
                            buffer.putShort(s);
                            oooO00o.Oooo0o0(buffer);
                        } else {
                            buffer.putShort(s);
                        }
                        oooO00o.Oooo0OO(buffer, oooO, i);
                        if (oooO.OooO0Oo() || oooO00o.f80502OooO0O0) {
                            oooO00o.OoooO00(1);
                        }
                        oooO00o.o00Ooo();
                        oooO00o.o0OOO0o();
                        return C32460OooOooO.f116667OooO00o;
                    }
                    c23962OooOoo.f80668OooOo = oooO;
                    c23962OooOoo.f80671OooOoO0 = oooO00o;
                    c23962OooOoo.f80670OooOoO = buffer;
                    c23962OooOoo.f80669OooOo0o = s;
                    c23962OooOoo.f80672OooOoOO = i;
                    c23962OooOoo.f80675OooOooO = 5;
                } catch (Throwable th3) {
                    th = th3;
                    oooO00o2.o00Ooo();
                    oooO00o2.o0OOO0o();
                    throw th;
                }
                break;
            case 8:
                s2 = c23962OooOoo.f80669OooOo0o;
                oooO00o3 = c23962OooOoo.f80671OooOoO0;
                c23994OooO0Oo2 = (C23994OooO0Oo) c23962OooOoo.f80668OooOo;
                C32446OooOOOo.OooO0O0(obj);
                while (((AbstractC23996OooO0oO) oooO00o3._state) != AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                }
                c23994OooO0Oo2.getClass();
                c23962OooOoo.f80668OooOo = null;
                c23962OooOoo.f80671OooOoO0 = null;
                c23962OooOoo.f80670OooOoO = null;
                c23962OooOoo.f80675OooOooO = 7;
                throw null;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static void o00O0O(OooO00o oooO00o, C23994OooO0Oo c23994OooO0Oo) {
        if (((AbstractC23996OooO0oO) oooO00o._state) != AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
            return;
        }
        c23994OooO0Oo.getClass();
        throw null;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object oo0o0Oo(OooO00o oooO00o, int i, InterfaceC32507OooOO0o block, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23958OooOo0o c23958OooOo0o;
        int i2;
        int i3;
        int i4;
        if (abstractC32479OooO0OO instanceof C23958OooOo0o) {
            c23958OooOo0o = (C23958OooOo0o) abstractC32479OooO0OO;
            int i5 = c23958OooOo0o.f80650OooOoo0;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c23958OooOo0o.f80650OooOoo0 = i5 - Integer.MIN_VALUE;
            } else {
                c23958OooOo0o = new C23958OooOo0o(oooO00o, abstractC32479OooO0OO);
            }
        }
        Object obj = c23958OooOo0o.f80647OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i6 = c23958OooOo0o.f80650OooOoo0;
        if (i6 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (i <= 0) {
                throw new IllegalArgumentException("min should be positive");
            }
            if (i > 4088) {
                throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Min(", ") should'nt be greater than (4088)").toString());
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = c23958OooOo0o.f80648OooOoO0;
            InterfaceC32507OooOO0o interfaceC32507OooOO0o = c23958OooOo0o.f80645OooOo;
            OooO00o oooO00o2 = c23958OooOo0o.f80646OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            i = i7;
            oooO00o = oooO00o2;
            block = interfaceC32507OooOO0o;
        }
        do {
            oooO00o.getClass();
            OooOOO0.OooO0oO(block, "block");
            if (i <= 0) {
                throw new IllegalArgumentException("min should be positive");
            }
            if (i > 4088) {
                throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Min(", ") shouldn't be greater than 4088").toString());
            }
            C23994OooO0Oo c23994OooO0Oo = oooO00o.joining;
            if (c23994OooO0Oo != null) {
                o00O0O(oooO00o, c23994OooO0Oo);
            }
            ByteBuffer byteBufferO00oO0o = oooO00o.o00oO0o();
            int iPosition = 0;
            if (byteBufferO00oO0o == null) {
                i4 = 0;
            } else {
                OooO oooO = ((AbstractC23996OooO0oO) oooO00o._state).f80812OooO0O0;
                try {
                    io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) oooO00o._closed;
                    if (oooO0O0 != null) {
                        Oooo000.OooO00o(oooO0O0.OooO00o());
                        throw null;
                    }
                    while (true) {
                        i2 = oooO._availableForWrite$internal;
                        if (i2 < i) {
                            i2 = 0;
                            break;
                        }
                        if (OooO.f80793OooO0OO.compareAndSet(oooO, i2, 0)) {
                            break;
                        }
                    }
                    if (i2 <= 0) {
                        i3 = 0;
                    } else {
                        oooO00o.OoooOO0(byteBufferO00oO0o, oooO00o.f80505OooO0o, i2);
                        int iPosition2 = byteBufferO00oO0o.position();
                        int iLimit = byteBufferO00oO0o.limit();
                        block.invoke(byteBufferO00oO0o);
                        if (iLimit != byteBufferO00oO0o.limit()) {
                            throw new IllegalStateException("Buffer limit modified");
                        }
                        iPosition = byteBufferO00oO0o.position() - iPosition2;
                        if (iPosition < 0) {
                            throw new IllegalStateException("Position has been moved backward: pushback is not supported");
                        }
                        if (iPosition < 0) {
                            throw new IllegalStateException();
                        }
                        oooO00o.Oooo0OO(byteBufferO00oO0o, oooO, iPosition);
                        if (iPosition < i2) {
                            oooO.OooO00o(i2 - iPosition);
                        }
                        i3 = 1;
                    }
                    if (oooO.OooO0Oo() || oooO00o.f80502OooO0O0) {
                        oooO00o.OoooO00(1);
                    }
                    oooO00o.o00Ooo();
                    oooO00o.o0OOO0o();
                    int i8 = iPosition;
                    iPosition = i3;
                    i4 = i8;
                } catch (Throwable th) {
                    if (oooO.OooO0Oo() || oooO00o.f80502OooO0O0) {
                        oooO00o.OoooO00(1);
                    }
                    oooO00o.o00Ooo();
                    oooO00o.o0OOO0o();
                    throw th;
                }
            }
            if (iPosition == 0) {
                i4 = -1;
            }
            if (i4 >= 0) {
                return C32460OooOooO.f116667OooO00o;
            }
            c23958OooOo0o.f80646OooOo0o = oooO00o;
            c23958OooOo0o.f80645OooOo = block;
            c23958OooOo0o.f80648OooOoO0 = i;
            c23958OooOo0o.f80650OooOoo0 = 1;
        } while (oooO00o.Oooo0(i, block, c23958OooOo0o) != enumC32485OooO00o);
        return enumC32485OooO00o;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooO(Appendable appendable, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        if (((AbstractC23996OooO0oO) this._state) != AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
            return o0OoOo0(appendable, i, abstractC32479OooO0OO);
        }
        Throwable thOooO0O0 = OooO0O0();
        if (thOooO0O0 == null) {
            return Boolean.FALSE;
        }
        throw thOooO0O0;
    }

    @Override // io.ktor.utils.p616io.o0ooOOo
    public final ByteBuffer OooO00o(int i) {
        AbstractC23996OooO0oO abstractC23996OooO0oO = (AbstractC23996OooO0oO) this._state;
        int i2 = abstractC23996OooO0oO.f80812OooO0O0._availableForRead$internal;
        int i3 = this.f80506OooO0o0;
        if (i2 < i) {
            return null;
        }
        if (abstractC23996OooO0oO.OooO00o() || !((abstractC23996OooO0oO instanceof AbstractC23996OooO0oO.C23997OooO0Oo) || (abstractC23996OooO0oO instanceof AbstractC23996OooO0oO.C23998OooO0o0))) {
            if (oo000o() == null) {
                return null;
            }
            return OooO00o(i);
        }
        ByteBuffer byteBufferOooO0O0 = abstractC23996OooO0oO.OooO0O0();
        OoooOO0(byteBufferOooO0O0, Oooo0o(byteBufferOooO0O0, i3), i2);
        if (byteBufferOooO0O0.remaining() >= i) {
            return byteBufferOooO0O0;
        }
        return null;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o, io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final Throwable OooO0O0() {
        io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
        if (oooO0O0 != null) {
            return oooO0O0.f80802OooO00o;
        }
        return null;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final int OooO0OO() {
        return ((AbstractC23996OooO0oO) this._state).f80812OooO0O0._availableForRead$internal;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public boolean OooO0Oo(Throwable th) {
        C23994OooO0Oo c23994OooO0Oo;
        if (((io.ktor.utils.p616io.internal.OooO0O0) this._closed) == null) {
            io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = th == null ? io.ktor.utils.p616io.internal.OooO0O0.f80801OooO0O0 : new io.ktor.utils.p616io.internal.OooO0O0(th);
            ((AbstractC23996OooO0oO) this._state).f80812OooO0O0.OooO0OO();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80498OooOO0o;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, oooO0O0)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                }
            }
            ((AbstractC23996OooO0oO) this._state).f80812OooO0O0.OooO0OO();
            OooO oooO = ((AbstractC23996OooO0oO) this._state).f80812OooO0O0;
            if (oooO._availableForWrite$internal == oooO.f80795OooO00o || th != null) {
                o0OOO0o();
            }
            Continuation continuation = (Continuation) f80500OooOOO0.getAndSet(this, null);
            if (continuation != null) {
                if (th != null) {
                    continuation.resumeWith(C32446OooOOOo.OooO00o(th));
                } else {
                    continuation.resumeWith(Boolean.valueOf(((AbstractC23996OooO0oO) this._state).f80812OooO0O0._availableForRead$internal > 0));
                }
            }
            Continuation continuation2 = (Continuation) f80499OooOOO.getAndSet(this, null);
            if (continuation2 != null) {
                continuation2.resumeWith(C32446OooOOOo.OooO00o(th == null ? new o00Oo0("Byte channel was closed") : th));
            }
            if (((AbstractC23996OooO0oO) this._state) == AbstractC23996OooO0oO.OooO0o.f80822OooO0OO && (c23994OooO0Oo = this.joining) != null) {
                Oooo(c23994OooO0Oo);
            }
            if (th != null) {
                InterfaceC33672o00ooo interfaceC33672o00ooo = this.attachedJob;
                if (interfaceC33672o00ooo != null) {
                    interfaceC33672o00ooo.cancel((CancellationException) null);
                }
                this.f80508OooO0oo.OooO0OO(th);
                this.f80501OooO.OooO0OO(th);
                return true;
            }
            this.f80501OooO.OooO0OO(new o00Oo0("Byte channel was closed"));
            io.ktor.utils.p616io.internal.OooO00o<Boolean> oooO00o = this.f80508OooO0oo;
            Boolean boolValueOf = Boolean.valueOf(((AbstractC23996OooO0oO) this._state).f80812OooO0O0.OooO0OO());
            oooO00o.getClass();
            oooO00o.resumeWith(boolValueOf);
            OooO00o.C19594OooO00o c19594OooO00o = (OooO00o.C19594OooO00o) io.ktor.utils.p616io.internal.OooO00o.f80796OooOo.getAndSet(oooO00o, null);
            if (c19594OooO00o != null) {
                c19594OooO00o.OooO00o();
            }
            return true;
        }
        return false;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooO0o(byte[] bArr, int i, int i2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        int iOoooOOO = OoooOOO(i, i2, bArr);
        if (iOoooOOO == 0 && ((io.ktor.utils.p616io.internal.OooO0O0) this._closed) != null) {
            iOoooOOO = ((AbstractC23996OooO0oO) this._state).f80812OooO0O0.OooO0OO() ? OoooOOO(i, i2, bArr) : -1;
        } else if (iOoooOOO <= 0 && i2 != 0) {
            return Ooooo00(bArr, i, i2, abstractC32479OooO0OO);
        }
        return new Integer(iOoooOOO);
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final Object OooO0o0(byte b, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return o000000O(this, b, abstractC32479OooO0OO);
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooO0oO(ByteBuffer byteBuffer, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        int iOoooOOo = OoooOOo(byteBuffer);
        if (iOoooOOo == 0 && ((io.ktor.utils.p616io.internal.OooO0O0) this._closed) != null) {
            iOoooOOo = ((AbstractC23996OooO0oO) this._state).f80812OooO0O0.OooO0OO() ? OoooOOo(byteBuffer) : -1;
        } else if (iOoooOOo <= 0 && byteBuffer.hasRemaining()) {
            return OoooOoO(byteBuffer, abstractC32479OooO0OO);
        }
        return new Integer(iOoooOOo);
    }

    @Override // io.ktor.utils.p616io.o0ooOOo
    public final Object OooO0oo(int i, Continuation<? super Boolean> continuation) throws Throwable {
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "atLeast parameter shouldn't be negative: ").toString());
        }
        if (i > 4088) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "atLeast parameter shouldn't be larger than max buffer size of 4088: ").toString());
        }
        if (((AbstractC23996OooO0oO) this._state).f80812OooO0O0._availableForRead$internal < i) {
            return (((AbstractC23996OooO0oO) this._state).OooO00o() || (((AbstractC23996OooO0oO) this._state) instanceof AbstractC23996OooO0oO.C19595OooO0oO)) ? Oooo00o(i, (AbstractC32479OooO0OO) continuation) : i == 1 ? Oooooo(1, (AbstractC32479OooO0OO) continuation) : Oooooo0(i, (AbstractC32479OooO0OO) continuation);
        }
        if (((AbstractC23996OooO0oO) this._state).OooO00o() || (((AbstractC23996OooO0oO) this._state) instanceof AbstractC23996OooO0oO.C19595OooO0oO)) {
            oo000o();
        }
        return Boolean.TRUE;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final Object OooOO0(C32266OooO0Oo c32266OooO0Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23994OooO0Oo c23994OooO0Oo = this.joining;
        if (c23994OooO0Oo != null) {
            o00O0O(this, c23994OooO0Oo);
        }
        while (!c32266OooO0Oo.Oooo000() && o0Oo0oo(c32266OooO0Oo) != 0) {
            try {
            } catch (Throwable th) {
                c32266OooO0Oo.release();
                throw th;
            }
        }
        if (c32266OooO0Oo.Oooo0() <= 0) {
            return C32460OooOooO.f116667OooO00o;
        }
        C23994OooO0Oo c23994OooO0Oo2 = this.joining;
        if (c23994OooO0Oo2 != null) {
            o00O0O(this, c23994OooO0Oo2);
        }
        Object objO00000O = o00000O(c32266OooO0Oo, abstractC32479OooO0OO);
        return objO00000O == EnumC32485OooO00o.f116726OooOo0o ? objO00000O : C32460OooOooO.f116667OooO00o;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final Object OooOO0O(ByteBuffer byteBuffer, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        Object objO000000o;
        C23994OooO0Oo c23994OooO0Oo = this.joining;
        if (c23994OooO0Oo != null) {
            o00O0O(this, c23994OooO0Oo);
        }
        o000OOo(byteBuffer);
        return (byteBuffer.hasRemaining() && (objO000000o = o000000o(byteBuffer, abstractC32479OooO0OO)) == EnumC32485OooO00o.f116726OooOo0o) ? objO000000o : C32460OooOooO.f116667OooO00o;
    }

    @Override // io.ktor.utils.p616io.InterfaceC24008o0ooOO0
    public final oo0o0Oo OooOO0o() {
        return this.f80507OooO0oO;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooOOO(long j, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "max shouldn't be negative: ").toString());
        }
        ByteBuffer byteBufferOo000o = oo000o();
        if (byteBufferOo000o != null) {
            OooO oooO = ((AbstractC23996OooO0oO) this._state).f80812OooO0O0;
            try {
                if (oooO._availableForRead$internal != 0) {
                    int iOooO0oo = oooO.OooO0oo((int) Math.min(2147483647L, j));
                    Oooo0O0(byteBufferOo000o, oooO, iOooO0oo);
                    j2 = iOooO0oo;
                }
            } finally {
                o00Oo0();
                o0OOO0o();
            }
        }
        long j3 = j2;
        return (j3 == j || OooOoo()) ? new Long(j3) : Oooo0oo(j3, j, abstractC32479OooO0OO);
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final Object OooOOO0(byte[] bArr, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        Object objO00000O0;
        C23994OooO0Oo c23994OooO0Oo = this.joining;
        if (c23994OooO0Oo != null) {
            o00O0O(this, c23994OooO0Oo);
        }
        int i2 = 0;
        while (i > 0) {
            int iO0O0O00 = o0O0O00(i2, i, bArr);
            if (iO0O0O00 == 0) {
                break;
            }
            i2 += iO0O0O00;
            i -= iO0O0O00;
        }
        return (i != 0 && (objO00000O0 = o00000O0(bArr, i2, i, abstractC32479OooO0OO)) == EnumC32485OooO00o.f116726OooOo0o) ? objO00000O0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final Object OooOOOO(C32271OooO00o c32271OooO00o, Continuation continuation) throws Throwable {
        Object objO00000;
        o000000(c32271OooO00o);
        return (c32271OooO00o.f115946OooO0OO <= c32271OooO00o.f115945OooO0O0 || (objO00000 = o00000(c32271OooO00o, (AbstractC32479OooO0OO) continuation)) != EnumC32485OooO00o.f116726OooOo0o) ? C32460OooOooO.f116667OooO00o : objO00000;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooOOOo(C32271OooO00o c32271OooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        int iOoooOo0 = OoooOo0(this, c32271OooO00o);
        if (iOoooOo0 == 0 && ((io.ktor.utils.p616io.internal.OooO0O0) this._closed) != null) {
            iOoooOo0 = ((AbstractC23996OooO0oO) this._state).f80812OooO0O0.OooO0OO() ? OoooOo0(this, c32271OooO00o) : -1;
        } else if (iOoooOo0 <= 0 && c32271OooO00o.f115949OooO0o0 > c32271OooO00o.f115946OooO0OO) {
            return OoooOoo(c32271OooO00o, abstractC32479OooO0OO);
        }
        return new Integer(iOoooOo0);
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final boolean OooOOo() {
        return this.f80502OooO0O0;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final Object OooOOo0(ByteBuffer byteBuffer, int i, int i2, C32177OooO0o0 c32177OooO0o0) throws Throwable {
        ByteBuffer byteBuffer2 = C32250OooO0O0.f115830OooO00o;
        Object objOooOO0O = OooOO0O(C23988OooooOO.OooO0o(byteBuffer, i, i2 - i), c32177OooO0o0);
        return objOooOO0O == EnumC32485OooO00o.f116726OooOo0o ? objOooOO0O : C32460OooOooO.f116667OooO00o;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooOOoo(ByteBuffer byteBuffer, long j, long j2, long j3, Continuation continuation) {
        return OoooO(this, byteBuffer, j, j2, j3, (AbstractC32479OooO0OO) continuation);
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final Object OooOo(InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return oo0o0Oo(this, 1, interfaceC32507OooOO0o, abstractC32479OooO0OO);
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooOo0(int i, OooOO0O oooOO0O) throws Throwable {
        Throwable th;
        io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
        if (oooO0O0 != null && (th = oooO0O0.f80802OooO00o) != null) {
            Oooo000.OooO00o(th);
            throw null;
        }
        if (i == 0) {
            return C32266OooO0Oo.f115959OooOooO;
        }
        oO00Oo0.OooO0OO oooO0OO = new oO00Oo0.OooO0OO(null);
        ByteBuffer byteBufferO0000OoO = C23995OooO0o0.f80808OooO0O0.o0000OoO();
        while (i > 0) {
            try {
                byteBufferO0000OoO.clear();
                if (byteBufferO0000OoO.remaining() > i) {
                    byteBufferO0000OoO.limit(i);
                }
                int iOoooOOo = OoooOOo(byteBufferO0000OoO);
                if (iOoooOOo == 0) {
                    break;
                }
                byteBufferO0000OoO.flip();
                io.ktor.utils.p616io.internal.OooOOO0.OooO0OO(oooO0OO, byteBufferO0000OoO);
                i -= iOoooOOo;
            } catch (Throwable th2) {
                C23995OooO0o0.f80808OooO0O0.o00o0O(byteBufferO0000OoO);
                oooO0OO.close();
                throw th2;
            }
        }
        if (i != 0) {
            return OooooOO(i, oooO0OO, byteBufferO0000OoO, oooOO0O);
        }
        C23995OooO0o0.f80808OooO0O0.o00o0O(byteBufferO0000OoO);
        return oooO0OO.ooOO();
    }

    @Override // io.ktor.utils.p616io.o0ooOOo
    public final void OooOo00(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AbstractC23996OooO0oO abstractC23996OooO0oO = (AbstractC23996OooO0oO) this._state;
        if (!abstractC23996OooO0oO.f80812OooO0O0.OooO(i)) {
            throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Unable to consume ", " bytes: not enough available bytes"));
        }
        if (i > 0) {
            Oooo0O0(abstractC23996OooO0oO.OooO0O0(), abstractC23996OooO0oO.f80812OooO0O0, i);
        }
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooOo0O(long j, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        if (!OoooO0()) {
            return OooooOo(j, abstractC32479OooO0OO);
        }
        Throwable thOooO0O0 = OooO0O0();
        if (thOooO0O0 != null) {
            Oooo000.OooO00o(thOooO0O0);
            throw null;
        }
        oO00Oo0.OooO0OO oooO0OO = new oO00Oo0.OooO0OO(null);
        try {
            C32271OooO00o c32271OooO00oOooO0OO = C32273OooO0Oo.OooO0OO(oooO0OO, 1, null);
            while (true) {
                try {
                    if (c32271OooO00oOooO0OO.f115949OooO0o0 - c32271OooO00oOooO0OO.f115946OooO0OO > j) {
                        int i = c32271OooO00oOooO0OO.f115947OooO0Oo;
                        c32271OooO00oOooO0OO.f115945OooO0O0 = i;
                        c32271OooO00oOooO0OO.f115946OooO0OO = i;
                        c32271OooO00oOooO0OO.f115949OooO0o0 = (int) j;
                    }
                    j -= (long) OoooOo0(this, c32271OooO00oOooO0OO);
                    if (j <= 0 || OooOoo()) {
                        break;
                    }
                    c32271OooO00oOooO0OO = C32273OooO0Oo.OooO0OO(oooO0OO, 1, c32271OooO00oOooO0OO);
                } catch (Throwable th) {
                    oooO0OO.OooO00o();
                    throw th;
                }
            }
            oooO0OO.OooO00o();
            return oooO0OO.ooOO();
        } catch (Throwable th2) {
            oooO0OO.close();
            throw th2;
        }
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooOo0o(Continuation continuation) {
        return Ooooooo(this, Integer.MAX_VALUE, (AbstractC32479OooO0OO) continuation);
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final Object OooOoO(short s, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return o00000OO(this, s, abstractC32479OooO0OO);
    }

    @Override // io.ktor.utils.p616io.InterfaceC24008o0ooOO0
    public final void OooOoO0() {
        io.ktor.utils.p616io.internal.OooO0o oooO0o = this.f80507OooO0oO;
        oooO0o.getClass();
        oooO0o.OooO0O0(C32271OooO00o.f115978OooOOO0);
        AbstractC23996OooO0oO abstractC23996OooO0oO = (AbstractC23996OooO0oO) this._state;
        if ((abstractC23996OooO0oO instanceof AbstractC23996OooO0oO.C23997OooO0Oo) || (abstractC23996OooO0oO instanceof AbstractC23996OooO0oO.C23998OooO0o0)) {
            o00Oo0();
            o0OOO0o();
        }
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooOoOO(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        Object objOooooo0 = Oooooo0(1, abstractC32479OooO0OO);
        return objOooooo0 == EnumC32485OooO00o.f116726OooOo0o ? objOooooo0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final boolean OooOoo() {
        return ((AbstractC23996OooO0oO) this._state) == AbstractC23996OooO0oO.OooO0o.f80822OooO0OO && ((io.ktor.utils.p616io.internal.OooO0O0) this._closed) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Byte] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ae -> B:42:0x00b1). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoo0(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOOO0 oooOOO0;
        OooO00o oooO00o;
        int i;
        ByteBuffer byteBufferOo000o;
        int i2;
        if (abstractC32479OooO0OO instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) abstractC32479OooO0OO;
            int i3 = oooOOO0.f80585OooOoOO;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooOOO0.f80585OooOoOO = i3 - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooooo0 = oooOOO0.f80584OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = oooOOO0.f80585OooOoOO;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(objOooooo0);
            oooO00o = this;
            i = 1;
            C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
            byteBufferOo000o = oooO00o.oo000o();
            i2 = 0;
            if (byteBufferOo000o != null) {
            }
            if (i2 != 0) {
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = oooOOO0.f80581OooOo;
            oooO00o = oooOOO0.f80582OooOo0o;
            C32446OooOOOo.OooO0O0(objOooooo0);
            if (!((Boolean) objOooooo0).booleanValue()) {
                throw new C33707OooOOo0(o0Oo0oo.OooO0O0(i, "EOF while ", " bytes expected"));
            }
            C24034Oooo00O c24034Oooo00O2 = new C24034Oooo00O();
            byteBufferOo000o = oooO00o.oo000o();
            i2 = 0;
            if (byteBufferOo000o != null) {
                OooO oooO = ((AbstractC23996OooO0oO) oooO00o._state).f80812OooO0O0;
                try {
                    if (oooO._availableForRead$internal != 0 && oooO.OooO(i)) {
                        if (byteBufferOo000o.remaining() < i) {
                            int iRemaining = byteBufferOo000o.remaining();
                            byteBufferOo000o.limit(byteBufferOo000o.position() + i);
                            int i5 = i - iRemaining;
                            while (i2 < i5) {
                                byteBufferOo000o.put((byteBufferOo000o.capacity() - 8) + i2, byteBufferOo000o.get(i2));
                                i2++;
                            }
                        }
                        c24034Oooo00O2.f80942OooOo0o = Byte.valueOf(byteBufferOo000o.get());
                        oooO00o.Oooo0O0(byteBufferOo000o, oooO, i);
                        i2 = 1;
                    }
                } finally {
                    oooO00o.o00Oo0();
                    oooO00o.o0OOO0o();
                }
            }
            if (i2 != 0) {
                T t = c24034Oooo00O2.f80942OooOo0o;
                if (t != 0) {
                    return (Number) t;
                }
                OooOOO0.OooOOOO("result");
                throw null;
            }
            oooOOO0.f80582OooOo0o = oooO00o;
            oooOOO0.f80581OooOo = i;
            oooOOO0.f80585OooOoOO = 1;
            objOooooo0 = oooO00o.Oooooo0(i, oooOOO0);
            if (objOooooo0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            if (!((Boolean) objOooooo0).booleanValue()) {
            }
            C24034Oooo00O c24034Oooo00O22 = new C24034Oooo00O();
            byteBufferOo000o = oooO00o.oo000o();
            i2 = 0;
            if (byteBufferOo000o != null) {
            }
            if (i2 != 0) {
            }
        }
    }

    public final void Oooo(C23994OooO0Oo c23994OooO0Oo) {
        if (((io.ktor.utils.p616io.internal.OooO0O0) this._closed) == null) {
            return;
        }
        this.joining = null;
        c23994OooO0Oo.getClass();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0(int i, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0OO oooO0OO;
        OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof OooO0OO) {
            oooO0OO = (OooO0OO) abstractC32479OooO0OO;
            int i2 = oooO0OO.f80520OooOoOO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0OO.f80520OooOoOO = i2 - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooO0OO.f80519OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = oooO0OO.f80520OooOoOO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oooO0OO.f80517OooOo0o = this;
            oooO0OO.f80516OooOo = interfaceC32507OooOO0o;
            oooO0OO.f80520OooOoOO = 1;
            if (o00000Oo(i, oooO0OO) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooO00o = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            oooO00o = oooO0OO.f80517OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        C23994OooO0Oo c23994OooO0Oo = oooO00o.joining;
        if (c23994OooO0Oo != null) {
            o00O0O(oooO00o, c23994OooO0Oo);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public final void Oooo00O(InterfaceC33672o00ooo job) {
        OooOOO0.OooO0oO(job, "job");
        InterfaceC33672o00ooo interfaceC33672o00ooo = this.attachedJob;
        if (interfaceC33672o00ooo != null) {
            interfaceC33672o00ooo.cancel((CancellationException) null);
        }
        this.attachedJob = job;
        job.invokeOnCompletion(true, true, new C19592OooO00o());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo00o(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        io.ktor.utils.p616io.OooO0O0 oooO0O0;
        OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof io.ktor.utils.p616io.OooO0O0) {
            oooO0O0 = (io.ktor.utils.p616io.OooO0O0) abstractC32479OooO0OO;
            int i2 = oooO0O0.f80514OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0O0.f80514OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new io.ktor.utils.p616io.OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooooo0 = oooO0O0.f80512OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = oooO0O0.f80514OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooooo0);
            oooO0O0.f80513OooOo0o = this;
            oooO0O0.f80514OooOoO = 1;
            objOooooo0 = Oooooo0(i, oooO0O0);
            if (objOooooo0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooO00o = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO00o = oooO0O0.f80513OooOo0o;
            C32446OooOOOo.OooO0O0(objOooooo0);
        }
        Boolean bool = (Boolean) objOooooo0;
        if (bool.booleanValue() && ((AbstractC23996OooO0oO) oooO00o._state).OooO00o()) {
            oooO00o.oo000o();
        }
        return bool;
    }

    public final void Oooo0O0(ByteBuffer byteBuffer, OooO oooO, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f80506OooO0o0 = Oooo0o(byteBuffer, this.f80506OooO0o0 + i);
        oooO.OooO00o(i);
        this.totalBytesRead += (long) i;
        o00ooo();
    }

    public final void Oooo0OO(ByteBuffer byteBuffer, OooO oooO, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f80505OooO0o = Oooo0o(byteBuffer, this.f80505OooO0o + i);
        oooO.OooO0O0(i);
        this.totalBytesWritten += (long) i;
    }

    public final int Oooo0o(ByteBuffer byteBuffer, int i) {
        int iCapacity = byteBuffer.capacity();
        int i2 = this.f80504OooO0Oo;
        return i >= iCapacity - i2 ? i - (byteBuffer.capacity() - i2) : i;
    }

    public final void Oooo0o0(ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity() - this.f80504OooO0Oo;
        int iPosition = byteBuffer.position();
        for (int i = iCapacity; i < iPosition; i++) {
            byteBuffer.put(i - iCapacity, byteBuffer.get(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x034f, code lost:
    
        if (r14.o0OO00O(r6) == r3) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x00f7, code lost:
    
        r2 = r28;
        r28 = r29;
        r0 = r1;
        r4 = r17;
        r5 = r18;
        r17 = r19;
        r6 = r21;
        r7 = r22;
        r14 = r23;
     */
    /* JADX WARN: Path cross not found for [B:129:0x0280, B:131:0x0284], limit reached: 219 */
    /* JADX WARN: Path cross not found for [B:131:0x0284, B:129:0x0280], limit reached: 219 */
    /* JADX WARN: Path cross not found for [B:140:0x02af, B:147:0x02ca], limit reached: 219 */
    /* JADX WARN: Path cross not found for [B:147:0x02ca, B:140:0x02af], limit reached: 219 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280 A[Catch: all -> 0x0352, TryCatch #9 {all -> 0x0352, blocks: (B:127:0x027a, B:129:0x0280, B:135:0x028f, B:137:0x029f, B:133:0x028a), top: B:214:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028f A[Catch: all -> 0x0352, TryCatch #9 {all -> 0x0352, blocks: (B:127:0x027a, B:129:0x0280, B:135:0x028f, B:137:0x029f, B:133:0x028a), top: B:214:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02af A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #5 {all -> 0x0047, blocks: (B:14:0x0039, B:39:0x00c7, B:41:0x00cd, B:43:0x00d1, B:44:0x00d4, B:140:0x02af, B:143:0x02b7, B:145:0x02c3, B:147:0x02ca, B:149:0x02d0, B:151:0x02da, B:155:0x0306, B:158:0x0310, B:168:0x032b, B:170:0x032f, B:162:0x0319, B:47:0x00dc, B:180:0x0366, B:182:0x036c, B:186:0x0376, B:187:0x037e, B:188:0x0384, B:184:0x0370, B:190:0x0387, B:191:0x038b, B:21:0x005e), top: B:207:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d0 A[Catch: all -> 0x0047, TryCatch #5 {all -> 0x0047, blocks: (B:14:0x0039, B:39:0x00c7, B:41:0x00cd, B:43:0x00d1, B:44:0x00d4, B:140:0x02af, B:143:0x02b7, B:145:0x02c3, B:147:0x02ca, B:149:0x02d0, B:151:0x02da, B:155:0x0306, B:158:0x0310, B:168:0x032b, B:170:0x032f, B:162:0x0319, B:47:0x00dc, B:180:0x0366, B:182:0x036c, B:186:0x0376, B:187:0x037e, B:188:0x0384, B:184:0x0370, B:190:0x0387, B:191:0x038b, B:21:0x005e), top: B:207:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x032f A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #5 {all -> 0x0047, blocks: (B:14:0x0039, B:39:0x00c7, B:41:0x00cd, B:43:0x00d1, B:44:0x00d4, B:140:0x02af, B:143:0x02b7, B:145:0x02c3, B:147:0x02ca, B:149:0x02d0, B:151:0x02da, B:155:0x0306, B:158:0x0310, B:168:0x032b, B:170:0x032f, B:162:0x0319, B:47:0x00dc, B:180:0x0366, B:182:0x036c, B:186:0x0376, B:187:0x037e, B:188:0x0384, B:184:0x0370, B:190:0x0387, B:191:0x038b, B:21:0x005e), top: B:207:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x036c A[Catch: all -> 0x0047, TryCatch #5 {all -> 0x0047, blocks: (B:14:0x0039, B:39:0x00c7, B:41:0x00cd, B:43:0x00d1, B:44:0x00d4, B:140:0x02af, B:143:0x02b7, B:145:0x02c3, B:147:0x02ca, B:149:0x02d0, B:151:0x02da, B:155:0x0306, B:158:0x0310, B:168:0x032b, B:170:0x032f, B:162:0x0319, B:47:0x00dc, B:180:0x0366, B:182:0x036c, B:186:0x0376, B:187:0x037e, B:188:0x0384, B:184:0x0370, B:190:0x0387, B:191:0x038b, B:21:0x005e), top: B:207:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0370 A[Catch: all -> 0x0047, TryCatch #5 {all -> 0x0047, blocks: (B:14:0x0039, B:39:0x00c7, B:41:0x00cd, B:43:0x00d1, B:44:0x00d4, B:140:0x02af, B:143:0x02b7, B:145:0x02c3, B:147:0x02ca, B:149:0x02d0, B:151:0x02da, B:155:0x0306, B:158:0x0310, B:168:0x032b, B:170:0x032f, B:162:0x0319, B:47:0x00dc, B:180:0x0366, B:182:0x036c, B:186:0x0376, B:187:0x037e, B:188:0x0384, B:184:0x0370, B:190:0x0387, B:191:0x038b, B:21:0x005e), top: B:207:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0376 A[Catch: all -> 0x0047, TryCatch #5 {all -> 0x0047, blocks: (B:14:0x0039, B:39:0x00c7, B:41:0x00cd, B:43:0x00d1, B:44:0x00d4, B:140:0x02af, B:143:0x02b7, B:145:0x02c3, B:147:0x02ca, B:149:0x02d0, B:151:0x02da, B:155:0x0306, B:158:0x0310, B:168:0x032b, B:170:0x032f, B:162:0x0319, B:47:0x00dc, B:180:0x0366, B:182:0x036c, B:186:0x0376, B:187:0x037e, B:188:0x0384, B:184:0x0370, B:190:0x0387, B:191:0x038b, B:21:0x005e), top: B:207:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0387 A[Catch: all -> 0x0047, TryCatch #5 {all -> 0x0047, blocks: (B:14:0x0039, B:39:0x00c7, B:41:0x00cd, B:43:0x00d1, B:44:0x00d4, B:140:0x02af, B:143:0x02b7, B:145:0x02c3, B:147:0x02ca, B:149:0x02d0, B:151:0x02da, B:155:0x0306, B:158:0x0310, B:168:0x032b, B:170:0x032f, B:162:0x0319, B:47:0x00dc, B:180:0x0366, B:182:0x036c, B:186:0x0376, B:187:0x037e, B:188:0x0384, B:184:0x0370, B:190:0x0387, B:191:0x038b, B:21:0x005e), top: B:207:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd A[Catch: all -> 0x0047, TryCatch #5 {all -> 0x0047, blocks: (B:14:0x0039, B:39:0x00c7, B:41:0x00cd, B:43:0x00d1, B:44:0x00d4, B:140:0x02af, B:143:0x02b7, B:145:0x02c3, B:147:0x02ca, B:149:0x02d0, B:151:0x02da, B:155:0x0306, B:158:0x0310, B:168:0x032b, B:170:0x032f, B:162:0x0319, B:47:0x00dc, B:180:0x0366, B:182:0x036c, B:186:0x0376, B:187:0x037e, B:188:0x0384, B:184:0x0370, B:190:0x0387, B:191:0x038b, B:21:0x005e), top: B:207:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd A[Catch: all -> 0x0167, TryCatch #4 {all -> 0x0167, blocks: (B:51:0x00f7, B:53:0x00fd, B:55:0x0101), top: B:205:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #8 {all -> 0x014c, blocks: (B:61:0x013a, B:63:0x013e), top: B:212:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x02c3 -> B:146:0x02c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x032d -> B:146:0x02c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:171:0x034f -> B:146:0x02c6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0oO(OooO00o oooO00o, long j, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23947OooO0Oo c23947OooO0Oo;
        OooO00o oooO00o2;
        OooO00o oooO00o3;
        C23947OooO0Oo c23947OooO0Oo2;
        Oooo000 oooo000;
        C23994OooO0Oo c23994OooO0Oo;
        long j2;
        boolean z;
        OooO00o oooO00o4;
        OooO00o oooO00o5;
        long j3;
        OooO00o oooO00o6;
        OooO oooO;
        Throwable th;
        OooO00o oooO00o7;
        long j4;
        long j5;
        Oooo000 oooo0002;
        boolean z2;
        OooO00o oooO00o8;
        long j6;
        boolean z3;
        OooO oooO2;
        long j7;
        OooO00o oooO00o9;
        OooO00o oooO00o10;
        ByteBuffer byteBufferOo000o;
        C23947OooO0Oo c23947OooO0Oo3;
        long j8;
        OooO oooO3;
        OooO00o oooO00o11;
        OooO oooO4;
        OooO00o oooO00o12;
        int iOooOO0;
        int i;
        ByteBuffer byteBuffer;
        long j9;
        long j10;
        OooO00o oooO00o13;
        OooO00o oooO00o14;
        OooO00o oooO00o15;
        long j11;
        OooO00o oooO00o16;
        C23994OooO0Oo c23994OooO0Oo2;
        Oooo000 oooo0003;
        long j12;
        boolean z4;
        if (abstractC32479OooO0OO instanceof C23947OooO0Oo) {
            c23947OooO0Oo = (C23947OooO0Oo) abstractC32479OooO0OO;
            int i2 = c23947OooO0Oo.f80536Oooo0o0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c23947OooO0Oo.f80536Oooo0o0 = i2 - Integer.MIN_VALUE;
            } else {
                c23947OooO0Oo = new C23947OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c23947OooO0Oo.f80534Oooo0O0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c23947OooO0Oo.f80536Oooo0o0;
        try {
            if (i3 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (oooO00o.OooOoo()) {
                    if (oooO00o.OooO0O0() != null) {
                        OooO0Oo(oooO00o.OooO0O0());
                    }
                    return new Long(0L);
                }
                boolean z5 = this.f80502OooO0O0;
                try {
                    oooO00o3 = this;
                    c23947OooO0Oo2 = c23947OooO0Oo;
                    oooo000 = new Oooo000();
                    c23994OooO0Oo = null;
                    j2 = j;
                    z = z5;
                    oooO00o4 = oooO00o;
                    if (oooo000.f80941OooOo0o < j2) {
                    }
                    if (z) {
                    }
                    return new Long(oooo000.f80941OooOo0o);
                } catch (Throwable th2) {
                    th = th2;
                    oooO00o2 = this;
                    oooO00o2.OooO0Oo(th);
                    throw th;
                }
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    z4 = c23947OooO0Oo.f80530Oooo0;
                    j12 = c23947OooO0Oo.f80532Oooo00O;
                    oooo0003 = c23947OooO0Oo.f80523OooOoO;
                    c23994OooO0Oo2 = c23947OooO0Oo.f80524OooOoO0;
                    oooO00o16 = c23947OooO0Oo.f80521OooOo;
                    oooO00o3 = c23947OooO0Oo.f80522OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    if (((Boolean) obj).booleanValue()) {
                    }
                    if (oooo000.f80941OooOo0o < j2) {
                    }
                    if (z) {
                    }
                    return new Long(oooo000.f80941OooOo0o);
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z6 = c23947OooO0Oo.f80530Oooo0;
                long j13 = c23947OooO0Oo.f80532Oooo00O;
                Oooo000 oooo0004 = c23947OooO0Oo.f80523OooOoO;
                C23994OooO0Oo c23994OooO0Oo3 = c23947OooO0Oo.f80524OooOoO0;
                OooO00o oooO00o17 = c23947OooO0Oo.f80521OooOo;
                oooO00o3 = c23947OooO0Oo.f80522OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c23947OooO0Oo2 = c23947OooO0Oo;
                z = z6;
                j2 = j13;
                oooo000 = oooo0004;
                c23994OooO0Oo = c23994OooO0Oo3;
                oooO00o4 = oooO00o17;
                if (oooo000.f80941OooOo0o < j2) {
                    C23994OooO0Oo c23994OooO0Oo4 = oooO00o3.joining;
                    if (c23994OooO0Oo4 != null) {
                        o00O0O(oooO00o3, c23994OooO0Oo4);
                    }
                    ByteBuffer byteBufferO00oO0o = oooO00o3.o00oO0o();
                    if (byteBufferO00oO0o != null) {
                        OooO oooO5 = ((AbstractC23996OooO0oO) oooO00o3._state).f80812OooO0O0;
                        long j14 = oooO00o3.totalBytesWritten;
                        try {
                            io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) oooO00o3._closed;
                            if (oooO0O0 != null) {
                                Oooo000.OooO00o(oooO0O0.OooO00o());
                                throw null;
                            }
                            long j15 = j2;
                            oooO2 = oooO5;
                            long j16 = j14;
                            OooO00o oooO00o18 = oooO00o3;
                            OooO00o oooO00o19 = oooO00o18;
                            boolean z7 = z;
                            c23947OooO0Oo = c23947OooO0Oo2;
                            ByteBuffer byteBuffer2 = byteBufferO00oO0o;
                            oooO = oooO2;
                            oooo0002 = oooo000;
                            oooO00o6 = oooO00o19;
                            try {
                                if (oooo0002.f80941OooOo0o >= j15) {
                                    long j17 = j15;
                                    oooO00o5 = oooO00o18;
                                    j4 = j16;
                                    z2 = z7;
                                    j5 = j17;
                                    try {
                                        if (!oooO.OooO0Oo() || oooO00o6.f80502OooO0O0) {
                                            oooO00o6.OoooO00(1);
                                        }
                                        if (oooO00o6 != oooO00o3) {
                                            oooO00o8 = oooO00o4;
                                            oooO00o3.totalBytesWritten += oooO00o6.totalBytesWritten - j4;
                                        } else {
                                            oooO00o8 = oooO00o4;
                                        }
                                        oooO00o6.o00Ooo();
                                        oooO00o6.o0OOO0o();
                                        oooO00o4 = oooO00o8;
                                        c23947OooO0Oo2 = c23947OooO0Oo;
                                        z = z2;
                                        oooo000 = oooo0002;
                                        j2 = j5;
                                        oooO00o3 = oooO00o5;
                                        if (c23994OooO0Oo != null) {
                                        }
                                        if (oooo000.f80941OooOo0o < j2) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        oooO00o2 = oooO00o5;
                                        oooO00o2.OooO0Oo(th);
                                        throw th;
                                    }
                                } else {
                                    int i4 = oooO2._availableForWrite$internal;
                                    if (i4 == 0) {
                                        try {
                                            c23947OooO0Oo.f80522OooOo0o = oooO00o18;
                                            c23947OooO0Oo.f80521OooOo = oooO00o4;
                                            c23947OooO0Oo.f80524OooOoO0 = c23994OooO0Oo;
                                            c23947OooO0Oo.f80523OooOoO = oooo0002;
                                            c23947OooO0Oo.f80525OooOoOO = oooO00o3;
                                            c23947OooO0Oo.f80527OooOoo0 = oooO00o6;
                                            c23947OooO0Oo.f80526OooOoo = oooO;
                                            c23947OooO0Oo.f80528OooOooO = oooO2;
                                            c23947OooO0Oo.f80529OooOooo = byteBuffer2;
                                            c23947OooO0Oo.f80531Oooo000 = oooO00o19;
                                            long j18 = j15;
                                            c23947OooO0Oo.f80532Oooo00O = j18;
                                            c23947OooO0Oo.f80530Oooo0 = z7;
                                            c23947OooO0Oo.f80533Oooo00o = j11;
                                            c23947OooO0Oo.f80536Oooo0o0 = 1;
                                            if (oooO00o19.o0OO00O(c23947OooO0Oo) != enumC32485OooO00o) {
                                                try {
                                                    oooO00o14 = oooO00o19;
                                                    OooO00o oooO00o20 = oooO00o3;
                                                    byteBuffer = byteBuffer2;
                                                    j9 = j18;
                                                    j10 = j11;
                                                    oooO00o7 = oooO00o20;
                                                    oooO00o13 = oooO00o5;
                                                    if (oooO00o14.joining != null) {
                                                        try {
                                                            oooO00o19.OoooOO0(byteBuffer2, oooO00o19.f80505OooO0o, i4);
                                                            C24033OooOooo c24033OooOooo = new C24033OooOooo();
                                                            byteBufferOo000o = oooO00o9.oo000o();
                                                            if (byteBufferOo000o != null) {
                                                                c23947OooO0Oo3 = c23947OooO0Oo;
                                                                j8 = j7;
                                                            } else {
                                                                try {
                                                                    c23947OooO0Oo3 = c23947OooO0Oo;
                                                                    try {
                                                                        oooO4 = ((AbstractC23996OooO0oO) oooO00o9._state).f80812OooO0O0;
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        j8 = j7;
                                                                        oooO3 = oooO;
                                                                        oooO00o11 = oooO00o6;
                                                                        oooO00o10 = oooO00o3;
                                                                        j3 = j8;
                                                                        oooO = oooO3;
                                                                        oooO00o6 = oooO00o11;
                                                                        oooO00o7 = oooO00o10;
                                                                        if (oooO.OooO0Oo()) {
                                                                            oooO00o6.OoooO00(1);
                                                                        }
                                                                        if (oooO00o6 != oooO00o7) {
                                                                        }
                                                                        oooO00o6.o00Ooo();
                                                                        oooO00o6.o0OOO0o();
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    oooO3 = oooO;
                                                                }
                                                                j8 = j7;
                                                                if (oooO4._availableForRead$internal == 0) {
                                                                    try {
                                                                        oooO00o9.o00Oo0();
                                                                        oooO00o9.o0OOO0o();
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        j3 = j8;
                                                                        oooO00o7 = oooO00o3;
                                                                        if (oooO.OooO0Oo()) {
                                                                        }
                                                                        if (oooO00o6 != oooO00o7) {
                                                                        }
                                                                        oooO00o6.o00Ooo();
                                                                        oooO00o6.o0OOO0o();
                                                                        throw th;
                                                                    }
                                                                } else {
                                                                    try {
                                                                        try {
                                                                            iOooOO0 = oooO2.OooOO0((int) Math.min(byteBufferOo000o.remaining(), Math.min(byteBuffer2.remaining(), j6 - oooo0002.f80941OooOo0o)));
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                            oooO00o11 = oooO00o6;
                                                                            oooO00o10 = oooO00o3;
                                                                            oooO00o9.o00Oo0();
                                                                            oooO00o9.o0OOO0o();
                                                                            throw th;
                                                                        }
                                                                        oooO3 = oooO;
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                    }
                                                                    oooO00o11 = oooO00o6;
                                                                    oooO00o12 = oooO00o19;
                                                                    oooO00o10 = oooO00o3;
                                                                    if (iOooOO0 > 0) {
                                                                        if (!oooO4.OooO(iOooOO0)) {
                                                                            throw new AssertionError();
                                                                        }
                                                                        byteBufferOo000o.limit(byteBufferOo000o.position() + iOooOO0);
                                                                        byteBuffer2.put(byteBufferOo000o);
                                                                        c24033OooOooo.f80940OooOo0o = iOooOO0;
                                                                        oooO00o9.Oooo0O0(byteBufferOo000o, oooO4, iOooOO0);
                                                                        oooO00o9.o00Oo0();
                                                                        oooO00o9.o0OOO0o();
                                                                        throw th;
                                                                    }
                                                                    oooO00o9.o00Oo0();
                                                                    oooO00o9.o0OOO0o();
                                                                    i = c24033OooOooo.f80940OooOo0o;
                                                                    if (i <= 0) {
                                                                        c23947OooO0Oo = c23947OooO0Oo3;
                                                                        j4 = j8;
                                                                        oooO00o4 = oooO00o9;
                                                                        z2 = z3;
                                                                        j5 = j6;
                                                                        oooO = oooO3;
                                                                        oooO00o6 = oooO00o11;
                                                                        oooO00o3 = oooO00o10;
                                                                        if (!oooO.OooO0Oo()) {
                                                                        }
                                                                        oooO00o6.OoooO00(1);
                                                                        if (oooO00o6 != oooO00o3) {
                                                                        }
                                                                        oooO00o6.o00Ooo();
                                                                        oooO00o6.o0OOO0o();
                                                                        oooO00o4 = oooO00o8;
                                                                        c23947OooO0Oo2 = c23947OooO0Oo;
                                                                        z = z2;
                                                                        oooo000 = oooo0002;
                                                                        j2 = j5;
                                                                        oooO00o3 = oooO00o5;
                                                                        if (c23994OooO0Oo != null) {
                                                                        }
                                                                        if (oooo000.f80941OooOo0o < j2) {
                                                                        }
                                                                    } else {
                                                                        try {
                                                                            oooO00o19 = oooO00o12;
                                                                            oooO00o19.Oooo0OO(byteBuffer2, oooO2, i);
                                                                            long j19 = oooo0002.f80941OooOo0o;
                                                                            int i5 = c24033OooOooo.f80940OooOo0o;
                                                                            oooo0002.f80941OooOo0o = j19 + ((long) i5);
                                                                            if (i4 - i5 == 0 || z3) {
                                                                                oooO00o19.OoooO00(1);
                                                                                c23947OooO0Oo = c23947OooO0Oo3;
                                                                                j16 = j8;
                                                                                oooO00o4 = oooO00o9;
                                                                                oooO00o18 = oooO00o5;
                                                                                z7 = z3;
                                                                                j15 = j6;
                                                                                oooO = oooO3;
                                                                                oooO00o6 = oooO00o11;
                                                                                oooO00o3 = oooO00o10;
                                                                            } else {
                                                                                c23947OooO0Oo = c23947OooO0Oo3;
                                                                                j16 = j8;
                                                                                oooO00o4 = oooO00o9;
                                                                                oooO00o18 = oooO00o5;
                                                                                z7 = z3;
                                                                                j15 = j6;
                                                                                oooO = oooO3;
                                                                                oooO00o6 = oooO00o11;
                                                                                oooO00o3 = oooO00o10;
                                                                            }
                                                                            if (oooo0002.f80941OooOo0o >= j15) {
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            j3 = j8;
                                                                            oooO = oooO3;
                                                                            oooO00o6 = oooO00o11;
                                                                            oooO00o7 = oooO00o10;
                                                                            if (oooO.OooO0Oo()) {
                                                                            }
                                                                            if (oooO00o6 != oooO00o7) {
                                                                            }
                                                                            oooO00o6.o00Ooo();
                                                                            oooO00o6.o0OOO0o();
                                                                            throw th;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            oooO3 = oooO;
                                                            oooO00o11 = oooO00o6;
                                                            oooO00o12 = oooO00o19;
                                                            oooO00o10 = oooO00o3;
                                                            i = c24033OooOooo.f80940OooOo0o;
                                                            if (i <= 0) {
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                            oooO00o10 = oooO00o3;
                                                            j3 = j7;
                                                        }
                                                        oooO00o5 = oooO00o13;
                                                        j6 = j9;
                                                        byteBuffer2 = byteBuffer;
                                                        oooO00o19 = oooO00o14;
                                                        oooO00o3 = oooO00o7;
                                                        j7 = j10;
                                                        oooO00o9 = oooO00o15;
                                                        i4 = oooO2._availableForWrite$internal;
                                                    } else {
                                                        long j20 = j9;
                                                        j4 = j10;
                                                        j5 = j20;
                                                        oooO00o4 = oooO00o15;
                                                        oooO00o5 = oooO00o13;
                                                        oooO00o3 = oooO00o7;
                                                        z2 = z3;
                                                        if (!oooO.OooO0Oo()) {
                                                        }
                                                        oooO00o6.OoooO00(1);
                                                        if (oooO00o6 != oooO00o3) {
                                                        }
                                                        oooO00o6.o00Ooo();
                                                        oooO00o6.o0OOO0o();
                                                        oooO00o4 = oooO00o8;
                                                        c23947OooO0Oo2 = c23947OooO0Oo;
                                                        z = z2;
                                                        oooo000 = oooo0002;
                                                        j2 = j5;
                                                        oooO00o3 = oooO00o5;
                                                        if (c23994OooO0Oo != null) {
                                                        }
                                                        if (oooo000.f80941OooOo0o < j2) {
                                                        }
                                                    }
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    j3 = j10;
                                                }
                                                oooO00o15 = oooO00o4;
                                            }
                                            return enumC32485OooO00o;
                                        } catch (Throwable th12) {
                                            th = th12;
                                            j3 = j11;
                                            oooO00o7 = oooO00o3;
                                            if (oooO.OooO0Oo()) {
                                            }
                                            if (oooO00o6 != oooO00o7) {
                                            }
                                            oooO00o6.o00Ooo();
                                            oooO00o6.o0OOO0o();
                                            throw th;
                                        }
                                        oooO00o5 = oooO00o18;
                                        z3 = z7;
                                        j11 = j16;
                                    } else {
                                        j6 = j15;
                                        oooO00o5 = oooO00o18;
                                        z3 = z7;
                                        j7 = j16;
                                        oooO00o9 = oooO00o4;
                                        oooO00o19.OoooOO0(byteBuffer2, oooO00o19.f80505OooO0o, i4);
                                        C24033OooOooo c24033OooOooo2 = new C24033OooOooo();
                                        byteBufferOo000o = oooO00o9.oo000o();
                                        if (byteBufferOo000o != null) {
                                        }
                                        oooO3 = oooO;
                                        oooO00o11 = oooO00o6;
                                        oooO00o12 = oooO00o19;
                                        oooO00o10 = oooO00o3;
                                        i = c24033OooOooo2.f80940OooOo0o;
                                        if (i <= 0) {
                                        }
                                    }
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                oooO00o5 = oooO00o18;
                                j11 = j16;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            oooO = oooO5;
                            j3 = j14;
                            oooO00o7 = oooO00o3;
                            oooO00o6 = oooO00o7;
                        }
                        if (oooO.OooO0Oo() || oooO00o6.f80502OooO0O0) {
                            oooO00o6.OoooO00(1);
                        }
                        if (oooO00o6 != oooO00o7) {
                            oooO00o7.totalBytesWritten += oooO00o6.totalBytesWritten - j3;
                        }
                        oooO00o6.o00Ooo();
                        oooO00o6.o0OOO0o();
                        throw th;
                    }
                    if (c23994OooO0Oo != null) {
                        if (!oooO00o4.o0ooOOo(c23994OooO0Oo)) {
                            if (((AbstractC23996OooO0oO) oooO00o4._state).f80812OooO0O0.OooO0OO()) {
                                oooO00o4.o00ooo();
                                if (oooo000.f80941OooOo0o < j2) {
                                }
                            }
                        }
                    }
                    if (oooo000.f80941OooOo0o < j2) {
                        oooO00o3.OoooO00(1);
                        if (oooO00o4.OooO0OO() == 0) {
                            c23947OooO0Oo2.f80522OooOo0o = oooO00o3;
                            c23947OooO0Oo2.f80521OooOo = oooO00o4;
                            c23947OooO0Oo2.f80524OooOoO0 = c23994OooO0Oo;
                            c23947OooO0Oo2.f80523OooOoO = oooo000;
                            c23947OooO0Oo2.f80525OooOoOO = null;
                            c23947OooO0Oo2.f80527OooOoo0 = null;
                            c23947OooO0Oo2.f80526OooOoo = null;
                            c23947OooO0Oo2.f80528OooOooO = null;
                            c23947OooO0Oo2.f80529OooOooo = null;
                            c23947OooO0Oo2.f80531Oooo000 = null;
                            c23947OooO0Oo2.f80532Oooo00O = j2;
                            c23947OooO0Oo2.f80530Oooo0 = z;
                            c23947OooO0Oo2.f80536Oooo0o0 = 2;
                            Object objOooooo = oooO00o4.Oooooo(1, c23947OooO0Oo2);
                            if (objOooooo == enumC32485OooO00o) {
                                return enumC32485OooO00o;
                            }
                            oooO00o16 = oooO00o4;
                            oooo0003 = oooo000;
                            c23994OooO0Oo2 = c23994OooO0Oo;
                            obj = objOooooo;
                            j12 = j2;
                            z4 = z;
                            c23947OooO0Oo = c23947OooO0Oo2;
                            if (((Boolean) obj).booleanValue()) {
                                if (c23994OooO0Oo2 != null && oooO00o16.o0ooOOo(c23994OooO0Oo2)) {
                                    z = z4;
                                    oooo000 = oooo0003;
                                }
                                c23947OooO0Oo2 = c23947OooO0Oo;
                                z = z4;
                                j2 = j12;
                                oooo000 = oooo0003;
                                c23994OooO0Oo = c23994OooO0Oo2;
                                oooO00o4 = oooO00o16;
                                if (oooO00o3.joining != null) {
                                }
                            } else {
                                if (c23994OooO0Oo2 != null) {
                                    if (!oooO00o16.o0ooOOo(c23994OooO0Oo2)) {
                                    }
                                    c23947OooO0Oo2 = c23947OooO0Oo;
                                    z = z4;
                                    j2 = j12;
                                    oooo000 = oooo0003;
                                    c23994OooO0Oo = c23994OooO0Oo2;
                                    oooO00o4 = oooO00o16;
                                    if (oooO00o3.joining != null) {
                                        c23947OooO0Oo2.f80522OooOo0o = oooO00o3;
                                        c23947OooO0Oo2.f80521OooOo = oooO00o4;
                                        c23947OooO0Oo2.f80524OooOoO0 = c23994OooO0Oo;
                                        c23947OooO0Oo2.f80523OooOoO = oooo000;
                                        c23947OooO0Oo2.f80525OooOoOO = null;
                                        c23947OooO0Oo2.f80527OooOoo0 = null;
                                        c23947OooO0Oo2.f80526OooOoo = null;
                                        c23947OooO0Oo2.f80528OooOooO = null;
                                        c23947OooO0Oo2.f80529OooOooo = null;
                                        c23947OooO0Oo2.f80531Oooo000 = null;
                                        c23947OooO0Oo2.f80532Oooo00O = j2;
                                        c23947OooO0Oo2.f80530Oooo0 = z;
                                        c23947OooO0Oo2.f80536Oooo0o0 = 3;
                                    }
                                }
                                z = z4;
                                oooo000 = oooo0003;
                            }
                            if (oooo000.f80941OooOo0o < j2) {
                            }
                        } else {
                            if (oooO00o3.joining != null) {
                            }
                            if (oooo000.f80941OooOo0o < j2) {
                            }
                        }
                    }
                }
                if (z) {
                    oooO00o3.OoooO00(1);
                }
                return new Long(oooo000.f80941OooOo0o);
            }
            j3 = c23947OooO0Oo.f80533Oooo00o;
            boolean z8 = c23947OooO0Oo.f80530Oooo0;
            long j21 = c23947OooO0Oo.f80532Oooo00O;
            OooO00o oooO00o21 = c23947OooO0Oo.f80531Oooo000;
            byteBuffer = c23947OooO0Oo.f80529OooOooo;
            oooO2 = c23947OooO0Oo.f80528OooOooO;
            oooO = c23947OooO0Oo.f80526OooOoo;
            oooO00o6 = c23947OooO0Oo.f80527OooOoo0;
            oooO00o7 = c23947OooO0Oo.f80525OooOoOO;
            Oooo000 oooo0005 = c23947OooO0Oo.f80523OooOoO;
            C23994OooO0Oo c23994OooO0Oo5 = c23947OooO0Oo.f80524OooOoO0;
            oooO00o4 = c23947OooO0Oo.f80521OooOo;
            oooO00o13 = c23947OooO0Oo.f80522OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                z3 = z8;
                oooO00o14 = oooO00o21;
                j9 = j21;
                j10 = j3;
                oooo0002 = oooo0005;
                c23994OooO0Oo = c23994OooO0Oo5;
                oooO00o15 = oooO00o4;
                if (oooO00o14.joining != null) {
                }
            } catch (Throwable th15) {
                th = th15;
            }
        } catch (Throwable th16) {
            th = th16;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[PHI: r10 r12 r13
      PHI (r10v2 long) = (r10v1 long), (r10v5 long) binds: [B:14:0x0035, B:30:0x007a] A[DONT_GENERATE, DONT_INLINE]
      PHI (r12v2 kotlin.jvm.internal.Oooo000) = (r12v1 kotlin.jvm.internal.Oooo000), (r12v5 kotlin.jvm.internal.Oooo000) binds: [B:14:0x0035, B:30:0x007a] A[DONT_GENERATE, DONT_INLINE]
      PHI (r13v1 io.ktor.utils.io.OooO00o) = (r13v0 io.ktor.utils.io.OooO00o), (r13v2 io.ktor.utils.io.OooO00o) binds: [B:14:0x0035, B:30:0x007a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0071 -> B:29:0x0074). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0oo(long j, long j2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23948OooO0o0 c23948OooO0o0;
        long j3;
        Oooo000 oooo000;
        OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof C23948OooO0o0) {
            c23948OooO0o0 = (C23948OooO0o0) abstractC32479OooO0OO;
            int i = c23948OooO0o0.f80550OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23948OooO0o0.f80550OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c23948OooO0o0 = new C23948OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooooo0 = c23948OooO0o0.f80547OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23948OooO0o0.f80550OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooooo0);
            Oooo000 oooo0002 = new Oooo000();
            oooo0002.f80941OooOo0o = j;
            j3 = j2;
            oooo000 = oooo0002;
            oooO00o = this;
            while (oooo000.f80941OooOo0o < j3) {
            }
            return new Long(oooo000.f80941OooOo0o);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j3 = c23948OooO0o0.f80548OooOoO0;
        oooo000 = c23948OooO0o0.f80545OooOo;
        oooO00o = c23948OooO0o0.f80546OooOo0o;
        C32446OooOOOo.OooO0O0(objOooooo0);
        if (((Boolean) objOooooo0).booleanValue()) {
            while (oooo000.f80941OooOo0o < j3) {
                ByteBuffer byteBufferOo000o = oooO00o.oo000o();
                if (byteBufferOo000o != null) {
                    OooO oooO = ((AbstractC23996OooO0oO) oooO00o._state).f80812OooO0O0;
                    try {
                        if (oooO._availableForRead$internal != 0) {
                            int iOooO0oo = oooO.OooO0oo((int) Math.min(2147483647L, j3 - oooo000.f80941OooOo0o));
                            oooO00o.Oooo0O0(byteBufferOo000o, oooO, iOooO0oo);
                            oooo000.f80941OooOo0o += (long) iOooO0oo;
                        }
                    } finally {
                        oooO00o.o00Oo0();
                        oooO00o.o0OOO0o();
                    }
                }
                if (!oooO00o.OooOoo()) {
                    c23948OooO0o0.f80546OooOo0o = oooO00o;
                    c23948OooO0o0.f80545OooOo = oooo000;
                    c23948OooO0o0.f80548OooOoO0 = j3;
                    c23948OooO0o0.f80550OooOoo0 = 1;
                    objOooooo0 = oooO00o.Oooooo0(1, c23948OooO0o0);
                    if (objOooooo0 == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    if (((Boolean) objOooooo0).booleanValue()) {
                    }
                }
            }
        }
        return new Long(oooo000.f80941OooOo0o);
    }

    public final boolean OoooO0() {
        return ((io.ktor.utils.p616io.internal.OooO0O0) this._closed) != null;
    }

    public final void OoooO00(int i) {
        AbstractC23996OooO0oO abstractC23996OooO0oO;
        AbstractC23996OooO0oO.OooO0o oooO0o;
        do {
            abstractC23996OooO0oO = (AbstractC23996OooO0oO) this._state;
            oooO0o = AbstractC23996OooO0oO.OooO0o.f80822OooO0OO;
            if (abstractC23996OooO0oO == oooO0o) {
                return;
            } else {
                abstractC23996OooO0oO.f80812OooO0O0.OooO0OO();
            }
        } while (abstractC23996OooO0oO != ((AbstractC23996OooO0oO) this._state));
        int i2 = abstractC23996OooO0oO.f80812OooO0O0._availableForWrite$internal;
        if (abstractC23996OooO0oO.f80812OooO0O0._availableForRead$internal >= 1) {
            o00o0O();
        }
        C23994OooO0Oo c23994OooO0Oo = this.joining;
        if (i2 >= i) {
            if (c23994OooO0Oo == null || ((AbstractC23996OooO0oO) this._state) == oooO0o) {
                o00ooo();
            }
        }
    }

    public final void OoooOO0(ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iCapacity = byteBuffer.capacity() - this.f80504OooO0Oo;
        int i3 = i2 + i;
        if (i3 <= iCapacity) {
            iCapacity = i3;
        }
        byteBuffer.limit(iCapacity);
        byteBuffer.position(i);
    }

    public final int OoooOOO(int i, int i2, byte[] bArr) throws Throwable {
        ByteBuffer byteBufferOo000o = oo000o();
        int i3 = 0;
        if (byteBufferOo000o == null) {
            return 0;
        }
        OooO oooO = ((AbstractC23996OooO0oO) this._state).f80812OooO0O0;
        try {
            if (oooO._availableForRead$internal != 0) {
                int iCapacity = byteBufferOo000o.capacity() - this.f80504OooO0Oo;
                while (true) {
                    int i4 = i2 - i3;
                    if (i4 == 0) {
                        break;
                    }
                    int i5 = this.f80506OooO0o0;
                    int iOooO0oo = oooO.OooO0oo(Math.min(iCapacity - i5, i4));
                    if (iOooO0oo == 0) {
                        break;
                    }
                    byteBufferOo000o.limit(i5 + iOooO0oo);
                    byteBufferOo000o.position(i5);
                    byteBufferOo000o.get(bArr, i + i3, iOooO0oo);
                    Oooo0O0(byteBufferOo000o, oooO, iOooO0oo);
                    i3 += iOooO0oo;
                }
            }
            return i3;
        } finally {
            o00Oo0();
            o0OOO0o();
        }
    }

    public final int OoooOOo(ByteBuffer byteBuffer) throws Throwable {
        ByteBuffer byteBufferOo000o = oo000o();
        int i = 0;
        if (byteBufferOo000o == null) {
            return 0;
        }
        OooO oooO = ((AbstractC23996OooO0oO) this._state).f80812OooO0O0;
        try {
            if (oooO._availableForRead$internal != 0) {
                int iCapacity = byteBufferOo000o.capacity() - this.f80504OooO0Oo;
                while (true) {
                    int iRemaining = byteBuffer.remaining();
                    if (iRemaining == 0) {
                        break;
                    }
                    int i2 = this.f80506OooO0o0;
                    int iOooO0oo = oooO.OooO0oo(Math.min(iCapacity - i2, iRemaining));
                    if (iOooO0oo == 0) {
                        break;
                    }
                    byteBufferOo000o.limit(i2 + iOooO0oo);
                    byteBufferOo000o.position(i2);
                    byteBuffer.put(byteBufferOo000o);
                    Oooo0O0(byteBufferOo000o, oooO, iOooO0oo);
                    i += iOooO0oo;
                }
            }
            return i;
        } finally {
            o00Oo0();
            o0OOO0o();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooOoO(ByteBuffer byteBuffer, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOO0 oooOO02;
        OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof OooOO0) {
            oooOO02 = (OooOO0) abstractC32479OooO0OO;
            int i = oooOO02.f80563OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO02.f80563OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooOO02 = new OooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooooo0 = oooOO02.f80562OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOO02.f80563OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooooo0);
            oooOO02.f80560OooOo0o = this;
            oooOO02.f80559OooOo = byteBuffer;
            oooOO02.f80563OooOoOO = 1;
            objOooooo0 = Oooooo0(1, oooOO02);
            if (objOooooo0 != enumC32485OooO00o) {
                oooO00o = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooooo0);
            return objOooooo0;
        }
        byteBuffer = oooOO02.f80559OooOo;
        oooO00o = oooOO02.f80560OooOo0o;
        C32446OooOOOo.OooO0O0(objOooooo0);
        if (!((Boolean) objOooooo0).booleanValue()) {
            return new Integer(-1);
        }
        oooOO02.f80560OooOo0o = null;
        oooOO02.f80559OooOo = null;
        oooOO02.f80563OooOoOO = 2;
        Object objOooO0oO = oooO00o.OooO0oO(byteBuffer, oooOO02);
        return objOooO0oO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooOoo(C32271OooO00o c32271OooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOO0O oooOO0O;
        OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof OooOO0O) {
            oooOO0O = (OooOO0O) abstractC32479OooO0OO;
            int i = oooOO0O.f80568OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO0O.f80568OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooooo0 = oooOO0O.f80567OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOO0O.f80568OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooooo0);
            oooOO0O.f80565OooOo0o = this;
            oooOO0O.f80564OooOo = c32271OooO00o;
            oooOO0O.f80568OooOoOO = 1;
            objOooooo0 = Oooooo0(1, oooOO0O);
            if (objOooooo0 != enumC32485OooO00o) {
                oooO00o = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooooo0);
            return objOooooo0;
        }
        c32271OooO00o = oooOO0O.f80564OooOo;
        oooO00o = oooOO0O.f80565OooOo0o;
        C32446OooOOOo.OooO0O0(objOooooo0);
        if (!((Boolean) objOooooo0).booleanValue()) {
            return new Integer(-1);
        }
        oooOO0O.f80565OooOo0o = null;
        oooOO0O.f80564OooOo = null;
        oooOO0O.f80568OooOoOO = 2;
        Object objOooOOOo = oooO00o.OooOOOo(c32271OooO00o, oooOO0O);
        return objOooOOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOOo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Ooooo00(byte[] bArr, int i, int i2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooO oooO;
        OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof OooO) {
            oooO = (OooO) abstractC32479OooO0OO;
            int i3 = oooO.f80495OooOoo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooO.f80495OooOoo = i3 - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooooo0 = oooO.f80494OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = oooO.f80495OooOoo;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(objOooooo0);
            oooO.f80491OooOo0o = this;
            oooO.f80490OooOo = bArr;
            oooO.f80493OooOoO0 = i;
            oooO.f80492OooOoO = i2;
            oooO.f80495OooOoo = 1;
            objOooooo0 = Oooooo0(1, oooO);
            if (objOooooo0 != enumC32485OooO00o) {
                oooO00o = this;
            }
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooooo0);
            return objOooooo0;
        }
        i2 = oooO.f80492OooOoO;
        i = oooO.f80493OooOoO0;
        bArr = oooO.f80490OooOo;
        oooO00o = oooO.f80491OooOo0o;
        C32446OooOOOo.OooO0O0(objOooooo0);
        if (!((Boolean) objOooooo0).booleanValue()) {
            return new Integer(-1);
        }
        oooO.f80491OooOo0o = null;
        oooO.f80490OooOo = null;
        oooO.f80495OooOoo = 2;
        Object objOooO0o = oooO00o.OooO0o(bArr, i, i2, oooO);
        return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r2.o000oOoO(r6, r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Ooooo0o(int i, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23951OooOO0o c23951OooOO0o;
        OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof C23951OooOO0o) {
            c23951OooOO0o = (C23951OooOO0o) abstractC32479OooO0OO;
            int i2 = c23951OooOO0o.f80574OooOoo0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c23951OooOO0o.f80574OooOoo0 = i2 - Integer.MIN_VALUE;
            } else {
                c23951OooOO0o = new C23951OooOO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooooo0 = c23951OooOO0o.f80571OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c23951OooOO0o.f80574OooOoo0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooooo0);
            int i4 = i < 1 ? 1 : i;
            c23951OooOO0o.f80570OooOo0o = this;
            c23951OooOO0o.f80569OooOo = interfaceC32507OooOO0o;
            c23951OooOO0o.f80572OooOoO0 = i;
            c23951OooOO0o.f80574OooOoo0 = 1;
            objOooooo0 = Oooooo0(i4, c23951OooOO0o);
            if (objOooooo0 != enumC32485OooO00o) {
                oooO00o = this;
            }
            return enumC32485OooO00o;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooooo0);
            return C32460OooOooO.f116667OooO00o;
        }
        i = c23951OooOO0o.f80572OooOoO0;
        interfaceC32507OooOO0o = c23951OooOO0o.f80569OooOo;
        oooO00o = c23951OooOO0o.f80570OooOo0o;
        C32446OooOOOo.OooO0O0(objOooooo0);
        if (!((Boolean) objOooooo0).booleanValue()) {
            if (i <= 0) {
                return C32460OooOooO.f116667OooO00o;
            }
            throw new EOFException(o0Oo0oo.OooO0O0(i, "Got EOF but at least ", " bytes were expected"));
        }
        c23951OooOO0o.f80570OooOo0o = null;
        c23951OooOO0o.f80569OooOo = null;
        c23951OooOO0o.f80574OooOoo0 = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004e -> B:21:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooooO0(ByteBuffer byteBuffer, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOOO oooOOO;
        OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof OooOOO) {
            oooOOO = (OooOOO) abstractC32479OooO0OO;
            int i2 = oooOOO.f80580OooOoo0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOOO.f80580OooOoo0 = i2 - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooooo0 = oooOOO.f80577OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = oooOOO.f80580OooOoo0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooooo0);
            oooO00o = this;
            if (byteBuffer.hasRemaining()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = oooOOO.f80578OooOoO0;
            ByteBuffer byteBuffer2 = oooOOO.f80575OooOo;
            oooO00o = oooOOO.f80576OooOo0o;
            C32446OooOOOo.OooO0O0(objOooooo0);
            if (!((Boolean) objOooooo0).booleanValue()) {
                ByteBuffer byteBuffer3 = byteBuffer2;
                i = i4 + oooO00o.OoooOOo(byteBuffer2);
                byteBuffer = byteBuffer3;
                if (byteBuffer.hasRemaining()) {
                    return new Integer(i);
                }
                oooOOO.f80576OooOo0o = oooO00o;
                oooOOO.f80575OooOo = byteBuffer;
                oooOOO.f80578OooOoO0 = i;
                oooOOO.f80580OooOoo0 = 1;
                objOooooo0 = oooO00o.Oooooo0(1, oooOOO);
                if (objOooooo0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                int i5 = i;
                byteBuffer2 = byteBuffer;
                i4 = i5;
                if (!((Boolean) objOooooo0).booleanValue()) {
                    throw new C33707OooOOo0("Unexpected EOF: expected " + byteBuffer2.remaining() + " more bytes");
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0076, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[Catch: all -> 0x004f, TRY_ENTER, TryCatch #2 {all -> 0x004f, blocks: (B:31:0x0076, B:20:0x0042, B:22:0x004b, B:25:0x0054, B:27:0x0068, B:28:0x006f, B:32:0x0084), top: B:44:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:31:0x0076, B:20:0x0042, B:22:0x004b, B:25:0x0054, B:27:0x0068, B:28:0x006f, B:32:0x0084), top: B:44:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooooOO(int i, oO00Oo0.OooO0OO oooO0OO, ByteBuffer byteBuffer, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOOO oooOOOO;
        OooO00o oooO00o;
        Throwable th;
        if (abstractC32479OooO0OO instanceof OooOOOO) {
            oooOOOO = (OooOOOO) abstractC32479OooO0OO;
            int i2 = oooOOOO.f80591OooOoo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOOOO.f80591OooOoo = i2 - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooooO0 = oooOOOO.f80590OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = oooOOOO.f80591OooOoo;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooooO0);
            oooO00o = this;
            if (i > 0) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = oooOOOO.f80588OooOoO;
            ByteBuffer byteBuffer2 = oooOOOO.f80589OooOoO0;
            oO00Oo0.OooO0OO oooO0OO2 = oooOOOO.f80586OooOo;
            oooO00o = oooOOOO.f80587OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooooO0);
                byteBuffer = byteBuffer2;
                oooO0OO = oooO0OO2;
            } catch (Throwable th2) {
                th = th2;
                try {
                    oooO0OO2.close();
                    throw th;
                } finally {
                    C23995OooO0o0.f80808OooO0O0.o00o0O(byteBuffer2);
                }
            }
            try {
                int iIntValue = ((Number) objOooooO0).intValue();
                byteBuffer.flip();
                io.ktor.utils.p616io.internal.OooOOO0.OooO0OO(oooO0OO, byteBuffer);
                i -= iIntValue;
                if (i > 0) {
                    byteBuffer2.clear();
                    if (byteBuffer2.remaining() > i) {
                        byteBuffer2.limit(i);
                    }
                    oooOOOO.f80587OooOo0o = oooO00o;
                    oooOOOO.f80586OooOo = oooO0OO;
                    oooOOOO.f80589OooOoO0 = byteBuffer2;
                    oooOOOO.f80588OooOoO = i;
                    oooOOOO.f80591OooOoo = 1;
                    int iOoooOOo = oooO00o.OoooOOo(byteBuffer2);
                    if (byteBuffer2.hasRemaining()) {
                        objOooooO0 = oooO00o.OooooO0(byteBuffer2, iOoooOOo, oooOOOO);
                    } else {
                        objOooooO0 = new Integer(iOoooOOo);
                        if (objOooooO0 == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
                    int iIntValue2 = ((Number) objOooooO0).intValue();
                    byteBuffer.flip();
                    io.ktor.utils.p616io.internal.OooOOO0.OooO0OO(oooO0OO, byteBuffer);
                    i -= iIntValue2;
                    if (i > 0) {
                        return oooO0OO.ooOO();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                ByteBuffer byteBuffer3 = byteBuffer;
                oooO0OO2 = oooO0OO;
                byteBuffer2 = byteBuffer3;
                oooO0OO2.close();
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:31:0x0092, B:36:0x009f, B:21:0x0054, B:23:0x0060, B:24:0x0069, B:26:0x0079, B:28:0x007f), top: B:50:0x002d, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:31:0x0092, B:36:0x009f, B:21:0x0054, B:23:0x0060, B:24:0x0069, B:26:0x0079, B:28:0x007f), top: B:50:0x002d, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4 A[Catch: all -> 0x00b2, TRY_ENTER, TryCatch #1 {all -> 0x00b2, blocks: (B:38:0x00a4, B:40:0x00ad, B:44:0x00b5, B:45:0x00b6, B:46:0x00b9, B:12:0x002d, B:31:0x0092, B:36:0x009f, B:21:0x0054, B:23:0x0060, B:24:0x0069, B:26:0x0079, B:28:0x007f), top: B:50:0x002d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008f -> B:31:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009c -> B:35:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooooOo(long j, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23952OooOOOo c23952OooOOOo;
        oO00Oo0.OooO0OO oooO0OO;
        C32271OooO00o c32271OooO00oOooO0OO;
        OooO00o oooO00o;
        oO00Oo0.OooO0OO oooO0OO2;
        Oooo000 oooo000;
        oO00Oo0.OooO0OO oooO0OO3;
        long j2;
        long j3;
        long jOoooOo0;
        boolean z;
        if (abstractC32479OooO0OO instanceof C23952OooOOOo) {
            c23952OooOOOo = (C23952OooOOOo) abstractC32479OooO0OO;
            int i = c23952OooOOOo.f80600OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23952OooOOOo.f80600OooOooO = i - Integer.MIN_VALUE;
            } else {
                c23952OooOOOo = new C23952OooOOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooooo0 = c23952OooOOOo.f80599OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23952OooOOOo.f80600OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooooo0);
            oooO0OO = new oO00Oo0.OooO0OO(null);
            try {
                Oooo000 oooo0002 = new Oooo000();
                oooo0002.f80941OooOo0o = j;
                c32271OooO00oOooO0OO = C32273OooO0Oo.OooO0OO(oooO0OO, 1, null);
                oooO00o = this;
                oooO0OO2 = oooO0OO;
                oooo000 = oooo0002;
                oooO0OO3 = oooO0OO2;
                j2 = c32271OooO00oOooO0OO.f115949OooO0o0 - c32271OooO00oOooO0OO.f115946OooO0OO;
                j3 = oooo000.f80941OooOo0o;
                if (j2 > j3) {
                }
                jOoooOo0 = oooo000.f80941OooOo0o - ((long) OoooOo0(oooO00o, c32271OooO00oOooO0OO));
                oooo000.f80941OooOo0o = jOoooOo0;
                if (jOoooOo0 > 0) {
                    c23952OooOOOo.f80594OooOo0o = oooO00o;
                    c23952OooOOOo.f80593OooOo = oooO0OO3;
                    c23952OooOOOo.f80596OooOoO0 = oooo000;
                    c23952OooOOOo.f80595OooOoO = oooO0OO2;
                    c23952OooOOOo.f80597OooOoOO = c32271OooO00oOooO0OO;
                    c23952OooOOOo.f80600OooOooO = 1;
                    objOooooo0 = oooO00o.Oooooo0(1, c23952OooOOOo);
                    if (objOooooo0 == enumC32485OooO00o) {
                    }
                    if (((Boolean) objOooooo0).booleanValue()) {
                    }
                    if (z) {
                    }
                }
                if (z) {
                }
            } catch (Throwable th) {
                th = th;
                oooO0OO.close();
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c32271OooO00oOooO0OO = c23952OooOOOo.f80597OooOoOO;
            oooO0OO2 = c23952OooOOOo.f80595OooOoO;
            oooo000 = c23952OooOOOo.f80596OooOoO0;
            oooO0OO3 = c23952OooOOOo.f80593OooOo;
            oooO00o = c23952OooOOOo.f80594OooOo0o;
            try {
                try {
                    C32446OooOOOo.OooO0O0(objOooooo0);
                    z = ((Boolean) objOooooo0).booleanValue();
                    if (z) {
                        c32271OooO00oOooO0OO = C32273OooO0Oo.OooO0OO(oooO0OO2, 1, c32271OooO00oOooO0OO);
                        j2 = c32271OooO00oOooO0OO.f115949OooO0o0 - c32271OooO00oOooO0OO.f115946OooO0OO;
                        j3 = oooo000.f80941OooOo0o;
                        if (j2 > j3) {
                            int i3 = c32271OooO00oOooO0OO.f115947OooO0Oo;
                            c32271OooO00oOooO0OO.f115945OooO0O0 = i3;
                            c32271OooO00oOooO0OO.f115946OooO0OO = i3;
                            c32271OooO00oOooO0OO.f115949OooO0o0 = (int) j3;
                        }
                        jOoooOo0 = oooo000.f80941OooOo0o - ((long) OoooOo0(oooO00o, c32271OooO00oOooO0OO));
                        oooo000.f80941OooOo0o = jOoooOo0;
                        if (jOoooOo0 > 0 && !oooO00o.OooOoo()) {
                            c23952OooOOOo.f80594OooOo0o = oooO00o;
                            c23952OooOOOo.f80593OooOo = oooO0OO3;
                            c23952OooOOOo.f80596OooOoO0 = oooo000;
                            c23952OooOOOo.f80595OooOoO = oooO0OO2;
                            c23952OooOOOo.f80597OooOoOO = c32271OooO00oOooO0OO;
                            c23952OooOOOo.f80600OooOooO = 1;
                            objOooooo0 = oooO00o.Oooooo0(1, c23952OooOOOo);
                            if (objOooooo0 == enumC32485OooO00o) {
                                return enumC32485OooO00o;
                            }
                            if (((Boolean) objOooooo0).booleanValue()) {
                            }
                            if (z) {
                                oooO0OO2.OooO00o();
                                Throwable thOooO0O0 = oooO00o.OooO0O0();
                                if (thOooO0O0 == null) {
                                    return oooO0OO3.ooOO();
                                }
                                throw thOooO0O0;
                            }
                        }
                        if (z) {
                        }
                    }
                } catch (Throwable th2) {
                    oooO0OO2.OooO00o();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                oooO0OO = oooO0OO3;
                oooO0OO.close();
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooooo(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23954OooOOo0 c23954OooOOo0;
        OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof C23954OooOOo0) {
            c23954OooOOo0 = (C23954OooOOo0) abstractC32479OooO0OO;
            int i2 = c23954OooOOo0.f80608OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c23954OooOOo0.f80608OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c23954OooOOo0 = new C23954OooOOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c23954OooOOo0.f80606OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c23954OooOOo0.f80608OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC23996OooO0oO abstractC23996OooO0oO = (AbstractC23996OooO0oO) this._state;
            if (abstractC23996OooO0oO.f80812OooO0O0._availableForRead$internal >= i || !(this.joining == null || ((Continuation) this._writeOp) == null || (abstractC23996OooO0oO != AbstractC23996OooO0oO.OooO00o.f80813OooO0OO && !(abstractC23996OooO0oO instanceof AbstractC23996OooO0oO.OooO0O0)))) {
                return Boolean.TRUE;
            }
            try {
                c23954OooOOo0.f80607OooOo0o = this;
                c23954OooOOo0.f80608OooOoO = 1;
                io.ktor.utils.p616io.internal.OooO00o<Boolean> oooO00o2 = this.f80508OooO0oo;
                o0ooOO0(i, oooO00o2);
                Object objOooO0Oo = oooO00o2.OooO0Oo(C21904OooOoo0.OooO0o0(c23954OooOOo0));
                return objOooO0Oo == enumC32485OooO00o ? enumC32485OooO00o : objOooO0Oo;
            } catch (Throwable th) {
                th = th;
                oooO00o = this;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO00o = c23954OooOOo0.f80607OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        oooO00o._readOp = null;
        throw th;
    }

    public final Object Oooooo0(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        if (((AbstractC23996OooO0oO) this._state).f80812OooO0O0._availableForRead$internal >= i) {
            return Boolean.TRUE;
        }
        io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
        if (oooO0O0 == null) {
            return i == 1 ? Oooooo(1, abstractC32479OooO0OO) : OoooooO(i, abstractC32479OooO0OO);
        }
        Throwable th = oooO0O0.f80802OooO00o;
        if (th != null) {
            Oooo000.OooO00o(th);
            throw null;
        }
        OooO oooO = ((AbstractC23996OooO0oO) this._state).f80812OooO0O0;
        boolean z = oooO.OooO0OO() && oooO._availableForRead$internal >= i;
        if (((Continuation) this._readOp) == null) {
            return Boolean.valueOf(z);
        }
        throw new IllegalStateException("Read operation is already in progress");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0082 -> B:40:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooooO(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23953OooOOo c23953OooOOo;
        OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof C23953OooOOo) {
            c23953OooOOo = (C23953OooOOo) abstractC32479OooO0OO;
            int i2 = c23953OooOOo.f80605OooOoOO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c23953OooOOo.f80605OooOoOO = i2 - Integer.MIN_VALUE;
            } else {
                c23953OooOOo = new C23953OooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooooo = c23953OooOOo.f80604OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c23953OooOOo.f80605OooOoOO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooooo);
            oooO00o = this;
            if (((AbstractC23996OooO0oO) oooO00o._state).f80812OooO0O0._availableForRead$internal >= i) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c23953OooOOo.f80601OooOo;
            oooO00o = c23953OooOOo.f80602OooOo0o;
            C32446OooOOOo.OooO0O0(objOooooo);
            if (!((Boolean) objOooooo).booleanValue()) {
                return Boolean.FALSE;
            }
            if (((AbstractC23996OooO0oO) oooO00o._state).f80812OooO0O0._availableForRead$internal >= i) {
                io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) oooO00o._closed;
                if (oooO0O0 != null) {
                    Throwable th = oooO0O0.f80802OooO00o;
                    if (th != null) {
                        Oooo000.OooO00o(th);
                        throw null;
                    }
                    OooO oooO = ((AbstractC23996OooO0oO) oooO00o._state).f80812OooO0O0;
                    boolean z = oooO.OooO0OO() && oooO._availableForRead$internal >= i;
                    if (((Continuation) oooO00o._readOp) == null) {
                        return Boolean.valueOf(z);
                    }
                    throw new IllegalStateException("Read operation is already in progress");
                }
                c23953OooOOo.f80602OooOo0o = oooO00o;
                c23953OooOOo.f80601OooOo = i;
                c23953OooOOo.f80605OooOoOO = 1;
                objOooooo = oooO00o.Oooooo(i, c23953OooOOo);
                if (objOooooo == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                if (!((Boolean) objOooooo).booleanValue()) {
                }
                if (((AbstractC23996OooO0oO) oooO00o._state).f80812OooO0O0._availableForRead$internal >= i) {
                    return Boolean.TRUE;
                }
            }
        }
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final boolean cancel(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel has been cancelled");
        }
        return OooO0Oo(th);
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final void flush() {
        OoooO00(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0050 -> B:24:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000(C32271OooO00o c32271OooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23959OooOoO c23959OooOoO;
        OooO00o oooO00o;
        oO00Oo0.OooO00o oooO00o2;
        if (abstractC32479OooO0OO instanceof C23959OooOoO) {
            c23959OooOoO = (C23959OooOoO) abstractC32479OooO0OO;
            int i = c23959OooOoO.f80655OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23959OooOoO.f80655OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c23959OooOoO = new C23959OooOoO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c23959OooOoO.f80654OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23959OooOoO.f80655OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oooO00o = this;
            oooO00o2 = c32271OooO00o;
            if (oooO00o2.f115946OooO0OO > oooO00o2.f115945OooO0O0) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            oO00Oo0.OooO00o oooO00o3 = c23959OooOoO.f80651OooOo;
            OooO00o oooO00o4 = c23959OooOoO.f80652OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            OooO00o oooO00o5 = oooO00o4;
            oO00Oo0.OooO00o oooO00o6 = oooO00o3;
            C23994OooO0Oo c23994OooO0Oo = oooO00o5.joining;
            if (c23994OooO0Oo != null) {
                o00O0O(oooO00o5, c23994OooO0Oo);
            }
            oooO00o5.o000000(oooO00o6);
            oooO00o = oooO00o5;
            oooO00o2 = oooO00o6;
            if (oooO00o2.f115946OooO0OO > oooO00o2.f115945OooO0O0) {
                c23959OooOoO.f80652OooOo0o = oooO00o;
                c23959OooOoO.f80651OooOo = oooO00o2;
                c23959OooOoO.f80655OooOoOO = 1;
                Object objO0OO00O = oooO00o.o0OO00O(c23959OooOoO);
                oooO00o5 = oooO00o;
                oooO00o6 = oooO00o2;
                if (objO0OO00O == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                C23994OooO0Oo c23994OooO0Oo2 = oooO00o5.joining;
                if (c23994OooO0Oo2 != null) {
                }
                oooO00o5.o000000(oooO00o6);
                oooO00o = oooO00o5;
                oooO00o2 = oooO00o6;
                if (oooO00o2.f115946OooO0OO > oooO00o2.f115945OooO0O0) {
                    return C32460OooOooO.f116667OooO00o;
                }
            }
        }
    }

    public final void o000000(oO00Oo0.OooO00o oooO00o) throws Throwable {
        C23994OooO0Oo c23994OooO0Oo = this.joining;
        if (c23994OooO0Oo != null) {
            o00O0O(this, c23994OooO0Oo);
        }
        ByteBuffer byteBufferO00oO0o = o00oO0o();
        if (byteBufferO00oO0o == null) {
            return;
        }
        OooO oooO = ((AbstractC23996OooO0oO) this._state).f80812OooO0O0;
        try {
            io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
            if (oooO0O0 != null) {
                Oooo000.OooO00o(oooO0O0.OooO00o());
                throw null;
            }
            int i = 0;
            while (true) {
                int iOooOO0 = oooO.OooOO0(Math.min(oooO00o.f115946OooO0OO - oooO00o.f115945OooO0O0, byteBufferO00oO0o.remaining()));
                if (iOooOO0 == 0) {
                    break;
                }
                o00O0O.OooO0OO.OooO0O0(oooO00o, byteBufferO00oO0o, iOooOO0);
                i += iOooOO0;
                OoooOO0(byteBufferO00oO0o, Oooo0o(byteBufferO00oO0o, this.f80505OooO0o + i), oooO._availableForWrite$internal);
            }
            Oooo0OO(byteBufferO00oO0o, oooO, i);
            if (oooO.OooO0Oo() || this.f80502OooO0O0) {
                OoooO00(1);
            }
            o00Ooo();
            o0OOO0o();
        } catch (Throwable th) {
            if (oooO.OooO0Oo() || this.f80502OooO0O0) {
                OoooO00(1);
            }
            o00Ooo();
            o0OOO0o();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0050 -> B:24:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o000000o(ByteBuffer byteBuffer, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23960OooOoO0 c23960OooOoO0;
        OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof C23960OooOoO0) {
            c23960OooOoO0 = (C23960OooOoO0) abstractC32479OooO0OO;
            int i = c23960OooOoO0.f80660OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23960OooOoO0.f80660OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c23960OooOoO0 = new C23960OooOoO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c23960OooOoO0.f80659OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23960OooOoO0.f80660OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oooO00o = this;
            if (byteBuffer.hasRemaining()) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            byteBuffer = c23960OooOoO0.f80656OooOo;
            oooO00o = c23960OooOoO0.f80657OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C23994OooO0Oo c23994OooO0Oo = oooO00o.joining;
            if (c23994OooO0Oo != null) {
                o00O0O(oooO00o, c23994OooO0Oo);
            }
            oooO00o.o000OOo(byteBuffer);
            if (byteBuffer.hasRemaining()) {
                c23960OooOoO0.f80657OooOo0o = oooO00o;
                c23960OooOoO0.f80656OooOo = byteBuffer;
                c23960OooOoO0.f80660OooOoOO = 1;
                if (oooO00o.o0OO00O(c23960OooOoO0) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                C23994OooO0Oo c23994OooO0Oo2 = oooO00o.joining;
                if (c23994OooO0Oo2 != null) {
                }
                oooO00o.o000OOo(byteBuffer);
                if (byteBuffer.hasRemaining()) {
                    return C32460OooOooO.f116667OooO00o;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:14:0x002a, B:22:0x0041, B:30:0x005c, B:32:0x0060, B:33:0x0063, B:25:0x0049, B:27:0x004f), top: B:39:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:14:0x002a, B:22:0x0041, B:30:0x005c, B:32:0x0060, B:33:0x0063, B:25:0x0049, B:27:0x004f), top: B:39:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0059 -> B:30:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000O(C32266OooO0Oo c32266OooO0Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23963OooOoo0 c23963OooOoo0;
        OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof C23963OooOoo0) {
            c23963OooOoo0 = (C23963OooOoo0) abstractC32479OooO0OO;
            int i = c23963OooOoo0.f80680OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23963OooOoo0.f80680OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c23963OooOoo0 = new C23963OooOoo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c23963OooOoo0.f80679OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23963OooOoo0.f80680OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                oooO00o = this;
                if (!c32266OooO0Oo.Oooo000()) {
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32266OooO0Oo c32266OooO0Oo2 = (C32266OooO0Oo) c23963OooOoo0.f80677OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    c32266OooO0Oo2.release();
                    return c32460OooOooO;
                }
                c32266OooO0Oo = c23963OooOoo0.f80676OooOo;
                oooO00o = c23963OooOoo0.f80677OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C23994OooO0Oo c23994OooO0Oo = oooO00o.joining;
                if (c23994OooO0Oo != null) {
                    o00O0O(oooO00o, c23994OooO0Oo);
                }
                oooO00o.o0Oo0oo(c32266OooO0Oo);
                if (!c32266OooO0Oo.Oooo000()) {
                    c23963OooOoo0.f80677OooOo0o = oooO00o;
                    c23963OooOoo0.f80676OooOo = c32266OooO0Oo;
                    c23963OooOoo0.f80680OooOoOO = 1;
                    if (oooO00o.o00000Oo(1, c23963OooOoo0) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    C23994OooO0Oo c23994OooO0Oo2 = oooO00o.joining;
                    if (c23994OooO0Oo2 != null) {
                    }
                    oooO00o.o0Oo0oo(c32266OooO0Oo);
                    if (!c32266OooO0Oo.Oooo000()) {
                        c32266OooO0Oo.release();
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
            }
        } catch (Throwable th) {
            c32266OooO0Oo.release();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0062 -> B:26:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000O0(byte[] bArr, int i, int i2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23961OooOoOO c23961OooOoOO;
        OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof C23961OooOoOO) {
            c23961OooOoOO = (C23961OooOoOO) abstractC32479OooO0OO;
            int i3 = c23961OooOoOO.f80666OooOoo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23961OooOoOO.f80666OooOoo = i3 - Integer.MIN_VALUE;
            } else {
                c23961OooOoOO = new C23961OooOoOO(this, abstractC32479OooO0OO);
            }
        }
        Object num = c23961OooOoOO.f80665OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c23961OooOoOO.f80666OooOoo;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(num);
            oooO00o = this;
            if (i2 > 0) {
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = c23961OooOoOO.f80663OooOoO;
            i = c23961OooOoOO.f80664OooOoO0;
            byte[] bArr2 = c23961OooOoOO.f80661OooOo;
            oooO00o = c23961OooOoOO.f80662OooOo0o;
            C32446OooOOOo.OooO0O0(num);
            int iIntValue = ((Number) num).intValue();
            i += iIntValue;
            byte[] bArr3 = bArr2;
            i2 = i5 - iIntValue;
            bArr = bArr3;
            if (i2 > 0) {
                c23961OooOoOO.f80662OooOo0o = oooO00o;
                c23961OooOoOO.f80661OooOo = bArr;
                c23961OooOoOO.f80664OooOoO0 = i;
                c23961OooOoOO.f80663OooOoO = i2;
                c23961OooOoOO.f80666OooOoo = 1;
                C23994OooO0Oo c23994OooO0Oo = oooO00o.joining;
                if (c23994OooO0Oo != null) {
                    o00O0O(oooO00o, c23994OooO0Oo);
                }
                int iO0O0O00 = oooO00o.o0O0O00(i, i2, bArr);
                num = iO0O0O00 > 0 ? new Integer(iO0O0O00) : oooO00o.o00000o0(bArr, i, i2, c23961OooOoOO);
                if (num == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                int i6 = i2;
                bArr2 = bArr;
                i5 = i6;
                int iIntValue2 = ((Number) num).intValue();
                i += iIntValue2;
                byte[] bArr32 = bArr2;
                i2 = i5 - iIntValue2;
                bArr = bArr32;
                if (i2 > 0) {
                    return C32460OooOooO.f116667OooO00o;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000Oo(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23965OooOooo c23965OooOooo;
        OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof C23965OooOooo) {
            c23965OooOooo = (C23965OooOooo) abstractC32479OooO0OO;
            int i2 = c23965OooOooo.f80692OooOoOO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c23965OooOooo.f80692OooOoOO = i2 - Integer.MIN_VALUE;
            } else {
                c23965OooOooo = new C23965OooOooo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c23965OooOooo.f80691OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c23965OooOooo.f80692OooOoOO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oooO00o = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c23965OooOooo.f80688OooOo;
            oooO00o = c23965OooOooo.f80689OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        while (oooO00o.o0000Ooo(i)) {
            c23965OooOooo.f80689OooOo0o = oooO00o;
            c23965OooOooo.f80688OooOo = i;
            c23965OooOooo.f80692OooOoOO = 1;
            C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(c23965OooOooo));
            c33614OooOOO0.OooOOoo();
            while (true) {
                io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) oooO00o._closed;
                if (oooO0O0 != null) {
                    Oooo000.OooO00o(oooO0O0.OooO00o());
                    throw null;
                }
                if (!oooO00o.o0000Ooo(i)) {
                    c33614OooOOO0.resumeWith(C32460OooOooO.f116667OooO00o);
                    break;
                }
                while (((Continuation) oooO00o._writeOp) == null) {
                    if (!oooO00o.o0000Ooo(i)) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80499OooOOO;
                    while (!atomicReferenceFieldUpdater.compareAndSet(oooO00o, null, c33614OooOOO0)) {
                        if (atomicReferenceFieldUpdater.get(oooO00o) != null) {
                            break;
                        }
                    }
                    if (oooO00o.o0000Ooo(i)) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f80499OooOOO;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(oooO00o, c33614OooOOO0, null)) {
                        if (atomicReferenceFieldUpdater2.get(oooO00o) != c33614OooOOO0) {
                            break;
                        }
                    }
                }
                throw new IllegalStateException("Operation is already in progress");
            }
            oooO00o.OoooO00(i);
            if (oooO00o.o00oO0O()) {
                oooO00o.o00o0O();
            }
            Object objOooOOo = c33614OooOOO0.OooOOo();
            EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        io.ktor.utils.p616io.internal.OooO0O0 oooO0O02 = (io.ktor.utils.p616io.internal.OooO0O0) oooO00o._closed;
        if (oooO0O02 == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        Oooo000.OooO00o(oooO0O02.OooO00o());
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0053 -> B:22:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object o00000o0(byte[] r6, int r7, int r8, oO00ooo.AbstractC32479OooO0OO r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.p616io.C23964OooOooO
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.OooOooO r0 = (io.ktor.utils.p616io.C23964OooOooO) r0
            int r1 = r0.f80686OooOoo
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80686OooOoo = r1
            goto L18
        L13:
            io.ktor.utils.io.OooOooO r0 = new io.ktor.utils.io.OooOooO
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f80685OooOoOO
            oO00ooo0.OooO00o r1 = oO00ooo0.EnumC32485OooO00o.f116726OooOo0o
            int r2 = r0.f80686OooOoo
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 == r3) goto L32
            r6 = 2
            if (r2 != r6) goto L2a
            oO00ooO.C32446OooOOOo.OooO0O0(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r6 = r0.f80683OooOoO
            int r7 = r0.f80684OooOoO0
            byte[] r8 = r0.f80681OooOo
            io.ktor.utils.io.OooO00o r2 = r0.f80682OooOo0o
            oO00ooO.C32446OooOOOo.OooO0O0(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L56
        L41:
            oO00ooO.C32446OooOOOo.OooO0O0(r9)
            r2 = r5
        L45:
            r0.f80682OooOo0o = r2
            r0.f80681OooOo = r6
            r0.f80684OooOoO0 = r7
            r0.f80683OooOoO = r8
            r0.f80686OooOoo = r3
            java.lang.Object r9 = r2.o0OO00O(r0)
            if (r9 != r1) goto L56
            return r1
        L56:
            io.ktor.utils.io.internal.OooO0Oo r9 = r2.joining
            if (r9 == 0) goto L5d
            o00O0O(r2, r9)
        L5d:
            int r9 = r2.o0O0O00(r7, r8, r6)
            if (r9 <= 0) goto L45
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p616io.OooO00o.o00000o0(byte[], int, int, oO00ooo.OooO0OO):java.lang.Object");
    }

    public final boolean o0000Ooo(int i) {
        C23994OooO0Oo c23994OooO0Oo = this.joining;
        AbstractC23996OooO0oO abstractC23996OooO0oO = (AbstractC23996OooO0oO) this._state;
        if (((io.ktor.utils.p616io.internal.OooO0O0) this._closed) != null) {
            return false;
        }
        return c23994OooO0Oo == null ? abstractC23996OooO0oO.f80812OooO0O0._availableForWrite$internal < i && abstractC23996OooO0oO != AbstractC23996OooO0oO.OooO00o.f80813OooO0OO : (abstractC23996OooO0oO == AbstractC23996OooO0oO.OooO0o.f80822OooO0OO || (abstractC23996OooO0oO instanceof AbstractC23996OooO0oO.C19595OooO0oO) || (abstractC23996OooO0oO instanceof AbstractC23996OooO0oO.C23998OooO0o0)) ? false : true;
    }

    public final void o000OOo(ByteBuffer byteBuffer) throws Throwable {
        int iOooOO0;
        C23994OooO0Oo c23994OooO0Oo = this.joining;
        if (c23994OooO0Oo != null) {
            o00O0O(this, c23994OooO0Oo);
        }
        ByteBuffer byteBufferO00oO0o = o00oO0o();
        if (byteBufferO00oO0o == null) {
            return;
        }
        OooO oooO = ((AbstractC23996OooO0oO) this._state).f80812OooO0O0;
        try {
            io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
            if (oooO0O0 != null) {
                Oooo000.OooO00o(oooO0O0.OooO00o());
                throw null;
            }
            int iLimit = byteBuffer.limit();
            int i = 0;
            while (true) {
                int iPosition = iLimit - byteBuffer.position();
                if (iPosition == 0 || (iOooOO0 = oooO.OooOO0(Math.min(iPosition, byteBufferO00oO0o.remaining()))) == 0) {
                    break;
                }
                if (iOooOO0 <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                byteBuffer.limit(byteBuffer.position() + iOooOO0);
                byteBufferO00oO0o.put(byteBuffer);
                i += iOooOO0;
                OoooOO0(byteBufferO00oO0o, Oooo0o(byteBufferO00oO0o, this.f80505OooO0o + i), oooO._availableForWrite$internal);
            }
            byteBuffer.limit(iLimit);
            Oooo0OO(byteBufferO00oO0o, oooO, i);
            if (oooO.OooO0Oo() || this.f80502OooO0O0) {
                OoooO00(1);
            }
            o00Ooo();
            o0OOO0o();
        } catch (Throwable th) {
            if (oooO.OooO0Oo() || this.f80502OooO0O0) {
                OoooO00(1);
            }
            o00Ooo();
            o0OOO0o();
            throw th;
        }
    }

    public final Object o000oOoO(int i, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        int i2;
        if (i < 0) {
            throw new IllegalArgumentException("min should be positive or zero");
        }
        ByteBuffer byteBufferOo000o = oo000o();
        boolean z = false;
        if (byteBufferOo000o != null) {
            OooO oooO = ((AbstractC23996OooO0oO) this._state).f80812OooO0O0;
            try {
                if (oooO._availableForRead$internal != 0 && (i2 = oooO._availableForRead$internal) > 0 && i2 >= i) {
                    int iPosition = byteBufferOo000o.position();
                    int iLimit = byteBufferOo000o.limit();
                    interfaceC32507OooOO0o.invoke(byteBufferOo000o);
                    if (iLimit != byteBufferOo000o.limit()) {
                        throw new IllegalStateException("Buffer limit modified.");
                    }
                    int iPosition2 = byteBufferOo000o.position() - iPosition;
                    if (iPosition2 < 0) {
                        throw new IllegalStateException("Position has been moved backward: pushback is not supported.");
                    }
                    if (!oooO.OooO(iPosition2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    Oooo0O0(byteBufferOo000o, oooO, iPosition2);
                    z = true;
                }
            } finally {
                o00Oo0();
                o0OOO0o();
            }
        }
        if (z) {
            return C32460OooOooO.f116667OooO00o;
        }
        if (OooOoo() && i > 0) {
            throw new EOFException(o0Oo0oo.OooO0O0(i, "Got EOF but at least ", " bytes were expected"));
        }
        Object objOoooo0o = Ooooo0o(i, interfaceC32507OooOO0o, abstractC32479OooO0OO);
        return objOoooo0o == EnumC32485OooO00o.f116726OooOo0o ? objOoooo0o : C32460OooOooO.f116667OooO00o;
    }

    public final void o00Oo0() {
        AbstractC23996OooO0oO abstractC23996OooO0oOOooO0o;
        AbstractC23996OooO0oO abstractC23996OooO0oO = null;
        loop0: while (true) {
            Object obj = this._state;
            AbstractC23996OooO0oO abstractC23996OooO0oO2 = (AbstractC23996OooO0oO) obj;
            AbstractC23996OooO0oO.OooO0O0 oooO0O0 = (AbstractC23996OooO0oO.OooO0O0) abstractC23996OooO0oO;
            if (oooO0O0 != null) {
                oooO0O0.f80812OooO0O0.OooO0o();
                o00ooo();
                abstractC23996OooO0oO = null;
            }
            abstractC23996OooO0oOOooO0o = abstractC23996OooO0oO2.OooO0o();
            if ((abstractC23996OooO0oOOooO0o instanceof AbstractC23996OooO0oO.OooO0O0) && ((AbstractC23996OooO0oO) this._state) == abstractC23996OooO0oO2 && abstractC23996OooO0oOOooO0o.f80812OooO0O0.OooO0oO()) {
                abstractC23996OooO0oOOooO0o = AbstractC23996OooO0oO.OooO00o.f80813OooO0OO;
                abstractC23996OooO0oO = abstractC23996OooO0oOOooO0o;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80497OooOO0O;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC23996OooO0oOOooO0o)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        }
        AbstractC23996OooO0oO.OooO00o oooO00o = AbstractC23996OooO0oO.OooO00o.f80813OooO0OO;
        if (abstractC23996OooO0oOOooO0o == oooO00o) {
            AbstractC23996OooO0oO.OooO0O0 oooO0O02 = (AbstractC23996OooO0oO.OooO0O0) abstractC23996OooO0oO;
            if (oooO0O02 != null) {
                ooOO(oooO0O02.f80814OooO0OO);
            }
            o00ooo();
            return;
        }
        if (abstractC23996OooO0oOOooO0o instanceof AbstractC23996OooO0oO.OooO0O0) {
            OooO oooO = abstractC23996OooO0oOOooO0o.f80812OooO0O0;
            if (oooO._availableForWrite$internal == oooO.f80795OooO00o && abstractC23996OooO0oOOooO0o.f80812OooO0O0.OooO0oO()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f80497OooOO0O;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, abstractC23996OooO0oOOooO0o, oooO00o)) {
                    if (atomicReferenceFieldUpdater2.get(this) != abstractC23996OooO0oOOooO0o) {
                        return;
                    }
                }
                abstractC23996OooO0oOOooO0o.f80812OooO0O0.OooO0o();
                ooOO(((AbstractC23996OooO0oO.OooO0O0) abstractC23996OooO0oOOooO0o).f80814OooO0OO);
                o00ooo();
            }
        }
    }

    public final void o00Ooo() {
        AbstractC23996OooO0oO abstractC23996OooO0oOOooO0oO;
        AbstractC23996OooO0oO.OooO0O0 oooO0O0;
        AbstractC23996OooO0oO abstractC23996OooO0oO = null;
        loop0: while (true) {
            Object obj = this._state;
            abstractC23996OooO0oOOooO0oO = ((AbstractC23996OooO0oO) obj).OooO0oO();
            if (abstractC23996OooO0oOOooO0oO instanceof AbstractC23996OooO0oO.OooO0O0) {
                OooO oooO = abstractC23996OooO0oOOooO0oO.f80812OooO0O0;
                if (oooO._availableForWrite$internal == oooO.f80795OooO00o) {
                    abstractC23996OooO0oOOooO0oO = AbstractC23996OooO0oO.OooO00o.f80813OooO0OO;
                    abstractC23996OooO0oO = abstractC23996OooO0oOOooO0oO;
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80497OooOO0O;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC23996OooO0oOOooO0oO)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        }
        if (abstractC23996OooO0oOOooO0oO != AbstractC23996OooO0oO.OooO00o.f80813OooO0OO || (oooO0O0 = (AbstractC23996OooO0oO.OooO0O0) abstractC23996OooO0oO) == null) {
            return;
        }
        ooOO(oooO0O0.f80814OooO0OO);
    }

    public final void o00o0O() {
        Continuation continuation = (Continuation) f80500OooOOO0.getAndSet(this, null);
        if (continuation != null) {
            io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
            Throwable th = oooO0O0 != null ? oooO0O0.f80802OooO00o : null;
            if (th != null) {
                continuation.resumeWith(C32446OooOOOo.OooO00o(th));
            } else {
                continuation.resumeWith(Boolean.TRUE);
            }
        }
    }

    public final boolean o00oO0O() {
        if (this.joining != null) {
            return ((AbstractC23996OooO0oO) this._state) == AbstractC23996OooO0oO.OooO00o.f80813OooO0OO || (((AbstractC23996OooO0oO) this._state) instanceof AbstractC23996OooO0oO.OooO0O0);
        }
        return false;
    }

    public final ByteBuffer o00oO0o() throws Throwable {
        AbstractC23996OooO0oO abstractC23996OooO0oOOooO0o0;
        AbstractC23996OooO0oO.OooO0OO oooO0OO;
        Continuation continuation = (Continuation) this._writeOp;
        if (continuation != null) {
            throw new IllegalStateException("Write operation is already in progress: " + continuation);
        }
        AbstractC23996OooO0oO.OooO0OO oooO0OOO0000OoO = null;
        while (true) {
            Object obj = this._state;
            AbstractC23996OooO0oO abstractC23996OooO0oO = (AbstractC23996OooO0oO) obj;
            if (this.joining == null) {
                if (((io.ktor.utils.p616io.internal.OooO0O0) this._closed) != null) {
                    if (oooO0OOO0000OoO != null) {
                        ooOO(oooO0OOO0000OoO);
                    }
                    io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
                    OooOOO0.OooO0Oo(oooO0O0);
                    Oooo000.OooO00o(oooO0O0.OooO00o());
                    throw null;
                }
                if (abstractC23996OooO0oO == AbstractC23996OooO0oO.OooO00o.f80813OooO0OO) {
                    if (oooO0OOO0000OoO == null) {
                        oooO0OOO0000OoO = this.f80503OooO0OO.o0000OoO();
                        oooO0OOO0000OoO.f80812OooO0O0.OooO0o();
                    }
                    abstractC23996OooO0oOOooO0o0 = oooO0OOO0000OoO.f80819OooO0oO;
                } else if (abstractC23996OooO0oO == AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                    if (oooO0OOO0000OoO != null) {
                        ooOO(oooO0OOO0000OoO);
                    }
                    if (this.joining == null) {
                        io.ktor.utils.p616io.internal.OooO0O0 oooO0O02 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
                        OooOOO0.OooO0Oo(oooO0O02);
                        Oooo000.OooO00o(oooO0O02.OooO00o());
                        throw null;
                    }
                } else {
                    abstractC23996OooO0oOOooO0o0 = abstractC23996OooO0oO.OooO0o0();
                }
                AbstractC23996OooO0oO abstractC23996OooO0oO2 = abstractC23996OooO0oOOooO0o0;
                oooO0OO = oooO0OOO0000OoO;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80497OooOO0O;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC23996OooO0oO2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (((io.ktor.utils.p616io.internal.OooO0O0) this._closed) != null) {
                    o00Ooo();
                    o0OOO0o();
                    io.ktor.utils.p616io.internal.OooO0O0 oooO0O03 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
                    OooOOO0.OooO0Oo(oooO0O03);
                    Oooo000.OooO00o(oooO0O03.OooO00o());
                    throw null;
                }
                ByteBuffer byteBufferOooO0OO = abstractC23996OooO0oO2.OooO0OO();
                if (oooO0OO != null) {
                    if (abstractC23996OooO0oO == null) {
                        OooOOO0.OooOOOO("old");
                        throw null;
                    }
                    if (abstractC23996OooO0oO != AbstractC23996OooO0oO.OooO00o.f80813OooO0OO) {
                        ooOO(oooO0OO);
                    }
                }
                OoooOO0(byteBufferOooO0OO, this.f80505OooO0o, abstractC23996OooO0oO2.f80812OooO0O0._availableForWrite$internal);
                return byteBufferOooO0OO;
            }
            if (oooO0OOO0000OoO != null) {
                ooOO(oooO0OOO0000OoO);
                return null;
            }
            oooO0OOO0000OoO = oooO0OO;
        }
        return null;
    }

    public final void o00ooo() {
        while (true) {
            Continuation continuation = (Continuation) this._writeOp;
            if (continuation == null) {
                return;
            }
            io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
            if (oooO0O0 == null && this.joining != null) {
                AbstractC23996OooO0oO abstractC23996OooO0oO = (AbstractC23996OooO0oO) this._state;
                if (!(abstractC23996OooO0oO instanceof AbstractC23996OooO0oO.C19595OooO0oO) && !(abstractC23996OooO0oO instanceof AbstractC23996OooO0oO.C23998OooO0o0) && abstractC23996OooO0oO != AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                    return;
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80499OooOOO;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, continuation, null)) {
                if (atomicReferenceFieldUpdater.get(this) != continuation) {
                    break;
                }
            }
            if (oooO0O0 == null) {
                continuation.resumeWith(C32460OooOooO.f116667OooO00o);
                return;
            } else {
                continuation.resumeWith(C32446OooOOOo.OooO00o(oooO0O0.OooO00o()));
                return;
            }
        }
    }

    public final int o0O0O00(int i, int i2, byte[] bArr) throws Throwable {
        C23994OooO0Oo c23994OooO0Oo = this.joining;
        if (c23994OooO0Oo != null) {
            o00O0O(this, c23994OooO0Oo);
        }
        ByteBuffer byteBufferO00oO0o = o00oO0o();
        int i3 = 0;
        if (byteBufferO00oO0o == null) {
            return 0;
        }
        OooO oooO = ((AbstractC23996OooO0oO) this._state).f80812OooO0O0;
        try {
            io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
            if (oooO0O0 != null) {
                Oooo000.OooO00o(oooO0O0.OooO00o());
                throw null;
            }
            while (true) {
                int iOooOO0 = oooO.OooOO0(Math.min(i2 - i3, byteBufferO00oO0o.remaining()));
                if (iOooOO0 == 0) {
                    Oooo0OO(byteBufferO00oO0o, oooO, i3);
                    if (oooO.OooO0Oo() || this.f80502OooO0O0) {
                        OoooO00(1);
                    }
                    o00Ooo();
                    o0OOO0o();
                    return i3;
                }
                if (iOooOO0 <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                byteBufferO00oO0o.put(bArr, i + i3, iOooOO0);
                i3 += iOooOO0;
                OoooOO0(byteBufferO00oO0o, Oooo0o(byteBufferO00oO0o, this.f80505OooO0o + i3), oooO._availableForWrite$internal);
            }
        } catch (Throwable th) {
            if (oooO.OooO0Oo() || this.f80502OooO0O0) {
                OoooO00(1);
            }
            o00Ooo();
            o0OOO0o();
            throw th;
        }
    }

    public final Object o0OO00O(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        if (!o0000Ooo(1)) {
            io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
            if (oooO0O0 == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            Oooo000.OooO00o(oooO0O0.OooO00o());
            throw null;
        }
        this.writeSuspensionSize = 1;
        if (this.attachedJob != null) {
            this.f80509OooOO0.invoke(abstractC32479OooO0OO);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
        io.ktor.utils.p616io.internal.OooO00o<C32460OooOooO> oooO00o = this.f80501OooO;
        this.f80509OooOO0.invoke(oooO00o);
        Object objOooO0Oo = oooO00o.OooO0Oo(C21904OooOoo0.OooO0o0(abstractC32479OooO0OO));
        return objOooO0Oo == EnumC32485OooO00o.f116726OooOo0o ? objOooO0Oo : C32460OooOooO.f116667OooO00o;
    }

    public final void o0OOO0o() {
        if (((io.ktor.utils.p616io.internal.OooO0O0) this._closed) == null || !o0ooOoO(false)) {
            return;
        }
        C23994OooO0Oo c23994OooO0Oo = this.joining;
        if (c23994OooO0Oo != null) {
            Oooo(c23994OooO0Oo);
        }
        o00o0O();
        o00ooo();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0Oo0oo(C32266OooO0Oo c32266OooO0Oo) throws Throwable {
        C23994OooO0Oo c23994OooO0Oo = this.joining;
        if (c23994OooO0Oo != null) {
            o00O0O(this, c23994OooO0Oo);
        }
        ByteBuffer byteBufferO00oO0o = o00oO0o();
        if (byteBufferO00oO0o == null) {
            return 0;
        }
        OooO oooO = ((AbstractC23996OooO0oO) this._state).f80812OooO0O0;
        try {
            io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
            if (oooO0O0 != null) {
                Oooo000.OooO00o(oooO0O0.OooO00o());
                throw null;
            }
            int iOooOO0 = oooO.OooOO0((int) Math.min(c32266OooO0Oo.Oooo0(), byteBufferO00oO0o.remaining()));
            if (iOooOO0 > 0) {
                byteBufferO00oO0o.limit(byteBufferO00oO0o.position() + iOooOO0);
                C21292OooO0oo.OooO0oO(c32266OooO0Oo, byteBufferO00oO0o);
                Oooo0OO(byteBufferO00oO0o, oooO, iOooOO0);
            }
            return iOooOO0;
        } finally {
            if (oooO.OooO0Oo() || this.f80502OooO0O0) {
                OoooO00(1);
            }
            o00Ooo();
            o0OOO0o();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:82)|35|36|80|37|38|88|39|(9:42|20|43|23|(7:25|34|49|(0)|52|(1:54)|63)(0)|64|(0)(0)|74|75)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:82|35|36|80|37|38|88|39|(9:42|20|43|23|(7:25|34|49|(0)|52|(1:54)|63)(0)|64|(0)(0)|74|75)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0116, code lost:
    
        r20 = r9;
        r21 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011a, code lost:
    
        r9 = r18;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011e, code lost:
    
        r0 = r16;
        r12 = r17;
        r8 = r18;
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0165, code lost:
    
        if (r1.o000oOoO(1, r5, r4) == r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0070, code lost:
    
        r9 = r8;
        r8 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x010c -> B:20:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o0OoOo0(Appendable appendable, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOo00 oooOo00;
        OooO00o oooO00o;
        C24033OooOooo c24033OooOooo;
        Appendable appendable2;
        int i2;
        char[] cArr;
        C24034Oooo00O c24034Oooo00O;
        C24033OooOooo c24033OooOooo2;
        C24030OooOoo c24030OooOoo;
        C24030OooOoo c24030OooOoo2;
        C24033OooOooo c24033OooOooo3;
        OooOo00 oooOo002;
        OooO00o oooO00o2;
        C24030OooOoo c24030OooOoo3;
        C24030OooOoo c24030OooOoo4;
        T t;
        C24030OooOoo c24030OooOoo5;
        C24030OooOoo c24030OooOoo6;
        C24033OooOooo c24033OooOooo4;
        C24030OooOoo c24030OooOoo7;
        C24030OooOoo c24030OooOoo8;
        if (abstractC32479OooO0OO instanceof OooOo00) {
            oooOo00 = (OooOo00) abstractC32479OooO0OO;
            int i3 = oooOo00.f80640Oooo0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooOo00.f80640Oooo0 = i3 - Integer.MIN_VALUE;
                oooO00o = this;
            } else {
                oooO00o = this;
                oooOo00 = new OooOo00(oooO00o, abstractC32479OooO0OO);
            }
        }
        Object obj = oooOo00.f80642Oooo00O;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = oooOo00.f80640Oooo0;
        boolean z = true;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c24033OooOooo = new C24033OooOooo();
            C24033OooOooo c24033OooOooo5 = new C24033OooOooo();
            c24033OooOooo5.f80940OooOo0o = 1;
            C24030OooOoo c24030OooOoo9 = new C24030OooOoo();
            C24030OooOoo c24030OooOoo10 = new C24030OooOoo();
            appendable2 = appendable;
            i2 = i;
            cArr = new char[8192];
            c24034Oooo00O = new C24034Oooo00O();
            c24033OooOooo2 = new C24033OooOooo();
            c24030OooOoo = c24030OooOoo10;
            c24030OooOoo2 = c24030OooOoo9;
            c24033OooOooo3 = c24033OooOooo5;
            oooOo002 = oooOo00;
            oooO00o2 = oooO00o;
            if (oooO00o2.OooOoo()) {
            }
            if (!oooO00o2.OooOoo()) {
            }
            return Boolean.valueOf(z);
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24030OooOoo8 = (C24030OooOoo) oooOo00.f80633OooOoO;
            c24030OooOoo7 = (C24030OooOoo) oooOo00.f80634OooOoO0;
            c24033OooOooo4 = (C24033OooOooo) oooOo00.f80631OooOo;
            oooO00o2 = oooOo00.f80632OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (EOFException unused) {
            }
            c24030OooOoo5 = c24030OooOoo8;
            c24030OooOoo6 = c24030OooOoo7;
            c24033OooOooo = c24033OooOooo4;
            if ((!oooO00o2.OooOoo() || c24033OooOooo.f80940OooOo0o <= 0) && !c24030OooOoo5.f80938OooOo0o && !c24030OooOoo6.f80938OooOo0o) {
            }
            return Boolean.valueOf(z);
        }
        int i5 = oooOo00.f80641Oooo000;
        C24033OooOooo c24033OooOooo6 = oooOo00.f80639OooOooo;
        C24034Oooo00O c24034Oooo00O2 = oooOo00.f80638OooOooO;
        char[] cArr2 = oooOo00.f80636OooOoo;
        C24030OooOoo c24030OooOoo11 = oooOo00.f80637OooOoo0;
        C24030OooOoo c24030OooOoo12 = oooOo00.f80635OooOoOO;
        C24033OooOooo c24033OooOooo7 = (C24033OooOooo) oooOo00.f80633OooOoO;
        C24033OooOooo c24033OooOooo8 = (C24033OooOooo) oooOo00.f80634OooOoO0;
        Appendable appendable3 = (Appendable) oooOo00.f80631OooOo;
        OooO00o oooO00o3 = oooOo00.f80632OooOo0o;
        try {
            C32446OooOOOo.OooO0O0(obj);
            c24033OooOooo2 = c24033OooOooo6;
            c24033OooOooo = c24033OooOooo8;
            appendable2 = appendable3;
            i2 = i5;
            c24034Oooo00O = c24034Oooo00O2;
            c24030OooOoo2 = c24030OooOoo12;
            oooOo002 = oooOo00;
            oooO00o2 = oooO00o3;
            cArr = cArr2;
            c24030OooOoo = c24030OooOoo11;
        } catch (EOFException unused2) {
            c24033OooOooo2 = c24033OooOooo6;
            c24033OooOooo3 = c24033OooOooo7;
            c24033OooOooo = c24033OooOooo8;
            appendable2 = appendable3;
            i2 = i5;
            c24034Oooo00O = c24034Oooo00O2;
            c24030OooOoo2 = c24030OooOoo12;
            oooOo002 = oooOo00;
            oooO00o2 = oooO00o3;
            cArr = cArr2;
            c24030OooOoo = c24030OooOoo11;
            if (oooO00o2.OooOoo()) {
            }
            if (!oooO00o2.OooOoo()) {
            }
            return Boolean.valueOf(z);
        }
        c24033OooOooo3 = c24033OooOooo7;
        if (oooO00o2.OooOoo() || c24030OooOoo.f80938OooOo0o || c24030OooOoo2.f80938OooOo0o || (i2 != Integer.MAX_VALUE && c24033OooOooo.f80940OooOo0o > i2)) {
            c24030OooOoo3 = c24030OooOoo2;
            c24030OooOoo4 = c24030OooOoo;
            t = c24034Oooo00O.f80942OooOo0o;
            if (t != 0) {
                C23995OooO0o0.f80808OooO0O0.o00o0O(t);
            }
            if (!oooO00o2.OooOoo() || !c24030OooOoo3.f80938OooOo0o || c24030OooOoo4.f80938OooOo0o) {
                c24030OooOoo5 = c24030OooOoo4;
                c24030OooOoo6 = c24030OooOoo3;
                z = !oooO00o2.OooOoo() ? false : false;
                return Boolean.valueOf(z);
            }
            try {
                C23957OooOo0O c23957OooOo0O = new C23957OooOo0O(c24030OooOoo4);
                oooOo002.f80632OooOo0o = oooO00o2;
                oooOo002.f80631OooOo = c24033OooOooo;
                oooOo002.f80634OooOoO0 = c24030OooOoo3;
                oooOo002.f80633OooOoO = c24030OooOoo4;
                oooOo002.f80635OooOoOO = null;
                oooOo002.f80637OooOoo0 = null;
                oooOo002.f80636OooOoo = null;
                oooOo002.f80638OooOooO = null;
                oooOo002.f80639OooOooo = null;
                oooOo002.f80640Oooo0 = 2;
            } catch (EOFException unused3) {
            }
        } else {
            try {
            } catch (EOFException unused4) {
                c24033OooOooo7 = c24033OooOooo3;
                C24030OooOoo c24030OooOoo13 = c24030OooOoo2;
                C24030OooOoo c24030OooOoo14 = c24030OooOoo;
            }
            int i6 = c24033OooOooo3.f80940OooOo0o;
            C24033OooOooo c24033OooOooo9 = c24033OooOooo;
            C24033OooOooo c24033OooOooo10 = c24033OooOooo3;
            C24030OooOoo c24030OooOoo15 = c24030OooOoo2;
            C24030OooOoo c24030OooOoo16 = c24030OooOoo;
            C23956OooOo0 c23956OooOo0 = new C23956OooOo0(c24034Oooo00O, i2, cArr, c24033OooOooo9, c24033OooOooo10, c24030OooOoo16, c24030OooOoo15, appendable2, c24033OooOooo2);
            c24033OooOooo = c24033OooOooo9;
            c24033OooOooo7 = c24033OooOooo10;
            Appendable appendable4 = appendable2;
            C24033OooOooo c24033OooOooo11 = c24033OooOooo2;
            oooOo002.f80632OooOo0o = oooO00o2;
            oooOo002.f80631OooOo = appendable4;
            oooOo002.f80634OooOoO0 = c24033OooOooo;
            oooOo002.f80633OooOoO = c24033OooOooo7;
            oooOo002.f80635OooOoOO = c24030OooOoo15;
            oooOo002.f80637OooOoo0 = c24030OooOoo16;
            oooOo002.f80636OooOoo = cArr;
            oooOo002.f80638OooOooO = c24034Oooo00O;
            oooOo002.f80639OooOooo = c24033OooOooo11;
            oooOo002.f80641Oooo000 = i2;
            oooOo002.f80640Oooo0 = 1;
            if (oooO00o2.o000oOoO(i6, c23956OooOo0, oooOo002) != enumC32485OooO00o) {
                appendable2 = appendable4;
                c24033OooOooo2 = c24033OooOooo11;
                c24030OooOoo = c24030OooOoo16;
                c24030OooOoo2 = c24030OooOoo15;
                c24033OooOooo3 = c24033OooOooo7;
                if (oooO00o2.OooOoo()) {
                    c24030OooOoo3 = c24030OooOoo2;
                    c24030OooOoo4 = c24030OooOoo;
                    t = c24034Oooo00O.f80942OooOo0o;
                    if (t != 0) {
                    }
                    if (!oooO00o2.OooOoo()) {
                    }
                    c24030OooOoo5 = c24030OooOoo4;
                    c24030OooOoo6 = c24030OooOoo3;
                }
                if (!oooO00o2.OooOoo()) {
                }
                return Boolean.valueOf(z);
            }
        }
        return enumC32485OooO00o;
        c24033OooOooo4 = c24033OooOooo;
        c24030OooOoo7 = c24030OooOoo3;
        c24030OooOoo8 = c24030OooOoo4;
        c24030OooOoo5 = c24030OooOoo8;
        c24030OooOoo6 = c24030OooOoo7;
        c24033OooOooo = c24033OooOooo4;
        if (!oooO00o2.OooOoo()) {
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cc, code lost:
    
        r6.resumeWith(java.lang.Boolean.TRUE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0ooOO0(int i, Continuation continuation) {
        loop0: while (true) {
            AbstractC23996OooO0oO abstractC23996OooO0oO = (AbstractC23996OooO0oO) this._state;
            if (abstractC23996OooO0oO.f80812OooO0O0._availableForRead$internal >= i || !(this.joining == null || ((Continuation) this._writeOp) == null || (abstractC23996OooO0oO != AbstractC23996OooO0oO.OooO00o.f80813OooO0OO && !(abstractC23996OooO0oO instanceof AbstractC23996OooO0oO.OooO0O0)))) {
                break;
            }
            io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
            if (oooO0O0 != null) {
                Throwable th = oooO0O0.f80802OooO00o;
                if (th != null) {
                    continuation.resumeWith(C32446OooOOOo.OooO00o(th));
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    return;
                }
                boolean zOooO0OO = ((AbstractC23996OooO0oO) this._state).f80812OooO0O0.OooO0OO();
                boolean z = false;
                boolean z2 = ((AbstractC23996OooO0oO) this._state).f80812OooO0O0._availableForRead$internal >= i;
                if (zOooO0OO && z2) {
                    z = true;
                }
                continuation.resumeWith(Boolean.valueOf(z));
                EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                return;
            }
            while (((Continuation) this._readOp) == null) {
                if (((io.ktor.utils.p616io.internal.OooO0O0) this._closed) == null) {
                    AbstractC23996OooO0oO abstractC23996OooO0oO2 = (AbstractC23996OooO0oO) this._state;
                    if (abstractC23996OooO0oO2.f80812OooO0O0._availableForRead$internal >= i || !(this.joining == null || ((Continuation) this._writeOp) == null || (abstractC23996OooO0oO2 != AbstractC23996OooO0oO.OooO00o.f80813OooO0OO && !(abstractC23996OooO0oO2 instanceof AbstractC23996OooO0oO.OooO0O0)))) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80500OooOOO0;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, continuation)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    if (((io.ktor.utils.p616io.internal.OooO0O0) this._closed) == null) {
                        AbstractC23996OooO0oO abstractC23996OooO0oO3 = (AbstractC23996OooO0oO) this._state;
                        if (abstractC23996OooO0oO3.f80812OooO0O0._availableForRead$internal < i && (this.joining == null || ((Continuation) this._writeOp) == null || (abstractC23996OooO0oO3 != AbstractC23996OooO0oO.OooO00o.f80813OooO0OO && !(abstractC23996OooO0oO3 instanceof AbstractC23996OooO0oO.OooO0O0)))) {
                            break;
                        }
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f80500OooOOO0;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, continuation, null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != continuation) {
                            break loop0;
                        }
                    }
                }
            }
            throw new IllegalStateException("Operation is already in progress");
        }
        EnumC32485OooO00o enumC32485OooO00o3 = EnumC32485OooO00o.f116726OooOo0o;
    }

    public final boolean o0ooOOo(C23994OooO0Oo c23994OooO0Oo) {
        if (!o0ooOoO(true)) {
            return false;
        }
        Oooo(c23994OooO0Oo);
        Continuation continuation = (Continuation) f80500OooOOO0.getAndSet(this, null);
        if (continuation != null) {
            continuation.resumeWith(C32446OooOOOo.OooO00o(new IllegalStateException("Joining is in progress")));
        }
        o00ooo();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o0ooOoO(boolean z) {
        AbstractC23996OooO0oO.OooO0OO oooO0OO;
        AbstractC23996OooO0oO.OooO0OO oooO0OO2 = null;
        while (true) {
            Object obj = this._state;
            AbstractC23996OooO0oO abstractC23996OooO0oO = (AbstractC23996OooO0oO) obj;
            io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
            if (oooO0OO2 != null) {
                if ((oooO0O0 != null ? oooO0O0.f80802OooO00o : null) == null) {
                    oooO0OO2.f80812OooO0O0.OooO0o();
                }
                o00ooo();
                oooO0OO2 = null;
            }
            AbstractC23996OooO0oO.OooO0o oooO0o = AbstractC23996OooO0oO.OooO0o.f80822OooO0OO;
            if (abstractC23996OooO0oO == oooO0o) {
                break;
            }
            if (abstractC23996OooO0oO != AbstractC23996OooO0oO.OooO00o.f80813OooO0OO) {
                if (oooO0O0 != null && (abstractC23996OooO0oO instanceof AbstractC23996OooO0oO.OooO0O0) && (abstractC23996OooO0oO.f80812OooO0O0.OooO0oO() || oooO0O0.f80802OooO00o != null)) {
                    if (oooO0O0.f80802OooO00o != null) {
                        OooO oooO = abstractC23996OooO0oO.f80812OooO0O0;
                        oooO.getClass();
                        OooO.f80793OooO0OO.getAndSet(oooO, 0);
                    }
                    oooO0OO2 = ((AbstractC23996OooO0oO.OooO0O0) abstractC23996OooO0oO).f80814OooO0OO;
                } else {
                    if (!z || !(abstractC23996OooO0oO instanceof AbstractC23996OooO0oO.OooO0O0) || !abstractC23996OooO0oO.f80812OooO0O0.OooO0oO()) {
                        break;
                    }
                    oooO0OO2 = ((AbstractC23996OooO0oO.OooO0O0) abstractC23996OooO0oO).f80814OooO0OO;
                }
            }
            oooO0OO = oooO0OO2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80497OooOO0O;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oooO0o)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (oooO0OO != null && ((AbstractC23996OooO0oO) this._state) == AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) {
                ooOO(oooO0OO);
            }
            oooO0OO2 = oooO0OO;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ByteBuffer oo000o() throws Throwable {
        Throwable th;
        Throwable th2;
        while (true) {
            Object obj = this._state;
            AbstractC23996OooO0oO abstractC23996OooO0oO = (AbstractC23996OooO0oO) obj;
            if (!(OooOOO0.OooO0O0(abstractC23996OooO0oO, AbstractC23996OooO0oO.OooO0o.f80822OooO0OO) ? true : OooOOO0.OooO0O0(abstractC23996OooO0oO, AbstractC23996OooO0oO.OooO00o.f80813OooO0OO))) {
                io.ktor.utils.p616io.internal.OooO0O0 oooO0O0 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
                if (oooO0O0 != null && (th2 = oooO0O0.f80802OooO00o) != null) {
                    Oooo000.OooO00o(th2);
                    throw null;
                }
                if (abstractC23996OooO0oO.f80812OooO0O0._availableForRead$internal == 0) {
                    break;
                }
                AbstractC23996OooO0oO abstractC23996OooO0oOOooO0Oo = abstractC23996OooO0oO.OooO0Oo();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80497OooOO0O;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC23996OooO0oOOooO0Oo)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                ByteBuffer byteBufferOooO0O0 = abstractC23996OooO0oOOooO0Oo.OooO0O0();
                OoooOO0(byteBufferOooO0O0, this.f80506OooO0o0, abstractC23996OooO0oOOooO0Oo.f80812OooO0O0._availableForRead$internal);
                return byteBufferOooO0O0;
            }
            io.ktor.utils.p616io.internal.OooO0O0 oooO0O02 = (io.ktor.utils.p616io.internal.OooO0O0) this._closed;
            if (oooO0O02 != null && (th = oooO0O02.f80802OooO00o) != null) {
                Oooo000.OooO00o(th);
                throw null;
            }
        }
    }

    public final void ooOO(AbstractC23996OooO0oO.OooO0OO oooO0OO) {
        this.f80503OooO0OO.o00o0O(oooO0OO);
    }

    public final String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + ((AbstractC23996OooO0oO) this._state) + ')';
    }

    public OooO00o(ByteBuffer byteBuffer) {
        this(false, C23995OooO0o0.f80810OooO0Oo, 0);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        OooOOO0.OooO0o(byteBufferSlice, "content.slice()");
        AbstractC23996OooO0oO.OooO0OO oooO0OO = new AbstractC23996OooO0oO.OooO0OO(byteBufferSlice, 0);
        oooO0OO.f80812OooO0O0.OooO0o0();
        this._state = oooO0OO.f80819OooO0oO;
        o00Ooo();
        C23992OoooooO.OooO0O0(this);
        o0OOO0o();
    }

    public OooO00o(boolean z, OooO0o<AbstractC23996OooO0oO.OooO0OO> pool, int i) {
        OooOOO0.OooO0oO(pool, "pool");
        this.f80502OooO0O0 = z;
        this.f80503OooO0OO = pool;
        this.f80504OooO0Oo = i;
        this._state = AbstractC23996OooO0oO.OooO00o.f80813OooO0OO;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        this.f80507OooO0oO = new io.ktor.utils.p616io.internal.OooO0o(this);
        C23994OooO0Oo c23994OooO0Oo = this.joining;
        if (c23994OooO0Oo != null) {
            o00O0O(this, c23994OooO0Oo);
        }
        C32271OooO00o.f115978OooOOO0.getClass();
        OooO oooO = ((AbstractC23996OooO0oO) this._state).f80812OooO0O0;
        this.f80508OooO0oo = new io.ktor.utils.p616io.internal.OooO00o<>();
        this.f80501OooO = new io.ktor.utils.p616io.internal.OooO00o<>();
        this.f80509OooOO0 = new OooO0O0();
    }
}
