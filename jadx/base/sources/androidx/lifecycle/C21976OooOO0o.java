package androidx.lifecycle;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33662Ooooooo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;

/* JADX INFO: renamed from: androidx.lifecycle.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", m80623f = "FlowLiveData.kt", m80624l = {112, 116}, m80625m = "invokeSuspend")
public final class C21976OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<Object>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f65521OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooOO0O f65522OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C21995Oooo0O0 f65523OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f65524OooOoO0;

    /* JADX INFO: renamed from: androidx.lifecycle.OooOO0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", m80623f = "FlowLiveData.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f65525OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C21995Oooo0O0 f65526OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C21995Oooo0O0 c21995Oooo0O0, OooOO0O oooOO0O, Continuation continuation) {
            super(2, continuation);
            this.f65526OooOo0o = c21995Oooo0O0;
            this.f65525OooOo = oooOO0O;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f65526OooOo0o, this.f65525OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            this.f65526OooOo0o.OooO0o0(this.f65525OooOo);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.OooOO0o$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21998Oooo0o0<Object> f65527OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C21995Oooo0O0 f65528OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C21995Oooo0O0 c21995Oooo0O0, InterfaceC21998Oooo0o0 interfaceC21998Oooo0o0) {
            super(0);
            this.f65528OooOo0o = c21995Oooo0O0;
            this.f65527OooOo = interfaceC21998Oooo0o0;
        }

        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            C33662Ooooooo c33662Ooooooo = C33662Ooooooo.f121350OooOo0o;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(c33662Ooooooo, C33833OooOOOO.f121946OooO00o.o000OOoO(), null, new OooOOO0(this.f65528OooOo0o, this.f65527OooOo, null), 2);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21976OooOO0o(C21995Oooo0O0 c21995Oooo0O0, Continuation continuation) {
        super(2, continuation);
        this.f65523OooOoO = c21995Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C21976OooOO0o c21976OooOO0o = new C21976OooOO0o(this.f65523OooOoO, continuation);
        c21976OooOO0o.f65524OooOoO0 = obj;
        return c21976OooOO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33712OooOo0O<Object> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((C21976OooOO0o) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        if (oO0o0OOo.C33711OooOo00.OooO00o(r4, r9, r8) == r0) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.OooOO0O] */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.lifecycle.Oooo0o0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33712OooOo0O interfaceC33712OooOo0O;
        ?? r1;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f65521OooOo;
        C21995Oooo0O0 c21995Oooo0O0 = this.f65523OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            final InterfaceC33712OooOo0O interfaceC33712OooOo0O2 = (InterfaceC33712OooOo0O) this.f65524OooOoO0;
            ?? r12 = new InterfaceC21998Oooo0o0() { // from class: androidx.lifecycle.OooOO0O
                @Override // androidx.lifecycle.InterfaceC21998Oooo0o0
                public final void OooO0O0(Object obj2) {
                    interfaceC33712OooOo0O2.OooO0o0(obj2);
                }
            };
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oOO000OOoO = C33833OooOOOO.f121946OooO00o.o000OOoO();
            OooO00o oooO00o = new OooO00o(c21995Oooo0O0, r12, null);
            this.f65524OooOoO0 = interfaceC33712OooOo0O2;
            this.f65522OooOo0o = r12;
            this.f65521OooOo = 1;
            if (C33609OooO0oo.OooO0o(abstractC33687OooO0oOO000OOoO, oooO00o, this) != enumC32485OooO00o) {
                interfaceC33712OooOo0O = interfaceC33712OooOo0O2;
                r1 = r12;
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        OooOO0O oooOO0O = this.f65522OooOo0o;
        interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f65524OooOoO0;
        C32446OooOOOo.OooO0O0(obj);
        r1 = oooOO0O;
        OooO0O0 oooO0O0 = new OooO0O0(c21995Oooo0O0, r1);
        this.f65524OooOoO0 = null;
        this.f65522OooOo0o = null;
        this.f65521OooOo = 2;
    }
}
