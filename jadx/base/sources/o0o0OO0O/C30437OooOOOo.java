package o0o0OO0O;

import android.content.Context;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import o0o0OO.C30367OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o0OO0O.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onBtnCutAndMoveClicked$1", m80623f = "TiledPageListContainerFragment.kt", m80624l = {522}, m80625m = "invokeSuspend")
public final class C30437OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TiledPageListContainerFragment f108700OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108701OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30437OooOOOo(TiledPageListContainerFragment tiledPageListContainerFragment, Continuation<? super C30437OooOOOo> continuation) {
        super(2, continuation);
        this.f108700OooOo = tiledPageListContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30437OooOOOo(this.f108700OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30437OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108701OooOo0o;
        TiledPageListContainerFragment tiledPageListContainerFragment = this.f108700OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f108701OooOo0o = 1;
            obj = TiledPageListContainerFragment.OooOooO(tiledPageListContainerFragment, 5, this);
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
            List list2 = (List) tiledPageListContainerFragment.Oooo000().f108346OooOo0O.f121747OooOo0o.getValue();
            if (list2 != null && list.size() == list2.size()) {
                Context context = tiledPageListContainerFragment.getContext();
                if (context != null) {
                    String string = tiledPageListContainerFragment.getString(R.string.unable_to_cut_all_page);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context, string);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C30367OooO0o0 c30367OooO0o0Oooo000 = tiledPageListContainerFragment.Oooo000();
            List list3 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((TiledPagePreviewVO) it.next()).getId());
            }
            c30367OooO0o0Oooo000.OooO0o(tiledPageListContainerFragment.OooOooo().f108714OooO00o, arrayList);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
