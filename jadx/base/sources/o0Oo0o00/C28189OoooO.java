package o0Oo0o00;

import kotlin.coroutines.Continuation;
import o00Oo000.C25035OooO0O0;
import o0OOo0Oo.EnumC27285OooO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo0o00.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncSettingsViewModel$cancelAuthorize$2", m80623f = "CloudSyncSettingsViewModel.kt", m80624l = {79}, m80625m = "invokeSuspend")
public final class C28189OoooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28194OoooOOO f99888OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99889OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ EnumC27285OooO f99890OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28189OoooO(C28194OoooOOO c28194OoooOOO, EnumC27285OooO enumC27285OooO, Continuation<? super C28189OoooO> continuation) {
        super(2, continuation);
        this.f99888OooOo = c28194OoooOOO;
        this.f99890OooOoO0 = enumC27285OooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28189OoooO(this.f99888OooOo, this.f99890OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>> continuation) {
        return ((C28189OoooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0O0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99889OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C25035OooO0O0 c25035OooO0O0 = this.f99888OooOo.f99909OooO0o0;
            this.f99889OooOo0o = 1;
            objOooO0O0 = c25035OooO0O0.OooO0O0(this.f99890OooOoO0, this);
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0O0 = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        return new C32445OooOOOO(objOooO0O0);
    }
}
