package oO000oO0;

import io.ktor.utils.p616io.InterfaceC23967Oooo00O;
import io.ktor.utils.p616io.o000OOo;
import java.io.Closeable;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24033OooOooo;
import oO000oo.C32134OooO0o0;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo00OoO.InterfaceC34525OooO0o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1", m80623f = "OkHttpEngine.kt", m80624l = {165}, m80625m = "invokeSuspend")
public final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o000OOo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC34415OooO0oo f115128OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Closeable f115129OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public InterfaceC34525OooO0o f115130OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C32134OooO0o0 f115131OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C24033OooOooo f115132OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f115133OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f115134OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34525OooO0o f115135OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34415OooO0oo f115136OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ C32134OooO0o0 f115137Oooo000;

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<ByteBuffer, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC34525OooO0o f115138OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C24033OooOooo f115139OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C32134OooO0o0 f115140OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C24033OooOooo c24033OooOooo, InterfaceC34525OooO0o interfaceC34525OooO0o, C32134OooO0o0 c32134OooO0o0) {
            super(1);
            this.f115139OooOo0o = c24033OooOooo;
            this.f115138OooOo = interfaceC34525OooO0o;
            this.f115140OooOoO0 = c32134OooO0o0;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(ByteBuffer byteBuffer) {
            ByteBuffer buffer = byteBuffer;
            kotlin.jvm.internal.OooOOO0.OooO0oO(buffer, "buffer");
            try {
                this.f115139OooOo0o.f80940OooOo0o = this.f115138OooOo.read(buffer);
                return C32460OooOooO.f116667OooO00o;
            } finally {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(InterfaceC34525OooO0o interfaceC34525OooO0o, InterfaceC34415OooO0oo interfaceC34415OooO0oo, C32134OooO0o0 c32134OooO0o0, Continuation<? super OooOO0O> continuation) {
        super(2, continuation);
        this.f115135OooOooO = interfaceC34525OooO0o;
        this.f115136OooOooo = interfaceC34415OooO0oo;
        this.f115137Oooo000 = c32134OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOO0O oooOO0O = new OooOO0O(this.f115135OooOooO, this.f115136OooOooo, this.f115137Oooo000, continuation);
        oooOO0O.f115133OooOoo = obj;
        return oooOO0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(o000OOo o000ooo2, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOO0O) create(o000ooo2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:6:0x001a, B:24:0x006e, B:15:0x003d, B:17:0x0043, B:19:0x0049, B:21:0x004d, B:25:0x0076, B:13:0x0031), top: B:41:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.nio.channels.Channel, oOo00OoO.OooO0o] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006b -> B:24:0x006e). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C32460OooOooO c32460OooOooO;
        Closeable closeable;
        C24033OooOooo c24033OooOooo;
        C32134OooO0o0 c32134OooO0o0;
        o000OOo o000ooo2;
        InterfaceC34415OooO0oo interfaceC34415OooO0oo;
        ?? r4;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f115134OooOoo0;
        Throwable th = null;
        try {
        } catch (Throwable th2) {
            th = th2;
            c32460OooOooO = null;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24033OooOooo = this.f115132OooOoOO;
            InterfaceC34525OooO0o interfaceC34525OooO0o = this.f115130OooOoO;
            c32134OooO0o0 = this.f115131OooOoO0;
            interfaceC34415OooO0oo = this.f115128OooOo;
            closeable = this.f115129OooOo0o;
            o000ooo2 = (o000OOo) this.f115133OooOoo;
            C32446OooOOOo.OooO0O0(obj);
            ?? r42 = interfaceC34525OooO0o;
            o000ooo2.OooO0OO().flush();
            r4 = r42;
            if (r4.isOpen() || !oO00o00.OooO0OO.OooO0o(interfaceC34415OooO0oo) || c24033OooOooo.f80940OooOo0o < 0) {
                c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } else {
                InterfaceC23967Oooo00O interfaceC23967Oooo00OOooO0OO = o000ooo2.OooO0OO();
                OooO00o oooO00o = new OooO00o(c24033OooOooo, r4, c32134OooO0o0);
                this.f115133OooOoo = o000ooo2;
                this.f115129OooOo0o = closeable;
                this.f115128OooOo = interfaceC34415OooO0oo;
                this.f115131OooOoO0 = c32134OooO0o0;
                this.f115130OooOoO = r4;
                this.f115132OooOoOO = c24033OooOooo;
                this.f115134OooOoo0 = 1;
                r42 = r4;
                if (interfaceC23967Oooo00OOooO0OO.OooOo(oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                o000ooo2.OooO0OO().flush();
                r4 = r42;
                if (r4.isOpen()) {
                }
                c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    } else {
                        C32435OooO0Oo.OooO00o(th, th3);
                    }
                }
            }
            if (th == null) {
                throw th;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c32460OooOooO);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        o000OOo o000ooo3 = (o000OOo) this.f115133OooOoo;
        closeable = this.f115135OooOooO;
        c24033OooOooo = new C24033OooOooo();
        InterfaceC34415OooO0oo interfaceC34415OooO0oo2 = this.f115136OooOooo;
        c32134OooO0o0 = this.f115137Oooo000;
        o000ooo2 = o000ooo3;
        interfaceC34415OooO0oo = interfaceC34415OooO0oo2;
        r4 = closeable;
        if (r4.isOpen()) {
        }
        c32460OooOooO = C32460OooOooO.f116667OooO00o;
        if (closeable != null) {
        }
        if (th == null) {
        }
    }
}
