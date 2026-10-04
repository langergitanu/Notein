package com.orion.notein.p607ui.creative_library;

import com.orion.notein.p607ui.creative_library.C23047OooOoOO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreatorProfileViewModel$loadMore$1", m80623f = "CreatorProfileViewModel.kt", m80624l = {208}, m80625m = "invokeSuspend")
public final class C23052OooOooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23047OooOoOO f71238OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71239OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23052OooOooo(C23047OooOoOO c23047OooOoOO, Continuation<? super C23052OooOooo> continuation) {
        super(2, continuation);
        this.f71238OooOo = c23047OooOoOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23052OooOooo(this.f71238OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23052OooOooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C33781o00o0O c33781o00o0O;
        Object value;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71239OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C23047OooOoOO c23047OooOoOO = this.f71238OooOo;
            do {
                c33781o00o0O = c23047OooOoOO.f71199OooOO0o;
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, C23047OooOoOO.OooO0OO.OooO00o((C23047OooOoOO.OooO0OO) value, null, null, null, 0, null, false, true, false, null, 895)));
            int i2 = c23047OooOoOO.f71197OooOO0 + 1;
            this.f71239OooOo0o = 1;
            if (C23047OooOoOO.OooO0o0(c23047OooOoOO, i2, this) == enumC32485OooO00o) {
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
