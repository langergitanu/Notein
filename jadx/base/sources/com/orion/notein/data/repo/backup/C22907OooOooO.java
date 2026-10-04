package com.orion.notein.data.repo.backup;

import OooOoOO.C20519OooO0Oo;
import OooOoo.C20593OooO0Oo;
import android.content.Intent;
import com.aspose.words.WarningType;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.googleapis.extensions.android.gms.auth.UserRecoverableAuthIOException;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.util.DateTime;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.domain.models.backup.BackupEvent;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.backup.BackupInstance;
import com.orion.notein.domain.models.cloud.GoogleCloudError;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.backup.netdisk.NetDiskAuthorizeActivity;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import o0000oOO.C24332OooO;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0Oo00o.C28028OooO0o;
import o0Oo0O00.C28051OooO00o;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0o0O0o.C33588OooOO0;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.backup.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C22907OooOooO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final C33588OooOO0 f69937OooO0oO = new C33588OooOO0("[^A-Za-z0-9\\u4e00-\\u9fa5]");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f69938OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f69939OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO00o f69940OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C33781o00o0O f69941OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C32447OooOOo f69942OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C32447OooOOo f69943OooO0o0;

    /* JADX INFO: renamed from: com.orion.notein.data.repo.backup.OooOooO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Drive f69944OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final GoogleSignInAccount f69945OooO0O0;

        public OooO00o(Drive drive, GoogleSignInAccount googleSignInAccount) {
            this.f69944OooO00o = drive;
            this.f69945OooO0O0 = googleSignInAccount;
        }
    }

    public C22907OooOooO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        this.f69938OooO00o = abstractApplicationC26277OooOoOO;
        this.f69941OooO0Oo = C33784o00ooo.OooO00o(Boolean.valueOf(GoogleSignIn.getLastSignedInAccount(abstractApplicationC26277OooOoOO) != null));
        this.f69943OooO0o0 = C20519OooO0Oo.OooO0OO(new C22906OooOoo0(0));
        this.f69942OooO0o = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: com.orion.notein.data.repo.backup.OooOoo
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                C22907OooOooO c22907OooOooO = this.f69935OooOo0o;
                return GoogleSignIn.getClient(c22907OooOooO.f69938OooO00o, (GoogleSignInOptions) c22907OooOooO.f69943OooO0o0.getValue());
            }
        });
    }

    public static Object OooO0O0(Drive drive, String str, String str2, Map map) throws BackupException {
        String id;
        try {
            List<File> files = drive.files().list().setQ("mimeType='application/vnd.google-apps.folder' and trashed = false and name = '" + str + "' and '" + str2 + "' in parents").setSpaces("drive").setFields2("nextPageToken, files(id, name, mimeType)").execute().getFiles();
            if (files.isEmpty()) {
                id = drive.files().create(new File().setName(str).setMimeType("application/vnd.google-apps.folder").setParents(com.facebook.soloader.OooOo.OooO0oO(str2)).setProperties(map)).setFields2("id").execute().getId();
            } else {
                id = files.get(0).getId();
            }
            return drive.files().get(id).setFields2("id, name, mimeType, parents, properties").execute();
        } catch (Exception e) {
            throw OooO0oO(e, -999, "Create folder failed! Folder Name: " + str + ". " + e);
        }
    }

    public static BackupException OooO0oO(Exception exc, int i, String str) {
        GoogleCloudError googleCloudError;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("BackupGoogleDriveDatasource");
        c20358OooO00o.OooO0OO("handleException: " + exc + ", errorCode: " + i + ", " + str, new Object[0]);
        if (exc instanceof GoogleJsonResponseException) {
            googleCloudError = (GoogleCloudError) C28028OooO0o.OooO00o().fromJson(((GoogleJsonResponseException) exc).getContent(), GoogleCloudError.class);
        } else {
            boolean z = exc instanceof UserRecoverableAuthIOException;
            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
            googleCloudError = z ? new GoogleCloudError("401", "Invalid Credentials by UserRecoverableAuthIOException", c34434OooOoO) : exc instanceof UserRecoverableAuthException ? new GoogleCloudError("401", "Invalid Credentials by UserRecoverableAuthException", c34434OooOoO) : null;
        }
        return (googleCloudError == null || !kotlin.jvm.internal.OooOOO0.OooO0O0(googleCloudError.getCode(), "401")) ? new BackupException(str, i, null, 4, null) : new BackupException(str, BackupEvent.ERROR_INVALID_TOKEN, null, 4, null);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [com.google.api.services.drive.Drive$Files$List] */
    public static ArrayList OooO0oo(Drive drive, String str, String str2) throws BackupException {
        String str3;
        try {
            ArrayList arrayList = new ArrayList();
            String str4 = str2 == null ? "name contains '" + str + "' and trashed = false" : "name contains '" + str + "' and trashed = false and '" + str2 + "' in parents";
            String nextPageToken = null;
            do {
                FileList fileListExecute = drive.files().list().setQ(str4).setSpaces("drive").setFields2("nextPageToken, files(id, name, mimeType, properties, createdTime, size)").setPageToken(nextPageToken).execute();
                kotlin.jvm.internal.OooOOO0.OooO0o(fileListExecute, "execute(...)");
                FileList fileList = fileListExecute;
                List<File> files = fileList.getFiles();
                if (files == null) {
                    files = C34434OooOoO.f123453OooOo0o;
                }
                List<File> list = files;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                for (File file : list) {
                    String id = file.getId();
                    if (id == null) {
                        id = "";
                        str3 = id;
                    } else {
                        str3 = "";
                    }
                    BackupFile.DiskVendor diskVendor = BackupFile.DiskVendor.GoogleDrive;
                    String name = file.getName();
                    if (name != null) {
                        str3 = name;
                    }
                    boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(file.getMimeType(), "application/vnd.google-apps.folder");
                    DateTime createdTime = file.getCreatedTime();
                    long value = createdTime != null ? createdTime.getValue() : 0L;
                    Long size = file.getSize();
                    long jLongValue = size != null ? size.longValue() : 0L;
                    Map<String, String> properties = file.getProperties();
                    if (properties == null) {
                        properties = C34436OooOoOO.f123455OooOo0o;
                    }
                    arrayList2.add(new BackupFile(id, diskVendor, str3, "", zOooO0O0, value, jLongValue, properties, null));
                }
                arrayList.addAll(arrayList2);
                nextPageToken = fileList.getNextPageToken();
            } while (nextPageToken != null);
            return arrayList;
        } catch (Exception e) {
            throw OooO0oO(e, -999, "An error occurred while searching for files " + e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(String str, BackupInstance backupInstance, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C22910Oooo00O c22910Oooo00O;
        String str2;
        Drive drive;
        C22907OooOooO c22907OooOooO;
        if (abstractC32479OooO0OO instanceof C22910Oooo00O) {
            c22910Oooo00O = (C22910Oooo00O) abstractC32479OooO0OO;
            int i = c22910Oooo00O.f69972OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22910Oooo00O.f69972OooOoo = i - Integer.MIN_VALUE;
            } else {
                c22910Oooo00O = new C22910Oooo00O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c22910Oooo00O.f69971OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22910Oooo00O.f69972OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Drive driveOooO0o0 = OooO0o0();
            if (driveOooO0o0 == null) {
                throw new BackupException("Token is null or empty.", BackupEvent.ERROR_INVALID_TOKEN, null, 4, null);
            }
            c22910Oooo00O.f69968OooOo0o = this;
            c22910Oooo00O.f69967OooOo = str;
            c22910Oooo00O.f69970OooOoO0 = backupInstance;
            c22910Oooo00O.f69969OooOoO = driveOooO0o0;
            c22910Oooo00O.f69972OooOoo = 1;
            Object objOooO0o = OooO0o(driveOooO0o0, backupInstance, c22910Oooo00O);
            if (objOooO0o != enumC32485OooO00o) {
                str2 = str;
                drive = driveOooO0o0;
                obj = objOooO0o;
                c22907OooOooO = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        drive = c22910Oooo00O.f69969OooOoO;
        backupInstance = c22910Oooo00O.f69970OooOoO0;
        str2 = c22910Oooo00O.f69967OooOo;
        c22907OooOooO = c22910Oooo00O.f69968OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        File file = (File) obj;
        if (file == null) {
            throw new BackupException("Couldn't get the instance dir. instance: " + backupInstance, -999, null, 4, null);
        }
        String id = file.getId();
        c22910Oooo00O.f69968OooOo0o = null;
        c22910Oooo00O.f69967OooOo = null;
        c22910Oooo00O.f69970OooOoO0 = null;
        c22910Oooo00O.f69969OooOoO = null;
        c22910Oooo00O.f69972OooOoo = 2;
        c22907OooOooO.getClass();
        ArrayList arrayListOooO0oo = OooO0oo(drive, str2, id);
        return arrayListOooO0oo == enumC32485OooO00o ? enumC32485OooO00o : arrayListOooO0oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C22908OooOooo c22908OooOooo;
        C22907OooOooO c22907OooOooO;
        if (abstractC32479OooO0OO instanceof C22908OooOooo) {
            c22908OooOooo = (C22908OooOooo) abstractC32479OooO0OO;
            int i = c22908OooOooo.f69948OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22908OooOooo.f69948OooOoO = i - Integer.MIN_VALUE;
            } else {
                c22908OooOooo = new C22908OooOooo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c22908OooOooo.f69946OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22908OooOooo.f69948OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33781o00o0O c33781o00o0O = this.f69941OooO0Oo;
            Boolean bool = Boolean.FALSE;
            c22908OooOooo.f69947OooOo0o = this;
            c22908OooOooo.f69948OooOoO = 1;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
            if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c22907OooOooO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22907OooOooO = c22908OooOooo.f69947OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        synchronized (c22907OooOooO.f69939OooO0O0) {
            c22907OooOooO.f69940OooO0OO = null;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        ((GoogleSignInClient) c22907OooOooO.f69942OooO0o.getValue()).signOut();
        return C32460OooOooO.f116667OooO00o;
    }

    public final C32460OooOooO OooO0OO(List list) throws BackupException {
        Drive driveOooO0o0 = OooO0o0();
        if (driveOooO0o0 == null) {
            throw new BackupException("Token is null or empty.", BackupEvent.ERROR_INVALID_TOKEN, null, 4, null);
        }
        try {
            ArrayList<BackupFile> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((BackupFile) obj).getId().length() != 0) {
                    arrayList.add(obj);
                }
            }
            for (BackupFile backupFile : arrayList) {
                driveOooO0o0.files().delete(backupFile.getId()).execute();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("BackupGoogleDriveDatasource");
                c20358OooO00o.OooO00o("delete file. File Name: " + backupFile.getName() + ", File ID: " + backupFile.getId(), new Object[0]);
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Exception e) {
            throw OooO0oO(e, BackupEvent.ERROR_DELETE_FAILED, "An error occurred while deleting the file: " + e);
        }
    }

    public final C32460OooOooO OooO0Oo(BackupFile backupFile, String str) throws Throwable {
        Throwable th;
        Exception exc;
        FileOutputStream fileOutputStream;
        Drive driveOooO0o0 = OooO0o0();
        if (driveOooO0o0 == null) {
            throw new BackupException("Token is null or empty.", BackupEvent.ERROR_INVALID_TOKEN, null, 4, null);
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                java.io.File file = new java.io.File(str);
                C31190OooO0oo.OooO0oO(file);
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e) {
                exc = e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BackupGoogleDriveDatasource");
            c20358OooO00o.OooO00o("start to download File to: " + str, new Object[0]);
            driveOooO0o0.files().get(backupFile.getId()).executeMediaAndDownloadTo(fileOutputStream);
            try {
                fileOutputStream.close();
            } catch (Exception e2) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("BackupGoogleDriveDatasource");
                c20358OooO00o2.OooO0OO(C20593OooO0Oo.OooO0O0("Unable to close output stream: ", e2.getMessage(), "."), new Object[0]);
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Exception e3) {
            exc = e3;
            fileOutputStream2 = fileOutputStream;
            if (exc instanceof GoogleJsonResponseException) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("BackupGoogleDriveDatasource");
                c20358OooO00o3.OooO0OO("Unable to download file from google: " + ((GoogleJsonResponseException) exc).getDetails() + ".", new Object[0]);
            }
            throw OooO0oO(exc, BackupEvent.ERROR_DOWNLOAD_FAILED, "An error occurred while downloading the file: " + exc);
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 == null) {
                throw th;
            }
            try {
                fileOutputStream2.close();
                throw th;
            } catch (Exception e4) {
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("BackupGoogleDriveDatasource");
                c20358OooO00o4.OooO0OO(C20593OooO0Oo.OooO0O0("Unable to close output stream: ", e4.getMessage(), "."), new Object[0]);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(Drive drive, BackupInstance backupInstance, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        Oooo000 oooo000;
        C22907OooOooO c22907OooOooO;
        C22907OooOooO c22907OooOooO2;
        Drive drive2;
        BackupInstance backupInstance2;
        File file;
        if (abstractC32479OooO0OO instanceof Oooo000) {
            oooo000 = (Oooo000) abstractC32479OooO0OO;
            int i = oooo000.f69966OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo000.f69966OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                oooo000 = new Oooo000(this, abstractC32479OooO0OO);
            }
        }
        Object companion = oooo000.f69963OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooo000.f69966OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(companion);
            if (backupInstance == null) {
                BackupInstance.Companion companion2 = BackupInstance.INSTANCE;
                oooo000.f69962OooOo0o = this;
                oooo000.f69961OooOo = drive;
                oooo000.f69966OooOoo0 = 1;
                companion = companion2.getInstance(this.f69938OooO00o, oooo000);
                if (companion != enumC32485OooO00o) {
                    c22907OooOooO2 = this;
                }
            }
            c22907OooOooO = this;
            oooo000.f69962OooOo0o = c22907OooOooO;
            oooo000.f69961OooOo = drive;
            oooo000.f69964OooOoO0 = backupInstance;
            oooo000.f69966OooOoo0 = 2;
            c22907OooOooO.getClass();
            String name = new java.io.File(BackupFile.INSTANCE.getRootDirPath(BackupFile.DiskVendor.GoogleDrive)).getName();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(name);
            companion = OooO0O0(drive, name, "root", C34436OooOoOO.f123455OooOo0o);
            if (companion != enumC32485OooO00o) {
                BackupInstance backupInstance3 = backupInstance;
                drive2 = drive;
                backupInstance2 = backupInstance3;
                file = (File) companion;
                if (file != null) {
                }
                return null;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(companion);
                return companion;
            }
            backupInstance2 = oooo000.f69964OooOoO0;
            drive2 = oooo000.f69961OooOo;
            c22907OooOooO = oooo000.f69962OooOo0o;
            C32446OooOOOo.OooO0O0(companion);
            file = (File) companion;
            if (file != null) {
                Map mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_USER_ID, backupInstance2.getUid()), new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_DEVICE_NAME, backupInstance2.getDeviceName()), new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_APP_INSTANCE_ID, backupInstance2.getGuid()));
                String backupInstanceDirName = backupInstance2.toBackupInstanceDirName();
                String id = file.getId();
                kotlin.jvm.internal.OooOOO0.OooO0o(id, "getId(...)");
                oooo000.f69962OooOo0o = null;
                oooo000.f69961OooOo = null;
                oooo000.f69964OooOoO0 = null;
                oooo000.f69966OooOoo0 = 3;
                c22907OooOooO.getClass();
                Object objOooO0O0 = OooO0O0(drive2, backupInstanceDirName, id, mapOooO0oo);
                return objOooO0O0 == enumC32485OooO00o ? enumC32485OooO00o : objOooO0O0;
            }
            return null;
        }
        drive = oooo000.f69961OooOo;
        c22907OooOooO2 = oooo000.f69962OooOo0o;
        C32446OooOOOo.OooO0O0(companion);
        BackupInstance backupInstance4 = (BackupInstance) companion;
        if (backupInstance4 != null) {
            c22907OooOooO = c22907OooOooO2;
            backupInstance = backupInstance4;
            oooo000.f69962OooOo0o = c22907OooOooO;
            oooo000.f69961OooOo = drive;
            oooo000.f69964OooOoO0 = backupInstance;
            oooo000.f69966OooOoo0 = 2;
            c22907OooOooO.getClass();
            String name2 = new java.io.File(BackupFile.INSTANCE.getRootDirPath(BackupFile.DiskVendor.GoogleDrive)).getName();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(name2);
            companion = OooO0O0(drive, name2, "root", C34436OooOoOO.f123455OooOo0o);
            if (companion != enumC32485OooO00o) {
            }
        }
        return null;
    }

    public final Drive OooO0o0() {
        GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(this.f69938OooO00o);
        if (lastSignedInAccount == null) {
            C33781o00o0O c33781o00o0O = this.f69941OooO0Oo;
            Boolean bool = Boolean.FALSE;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
            return null;
        }
        synchronized (this.f69939OooO0O0) {
            OooO00o oooO00o = this.f69940OooO0OO;
            Drive drive = (oooO00o == null || !oooO00o.f69945OooO0O0.equals(lastSignedInAccount)) ? null : oooO00o.f69944OooO00o;
            if (drive != null) {
                return drive;
            }
            this.f69940OooO0OO = null;
            GoogleAccountCredential googleAccountCredentialUsingOAuth2 = GoogleAccountCredential.usingOAuth2(this.f69938OooO00o, com.facebook.soloader.OooOo.OooO0oO("https://www.googleapis.com/auth/drive.file"));
            googleAccountCredentialUsingOAuth2.setSelectedAccount(lastSignedInAccount.getAccount());
            NetHttpTransport netHttpTransportNewTrustedTransport = GoogleNetHttpTransport.newTrustedTransport();
            GsonFactory gsonFactory = new GsonFactory();
            String string = this.f69938OooO00o.getString(R.string.app_name);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            Drive driveBuild = new Drive.Builder(netHttpTransportNewTrustedTransport, gsonFactory, googleAccountCredentialUsingOAuth2).setApplicationName(string).build();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(driveBuild);
            this.f69940OooO0OO = new OooO00o(driveBuild, lastSignedInAccount);
            return driveBuild;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(BackupFile backupFile, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        Oooo0 oooo0;
        Drive driveOooO0o0;
        java.io.File file;
        C22907OooOooO c22907OooOooO;
        if (abstractC32479OooO0OO instanceof Oooo0) {
            oooo0 = (Oooo0) abstractC32479OooO0OO;
            int i = oooo0.f69959OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo0.f69959OooOoo = i - Integer.MIN_VALUE;
            } else {
                oooo0 = new Oooo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooo0.f69958OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooo0.f69959OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            java.io.File file2 = new java.io.File(backupFile.getPath());
            if (!file2.exists()) {
                throw new BackupException("Content file doesn't exist.", BackupEvent.ERROR_FILE_NOT_EXIST, null, 4, null);
            }
            driveOooO0o0 = OooO0o0();
            if (driveOooO0o0 == null) {
                throw new BackupException("Token is null or empty.", BackupEvent.ERROR_INVALID_TOKEN, null, 4, null);
            }
            oooo0.f69955OooOo0o = this;
            oooo0.f69954OooOo = backupFile;
            oooo0.f69957OooOoO0 = file2;
            oooo0.f69956OooOoO = driveOooO0o0;
            oooo0.f69959OooOoo = 1;
            Object objOooO0o = OooO0o(driveOooO0o0, null, oooo0);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            file = file2;
            obj = objOooO0o;
            c22907OooOooO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Drive drive = oooo0.f69956OooOoO;
            file = oooo0.f69957OooOoO0;
            BackupFile backupFile2 = oooo0.f69954OooOo;
            c22907OooOooO = oooo0.f69955OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            driveOooO0o0 = drive;
            backupFile = backupFile2;
        }
        File file3 = (File) obj;
        if (file3 == null) {
            throw new BackupException("Couldn't get the root dir.", -999, null, 4, null);
        }
        LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO(backupFile.getContentProperties());
        Map<String, String> properties = file3.getProperties();
        kotlin.jvm.internal.OooOOO0.OooO0o(properties, "getProperties(...)");
        Properties properties2 = new Properties();
        properties2.putAll(properties);
        if (properties2.containsKey(BackupFile.FILE_PROPERTY_CONTENT_USER_ID)) {
            linkedHashMapOooOOOO.put(BackupFile.FILE_PROPERTY_CONTENT_USER_ID, properties2.getProperty(BackupFile.FILE_PROPERTY_CONTENT_USER_ID));
        }
        if (properties2.containsKey(BackupFile.FILE_PROPERTY_CONTENT_DEVICE_NAME)) {
            linkedHashMapOooOOOO.put(BackupFile.FILE_PROPERTY_CONTENT_DEVICE_NAME, properties2.getProperty(BackupFile.FILE_PROPERTY_CONTENT_DEVICE_NAME));
        }
        if (properties2.containsKey(BackupFile.FILE_PROPERTY_CONTENT_APP_INSTANCE_ID)) {
            linkedHashMapOooOOOO.put(BackupFile.FILE_PROPERTY_CONTENT_APP_INSTANCE_ID, properties2.getProperty(BackupFile.FILE_PROPERTY_CONTENT_APP_INSTANCE_ID));
        }
        File file4 = new File();
        String name = backupFile.getName();
        c22907OooOooO.getClass();
        java.io.File file5 = new java.io.File(name);
        File properties3 = file4.setName(f69937OooO0oO.OooO0OO(C32501OooO0oO.OooO0o(file5), C18115b5.CONNECTOR) + "." + C32501OooO0oO.OooO0o0(file5)).setParents(com.facebook.soloader.OooOo.OooO0oO(file3.getId())).setProperties(linkedHashMapOooOOOO);
        try {
            File fileExecute = driveOooO0o0.files().create(properties3, new FileContent("application/octet-stream", file)).setFields2("id, parents").execute();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BackupGoogleDriveDatasource");
            c20358OooO00o.OooO00o("Upload file. File Name: " + properties3.getName() + ", File ID: " + fileExecute.getId(), new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        } catch (Exception e) {
            throw OooO0oO(e, BackupEvent.ERROR_UPLOAD_FAILED, "Upload file failed! File Name: " + properties3.getName() + ". " + e);
        }
    }

    public final Object OooOO0O(C22922OoooOO0 c22922OoooOO0) {
        int iOrdinal = BackupFile.DiskVendor.GoogleDrive.ordinal();
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f69938OooO00o;
        GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(abstractApplicationC26277OooOoOO);
        Scope scope = new Scope("https://www.googleapis.com/auth/drive.file");
        if (lastSignedInAccount == null || !lastSignedInAccount.getGrantedScopes().contains(scope)) {
            Intent intent = new Intent(abstractApplicationC26277OooOoOO, (Class<?>) NetDiskAuthorizeActivity.class);
            intent.setFlags(WarningType.HINT);
            intent.putExtra("vendor_id", iOrdinal);
            abstractApplicationC26277OooOoOO.startActivity(intent);
            return C32460OooOooO.f116667OooO00o;
        }
        Object objOooO00o = C24332OooO.OooO00o(C28051OooO00o.OooO00o(abstractApplicationC26277OooOoOO), new C22911Oooo00o(iOrdinal, null), c22922OoooOO0);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }
}
