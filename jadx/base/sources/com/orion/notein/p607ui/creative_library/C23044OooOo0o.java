package com.orion.notein.p607ui.creative_library;

import com.orion.notein.p607ui.creative_library.C23040OooOOoo;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibrarySearchViewModel$onActionClicked$1", m80623f = "CreativeLibrarySearchViewModel.kt", m80624l = {232}, m80625m = "invokeSuspend")
public final class C23044OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23040OooOOoo f71176OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71177OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f71178OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23044OooOo0o(C23040OooOOoo c23040OooOOoo, String str, Continuation<? super C23044OooOo0o> continuation) {
        super(2, continuation);
        this.f71176OooOo = c23040OooOOoo;
        this.f71178OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23044OooOo0o(this.f71176OooOo, this.f71178OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23044OooOo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71177OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33772OooooOo c33772OooooOo = this.f71176OooOo.f71142OooO;
            C23040OooOOoo.OooO00o.OooO0O0 oooO0O0 = new C23040OooOOoo.OooO00o.OooO0O0(this.f71178OooOoO0);
            this.f71177OooOo0o = 1;
            if (c33772OooooOo.emit(oooO0O0, this) == enumC32485OooO00o) {
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
