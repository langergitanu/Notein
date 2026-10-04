package OooOoo;

import OooOoo.C20598OooOO0;
import OooOoo0.C20704o00000Oo;
import OooOoo0.o00000O;
import OooOoo0.o00000OO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: OooOoo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", m80623f = "ScrollableState.kt", m80624l = {175}, m80625m = "invokeSuspend")
public final class C20589OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C20598OooOO0 f58858OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f58859OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f58860OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00000O f58861OooOoO0;

    /* JADX INFO: renamed from: OooOoo.OooO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", m80623f = "ScrollableState.kt", m80624l = {178}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC20633OoooOo0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f58862OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f58863OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ AbstractC32476OooO f58864OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C20598OooOO0 f58865OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(C20598OooOO0 c20598OooOO0, InterfaceC32508OooOOOo<? super InterfaceC20633OoooOo0, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f58865OooOoO0 = c20598OooOO0;
            this.f58864OooOoO = (AbstractC32476OooO) interfaceC32508OooOOOo;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f58865OooOoO0, this.f58864OooOoO, continuation);
            oooO00o.f58862OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC20633OoooOo0 interfaceC20633OoooOo0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC20633OoooOo0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f58863OooOo0o;
            C20598OooOO0 c20598OooOO0 = this.f58865OooOoO0;
            try {
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    InterfaceC20633OoooOo0 interfaceC20633OoooOo0 = (InterfaceC20633OoooOo0) this.f58862OooOo;
                    c20598OooOO0.f58912OooO0Oo.setValue(Boolean.TRUE);
                    ?? r1 = this.f58864OooOoO;
                    this.f58863OooOo0o = 1;
                    if (r1.invoke(interfaceC20633OoooOo0, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                c20598OooOO0.f58912OooO0Oo.setValue(Boolean.FALSE);
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                c20598OooOO0.f58912OooO0Oo.setValue(Boolean.FALSE);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20589OooO(C20598OooOO0 c20598OooOO0, o00000O o00000o, InterfaceC32508OooOOOo<? super InterfaceC20633OoooOo0, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super C20589OooO> continuation) {
        super(2, continuation);
        this.f58858OooOo = c20598OooOO0;
        this.f58861OooOoO0 = o00000o;
        this.f58860OooOoO = (AbstractC32476OooO) interfaceC32508OooOOOo;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C20589OooO(this.f58858OooOo, this.f58861OooOoO0, this.f58860OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C20589OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f58859OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C20598OooOO0 c20598OooOO0 = this.f58858OooOo;
            o00000OO o00000oo2 = c20598OooOO0.f58911OooO0OO;
            C20598OooOO0.OooO00o oooO00o = c20598OooOO0.f58910OooO0O0;
            OooO00o oooO00o2 = new OooO00o(c20598OooOO0, this.f58860OooOoO, null);
            this.f58859OooOo0o = 1;
            o00000oo2.getClass();
            if (C33633Oooo0.OooO0o0(new C20704o00000Oo(this.f58861OooOoO0, o00000oo2, oooO00o2, oooO00o, null), this) == enumC32485OooO00o) {
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
