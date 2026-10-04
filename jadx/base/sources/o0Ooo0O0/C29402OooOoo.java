package o0Ooo0O0;

import com.orion.notein.domain.models.page.PageLayer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0oOOOoo.C30837OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: o0Ooo0O0.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$renameLayer$1", m80623f = "PageLayerViewModel.kt", m80624l = {595}, m80625m = "invokeSuspend")
public final class C29402OooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO f104265OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104266OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f104267OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30837OooO00o f104268OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29402OooOoo(com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO, C30837OooO00o c30837OooO00o, String str, Continuation<? super C29402OooOoo> continuation) {
        super(2, continuation);
        this.f104265OooOo = oooO0OO;
        this.f104268OooOoO0 = c30837OooO00o;
        this.f104267OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29402OooOoo(this.f104265OooOo, this.f104268OooOoO0, this.f104267OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29402OooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C30837OooO00o c30837OooO00o;
        Object next;
        PageLayer pageLayerCopy$default;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104266OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO = this.f104265OooOo;
            List list = (List) oooO0OO.f74786OooOOoo.f121747OooOo0o.getValue();
            if (list == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c30837OooO00o = this.f104268OooOoO0;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PageLayer) next).getId(), c30837OooO00o.f110196OooO00o)) {
                    break;
                }
            }
            PageLayer pageLayer = (PageLayer) next;
            if (pageLayer == null || (pageLayerCopy$default = PageLayer.copy$default(pageLayer, null, null, !c30837OooO00o.f110203OooO0oo, null, null, 27, null)) == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            Map mapOooO0o0 = Oooo0.OooO0o0(new C32443OooOOO(pageLayerCopy$default.getId(), this.f104267OooOoO));
            String noteId = pageLayerCopy$default.getNoteId();
            this.f104266OooOo0o = 1;
            Object objOooO0o = oooO0OO.f74774OooO0o0.f98543OooO00o.OooO0o(mapOooO0o0, noteId, this);
            if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o == enumC32485OooO00o) {
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
