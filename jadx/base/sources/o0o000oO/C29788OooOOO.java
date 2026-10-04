package o0o000oO;

import android.content.Context;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOO0.C29081Oooo0OO;
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

/* JADX INFO: renamed from: o0o000oO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$6$1$1", m80623f = "TextStyleBarChildFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_4}, m80625m = "invokeSuspend")
public final class C29788OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TextStyleBarChildFragment f105708OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105709OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29788OooOOO(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super C29788OooOOO> continuation) {
        super(2, continuation);
        this.f105708OooOo = textStyleBarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29788OooOOO(this.f105708OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29788OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105709OooOo0o;
        String string = null;
        TextStyleBarChildFragment textStyleBarChildFragment = this.f105708OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C29051OooOO0o c29051OooOO0oOooOoOO = textStyleBarChildFragment.OooOoOO();
            String string2 = textStyleBarChildFragment.getString(R.string.custom);
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
            this.f105709OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29081Oooo0OO(c29051OooOO0oOooOoOO, string2, null), this);
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
        Context context = textStyleBarChildFragment.getContext();
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
