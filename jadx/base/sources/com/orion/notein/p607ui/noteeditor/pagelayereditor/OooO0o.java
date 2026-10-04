package com.orion.notein.p607ui.noteeditor.pagelayereditor;

import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
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

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$toggleLayerVisibility$1", m80623f = "PageLayerViewModel.kt", m80624l = {570, 572, 576}, m80625m = "invokeSuspend")
public final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f74853OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f74854OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30837OooO00o f74855OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f74856OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(OooO0OO oooO0OO, C30837OooO00o c30837OooO00o, Continuation<? super OooO0o> continuation) {
        super(2, continuation);
        this.f74856OooOoO0 = oooO0OO;
        this.f74855OooOoO = c30837OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0o(this.f74856OooOoO0, this.f74855OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C30837OooO00o c30837OooO00o;
        Object next;
        PageLayer pageLayerCopy$default;
        Object objOooOO0O;
        List list;
        List list2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f74853OooOo;
        OooO0OO oooO0OO = this.f74856OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List list3 = (List) oooO0OO.f74786OooOOoo.f121747OooOo0o.getValue();
            if (list3 == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            Iterator it = list3.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c30837OooO00o = this.f74855OooOoO;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                if (OooOOO0.OooO0O0(((PageLayer) next).getId(), c30837OooO00o.f110196OooO00o)) {
                    break;
                }
            }
            PageLayer pageLayer = (PageLayer) next;
            if (pageLayer == null || (pageLayerCopy$default = PageLayer.copy$default(pageLayer, null, null, !c30837OooO00o.f110203OooO0oo, null, null, 27, null)) == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            List listOooO0oO = OooOo.OooO0oO(pageLayerCopy$default);
            String noteId = pageLayerCopy$default.getNoteId();
            this.f74854OooOo0o = pageLayerCopy$default;
            this.f74853OooOo = 1;
            Object objOooO00o = oooO0OO.f74774OooO0o0.f98543OooO00o.OooO00o(listOooO0oO, noteId, this);
            if (objOooO00o != EnumC32485OooO00o.f116726OooOo0o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.f74854OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.f123390OooO00o.OooO0o0("toggleLayerVisibility end. layerInfos=" + list2, new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooOO0O = obj;
            list = (List) objOooOO0O;
            if (list != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PageLayerViewModel");
                c20358OooO00o.OooO0OO("toggleLayerVisibility. layerInfos is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            C33772OooooOo c33772OooooOo = oooO0OO.f74776OooO0oo;
            OooO0OO.C19307OooO0OO c19307OooO0OO = new OooO0OO.C19307OooO0OO(list, OooO0OO.OooO00o.f74796OooOo);
            this.f74854OooOo0o = list;
            this.f74853OooOo = 3;
            if (c33772OooooOo.emit(c19307OooO0OO, this) != enumC32485OooO00o) {
                list2 = list;
                C34406OooO00o.f123390OooO00o.OooO0o0("toggleLayerVisibility end. layerInfos=" + list2, new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        }
        pageLayerCopy$default = (PageLayer) this.f74854OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String noteId2 = pageLayerCopy$default.getNoteId();
        this.f74854OooOo0o = null;
        this.f74853OooOo = 2;
        objOooOO0O = oooO0OO.OooOO0O(noteId2, this);
        if (objOooOO0O != enumC32485OooO00o) {
            list = (List) objOooOO0O;
            if (list != null) {
            }
        }
        return enumC32485OooO00o;
    }
}
