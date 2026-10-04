package com.orion.notein.data.repo.backup;

import android.net.Uri;
import com.google.api.services.drive.Drive;
import com.orion.notein.domain.models.backup.BackupEvent;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.backup.BackupInstance;
import java.io.File;
import java.io.Serializable;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.zip.ZipEntry;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24340OooO0oo;
import o000oo0.C24684Oooo;
import o0OOo0Oo.InterfaceC27293OooO0oo;
import o0OOo0o.C27350Oooo00o;
import o0Oo0O00.C28051OooO00o;
import o0Oo0Oo.C28087OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33737OooOo00;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: com.orion.notein.data.repo.backup.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C22913Oooo0OO implements InterfaceC27293OooO0oo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f69977OooO0o0 = C24340OooO0oo.OooO0OO("back_up_mode");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f69978OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C22912Oooo0O0 f69979OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final BackupBaiduDatasource f69980OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C22907OooOooO f69981OooO0Oo;

    /* JADX INFO: renamed from: com.orion.notein.data.repo.backup.Oooo0OO$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f69982OooO00o;

        static {
            int[] iArr = new int[BackupFile.DiskVendor.values().length];
            try {
                iArr[BackupFile.DiskVendor.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BackupFile.DiskVendor.Baidu.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BackupFile.DiskVendor.GoogleDrive.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BackupFile.DiskVendor.Local.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f69982OooO00o = iArr;
        }
    }

    public C22913Oooo0OO(o0000o0O.OooOO0<AbstractC24338OooO0o0> dataStore, C22912Oooo0O0 c22912Oooo0O0, BackupBaiduDatasource backupBaiduDatasource, C22907OooOooO c22907OooOooO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(dataStore, "dataStore");
        this.f69978OooO00o = dataStore;
        this.f69979OooO0O0 = c22912Oooo0O0;
        this.f69980OooO0OO = backupBaiduDatasource;
        this.f69981OooO0Oo = c22907OooOooO;
    }

    @Override // o0OOo0Oo.InterfaceC27293OooO0oo
    public final C22916Oooo0oO OooO() {
        return new C22916Oooo0oO(this.f69978OooO00o.getData());
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x016c, code lost:
    
        if (o0000oOO.C24332OooO.OooO00o(r0, r3, r5) == r6) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:16:0x0042, B:65:0x012b, B:23:0x0057, B:69:0x014b, B:26:0x0061, B:29:0x006c, B:57:0x00f1, B:61:0x00ff, B:62:0x011c, B:66:0x012e, B:70:0x014e, B:32:0x0077, B:48:0x00d7, B:50:0x00db, B:53:0x00ea, B:36:0x00a1, B:38:0x00a5, B:44:0x00d0, B:41:0x00cb), top: B:76:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f1 A[Catch: Exception -> 0x0047, PHI: r0 r2
      0x00f1: PHI (r0v15 com.orion.notein.data.repo.backup.Oooo0OO) = 
      (r0v3 com.orion.notein.data.repo.backup.Oooo0OO)
      (r0v14 com.orion.notein.data.repo.backup.Oooo0OO)
      (r0v14 com.orion.notein.data.repo.backup.Oooo0OO)
      (r0v29 com.orion.notein.data.repo.backup.Oooo0OO)
     binds: [B:56:0x00f0, B:49:0x00d9, B:54:0x00ec, B:29:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r2v4 com.orion.notein.domain.models.backup.BackupFile$DiskVendor) = 
      (r2v0 com.orion.notein.domain.models.backup.BackupFile$DiskVendor)
      (r2v3 com.orion.notein.domain.models.backup.BackupFile$DiskVendor)
      (r2v3 com.orion.notein.domain.models.backup.BackupFile$DiskVendor)
      (r2v6 com.orion.notein.domain.models.backup.BackupFile$DiskVendor)
     binds: [B:56:0x00f0, B:49:0x00d9, B:54:0x00ec, B:29:0x006c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0047, blocks: (B:16:0x0042, B:65:0x012b, B:23:0x0057, B:69:0x014b, B:26:0x0061, B:29:0x006c, B:57:0x00f1, B:61:0x00ff, B:62:0x011c, B:66:0x012e, B:70:0x014e, B:32:0x0077, B:48:0x00d7, B:50:0x00db, B:53:0x00ea, B:36:0x00a1, B:38:0x00a5, B:44:0x00d0, B:41:0x00cb), top: B:76:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014e A[Catch: Exception -> 0x0047, TRY_LEAVE, TryCatch #0 {Exception -> 0x0047, blocks: (B:16:0x0042, B:65:0x012b, B:23:0x0057, B:69:0x014b, B:26:0x0061, B:29:0x006c, B:57:0x00f1, B:61:0x00ff, B:62:0x011c, B:66:0x012e, B:70:0x014e, B:32:0x0077, B:48:0x00d7, B:50:0x00db, B:53:0x00ea, B:36:0x00a1, B:38:0x00a5, B:44:0x00d0, B:41:0x00cb), top: B:76:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // o0OOo0Oo.InterfaceC27293OooO0oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(BackupFile.DiskVendor diskVendor, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C22922OoooOO0 c22922OoooOO0;
        C22913Oooo0OO c22913Oooo0OO;
        int i;
        BackupFile.DiskVendor diskVendor2 = diskVendor;
        if (abstractC32479OooO0OO instanceof C22922OoooOO0) {
            c22922OoooOO0 = (C22922OoooOO0) abstractC32479OooO0OO;
            int i2 = c22922OoooOO0.f70013OooOoOO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c22922OoooOO0.f70013OooOoOO = i2 - Integer.MIN_VALUE;
            } else {
                c22922OoooOO0 = new C22922OoooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c22922OoooOO0.f70012OooOoO0;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c22922OoooOO0.f70013OooOoOO;
        try {
            if (i3 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("BackupRepoImpl");
                c20358OooO00o.OooO0o0("useNetworkDisk, vendor: " + diskVendor2 + ", shouldClearAuthOnVendorIsNone: " + z, new Object[0]);
                if (z) {
                    if (diskVendor2 != BackupFile.DiskVendor.Baidu) {
                        BackupBaiduDatasource backupBaiduDatasource = this.f69980OooO0OO;
                        c22922OoooOO0.f70010OooOo0o = this;
                        c22922OoooOO0.f70009OooOo = diskVendor2;
                        c22922OoooOO0.f70013OooOoOO = 1;
                        c20358OooO00o.OooOOO0("BackupBaiduDatasource");
                        c20358OooO00o.OooO0o0("clearAuthInfo", new Object[0]);
                        Object objOooO00o = C24332OooO.OooO00o(C28051OooO00o.OooO00o(backupBaiduDatasource.f69831OooO00o), new C22892OooO0oO(2, null), c22922OoooOO0);
                        if (objOooO00o != obj2) {
                            objOooO00o = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooO00o != obj2) {
                            objOooO00o = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooO00o == obj2) {
                            return obj2;
                        }
                    }
                    c22913Oooo0OO = this;
                    if (diskVendor2 == BackupFile.DiskVendor.GoogleDrive) {
                    }
                } else {
                    c22913Oooo0OO = this;
                    i = OooO00o.f69982OooO00o[diskVendor2.ordinal()];
                    if (i != 1) {
                    }
                }
            } else if (i3 == 1) {
                diskVendor2 = c22922OoooOO0.f70009OooOo;
                c22913Oooo0OO = (C22913Oooo0OO) c22922OoooOO0.f70010OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (diskVendor2 == BackupFile.DiskVendor.GoogleDrive) {
                    C22907OooOooO c22907OooOooO = c22913Oooo0OO.f69981OooO0Oo;
                    c22922OoooOO0.f70010OooOo0o = c22913Oooo0OO;
                    c22922OoooOO0.f70009OooOo = diskVendor2;
                    c22922OoooOO0.f70013OooOoOO = 2;
                    Object objOooO00o2 = c22907OooOooO.OooO00o(c22922OoooOO0);
                    if (objOooO00o2 != obj2) {
                        objOooO00o2 = C32460OooOooO.f116667OooO00o;
                    }
                    if (objOooO00o2 != obj2) {
                        i = OooO00o.f69982OooO00o[diskVendor2.ordinal()];
                        if (i != 1) {
                        }
                    }
                    return obj2;
                }
            } else if (i3 == 2) {
                diskVendor2 = c22922OoooOO0.f70009OooOo;
                c22913Oooo0OO = (C22913Oooo0OO) c22922OoooOO0.f70010OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                i = OooO00o.f69982OooO00o[diskVendor2.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("BackupRepoImpl");
                        c20358OooO00o2.OooO0o0("useNetworkDisk, baidu, try to use baidu disk.", new Object[0]);
                        BackupBaiduDatasource backupBaiduDatasource2 = c22913Oooo0OO.f69980OooO0OO;
                        c22922OoooOO0.f70010OooOo0o = diskVendor2;
                        c22922OoooOO0.f70009OooOo = null;
                        c22922OoooOO0.f70013OooOoOO = 4;
                        if (backupBaiduDatasource2.OooOOoo(c22922OoooOO0) == obj2) {
                        }
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    } else if (i != 3) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("BackupRepoImpl");
                        c20358OooO00o3.OooOO0O("Unknown disk vendor. " + diskVendor2.name(), new Object[0]);
                        C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    } else {
                        C22907OooOooO c22907OooOooO2 = c22913Oooo0OO.f69981OooO0Oo;
                        c22922OoooOO0.f70010OooOo0o = diskVendor2;
                        c22922OoooOO0.f70009OooOo = null;
                        c22922OoooOO0.f70013OooOoOO = 5;
                        if (c22907OooOooO2.OooOO0O(c22922OoooOO0) == obj2) {
                        }
                        C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                    }
                    return obj2;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("BackupRepoImpl");
                c20358OooO00o4.OooO0o0("useNetworkDisk, none, remove last auto backup record and set net disk vendor in use to none.", new Object[0]);
                o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = c22913Oooo0OO.f69978OooO00o;
                o000oOoO o000oooo2 = new o000oOoO(2, null);
                c22922OoooOO0.f70010OooOo0o = diskVendor2;
                c22922OoooOO0.f70009OooOo = null;
                c22922OoooOO0.f70013OooOoOO = 3;
            } else if (i3 == 3) {
                C32446OooOOOo.OooO0O0(obj);
            } else if (i3 == 4) {
                C32446OooOOOo.OooO0O0(obj);
                C32460OooOooO c32460OooOooO4 = C32460OooOooO.f116667OooO00o;
            } else {
                if (i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                C32460OooOooO c32460OooOooO32 = C32460OooOooO.f116667OooO00o;
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o5.OooOOO0("BackupRepoImpl");
            c20358OooO00o5.OooO0Oo(e, "Unable to use " + diskVendor2 + " to backup file, ", new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27293OooO0oo
    public final Object OooO0O0(BackupFile.DiskVendor diskVendor, AbstractC32476OooO abstractC32476OooO) {
        Object objOooO00o;
        return (OooO00o.f69982OooO00o[diskVendor.ordinal()] == 3 && (objOooO00o = this.f69981OooO0Oo.OooO00o(abstractC32476OooO)) == EnumC32485OooO00o.f116726OooOo0o) ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e1, code lost:
    
        if (r3 == r6) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // o0OOo0Oo.InterfaceC27293OooO0oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0OO(String str, BackupFile.DiskVendor diskVendor, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C22909Oooo c22909Oooo;
        if (abstractC32479OooO0OO instanceof C22909Oooo) {
            c22909Oooo = (C22909Oooo) abstractC32479OooO0OO;
            int i = c22909Oooo.f69952OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22909Oooo.f69952OooOoO = i - Integer.MIN_VALUE;
            } else {
                c22909Oooo = new C22909Oooo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = c22909Oooo.f69950OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22909Oooo.f69952OooOoO;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    BackupFile.DiskVendor diskVendor2 = c22909Oooo.f69951OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooOOO0);
                    return new C32443OooOOO(new Integer(0), (List) objOooOOO0);
                }
                if (i2 == 2) {
                    BackupFile.DiskVendor diskVendor3 = c22909Oooo.f69951OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooOOO0);
                    return new C32443OooOOO(new Integer(0), (List) objOooOOO0);
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                BackupFile.DiskVendor diskVendor4 = c22909Oooo.f69951OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO0);
                return new C32443OooOOO(new Integer(0), (List) objOooOOO0);
            }
            C32446OooOOOo.OooO0O0(objOooOOO0);
            int i3 = OooO00o.f69982OooO00o[diskVendor.ordinal()];
            if (i3 != 2) {
                if (i3 == 3) {
                    C22907OooOooO c22907OooOooO = this.f69981OooO0Oo;
                    c22909Oooo.f69951OooOo0o = diskVendor;
                    c22909Oooo.f69952OooOoO = 3;
                    Drive driveOooO0o0 = c22907OooOooO.OooO0o0();
                    if (driveOooO0o0 == null) {
                        throw new BackupException("Token is null or empty.", BackupEvent.ERROR_INVALID_TOKEN, null, 4, null);
                    }
                    objOooOOO0 = C22907OooOooO.OooO0oo(driveOooO0o0, str, null);
                    if (objOooOOO0 == enumC32485OooO00o) {
                    }
                    return new C32443OooOOO(new Integer(0), (List) objOooOOO0);
                }
                if (i3 == 4) {
                    c22909Oooo.f69951OooOo0o = diskVendor;
                    c22909Oooo.f69952OooOoO = 1;
                    objOooOOO0 = C22912Oooo0O0.OooO0oO(str);
                    if (objOooOOO0 == enumC32485OooO00o) {
                    }
                    return new C32443OooOOO(new Integer(0), (List) objOooOOO0);
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("BackupRepoImpl");
                c20358OooO00o.OooOO0O("Unknown disk vendor. " + diskVendor.name(), new Object[0]);
                return new C32443OooOOO(new Integer(-100), null);
            }
            BackupBaiduDatasource backupBaiduDatasource = this.f69980OooO0OO;
            c22909Oooo.f69951OooOo0o = diskVendor;
            c22909Oooo.f69952OooOoO = 2;
            objOooOOO0 = backupBaiduDatasource.OooOOO0(str, c22909Oooo);
            return enumC32485OooO00o;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("BackupRepoImpl");
            String strName = diskVendor.name();
            e.printStackTrace();
            c20358OooO00o2.OooO0OO("Unable to obtain notein files from net disk. " + strName + ", " + C32460OooOooO.f116667OooO00o, new Object[0]);
            return e instanceof BackupException ? new C32443OooOOO(new Integer(((BackupException) e).getErrorCode()), null) : new C32443OooOOO(new Integer(-999), null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r11.OooOOo0(r9, r1) == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOo0Oo.InterfaceC27293OooO0oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(BackupFile backupFile, BackupFile.DiskVendor diskVendor, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C22918OoooO c22918OoooO;
        int i;
        if (abstractC32479OooO0OO instanceof C22918OoooO) {
            c22918OoooO = (C22918OoooO) abstractC32479OooO0OO;
            int i2 = c22918OoooO.f69998OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c22918OoooO.f69998OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c22918OoooO = new C22918OoooO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c22918OoooO.f69996OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c22918OoooO.f69998OooOoO;
        try {
            if (i3 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i4 = OooO00o.f69982OooO00o[diskVendor.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        BackupBaiduDatasource backupBaiduDatasource = this.f69980OooO0OO;
                        c22918OoooO.f69997OooOo0o = diskVendor;
                        c22918OoooO.f69998OooOoO = 1;
                    } else if (i4 != 3) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("BackupRepoImpl");
                        c20358OooO00o.OooOO0O("Unknown disk vendor. " + diskVendor.name(), new Object[0]);
                        i = -100;
                    } else {
                        C22907OooOooO c22907OooOooO = this.f69981OooO0Oo;
                        c22918OoooO.f69997OooOo0o = diskVendor;
                        c22918OoooO.f69998OooOoO = 2;
                        if (c22907OooOooO.OooOO0(backupFile, c22918OoooO) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
                }
                return new Integer(i);
            }
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            diskVendor = c22918OoooO.f69997OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            i = 0;
            return new Integer(i);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("BackupRepoImpl");
            String strName = diskVendor.name();
            e.printStackTrace();
            c20358OooO00o2.OooO0OO("Couldn't update file to " + strName + ", " + C32460OooOooO.f116667OooO00o, new Object[0]);
            return e instanceof BackupException ? new Integer(((BackupException) e).getErrorCode()) : new Integer(BackupEvent.ERROR_UPLOAD_FAILED);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // o0OOo0Oo.InterfaceC27293OooO0oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0o(String str, Uri uri, AbstractC32479OooO0OO abstractC32479OooO0OO) throws BackupException {
        C22919OoooO0 c22919OoooO0;
        boolean zOooOoOO;
        if (abstractC32479OooO0OO instanceof C22919OoooO0) {
            c22919OoooO0 = (C22919OoooO0) abstractC32479OooO0OO;
            int i = c22919OoooO0.f70002OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22919OoooO0.f70002OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c22919OoooO0 = new C22919OoooO0(this, abstractC32479OooO0OO);
            }
        }
        ?? arrayList = c22919OoooO0.f70001OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22919OoooO0.f70002OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(arrayList);
            c22919OoooO0.f70002OooOoO0 = 1;
            try {
                ArrayList arrayListOooO0o = this.f69979OooO0O0.OooO0o(uri);
                ArrayList<ZipEntry> arrayList2 = new ArrayList();
                for (Object obj : arrayListOooO0o) {
                    ZipEntry zipEntry = (ZipEntry) obj;
                    if (str.length() == 0) {
                        zOooOoOO = true;
                    } else {
                        String name = zipEntry.getName();
                        kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                        zOooOoOO = C33599OooOo0O.OooOoOO(name, str, false);
                    }
                    if (zOooOoOO) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
                for (ZipEntry zipEntry2 : arrayList2) {
                    FileTime lastModifiedTime = zipEntry2.getLastModifiedTime();
                    long millis = lastModifiedTime != null ? lastModifiedTime.toMillis() : 0L;
                    String string = UUID.randomUUID().toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                    BackupFile.DiskVendor diskVendor = BackupFile.DiskVendor.Local;
                    String name2 = new File(zipEntry2.getName()).getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name2, "getName(...)");
                    boolean zIsDirectory = zipEntry2.isDirectory();
                    String name3 = zipEntry2.getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name3, "getName(...)");
                    arrayList.add(new BackupFile(string, diskVendor, name2, name3, zIsDirectory, millis, zipEntry2.getSize(), C22912Oooo0O0.OooO0o0(zipEntry2, uri), null));
                }
                if (arrayList == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o, "BackupLocalDataSource", "Couldn't obtain notein files from backup file. ", e), new Object[0]);
                throw new BackupException(null, -3, null, 4, null);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(arrayList);
        }
        return new C32443OooOOO(new Integer(0), (List) arrayList);
    }

    @Override // o0OOo0Oo.InterfaceC27293OooO0oo
    public final Object OooO0o0(int i, C27350Oooo00o c27350Oooo00o) {
        Object objOooO00o = C24332OooO.OooO00o(this.f69978OooO00o, new C22921OoooO0O(i, null), c27350Oooo00o);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27293OooO0oo
    public final Object OooO0oO(int i, AbstractC32476OooO abstractC32476OooO) {
        BackupBaiduDatasource backupBaiduDatasource = this.f69980OooO0OO;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("BackupBaiduDatasource");
        c20358OooO00o.OooO0o0("setVendor, vendor is " + i + ".", new Object[0]);
        Object objOooO00o = C24332OooO.OooO00o(C28051OooO00o.OooO00o(backupBaiduDatasource.f69831OooO00o), new C22901OooOo0o(i, null), abstractC32476OooO);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r10 == r2) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOo0Oo.InterfaceC27293OooO0oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(BackupFile backupFile, String str, BackupFile.DiskVendor diskVendor, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C22914Oooo0o c22914Oooo0o;
        int i;
        if (abstractC32479OooO0OO instanceof C22914Oooo0o) {
            c22914Oooo0o = (C22914Oooo0o) abstractC32479OooO0OO;
            int i2 = c22914Oooo0o.f69985OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c22914Oooo0o.f69985OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c22914Oooo0o = new C22914Oooo0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c22914Oooo0o.f69983OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c22914Oooo0o.f69985OooOoO;
        try {
            if (i3 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i4 = OooO00o.f69982OooO00o[diskVendor.ordinal()];
                if (i4 == 2) {
                    BackupBaiduDatasource backupBaiduDatasource = this.f69980OooO0OO;
                    c22914Oooo0o.f69984OooOo0o = diskVendor;
                    c22914Oooo0o.f69985OooOoO = 1;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooO(backupBaiduDatasource, backupFile, str, null), c22914Oooo0o);
                    if (objOooO0o != obj2) {
                        objOooO0o = C32460OooOooO.f116667OooO00o;
                    }
                } else if (i4 == 3) {
                    C22907OooOooO c22907OooOooO = this.f69981OooO0Oo;
                    c22914Oooo0o.f69984OooOo0o = diskVendor;
                    c22914Oooo0o.f69985OooOoO = 2;
                    if (c22907OooOooO.OooO0Oo(backupFile, str) == obj2) {
                        return obj2;
                    }
                } else if (i4 != 4) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("BackupRepoImpl");
                    c20358OooO00o.OooOO0O("Unknown disk vendor. " + diskVendor.name(), new Object[0]);
                    i = -100;
                } else {
                    C22912Oooo0O0 c22912Oooo0O0 = this.f69979OooO0O0;
                    c22914Oooo0o.f69984OooOo0o = diskVendor;
                    c22914Oooo0o.f69985OooOoO = 3;
                    if (c22912Oooo0O0.OooO00o(backupFile, str) == obj2) {
                        return obj2;
                    }
                }
                return new Integer(i);
            }
            if (i3 != 1 && i3 != 2 && i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            diskVendor = c22914Oooo0o.f69984OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            i = 0;
            return new Integer(i);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("BackupRepoImpl");
            String strName = diskVendor.name();
            e.printStackTrace();
            c20358OooO00o2.OooO0OO("Couldn't delete the file of " + strName + ", " + C32460OooOooO.f116667OooO00o, new Object[0]);
            return e instanceof BackupException ? new Integer(((BackupException) e).getErrorCode()) : new Integer(-999);
        }
    }

    @Override // o0OOo0Oo.InterfaceC27293OooO0oo
    public final InterfaceC33721OooO0o OooOO0(BackupFile.DiskVendor diskVendor) {
        int i = OooO00o.f69982OooO00o[diskVendor.ordinal()];
        if (i != 2) {
            return i != 3 ? new C33770OooooO0(new C22917Oooo0oo(2, null)) : this.f69981OooO0Oo.f69941OooO0Oo;
        }
        BackupBaiduDatasource backupBaiduDatasource = this.f69980OooO0OO;
        return new C33737OooOo00(new C22897OooOOo0(backupBaiduDatasource, null), new C22895OooOOOo(backupBaiduDatasource.f69835OooO0o0));
    }

    @Override // o0OOo0Oo.InterfaceC27293OooO0oo
    public final Object OooOO0O(String str, C28087OooO0O0 c28087OooO0O0) {
        return this.f69980OooO0OO.OooO0OO(str, c28087OooO0O0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c3, code lost:
    
        if (r14 == r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOo0Oo.InterfaceC27293OooO0oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOO0o(String str, BackupInstance backupInstance, BackupFile.DiskVendor diskVendor, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C22920OoooO00 c22920OoooO00;
        if (abstractC32479OooO0OO instanceof C22920OoooO00) {
            c22920OoooO00 = (C22920OoooO00) abstractC32479OooO0OO;
            int i = c22920OoooO00.f70005OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22920OoooO00.f70005OooOoO = i - Integer.MIN_VALUE;
            } else {
                c22920OoooO00 = new C22920OoooO00(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOOO = c22920OoooO00.f70003OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22920OoooO00.f70005OooOoO;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    BackupFile.DiskVendor diskVendor2 = c22920OoooO00.f70004OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooOOOO);
                    return new C32443OooOOO(new Integer(0), (List) objOooOOOO);
                }
                if (i2 == 2) {
                    BackupFile.DiskVendor diskVendor3 = c22920OoooO00.f70004OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooOOOO);
                    return new C32443OooOOO(new Integer(0), (List) objOooOOOO);
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                BackupFile.DiskVendor diskVendor4 = c22920OoooO00.f70004OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOOO);
                return new C32443OooOOO(new Integer(0), (List) objOooOOOO);
            }
            C32446OooOOOo.OooO0O0(objOooOOOO);
            int i3 = OooO00o.f69982OooO00o[diskVendor.ordinal()];
            if (i3 != 2) {
                if (i3 == 3) {
                    C22907OooOooO c22907OooOooO = this.f69981OooO0Oo;
                    c22920OoooO00.f70004OooOo0o = diskVendor;
                    c22920OoooO00.f70005OooOoO = 3;
                    objOooOOOO = c22907OooOooO.OooO(str, backupInstance, c22920OoooO00);
                    if (objOooOOOO == enumC32485OooO00o) {
                    }
                    return new C32443OooOOO(new Integer(0), (List) objOooOOOO);
                }
                if (i3 == 4) {
                    c22920OoooO00.f70004OooOo0o = diskVendor;
                    c22920OoooO00.f70005OooOoO = 1;
                    objOooOOOO = C22912Oooo0O0.OooO0oO(str);
                    if (objOooOOOO == enumC32485OooO00o) {
                    }
                    return new C32443OooOOO(new Integer(0), (List) objOooOOOO);
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("BackupRepoImpl");
                c20358OooO00o.OooOO0O("Unknown disk vendor. " + diskVendor.name(), new Object[0]);
                return new C32443OooOOO(new Integer(-100), null);
            }
            BackupBaiduDatasource backupBaiduDatasource = this.f69980OooO0OO;
            c22920OoooO00.f70004OooOo0o = diskVendor;
            c22920OoooO00.f70005OooOoO = 2;
            objOooOOOO = backupBaiduDatasource.OooOOOO(str, backupInstance, c22920OoooO00);
            return enumC32485OooO00o;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("BackupRepoImpl");
            String strName = diskVendor.name();
            e.printStackTrace();
            c20358OooO00o2.OooO0OO("Unable to obtain notein files from net disk. " + strName + ", " + C32460OooOooO.f116667OooO00o, new Object[0]);
            return e instanceof BackupException ? new C32443OooOOO(new Integer(((BackupException) e).getErrorCode()), null) : new C32443OooOOO(new Integer(-999), null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r11.OooO0O0(r9, r1) == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOo0Oo.InterfaceC27293OooO0oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(List list, BackupFile.DiskVendor diskVendor, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C22915Oooo0o0 c22915Oooo0o0;
        int i;
        if (abstractC32479OooO0OO instanceof C22915Oooo0o0) {
            c22915Oooo0o0 = (C22915Oooo0o0) abstractC32479OooO0OO;
            int i2 = c22915Oooo0o0.f69989OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c22915Oooo0o0.f69989OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c22915Oooo0o0 = new C22915Oooo0o0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c22915Oooo0o0.f69987OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c22915Oooo0o0.f69989OooOoO;
        try {
            if (i3 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i4 = OooO00o.f69982OooO00o[diskVendor.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        BackupBaiduDatasource backupBaiduDatasource = this.f69980OooO0OO;
                        c22915Oooo0o0.f69988OooOo0o = diskVendor;
                        c22915Oooo0o0.f69989OooOoO = 1;
                    } else if (i4 != 3) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("BackupRepoImpl");
                        c20358OooO00o.OooOO0O("Unknown disk vendor. " + diskVendor.name(), new Object[0]);
                        i = -100;
                    } else {
                        C22907OooOooO c22907OooOooO = this.f69981OooO0Oo;
                        c22915Oooo0o0.f69988OooOo0o = diskVendor;
                        c22915Oooo0o0.f69989OooOoO = 2;
                        if (c22907OooOooO.OooO0OO(list) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
                }
                return new Integer(i);
            }
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            diskVendor = c22915Oooo0o0.f69988OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            i = 0;
            return new Integer(i);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("BackupRepoImpl");
            String strName = diskVendor.name();
            e.printStackTrace();
            c20358OooO00o2.OooO0OO("Couldn't delete the file of " + strName + ", " + C32460OooOooO.f116667OooO00o, new Object[0]);
            return e instanceof BackupException ? new Integer(((BackupException) e).getErrorCode()) : new Integer(-999);
        }
    }
}
