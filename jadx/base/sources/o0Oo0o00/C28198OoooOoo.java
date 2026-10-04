package o0Oo0o00;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0Oo0o00.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$2", m80623f = "CloudSyncViewModel.kt", m80624l = {203}, m80625m = "invokeSuspend")
public final class C28198OoooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28201OooooO0 f99925OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99926OooOo0o;

    /* JADX INFO: renamed from: o0Oo0o00.OoooOoo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C28201OooooO0 f99927OooOo0o;

        public OooO00o(C28201OooooO0 c28201OooooO0) {
            this.f99927OooOo0o = c28201OooooO0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(Object obj, Continuation continuation) {
            Object value;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            C28201OooooO0 c28201OooooO0 = this.f99927OooOo0o;
            if (zBooleanValue) {
                C33781o00o0O c33781o00o0O = c28201OooooO0.f99957OooOoO0;
                do {
                } while (!c33781o00o0O.OooO(c33781o00o0O.getValue(), new Integer(((Number) r4).intValue() - 1)));
            } else {
                C33781o00o0O c33781o00o0O2 = c28201OooooO0.f99957OooOoO0;
                do {
                    value = c33781o00o0O2.getValue();
                } while (!c33781o00o0O2.OooO(value, new Integer(((Number) value).intValue() + 1)));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28198OoooOoo(C28201OooooO0 c28201OooooO0, Continuation<? super C28198OoooOoo> continuation) {
        super(2, continuation);
        this.f99925OooOo = c28201OooooO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28198OoooOoo(this.f99925OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        ((C28198OoooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99926OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw androidx.transition.OooOOOO.OooO0O0(obj);
        }
        C32446OooOOOo.OooO0O0(obj);
        C28201OooooO0 c28201OooooO0 = this.f99925OooOo;
        C33772OooooOo c33772OooooOo = c28201OooooO0.f99941OooOO0.f97534OooO0OO;
        OooO00o oooO00o = new OooO00o(c28201OooooO0);
        this.f99926OooOo0o = 1;
        c33772OooooOo.collect(oooO00o, this);
        return enumC32485OooO00o;
    }
}
