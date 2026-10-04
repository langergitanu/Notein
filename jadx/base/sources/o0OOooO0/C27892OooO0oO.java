package o0OOooO0;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o0OOooO0.C27883OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOooO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.CloudLockManager$executeAcquireAsLeader$2", m80623f = "CloudLockManager.kt", m80624l = {StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4}, m80625m = "invokeSuspend")
public final class C27892OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27883OooO00o f98601OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98602OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O<C27883OooO00o.C27886OooO0o0> f98603OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f98604OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27892OooO0oO(C27883OooO00o c27883OooO00o, String str, C24034Oooo00O<C27883OooO00o.C27886OooO0o0> c24034Oooo00O, Continuation<? super C27892OooO0oO> continuation) {
        super(2, continuation);
        this.f98601OooOo = c27883OooO00o;
        this.f98604OooOoO0 = str;
        this.f98603OooOoO = c24034Oooo00O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27892OooO0oO(this.f98601OooOo, this.f98604OooOoO0, this.f98603OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27892OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98602OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        String str = this.f98603OooOoO.f80942OooOo0o.f98572OooO00o;
        this.f98602OooOo0o = 1;
        Object objOooO00o = C27883OooO00o.OooO00o(this.f98601OooOo, this.f98604OooOoO0, str, this);
        return objOooO00o == enumC32485OooO00o ? enumC32485OooO00o : objOooO00o;
    }
}
