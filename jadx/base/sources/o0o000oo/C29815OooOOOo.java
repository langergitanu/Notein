package o0o000oo;

import Oooo0oO.C21030OooOO0o;
import android.net.Uri;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import java.util.Collection;
import kotlin.coroutines.Continuation;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28795o000Oo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o000oo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$createAddImagePopupWindow$listener$1$onAddImagesToStickersClicked$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {616}, m80625m = "invokeSuspend")
public final class C29815OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105789OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105790OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29815OooOOOo(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C29815OooOOOo> continuation) {
        super(2, continuation);
        this.f105789OooOo = baseToolbarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29815OooOOOo(this.f105789OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29815OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105790OooOo0o;
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105789OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f105790OooOo0o = 1;
            obj = BaseToolbarChildFragment.OooOooo(baseToolbarChildFragment, 14, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        Uri[] toAddedUris = (Uri[]) ((Collection) baseToolbarChildFragment.Oooo0o0().f101690OooO.getValue()).toArray(new Uri[0]);
        kotlin.jvm.internal.OooOOO0.OooO0oO(toAddedUris, "toAddedUris");
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(baseToolbarChildFragment), new C28795o000Oo0(toAddedUris));
        return C32460OooOooO.f116667OooO00o;
    }
}
