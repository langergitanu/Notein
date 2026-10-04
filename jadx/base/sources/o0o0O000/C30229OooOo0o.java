package o0o0O000;

import androidx.lifecycle.C22026ooOO;
import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;
import kotlin.coroutines.Continuation;
import o0OOoooO.C27996OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0O000.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.MoveToFolderFragment$setupCreateFolderSection$1$1$1", m80623f = "MoveToFolderFragment.kt", m80624l = {173}, m80625m = "invokeSuspend")
public final class C30229OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f107703OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107704OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ MoveToFolderFragment f107705OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30229OooOo0o(int i, MoveToFolderFragment moveToFolderFragment, Continuation<? super C30229OooOo0o> continuation) {
        super(2, continuation);
        this.f107703OooOo = i;
        this.f107705OooOoO0 = moveToFolderFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30229OooOo0o(this.f107703OooOo, this.f107705OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30229OooOo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107704OooOo0o;
        MoveToFolderFragment moveToFolderFragment = this.f107705OooOoO0;
        C22026ooOO c22026ooOO = moveToFolderFragment.f77658OooOoo;
        int i2 = this.f107703OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (i2 == C27996OooO00o.f99274OooO00o) {
                ((C30220OooO0oO) c22026ooOO.getValue()).OooO0o(i2);
                return C32460OooOooO.f116667OooO00o;
            }
            this.f107704OooOo0o = 1;
            obj = MoveToFolderFragment.OooOoOO(moveToFolderFragment, 24, this);
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
            ((C30220OooO0oO) c22026ooOO.getValue()).OooO0o(i2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
