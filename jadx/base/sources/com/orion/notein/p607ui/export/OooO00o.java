package com.orion.notein.p607ui.export;

import com.orion.notein.p607ui.export.C23110OooO0oo;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0Oo0o0o.C28230OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.AddWaterMarkFragment$initListState$1", m80623f = "AddWaterMarkFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AddWaterMarkFragment f71702OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ int f71703OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(AddWaterMarkFragment addWaterMarkFragment, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f71702OooOo = addWaterMarkFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO00o oooO00o = new OooO00o(this.f71702OooOo, continuation);
        oooO00o.f71703OooOo0o = ((Number) obj).intValue();
        return oooO00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        int i = this.f71703OooOo0o;
        C23110OooO0oo.OooO00o.f71797OooOo0o.getClass();
        C23110OooO0oo.OooO00o OooO00o2 = C23110OooO0oo.OooO00o.C19210OooO00o.OooO00o(i);
        C28230OooO0oO.OooO00o("list state: " + OooO00o2 + ", ordinal: " + i + ".");
        List<Integer> list = AddWaterMarkFragment.f71503Oooo000;
        C23110OooO0oo c23110OooO0oo = (C23110OooO0oo) this.f71702OooOo.f71505OooOooo.getValue();
        c23110OooO0oo.getClass();
        c23110OooO0oo.f71795OooO0OO.setValue(c23110OooO0oo, C23110OooO0oo.f71792OooO0Oo[0], OooO00o2);
        return C32460OooOooO.f116667OooO00o;
    }
}
