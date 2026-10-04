package com.orion.notein.p607ui.creative_library;

import com.orion.notein.domain.models.material.MaterialCategory;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryListViewModel$loadMore$1", m80623f = "CreativeLibraryListViewModel.kt", m80624l = {208}, m80625m = "invokeSuspend")
public final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23033OooOO0o f71125OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71126OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f71127OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ MaterialCategory f71128OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(C23033OooOO0o c23033OooOO0o, MaterialCategory materialCategory, int i, Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
        this.f71125OooOo = c23033OooOO0o;
        this.f71128OooOoO0 = materialCategory;
        this.f71127OooOoO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOOOO(this.f71125OooOo, this.f71128OooOoO0, this.f71127OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71126OooOo0o;
        C23033OooOO0o c23033OooOO0o = this.f71125OooOo;
        int i2 = this.f71127OooOoO;
        MaterialCategory materialCategory = this.f71128OooOoO0;
        C33781o00o0O c33781o00o0O = c23033OooOO0o.f71086OooOOO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            do {
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, C23033OooOO0o.OooO0OO.OooO00o((C23033OooOO0o.OooO0OO) value, null, null, false, true, false, 47)));
            this.f71126OooOo0o = 1;
            obj = C23033OooOO0o.OooO0o0(c23033OooOO0o, materialCategory, i2, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        List list = (List) obj;
        if (materialCategory != ((C23033OooOO0o.OooO0OO) c33781o00o0O.getValue()).f71105OooO0O0) {
            return C32460OooOooO.f116667OooO00o;
        }
        C33781o00o0O c33781o00o0O2 = c23033OooOO0o.f71084OooOO0o;
        ArrayList arrayListOooooOO = OooOo.OooooOO((Collection) c33781o00o0O2.getValue(), list);
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, arrayListOooooOO);
        do {
            value2 = c33781o00o0O.getValue();
        } while (!c33781o00o0O.OooO(value2, C23033OooOO0o.OooO0OO.OooO00o((C23033OooOO0o.OooO0OO) value2, null, null, false, false, list.size() < 9, 15)));
        c23033OooOO0o.f71083OooOO0O.put(materialCategory, new Integer(i2));
        return C32460OooOooO.f116667OooO00o;
    }
}
