package o0OOOO00;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import o0000oOO.C24332OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOOO00.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.theme.ThemeRepoImpl$saveCustomBasePageColors$2", m80623f = "ThemeRepoImpl.kt", m80624l = {149}, m80625m = "invokeSuspend")
public final class C27093OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27095OooOo0O f94406OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94407OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f94408OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27093OooOOoo(C27095OooOo0O c27095OooOo0O, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f94406OooOo = c27095OooOo0O;
        this.f94408OooOoO0 = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27093OooOOoo(this.f94406OooOo, this.f94408OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27093OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94407OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            OooOO0O oooOO0O = this.f94406OooOo.f94414OooO00o;
            this.f94407OooOo0o = 1;
            oooOO0O.getClass();
            Object objOooO00o = C24332OooO.OooO00o(oooOO0O.f94372OooO00o, new OooO(this.f94408OooOoO0, null), this);
            if (objOooO00o != obj2) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o == obj2) {
                return obj2;
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
