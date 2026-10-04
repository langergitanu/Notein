package oO000o0;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import oO000oo.C32132OooO0Oo;
import oO000oo.C32133OooO0o;
import oO000oo.C32136OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OoO.C32709OooO0O0;
import oO0Oo0Oo.C33199OooO0O0;
import oO0Oo0Oo.C33205OooO0oo;
import oO0Ooo0O.C33376OooO00o;
import oO0Ooo0O.C33382OooO0oO;
import oO0Ooo0O.C33383OooO0oo;
import oO0Ooo0O.C33393OooOOoo;
import oO0Ooo0O.C33398OooOo0o;
import oO0Ooo0O.C33399OooOoO;
import oO0Ooo0O.C33400OooOoO0;
import oO0Ooo0O.C33408Oooo000;
import oO0Ooo0O.C33412Oooo0OO;
import oO0Ooo0O.C33416Oooo0oo;
import oO0o0OO.C33671o00oO0o;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oOO00OOo.InterfaceC34352OooO0O0;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo00Oo0.C34502OooO00o;
import oOo00Oo0.InterfaceC34503OooO0O0;
import oOo00Oo0.OooOOO0;
import ooOOooOo.C35183OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o implements InterfaceC33636Oooo00o, Closeable {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f114949Oooo00o = AtomicIntegerFieldUpdater.newUpdater(OooO0o.class, "closed");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final boolean f114950OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO000o.OooO0O0 f114951OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f114952OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C33671o00oO0o f114953OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C32133OooO0o f114954OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C32136OooO0oo f114955OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C33205OooO0oo f114956OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C33199OooO0O0 f114957OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final OooOOO0 f114958OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C35183OooO00o f114959Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C32093OooO0oO<oO000o.OooO> f114960Oooo00O;
    private volatile /* synthetic */ int closed;

    public OooO0o() {
        throw null;
    }

    public OooO0o(oO000o.OooO0O0 engine, C32093OooO0oO<? extends oO000o.OooO> c32093OooO0oO, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(engine, "engine");
        this.f114951OooOo0o = engine;
        this.closed = 0;
        C33671o00oO0o c33671o00oO0o = new C33671o00oO0o((InterfaceC33672o00ooo) engine.OooOOO0().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o));
        this.f114953OooOoO0 = c33671o00oO0o;
        this.f114952OooOoO = engine.OooOOO0().plus(c33671o00oO0o);
        this.f114954OooOoOO = new C32133OooO0o(c32093OooO0oO.f114970OooO0oO);
        this.f114956OooOoo0 = new C33205OooO0oo(c32093OooO0oO.f114970OooO0oO);
        C32136OooO0oo c32136OooO0oo = new C32136OooO0oo(c32093OooO0oO.f114970OooO0oO);
        this.f114955OooOoo = c32136OooO0oo;
        this.f114957OooOooO = new C33199OooO0O0(c32093OooO0oO.f114970OooO0oO);
        this.f114958OooOooo = new OooOOO0();
        this.f114959Oooo000 = new C35183OooO00o();
        C32093OooO0oO<oO000o.OooO> c32093OooO0oO2 = new C32093OooO0oO<>();
        this.f114960Oooo00O = c32093OooO0oO2;
        if (this.f114950OooOo) {
            c33671o00oO0o.invokeOnCompletion(new C32088OooO00o(this));
        }
        engine.OooOooO(this);
        c32136OooO0oo.OooO0o(C32136OooO0oo.f115233OooOO0, new C32089OooO0O0(this, null));
        C33412Oooo0OO.OooO00o oooO00o = C33412Oooo0OO.f120796OooO00o;
        C32094OooO0oo c32094OooO0oo = C32094OooO0oo.f114975OooOo0o;
        c32093OooO0oO2.OooO00o(oooO00o, c32094OooO0oo);
        c32093OooO0oO2.OooO00o(C33376OooO00o.f120675OooO00o, c32094OooO0oo);
        if (c32093OooO0oO.f114968OooO0o) {
            C32090OooO0OO block = C32090OooO0OO.f114945OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(block, "block");
            c32093OooO0oO2.f114966OooO0OO.put("DefaultTransformers", block);
        }
        c32093OooO0oO2.OooO00o(C33416Oooo0oo.f120800OooO0O0, c32094OooO0oo);
        C33393OooOOoo.OooO00o oooO00o2 = C33393OooOOoo.f120724OooO0Oo;
        c32093OooO0oO2.OooO00o(oooO00o2, c32094OooO0oo);
        if (c32093OooO0oO.f114969OooO0o0) {
            c32093OooO0oO2.OooO00o(C33408Oooo000.f120773OooO00o, c32094OooO0oo);
        }
        c32093OooO0oO2.f114969OooO0o0 = c32093OooO0oO.f114969OooO0o0;
        c32093OooO0oO2.f114968OooO0o = c32093OooO0oO.f114968OooO0o;
        c32093OooO0oO2.f114964OooO00o.putAll(c32093OooO0oO.f114964OooO00o);
        c32093OooO0oO2.f114965OooO0O0.putAll(c32093OooO0oO.f114965OooO0O0);
        c32093OooO0oO2.f114966OooO0OO.putAll(c32093OooO0oO.f114966OooO0OO);
        if (c32093OooO0oO.f114968OooO0o) {
            c32093OooO0oO2.OooO00o(C33399OooOoO.f120749OooO0Oo, c32094OooO0oo);
        }
        C34502OooO00o<C32460OooOooO> c34502OooO00o = C33383OooO0oo.f120690OooO00o;
        C33382OooO0oO c33382OooO0oO = new C33382OooO0oO(1);
        InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = C33398OooOo0o.f120747OooO00o;
        c32093OooO0oO2.OooO00o(oooO00o2, c33382OooO0oO);
        Iterator it = c32093OooO0oO2.f114964OooO00o.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC32507OooOO0o) it.next()).invoke(this);
        }
        Iterator it2 = c32093OooO0oO2.f114966OooO0OO.values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC32507OooOO0o) it2.next()).invoke(this);
        }
        this.f114956OooOoo0.OooO0o(C33205OooO0oo.f120159OooO0o, new C32091OooO0Oo(this, null));
        this.f114950OooOo = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(C32132OooO0Oo c32132OooO0Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C32092OooO0o0 c32092OooO0o0;
        if (abstractC32479OooO0OO instanceof C32092OooO0o0) {
            c32092OooO0o0 = (C32092OooO0o0) abstractC32479OooO0OO;
            int i = c32092OooO0o0.f114963OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32092OooO0o0.f114963OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c32092OooO0o0 = new C32092OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c32092OooO0o0.f114962OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32092OooO0o0.f114963OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            this.f114959Oooo000.OooO00o(C32709OooO0O0.f117611OooO00o);
            Object obj = c32132OooO0Oo.f115206OooO0Oo;
            c32092OooO0o0.f114963OooOoO0 = 1;
            objOooO00o = this.f114954OooOoOO.OooO00o(c32132OooO0Oo, obj, c32092OooO0o0);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(objOooO00o, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
        return (ooOOOOOo.OooO0OO) objOooO00o;
    }

    @Override // oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return this.f114952OooOoO;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (f114949Oooo00o.compareAndSet(this, 0, 1)) {
            InterfaceC34503OooO0O0 interfaceC34503OooO0O0 = (InterfaceC34503OooO0O0) this.f114958OooOooo.OooO0o(C33400OooOoO0.f120757OooO00o);
            Iterator<T> it = interfaceC34503OooO0O0.OooO00o().iterator();
            while (it.hasNext()) {
                C34502OooO00o c34502OooO00o = (C34502OooO00o) it.next();
                kotlin.jvm.internal.OooOOO0.OooO0o0(c34502OooO00o, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object objOooO0o = interfaceC34503OooO0O0.OooO0o(c34502OooO00o);
                if (objOooO0o instanceof Closeable) {
                    ((Closeable) objOooO0o).close();
                }
            }
            this.f114953OooOoO0.complete();
            if (this.f114950OooOo) {
                this.f114951OooOo0o.close();
            }
        }
    }

    public final String toString() {
        return "HttpClient[" + this.f114951OooOo0o + ']';
    }
}
