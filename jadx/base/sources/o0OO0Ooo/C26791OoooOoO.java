package o0OO0Ooo;

import Oooo0oO.o0Oo0oo;
import com.aspose.slides.C22227OoooO;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.util.DateTime;
import com.google.api.services.drive.model.About;
import com.google.api.services.drive.model.Change;
import com.google.api.services.drive.model.File;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import com.orion.notein.data.p602db.entity.cloudsync.DriveSnapshotCacheEntity;
import com.orion.notein.domain.models.cloud.NoteCloudQuota;
import com.orion.notein.domain.models.cloudsync.CloudAuthRequest;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.domain.models.cloudsync.CloudMime;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteHistoryVersion;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.global.R;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24340OooO0oo;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0Oo.EnumC27285OooO;
import o0OOooO0.C27904OooOo;
import o0OOooO0.o00000;
import o0OOooO0.o00000O;
import o0OOooO0.o00000O0;
import o0Oo00o.C28028OooO0o;
import o0Oo0O00.C28051OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33596OooOOo0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33737OooOo00;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0OO0Ooo.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26791OoooOoO implements o00000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f92647OooO = C24340OooO0oo.OooO0o0("google_drive_sync_cursor");

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f92648OooOO0 = C24340OooO0oo.OooO0o0("google_drive_new_quota");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f92649OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C26773Oooo0 f92650OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C26759OooOOoo f92651OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final EnumC27285OooO f92652OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f92653OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33898OooO0Oo f92654OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33898OooO0Oo f92655OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f92656OooO0oo;

    /* JADX INFO: renamed from: o0OO0Ooo.OoooOoO$OooO00o */
    public static final class OooO00o implements InterfaceC33721OooO0o<NoteCloudQuota> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f92657OooOo0o;

        /* JADX INFO: renamed from: o0OO0Ooo.OoooOoO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19814OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f92658OooOo0o;

            /* JADX INFO: renamed from: o0OO0Ooo.OoooOoO$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.google.GoogleDriveSyncBackend$getCloudQuotaFlow$$inlined$map$1$2", m80623f = "GoogleDriveSyncBackend.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19815OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f92659OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f92660OooOo0o;

                public C19815OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f92660OooOo0o = obj;
                    this.f92659OooOo |= Integer.MIN_VALUE;
                    return C19814OooO00o.this.emit(null, this);
                }
            }

            public C19814OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f92658OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19815OooO00o c19815OooO00o;
                if (continuation instanceof C19815OooO00o) {
                    c19815OooO00o = (C19815OooO00o) continuation;
                    int i = c19815OooO00o.f92659OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19815OooO00o.f92659OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19815OooO00o = new C19815OooO00o(continuation);
                    }
                }
                Object obj2 = c19815OooO00o.f92660OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19815OooO00o.f92659OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(C26791OoooOoO.f92648OooOO0);
                    NoteCloudQuota noteCloudQuota = (str == null || str.length() == 0) ? null : (NoteCloudQuota) C28028OooO0o.OooO00o().fromJson(str, (Class) NoteCloudQuota.class);
                    c19815OooO00o.f92659OooOo = 1;
                    if (this.f92658OooOo0o.emit(noteCloudQuota, c19815OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO00o(InterfaceC33721OooO0o interfaceC33721OooO0o) {
            this.f92657OooOo0o = interfaceC33721OooO0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super NoteCloudQuota> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f92657OooOo0o.collect(new C19814OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    public C26791OoooOoO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, C26773Oooo0 sessionManager, C26759OooOOoo cloudService) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sessionManager, "sessionManager");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudService, "cloudService");
        this.f92649OooO00o = abstractApplicationC26277OooOoOO;
        this.f92650OooO0O0 = sessionManager;
        this.f92651OooO0OO = cloudService;
        this.f92652OooO0Oo = EnumC27285OooO.f95079OooOoOO;
        this.f92654OooO0o0 = C33900OooO0o0.OooO00o();
        this.f92655OooO0oO = C33900OooO0o0.OooO00o();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DriveSnapshotCacheEntity OooOoOO(String str, File file) {
        String str2;
        String str3;
        DateTime modifiedTime;
        long j;
        long value;
        int iHashCode;
        Long lOooOOO;
        String id = file.getId();
        String noteId = null;
        if (id == null) {
            return null;
        }
        Map<String, String> properties = file.getProperties();
        if (properties == null) {
            properties = C34436OooOoOO.f123455OooOo0o;
        }
        String mimeType = properties.get("mimeType");
        if (mimeType == null) {
            mimeType = file.getMimeType();
        }
        if (mimeType != null) {
            int iHashCode2 = mimeType.hashCode();
            if (iHashCode2 != -2039968287) {
                if (iHashCode2 != -1214862943) {
                    if (iHashCode2 == -956902466 && mimeType.equals("application/vnd.notein-apps.folders")) {
                        str2 = CloudMime.FOLDER;
                        DateTime createdTime = file.getCreatedTime();
                        long value2 = createdTime != null ? createdTime.getValue() : 0L;
                        str3 = properties.get(NoteMeta.PROPERTY_LAST_MODIFICATION_TIME);
                        if (str3 == null || (lOooOOO = C33596OooOOo0.OooOOO(str3)) == null) {
                            modifiedTime = file.getModifiedTime();
                            if (modifiedTime != null) {
                                j = 0;
                                String str4 = properties.get(NoteMeta.PROPERTY_NOTE_ID);
                                String str5 = properties.get(Folder.PROPERTY_FOLDER_ID);
                                String str6 = properties.get(MyTemplate.PROPERTY_TEMPLATE_ID);
                                String str7 = properties.get(NoteMeta.PROPERTY_PARENT_ID);
                                String str8 = properties.get(NoteMeta.PROPERTY_FAVORITE);
                                Boolean boolValueOf = str8 == null ? Boolean.valueOf(Boolean.parseBoolean(str8)) : null;
                                String str9 = properties.get(NoteMeta.PROPERTY_TITLE);
                                String str10 = properties.get(NoteMeta.PROPERTY_IN_TRASH_BIN);
                                Boolean boolValueOf2 = str10 == null ? Boolean.valueOf(Boolean.parseBoolean(str10)) : null;
                                String str11 = properties.get("dbVersion");
                                Integer numOooOOO0 = str11 == null ? C33596OooOOo0.OooOOO0(str11) : null;
                                String str12 = properties.get("sortKey");
                                Integer numOooOOO02 = str12 == null ? C33596OooOOo0.OooOOO0(str12) : null;
                                String str13 = properties.get("usingOwnPdf");
                                Boolean boolValueOf3 = str13 == null ? Boolean.valueOf(Boolean.parseBoolean(str13)) : null;
                                String str14 = properties.get("lockAdded");
                                CloudMetaExtra cloudMetaExtra = new CloudMetaExtra(str4, str6, str5, Long.valueOf(j), str7, boolValueOf, str9, boolValueOf2, str2, (Long) null, Long.valueOf(value2), Long.valueOf(j), numOooOOO0, numOooOOO02, boolValueOf3, str14 == null ? Boolean.valueOf(Boolean.parseBoolean(str14)) : null, (String) null, 66048, (C24018OooO0oo) null);
                                String str15 = str2;
                                iHashCode = str15.hashCode();
                                if (iHashCode == 393630974) {
                                    if (iHashCode != 1600536058) {
                                        if (iHashCode == 1883341446 && str15.equals(CloudMime.TEMPLATE)) {
                                            noteId = cloudMetaExtra.getTemplateId();
                                        }
                                    } else if (str15.equals(CloudMime.FOLDER)) {
                                        noteId = cloudMetaExtra.getFolderId();
                                    }
                                } else if (str15.equals(CloudMime.NOTE)) {
                                    noteId = cloudMetaExtra.getNoteId();
                                }
                                String str16 = noteId;
                                long j2 = j;
                                CloudContentTag cloudContentTag = new CloudContentTag(file.getSha256Checksum(), (String) null, j2, 2, (C24018OooO0oo) null);
                                Long size = file.getSize();
                                long jLongValue = size == null ? size.longValue() : 0L;
                                Boolean trashed = file.getTrashed();
                                boolean zBooleanValue = trashed != null ? trashed.booleanValue() : false;
                                DateTime trashedTime = file.getTrashedTime();
                                return new DriveSnapshotCacheEntity(id, str, str16, str15, cloudContentTag, cloudMetaExtra, jLongValue, value2, j2, zBooleanValue, trashedTime != null ? trashedTime.getValue() : 0L);
                            }
                            value = modifiedTime.getValue();
                        } else {
                            long jLongValue2 = lOooOOO.longValue();
                            if (jLongValue2 <= 10000000000L) {
                                jLongValue2 *= (long) 1000;
                            }
                            long j3 = 1000;
                            value = (jLongValue2 / j3) * j3;
                        }
                        j = value;
                        String str42 = properties.get(NoteMeta.PROPERTY_NOTE_ID);
                        String str52 = properties.get(Folder.PROPERTY_FOLDER_ID);
                        String str62 = properties.get(MyTemplate.PROPERTY_TEMPLATE_ID);
                        String str72 = properties.get(NoteMeta.PROPERTY_PARENT_ID);
                        String str82 = properties.get(NoteMeta.PROPERTY_FAVORITE);
                        if (str82 == null) {
                        }
                        String str92 = properties.get(NoteMeta.PROPERTY_TITLE);
                        String str102 = properties.get(NoteMeta.PROPERTY_IN_TRASH_BIN);
                        if (str102 == null) {
                        }
                        String str112 = properties.get("dbVersion");
                        if (str112 == null) {
                        }
                        String str122 = properties.get("sortKey");
                        if (str122 == null) {
                        }
                        String str132 = properties.get("usingOwnPdf");
                        if (str132 == null) {
                        }
                        String str142 = properties.get("lockAdded");
                        CloudMetaExtra cloudMetaExtra2 = new CloudMetaExtra(str42, str62, str52, Long.valueOf(j), str72, boolValueOf, str92, boolValueOf2, str2, (Long) null, Long.valueOf(value2), Long.valueOf(j), numOooOOO0, numOooOOO02, boolValueOf3, str142 == null ? Boolean.valueOf(Boolean.parseBoolean(str142)) : null, (String) null, 66048, (C24018OooO0oo) null);
                        String str152 = str2;
                        iHashCode = str152.hashCode();
                        if (iHashCode == 393630974) {
                        }
                        String str162 = noteId;
                        long j22 = j;
                        CloudContentTag cloudContentTag2 = new CloudContentTag(file.getSha256Checksum(), (String) null, j22, 2, (C24018OooO0oo) null);
                        Long size2 = file.getSize();
                        if (size2 == null) {
                        }
                        Boolean trashed2 = file.getTrashed();
                        boolean zBooleanValue2 = trashed2 != null ? trashed2.booleanValue() : false;
                        DateTime trashedTime2 = file.getTrashedTime();
                        return new DriveSnapshotCacheEntity(id, str, str162, str152, cloudContentTag2, cloudMetaExtra2, jLongValue, value2, j22, zBooleanValue2, trashedTime2 != null ? trashedTime2.getValue() : 0L);
                    }
                } else if (mimeType.equals("application/vnd.notein-apps.template")) {
                    str2 = CloudMime.TEMPLATE;
                    DateTime createdTime2 = file.getCreatedTime();
                    if (createdTime2 != null) {
                    }
                    str3 = properties.get(NoteMeta.PROPERTY_LAST_MODIFICATION_TIME);
                    if (str3 == null) {
                        modifiedTime = file.getModifiedTime();
                        if (modifiedTime != null) {
                        }
                    }
                    String str422 = properties.get(NoteMeta.PROPERTY_NOTE_ID);
                    String str522 = properties.get(Folder.PROPERTY_FOLDER_ID);
                    String str622 = properties.get(MyTemplate.PROPERTY_TEMPLATE_ID);
                    String str722 = properties.get(NoteMeta.PROPERTY_PARENT_ID);
                    String str822 = properties.get(NoteMeta.PROPERTY_FAVORITE);
                    if (str822 == null) {
                    }
                    String str922 = properties.get(NoteMeta.PROPERTY_TITLE);
                    String str1022 = properties.get(NoteMeta.PROPERTY_IN_TRASH_BIN);
                    if (str1022 == null) {
                    }
                    String str1122 = properties.get("dbVersion");
                    if (str1122 == null) {
                    }
                    String str1222 = properties.get("sortKey");
                    if (str1222 == null) {
                    }
                    String str1322 = properties.get("usingOwnPdf");
                    if (str1322 == null) {
                    }
                    String str1422 = properties.get("lockAdded");
                    CloudMetaExtra cloudMetaExtra22 = new CloudMetaExtra(str422, str622, str522, Long.valueOf(j), str722, boolValueOf, str922, boolValueOf2, str2, (Long) null, Long.valueOf(value2), Long.valueOf(j), numOooOOO0, numOooOOO02, boolValueOf3, str1422 == null ? Boolean.valueOf(Boolean.parseBoolean(str1422)) : null, (String) null, 66048, (C24018OooO0oo) null);
                    String str1522 = str2;
                    iHashCode = str1522.hashCode();
                    if (iHashCode == 393630974) {
                    }
                    String str1622 = noteId;
                    long j222 = j;
                    CloudContentTag cloudContentTag22 = new CloudContentTag(file.getSha256Checksum(), (String) null, j222, 2, (C24018OooO0oo) null);
                    Long size22 = file.getSize();
                    if (size22 == null) {
                    }
                    Boolean trashed22 = file.getTrashed();
                    boolean zBooleanValue22 = trashed22 != null ? trashed22.booleanValue() : false;
                    DateTime trashedTime22 = file.getTrashedTime();
                    return new DriveSnapshotCacheEntity(id, str, str1622, str1522, cloudContentTag22, cloudMetaExtra22, jLongValue, value2, j222, zBooleanValue22, trashedTime22 != null ? trashedTime22.getValue() : 0L);
                }
            } else if (mimeType.equals("application/vnd.notein-apps.dbfile")) {
                str2 = CloudMime.NOTE;
                DateTime createdTime22 = file.getCreatedTime();
                if (createdTime22 != null) {
                }
                str3 = properties.get(NoteMeta.PROPERTY_LAST_MODIFICATION_TIME);
                if (str3 == null) {
                }
                String str4222 = properties.get(NoteMeta.PROPERTY_NOTE_ID);
                String str5222 = properties.get(Folder.PROPERTY_FOLDER_ID);
                String str6222 = properties.get(MyTemplate.PROPERTY_TEMPLATE_ID);
                String str7222 = properties.get(NoteMeta.PROPERTY_PARENT_ID);
                String str8222 = properties.get(NoteMeta.PROPERTY_FAVORITE);
                if (str8222 == null) {
                }
                String str9222 = properties.get(NoteMeta.PROPERTY_TITLE);
                String str10222 = properties.get(NoteMeta.PROPERTY_IN_TRASH_BIN);
                if (str10222 == null) {
                }
                String str11222 = properties.get("dbVersion");
                if (str11222 == null) {
                }
                String str12222 = properties.get("sortKey");
                if (str12222 == null) {
                }
                String str13222 = properties.get("usingOwnPdf");
                if (str13222 == null) {
                }
                String str14222 = properties.get("lockAdded");
                CloudMetaExtra cloudMetaExtra222 = new CloudMetaExtra(str4222, str6222, str5222, Long.valueOf(j), str7222, boolValueOf, str9222, boolValueOf2, str2, (Long) null, Long.valueOf(value2), Long.valueOf(j), numOooOOO0, numOooOOO02, boolValueOf3, str14222 == null ? Boolean.valueOf(Boolean.parseBoolean(str14222)) : null, (String) null, 66048, (C24018OooO0oo) null);
                String str15222 = str2;
                iHashCode = str15222.hashCode();
                if (iHashCode == 393630974) {
                }
                String str16222 = noteId;
                long j2222 = j;
                CloudContentTag cloudContentTag222 = new CloudContentTag(file.getSha256Checksum(), (String) null, j2222, 2, (C24018OooO0oo) null);
                Long size222 = file.getSize();
                if (size222 == null) {
                }
                Boolean trashed222 = file.getTrashed();
                boolean zBooleanValue222 = trashed222 != null ? trashed222.booleanValue() : false;
                DateTime trashedTime222 = file.getTrashedTime();
                return new DriveSnapshotCacheEntity(id, str, str16222, str15222, cloudContentTag222, cloudMetaExtra222, jLongValue, value2, j2222, zBooleanValue222, trashedTime222 != null ? trashedTime222.getValue() : 0L);
            }
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOO0O(androidx.concurrent.futures.OooO00o.OooO0OO(C22227OoooO.OooO00o(c20358OooO00o, "GoogleDriveBackend", "Unknown mimeType field '", mimeType, "' for file "), id, ", treating as unknown"), new Object[0]);
        return null;
    }

    @Override // o0OOooO0.o00000
    public final Serializable OooO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        try {
            GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(this.f92650OooO0O0.f92580OooO00o);
            String email = lastSignedInAccount != null ? lastSignedInAccount.getEmail() : null;
            if (email != null) {
                return email;
            }
            throw new IllegalStateException("Google Drive not authorized, no session id");
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    @Override // o0OOooO0.o00000
    public final InterfaceC33721OooO0o<NoteCloudQuota> OooO00o() {
        return new OooO00o(C28051OooO00o.OooO00o(this.f92649OooO00o).getData());
    }

    @Override // o0OOooO0.o00000
    public final InterfaceC33721OooO0o<Boolean> OooO0O0() {
        C26773Oooo0 c26773Oooo0 = this.f92650OooO0O0;
        return new C26770OooOooO(new C33737OooOo00(new C26771OooOooo(c26773Oooo0, null), c26773Oooo0.f92581OooO0O0.getData()), c26773Oooo0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26789OoooOOo c26789OoooOOo;
        C26791OoooOoO c26791OoooOoO;
        Long usage;
        Long limit;
        if (abstractC32479OooO0OO instanceof C26789OoooOOo) {
            c26789OoooOOo = (C26789OoooOOo) abstractC32479OooO0OO;
            int i = c26789OoooOOo.f92643OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26789OoooOOo.f92643OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26789OoooOOo = new C26789OoooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c26789OoooOOo.f92641OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26789OoooOOo.f92643OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                C26759OooOOoo c26759OooOOoo = this.f92651OooO0OO;
                c26789OoooOOo.f92642OooOo0o = this;
                c26789OoooOOo.f92643OooOoO = 1;
                objOooO0Oo = c26759OooOOoo.OooO0Oo(c26789OoooOOo);
                if (objOooO0Oo != enumC32485OooO00o) {
                    c26791OoooOoO = this;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    NoteCloudQuota noteCloudQuota = (NoteCloudQuota) c26789OoooOOo.f92642OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0Oo);
                    return noteCloudQuota;
                }
                c26791OoooOoO = (C26791OoooOoO) c26789OoooOOo.f92642OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
            }
            About.StorageQuota storageQuota = ((About) objOooO0Oo).getStorageQuota();
            long jLongValue = 0;
            long jLongValue2 = (storageQuota == null || (limit = storageQuota.getLimit()) == null) ? 0L : limit.longValue();
            if (storageQuota != null && (usage = storageQuota.getUsage()) != null) {
                jLongValue = usage.longValue();
            }
            NoteCloudQuota noteCloudQuota2 = new NoteCloudQuota(jLongValue2, jLongValue);
            String json = C28028OooO0o.OooO00o().toJson(noteCloudQuota2);
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO0OooO00o = C28051OooO00o.OooO00o(c26791OoooOoO.f92649OooO00o);
            C26790OoooOo0 c26790OoooOo0 = new C26790OoooOo0(json, null);
            c26789OoooOOo.f92642OooOo0o = noteCloudQuota2;
            c26789OoooOOo.f92643OooOoO = 2;
            return C24332OooO.OooO00o(oooOO0OooO00o, c26790OoooOo0, c26789OoooOOo) == enumC32485OooO00o ? enumC32485OooO00o : noteCloudQuota2;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x009a, code lost:
    
        if (r6.OooO0Oo(r0) == r1) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0Oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26780Oooo0o0 c26780Oooo0o0;
        Serializable serializableOooO00o;
        C26791OoooOoO c26791OoooOoO;
        Object objOooO0Oo;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C26780Oooo0o0) {
            c26780Oooo0o0 = (C26780Oooo0o0) abstractC32479OooO0OO;
            int i = c26780Oooo0o0.f92610OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26780Oooo0o0.f92610OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26780Oooo0o0 = new C26780Oooo0o0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26780Oooo0o0.f92608OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26780Oooo0o0.f92610OooOoO;
        try {
        } catch (Throwable th) {
            serializableOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            try {
                C26773Oooo0 c26773Oooo0 = this.f92650OooO0O0;
                c26780Oooo0o0.f92609OooOo0o = this;
                c26780Oooo0o0.f92610OooOoO = 1;
                objOooO0Oo = c26773Oooo0.OooO0Oo();
                if (objOooO0Oo != enumC32485OooO00o) {
                    c26791OoooOoO = this;
                }
            } catch (Throwable th2) {
                th = th2;
                c26791OoooOoO = this;
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            serializableOooO00o = Boolean.TRUE;
            return serializableOooO00o;
        }
        c26791OoooOoO = c26780Oooo0o0.f92609OooOo0o;
        try {
            C32446OooOOOo.OooO0O0(obj);
            objOooO0Oo = ((C32445OooOOOO) obj).f116639OooOo0o;
        } catch (Throwable th3) {
            th = th3;
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        C32446OooOOOo.OooO0O0(objOooO0Oo);
        objOooO00o = C32460OooOooO.f116667OooO00o;
        if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (!(thOooO00o instanceof ConnectException) && !(thOooO00o instanceof NoRouteToHostException) && !(thOooO00o instanceof SocketTimeoutException) && !(thOooO00o instanceof SocketException) && !(thOooO00o instanceof UnknownHostException) && !(thOooO00o instanceof ProtocolException) && !(thOooO00o instanceof SSLException)) {
                return Boolean.FALSE;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            return C32446OooOOOo.OooO00o(thOooO00o);
        }
        C26759OooOOoo c26759OooOOoo = c26791OoooOoO.f92651OooO0OO;
        c26780Oooo0o0.f92609OooOo0o = null;
        c26780Oooo0o0.f92610OooOoO = 2;
    }

    @Override // o0OOooO0.o00000
    public final boolean OooO0o() {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f92649OooO00o) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0o0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26778Oooo0OO c26778Oooo0OO;
        Object objOooOo0;
        C26791OoooOoO c26791OoooOoO;
        Object objOooOOo0;
        if (abstractC32479OooO0OO instanceof C26778Oooo0OO) {
            c26778Oooo0OO = (C26778Oooo0OO) abstractC32479OooO0OO;
            int i = c26778Oooo0OO.f92602OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26778Oooo0OO.f92602OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26778Oooo0OO = new C26778Oooo0OO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26778Oooo0OO.f92601OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26778Oooo0OO.f92602OooOoOO;
        boolean z = true;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c26778Oooo0OO.f92599OooOo0o = this;
                c26778Oooo0OO.f92598OooOo = str;
                c26778Oooo0OO.f92602OooOoOO = 1;
                objOooOo0 = OooOo0(c26778Oooo0OO);
                if (objOooOo0 != enumC32485OooO00o) {
                    c26791OoooOoO = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                objOooOOo0 = ((C32445OooOOOO) obj).f116639OooOo0o;
                if (objOooOOo0 instanceof C32445OooOOOO.OooO00o) {
                    Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOOo0);
                    if (thOooO00o == null) {
                        throw new IllegalStateException("fetchFileSnapshot failed without error");
                    }
                    if (!(thOooO00o instanceof o0OO000.OooOO0) || !kotlin.jvm.internal.OooOOO0.OooO0O0(((o0OO000.OooOO0) thOooO00o).f90831OooOo0o, "1007")) {
                        throw thOooO00o;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            str = c26778Oooo0OO.f92598OooOo;
            c26791OoooOoO = c26778Oooo0OO.f92599OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooOo0 = ((C32445OooOOOO) obj).f116639OooOo0o;
            if (objOooOo0 instanceof C32445OooOOOO.OooO00o) {
                Throwable thOooO00o2 = C32445OooOOOO.OooO00o(objOooOo0);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o2);
                return C32446OooOOOo.OooO00o(thOooO00o2);
            }
            c26778Oooo0OO.f92599OooOo0o = null;
            c26778Oooo0OO.f92598OooOo = null;
            c26778Oooo0OO.f92602OooOoOO = 2;
            objOooOOo0 = c26791OoooOoO.OooOOo0(str, c26778Oooo0OO);
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:46:0x00f0, B:49:0x00fc, B:50:0x0104, B:20:0x004a, B:27:0x006b, B:33:0x0087, B:42:0x00a7, B:51:0x0105, B:52:0x011a, B:36:0x0092, B:39:0x009d, B:23:0x0059), top: B:55:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, CloudMetaRemoteEntity cloudMetaRemoteEntity, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26798Oooooo c26798Oooooo;
        Object obj;
        C26791OoooOoO c26791OoooOoO;
        String str2;
        Object objOooO0oO;
        C26791OoooOoO c26791OoooOoO2;
        String str3;
        DriveSnapshotCacheEntity driveSnapshotCacheEntityOooOoOO;
        if (abstractC32479OooO0OO instanceof C26798Oooooo) {
            c26798Oooooo = (C26798Oooooo) abstractC32479OooO0OO;
            int i = c26798Oooooo.f92691OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26798Oooooo.f92691OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26798Oooooo = new C26798Oooooo(this, abstractC32479OooO0OO);
            }
        }
        Object obj2 = c26798Oooooo.f92688OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26798Oooooo.f92691OooOoo0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                c26798Oooooo.f92687OooOo0o = str;
                c26798Oooooo.f92686OooOo = cloudMetaRemoteEntity;
                c26798Oooooo.f92689OooOoO0 = this;
                c26798Oooooo.f92691OooOoo0 = 1;
                Serializable serializableOooO = OooO(c26798Oooooo);
                if (serializableOooO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                obj = serializableOooO;
                c26791OoooOoO = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = (String) c26798Oooooo.f92686OooOo;
                    c26791OoooOoO2 = (C26791OoooOoO) c26798Oooooo.f92687OooOo0o;
                    C32446OooOOOo.OooO0O0(obj2);
                    c26791OoooOoO2.getClass();
                    driveSnapshotCacheEntityOooOoOO = OooOoOO(str3, (File) obj2);
                    if (driveSnapshotCacheEntityOooOoOO == null) {
                        return driveSnapshotCacheEntityOooOoOO;
                    }
                    throw new IllegalStateException("uploadMeta: cannot convert File to snapshot");
                }
                C26791OoooOoO c26791OoooOoO3 = c26798Oooooo.f92689OooOoO0;
                cloudMetaRemoteEntity = (CloudMetaRemoteEntity) c26798Oooooo.f92686OooOo;
                String str4 = (String) c26798Oooooo.f92687OooOo0o;
                C32446OooOOOo.OooO0O0(obj2);
                Object obj3 = ((C32445OooOOOO) obj2).f116639OooOo0o;
                c26791OoooOoO = c26791OoooOoO3;
                str = str4;
                obj = obj3;
            }
            C32446OooOOOo.OooO0O0(obj);
            String str5 = (String) obj;
            String mimeType = cloudMetaRemoteEntity.getMimeType();
            int iHashCode = mimeType.hashCode();
            if (iHashCode == 393630974) {
                if (mimeType.equals(CloudMime.NOTE)) {
                    str2 = "application/vnd.notein-apps.dbfile";
                    LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO(cloudMetaRemoteEntity.toCloudProperties());
                    linkedHashMapOooOOOO.put("mimeType", str2);
                    String strOooOo0o = c26791OoooOoO.OooOo0o(str, cloudMetaRemoteEntity.getExtra().getTitle());
                    DateTime dateTime = new DateTime(cloudMetaRemoteEntity.getContentTag().getLastModified());
                    File file = new File();
                    file.setName(strOooOo0o);
                    file.setModifiedTime(dateTime);
                    file.setProperties(linkedHashMapOooOOOO);
                    C26759OooOOoo c26759OooOOoo = c26791OoooOoO.f92651OooO0OO;
                    c26798Oooooo.f92687OooOo0o = c26791OoooOoO;
                    c26798Oooooo.f92686OooOo = str5;
                    c26798Oooooo.f92689OooOoO0 = null;
                    c26798Oooooo.f92691OooOoo0 = 2;
                    objOooO0oO = c26759OooOOoo.OooO0oO(str, file, null, c26798Oooooo);
                    if (objOooO0oO != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                throw new IllegalArgumentException("Unknown mimeType " + cloudMetaRemoteEntity.getMimeType());
            }
            if (iHashCode == 1600536058) {
                if (mimeType.equals(CloudMime.FOLDER)) {
                    str2 = "application/vnd.notein-apps.folders";
                    LinkedHashMap linkedHashMapOooOOOO2 = C34444Oooo0O0.OooOOOO(cloudMetaRemoteEntity.toCloudProperties());
                    linkedHashMapOooOOOO2.put("mimeType", str2);
                    String strOooOo0o2 = c26791OoooOoO.OooOo0o(str, cloudMetaRemoteEntity.getExtra().getTitle());
                    DateTime dateTime2 = new DateTime(cloudMetaRemoteEntity.getContentTag().getLastModified());
                    File file2 = new File();
                    file2.setName(strOooOo0o2);
                    file2.setModifiedTime(dateTime2);
                    file2.setProperties(linkedHashMapOooOOOO2);
                    C26759OooOOoo c26759OooOOoo2 = c26791OoooOoO.f92651OooO0OO;
                    c26798Oooooo.f92687OooOo0o = c26791OoooOoO;
                    c26798Oooooo.f92686OooOo = str5;
                    c26798Oooooo.f92689OooOoO0 = null;
                    c26798Oooooo.f92691OooOoo0 = 2;
                    objOooO0oO = c26759OooOOoo2.OooO0oO(str, file2, null, c26798Oooooo);
                    if (objOooO0oO != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                throw new IllegalArgumentException("Unknown mimeType " + cloudMetaRemoteEntity.getMimeType());
            }
            if (iHashCode == 1883341446 && mimeType.equals(CloudMime.TEMPLATE)) {
                str2 = "application/vnd.notein-apps.template";
                LinkedHashMap linkedHashMapOooOOOO22 = C34444Oooo0O0.OooOOOO(cloudMetaRemoteEntity.toCloudProperties());
                linkedHashMapOooOOOO22.put("mimeType", str2);
                String strOooOo0o22 = c26791OoooOoO.OooOo0o(str, cloudMetaRemoteEntity.getExtra().getTitle());
                DateTime dateTime22 = new DateTime(cloudMetaRemoteEntity.getContentTag().getLastModified());
                File file22 = new File();
                file22.setName(strOooOo0o22);
                file22.setModifiedTime(dateTime22);
                file22.setProperties(linkedHashMapOooOOOO22);
                C26759OooOOoo c26759OooOOoo22 = c26791OoooOoO.f92651OooO0OO;
                c26798Oooooo.f92687OooOo0o = c26791OoooOoO;
                c26798Oooooo.f92686OooOo = str5;
                c26798Oooooo.f92689OooOoO0 = null;
                c26798Oooooo.f92691OooOoo0 = 2;
                objOooO0oO = c26759OooOOoo22.OooO0oO(str, file22, null, c26798Oooooo);
                if (objOooO0oO != enumC32485OooO00o) {
                    c26791OoooOoO2 = c26791OoooOoO;
                    obj2 = objOooO0oO;
                    str3 = str5;
                    c26791OoooOoO2.getClass();
                    driveSnapshotCacheEntityOooOoOO = OooOoOO(str3, (File) obj2);
                    if (driveSnapshotCacheEntityOooOoOO == null) {
                    }
                }
                return enumC32485OooO00o;
            }
            throw new IllegalArgumentException("Unknown mimeType " + cloudMetaRemoteEntity.getMimeType());
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a7 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:73:0x01e0, B:74:0x01f8, B:76:0x01fe, B:79:0x020b, B:81:0x0217, B:83:0x021d, B:87:0x022a, B:89:0x0230, B:90:0x023d, B:91:0x0241, B:92:0x024a, B:94:0x0250, B:96:0x025f, B:98:0x0265, B:100:0x02a7, B:101:0x02ae, B:18:0x004b, B:61:0x0155, B:62:0x0163, B:64:0x0169, B:66:0x0178, B:67:0x017c, B:21:0x005c, B:57:0x011e, B:24:0x0070, B:51:0x00f8, B:53:0x00fc, B:69:0x01b4, B:47:0x00e2), top: B:106:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:73:0x01e0, B:74:0x01f8, B:76:0x01fe, B:79:0x020b, B:81:0x0217, B:83:0x021d, B:87:0x022a, B:89:0x0230, B:90:0x023d, B:91:0x0241, B:92:0x024a, B:94:0x0250, B:96:0x025f, B:98:0x0265, B:100:0x02a7, B:101:0x02ae, B:18:0x004b, B:61:0x0155, B:62:0x0163, B:64:0x0169, B:66:0x0178, B:67:0x017c, B:21:0x005c, B:57:0x011e, B:24:0x0070, B:51:0x00f8, B:53:0x00fc, B:69:0x01b4, B:47:0x00e2), top: B:106:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:73:0x01e0, B:74:0x01f8, B:76:0x01fe, B:79:0x020b, B:81:0x0217, B:83:0x021d, B:87:0x022a, B:89:0x0230, B:90:0x023d, B:91:0x0241, B:92:0x024a, B:94:0x0250, B:96:0x025f, B:98:0x0265, B:100:0x02a7, B:101:0x02ae, B:18:0x004b, B:61:0x0155, B:62:0x0163, B:64:0x0169, B:66:0x0178, B:67:0x017c, B:21:0x005c, B:57:0x011e, B:24:0x0070, B:51:0x00f8, B:53:0x00fc, B:69:0x01b4, B:47:0x00e2), top: B:106:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b4 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:73:0x01e0, B:74:0x01f8, B:76:0x01fe, B:79:0x020b, B:81:0x0217, B:83:0x021d, B:87:0x022a, B:89:0x0230, B:90:0x023d, B:91:0x0241, B:92:0x024a, B:94:0x0250, B:96:0x025f, B:98:0x0265, B:100:0x02a7, B:101:0x02ae, B:18:0x004b, B:61:0x0155, B:62:0x0163, B:64:0x0169, B:66:0x0178, B:67:0x017c, B:21:0x005c, B:57:0x011e, B:24:0x0070, B:51:0x00f8, B:53:0x00fc, B:69:0x01b4, B:47:0x00e2), top: B:106:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fe A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:73:0x01e0, B:74:0x01f8, B:76:0x01fe, B:79:0x020b, B:81:0x0217, B:83:0x021d, B:87:0x022a, B:89:0x0230, B:90:0x023d, B:91:0x0241, B:92:0x024a, B:94:0x0250, B:96:0x025f, B:98:0x0265, B:100:0x02a7, B:101:0x02ae, B:18:0x004b, B:61:0x0155, B:62:0x0163, B:64:0x0169, B:66:0x0178, B:67:0x017c, B:21:0x005c, B:57:0x011e, B:24:0x0070, B:51:0x00f8, B:53:0x00fc, B:69:0x01b4, B:47:0x00e2), top: B:106:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0250 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:73:0x01e0, B:74:0x01f8, B:76:0x01fe, B:79:0x020b, B:81:0x0217, B:83:0x021d, B:87:0x022a, B:89:0x0230, B:90:0x023d, B:91:0x0241, B:92:0x024a, B:94:0x0250, B:96:0x025f, B:98:0x0265, B:100:0x02a7, B:101:0x02ae, B:18:0x004b, B:61:0x0155, B:62:0x0163, B:64:0x0169, B:66:0x0178, B:67:0x017c, B:21:0x005c, B:57:0x011e, B:24:0x0070, B:51:0x00f8, B:53:0x00fc, B:69:0x01b4, B:47:0x00e2), top: B:106:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0265 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:73:0x01e0, B:74:0x01f8, B:76:0x01fe, B:79:0x020b, B:81:0x0217, B:83:0x021d, B:87:0x022a, B:89:0x0230, B:90:0x023d, B:91:0x0241, B:92:0x024a, B:94:0x0250, B:96:0x025f, B:98:0x0265, B:100:0x02a7, B:101:0x02ae, B:18:0x004b, B:61:0x0155, B:62:0x0163, B:64:0x0169, B:66:0x0178, B:67:0x017c, B:21:0x005c, B:57:0x011e, B:24:0x0070, B:51:0x00f8, B:53:0x00fc, B:69:0x01b4, B:47:0x00e2), top: B:106:0x0024 }] */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26788OoooOOO c26788OoooOOO;
        Object objOooOo0;
        C26791OoooOoO c26791OoooOoO;
        Object objOooO;
        C26791OoooOoO c26791OoooOoO2;
        Throwable thOooO00o;
        String str;
        Object objOooOo;
        String str2;
        String str3;
        C26791OoooOoO c26791OoooOoO3;
        C26791OoooOoO c26791OoooOoO4;
        String str4;
        String str5;
        Object objOooO0o;
        String str6;
        C26791OoooOoO c26791OoooOoO5;
        String str7;
        String str8;
        if (abstractC32479OooO0OO instanceof C26788OoooOOO) {
            c26788OoooOOO = (C26788OoooOOO) abstractC32479OooO0OO;
            int i = c26788OoooOOO.f92640OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26788OoooOOO.f92640OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26788OoooOOO = new C26788OoooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOoO0 = c26788OoooOOO.f92637OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        try {
            switch (c26788OoooOOO.f92640OooOoo0) {
                case 0:
                    C32446OooOOOo.OooO0O0(objOooOoO0);
                    c26788OoooOOO.f92636OooOo0o = this;
                    c26788OoooOOO.f92640OooOoo0 = 1;
                    objOooOo0 = OooOo0(c26788OoooOOO);
                    if (objOooOo0 != enumC32485OooO00o) {
                        c26791OoooOoO = this;
                        if (!(objOooOo0 instanceof C32445OooOOOO.OooO00o)) {
                            Throwable thOooO00o2 = C32445OooOOOO.OooO00o(objOooOo0);
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o2);
                            return C32446OooOOOo.OooO00o(thOooO00o2);
                        }
                        c26788OoooOOO.f92636OooOo0o = c26791OoooOoO;
                        c26788OoooOOO.f92640OooOoo0 = 2;
                        objOooO = c26791OoooOoO.OooO(c26788OoooOOO);
                        if (objOooO != enumC32485OooO00o) {
                            c26791OoooOoO2 = c26791OoooOoO;
                            thOooO00o = C32445OooOOOO.OooO00o(objOooO);
                            if (thOooO00o == null) {
                                return C32446OooOOOo.OooO00o(new IllegalStateException("Google Drive no driveId", thOooO00o));
                            }
                            str = (String) objOooO;
                            c26788OoooOOO.f92636OooOo0o = c26791OoooOoO2;
                            c26788OoooOOO.f92635OooOo = str;
                            c26788OoooOOO.f92640OooOoo0 = 3;
                            objOooOoO0 = c26791OoooOoO2.OooOoO0(c26788OoooOOO);
                            if (objOooOoO0 != enumC32485OooO00o) {
                                String str9 = (String) objOooOoO0;
                                c26788OoooOOO.f92636OooOo0o = str;
                                c26788OoooOOO.f92635OooOo = str9;
                                c26788OoooOOO.f92638OooOoO0 = c26791OoooOoO2;
                                c26788OoooOOO.f92640OooOoo0 = 4;
                                objOooOo = c26791OoooOoO2.OooOo(c26788OoooOOO);
                                if (objOooOo == enumC32485OooO00o) {
                                    C26791OoooOoO c26791OoooOoO6 = c26791OoooOoO2;
                                    str2 = str9;
                                    objOooOoO0 = objOooOo;
                                    str3 = str;
                                    c26791OoooOoO3 = c26791OoooOoO6;
                                    String str10 = (String) objOooOoO0;
                                    if (str2 != null) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o.OooOOO0("GoogleDriveBackend");
                                        c20358OooO00o.OooO0o0("fetchFileSnapshots: no cursor, performing full scan", new Object[0]);
                                        C26759OooOOoo c26759OooOOoo = c26791OoooOoO3.f92651OooO0OO;
                                        c26788OoooOOO.f92636OooOo0o = str3;
                                        c26788OoooOOO.f92635OooOo = c26791OoooOoO3;
                                        c26788OoooOOO.f92638OooOoO0 = str10;
                                        c26788OoooOOO.f92640OooOoo0 = 5;
                                        Object objOooO0o2 = c26759OooOOoo.OooO0o(c26788OoooOOO);
                                        if (objOooO0o2 != enumC32485OooO00o) {
                                            str5 = str10;
                                            objOooOoO0 = objOooO0o2;
                                            String str11 = (String) objOooOoO0;
                                            C26759OooOOoo c26759OooOOoo2 = c26791OoooOoO3.f92651OooO0OO;
                                            String str12 = "'" + str5 + "' in parents and trashed = false";
                                            c26788OoooOOO.f92636OooOo0o = str3;
                                            c26788OoooOOO.f92635OooOo = c26791OoooOoO3;
                                            c26788OoooOOO.f92638OooOoO0 = str11;
                                            c26788OoooOOO.f92640OooOoo0 = 6;
                                            c26759OooOOoo2.getClass();
                                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26755OooOOOO(c26759OooOOoo2, str12, null), c26788OoooOOO);
                                            if (objOooO0o == enumC32485OooO00o) {
                                                str6 = str11;
                                                objOooOoO0 = objOooO0o;
                                                c26791OoooOoO5 = c26791OoooOoO3;
                                                str7 = str3;
                                                List<File> list = (List) objOooOoO0;
                                                ArrayList arrayList = new ArrayList();
                                                for (File file : list) {
                                                    c26791OoooOoO5.getClass();
                                                    DriveSnapshotCacheEntity driveSnapshotCacheEntityOooOoOO = OooOoOO(str7, file);
                                                    if (driveSnapshotCacheEntityOooOoOO != null) {
                                                        arrayList.add(driveSnapshotCacheEntityOooOoOO);
                                                    }
                                                }
                                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o2.OooOOO0("GoogleDriveBackend");
                                                c20358OooO00o2.OooO0o0("fetchFileSnapshots: full scan found " + list.size() + " files, " + arrayList.size() + " snapshots", new Object[0]);
                                                return new o00000O0(arrayList, C34434OooOoO.f123453OooOo0o, str6);
                                            }
                                        }
                                    } else {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o3.OooOOO0("GoogleDriveBackend");
                                        c20358OooO00o3.OooO0o0("fetchFileSnapshots: using cursor for delta fetch", new Object[0]);
                                        C26759OooOOoo c26759OooOOoo3 = c26791OoooOoO3.f92651OooO0OO;
                                        c26788OoooOOO.f92636OooOo0o = str3;
                                        c26788OoooOOO.f92635OooOo = c26791OoooOoO3;
                                        c26788OoooOOO.f92638OooOoO0 = null;
                                        c26788OoooOOO.f92640OooOoo0 = 7;
                                        c26759OooOOoo3.getClass();
                                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                                        objOooOoO0 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26756OooOOOo(c26759OooOOoo3, str2, null), c26788OoooOOO);
                                        if (objOooOoO0 != enumC32485OooO00o) {
                                            c26791OoooOoO4 = c26791OoooOoO3;
                                            str4 = str3;
                                            C32443OooOOO c32443OooOOO = (C32443OooOOO) objOooOoO0;
                                            List<Change> list2 = (List) c32443OooOOO.f116638OooOo0o;
                                            str8 = (String) c32443OooOOO.f116637OooOo;
                                            ArrayList<File> arrayList2 = new ArrayList();
                                            ArrayList arrayList3 = new ArrayList();
                                            for (Change change : list2) {
                                                String fileId = change.getFileId();
                                                if (fileId != null) {
                                                    Boolean removed = change.getRemoved();
                                                    Boolean bool = Boolean.TRUE;
                                                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(removed, bool)) {
                                                        File file2 = change.getFile();
                                                        if (!(file2 != null ? kotlin.jvm.internal.OooOOO0.OooO0O0(file2.getTrashed(), bool) : false)) {
                                                            if (change.getFile() != null) {
                                                                File file3 = change.getFile();
                                                                kotlin.jvm.internal.OooOOO0.OooO0o(file3, "getFile(...)");
                                                                arrayList2.add(file3);
                                                            }
                                                        }
                                                    }
                                                    arrayList3.add(fileId);
                                                }
                                            }
                                            ArrayList arrayList4 = new ArrayList();
                                            for (File file4 : arrayList2) {
                                                c26791OoooOoO4.getClass();
                                                DriveSnapshotCacheEntity driveSnapshotCacheEntityOooOoOO2 = OooOoOO(str4, file4);
                                                if (driveSnapshotCacheEntityOooOoOO2 != null) {
                                                    arrayList4.add(driveSnapshotCacheEntityOooOoOO2);
                                                }
                                            }
                                            if (str8 != null) {
                                                throw new IllegalStateException("Google Drive newStartPageToken missing after delta fetch");
                                            }
                                            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o4.OooOOO0("GoogleDriveBackend");
                                            c20358OooO00o4.OooO0o0("fetchFileSnapshots: " + list2.size() + " changes -> " + arrayList4.size() + " updated, " + arrayList3.size() + " deleted", new Object[0]);
                                            return new o00000O0(arrayList4, arrayList3, str8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return enumC32485OooO00o;
                case 1:
                    c26791OoooOoO = (C26791OoooOoO) c26788OoooOOO.f92636OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooOoO0);
                    objOooOo0 = ((C32445OooOOOO) objOooOoO0).f116639OooOo0o;
                    if (!(objOooOo0 instanceof C32445OooOOOO.OooO00o)) {
                    }
                    break;
                case 2:
                    c26791OoooOoO = (C26791OoooOoO) c26788OoooOOO.f92636OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooOoO0);
                    objOooO = ((C32445OooOOOO) objOooOoO0).f116639OooOo0o;
                    c26791OoooOoO2 = c26791OoooOoO;
                    thOooO00o = C32445OooOOOO.OooO00o(objOooO);
                    if (thOooO00o == null) {
                    }
                    break;
                case 3:
                    str = (String) c26788OoooOOO.f92635OooOo;
                    c26791OoooOoO2 = (C26791OoooOoO) c26788OoooOOO.f92636OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooOoO0);
                    String str92 = (String) objOooOoO0;
                    c26788OoooOOO.f92636OooOo0o = str;
                    c26788OoooOOO.f92635OooOo = str92;
                    c26788OoooOOO.f92638OooOoO0 = c26791OoooOoO2;
                    c26788OoooOOO.f92640OooOoo0 = 4;
                    objOooOo = c26791OoooOoO2.OooOo(c26788OoooOOO);
                    if (objOooOo == enumC32485OooO00o) {
                    }
                    break;
                case 4:
                    c26791OoooOoO3 = (C26791OoooOoO) c26788OoooOOO.f92638OooOoO0;
                    str2 = (String) c26788OoooOOO.f92635OooOo;
                    str3 = (String) c26788OoooOOO.f92636OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooOoO0);
                    String str102 = (String) objOooOoO0;
                    if (str2 != null) {
                    }
                    return enumC32485OooO00o;
                case 5:
                    String str13 = (String) c26788OoooOOO.f92638OooOoO0;
                    C26791OoooOoO c26791OoooOoO7 = (C26791OoooOoO) c26788OoooOOO.f92635OooOo;
                    str3 = (String) c26788OoooOOO.f92636OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooOoO0);
                    str5 = str13;
                    c26791OoooOoO3 = c26791OoooOoO7;
                    String str112 = (String) objOooOoO0;
                    C26759OooOOoo c26759OooOOoo22 = c26791OoooOoO3.f92651OooO0OO;
                    String str122 = "'" + str5 + "' in parents and trashed = false";
                    c26788OoooOOO.f92636OooOo0o = str3;
                    c26788OoooOOO.f92635OooOo = c26791OoooOoO3;
                    c26788OoooOOO.f92638OooOoO0 = str112;
                    c26788OoooOOO.f92640OooOoo0 = 6;
                    c26759OooOOoo22.getClass();
                    C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26755OooOOOO(c26759OooOOoo22, str122, null), c26788OoooOOO);
                    if (objOooO0o == enumC32485OooO00o) {
                    }
                    break;
                case 6:
                    str6 = (String) c26788OoooOOO.f92638OooOoO0;
                    c26791OoooOoO5 = (C26791OoooOoO) c26788OoooOOO.f92635OooOo;
                    str7 = (String) c26788OoooOOO.f92636OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooOoO0);
                    List<File> list3 = (List) objOooOoO0;
                    ArrayList arrayList5 = new ArrayList();
                    while (r3.hasNext()) {
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o22.OooOOO0("GoogleDriveBackend");
                    c20358OooO00o22.OooO0o0("fetchFileSnapshots: full scan found " + list3.size() + " files, " + arrayList5.size() + " snapshots", new Object[0]);
                    return new o00000O0(arrayList5, C34434OooOoO.f123453OooOo0o, str6);
                case 7:
                    c26791OoooOoO4 = (C26791OoooOoO) c26788OoooOOO.f92635OooOo;
                    str4 = (String) c26788OoooOOO.f92636OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooOoO0);
                    C32443OooOOO c32443OooOOO2 = (C32443OooOOO) objOooOoO0;
                    List<Change> list22 = (List) c32443OooOOO2.f116638OooOo0o;
                    str8 = (String) c32443OooOOO2.f116637OooOo;
                    ArrayList<File> arrayList22 = new ArrayList();
                    ArrayList arrayList32 = new ArrayList();
                    while (r7.hasNext()) {
                    }
                    ArrayList arrayList42 = new ArrayList();
                    while (r3.hasNext()) {
                    }
                    if (str8 != null) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26782Oooo0oo c26782Oooo0oo;
        if (abstractC32479OooO0OO instanceof C26782Oooo0oo) {
            c26782Oooo0oo = (C26782Oooo0oo) abstractC32479OooO0OO;
            int i = c26782Oooo0oo.f92615OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26782Oooo0oo.f92615OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26782Oooo0oo = new C26782Oooo0oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26782Oooo0oo.f92614OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26782Oooo0oo.f92615OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c26782Oooo0oo.f92615OooOoO0 = 1;
                if (OooOoo0(str, c26782Oooo0oo) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r8 != r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26787OoooOO0 c26787OoooOO0;
        Object objOooOo0;
        C26791OoooOoO c26791OoooOoO;
        if (abstractC32479OooO0OO instanceof C26787OoooOO0) {
            c26787OoooOO0 = (C26787OoooOO0) abstractC32479OooO0OO;
            int i = c26787OoooOO0.f92633OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26787OoooOO0.f92633OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26787OoooOO0 = new C26787OoooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOo = c26787OoooOO0.f92631OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26787OoooOO0.f92633OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooOo);
                c26787OoooOO0.f92632OooOo0o = this;
                c26787OoooOO0.f92633OooOoO = 1;
                objOooOo0 = OooOo0(c26787OoooOO0);
                if (objOooOo0 != enumC32485OooO00o) {
                    c26791OoooOoO = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 == 1) {
                c26791OoooOoO = c26787OoooOO0.f92632OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOo);
                objOooOo0 = ((C32445OooOOOO) objOooOo).f116639OooOo0o;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(objOooOo);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((Iterable) objOooOo).iterator();
                    while (it.hasNext()) {
                        String id = ((File) it.next()).getId();
                        if (id != null) {
                            arrayList.add(id);
                        }
                    }
                    return oOo000Oo.OooOo.o0OO00O(arrayList);
                }
                c26791OoooOoO = c26787OoooOO0.f92632OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOo);
                C26759OooOOoo c26759OooOOoo = c26791OoooOoO.f92651OooO0OO;
                c26787OoooOO0.f92632OooOo0o = null;
                c26787OoooOO0.f92633OooOoO = 3;
                c26759OooOOoo.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooOo = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26755OooOOOO(c26759OooOOoo, "'" + ((String) objOooOo) + "' in parents and trashed = false", null), c26787OoooOO0);
            }
            if (objOooOo0 instanceof C32445OooOOOO.OooO00o) {
                Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOo0);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
                return C32446OooOOOo.OooO00o(thOooO00o);
            }
            c26787OoooOO0.f92632OooOo0o = c26791OoooOoO;
            c26787OoooOO0.f92633OooOoO = 2;
            objOooOo = c26791OoooOoO.OooOo(c26787OoooOO0);
            if (objOooOo != enumC32485OooO00o) {
                C26759OooOOoo c26759OooOOoo2 = c26791OoooOoO.f92651OooO0OO;
                c26787OoooOO0.f92632OooOo0o = null;
                c26787OoooOO0.f92633OooOoO = 3;
                c26759OooOOoo2.getClass();
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                objOooOo = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26755OooOOOO(c26759OooOOoo2, "'" + ((String) objOooOo) + "' in parents and trashed = false", null), c26787OoooOO0);
            }
            return enumC32485OooO00o;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r2.OooOoO(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26777Oooo0O0 c26777Oooo0O0;
        C26791OoooOoO c26791OoooOoO;
        if (abstractC32479OooO0OO instanceof C26777Oooo0O0) {
            c26777Oooo0O0 = (C26777Oooo0O0) abstractC32479OooO0OO;
            int i = c26777Oooo0O0.f92596OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26777Oooo0O0.f92596OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26777Oooo0O0 = new C26777Oooo0O0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26777Oooo0O0.f92594OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26777Oooo0O0.f92596OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c26777Oooo0O0.f92595OooOo0o = this;
            c26777Oooo0O0.f92596OooOoO = 1;
            if (this.f92650OooO0O0.OooO0OO(c26777Oooo0O0) != enumC32485OooO00o) {
                c26791OoooOoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            c26791OoooOoO = c26777Oooo0O0.f92595OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            c26791OoooOoO = c26777Oooo0O0.f92595OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c26777Oooo0O0.f92595OooOo0o = null;
            c26777Oooo0O0.f92596OooOoO = 3;
        }
        c26777Oooo0O0.f92595OooOo0o = c26791OoooOoO;
        c26777Oooo0O0.f92596OooOoO = 2;
        if (c26791OoooOoO.OooOo0O(c26777Oooo0O0) != enumC32485OooO00o) {
            c26777Oooo0O0.f92595OooOo0o = null;
            c26777Oooo0O0.f92596OooOoO = 3;
        }
        return enumC32485OooO00o;
    }

    @Override // o0OOooO0.o00000
    public final Object OooOOO(String str, Continuation<? super C32445OooOOOO<? extends List<NoteHistoryVersion>>> continuation) {
        return C34434OooOoO.f123453OooOo0o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x02cc, code lost:
    
        if (r0 == r8) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0269 A[Catch: all -> 0x0049, TryCatch #3 {all -> 0x0049, blocks: (B:13:0x0044, B:110:0x02cf, B:111:0x02d1, B:112:0x02d3, B:115:0x02dd, B:116:0x02e5, B:100:0x0262, B:103:0x0269, B:105:0x026d, B:107:0x0278, B:117:0x02e6, B:99:0x025d, B:23:0x007c, B:74:0x01df, B:26:0x008f, B:49:0x0114, B:56:0x0135, B:67:0x015b, B:70:0x0196, B:118:0x02e7, B:119:0x02fc, B:61:0x0145, B:64:0x0150, B:29:0x00a6, B:45:0x00fb, B:32:0x00b3, B:39:0x00d6, B:41:0x00e6, B:120:0x02fd, B:121:0x0308, B:35:0x00c6), top: B:130:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02dd A[Catch: all -> 0x0049, TryCatch #3 {all -> 0x0049, blocks: (B:13:0x0044, B:110:0x02cf, B:111:0x02d1, B:112:0x02d3, B:115:0x02dd, B:116:0x02e5, B:100:0x0262, B:103:0x0269, B:105:0x026d, B:107:0x0278, B:117:0x02e6, B:99:0x025d, B:23:0x007c, B:74:0x01df, B:26:0x008f, B:49:0x0114, B:56:0x0135, B:67:0x015b, B:70:0x0196, B:118:0x02e7, B:119:0x02fc, B:61:0x0145, B:64:0x0150, B:29:0x00a6, B:45:0x00fb, B:32:0x00b3, B:39:0x00d6, B:41:0x00e6, B:120:0x02fd, B:121:0x0308, B:35:0x00c6), top: B:130:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02fd A[Catch: all -> 0x0049, TryCatch #3 {all -> 0x0049, blocks: (B:13:0x0044, B:110:0x02cf, B:111:0x02d1, B:112:0x02d3, B:115:0x02dd, B:116:0x02e5, B:100:0x0262, B:103:0x0269, B:105:0x026d, B:107:0x0278, B:117:0x02e6, B:99:0x025d, B:23:0x007c, B:74:0x01df, B:26:0x008f, B:49:0x0114, B:56:0x0135, B:67:0x015b, B:70:0x0196, B:118:0x02e7, B:119:0x02fc, B:61:0x0145, B:64:0x0150, B:29:0x00a6, B:45:0x00fb, B:32:0x00b3, B:39:0x00d6, B:41:0x00e6, B:120:0x02fd, B:121:0x0308, B:35:0x00c6), top: B:130:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6 A[Catch: all -> 0x0049, TryCatch #3 {all -> 0x0049, blocks: (B:13:0x0044, B:110:0x02cf, B:111:0x02d1, B:112:0x02d3, B:115:0x02dd, B:116:0x02e5, B:100:0x0262, B:103:0x0269, B:105:0x026d, B:107:0x0278, B:117:0x02e6, B:99:0x025d, B:23:0x007c, B:74:0x01df, B:26:0x008f, B:49:0x0114, B:56:0x0135, B:67:0x015b, B:70:0x0196, B:118:0x02e7, B:119:0x02fc, B:61:0x0145, B:64:0x0150, B:29:0x00a6, B:45:0x00fb, B:32:0x00b3, B:39:0x00d6, B:41:0x00e6, B:120:0x02fd, B:121:0x0308, B:35:0x00c6), top: B:130:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0150 A[Catch: all -> 0x0049, TryCatch #3 {all -> 0x0049, blocks: (B:13:0x0044, B:110:0x02cf, B:111:0x02d1, B:112:0x02d3, B:115:0x02dd, B:116:0x02e5, B:100:0x0262, B:103:0x0269, B:105:0x026d, B:107:0x0278, B:117:0x02e6, B:99:0x025d, B:23:0x007c, B:74:0x01df, B:26:0x008f, B:49:0x0114, B:56:0x0135, B:67:0x015b, B:70:0x0196, B:118:0x02e7, B:119:0x02fc, B:61:0x0145, B:64:0x0150, B:29:0x00a6, B:45:0x00fb, B:32:0x00b3, B:39:0x00d6, B:41:0x00e6, B:120:0x02fd, B:121:0x0308, B:35:0x00c6), top: B:130:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0196 A[Catch: all -> 0x0049, TRY_ENTER, TryCatch #3 {all -> 0x0049, blocks: (B:13:0x0044, B:110:0x02cf, B:111:0x02d1, B:112:0x02d3, B:115:0x02dd, B:116:0x02e5, B:100:0x0262, B:103:0x0269, B:105:0x026d, B:107:0x0278, B:117:0x02e6, B:99:0x025d, B:23:0x007c, B:74:0x01df, B:26:0x008f, B:49:0x0114, B:56:0x0135, B:67:0x015b, B:70:0x0196, B:118:0x02e7, B:119:0x02fc, B:61:0x0145, B:64:0x0150, B:29:0x00a6, B:45:0x00fb, B:32:0x00b3, B:39:0x00d6, B:41:0x00e6, B:120:0x02fd, B:121:0x0308, B:35:0x00c6), top: B:130:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(o00000O o00000o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26799Oooooo0 c26799Oooooo0;
        o00000O o00000o2;
        Object objOooOo0;
        C26791OoooOoO c26791OoooOoO;
        java.io.File file;
        o00000O o00000o3;
        java.io.File file2;
        C26791OoooOoO c26791OoooOoO2;
        Serializable serializableOooO;
        String str;
        java.io.File file3;
        Object obj;
        C26791OoooOoO c26791OoooOoO3;
        String str2;
        int iHashCode;
        String str3;
        boolean zOooo0o0;
        String str4;
        String str5;
        String str6;
        String str7;
        DateTime dateTime;
        LinkedHashMap linkedHashMap;
        String str8;
        String str9;
        C34406OooO00o.C20358OooO00o c20358OooO00o;
        String id;
        StringBuilder sb;
        String str10;
        C26791OoooOoO c26791OoooOoO4;
        File file4;
        Object objOooO00o;
        Throwable thOooO00o;
        DriveSnapshotCacheEntity driveSnapshotCacheEntityOooOoOO;
        if (abstractC32479OooO0OO instanceof C26799Oooooo0) {
            c26799Oooooo0 = (C26799Oooooo0) abstractC32479OooO0OO;
            int i = c26799Oooooo0.f92703Oooo00o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26799Oooooo0.f92703Oooo00o = i - Integer.MIN_VALUE;
            } else {
                c26799Oooooo0 = new C26799Oooooo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = c26799Oooooo0.f92701Oooo000;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        try {
            switch (c26799Oooooo0.f92703Oooo00o) {
                case 0:
                    C32446OooOOOo.OooO0O0(objOooO0oO);
                    o00000o2 = o00000o;
                    c26799Oooooo0.f92693OooOo0o = o00000o2;
                    c26799Oooooo0.f92692OooOo = this;
                    c26799Oooooo0.f92703Oooo00o = 1;
                    objOooOo0 = OooOo0(c26799Oooooo0);
                    if (objOooOo0 == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    c26791OoooOoO = this;
                    C32446OooOOOo.OooO0O0(objOooOo0);
                    file = new java.io.File(o00000o2.f98986OooO0O0);
                    if (file.exists()) {
                        throw new IllegalStateException("Bundle file missing: ".concat(o00000o2.f98986OooO0O0));
                    }
                    c26799Oooooo0.f92693OooOo0o = o00000o2;
                    c26799Oooooo0.f92692OooOo = c26791OoooOoO;
                    c26799Oooooo0.f92695OooOoO0 = file;
                    c26799Oooooo0.f92703Oooo00o = 2;
                    Object objOooOo = c26791OoooOoO.OooOo(c26799Oooooo0);
                    if (objOooOo == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    o00000o3 = o00000o2;
                    objOooO0oO = objOooOo;
                    file2 = file;
                    c26791OoooOoO2 = c26791OoooOoO;
                    String str11 = (String) objOooO0oO;
                    c26799Oooooo0.f92693OooOo0o = o00000o3;
                    c26799Oooooo0.f92692OooOo = c26791OoooOoO2;
                    c26799Oooooo0.f92695OooOoO0 = file2;
                    c26799Oooooo0.f92694OooOoO = str11;
                    c26799Oooooo0.f92703Oooo00o = 3;
                    serializableOooO = c26791OoooOoO2.OooO(c26799Oooooo0);
                    if (serializableOooO != enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    str = str11;
                    file3 = file2;
                    obj = serializableOooO;
                    c26791OoooOoO3 = c26791OoooOoO2;
                    C32446OooOOOo.OooO0O0(obj);
                    str2 = (String) obj;
                    String mimeType = o00000o3.f98985OooO00o.getMimeType();
                    iHashCode = mimeType.hashCode();
                    CloudMetaRemoteEntity cloudMetaRemoteEntity = o00000o3.f98985OooO00o;
                    if (iHashCode != 393630974) {
                        if (mimeType.equals(CloudMime.NOTE)) {
                            str3 = "application/vnd.notein-apps.dbfile";
                            String str12 = str3;
                            LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO(cloudMetaRemoteEntity.toCloudProperties());
                            linkedHashMapOooOOOO.put("mimeType", str12);
                            String strOooOo0o = c26791OoooOoO3.OooOo0o(cloudMetaRemoteEntity.getId(), cloudMetaRemoteEntity.getExtra().getTitle());
                            String driveObjectKey = cloudMetaRemoteEntity.getDriveObjectKey();
                            DateTime dateTime2 = new DateTime(cloudMetaRemoteEntity.getContentTag().getLastModified());
                            zOooo0o0 = C33599OooOo0O.Oooo0o0(driveObjectKey);
                            C26759OooOOoo c26759OooOOoo = c26791OoooOoO3.f92651OooO0OO;
                            if (!zOooo0o0) {
                            }
                            return enumC32485OooO00o;
                        }
                        throw new IllegalArgumentException("Unknown mimeType " + cloudMetaRemoteEntity.getMimeType());
                    }
                    if (iHashCode == 1600536058) {
                        if (mimeType.equals(CloudMime.FOLDER)) {
                            str3 = "application/vnd.notein-apps.folders";
                            String str122 = str3;
                            LinkedHashMap linkedHashMapOooOOOO2 = C34444Oooo0O0.OooOOOO(cloudMetaRemoteEntity.toCloudProperties());
                            linkedHashMapOooOOOO2.put("mimeType", str122);
                            String strOooOo0o2 = c26791OoooOoO3.OooOo0o(cloudMetaRemoteEntity.getId(), cloudMetaRemoteEntity.getExtra().getTitle());
                            String driveObjectKey2 = cloudMetaRemoteEntity.getDriveObjectKey();
                            DateTime dateTime22 = new DateTime(cloudMetaRemoteEntity.getContentTag().getLastModified());
                            zOooo0o0 = C33599OooOo0O.Oooo0o0(driveObjectKey2);
                            C26759OooOOoo c26759OooOOoo2 = c26791OoooOoO3.f92651OooO0OO;
                            if (!zOooo0o0) {
                            }
                            return enumC32485OooO00o;
                        }
                        throw new IllegalArgumentException("Unknown mimeType " + cloudMetaRemoteEntity.getMimeType());
                    }
                    if (iHashCode == 1883341446 && mimeType.equals(CloudMime.TEMPLATE)) {
                        str3 = "application/vnd.notein-apps.template";
                        String str1222 = str3;
                        LinkedHashMap linkedHashMapOooOOOO22 = C34444Oooo0O0.OooOOOO(cloudMetaRemoteEntity.toCloudProperties());
                        linkedHashMapOooOOOO22.put("mimeType", str1222);
                        String strOooOo0o22 = c26791OoooOoO3.OooOo0o(cloudMetaRemoteEntity.getId(), cloudMetaRemoteEntity.getExtra().getTitle());
                        String driveObjectKey22 = cloudMetaRemoteEntity.getDriveObjectKey();
                        DateTime dateTime222 = new DateTime(cloudMetaRemoteEntity.getContentTag().getLastModified());
                        zOooo0o0 = C33599OooOo0O.Oooo0o0(driveObjectKey22);
                        C26759OooOOoo c26759OooOOoo22 = c26791OoooOoO3.f92651OooO0OO;
                        if (!zOooo0o0) {
                            try {
                                c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("GoogleDriveBackend");
                                id = cloudMetaRemoteEntity.getId();
                                str5 = "uploadContent: fileId ";
                                try {
                                    sb = new StringBuilder("uploadContent: updating existing file ");
                                    str4 = driveObjectKey22;
                                } catch (Throwable th) {
                                    th = th;
                                    str4 = driveObjectKey22;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                str4 = driveObjectKey22;
                                str5 = "uploadContent: fileId ";
                            }
                            try {
                                sb.append(str4);
                                str6 = "GoogleDriveBackend";
                                try {
                                    sb.append(" for ");
                                    sb.append(id);
                                    c20358OooO00o.OooO00o(sb.toString(), new Object[0]);
                                    File file5 = new File();
                                    file5.setName(strOooOo0o22);
                                    file5.setModifiedTime(dateTime222);
                                    file5.setProperties(linkedHashMapOooOOOO22);
                                    c26799Oooooo0.f92693OooOo0o = c26791OoooOoO3;
                                    c26799Oooooo0.f92692OooOo = file3;
                                    c26799Oooooo0.f92695OooOoO0 = str;
                                    c26799Oooooo0.f92694OooOoO = str1222;
                                    c26799Oooooo0.f92696OooOoOO = str2;
                                    c26799Oooooo0.f92698OooOoo0 = linkedHashMapOooOOOO22;
                                    c26799Oooooo0.f92697OooOoo = strOooOo0o22;
                                    c26799Oooooo0.f92699OooOooO = str4;
                                    c26799Oooooo0.f92700OooOooo = dateTime222;
                                    c26799Oooooo0.f92703Oooo00o = 5;
                                    objOooO0oO = c26759OooOOoo22.OooO0oO(str4, file5, file3, c26799Oooooo0);
                                    break;
                                } catch (Throwable th3) {
                                    th = th3;
                                    str7 = str1222;
                                    dateTime = dateTime222;
                                    linkedHashMap = linkedHashMapOooOOOO22;
                                    str8 = str4;
                                    str9 = strOooOo0o22;
                                    objOooO00o = C32446OooOOOo.OooO00o(th);
                                    DateTime dateTime3 = dateTime;
                                    String str13 = str8;
                                    str10 = str2;
                                    c26791OoooOoO4 = c26791OoooOoO3;
                                    thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                                    if (thOooO00o == null) {
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                str6 = "GoogleDriveBackend";
                                str7 = str1222;
                                dateTime = dateTime222;
                                linkedHashMap = linkedHashMapOooOOOO22;
                                str8 = str4;
                                str9 = strOooOo0o22;
                                objOooO00o = C32446OooOOOo.OooO00o(th);
                                DateTime dateTime32 = dateTime;
                                String str132 = str8;
                                str10 = str2;
                                c26791OoooOoO4 = c26791OoooOoO3;
                                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                                if (thOooO00o == null) {
                                }
                            }
                            if (objOooO0oO != enumC32485OooO00o) {
                                str7 = str1222;
                                dateTime = dateTime222;
                                linkedHashMap = linkedHashMapOooOOOO22;
                                str8 = str4;
                                str9 = strOooOo0o22;
                                try {
                                    objOooO00o = (File) objOooO0oO;
                                } catch (Throwable th5) {
                                    th = th5;
                                    objOooO00o = C32446OooOOOo.OooO00o(th);
                                }
                                DateTime dateTime322 = dateTime;
                                String str1322 = str8;
                                str10 = str2;
                                c26791OoooOoO4 = c26791OoooOoO3;
                                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                                if (thOooO00o == null) {
                                    file4 = (File) objOooO00o;
                                } else {
                                    if (!(thOooO00o instanceof GoogleJsonResponseException) || ((GoogleJsonResponseException) thOooO00o).getStatusCode() != 404) {
                                        throw thOooO00o;
                                    }
                                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o2.OooOOO0(str6);
                                    c20358OooO00o2.OooOO0O(str5 + str1322 + " not found (404), fallback to create", new Object[0]);
                                    File file6 = new File();
                                    file6.setName(str9);
                                    file6.setMimeType(str7);
                                    file6.setModifiedTime(dateTime322);
                                    file6.setParents(com.facebook.soloader.OooOo.OooO0oO(str));
                                    file6.setProperties(linkedHashMap);
                                    C26759OooOOoo c26759OooOOoo3 = c26791OoooOoO4.f92651OooO0OO;
                                    c26799Oooooo0.f92693OooOo0o = c26791OoooOoO4;
                                    c26799Oooooo0.f92692OooOo = str10;
                                    c26799Oooooo0.f92695OooOoO0 = null;
                                    c26799Oooooo0.f92694OooOoO = null;
                                    c26799Oooooo0.f92696OooOoOO = null;
                                    c26799Oooooo0.f92698OooOoo0 = null;
                                    c26799Oooooo0.f92697OooOoo = null;
                                    c26799Oooooo0.f92699OooOooO = null;
                                    c26799Oooooo0.f92700OooOooo = null;
                                    c26799Oooooo0.f92703Oooo00o = 6;
                                    objOooO0oO = c26759OooOOoo3.OooO0O0(file6, file3, c26799Oooooo0);
                                }
                            }
                            break;
                        } else {
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3.OooOOO0("GoogleDriveBackend");
                            c20358OooO00o3.OooO00o("uploadContent: creating new file for " + cloudMetaRemoteEntity.getId(), new Object[0]);
                            File file7 = new File();
                            file7.setName(strOooOo0o22);
                            file7.setMimeType(str1222);
                            file7.setParents(com.facebook.soloader.OooOo.OooO0oO(str));
                            file7.setModifiedTime(dateTime222);
                            file7.setProperties(linkedHashMapOooOOOO22);
                            c26799Oooooo0.f92693OooOo0o = c26791OoooOoO3;
                            c26799Oooooo0.f92692OooOo = str2;
                            c26799Oooooo0.f92695OooOoO0 = null;
                            c26799Oooooo0.f92694OooOoO = null;
                            c26799Oooooo0.f92703Oooo00o = 4;
                            objOooO0oO = c26759OooOOoo22.OooO0O0(file7, file3, c26799Oooooo0);
                            if (objOooO0oO != enumC32485OooO00o) {
                                str10 = str2;
                                c26791OoooOoO4 = c26791OoooOoO3;
                                file4 = (File) objOooO0oO;
                            }
                        }
                        return enumC32485OooO00o;
                    }
                    throw new IllegalArgumentException("Unknown mimeType " + cloudMetaRemoteEntity.getMimeType());
                    c26791OoooOoO4.getClass();
                    driveSnapshotCacheEntityOooOoOO = OooOoOO(str10, file4);
                    if (driveSnapshotCacheEntityOooOoOO == null) {
                        return driveSnapshotCacheEntityOooOoOO;
                    }
                    throw new IllegalStateException("uploadContent: cannot convert File to snapshot");
                case 1:
                    C26791OoooOoO c26791OoooOoO5 = (C26791OoooOoO) c26799Oooooo0.f92692OooOo;
                    o00000O o00000o4 = (o00000O) c26799Oooooo0.f92693OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0oO);
                    objOooOo0 = ((C32445OooOOOO) objOooO0oO).f116639OooOo0o;
                    o00000o2 = o00000o4;
                    c26791OoooOoO = c26791OoooOoO5;
                    C32446OooOOOo.OooO0O0(objOooOo0);
                    file = new java.io.File(o00000o2.f98986OooO0O0);
                    if (file.exists()) {
                    }
                    break;
                case 2:
                    file2 = (java.io.File) c26799Oooooo0.f92695OooOoO0;
                    c26791OoooOoO2 = (C26791OoooOoO) c26799Oooooo0.f92692OooOo;
                    o00000O o00000o5 = (o00000O) c26799Oooooo0.f92693OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0oO);
                    o00000o3 = o00000o5;
                    String str112 = (String) objOooO0oO;
                    c26799Oooooo0.f92693OooOo0o = o00000o3;
                    c26799Oooooo0.f92692OooOo = c26791OoooOoO2;
                    c26799Oooooo0.f92695OooOoO0 = file2;
                    c26799Oooooo0.f92694OooOoO = str112;
                    c26799Oooooo0.f92703Oooo00o = 3;
                    serializableOooO = c26791OoooOoO2.OooO(c26799Oooooo0);
                    if (serializableOooO != enumC32485OooO00o) {
                    }
                    break;
                case 3:
                    String str14 = c26799Oooooo0.f92694OooOoO;
                    java.io.File file8 = (java.io.File) c26799Oooooo0.f92695OooOoO0;
                    c26791OoooOoO3 = (C26791OoooOoO) c26799Oooooo0.f92692OooOo;
                    o00000o3 = (o00000O) c26799Oooooo0.f92693OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0oO);
                    obj = ((C32445OooOOOO) objOooO0oO).f116639OooOo0o;
                    str = str14;
                    file3 = file8;
                    C32446OooOOOo.OooO0O0(obj);
                    str2 = (String) obj;
                    String mimeType2 = o00000o3.f98985OooO00o.getMimeType();
                    iHashCode = mimeType2.hashCode();
                    CloudMetaRemoteEntity cloudMetaRemoteEntity2 = o00000o3.f98985OooO00o;
                    if (iHashCode != 393630974) {
                    }
                    c26791OoooOoO4.getClass();
                    driveSnapshotCacheEntityOooOoOO = OooOoOO(str10, file4);
                    if (driveSnapshotCacheEntityOooOoOO == null) {
                    }
                    break;
                case 4:
                    str10 = (String) c26799Oooooo0.f92692OooOo;
                    c26791OoooOoO4 = (C26791OoooOoO) c26799Oooooo0.f92693OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0oO);
                    file4 = (File) objOooO0oO;
                    c26791OoooOoO4.getClass();
                    driveSnapshotCacheEntityOooOoOO = OooOoOO(str10, file4);
                    if (driveSnapshotCacheEntityOooOoOO == null) {
                    }
                    break;
                case 5:
                    dateTime = c26799Oooooo0.f92700OooOooo;
                    str8 = c26799Oooooo0.f92699OooOooO;
                    str9 = c26799Oooooo0.f92697OooOoo;
                    linkedHashMap = c26799Oooooo0.f92698OooOoo0;
                    str2 = c26799Oooooo0.f92696OooOoOO;
                    str7 = c26799Oooooo0.f92694OooOoO;
                    str = (String) c26799Oooooo0.f92695OooOoO0;
                    file3 = (java.io.File) c26799Oooooo0.f92692OooOo;
                    c26791OoooOoO3 = (C26791OoooOoO) c26799Oooooo0.f92693OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooO0oO);
                        str5 = "uploadContent: fileId ";
                        str6 = "GoogleDriveBackend";
                        objOooO00o = (File) objOooO0oO;
                        break;
                    } catch (Throwable th6) {
                        th = th6;
                        str5 = "uploadContent: fileId ";
                        str6 = "GoogleDriveBackend";
                        objOooO00o = C32446OooOOOo.OooO00o(th);
                        DateTime dateTime3222 = dateTime;
                        String str13222 = str8;
                        str10 = str2;
                        c26791OoooOoO4 = c26791OoooOoO3;
                        thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                        if (thOooO00o == null) {
                        }
                    }
                    DateTime dateTime32222 = dateTime;
                    String str132222 = str8;
                    str10 = str2;
                    c26791OoooOoO4 = c26791OoooOoO3;
                    thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                    if (thOooO00o == null) {
                    }
                    break;
                case 6:
                    str10 = (String) c26799Oooooo0.f92692OooOo;
                    c26791OoooOoO4 = (C26791OoooOoO) c26799Oooooo0.f92693OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0oO);
                    objOooO00o = (File) objOooO0oO;
                    file4 = (File) objOooO00o;
                    c26791OoooOoO4.getClass();
                    driveSnapshotCacheEntityOooOoOO = OooOoOO(str10, file4);
                    if (driveSnapshotCacheEntityOooOoOO == null) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th7) {
            return C32446OooOOOo.OooO00o(th7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOO(java.io.File file, String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26785OoooO00 c26785OoooO00;
        if (abstractC32479OooO0OO instanceof C26785OoooO00) {
            c26785OoooO00 = (C26785OoooO00) abstractC32479OooO0OO;
            int i = c26785OoooO00.f92626OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26785OoooO00.f92626OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26785OoooO00 = new C26785OoooO00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26785OoooO00.f92625OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26785OoooO00.f92626OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                java.io.File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                C26759OooOOoo c26759OooOOoo = this.f92651OooO0OO;
                c26785OoooO00.f92626OooOoO0 = 1;
                c26759OooOOoo.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26746OooO0o(c26759OooOOoo, str, file, null), c26785OoooO00);
                if (objOooO0o != obj2) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26772Oooo c26772Oooo;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C26772Oooo) {
            c26772Oooo = (C26772Oooo) abstractC32479OooO0OO;
            int i = c26772Oooo.f92577OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26772Oooo.f92577OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26772Oooo = new C26772Oooo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26772Oooo.f92575OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26772Oooo.f92577OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26759OooOOoo c26759OooOOoo = this.f92651OooO0OO;
                c26772Oooo.f92576OooOo0o = str;
                c26772Oooo.f92577OooOoO = 1;
                c26759OooOOoo.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26747OooO0o0(c26759OooOOoo, str, null), c26772Oooo);
                if (objOooO0o != obj2) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c26772Oooo.f92576OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            objOooO00o = C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(thOooO00o, androidx.core.app.OooO.OooO0O0(c20358OooO00o, "GoogleDriveBackend", "deleteFile failed for ", str), new Object[0]);
        }
        return objOooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo(String str, java.io.File file, String str2, long j, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26784OoooO0 c26784OoooO0;
        if (abstractC32479OooO0OO instanceof C26784OoooO0) {
            c26784OoooO0 = (C26784OoooO0) abstractC32479OooO0OO;
            int i = c26784OoooO0.f92623OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26784OoooO0.f92623OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26784OoooO0 = new C26784OoooO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26784OoooO0.f92622OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26784OoooO0.f92623OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                java.io.File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                C26759OooOOoo c26759OooOOoo = this.f92651OooO0OO;
                c26784OoooO0.f92623OooOoO0 = 1;
                c26759OooOOoo.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26749OooO0oo(c26759OooOOoo, file, str, j, interfaceC32507OooOO0o, null), c26784OoooO0);
                if (objOooO0o != obj2) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf A[Catch: all -> 0x00d3, TryCatch #1 {all -> 0x00d3, blocks: (B:47:0x00b9, B:49:0x00bf, B:52:0x00cb, B:53:0x00d2, B:56:0x00d5, B:58:0x00d9, B:60:0x00e4, B:61:0x00f7, B:62:0x00f8, B:46:0x00b5), top: B:69:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5 A[Catch: all -> 0x00d3, TryCatch #1 {all -> 0x00d3, blocks: (B:47:0x00b9, B:49:0x00bf, B:52:0x00cb, B:53:0x00d2, B:56:0x00d5, B:58:0x00d9, B:60:0x00e4, B:61:0x00f7, B:62:0x00f8, B:46:0x00b5), top: B:69:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000oOoO o000oooo2;
        Object objOooOo0;
        C26791OoooOoO c26791OoooOoO;
        Object objOooO;
        C26791OoooOoO c26791OoooOoO2;
        Throwable thOooO00o;
        String str2;
        Throwable th;
        String str3;
        Object objOooO0o0;
        Object objOooO00o;
        Throwable thOooO00o2;
        if (abstractC32479OooO0OO instanceof o000oOoO) {
            o000oooo2 = (o000oOoO) abstractC32479OooO0OO;
            int i = o000oooo2.f92709OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000oooo2.f92709OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                o000oooo2 = new o000oOoO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o000oooo2.f92706OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000oooo2.f92709OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o000oooo2.f92705OooOo0o = this;
            o000oooo2.f92704OooOo = str;
            o000oooo2.f92709OooOoo0 = 1;
            objOooOo0 = OooOo0(o000oooo2);
            if (objOooOo0 != enumC32485OooO00o) {
                c26791OoooOoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c26791OoooOoO2 = o000oooo2.f92707OooOoO0;
                str2 = o000oooo2.f92704OooOo;
                str3 = (String) o000oooo2.f92705OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    objOooO00o = (File) obj;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        objOooO00o = C32446OooOOOo.OooO00o(th);
                    } catch (Throwable th3) {
                        return C32446OooOOOo.OooO00o(th3);
                    }
                }
                thOooO00o2 = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o2 != null) {
                    c26791OoooOoO2.getClass();
                    DriveSnapshotCacheEntity driveSnapshotCacheEntityOooOoOO = OooOoOO(str2, (File) objOooO00o);
                    if (driveSnapshotCacheEntityOooOoOO != null) {
                        return driveSnapshotCacheEntityOooOoOO;
                    }
                    throw new IllegalStateException("fetchFileSnapshot: cannot convert File to snapshot");
                }
                if (!(thOooO00o2 instanceof GoogleJsonResponseException) || ((GoogleJsonResponseException) thOooO00o2).getStatusCode() != 404) {
                    throw thOooO00o2;
                }
                throw new o0OO000.OooOO0("1007", "File not found: " + str3, thOooO00o2);
            }
            str = o000oooo2.f92704OooOo;
            c26791OoooOoO = (C26791OoooOoO) o000oooo2.f92705OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO = ((C32445OooOOOO) obj).f116639OooOo0o;
            C26791OoooOoO c26791OoooOoO3 = c26791OoooOoO;
            String str4 = str;
            c26791OoooOoO2 = c26791OoooOoO3;
            thOooO00o = C32445OooOOOO.OooO00o(objOooO);
            if (thOooO00o == null) {
                return C32446OooOOOo.OooO00o(new IllegalStateException("Google Drive no driveId", thOooO00o));
            }
            String str5 = (String) objOooO;
            try {
                C26759OooOOoo c26759OooOOoo = c26791OoooOoO2.f92651OooO0OO;
                o000oooo2.f92705OooOo0o = str4;
                o000oooo2.f92704OooOo = str5;
                o000oooo2.f92707OooOoO0 = c26791OoooOoO2;
                o000oooo2.f92709OooOoo0 = 3;
                objOooO0o0 = c26759OooOOoo.OooO0o0(str4, o000oooo2);
            } catch (Throwable th4) {
                str2 = str5;
                th = th4;
                str3 = str4;
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
            if (objOooO0o0 != enumC32485OooO00o) {
                str2 = str5;
                obj = objOooO0o0;
                str3 = str4;
                objOooO00o = (File) obj;
                thOooO00o2 = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o2 != null) {
                }
            }
            return enumC32485OooO00o;
        }
        str = o000oooo2.f92704OooOo;
        c26791OoooOoO = (C26791OoooOoO) o000oooo2.f92705OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooOo0 = ((C32445OooOOOO) obj).f116639OooOo0o;
        if (objOooOo0 instanceof C32445OooOOOO.OooO00o) {
            Throwable thOooO00o3 = C32445OooOOOO.OooO00o(objOooOo0);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o3);
            return C32446OooOOOo.OooO00o(thOooO00o3);
        }
        o000oooo2.f92705OooOo0o = c26791OoooOoO;
        o000oooo2.f92704OooOo = str;
        o000oooo2.f92709OooOoo0 = 2;
        objOooO = c26791OoooOoO.OooO(o000oooo2);
        if (objOooO != enumC32485OooO00o) {
            C26791OoooOoO c26791OoooOoO32 = c26791OoooOoO;
            String str42 = str;
            c26791OoooOoO2 = c26791OoooOoO32;
            thOooO00o = C32445OooOOOO.OooO00o(objOooO);
            if (thOooO00o == null) {
            }
        }
        return enumC32485OooO00o;
    }

    @Override // o0OOooO0.o00000
    public final Object OooOOoo(CloudAuthRequest cloudAuthRequest, C27904OooOo c27904OooOo) {
        return this.f92650OooO0O0.OooO0O0(c27904OooOo);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26783OoooO c26783OoooO;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C26791OoooOoO c26791OoooOoO;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Throwable th;
        String str;
        InterfaceC33895OooO00o interfaceC33895OooO00o3;
        C26791OoooOoO c26791OoooOoO2;
        File file;
        C26791OoooOoO c26791OoooOoO3;
        if (abstractC32479OooO0OO instanceof C26783OoooO) {
            c26783OoooO = (C26783OoooO) abstractC32479OooO0OO;
            int i = c26783OoooO.f92620OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26783OoooO.f92620OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26783OoooO = new C26783OoooO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c26783OoooO.f92619OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26783OoooO.f92620OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0OO);
                c26783OoooO.f92617OooOo0o = this;
                interfaceC33895OooO00o = this.f92655OooO0oO;
                c26783OoooO.f92616OooOo = interfaceC33895OooO00o;
                c26783OoooO.f92620OooOoOO = 1;
                if (interfaceC33895OooO00o.OooO00o(c26783OoooO) != enumC32485OooO00o) {
                    c26791OoooOoO = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC33895OooO00o2 = c26783OoooO.f92616OooOo;
                    c26791OoooOoO3 = c26783OoooO.f92617OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooO0OO);
                        String id = ((File) objOooO0OO).getId();
                        c26791OoooOoO2 = c26791OoooOoO3;
                        str = id;
                        c26791OoooOoO2.f92656OooO0oo = str;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(str);
                        interfaceC33895OooO00o = interfaceC33895OooO00o2;
                        interfaceC33895OooO00o.OooOOO0(null);
                        return str;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        throw th;
                    }
                }
                interfaceC33895OooO00o3 = c26783OoooO.f92616OooOo;
                c26791OoooOoO2 = c26783OoooO.f92617OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0OO);
                    file = (File) oOo000Oo.OooOo.Oooo((List) objOooO0OO);
                    if (file != null && (id = file.getId()) != null) {
                        interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                        str = id;
                        c26791OoooOoO2.f92656OooO0oo = str;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(str);
                        interfaceC33895OooO00o = interfaceC33895OooO00o2;
                        interfaceC33895OooO00o.OooOOO0(null);
                        return str;
                    }
                    C26759OooOOoo c26759OooOOoo = c26791OoooOoO2.f92651OooO0OO;
                    c26783OoooO.f92617OooOo0o = c26791OoooOoO2;
                    c26783OoooO.f92616OooOo = interfaceC33895OooO00o3;
                    c26783OoooO.f92620OooOoOO = 3;
                    objOooO0OO = c26759OooOOoo.OooO0OO("NoteInDataSync", c26783OoooO);
                    if (objOooO0OO != enumC32485OooO00o) {
                        interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                        c26791OoooOoO3 = c26791OoooOoO2;
                        String id2 = ((File) objOooO0OO).getId();
                        c26791OoooOoO2 = c26791OoooOoO3;
                        str = id2;
                        c26791OoooOoO2.f92656OooO0oo = str;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(str);
                        interfaceC33895OooO00o = interfaceC33895OooO00o2;
                        interfaceC33895OooO00o.OooOOO0(null);
                        return str;
                    }
                    return enumC32485OooO00o;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o4 = c26783OoooO.f92616OooOo;
            c26791OoooOoO = c26783OoooO.f92617OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            interfaceC33895OooO00o = interfaceC33895OooO00o4;
            str = c26791OoooOoO.f92656OooO0oo;
            if (str != null) {
                interfaceC33895OooO00o.OooOOO0(null);
                return str;
            }
            C26759OooOOoo c26759OooOOoo2 = c26791OoooOoO.f92651OooO0OO;
            c26783OoooO.f92617OooOo0o = c26791OoooOoO;
            c26783OoooO.f92616OooOo = interfaceC33895OooO00o;
            c26783OoooO.f92620OooOoOO = 2;
            c26759OooOOoo2.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26755OooOOOO(c26759OooOOoo2, "mimeType = 'application/vnd.google-apps.folder' and name = 'NoteInDataSync' and trashed = false", null), c26783OoooO);
            if (objOooO0o != enumC32485OooO00o) {
                interfaceC33895OooO00o3 = interfaceC33895OooO00o;
                objOooO0OO = objOooO0o;
                c26791OoooOoO2 = c26791OoooOoO;
                file = (File) oOo000Oo.OooOo.Oooo((List) objOooO0OO);
                if (file != null) {
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                    str = id2;
                    c26791OoooOoO2.f92656OooO0oo = str;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(str);
                    interfaceC33895OooO00o = interfaceC33895OooO00o2;
                    interfaceC33895OooO00o.OooOOO0(null);
                    return str;
                }
                C26759OooOOoo c26759OooOOoo3 = c26791OoooOoO2.f92651OooO0OO;
                c26783OoooO.f92617OooOo0o = c26791OoooOoO2;
                c26783OoooO.f92616OooOo = interfaceC33895OooO00o3;
                c26783OoooO.f92620OooOoOO = 3;
                objOooO0OO = c26759OooOOoo3.OooO0OO("NoteInDataSync", c26783OoooO);
                if (objOooO0OO != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        } catch (Throwable th4) {
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            th = th4;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r2.OooOo(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26786OoooO0O c26786OoooO0O;
        Object objOooO0Oo;
        C26791OoooOoO c26791OoooOoO;
        if (abstractC32479OooO0OO instanceof C26786OoooO0O) {
            c26786OoooO0O = (C26786OoooO0O) abstractC32479OooO0OO;
            int i = c26786OoooO0O.f92629OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26786OoooO0O.f92629OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26786OoooO0O = new C26786OoooO0O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26786OoooO0O.f92627OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26786OoooO0O.f92629OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26773Oooo0 c26773Oooo0 = this.f92650OooO0O0;
                c26786OoooO0O.f92628OooOo0o = this;
                c26786OoooO0O.f92629OooOoO = 1;
                objOooO0Oo = c26773Oooo0.OooO0Oo();
                if (objOooO0Oo == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c26791OoooOoO = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                c26791OoooOoO = c26786OoooO0O.f92628OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0Oo = ((C32445OooOOOO) obj).f116639OooOo0o;
            }
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            c26786OoooO0O.f92628OooOo0o = null;
            c26786OoooO0O.f92629OooOoO = 2;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    @Override // o0OOooO0.o00000
    public final InterfaceC33721OooO0o<String> OooOo00() {
        C26773Oooo0 c26773Oooo0 = this.f92650OooO0O0;
        return new C26769OooOoo0(new C33737OooOo00(new C26768OooOoo(c26773Oooo0, null), c26773Oooo0.f92581OooO0O0.getData()), c26773Oooo0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo0O(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26779Oooo0o c26779Oooo0o;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C26791OoooOoO c26791OoooOoO;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Throwable th;
        C26791OoooOoO c26791OoooOoO2;
        if (abstractC32479OooO0OO instanceof C26779Oooo0o) {
            c26779Oooo0o = (C26779Oooo0o) abstractC32479OooO0OO;
            int i = c26779Oooo0o.f92607OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26779Oooo0o.f92607OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26779Oooo0o = new C26779Oooo0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26779Oooo0o.f92606OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26779Oooo0o.f92607OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c26779Oooo0o.f92604OooOo0o = this;
                interfaceC33895OooO00o = this.f92654OooO0o0;
                c26779Oooo0o.f92603OooOo = interfaceC33895OooO00o;
                c26779Oooo0o.f92607OooOoOO = 1;
                if (interfaceC33895OooO00o.OooO00o(c26779Oooo0o) != enumC32485OooO00o) {
                    c26791OoooOoO = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = c26779Oooo0o.f92603OooOo;
                c26791OoooOoO2 = c26779Oooo0o.f92604OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    c26791OoooOoO2.f92653OooO0o = null;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = c26779Oooo0o.f92603OooOo;
            c26791OoooOoO = c26779Oooo0o.f92604OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO0OooO00o = C28051OooO00o.OooO00o(c26791OoooOoO.f92649OooO00o);
            C26781Oooo0oO c26781Oooo0oO = new C26781Oooo0oO(2, null);
            c26779Oooo0o.f92604OooOo0o = c26791OoooOoO;
            c26779Oooo0o.f92603OooOo = interfaceC33895OooO00o;
            c26779Oooo0o.f92607OooOoOO = 2;
            if (C24332OooO.OooO00o(oooOO0OooO00o, c26781Oooo0oO, c26779Oooo0o) != enumC32485OooO00o) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                c26791OoooOoO2 = c26791OoooOoO;
                c26791OoooOoO2.f92653OooO0o = null;
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        } catch (Throwable th3) {
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            th = th3;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }

    public final String OooOo0o(String str, String str2) {
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f92649OooO00o;
        if (str2 == null || str2.length() == 0) {
            return o0Oo0oo.OooO0Oo(abstractApplicationC26277OooOoOO.getString(R.string.note_title_default), C18115b5.CONNECTOR, str);
        }
        String input = o0Oo0oo.OooO0Oo(str2, C18115b5.CONNECTOR, str);
        List listOooOO0o = C34429OooOOo0.OooOO0o(".pptx", ".ppt", ".pdf", ".doc", ".docx");
        Iterator it = listOooOO0o.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (C33595OooOOo.OooOOo0(input, (String) it.next(), false)) {
                break;
            }
            i++;
        }
        if (i > -1) {
            input = C33595OooOOo.OooOo0O(input, (String) listOooOO0o.get(i), "");
        }
        Pattern patternCompile = Pattern.compile("[<>|:\"*?/\\\\]");
        kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile, "compile(...)");
        kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
        String strReplaceAll = patternCompile.matcher(input).replaceAll("");
        kotlin.jvm.internal.OooOOO0.OooO0o(strReplaceAll, "replaceAll(...)");
        if (strReplaceAll.length() != 0) {
            return strReplaceAll;
        }
        String string = abstractApplicationC26277OooOoOO.getString(R.string.note_title_default);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26795OooooO0 c26795OooooO0;
        C26791OoooOoO c26791OoooOoO;
        C33898OooO0Oo c33898OooO0Oo;
        if (abstractC32479OooO0OO instanceof C26795OooooO0) {
            c26795OooooO0 = (C26795OooooO0) abstractC32479OooO0OO;
            int i = c26795OooooO0.f92677OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26795OooooO0.f92677OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26795OooooO0 = new C26795OooooO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26795OooooO0.f92676OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26795OooooO0.f92677OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c26795OooooO0.f92674OooOo0o = this;
            C33898OooO0Oo c33898OooO0Oo2 = this.f92655OooO0oO;
            c26795OooooO0.f92673OooOo = c33898OooO0Oo2;
            c26795OooooO0.f92677OooOoOO = 1;
            if (c33898OooO0Oo2.OooO00o(c26795OooooO0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26791OoooOoO = this;
            c33898OooO0Oo = c33898OooO0Oo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33898OooO0Oo = c26795OooooO0.f92673OooOo;
            c26791OoooOoO = c26795OooooO0.f92674OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            c26791OoooOoO.f92656OooO0oo = null;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c33898OooO0Oo.OooOOO0(null);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            c33898OooO0Oo.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoO0(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26792OoooOoo c26792OoooOoo;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C26791OoooOoO c26791OoooOoO;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Throwable th;
        String str;
        C26791OoooOoO c26791OoooOoO2;
        if (abstractC32479OooO0OO instanceof C26792OoooOoo) {
            c26792OoooOoo = (C26792OoooOoo) abstractC32479OooO0OO;
            int i = c26792OoooOoo.f92666OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26792OoooOoo.f92666OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26792OoooOoo = new C26792OoooOoo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26792OoooOoo.f92665OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26792OoooOoo.f92666OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c26792OoooOoo.f92663OooOo0o = this;
                interfaceC33895OooO00o = this.f92654OooO0o0;
                c26792OoooOoo.f92662OooOo = interfaceC33895OooO00o;
                c26792OoooOoo.f92666OooOoOO = 1;
                if (interfaceC33895OooO00o.OooO00o(c26792OoooOoo) != enumC32485OooO00o) {
                    c26791OoooOoO = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = c26792OoooOoo.f92662OooOo;
                c26791OoooOoO2 = c26792OoooOoo.f92663OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    c26791OoooOoO2.f92653OooO0o = (String) obj;
                    str = (String) obj;
                    interfaceC33895OooO00o = interfaceC33895OooO00o2;
                    interfaceC33895OooO00o.OooOOO0(null);
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = c26792OoooOoo.f92662OooOo;
            c26791OoooOoO = c26792OoooOoo.f92663OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            str = c26791OoooOoO.f92653OooO0o;
            if (str == null) {
                C26794Ooooo0o c26794Ooooo0o = new C26794Ooooo0o(C28051OooO00o.OooO00o(c26791OoooOoO.f92649OooO00o).getData(), 0);
                c26792OoooOoo.f92663OooOo0o = c26791OoooOoO;
                c26792OoooOoo.f92662OooOo = interfaceC33895OooO00o;
                c26792OoooOoo.f92666OooOoOO = 2;
                Object objOooOOo = C25252OooO0Oo.OooOOo(c26794Ooooo0o, c26792OoooOoo);
                if (objOooOOo != enumC32485OooO00o) {
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                    obj = objOooOOo;
                    c26791OoooOoO2 = c26791OoooOoO;
                    c26791OoooOoO2.f92653OooO0o = (String) obj;
                    str = (String) obj;
                    interfaceC33895OooO00o = interfaceC33895OooO00o2;
                }
                return enumC32485OooO00o;
            }
            interfaceC33895OooO00o.OooOOO0(null);
            return str;
        } catch (Throwable th3) {
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            th = th3;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoo0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26796OooooOO c26796OooooOO;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C26791OoooOoO c26791OoooOoO;
        Throwable th;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        String str2;
        C26791OoooOoO c26791OoooOoO2;
        if (abstractC32479OooO0OO instanceof C26796OooooOO) {
            c26796OooooOO = (C26796OooooOO) abstractC32479OooO0OO;
            int i = c26796OooooOO.f92683OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26796OooooOO.f92683OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26796OooooOO = new C26796OooooOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26796OooooOO.f92680OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26796OooooOO.f92683OooOoo0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c26796OooooOO.f92679OooOo0o = this;
                c26796OooooOO.f92678OooOo = str;
                interfaceC33895OooO00o = this.f92654OooO0o0;
                c26796OooooOO.f92681OooOoO0 = interfaceC33895OooO00o;
                c26796OooooOO.f92683OooOoo0 = 1;
                if (interfaceC33895OooO00o.OooO00o(c26796OooooOO) != enumC32485OooO00o) {
                    c26791OoooOoO = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = c26796OooooOO.f92681OooOoO0;
                str2 = c26796OooooOO.f92678OooOo;
                c26791OoooOoO2 = c26796OooooOO.f92679OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    c26791OoooOoO2.f92653OooO0o = str2;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = c26796OooooOO.f92681OooOoO0;
            String str3 = c26796OooooOO.f92678OooOo;
            c26791OoooOoO = c26796OooooOO.f92679OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            str = str3;
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO0OooO00o = C28051OooO00o.OooO00o(c26791OoooOoO.f92649OooO00o);
            C26797OooooOo c26797OooooOo = new C26797OooooOo(str, null);
            c26796OooooOO.f92679OooOo0o = c26791OoooOoO;
            c26796OooooOO.f92678OooOo = str;
            c26796OooooOO.f92681OooOoO0 = interfaceC33895OooO00o;
            c26796OooooOO.f92683OooOoo0 = 2;
            if (C24332OooO.OooO00o(oooOO0OooO00o, c26797OooooOo, c26796OooooOO) != enumC32485OooO00o) {
                str2 = str;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                c26791OoooOoO2 = c26791OoooOoO;
                c26791OoooOoO2.f92653OooO0o = str2;
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        } catch (Throwable th3) {
            InterfaceC33895OooO00o interfaceC33895OooO00o4 = interfaceC33895OooO00o;
            th = th3;
            interfaceC33895OooO00o2 = interfaceC33895OooO00o4;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }

    @Override // o0OOooO0.o00000
    public final EnumC27285OooO getType() {
        return this.f92652OooO0Oo;
    }
}
