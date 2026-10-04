package o0Ooo0O0;

import com.orion.notein.domain.models.page.PageLayer;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOOOoo.C30837OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0Ooo0O0.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$mergeLayer$1", m80623f = "PageLayerViewModel.kt", m80624l = {641}, m80625m = "invokeSuspend")
public final class C29399OooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO f104251OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104252OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30837OooO00o f104253OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30837OooO00o f104254OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29399OooOoO(com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO, C30837OooO00o c30837OooO00o, C30837OooO00o c30837OooO00o2, Continuation<? super C29399OooOoO> continuation) {
        super(2, continuation);
        this.f104251OooOo = oooO0OO;
        this.f104254OooOoO0 = c30837OooO00o;
        this.f104253OooOoO = c30837OooO00o2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29399OooOoO(this.f104251OooOo, this.f104254OooOoO0, this.f104253OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29399OooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104252OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO = this.f104251OooOo;
            List list = (List) oooO0OO.f74786OooOOoo.f121747OooOo0o.getValue();
            if (list == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PageLayerViewModel");
                c20358OooO00o.OooO0OO("mergeLayer. layers is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            List list2 = list;
            Iterator it = list2.iterator();
            while (true) {
                obj2 = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PageLayer) next).getId(), this.f104254OooOoO0.f110196OooO00o)) {
                    break;
                }
            }
            PageLayer pageLayer = (PageLayer) next;
            if (pageLayer == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PageLayer) next2).getId(), this.f104253OooOoO.f110196OooO00o)) {
                    obj2 = next2;
                    break;
                }
            }
            PageLayer pageLayer2 = (PageLayer) obj2;
            if (pageLayer2 == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            PageLayer pageLayer3 = kotlin.jvm.internal.OooOOO0.OooO0O0(pageLayer.getId(), "default") ? pageLayer : pageLayer2;
            List listOooOO0o = C34429OooOOo0.OooOO0o(pageLayer2.getId(), pageLayer.getId());
            this.f104252OooOo0o = 1;
            if (com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO.OooO0o(oooO0OO, pageLayer3, listOooOO0o, this) == enumC32485OooO00o) {
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
