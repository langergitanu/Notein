package com.orion.notein.p607ui.noteeditor.pagelayereditor;

import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOooO.C27881OooOO0O;
import o0oOOOoo.C30837OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagelayereditor.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$movePageLayer$1", m80623f = "PageLayerViewModel.kt", m80624l = {544, 545, 547, 551}, m80625m = "invokeSuspend")
public final class C23443OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f74848OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f74849OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f74850OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f74851OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C30837OooO00o f74852OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23443OooO0Oo(OooO0OO oooO0OO, int i, C30837OooO00o c30837OooO00o, Continuation<? super C23443OooO0Oo> continuation) {
        super(2, continuation);
        this.f74851OooOoO0 = oooO0OO;
        this.f74850OooOoO = i;
        this.f74852OooOoOO = c30837OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23443OooO0Oo(this.f74851OooOoO0, this.f74850OooOoO, this.f74852OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23443OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0128 A[PHI: r2
      0x0128: PHI (r2v19 java.lang.Object) = (r2v18 java.lang.Object), (r2v25 java.lang.Object) binds: [B:54:0x0125, B:11:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013b  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object next;
        PageLayer pageLayer;
        Object objOooOO0O;
        List list;
        List list2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f74848OooOo;
        C30837OooO00o c30837OooO00o = this.f74852OooOoOO;
        OooO0OO oooO0OO = this.f74851OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List list3 = (List) oooO0OO.f74786OooOOoo.f121747OooOo0o.getValue();
            if (list3 == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PageLayerViewModel");
                c20358OooO00o.OooO0OO("movePageLayer. layers is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            List list4 = list3;
            Iterator it = list4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (OooOOO0.OooO0O0(((PageLayer) next).getId(), c30837OooO00o.f110196OooO00o)) {
                    break;
                }
            }
            PageLayer pageLayer2 = (PageLayer) next;
            if (pageLayer2 == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("PageLayerViewModel");
                c20358OooO00o2.OooO0OO("movePageLayer. toMove is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list4) {
                if (!OooOOO0.OooO0O0(((PageLayer) obj2).getId(), c30837OooO00o.f110196OooO00o)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayListO0ooOoO = OooOo.o0ooOoO(arrayList);
            int size = arrayListO0ooOoO.size();
            int i2 = this.f74850OooOoO;
            if (i2 >= size) {
                arrayListO0ooOoO.add(pageLayer2);
            } else if (i2 < 0) {
                arrayListO0ooOoO.add(0, pageLayer2);
            } else {
                arrayListO0ooOoO.add(i2, pageLayer2);
            }
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayListO0ooOoO, 10));
            Iterator it2 = arrayListO0ooOoO.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((PageLayer) it2.next()).getId());
            }
            String str = c30837OooO00o.f110197OooO0O0;
            this.f74849OooOo0o = pageLayer2;
            this.f74848OooOo = 1;
            if (oooO0OO.f74774OooO0o0.OooO0OO(str, arrayList2, this) != enumC32485OooO00o) {
                pageLayer = pageLayer2;
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                String str2 = c30837OooO00o.f110197OooO0O0;
                this.f74848OooOo = 3;
                objOooOO0O = oooO0OO.OooOO0O(str2, this);
                if (objOooOO0O != enumC32485OooO00o) {
                    list = (List) objOooOO0O;
                    if (list != null) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.f74849OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.f123390OooO00o.OooO0o0("movePageLayer end. layerInfos=" + list2, new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooOO0O = obj;
            list = (List) objOooOO0O;
            if (list != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("PageLayerViewModel");
                c20358OooO00o3.OooO0OO("movePageLayer. layerInfos is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            C33772OooooOo c33772OooooOo = oooO0OO.f74776OooO0oo;
            OooO0OO.C19307OooO0OO c19307OooO0OO = new OooO0OO.C19307OooO0OO(list, OooO0OO.OooO00o.f74796OooOo);
            this.f74849OooOo0o = list;
            this.f74848OooOo = 4;
            if (c33772OooooOo.emit(c19307OooO0OO, this) != enumC32485OooO00o) {
                list2 = list;
                C34406OooO00o.f123390OooO00o.OooO0o0("movePageLayer end. layerInfos=" + list2, new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        }
        pageLayer = (PageLayer) this.f74849OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C27881OooOO0O c27881OooOO0O = oooO0OO.f74774OooO0o0;
        String id = pageLayer.getId();
        String noteId = pageLayer.getNoteId();
        this.f74849OooOo0o = null;
        this.f74848OooOo = 2;
        if (c27881OooOO0O.OooO00o(id, noteId, this) != enumC32485OooO00o) {
            String str22 = c30837OooO00o.f110197OooO0O0;
            this.f74848OooOo = 3;
            objOooOO0O = oooO0OO.OooOO0O(str22, this);
            if (objOooOO0O != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
