package o0o0O00O;

import androidx.core.os.BundleKt;
import com.orion.notein.p607ui.notelist.label.LabelListFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0O00O.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onClickNotePlaceHolder$1", m80623f = "LabelListFragment.kt", m80624l = {443}, m80625m = "invokeSuspend")
public final class C30249OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LabelListFragment f107790OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107791OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteVO f107792OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30249OooOoO0(LabelListFragment labelListFragment, NoteVO noteVO, Continuation<? super C30249OooOoO0> continuation) {
        super(2, continuation);
        this.f107790OooOo = labelListFragment;
        this.f107792OooOoO0 = noteVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30249OooOoO0(this.f107790OooOo, this.f107792OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30249OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107791OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = this.f107790OooOo.OooOoo();
            String id = this.f107792OooOoO0.getId();
            this.f107791OooOo0o = 1;
            if (oooO0OOOooOoo.OooOo00(BundleKt.bundleOf(), id) == enumC32485OooO00o) {
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
