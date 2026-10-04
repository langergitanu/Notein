package o0Oo0ooO;

import com.orion.notein.p607ui.label.C23139OooOO0o;
import com.orion.notein.p607ui.label.LabelManagementDialogFragment;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0Oo0ooO.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.label.LabelManagementDialogFragment$observeLabelItems$1", m80623f = "LabelManagementDialogFragment.kt", m80624l = {162}, m80625m = "invokeSuspend")
public final class C28445Oooo0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LabelManagementDialogFragment f100815OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100816OooOo0o;

    /* JADX INFO: renamed from: o0Oo0ooO.Oooo0o0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ LabelManagementDialogFragment f100817OooOo0o;

        public OooO00o(LabelManagementDialogFragment labelManagementDialogFragment) {
            this.f100817OooOo0o = labelManagementDialogFragment;
        }

        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(Object obj, Continuation continuation) {
            List<T> list = (List) obj;
            com.orion.notein.p607ui.label.OooO0o oooO0o = this.f100817OooOo0o.f71913Oooo0;
            if (oooO0o != null) {
                oooO0o.OooO0Oo(list);
                return C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("labelListAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28445Oooo0o0(LabelManagementDialogFragment labelManagementDialogFragment, Continuation<? super C28445Oooo0o0> continuation) {
        super(2, continuation);
        this.f100815OooOo = labelManagementDialogFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28445Oooo0o0(this.f100815OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        ((C28445Oooo0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100816OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            LabelManagementDialogFragment labelManagementDialogFragment = this.f100815OooOo;
            C23139OooOO0o c23139OooOO0oOooo0 = labelManagementDialogFragment.Oooo0();
            OooO00o oooO00o = new OooO00o(labelManagementDialogFragment);
            this.f100816OooOo0o = 1;
            if (c23139OooOO0oOooo0.f72078OooOOO0.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        throw new C32438OooO0oO();
    }
}
