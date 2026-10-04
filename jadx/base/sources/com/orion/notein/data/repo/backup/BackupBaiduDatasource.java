package com.orion.notein.data.repo.backup;

import OooOo.C20485OooOoO;
import OooOoo.C20593OooO0Oo;
import Oooo0.C20856OooooOo;
import Oooo0oO.o0Oo0oo;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.content.C21638OooO0Oo;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.C22227OoooO;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.aspose.words.WarningType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.network.embedded.C18115b5;
import com.huawei.hms.network.embedded.C18250l0;
import com.orion.notein.App;
import com.orion.notein.data.p602db.entity.BundleTypeAdapterFactory;
import com.orion.notein.data.service.dto.BaiduAuthorizationDto;
import com.orion.notein.domain.models.backup.BackupEvent;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.backup.BackupInstance;
import com.orion.notein.domain.models.backup.BaiduNetDiskFile;
import com.orion.notein.p607ui.backup.netdisk.NetDiskAuthorizeActivity;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24340OooO0oo;
import o000OO00.C24472OooOoo;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOOo0.C27173OooO00o;
import o0OOOo0O.C27181OooO00o;
import o0OOOo0O.C27183OooO0OO;
import o0OOOo0O.C27184OooO0Oo;
import o0OOOo0O.C27185OooO0o0;
import o0Oo0O00.C28051OooO00o;
import o0oo000O.C31183OooO00o;
import o0oo000O.C31186OooO0Oo;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$asRequestBody$1;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
public final class BackupBaiduDatasource {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f69830OooO0o = C24340OooO0oo.OooO0o0("key_baidu_authorization");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f69831OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OOOOOO.OooO00o f69832OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OOOOO0.OooO0OO f69833OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Gson f69834OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33769Ooooo0o f69835OooO0o0;

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m80612d2 = {"Lcom/orion/notein/data/repo/backup/BackupBaiduDatasource$FilePath;", "", "path", "", "<init>", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class FilePath {
        private final String path;

        public FilePath(String path) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(path, "path");
            this.path = path;
        }

        public static /* synthetic */ FilePath copy$default(FilePath filePath, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = filePath.path;
            }
            return filePath.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public final FilePath copy(String path) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(path, "path");
            return new FilePath(path);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FilePath) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.path, ((FilePath) other).path);
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode();
        }

        public String toString() {
            return C20593OooO0Oo.OooO0O0("FilePath(path=", this.path, ")");
        }
    }

    public static final class OooO00o {
        public static String OooO00o(String str) {
            CharSequence charSequenceSubSequence;
            if (str == null || C33599OooOo0O.Oooo0o0(str)) {
                return null;
            }
            String strOooOo0 = C33595OooOOo.OooOo0(C33599OooOo0O.Oooooo0(str).toString(), IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
            StringBuilder sb = new StringBuilder(strOooOo0.length());
            boolean z = false;
            for (int i = 0; i < strOooOo0.length(); i++) {
                char cCharAt = strOooOo0.charAt(i);
                if (cCharAt == '/') {
                    if (!z) {
                        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                    }
                    z = true;
                } else {
                    sb.append(cCharAt);
                    z = false;
                }
            }
            String string = sb.toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
            if (string.length() == 0) {
                return null;
            }
            if (string.length() <= 1 || !C33599OooOo0O.OooOooo(string, IOUtils.DIR_SEPARATOR_UNIX)) {
                return string;
            }
            char[] cArr = {IOUtils.DIR_SEPARATOR_UNIX};
            int length = string.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    char cCharAt2 = string.charAt(length);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 1) {
                            i3 = -1;
                            break;
                        }
                        if (cCharAt2 == cArr[i3]) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 < 0) {
                        charSequenceSubSequence = string.subSequence(0, length + 1);
                        break;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                }
                charSequenceSubSequence = "";
            } else {
                charSequenceSubSequence = "";
            }
            return charSequenceSubSequence.toString();
        }
    }

    public BackupBaiduDatasource(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, o0OOOOOO.OooO00o baiduNetDiskService, o0OOOOO0.OooO0OO authorizationService) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(baiduNetDiskService, "baiduNetDiskService");
        kotlin.jvm.internal.OooOOO0.OooO0oO(authorizationService, "authorizationService");
        this.f69831OooO00o = abstractApplicationC26277OooOoOO;
        this.f69832OooO0O0 = baiduNetDiskService;
        this.f69833OooO0OO = authorizationService;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(executorC33873OooO0O0), null, null, new C22891OooO0o0(this, null), 3);
        this.f69834OooO0Oo = new GsonBuilder().registerTypeAdapterFactory(new BundleTypeAdapterFactory()).disableHtmlEscaping().create();
        this.f69835OooO0o0 = C25252OooO0Oo.OooOoO0(new C33770OooooO0(new OooO0o(this, null)), C33633Oooo0.OooO00o(executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinkedHashMap OooO0o(String str) {
        Object objOooO0oo;
        File parentFile;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        File file = new File(str);
        File parentFile2 = file.getParentFile();
        if (parentFile2 != null) {
            String name = parentFile2.getName();
            kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
            List listOoooOO0 = C33599OooOo0O.OoooOO0(name, new String[]{C18115b5.CONNECTOR});
            if (listOoooOO0.size() >= 2) {
                String strOooO0o0 = C32501OooO0oO.OooO0o0(file);
                int iHashCode = strOooO0o0.hashCode();
                if (iHashCode == -1321546630) {
                    if (strOooO0o0.equals("template")) {
                        objOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_ID, (String) listOoooOO0.get(1)), new C32443OooOOO("content_type", "template"), new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_CHECKSUM, (String) listOoooOO0.get(2)));
                    }
                    linkedHashMap.putAll(objOooO0oo);
                    File parentFile3 = file.getParentFile();
                    if (parentFile3 != null) {
                    }
                    if (parentFile != null) {
                    }
                } else if (iHashCode != 3365) {
                    objOooO0oo = (iHashCode == 3568542 && strOooO0o0.equals(BackupFile.EXTENSION_FOLDER_TREE_FILE)) ? C34444Oooo0O0.OooO0oo(new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_ID, "folder_tree"), new C32443OooOOO("content_type", "folder_tree"), new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_CHECKSUM, (String) listOoooOO0.get(2))) : C34436OooOoOO.f123455OooOo0o;
                    linkedHashMap.putAll(objOooO0oo);
                    File parentFile32 = file.getParentFile();
                    parentFile = parentFile32 != null ? parentFile32.getParentFile() : null;
                    if (parentFile != null) {
                        String name2 = parentFile.getName();
                        kotlin.jvm.internal.OooOOO0.OooO0o(name2, "getName(...)");
                        List listOoooOO02 = C33599OooOo0O.OoooOO0(name2, new String[]{C18115b5.CONNECTOR});
                        if (listOoooOO02.size() >= 4) {
                            linkedHashMap.putAll(C34444Oooo0O0.OooO0oo(new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_USER_ID, listOoooOO02.get(1)), new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_DEVICE_NAME, listOoooOO02.get(2)), new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_APP_INSTANCE_ID, listOoooOO02.get(3))));
                            return linkedHashMap;
                        }
                    }
                } else {
                    if (strOooO0o0.equals(BackupFile.EXTENSION_NOTEIN_FILE)) {
                        objOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_ID, (String) listOoooOO0.get(1)), new C32443OooOOO("content_type", BackupFile.FILE_CONTENT_TYPE_NOTE), new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_CHECKSUM, (String) listOoooOO0.get(2)));
                    }
                    linkedHashMap.putAll(objOooO0oo);
                    File parentFile322 = file.getParentFile();
                    if (parentFile322 != null) {
                    }
                    if (parentFile != null) {
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static String OooO0oo(BackupInstance backupInstance) {
        return o0Oo0oo.OooO0Oo(BackupFile.INSTANCE.getRootDirPath(BackupFile.DiskVendor.Baidu), File.separator, backupInstance.toBackupInstanceDirName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (r10 == r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOO oooOOO;
        BackupBaiduDatasource backupBaiduDatasource;
        if (abstractC32479OooO0OO instanceof OooOOO) {
            oooOOO = (OooOOO) abstractC32479OooO0OO;
            int i = oooOOO.f69867OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f69867OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = oooOOO.f69865OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO.f69867OooOoO;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o.OooO0Oo(e, "getQuota error", new Object[0]);
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o2.OooO0o0("getQuota start.", new Object[0]);
            oooOOO.f69866OooOo0o = this;
            oooOOO.f69867OooOoO = 1;
            objOooO0Oo = OooO0Oo(oooOOO);
            if (objOooO0Oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            backupBaiduDatasource = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                C35238OooOoO c35238OooOoO = (C35238OooOoO) objOooO0Oo;
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o3.OooO0o0("getQuota, isSuccess: " + c35238OooOoO.f126541OooO00o.OooO0OO() + ", body: " + c35238OooOoO.f126542OooO0O0, new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            backupBaiduDatasource = oooOOO.f69866OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
        }
        String str = (String) objOooO0Oo;
        if (str == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o4.OooO0o0("getQuota, accessToken is null", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        o0OOOOOO.OooO00o oooO00o = backupBaiduDatasource.f69832OooO0O0;
        oooOOO.f69866OooOo0o = null;
        oooOOO.f69867OooOoO = 2;
        objOooO0Oo = oooO00o.OooO0Oo(str, 1, 1, oooOOO);
    }

    public final void OooO00o() {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO00o("clearExpiredBackupDirs", new Object[0]);
        File file = new File(this.f69831OooO00o.getFilesDir(), "backup");
        if (!file.exists()) {
            c20358OooO00o.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o.OooO0o0("clearExpiredBackupDirs#backupDir is not exist, return.", new Object[0]);
            return;
        }
        File file2 = new File(file, "baidu");
        if (!file2.exists()) {
            c20358OooO00o.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o.OooO0o0("clearExpiredBackupDirs#backupWithVendorDir is not exist, return.", new Object[0]);
        }
        File file3 = new File(file2, "chunks");
        if (!file3.exists()) {
            c20358OooO00o.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o.OooO0o0("clearExpiredBackupDirs#backupWithVendorDir is not exist, return.", new Object[0]);
        }
        c20358OooO00o.OooO00o(C21638OooO0Oo.OooO00o(file3, "clearExpiredBackupDirs, backupWithVendorAndChunksDir: "), new Object[0]);
        ArrayList arrayListOooOo00 = C31190OooO0oo.OooOo00(file3, false);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListOooOo00) {
            if (((File) obj).isFile()) {
                arrayList.add(obj);
            }
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("BackupBaiduDatasource");
        c20358OooO00o2.OooO0o0(C21532OooOOo.OooO0OO(arrayList.size(), "clearExpiredBackupDirs, to delete invalid files size: "), new Object[0]);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayListOooOo00) {
            if (((File) obj2).isDirectory()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList<File> arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            File file4 = (File) obj3;
            C34406OooO00o.f123390OooO00o.OooO00o(androidx.concurrent.futures.OooO00o.OooO0O0(System.currentTimeMillis() - file4.lastModified(), "clearExpiredBackupDirs, current - dir.lastModified = "), new Object[0]);
            if (System.currentTimeMillis() - file4.lastModified() > C18250l0.g.f55493g) {
                arrayList3.add(obj3);
            }
        }
        C34406OooO00o.f123390OooO00o.OooO00o(C21532OooOOo.OooO0OO(arrayList3.size(), "clearExpiredBackupDirs, to delete dir size: "), new Object[0]);
        for (File file5 : arrayList3) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(file5);
            C32501OooO0oO.OooO0Oo(file5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(List list, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C22893OooO0oo c22893OooO0oo;
        List list2;
        BackupBaiduDatasource backupBaiduDatasource;
        String str;
        String str2;
        BackupBaiduDatasource backupBaiduDatasource2;
        String path;
        C35238OooOoO c35238OooOoO;
        C27185OooO0o0 c27185OooO0o0;
        Object objOooOO0O;
        String str3;
        if (abstractC32479OooO0OO instanceof C22893OooO0oo) {
            c22893OooO0oo = (C22893OooO0oo) abstractC32479OooO0OO;
            int i = c22893OooO0oo.f69853OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22893OooO0oo.f69853OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c22893OooO0oo = new C22893OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        C22893OooO0oo c22893OooO0oo2 = c22893OooO0oo;
        Object objOooO0Oo = c22893OooO0oo2.f69850OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22893OooO0oo2.f69853OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("delete, backupFiles: ", oOo000Oo.OooOo.o000oOoO(list, null, null, null, new OooO0OO(), 31)), new Object[0]);
            if (list.isEmpty()) {
                c20358OooO00o.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o.OooO0o0("delete, backupFiles is empty, return.", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            c22893OooO0oo2.f69849OooOo0o = this;
            c22893OooO0oo2.f69848OooOo = list;
            c22893OooO0oo2.f69853OooOoo0 = 1;
            objOooO0Oo = OooO0Oo(c22893OooO0oo2);
            if (objOooO0Oo != enumC32485OooO00o) {
                list2 = list;
                backupBaiduDatasource = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str4 = (String) c22893OooO0oo2.f69849OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0Oo);
                    str3 = str4;
                    throw new BackupException(str3, ((Number) objOooO0Oo).intValue(), null, 4, null);
                }
                backupBaiduDatasource2 = (BackupBaiduDatasource) c22893OooO0oo2.f69849OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0Oo);
                    c35238OooOoO = (C35238OooOoO) objOooO0Oo;
                } catch (Exception e) {
                    e = e;
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("BackupBaiduDatasource");
                    c20358OooO00o2.OooO0Oo(e, "delete failed.", new Object[0]);
                    c35238OooOoO = null;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o3.OooO0o0("delete result: " + (c35238OooOoO == null ? (C27185OooO0o0) c35238OooOoO.f126542OooO0O0 : null) + ", isSuccess: " + (c35238OooOoO == null ? Boolean.valueOf(c35238OooOoO.f126541OooO00o.OooO0OO()) : null), new Object[0]);
                c27185OooO0o0 = c35238OooOoO == null ? (C27185OooO0o0) c35238OooOoO.f126542OooO0O0 : null;
                if (c35238OooOoO == null && c35238OooOoO.f126541OooO00o.OooO0OO() && c27185OooO0o0 != null && c27185OooO0o0.getErrno() == 0) {
                    return C32460OooOooO.f116667OooO00o;
                }
                String str5 = "Couldn't delete the file of baidu's disk. result: " + c27185OooO0o0;
                Integer num = c27185OooO0o0 == null ? new Integer(c27185OooO0o0.getErrno()) : null;
                c22893OooO0oo2.f69849OooOo0o = str5;
                c22893OooO0oo2.f69848OooOo = null;
                c22893OooO0oo2.f69851OooOoO0 = null;
                c22893OooO0oo2.f69853OooOoo0 = 4;
                objOooOO0O = backupBaiduDatasource2.OooOO0O(num, c22893OooO0oo2);
                if (objOooOO0O != enumC32485OooO00o) {
                    str3 = str5;
                    objOooO0Oo = objOooOO0O;
                    throw new BackupException(str3, ((Number) objOooO0Oo).intValue(), null, 4, null);
                }
                return enumC32485OooO00o;
            }
            String str6 = c22893OooO0oo2.f69851OooOoO0;
            List list3 = c22893OooO0oo2.f69848OooOo;
            backupBaiduDatasource = (BackupBaiduDatasource) c22893OooO0oo2.f69849OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            str = str6;
            list2 = list3;
            BackupBaiduDatasource backupBaiduDatasource3 = backupBaiduDatasource;
            str2 = (String) objOooO0Oo;
            if (str2 != null || str2.length() == 0) {
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o4.OooO0OO("delete, instanceDirPath is null or empty.", new Object[0]);
                throw new BackupException("Couldn't get the instance dir.", -999, null, 4, null);
            }
            List<BackupFile> list4 = list2;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
            for (BackupFile backupFile : list4) {
                File file = new File(backupFile.getPath());
                String strOooO0o0 = C32501OooO0oO.OooO0o0(file);
                int iHashCode = strOooO0o0.hashCode();
                if (iHashCode == -1321546630 ? strOooO0o0.equals("template") : iHashCode == 3365 ? strOooO0o0.equals(BackupFile.EXTENSION_NOTEIN_FILE) : iHashCode == 3568542 && strOooO0o0.equals(BackupFile.EXTENSION_FOLDER_TREE_FILE)) {
                    path = file.getParent();
                    if (path == null) {
                        path = file.getAbsolutePath();
                    }
                } else {
                    path = backupFile.getPath();
                }
                kotlin.jvm.internal.OooOOO0.OooO0Oo(path);
                arrayList.add(new FilePath(path));
            }
            String json = backupBaiduDatasource3.f69834OooO0Oo.toJson(arrayList);
            try {
                o0OOOOOO.OooO00o oooO00o = backupBaiduDatasource3.f69832OooO0O0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(json);
                c22893OooO0oo2.f69849OooOo0o = backupBaiduDatasource3;
                c22893OooO0oo2.f69848OooOo = null;
                c22893OooO0oo2.f69851OooOoO0 = null;
                c22893OooO0oo2.f69853OooOoo0 = 3;
                objOooO0Oo = oooO00o.OooO00o("filemanager", str, RequestParameters.SUBRESOURCE_DELETE, 1, json, c22893OooO0oo2);
            } catch (Exception e2) {
                e = e2;
                backupBaiduDatasource2 = backupBaiduDatasource3;
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o22.OooO0Oo(e, "delete failed.", new Object[0]);
                c35238OooOoO = null;
            }
            if (objOooO0Oo != enumC32485OooO00o) {
                backupBaiduDatasource2 = backupBaiduDatasource3;
                c35238OooOoO = (C35238OooOoO) objOooO0Oo;
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o32.OooOOO0("BackupBaiduDatasource");
                if (c35238OooOoO == null) {
                }
                if (c35238OooOoO == null) {
                }
                c20358OooO00o32.OooO0o0("delete result: " + (c35238OooOoO == null ? (C27185OooO0o0) c35238OooOoO.f126542OooO0O0 : null) + ", isSuccess: " + (c35238OooOoO == null ? Boolean.valueOf(c35238OooOoO.f126541OooO00o.OooO0OO()) : null), new Object[0]);
                if (c35238OooOoO == null) {
                }
                if (c35238OooOoO == null) {
                }
                String str52 = "Couldn't delete the file of baidu's disk. result: " + c27185OooO0o0;
                if (c27185OooO0o0 == null) {
                }
                c22893OooO0oo2.f69849OooOo0o = str52;
                c22893OooO0oo2.f69848OooOo = null;
                c22893OooO0oo2.f69851OooOoO0 = null;
                c22893OooO0oo2.f69853OooOoo0 = 4;
                objOooOO0O = backupBaiduDatasource2.OooOO0O(num, c22893OooO0oo2);
                if (objOooOO0O != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
        list2 = c22893OooO0oo2.f69848OooOo;
        backupBaiduDatasource = (BackupBaiduDatasource) c22893OooO0oo2.f69849OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0Oo);
        String str7 = (String) objOooO0Oo;
        if (str7 == null || str7.length() == 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o5.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o5.OooO0o0("delete, token is null or empty.", new Object[0]);
            throw new BackupException("Token is null or empty.", BackupEvent.ERROR_INVALID_TOKEN, null, 4, null);
        }
        c22893OooO0oo2.f69849OooOo0o = backupBaiduDatasource;
        c22893OooO0oo2.f69848OooOo = list2;
        c22893OooO0oo2.f69851OooOoO0 = str7;
        c22893OooO0oo2.f69853OooOoo0 = 2;
        Object objOooO0oO = backupBaiduDatasource.OooO0oO(c22893OooO0oo2);
        if (objOooO0oO != enumC32485OooO00o) {
            str = str7;
            objOooO0Oo = objOooO0oO;
            BackupBaiduDatasource backupBaiduDatasource32 = backupBaiduDatasource;
            str2 = (String) objOooO0Oo;
            if (str2 != null) {
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o42.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o42.OooO0OO("delete, instanceDirPath is null or empty.", new Object[0]);
            throw new BackupException("Couldn't get the instance dir.", -999, null, 4, null);
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d1, code lost:
    
        if (r13.OooOOOo(r14, r0) == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOO0 oooOO02;
        BackupBaiduDatasource backupBaiduDatasource;
        C35238OooOoO c35238OooOoO;
        C27173OooO00o authorization;
        if (abstractC32479OooO0OO instanceof OooOO0) {
            oooOO02 = (OooOO0) abstractC32479OooO0OO;
            int i = oooOO02.f69856OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO02.f69856OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOO02 = new OooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = oooOO02.f69854OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOO02.f69856OooOoO;
        boolean z = true;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o.OooO0o0(com.aspose.slides.internal.p332p7.OooO0O0.OooO0O0("fetchAuthorization start, code isNullOrEmpty: ", str == null || str.length() == 0), new Object[0]);
            try {
                o0OOOOO0.OooO0OO oooO0OO = this.f69833OooO0OO;
                oooOO02.f69855OooOo0o = this;
                oooOO02.f69856OooOoO = 1;
                objOooO00o = oooO0OO.OooO00o(str, oooOO02);
                if (objOooO00o != enumC32485OooO00o) {
                    backupBaiduDatasource = this;
                }
            } catch (Exception e) {
                e = e;
                backupBaiduDatasource = this;
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o2.OooO0Oo(e, "fetchAuthorization failed.", new Object[0]);
                c35238OooOoO = null;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO00o);
            return Boolean.valueOf(z);
        }
        backupBaiduDatasource = oooOO02.f69855OooOo0o;
        try {
            C32446OooOOOo.OooO0O0(objOooO00o);
        } catch (Exception e2) {
            e = e2;
            C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o22.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o22.OooO0Oo(e, "fetchAuthorization failed.", new Object[0]);
            c35238OooOoO = null;
        }
        c35238OooOoO = (C35238OooOoO) objOooO00o;
        if (c35238OooOoO != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o3.OooO0o0(com.aspose.slides.internal.p332p7.OooO0O0.OooO0O0("fetchAuthorization result: ", c35238OooOoO.f126541OooO00o.OooO0OO()), new Object[0]);
            BaiduAuthorizationDto baiduAuthorizationDto = (BaiduAuthorizationDto) c35238OooOoO.f126542OooO0O0;
            if (baiduAuthorizationDto == null || (authorization = baiduAuthorizationDto.getAuthorization()) == null) {
                z = false;
            } else {
                C27173OooO00o c27173OooO00oOooO00o = C27173OooO00o.OooO00o(authorization, System.currentTimeMillis() + (authorization.getExpiresIn() * ((long) 1000)));
                c20358OooO00o3.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o3.OooO0o0("fetchAuthorization, authorization is " + c27173OooO00oOooO00o, new Object[0]);
                oooOO02.f69855OooOo0o = null;
                oooOO02.f69856OooOoO = 2;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOO0O oooOO0O;
        if (abstractC32479OooO0OO instanceof OooOO0O) {
            oooOO0O = (OooOO0O) abstractC32479OooO0OO;
            int i = oooOO0O.f69860OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO0O.f69860OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0o = oooOO0O.f69859OooOo0o;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOO0O.f69860OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0o);
            String str = (String) this.f69835OooO0o0.f121747OooOo0o.getValue();
            if (str != null && str.length() != 0) {
                return str;
            }
            oooOO0O.f69860OooOoO0 = 1;
            objOooOO0o = OooOO0o(oooOO0O);
            if (objOooOO0o == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOO0o);
        }
        C27173OooO00o c27173OooO00o = (C27173OooO00o) objOooOO0o;
        if (c27173OooO00o != null) {
            return c27173OooO00o.getCom.huawei.hms.support.feature.result.CommonConstant.KEY_ACCESS_TOKEN java.lang.String();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C22894OooOO0o c22894OooOO0o;
        BackupBaiduDatasource backupBaiduDatasource;
        if (abstractC32479OooO0OO instanceof C22894OooOO0o) {
            c22894OooOO0o = (C22894OooOO0o) abstractC32479OooO0OO;
            int i = c22894OooOO0o.f69863OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22894OooOO0o.f69863OooOoO = i - Integer.MIN_VALUE;
            } else {
                c22894OooOO0o = new C22894OooOO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c22894OooOO0o.f69861OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22894OooOO0o.f69863OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooOOo);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o.OooO0o0("getAuthorization start.", new Object[0]);
                InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = C28051OooO00o.OooO00o(this.f69831OooO00o).getData();
                c22894OooOO0o.f69862OooOo0o = this;
                c22894OooOO0o.f69863OooOoO = 1;
                objOooOOo = C25252OooO0Oo.OooOOo(data, c22894OooOO0o);
                if (objOooOOo == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                backupBaiduDatasource = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                backupBaiduDatasource = c22894OooOO0o.f69862OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOo);
            }
            String str = (String) ((AbstractC24338OooO0o0) objOooOOo).OooO0OO(f69830OooO0o);
            if (str != null) {
                return (C27173OooO00o) backupBaiduDatasource.f69834OooO0Oo.fromJson(str, C27173OooO00o.class);
            }
            return null;
        } catch (JsonSyntaxException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o2.OooO0Oo(e, "getAuthorization from dataStore failed.", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOOO0 oooOOO0;
        BackupBaiduDatasource backupBaiduDatasource;
        if (abstractC32479OooO0OO instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) abstractC32479OooO0OO;
            int i = oooOOO0.f69871OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f69871OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object companion = oooOOO0.f69869OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO0.f69871OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(companion);
            BackupInstance.Companion companion2 = BackupInstance.INSTANCE;
            oooOOO0.f69870OooOo0o = this;
            oooOOO0.f69871OooOoO = 1;
            companion = companion2.getInstance(this.f69831OooO00o, oooOOO0);
            if (companion != enumC32485OooO00o) {
                backupBaiduDatasource = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(companion);
            return companion;
        }
        backupBaiduDatasource = oooOOO0.f69870OooOo0o;
        C32446OooOOOo.OooO0O0(companion);
        BackupInstance backupInstance = (BackupInstance) companion;
        if (backupInstance == null) {
            return null;
        }
        oooOOO0.f69870OooOo0o = null;
        oooOOO0.f69871OooOoO = 2;
        backupBaiduDatasource.getClass();
        String strOooO0oo = OooO0oo(backupInstance);
        return strOooO0oo == enumC32485OooO00o ? enumC32485OooO00o : strOooO0oo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r10 == r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOOO oooOOOO;
        BackupBaiduDatasource backupBaiduDatasource;
        if (abstractC32479OooO0OO instanceof OooOOOO) {
            oooOOOO = (OooOOOO) abstractC32479OooO0OO;
            int i = oooOOOO.f69875OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOOO.f69875OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = oooOOOO.f69873OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOOO.f69875OooOoO;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o.OooO0Oo(e, "getUserInfo error", new Object[0]);
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o2.OooO0o0("getUserInfo start", new Object[0]);
            oooOOOO.f69874OooOo0o = this;
            oooOOOO.f69875OooOoO = 1;
            objOooO0Oo = OooO0Oo(oooOOOO);
            if (objOooO0Oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            backupBaiduDatasource = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                C35238OooOoO c35238OooOoO = (C35238OooOoO) objOooO0Oo;
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o3.OooO0o0("getUserInfo, isSuccess: " + c35238OooOoO + ", body: " + c35238OooOoO.f126542OooO0O0, new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            backupBaiduDatasource = oooOOOO.f69874OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
        }
        String str = (String) objOooO0Oo;
        if (str == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o4.OooO0o0("getUserInfo, accessToken is null", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        o0OOOOOO.OooO00o oooO00o = backupBaiduDatasource.f69832OooO0O0;
        oooOOOO.f69874OooOo0o = null;
        oooOOOO.f69875OooOoO = 2;
        objOooO0Oo = oooO00o.OooO0o0("uinfo", str, oooOOOO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        if (r2.OooO(r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(Integer num, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C22896OooOOo c22896OooOOo;
        BackupBaiduDatasource backupBaiduDatasource;
        int i;
        if (abstractC32479OooO0OO instanceof C22896OooOOo) {
            c22896OooOOo = (C22896OooOOo) abstractC32479OooO0OO;
            int i2 = c22896OooOOo.f69886OooOoOO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c22896OooOOo.f69886OooOoOO = i2 - Integer.MIN_VALUE;
            } else {
                c22896OooOOo = new C22896OooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c22896OooOOo.f69885OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c22896OooOOo.f69886OooOoOO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o.OooO0o0("processBaiduErrno, errno: " + num, new Object[0]);
            c22896OooOOo.f69883OooOo0o = this;
            c22896OooOOo.f69882OooOo = num;
            c22896OooOOo.f69886OooOoOO = 1;
            if (OooOO0(c22896OooOOo) != enumC32485OooO00o) {
                backupBaiduDatasource = this;
            }
            return enumC32485OooO00o;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            i = BackupEvent.ERROR_REMOTE_DISK_FULL;
            return new Integer(i);
        }
        num = c22896OooOOo.f69882OooOo;
        backupBaiduDatasource = c22896OooOOo.f69883OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        if (num != null && num.intValue() == -9) {
            i = BackupEvent.ERROR_FILE_NOT_EXIST;
        } else if (num != null && num.intValue() == -8) {
            i = BackupEvent.ERROR_FILE_ALREADY_EXIST;
        } else if (num != null && num.intValue() == -10) {
            c22896OooOOo.f69883OooOo0o = null;
            c22896OooOOo.f69882OooOo = null;
            c22896OooOOo.f69886OooOoOO = 2;
        } else {
            i = (num != null && num.intValue() == -6) ? BackupEvent.ERROR_INVALID_TOKEN : (num != null && num.intValue() == -7) ? BackupEvent.ERROR_INVALID_FILENAME : -999;
        }
        return new Integer(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x016c, code lost:
    
        if (r0 == r3) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0178 A[PHI: r4
      0x0178: PHI (r4v3 com.orion.notein.data.repo.backup.BackupBaiduDatasource) = 
      (r4v5 com.orion.notein.data.repo.backup.BackupBaiduDatasource)
      (r4v9 com.orion.notein.data.repo.backup.BackupBaiduDatasource)
      (r4v9 com.orion.notein.data.repo.backup.BackupBaiduDatasource)
      (r4v9 com.orion.notein.data.repo.backup.BackupBaiduDatasource)
      (r4v9 com.orion.notein.data.repo.backup.BackupBaiduDatasource)
     binds: [B:71:0x0173, B:30:0x0076, B:49:0x00ef, B:51:0x00f5, B:53:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0190 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C22898OooOOoo c22898OooOOoo;
        C35238OooOoO c35238OooOoO;
        BackupBaiduDatasource backupBaiduDatasource;
        C32460OooOooO c32460OooOooO;
        BaiduAuthorizationDto baiduAuthorizationDto;
        C27173OooO00o authorization;
        BackupBaiduDatasource backupBaiduDatasource2;
        ?? r4;
        C27173OooO00o c27173OooO00o;
        String refreshToken;
        if (abstractC32479OooO0OO instanceof C22898OooOOoo) {
            c22898OooOOoo = (C22898OooOOoo) abstractC32479OooO0OO;
            int i = c22898OooOOoo.f69892OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22898OooOOoo.f69892OooOoO = i - Integer.MIN_VALUE;
            } else {
                c22898OooOOoo = new C22898OooOOoo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = c22898OooOOoo.f69890OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22898OooOOoo.f69892OooOoO;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o.OooO0Oo(e, "refreshAuthorization failed.", new Object[0]);
            c35238OooOoO = null;
            backupBaiduDatasource = i2;
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o2.OooO0o0("refreshAuthorization start.", new Object[0]);
            c22898OooOOoo.f69891OooOo0o = this;
            c22898OooOOoo.f69892OooOoO = 1;
            objOooO0o0 = OooO0o0(c22898OooOOoo);
            if (objOooO0o0 != obj) {
                backupBaiduDatasource2 = this;
            }
        }
        if (i2 == 1) {
            BackupBaiduDatasource backupBaiduDatasource3 = c22898OooOOoo.f69891OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o0);
            backupBaiduDatasource2 = backupBaiduDatasource3;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(objOooO0o0);
                    return objOooO0o0;
                }
                BackupBaiduDatasource backupBaiduDatasource4 = c22898OooOOoo.f69891OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o0);
                r4 = backupBaiduDatasource4;
                c32460OooOooO = C32460OooOooO.f116667OooO00o;
                backupBaiduDatasource2 = r4;
                if (c32460OooOooO == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("BackupBaiduDatasource");
                    c20358OooO00o3.OooO0o0("refreshAuthorization, no require to refresh.", new Object[0]);
                }
                c22898OooOOoo.f69891OooOo0o = null;
                c22898OooOOoo.f69892OooOoO = 4;
                Object objOooO0o02 = backupBaiduDatasource2.OooO0o0(c22898OooOOoo);
                return objOooO0o02 != obj ? obj : objOooO0o02;
            }
            BackupBaiduDatasource backupBaiduDatasource5 = c22898OooOOoo.f69891OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o0);
            i2 = backupBaiduDatasource5;
            c35238OooOoO = (C35238OooOoO) objOooO0o0;
            backupBaiduDatasource = i2;
            if (c35238OooOoO != null && (baiduAuthorizationDto = (BaiduAuthorizationDto) c35238OooOoO.f126542OooO0O0) != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o4.OooO0o0("refreshAuthorization result is " + baiduAuthorizationDto, new Object[0]);
                authorization = baiduAuthorizationDto.getAuthorization();
                if (authorization != null) {
                    C27173OooO00o c27173OooO00oOooO00o = C27173OooO00o.OooO00o(authorization, System.currentTimeMillis() + (authorization.getExpiresIn() * ((long) 1000)));
                    c20358OooO00o4.OooOOO0("BackupBaiduDatasource");
                    c20358OooO00o4.OooO0o0("refreshAuthorization, save authorization to dataStore.", new Object[0]);
                    c22898OooOOoo.f69891OooOo0o = backupBaiduDatasource;
                    c22898OooOOoo.f69892OooOoO = 3;
                    Object objOooOOOo = backupBaiduDatasource.OooOOOo(c27173OooO00oOooO00o, c22898OooOOoo);
                    r4 = backupBaiduDatasource;
                }
            }
            c32460OooOooO = null;
            backupBaiduDatasource2 = backupBaiduDatasource;
            if (c32460OooOooO == null) {
            }
            c22898OooOOoo.f69891OooOo0o = null;
            c22898OooOOoo.f69892OooOoO = 4;
            Object objOooO0o022 = backupBaiduDatasource2.OooO0o0(c22898OooOOoo);
            if (objOooO0o022 != obj) {
            }
        }
        C27173OooO00o c27173OooO00o2 = (C27173OooO00o) objOooO0o0;
        if (c27173OooO00o2 != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o5.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o5.OooO0o0("refreshAuthorization get non-null authorization: " + c27173OooO00o2, new Object[0]);
            boolean z = c27173OooO00o2.getExpiresAt() - System.currentTimeMillis() < 604800000;
            boolean z2 = c27173OooO00o2.getExpiresAt() - System.currentTimeMillis() > c27173OooO00o2.getExpiresIn() * ((long) 1000);
            c20358OooO00o5.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o5.OooO0o0("refreshAuthorization, reachRefreshLimit is " + z + ", reCorrectLocalTime: " + z2, new Object[0]);
            boolean z3 = z || z2;
            C32443OooOOO c32443OooOOO = new C32443OooOOO(Boolean.valueOf(z3), c27173OooO00o2);
            if (!z3) {
                c32443OooOOO = null;
            }
            if (c32443OooOOO != null && (c27173OooO00o = (C27173OooO00o) c32443OooOOO.f116637OooOo) != null && (refreshToken = c27173OooO00o.getRefreshToken()) != null) {
                c20358OooO00o5.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o5.OooO0o0("refreshAuthorization, require to refresh.", new Object[0]);
                o0OOOOO0.OooO0OO oooO0OO = backupBaiduDatasource2.f69833OooO0OO;
                c22898OooOOoo.f69891OooOo0o = backupBaiduDatasource2;
                c22898OooOOoo.f69892OooOoO = 2;
                objOooO0o0 = oooO0OO.OooO0O0(refreshToken, c22898OooOOoo);
                i2 = backupBaiduDatasource2;
                if (objOooO0o0 == obj) {
                }
                c35238OooOoO = (C35238OooOoO) objOooO0o0;
                backupBaiduDatasource = i2;
                if (c35238OooOoO != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o42.OooOOO0("BackupBaiduDatasource");
                    c20358OooO00o42.OooO0o0("refreshAuthorization result is " + baiduAuthorizationDto, new Object[0]);
                    authorization = baiduAuthorizationDto.getAuthorization();
                    if (authorization != null) {
                    }
                }
                c32460OooOooO = null;
                backupBaiduDatasource2 = backupBaiduDatasource;
                if (c32460OooOooO == null) {
                }
                c22898OooOOoo.f69891OooOo0o = null;
                c22898OooOOoo.f69892OooOoO = 4;
                Object objOooO0o0222 = backupBaiduDatasource2.OooO0o0(c22898OooOOoo);
                if (objOooO0o0222 != obj) {
                }
            }
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o32.OooOOO0("BackupBaiduDatasource");
        c20358OooO00o32.OooO0o0("refreshAuthorization, no require to refresh.", new Object[0]);
        c22898OooOOoo.f69891OooOo0o = null;
        c22898OooOOoo.f69892OooOoO = 4;
        Object objOooO0o02222 = backupBaiduDatasource2.OooO0o0(c22898OooOOoo);
        if (objOooO0o02222 != obj) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOOO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws BackupException {
        OooOo00 oooOo00;
        String str3;
        String str4;
        Object objOooO0Oo;
        BackupBaiduDatasource backupBaiduDatasource;
        String str5;
        BackupBaiduDatasource backupBaiduDatasource2;
        String str6;
        String str7;
        String str8;
        BackupBaiduDatasource backupBaiduDatasource3;
        C35238OooOoO c35238OooOoO;
        C27184OooO0Oo c27184OooO0Oo;
        Object objOooOO0O;
        String str9;
        BackupFile backupFile;
        if (abstractC32479OooO0OO instanceof OooOo00) {
            oooOo00 = (OooOo00) abstractC32479OooO0OO;
            int i = oooOo00.f69921OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo00.f69921OooOoo = i - Integer.MIN_VALUE;
            } else {
                oooOo00 = new OooOo00(this, abstractC32479OooO0OO);
            }
        }
        OooOo00 oooOo002 = oooOo00;
        Object objOooO0OO = oooOo002.f69920OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOo002.f69921OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            oooOo002.f69917OooOo0o = this;
            str3 = str;
            oooOo002.f69916OooOo = str3;
            str4 = str2;
            oooOo002.f69919OooOoO0 = str4;
            oooOo002.f69921OooOoo = 1;
            objOooO0Oo = OooO0Oo(oooOo002);
            if (objOooO0Oo != enumC32485OooO00o) {
                backupBaiduDatasource = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                String str10 = oooOo002.f69918OooOoO;
                String str11 = oooOo002.f69919OooOoO0;
                str6 = oooOo002.f69916OooOo;
                BackupBaiduDatasource backupBaiduDatasource4 = (BackupBaiduDatasource) oooOo002.f69917OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0OO);
                backupBaiduDatasource2 = backupBaiduDatasource4;
                str7 = str11;
                str5 = str10;
                str8 = (String) ((AbstractC24338OooO0o0) objOooO0OO).OooO0OO(App.f69544OooOooO);
                if (str8 != null || str8.length() == 0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("BackupBaiduDatasource");
                    c20358OooO00o.OooO0OO("searchFilesInternal failed, userId isNullOrEmpty.", new Object[0]);
                    throw new BackupException("Uid is null or empty.", BackupEvent.ERROR_UID_NOT_EXIST, null, 4, null);
                }
                try {
                    o0OOOOOO.OooO00o oooO00o = backupBaiduDatasource2.f69832OooO0O0;
                    oooOo002.f69917OooOo0o = backupBaiduDatasource2;
                    oooOo002.f69916OooOo = null;
                    oooOo002.f69919OooOoO0 = null;
                    oooOo002.f69918OooOoO = null;
                    oooOo002.f69921OooOoo = 3;
                    objOooO0OO = oooO00o.OooO0OO(FirebaseAnalytics.Event.SEARCH, str5, str6, str7, 1, 0, oooOo002);
                } catch (Exception e) {
                    e = e;
                    backupBaiduDatasource3 = backupBaiduDatasource2;
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("BackupBaiduDatasource");
                    c20358OooO00o2.OooO0Oo(e, "searchFilesInternal error.", new Object[0]);
                    c35238OooOoO = null;
                }
                if (objOooO0OO != enumC32485OooO00o) {
                    backupBaiduDatasource3 = backupBaiduDatasource2;
                    c35238OooOoO = (C35238OooOoO) objOooO0OO;
                    if (c35238OooOoO == null) {
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("BackupBaiduDatasource");
                    if (c35238OooOoO == null) {
                    }
                    c20358OooO00o3.OooO0o0("searchFilesInternal, isSuccess: " + (c35238OooOoO == null ? Boolean.valueOf(c35238OooOoO.f126541OooO00o.OooO0OO()) : null), new Object[0]);
                    if (c35238OooOoO != null) {
                    }
                    String str12 = "Couldn't search the file of baidu's disk. result: " + c27184OooO0Oo;
                    if (c27184OooO0Oo == null) {
                    }
                    oooOo002.f69917OooOo0o = str12;
                    oooOo002.f69916OooOo = null;
                    oooOo002.f69919OooOoO0 = null;
                    oooOo002.f69918OooOoO = null;
                    oooOo002.f69921OooOoo = 4;
                    objOooOO0O = backupBaiduDatasource3.OooOO0O(num, oooOo002);
                    if (objOooOO0O != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str13 = (String) oooOo002.f69917OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0OO);
                str9 = str13;
                throw new BackupException(str9, ((Number) objOooO0OO).intValue(), null, 4, null);
            }
            backupBaiduDatasource3 = (BackupBaiduDatasource) oooOo002.f69917OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0OO);
                c35238OooOoO = (C35238OooOoO) objOooO0OO;
            } catch (Exception e2) {
                e = e2;
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o22.OooO0Oo(e, "searchFilesInternal error.", new Object[0]);
                c35238OooOoO = null;
            }
            c27184OooO0Oo = c35238OooOoO == null ? (C27184OooO0Oo) c35238OooOoO.f126542OooO0O0 : null;
            C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o32.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o32.OooO0o0("searchFilesInternal, isSuccess: " + (c35238OooOoO == null ? Boolean.valueOf(c35238OooOoO.f126541OooO00o.OooO0OO()) : null), new Object[0]);
            if (c35238OooOoO != null || !c35238OooOoO.f126541OooO00o.OooO0OO() || c27184OooO0Oo == null || c27184OooO0Oo.getErrno() != 0) {
                String str122 = "Couldn't search the file of baidu's disk. result: " + c27184OooO0Oo;
                Integer num = c27184OooO0Oo == null ? new Integer(c27184OooO0Oo.getErrno()) : null;
                oooOo002.f69917OooOo0o = str122;
                oooOo002.f69916OooOo = null;
                oooOo002.f69919OooOoO0 = null;
                oooOo002.f69918OooOoO = null;
                oooOo002.f69921OooOoo = 4;
                objOooOO0O = backupBaiduDatasource3.OooOO0O(num, oooOo002);
                if (objOooOO0O != enumC32485OooO00o) {
                    str9 = str122;
                    objOooO0OO = objOooOO0O;
                    throw new BackupException(str9, ((Number) objOooO0OO).intValue(), null, 4, null);
                }
                return enumC32485OooO00o;
            }
            List<BaiduNetDiskFile> listOooO0O0 = c27184OooO0Oo.OooO0O0();
            ArrayList arrayList = new ArrayList();
            for (BaiduNetDiskFile baiduNetDiskFile : listOooO0O0) {
                backupBaiduDatasource3.getClass();
                try {
                } catch (Exception e3) {
                    e = e3;
                }
                try {
                    backupFile = new BackupFile(Long.toUnsignedString(baiduNetDiskFile.m80756getFsIdsVKNKU()), BackupFile.DiskVendor.Baidu, baiduNetDiskFile.getServerFilename(), baiduNetDiskFile.getPath(), baiduNetDiskFile.isDir() == 1, (((long) baiduNetDiskFile.m80759getServerCtimepVg5ArA()) & 4294967295L) * 1000, baiduNetDiskFile.m80761getSizesVKNKU(), OooO0o(baiduNetDiskFile.getPath()), null);
                } catch (Exception e4) {
                    e = e4;
                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4.OooOOO0("BackupBaiduDatasource");
                    c20358OooO00o4.OooO0Oo(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("convertToBackupFile error, ", baiduNetDiskFile.getPath()), new Object[0]);
                    backupFile = null;
                }
                if (backupFile != null) {
                    arrayList.add(backupFile);
                }
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o5.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o5.OooO0o0(androidx.core.app.OooO.OooO00o(arrayList.size(), "searchFilesInternal, result size: ", ", joinToString: ", oOo000Oo.OooOo.o000oOoO(arrayList, null, null, null, new C22890OooO0Oo(0), 31)), new Object[0]);
            return arrayList;
        }
        str4 = oooOo002.f69919OooOoO0;
        String str14 = oooOo002.f69916OooOo;
        backupBaiduDatasource = (BackupBaiduDatasource) oooOo002.f69917OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0OO);
        objOooO0Oo = objOooO0OO;
        str3 = str14;
        String str15 = (String) objOooO0Oo;
        C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o6.OooOOO0("BackupBaiduDatasource");
        boolean z = str15 == null || str15.length() == 0;
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("searchFilesInternal, searchKey is ", str3, ", rootDirPath is ", str4, ", accessToken isNullOrEmpty: ");
        sbOooO0O0.append(z);
        c20358OooO00o6.OooO0o0(sbOooO0O0.toString(), new Object[0]);
        if (str15 == null || str15.length() == 0) {
            throw new BackupException("Token is null or empty.", BackupEvent.ERROR_INVALID_TOKEN, null, 4, null);
        }
        InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = C28051OooO00o.OooO00o(backupBaiduDatasource.f69831OooO00o).getData();
        oooOo002.f69917OooOo0o = backupBaiduDatasource;
        oooOo002.f69916OooOo = str3;
        oooOo002.f69919OooOoO0 = str4;
        oooOo002.f69918OooOoO = str15;
        oooOo002.f69921OooOoo = 2;
        Object objOooOOo = C25252OooO0Oo.OooOOo(data, oooOo002);
        if (objOooOOo != enumC32485OooO00o) {
            str5 = str15;
            backupBaiduDatasource2 = backupBaiduDatasource;
            str6 = str3;
            str7 = str4;
            objOooO0OO = objOooOOo;
            str8 = (String) ((AbstractC24338OooO0o0) objOooO0OO).OooO0OO(App.f69544OooOooO);
            if (str8 != null) {
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o7.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o7.OooO0OO("searchFilesInternal failed, userId isNullOrEmpty.", new Object[0]);
            throw new BackupException("Uid is null or empty.", BackupEvent.ERROR_UID_NOT_EXIST, null, 4, null);
        }
        return enumC32485OooO00o;
    }

    public final Serializable OooOOO0(String str, C22909Oooo c22909Oooo) {
        String rootDirPath = BackupFile.INSTANCE.getRootDirPath(BackupFile.DiskVendor.Baidu);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "BackupBaiduDatasource", "searchFiles, searchKey is ", str, ", resolvedRootDirPath: ");
        sbOooO00o.append(rootDirPath);
        c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
        return OooOOO(str, rootDirPath, c22909Oooo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        if (r1 == r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOO(String str, BackupInstance backupInstance, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C22899OooOo0 c22899OooOo0;
        String str2;
        BackupInstance backupInstance2;
        BackupBaiduDatasource backupBaiduDatasource;
        String str3;
        String str4;
        String strOooO00o;
        String strOooO00o2;
        if (abstractC32479OooO0OO instanceof C22899OooOo0) {
            c22899OooOo0 = (C22899OooOo0) abstractC32479OooO0OO;
            int i = c22899OooOo0.f69915OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22899OooOo0.f69915OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c22899OooOo0 = new C22899OooOo0(this, abstractC32479OooO0OO);
            }
        }
        Object companion = c22899OooOo0.f69914OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22899OooOo0.f69915OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(companion);
            if (backupInstance == null) {
                BackupInstance.Companion companion2 = BackupInstance.INSTANCE;
                c22899OooOo0.f69912OooOo0o = this;
                str2 = str;
                c22899OooOo0.f69911OooOo = str2;
                c22899OooOo0.f69915OooOoOO = 1;
                companion = companion2.getInstance(this.f69831OooO00o, c22899OooOo0);
                if (companion != enumC32485OooO00o) {
                    backupBaiduDatasource = this;
                }
                return enumC32485OooO00o;
            }
            str2 = str;
            backupInstance2 = backupInstance;
            backupBaiduDatasource = this;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "BackupBaiduDatasource", "searchFilesWithInstance, searchKey is ", str2, ", instance is ");
            sbOooO00o.append(backupInstance2);
            c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
            if (backupInstance2 != null) {
                str3 = null;
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "BackupBaiduDatasource", "searchFilesWithInstance, instanceDirPath is ", str3), new Object[0]);
                if (str3 != null) {
                }
                throw new BackupException("Couldn't get the instance dir.", -999, null, 4, null);
            }
            c22899OooOo0.f69912OooOo0o = backupBaiduDatasource;
            c22899OooOo0.f69911OooOo = str2;
            c22899OooOo0.f69915OooOoOO = 2;
            backupBaiduDatasource.getClass();
            companion = OooO0oo(backupInstance2);
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    str2 = c22899OooOo0.f69911OooOo;
                    backupBaiduDatasource = (BackupBaiduDatasource) c22899OooOo0.f69912OooOo0o;
                    C32446OooOOOo.OooO0O0(companion);
                    str3 = (String) companion;
                    C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o22.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o22, "BackupBaiduDatasource", "searchFilesWithInstance, instanceDirPath is ", str3), new Object[0]);
                    if (str3 != null || str3.length() == 0) {
                        throw new BackupException("Couldn't get the instance dir.", -999, null, 4, null);
                    }
                    c22899OooOo0.f69912OooOo0o = str3;
                    c22899OooOo0.f69911OooOo = null;
                    c22899OooOo0.f69915OooOoOO = 3;
                    Serializable serializableOooOOO = backupBaiduDatasource.OooOOO(str2, str3, c22899OooOo0);
                    if (serializableOooOOO != enumC32485OooO00o) {
                        str4 = str3;
                        companion = serializableOooOOO;
                        List list = (List) companion;
                        strOooO00o = OooO00o.OooO00o(str4);
                        if (strOooO00o != null) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (String) c22899OooOo0.f69912OooOo0o;
                C32446OooOOOo.OooO0O0(companion);
                List list2 = (List) companion;
                strOooO00o = OooO00o.OooO00o(str4);
                if (strOooO00o != null) {
                    throw new BackupException("Couldn't normalize the instance dir.", -999, null, 4, null);
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    String strOooO00o3 = OooO00o.OooO00o(((BackupFile) obj).getPath());
                    if (strOooO00o3 == null || (strOooO00o2 = OooO00o.OooO00o(strOooO00o)) == null || !(strOooO00o3.equals(strOooO00o2) || C33595OooOOo.OooOoO0(strOooO00o3, strOooO00o2.concat("/"), false))) {
                        arrayList2.add(obj);
                    } else {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    String strO000oOoO = oOo000Oo.OooOo.o000oOoO(arrayList2, null, null, null, new com.orion.notein.data.repo.backup.OooO00o(0), 31);
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("BackupBaiduDatasource");
                    int size = list2.size();
                    int size2 = arrayList.size();
                    int size3 = arrayList2.size();
                    StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(size, "searchFilesWithInstance, dropped cross-instance files. instanceDirPath=", str4, ", raw=", ", safe=");
                    C24472OooOoo.OooO0O0(sbOooO0OO, ", dropped=", ", details=", size2, size3);
                    sbOooO0OO.append(strO000oOoO);
                    c20358OooO00o3.OooO0o0(sbOooO0OO.toString(), new Object[0]);
                }
                return arrayList;
            }
            str2 = c22899OooOo0.f69911OooOo;
            backupBaiduDatasource = (BackupBaiduDatasource) c22899OooOo0.f69912OooOo0o;
            C32446OooOOOo.OooO0O0(companion);
        }
        backupInstance2 = (BackupInstance) companion;
        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o2 = C22227OoooO.OooO00o(c20358OooO00o4, "BackupBaiduDatasource", "searchFilesWithInstance, searchKey is ", str2, ", instance is ");
        sbOooO00o2.append(backupInstance2);
        c20358OooO00o4.OooO0o0(sbOooO00o2.toString(), new Object[0]);
        if (backupInstance2 != null) {
        }
    }

    public final Object OooOOOo(C27173OooO00o c27173OooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        String json = this.f69834OooO0Oo.toJson(c27173OooO00o);
        if (json != null) {
            Object objOooO00o = C24332OooO.OooO00o(C28051OooO00o.OooO00o(this.f69831OooO00o), new C22900OooOo0O(json, null), abstractC32479OooO0OO);
            if (objOooO00o == EnumC32485OooO00o.f116726OooOo0o) {
                return objOooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo(String str, String str2, String str3, int i, File file, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C22903OooOoO0 c22903OooOoO0;
        C35238OooOoO c35238OooOoO;
        if (abstractC32479OooO0OO instanceof C22903OooOoO0) {
            c22903OooOoO0 = (C22903OooOoO0) abstractC32479OooO0OO;
            int i2 = c22903OooOoO0.f69933OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c22903OooOoO0.f69933OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c22903OooOoO0 = new C22903OooOoO0(this, abstractC32479OooO0OO);
            }
        }
        C22903OooOoO0 c22903OooOoO02 = c22903OooOoO0;
        Object objOooO0oO = c22903OooOoO02.f69932OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c22903OooOoO02.f69933OooOoO0;
        try {
            if (i3 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0oO);
                String type = this.f69831OooO00o.getContentResolver().getType(Uri.fromFile(file));
                if (type == null) {
                    type = "application/octet-stream";
                }
                MultipartBody.Part.Companion companion = MultipartBody.Part.f124167OooO0OO;
                String name = file.getName();
                RequestBody.Companion companion2 = RequestBody.INSTANCE;
                MediaType.f124148OooO0o0.getClass();
                MediaType mediaTypeOooO0O0 = MediaType.Companion.OooO0O0(type);
                companion2.getClass();
                RequestBody$Companion$asRequestBody$1 requestBody$Companion$asRequestBody$1 = new RequestBody$Companion$asRequestBody$1(mediaTypeOooO0O0, file);
                companion.getClass();
                MultipartBody.Part partOooO0O0 = MultipartBody.Part.Companion.OooO0O0("file", name, requestBody$Companion$asRequestBody$1);
                o0OOOOOO.OooO00o oooO00o = this.f69832OooO0O0;
                c22903OooOoO02.f69933OooOoO0 = 1;
                objOooO0oO = oooO00o.OooO0oO("https://d.pcs.baidu.com/rest/2.0/pcs/superfile2", "upload", str, "tmpfile", str3, str2, i, partOooO0O0, c22903OooOoO02);
                if (objOooO0oO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0oO);
            }
            c35238OooOoO = (C35238OooOoO) objOooO0oO;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o.OooO0Oo(e, "uploadFileSlice failed.", new Object[0]);
            c35238OooOoO = null;
        }
        if (c35238OooOoO != null && !c35238OooOoO.f126541OooO00o.OooO0OO()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o2.OooO0OO("uploadFileSlice failed, response: " + c35238OooOoO, new Object[0]);
        }
        return Boolean.valueOf(c35238OooOoO != null ? c35238OooOoO.f126541OooO00o.OooO0OO() : false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x013c, B:39:0x0145], limit reached: 285 */
    /* JADX WARN: Path cross not found for [B:48:0x0195, B:49:0x0199], limit reached: 285 */
    /* JADX WARN: Path cross not found for [B:48:0x0195, B:52:0x01ac], limit reached: 285 */
    /* JADX WARN: Path cross not found for [B:55:0x01bf, B:48:0x0195], limit reached: 285 */
    /* JADX WARN: Path cross not found for [B:57:0x01c8, B:70:0x0206], limit reached: 285 */
    /* JADX WARN: Path cross not found for [B:59:0x01cd, B:66:0x01e9], limit reached: 285 */
    /* JADX WARN: Path cross not found for [B:84:0x02cf, B:85:0x02d3], limit reached: 285 */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0749 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:306:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40, types: [ooooOOo0.OooOoO] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Iterable, java.lang.Object, java.util.ArrayList, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.nio.channels.FileChannel, java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v34, types: [com.orion.notein.domain.models.backup.BackupFile, java.io.File, java.lang.Object, java.lang.String, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [o0OOOo0O.OooO0OO] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r8v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v62 */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Type inference failed for: r8v66 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x056c -> B:20:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo0(BackupFile backupFile, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOo oooOo;
        Throwable th;
        BackupFile backupFile2;
        Object obj;
        BackupBaiduDatasource backupBaiduDatasource;
        String str;
        ?? string;
        ?? r1;
        String str2;
        final ?? arrayList;
        ?? r13;
        Throwable th2;
        ?? channel;
        EnumC32485OooO00o enumC32485OooO00o;
        BackupFile backupFile3;
        File file;
        String str3;
        int i;
        BackupBaiduDatasource backupBaiduDatasource2;
        ?? r2;
        oO0O000o.OooO00o oooO00o;
        Object obj2;
        ?? r8;
        String str4;
        String strOooO0Oo;
        oO0O000o.OooO00o oooO00o2;
        String str5;
        BackupBaiduDatasource backupBaiduDatasource3;
        String str6;
        String str7;
        String str8;
        int i2;
        String str9;
        File file2;
        BackupFile backupFile4;
        BackupBaiduDatasource backupBaiduDatasource4;
        oO0O000o.OooO00o oooO00o3;
        ?? r9;
        o0OOOOOO.OooO00o oooO00o4;
        boolean zIsDirectory;
        Object objOooO0oo;
        ?? r0;
        ?? r92;
        ?? r3;
        Object objOooOO0O;
        String str10;
        Object obj3;
        oO0O000o.OooO00o oooO00o5;
        String str11;
        Iterator it;
        String str12;
        String str13;
        int i3;
        String str14;
        BackupBaiduDatasource backupBaiduDatasource5;
        o0OOOOOO.OooO00o oooO00o6;
        boolean zIsDirectory2;
        OooOo oooOo2;
        String str15;
        int i4;
        String str16;
        String str17;
        Object objOooOOo;
        BackupBaiduDatasource backupBaiduDatasource6;
        ?? r14;
        int i5;
        File file3;
        BackupFile backupFile5;
        C35238OooOoO c35238OooOoO;
        C27181OooO00o c27181OooO00o;
        String str18;
        if (abstractC32479OooO0OO instanceof OooOo) {
            oooOo = (OooOo) abstractC32479OooO0OO;
            int i6 = oooOo.f69909Oooo0o;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                oooOo.f69909Oooo0o = i6 - Integer.MIN_VALUE;
            } else {
                oooOo = new OooOo(this, abstractC32479OooO0OO);
            }
        }
        OooOo oooOo3 = oooOo;
        Object objOooO0o = oooOo3.f69908Oooo0OO;
        EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
        switch (oooOo3.f69909Oooo0o) {
            case 0:
                th = null;
                C32446OooOOOo.OooO0O0(objOooO0o);
                oooOo3.f69895OooOo0o = this;
                oooOo3.f69894OooOo = backupFile;
                oooOo3.f69909Oooo0o = 1;
                Object objOooO0Oo = OooO0Oo(oooOo3);
                if (objOooO0Oo == enumC32485OooO00o2) {
                    return enumC32485OooO00o2;
                }
                backupFile2 = backupFile;
                obj = objOooO0Oo;
                backupBaiduDatasource = this;
                str = (String) obj;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o.OooO0o0("upload start " + backupFile2 + ", accessToken isNullOrEmpty: " + (str != null || str.length() == 0), new Object[0]);
                if (str != null || str.length() == 0) {
                    throw new BackupException("Token is null or empty.", BackupEvent.ERROR_INVALID_TOKEN, null, 4, null);
                }
                File file4 = new File(backupFile2.getPath());
                if (!file4.exists()) {
                    c20358OooO00o.OooOOO0("BackupBaiduDatasource");
                    c20358OooO00o.OooO0OO("upload failed, source file does not exist.", new Object[0]);
                    throw new BackupException("Source file doesn't exist.", BackupEvent.ERROR_FILE_NOT_EXIST, null, 4, null);
                }
                backupBaiduDatasource.getClass();
                String orDefault = backupFile2.getContentProperties().getOrDefault("content_type", "");
                if (orDefault.length() != 0) {
                    String orDefault2 = backupFile2.getContentProperties().getOrDefault(BackupFile.FILE_PROPERTY_CONTENT_ID, "");
                    if (orDefault2.length() != 0) {
                        String orDefault3 = backupFile2.getContentProperties().getOrDefault(BackupFile.FILE_PROPERTY_CONTENT_CHECKSUM, "");
                        if (orDefault3.length() != 0) {
                            int iHashCode = orDefault.hashCode();
                            if (iHashCode == -1321546630) {
                                if (orDefault.equals("template")) {
                                    String str19 = File.separator;
                                    String name = backupFile2.getName();
                                    StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("template_", orDefault2, C18115b5.CONNECTOR, orDefault3, str19);
                                    sbOooO0O0.append(name);
                                    string = sbOooO0O0.toString();
                                }
                                if (string != 0) {
                                }
                                if (r1 != 0) {
                                }
                                c20358OooO00o.OooOOO0("BackupBaiduDatasource");
                                c20358OooO00o.OooO0OO("upload failed, outputDirPath is null or empty.", new Object[0]);
                                throw new BackupException("Cannot generate remote output file path", -999, null, 4, null);
                            }
                            if (iHashCode == 3387378) {
                                if (orDefault.equals(BackupFile.FILE_CONTENT_TYPE_NOTE)) {
                                    String str20 = File.separator;
                                    String name2 = backupFile2.getName();
                                    StringBuilder sbOooO0O02 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("n_", orDefault2, C18115b5.CONNECTOR, orDefault3, str20);
                                    sbOooO0O02.append(name2);
                                    string = sbOooO0O02.toString();
                                }
                                if (string != 0) {
                                }
                                if (r1 != 0) {
                                }
                                c20358OooO00o.OooOOO0("BackupBaiduDatasource");
                                c20358OooO00o.OooO0OO("upload failed, outputDirPath is null or empty.", new Object[0]);
                                throw new BackupException("Cannot generate remote output file path", -999, null, 4, null);
                            }
                            string = (iHashCode == 110798031 && orDefault.equals("folder_tree")) ? C22237OooO0o0.OooO00o("folder_tree_", orDefault3, File.separator, backupFile2.getName()) : th;
                            if (string != 0) {
                                File file5 = new File((String) string);
                                String strOooO0Oo2 = o0Oo0oo.OooO0Oo(C31183OooO00o.f111222OooO0O0.OooO0OO(C32501OooO0oO.OooO0o(file5), C18115b5.CONNECTOR), ".", C32501OooO0oO.OooO0o0(file5));
                                r1 = strOooO0Oo2;
                                if (file5.getParentFile() != null) {
                                    String absolutePath = new File(file5.getParentFile(), strOooO0Oo2).getAbsolutePath();
                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(absolutePath);
                                    r1 = absolutePath;
                                }
                            }
                            if (r1 != 0 || r1.length() == 0) {
                                c20358OooO00o.OooOOO0("BackupBaiduDatasource");
                                c20358OooO00o.OooO0OO("upload failed, outputDirPath is null or empty.", new Object[0]);
                                throw new BackupException("Cannot generate remote output file path", -999, null, 4, null);
                            }
                            int length = (int) file4.length();
                            String strOooO0o = C32501OooO0oO.OooO0o(file4);
                            str2 = ", isSuccess: ";
                            File file6 = new File(backupBaiduDatasource.f69831OooO00o.getFilesDir(), "backup");
                            C31190OooO0oo.OooO0o(file6);
                            File file7 = new File(file6, "baidu");
                            C31190OooO0oo.OooO0o(file7);
                            File file8 = new File(file7, "chunks");
                            C31190OooO0oo.OooO0o(file8);
                            ?? r28 = r1;
                            File file9 = new File(file8, System.currentTimeMillis() + C18115b5.CONNECTOR + strOooO0o);
                            C31190OooO0oo.OooO0o(file9);
                            Object[] objArr = new Object[0];
                            c20358OooO00o.OooO00o("getBackupSplitDir, backupWithVendorAndChunksAndTimeInMillsDir: " + file9, objArr);
                            backupBaiduDatasource.OooO00o();
                            String absolutePath2 = file9.getAbsolutePath();
                            if (file4.exists()) {
                                arrayList = new ArrayList();
                                try {
                                    try {
                                        channel = new RandomAccessFile(file4, "r").getChannel();
                                        try {
                                            try {
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                        } catch (IOException e2) {
                                            e = e2;
                                            e.printStackTrace();
                                            if (channel != 0) {
                                                try {
                                                    channel.close();
                                                } catch (IOException e3) {
                                                    e3.printStackTrace();
                                                }
                                            }
                                            arrayList = th;
                                            break;
                                        }
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        r13 = objArr;
                                        if (r13 != 0) {
                                            throw th2;
                                        }
                                        try {
                                            r13.close();
                                            throw th2;
                                        } catch (IOException e4) {
                                            e4.printStackTrace();
                                            throw th2;
                                        }
                                    }
                                } catch (IOException e5) {
                                    e = e5;
                                    channel = th;
                                } catch (Throwable th4) {
                                    r13 = th;
                                    th2 = th4;
                                    if (r13 != 0) {
                                    }
                                }
                                if (channel == 0) {
                                    Log.e("FileIOUtils", "fc is null.");
                                    if (channel != 0) {
                                        channel.close();
                                    }
                                    C31190OooO0oo.OooO0oo(file4);
                                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o2.OooOOO0("BackupBaiduDatasource");
                                    c20358OooO00o2.OooO0o0("upload, chunks size is " + (arrayList != 0 ? new Integer(arrayList.size()) : th) + ".", new Object[0]);
                                    if (arrayList != 0 || arrayList.isEmpty()) {
                                        throw new BackupException("Unable to slice the file.", -999, null, 4, null);
                                    }
                                    oO0O000o.OooO00o oooO00o7 = new oO0O000o.OooO00o() { // from class: com.orion.notein.data.repo.backup.OooO0O0
                                        @Override // oO0O000o.OooO00o
                                        public final Object invoke() {
                                            File parentFile = ((File) oOo000Oo.OooOo.Oooo0oO(arrayList)).getParentFile();
                                            if (parentFile != null) {
                                                return Boolean.valueOf(C32501OooO0oO.OooO0Oo(parentFile));
                                            }
                                            return null;
                                        }
                                    };
                                    ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        String lowerCase = C31190OooO0oo.OooOOO((File) it2.next()).toLowerCase(Locale.ROOT);
                                        kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
                                        arrayList2.add(lowerCase);
                                    }
                                    String json = backupBaiduDatasource.f69834OooO0Oo.toJson(arrayList2);
                                    oooOo3.f69895OooOo0o = backupBaiduDatasource;
                                    oooOo3.f69894OooOo = backupFile2;
                                    oooOo3.f69897OooOoO0 = str;
                                    oooOo3.f69896OooOoO = file4;
                                    ?? r82 = r28;
                                    oooOo3.f69898OooOoOO = r82;
                                    oooOo3.f69900OooOoo0 = arrayList;
                                    oooOo3.f69899OooOoo = oooO00o7;
                                    oooOo3.f69901OooOooO = json;
                                    oooOo3.f69906Oooo00o = length;
                                    oooOo3.f69909Oooo0o = 2;
                                    Object objOooO0oO = backupBaiduDatasource.OooO0oO(oooOo3);
                                    enumC32485OooO00o = enumC32485OooO00o2;
                                    if (objOooO0oO == enumC32485OooO00o) {
                                        return enumC32485OooO00o;
                                    }
                                    backupFile3 = backupFile2;
                                    file = file4;
                                    str3 = json;
                                    i = length;
                                    backupBaiduDatasource2 = backupBaiduDatasource;
                                    r2 = arrayList;
                                    oooO00o = oooO00o7;
                                    obj2 = objOooO0oO;
                                    r8 = r82;
                                    str4 = (String) obj2;
                                    if (str4 != null || str4.length() == 0) {
                                        oooO00o.invoke();
                                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o3.OooOOO0("BackupBaiduDatasource");
                                        c20358OooO00o3.OooO0OO("upload failed, instanceDirPath is null or empty.", new Object[0]);
                                        throw new BackupException("Couldn't get the instance dir.", -999, null, 4, null);
                                    }
                                    strOooO0Oo = o0Oo0oo.OooO0Oo(str4, File.separator, r8);
                                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o4.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o4, "BackupBaiduDatasource", "upload, resolvedOutputFilePath is ", strOooO0Oo), new Object[0]);
                                    try {
                                        oooO00o4 = backupBaiduDatasource2.f69832OooO0O0;
                                        zIsDirectory = file.isDirectory();
                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(str3);
                                        oooOo3.f69895OooOo0o = backupBaiduDatasource2;
                                        oooOo3.f69894OooOo = backupFile3;
                                        oooOo3.f69897OooOoO0 = str;
                                        oooOo3.f69896OooOoO = file;
                                        oooOo3.f69898OooOoOO = r2;
                                        oooOo3.f69900OooOoo0 = oooO00o;
                                        oooOo3.f69899OooOoo = str3;
                                        oooOo3.f69901OooOooO = strOooO0Oo;
                                        oooOo3.f69906Oooo00o = i;
                                        oooOo3.f69909Oooo0o = 3;
                                        str7 = str;
                                        oooO00o2 = oooO00o;
                                        backupBaiduDatasource3 = backupBaiduDatasource2;
                                        str6 = "BackupBaiduDatasource";
                                        str5 = str3;
                                    } catch (Exception e6) {
                                        e = e6;
                                        oooO00o2 = oooO00o;
                                        str5 = str3;
                                        backupBaiduDatasource3 = backupBaiduDatasource2;
                                        str6 = "BackupBaiduDatasource";
                                        str7 = str;
                                    }
                                    try {
                                        objOooO0oo = oooO00o4.OooO0oo("precreate", str7, strOooO0Oo, i, zIsDirectory ? 1 : 0, str5, 1, 3, oooOo3);
                                        break;
                                    } catch (Exception e7) {
                                        e = e7;
                                        str8 = str7;
                                        i2 = i;
                                        str9 = str5;
                                        file2 = file;
                                        backupFile4 = backupFile3;
                                        backupBaiduDatasource4 = backupBaiduDatasource3;
                                        oooO00o3 = oooO00o2;
                                        r9 = r2;
                                        C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o5.OooOOO0(str6);
                                        c20358OooO00o5.OooO0Oo(e, "upload preCreate failed.", new Object[0]);
                                        i2 = i2;
                                        r0 = th;
                                        r92 = r9;
                                        C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o6.OooOOO0(str6);
                                        if (r0 == 0) {
                                        }
                                        if (r0 == 0) {
                                        }
                                        int i7 = i2;
                                        String str21 = strOooO0Oo;
                                        StringBuilder sb = new StringBuilder("upload, preCreate result: ");
                                        sb.append(obj);
                                        String str22 = str2;
                                        sb.append(str22);
                                        sb.append(objValueOf);
                                        c20358OooO00o6.OooO0o0(sb.toString(), new Object[0]);
                                        if (r0 == 0) {
                                        }
                                        if (r0 != 0) {
                                        }
                                        oooO00o3.invoke();
                                        if (r3 == 0) {
                                        }
                                        oooOo3.f69895OooOo0o = "Unable to precreate file in baidu's disk.";
                                        oooOo3.f69894OooOo = null;
                                        oooOo3.f69897OooOoO0 = null;
                                        oooOo3.f69896OooOoO = null;
                                        oooOo3.f69898OooOoOO = null;
                                        oooOo3.f69900OooOoo0 = null;
                                        oooOo3.f69899OooOoo = null;
                                        oooOo3.f69901OooOooO = null;
                                        oooOo3.f69909Oooo0o = 4;
                                        objOooOO0O = backupBaiduDatasource4.OooOO0O(num, oooOo3);
                                        if (objOooOO0O != enumC32485OooO00o) {
                                        }
                                    }
                                    if (objOooO0oo == enumC32485OooO00o) {
                                        return enumC32485OooO00o;
                                    }
                                    str8 = str7;
                                    i2 = i;
                                    str9 = str5;
                                    file2 = file;
                                    backupFile4 = backupFile3;
                                    backupBaiduDatasource4 = backupBaiduDatasource3;
                                    oooO00o3 = oooO00o2;
                                    r9 = r2;
                                    try {
                                        r0 = (C35238OooOoO) objOooO0oo;
                                        r92 = r9;
                                    } catch (Exception e8) {
                                        e = e8;
                                        C34406OooO00o.C20358OooO00o c20358OooO00o52 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o52.OooOOO0(str6);
                                        c20358OooO00o52.OooO0Oo(e, "upload preCreate failed.", new Object[0]);
                                        i2 = i2;
                                        r0 = th;
                                        r92 = r9;
                                    }
                                    C34406OooO00o.C20358OooO00o c20358OooO00o62 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o62.OooOOO0(str6);
                                    Object obj4 = r0 == 0 ? (C27183OooO0OO) r0.f126542OooO0O0 : th;
                                    Object objValueOf = r0 == 0 ? Boolean.valueOf(r0.f126541OooO00o.OooO0OO()) : th;
                                    int i72 = i2;
                                    String str212 = strOooO0Oo;
                                    StringBuilder sb2 = new StringBuilder("upload, preCreate result: ");
                                    sb2.append(obj4);
                                    String str222 = str2;
                                    sb2.append(str222);
                                    sb2.append(objValueOf);
                                    c20358OooO00o62.OooO0o0(sb2.toString(), new Object[0]);
                                    r3 = r0 == 0 ? (C27183OooO0OO) r0.f126542OooO0O0 : th;
                                    if (r0 != 0 || !r0.f126541OooO00o.OooO0OO() || r3 == 0 || r3.getErrno() != 0) {
                                        oooO00o3.invoke();
                                        Integer num = r3 == 0 ? new Integer(r3.getErrno()) : null;
                                        oooOo3.f69895OooOo0o = "Unable to precreate file in baidu's disk.";
                                        oooOo3.f69894OooOo = null;
                                        oooOo3.f69897OooOoO0 = null;
                                        oooOo3.f69896OooOoO = null;
                                        oooOo3.f69898OooOoOO = null;
                                        oooOo3.f69900OooOoo0 = null;
                                        oooOo3.f69899OooOoo = null;
                                        oooOo3.f69901OooOooO = null;
                                        oooOo3.f69909Oooo0o = 4;
                                        objOooOO0O = backupBaiduDatasource4.OooOO0O(num, oooOo3);
                                        if (objOooOO0O != enumC32485OooO00o) {
                                            return enumC32485OooO00o;
                                        }
                                        str10 = "Unable to precreate file in baidu's disk.";
                                        obj3 = objOooOO0O;
                                        throw new BackupException(str10, ((Number) obj3).intValue(), null, 4, null);
                                    }
                                    if (r3.getReturnType() == 2) {
                                        oooO00o3.invoke();
                                        c20358OooO00o62.OooOOO0(str6);
                                        c20358OooO00o62.OooO0o0("upload failed, precreateResult.returnType is 2", new Object[0]);
                                        return C32460OooOooO.f116667OooO00o;
                                    }
                                    String uploadId = r3.getCom.alibaba.sdk.android.oss.common.RequestParameters.UPLOAD_ID java.lang.String();
                                    oooO00o5 = oooO00o3;
                                    ?? r83 = r92;
                                    str11 = str212;
                                    int i8 = 0;
                                    it = ((Iterable) r92).iterator();
                                    str12 = uploadId;
                                    BackupFile backupFile6 = backupFile4;
                                    str13 = str9;
                                    i3 = i72;
                                    if (!it.hasNext()) {
                                        Object next = it.next();
                                        str15 = str222;
                                        i4 = i8 + 1;
                                        if (i8 < 0) {
                                            C34429OooOOo0.OooOOo();
                                            throw th;
                                        }
                                        str16 = str6;
                                        File file10 = (File) next;
                                        oooOo3.f69895OooOo0o = backupBaiduDatasource4;
                                        oooOo3.f69894OooOo = backupFile6;
                                        oooOo3.f69897OooOoO0 = str8;
                                        oooOo3.f69896OooOoO = file2;
                                        oooOo3.f69898OooOoOO = r83;
                                        oooOo3.f69900OooOoo0 = oooO00o5;
                                        oooOo3.f69899OooOoo = str13;
                                        oooOo3.f69901OooOooO = str11;
                                        oooOo3.f69902OooOooo = str12;
                                        oooOo3.f69904Oooo000 = it;
                                        oooOo3.f69905Oooo00O = file10;
                                        oooOo3.f69906Oooo00o = i3;
                                        oooOo3.f69903Oooo0 = i4;
                                        oooOo3.f69907Oooo0O0 = i8;
                                        BackupFile backupFile7 = backupFile6;
                                        oooOo3.f69909Oooo0o = 5;
                                        String str23 = str12;
                                        int i9 = i8;
                                        String str24 = str11;
                                        str17 = str8;
                                        BackupBaiduDatasource backupBaiduDatasource7 = backupBaiduDatasource4;
                                        objOooOOo = backupBaiduDatasource7.OooOOo(str17, str23, str24, i9, file10, oooOo3);
                                        if (objOooOOo == enumC32485OooO00o) {
                                            return enumC32485OooO00o;
                                        }
                                        backupBaiduDatasource6 = backupBaiduDatasource7;
                                        r14 = r83;
                                        str12 = str23;
                                        str11 = str24;
                                        i5 = i9;
                                        file3 = file10;
                                        backupFile5 = backupFile7;
                                        str8 = str17;
                                        if (((Boolean) objOooOOo).booleanValue()) {
                                            C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o7.OooOOO0(str16);
                                            c20358OooO00o7.OooO0o0(C20856OooooOo.OooO0O0("upload, uploadFileSlice index: ", i5, ", totalSize: ", ", upload failed.", r14.size()), new Object[0]);
                                            oooO00o5.invoke();
                                            throw new BackupException("Unable to upload file slice.", -999, null, 4, null);
                                        }
                                        C31190OooO0oo.OooO0oo(file3);
                                        i8 = i4;
                                        r83 = r14;
                                        backupFile6 = backupFile5;
                                        str222 = str15;
                                        backupBaiduDatasource4 = backupBaiduDatasource6;
                                        str6 = str16;
                                        if (!it.hasNext()) {
                                            BackupFile backupFile8 = backupFile6;
                                            String str25 = str12;
                                            str14 = str222;
                                            String str26 = str11;
                                            String str27 = str8;
                                            backupBaiduDatasource5 = backupBaiduDatasource4;
                                            oooO00o5.invoke();
                                            C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o8.OooOOO0(str6);
                                            c20358OooO00o8.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("upload, uploadFileSlice all success, backupFile: ", backupFile8.getName()), new Object[0]);
                                            try {
                                                oooO00o6 = backupBaiduDatasource5.f69832OooO0O0;
                                                zIsDirectory2 = file2.isDirectory();
                                                kotlin.jvm.internal.OooOOO0.OooO0Oo(str13);
                                                oooOo3.f69895OooOo0o = backupBaiduDatasource5;
                                                ?? r22 = th;
                                                try {
                                                    oooOo3.f69894OooOo = r22;
                                                    oooOo3.f69897OooOoO0 = r22;
                                                    oooOo3.f69896OooOoO = r22;
                                                    oooOo3.f69898OooOoOO = r22;
                                                    oooOo3.f69900OooOoo0 = r22;
                                                    oooOo3.f69899OooOoo = r22;
                                                    oooOo3.f69901OooOooO = r22;
                                                    oooOo3.f69902OooOooo = r22;
                                                    oooOo3.f69904Oooo000 = r22;
                                                    oooOo3.f69905Oooo00O = r22;
                                                    oooOo3.f69909Oooo0o = 6;
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    oooOo2 = oooOo3;
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                            }
                                            try {
                                                objOooO0o = oooO00o6.OooO0o("create", str27, str26, i3, zIsDirectory2 ? 1 : 0, str13, str25, 3, oooOo3);
                                            } catch (Exception e11) {
                                                e = e11;
                                                oooOo2 = oooOo3;
                                                oooOo3 = oooOo2;
                                                C34406OooO00o.C20358OooO00o c20358OooO00o9 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o9.OooOOO0(str6);
                                                c20358OooO00o9.OooO0Oo(e, "upload, create failed.", new Object[0]);
                                                c35238OooOoO = null;
                                                C34406OooO00o.C20358OooO00o c20358OooO00o10 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o10.OooOOO0(str6);
                                                if (c35238OooOoO == null) {
                                                }
                                                if (c35238OooOoO == null) {
                                                }
                                                c20358OooO00o10.OooO0o0("upload, create result: " + (c35238OooOoO == null ? (C27181OooO00o) c35238OooOoO.f126542OooO0O0 : null) + str14 + (c35238OooOoO == null ? Boolean.valueOf(c35238OooOoO.f126541OooO00o.OooO0OO()) : null), new Object[0]);
                                                if (c35238OooOoO == null) {
                                                }
                                                if (c35238OooOoO == null) {
                                                }
                                                if (c27181OooO00o == null) {
                                                }
                                                str18 = "Couldn't create file in baidu's disk.";
                                                oooOo3.f69895OooOo0o = "Couldn't create file in baidu's disk.";
                                                oooOo3.f69894OooOo = null;
                                                oooOo3.f69897OooOoO0 = null;
                                                oooOo3.f69896OooOoO = null;
                                                oooOo3.f69898OooOoOO = null;
                                                oooOo3.f69900OooOoo0 = null;
                                                oooOo3.f69899OooOoo = null;
                                                oooOo3.f69901OooOooO = null;
                                                oooOo3.f69902OooOooo = null;
                                                oooOo3.f69904Oooo000 = null;
                                                oooOo3.f69905Oooo00O = null;
                                                oooOo3.f69909Oooo0o = 7;
                                                objOooO0o = backupBaiduDatasource5.OooOO0O(num, oooOo3);
                                                if (objOooO0o == enumC32485OooO00o) {
                                                }
                                                throw new BackupException(str18, ((Number) objOooO0o).intValue(), null, 4, null);
                                            }
                                            if (objOooO0o == enumC32485OooO00o) {
                                                return enumC32485OooO00o;
                                            }
                                            oooOo3 = oooOo3;
                                            try {
                                                c35238OooOoO = (C35238OooOoO) objOooO0o;
                                                break;
                                            } catch (Exception e12) {
                                                e = e12;
                                                C34406OooO00o.C20358OooO00o c20358OooO00o92 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o92.OooOOO0(str6);
                                                c20358OooO00o92.OooO0Oo(e, "upload, create failed.", new Object[0]);
                                                c35238OooOoO = null;
                                            }
                                            C34406OooO00o.C20358OooO00o c20358OooO00o102 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o102.OooOOO0(str6);
                                            c20358OooO00o102.OooO0o0("upload, create result: " + (c35238OooOoO == null ? (C27181OooO00o) c35238OooOoO.f126542OooO0O0 : null) + str14 + (c35238OooOoO == null ? Boolean.valueOf(c35238OooOoO.f126541OooO00o.OooO0OO()) : null), new Object[0]);
                                            c27181OooO00o = c35238OooOoO == null ? (C27181OooO00o) c35238OooOoO.f126542OooO0O0 : null;
                                            if (c35238OooOoO == null && c35238OooOoO.f126541OooO00o.OooO0OO() && c27181OooO00o != null && c27181OooO00o.getErrno() == 0) {
                                                return C32460OooOooO.f116667OooO00o;
                                            }
                                            Integer num2 = c27181OooO00o == null ? new Integer(c27181OooO00o.getErrno()) : null;
                                            str18 = "Couldn't create file in baidu's disk.";
                                            oooOo3.f69895OooOo0o = "Couldn't create file in baidu's disk.";
                                            oooOo3.f69894OooOo = null;
                                            oooOo3.f69897OooOoO0 = null;
                                            oooOo3.f69896OooOoO = null;
                                            oooOo3.f69898OooOoOO = null;
                                            oooOo3.f69900OooOoo0 = null;
                                            oooOo3.f69899OooOoo = null;
                                            oooOo3.f69901OooOooO = null;
                                            oooOo3.f69902OooOooo = null;
                                            oooOo3.f69904Oooo000 = null;
                                            oooOo3.f69905Oooo00O = null;
                                            oooOo3.f69909Oooo0o = 7;
                                            objOooO0o = backupBaiduDatasource5.OooOO0O(num2, oooOo3);
                                            if (objOooO0o == enumC32485OooO00o) {
                                                return enumC32485OooO00o;
                                            }
                                            throw new BackupException(str18, ((Number) objOooO0o).intValue(), null, 4, null);
                                        }
                                    }
                                    break;
                                } else {
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4194304);
                                    int i10 = 0;
                                    while (channel.read(byteBufferAllocate) > 0) {
                                        byte[] bArrCopyOf = Arrays.copyOf(byteBufferAllocate.array(), byteBufferAllocate.position());
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(absolutePath2);
                                        String str28 = absolutePath2;
                                        sb3.append(File.separator);
                                        sb3.append(file4.getName());
                                        sb3.append(C18115b5.CONNECTOR);
                                        sb3.append(i10);
                                        String string2 = sb3.toString();
                                        C31186OooO0Oo.OooO0O0(string2, bArrCopyOf);
                                        byteBufferAllocate.clear();
                                        arrayList.add(new File(string2));
                                        i10++;
                                        absolutePath2 = str28;
                                    }
                                    channel.close();
                                }
                                C31190OooO0oo.OooO0oo(file4);
                                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o22.OooOOO0("BackupBaiduDatasource");
                                if (arrayList != 0) {
                                }
                                c20358OooO00o22.OooO0o0("upload, chunks size is " + (arrayList != 0 ? new Integer(arrayList.size()) : th) + ".", new Object[0]);
                                if (arrayList != 0) {
                                }
                                throw new BackupException("Unable to slice the file.", -999, null, 4, null);
                            }
                            arrayList = th;
                            C31190OooO0oo.OooO0oo(file4);
                            C34406OooO00o.C20358OooO00o c20358OooO00o222 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o222.OooOOO0("BackupBaiduDatasource");
                            if (arrayList != 0) {
                            }
                            c20358OooO00o222.OooO0o0("upload, chunks size is " + (arrayList != 0 ? new Integer(arrayList.size()) : th) + ".", new Object[0]);
                            if (arrayList != 0) {
                            }
                            throw new BackupException("Unable to slice the file.", -999, null, 4, null);
                        }
                    }
                }
                r1 = th;
                if (r1 != 0) {
                }
                c20358OooO00o.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o.OooO0OO("upload failed, outputDirPath is null or empty.", new Object[0]);
                throw new BackupException("Cannot generate remote output file path", -999, null, 4, null);
            case 1:
                th = null;
                BackupFile backupFile9 = oooOo3.f69894OooOo;
                BackupBaiduDatasource backupBaiduDatasource8 = (BackupBaiduDatasource) oooOo3.f69895OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                backupBaiduDatasource = backupBaiduDatasource8;
                backupFile2 = backupFile9;
                obj = objOooO0o;
                str = (String) obj;
                C34406OooO00o.C20358OooO00o c20358OooO00o11 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o11.OooOOO0("BackupBaiduDatasource");
                if (str != null) {
                    break;
                }
                c20358OooO00o11.OooO0o0("upload start " + backupFile2 + ", accessToken isNullOrEmpty: " + (str != null || str.length() == 0), new Object[0]);
                if (str != null) {
                    break;
                }
                throw new BackupException("Token is null or empty.", BackupEvent.ERROR_INVALID_TOKEN, null, 4, null);
            case 2:
                th = null;
                int i11 = oooOo3.f69906Oooo00o;
                str3 = oooOo3.f69901OooOooO;
                oO0O000o.OooO00o oooO00o8 = (oO0O000o.OooO00o) oooOo3.f69899OooOoo;
                List list = (List) oooOo3.f69900OooOoo0;
                String str29 = (String) oooOo3.f69898OooOoOO;
                File file11 = oooOo3.f69896OooOoO;
                str = oooOo3.f69897OooOoO0;
                BackupFile backupFile10 = oooOo3.f69894OooOo;
                BackupBaiduDatasource backupBaiduDatasource9 = (BackupBaiduDatasource) oooOo3.f69895OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                oooO00o = oooO00o8;
                backupFile3 = backupFile10;
                backupBaiduDatasource2 = backupBaiduDatasource9;
                str2 = ", isSuccess: ";
                enumC32485OooO00o = enumC32485OooO00o2;
                r2 = list;
                file = file11;
                i = i11;
                obj2 = objOooO0o;
                r8 = str29;
                str4 = (String) obj2;
                if (str4 != null) {
                    break;
                }
                oooO00o.invoke();
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o32.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o32.OooO0OO("upload failed, instanceDirPath is null or empty.", new Object[0]);
                throw new BackupException("Couldn't get the instance dir.", -999, null, 4, null);
            case 3:
                th = null;
                i2 = oooOo3.f69906Oooo00o;
                strOooO0Oo = oooOo3.f69901OooOooO;
                str9 = (String) oooOo3.f69899OooOoo;
                oooO00o3 = (oO0O000o.OooO00o) oooOo3.f69900OooOoo0;
                r9 = (List) oooOo3.f69898OooOoOO;
                file2 = oooOo3.f69896OooOoO;
                str8 = oooOo3.f69897OooOoO0;
                backupFile4 = oooOo3.f69894OooOo;
                backupBaiduDatasource4 = (BackupBaiduDatasource) oooOo3.f69895OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    str6 = "BackupBaiduDatasource";
                    str2 = ", isSuccess: ";
                    objOooO0oo = objOooO0o;
                    enumC32485OooO00o = enumC32485OooO00o2;
                    r9 = r9;
                    r0 = (C35238OooOoO) objOooO0oo;
                    r92 = r9;
                    break;
                } catch (Exception e13) {
                    e = e13;
                    str6 = "BackupBaiduDatasource";
                    str2 = ", isSuccess: ";
                    enumC32485OooO00o = enumC32485OooO00o2;
                    C34406OooO00o.C20358OooO00o c20358OooO00o522 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o522.OooOOO0(str6);
                    c20358OooO00o522.OooO0Oo(e, "upload preCreate failed.", new Object[0]);
                    i2 = i2;
                    r0 = th;
                    r92 = r9;
                    C34406OooO00o.C20358OooO00o c20358OooO00o622 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o622.OooOOO0(str6);
                    if (r0 == 0) {
                    }
                    if (r0 == 0) {
                    }
                    int i722 = i2;
                    String str2122 = strOooO0Oo;
                    StringBuilder sb22 = new StringBuilder("upload, preCreate result: ");
                    sb22.append(obj4);
                    String str2222 = str2;
                    sb22.append(str2222);
                    sb22.append(objValueOf);
                    c20358OooO00o622.OooO0o0(sb22.toString(), new Object[0]);
                    if (r0 == 0) {
                    }
                    if (r0 != 0) {
                    }
                    oooO00o3.invoke();
                    if (r3 == 0) {
                    }
                    oooOo3.f69895OooOo0o = "Unable to precreate file in baidu's disk.";
                    oooOo3.f69894OooOo = null;
                    oooOo3.f69897OooOoO0 = null;
                    oooOo3.f69896OooOoO = null;
                    oooOo3.f69898OooOoOO = null;
                    oooOo3.f69900OooOoo0 = null;
                    oooOo3.f69899OooOoo = null;
                    oooOo3.f69901OooOooO = null;
                    oooOo3.f69909Oooo0o = 4;
                    objOooOO0O = backupBaiduDatasource4.OooOO0O(num, oooOo3);
                    if (objOooOO0O != enumC32485OooO00o) {
                    }
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o6222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o6222.OooOOO0(str6);
                if (r0 == 0) {
                }
                if (r0 == 0) {
                }
                int i7222 = i2;
                String str21222 = strOooO0Oo;
                StringBuilder sb222 = new StringBuilder("upload, preCreate result: ");
                sb222.append(obj4);
                String str22222 = str2;
                sb222.append(str22222);
                sb222.append(objValueOf);
                c20358OooO00o6222.OooO0o0(sb222.toString(), new Object[0]);
                if (r0 == 0) {
                }
                if (r0 != 0) {
                }
                oooO00o3.invoke();
                if (r3 == 0) {
                }
                oooOo3.f69895OooOo0o = "Unable to precreate file in baidu's disk.";
                oooOo3.f69894OooOo = null;
                oooOo3.f69897OooOoO0 = null;
                oooOo3.f69896OooOoO = null;
                oooOo3.f69898OooOoOO = null;
                oooOo3.f69900OooOoo0 = null;
                oooOo3.f69899OooOoo = null;
                oooOo3.f69901OooOooO = null;
                oooOo3.f69909Oooo0o = 4;
                objOooOO0O = backupBaiduDatasource4.OooOO0O(num, oooOo3);
                if (objOooOO0O != enumC32485OooO00o) {
                }
                break;
            case 4:
                String str30 = (String) oooOo3.f69895OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                str10 = str30;
                obj3 = objOooO0o;
                throw new BackupException(str10, ((Number) obj3).intValue(), null, 4, null);
            case 5:
                i5 = oooOo3.f69907Oooo0O0;
                i4 = oooOo3.f69903Oooo0;
                i3 = oooOo3.f69906Oooo00o;
                file3 = oooOo3.f69905Oooo00O;
                it = oooOo3.f69904Oooo000;
                String str31 = oooOo3.f69902OooOooo;
                String str32 = oooOo3.f69901OooOooO;
                th = null;
                str13 = (String) oooOo3.f69899OooOoo;
                oooO00o5 = (oO0O000o.OooO00o) oooOo3.f69900OooOoo0;
                List list2 = (List) oooOo3.f69898OooOoOO;
                File file12 = oooOo3.f69896OooOoO;
                str17 = oooOo3.f69897OooOoO0;
                backupFile5 = oooOo3.f69894OooOo;
                BackupBaiduDatasource backupBaiduDatasource10 = (BackupBaiduDatasource) oooOo3.f69895OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                file2 = file12;
                str15 = ", isSuccess: ";
                enumC32485OooO00o = enumC32485OooO00o2;
                str12 = str31;
                backupBaiduDatasource6 = backupBaiduDatasource10;
                str16 = "BackupBaiduDatasource";
                str11 = str32;
                objOooOOo = objOooO0o;
                r14 = list2;
                str8 = str17;
                if (((Boolean) objOooOOo).booleanValue()) {
                }
                break;
            case 6:
                backupBaiduDatasource5 = (BackupBaiduDatasource) oooOo3.f69895OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    str6 = "BackupBaiduDatasource";
                    str14 = ", isSuccess: ";
                    enumC32485OooO00o = enumC32485OooO00o2;
                    c35238OooOoO = (C35238OooOoO) objOooO0o;
                    break;
                } catch (Exception e14) {
                    e = e14;
                    str6 = "BackupBaiduDatasource";
                    str14 = ", isSuccess: ";
                    enumC32485OooO00o = enumC32485OooO00o2;
                    C34406OooO00o.C20358OooO00o c20358OooO00o922 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o922.OooOOO0(str6);
                    c20358OooO00o922.OooO0Oo(e, "upload, create failed.", new Object[0]);
                    c35238OooOoO = null;
                    C34406OooO00o.C20358OooO00o c20358OooO00o1022 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o1022.OooOOO0(str6);
                    if (c35238OooOoO == null) {
                    }
                    if (c35238OooOoO == null) {
                    }
                    c20358OooO00o1022.OooO0o0("upload, create result: " + (c35238OooOoO == null ? (C27181OooO00o) c35238OooOoO.f126542OooO0O0 : null) + str14 + (c35238OooOoO == null ? Boolean.valueOf(c35238OooOoO.f126541OooO00o.OooO0OO()) : null), new Object[0]);
                    if (c35238OooOoO == null) {
                    }
                    if (c35238OooOoO == null) {
                    }
                    if (c27181OooO00o == null) {
                    }
                    str18 = "Couldn't create file in baidu's disk.";
                    oooOo3.f69895OooOo0o = "Couldn't create file in baidu's disk.";
                    oooOo3.f69894OooOo = null;
                    oooOo3.f69897OooOoO0 = null;
                    oooOo3.f69896OooOoO = null;
                    oooOo3.f69898OooOoOO = null;
                    oooOo3.f69900OooOoo0 = null;
                    oooOo3.f69899OooOoo = null;
                    oooOo3.f69901OooOooO = null;
                    oooOo3.f69902OooOooo = null;
                    oooOo3.f69904Oooo000 = null;
                    oooOo3.f69905Oooo00O = null;
                    oooOo3.f69909Oooo0o = 7;
                    objOooO0o = backupBaiduDatasource5.OooOO0O(num2, oooOo3);
                    if (objOooO0o == enumC32485OooO00o) {
                    }
                    throw new BackupException(str18, ((Number) objOooO0o).intValue(), null, 4, null);
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o10222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o10222.OooOOO0(str6);
                if (c35238OooOoO == null) {
                }
                if (c35238OooOoO == null) {
                }
                c20358OooO00o10222.OooO0o0("upload, create result: " + (c35238OooOoO == null ? (C27181OooO00o) c35238OooOoO.f126542OooO0O0 : null) + str14 + (c35238OooOoO == null ? Boolean.valueOf(c35238OooOoO.f126541OooO00o.OooO0OO()) : null), new Object[0]);
                if (c35238OooOoO == null) {
                }
                if (c35238OooOoO == null) {
                    break;
                }
                if (c27181OooO00o == null) {
                }
                str18 = "Couldn't create file in baidu's disk.";
                oooOo3.f69895OooOo0o = "Couldn't create file in baidu's disk.";
                oooOo3.f69894OooOo = null;
                oooOo3.f69897OooOoO0 = null;
                oooOo3.f69896OooOoO = null;
                oooOo3.f69898OooOoOO = null;
                oooOo3.f69900OooOoo0 = null;
                oooOo3.f69899OooOoo = null;
                oooOo3.f69901OooOooO = null;
                oooOo3.f69902OooOooo = null;
                oooOo3.f69904Oooo000 = null;
                oooOo3.f69905Oooo00O = null;
                oooOo3.f69909Oooo0o = 7;
                objOooO0o = backupBaiduDatasource5.OooOO0O(num2, oooOo3);
                if (objOooO0o == enumC32485OooO00o) {
                }
                throw new BackupException(str18, ((Number) objOooO0o).intValue(), null, 4, null);
            case 7:
                str18 = (String) oooOo3.f69895OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                throw new BackupException(str18, ((Number) objOooO0o).intValue(), null, 4, null);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (o0000oOO.C24332OooO.OooO00o(r7, r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOoo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C22902OooOoO c22902OooOoO;
        BackupBaiduDatasource backupBaiduDatasource;
        if (abstractC32479OooO0OO instanceof C22902OooOoO) {
            c22902OooOoO = (C22902OooOoO) abstractC32479OooO0OO;
            int i = c22902OooOoO.f69929OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22902OooOoO.f69929OooOoO = i - Integer.MIN_VALUE;
            } else {
                c22902OooOoO = new C22902OooOoO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c22902OooOoO.f69927OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22902OooOoO.f69929OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            c22902OooOoO.f69928OooOo0o = this;
            c22902OooOoO.f69929OooOoO = 1;
            objOooO0Oo = OooO0Oo(c22902OooOoO);
            if (objOooO0Oo != enumC32485OooO00o) {
                backupBaiduDatasource = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            return C32460OooOooO.f116667OooO00o;
        }
        backupBaiduDatasource = c22902OooOoO.f69928OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0Oo);
        CharSequence charSequence = (CharSequence) objOooO0Oo;
        if (charSequence == null || charSequence.length() == 0) {
            Intent intent = new Intent(backupBaiduDatasource.f69831OooO00o, (Class<?>) NetDiskAuthorizeActivity.class);
            intent.setFlags(WarningType.HINT);
            intent.putExtra("vendor_id", BackupFile.DiskVendor.Baidu.ordinal());
            backupBaiduDatasource.f69831OooO00o.startActivity(intent);
            return C32460OooOooO.f116667OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("BackupBaiduDatasource");
        c20358OooO00o.OooO0o0("use baidu, already authorized.", new Object[0]);
        o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO0OooO00o = C28051OooO00o.OooO00o(backupBaiduDatasource.f69831OooO00o);
        C22904OooOoOO c22904OooOoOO = new C22904OooOoOO(2, null);
        c22902OooOoO.f69928OooOo0o = null;
        c22902OooOoO.f69929OooOoO = 2;
    }
}
