package o0o000oo;

import OooO0o.C20424OooO0Oo;
import android.view.View;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import kotlin.coroutines.Continuation;
import o0o00O0o.InterfaceC29879OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o000oo.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$handleOnExportBtnClicked$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1825}, m80625m = "invokeSuspend")
public final class C29833Oooo000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105832OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105833OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ View f105834OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29833Oooo000(View view, BaseToolbarChildFragment baseToolbarChildFragment, Continuation continuation) {
        super(2, continuation);
        this.f105832OooOo = baseToolbarChildFragment;
        this.f105834OooOoO0 = view;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29833Oooo000(this.f105834OooOoO0, this.f105832OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29833Oooo000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105833OooOo0o;
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105832OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f105833OooOo0o = 1;
            obj = BaseToolbarChildFragment.OooOooo(baseToolbarChildFragment, 36, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) C20424OooO0Oo.OooO0Oo(4, baseToolbarChildFragment.f76496OoooOO0);
            Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
            InterfaceC29879OooO0o interfaceC29879OooO0o = value instanceof InterfaceC29879OooO0o ? (InterfaceC29879OooO0o) value : null;
            NoteMeta noteMeta = (NoteMeta) baseToolbarChildFragment.Oooo0OO().f73395OoooOo0.f121747OooOo0o.getValue();
            boolean z = false;
            if (noteMeta != null && noteMeta.getUnboundedNote()) {
                z = true;
            }
            if (interfaceC29879OooO0o != null) {
                interfaceC29879OooO0o.OooO0o0(!z);
            }
            if (interfaceC29879OooO0o != null) {
                interfaceC29879OooO0o.OooO0OO(this.f105834OooOoO0, true);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
