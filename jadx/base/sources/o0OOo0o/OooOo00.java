package o0OOo0o;

import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.os.BundleKt;
import com.aspose.words.EditingLanguage;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.microsoft.identity.common.java.marker.PerfConstants;
import com.orion.notein.domain.models.backup.BackupEvent;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.backup.BackupInstance;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.note.NotePlaceHolder;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import o0OOo0Oo.InterfaceC27293OooO0oo;
import o0Oo0OoO.C28117OooOOoo;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31193OooOOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BackupUseCase$createNoteByNoteinFile$2", m80623f = "BackupUseCase.kt", m80624l = {EditingLanguage.MARATHI, EditingLanguage.SINHALESE, EditingLanguage.MOHAWK, 1167, 1168, 1189}, m80625m = "invokeSuspend")
public final class OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f95168OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f95169OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f95170OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public File f95171OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public File f95172OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f95173OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f95174OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ BackupFile f95175OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ NotePlaceHolder f95176OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ File f95177Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ C27351Oooo0O0 f95178Oooo00O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(BackupFile backupFile, NotePlaceHolder notePlaceHolder, File file, C27351Oooo0O0 c27351Oooo0O0, Continuation<? super OooOo00> continuation) {
        super(2, continuation);
        this.f95175OooOooO = backupFile;
        this.f95176OooOooo = notePlaceHolder;
        this.f95177Oooo000 = file;
        this.f95178Oooo00O = c27351Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOo00(this.f95175OooOooO, this.f95176OooOooo, this.f95177Oooo000, this.f95178Oooo00O, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x02a0, code lost:
    
        if (r0 != r6) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0314, code lost:
    
        if (r2 == r6) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0352  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long creationTime;
        BackupFile.DiskVendor diskVendor;
        C27351Oooo0O0 c27351Oooo0O0;
        File file;
        Object objOooO0oo;
        String str;
        File file2;
        File file3;
        File file4;
        String str2;
        long j;
        int iIntValue;
        BackupFile backupFile;
        NotePlaceHolder notePlaceHolder;
        Object objOooO0o;
        BackupFile.DiskVendor diskVendor2;
        boolean zBooleanValue;
        Object objO00000Oo;
        String parentId;
        String str3;
        BackupFile.DiskVendor diskVendor3;
        File file5;
        File file6;
        String str4;
        BackupFile.DiskVendor diskVendor4;
        Object objOooO0oo2;
        File file7;
        File file8;
        BackupFile.DiskVendor diskVendor5;
        File file9;
        Object objOooOOO;
        int iIntValue2;
        Object objOooO0o2;
        int iIntValue3;
        int i;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f95173OooOoo;
        C27351Oooo0O0 c27351Oooo0O02 = this.f95178Oooo00O;
        NotePlaceHolder notePlaceHolder2 = this.f95176OooOooo;
        BackupFile backupFile2 = this.f95175OooOooO;
        C27387o0000o0 c27387o0000o0 = c27351Oooo0O02.f95242OooO0oO;
        InterfaceC27293OooO0oo interfaceC27293OooO0oo = c27351Oooo0O02.f95243OooO0oo;
        switch (i2) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.f123390OooO00o.OooO00o("backupFile: " + backupFile2, new Object[0]);
                String id = notePlaceHolder2.getId();
                creationTime = notePlaceHolder2.getCreationTime();
                diskVendor = backupFile2.getDiskVendor();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder();
                sb.append(id);
                c27351Oooo0O0 = c27351Oooo0O02;
                sb.append(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
                sb.append(jCurrentTimeMillis);
                file = new File(this.f95177Oooo000, sb.toString());
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(diskVendor.name(), "None")) {
                    File file10 = new File(file, backupFile2.getName());
                    String absolutePath = file10.getAbsolutePath();
                    kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                    this.f95169OooOo0o = id;
                    this.f95168OooOo = diskVendor;
                    this.f95171OooOoO0 = file;
                    this.f95170OooOoO = file10;
                    this.f95174OooOoo0 = creationTime;
                    this.f95173OooOoo = 1;
                    objOooO0oo = interfaceC27293OooO0oo.OooO0oo(backupFile2, absolutePath, diskVendor, this);
                    if (objOooO0oo != enumC32485OooO00o) {
                        str = id;
                        file2 = file;
                        file3 = file10;
                        iIntValue = ((Number) objOooO0oo).intValue();
                        file4 = file3;
                        file = file2;
                        j = creationTime;
                        str2 = str;
                        if (iIntValue != 0) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                file4 = new File(backupFile2.getPath());
                str2 = id;
                j = creationTime;
                iIntValue = 0;
                if (iIntValue != 0) {
                    throw new BackupException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Couldn't download note. ", file4.getName()), iIntValue, null, 4, null);
                }
                backupFile = backupFile2;
                notePlaceHolder = notePlaceHolder2;
                C34406OooO00o.f123390OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("createNoteByNoteinFile, noteinFile: ", file4.getPath()), new Object[0]);
                this.f95169OooOo0o = str2;
                this.f95168OooOo = diskVendor;
                this.f95171OooOoO0 = file;
                this.f95170OooOoO = file4;
                this.f95174OooOoo0 = j;
                this.f95173OooOoo = 2;
                c27387o0000o0.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27406o000Oo00(c27387o0000o0, file4, null), this);
                if (objOooO0o != enumC32485OooO00o) {
                    diskVendor2 = diskVendor;
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) objOooO0o;
                    zBooleanValue = ((Boolean) c32443OooOOO.f116638OooOo0o).booleanValue();
                    NoteMeta noteMeta = (NoteMeta) c32443OooOOO.f116637OooOo;
                    if (zBooleanValue) {
                        C31193OooOOo.OooO0OO(file4, file);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO("note_id", str2), new C32443OooOOO("creation_time", new Long(j)), new C32443OooOOO("disk_vendor", diskVendor2.name()), new C32443OooOOO("backup_instance", backupFile.getInstance()));
                        C28117OooOOoo c28117OooOOoo = c27351Oooo0O0.f95237OooO0O0;
                        String absolutePath2 = file.getAbsolutePath();
                        kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath2, "getAbsolutePath(...)");
                        this.f95169OooOo0o = file;
                        this.f95168OooOo = file4;
                        this.f95171OooOoO0 = null;
                        this.f95170OooOoO = null;
                        this.f95173OooOoo = 6;
                        objO00000Oo = c28117OooOOoo.o00000Oo(absolutePath2, linkedHashMap, bundleBundleOf, this);
                        break;
                    } else {
                        String strName = diskVendor2.name();
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(strName, "None")) {
                            parentId = notePlaceHolder.getParentId();
                        } else {
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(strName, "Local")) {
                                if (noteMeta != null) {
                                    parentId = noteMeta.getParentId();
                                }
                                str3 = null;
                            } else {
                                if (noteMeta != null) {
                                    parentId = noteMeta.getParentId();
                                }
                                str3 = null;
                            }
                            diskVendor3 = BackupFile.DiskVendor.Local;
                            if (diskVendor2 == diskVendor3) {
                                String string = notePlaceHolder.getExtras().getString("folder_tree_file");
                                String string2 = notePlaceHolder.getExtras().getString("local_folder_tree_file_path");
                                if (string != null && string.length() != 0) {
                                    File file11 = new File(string);
                                    if (file11.exists()) {
                                        file5 = file4;
                                        file6 = file;
                                        str4 = str3;
                                        diskVendor4 = diskVendor2;
                                        file9 = file11;
                                        if (diskVendor4 == BackupFile.DiskVendor.Local) {
                                        }
                                        this.f95169OooOo0o = file6;
                                        this.f95168OooOo = file5;
                                        this.f95171OooOoO0 = null;
                                        this.f95170OooOoO = null;
                                        this.f95172OooOoOO = null;
                                        this.f95173OooOoo = 4;
                                        objOooOOO = C27351Oooo0O0.OooOOO(c27351Oooo0O0, str4, backupFile, file9, diskVendor4, this);
                                        if (objOooOOO != enumC32485OooO00o) {
                                        }
                                    }
                                } else if (string2 != null && string2.length() != 0) {
                                    BackupFile backupFile3 = new BackupFile("", diskVendor3, "folder.tree", string2, false, System.currentTimeMillis(), 0L, backupFile.getContentProperties(), null);
                                    File file12 = new File(file, backupFile3.getName());
                                    String absolutePath3 = file12.getAbsolutePath();
                                    kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath3, "getAbsolutePath(...)");
                                    this.f95169OooOo0o = diskVendor2;
                                    this.f95168OooOo = file;
                                    this.f95171OooOoO0 = file4;
                                    this.f95170OooOoO = str3;
                                    this.f95172OooOoOO = file12;
                                    this.f95173OooOoo = 3;
                                    objOooO0oo2 = interfaceC27293OooO0oo.OooO0oo(backupFile3, absolutePath3, diskVendor2, this);
                                    if (objOooO0oo2 != enumC32485OooO00o) {
                                        file7 = file4;
                                        file6 = file;
                                        file8 = file12;
                                        diskVendor5 = diskVendor2;
                                        iIntValue2 = ((Number) objOooO0oo2).intValue();
                                        C34406OooO00o.f123390OooO00o.OooO00o(C21532OooOOo.OooO0OO(iIntValue2, "downloadFolderTreeResult: "), new Object[0]);
                                        if (iIntValue2 != 0) {
                                            String str5 = str3;
                                            file9 = file8;
                                            str4 = str5;
                                            file5 = file7;
                                            diskVendor4 = diskVendor5;
                                            BackupInstance backupFile4 = diskVendor4 == BackupFile.DiskVendor.Local ? null : backupFile.getInstance();
                                            this.f95169OooOo0o = file6;
                                            this.f95168OooOo = file5;
                                            this.f95171OooOoO0 = null;
                                            this.f95170OooOoO = null;
                                            this.f95172OooOoOO = null;
                                            this.f95173OooOoo = 4;
                                            objOooOOO = C27351Oooo0O0.OooOOO(c27351Oooo0O0, str4, backupFile4, file9, diskVendor4, this);
                                            if (objOooOOO != enumC32485OooO00o) {
                                                file = file6;
                                                String str6 = (String) objOooOOO;
                                                Uri uriFromFile = Uri.fromFile(file5);
                                                String id2 = notePlaceHolder.getId();
                                                this.f95169OooOo0o = file;
                                                this.f95168OooOo = file5;
                                                this.f95173OooOoo = 5;
                                                c27387o0000o0.getClass();
                                                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                                                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27419o000o00o(uriFromFile, id2, str6, c27387o0000o0, null), this);
                                            }
                                            break;
                                        } else {
                                            str4 = str3;
                                            file5 = file7;
                                            diskVendor4 = diskVendor5;
                                            file9 = null;
                                            if (diskVendor4 == BackupFile.DiskVendor.Local) {
                                            }
                                            this.f95169OooOo0o = file6;
                                            this.f95168OooOo = file5;
                                            this.f95171OooOoO0 = null;
                                            this.f95170OooOoO = null;
                                            this.f95172OooOoOO = null;
                                            this.f95173OooOoo = 4;
                                            objOooOOO = C27351Oooo0O0.OooOOO(c27351Oooo0O0, str4, backupFile4, file9, diskVendor4, this);
                                            if (objOooOOO != enumC32485OooO00o) {
                                            }
                                        }
                                    }
                                }
                            }
                            file5 = file4;
                            file6 = file;
                            str4 = str3;
                            diskVendor4 = diskVendor2;
                            file9 = null;
                            if (diskVendor4 == BackupFile.DiskVendor.Local) {
                            }
                            this.f95169OooOo0o = file6;
                            this.f95168OooOo = file5;
                            this.f95171OooOoO0 = null;
                            this.f95170OooOoO = null;
                            this.f95172OooOoOO = null;
                            this.f95173OooOoo = 4;
                            objOooOOO = C27351Oooo0O0.OooOOO(c27351Oooo0O0, str4, backupFile4, file9, diskVendor4, this);
                            if (objOooOOO != enumC32485OooO00o) {
                            }
                        }
                        str3 = parentId;
                        diskVendor3 = BackupFile.DiskVendor.Local;
                        if (diskVendor2 == diskVendor3) {
                        }
                        file5 = file4;
                        file6 = file;
                        str4 = str3;
                        diskVendor4 = diskVendor2;
                        file9 = null;
                        if (diskVendor4 == BackupFile.DiskVendor.Local) {
                        }
                        this.f95169OooOo0o = file6;
                        this.f95168OooOo = file5;
                        this.f95171OooOoO0 = null;
                        this.f95170OooOoO = null;
                        this.f95172OooOoOO = null;
                        this.f95173OooOoo = 4;
                        objOooOOO = C27351Oooo0O0.OooOOO(c27351Oooo0O0, str4, backupFile4, file9, diskVendor4, this);
                        if (objOooOOO != enumC32485OooO00o) {
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                creationTime = this.f95174OooOoo0;
                file3 = (File) this.f95170OooOoO;
                file2 = this.f95171OooOoO0;
                diskVendor = (BackupFile.DiskVendor) this.f95168OooOo;
                str = (String) this.f95169OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0oo = obj;
                c27351Oooo0O0 = c27351Oooo0O02;
                iIntValue = ((Number) objOooO0oo).intValue();
                file4 = file3;
                file = file2;
                j = creationTime;
                str2 = str;
                if (iIntValue != 0) {
                }
                break;
            case 2:
                j = this.f95174OooOoo0;
                File file13 = (File) this.f95170OooOoO;
                File file14 = this.f95171OooOoO0;
                diskVendor2 = (BackupFile.DiskVendor) this.f95168OooOo;
                str2 = (String) this.f95169OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c27351Oooo0O0 = c27351Oooo0O02;
                file4 = file13;
                backupFile = backupFile2;
                notePlaceHolder = notePlaceHolder2;
                file = file14;
                objOooO0o = obj;
                C32443OooOOO c32443OooOOO2 = (C32443OooOOO) objOooO0o;
                zBooleanValue = ((Boolean) c32443OooOOO2.f116638OooOo0o).booleanValue();
                NoteMeta noteMeta2 = (NoteMeta) c32443OooOOO2.f116637OooOo;
                if (zBooleanValue) {
                }
                return enumC32485OooO00o;
            case 3:
                file8 = this.f95172OooOoOO;
                str3 = (String) this.f95170OooOoO;
                file7 = this.f95171OooOoO0;
                file6 = (File) this.f95168OooOo;
                diskVendor5 = (BackupFile.DiskVendor) this.f95169OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c27351Oooo0O0 = c27351Oooo0O02;
                backupFile = backupFile2;
                notePlaceHolder = notePlaceHolder2;
                objOooO0oo2 = obj;
                iIntValue2 = ((Number) objOooO0oo2).intValue();
                C34406OooO00o.f123390OooO00o.OooO00o(C21532OooOOo.OooO0OO(iIntValue2, "downloadFolderTreeResult: "), new Object[0]);
                if (iIntValue2 != 0) {
                }
                break;
            case 4:
                File file15 = (File) this.f95168OooOo;
                file = (File) this.f95169OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                notePlaceHolder = notePlaceHolder2;
                file5 = file15;
                objOooOOO = obj;
                String str62 = (String) objOooOOO;
                Uri uriFromFile2 = Uri.fromFile(file5);
                String id22 = notePlaceHolder.getId();
                this.f95169OooOo0o = file;
                this.f95168OooOo = file5;
                this.f95173OooOoo = 5;
                c27387o0000o0.getClass();
                C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27419o000o00o(uriFromFile2, id22, str62, c27387o0000o0, null), this);
                break;
            case 5:
                File file16 = (File) this.f95168OooOo;
                file = (File) this.f95169OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                file5 = file16;
                objOooO0o2 = obj;
                C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) objOooO0o2;
                if (c27174OooO0O0.f94862OooO00o) {
                    i = 0;
                    try {
                        C31190OooO0oo.OooO0oo(file);
                        break;
                    } catch (Exception unused) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("BackupUseCase");
                        c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Couldn't delete dir. ", file.getAbsolutePath()), new Object[0]);
                    }
                    if (i == 0) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    throw new BackupException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Couldn't restore note. ", file5.getName()), i, null, 4, null);
                }
                iIntValue3 = kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), PerfConstants.CodeMarkerConstants.ACQUIRE_TOKEN_DCF_START) ? BackupEvent.ERROR_IN_FILE_DB_VERSION_BIG_THAN_LOCAL : -999;
                i = iIntValue3;
                C31190OooO0oo.OooO0oo(file);
                if (i == 0) {
                }
                break;
            case 6:
                file4 = (File) this.f95168OooOo;
                file = (File) this.f95169OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objO00000Oo = obj;
                iIntValue3 = ((Number) objO00000Oo).intValue();
                file5 = file4;
                i = iIntValue3;
                C31190OooO0oo.OooO0oo(file);
                if (i == 0) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
