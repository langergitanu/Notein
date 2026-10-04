package o0OO00o0;

import com.orion.notein.data.p602db.entity.HyperLinkEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34757o0000Oo;

/* JADX INFO: renamed from: o0OO00o0.o000ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.HyperLinkLocalDataSource$getHyperLinksByPageId$2", m80623f = "HyperLinkLocalDataSource.kt", m80624l = {77}, m80625m = "invokeSuspend")
public final class C26581o000ooOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34757o0000Oo, Continuation<? super List<? extends HyperLinkEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91609OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91610OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f91611OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26581o000ooOO(String str, Continuation<? super C26581o000ooOO> continuation) {
        super(2, continuation);
        this.f91611OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26581o000ooOO c26581o000ooOO = new C26581o000ooOO(this.f91611OooOoO0, continuation);
        c26581o000ooOO.f91609OooOo = obj;
        return c26581o000ooOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34757o0000Oo interfaceC34757o0000Oo, Continuation<? super List<? extends HyperLinkEntity>> continuation) {
        return ((C26581o000ooOO) create(interfaceC34757o0000Oo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91610OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC34757o0000Oo interfaceC34757o0000Oo = (InterfaceC34757o0000Oo) this.f91609OooOo;
        this.f91610OooOo0o = 1;
        Object objOooO0OO = interfaceC34757o0000Oo.OooO0OO(this.f91611OooOoO0, this);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }
}
