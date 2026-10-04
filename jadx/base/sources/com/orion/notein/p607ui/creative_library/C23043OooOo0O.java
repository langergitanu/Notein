package com.orion.notein.p607ui.creative_library;

import com.orion.notein.p607ui.creative_library.C23040OooOOoo;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibrarySearchViewModel$observeSearchQuery$1", m80623f = "CreativeLibrarySearchViewModel.kt", m80624l = {83}, m80625m = "invokeSuspend")
public final class C23043OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23040OooOOoo f71173OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71174OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOo0O$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23040OooOOoo f71175OooOo0o;

        public OooO00o(C23040OooOOoo c23040OooOOoo) {
            this.f71175OooOo0o = c23040OooOOoo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(Object obj, Continuation continuation) {
            Object value;
            String str = (String) obj;
            boolean zOooo0o0 = C33599OooOo0O.Oooo0o0(str);
            C23040OooOOoo c23040OooOOoo = this.f71175OooOo0o;
            if (!zOooo0o0) {
                Object objOooO0o0 = C23040OooOOoo.OooO0o0(c23040OooOOoo, str, continuation);
                return objOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o0 : C32460OooOooO.f116667OooO00o;
            }
            C33781o00o0O c33781o00o0O = c23040OooOOoo.f71150OooOO0o;
            do {
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, C23040OooOOoo.OooO0O0.OooO00o((C23040OooOOoo.OooO0O0) value, C34434OooOoO.f123453OooOo0o, 5)));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23043OooOo0O(C23040OooOOoo c23040OooOOoo, Continuation<? super C23043OooOo0O> continuation) {
        super(2, continuation);
        this.f71173OooOo = c23040OooOOoo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23043OooOo0O(this.f71173OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23043OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71174OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C23040OooOOoo c23040OooOOoo = this.f71173OooOo;
            InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0o = C25252OooO0Oo.OooOO0o(C25252OooO0Oo.OooOO0O(c23040OooOOoo.f71151OooOOO, 300L));
            OooO00o oooO00o = new OooO00o(c23040OooOOoo);
            this.f71174OooOo0o = 1;
            if (interfaceC33721OooO0oOooOO0o.collect(oooO00o, this) == enumC32485OooO00o) {
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
