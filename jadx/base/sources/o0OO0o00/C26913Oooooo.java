package o0OO0o00;

import Oooo0oO.o0Oo0oo;
import android.content.Context;
import android.util.Base64;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.huawei.cloud.base.http.HttpResponseException;
import com.huawei.cloud.base.util.DateTime;
import com.huawei.cloud.services.drive.model.About;
import com.huawei.cloud.services.drive.model.Change;
import com.huawei.cloud.services.drive.model.File;
import com.huawei.cloud.services.drive.model.HistoryVersion;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import com.orion.notein.data.p602db.entity.cloudsync.DriveSnapshotCacheEntity;
import com.orion.notein.domain.mapper.NoteHistoryVersionMapper;
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
import java.io.FileOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24034Oooo00O;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24340OooO0oo;
import o00o00O0.C25252OooO0Oo;
import o0OOo0Oo.EnumC27285OooO;
import o0OOooO0.C27904OooOo;
import o0OOooO0.o00000;
import o0OOooO0.o00000O;
import o0OOooO0.o00000O0;
import o0Oo00o.C28028OooO0o;
import o0Oo0O00.C28051OooO00o;
import o0OoOOO0.C29078Oooo00O;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33596OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o0OO0o00.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26913Oooooo implements o00000 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f93372OooOO0 = C24340OooO0oo.OooO0o0("hw_drive_cursor");

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f93373OooOO0O = C24340OooO0oo.OooO0o0("hw_cloud_storage_quota_capacity");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public String f93374OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f93375OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C26889Oooo f93376OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OO0o00.OooO00o f93377OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final NoteHistoryVersionMapper f93378OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33898OooO0Oo f93379OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final EnumC27285OooO f93380OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f93381OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33898OooO0Oo f93382OooO0oo;

    /* JADX INFO: renamed from: o0OO0o00.Oooooo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSyncBackend", m80623f = "HuaweiDriveSyncBackend.kt", m80624l = {438}, m80625m = "fetchNoteHistoryVersions-gIAlu-s")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f93384OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f93385OooOoO0;

        public OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
            super(abstractC32479OooO0OO);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f93384OooOo0o = obj;
            this.f93385OooOoO0 |= Integer.MIN_VALUE;
            Object objOooOOO = C26913Oooooo.this.OooOOO(null, this);
            return objOooOOO == EnumC32485OooO00o.f116726OooOo0o ? objOooOOO : new C32445OooOOOO(objOooOOO);
        }
    }

    /* JADX INFO: renamed from: o0OO0o00.Oooooo$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSyncBackend$fetchNoteHistoryVersions$2", m80623f = "HuaweiDriveSyncBackend.kt", m80624l = {442}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends List<? extends NoteHistoryVersion>>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f93386OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f93387OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C26913Oooooo f93388OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f93389OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, C26913Oooooo c26913Oooooo, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f93389OooOoO0 = str;
            this.f93388OooOoO = c26913Oooooo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f93389OooOoO0, this.f93388OooOoO, continuation);
            oooO0O0.f93386OooOo = obj;
            return oooO0O0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends List<? extends NoteHistoryVersion>>> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Object objOooO00o;
            C26913Oooooo c26913Oooooo;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f93387OooOo0o;
            try {
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "HuaweiDriveBackend", "getNoteHistoryVersions, fileId is ");
                    String str = this.f93389OooOoO0;
                    sbOooO0O0.append(str);
                    c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
                    C26913Oooooo c26913Oooooo2 = this.f93388OooOoO;
                    o0OO0o00.OooO00o oooO00o = c26913Oooooo2.f93377OooO0OO;
                    this.f93386OooOo = c26913Oooooo2;
                    this.f93387OooOo0o = 1;
                    Object objOooO0Oo = oooO00o.OooO0Oo(str, this);
                    if (objOooO0Oo == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    c26913Oooooo = c26913Oooooo2;
                    obj = objOooO0Oo;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c26913Oooooo = (C26913Oooooo) this.f93386OooOo;
                    C32446OooOOOo.OooO0O0(obj);
                }
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(c26913Oooooo.f93378OooO0Oo.toNoteHistoryVersion((HistoryVersion) it.next()));
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (arrayList.isEmpty()) {
                    objOooO00o = arrayList;
                } else {
                    List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(oOo000Oo.OooOo.Oooo0oO(arrayList));
                    List listSubList = arrayList.subList(1, arrayList.size());
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listSubList) {
                        if (jCurrentTimeMillis - ((NoteHistoryVersion) obj2).getEditedTime() < 2592000000L) {
                            arrayList2.add(obj2);
                        }
                    }
                    objOooO00o = oOo000Oo.OooOo.OooooOO(listOooO0oO, arrayList2);
                }
            } catch (Throwable th) {
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
            return new C32445OooOOOO(objOooO00o);
        }
    }

    /* JADX INFO: renamed from: o0OO0o00.Oooooo$OooO0OO */
    public static final class OooO0OO implements InterfaceC33721OooO0o<NoteCloudQuota> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f93390OooOo0o;

        /* JADX INFO: renamed from: o0OO0o00.Oooooo$OooO0OO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f93391OooOo0o;

            /* JADX INFO: renamed from: o0OO0o00.Oooooo$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSyncBackend$getCloudQuotaFlow$$inlined$map$1$2", m80623f = "HuaweiDriveSyncBackend.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19824OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f93392OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f93393OooOo0o;

                public C19824OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f93393OooOo0o = obj;
                    this.f93392OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f93391OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19824OooO00o c19824OooO00o;
                if (continuation instanceof C19824OooO00o) {
                    c19824OooO00o = (C19824OooO00o) continuation;
                    int i = c19824OooO00o.f93392OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19824OooO00o.f93392OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19824OooO00o = new C19824OooO00o(continuation);
                    }
                }
                Object obj2 = c19824OooO00o.f93393OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19824OooO00o.f93392OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(C26913Oooooo.f93373OooOO0O);
                    NoteCloudQuota noteCloudQuota = (str == null || str.length() == 0) ? null : (NoteCloudQuota) C28028OooO0o.OooO00o().fromJson(str, (Class) NoteCloudQuota.class);
                    c19824OooO00o.f93392OooOo = 1;
                    if (this.f93391OooOo0o.emit(noteCloudQuota, c19824OooO00o) == enumC32485OooO00o) {
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

        public OooO0OO(InterfaceC33721OooO0o interfaceC33721OooO0o) {
            this.f93390OooOo0o = interfaceC33721OooO0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super NoteCloudQuota> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f93390OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    public C26913Oooooo(Context context, C26889Oooo sessionManager, o0OO0o00.OooO00o huaweiCloudService, NoteHistoryVersionMapper historyVersionMapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sessionManager, "sessionManager");
        kotlin.jvm.internal.OooOOO0.OooO0oO(huaweiCloudService, "huaweiCloudService");
        kotlin.jvm.internal.OooOOO0.OooO0oO(historyVersionMapper, "historyVersionMapper");
        this.f93375OooO00o = context;
        this.f93376OooO0O0 = sessionManager;
        this.f93377OooO0OO = huaweiCloudService;
        this.f93378OooO0Oo = historyVersionMapper;
        this.f93380OooO0o0 = EnumC27285OooO.f95075OooOo;
        this.f93379OooO0o = C33900OooO0o0.OooO00o();
        this.f93382OooO0oo = C33900OooO0o0.OooO00o();
    }

    public static LinkedHashMap OooOo0O(CloudMetaRemoteEntity cloudMetaRemoteEntity) {
        LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO(cloudMetaRemoteEntity.toCloudProperties());
        String str = (String) linkedHashMapOooOOOO.get(NoteMeta.PROPERTY_TITLE);
        if (str == null) {
            str = "";
        }
        String strOooOoo0 = OooOoo0(str);
        String str2 = null;
        if (str.length() != 0 && !str.equals(strOooOoo0)) {
            Charset charset = C33580OooO00o.f121231OooO0O0;
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.OooOOO0.OooO0o(bytes, "getBytes(...)");
            String strEncodeToString = Base64.encodeToString(bytes, 2);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(strEncodeToString);
            byte[] bytes2 = strEncodeToString.getBytes(charset);
            kotlin.jvm.internal.OooOOO0.OooO0o(bytes2, "getBytes(...)");
            if (bytes2.length <= 256) {
                str2 = strEncodeToString;
            }
        }
        if (str2 != null) {
            linkedHashMapOooOOOO.put("title_b64", str2);
        }
        linkedHashMapOooOOOO.put(NoteMeta.PROPERTY_TITLE, strOooOoo0);
        for (Map.Entry entry : linkedHashMapOooOOOO.entrySet()) {
            entry.setValue(OooOoo0((String) entry.getValue()));
        }
        return linkedHashMapOooOOOO;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DriveSnapshotCacheEntity OooOoo(String str, File file) {
        String str2;
        Map<String, String> properties;
        String str3;
        DateTime editedTime;
        long j;
        long j2;
        long value;
        String str4;
        String str5;
        int iHashCode;
        Object objOooO00o;
        Long lOooOOO;
        String id = file.getId();
        String noteId = null;
        if (id != null) {
            String mimeType = file.getMimeType();
            if (mimeType != null) {
                int iHashCode2 = mimeType.hashCode();
                if (iHashCode2 == -2039968287) {
                    if (mimeType.equals("application/vnd.notein-apps.dbfile")) {
                        str2 = CloudMime.NOTE;
                    }
                    properties = file.getProperties();
                    if (properties == null) {
                    }
                    Map<String, String> map = properties;
                    DateTime createdTime = file.getCreatedTime();
                    if (createdTime == null) {
                    }
                    str3 = map.get(NoteMeta.PROPERTY_LAST_MODIFICATION_TIME);
                    if (str3 != null) {
                    }
                    str4 = map.get("title_b64");
                    if (str4 == null) {
                    }
                    String str6 = map.get(NoteMeta.PROPERTY_NOTE_ID);
                    String str7 = map.get(Folder.PROPERTY_FOLDER_ID);
                    String str8 = map.get(MyTemplate.PROPERTY_TEMPLATE_ID);
                    String str9 = map.get(NoteMeta.PROPERTY_PARENT_ID);
                    String str10 = map.get(NoteMeta.PROPERTY_FAVORITE);
                    if (str10 != null) {
                    }
                    if (str5 == null) {
                    }
                    String str11 = str5;
                    String str12 = map.get(NoteMeta.PROPERTY_IN_TRASH_BIN);
                    if (str12 != null) {
                    }
                    String str13 = map.get("dbVersion");
                    if (str13 != null) {
                    }
                    String str14 = map.get(NoteMeta.PROPERTY_SORT_KEY);
                    if (str14 != null) {
                    }
                    String str15 = map.get(NoteMeta.PROPERTY_USING_OWN_PDF);
                    if (str15 != null) {
                    }
                    String str16 = map.get(NoteMeta.PROPERTY_LOCK_ADDED);
                    CloudMetaExtra cloudMetaExtra = new CloudMetaExtra(str6, str8, str7, Long.valueOf(j), str9, boolValueOf, str11, boolValueOf, str2, (Long) null, Long.valueOf(value), Long.valueOf(j), numOooOOO0, numOooOOO0, boolValueOf, str16 != null ? Boolean.valueOf(Boolean.parseBoolean(str16)) : null, (String) null, 66048, (C24018OooO0oo) null);
                    iHashCode = str2.hashCode();
                    if (iHashCode != 393630974) {
                    }
                    String str17 = noteId;
                    long j3 = j;
                    CloudContentTag cloudContentTag = new CloudContentTag(file.getSha256(), (String) null, j3, 2, (C24018OooO0oo) null);
                    long size = file.size();
                    boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(file.getRecycled(), Boolean.TRUE);
                    DateTime recycledTime = file.getRecycledTime();
                    return new DriveSnapshotCacheEntity(id, str, str17, str2, cloudContentTag, cloudMetaExtra, size, value, j3, zOooO0O0, recycledTime != null ? recycledTime.getValue() : 0L);
                }
                if (iHashCode2 == -1214862943) {
                    if (mimeType.equals("application/vnd.notein-apps.template")) {
                        str2 = CloudMime.TEMPLATE;
                    }
                    properties = file.getProperties();
                    if (properties == null) {
                    }
                    Map<String, String> map2 = properties;
                    DateTime createdTime2 = file.getCreatedTime();
                    if (createdTime2 == null) {
                    }
                    str3 = map2.get(NoteMeta.PROPERTY_LAST_MODIFICATION_TIME);
                    if (str3 != null) {
                        editedTime = file.getEditedTime();
                        if (editedTime != null) {
                        }
                    }
                    str4 = map2.get("title_b64");
                    if (str4 == null) {
                    }
                    String str62 = map2.get(NoteMeta.PROPERTY_NOTE_ID);
                    String str72 = map2.get(Folder.PROPERTY_FOLDER_ID);
                    String str82 = map2.get(MyTemplate.PROPERTY_TEMPLATE_ID);
                    String str92 = map2.get(NoteMeta.PROPERTY_PARENT_ID);
                    String str102 = map2.get(NoteMeta.PROPERTY_FAVORITE);
                    if (str102 != null) {
                    }
                    if (str5 == null) {
                    }
                    String str112 = str5;
                    String str122 = map2.get(NoteMeta.PROPERTY_IN_TRASH_BIN);
                    if (str122 != null) {
                    }
                    String str132 = map2.get("dbVersion");
                    if (str132 != null) {
                    }
                    String str142 = map2.get(NoteMeta.PROPERTY_SORT_KEY);
                    if (str142 != null) {
                    }
                    String str152 = map2.get(NoteMeta.PROPERTY_USING_OWN_PDF);
                    if (str152 != null) {
                    }
                    String str162 = map2.get(NoteMeta.PROPERTY_LOCK_ADDED);
                    CloudMetaExtra cloudMetaExtra2 = new CloudMetaExtra(str62, str82, str72, Long.valueOf(j), str92, boolValueOf, str112, boolValueOf, str2, (Long) null, Long.valueOf(value), Long.valueOf(j), numOooOOO0, numOooOOO0, boolValueOf, str162 != null ? Boolean.valueOf(Boolean.parseBoolean(str162)) : null, (String) null, 66048, (C24018OooO0oo) null);
                    iHashCode = str2.hashCode();
                    if (iHashCode != 393630974) {
                    }
                    String str172 = noteId;
                    long j32 = j;
                    CloudContentTag cloudContentTag2 = new CloudContentTag(file.getSha256(), (String) null, j32, 2, (C24018OooO0oo) null);
                    long size2 = file.size();
                    boolean zOooO0O02 = kotlin.jvm.internal.OooOOO0.OooO0O0(file.getRecycled(), Boolean.TRUE);
                    DateTime recycledTime2 = file.getRecycledTime();
                    return new DriveSnapshotCacheEntity(id, str, str172, str2, cloudContentTag2, cloudMetaExtra2, size2, value, j32, zOooO0O02, recycledTime2 != null ? recycledTime2.getValue() : 0L);
                }
                if (iHashCode2 == -956902466 && mimeType.equals("application/vnd.notein-apps.folders")) {
                    str2 = CloudMime.FOLDER;
                }
                properties = file.getProperties();
                if (properties == null) {
                    properties = C34436OooOoOO.f123455OooOo0o;
                }
                Map<String, String> map22 = properties;
                DateTime createdTime22 = file.getCreatedTime();
                long value2 = createdTime22 == null ? createdTime22.getValue() : 0L;
                str3 = map22.get(NoteMeta.PROPERTY_LAST_MODIFICATION_TIME);
                if (str3 != null || (lOooOOO = C33596OooOOo0.OooOOO(str3)) == null) {
                    editedTime = file.getEditedTime();
                    if (editedTime != null) {
                        j = 0;
                        str4 = map22.get("title_b64");
                        if (str4 == null || str4.length() == 0) {
                            str5 = null;
                        } else {
                            try {
                                byte[] bArrDecode = Base64.decode(str4, 2);
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(bArrDecode);
                                objOooO00o = new String(bArrDecode, C33580OooO00o.f121231OooO0O0);
                            } catch (Throwable th) {
                                objOooO00o = C32446OooOOOo.OooO00o(th);
                            }
                            if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                                objOooO00o = null;
                            }
                            str5 = (String) objOooO00o;
                        }
                        String str622 = map22.get(NoteMeta.PROPERTY_NOTE_ID);
                        String str722 = map22.get(Folder.PROPERTY_FOLDER_ID);
                        String str822 = map22.get(MyTemplate.PROPERTY_TEMPLATE_ID);
                        String str922 = map22.get(NoteMeta.PROPERTY_PARENT_ID);
                        String str1022 = map22.get(NoteMeta.PROPERTY_FAVORITE);
                        Boolean boolValueOf = str1022 != null ? Boolean.valueOf(Boolean.parseBoolean(str1022)) : null;
                        if (str5 == null) {
                            str5 = map22.get(NoteMeta.PROPERTY_TITLE);
                        }
                        String str1122 = str5;
                        String str1222 = map22.get(NoteMeta.PROPERTY_IN_TRASH_BIN);
                        Boolean boolValueOf2 = str1222 != null ? Boolean.valueOf(Boolean.parseBoolean(str1222)) : null;
                        String str1322 = map22.get("dbVersion");
                        Integer numOooOOO0 = str1322 != null ? C33596OooOOo0.OooOOO0(str1322) : null;
                        String str1422 = map22.get(NoteMeta.PROPERTY_SORT_KEY);
                        Integer numOooOOO02 = str1422 != null ? C33596OooOOo0.OooOOO0(str1422) : null;
                        String str1522 = map22.get(NoteMeta.PROPERTY_USING_OWN_PDF);
                        Boolean boolValueOf3 = str1522 != null ? Boolean.valueOf(Boolean.parseBoolean(str1522)) : null;
                        String str1622 = map22.get(NoteMeta.PROPERTY_LOCK_ADDED);
                        CloudMetaExtra cloudMetaExtra22 = new CloudMetaExtra(str622, str822, str722, Long.valueOf(j), str922, boolValueOf, str1122, boolValueOf2, str2, (Long) null, Long.valueOf(value2), Long.valueOf(j), numOooOOO0, numOooOOO02, boolValueOf3, str1622 != null ? Boolean.valueOf(Boolean.parseBoolean(str1622)) : null, (String) null, 66048, (C24018OooO0oo) null);
                        iHashCode = str2.hashCode();
                        if (iHashCode != 393630974) {
                            if (iHashCode != 1600536058) {
                                if (iHashCode == 1883341446 && str2.equals(CloudMime.TEMPLATE)) {
                                    noteId = cloudMetaExtra22.getTemplateId();
                                }
                            } else if (str2.equals(CloudMime.FOLDER)) {
                                noteId = cloudMetaExtra22.getFolderId();
                            }
                        } else if (str2.equals(CloudMime.NOTE)) {
                            noteId = cloudMetaExtra22.getNoteId();
                        }
                        String str1722 = noteId;
                        long j322 = j;
                        CloudContentTag cloudContentTag22 = new CloudContentTag(file.getSha256(), (String) null, j322, 2, (C24018OooO0oo) null);
                        long size22 = file.size();
                        boolean zOooO0O022 = kotlin.jvm.internal.OooOOO0.OooO0O0(file.getRecycled(), Boolean.TRUE);
                        DateTime recycledTime22 = file.getRecycledTime();
                        return new DriveSnapshotCacheEntity(id, str, str1722, str2, cloudContentTag22, cloudMetaExtra22, size22, value2, j322, zOooO0O022, recycledTime22 != null ? recycledTime22.getValue() : 0L);
                    }
                    j2 = 1000;
                    value = editedTime.getValue() / j2;
                } else {
                    long jLongValue = lOooOOO.longValue();
                    if (jLongValue <= 10000000000L) {
                        jLongValue *= (long) 1000;
                    }
                    j2 = 1000;
                    value = jLongValue / j2;
                }
                j = value * j2;
                str4 = map22.get("title_b64");
                if (str4 == null) {
                    str5 = null;
                }
                String str6222 = map22.get(NoteMeta.PROPERTY_NOTE_ID);
                String str7222 = map22.get(Folder.PROPERTY_FOLDER_ID);
                String str8222 = map22.get(MyTemplate.PROPERTY_TEMPLATE_ID);
                String str9222 = map22.get(NoteMeta.PROPERTY_PARENT_ID);
                String str10222 = map22.get(NoteMeta.PROPERTY_FAVORITE);
                if (str10222 != null) {
                }
                if (str5 == null) {
                }
                String str11222 = str5;
                String str12222 = map22.get(NoteMeta.PROPERTY_IN_TRASH_BIN);
                if (str12222 != null) {
                }
                String str13222 = map22.get("dbVersion");
                if (str13222 != null) {
                }
                String str14222 = map22.get(NoteMeta.PROPERTY_SORT_KEY);
                if (str14222 != null) {
                }
                String str15222 = map22.get(NoteMeta.PROPERTY_USING_OWN_PDF);
                if (str15222 != null) {
                }
                String str16222 = map22.get(NoteMeta.PROPERTY_LOCK_ADDED);
                CloudMetaExtra cloudMetaExtra222 = new CloudMetaExtra(str6222, str8222, str7222, Long.valueOf(j), str9222, boolValueOf, str11222, boolValueOf2, str2, (Long) null, Long.valueOf(value2), Long.valueOf(j), numOooOOO0, numOooOOO02, boolValueOf3, str16222 != null ? Boolean.valueOf(Boolean.parseBoolean(str16222)) : null, (String) null, 66048, (C24018OooO0oo) null);
                iHashCode = str2.hashCode();
                if (iHashCode != 393630974) {
                }
                String str17222 = noteId;
                long j3222 = j;
                CloudContentTag cloudContentTag222 = new CloudContentTag(file.getSha256(), (String) null, j3222, 2, (C24018OooO0oo) null);
                long size222 = file.size();
                boolean zOooO0O0222 = kotlin.jvm.internal.OooOOO0.OooO0O0(file.getRecycled(), Boolean.TRUE);
                DateTime recycledTime222 = file.getRecycledTime();
                return new DriveSnapshotCacheEntity(id, str, str17222, str2, cloudContentTag222, cloudMetaExtra222, size222, value2, j3222, zOooO0O0222, recycledTime222 != null ? recycledTime222.getValue() : 0L);
            }
            String mimeType2 = file.getMimeType();
            if (mimeType2 != null) {
                str2 = mimeType2;
                properties = file.getProperties();
                if (properties == null) {
                }
                Map<String, String> map222 = properties;
                DateTime createdTime222 = file.getCreatedTime();
                if (createdTime222 == null) {
                }
                str3 = map222.get(NoteMeta.PROPERTY_LAST_MODIFICATION_TIME);
                if (str3 != null) {
                }
                str4 = map222.get("title_b64");
                if (str4 == null) {
                }
                String str62222 = map222.get(NoteMeta.PROPERTY_NOTE_ID);
                String str72222 = map222.get(Folder.PROPERTY_FOLDER_ID);
                String str82222 = map222.get(MyTemplate.PROPERTY_TEMPLATE_ID);
                String str92222 = map222.get(NoteMeta.PROPERTY_PARENT_ID);
                String str102222 = map222.get(NoteMeta.PROPERTY_FAVORITE);
                if (str102222 != null) {
                }
                if (str5 == null) {
                }
                String str112222 = str5;
                String str122222 = map222.get(NoteMeta.PROPERTY_IN_TRASH_BIN);
                if (str122222 != null) {
                }
                String str132222 = map222.get("dbVersion");
                if (str132222 != null) {
                }
                String str142222 = map222.get(NoteMeta.PROPERTY_SORT_KEY);
                if (str142222 != null) {
                }
                String str152222 = map222.get(NoteMeta.PROPERTY_USING_OWN_PDF);
                if (str152222 != null) {
                }
                String str162222 = map222.get(NoteMeta.PROPERTY_LOCK_ADDED);
                CloudMetaExtra cloudMetaExtra2222 = new CloudMetaExtra(str62222, str82222, str72222, Long.valueOf(j), str92222, boolValueOf, str112222, boolValueOf2, str2, (Long) null, Long.valueOf(value2), Long.valueOf(j), numOooOOO0, numOooOOO02, boolValueOf3, str162222 != null ? Boolean.valueOf(Boolean.parseBoolean(str162222)) : null, (String) null, 66048, (C24018OooO0oo) null);
                iHashCode = str2.hashCode();
                if (iHashCode != 393630974) {
                }
                String str172222 = noteId;
                long j32222 = j;
                CloudContentTag cloudContentTag2222 = new CloudContentTag(file.getSha256(), (String) null, j32222, 2, (C24018OooO0oo) null);
                long size2222 = file.size();
                boolean zOooO0O02222 = kotlin.jvm.internal.OooOOO0.OooO0O0(file.getRecycled(), Boolean.TRUE);
                DateTime recycledTime2222 = file.getRecycledTime();
                return new DriveSnapshotCacheEntity(id, str, str172222, str2, cloudContentTag2222, cloudMetaExtra2222, size2222, value2, j32222, zOooO0O02222, recycledTime2222 != null ? recycledTime2222.getValue() : 0L);
            }
        }
        return null;
    }

    public static String OooOoo0(String str) {
        int iCharCount = 0;
        if (str.length() != 0) {
            StringBuilder sb = new StringBuilder();
            int iCharCount2 = 0;
            while (iCharCount2 < str.length()) {
                int iCodePointAt = str.codePointAt(iCharCount2);
                if (iCodePointAt != 65039 && iCodePointAt != 8205 && ((126976 > iCodePointAt || iCodePointAt >= 129792) && ((9728 > iCodePointAt || iCodePointAt >= 10176) && ((127462 > iCodePointAt || iCodePointAt >= 127488) && ((11088 > iCodePointAt || iCodePointAt >= 11094) && ((8986 > iCodePointAt || iCodePointAt >= 8988) && ((9193 > iCodePointAt || iCodePointAt >= 9204) && ((9208 > iCodePointAt || iCodePointAt >= 9211) && ((10548 > iCodePointAt || iCodePointAt >= 10550) && ((11013 > iCodePointAt || iCodePointAt >= 11016) && (11035 > iCodePointAt || iCodePointAt >= 11037))))))))))) {
                    sb.appendCodePoint(iCodePointAt);
                }
                iCharCount2 += Character.charCount(iCodePointAt);
            }
            str = sb.toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(str, "toString(...)");
        }
        if (str.length() != 0) {
            byte[] bytes = str.getBytes(C33580OooO00o.f121231OooO0O0);
            kotlin.jvm.internal.OooOOO0.OooO0o(bytes, "getBytes(...)");
            if (bytes.length > 256) {
                StringBuilder sb2 = new StringBuilder();
                int length = 0;
                while (iCharCount < str.length() && length < 256) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    char[] chars = Character.toChars(iCodePointAt2);
                    kotlin.jvm.internal.OooOOO0.OooO0o(chars, "toChars(...)");
                    byte[] bytes2 = new String(chars).getBytes(C33580OooO00o.f121231OooO0O0);
                    kotlin.jvm.internal.OooOOO0.OooO0o(bytes2, "getBytes(...)");
                    length += bytes2.length;
                    if (length > 256) {
                        break;
                    }
                    sb2.appendCodePoint(iCodePointAt2);
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                String string = sb2.toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                return string;
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00Oo0 o00oo02;
        if (abstractC32479OooO0OO instanceof o00Oo0) {
            o00oo02 = (o00Oo0) abstractC32479OooO0OO;
            int i = o00oo02.f93415OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oo02.f93415OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                o00oo02 = new o00Oo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = o00oo02.f93414OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00oo02.f93415OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooOOo);
                C26889Oooo c26889Oooo = this.f93376OooO0O0;
                o00oo02.f93415OooOoO0 = 1;
                objOooOOo = C25252OooO0Oo.OooOOo(new C29078Oooo00O(c26889Oooo.f93265OooO0O0.getData(), 2), o00oo02);
                if (objOooOOo == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooOOo);
            }
            String str = (String) objOooOOo;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Huawei session not initialized");
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    @Override // o0OOooO0.o00000
    public final InterfaceC33721OooO0o<NoteCloudQuota> OooO00o() {
        return new OooO0OO(C28051OooO00o.OooO00o(this.f93375OooO00o).getData());
    }

    @Override // o0OOooO0.o00000
    public final InterfaceC33721OooO0o<Boolean> OooO0O0() {
        return new C26894Oooo0o(this.f93376OooO0O0.f93265OooO0O0.getData(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1 */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26915OoooooO c26915OoooooO;
        Object objOooO00o;
        C26913Oooooo c26913Oooooo;
        Throwable thOooO00o;
        Long usedSpace;
        Long userCapacity;
        Object objOooO0Oo;
        C26913Oooooo c26913Oooooo2;
        if (abstractC32479OooO0OO instanceof C26915OoooooO) {
            c26915OoooooO = (C26915OoooooO) abstractC32479OooO0OO;
            int i = c26915OoooooO.f93403OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26915OoooooO.f93403OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26915OoooooO = new C26915OoooooO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26915OoooooO.f93401OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26915OoooooO.f93403OooOoO;
        try {
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
            c26913Oooooo = i2;
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            c26915OoooooO.f93402OooOo0o = this;
            c26915OoooooO.f93403OooOoO = 1;
            objOooO0Oo = this.f93376OooO0O0.OooO0Oo(c26915OoooooO);
            if (objOooO0Oo != enumC32485OooO00o) {
                c26913Oooooo2 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                NoteCloudQuota noteCloudQuota = (NoteCloudQuota) c26915OoooooO.f93402OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                return noteCloudQuota;
            }
            C26913Oooooo c26913Oooooo3 = (C26913Oooooo) c26915OoooooO.f93402OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            i2 = c26913Oooooo3;
            objOooO00o = (About.StorageQuota) objOooO0o;
            c26913Oooooo = i2;
            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o == null) {
                return C32446OooOOOo.OooO00o(thOooO00o);
            }
            About.StorageQuota storageQuota = (About.StorageQuota) objOooO00o;
            long jLongValue = 0;
            long jLongValue2 = (storageQuota == null || (userCapacity = storageQuota.getUserCapacity()) == null) ? 0L : userCapacity.longValue();
            if (storageQuota != null && (usedSpace = storageQuota.getUsedSpace()) != null) {
                jLongValue = usedSpace.longValue();
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("HuaweiDriveBackend");
            c20358OooO00o.OooO00o("getRemainSpace: userCapacity=" + jLongValue2 + ", usedSpace=" + jLongValue, new Object[0]);
            NoteCloudQuota noteCloudQuota2 = new NoteCloudQuota(jLongValue2, jLongValue);
            String json = C28028OooO0o.OooO00o().toJson(noteCloudQuota2);
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO0OooO00o = C28051OooO00o.OooO00o(c26913Oooooo.f93375OooO00o);
            C26916Ooooooo c26916Ooooooo = new C26916Ooooooo(json, null);
            c26915OoooooO.f93402OooOo0o = noteCloudQuota2;
            c26915OoooooO.f93403OooOoO = 3;
            return C24332OooO.OooO00o(oooOO0OooO00o, c26916Ooooooo, c26915OoooooO) == enumC32485OooO00o ? enumC32485OooO00o : noteCloudQuota2;
        }
        C26913Oooooo c26913Oooooo4 = (C26913Oooooo) c26915OoooooO.f93402OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o);
        objOooO0Oo = ((C32445OooOOOO) objOooO0o).f116639OooOo0o;
        c26913Oooooo2 = c26913Oooooo4;
        if (objOooO0Oo instanceof C32445OooOOOO.OooO00o) {
            Throwable thOooO00o2 = C32445OooOOOO.OooO00o(objOooO0Oo);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o2);
            return C32446OooOOOo.OooO00o(thOooO00o2);
        }
        o0OO0o00.OooO00o oooO00o = c26913Oooooo2.f93377OooO0OO;
        c26915OoooooO.f93402OooOo0o = c26913Oooooo2;
        c26915OoooooO.f93403OooOoO = 2;
        oooO00o.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26876OooOOo(oooO00o, null), c26915OoooooO);
        i2 = c26913Oooooo2;
        if (objOooO0o == enumC32485OooO00o) {
        }
        objOooO00o = (About.StorageQuota) objOooO0o;
        c26913Oooooo = i2;
        thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        if (r9 == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:40:0x00b6, B:37:0x009c), top: B:44:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0Oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000oOoO o000oooo2;
        Object objOooO0Oo;
        C26913Oooooo c26913Oooooo;
        C26913Oooooo c26913Oooooo2;
        int i = 2;
        if (abstractC32479OooO0OO instanceof o000oOoO) {
            o000oooo2 = (o000oOoO) abstractC32479OooO0OO;
            int i2 = o000oooo2.f93409OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o000oooo2.f93409OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                o000oooo2 = new o000oOoO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = o000oooo2.f93407OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = o000oooo2.f93409OooOoO;
        try {
            if (i3 == 0) {
                C32446OooOOOo.OooO0O0(objOooOOo);
                o000oooo2.f93408OooOo0o = this;
                o000oooo2.f93409OooOoO = 1;
                objOooO0Oo = this.f93376OooO0O0.OooO0Oo(o000oooo2);
                if (objOooO0Oo != enumC32485OooO00o) {
                    c26913Oooooo = this;
                }
                return enumC32485OooO00o;
            }
            if (i3 == 1) {
                c26913Oooooo = o000oooo2.f93408OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOo);
                objOooO0Oo = ((C32445OooOOOO) objOooOOo).f116639OooOo0o;
            } else {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(objOooOOo);
                    Boolean bool = (Boolean) objOooOOo;
                    bool.getClass();
                    return bool;
                }
                c26913Oooooo2 = o000oooo2.f93408OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOo);
                if (((String) objOooOOo) != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("HuaweiDriveBackend");
                    c20358OooO00o.OooO00o("checkServiceAvailable: not authorized", new Object[0]);
                    return Boolean.FALSE;
                }
                o0OO0o00.OooO00o oooO00o = c26913Oooooo2.f93377OooO0OO;
                o000oooo2.f93408OooOo0o = null;
                o000oooo2.f93409OooOoO = 3;
                oooO00o.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooOOo = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OO0o00.OooO0OO(oooO00o, null), o000oooo2);
            }
            if (objOooO0Oo instanceof C32445OooOOOO.OooO00o) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("HuaweiDriveBackend");
                c20358OooO00o2.OooO00o("checkServiceAvailable: init failed", new Object[0]);
                return Boolean.FALSE;
            }
            C26889Oooo c26889Oooo = c26913Oooooo.f93376OooO0O0;
            o000oooo2.f93408OooOo0o = c26913Oooooo;
            o000oooo2.f93409OooOoO = 2;
            objOooOOo = C25252OooO0Oo.OooOOo(new C29078Oooo00O(c26889Oooo.f93265OooO0O0.getData(), i), o000oooo2);
            if (objOooOOo != enumC32485OooO00o) {
                c26913Oooooo2 = c26913Oooooo;
                if (((String) objOooOOo) != null) {
                }
            }
            return enumC32485OooO00o;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    @Override // o0OOooO0.o00000
    public final boolean OooO0o() {
        return this.f93376OooO0O0.f93267OooO0Oo.get();
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
        C26902OoooOO0 c26902OoooOO0;
        Object objOooOo0;
        C26913Oooooo c26913Oooooo;
        Object objOooOOo0;
        if (abstractC32479OooO0OO instanceof C26902OoooOO0) {
            c26902OoooOO0 = (C26902OoooOO0) abstractC32479OooO0OO;
            int i = c26902OoooOO0.f93326OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26902OoooOO0.f93326OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26902OoooOO0 = new C26902OoooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26902OoooOO0.f93325OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26902OoooOO0.f93326OooOoOO;
        boolean z = true;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c26902OoooOO0.f93323OooOo0o = this;
                c26902OoooOO0.f93322OooOo = str;
                c26902OoooOO0.f93326OooOoOO = 1;
                objOooOo0 = OooOo0(c26902OoooOO0);
                if (objOooOo0 != enumC32485OooO00o) {
                    c26913Oooooo = this;
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
            str = c26902OoooOO0.f93322OooOo;
            c26913Oooooo = c26902OoooOO0.f93323OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooOo0 = ((C32445OooOOOO) obj).f116639OooOo0o;
            if (objOooOo0 instanceof C32445OooOOOO.OooO00o) {
                Throwable thOooO00o2 = C32445OooOOOO.OooO00o(objOooOo0);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o2);
                return C32446OooOOOo.OooO00o(thOooO00o2);
            }
            c26902OoooOO0.f93323OooOo0o = null;
            c26902OoooOO0.f93322OooOo = null;
            c26902OoooOO0.f93326OooOoOO = 2;
            objOooOOo0 = c26913Oooooo.OooOOo0(str, c26902OoooOO0);
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:16:0x0036, B:55:0x011a, B:58:0x0126, B:59:0x012e, B:23:0x0055, B:51:0x00e7, B:26:0x006d, B:46:0x00c9, B:47:0x00cf, B:29:0x007c, B:36:0x009b, B:38:0x00a3, B:42:0x00b2, B:32:0x0087), top: B:62:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, CloudMetaRemoteEntity cloudMetaRemoteEntity, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00oO0o o00oo0o;
        Object obj;
        C26913Oooooo c26913Oooooo;
        String str2;
        File file;
        CloudMetaRemoteEntity cloudMetaRemoteEntity2;
        C26913Oooooo c26913Oooooo2;
        String str3;
        File file2;
        String str4;
        Serializable serializableOooO;
        String str5;
        File file3;
        C26913Oooooo c26913Oooooo3;
        Object obj2;
        CloudMetaRemoteEntity cloudMetaRemoteEntity3;
        Object objOooO0oO;
        String str6;
        DriveSnapshotCacheEntity driveSnapshotCacheEntityOooOoo;
        if (abstractC32479OooO0OO instanceof o00oO0o) {
            o00oo0o = (o00oO0o) abstractC32479OooO0OO;
            int i = o00oo0o.f93434OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oo0o.f93434OooOooO = i - Integer.MIN_VALUE;
            } else {
                o00oo0o = new o00oO0o(this, abstractC32479OooO0OO);
            }
        }
        o00oO0o o00oo0o2 = o00oo0o;
        Object obj3 = o00oo0o2.f93433OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00oo0o2.f93434OooOooO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj3);
                o0OO0o00.OooO00o oooO00o = this.f93377OooO0OO;
                o00oo0o2.f93428OooOo0o = str;
                o00oo0o2.f93427OooOo = cloudMetaRemoteEntity;
                o00oo0o2.f93430OooOoO0 = this;
                o00oo0o2.f93434OooOooO = 1;
                Object objOooO0o0 = oooO00o.OooO0o0(str, o00oo0o2);
                if (objOooO0o0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                obj = objOooO0o0;
                c26913Oooooo = this;
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        file = o00oo0o2.f93429OooOoO;
                        c26913Oooooo2 = o00oo0o2.f93430OooOoO0;
                        cloudMetaRemoteEntity2 = (CloudMetaRemoteEntity) o00oo0o2.f93427OooOo;
                        str2 = (String) o00oo0o2.f93428OooOo0o;
                        C32446OooOOOo.OooO0O0(obj3);
                        C26913Oooooo c26913Oooooo4 = c26913Oooooo2;
                        file2 = file;
                        str4 = (String) obj3;
                        c26913Oooooo = c26913Oooooo4;
                        o00oo0o2.f93428OooOo0o = str2;
                        o00oo0o2.f93427OooOo = cloudMetaRemoteEntity2;
                        o00oo0o2.f93430OooOoO0 = c26913Oooooo;
                        o00oo0o2.f93429OooOoO = file2;
                        o00oo0o2.f93431OooOoOO = str4;
                        o00oo0o2.f93434OooOooO = 3;
                        serializableOooO = c26913Oooooo.OooO(o00oo0o2);
                        if (serializableOooO == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                        str5 = str4;
                        file3 = file2;
                        c26913Oooooo3 = c26913Oooooo;
                        obj2 = serializableOooO;
                        cloudMetaRemoteEntity3 = cloudMetaRemoteEntity2;
                        C32446OooOOOo.OooO0O0(obj2);
                        String str7 = (String) obj2;
                        o0OO0o00.OooO00o oooO00o2 = c26913Oooooo3.f93377OooO0OO;
                        CloudMetaRemoteEntity cloudMetaRemoteEntity4 = cloudMetaRemoteEntity3;
                        String fileName = file3.getFileName();
                        kotlin.jvm.internal.OooOOO0.OooO0o(fileName, "getFileName(...)");
                        LinkedHashMap linkedHashMapOooOo0O = OooOo0O(cloudMetaRemoteEntity4);
                        String mimeType = file3.getMimeType();
                        o00oo0o2.f93428OooOo0o = c26913Oooooo3;
                        o00oo0o2.f93427OooOo = str7;
                        o00oo0o2.f93430OooOoO0 = null;
                        o00oo0o2.f93429OooOoO = null;
                        o00oo0o2.f93431OooOoOO = null;
                        o00oo0o2.f93434OooOooO = 4;
                        objOooO0oO = oooO00o2.OooO0oO(str2, fileName, null, str5, linkedHashMapOooOo0O, mimeType, null, o00oo0o2);
                        if (objOooO0oO != enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str6 = (String) o00oo0o2.f93427OooOo;
                        c26913Oooooo3 = (C26913Oooooo) o00oo0o2.f93428OooOo0o;
                        C32446OooOOOo.OooO0O0(obj3);
                        c26913Oooooo3.getClass();
                        driveSnapshotCacheEntityOooOoo = OooOoo(str6, (File) obj3);
                        if (driveSnapshotCacheEntityOooOoo == null) {
                            return driveSnapshotCacheEntityOooOoo;
                        }
                        throw new IllegalStateException("uploadMeta: unable to convert updated file to snapshot");
                    }
                    String str8 = o00oo0o2.f93431OooOoOO;
                    File file4 = o00oo0o2.f93429OooOoO;
                    C26913Oooooo c26913Oooooo5 = o00oo0o2.f93430OooOoO0;
                    cloudMetaRemoteEntity3 = (CloudMetaRemoteEntity) o00oo0o2.f93427OooOo;
                    str2 = (String) o00oo0o2.f93428OooOo0o;
                    C32446OooOOOo.OooO0O0(obj3);
                    obj2 = ((C32445OooOOOO) obj3).f116639OooOo0o;
                    str5 = str8;
                    file3 = file4;
                    c26913Oooooo3 = c26913Oooooo5;
                    C32446OooOOOo.OooO0O0(obj2);
                    String str72 = (String) obj2;
                    o0OO0o00.OooO00o oooO00o22 = c26913Oooooo3.f93377OooO0OO;
                    CloudMetaRemoteEntity cloudMetaRemoteEntity42 = cloudMetaRemoteEntity3;
                    String fileName2 = file3.getFileName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(fileName2, "getFileName(...)");
                    LinkedHashMap linkedHashMapOooOo0O2 = OooOo0O(cloudMetaRemoteEntity42);
                    String mimeType2 = file3.getMimeType();
                    o00oo0o2.f93428OooOo0o = c26913Oooooo3;
                    o00oo0o2.f93427OooOo = str72;
                    o00oo0o2.f93430OooOoO0 = null;
                    o00oo0o2.f93429OooOoO = null;
                    o00oo0o2.f93431OooOoOO = null;
                    o00oo0o2.f93434OooOooO = 4;
                    objOooO0oO = oooO00o22.OooO0oO(str2, fileName2, null, str5, linkedHashMapOooOo0O2, mimeType2, null, o00oo0o2);
                    if (objOooO0oO != enumC32485OooO00o) {
                        obj3 = objOooO0oO;
                        str6 = str72;
                        c26913Oooooo3.getClass();
                        driveSnapshotCacheEntityOooOoo = OooOoo(str6, (File) obj3);
                        if (driveSnapshotCacheEntityOooOoo == null) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                C26913Oooooo c26913Oooooo6 = o00oo0o2.f93430OooOoO0;
                cloudMetaRemoteEntity = (CloudMetaRemoteEntity) o00oo0o2.f93427OooOo;
                String str9 = (String) o00oo0o2.f93428OooOo0o;
                C32446OooOOOo.OooO0O0(obj3);
                c26913Oooooo = c26913Oooooo6;
                str = str9;
                obj = obj3;
            }
            File file5 = (File) obj;
            List<String> parentFolder = file5.getParentFolder();
            if (parentFolder != null && (str3 = (String) oOo000Oo.OooOo.Oooo(parentFolder)) != null) {
                cloudMetaRemoteEntity2 = cloudMetaRemoteEntity;
                file2 = file5;
                str2 = str;
                str4 = str3;
                o00oo0o2.f93428OooOo0o = str2;
                o00oo0o2.f93427OooOo = cloudMetaRemoteEntity2;
                o00oo0o2.f93430OooOoO0 = c26913Oooooo;
                o00oo0o2.f93429OooOoO = file2;
                o00oo0o2.f93431OooOoOO = str4;
                o00oo0o2.f93434OooOooO = 3;
                serializableOooO = c26913Oooooo.OooO(o00oo0o2);
                if (serializableOooO == enumC32485OooO00o) {
                }
            }
            o00oo0o2.f93428OooOo0o = str;
            o00oo0o2.f93427OooOo = cloudMetaRemoteEntity;
            o00oo0o2.f93430OooOoO0 = c26913Oooooo;
            o00oo0o2.f93429OooOoO = file5;
            o00oo0o2.f93434OooOooO = 2;
            Object objOooOoO0 = c26913Oooooo.OooOoO0(o00oo0o2);
            if (objOooOoO0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            str2 = str;
            file = file5;
            cloudMetaRemoteEntity2 = cloudMetaRemoteEntity;
            c26913Oooooo2 = c26913Oooooo;
            obj3 = objOooOoO0;
            C26913Oooooo c26913Oooooo42 = c26913Oooooo2;
            file2 = file;
            str4 = (String) obj3;
            c26913Oooooo = c26913Oooooo42;
            o00oo0o2.f93428OooOo0o = str2;
            o00oo0o2.f93427OooOo = cloudMetaRemoteEntity2;
            o00oo0o2.f93430OooOoO0 = c26913Oooooo;
            o00oo0o2.f93429OooOoO = file2;
            o00oo0o2.f93431OooOoOO = str4;
            o00oo0o2.f93434OooOooO = 3;
            serializableOooO = c26913Oooooo.OooO(o00oo0o2);
            if (serializableOooO == enumC32485OooO00o) {
            }
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0264 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:13:0x0037, B:114:0x0297, B:18:0x0047, B:87:0x01f7, B:88:0x0205, B:90:0x020b, B:92:0x0217, B:95:0x0222, B:96:0x0226, B:97:0x0232, B:99:0x0238, B:101:0x024b, B:103:0x0251, B:104:0x0255, B:105:0x025e, B:107:0x0264, B:109:0x0270, B:110:0x0274, B:84:0x01da), top: B:120:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:21:0x0050, B:80:0x01a7, B:26:0x0060, B:54:0x0101, B:55:0x010c, B:57:0x0112, B:59:0x0125, B:61:0x0131, B:63:0x013d, B:65:0x0149, B:67:0x0155, B:69:0x0161, B:70:0x0165, B:71:0x016e, B:73:0x0174, B:75:0x0183, B:76:0x0187, B:51:0x00e4), top: B:120:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0174 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:21:0x0050, B:80:0x01a7, B:26:0x0060, B:54:0x0101, B:55:0x010c, B:57:0x0112, B:59:0x0125, B:61:0x0131, B:63:0x013d, B:65:0x0149, B:67:0x0155, B:69:0x0161, B:70:0x0165, B:71:0x016e, B:73:0x0174, B:75:0x0183, B:76:0x0187, B:51:0x00e4), top: B:120:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01da A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #1 {all -> 0x003c, blocks: (B:13:0x0037, B:114:0x0297, B:18:0x0047, B:87:0x01f7, B:88:0x0205, B:90:0x020b, B:92:0x0217, B:95:0x0222, B:96:0x0226, B:97:0x0232, B:99:0x0238, B:101:0x024b, B:103:0x0251, B:104:0x0255, B:105:0x025e, B:107:0x0264, B:109:0x0270, B:110:0x0274, B:84:0x01da), top: B:120:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020b A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:13:0x0037, B:114:0x0297, B:18:0x0047, B:87:0x01f7, B:88:0x0205, B:90:0x020b, B:92:0x0217, B:95:0x0222, B:96:0x0226, B:97:0x0232, B:99:0x0238, B:101:0x024b, B:103:0x0251, B:104:0x0255, B:105:0x025e, B:107:0x0264, B:109:0x0270, B:110:0x0274, B:84:0x01da), top: B:120:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0238 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:13:0x0037, B:114:0x0297, B:18:0x0047, B:87:0x01f7, B:88:0x0205, B:90:0x020b, B:92:0x0217, B:95:0x0222, B:96:0x0226, B:97:0x0232, B:99:0x0238, B:101:0x024b, B:103:0x0251, B:104:0x0255, B:105:0x025e, B:107:0x0264, B:109:0x0270, B:110:0x0274, B:84:0x01da), top: B:120:0x0022 }] */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26914Oooooo0 c26914Oooooo0;
        Object objOooOo0;
        C26913Oooooo c26913Oooooo;
        Object objOooO;
        Throwable thOooO00o;
        String str;
        String str2;
        Object objOooO0o;
        List list;
        Iterator it;
        Iterator it2;
        Object objOooO0o2;
        List list2;
        List list3;
        ArrayList arrayList;
        DriveSnapshotCacheEntity driveSnapshotCacheEntityOooOoo;
        if (abstractC32479OooO0OO instanceof C26914Oooooo0) {
            c26914Oooooo0 = (C26914Oooooo0) abstractC32479OooO0OO;
            int i = c26914Oooooo0.f93400OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26914Oooooo0.f93400OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26914Oooooo0 = new C26914Oooooo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o3 = c26914Oooooo0.f93397OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        try {
            try {
                switch (c26914Oooooo0.f93400OooOoo0) {
                    case 0:
                        C32446OooOOOo.OooO0O0(objOooO0o3);
                        c26914Oooooo0.f93396OooOo0o = this;
                        c26914Oooooo0.f93400OooOoo0 = 1;
                        objOooOo0 = OooOo0(c26914Oooooo0);
                        if (objOooOo0 != enumC32485OooO00o) {
                            c26913Oooooo = this;
                            if (!(objOooOo0 instanceof C32445OooOOOO.OooO00o)) {
                                Throwable thOooO00o2 = C32445OooOOOO.OooO00o(objOooOo0);
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o2);
                                return C32446OooOOOo.OooO00o(thOooO00o2);
                            }
                            c26914Oooooo0.f93396OooOo0o = c26913Oooooo;
                            c26914Oooooo0.f93400OooOoo0 = 2;
                            objOooO = c26913Oooooo.OooO(c26914Oooooo0);
                            if (objOooO != enumC32485OooO00o) {
                                thOooO00o = C32445OooOOOO.OooO00o(objOooO);
                                if (thOooO00o == null) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o.OooOOO0("HuaweiDriveBackend");
                                    c20358OooO00o.OooO0OO("fetchFileSnapshots: no driveId, not authorized", new Object[0]);
                                    return C32446OooOOOo.OooO00o(thOooO00o);
                                }
                                String str3 = (String) objOooO;
                                c26914Oooooo0.f93396OooOo0o = c26913Oooooo;
                                c26914Oooooo0.f93395OooOo = str3;
                                c26914Oooooo0.f93400OooOoo0 = 3;
                                Object objOooOoO = c26913Oooooo.OooOoO(c26914Oooooo0);
                                if (objOooOoO != enumC32485OooO00o) {
                                    str = str3;
                                    objOooO0o3 = objOooOoO;
                                    str2 = (String) objOooO0o3;
                                    if (str2 != null) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o2.OooOOO0("HuaweiDriveBackend");
                                        c20358OooO00o2.OooO0o0("fetchFileSnapshots: no cursor, performing full scan", new Object[0]);
                                        o0OO0o00.OooO00o oooO00o = c26913Oooooo.f93377OooO0OO;
                                        c26914Oooooo0.f93396OooOo0o = str;
                                        c26914Oooooo0.f93395OooOo = c26913Oooooo;
                                        c26914Oooooo0.f93400OooOoo0 = 4;
                                        oooO00o.getClass();
                                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                        objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26878OooOOoo(oooO00o, null), c26914Oooooo0);
                                        if (objOooO0o3 != enumC32485OooO00o) {
                                            ArrayList<File> arrayList2 = new ArrayList();
                                            for (Object obj : (Iterable) objOooO0o3) {
                                                File file = (File) obj;
                                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(file.getMimeType(), "application/vnd.notein-apps.dbfile") || kotlin.jvm.internal.OooOOO0.OooO0O0(file.getMimeType(), "application/vnd.notein-apps.folders") || kotlin.jvm.internal.OooOOO0.OooO0O0(file.getMimeType(), "application/vnd.notein-apps.template") || kotlin.jvm.internal.OooOOO0.OooO0O0(file.getMimeType(), CloudMime.NOTE) || kotlin.jvm.internal.OooOOO0.OooO0O0(file.getMimeType(), CloudMime.FOLDER) || kotlin.jvm.internal.OooOOO0.OooO0O0(file.getMimeType(), CloudMime.TEMPLATE)) {
                                                    arrayList2.add(obj);
                                                }
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            for (File file2 : arrayList2) {
                                                c26913Oooooo.getClass();
                                                DriveSnapshotCacheEntity driveSnapshotCacheEntityOooOoo2 = OooOoo(str, file2);
                                                if (driveSnapshotCacheEntityOooOoo2 != null) {
                                                    arrayList3.add(driveSnapshotCacheEntityOooOoo2);
                                                }
                                            }
                                            o0OO0o00.OooO00o oooO00o2 = c26913Oooooo.f93377OooO0OO;
                                            c26914Oooooo0.f93396OooOo0o = arrayList3;
                                            c26914Oooooo0.f93395OooOo = null;
                                            c26914Oooooo0.f93400OooOoo0 = 5;
                                            oooO00o2.getClass();
                                            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                                            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooOOOO(oooO00o2, null), c26914Oooooo0);
                                            if (objOooO0o == enumC32485OooO00o) {
                                                list = arrayList3;
                                                objOooO0o3 = objOooO0o;
                                                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o3.OooOOO0("HuaweiDriveBackend");
                                                c20358OooO00o3.OooO0o0("fetchFileSnapshots: full scan found " + list.size() + " files", new Object[0]);
                                                return new o00000O0(list, C34434OooOoO.f123453OooOo0o, (String) objOooO0o3);
                                            }
                                        }
                                    } else {
                                        o0OO0o00.OooO00o oooO00o3 = c26913Oooooo.f93377OooO0OO;
                                        c26914Oooooo0.f93396OooOo0o = str;
                                        c26914Oooooo0.f93395OooOo = c26913Oooooo;
                                        c26914Oooooo0.f93400OooOoo0 = 6;
                                        oooO00o3.getClass();
                                        C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                                        objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26874OooOO0o(str2, null, oooO00o3), c26914Oooooo0);
                                        if (objOooO0o3 != enumC32485OooO00o) {
                                            List list4 = (List) objOooO0o3;
                                            ArrayList arrayList4 = new ArrayList();
                                            it = list4.iterator();
                                            while (it.hasNext()) {
                                                File file3 = ((Change) it.next()).getFile();
                                                if (file3 != null) {
                                                    c26913Oooooo.getClass();
                                                    driveSnapshotCacheEntityOooOoo = OooOoo(str, file3);
                                                } else {
                                                    driveSnapshotCacheEntityOooOoo = null;
                                                }
                                                if (driveSnapshotCacheEntityOooOoo != null) {
                                                    arrayList4.add(driveSnapshotCacheEntityOooOoo);
                                                }
                                            }
                                            ArrayList arrayList5 = new ArrayList();
                                            for (Object obj2 : list4) {
                                                Change change = (Change) obj2;
                                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(change.getDeleted(), Boolean.TRUE) && change.getFileId() != null) {
                                                    arrayList5.add(obj2);
                                                }
                                            }
                                            ArrayList arrayList6 = new ArrayList();
                                            it2 = arrayList5.iterator();
                                            while (it2.hasNext()) {
                                                String fileId = ((Change) it2.next()).getFileId();
                                                if (fileId != null) {
                                                    arrayList6.add(fileId);
                                                }
                                            }
                                            o0OO0o00.OooO00o oooO00o4 = c26913Oooooo.f93377OooO0OO;
                                            c26914Oooooo0.f93396OooOo0o = list4;
                                            c26914Oooooo0.f93395OooOo = arrayList6;
                                            c26914Oooooo0.f93398OooOoO0 = arrayList4;
                                            c26914Oooooo0.f93400OooOoo0 = 7;
                                            oooO00o4.getClass();
                                            C33874OooO0OO c33874OooO0OO4 = C33649OoooOOo.f121328OooO00o;
                                            objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooOOOO(oooO00o4, null), c26914Oooooo0);
                                            if (objOooO0o2 != enumC32485OooO00o) {
                                                list2 = list4;
                                                objOooO0o3 = objOooO0o2;
                                                list3 = arrayList6;
                                                arrayList = arrayList4;
                                                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o4.OooOOO0("HuaweiDriveBackend");
                                                c20358OooO00o4.OooO0o0("fetchDelta: " + list2.size() + " changes -> " + arrayList.size() + " snapshots, " + list3.size() + " deleted", new Object[0]);
                                                return new o00000O0(arrayList, list3, (String) objOooO0o3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return enumC32485OooO00o;
                    case 1:
                        c26913Oooooo = (C26913Oooooo) c26914Oooooo0.f93396OooOo0o;
                        C32446OooOOOo.OooO0O0(objOooO0o3);
                        objOooOo0 = ((C32445OooOOOO) objOooO0o3).f116639OooOo0o;
                        if (!(objOooOo0 instanceof C32445OooOOOO.OooO00o)) {
                        }
                        break;
                    case 2:
                        c26913Oooooo = (C26913Oooooo) c26914Oooooo0.f93396OooOo0o;
                        C32446OooOOOo.OooO0O0(objOooO0o3);
                        objOooO = ((C32445OooOOOO) objOooO0o3).f116639OooOo0o;
                        thOooO00o = C32445OooOOOO.OooO00o(objOooO);
                        if (thOooO00o == null) {
                        }
                        break;
                    case 3:
                        String str4 = (String) c26914Oooooo0.f93395OooOo;
                        C26913Oooooo c26913Oooooo2 = (C26913Oooooo) c26914Oooooo0.f93396OooOo0o;
                        C32446OooOOOo.OooO0O0(objOooO0o3);
                        str = str4;
                        c26913Oooooo = c26913Oooooo2;
                        str2 = (String) objOooO0o3;
                        if (str2 != null) {
                        }
                        return enumC32485OooO00o;
                    case 4:
                        c26913Oooooo = (C26913Oooooo) c26914Oooooo0.f93395OooOo;
                        str = (String) c26914Oooooo0.f93396OooOo0o;
                        C32446OooOOOo.OooO0O0(objOooO0o3);
                        ArrayList<File> arrayList22 = new ArrayList();
                        while (r15.hasNext()) {
                        }
                        ArrayList arrayList32 = new ArrayList();
                        while (r7.hasNext()) {
                        }
                        o0OO0o00.OooO00o oooO00o22 = c26913Oooooo.f93377OooO0OO;
                        c26914Oooooo0.f93396OooOo0o = arrayList32;
                        c26914Oooooo0.f93395OooOo = null;
                        c26914Oooooo0.f93400OooOoo0 = 5;
                        oooO00o22.getClass();
                        C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
                        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooOOOO(oooO00o22, null), c26914Oooooo0);
                        if (objOooO0o == enumC32485OooO00o) {
                        }
                        break;
                    case 5:
                        list = (List) c26914Oooooo0.f93396OooOo0o;
                        C32446OooOOOo.OooO0O0(objOooO0o3);
                        C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o32.OooOOO0("HuaweiDriveBackend");
                        c20358OooO00o32.OooO0o0("fetchFileSnapshots: full scan found " + list.size() + " files", new Object[0]);
                        return new o00000O0(list, C34434OooOoO.f123453OooOo0o, (String) objOooO0o3);
                    case 6:
                        c26913Oooooo = (C26913Oooooo) c26914Oooooo0.f93395OooOo;
                        str = (String) c26914Oooooo0.f93396OooOo0o;
                        C32446OooOOOo.OooO0O0(objOooO0o3);
                        List list42 = (List) objOooO0o3;
                        ArrayList arrayList42 = new ArrayList();
                        it = list42.iterator();
                        while (it.hasNext()) {
                        }
                        ArrayList arrayList52 = new ArrayList();
                        while (r6.hasNext()) {
                        }
                        ArrayList arrayList62 = new ArrayList();
                        it2 = arrayList52.iterator();
                        while (it2.hasNext()) {
                        }
                        o0OO0o00.OooO00o oooO00o42 = c26913Oooooo.f93377OooO0OO;
                        c26914Oooooo0.f93396OooOo0o = list42;
                        c26914Oooooo0.f93395OooOo = arrayList62;
                        c26914Oooooo0.f93398OooOoO0 = arrayList42;
                        c26914Oooooo0.f93400OooOoo0 = 7;
                        oooO00o42.getClass();
                        C33874OooO0OO c33874OooO0OO42 = C33649OoooOOo.f121328OooO00o;
                        objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooOOOO(oooO00o42, null), c26914Oooooo0);
                        if (objOooO0o2 != enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    case 7:
                        arrayList = c26914Oooooo0.f93398OooOoO0;
                        list3 = (List) c26914Oooooo0.f93395OooOo;
                        list2 = (List) c26914Oooooo0.f93396OooOo0o;
                        C32446OooOOOo.OooO0O0(objOooO0o3);
                        C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o42.OooOOO0("HuaweiDriveBackend");
                        c20358OooO00o42.OooO0o0("fetchDelta: " + list2.size() + " changes -> " + arrayList.size() + " snapshots, " + list3.size() + " deleted", new Object[0]);
                        return new o00000O0(arrayList, list3, (String) objOooO0o3);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th) {
                return C32446OooOOOo.OooO00o(th);
            }
        } catch (Throwable th2) {
            return C32446OooOOOo.OooO00o(th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26905OoooOo0 c26905OoooOo0;
        if (abstractC32479OooO0OO instanceof C26905OoooOo0) {
            c26905OoooOo0 = (C26905OoooOo0) abstractC32479OooO0OO;
            int i = c26905OoooOo0.f93335OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26905OoooOo0.f93335OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26905OoooOo0 = new C26905OoooOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26905OoooOo0.f93334OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26905OoooOo0.f93335OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c26905OoooOo0.f93335OooOoO0 = 1;
                if (OooOooO(str, c26905OoooOo0) == obj2) {
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

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r6 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26911OooooOO c26911OooooOO;
        Object objOooOo0;
        C26913Oooooo c26913Oooooo;
        if (abstractC32479OooO0OO instanceof C26911OooooOO) {
            c26911OooooOO = (C26911OooooOO) abstractC32479OooO0OO;
            int i = c26911OooooOO.f93364OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26911OooooOO.f93364OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26911OooooOO = new C26911OooooOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26911OooooOO.f93362OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26911OooooOO.f93364OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0o);
                c26911OooooOO.f93363OooOo0o = this;
                c26911OooooOO.f93364OooOoO = 1;
                objOooOo0 = OooOo0(c26911OooooOO);
                if (objOooOo0 != enumC32485OooO00o) {
                    c26913Oooooo = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0o);
                return oOo000Oo.OooOo.o0OO00O((Iterable) objOooO0o);
            }
            c26913Oooooo = c26911OooooOO.f93363OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            objOooOo0 = ((C32445OooOOOO) objOooO0o).f116639OooOo0o;
            if (objOooOo0 instanceof C32445OooOOOO.OooO00o) {
                Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOo0);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
                return C32446OooOOOo.OooO00o(thOooO00o);
            }
            o0OO0o00.OooO00o oooO00o = c26913Oooooo.f93377OooO0OO;
            c26911OooooOO.f93363OooOo0o = null;
            c26911OooooOO.f93364OooOoO = 2;
            oooO00o.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooOo00(oooO00o, null), c26911OooooOO);
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r2.OooOoOO(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26898OoooO c26898OoooO;
        C26913Oooooo c26913Oooooo;
        if (abstractC32479OooO0OO instanceof C26898OoooO) {
            c26898OoooO = (C26898OoooO) abstractC32479OooO0OO;
            int i = c26898OoooO.f93311OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26898OoooO.f93311OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26898OoooO = new C26898OoooO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26898OoooO.f93309OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26898OoooO.f93311OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c26898OoooO.f93310OooOo0o = this;
            c26898OoooO.f93311OooOoO = 1;
            if (this.f93376OooO0O0.OooO0O0(c26898OoooO) != enumC32485OooO00o) {
                c26913Oooooo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            c26913Oooooo = c26898OoooO.f93310OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            c26913Oooooo = c26898OoooO.f93310OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c26898OoooO.f93310OooOo0o = null;
            c26898OoooO.f93311OooOoO = 3;
        }
        c26898OoooO.f93310OooOo0o = c26913Oooooo;
        c26898OoooO.f93311OooOoO = 2;
        if (c26913Oooooo.OooOo0o(c26898OoooO) != enumC32485OooO00o) {
            c26898OoooO.f93310OooOo0o = null;
            c26898OoooO.f93311OooOoO = 3;
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO(String str, Continuation<? super C32445OooOOOO<? extends List<NoteHistoryVersion>>> continuation) throws Throwable {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f93385OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f93385OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o((AbstractC32479OooO0OO) continuation);
            }
        }
        Object objOooO0o = oooO00o.f93384OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f93385OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooO0O0 oooO0O0 = new OooO0O0(str, this, null);
            oooO00o.f93385OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO0O0, oooO00o);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        return ((C32445OooOOOO) objOooO0o).f116639OooOo0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022e A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:17:0x0047, B:117:0x028c, B:118:0x028e, B:119:0x0290, B:122:0x029a, B:123:0x02a2, B:106:0x0226, B:109:0x022e, B:111:0x0232, B:113:0x023d, B:124:0x02a3, B:105:0x0221, B:29:0x0083, B:69:0x018a, B:32:0x0098, B:46:0x00ff, B:52:0x011a, B:63:0x0141, B:65:0x0153, B:125:0x02a4, B:126:0x02e1, B:57:0x012b, B:60:0x0136, B:35:0x00ab, B:42:0x00cd, B:38:0x00be), top: B:139:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029a A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:17:0x0047, B:117:0x028c, B:118:0x028e, B:119:0x0290, B:122:0x029a, B:123:0x02a2, B:106:0x0226, B:109:0x022e, B:111:0x0232, B:113:0x023d, B:124:0x02a3, B:105:0x0221, B:29:0x0083, B:69:0x018a, B:32:0x0098, B:46:0x00ff, B:52:0x011a, B:63:0x0141, B:65:0x0153, B:125:0x02a4, B:126:0x02e1, B:57:0x012b, B:60:0x0136, B:35:0x00ab, B:42:0x00cd, B:38:0x00be), top: B:139:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0136 A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:17:0x0047, B:117:0x028c, B:118:0x028e, B:119:0x0290, B:122:0x029a, B:123:0x02a2, B:106:0x0226, B:109:0x022e, B:111:0x0232, B:113:0x023d, B:124:0x02a3, B:105:0x0221, B:29:0x0083, B:69:0x018a, B:32:0x0098, B:46:0x00ff, B:52:0x011a, B:63:0x0141, B:65:0x0153, B:125:0x02a4, B:126:0x02e1, B:57:0x012b, B:60:0x0136, B:35:0x00ab, B:42:0x00cd, B:38:0x00be), top: B:139:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0153 A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:17:0x0047, B:117:0x028c, B:118:0x028e, B:119:0x0290, B:122:0x029a, B:123:0x02a2, B:106:0x0226, B:109:0x022e, B:111:0x0232, B:113:0x023d, B:124:0x02a3, B:105:0x0221, B:29:0x0083, B:69:0x018a, B:32:0x0098, B:46:0x00ff, B:52:0x011a, B:63:0x0141, B:65:0x0153, B:125:0x02a4, B:126:0x02e1, B:57:0x012b, B:60:0x0136, B:35:0x00ab, B:42:0x00cd, B:38:0x00be), top: B:139:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r3v21, types: [com.orion.notein.data.db.entity.cloudsync.CloudMetaRemoteEntity, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(o00000O o00000o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        oo000o oo000oVar;
        o00000O o00000o2;
        Object objOooO;
        C26913Oooooo c26913Oooooo;
        o00000O o00000o3;
        CloudMetaRemoteEntity cloudMetaRemoteEntity;
        String str;
        String str2;
        C26913Oooooo c26913Oooooo2;
        String str3;
        int iHashCode;
        String str4;
        String strOooOo;
        String str5;
        String str6;
        String str7;
        C26913Oooooo c26913Oooooo3;
        String str8;
        String str9;
        boolean z;
        String str10;
        String str11;
        o0OO0o00.OooO00o oooO00o;
        CloudMetaRemoteEntity cloudMetaRemoteEntity2;
        boolean z2;
        String str12;
        LinkedHashMap linkedHashMapOooOo0O;
        C26913Oooooo c26913Oooooo4;
        String str13;
        File file;
        ?? r3;
        Object objOooO00o;
        Throwable thOooO00o;
        DriveSnapshotCacheEntity driveSnapshotCacheEntityOooOoo;
        Object obj;
        if (abstractC32479OooO0OO instanceof oo000o) {
            oo000oVar = (oo000o) abstractC32479OooO0OO;
            int i = oo000oVar.f93452Oooo00O;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo000oVar.f93452Oooo00O = i - Integer.MIN_VALUE;
            } else {
                oo000oVar = new oo000o(this, abstractC32479OooO0OO);
            }
        }
        oo000o oo000oVar2 = oo000oVar;
        Object objOooO0oO = oo000oVar2.f93450OooOooo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo000oVar2.f93452Oooo00O;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0oO);
                o00000o2 = o00000o;
                oo000oVar2.f93443OooOo0o = o00000o2;
                oo000oVar2.f93442OooOo = this;
                oo000oVar2.f93452Oooo00O = 1;
                objOooO = OooO(oo000oVar2);
                if (objOooO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c26913Oooooo = this;
            } else if (i2 == 1) {
                C26913Oooooo c26913Oooooo5 = (C26913Oooooo) oo000oVar2.f93442OooOo;
                o00000O o00000o4 = (o00000O) oo000oVar2.f93443OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                objOooO = ((C32445OooOOOO) objOooO0oO).f116639OooOo0o;
                o00000o2 = o00000o4;
                c26913Oooooo = c26913Oooooo5;
            } else if (i2 == 2) {
                str2 = oo000oVar2.f93448OooOoo0;
                str3 = oo000oVar2.f93446OooOoOO;
                String str14 = oo000oVar2.f93444OooOoO;
                CloudMetaRemoteEntity cloudMetaRemoteEntity3 = oo000oVar2.f93445OooOoO0;
                C26913Oooooo c26913Oooooo6 = (C26913Oooooo) oo000oVar2.f93442OooOo;
                o00000O o00000o5 = (o00000O) oo000oVar2.f93443OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                o00000o3 = o00000o5;
                str = str14;
                cloudMetaRemoteEntity = cloudMetaRemoteEntity3;
                c26913Oooooo2 = c26913Oooooo6;
                String str15 = (String) objOooO0oO;
                String mimeType = cloudMetaRemoteEntity.getMimeType();
                iHashCode = mimeType.hashCode();
                if (iHashCode != 393630974) {
                    if (mimeType.equals(CloudMime.NOTE)) {
                        str4 = "application/vnd.notein-apps.dbfile";
                        String str16 = str4;
                        strOooOo = c26913Oooooo2.OooOo(str3, cloudMetaRemoteEntity.getExtra().getTitle());
                        if (str2.length() == 0) {
                        }
                        return enumC32485OooO00o;
                    }
                    CloudMetaRemoteEntity cloudMetaRemoteEntity4 = cloudMetaRemoteEntity;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("HuaweiDriveBackend");
                    c20358OooO00o.OooOO0O("uploadContent: unknown mimeType " + cloudMetaRemoteEntity4.getMimeType() + " for " + str3 + ", using NOTE default", new Object[0]);
                    throw new IllegalArgumentException("Unknown mimeType " + cloudMetaRemoteEntity4.getMimeType());
                }
                if (iHashCode == 1600536058) {
                    if (mimeType.equals(CloudMime.FOLDER)) {
                        str4 = "application/vnd.notein-apps.folders";
                        String str162 = str4;
                        strOooOo = c26913Oooooo2.OooOo(str3, cloudMetaRemoteEntity.getExtra().getTitle());
                        if (str2.length() == 0) {
                        }
                        return enumC32485OooO00o;
                    }
                    CloudMetaRemoteEntity cloudMetaRemoteEntity42 = cloudMetaRemoteEntity;
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("HuaweiDriveBackend");
                    c20358OooO00o2.OooOO0O("uploadContent: unknown mimeType " + cloudMetaRemoteEntity42.getMimeType() + " for " + str3 + ", using NOTE default", new Object[0]);
                    throw new IllegalArgumentException("Unknown mimeType " + cloudMetaRemoteEntity42.getMimeType());
                }
                if (iHashCode == 1883341446 && mimeType.equals(CloudMime.TEMPLATE)) {
                    str4 = "application/vnd.notein-apps.template";
                    String str1622 = str4;
                    strOooOo = c26913Oooooo2.OooOo(str3, cloudMetaRemoteEntity.getExtra().getTitle());
                    if (str2.length() == 0) {
                        o0OO0o00.OooO00o oooO00o2 = c26913Oooooo2.f93377OooO0OO;
                        String str17 = o00000o3.f98986OooO0O0;
                        LinkedHashMap linkedHashMapOooOo0O2 = OooOo0O(cloudMetaRemoteEntity);
                        Long l = new Long(o00000o3.f98985OooO00o.getContentTag().getLastModified());
                        oo000oVar2.f93443OooOo0o = c26913Oooooo2;
                        oo000oVar2.f93442OooOo = str;
                        oo000oVar2.f93445OooOoO0 = null;
                        oo000oVar2.f93444OooOoO = null;
                        oo000oVar2.f93446OooOoOO = null;
                        oo000oVar2.f93448OooOoo0 = null;
                        oo000oVar2.f93452Oooo00O = 3;
                        String str18 = str;
                        C26913Oooooo c26913Oooooo7 = c26913Oooooo2;
                        objOooO0oO = oooO00o2.OooO0O0(str17, strOooOo, str15, linkedHashMapOooOo0O2, str1622, l, oo000oVar2);
                        if (objOooO0oO != enumC32485OooO00o) {
                            c26913Oooooo4 = c26913Oooooo7;
                            str13 = str18;
                            file = (File) objOooO0oO;
                        }
                    } else {
                        C26913Oooooo c26913Oooooo8 = c26913Oooooo2;
                        String str19 = str;
                        String str20 = str15;
                        boolean z3 = false;
                        boolean z4 = false;
                        try {
                            oooO00o = c26913Oooooo8.f93377OooO0OO;
                            try {
                                str12 = o00000o3.f98986OooO0O0;
                                linkedHashMapOooOo0O = OooOo0O(cloudMetaRemoteEntity);
                            } catch (Throwable th) {
                                th = th;
                                str5 = "HuaweiDriveBackend";
                                cloudMetaRemoteEntity2 = cloudMetaRemoteEntity;
                                str6 = str19;
                            }
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                                str5 = "HuaweiDriveBackend";
                                cloudMetaRemoteEntity2 = cloudMetaRemoteEntity;
                                str6 = str19;
                                z4 = false;
                                str7 = str2;
                                z2 = z4;
                                c26913Oooooo3 = c26913Oooooo8;
                                str8 = str1622;
                                str9 = str20;
                                cloudMetaRemoteEntity = cloudMetaRemoteEntity2;
                                z = z2;
                                str10 = str6;
                                str11 = str7;
                                objOooO00o = C32446OooOOOo.OooO00o(th);
                                r3 = z;
                                String str21 = str11;
                                String str22 = str9;
                                CloudMetaRemoteEntity cloudMetaRemoteEntity5 = cloudMetaRemoteEntity;
                                C26913Oooooo c26913Oooooo9 = c26913Oooooo3;
                                String str23 = str8;
                                str13 = str10;
                                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                                if (thOooO00o == null) {
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str5 = "HuaweiDriveBackend";
                            str6 = str19;
                        }
                        try {
                            Long l2 = new Long(o00000o3.f98985OooO00o.getContentTag().getLastModified());
                            oo000oVar2.f93443OooOo0o = o00000o3;
                            oo000oVar2.f93442OooOo = c26913Oooooo8;
                            oo000oVar2.f93445OooOoO0 = cloudMetaRemoteEntity;
                            oo000oVar2.f93444OooOoO = str19;
                            oo000oVar2.f93446OooOoOO = str2;
                            oo000oVar2.f93448OooOoo0 = str20;
                            oo000oVar2.f93447OooOoo = strOooOo;
                            oo000oVar2.f93449OooOooO = str1622;
                            oo000oVar2.f93452Oooo00O = 4;
                            str5 = "HuaweiDriveBackend";
                            cloudMetaRemoteEntity2 = cloudMetaRemoteEntity;
                            str7 = str2;
                            str6 = str19;
                            z2 = false;
                            z = false;
                            try {
                                objOooO0oO = oooO00o.OooO0oO(str7, strOooOo, str12, str20, linkedHashMapOooOo0O, str1622, l2, oo000oVar2);
                                oo000oVar2 = oo000oVar2;
                            } catch (Throwable th4) {
                                th = th4;
                                str20 = str20;
                                oo000oVar2 = oo000oVar2;
                                c26913Oooooo3 = c26913Oooooo8;
                                str8 = str1622;
                                str9 = str20;
                                cloudMetaRemoteEntity = cloudMetaRemoteEntity2;
                                z = z2;
                                str10 = str6;
                                str11 = str7;
                                objOooO00o = C32446OooOOOo.OooO00o(th);
                                r3 = z;
                                String str212 = str11;
                                String str222 = str9;
                                CloudMetaRemoteEntity cloudMetaRemoteEntity52 = cloudMetaRemoteEntity;
                                C26913Oooooo c26913Oooooo92 = c26913Oooooo3;
                                String str232 = str8;
                                str13 = str10;
                                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                                if (thOooO00o == null) {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            str5 = "HuaweiDriveBackend";
                            str6 = str19;
                            z3 = false;
                            str7 = str2;
                            c26913Oooooo3 = c26913Oooooo8;
                            str8 = str1622;
                            str9 = str20;
                            z = z3;
                            str10 = str6;
                            str11 = str7;
                            objOooO00o = C32446OooOOOo.OooO00o(th);
                            r3 = z;
                            String str2122 = str11;
                            String str2222 = str9;
                            CloudMetaRemoteEntity cloudMetaRemoteEntity522 = cloudMetaRemoteEntity;
                            C26913Oooooo c26913Oooooo922 = c26913Oooooo3;
                            String str2322 = str8;
                            str13 = str10;
                            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                            if (thOooO00o == null) {
                            }
                        }
                        if (objOooO0oO != enumC32485OooO00o) {
                            c26913Oooooo3 = c26913Oooooo8;
                            str8 = str1622;
                            str9 = str20;
                            cloudMetaRemoteEntity = cloudMetaRemoteEntity2;
                            str10 = str6;
                            str11 = str7;
                            objOooO00o = (File) objOooO0oO;
                            r3 = z;
                            String str21222 = str11;
                            String str22222 = str9;
                            CloudMetaRemoteEntity cloudMetaRemoteEntity5222 = cloudMetaRemoteEntity;
                            C26913Oooooo c26913Oooooo9222 = c26913Oooooo3;
                            String str23222 = str8;
                            str13 = str10;
                            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                            if (thOooO00o == null) {
                            }
                        }
                    }
                    return enumC32485OooO00o;
                }
                CloudMetaRemoteEntity cloudMetaRemoteEntity422 = cloudMetaRemoteEntity;
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("HuaweiDriveBackend");
                c20358OooO00o22.OooOO0O("uploadContent: unknown mimeType " + cloudMetaRemoteEntity422.getMimeType() + " for " + str3 + ", using NOTE default", new Object[0]);
                throw new IllegalArgumentException("Unknown mimeType " + cloudMetaRemoteEntity422.getMimeType());
                c26913Oooooo4.getClass();
                driveSnapshotCacheEntityOooOoo = OooOoo(str13, file);
                if (driveSnapshotCacheEntityOooOoo == null) {
                }
            } else if (i2 == 3) {
                str13 = (String) oo000oVar2.f93442OooOo;
                c26913Oooooo4 = (C26913Oooooo) oo000oVar2.f93443OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                file = (File) objOooO0oO;
                c26913Oooooo4.getClass();
                driveSnapshotCacheEntityOooOoo = OooOoo(str13, file);
                if (driveSnapshotCacheEntityOooOoo == null) {
                }
            } else {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str13 = (String) oo000oVar2.f93442OooOo;
                    c26913Oooooo4 = (C26913Oooooo) oo000oVar2.f93443OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0oO);
                    obj = (File) objOooO0oO;
                    file = (File) obj;
                    c26913Oooooo4.getClass();
                    driveSnapshotCacheEntityOooOoo = OooOoo(str13, file);
                    if (driveSnapshotCacheEntityOooOoo == null) {
                        return driveSnapshotCacheEntityOooOoo;
                    }
                    throw new IllegalStateException("uploadContent: unable to convert uploaded file to snapshot");
                }
                str8 = oo000oVar2.f93449OooOooO;
                String str24 = oo000oVar2.f93447OooOoo;
                str9 = oo000oVar2.f93448OooOoo0;
                str11 = oo000oVar2.f93446OooOoOO;
                str10 = oo000oVar2.f93444OooOoO;
                cloudMetaRemoteEntity = oo000oVar2.f93445OooOoO0;
                c26913Oooooo3 = (C26913Oooooo) oo000oVar2.f93442OooOo;
                o00000O o00000o6 = (o00000O) oo000oVar2.f93443OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0oO);
                    str5 = "HuaweiDriveBackend";
                    o00000o3 = o00000o6;
                    strOooOo = str24;
                    z = false;
                } catch (Throwable th6) {
                    th = th6;
                    str5 = "HuaweiDriveBackend";
                    o00000o3 = o00000o6;
                    strOooOo = str24;
                    z = false;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                    r3 = z;
                    String str212222 = str11;
                    String str222222 = str9;
                    CloudMetaRemoteEntity cloudMetaRemoteEntity52222 = cloudMetaRemoteEntity;
                    C26913Oooooo c26913Oooooo92222 = c26913Oooooo3;
                    String str232222 = str8;
                    str13 = str10;
                    thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                    if (thOooO00o == null) {
                    }
                }
                try {
                    objOooO00o = (File) objOooO0oO;
                    r3 = z;
                } catch (Throwable th7) {
                    th = th7;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                    r3 = z;
                }
                String str2122222 = str11;
                String str2222222 = str9;
                CloudMetaRemoteEntity cloudMetaRemoteEntity522222 = cloudMetaRemoteEntity;
                C26913Oooooo c26913Oooooo922222 = c26913Oooooo3;
                String str2322222 = str8;
                str13 = str10;
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o == null) {
                    if (!(thOooO00o instanceof HttpResponseException) || ((HttpResponseException) thOooO00o).getStatusCode() != 404) {
                        throw thOooO00o;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0(str5);
                    c20358OooO00o3.OooOO0O("updateFile 404 for " + str2122222 + ", fallback to createFile", new Object[0]);
                    o0OO0o00.OooO00o oooO00o3 = c26913Oooooo922222.f93377OooO0OO;
                    String str25 = o00000o3.f98986OooO0O0;
                    LinkedHashMap linkedHashMapOooOo0O3 = OooOo0O(cloudMetaRemoteEntity522222);
                    Long l3 = new Long(o00000o3.f98985OooO00o.getContentTag().getLastModified());
                    oo000oVar2.f93443OooOo0o = c26913Oooooo922222;
                    oo000oVar2.f93442OooOo = str13;
                    oo000oVar2.f93445OooOoO0 = r3;
                    oo000oVar2.f93444OooOoO = r3;
                    oo000oVar2.f93446OooOoOO = r3;
                    oo000oVar2.f93448OooOoo0 = r3;
                    oo000oVar2.f93447OooOoo = r3;
                    oo000oVar2.f93449OooOooO = r3;
                    oo000oVar2.f93452Oooo00O = 5;
                    objOooO0oO = oooO00o3.OooO0O0(str25, strOooOo, str2222222, linkedHashMapOooOo0O3, str2322222, l3, oo000oVar2);
                    if (objOooO0oO != enumC32485OooO00o) {
                        c26913Oooooo4 = c26913Oooooo922222;
                        obj = (File) objOooO0oO;
                        file = (File) obj;
                        c26913Oooooo4.getClass();
                        driveSnapshotCacheEntityOooOoo = OooOoo(str13, file);
                        if (driveSnapshotCacheEntityOooOoo == null) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                c26913Oooooo4 = c26913Oooooo922222;
                obj = objOooO00o;
                file = (File) obj;
                c26913Oooooo4.getClass();
                driveSnapshotCacheEntityOooOoo = OooOoo(str13, file);
                if (driveSnapshotCacheEntityOooOoo == null) {
                }
            }
            C32446OooOOOo.OooO0O0(objOooO);
            String str26 = (String) objOooO;
            CloudMetaRemoteEntity cloudMetaRemoteEntity6 = o00000o2.f98985OooO00o;
            String id = cloudMetaRemoteEntity6.getId();
            String driveObjectKey = cloudMetaRemoteEntity6.getDriveObjectKey();
            oo000oVar2.f93443OooOo0o = o00000o2;
            oo000oVar2.f93442OooOo = c26913Oooooo;
            oo000oVar2.f93445OooOoO0 = cloudMetaRemoteEntity6;
            oo000oVar2.f93444OooOoO = str26;
            oo000oVar2.f93446OooOoOO = id;
            oo000oVar2.f93448OooOoo0 = driveObjectKey;
            oo000oVar2.f93452Oooo00O = 2;
            Object objOooOoO0 = c26913Oooooo.OooOoO0(oo000oVar2);
            if (objOooOoO0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            o00000o3 = o00000o2;
            objOooO0oO = objOooOoO0;
            cloudMetaRemoteEntity = cloudMetaRemoteEntity6;
            str = str26;
            str2 = driveObjectKey;
            c26913Oooooo2 = c26913Oooooo;
            str3 = id;
            String str152 = (String) objOooO0oO;
            String mimeType2 = cloudMetaRemoteEntity.getMimeType();
            iHashCode = mimeType2.hashCode();
            if (iHashCode != 393630974) {
            }
            c26913Oooooo4.getClass();
            driveSnapshotCacheEntityOooOoo = OooOoo(str13, file);
            if (driveSnapshotCacheEntityOooOoo == null) {
            }
        } catch (Throwable th8) {
            return C32446OooOOOo.OooO00o(th8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOO(java.io.File file, String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26907OoooOoo c26907OoooOoo;
        Throwable th;
        ?? r15;
        Object objOooO00o;
        ?? r14;
        Throwable th2;
        FileOutputStream fileOutputStream;
        C24034Oooo00O c24034Oooo00O;
        ?? r13;
        java.io.File file2;
        if (abstractC32479OooO0OO instanceof C26907OoooOoo) {
            c26907OoooOoo = (C26907OoooOoo) abstractC32479OooO0OO;
            int i = c26907OoooOoo.f93345OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26907OoooOoo.f93345OooOoo = i - Integer.MIN_VALUE;
            } else {
                c26907OoooOoo = new C26907OoooOoo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26907OoooOoo.f93344OooOoOO;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26907OoooOoo.f93345OooOoo;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C24034Oooo00O c24034Oooo00O2 = new C24034Oooo00O();
                try {
                    ?? CreateTempFile = java.io.File.createTempFile("hw_bundle_" + str, ".tmp", this.f93375OooO00o.getCacheDir());
                    c24034Oooo00O2.f80942OooOo0o = CreateTempFile;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(CreateTempFile);
                    FileOutputStream fileOutputStream2 = new FileOutputStream((java.io.File) CreateTempFile);
                    try {
                        o0OO0o00.OooO00o oooO00o = this.f93377OooO0OO;
                        c26907OoooOoo.f93341OooOo0o = file;
                        c26907OoooOoo.f93340OooOo = c24034Oooo00O2;
                        c26907OoooOoo.f93343OooOoO0 = CreateTempFile;
                        c26907OoooOoo.f93342OooOoO = fileOutputStream2;
                        c26907OoooOoo.f93345OooOoo = 1;
                        try {
                            oooO00o.getClass();
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooO(oooO00o, str2, str, fileOutputStream2, null), c26907OoooOoo);
                            if (objOooO0o != obj2) {
                                objOooO0o = C32460OooOooO.f116667OooO00o;
                            }
                            if (objOooO0o == obj2) {
                                return obj2;
                            }
                            c24034Oooo00O = c24034Oooo00O2;
                            r13 = CreateTempFile;
                            file2 = file;
                            fileOutputStream = fileOutputStream2;
                        } catch (Throwable th3) {
                            th2 = th3;
                            str2 = c24034Oooo00O2;
                            fileOutputStream = fileOutputStream2;
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    r15 = c24034Oooo00O2;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                    r14 = r15;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileOutputStream = c26907OoooOoo.f93342OooOoO;
                java.io.File file3 = c26907OoooOoo.f93343OooOoO0;
                c24034Oooo00O = c26907OoooOoo.f93340OooOo;
                file2 = c26907OoooOoo.f93341OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    r13 = file3;
                    c24034Oooo00O = c24034Oooo00O;
                } catch (Throwable th6) {
                    th2 = th6;
                    str2 = c24034Oooo00O;
                    try {
                        throw th2;
                    } catch (Throwable th7) {
                        oO0O000.OooO00o.OooO00o(fileOutputStream, th2);
                        throw th7;
                    }
                }
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            oO0O000.OooO00o.OooO00o(fileOutputStream, null);
            java.io.File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(r13);
            C32501OooO0oO.OooO0OO(r13, file2);
            objOooO00o = C32460OooOooO.f116667OooO00o;
            r14 = c24034Oooo00O;
        } catch (Throwable th8) {
            th = th8;
            r15 = str2;
        }
        java.io.File file4 = (java.io.File) r14.f80942OooOo0o;
        if (file4 != null) {
            file4.delete();
        }
        return objOooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26906OoooOoO c26906OoooOoO;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C26906OoooOoO) {
            c26906OoooOoO = (C26906OoooOoO) abstractC32479OooO0OO;
            int i = c26906OoooOoO.f93338OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26906OoooOoO.f93338OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26906OoooOoO = new C26906OoooOoO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26906OoooOoO.f93336OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26906OoooOoO.f93338OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                o0OO0o00.OooO00o oooO00o = this.f93377OooO0OO;
                Set setOooOO0 = C34449Oooo0oo.OooOO0(str);
                c26906OoooOoO.f93337OooOo0o = str;
                c26906OoooOoO.f93338OooOoO = 1;
                oooO00o.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26873OooO0oo(setOooOO0, oooO00o, null), c26906OoooOoO);
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
                str = c26906OoooOoO.f93337OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            objOooO00o = C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(thOooO00o, androidx.core.app.OooO.OooO0O0(c20358OooO00o, "HuaweiDriveBackend", "deleteFile failed for ", str), new Object[0]);
        }
        return objOooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, oO00ooo0.OooO00o] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.File] */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo(String str, java.io.File file, String str2, long j, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26908Ooooo00 c26908Ooooo00;
        ?? CreateTempFile;
        ?? r4;
        FileOutputStream fileOutputStream;
        java.io.File file2;
        ?? r42;
        FileOutputStream fileOutputStream2;
        Throwable th;
        if (abstractC32479OooO0OO instanceof C26908Ooooo00) {
            c26908Ooooo00 = (C26908Ooooo00) abstractC32479OooO0OO;
            int i = c26908Ooooo00.f93352OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26908Ooooo00.f93352OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26908Ooooo00 = new C26908Ooooo00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26908Ooooo00.f93349OooOoO;
        ?? r43 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26908Ooooo00.f93352OooOoo0;
        try {
            try {
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    CreateTempFile = java.io.File.createTempFile("hw_bundle_" + str, ".tmp", this.f93375OooO00o.getCacheDir());
                    try {
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(CreateTempFile);
                        fileOutputStream = new FileOutputStream((java.io.File) CreateTempFile);
                        try {
                            o0OO0o00.OooO00o oooO00o = this.f93377OooO0OO;
                            file2 = file;
                            c26908Ooooo00.f93348OooOo0o = file2;
                            c26908Ooooo00.f93347OooOo = CreateTempFile;
                            c26908Ooooo00.f93350OooOoO0 = fileOutputStream;
                            c26908Ooooo00.f93352OooOoo0 = 1;
                            oooO00o.getClass();
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooOO0(oooO00o, j, fileOutputStream, interfaceC32507OooOO0o, str2, str, null), c26908Ooooo00);
                            if (objOooO0o != r43) {
                                objOooO0o = C32460OooOooO.f116667OooO00o;
                            }
                            if (objOooO0o == r43) {
                                return r43;
                            }
                            r42 = CreateTempFile;
                            fileOutputStream2 = fileOutputStream;
                        } catch (Throwable th2) {
                            th = th2;
                            r43 = CreateTempFile;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        C32446OooOOOo.OooO00o(th);
                        r4 = CreateTempFile;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = c26908Ooooo00.f93350OooOoO0;
                    r42 = c26908Ooooo00.f93347OooOo;
                    java.io.File file3 = c26908Ooooo00.f93348OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(obj);
                        file2 = file3;
                        r42 = r42;
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = fileOutputStream2;
                        r43 = r42;
                        th = th;
                        try {
                            throw th;
                        } catch (Throwable th5) {
                            oO0O000.OooO00o.OooO00o(fileOutputStream, th);
                            throw th5;
                        }
                    }
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                oO0O000.OooO00o.OooO00o(fileOutputStream2, null);
                java.io.File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                kotlin.jvm.internal.OooOOO0.OooO0Oo(r42);
                C32501OooO0oO.OooO0OO(r42, file2);
                r4 = r42;
            } catch (Throwable th6) {
                return C32446OooOOOo.OooO00o(th6);
            }
        } catch (Throwable th7) {
            th = th7;
            CreateTempFile = r43;
            C32446OooOOOo.OooO00o(th);
            r4 = CreateTempFile;
            r4.delete();
            return C32460OooOooO.f116667OooO00o;
        }
        r4.delete();
        return C32460OooOooO.f116667OooO00o;
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
        C26912OooooOo c26912OooooOo;
        Object objOooOo0;
        C26913Oooooo c26913Oooooo;
        Object objOooO;
        C26913Oooooo c26913Oooooo2;
        Throwable thOooO00o;
        String str2;
        Throwable th;
        String str3;
        Object objOooO0o0;
        Object objOooO00o;
        Throwable thOooO00o2;
        if (abstractC32479OooO0OO instanceof C26912OooooOo) {
            c26912OooooOo = (C26912OooooOo) abstractC32479OooO0OO;
            int i = c26912OooooOo.f93371OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26912OooooOo.f93371OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26912OooooOo = new C26912OooooOo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26912OooooOo.f93368OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26912OooooOo.f93371OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c26912OooooOo.f93367OooOo0o = this;
            c26912OooooOo.f93366OooOo = str;
            c26912OooooOo.f93371OooOoo0 = 1;
            objOooOo0 = OooOo0(c26912OooooOo);
            if (objOooOo0 != enumC32485OooO00o) {
                c26913Oooooo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c26913Oooooo2 = c26912OooooOo.f93369OooOoO0;
                str2 = c26912OooooOo.f93366OooOo;
                str3 = (String) c26912OooooOo.f93367OooOo0o;
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
                    c26913Oooooo2.getClass();
                    DriveSnapshotCacheEntity driveSnapshotCacheEntityOooOoo = OooOoo(str2, (File) objOooO00o);
                    if (driveSnapshotCacheEntityOooOoo != null) {
                        return driveSnapshotCacheEntityOooOoo;
                    }
                    throw new IllegalStateException("fetchFileSnapshot: unable to convert file to snapshot");
                }
                if (!(thOooO00o2 instanceof HttpResponseException) || ((HttpResponseException) thOooO00o2).getStatusCode() != 404) {
                    throw thOooO00o2;
                }
                throw new o0OO000.OooOO0("1007", "File not found: " + str3, thOooO00o2);
            }
            str = c26912OooooOo.f93366OooOo;
            c26913Oooooo = (C26913Oooooo) c26912OooooOo.f93367OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO = ((C32445OooOOOO) obj).f116639OooOo0o;
            C26913Oooooo c26913Oooooo3 = c26913Oooooo;
            String str4 = str;
            c26913Oooooo2 = c26913Oooooo3;
            thOooO00o = C32445OooOOOO.OooO00o(objOooO);
            if (thOooO00o == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("HuaweiDriveBackend");
                c20358OooO00o.OooO0OO("fetchFileSnapshot: no driveId, not authorized", new Object[0]);
                return C32446OooOOOo.OooO00o(thOooO00o);
            }
            String str5 = (String) objOooO;
            try {
                o0OO0o00.OooO00o oooO00o = c26913Oooooo2.f93377OooO0OO;
                c26912OooooOo.f93367OooOo0o = str4;
                c26912OooooOo.f93366OooOo = str5;
                c26912OooooOo.f93369OooOoO0 = c26913Oooooo2;
                c26912OooooOo.f93371OooOoo0 = 3;
                objOooO0o0 = oooO00o.OooO0o0(str4, c26912OooooOo);
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
        str = c26912OooooOo.f93366OooOo;
        c26913Oooooo = (C26913Oooooo) c26912OooooOo.f93367OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooOo0 = ((C32445OooOOOO) obj).f116639OooOo0o;
        if (objOooOo0 instanceof C32445OooOOOO.OooO00o) {
            Throwable thOooO00o3 = C32445OooOOOO.OooO00o(objOooOo0);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o3);
            return C32446OooOOOo.OooO00o(thOooO00o3);
        }
        c26912OooooOo.f93367OooOo0o = c26913Oooooo;
        c26912OooooOo.f93366OooOo = str;
        c26912OooooOo.f93371OooOoo0 = 2;
        objOooO = c26913Oooooo.OooO(c26912OooooOo);
        if (objOooO != enumC32485OooO00o) {
            C26913Oooooo c26913Oooooo32 = c26913Oooooo;
            String str42 = str;
            c26913Oooooo2 = c26913Oooooo32;
            thOooO00o = C32445OooOOOO.OooO00o(objOooO);
            if (thOooO00o == null) {
            }
        }
        return enumC32485OooO00o;
    }

    @Override // o0OOooO0.o00000
    public final Object OooOOoo(CloudAuthRequest cloudAuthRequest, C27904OooOo c27904OooOo) {
        return this.f93376OooO0O0.OooO00o(cloudAuthRequest, c27904OooOo);
    }

    public final String OooOo(String str, String str2) {
        Context context = this.f93375OooO00o;
        if (str2 == null || str2.length() == 0) {
            return o0Oo0oo.OooO0Oo(context.getString(R.string.note_title_default), C18115b5.CONNECTOR, str);
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
        String string = context.getString(R.string.note_title_default);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26909Ooooo0o c26909Ooooo0o;
        if (abstractC32479OooO0OO instanceof C26909Ooooo0o) {
            c26909Ooooo0o = (C26909Ooooo0o) abstractC32479OooO0OO;
            int i = c26909Ooooo0o.f93355OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26909Ooooo0o.f93355OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26909Ooooo0o = new C26909Ooooo0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26909Ooooo0o.f93354OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26909Ooooo0o.f93355OooOoO0;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        c26909Ooooo0o.f93355OooOoO0 = 1;
        Object objOooO0Oo = this.f93376OooO0O0.OooO0Oo(c26909Ooooo0o);
        return objOooO0Oo == enumC32485OooO00o ? enumC32485OooO00o : objOooO0Oo;
    }

    @Override // o0OOooO0.o00000
    public final InterfaceC33721OooO0o<String> OooOo00() {
        return new C26893Oooo0OO(this.f93376OooO0O0.f93265OooO0O0.getData());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo0o(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26903OoooOOO c26903OoooOOO;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C26913Oooooo c26913Oooooo;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Throwable th;
        C26913Oooooo c26913Oooooo2;
        if (abstractC32479OooO0OO instanceof C26903OoooOOO) {
            c26903OoooOOO = (C26903OoooOOO) abstractC32479OooO0OO;
            int i = c26903OoooOOO.f93331OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26903OoooOOO.f93331OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26903OoooOOO = new C26903OoooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26903OoooOOO.f93330OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26903OoooOOO.f93331OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c26903OoooOOO.f93328OooOo0o = this;
                interfaceC33895OooO00o = this.f93382OooO0oo;
                c26903OoooOOO.f93327OooOo = interfaceC33895OooO00o;
                c26903OoooOOO.f93331OooOoOO = 1;
                if (interfaceC33895OooO00o.OooO00o(c26903OoooOOO) != enumC32485OooO00o) {
                    c26913Oooooo = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = c26903OoooOOO.f93327OooOo;
                c26913Oooooo2 = c26903OoooOOO.f93328OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    c26913Oooooo2.f93374OooO = null;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = c26903OoooOOO.f93327OooOo;
            c26913Oooooo = c26903OoooOOO.f93328OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO0OooO00o = C28051OooO00o.OooO00o(c26913Oooooo.f93375OooO00o);
            C26904OoooOOo c26904OoooOOo = new C26904OoooOOo(2, null);
            c26903OoooOOO.f93328OooOo0o = c26913Oooooo;
            c26903OoooOOO.f93327OooOo = interfaceC33895OooO00o;
            c26903OoooOOO.f93331OooOoOO = 2;
            if (C24332OooO.OooO00o(oooOO0OooO00o, c26904OoooOOo, c26903OoooOOO) != enumC32485OooO00o) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                c26913Oooooo2 = c26913Oooooo;
                c26913Oooooo2.f93374OooO = null;
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoO(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        o0OoOo0 o0oooo02;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C26913Oooooo c26913Oooooo;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Throwable th;
        String str;
        C26913Oooooo c26913Oooooo2;
        if (abstractC32479OooO0OO instanceof o0OoOo0) {
            o0oooo02 = (o0OoOo0) abstractC32479OooO0OO;
            int i = o0oooo02.f93441OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0oooo02.f93441OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o0oooo02 = new o0OoOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o0oooo02.f93440OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0oooo02.f93441OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                o0oooo02.f93438OooOo0o = this;
                interfaceC33895OooO00o = this.f93382OooO0oo;
                o0oooo02.f93437OooOo = interfaceC33895OooO00o;
                o0oooo02.f93441OooOoOO = 1;
                if (interfaceC33895OooO00o.OooO00o(o0oooo02) != enumC32485OooO00o) {
                    c26913Oooooo = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = o0oooo02.f93437OooOo;
                c26913Oooooo2 = o0oooo02.f93438OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    c26913Oooooo2.f93374OooO = (String) obj;
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
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = o0oooo02.f93437OooOo;
            c26913Oooooo = o0oooo02.f93438OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            str = c26913Oooooo.f93374OooO;
            if (str == null) {
                o00O0O o00o0o2 = new o00O0O(C28051OooO00o.OooO00o(c26913Oooooo.f93375OooO00o).getData(), 0);
                o0oooo02.f93438OooOo0o = c26913Oooooo;
                o0oooo02.f93437OooOo = interfaceC33895OooO00o;
                o0oooo02.f93441OooOoOO = 2;
                Object objOooOOo = C25252OooO0Oo.OooOOo(o00o0o2, o0oooo02);
                if (objOooOOo != enumC32485OooO00o) {
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                    obj = objOooOOo;
                    c26913Oooooo2 = c26913Oooooo;
                    c26913Oooooo2.f93374OooO = (String) obj;
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

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d A[Catch: all -> 0x0048, TryCatch #2 {all -> 0x0048, blocks: (B:21:0x0044, B:37:0x0091, B:38:0x0097, B:40:0x009d, B:44:0x00b2, B:46:0x00b6, B:50:0x00c0), top: B:75:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e3 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:14:0x002e, B:54:0x00df, B:56:0x00e3, B:59:0x00ee, B:61:0x00f4, B:65:0x00fb, B:66:0x0102), top: B:72:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ee A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:14:0x002e, B:54:0x00df, B:56:0x00e3, B:59:0x00ee, B:61:0x00f4, B:65:0x00fb, B:66:0x0102), top: B:72:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoO0(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26910OooooO0 c26910OooooO0;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C26913Oooooo c26913Oooooo;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Throwable th;
        String id;
        String str;
        InterfaceC33895OooO00o interfaceC33895OooO00o3;
        Iterator it;
        Object next;
        File file;
        C26913Oooooo c26913Oooooo2;
        String id2;
        File file2;
        if (abstractC32479OooO0OO instanceof C26910OooooO0) {
            c26910OooooO0 = (C26910OooooO0) abstractC32479OooO0OO;
            int i = c26910OooooO0.f93361OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26910OooooO0.f93361OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26910OooooO0 = new C26910OooooO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26910OooooO0.f93358OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26910OooooO0.f93361OooOoo0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0o);
                c26910OooooO0.f93357OooOo0o = this;
                interfaceC33895OooO00o = this.f93379OooO0o;
                c26910OooooO0.f93356OooOo = interfaceC33895OooO00o;
                c26910OooooO0.f93361OooOoo0 = 1;
                if (interfaceC33895OooO00o.OooO00o(c26910OooooO0) != enumC32485OooO00o) {
                    c26913Oooooo = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC33895OooO00o2 = c26910OooooO0.f93356OooOo;
                    c26913Oooooo2 = c26910OooooO0.f93357OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooO0o);
                        file2 = (File) objOooO0o;
                        if (file2 == null) {
                            id = file2.getId();
                            c26913Oooooo = c26913Oooooo2;
                        } else {
                            c26913Oooooo = c26913Oooooo2;
                            id = null;
                        }
                        if (id != null || id.length() == 0) {
                            throw new IllegalArgumentException("Unable to ensure root folder");
                        }
                        c26913Oooooo.f93381OooO0oO = id;
                        interfaceC33895OooO00o = interfaceC33895OooO00o2;
                        interfaceC33895OooO00o.OooOOO0(null);
                        return id;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        throw th;
                    }
                }
                str = c26910OooooO0.f93359OooOoO0;
                interfaceC33895OooO00o3 = c26910OooooO0.f93356OooOo;
                c26913Oooooo = c26910OooooO0.f93357OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    it = ((Iterable) objOooO0o).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((File) next).getMimeType(), "application/vnd.huawei-apps.folder")) {
                            break;
                        }
                    }
                    file = (File) next;
                    if (file != null && (id2 = file.getId()) != null) {
                        id = id2;
                        interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                        if (id != null) {
                        }
                        throw new IllegalArgumentException("Unable to ensure root folder");
                    }
                    o0OO0o00.OooO00o oooO00o = c26913Oooooo.f93377OooO0OO;
                    c26910OooooO0.f93357OooOo0o = c26913Oooooo;
                    c26910OooooO0.f93356OooOo = interfaceC33895OooO00o3;
                    c26910OooooO0.f93359OooOoO0 = null;
                    c26910OooooO0.f93361OooOoo0 = 3;
                    oooO00o.getClass();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26872OooO0oO(str, null, oooO00o), c26910OooooO0);
                    if (objOooO0o != enumC32485OooO00o) {
                        interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                        c26913Oooooo2 = c26913Oooooo;
                        file2 = (File) objOooO0o;
                        if (file2 == null) {
                        }
                        if (id != null) {
                        }
                        throw new IllegalArgumentException("Unable to ensure root folder");
                    }
                    return enumC32485OooO00o;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o4 = c26910OooooO0.f93356OooOo;
            c26913Oooooo = c26910OooooO0.f93357OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            interfaceC33895OooO00o = interfaceC33895OooO00o4;
            id = c26913Oooooo.f93381OooO0oO;
            if (id != null) {
                interfaceC33895OooO00o.OooOOO0(null);
                return id;
            }
            str = "NoteIn";
            o0OO0o00.OooO00o oooO00o2 = c26913Oooooo.f93377OooO0OO;
            c26910OooooO0.f93357OooOo0o = c26913Oooooo;
            c26910OooooO0.f93356OooOo = interfaceC33895OooO00o;
            c26910OooooO0.f93359OooOoO0 = "NoteIn";
            c26910OooooO0.f93361OooOoo0 = 2;
            oooO00o2.getClass();
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26879OooOo0(oooO00o2, null), c26910OooooO0);
            if (objOooO0o2 != enumC32485OooO00o) {
                interfaceC33895OooO00o3 = interfaceC33895OooO00o;
                objOooO0o = objOooO0o2;
                it = ((Iterable) objOooO0o).iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                file = (File) next;
                if (file != null) {
                    id = id2;
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                    if (id != null) {
                    }
                    throw new IllegalArgumentException("Unable to ensure root folder");
                }
                o0OO0o00.OooO00o oooO00o3 = c26913Oooooo.f93377OooO0OO;
                c26910OooooO0.f93357OooOo0o = c26913Oooooo;
                c26910OooooO0.f93356OooOo = interfaceC33895OooO00o3;
                c26910OooooO0.f93359OooOoO0 = null;
                c26910OooooO0.f93361OooOoo0 = 3;
                oooO00o3.getClass();
                C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26872OooO0oO(str, null, oooO00o3), c26910OooooO0);
                if (objOooO0o != enumC32485OooO00o) {
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoOO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00Ooo o00ooo2;
        C26913Oooooo c26913Oooooo;
        C33898OooO0Oo c33898OooO0Oo;
        if (abstractC32479OooO0OO instanceof o00Ooo) {
            o00ooo2 = (o00Ooo) abstractC32479OooO0OO;
            int i = o00ooo2.f93420OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00ooo2.f93420OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o00ooo2 = new o00Ooo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o00ooo2.f93419OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00ooo2.f93420OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00ooo2.f93417OooOo0o = this;
            C33898OooO0Oo c33898OooO0Oo2 = this.f93379OooO0o;
            o00ooo2.f93416OooOo = c33898OooO0Oo2;
            o00ooo2.f93420OooOoOO = 1;
            if (c33898OooO0Oo2.OooO00o(o00ooo2) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26913Oooooo = this;
            c33898OooO0Oo = c33898OooO0Oo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33898OooO0Oo = o00ooo2.f93416OooOo;
            c26913Oooooo = o00ooo2.f93417OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            c26913Oooooo.f93381OooO0oO = null;
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
    public final Object OooOooO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26917o00o0O c26917o00o0O;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C26913Oooooo c26913Oooooo;
        Throwable th;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        String str2;
        C26913Oooooo c26913Oooooo2;
        if (abstractC32479OooO0OO instanceof C26917o00o0O) {
            c26917o00o0O = (C26917o00o0O) abstractC32479OooO0OO;
            int i = c26917o00o0O.f93426OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26917o00o0O.f93426OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26917o00o0O = new C26917o00o0O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26917o00o0O.f93423OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26917o00o0O.f93426OooOoo0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c26917o00o0O.f93422OooOo0o = this;
                c26917o00o0O.f93421OooOo = str;
                interfaceC33895OooO00o = this.f93382OooO0oo;
                c26917o00o0O.f93424OooOoO0 = interfaceC33895OooO00o;
                c26917o00o0O.f93426OooOoo0 = 1;
                if (interfaceC33895OooO00o.OooO00o(c26917o00o0O) != enumC32485OooO00o) {
                    c26913Oooooo = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = c26917o00o0O.f93424OooOoO0;
                str2 = c26917o00o0O.f93421OooOo;
                c26913Oooooo2 = c26917o00o0O.f93422OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    c26913Oooooo2.f93374OooO = str2;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = c26917o00o0O.f93424OooOoO0;
            String str3 = c26917o00o0O.f93421OooOo;
            c26913Oooooo = c26917o00o0O.f93422OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            str = str3;
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO0OooO00o = C28051OooO00o.OooO00o(c26913Oooooo.f93375OooO00o);
            C26918o00ooo c26918o00ooo = new C26918o00ooo(str, null);
            c26917o00o0O.f93422OooOo0o = c26913Oooooo;
            c26917o00o0O.f93421OooOo = str;
            c26917o00o0O.f93424OooOoO0 = interfaceC33895OooO00o;
            c26917o00o0O.f93426OooOoo0 = 2;
            if (C24332OooO.OooO00o(oooOO0OooO00o, c26918o00ooo, c26917o00o0O) != enumC32485OooO00o) {
                str2 = str;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                c26913Oooooo2 = c26913Oooooo;
                c26913Oooooo2.f93374OooO = str2;
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
        return this.f93380OooO0o0;
    }
}
