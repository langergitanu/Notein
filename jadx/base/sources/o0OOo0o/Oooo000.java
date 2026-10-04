package o0OOo0o;

import com.orion.notein.domain.models.backup.BackupFile;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BackupUseCase$recoverTemplatesByVendor$2", m80623f = "BackupUseCase.kt", m80624l = {1023}, m80625m = "invokeSuspend")
public final class Oooo000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C27351Oooo0O0 f95218OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f95219OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f95220OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f95221OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ List<BackupFile> f95222OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27351Oooo0O0 f95223OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(List<BackupFile> list, C27351Oooo0O0 c27351Oooo0O0, Continuation<? super Oooo000> continuation) {
        super(2, continuation);
        this.f95222OooOoOO = list;
        this.f95223OooOoo0 = c27351Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new Oooo000(this.f95222OooOoOO, this.f95223OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((Oooo000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C27351Oooo0O0 c27351Oooo0O0;
        File fileOooOO0;
        Iterator it;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95220OooOoO;
        try {
            try {
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    List<BackupFile> list = this.f95222OooOoOO;
                    if (list.isEmpty()) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    BackupFile.DiskVendor diskVendor = ((BackupFile) oOo000Oo.OooOo.Oooo0oO(list)).getDiskVendor();
                    c27351Oooo0O0 = this.f95223OooOoo0;
                    fileOooOO0 = C27351Oooo0O0.OooOO0(c27351Oooo0O0, diskVendor);
                    C31190OooO0oo.OooO0o(fileOooOO0);
                    C31190OooO0oo.OooO(fileOooOO0);
                    it = list.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.f95221OooOoO0;
                    c27351Oooo0O0 = this.f95218OooOo;
                    fileOooOO0 = this.f95219OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                }
                while (it.hasNext()) {
                    BackupFile backupFile = (BackupFile) it.next();
                    this.f95219OooOo0o = fileOooOO0;
                    this.f95218OooOo = c27351Oooo0O0;
                    this.f95221OooOoO0 = it;
                    this.f95220OooOoO = 1;
                    if (C27351Oooo0O0.OooO0Oo(c27351Oooo0O0, backupFile, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                C31190OooO0oo.OooO0oo(fileOooOO0);
                return C32460OooOooO.f116667OooO00o;
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            C31190OooO0oo.OooO0oo(fileOooOO0);
            throw th;
        }
    }
}
