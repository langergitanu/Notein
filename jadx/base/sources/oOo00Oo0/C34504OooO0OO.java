package oOo00Oo0;

import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import java.io.Closeable;
import kotlin.coroutines.Continuation;
import oO00Oo0.C32266OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: oOo00Oo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.util.ByteChannelsKt$copyToBoth$1", m80623f = "ByteChannels.kt", m80624l = {58, 60, 61}, m80625m = "invokeSuspend")
public final class C34504OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC23990Oooooo f123652OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Closeable f123653OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public InterfaceC23986Ooooo0o f123654OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC23990Oooooo f123655OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C32266OooO0Oo f123656OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f123657OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f123658OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23986Ooooo0o f123659OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.p616io.OooO00o f123660OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.p616io.OooO00o f123661Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34504OooO0OO(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, io.ktor.utils.p616io.OooO00o oooO00o, io.ktor.utils.p616io.OooO00o oooO00o2, Continuation continuation) {
        super(2, continuation);
        this.f123659OooOooO = interfaceC23986Ooooo0o;
        this.f123660OooOooo = oooO00o;
        this.f123661Oooo000 = oooO00o2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C34504OooO0OO(this.f123659OooOooO, this.f123660OooOooo, this.f123661Oooo000, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C34504OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:75|34|73|35|(4:38|88|39|(10:42|43|52|24|(2:26|28)|62|(0)|64|68|69))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
    
        r9 = r2;
        r10 = r3;
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        r15 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[Catch: all -> 0x0053, TryCatch #2 {all -> 0x0053, blocks: (B:52:0x00db, B:24:0x0059, B:26:0x005f, B:28:0x0065, B:30:0x006b, B:33:0x0080, B:61:0x00eb, B:62:0x00ec, B:65:0x00f9, B:19:0x004f, B:34:0x0083, B:51:0x00d2, B:55:0x00e1, B:59:0x00e9, B:58:0x00e6), top: B:77:0x004f, inners: #1, #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f9 A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0053, blocks: (B:52:0x00db, B:24:0x0059, B:26:0x005f, B:28:0x0065, B:30:0x006b, B:33:0x0080, B:61:0x00eb, B:62:0x00ec, B:65:0x00f9, B:19:0x004f, B:34:0x0083, B:51:0x00d2, B:55:0x00e1, B:59:0x00e9, B:58:0x00e6), top: B:77:0x004f, inners: #1, #4, #7 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c4 -> B:43:0x00c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00d2 -> B:52:0x00db). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Closeable closeable;
        InterfaceC23990Oooooo interfaceC23990Oooooo;
        InterfaceC23990Oooooo interfaceC23990Oooooo2;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o;
        int i;
        InterfaceC23990Oooooo interfaceC23990Oooooo3;
        C32266OooO0Oo c32266OooO0Oo;
        C32266OooO0Oo c32266OooO0OoO0000oO;
        C32266OooO0Oo c32266OooO0OoO0000oO2;
        Throwable thOooO0O0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f123657OooOoo;
        io.ktor.utils.p616io.OooO00o oooO00o = this.f123661Oooo000;
        io.ktor.utils.p616io.OooO00o oooO00o2 = this.f123660OooOooo;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o2 = this.f123659OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (interfaceC23986Ooooo0o2.OooOoo()) {
            }
            thOooO0O0 = interfaceC23986Ooooo0o2.OooO0O0();
            if (thOooO0O0 != null) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                int i3 = this.f123658OooOoo0;
                C32266OooO0Oo c32266OooO0Oo2 = this.f123656OooOoOO;
                InterfaceC23986Ooooo0o interfaceC23986Ooooo0o3 = this.f123654OooOoO;
                InterfaceC23990Oooooo interfaceC23990Oooooo4 = this.f123655OooOoO0;
                interfaceC23990Oooooo3 = this.f123652OooOo;
                Closeable closeable2 = this.f123653OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    i = i3;
                    interfaceC23986Ooooo0o = interfaceC23986Ooooo0o3;
                    c32266OooO0Oo = c32266OooO0Oo2;
                    interfaceC23990Oooooo2 = interfaceC23990Oooooo4;
                    closeable = closeable2;
                } catch (Throwable th) {
                    th = th;
                    interfaceC23986Ooooo0o = interfaceC23986Ooooo0o3;
                    interfaceC23990Oooooo2 = interfaceC23990Oooooo4;
                    interfaceC23990Oooooo = interfaceC23990Oooooo3;
                    closeable = closeable2;
                    interfaceC23986Ooooo0o.cancel(th);
                    interfaceC23990Oooooo.OooO0Oo(th);
                    interfaceC23990Oooooo2.OooO0Oo(th);
                    closeable.close();
                    if (interfaceC23986Ooooo0o2.OooOoo()) {
                    }
                    thOooO0O0 = interfaceC23986Ooooo0o2.OooO0O0();
                    if (thOooO0O0 != null) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                c32266OooO0OoO0000oO = c32266OooO0Oo.o0000oO();
                this.f123653OooOo0o = closeable;
                this.f123652OooOo = interfaceC23990Oooooo3;
                this.f123655OooOoO0 = interfaceC23990Oooooo2;
                this.f123654OooOoO = interfaceC23986Ooooo0o;
                this.f123656OooOoOO = null;
                this.f123658OooOoo0 = i;
                this.f123657OooOoo = 3;
                if (interfaceC23990Oooooo2.OooOO0(c32266OooO0OoO0000oO, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC23986Ooooo0o = this.f123654OooOoO;
            interfaceC23990Oooooo2 = this.f123655OooOoO0;
            interfaceC23990Oooooo = this.f123652OooOo;
            closeable = this.f123653OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (Throwable th2) {
                th = th2;
                interfaceC23986Ooooo0o.cancel(th);
                interfaceC23990Oooooo.OooO0Oo(th);
                interfaceC23990Oooooo2.OooO0Oo(th);
                closeable.close();
                if (interfaceC23986Ooooo0o2.OooOoo()) {
                }
                thOooO0O0 = interfaceC23986Ooooo0o2.OooO0O0();
                if (thOooO0O0 != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            closeable.close();
            if (!interfaceC23986Ooooo0o2.OooOoo() || (oooO00o2.OoooO0() && oooO00o.OoooO0())) {
                thOooO0O0 = interfaceC23986Ooooo0o2.OooO0O0();
                if (thOooO0O0 != null) {
                    throw thOooO0O0;
                }
                return C32460OooOooO.f116667OooO00o;
            }
            this.f123653OooOo0o = null;
            this.f123652OooOo = null;
            this.f123655OooOoO0 = null;
            this.f123654OooOoO = null;
            this.f123656OooOoOO = null;
            this.f123657OooOoo = 1;
            obj = interfaceC23986Ooooo0o2.OooOo0O(4096L, this);
            if (obj != enumC32485OooO00o) {
                closeable = (Closeable) obj;
                try {
                    C32266OooO0Oo c32266OooO0Oo3 = (C32266OooO0Oo) closeable;
                    c32266OooO0OoO0000oO2 = c32266OooO0Oo3.o0000oO();
                    this.f123653OooOo0o = closeable;
                    this.f123652OooOo = oooO00o2;
                    this.f123655OooOoO0 = oooO00o;
                    this.f123654OooOoO = interfaceC23986Ooooo0o2;
                    this.f123656OooOoOO = c32266OooO0Oo3;
                    this.f123658OooOoo0 = 0;
                    this.f123657OooOoo = 2;
                    if (oooO00o2.OooOO0(c32266OooO0OoO0000oO2, this) != enumC32485OooO00o) {
                        i = 0;
                        interfaceC23990Oooooo3 = oooO00o2;
                        interfaceC23986Ooooo0o = interfaceC23986Ooooo0o2;
                        c32266OooO0Oo = c32266OooO0Oo3;
                        interfaceC23990Oooooo2 = oooO00o;
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                            interfaceC23990Oooooo = interfaceC23990Oooooo3;
                            interfaceC23986Ooooo0o.cancel(th);
                            interfaceC23990Oooooo.OooO0Oo(th);
                            interfaceC23990Oooooo2.OooO0Oo(th);
                            closeable.close();
                            if (interfaceC23986Ooooo0o2.OooOoo()) {
                            }
                            thOooO0O0 = interfaceC23986Ooooo0o2.OooO0O0();
                            if (thOooO0O0 != null) {
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                        c32266OooO0OoO0000oO = c32266OooO0Oo.o0000oO();
                        this.f123653OooOo0o = closeable;
                        this.f123652OooOo = interfaceC23990Oooooo3;
                        this.f123655OooOoO0 = interfaceC23990Oooooo2;
                        this.f123654OooOoO = interfaceC23986Ooooo0o;
                        this.f123656OooOoOO = null;
                        this.f123658OooOoo0 = i;
                        this.f123657OooOoo = 3;
                        if (interfaceC23990Oooooo2.OooOO0(c32266OooO0OoO0000oO, this) != enumC32485OooO00o) {
                            interfaceC23990Oooooo = interfaceC23990Oooooo3;
                            C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                            closeable.close();
                            if (interfaceC23986Ooooo0o2.OooOoo()) {
                            }
                            thOooO0O0 = interfaceC23986Ooooo0o2.OooO0O0();
                            if (thOooO0O0 != null) {
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                    }
                } finally {
                }
            }
            return enumC32485OooO00o;
        }
        try {
            C32446OooOOOo.OooO0O0(obj);
            closeable = (Closeable) obj;
            C32266OooO0Oo c32266OooO0Oo32 = (C32266OooO0Oo) closeable;
            c32266OooO0OoO0000oO2 = c32266OooO0Oo32.o0000oO();
            this.f123653OooOo0o = closeable;
            this.f123652OooOo = oooO00o2;
            this.f123655OooOoO0 = oooO00o;
            this.f123654OooOoO = interfaceC23986Ooooo0o2;
            this.f123656OooOoOO = c32266OooO0Oo32;
            this.f123658OooOoo0 = 0;
            this.f123657OooOoo = 2;
            if (oooO00o2.OooOO0(c32266OooO0OoO0000oO2, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        } finally {
            try {
            } finally {
            }
        }
    }
}
