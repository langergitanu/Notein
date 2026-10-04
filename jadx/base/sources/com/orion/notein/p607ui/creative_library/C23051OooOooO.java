package com.orion.notein.p607ui.creative_library;

import com.alibaba.sdk.android.oss.internal.OooO00o;
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

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreatorProfileViewModel$loadCreatorProfile$1", m80623f = "CreatorProfileViewModel.kt", m80624l = {124, 128}, m80625m = "invokeSuspend")
public final class C23051OooOooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23047OooOoOO f71236OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71237OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23051OooOooO(C23047OooOoOO c23047OooOoOO, Continuation<? super C23051OooOooO> continuation) {
        super(2, continuation);
        this.f71236OooOo = c23047OooOoOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23051OooOooO(this.f71236OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23051OooOooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (com.orion.notein.p607ui.creative_library.C23047OooOoOO.OooO0o0(r5, 1, r18) == r0) goto L22;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C33781o00o0O c33781o00o0O;
        Object value;
        Object value2;
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71237OooOo0o;
        C23047OooOoOO c23047OooOoOO = this.f71236OooOo;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CreatorProfileVM");
            c20358OooO00o.OooO0Oo(e, OooO00o.OooO00o("Failed to load creator profile: ", c23047OooOoOO.f71191OooO), new Object[0]);
            do {
                c33781o00o0O = c23047OooOoOO.f71199OooOO0o;
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, C23047OooOoOO.OooO0OO.OooO00o((C23047OooOoOO.OooO0OO) value, null, null, null, 0, null, false, false, false, e.getMessage(), 447)));
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33781o00o0O c33781o00o0O2 = c23047OooOoOO.f71199OooOO0o;
            do {
                value2 = c33781o00o0O2.getValue();
            } while (!c33781o00o0O2.OooO(value2, C23047OooOoOO.OooO0OO.OooO00o((C23047OooOoOO.OooO0OO) value2, null, null, null, 0, null, true, false, false, null, 447)));
            InterfaceC27310OooOoO0 interfaceC27310OooOoO0 = c23047OooOoOO.f71192OooO0Oo;
            String str = c23047OooOoOO.f71191OooO;
            this.f71237OooOo0o = 1;
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
        this.f71237OooOo0o = 2;
    }
}
