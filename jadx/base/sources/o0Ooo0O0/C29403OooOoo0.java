package o0Ooo0O0;

import com.orion.notein.domain.models.page.PageLayer;
import com.orion.penkit.models.LayerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Ooo0O0.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$mergeOtherLayers$1", m80623f = "PageLayerViewModel.kt", m80624l = {682}, m80625m = "invokeSuspend")
public final class C29403OooOoo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO f104269OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104270OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f104271OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f104272OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29403OooOoo0(com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO, boolean z, String str, Continuation<? super C29403OooOoo0> continuation) {
        super(2, continuation);
        this.f104269OooOo = oooO0OO;
        this.f104272OooOoO0 = z;
        this.f104271OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29403OooOoo0(this.f104269OooOo, this.f104272OooOoO0, this.f104271OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29403OooOoo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        PageLayer pageLayer;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104270OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO = this.f104269OooOo;
            List list = (List) oooO0OO.f74786OooOOoo.f121747OooOo0o.getValue();
            if (list == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PageLayerViewModel");
                c20358OooO00o.OooO0OO("mergeOtherLayers. layers is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((PageLayer) obj2).getId(), LayerInfo.PAPER_THEME_LAYER_ID)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                PageLayer pageLayer2 = (PageLayer) obj3;
                if (!this.f104272OooOoO0 || pageLayer2.getVisible()) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((PageLayer) it.next()).getId());
            }
            Object obj4 = null;
            if (arrayList3.contains("default")) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("PageLayerViewModel");
                c20358OooO00o2.OooO0o0("mergeOtherLayers. anchor is default layer", new Object[0]);
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PageLayer) next).getId(), "default")) {
                        obj4 = next;
                        break;
                    }
                }
                pageLayer = (PageLayer) obj4;
            } else {
                Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PageLayer) next2).getId(), this.f104271OooOoO)) {
                        obj4 = next2;
                        break;
                    }
                }
                pageLayer = (PageLayer) obj4;
            }
            if (pageLayer == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("PageLayerViewModel");
                c20358OooO00o3.OooO0OO("mergeOtherLayers. anchor is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            this.f104270OooOo0o = 1;
            if (com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO.OooO0o(oooO0OO, pageLayer, arrayList3, this) == enumC32485OooO00o) {
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
