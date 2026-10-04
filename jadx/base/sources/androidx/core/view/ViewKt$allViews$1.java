package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32484OooO0oo;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0O.AbstractC33570OooOO0;
import oO0o0O0O.InterfaceC33569OooO0oo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"LoO0o0O0O/OooOO0;", "Landroid/view/View;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0O0O/OooOO0;)V"}, m80613k = 3, m80614mv = {1, 8, 0})
@InterfaceC32482OooO0o0(m80622c = "androidx.core.view.ViewKt$allViews$1", m80623f = "View.kt", m80624l = {410, 412}, m80625m = "invokeSuspend")
public final class ViewKt$allViews$1 extends AbstractC32484OooO0oo implements InterfaceC32508OooOOOo<AbstractC33570OooOO0<? super View>, Continuation<? super C32460OooOooO>, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, Continuation<? super ViewKt$allViews$1> continuation) {
        super(2, continuation);
        this.$this_allViews = view;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, continuation);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.label;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC33570OooOO0 abstractC33570OooOO0 = (AbstractC33570OooOO0) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = abstractC33570OooOO0;
            this.label = 1;
            abstractC33570OooOO0.OooO00o(view, this);
            return enumC32485OooO00o;
        }
        if (i == 1) {
            AbstractC33570OooOO0 abstractC33570OooOO02 = (AbstractC33570OooOO0) this.L$0;
            C32446OooOOOo.OooO0O0(obj);
            View view2 = this.$this_allViews;
            if (view2 instanceof ViewGroup) {
                InterfaceC33569OooO0oo<View> descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
                this.L$0 = null;
                this.label = 2;
                abstractC33570OooOO02.getClass();
                Object objOooO0Oo = abstractC33570OooOO02.OooO0Oo(descendants.iterator(), this);
                if (objOooO0Oo != enumC32485OooO00o) {
                    objOooO0Oo = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0Oo == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC33570OooOO0<? super View> abstractC33570OooOO0, Continuation<? super C32460OooOooO> continuation) {
        return ((ViewKt$allViews$1) create(abstractC33570OooOO0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}
