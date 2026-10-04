package o0OOo0o;

import OooO0o.C20424OooO0Oo;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import java.io.File;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: renamed from: o0OOo0o.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BackupUseCase$recoverNotesByNoteinFile$2", m80623f = "BackupUseCase.kt", m80624l = {SQLitePersistence.MAX_ARGS}, m80625m = "invokeSuspend")
public final class C27346OooOooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Boolean>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f95206OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95207OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27351Oooo0O0 f95208OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f95209OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27346OooOooO(String str, String str2, C27351Oooo0O0 c27351Oooo0O0, Continuation<? super C27346OooOooO> continuation) {
        super(2, continuation);
        this.f95206OooOo = str;
        this.f95209OooOoO0 = str2;
        this.f95208OooOoO = c27351Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27346OooOooO(this.f95206OooOo, this.f95209OooOoO0, this.f95208OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Boolean>> continuation) {
        return ((C27346OooOooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95207OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String strOooO00o = C24761OooO.OooO00o("toString(...)");
                BackupFile.DiskVendor diskVendor = BackupFile.DiskVendor.None;
                String str = this.f95206OooOo;
                String name = new File(str).getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                BackupFile backupFile = new BackupFile(strOooO00o, diskVendor, name, str, false, System.currentTimeMillis(), 0L, C34436OooOoOO.f123455OooOo0o, null);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("recoverNotesByNoteinFile, filePath: ", str, ", folderId: ");
                String str2 = this.f95209OooOoO0;
                sbOooO0o0.append(str2);
                c20358OooO00o.OooO00o(sbOooO0o0.toString(), new Object[0]);
                C27351Oooo0O0 c27351Oooo0O0 = this.f95208OooOoO;
                List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(backupFile);
                this.f95207OooOo0o = 1;
                if (c27351Oooo0O0.OooOo0o(listOooO0oO, str2, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return new C27174OooO0O0(true, null, null, null, 14);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("BackupUseCase");
            c20358OooO00o2.OooO0Oo(e, "recoverNotesByNoteinFile error.", new Object[0]);
            return new C27174OooO0O0(false, null, e instanceof BackupException ? String.valueOf(((BackupException) e).getErrorCode()) : "", null, 10);
        }
    }
}
