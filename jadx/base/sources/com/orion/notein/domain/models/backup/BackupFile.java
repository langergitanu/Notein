package com.orion.notein.domain.models.backup;

import OooO.OooO00o;
import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import com.huawei.agconnect.credential.obs.C17625c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32450OooOo;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 92\u00020\u0001:\u0002:9BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"Jl\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0016J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b\t\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b6\u0010\u001eR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u0010\"¨\u0006;"}, m80612d2 = {"Lcom/orion/notein/domain/models/backup/BackupFile;", "", "", "id", "Lcom/orion/notein/domain/models/backup/BackupFile$DiskVendor;", "diskVendor", "name", "path", "", "isDir", "", C17625c.f52155b, "LoO00ooO/OooOo;", "size", "", "contentProperties", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/backup/BackupFile$DiskVendor;Ljava/lang/String;Ljava/lang/String;ZJJLjava/util/Map;Lkotlin/jvm/internal/OooO0oo;)V", "Lcom/orion/notein/domain/models/backup/BackupInstance;", "getInstance", "()Lcom/orion/notein/domain/models/backup/BackupInstance;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/orion/notein/domain/models/backup/BackupFile$DiskVendor;", "component3", "component4", "component5", "()Z", "component6", "()J", "component7-s-VKNKU", "component7", "component8", "()Ljava/util/Map;", "copy-6Gl7pMQ", "(Ljava/lang/String;Lcom/orion/notein/domain/models/backup/BackupFile$DiskVendor;Ljava/lang/String;Ljava/lang/String;ZJJLjava/util/Map;)Lcom/orion/notein/domain/models/backup/BackupFile;", "copy", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/orion/notein/domain/models/backup/BackupFile$DiskVendor;", "getDiskVendor", "getName", "getPath", "Z", "J", "getCreationTime", "getSize-s-VKNKU", "Ljava/util/Map;", "getContentProperties", "Companion", "DiskVendor", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class BackupFile {
    private static final String BAIDU_STORAGE_ROOT_DIR = "/apps/Notein";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String EXTENSION_FOLDER_TREE_FILE = "tree";
    public static final String EXTENSION_NOTEIN_FILE = "in";
    public static final String EXTENSION_TEMPLATE_FILE = "template";
    public static final String FILE_CONTENT_TYPE_FOLDER_TREE = "folder_tree";
    public static final String FILE_CONTENT_TYPE_NOTE = "note";
    public static final String FILE_CONTENT_TYPE_TEMPLATE = "template";
    public static final String FILE_PROPERTY_CONTENT_APP_INSTANCE_ID = "content_app_instance_id";
    public static final String FILE_PROPERTY_CONTENT_CHECKSUM = "content_checksum";
    public static final String FILE_PROPERTY_CONTENT_DEVICE_NAME = "content_device_name";
    public static final String FILE_PROPERTY_CONTENT_ID = "content_id";
    public static final String FILE_PROPERTY_CONTENT_TYPE = "content_type";
    public static final String FILE_PROPERTY_CONTENT_USER_ID = "content_user_id";
    public static final String FILE_PROPERTY_LOCAL_BACKUP_INSTANCE_URI = "local_backup_instance_uri";
    private static final String GOOGLE_DRIVE_STORAGE_ROOT_DIR = "/Notein";
    public static final String PREFIX_FOLDER_TREE_DIR = "folder_tree";
    public static final String PREFIX_NOTE_DIR = "n";
    public static final String PREFIX_TEMPLATE_DIR = "template";
    private final Map<String, String> contentProperties;
    private final long creationTime;
    private final DiskVendor diskVendor;
    private final String id;
    private final boolean isDir;
    private final String name;
    private final String path;
    private final long size;

    @Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/domain/models/backup/BackupFile$Companion;", "", "<init>", "()V", "EXTENSION_NOTEIN_FILE", "", "EXTENSION_TEMPLATE_FILE", "EXTENSION_FOLDER_TREE_FILE", "BAIDU_STORAGE_ROOT_DIR", "GOOGLE_DRIVE_STORAGE_ROOT_DIR", "FILE_PROPERTY_CONTENT_ID", "FILE_PROPERTY_CONTENT_TYPE", "FILE_PROPERTY_CONTENT_CHECKSUM", "FILE_PROPERTY_CONTENT_USER_ID", "FILE_PROPERTY_CONTENT_DEVICE_NAME", "FILE_PROPERTY_CONTENT_APP_INSTANCE_ID", "FILE_CONTENT_TYPE_NOTE", "FILE_CONTENT_TYPE_TEMPLATE", "FILE_CONTENT_TYPE_FOLDER_TREE", "FILE_PROPERTY_LOCAL_BACKUP_INSTANCE_URI", "PREFIX_NOTE_DIR", "PREFIX_TEMPLATE_DIR", "PREFIX_FOLDER_TREE_DIR", "getRootDirPath", "diskVendor", "Lcom/orion/notein/domain/models/backup/BackupFile$DiskVendor;", "getDiskVendorByName", "name", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {

        @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DiskVendor.values().length];
                try {
                    iArr[DiskVendor.Baidu.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DiskVendor.GoogleDrive.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final DiskVendor getDiskVendorByName(String name) {
            OooOOO0.OooO0oO(name, "name");
            try {
                return DiskVendor.valueOf(name);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String getRootDirPath(DiskVendor diskVendor) {
            OooOOO0.OooO0oO(diskVendor, "diskVendor");
            int i = WhenMappings.$EnumSwitchMapping$0[diskVendor.ordinal()];
            return i != 1 ? i != 2 ? "" : BackupFile.GOOGLE_DRIVE_STORAGE_ROOT_DIR : BackupFile.BAIDU_STORAGE_ROOT_DIR;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/backup/BackupFile$DiskVendor;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Local", "Baidu", "GoogleDrive", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class DiskVendor {
        private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
        private static final /* synthetic */ DiskVendor[] $VALUES;
        public static final DiskVendor None = new DiskVendor("None", 0);
        public static final DiskVendor Local = new DiskVendor("Local", 1);
        public static final DiskVendor Baidu = new DiskVendor("Baidu", 2);
        public static final DiskVendor GoogleDrive = new DiskVendor("GoogleDrive", 3);

        private static final /* synthetic */ DiskVendor[] $values() {
            return new DiskVendor[]{None, Local, Baidu, GoogleDrive};
        }

        static {
            DiskVendor[] diskVendorArr$values = $values();
            $VALUES = diskVendorArr$values;
            $ENTRIES = OooO00o.OooO0O0(diskVendorArr$values);
        }

        private DiskVendor(String str, int i) {
        }

        public static InterfaceC34452OooO00o<DiskVendor> getEntries() {
            return $ENTRIES;
        }

        public static DiskVendor valueOf(String str) {
            return (DiskVendor) Enum.valueOf(DiskVendor.class, str);
        }

        public static DiskVendor[] values() {
            return (DiskVendor[]) $VALUES.clone();
        }
    }

    public /* synthetic */ BackupFile(String str, DiskVendor diskVendor, String str2, String str3, boolean z, long j, long j2, Map map, C24018OooO0oo c24018OooO0oo) {
        this(str, diskVendor, str2, str3, z, j, j2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-6Gl7pMQ$default, reason: not valid java name */
    public static /* synthetic */ BackupFile m80736copy6Gl7pMQ$default(BackupFile backupFile, String str, DiskVendor diskVendor, String str2, String str3, boolean z, long j, long j2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = backupFile.id;
        }
        if ((i & 2) != 0) {
            diskVendor = backupFile.diskVendor;
        }
        if ((i & 4) != 0) {
            str2 = backupFile.name;
        }
        if ((i & 8) != 0) {
            str3 = backupFile.path;
        }
        if ((i & 16) != 0) {
            z = backupFile.isDir;
        }
        if ((i & 32) != 0) {
            j = backupFile.creationTime;
        }
        if ((i & 64) != 0) {
            j2 = backupFile.size;
        }
        if ((i & 128) != 0) {
            map = backupFile.contentProperties;
        }
        Map map2 = map;
        long j3 = j2;
        long j4 = j;
        boolean z2 = z;
        String str4 = str2;
        return backupFile.m80738copy6Gl7pMQ(str, diskVendor, str4, str3, z2, j4, j3, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DiskVendor getDiskVendor() {
        return this.diskVendor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsDir() {
        return this.isDir;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component7-s-VKNKU, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    public final Map<String, String> component8() {
        return this.contentProperties;
    }

    /* JADX INFO: renamed from: copy-6Gl7pMQ, reason: not valid java name */
    public final BackupFile m80738copy6Gl7pMQ(String id, DiskVendor diskVendor, String name, String path, boolean isDir, long creationTime, long size, Map<String, String> contentProperties) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(diskVendor, "diskVendor");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(path, "path");
        OooOOO0.OooO0oO(contentProperties, "contentProperties");
        return new BackupFile(id, diskVendor, name, path, isDir, creationTime, size, contentProperties, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackupFile)) {
            return false;
        }
        BackupFile backupFile = (BackupFile) other;
        return OooOOO0.OooO0O0(this.id, backupFile.id) && this.diskVendor == backupFile.diskVendor && OooOOO0.OooO0O0(this.name, backupFile.name) && OooOOO0.OooO0O0(this.path, backupFile.path) && this.isDir == backupFile.isDir && this.creationTime == backupFile.creationTime && this.size == backupFile.size && OooOOO0.OooO0O0(this.contentProperties, backupFile.contentProperties);
    }

    public final Map<String, String> getContentProperties() {
        return this.contentProperties;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final DiskVendor getDiskVendor() {
        return this.diskVendor;
    }

    public final String getId() {
        return this.id;
    }

    public final BackupInstance getInstance() {
        Map<String, String> map = this.contentProperties;
        String str = map.get(FILE_PROPERTY_CONTENT_USER_ID);
        String str2 = map.get(FILE_PROPERTY_CONTENT_DEVICE_NAME);
        String str3 = map.get(FILE_PROPERTY_CONTENT_APP_INSTANCE_ID);
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) {
            return null;
        }
        return new BackupInstance(str3, str, str2);
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: getSize-s-VKNKU, reason: not valid java name */
    public final long m80739getSizesVKNKU() {
        return this.size;
    }

    public int hashCode() {
        return this.contentProperties.hashCode() + C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.diskVendor.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.name), 31, this.path), 31, this.isDir), 31, this.creationTime), 31, this.size);
    }

    public final boolean isDir() {
        return this.isDir;
    }

    public String toString() {
        String str = this.id;
        DiskVendor diskVendor = this.diskVendor;
        String str2 = this.name;
        String str3 = this.path;
        boolean z = this.isDir;
        long j = this.creationTime;
        String strOooO00o = C32450OooOo.OooO00o(this.size);
        Map<String, String> map = this.contentProperties;
        StringBuilder sb = new StringBuilder("BackupFile(id=");
        sb.append(str);
        sb.append(", diskVendor=");
        sb.append(diskVendor);
        sb.append(", name=");
        OooO0OO.OooO0o0(sb, str2, ", path=", str3, ", isDir=");
        sb.append(z);
        sb.append(", creationTime=");
        sb.append(j);
        sb.append(", size=");
        sb.append(strOooO00o);
        sb.append(", contentProperties=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    private BackupFile(String id, DiskVendor diskVendor, String name, String path, boolean z, long j, long j2, Map<String, String> contentProperties) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(diskVendor, "diskVendor");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(path, "path");
        OooOOO0.OooO0oO(contentProperties, "contentProperties");
        this.id = id;
        this.diskVendor = diskVendor;
        this.name = name;
        this.path = path;
        this.isDir = z;
        this.creationTime = j;
        this.size = j2;
        this.contentProperties = contentProperties;
    }
}
