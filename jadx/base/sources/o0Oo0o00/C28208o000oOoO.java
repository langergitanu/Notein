package o0Oo0o00;

import kotlin.coroutines.Continuation;
import o0OOo0oo.C27635OooOoO;
import o0OOooO0.EnumC27953o00000Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo0o00.o000oOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncSettingsViewModel$setNetworkStrategy$1", m80623f = "CloudSyncSettingsViewModel.kt", m80624l = {73}, m80625m = "invokeSuspend")
public final class C28208o000oOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28194OoooOOO f99989OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99990OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ EnumC27953o00000Oo f99991OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28208o000oOoO(C28194OoooOOO c28194OoooOOO, EnumC27953o00000Oo enumC27953o00000Oo, Continuation<? super C28208o000oOoO> continuation) {
        super(2, continuation);
        this.f99989OooOo = c28194OoooOOO;
        this.f99991OooOoO0 = enumC27953o00000Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28208o000oOoO(this.f99989OooOo, this.f99991OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28208o000oOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99990OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27635OooOoO c27635OooOoO = this.f99989OooOo.f99908OooO0o;
            this.f99990OooOo0o = 1;
            if (c27635OooOoO.OooO0OO(this.f99991OooOoO0, this) == enumC32485OooO00o) {
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
