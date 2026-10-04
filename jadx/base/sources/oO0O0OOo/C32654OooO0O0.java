package oO0O0OOo;

import Oooo000.C20901OooOOo0;
import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import oO00O0oo.AbstractC32223OooOOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0O0OOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32654OooO0O0 extends OooOOO implements Closeable, InterfaceC33636Oooo00o {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f117342OooOoo;
    private volatile boolean closed;
    private volatile boolean inSelect;
    private volatile Selector selectorRef;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AtomicLong f117340OooOoO = new AtomicLong();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO00o<C32460OooOooO, Continuation<C32460OooOooO>> f117341OooOoOO = new OooO00o<>();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C32662OooO0oo<OooOO0O> f117343OooOoo0 = new C32662OooO0oo<>();

    /* JADX INFO: renamed from: oO0O0OOo.OooO0O0$OooO00o */
    public static final class OooO00o<R, C extends Continuation<? super R>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicReference<C> f117344OooO00o = new AtomicReference<>(null);
    }

    public C32654OooO0O0(AbstractC33630OooOooO abstractC33630OooOooO) {
        this.f117342OooOoo = InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(abstractC33630OooOooO, new C33635Oooo00O("selector"));
        C33609OooO0oo.OooO0OO(this, null, null, new C32653OooO00o(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
    
        if (r12 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        if (r12 != r1) goto L48;
     */
    /* JADX WARN: Path cross not found for [B:45:0x00e9, B:46:0x00ed], limit reached: 63 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[LOOP:1: B:21:0x0067->B:52:0x00fa, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008b -> B:19:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a5 -> B:19:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b5 -> B:19:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Oooo000(C32654OooO0O0 c32654OooO0O0, C32662OooO0oo c32662OooO0oo, AbstractSelector abstractSelector, AbstractC32479OooO0OO abstractC32479OooO0OO) throws IOException {
        C32655OooO0OO c32655OooO0OO;
        Selector selector;
        C32654OooO0O0 c32654OooO0O02;
        Selector selector2;
        C32654OooO0O0 c32654OooO0O03;
        c32654OooO0O0.getClass();
        if (abstractC32479OooO0OO instanceof C32655OooO0OO) {
            c32655OooO0OO = (C32655OooO0OO) abstractC32479OooO0OO;
            int i = c32655OooO0OO.f117350OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32655OooO0OO.f117350OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c32655OooO0OO = new C32655OooO0OO(c32654OooO0O0, abstractC32479OooO0OO);
            }
        }
        Object objO00Oo0 = c32655OooO0OO.f117347OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32655OooO0OO.f117350OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objO00Oo0);
            c32654OooO0O03 = c32654OooO0O0;
            selector2 = abstractSelector;
        } else if (i2 == 1) {
            Selector selector3 = c32655OooO0OO.f117348OooOoO0;
            c32662OooO0oo = c32655OooO0OO.f117345OooOo;
            C32654OooO0O0 c32654OooO0O04 = c32655OooO0OO.f117346OooOo0o;
            C32446OooOOOo.OooO0O0(objO00Oo0);
            selector = selector3;
            c32654OooO0O02 = c32654OooO0O04;
            if (((Number) objO00Oo0).intValue() <= 0) {
                OooOO0O oooOO0O = (OooOO0O) c32662OooO0oo.OooO0Oo();
                if (oooOO0O == null) {
                    c32655OooO0OO.f117346OooOo0o = c32654OooO0O02;
                    c32655OooO0OO.f117345OooOo = c32662OooO0oo;
                    c32655OooO0OO.f117348OooOoO0 = selector;
                    c32655OooO0OO.f117350OooOoo0 = 2;
                    c32654OooO0O03 = c32654OooO0O02;
                    selector2 = selector;
                    if (C20901OooOOo0.OooO0o(c32655OooO0OO) != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                c32654OooO0O02.OooO00o(selector, oooOO0O);
                c32654OooO0O03 = c32654OooO0O02;
                selector2 = selector;
            } else {
                Set<SelectionKey> setSelectedKeys = selector.selectedKeys();
                kotlin.jvm.internal.OooOOO0.OooO0o(setSelectedKeys, "selector.selectedKeys()");
                Set<SelectionKey> setKeys = selector.keys();
                kotlin.jvm.internal.OooOOO0.OooO0o(setKeys, "selector.keys()");
                c32654OooO0O02.OooOooo(setSelectedKeys, setKeys);
                c32654OooO0O03 = c32654OooO0O02;
                selector2 = selector;
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Selector selector4 = c32655OooO0OO.f117348OooOoO0;
                c32662OooO0oo = c32655OooO0OO.f117345OooOo;
                C32654OooO0O0 c32654OooO0O05 = c32655OooO0OO.f117346OooOo0o;
                C32446OooOOOo.OooO0O0(objO00Oo0);
                selector2 = selector4;
                c32654OooO0O03 = c32654OooO0O05;
                OooOO0O oooOO0O2 = (OooOO0O) objO00Oo0;
                if (oooOO0O2 != null) {
                    c32654OooO0O03.OooO00o(selector2, oooOO0O2);
                    c32654OooO0O03 = c32654OooO0O03;
                    selector2 = selector2;
                }
                return C32460OooOooO.f116667OooO00o;
            }
            Selector selector5 = c32655OooO0OO.f117348OooOoO0;
            c32662OooO0oo = c32655OooO0OO.f117345OooOo;
            C32654OooO0O0 c32654OooO0O06 = c32655OooO0OO.f117346OooOo0o;
            C32446OooOOOo.OooO0O0(objO00Oo0);
            selector2 = selector5;
            c32654OooO0O03 = c32654OooO0O06;
        }
        while (!c32654OooO0O03.closed) {
            while (true) {
                OooOO0O oooOO0O3 = (OooOO0O) c32662OooO0oo.OooO0Oo();
                if (oooOO0O3 == null) {
                    break;
                }
                c32654OooO0O03.OooO00o(selector2, oooOO0O3);
            }
            if (c32654OooO0O03.f117378OooOo > 0) {
                c32655OooO0OO.f117346OooOo0o = c32654OooO0O03;
                c32655OooO0OO.f117345OooOo = c32662OooO0oo;
                c32655OooO0OO.f117348OooOoO0 = selector2;
                c32655OooO0OO.f117350OooOoo0 = 1;
                objO00Oo0 = c32654OooO0O03.o00Oo0(selector2, c32655OooO0OO);
                c32654OooO0O02 = c32654OooO0O03;
                selector = selector2;
                if (objO00Oo0 != enumC32485OooO00o) {
                    if (((Number) objO00Oo0).intValue() <= 0) {
                    }
                    while (!c32654OooO0O03.closed) {
                    }
                }
            } else if (c32654OooO0O03.f117380OooOoO0 > 0) {
                selector2.selectNow();
                if (c32654OooO0O03.f117378OooOo > 0) {
                    Set<SelectionKey> setSelectedKeys2 = selector2.selectedKeys();
                    kotlin.jvm.internal.OooOOO0.OooO0o(setSelectedKeys2, "selector.selectedKeys()");
                    Set<SelectionKey> setKeys2 = selector2.keys();
                    kotlin.jvm.internal.OooOOO0.OooO0o(setKeys2, "selector.keys()");
                    c32654OooO0O03.OooOooo(setSelectedKeys2, setKeys2);
                } else {
                    c32654OooO0O03.f117380OooOoO0 = 0;
                }
            } else {
                c32655OooO0OO.f117346OooOo0o = c32654OooO0O03;
                c32655OooO0OO.f117345OooOo = c32662OooO0oo;
                c32655OooO0OO.f117348OooOoO0 = selector2;
                c32655OooO0OO.f117350OooOoo0 = 3;
                objO00Oo0 = (OooOO0O) c32662OooO0oo.OooO0Oo();
                if (objO00Oo0 == null) {
                    objO00Oo0 = c32654OooO0O03.ooOO(c32662OooO0oo, c32655OooO0OO);
                }
            }
            return enumC32485OooO00o;
        }
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return this.f117342OooOoo;
    }

    public final void Oooo0OO(AbstractC32223OooOOOo abstractC32223OooOOOo) {
        SelectionKey selectionKeyKeyFor;
        OooOOO.OooOOoo(abstractC32223OooOOOo, new ClosedChannelException());
        Selector selector = this.selectorRef;
        if (selector == null || (selectionKeyKeyFor = abstractC32223OooOOOo.getChannel().keyFor(selector)) == null) {
            return;
        }
        selectionKeyKeyFor.cancel();
        o0Oo0oo();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.closed = true;
        this.f117343OooOoo0.OooO0O0();
        OooO00o<C32460OooOooO, Continuation<C32460OooOooO>> oooO00o = this.f117341OooOoOO;
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        Continuation continuation = (Continuation) oooO00o.f117344OooO00o.getAndSet(null);
        if (continuation == null) {
            o0Oo0oo();
        } else {
            continuation.resumeWith(c32460OooOooO);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00Oo0(Selector selector, AbstractC32479OooO0OO abstractC32479OooO0OO) throws IOException {
        C32658OooO0o0 c32658OooO0o0;
        C32654OooO0O0 c32654OooO0O0;
        int iSelectNow;
        if (abstractC32479OooO0OO instanceof C32658OooO0o0) {
            c32658OooO0o0 = (C32658OooO0o0) abstractC32479OooO0OO;
            int i = c32658OooO0o0.f117360OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32658OooO0o0.f117360OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c32658OooO0o0 = new C32658OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c32658OooO0o0.f117359OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32658OooO0o0.f117360OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.inSelect = true;
            c32658OooO0o0.f117357OooOo0o = this;
            c32658OooO0o0.f117356OooOo = selector;
            c32658OooO0o0.f117360OooOoOO = 1;
            if (C20901OooOOo0.OooO0o(c32658OooO0o0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c32654OooO0O0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            selector = c32658OooO0o0.f117356OooOo;
            c32654OooO0O0 = c32658OooO0o0.f117357OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (c32654OooO0O0.f117340OooOoO.get() == 0) {
            iSelectNow = selector.select(500L);
            c32654OooO0O0.inSelect = false;
        } else {
            c32654OooO0O0.inSelect = false;
            c32654OooO0O0.f117340OooOoO.set(0L);
            iSelectNow = selector.selectNow();
        }
        return new Integer(iSelectNow);
    }

    public final void o0Oo0oo() {
        Selector selector;
        if (this.f117340OooOoO.incrementAndGet() == 1 && this.inSelect && (selector = this.selectorRef) != null) {
            selector.wakeup();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ooOO(C32662OooO0oo c32662OooO0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C32656OooO0Oo c32656OooO0Oo;
        C32654OooO0O0 c32654OooO0O0;
        Object obj;
        if (abstractC32479OooO0OO instanceof C32656OooO0Oo) {
            c32656OooO0Oo = (C32656OooO0Oo) abstractC32479OooO0OO;
            int i = c32656OooO0Oo.f117355OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32656OooO0Oo.f117355OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c32656OooO0Oo = new C32656OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj2 = c32656OooO0Oo.f117354OooOoO0;
        Object obj3 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32656OooO0Oo.f117355OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            c32654OooO0O0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c32662OooO0oo = c32656OooO0Oo.f117351OooOo;
            c32654OooO0O0 = c32656OooO0Oo.f117352OooOo0o;
            C32446OooOOOo.OooO0O0(obj2);
        }
        do {
            OooOO0O oooOO0O = (OooOO0O) c32662OooO0oo.OooO0Oo();
            if (oooOO0O != null) {
                return oooOO0O;
            }
            obj = null;
            if (c32654OooO0O0.closed) {
                return null;
            }
            c32656OooO0Oo.f117352OooOo0o = c32654OooO0O0;
            c32656OooO0Oo.f117351OooOo = c32662OooO0oo;
            c32656OooO0Oo.f117355OooOoOO = 1;
            OooO00o<C32460OooOooO, Continuation<C32460OooOooO>> oooO00o = c32654OooO0O0.f117341OooOoOO;
            if (c32662OooO0oo.OooO0OO() && !c32654OooO0O0.closed) {
                AtomicReference<C> atomicReference = oooO00o.f117344OooO00o;
                while (!atomicReference.compareAndSet(null, c32656OooO0Oo)) {
                    if (atomicReference.get() != null) {
                        throw new IllegalStateException("Continuation is already set");
                    }
                }
                if (c32662OooO0oo.OooO0OO() && !c32654OooO0O0.closed) {
                    obj = EnumC32485OooO00o.f116726OooOo0o;
                    break;
                }
                AtomicReference<C> atomicReference2 = oooO00o.f117344OooO00o;
                while (!atomicReference2.compareAndSet(c32656OooO0Oo, null)) {
                    if (atomicReference2.get() != c32656OooO0Oo) {
                        obj = EnumC32485OooO00o.f116726OooOo0o;
                        break;
                    }
                }
            }
            if (obj == null) {
                obj = C32460OooOooO.f116667OooO00o;
            }
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        } while (obj != obj3);
        return obj3;
    }
}
