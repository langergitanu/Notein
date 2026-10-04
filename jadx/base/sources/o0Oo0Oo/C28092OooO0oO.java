package o0Oo0Oo;

import com.orion.notein.domain.models.backup.BackupFile;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo0Oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.netdisk.auth.GoogleDriveAuthViewModel$setVendor$1", m80623f = "GoogleDriveAuthViewModel.kt", m80624l = {19}, m80625m = "invokeSuspend")
public final class C28092OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28093OooO0oo f99561OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99562OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28092OooO0oO(C28093OooO0oo c28093OooO0oo, Continuation<? super C28092OooO0oO> continuation) {
        super(2, continuation);
        this.f99561OooOo = c28093OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28092OooO0oO(this.f99561OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28092OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99562OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28093OooO0oo c28093OooO0oo = this.f99561OooOo;
            int iOrdinal = BackupFile.DiskVendor.GoogleDrive.ordinal();
            this.f99562OooOo0o = 1;
            if (c28093OooO0oo.f99563OooO0Oo.OooO0oO(iOrdinal, this) == enumC32485OooO00o) {
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
