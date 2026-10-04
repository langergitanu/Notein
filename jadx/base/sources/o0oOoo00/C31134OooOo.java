package o0oOoo00;

import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import java.io.File;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27351Oooo0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oOoo00.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$recoverBackupFiles$1", m80623f = "CloudBackupViewModel.kt", m80624l = {478, 481}, m80625m = "invokeSuspend")
public final class C31134OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f111095OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Exception f111096OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.backup.OooO00o f111097OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f111098OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31134OooOo(ArrayList arrayList, com.orion.notein.p607ui.backup.OooO00o oooO00o, Continuation continuation) {
        super(2, continuation);
        this.f111098OooOoO0 = arrayList;
        this.f111097OooOoO = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31134OooOo(this.f111098OooOoO0, this.f111097OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31134OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r10.OooOo0o(r1, null, r9) == r0) goto L29;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f111095OooOo;
        com.orion.notein.p607ui.backup.OooO00o oooO00o = this.f111097OooOoO;
        try {
        } catch (Exception e) {
            e = e;
            BackupException backupException = e instanceof BackupException ? (BackupException) e : null;
            if (backupException != null) {
                C33772OooooOo c33772OooooOo = oooO00o.f70703OooOo00;
                Integer num = new Integer(backupException.getErrorCode());
                this.f111096OooOo0o = e;
                this.f111095OooOo = 2;
                if (c33772OooooOo.emit(num, this) != enumC32485OooO00o) {
                    exc = e;
                }
                return enumC32485OooO00o;
            }
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ArrayList arrayList = this.f111098OooOoO0;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (C32501OooO0oO.OooO0o0(new File(((BackupFile) obj2).getName())).equals(BackupFile.EXTENSION_NOTEIN_FILE)) {
                    arrayList2.add(obj2);
                }
            }
            C27351Oooo0O0 c27351Oooo0O0 = oooO00o.f70688OooO0o0;
            this.f111095OooOo = 1;
        } else if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            exc = this.f111096OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            e = exc;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CloudBackupViewModel");
            e.printStackTrace();
            c20358OooO00o.OooO0OO("Unable to recover backup files. " + C32460OooOooO.f116667OooO00o, new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
