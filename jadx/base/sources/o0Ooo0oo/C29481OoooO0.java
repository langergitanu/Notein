package o0Ooo0oo;

import android.content.Context;
import androidx.core.view.PointerIconCompat;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Ooo0oo.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$initTertiaryViews$2$1$1", m80623f = "PenBarChildFragment.kt", m80624l = {PointerIconCompat.TYPE_GRAB}, m80625m = "invokeSuspend")
public final class C29481OoooO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104573OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104574OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29481OoooO0(PenBarChildFragment penBarChildFragment, Continuation<? super C29481OoooO0> continuation) {
        super(2, continuation);
        this.f104573OooOo = penBarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29481OoooO0(this.f104573OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29481OoooO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104574OooOo0o;
        String string = null;
        PenBarChildFragment penBarChildFragment = this.f104573OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            int i2 = PenBarChildFragment.f75240o0000OOo;
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
            String string2 = penBarChildFragment.getString(R.string.custom);
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
            this.f104574OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29539o000O0O(oooO0O0Oooo0oO, string2, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        int i3 = PenBarChildFragment.f75240o0000OOo;
        Context context = penBarChildFragment.getContext();
        if (context != null) {
            if (iIntValue == 0) {
                string = context.getString(R.string.color_set_remove_from_color_set);
            } else if (iIntValue == 1) {
                string = context.getString(R.string.color_set_add_to_color_set);
            } else if (iIntValue == 2) {
                string = context.getString(R.string.color_set_hit_limit);
            }
            if (string != null) {
                C25206OooO0Oo.OooO0oO(context, string);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
