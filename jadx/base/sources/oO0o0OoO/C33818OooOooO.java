package oO0o0OoO;

import kotlin.coroutines.Continuation;
import o0OoOO00.C29023Oooo0o;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Ooo.C33844OooOoO0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OoO.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33818OooOooO<T> implements InterfaceC33723OooO0oO<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Object f121906OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f121907OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO00o f121908OooOoO0;

    /* JADX INFO: renamed from: oO0o0OoO.OooOooO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m80623f = "ChannelFlow.kt", m80624l = {208}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<T, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f121909OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f121910OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO<T> f121911OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(InterfaceC33723OooO0oO<? super T> interfaceC33723OooO0oO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f121911OooOoO0 = interfaceC33723OooO0oO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f121911OooOoO0, continuation);
            oooO00o.f121909OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Object obj, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(obj, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to oO0o0OoO.OooOooO$OooO00o for r3v1 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                oO00ooo0.OooO00o r0 = oO00ooo0.EnumC32485OooO00o.f116726OooOo0o
                int r1 = r3.f121910OooOo0o
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                oO00ooO.C32446OooOOOo.OooO0O0(r4)
                goto L25
            Ld:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L15:
                oO00ooO.C32446OooOOOo.OooO0O0(r4)
                java.lang.Object r4 = r3.f121909OooOo
                r3.f121910OooOo0o = r2
                oO0o0Oo.OooO0oO<T> r1 = r3.f121911OooOoO0
                java.lang.Object r4 = r1.emit(r4, r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                oO00ooO.OooOooO r4 = oO00ooO.C32460OooOooO.f116667OooO00o
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: oO0o0OoO.C33818OooOooO.OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C33818OooOooO(InterfaceC33723OooO0oO<? super T> interfaceC33723OooO0oO, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        this.f121907OooOo0o = interfaceC34415OooO0oo;
        this.f121906OooOo = C33844OooOoO0.OooO0O0(interfaceC34415OooO0oo);
        this.f121908OooOoO0 = new OooO00o(interfaceC33723OooO0oO, null);
    }

    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    public final Object emit(T t, Continuation<? super C32460OooOooO> continuation) {
        Object objOooO00o = C29023Oooo0o.OooO00o(this.f121907OooOo0o, t, this.f121906OooOo, this.f121908OooOoO0, continuation);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }
}
