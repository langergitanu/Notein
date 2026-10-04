package o0ooOO0;

import Oooo0oO.C21082o00000oO;
import android.view.View;
import com.orion.notein.global.R;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", m80623f = "WindowRecomposer.android.kt", m80624l = {233}, m80625m = "invokeSuspend")
public final class o000OO00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C21082o00000oO f112862OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f112863OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ View f112864OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(C21082o00000oO c21082o00000oO, View view, Continuation<? super o000OO00> continuation) {
        super(2, continuation);
        this.f112862OooOo = c21082o00000oO;
        this.f112864OooOoO0 = view;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o000OO00(this.f112862OooOo, this.f112864OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o000OO00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f112863OooOo0o;
        View view = this.f112864OooOoO0;
        C21082o00000oO c21082o00000oO = this.f112862OooOo;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f112863OooOo0o = 1;
                Object objOooOOoo = C25252OooO0Oo.OooOOoo(c21082o00000oO.f61093OooOOo0, new Oooo0oO.o0000(2, null), this);
                if (objOooOOoo != obj2) {
                    objOooOOoo = C32460OooOooO.f116667OooO00o;
                }
                if (objOooOOoo == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        } finally {
            if (C31592o000Oo00.OooO0O0(view) == c21082o00000oO) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
