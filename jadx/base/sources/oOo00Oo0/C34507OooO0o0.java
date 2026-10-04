package oOo00Oo0;

import Oooo0.C20857Oooooo;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.io.Closeable;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00Oo0.C32266OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: oOo00Oo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.util.ByteChannelsKt$split$1", m80623f = "ByteChannels.kt", m80624l = {24, 28}, m80625m = "invokeSuspend")
public final class C34507OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f123666OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Closeable f123667OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23986Ooooo0o f123668OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f123669OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.p616io.OooO00o f123670OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.p616io.OooO00o f123671OooOoo0;

    /* JADX INFO: renamed from: oOo00Oo0.OooO0o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "io.ktor.util.ByteChannelsKt$split$1$1$1", m80623f = "ByteChannels.kt", m80624l = {26}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.p616io.OooO00o f123672OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f123673OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C32266OooO0Oo f123674OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(io.ktor.utils.p616io.OooO00o oooO00o, C32266OooO0Oo c32266OooO0Oo, Continuation continuation) {
            super(2, continuation);
            this.f123672OooOo = oooO00o;
            this.f123674OooOoO0 = c32266OooO0Oo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f123672OooOo, this.f123674OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f123673OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C32266OooO0Oo c32266OooO0OoO0000oO = this.f123674OooOoO0.o0000oO();
                this.f123673OooOo0o = 1;
                if (this.f123672OooOo.OooOO0(c32266OooO0OoO0000oO, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: oOo00Oo0.OooO0o0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "io.ktor.util.ByteChannelsKt$split$1$1$2", m80623f = "ByteChannels.kt", m80624l = {27}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.p616io.OooO00o f123675OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f123676OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C32266OooO0Oo f123677OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(io.ktor.utils.p616io.OooO00o oooO00o, C32266OooO0Oo c32266OooO0Oo, Continuation continuation) {
            super(2, continuation);
            this.f123675OooOo = oooO00o;
            this.f123677OooOoO0 = c32266OooO0Oo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f123675OooOo, this.f123677OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f123676OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C32266OooO0Oo c32266OooO0OoO0000oO = this.f123677OooOoO0.o0000oO();
                this.f123676OooOo0o = 1;
                if (this.f123675OooOo.OooOO0(c32266OooO0OoO0000oO, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34507OooO0o0(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, io.ktor.utils.p616io.OooO00o oooO00o, io.ktor.utils.p616io.OooO00o oooO00o2, Continuation continuation) {
        super(2, continuation);
        this.f123668OooOoO = interfaceC23986Ooooo0o;
        this.f123670OooOoOO = oooO00o;
        this.f123671OooOoo0 = oooO00o2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C34507OooO0o0 c34507OooO0o0 = new C34507OooO0o0(this.f123668OooOoO, this.f123670OooOoOO, this.f123671OooOoo0, continuation);
        c34507OooO0o0.f123669OooOoO0 = obj;
        return c34507OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C34507OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r13 != r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:30:0x008c, B:19:0x003d, B:21:0x0043, B:25:0x0054, B:39:0x009c, B:42:0x00a9, B:38:0x009b, B:14:0x002e, B:32:0x0091, B:36:0x0099, B:35:0x0096, B:7:0x001b, B:29:0x008a, B:26:0x0057), top: B:50:0x000d, inners: #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:30:0x008c, B:19:0x003d, B:21:0x0043, B:25:0x0054, B:39:0x009c, B:42:0x00a9, B:38:0x009b, B:14:0x002e, B:32:0x0091, B:36:0x0099, B:35:0x0096, B:7:0x001b, B:29:0x008a, B:26:0x0057), top: B:50:0x000d, inners: #1, #3, #4 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0087 -> B:29:0x008a). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        Closeable closeable;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f123666OooOo;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o = this.f123668OooOoO;
        io.ktor.utils.p616io.OooO00o oooO00o = this.f123671OooOoo0;
        io.ktor.utils.p616io.OooO00o oooO00o2 = this.f123670OooOoOO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f123669OooOoO0;
                if (interfaceC23986Ooooo0o.OooOoo()) {
                }
            } else if (i == 1) {
                InterfaceC33636Oooo00o interfaceC33636Oooo00o3 = (InterfaceC33636Oooo00o) this.f123669OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33636Oooo00o2 = interfaceC33636Oooo00o3;
                closeable = (Closeable) obj;
                C32266OooO0Oo c32266OooO0Oo = (C32266OooO0Oo) closeable;
                List listOooOO0o = C34429OooOOo0.OooOO0o(C33609OooO0oo.OooO00o(interfaceC33636Oooo00o2, null, new OooO00o(oooO00o2, c32266OooO0Oo, null), 3), C33609OooO0oo.OooO00o(interfaceC33636Oooo00o2, null, new OooO0O0(oooO00o, c32266OooO0Oo, null), 3));
                this.f123669OooOoO0 = interfaceC33636Oooo00o2;
                this.f123667OooOo0o = closeable;
                this.f123666OooOo = 2;
                obj = C20857Oooooo.OooO00o(listOooOO0o, this);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = this.f123667OooOo0o;
                interfaceC33636Oooo00o2 = (InterfaceC33636Oooo00o) this.f123669OooOoO0;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    closeable.close();
                    interfaceC33636Oooo00o = interfaceC33636Oooo00o2;
                    if (interfaceC23986Ooooo0o.OooOoo()) {
                        this.f123669OooOoO0 = interfaceC33636Oooo00o;
                        this.f123667OooOo0o = null;
                        this.f123666OooOo = 1;
                        Object objOooOo0O = interfaceC23986Ooooo0o.OooOo0O(4096L, this);
                        if (objOooOo0O == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                        interfaceC33636Oooo00o2 = interfaceC33636Oooo00o;
                        obj = objOooOo0O;
                        closeable = (Closeable) obj;
                        C32266OooO0Oo c32266OooO0Oo2 = (C32266OooO0Oo) closeable;
                        List listOooOO0o2 = C34429OooOOo0.OooOO0o(C33609OooO0oo.OooO00o(interfaceC33636Oooo00o2, null, new OooO00o(oooO00o2, c32266OooO0Oo2, null), 3), C33609OooO0oo.OooO00o(interfaceC33636Oooo00o2, null, new OooO0O0(oooO00o, c32266OooO0Oo2, null), 3));
                        this.f123669OooOoO0 = interfaceC33636Oooo00o2;
                        this.f123667OooOo0o = closeable;
                        this.f123666OooOo = 2;
                        obj = C20857Oooooo.OooO00o(listOooOO0o2, this);
                    } else {
                        Throwable thOooO0O0 = interfaceC23986Ooooo0o.OooO0O0();
                        if (thOooO0O0 != null) {
                            throw thOooO0O0;
                        }
                    }
                } finally {
                }
            }
        } finally {
            try {
            } finally {
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
