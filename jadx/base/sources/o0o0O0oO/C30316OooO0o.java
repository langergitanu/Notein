package o0o0O0oO;

import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0O0oO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$initActionBar$3$1", m80623f = "TrashBinContainerFragment.kt", m80624l = {234}, m80625m = "invokeSuspend")
public final class C30316OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TrashBinContainerFragment f108091OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108092OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteVO f108093OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30316OooO0o(TrashBinContainerFragment trashBinContainerFragment, NoteVO noteVO, Continuation<? super C30316OooO0o> continuation) {
        super(2, continuation);
        this.f108091OooOo = trashBinContainerFragment;
        this.f108093OooOoO0 = noteVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30316OooO0o(this.f108091OooOo, this.f108093OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30316OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108092OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30351Oooo0oO c30351Oooo0oOOooOoOO = this.f108091OooOo.OooOoOO();
            this.f108092OooOo0o = 1;
            if (c30351Oooo0oOOooOoOO.OooOOOO(this.f108093OooOoO0, this) == enumC32485OooO00o) {
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
