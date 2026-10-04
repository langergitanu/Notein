package o0o0OO0O;

import Oooo0oO.C21030OooOO0o;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import kotlin.coroutines.Continuation;
import o0Oo00o.C28026OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OO0O.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onBtnSaveAsClicked$1", m80623f = "TiledPageListContainerFragment.kt", m80624l = {455}, m80625m = "invokeSuspend")
public final class C30438OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TiledPageListContainerFragment f108702OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108703OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30438OooOOo(TiledPageListContainerFragment tiledPageListContainerFragment, Continuation<? super C30438OooOOo> continuation) {
        super(2, continuation);
        this.f108702OooOo = tiledPageListContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30438OooOOo(this.f108702OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30438OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108703OooOo0o;
        TiledPageListContainerFragment tiledPageListContainerFragment = this.f108702OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f108703OooOo0o = 1;
            obj = TiledPageListContainerFragment.OooOooO(tiledPageListContainerFragment, 6, this);
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
            String defaultNoteTitle = (String) tiledPageListContainerFragment.Oooo000().f108341OooOOo0.f121747OooOo0o.getValue();
            kotlin.jvm.internal.OooOOO0.OooO0oO(defaultNoteTitle, "defaultNoteTitle");
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(tiledPageListContainerFragment), new C30445OooOoO0(defaultNoteTitle));
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
