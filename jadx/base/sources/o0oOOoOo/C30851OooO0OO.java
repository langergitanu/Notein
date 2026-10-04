package o0oOOoOo;

import com.aspose.words.StyleIdentifier;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31080OoooOoo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33801OooOOO;
import oOo000Oo.OooOOO;

/* JADX INFO: renamed from: o0oOOoOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30851OooO0OO implements InterfaceC33721OooO0o<List<? extends C31080OoooOoo>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o[] f110269OooOo0o;

    /* JADX INFO: renamed from: o0oOOoOo.OooO0OO$OooO00o */
    public static final class OooO00o implements oO0O000o.OooO00o<C31080OoooOoo[]> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o[] f110270OooOo0o;

        public OooO00o(InterfaceC33721OooO0o[] interfaceC33721OooO0oArr) {
            this.f110270OooOo0o = interfaceC33721OooO0oArr;
        }

        @Override // oO0O000o.OooO00o
        public final C31080OoooOoo[] invoke() {
            return new C31080OoooOoo[this.f110270OooOo0o.length];
        }
    }

    /* JADX INFO: renamed from: o0oOOoOo.OooO0OO$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.stylus.GlobalStylusShortcutViewModel$observeShortcutSections$$inlined$combine$1$3", m80623f = "GlobalStylusShortcutViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_2_ACCENT_2}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends C31080OoooOoo>>, C31080OoooOoo[], Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f110271OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f110272OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object[] f110273OooOoO0;

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends C31080OoooOoo>> interfaceC33723OooO0oO, C31080OoooOoo[] c31080OoooOooArr, Continuation<? super C32460OooOooO> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(3, continuation);
            oooO0O0.f110271OooOo = interfaceC33723OooO0oO;
            oooO0O0.f110273OooOoO0 = c31080OoooOooArr;
            return oooO0O0.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f110272OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f110271OooOo;
                List listOoooOO0 = OooOOO.OoooOO0((C31080OoooOoo[]) this.f110273OooOoO0);
                this.f110272OooOo0o = 1;
                if (interfaceC33723OooO0oO.emit(listOoooOO0, this) == enumC32485OooO00o) {
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

    public C30851OooO0OO(InterfaceC33721OooO0o[] interfaceC33721OooO0oArr) {
        this.f110269OooOo0o = interfaceC33721OooO0oArr;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends C31080OoooOoo>> interfaceC33723OooO0oO, Continuation continuation) {
        InterfaceC33721OooO0o[] interfaceC33721OooO0oArr = this.f110269OooOo0o;
        Object objOooO00o = C33801OooOOO.OooO00o(continuation, new OooO00o(interfaceC33721OooO0oArr), new OooO0O0(3, null), interfaceC33723OooO0oO, interfaceC33721OooO0oArr);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }
}
