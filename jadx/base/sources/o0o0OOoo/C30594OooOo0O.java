package o0o0OOoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27300OooOOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OOoo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayViewModel$queryAndUpdateProductDetails$1", m80623f = "GooglePayViewModel.kt", m80624l = {856, 860}, m80625m = "invokeSuspend")
public final class C30594OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f109473OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public List f109474OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30584OooOOOo f109475OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30594OooOo0O(C30584OooOOOo c30584OooOOOo, Continuation<? super C30594OooOo0O> continuation) {
        super(2, continuation);
        this.f109475OooOoO0 = c30584OooOOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30594OooOo0O(this.f109475OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30594OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List listO0ooOO0;
        List list;
        List list2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109473OooOo;
        C30584OooOOOo c30584OooOOOo = this.f109475OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(((Map) c30584OooOOOo.f109422OooOoOO.getValue()).keySet());
            this.f109474OooOo0o = listO0ooOO0;
            this.f109473OooOo = 1;
            obj = c30584OooOOOo.f109400OooO0Oo.OooOO0(listO0ooOO0, "subs", this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = this.f109474OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            list2 = (List) obj;
            if (list2 != null) {
                return C32460OooOooO.f116667OooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PayViewModel");
            c20358OooO00o.OooO00o("inAppProductDetails: " + list2, new Object[0]);
            C33781o00o0O c33781o00o0O = c30584OooOOOo.f109411OooOOOo;
            ArrayList arrayListOooooOO = oOo000Oo.OooOo.OooooOO(list, list2);
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, arrayListOooooOO);
            return C32460OooOooO.f116667OooO00o;
        }
        listO0ooOO0 = this.f109474OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list3 = (List) obj;
        if (list3 == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("PayViewModel");
        c20358OooO00o2.OooO00o("subProductDetails: " + list3, new Object[0]);
        InterfaceC27300OooOOOo interfaceC27300OooOOOo = c30584OooOOOo.f109400OooO0Oo;
        this.f109474OooOo0o = list3;
        this.f109473OooOo = 2;
        Object objOooOO0 = interfaceC27300OooOOOo.OooOO0(listO0ooOO0, "inapp", this);
        if (objOooOO0 != enumC32485OooO00o) {
            list = list3;
            obj = objOooOO0;
            list2 = (List) obj;
            if (list2 != null) {
            }
        }
        return enumC32485OooO00o;
    }
}
