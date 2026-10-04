package com.orion.notein.p607ui.creative_library;

import com.orion.notein.p607ui.creative_library.C23047OooOoOO;
import kotlin.coroutines.Continuation;
import o0OO0ooO.C26953OooO00o;
import o0OOo0Oo.InterfaceC27310OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreatorProfileViewModel$refresh$1", m80623f = "CreatorProfileViewModel.kt", m80624l = {192, 194}, m80625m = "invokeSuspend")
public final class Oooo000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23047OooOoOO f71250OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71251OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(C23047OooOoOO c23047OooOoOO, Continuation<? super Oooo000> continuation) {
        super(2, continuation);
        this.f71250OooOo = c23047OooOoOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new Oooo000(this.f71250OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((Oooo000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (com.orion.notein.p607ui.creative_library.C23047OooOoOO.OooO0o0(r3, 1, r18) == r0) goto L22;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71251OooOo0o;
        C23047OooOoOO c23047OooOoOO = this.f71250OooOo;
        C33781o00o0O c33781o00o0O = c23047OooOoOO.f71199OooOO0o;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CreatorProfileVM");
            c20358OooO00o.OooO0Oo(e, "Failed to refresh creator profile", new Object[0]);
            do {
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, C23047OooOoOO.OooO0OO.OooO00o((C23047OooOoOO.OooO0OO) value, null, null, null, 0, null, false, false, false, e.getMessage(), 447)));
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            do {
                value2 = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value2, C23047OooOoOO.OooO0OO.OooO00o((C23047OooOoOO.OooO0OO) value2, null, null, null, 0, null, true, false, false, null, 191)));
            InterfaceC27310OooOoO0 interfaceC27310OooOoO0 = c23047OooOoOO.f71192OooO0Oo;
            String str = c23047OooOoOO.f71191OooO;
            this.f71251OooOo0o = 1;
            objOooO00o = interfaceC27310OooOoO0.OooO00o(str, this);
            if (objOooO00o == enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO00o = obj;
        C23047OooOoOO.OooO0o(c23047OooOoOO, (C26953OooO00o) objOooO00o);
        this.f71251OooOo0o = 2;
    }
}
