package com.orion.notein.p607ui.backup.netdisk;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.aspose.slides.C22227OoooO;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.OooOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0OOo0o.C27335OooOOo;
import o0OOo0o.C27351Oooo0O0;
import o0Oo0O00.C28051OooO00o;
import o0Oo0Oo0.C28094OooO00o;
import o0Oo0Oo0.C28095OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/ui/backup/netdisk/CloudBackupWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lo0OOo0o/Oooo0O0;", "backupUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lo0OOo0o/Oooo0O0;)V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CloudBackupWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C27351Oooo0O0 f70779OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudBackupWorker(Context appContext, WorkerParameters workerParams, C27351Oooo0O0 backupUseCase) {
        super(appContext, workerParams);
        OooOOO0.OooO0oO(appContext, "appContext");
        OooOOO0.OooO0oO(workerParams, "workerParams");
        OooOOO0.OooO0oO(backupUseCase, "backupUseCase");
        this.f70779OooOooo = backupUseCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.StringBuilder] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28094OooO00o c28094OooO00o;
        String str;
        CloudBackupWorker cloudBackupWorker;
        BackupFile.DiskVendor diskVendor;
        String str2;
        C27351Oooo0O0 c27351Oooo0O0;
        C27351Oooo0O0 c27351Oooo0O02;
        BackupFile.DiskVendor diskVendor2;
        Exception exc;
        CloudBackupWorker cloudBackupWorker2;
        Object objOooO0o;
        String str3;
        OooOO0<AbstractC24338OooO0o0> oooOO0OooO00o;
        C28095OooO0O0 c28095OooO0O0;
        ?? r2;
        if (abstractC32479OooO0OO instanceof C28094OooO00o) {
            c28094OooO00o = (C28094OooO00o) abstractC32479OooO0OO;
            int i = c28094OooO00o.f99571OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28094OooO00o.f99571OooOooO = i - Integer.MIN_VALUE;
            } else {
                c28094OooO00o = new C28094OooO00o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28094OooO00o.f99570OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28094OooO00o.f99571OooOooO;
        ?? r12 = 1;
        r12 = 1;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String string = UUID.randomUUID().toString();
            OooOOO0.OooO0o(string, "toString(...)");
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CloudBackupWorker");
            c20358OooO00o.OooO0o0("doWork, start to backup to cloud, workId: ".concat(string), new Object[0]);
            c28094OooO00o.f99565OooOo0o = this;
            c28094OooO00o.f99564OooOo = string;
            c28094OooO00o.f99571OooOooO = 1;
            Enum enumOooOo0O = this.f70779OooOooo.OooOo0O(c28094OooO00o);
            if (enumOooOo0O != enumC32485OooO00o) {
                str = string;
                obj = enumOooOo0O;
                cloudBackupWorker = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                BackupFile.DiskVendor diskVendor3 = (BackupFile.DiskVendor) c28094OooO00o.f99567OooOoO0;
                str2 = c28094OooO00o.f99564OooOo;
                cloudBackupWorker = c28094OooO00o.f99565OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                } catch (Exception e) {
                    e = e;
                    diskVendor = diskVendor3;
                    if (e instanceof BackupException) {
                        c27351Oooo0O02 = cloudBackupWorker.f70779OooOooo;
                        diskVendor2 = BackupFile.DiskVendor.None;
                        c28094OooO00o.f99565OooOo0o = cloudBackupWorker;
                        c28094OooO00o.f99564OooOo = str2;
                        c28094OooO00o.f99567OooOoO0 = diskVendor;
                        c28094OooO00o.f99566OooOoO = (BackupException) e;
                        c28094OooO00o.f99571OooOooO = 3;
                        if (c27351Oooo0O02.OooOoO(diskVendor2, c28094OooO00o) != enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("CloudBackupWorker");
                    c20358OooO00o2.OooO0Oo(e, "doWork, backup error.", new Object[0]);
                    if (e instanceof BackupException) {
                    }
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                ?? OooO00o2 = C22227OoooO.OooO00o(c20358OooO00o3, "CloudBackupWorker", "doWork, backup done, workId: ", str2, ", success: ");
                OooO00o2.append(r12);
                c20358OooO00o3.OooO0o0(OooO00o2.toString(), new Object[0]);
                oooOO0OooO00o = C28051OooO00o.OooO00o(cloudBackupWorker.f66669OooOo0o);
                c28095OooO0O0 = new C28095OooO0O0(r12, null);
                c28094OooO00o.f99565OooOo0o = null;
                c28094OooO00o.f99564OooOo = null;
                c28094OooO00o.f99567OooOoO0 = null;
                c28094OooO00o.f99568OooOoOO = r12;
                c28094OooO00o.f99571OooOooO = 5;
                if (C24332OooO.OooO00o(oooOO0OooO00o, c28095OooO0O0, c28094OooO00o) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = c28094OooO00o.f99568OooOoOO;
                    C32446OooOOOo.OooO0O0(obj);
                    r2 = i3;
                    return r2 == 0 ? new ListenableWorker.OooO00o.OooO0OO() : new ListenableWorker.OooO00o.C19046OooO00o();
                }
                exc = (Exception) c28094OooO00o.f99567OooOoO0;
                str3 = c28094OooO00o.f99564OooOo;
                cloudBackupWorker2 = c28094OooO00o.f99565OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                e = exc;
                str2 = str3;
                cloudBackupWorker = cloudBackupWorker2;
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("CloudBackupWorker");
                c20358OooO00o22.OooO0Oo(e, "doWork, backup error.", new Object[0]);
                r12 = ((e instanceof BackupException) || ((BackupException) e).getErrorCode() != -6) ? 0 : 1;
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                ?? OooO00o22 = C22227OoooO.OooO00o(c20358OooO00o32, "CloudBackupWorker", "doWork, backup done, workId: ", str2, ", success: ");
                OooO00o22.append(r12);
                c20358OooO00o32.OooO0o0(OooO00o22.toString(), new Object[0]);
                oooOO0OooO00o = C28051OooO00o.OooO00o(cloudBackupWorker.f66669OooOo0o);
                c28095OooO0O0 = new C28095OooO0O0(r12, null);
                c28094OooO00o.f99565OooOo0o = null;
                c28094OooO00o.f99564OooOo = null;
                c28094OooO00o.f99567OooOoO0 = null;
                c28094OooO00o.f99568OooOoOO = r12;
                c28094OooO00o.f99571OooOooO = 5;
                if (C24332OooO.OooO00o(oooOO0OooO00o, c28095OooO0O0, c28094OooO00o) != enumC32485OooO00o) {
                    r2 = r12;
                    if (r2 == 0) {
                    }
                }
                return enumC32485OooO00o;
            }
            exc = c28094OooO00o.f99566OooOoO;
            BackupFile.DiskVendor diskVendor4 = (BackupFile.DiskVendor) c28094OooO00o.f99567OooOoO0;
            str2 = c28094OooO00o.f99564OooOo;
            cloudBackupWorker = c28094OooO00o.f99565OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            diskVendor = diskVendor4;
            cloudBackupWorker2 = cloudBackupWorker;
            C27351Oooo0O0 c27351Oooo0O03 = cloudBackupWorker2.f70779OooOooo;
            c28094OooO00o.f99565OooOo0o = cloudBackupWorker2;
            c28094OooO00o.f99564OooOo = str2;
            c28094OooO00o.f99567OooOoO0 = exc;
            c28094OooO00o.f99566OooOoO = null;
            c28094OooO00o.f99571OooOooO = 4;
            c27351Oooo0O03.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27335OooOOo(diskVendor, null, c27351Oooo0O03), c28094OooO00o);
            if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o != enumC32485OooO00o) {
                str3 = str2;
                e = exc;
                str2 = str3;
                cloudBackupWorker = cloudBackupWorker2;
                C34406OooO00o.C20358OooO00o c20358OooO00o222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o222.OooOOO0("CloudBackupWorker");
                c20358OooO00o222.OooO0Oo(e, "doWork, backup error.", new Object[0]);
                if (e instanceof BackupException) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o322 = C34406OooO00o.f123390OooO00o;
                ?? OooO00o222 = C22227OoooO.OooO00o(c20358OooO00o322, "CloudBackupWorker", "doWork, backup done, workId: ", str2, ", success: ");
                OooO00o222.append(r12);
                c20358OooO00o322.OooO0o0(OooO00o222.toString(), new Object[0]);
                oooOO0OooO00o = C28051OooO00o.OooO00o(cloudBackupWorker.f66669OooOo0o);
                c28095OooO0O0 = new C28095OooO0O0(r12, null);
                c28094OooO00o.f99565OooOo0o = null;
                c28094OooO00o.f99564OooOo = null;
                c28094OooO00o.f99567OooOoO0 = null;
                c28094OooO00o.f99568OooOoOO = r12;
                c28094OooO00o.f99571OooOooO = 5;
                if (C24332OooO.OooO00o(oooOO0OooO00o, c28095OooO0O0, c28094OooO00o) != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
        str = c28094OooO00o.f99564OooOo;
        cloudBackupWorker = c28094OooO00o.f99565OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        diskVendor = (BackupFile.DiskVendor) obj;
        if (diskVendor == null) {
            return new ListenableWorker.OooO00o.C19046OooO00o();
        }
        try {
            c27351Oooo0O0 = cloudBackupWorker.f70779OooOooo;
            c28094OooO00o.f99565OooOo0o = cloudBackupWorker;
            c28094OooO00o.f99564OooOo = str;
            c28094OooO00o.f99567OooOoO0 = diskVendor;
            c28094OooO00o.f99571OooOooO = 2;
        } catch (Exception e2) {
            e = e2;
            str2 = str;
            if ((e instanceof BackupException) && ((BackupException) e).getErrorCode() == -101) {
                c27351Oooo0O02 = cloudBackupWorker.f70779OooOooo;
                diskVendor2 = BackupFile.DiskVendor.None;
                c28094OooO00o.f99565OooOo0o = cloudBackupWorker;
                c28094OooO00o.f99564OooOo = str2;
                c28094OooO00o.f99567OooOoO0 = diskVendor;
                c28094OooO00o.f99566OooOoO = (BackupException) e;
                c28094OooO00o.f99571OooOooO = 3;
                if (c27351Oooo0O02.OooOoO(diskVendor2, c28094OooO00o) != enumC32485OooO00o) {
                    exc = e;
                    cloudBackupWorker2 = cloudBackupWorker;
                    C27351Oooo0O0 c27351Oooo0O032 = cloudBackupWorker2.f70779OooOooo;
                    c28094OooO00o.f99565OooOo0o = cloudBackupWorker2;
                    c28094OooO00o.f99564OooOo = str2;
                    c28094OooO00o.f99567OooOoO0 = exc;
                    c28094OooO00o.f99566OooOoO = null;
                    c28094OooO00o.f99571OooOooO = 4;
                    c27351Oooo0O032.getClass();
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27335OooOOo(diskVendor, null, c27351Oooo0O032), c28094OooO00o);
                    if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                    }
                    if (objOooO0o != enumC32485OooO00o) {
                    }
                }
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2222 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2222.OooOOO0("CloudBackupWorker");
            c20358OooO00o2222.OooO0Oo(e, "doWork, backup error.", new Object[0]);
            if (e instanceof BackupException) {
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3222 = C34406OooO00o.f123390OooO00o;
            ?? OooO00o2222 = C22227OoooO.OooO00o(c20358OooO00o3222, "CloudBackupWorker", "doWork, backup done, workId: ", str2, ", success: ");
            OooO00o2222.append(r12);
            c20358OooO00o3222.OooO0o0(OooO00o2222.toString(), new Object[0]);
            oooOO0OooO00o = C28051OooO00o.OooO00o(cloudBackupWorker.f66669OooOo0o);
            c28095OooO0O0 = new C28095OooO0O0(r12, null);
            c28094OooO00o.f99565OooOo0o = null;
            c28094OooO00o.f99564OooOo = null;
            c28094OooO00o.f99567OooOoO0 = null;
            c28094OooO00o.f99568OooOoOO = r12;
            c28094OooO00o.f99571OooOooO = 5;
            if (C24332OooO.OooO00o(oooOO0OooO00o, c28095OooO0O0, c28094OooO00o) != enumC32485OooO00o) {
            }
        }
        if (c27351Oooo0O0.OooOOOo(diskVendor, null, null, c28094OooO00o) != enumC32485OooO00o) {
            str2 = str;
            C34406OooO00o.C20358OooO00o c20358OooO00o32222 = C34406OooO00o.f123390OooO00o;
            ?? OooO00o22222 = C22227OoooO.OooO00o(c20358OooO00o32222, "CloudBackupWorker", "doWork, backup done, workId: ", str2, ", success: ");
            OooO00o22222.append(r12);
            c20358OooO00o32222.OooO0o0(OooO00o22222.toString(), new Object[0]);
            oooOO0OooO00o = C28051OooO00o.OooO00o(cloudBackupWorker.f66669OooOo0o);
            c28095OooO0O0 = new C28095OooO0O0(r12, null);
            c28094OooO00o.f99565OooOo0o = null;
            c28094OooO00o.f99564OooOo = null;
            c28094OooO00o.f99567OooOoO0 = null;
            c28094OooO00o.f99568OooOoOO = r12;
            c28094OooO00o.f99571OooOooO = 5;
            if (C24332OooO.OooO00o(oooOO0OooO00o, c28095OooO0O0, c28094OooO00o) != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
