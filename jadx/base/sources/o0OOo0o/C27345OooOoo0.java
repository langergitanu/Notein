package o0OOo0o;

import com.orion.notein.domain.models.backup.BackupFile;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import o0oo000O.C31190OooO0oo;
import o0ooO0O0.C31430OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BackupUseCase$logBackupFilesStorageOccupation$2", m80623f = "BackupUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27345OooOoo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27351Oooo0O0 f95205OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27345OooOoo0(C27351Oooo0O0 c27351Oooo0O0, Continuation<? super C27345OooOoo0> continuation) {
        super(2, continuation);
        this.f95205OooOo0o = c27351Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27345OooOoo0(this.f95205OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27345OooOoo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String strOooO0OO;
        String strOooO0OO2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        for (BackupFile.DiskVendor diskVendor : oOo000Oo.OooOOO.OoooOO0(BackupFile.DiskVendor.values())) {
            File file = new File(this.f95205OooOo0o.f95236OooO00o.getFilesDir(), "backup");
            if (file.exists()) {
                String lowerCase = diskVendor.name().toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
                File file2 = new File(file, lowerCase);
                if (file2.exists()) {
                    File file3 = new File(file2, "chunks");
                    String strOooO0OO3 = "0B";
                    long length = 0;
                    if (file3.exists()) {
                        Iterator it = C31190OooO0oo.OooOo00(file3, true).iterator();
                        long length2 = 0;
                        while (it.hasNext()) {
                            length2 += ((File) it.next()).length();
                        }
                        strOooO0OO = C31430OooO00o.OooO0OO(length2);
                    } else {
                        strOooO0OO = "0B";
                    }
                    File file4 = new File(file2, "to_upload_dir");
                    if (file4.exists()) {
                        Iterator it2 = C31190OooO0oo.OooOo00(file4, true).iterator();
                        long length3 = 0;
                        while (it2.hasNext()) {
                            length3 += ((File) it2.next()).length();
                        }
                        strOooO0OO2 = C31430OooO00o.OooO0OO(length3);
                    } else {
                        strOooO0OO2 = "0B";
                    }
                    File file5 = new File(file2, "to_download_dir");
                    if (file5.exists()) {
                        Iterator it3 = C31190OooO0oo.OooOo00(file5, true).iterator();
                        while (it3.hasNext()) {
                            length += ((File) it3.next()).length();
                        }
                        strOooO0OO3 = C31430OooO00o.OooO0OO(length);
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("BackupUseCase");
                    StringBuilder sb = new StringBuilder("logBackupFilesStorageOccupation, vendor: ");
                    sb.append(diskVendor);
                    sb.append(", chunksSize: ");
                    OooOO0.OooO0OO.OooO0o0(sb, strOooO0OO, ", toUploadSize: ", strOooO0OO2, ", toDownloadSize: ");
                    sb.append(strOooO0OO3);
                    c20358OooO00o.OooO0o0(sb.toString(), new Object[0]);
                }
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
