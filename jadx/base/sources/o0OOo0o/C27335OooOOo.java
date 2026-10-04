package o0OOo0o;

import com.orion.notein.domain.models.backup.BackupFile;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27293OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BackupUseCase$cancelAuthorize$2", m80623f = "BackupUseCase.kt", m80624l = {245}, m80625m = "invokeSuspend")
public final class C27335OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27351Oooo0O0 f95138OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95139OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ BackupFile.DiskVendor f95140OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27335OooOOo(BackupFile.DiskVendor diskVendor, Continuation continuation, C27351Oooo0O0 c27351Oooo0O0) {
        super(2, continuation);
        this.f95138OooOo = c27351Oooo0O0;
        this.f95140OooOoO0 = diskVendor;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27335OooOOo(this.f95140OooOoO0, continuation, this.f95138OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27335OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95139OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27293OooO0oo interfaceC27293OooO0oo = this.f95138OooOo.f95243OooO0oo;
            this.f95139OooOo0o = 1;
            if (interfaceC27293OooO0oo.OooO0O0(this.f95140OooOoO0, this) == enumC32485OooO00o) {
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
