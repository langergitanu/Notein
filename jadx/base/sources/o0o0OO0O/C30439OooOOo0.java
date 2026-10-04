package o0o0OO0O;

import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0o0OO.C30367OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o0OO0O.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onBtnDuplicateClicked$1", m80623f = "TiledPageListContainerFragment.kt", m80624l = {512}, m80625m = "invokeSuspend")
public final class C30439OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TiledPageListContainerFragment f108704OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108705OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30439OooOOo0(TiledPageListContainerFragment tiledPageListContainerFragment, Continuation<? super C30439OooOOo0> continuation) {
        super(2, continuation);
        this.f108704OooOo = tiledPageListContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30439OooOOo0(this.f108704OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30439OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108705OooOo0o;
        TiledPageListContainerFragment tiledPageListContainerFragment = this.f108704OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f108705OooOo0o = 1;
            obj = TiledPageListContainerFragment.OooOooO(tiledPageListContainerFragment, 44, this);
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
            List list = (List) tiledPageListContainerFragment.Oooo000().f108347OooOo0o.f121747OooOo0o.getValue();
            C30367OooO0o0 c30367OooO0o0Oooo000 = tiledPageListContainerFragment.Oooo000();
            List list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((TiledPagePreviewVO) it.next()).getId());
            }
            o00000OO o00000oo2 = c30367OooO0o0Oooo000.f108327OooO;
            if (o00000oo2 == null || !o00000oo2.isActive()) {
                c30367OooO0o0Oooo000.f108327OooO = C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30367OooO0o0Oooo000), null, null, new o0o0OO.OooOOO(arrayList, c30367OooO0o0Oooo000, null), 3);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
