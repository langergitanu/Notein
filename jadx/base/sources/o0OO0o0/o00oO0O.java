package o0OO0o0;

import android.net.Uri;
import androidx.core.text.HtmlCompat;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.google.gson.Gson;
import com.huawei.hms.network.embedded.C18115b5;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
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
import java.io.File;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24034Oooo00O;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24340OooO0oo;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OO0o0.C26837Oooo0OO;
import o0OOO00.C26988OooO0Oo;
import o0OOo0Oo.EnumC27285OooO;
import o0OOooO0.C27904OooOo;
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
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33769Ooooo0o;
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
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.C34449Oooo0oo;
import ooooOOo0.C35219OooOO0O;

/* JADX INFO: loaded from: classes9.dex */
public final class o00oO0O implements o0OOooO0.o00000 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f93061OooOO0 = C24340OooO0oo.OooO0o0("onedrive_drive_cursor");

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f93062OooOO0O = C24340OooO0oo.OooO0o0("onedrive_storage_quota");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public String f93063OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f93064OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C26837Oooo0OO f93065OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C26800OooO f93066OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final EnumC27285OooO f93067OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33898OooO0Oo f93068OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Gson f93069OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f93070OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33898OooO0Oo f93071OooO0oo;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSyncBackend", m80623f = "OneDriveDriveSyncBackend.kt", m80624l = {463}, m80625m = "fetchNoteHistoryVersions-gIAlu-s")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f93073OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f93074OooOoO0;

        public OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
            super(abstractC32479OooO0OO);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f93073OooOo0o = obj;
            this.f93074OooOoO0 |= Integer.MIN_VALUE;
            Object objOooOOO = o00oO0O.this.OooOOO(null, this);
            return objOooOOO == EnumC32485OooO00o.f116726OooOo0o ? objOooOOO : new C32445OooOOOO(objOooOOO);
        }
    }

    public static final class OooO0O0 implements InterfaceC33721OooO0o<NoteCloudQuota> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f93075OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f93076OooOo0o;

            /* JADX INFO: renamed from: o0OO0o0.o00oO0O$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSyncBackend$getCloudQuotaFlow$$inlined$map$1$2", m80623f = "OneDriveDriveSyncBackend.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19818OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f93077OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f93078OooOo0o;

                public C19818OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f93078OooOo0o = obj;
                    this.f93077OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f93076OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19818OooO00o c19818OooO00o;
                if (continuation instanceof C19818OooO00o) {
                    c19818OooO00o = (C19818OooO00o) continuation;
                    int i = c19818OooO00o.f93077OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19818OooO00o.f93077OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19818OooO00o = new C19818OooO00o(continuation);
                    }
                }
                Object obj2 = c19818OooO00o.f93078OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19818OooO00o.f93077OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(o00oO0O.f93062OooOO0O);
                    NoteCloudQuota noteCloudQuota = (str == null || str.length() == 0) ? null : (NoteCloudQuota) C28028OooO0o.OooO00o().fromJson(str, (Class) NoteCloudQuota.class);
                    c19818OooO00o.f93077OooOo = 1;
                    if (this.f93076OooOo0o.emit(noteCloudQuota, c19818OooO00o) == enumC32485OooO00o) {
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

        public OooO0O0(InterfaceC33721OooO0o interfaceC33721OooO0o) {
            this.f93075OooOo0o = interfaceC33721OooO0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super NoteCloudQuota> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f93075OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO implements InterfaceC33721OooO0o<String> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33769Ooooo0o f93080OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f93081OooOo0o;

            /* JADX INFO: renamed from: o0OO0o0.o00oO0O$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSyncBackend$getDriveIdFlow$$inlined$map$1$2", m80623f = "OneDriveDriveSyncBackend.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19819OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f93082OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f93083OooOo0o;

                public C19819OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f93083OooOo0o = obj;
                    this.f93082OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f93081OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19819OooO00o c19819OooO00o;
                if (continuation instanceof C19819OooO00o) {
                    c19819OooO00o = (C19819OooO00o) continuation;
                    int i = c19819OooO00o.f93082OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19819OooO00o.f93082OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19819OooO00o = new C19819OooO00o(continuation);
                    }
                }
                Object obj2 = c19819OooO00o.f93083OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19819OooO00o.f93082OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    C26837Oooo0OO.OooO00o oooO00o = (C26837Oooo0OO.OooO00o) obj;
                    String str = oooO00o != null ? oooO00o.f92911OooO0O0 : null;
                    c19819OooO00o.f93082OooOo = 1;
                    if (this.f93081OooOo0o.emit(str, c19819OooO00o) == enumC32485OooO00o) {
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

        public OooO0OO(C33769Ooooo0o c33769Ooooo0o) {
            this.f93080OooOo0o = c33769Ooooo0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f93080OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    public o00oO0O(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, C26837Oooo0OO sessionManager, C26800OooO cloudService) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sessionManager, "sessionManager");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudService, "cloudService");
        this.f93064OooO00o = abstractApplicationC26277OooOoOO;
        this.f93065OooO0O0 = sessionManager;
        this.f93066OooO0OO = cloudService;
        this.f93067OooO0Oo = EnumC27285OooO.f95078OooOoO0;
        this.f93069OooO0o0 = new Gson();
        this.f93068OooO0o = C33900OooO0o0.OooO00o();
        this.f93071OooO0oo = C33900OooO0o0.OooO00o();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C26850OoooOoO(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0Oo0oo o0oo0oo2;
        String str;
        C26837Oooo0OO c26837Oooo0OO = this.f93065OooO0O0;
        if (abstractC32479OooO0OO instanceof o0Oo0oo) {
            o0oo0oo2 = (o0Oo0oo) abstractC32479OooO0OO;
            int i = o0oo0oo2.f93112OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0oo0oo2.f93112OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                o0oo0oo2 = new o0Oo0oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO = o0oo0oo2.f93111OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0oo0oo2.f93112OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO);
                C26837Oooo0OO.OooO00o oooO00o = (C26837Oooo0OO.OooO00o) c26837Oooo0OO.f92909OooO0o0.f121747OooOo0o.getValue();
                if (oooO00o != null && (str = oooO00o.f92911OooO0O0) != null) {
                    return str;
                }
                o0oo0oo2.f93112OooOoO0 = 1;
                objOooO = c26837Oooo0OO.OooO(o0oo0oo2);
                if (objOooO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO);
            }
            return ((C26837Oooo0OO.OooO00o) objOooO).f92911OooO0O0;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    @Override // o0OOooO0.o00000
    public final InterfaceC33721OooO0o<NoteCloudQuota> OooO00o() {
        return new OooO0O0(C28051OooO00o.OooO00o(this.f93064OooO00o).getData());
    }

    @Override // o0OOooO0.o00000
    public final InterfaceC33721OooO0o<Boolean> OooO0O0() {
        return new C26845OoooO0O(this.f93065OooO0O0.f92906OooO0O0.getData(), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007f A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:14:0x002e, B:21:0x0041, B:34:0x007b, B:36:0x007f, B:40:0x0089, B:42:0x008f, B:45:0x0097, B:47:0x009d, B:48:0x00a1, B:24:0x0049, B:31:0x005e, B:27:0x0050), top: B:54:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26867o0ooOO0 c26867o0ooOO0;
        o00oO0O o00oo0o;
        o0000Ooo quota;
        long jLongValue;
        Long used;
        Long total;
        if (abstractC32479OooO0OO instanceof C26867o0ooOO0) {
            c26867o0ooOO0 = (C26867o0ooOO0) abstractC32479OooO0OO;
            int i = c26867o0ooOO0.f93120OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26867o0ooOO0.f93120OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26867o0ooOO0 = new C26867o0ooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO = c26867o0ooOO0.f93118OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26867o0ooOO0.f93120OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO);
                C26837Oooo0OO c26837Oooo0OO = this.f93065OooO0O0;
                c26867o0ooOO0.f93119OooOo0o = this;
                c26867o0ooOO0.f93120OooOoO = 1;
                objOooO = c26837Oooo0OO.OooO(c26867o0ooOO0);
                if (objOooO != enumC32485OooO00o) {
                    o00oo0o = this;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        NoteCloudQuota noteCloudQuota = (NoteCloudQuota) c26867o0ooOO0.f93119OooOo0o;
                        C32446OooOOOo.OooO0O0(objOooO);
                        return noteCloudQuota;
                    }
                    o00oo0o = (o00oO0O) c26867o0ooOO0.f93119OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO);
                    C26808OooO0oO c26808OooO0oO = (C26808OooO0oO) objOooO;
                    quota = c26808OooO0oO == null ? c26808OooO0oO.getQuota() : null;
                    jLongValue = 0;
                    long jLongValue2 = (quota != null || (total = quota.getTotal()) == null) ? 0L : total.longValue();
                    if (quota != null && (used = quota.getUsed()) != null) {
                        jLongValue = used.longValue();
                    }
                    NoteCloudQuota noteCloudQuota2 = new NoteCloudQuota(jLongValue2, jLongValue);
                    String json = C28028OooO0o.OooO00o().toJson(noteCloudQuota2);
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO0OooO00o = C28051OooO00o.OooO00o(o00oo0o.f93064OooO00o);
                    o0ooOOo o0ooooo2 = new o0ooOOo(json, null);
                    c26867o0ooOO0.f93119OooOo0o = noteCloudQuota2;
                    c26867o0ooOO0.f93120OooOoO = 3;
                    return C24332OooO.OooO00o(oooOO0OooO00o, o0ooooo2, c26867o0ooOO0) != enumC32485OooO00o ? enumC32485OooO00o : noteCloudQuota2;
                }
                o00oo0o = (o00oO0O) c26867o0ooOO0.f93119OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO);
            }
            C26800OooO c26800OooO = o00oo0o.f93066OooO0OO;
            String str = ((C26837Oooo0OO.OooO00o) objOooO).f92910OooO00o;
            c26867o0ooOO0.f93119OooOo0o = o00oo0o;
            c26867o0ooOO0.f93120OooOoO = 2;
            c26800OooO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26818OooOOo0(c26800OooO, str, null), c26867o0ooOO0);
            if (objOooO != enumC32485OooO00o) {
                C26808OooO0oO c26808OooO0oO2 = (C26808OooO0oO) objOooO;
                if (c26808OooO0oO2 == null) {
                }
                jLongValue = 0;
                if (quota != null) {
                    if (quota != null) {
                        jLongValue = used.longValue();
                    }
                    NoteCloudQuota noteCloudQuota22 = new NoteCloudQuota(jLongValue2, jLongValue);
                    String json2 = C28028OooO0o.OooO00o().toJson(noteCloudQuota22);
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO0OooO00o2 = C28051OooO00o.OooO00o(o00oo0o.f93064OooO00o);
                    o0ooOOo o0ooooo22 = new o0ooOOo(json2, null);
                    c26867o0ooOO0.f93119OooOo0o = noteCloudQuota22;
                    c26867o0ooOO0.f93120OooOoO = 3;
                    if (C24332OooO.OooO00o(oooOO0OooO00o2, o0ooooo22, c26867o0ooOO0) != enumC32485OooO00o) {
                    }
                }
            }
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ca, code lost:
    
        if (r11 == r2) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0Oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26853Ooooo0o c26853Ooooo0o;
        Serializable serializableOooO00o;
        o00oO0O o00oo0o;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C26853Ooooo0o) {
            c26853Ooooo0o = (C26853Ooooo0o) abstractC32479OooO0OO;
            int i = c26853Ooooo0o.f92964OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26853Ooooo0o.f92964OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26853Ooooo0o = new C26853Ooooo0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO = c26853Ooooo0o.f92962OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26853Ooooo0o.f92964OooOoO;
        boolean z = true;
        try {
        } catch (Throwable th) {
            serializableOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO);
            try {
                C26837Oooo0OO c26837Oooo0OO = this.f93065OooO0O0;
                c26853Ooooo0o.f92963OooOo0o = this;
                c26853Ooooo0o.f92964OooOoO = 1;
                objOooO = c26837Oooo0OO.OooO(c26853Ooooo0o);
                if (objOooO != enumC32485OooO00o) {
                    o00oo0o = this;
                }
            } catch (Throwable th2) {
                th = th2;
                o00oo0o = this;
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO);
            if (((C26808OooO0oO) objOooO) == null) {
                z = false;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("OneDriveDriveBackend");
            c20358OooO00o.OooO00o("checkServiceAvailable: available=" + z, new Object[0]);
            serializableOooO00o = Boolean.valueOf(z);
            return serializableOooO00o;
        }
        o00oo0o = c26853Ooooo0o.f92963OooOo0o;
        try {
            C32446OooOOOo.OooO0O0(objOooO);
        } catch (Throwable th3) {
            th = th3;
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        objOooO00o = (C26837Oooo0OO.OooO00o) objOooO;
        if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (!(thOooO00o instanceof C35219OooOO0O) && !(thOooO00o instanceof ConnectException) && !(thOooO00o instanceof NoRouteToHostException) && !(thOooO00o instanceof SocketTimeoutException) && !(thOooO00o instanceof SocketException) && !(thOooO00o instanceof UnknownHostException) && !(thOooO00o instanceof ProtocolException) && !(thOooO00o instanceof SSLException)) {
                return Boolean.FALSE;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("OneDriveDriveBackend");
            c20358OooO00o2.OooO00o("checkServiceAvailable: Network Exception = " + thOooO00o, new Object[0]);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            return C32446OooOOOo.OooO00o(thOooO00o);
        }
        C32446OooOOOo.OooO0O0(objOooO00o);
        C26800OooO c26800OooO = o00oo0o.f93066OooO0OO;
        String str = ((C26837Oooo0OO.OooO00o) objOooO00o).f92910OooO00o;
        c26853Ooooo0o.f92963OooOo0o = null;
        c26853Ooooo0o.f92964OooOoO = 2;
        c26800OooO.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        objOooO = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26818OooOOo0(c26800OooO, str, null), c26853Ooooo0o);
    }

    @Override // o0OOooO0.o00000
    public final boolean OooO0o() {
        return true;
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
        C26852Ooooo00 c26852Ooooo00;
        Object objOooOo0;
        o00oO0O o00oo0o;
        Object objOooOOo0;
        if (abstractC32479OooO0OO instanceof C26852Ooooo00) {
            c26852Ooooo00 = (C26852Ooooo00) abstractC32479OooO0OO;
            int i = c26852Ooooo00.f92961OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26852Ooooo00.f92961OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26852Ooooo00 = new C26852Ooooo00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26852Ooooo00.f92960OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26852Ooooo00.f92961OooOoOO;
        boolean z = true;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c26852Ooooo00.f92958OooOo0o = this;
                c26852Ooooo00.f92957OooOo = str;
                c26852Ooooo00.f92961OooOoOO = 1;
                objOooOo0 = OooOo0(c26852Ooooo00);
                if (objOooOo0 != enumC32485OooO00o) {
                    o00oo0o = this;
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
            str = c26852Ooooo00.f92957OooOo;
            o00oo0o = c26852Ooooo00.f92958OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooOo0 = ((C32445OooOOOO) obj).f116639OooOo0o;
            if (objOooOo0 instanceof C32445OooOOOO.OooO00o) {
                Throwable thOooO00o2 = C32445OooOOOO.OooO00o(objOooOo0);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o2);
                return C32446OooOOOo.OooO00o(thOooO00o2);
            }
            c26852Ooooo00.f92958OooOo0o = null;
            c26852Ooooo00.f92957OooOo = null;
            c26852Ooooo00.f92961OooOoOO = 2;
            objOooOOo0 = o00oo0o.OooOOo0(str, c26852Ooooo00);
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:46:0x0102, B:48:0x0106, B:51:0x010d, B:52:0x0115, B:53:0x0116, B:54:0x0127, B:20:0x0058, B:27:0x007e, B:33:0x009a, B:42:0x00ba, B:55:0x0128, B:56:0x016b, B:36:0x00a5, B:39:0x00b0, B:23:0x0069), top: B:59:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:46:0x0102, B:48:0x0106, B:51:0x010d, B:52:0x0115, B:53:0x0116, B:54:0x0127, B:20:0x0058, B:27:0x007e, B:33:0x009a, B:42:0x00ba, B:55:0x0128, B:56:0x016b, B:36:0x00a5, B:39:0x00b0, B:23:0x0069), top: B:59:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, CloudMetaRemoteEntity cloudMetaRemoteEntity, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26861o000000o c26861o000000o;
        CloudMetaRemoteEntity cloudMetaRemoteEntity2;
        String str2;
        Object obj;
        o00oO0O o00oo0o;
        String str3;
        Object objOooO0o;
        String str4;
        LinkedHashMap linkedHashMap;
        o00oO0O o00oo0o2;
        String str5;
        C26804OooO0OO c26804OooO0OO;
        if (abstractC32479OooO0OO instanceof C26861o000000o) {
            c26861o000000o = (C26861o000000o) abstractC32479OooO0OO;
            int i = c26861o000000o.f93013OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26861o000000o.f93013OooOoo = i - Integer.MIN_VALUE;
            } else {
                c26861o000000o = new C26861o000000o(this, abstractC32479OooO0OO);
            }
        }
        Object obj2 = c26861o000000o.f93012OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26861o000000o.f93013OooOoo;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                c26861o000000o.f93009OooOo0o = str;
                cloudMetaRemoteEntity2 = cloudMetaRemoteEntity;
                c26861o000000o.f93008OooOo = cloudMetaRemoteEntity2;
                c26861o000000o.f93011OooOoO0 = this;
                c26861o000000o.f93013OooOoo = 1;
                Serializable serializableOooO = OooO(c26861o000000o);
                if (serializableOooO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                str2 = str;
                obj = serializableOooO;
                o00oo0o = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    linkedHashMap = c26861o000000o.f93010OooOoO;
                    str4 = (String) c26861o000000o.f93011OooOoO0;
                    o00oo0o2 = (o00oO0O) c26861o000000o.f93008OooOo;
                    str5 = c26861o000000o.f93009OooOo0o;
                    C32446OooOOOo.OooO0O0(obj2);
                    c26804OooO0OO = (C26804OooO0OO) obj2;
                    if (c26804OooO0OO != null) {
                        throw new IllegalStateException("uploadMeta: failed to update description for " + str5);
                    }
                    DriveSnapshotCacheEntity driveSnapshotCacheEntityOooOoo = o00oo0o2.OooOoo(c26804OooO0OO, linkedHashMap, str4);
                    if (driveSnapshotCacheEntityOooOoo != null) {
                        return driveSnapshotCacheEntityOooOoo;
                    }
                    throw new IllegalStateException("uploadMeta: cannot convert DriveItem to snapshot");
                }
                o00oO0O o00oo0o3 = (o00oO0O) c26861o000000o.f93011OooOoO0;
                CloudMetaRemoteEntity cloudMetaRemoteEntity3 = (CloudMetaRemoteEntity) c26861o000000o.f93008OooOo;
                String str6 = c26861o000000o.f93009OooOo0o;
                C32446OooOOOo.OooO0O0(obj2);
                obj = ((C32445OooOOOO) obj2).f116639OooOo0o;
                o00oo0o = o00oo0o3;
                cloudMetaRemoteEntity2 = cloudMetaRemoteEntity3;
                str2 = str6;
            }
            C32446OooOOOo.OooO0O0(obj);
            String str7 = (String) obj;
            String mimeType = cloudMetaRemoteEntity2.getMimeType();
            int iHashCode = mimeType.hashCode();
            if (iHashCode == 393630974) {
                if (mimeType.equals(CloudMime.NOTE)) {
                    str3 = "application/vnd.notein-apps.dbfile";
                    LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO(cloudMetaRemoteEntity2.toCloudProperties());
                    linkedHashMapOooOOOO.put("mimeType", str3);
                    String json = o00oo0o.f93069OooO0o0.toJson(linkedHashMapOooOOOO);
                    String strOooOo0o = o00oo0o.OooOo0o(str2, cloudMetaRemoteEntity2.getExtra().getTitle());
                    C26800OooO c26800OooO = o00oo0o.f93066OooO0OO;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(json);
                    c26861o000000o.f93009OooOo0o = str2;
                    c26861o000000o.f93008OooOo = o00oo0o;
                    c26861o000000o.f93011OooOoO0 = str7;
                    c26861o000000o.f93010OooOoO = linkedHashMapOooOOOO;
                    c26861o000000o.f93013OooOoo = 2;
                    c26800OooO.getClass();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26830OooOooO(strOooOo0o, json, str2, null, c26800OooO), c26861o000000o);
                    if (objOooO0o != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("OneDriveDriveBackend");
                c20358OooO00o.OooOO0O("uploadContent: unknown mimeType " + cloudMetaRemoteEntity2.getMimeType() + " for " + cloudMetaRemoteEntity2.getId() + ", using NOTE default", new Object[0]);
                throw new IllegalArgumentException("Unknown mimeType " + cloudMetaRemoteEntity2.getMimeType());
            }
            if (iHashCode == 1600536058) {
                if (mimeType.equals(CloudMime.FOLDER)) {
                    str3 = "application/vnd.notein-apps.folders";
                    LinkedHashMap linkedHashMapOooOOOO2 = C34444Oooo0O0.OooOOOO(cloudMetaRemoteEntity2.toCloudProperties());
                    linkedHashMapOooOOOO2.put("mimeType", str3);
                    String json2 = o00oo0o.f93069OooO0o0.toJson(linkedHashMapOooOOOO2);
                    String strOooOo0o2 = o00oo0o.OooOo0o(str2, cloudMetaRemoteEntity2.getExtra().getTitle());
                    C26800OooO c26800OooO2 = o00oo0o.f93066OooO0OO;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(json2);
                    c26861o000000o.f93009OooOo0o = str2;
                    c26861o000000o.f93008OooOo = o00oo0o;
                    c26861o000000o.f93011OooOoO0 = str7;
                    c26861o000000o.f93010OooOoO = linkedHashMapOooOOOO2;
                    c26861o000000o.f93013OooOoo = 2;
                    c26800OooO2.getClass();
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26830OooOooO(strOooOo0o2, json2, str2, null, c26800OooO2), c26861o000000o);
                    if (objOooO0o != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("OneDriveDriveBackend");
                c20358OooO00o2.OooOO0O("uploadContent: unknown mimeType " + cloudMetaRemoteEntity2.getMimeType() + " for " + cloudMetaRemoteEntity2.getId() + ", using NOTE default", new Object[0]);
                throw new IllegalArgumentException("Unknown mimeType " + cloudMetaRemoteEntity2.getMimeType());
            }
            if (iHashCode == 1883341446 && mimeType.equals(CloudMime.TEMPLATE)) {
                str3 = "application/vnd.notein-apps.template";
                LinkedHashMap linkedHashMapOooOOOO22 = C34444Oooo0O0.OooOOOO(cloudMetaRemoteEntity2.toCloudProperties());
                linkedHashMapOooOOOO22.put("mimeType", str3);
                String json22 = o00oo0o.f93069OooO0o0.toJson(linkedHashMapOooOOOO22);
                String strOooOo0o22 = o00oo0o.OooOo0o(str2, cloudMetaRemoteEntity2.getExtra().getTitle());
                C26800OooO c26800OooO22 = o00oo0o.f93066OooO0OO;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(json22);
                c26861o000000o.f93009OooOo0o = str2;
                c26861o000000o.f93008OooOo = o00oo0o;
                c26861o000000o.f93011OooOoO0 = str7;
                c26861o000000o.f93010OooOoO = linkedHashMapOooOOOO22;
                c26861o000000o.f93013OooOoo = 2;
                c26800OooO22.getClass();
                C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26830OooOooO(strOooOo0o22, json22, str2, null, c26800OooO22), c26861o000000o);
                if (objOooO0o != enumC32485OooO00o) {
                    str4 = str7;
                    obj2 = objOooO0o;
                    linkedHashMap = linkedHashMapOooOOOO22;
                    o00oo0o2 = o00oo0o;
                    str5 = str2;
                    c26804OooO0OO = (C26804OooO0OO) obj2;
                    if (c26804OooO0OO != null) {
                    }
                }
                return enumC32485OooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o22.OooOOO0("OneDriveDriveBackend");
            c20358OooO00o22.OooOO0O("uploadContent: unknown mimeType " + cloudMetaRemoteEntity2.getMimeType() + " for " + cloudMetaRemoteEntity2.getId() + ", using NOTE default", new Object[0]);
            throw new IllegalArgumentException("Unknown mimeType " + cloudMetaRemoteEntity2.getMimeType());
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0212 A[Catch: all -> 0x0089, TryCatch #5 {all -> 0x0089, blocks: (B:100:0x020c, B:102:0x0212, B:104:0x021e, B:105:0x022a, B:107:0x0230, B:109:0x023c, B:110:0x0240, B:111:0x0277, B:112:0x027e, B:113:0x027f, B:115:0x028f, B:117:0x0298, B:118:0x029f, B:119:0x02a0, B:99:0x0208, B:74:0x0179, B:76:0x017f, B:77:0x01ab, B:79:0x01b1, B:81:0x01bd, B:82:0x01c1, B:83:0x01cc, B:85:0x01dc, B:87:0x01e5, B:88:0x01ec, B:89:0x01ed, B:73:0x0175, B:28:0x0084, B:57:0x0111, B:59:0x0116, B:53:0x00f9), top: B:134:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027f A[Catch: all -> 0x0089, TryCatch #5 {all -> 0x0089, blocks: (B:100:0x020c, B:102:0x0212, B:104:0x021e, B:105:0x022a, B:107:0x0230, B:109:0x023c, B:110:0x0240, B:111:0x0277, B:112:0x027e, B:113:0x027f, B:115:0x028f, B:117:0x0298, B:118:0x029f, B:119:0x02a0, B:99:0x0208, B:74:0x0179, B:76:0x017f, B:77:0x01ab, B:79:0x01b1, B:81:0x01bd, B:82:0x01c1, B:83:0x01cc, B:85:0x01dc, B:87:0x01e5, B:88:0x01ec, B:89:0x01ed, B:73:0x0175, B:28:0x0084, B:57:0x0111, B:59:0x0116, B:53:0x00f9), top: B:134:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0116 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #5 {all -> 0x0089, blocks: (B:100:0x020c, B:102:0x0212, B:104:0x021e, B:105:0x022a, B:107:0x0230, B:109:0x023c, B:110:0x0240, B:111:0x0277, B:112:0x027e, B:113:0x027f, B:115:0x028f, B:117:0x0298, B:118:0x029f, B:119:0x02a0, B:99:0x0208, B:74:0x0179, B:76:0x017f, B:77:0x01ab, B:79:0x01b1, B:81:0x01bd, B:82:0x01c1, B:83:0x01cc, B:85:0x01dc, B:87:0x01e5, B:88:0x01ec, B:89:0x01ed, B:73:0x0175, B:28:0x0084, B:57:0x0111, B:59:0x0116, B:53:0x00f9), top: B:134:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017f A[Catch: all -> 0x0089, TryCatch #5 {all -> 0x0089, blocks: (B:100:0x020c, B:102:0x0212, B:104:0x021e, B:105:0x022a, B:107:0x0230, B:109:0x023c, B:110:0x0240, B:111:0x0277, B:112:0x027e, B:113:0x027f, B:115:0x028f, B:117:0x0298, B:118:0x029f, B:119:0x02a0, B:99:0x0208, B:74:0x0179, B:76:0x017f, B:77:0x01ab, B:79:0x01b1, B:81:0x01bd, B:82:0x01c1, B:83:0x01cc, B:85:0x01dc, B:87:0x01e5, B:88:0x01ec, B:89:0x01ed, B:73:0x0175, B:28:0x0084, B:57:0x0111, B:59:0x0116, B:53:0x00f9), top: B:134:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cc A[Catch: all -> 0x0089, TryCatch #5 {all -> 0x0089, blocks: (B:100:0x020c, B:102:0x0212, B:104:0x021e, B:105:0x022a, B:107:0x0230, B:109:0x023c, B:110:0x0240, B:111:0x0277, B:112:0x027e, B:113:0x027f, B:115:0x028f, B:117:0x0298, B:118:0x029f, B:119:0x02a0, B:99:0x0208, B:74:0x0179, B:76:0x017f, B:77:0x01ab, B:79:0x01b1, B:81:0x01bd, B:82:0x01c1, B:83:0x01cc, B:85:0x01dc, B:87:0x01e5, B:88:0x01ec, B:89:0x01ed, B:73:0x0175, B:28:0x0084, B:57:0x0111, B:59:0x0116, B:53:0x00f9), top: B:134:0x002c }] */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26865o00oO0o c26865o00oO0o;
        Object objOooOo0;
        o00oO0O o00oo0o;
        Object objOooO;
        o00oO0O o00oo0o2;
        Throwable thOooO00o;
        String str;
        Object obj;
        Object objOooOo;
        String str2;
        Object obj2;
        String str3;
        o00oO0O o00oo0o3;
        String str4;
        o00oO0O o00oo0o4;
        String str5;
        Serializable serializableOooOoO0;
        C24034Oooo00O c24034Oooo00O;
        String str6;
        Object objOooO0Oo;
        o00oO0O o00oo0o5;
        C24034Oooo00O c24034Oooo00O2;
        C24034Oooo00O c24034Oooo00O3;
        String str7;
        o00oO0O o00oo0o6;
        T t;
        Object objOooO0o;
        Object objOooO00o;
        Throwable thOooO00o2;
        Object obj3;
        Object objOooO00o2;
        Throwable thOooO00o3;
        Object obj4;
        if (abstractC32479OooO0OO instanceof C26865o00oO0o) {
            c26865o00oO0o = (C26865o00oO0o) abstractC32479OooO0OO;
            int i = c26865o00oO0o.f93093OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26865o00oO0o.f93093OooOooo = i - Integer.MIN_VALUE;
            } else {
                c26865o00oO0o = new C26865o00oO0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj5 = c26865o00oO0o.f93090OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26865o00oO0o.f93093OooOooo;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        try {
            switch (i2) {
                case 0:
                    C32446OooOOOo.OooO0O0(obj5);
                    c26865o00oO0o.f93086OooOo0o = this;
                    c26865o00oO0o.f93093OooOooo = 1;
                    objOooOo0 = OooOo0(c26865o00oO0o);
                    if (objOooOo0 != enumC32485OooO00o) {
                        o00oo0o = this;
                        if (!(objOooOo0 instanceof C32445OooOOOO.OooO00o)) {
                            Throwable thOooO00o4 = C32445OooOOOO.OooO00o(objOooOo0);
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o4);
                            return C32446OooOOOo.OooO00o(thOooO00o4);
                        }
                        c26865o00oO0o.f93086OooOo0o = o00oo0o;
                        c26865o00oO0o.f93093OooOooo = 2;
                        objOooO = o00oo0o.OooO(c26865o00oO0o);
                        if (objOooO != enumC32485OooO00o) {
                            o00oo0o2 = o00oo0o;
                            thOooO00o = C32445OooOOOO.OooO00o(objOooO);
                            if (thOooO00o == null) {
                                return C32446OooOOOo.OooO00o(new IllegalStateException("OneDrive no driveId", thOooO00o));
                            }
                            str = (String) objOooO;
                            c26865o00oO0o.f93086OooOo0o = o00oo0o2;
                            c26865o00oO0o.f93085OooOo = str;
                            c26865o00oO0o.f93093OooOooo = 3;
                            Object objOooOoO = o00oo0o2.OooOoO(c26865o00oO0o);
                            obj = objOooOoO;
                            if (objOooOoO != enumC32485OooO00o) {
                                String str8 = (String) obj;
                                c26865o00oO0o.f93086OooOo0o = str;
                                c26865o00oO0o.f93085OooOo = str8;
                                c26865o00oO0o.f93088OooOoO0 = o00oo0o2;
                                c26865o00oO0o.f93093OooOooo = 4;
                                objOooOo = o00oo0o2.OooOo(c26865o00oO0o);
                                if (objOooOo == enumC32485OooO00o) {
                                    o00oO0O o00oo0o7 = o00oo0o2;
                                    str2 = str8;
                                    obj2 = objOooOo;
                                    str3 = str;
                                    o00oo0o3 = o00oo0o7;
                                    str4 = (String) obj2;
                                    if (str2 != null) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o.OooOOO0("OneDriveDriveBackend");
                                        c20358OooO00o.OooO0o0("fetchFileSnapshots: no cursor, performing full scan", new Object[0]);
                                        C24034Oooo00O c24034Oooo00O4 = new C24034Oooo00O();
                                        try {
                                            C26800OooO c26800OooO = o00oo0o3.f93066OooO0OO;
                                            c26865o00oO0o.f93086OooOo0o = str3;
                                            c26865o00oO0o.f93085OooOo = o00oo0o3;
                                            c26865o00oO0o.f93088OooOoO0 = str4;
                                            c26865o00oO0o.f93087OooOoO = c24034Oooo00O4;
                                            c26865o00oO0o.f93089OooOoOO = o00oo0o3;
                                            c26865o00oO0o.f93091OooOoo0 = c24034Oooo00O4;
                                            c26865o00oO0o.f93093OooOooo = 5;
                                            objOooO0Oo = c26800OooO.OooO0Oo(str4, c26865o00oO0o);
                                        } catch (Throwable th) {
                                            th = th;
                                            c24034Oooo00O = c24034Oooo00O4;
                                            str6 = str3;
                                            objOooO00o = C32446OooOOOo.OooO00o(th);
                                        }
                                        if (objOooO0Oo != enumC32485OooO00o) {
                                            o00oo0o5 = o00oo0o3;
                                            c24034Oooo00O2 = c24034Oooo00O4;
                                            c24034Oooo00O3 = c24034Oooo00O2;
                                            str7 = str3;
                                            o00oo0o6 = o00oo0o5;
                                            t = objOooO0Oo;
                                            c24034Oooo00O3.f80942OooOo0o = t;
                                            c26865o00oO0o.f93086OooOo0o = str7;
                                            c26865o00oO0o.f93085OooOo = o00oo0o5;
                                            c26865o00oO0o.f93088OooOoO0 = c24034Oooo00O2;
                                            c26865o00oO0o.f93087OooOoO = null;
                                            c26865o00oO0o.f93089OooOoOO = null;
                                            c26865o00oO0o.f93091OooOoo0 = null;
                                            c26865o00oO0o.f93093OooOooo = 6;
                                            o00oo0o6.getClass();
                                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26856OooooOo(str4, o00oo0o6, null), c26865o00oO0o);
                                            if (objOooO0o != enumC32485OooO00o) {
                                                str6 = str7;
                                                c24034Oooo00O = c24034Oooo00O2;
                                                o00oo0o3 = o00oo0o5;
                                                obj3 = objOooO0o;
                                                objOooO00o = (List) obj3;
                                                thOooO00o2 = C32445OooOOOO.OooO00o(objOooO00o);
                                                if (thOooO00o2 == null) {
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                                    c20358OooO00o2.OooOOO0("OneDriveDriveBackend");
                                                    c20358OooO00o2.OooO0Oo(thOooO00o2, "fetchFileSnapshots: full scan failed", new Object[0]);
                                                    if ((thOooO00o2 instanceof C35219OooOO0O) && ((C35219OooOO0O) thOooO00o2).f126448OooOo0o == 404) {
                                                        throw new o0OO000.OooOO0("1007", "Root folder not found during full scan", thOooO00o2);
                                                    }
                                                    throw thOooO00o2;
                                                }
                                                List list = (List) objOooO00o;
                                                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o3.OooOOO0("OneDriveDriveBackend");
                                                c20358OooO00o3.OooO0o0("fetchFileSnapshots: full scan found " + list.size() + " files", new Object[0]);
                                                ArrayList arrayList = new ArrayList();
                                                Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    DriveSnapshotCacheEntity driveSnapshotCacheEntityOooOoo = o00oo0o3.OooOoo((C26804OooO0OO) it.next(), null, str6);
                                                    if (driveSnapshotCacheEntityOooOoo != null) {
                                                        arrayList.add(driveSnapshotCacheEntityOooOoo);
                                                    }
                                                }
                                                return new o0OOooO0.o00000O0(arrayList, c34434OooOoO, (String) c24034Oooo00O.f80942OooOo0o);
                                            }
                                        }
                                    } else {
                                        try {
                                            c26865o00oO0o.f93086OooOo0o = str3;
                                            c26865o00oO0o.f93085OooOo = o00oo0o3;
                                            c26865o00oO0o.f93088OooOoO0 = null;
                                            c26865o00oO0o.f93093OooOooo = 7;
                                            serializableOooOoO0 = o00oo0o3.OooOoO0(str4, str2, c26865o00oO0o);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            o00oo0o4 = o00oo0o3;
                                            str5 = str3;
                                            objOooO00o2 = C32446OooOOOo.OooO00o(th);
                                        }
                                        if (serializableOooOoO0 != enumC32485OooO00o) {
                                            o00oo0o4 = o00oo0o3;
                                            str5 = str3;
                                            obj4 = serializableOooOoO0;
                                            objOooO00o2 = (C32443OooOOO) obj4;
                                            thOooO00o3 = C32445OooOOOO.OooO00o(objOooO00o2);
                                            if (thOooO00o3 == null) {
                                                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o4.OooOOO0("OneDriveDriveBackend");
                                                c20358OooO00o4.OooO0Oo(thOooO00o3, "fetchFileSnapshots: delta fetch failed", new Object[0]);
                                                if ((thOooO00o3 instanceof C35219OooOO0O) && ((C35219OooOO0O) thOooO00o3).f126448OooOo0o == 404) {
                                                    throw new o0OO000.OooOO0("1007", "Root folder not found during delta fetch", thOooO00o3);
                                                }
                                                throw thOooO00o3;
                                            }
                                            C32443OooOOO c32443OooOOO = (C32443OooOOO) objOooO00o2;
                                            List list2 = (List) c32443OooOOO.f116638OooOo0o;
                                            String str9 = (String) c32443OooOOO.f116637OooOo;
                                            if (str9 == null) {
                                                throw new IllegalStateException("OneDrive delta token missing after delta fetch");
                                            }
                                            ArrayList arrayList2 = new ArrayList();
                                            Iterator it2 = list2.iterator();
                                            while (it2.hasNext()) {
                                                DriveSnapshotCacheEntity driveSnapshotCacheEntityOooOoo2 = o00oo0o4.OooOoo((C26804OooO0OO) it2.next(), null, str5);
                                                if (driveSnapshotCacheEntityOooOoo2 != null) {
                                                    arrayList2.add(driveSnapshotCacheEntityOooOoo2);
                                                }
                                            }
                                            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o5.OooOOO0("OneDriveDriveBackend");
                                            c20358OooO00o5.OooO0o0("fetchFileSnapshots: " + list2.size() + " changes -> " + arrayList2.size() + " snapshots", new Object[0]);
                                            return new o0OOooO0.o00000O0(arrayList2, c34434OooOoO, str9);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return enumC32485OooO00o;
                case 1:
                    o00oo0o = (o00oO0O) c26865o00oO0o.f93086OooOo0o;
                    C32446OooOOOo.OooO0O0(obj5);
                    objOooOo0 = ((C32445OooOOOO) obj5).f116639OooOo0o;
                    if (!(objOooOo0 instanceof C32445OooOOOO.OooO00o)) {
                    }
                    break;
                case 2:
                    o00oo0o = (o00oO0O) c26865o00oO0o.f93086OooOo0o;
                    C32446OooOOOo.OooO0O0(obj5);
                    objOooO = ((C32445OooOOOO) obj5).f116639OooOo0o;
                    o00oo0o2 = o00oo0o;
                    thOooO00o = C32445OooOOOO.OooO00o(objOooO);
                    if (thOooO00o == null) {
                    }
                    break;
                case 3:
                    str = (String) c26865o00oO0o.f93085OooOo;
                    o00oo0o2 = (o00oO0O) c26865o00oO0o.f93086OooOo0o;
                    C32446OooOOOo.OooO0O0(obj5);
                    obj = obj5;
                    String str82 = (String) obj;
                    c26865o00oO0o.f93086OooOo0o = str;
                    c26865o00oO0o.f93085OooOo = str82;
                    c26865o00oO0o.f93088OooOoO0 = o00oo0o2;
                    c26865o00oO0o.f93093OooOooo = 4;
                    objOooOo = o00oo0o2.OooOo(c26865o00oO0o);
                    if (objOooOo == enumC32485OooO00o) {
                    }
                    break;
                case 4:
                    o00oo0o3 = (o00oO0O) c26865o00oO0o.f93088OooOoO0;
                    str2 = (String) c26865o00oO0o.f93085OooOo;
                    str3 = (String) c26865o00oO0o.f93086OooOo0o;
                    C32446OooOOOo.OooO0O0(obj5);
                    obj2 = obj5;
                    str4 = (String) obj2;
                    if (str2 != null) {
                    }
                    return enumC32485OooO00o;
                case 5:
                    c24034Oooo00O3 = c26865o00oO0o.f93091OooOoo0;
                    o00oo0o6 = c26865o00oO0o.f93089OooOoOO;
                    c24034Oooo00O2 = c26865o00oO0o.f93087OooOoO;
                    str4 = (String) c26865o00oO0o.f93088OooOoO0;
                    o00oo0o5 = (o00oO0O) c26865o00oO0o.f93085OooOo;
                    str7 = (String) c26865o00oO0o.f93086OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(obj5);
                        t = obj5;
                        c24034Oooo00O3.f80942OooOo0o = t;
                        c26865o00oO0o.f93086OooOo0o = str7;
                        c26865o00oO0o.f93085OooOo = o00oo0o5;
                        c26865o00oO0o.f93088OooOoO0 = c24034Oooo00O2;
                        c26865o00oO0o.f93087OooOoO = null;
                        c26865o00oO0o.f93089OooOoOO = null;
                        c26865o00oO0o.f93091OooOoo0 = null;
                        c26865o00oO0o.f93093OooOooo = 6;
                        o00oo0o6.getClass();
                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26856OooooOo(str4, o00oo0o6, null), c26865o00oO0o);
                        if (objOooO0o != enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    } catch (Throwable th3) {
                        th = th3;
                        str6 = str7;
                        c24034Oooo00O = c24034Oooo00O2;
                        o00oo0o3 = o00oo0o5;
                        objOooO00o = C32446OooOOOo.OooO00o(th);
                    }
                    break;
                case 6:
                    c24034Oooo00O = (C24034Oooo00O) c26865o00oO0o.f93088OooOoO0;
                    o00oo0o3 = (o00oO0O) c26865o00oO0o.f93085OooOo;
                    str6 = (String) c26865o00oO0o.f93086OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(obj5);
                        obj3 = obj5;
                        objOooO00o = (List) obj3;
                    } catch (Throwable th4) {
                        th = th4;
                        objOooO00o = C32446OooOOOo.OooO00o(th);
                    }
                    thOooO00o2 = C32445OooOOOO.OooO00o(objOooO00o);
                    if (thOooO00o2 == null) {
                    }
                    break;
                case 7:
                    o00oo0o4 = (o00oO0O) c26865o00oO0o.f93085OooOo;
                    str5 = (String) c26865o00oO0o.f93086OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(obj5);
                        obj4 = obj5;
                        objOooO00o2 = (C32443OooOOO) obj4;
                    } catch (Throwable th5) {
                        th = th5;
                        objOooO00o2 = C32446OooOOOo.OooO00o(th);
                    }
                    thOooO00o3 = C32445OooOOOO.OooO00o(objOooO00o2);
                    if (thOooO00o3 == null) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th6) {
            return C32446OooOOOo.OooO00o(th6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26857Oooooo c26857Oooooo;
        if (abstractC32479OooO0OO instanceof C26857Oooooo) {
            c26857Oooooo = (C26857Oooooo) abstractC32479OooO0OO;
            int i = c26857Oooooo.f92979OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26857Oooooo.f92979OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26857Oooooo = new C26857Oooooo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26857Oooooo.f92978OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26857Oooooo.f92979OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c26857Oooooo.f92979OooOoO0 = 1;
                if (OooOooO(str, c26857Oooooo) == obj2) {
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

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        if (r7 != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26864o00o0O c26864o00o0O;
        Object objOooOo0;
        o00oO0O o00oo0o;
        if (abstractC32479OooO0OO instanceof C26864o00o0O) {
            c26864o00o0O = (C26864o00o0O) abstractC32479OooO0OO;
            int i = c26864o00o0O.f93059OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26864o00o0O.f93059OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26864o00o0O = new C26864o00o0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOo = c26864o00o0O.f93057OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26864o00o0O.f93059OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooOo);
                c26864o00o0O.f93058OooOo0o = this;
                c26864o00o0O.f93059OooOoO = 1;
                objOooOo0 = OooOo0(c26864o00o0O);
                if (objOooOo0 != enumC32485OooO00o) {
                    o00oo0o = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 == 1) {
                o00oo0o = c26864o00o0O.f93058OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOo);
                objOooOo0 = ((C32445OooOOOO) objOooOo).f116639OooOo0o;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(objOooOo);
                    return oOo000Oo.OooOo.o0OO00O((Iterable) objOooOo);
                }
                o00oo0o = c26864o00o0O.f93058OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOo);
                c26864o00o0O.f93058OooOo0o = null;
                c26864o00o0O.f93059OooOoO = 3;
                o00oo0o.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooOo = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26858Oooooo0((String) objOooOo, o00oo0o, null), c26864o00o0O);
            }
            if (objOooOo0 instanceof C32445OooOOOO.OooO00o) {
                Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOo0);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
                return C32446OooOOOo.OooO00o(thOooO00o);
            }
            c26864o00o0O.f93058OooOo0o = o00oo0o;
            c26864o00o0O.f93059OooOoO = 2;
            objOooOo = o00oo0o.OooOo(c26864o00o0O);
            if (objOooOo != enumC32485OooO00o) {
                c26864o00o0O.f93058OooOo0o = null;
                c26864o00o0O.f93059OooOoO = 3;
                o00oo0o.getClass();
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                objOooOo = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26858Oooooo0((String) objOooOo, o00oo0o, null), c26864o00o0O);
            }
            return enumC32485OooO00o;
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
        C26851OoooOoo c26851OoooOoo;
        o00oO0O o00oo0o;
        if (abstractC32479OooO0OO instanceof C26851OoooOoo) {
            c26851OoooOoo = (C26851OoooOoo) abstractC32479OooO0OO;
            int i = c26851OoooOoo.f92955OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26851OoooOoo.f92955OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26851OoooOoo = new C26851OoooOoo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26851OoooOoo.f92953OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26851OoooOoo.f92955OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c26851OoooOoo.f92954OooOo0o = this;
            c26851OoooOoo.f92955OooOoO = 1;
            if (this.f93065OooO0O0.OooO0o0(c26851OoooOoo) != enumC32485OooO00o) {
                o00oo0o = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            o00oo0o = c26851OoooOoo.f92954OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            o00oo0o = c26851OoooOoo.f92954OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c26851OoooOoo.f92954OooOo0o = null;
            c26851OoooOoo.f92955OooOoO = 3;
        }
        c26851OoooOoo.f92954OooOo0o = o00oo0o;
        c26851OoooOoo.f92955OooOoO = 2;
        if (o00oo0o.OooOo0O(c26851OoooOoo) != enumC32485OooO00o) {
            c26851OoooOoo.f92954OooOo0o = null;
            c26851OoooOoo.f92955OooOoO = 3;
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO(String str, Continuation<? super C32445OooOOOO<? extends List<NoteHistoryVersion>>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f93074OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f93074OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o((AbstractC32479OooO0OO) continuation);
            }
        }
        Object objOooO0o = oooO00o.f93073OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f93074OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0o);
                C26800OooO c26800OooO = this.f93066OooO0OO;
                oooO00o.f93074OooOoO0 = 1;
                c26800OooO.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26819OooOOoo(c26800OooO, str, null), oooO00o);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0o);
            }
            List<C26807OooO0o0> list = (List) objOooO0o;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            for (C26807OooO0o0 c26807OooO0o0 : list) {
                arrayList.add(new NoteHistoryVersion(c26807OooO0o0.getId(), c26807OooO0o0.getId(), o00OO.OooO00o.OooO0O0(c26807OooO0o0.getLastModifiedDateTime()), c26807OooO0o0.getSize()));
            }
            return arrayList;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x033b, code lost:
    
        if (r0 == r9) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e0 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x004b, B:123:0x033e, B:124:0x0340, B:125:0x0342, B:128:0x0349, B:129:0x0351, B:113:0x02d9, B:116:0x02e0, B:118:0x02e4, B:120:0x02ed, B:130:0x0352, B:112:0x02d4, B:23:0x0087, B:81:0x0219, B:26:0x009a, B:49:0x011d, B:56:0x0140, B:66:0x0165, B:70:0x01c1, B:74:0x01cc, B:77:0x01d8, B:69:0x019c, B:131:0x0353, B:132:0x0392, B:60:0x0150, B:63:0x015b, B:29:0x00b3, B:45:0x0104, B:32:0x00c0, B:39:0x00df, B:41:0x00ef, B:133:0x0393, B:134:0x039e, B:35:0x00cd), top: B:137:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0349 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x004b, B:123:0x033e, B:124:0x0340, B:125:0x0342, B:128:0x0349, B:129:0x0351, B:113:0x02d9, B:116:0x02e0, B:118:0x02e4, B:120:0x02ed, B:130:0x0352, B:112:0x02d4, B:23:0x0087, B:81:0x0219, B:26:0x009a, B:49:0x011d, B:56:0x0140, B:66:0x0165, B:70:0x01c1, B:74:0x01cc, B:77:0x01d8, B:69:0x019c, B:131:0x0353, B:132:0x0392, B:60:0x0150, B:63:0x015b, B:29:0x00b3, B:45:0x0104, B:32:0x00c0, B:39:0x00df, B:41:0x00ef, B:133:0x0393, B:134:0x039e, B:35:0x00cd), top: B:137:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0393 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x004b, B:123:0x033e, B:124:0x0340, B:125:0x0342, B:128:0x0349, B:129:0x0351, B:113:0x02d9, B:116:0x02e0, B:118:0x02e4, B:120:0x02ed, B:130:0x0352, B:112:0x02d4, B:23:0x0087, B:81:0x0219, B:26:0x009a, B:49:0x011d, B:56:0x0140, B:66:0x0165, B:70:0x01c1, B:74:0x01cc, B:77:0x01d8, B:69:0x019c, B:131:0x0353, B:132:0x0392, B:60:0x0150, B:63:0x015b, B:29:0x00b3, B:45:0x0104, B:32:0x00c0, B:39:0x00df, B:41:0x00ef, B:133:0x0393, B:134:0x039e, B:35:0x00cd), top: B:137:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x004b, B:123:0x033e, B:124:0x0340, B:125:0x0342, B:128:0x0349, B:129:0x0351, B:113:0x02d9, B:116:0x02e0, B:118:0x02e4, B:120:0x02ed, B:130:0x0352, B:112:0x02d4, B:23:0x0087, B:81:0x0219, B:26:0x009a, B:49:0x011d, B:56:0x0140, B:66:0x0165, B:70:0x01c1, B:74:0x01cc, B:77:0x01d8, B:69:0x019c, B:131:0x0353, B:132:0x0392, B:60:0x0150, B:63:0x015b, B:29:0x00b3, B:45:0x0104, B:32:0x00c0, B:39:0x00df, B:41:0x00ef, B:133:0x0393, B:134:0x039e, B:35:0x00cd), top: B:137:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015b A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x004b, B:123:0x033e, B:124:0x0340, B:125:0x0342, B:128:0x0349, B:129:0x0351, B:113:0x02d9, B:116:0x02e0, B:118:0x02e4, B:120:0x02ed, B:130:0x0352, B:112:0x02d4, B:23:0x0087, B:81:0x0219, B:26:0x009a, B:49:0x011d, B:56:0x0140, B:66:0x0165, B:70:0x01c1, B:74:0x01cc, B:77:0x01d8, B:69:0x019c, B:131:0x0353, B:132:0x0392, B:60:0x0150, B:63:0x015b, B:29:0x00b3, B:45:0x0104, B:32:0x00c0, B:39:0x00df, B:41:0x00ef, B:133:0x0393, B:134:0x039e, B:35:0x00cd), top: B:137:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019c A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x004b, B:123:0x033e, B:124:0x0340, B:125:0x0342, B:128:0x0349, B:129:0x0351, B:113:0x02d9, B:116:0x02e0, B:118:0x02e4, B:120:0x02ed, B:130:0x0352, B:112:0x02d4, B:23:0x0087, B:81:0x0219, B:26:0x009a, B:49:0x011d, B:56:0x0140, B:66:0x0165, B:70:0x01c1, B:74:0x01cc, B:77:0x01d8, B:69:0x019c, B:131:0x0353, B:132:0x0392, B:60:0x0150, B:63:0x015b, B:29:0x00b3, B:45:0x0104, B:32:0x00c0, B:39:0x00df, B:41:0x00ef, B:133:0x0393, B:134:0x039e, B:35:0x00cd), top: B:137:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d8 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x004b, B:123:0x033e, B:124:0x0340, B:125:0x0342, B:128:0x0349, B:129:0x0351, B:113:0x02d9, B:116:0x02e0, B:118:0x02e4, B:120:0x02ed, B:130:0x0352, B:112:0x02d4, B:23:0x0087, B:81:0x0219, B:26:0x009a, B:49:0x011d, B:56:0x0140, B:66:0x0165, B:70:0x01c1, B:74:0x01cc, B:77:0x01d8, B:69:0x019c, B:131:0x0353, B:132:0x0392, B:60:0x0150, B:63:0x015b, B:29:0x00b3, B:45:0x0104, B:32:0x00c0, B:39:0x00df, B:41:0x00ef, B:133:0x0393, B:134:0x039e, B:35:0x00cd), top: B:137:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021d  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(o0OOooO0.o00000O o00000o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000000O o000000o2;
        o0OOooO0.o00000O o00000o2;
        Object obj;
        o00oO0O o00oo0o;
        File file;
        File file2;
        o0OOooO0.o00000O o00000o3;
        Serializable serializableOooO;
        String str;
        File file3;
        Object obj2;
        int iHashCode;
        String str2;
        long lastModified;
        CloudMetaRemoteEntity cloudMetaRemoteEntity;
        String str3;
        boolean zOooo0o0;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        o00oO0O o00oo0o2;
        LinkedHashMap linkedHashMap;
        String str12;
        String str13;
        String str14;
        String str15;
        Map<String, String> map;
        o00oO0O o00oo0o3;
        C26804OooO0OO c26804OooO0OO;
        Object objOooO00o;
        Throwable thOooO00o;
        DriveSnapshotCacheEntity driveSnapshotCacheEntityOooOoo;
        if (abstractC32479OooO0OO instanceof o000000O) {
            o000000o2 = (o000000O) abstractC32479OooO0OO;
            int i = o000000o2.f93007Oooo00o;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000000o2.f93007Oooo00o = i - Integer.MIN_VALUE;
            } else {
                o000000o2 = new o000000O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = o000000o2.f93005Oooo000;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        try {
            switch (o000000o2.f93007Oooo00o) {
                case 0:
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    o000000o2.f92997OooOo0o = o00000o;
                    o000000o2.f92996OooOo = this;
                    o000000o2.f93007Oooo00o = 1;
                    Object objOooOo0 = OooOo0(o000000o2);
                    if (objOooOo0 == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    o00000o2 = o00000o;
                    obj = objOooOo0;
                    o00oo0o = this;
                    C32446OooOOOo.OooO0O0(obj);
                    file = new File(o00000o2.f98986OooO0O0);
                    if (file.exists()) {
                        throw new IllegalStateException("Bundle file missing: ".concat(o00000o2.f98986OooO0O0));
                    }
                    o000000o2.f92997OooOo0o = o00000o2;
                    o000000o2.f92996OooOo = o00oo0o;
                    o000000o2.f92999OooOoO0 = file;
                    o000000o2.f93007Oooo00o = 2;
                    Object objOooOo = o00oo0o.OooOo(o000000o2);
                    if (objOooOo == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    file2 = file;
                    objOooO0o = objOooOo;
                    o00000o3 = o00000o2;
                    String str16 = (String) objOooO0o;
                    o000000o2.f92997OooOo0o = o00000o3;
                    o000000o2.f92996OooOo = o00oo0o;
                    o000000o2.f92999OooOoO0 = file2;
                    o000000o2.f92998OooOoO = str16;
                    o000000o2.f93007Oooo00o = 3;
                    serializableOooO = o00oo0o.OooO(o000000o2);
                    if (serializableOooO != enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    str = str16;
                    file3 = file2;
                    obj2 = serializableOooO;
                    C32446OooOOOo.OooO0O0(obj2);
                    String str17 = (String) obj2;
                    String mimeType = o00000o3.f98985OooO00o.getMimeType();
                    iHashCode = mimeType.hashCode();
                    CloudMetaRemoteEntity cloudMetaRemoteEntity2 = o00000o3.f98985OooO00o;
                    if (iHashCode != 393630974) {
                        if (mimeType.equals(CloudMime.NOTE)) {
                            str2 = "application/vnd.notein-apps.dbfile";
                            LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO(cloudMetaRemoteEntity2.toCloudProperties());
                            linkedHashMapOooOOOO.put("mimeType", str2);
                            String json = o00oo0o.f93069OooO0o0.toJson(linkedHashMapOooOOOO);
                            String strOooOo0o = o00oo0o.OooOo0o(cloudMetaRemoteEntity2.getId(), cloudMetaRemoteEntity2.getExtra().getTitle());
                            lastModified = cloudMetaRemoteEntity2.getContentTag().getLastModified();
                            if (lastModified <= 0) {
                            }
                            if (str3.length() > 0) {
                            }
                            String driveObjectKey = cloudMetaRemoteEntity.getDriveObjectKey();
                            zOooo0o0 = C33599OooOo0O.Oooo0o0(driveObjectKey);
                            C26800OooO c26800OooO = o00oo0o.f93066OooO0OO;
                            if (!zOooo0o0) {
                            }
                            return enumC32485OooO00o;
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("OneDriveDriveBackend");
                        c20358OooO00o.OooOO0O("uploadContent: unknown mimeType " + cloudMetaRemoteEntity2.getMimeType() + " for " + cloudMetaRemoteEntity2.getId() + ", using NOTE default", new Object[0]);
                        throw new IllegalArgumentException("Unknown mimeType " + cloudMetaRemoteEntity2.getMimeType());
                    }
                    if (iHashCode == 1600536058) {
                        if (mimeType.equals(CloudMime.FOLDER)) {
                            str2 = "application/vnd.notein-apps.folders";
                            LinkedHashMap linkedHashMapOooOOOO2 = C34444Oooo0O0.OooOOOO(cloudMetaRemoteEntity2.toCloudProperties());
                            linkedHashMapOooOOOO2.put("mimeType", str2);
                            String json2 = o00oo0o.f93069OooO0o0.toJson(linkedHashMapOooOOOO2);
                            String strOooOo0o2 = o00oo0o.OooOo0o(cloudMetaRemoteEntity2.getId(), cloudMetaRemoteEntity2.getExtra().getTitle());
                            lastModified = cloudMetaRemoteEntity2.getContentTag().getLastModified();
                            if (lastModified <= 0) {
                            }
                            if (str3.length() > 0) {
                            }
                            String driveObjectKey2 = cloudMetaRemoteEntity.getDriveObjectKey();
                            zOooo0o0 = C33599OooOo0O.Oooo0o0(driveObjectKey2);
                            C26800OooO c26800OooO2 = o00oo0o.f93066OooO0OO;
                            if (!zOooo0o0) {
                            }
                            return enumC32485OooO00o;
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("OneDriveDriveBackend");
                        c20358OooO00o2.OooOO0O("uploadContent: unknown mimeType " + cloudMetaRemoteEntity2.getMimeType() + " for " + cloudMetaRemoteEntity2.getId() + ", using NOTE default", new Object[0]);
                        throw new IllegalArgumentException("Unknown mimeType " + cloudMetaRemoteEntity2.getMimeType());
                    }
                    if (iHashCode == 1883341446 && mimeType.equals(CloudMime.TEMPLATE)) {
                        str2 = "application/vnd.notein-apps.template";
                        LinkedHashMap linkedHashMapOooOOOO22 = C34444Oooo0O0.OooOOOO(cloudMetaRemoteEntity2.toCloudProperties());
                        linkedHashMapOooOOOO22.put("mimeType", str2);
                        String json22 = o00oo0o.f93069OooO0o0.toJson(linkedHashMapOooOOOO22);
                        String strOooOo0o22 = o00oo0o.OooOo0o(cloudMetaRemoteEntity2.getId(), cloudMetaRemoteEntity2.getExtra().getTitle());
                        lastModified = cloudMetaRemoteEntity2.getContentTag().getLastModified();
                        if (lastModified <= 0) {
                            str3 = "";
                            cloudMetaRemoteEntity = cloudMetaRemoteEntity2;
                        } else {
                            cloudMetaRemoteEntity = cloudMetaRemoteEntity2;
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
                            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                            str3 = simpleDateFormat.format(new Date(lastModified));
                            kotlin.jvm.internal.OooOOO0.OooO0o(str3, "format(...)");
                        }
                        String str18 = str3.length() > 0 ? str3 : null;
                        String driveObjectKey22 = cloudMetaRemoteEntity.getDriveObjectKey();
                        zOooo0o0 = C33599OooOo0O.Oooo0o0(driveObjectKey22);
                        C26800OooO c26800OooO22 = o00oo0o.f93066OooO0OO;
                        if (!zOooo0o0) {
                            String str19 = str18;
                            str4 = str;
                            try {
                                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o3.OooOOO0("OneDriveDriveBackend");
                                str6 = "uploadContent: fileId ";
                                try {
                                    str9 = "OneDriveDriveBackend";
                                    try {
                                        c20358OooO00o3.OooO00o("uploadContent: updating existing file " + driveObjectKey22 + " for " + cloudMetaRemoteEntity.getId(), new Object[0]);
                                        o000000o2.f92997OooOo0o = o00oo0o;
                                        o000000o2.f92996OooOo = file3;
                                        o000000o2.f92999OooOoO0 = str4;
                                        o000000o2.f92998OooOoO = str17;
                                        o000000o2.f93000OooOoOO = linkedHashMapOooOOOO22;
                                        o000000o2.f93002OooOoo0 = json22;
                                        o000000o2.f93001OooOoo = strOooOo0o22;
                                        o000000o2.f93003OooOooO = driveObjectKey22;
                                        o000000o2.f93004OooOooo = str19;
                                        o000000o2.f93007Oooo00o = 5;
                                        c26800OooO22.getClass();
                                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                                        str5 = driveObjectKey22;
                                        File file4 = file3;
                                        try {
                                            C26825OooOoO c26825OooOoO = new C26825OooOoO(c26800OooO22, file4, str5, strOooOo0o22, json22, str19, null);
                                            str8 = strOooOo0o22;
                                            str7 = json22;
                                            try {
                                                objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c26825OooOoO, o000000o2);
                                                break;
                                            } catch (Throwable th) {
                                                th = th;
                                                o00oO0O o00oo0o4 = o00oo0o;
                                                str10 = str17;
                                                str11 = str19;
                                                o00oo0o2 = o00oo0o4;
                                                linkedHashMap = linkedHashMapOooOOOO22;
                                                str12 = str8;
                                                str13 = str7;
                                                str14 = str5;
                                                objOooO00o = C32446OooOOOo.OooO00o(th);
                                                String str20 = str11;
                                                String str21 = str14;
                                                String str22 = str12;
                                                String str23 = str13;
                                                map = linkedHashMap;
                                                str15 = str10;
                                                o00oo0o3 = o00oo0o2;
                                                String str24 = str4;
                                                File file5 = file3;
                                                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                                                if (thOooO00o == null) {
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            file3 = file4;
                                            str8 = strOooOo0o22;
                                            str7 = json22;
                                            str19 = str19;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        str5 = driveObjectKey22;
                                        str7 = json22;
                                        str8 = strOooOo0o22;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    str5 = driveObjectKey22;
                                    str7 = json22;
                                    str8 = strOooOo0o22;
                                    str9 = "OneDriveDriveBackend";
                                    o00oO0O o00oo0o42 = o00oo0o;
                                    str10 = str17;
                                    str11 = str19;
                                    o00oo0o2 = o00oo0o42;
                                    linkedHashMap = linkedHashMapOooOOOO22;
                                    str12 = str8;
                                    str13 = str7;
                                    str14 = str5;
                                    objOooO00o = C32446OooOOOo.OooO00o(th);
                                    String str202 = str11;
                                    String str212 = str14;
                                    String str222 = str12;
                                    String str232 = str13;
                                    map = linkedHashMap;
                                    str15 = str10;
                                    o00oo0o3 = o00oo0o2;
                                    String str242 = str4;
                                    File file52 = file3;
                                    thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                                    if (thOooO00o == null) {
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                str5 = driveObjectKey22;
                                str6 = "uploadContent: fileId ";
                            }
                            if (objOooO0o != enumC32485OooO00o) {
                                o00oO0O o00oo0o5 = o00oo0o;
                                str10 = str17;
                                str11 = str19;
                                o00oo0o2 = o00oo0o5;
                                linkedHashMap = linkedHashMapOooOOOO22;
                                str12 = str8;
                                str13 = str7;
                                str14 = str5;
                                try {
                                    objOooO00o = (C26804OooO0OO) objOooO0o;
                                } catch (Throwable th6) {
                                    th = th6;
                                    objOooO00o = C32446OooOOOo.OooO00o(th);
                                }
                                String str2022 = str11;
                                String str2122 = str14;
                                String str2222 = str12;
                                String str2322 = str13;
                                map = linkedHashMap;
                                str15 = str10;
                                o00oo0o3 = o00oo0o2;
                                String str2422 = str4;
                                File file522 = file3;
                                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                                if (thOooO00o == null) {
                                    c26804OooO0OO = (C26804OooO0OO) objOooO00o;
                                } else {
                                    if (!(thOooO00o instanceof C35219OooOO0O) || ((C35219OooOO0O) thOooO00o).f126448OooOo0o != 404) {
                                        throw thOooO00o;
                                    }
                                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o4.OooOOO0(str9);
                                    c20358OooO00o4.OooOO0O(str6 + str2122 + " not found (404), fallback to create", new Object[0]);
                                    C26800OooO c26800OooO3 = o00oo0o3.f93066OooO0OO;
                                    o000000o2.f92997OooOo0o = o00oo0o3;
                                    o000000o2.f92996OooOo = str15;
                                    o000000o2.f92999OooOoO0 = map;
                                    o000000o2.f92998OooOoO = null;
                                    o000000o2.f93000OooOoOO = null;
                                    o000000o2.f93002OooOoo0 = null;
                                    o000000o2.f93001OooOoo = null;
                                    o000000o2.f93003OooOooO = null;
                                    o000000o2.f93004OooOooo = null;
                                    o000000o2.f93007Oooo00o = 6;
                                    c26800OooO3.getClass();
                                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26833Oooo000(c26800OooO3, file522, str2422, str2222, str2322, str2022, null), o000000o2);
                                }
                            }
                            break;
                        } else {
                            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o5.OooOOO0("OneDriveDriveBackend");
                            c20358OooO00o5.OooO00o("uploadContent: creating new file for " + cloudMetaRemoteEntity.getId(), new Object[0]);
                            o000000o2.f92997OooOo0o = o00oo0o;
                            o000000o2.f92996OooOo = str17;
                            o000000o2.f92999OooOoO0 = linkedHashMapOooOOOO22;
                            o000000o2.f92998OooOoO = null;
                            o000000o2.f93007Oooo00o = 4;
                            c26800OooO22.getClass();
                            C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26833Oooo000(c26800OooO22, file3, str, strOooOo0o22, json22, str18, null), o000000o2);
                            if (objOooO0o != enumC32485OooO00o) {
                                str15 = str17;
                                map = linkedHashMapOooOOOO22;
                                o00oo0o3 = o00oo0o;
                                c26804OooO0OO = (C26804OooO0OO) objOooO0o;
                            }
                        }
                        return enumC32485OooO00o;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o22.OooOOO0("OneDriveDriveBackend");
                    c20358OooO00o22.OooOO0O("uploadContent: unknown mimeType " + cloudMetaRemoteEntity2.getMimeType() + " for " + cloudMetaRemoteEntity2.getId() + ", using NOTE default", new Object[0]);
                    throw new IllegalArgumentException("Unknown mimeType " + cloudMetaRemoteEntity2.getMimeType());
                    driveSnapshotCacheEntityOooOoo = o00oo0o3.OooOoo(c26804OooO0OO, map, str15);
                    if (driveSnapshotCacheEntityOooOoo == null) {
                        return driveSnapshotCacheEntityOooOoo;
                    }
                    throw new IllegalStateException("uploadContent: cannot convert DriveItem to snapshot");
                case 1:
                    o00oo0o = (o00oO0O) o000000o2.f92996OooOo;
                    o00000o2 = (o0OOooO0.o00000O) o000000o2.f92997OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    obj = ((C32445OooOOOO) objOooO0o).f116639OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    file = new File(o00000o2.f98986OooO0O0);
                    if (file.exists()) {
                    }
                    break;
                case 2:
                    file2 = (File) o000000o2.f92999OooOoO0;
                    o00oo0o = (o00oO0O) o000000o2.f92996OooOo;
                    o00000o2 = (o0OOooO0.o00000O) o000000o2.f92997OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    o00000o3 = o00000o2;
                    String str162 = (String) objOooO0o;
                    o000000o2.f92997OooOo0o = o00000o3;
                    o000000o2.f92996OooOo = o00oo0o;
                    o000000o2.f92999OooOoO0 = file2;
                    o000000o2.f92998OooOoO = str162;
                    o000000o2.f93007Oooo00o = 3;
                    serializableOooO = o00oo0o.OooO(o000000o2);
                    if (serializableOooO != enumC32485OooO00o) {
                    }
                    break;
                case 3:
                    String str25 = o000000o2.f92998OooOoO;
                    File file6 = (File) o000000o2.f92999OooOoO0;
                    o00oO0O o00oo0o6 = (o00oO0O) o000000o2.f92996OooOo;
                    o00000o3 = (o0OOooO0.o00000O) o000000o2.f92997OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    obj2 = ((C32445OooOOOO) objOooO0o).f116639OooOo0o;
                    str = str25;
                    file3 = file6;
                    o00oo0o = o00oo0o6;
                    C32446OooOOOo.OooO0O0(obj2);
                    String str172 = (String) obj2;
                    String mimeType2 = o00000o3.f98985OooO00o.getMimeType();
                    iHashCode = mimeType2.hashCode();
                    CloudMetaRemoteEntity cloudMetaRemoteEntity22 = o00000o3.f98985OooO00o;
                    if (iHashCode != 393630974) {
                    }
                    driveSnapshotCacheEntityOooOoo = o00oo0o3.OooOoo(c26804OooO0OO, map, str15);
                    if (driveSnapshotCacheEntityOooOoo == null) {
                    }
                    break;
                case 4:
                    map = (Map) o000000o2.f92999OooOoO0;
                    str15 = (String) o000000o2.f92996OooOo;
                    o00oo0o3 = (o00oO0O) o000000o2.f92997OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    c26804OooO0OO = (C26804OooO0OO) objOooO0o;
                    driveSnapshotCacheEntityOooOoo = o00oo0o3.OooOoo(c26804OooO0OO, map, str15);
                    if (driveSnapshotCacheEntityOooOoo == null) {
                    }
                    break;
                case 5:
                    str11 = o000000o2.f93004OooOooo;
                    str14 = o000000o2.f93003OooOooO;
                    str12 = o000000o2.f93001OooOoo;
                    str13 = o000000o2.f93002OooOoo0;
                    linkedHashMap = o000000o2.f93000OooOoOO;
                    str10 = o000000o2.f92998OooOoO;
                    str4 = (String) o000000o2.f92999OooOoO0;
                    file3 = (File) o000000o2.f92996OooOo;
                    o00oo0o2 = (o00oO0O) o000000o2.f92997OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooO0o);
                        str6 = "uploadContent: fileId ";
                        str9 = "OneDriveDriveBackend";
                        objOooO00o = (C26804OooO0OO) objOooO0o;
                        break;
                    } catch (Throwable th7) {
                        th = th7;
                        str6 = "uploadContent: fileId ";
                        str9 = "OneDriveDriveBackend";
                        objOooO00o = C32446OooOOOo.OooO00o(th);
                        String str20222 = str11;
                        String str21222 = str14;
                        String str22222 = str12;
                        String str23222 = str13;
                        map = linkedHashMap;
                        str15 = str10;
                        o00oo0o3 = o00oo0o2;
                        String str24222 = str4;
                        File file5222 = file3;
                        thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                        if (thOooO00o == null) {
                        }
                    }
                    String str202222 = str11;
                    String str212222 = str14;
                    String str222222 = str12;
                    String str232222 = str13;
                    map = linkedHashMap;
                    str15 = str10;
                    o00oo0o3 = o00oo0o2;
                    String str242222 = str4;
                    File file52222 = file3;
                    thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                    if (thOooO00o == null) {
                    }
                    break;
                case 6:
                    map = (Map) o000000o2.f92999OooOoO0;
                    str15 = (String) o000000o2.f92996OooOo;
                    o00oo0o3 = (o00oO0O) o000000o2.f92997OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    objOooO00o = (C26804OooO0OO) objOooO0o;
                    c26804OooO0OO = (C26804OooO0OO) objOooO00o;
                    driveSnapshotCacheEntityOooOoo = o00oo0o3.OooOoo(c26804OooO0OO, map, str15);
                    if (driveSnapshotCacheEntityOooOoo == null) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th8) {
            return C32446OooOOOo.OooO00o(th8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOO(File file, String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26860Ooooooo c26860Ooooooo;
        Throwable th;
        if (abstractC32479OooO0OO instanceof C26860Ooooooo) {
            c26860Ooooooo = (C26860Ooooooo) abstractC32479OooO0OO;
            int i = c26860Ooooooo.f92991OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26860Ooooooo.f92991OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26860Ooooooo = new C26860Ooooooo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26860Ooooooo.f92990OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26860Ooooooo.f92991OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                try {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    try {
                        InterfaceC32507OooOO0o o0oooo02 = new o0OoOo0(this, str, file, str2, null);
                        c26860Ooooooo.f92991OooOoO0 = 1;
                        if (OooOoo0(o0oooo02, c26860Ooooooo) == obj2) {
                            return obj2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        return C32446OooOOOo.OooO00o(th);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    return C32446OooOOOo.OooO00o(th);
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26859OoooooO c26859OoooooO;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C26859OoooooO) {
            c26859OoooooO = (C26859OoooooO) abstractC32479OooO0OO;
            int i = c26859OoooooO.f92987OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26859OoooooO.f92987OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26859OoooooO = new C26859OoooooO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26859OoooooO.f92985OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26859OoooooO.f92987OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26800OooO c26800OooO = this.f93066OooO0OO;
                Set setOooOO0 = C34449Oooo0oo.OooOO0(str);
                c26859OoooooO.f92986OooOo0o = str;
                c26859OoooooO.f92987OooOoO = 1;
                c26800OooO.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26812OooOO0o(setOooOO0, c26800OooO, null), c26859OoooooO);
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
                str = c26859OoooooO.f92986OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            objOooO00o = C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(thOooO00o, androidx.core.app.OooO.OooO0O0(c20358OooO00o, "OneDriveDriveBackend", "deleteFile failed for ", str), new Object[0]);
        }
        return objOooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo(String str, File file, String str2, long j, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26869ooOO c26869ooOO;
        if (abstractC32479OooO0OO instanceof C26869ooOO) {
            c26869ooOO = (C26869ooOO) abstractC32479OooO0OO;
            int i = c26869ooOO.f93142OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26869ooOO.f93142OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26869ooOO = new C26869ooOO(this, abstractC32479OooO0OO);
            }
        }
        C26869ooOO c26869ooOO2 = c26869ooOO;
        Object obj = c26869ooOO2.f93141OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26869ooOO2.f93142OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                InterfaceC32507OooOO0o o00o0o2 = new o00O0O(this, str, file, str2, j, interfaceC32507OooOO0o, null);
                c26869ooOO2.f93142OooOoO0 = 1;
                if (OooOoo0(o00o0o2, c26869ooOO2) == obj2) {
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

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:47:0x00c6, B:49:0x00cc, B:51:0x00d0, B:56:0x00d9, B:57:0x00e0, B:58:0x00e1, B:60:0x00e5, B:62:0x00ee, B:63:0x0101, B:64:0x0102, B:46:0x00c2), top: B:71:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1 A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:47:0x00c6, B:49:0x00cc, B:51:0x00d0, B:56:0x00d9, B:57:0x00e0, B:58:0x00e1, B:60:0x00e5, B:62:0x00ee, B:63:0x0101, B:64:0x0102, B:46:0x00c2), top: B:71:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOooO0.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        oo000o oo000oVar;
        Object objOooOo0;
        o00oO0O o00oo0o;
        Object objOooO;
        o00oO0O o00oo0o2;
        Throwable thOooO00o;
        String str2;
        Throwable th;
        String str3;
        Object objOooO0o;
        Object objOooO00o;
        Throwable thOooO00o2;
        DriveSnapshotCacheEntity driveSnapshotCacheEntityOooOoo;
        if (abstractC32479OooO0OO instanceof oo000o) {
            oo000oVar = (oo000o) abstractC32479OooO0OO;
            int i = oo000oVar.f93134OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo000oVar.f93134OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                oo000oVar = new oo000o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oo000oVar.f93131OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo000oVar.f93134OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oo000oVar.f93130OooOo0o = this;
            oo000oVar.f93129OooOo = str;
            oo000oVar.f93134OooOoo0 = 1;
            objOooOo0 = OooOo0(oo000oVar);
            if (objOooOo0 != enumC32485OooO00o) {
                o00oo0o = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o2 = oo000oVar.f93132OooOoO0;
                str2 = oo000oVar.f93129OooOo;
                str3 = (String) oo000oVar.f93130OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    objOooO00o = (C26804OooO0OO) obj;
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
                    C26804OooO0OO c26804OooO0OO = (C26804OooO0OO) objOooO00o;
                    if (c26804OooO0OO == null || (driveSnapshotCacheEntityOooOoo = o00oo0o2.OooOoo(c26804OooO0OO, null, str2)) == null) {
                        throw new IllegalStateException("fetchFileSnapshot: cannot convert DriveItem to snapshot");
                    }
                    return driveSnapshotCacheEntityOooOoo;
                }
                if (!(thOooO00o2 instanceof C35219OooOO0O) || ((C35219OooOO0O) thOooO00o2).f126448OooOo0o != 404) {
                    throw thOooO00o2;
                }
                throw new o0OO000.OooOO0("1007", "File not found: " + str3, thOooO00o2);
            }
            str = oo000oVar.f93129OooOo;
            o00oo0o = (o00oO0O) oo000oVar.f93130OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO = ((C32445OooOOOO) obj).f116639OooOo0o;
            o00oO0O o00oo0o3 = o00oo0o;
            String str4 = str;
            o00oo0o2 = o00oo0o3;
            thOooO00o = C32445OooOOOO.OooO00o(objOooO);
            if (thOooO00o == null) {
                return C32446OooOOOo.OooO00o(new IllegalStateException("OneDrive no driveId", thOooO00o));
            }
            String str5 = (String) objOooO;
            try {
                C26800OooO c26800OooO = o00oo0o2.f93066OooO0OO;
                oo000oVar.f93130OooOo0o = str4;
                oo000oVar.f93129OooOo = str5;
                oo000oVar.f93132OooOoO0 = o00oo0o2;
                oo000oVar.f93134OooOoo0 = 3;
                c26800OooO.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26817OooOOo(c26800OooO, str4, null), oo000oVar);
            } catch (Throwable th4) {
                str2 = str5;
                th = th4;
                str3 = str4;
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
            if (objOooO0o != enumC32485OooO00o) {
                str2 = str5;
                obj = objOooO0o;
                str3 = str4;
                objOooO00o = (C26804OooO0OO) obj;
                thOooO00o2 = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o2 != null) {
                }
            }
            return enumC32485OooO00o;
        }
        str = oo000oVar.f93129OooOo;
        o00oo0o = (o00oO0O) oo000oVar.f93130OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooOo0 = ((C32445OooOOOO) obj).f116639OooOo0o;
        if (objOooOo0 instanceof C32445OooOOOO.OooO00o) {
            Throwable thOooO00o3 = C32445OooOOOO.OooO00o(objOooOo0);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o3);
            return C32446OooOOOo.OooO00o(thOooO00o3);
        }
        oo000oVar.f93130OooOo0o = o00oo0o;
        oo000oVar.f93129OooOo = str;
        oo000oVar.f93134OooOoo0 = 2;
        objOooO = o00oo0o.OooO(oo000oVar);
        if (objOooO != enumC32485OooO00o) {
            o00oO0O o00oo0o32 = o00oo0o;
            String str42 = str;
            o00oo0o2 = o00oo0o32;
            thOooO00o = C32445OooOOOO.OooO00o(objOooO);
            if (thOooO00o == null) {
            }
        }
        return enumC32485OooO00o;
    }

    @Override // o0OOooO0.o00000
    public final Object OooOOoo(CloudAuthRequest cloudAuthRequest, C27904OooOo c27904OooOo) {
        return this.f93065OooO0O0.OooO0Oo(cloudAuthRequest, c27904OooOo);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:106)|(1:(1:(1:(3:(1:(6:15|105|16|79|(1:81)(1:82)|(2:90|91)(4:86|87|88|89))(2:20|21))(11:22|101|23|24|59|(3:60|61|(3:63|(3:107|65|(2:109|67)(1:112))(1:111)|110)(2:108|68))|69|(4:74|(1:84)|90|91)|75|(6:78|79|(0)(0)|(0)|90|91)|77)|99|100)(4:27|28|51|(2:53|(2:55|(2:57|77)(8:58|59|(4:60|61|(0)(0)|110)|69|(5:71|74|(0)|90|91)|75|(0)|77))(2:92|93))(2:94|95)))(6:32|33|34|47|(3:50|51|(0)(0))|77))(1:35))(3:36|(1:39)|77)|103|40|(3:42|88|89)(2:43|(2:45|77)(4:46|47|(0)|77))) */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0176, code lost:
    
        r1 = r13;
        r13 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0179, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4 A[Catch: all -> 0x005f, TryCatch #3 {all -> 0x005f, blocks: (B:59:0x00ea, B:60:0x00f0, B:63:0x00f8, B:65:0x0105, B:69:0x0113, B:71:0x0117, B:75:0x0121, B:28:0x005a, B:51:0x00c0, B:53:0x00c4, B:55:0x00ca, B:92:0x0166, B:93:0x016d, B:94:0x016e, B:95:0x0175, B:33:0x0067), top: B:106:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8 A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #3 {all -> 0x005f, blocks: (B:59:0x00ea, B:60:0x00f0, B:63:0x00f8, B:65:0x0105, B:69:0x0113, B:71:0x0117, B:75:0x0121, B:28:0x005a, B:51:0x00c0, B:53:0x00c4, B:55:0x00ca, B:92:0x0166, B:93:0x016d, B:94:0x016e, B:95:0x0175, B:33:0x0067), top: B:106:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0146 A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:16:0x0034, B:79:0x0142, B:81:0x0146, B:84:0x0151, B:86:0x0157, B:90:0x015e, B:91:0x0165), top: B:105:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0151 A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:16:0x0034, B:79:0x0142, B:81:0x0146, B:84:0x0151, B:86:0x0157, B:90:0x015e, B:91:0x0165), top: B:105:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016e A[Catch: all -> 0x005f, TryCatch #3 {all -> 0x005f, blocks: (B:59:0x00ea, B:60:0x00f0, B:63:0x00f8, B:65:0x0105, B:69:0x0113, B:71:0x0117, B:75:0x0121, B:28:0x005a, B:51:0x00c0, B:53:0x00c4, B:55:0x00ca, B:92:0x0166, B:93:0x016d, B:94:0x016e, B:95:0x0175, B:33:0x0067), top: B:106:0x0024 }] */
    /* JADX WARN: Type inference failed for: r13v22, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        o00Ooo o00ooo2;
        ?? r1;
        o00oO0O o00oo0o;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        String id;
        o00oO0O o00oo0o2;
        Object objOooO0o;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        o00oO0O o00oo0o3;
        C26804OooO0OO c26804OooO0OO;
        String str;
        InterfaceC33895OooO00o interfaceC33895OooO00o3;
        Iterator it;
        Object next;
        C26804OooO0OO c26804OooO0OO2;
        ?? r12;
        o00oO0O o00oo0o4;
        String id2;
        ?? r13;
        ?? r132;
        C26804OooO0OO c26804OooO0OO3;
        if (abstractC32479OooO0OO instanceof o00Ooo) {
            o00ooo2 = (o00Ooo) abstractC32479OooO0OO;
            int i = o00ooo2.f93056OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00ooo2.f93056OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                o00ooo2 = new o00Ooo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o2 = o00ooo2.f93053OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r2 = o00ooo2.f93056OooOoo0;
        try {
        } catch (Throwable th) {
            th = th;
            r1 = r2;
        }
        if (r2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o2);
            o00ooo2.f93052OooOo0o = this;
            C33898OooO0Oo c33898OooO0Oo = this.f93068OooO0o;
            o00ooo2.f93051OooOo = c33898OooO0Oo;
            o00ooo2.f93056OooOoo0 = 1;
            if (c33898OooO0Oo.OooO00o(o00ooo2) != enumC32485OooO00o) {
                o00oo0o = this;
                interfaceC33895OooO00o = c33898OooO0Oo;
            }
            return enumC32485OooO00o;
        }
        if (r2 != 1) {
            if (r2 == 2) {
                InterfaceC33895OooO00o interfaceC33895OooO00o4 = o00ooo2.f93051OooOo;
                o00oo0o2 = o00ooo2.f93052OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o2);
                interfaceC33895OooO00o = interfaceC33895OooO00o4;
                C26800OooO c26800OooO = o00oo0o2.f93066OooO0OO;
                o00ooo2.f93052OooOo0o = o00oo0o2;
                o00ooo2.f93051OooOo = interfaceC33895OooO00o;
                o00ooo2.f93056OooOoo0 = 3;
                c26800OooO.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26822OooOo00(c26800OooO, null), o00ooo2);
                if (objOooO0o != enumC32485OooO00o) {
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                    objOooO0o2 = objOooO0o;
                    o00oo0o3 = o00oo0o2;
                    c26804OooO0OO = (C26804OooO0OO) objOooO0o2;
                    if (c26804OooO0OO != null) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (r2 == 3) {
                InterfaceC33895OooO00o interfaceC33895OooO00o5 = o00ooo2.f93051OooOo;
                o00oo0o3 = o00ooo2.f93052OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o2);
                interfaceC33895OooO00o2 = interfaceC33895OooO00o5;
                c26804OooO0OO = (C26804OooO0OO) objOooO0o2;
                if (c26804OooO0OO != null) {
                    throw new IllegalStateException("Unable to fetch OneDrive root item");
                }
                String id3 = c26804OooO0OO.getId();
                if (id3 == null) {
                    throw new IllegalStateException("Invalid OneDrive root item id");
                }
                C26800OooO c26800OooO2 = o00oo0o3.f93066OooO0OO;
                o00ooo2.f93052OooOo0o = o00oo0o3;
                o00ooo2.f93051OooOo = interfaceC33895OooO00o2;
                o00ooo2.f93054OooOoO0 = id3;
                o00ooo2.f93056OooOoo0 = 4;
                c26800OooO2.getClass();
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26823OooOo0O(c26800OooO2, id3, null), o00ooo2);
                if (objOooO0o3 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                str = id3;
                objOooO0o2 = objOooO0o3;
                interfaceC33895OooO00o3 = interfaceC33895OooO00o2;
                it = ((Iterable) objOooO0o2).iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                c26804OooO0OO2 = (C26804OooO0OO) next;
                if (c26804OooO0OO2 != null) {
                    r13 = interfaceC33895OooO00o3;
                    id = id2;
                    if (id != null) {
                    }
                    throw new IllegalArgumentException("Unable to ensure OneDrive root folder");
                }
                C26800OooO c26800OooO3 = o00oo0o3.f93066OooO0OO;
                C26988OooO0Oo c26988OooO0Oo = C26988OooO0Oo.f93785OooO00o;
                o00ooo2.f93052OooOo0o = o00oo0o3;
                o00ooo2.f93051OooOo = interfaceC33895OooO00o3;
                o00ooo2.f93054OooOoO0 = null;
                o00ooo2.f93056OooOoo0 = 5;
                c26800OooO3.getClass();
                C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26811OooOO0O(c26800OooO3, str, null), o00ooo2);
                if (objOooO0o2 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (r2 == 4) {
                String str2 = o00ooo2.f93054OooOoO0;
                InterfaceC33895OooO00o interfaceC33895OooO00o6 = o00ooo2.f93051OooOo;
                o00oo0o3 = o00ooo2.f93052OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0o2);
                    str = str2;
                    interfaceC33895OooO00o3 = interfaceC33895OooO00o6;
                    it = ((Iterable) objOooO0o2).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        C26804OooO0OO c26804OooO0OO4 = (C26804OooO0OO) next;
                        if (c26804OooO0OO4.getFolder() != null) {
                            String name = c26804OooO0OO4.getName();
                            C26988OooO0Oo c26988OooO0Oo2 = C26988OooO0Oo.f93785OooO00o;
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(name, "NoteInOneDrive")) {
                                break;
                            }
                        }
                    }
                    c26804OooO0OO2 = (C26804OooO0OO) next;
                    if (c26804OooO0OO2 != null && (id2 = c26804OooO0OO2.getId()) != null) {
                        r13 = interfaceC33895OooO00o3;
                        id = id2;
                        if (id != null) {
                        }
                        throw new IllegalArgumentException("Unable to ensure OneDrive root folder");
                    }
                    C26800OooO c26800OooO32 = o00oo0o3.f93066OooO0OO;
                    C26988OooO0Oo c26988OooO0Oo3 = C26988OooO0Oo.f93785OooO00o;
                    o00ooo2.f93052OooOo0o = o00oo0o3;
                    o00ooo2.f93051OooOo = interfaceC33895OooO00o3;
                    o00ooo2.f93054OooOoO0 = null;
                    o00ooo2.f93056OooOoo0 = 5;
                    c26800OooO32.getClass();
                    C33874OooO0OO c33874OooO0OO32 = C33649OoooOOo.f121328OooO00o;
                    objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26811OooOO0O(c26800OooO32, str, null), o00ooo2);
                    if (objOooO0o2 != enumC32485OooO00o) {
                        r12 = interfaceC33895OooO00o3;
                        o00oo0o4 = o00oo0o3;
                        c26804OooO0OO3 = (C26804OooO0OO) objOooO0o2;
                        if (c26804OooO0OO3 == null) {
                        }
                        if (id != null) {
                        }
                        throw new IllegalArgumentException("Unable to ensure OneDrive root folder");
                    }
                    return enumC32485OooO00o;
                } catch (Throwable th2) {
                    th = th2;
                    r1 = interfaceC33895OooO00o6;
                }
            } else {
                if (r2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r1 = o00ooo2.f93051OooOo;
                o00oo0o4 = o00ooo2.f93052OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0o2);
                    r12 = r1;
                    c26804OooO0OO3 = (C26804OooO0OO) objOooO0o2;
                    if (c26804OooO0OO3 == null) {
                        id = c26804OooO0OO3.getId();
                        o00oo0o3 = o00oo0o4;
                        r13 = r12;
                    } else {
                        o00oo0o3 = o00oo0o4;
                        id = null;
                        r13 = r12;
                    }
                    if (id != null || id.length() == 0) {
                        throw new IllegalArgumentException("Unable to ensure OneDrive root folder");
                    }
                    o00oo0o3.f93070OooO0oO = id;
                    r132 = r13;
                    r132.OooOOO0(null);
                    return id;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            r1.OooOOO0(null);
            throw th;
        }
        InterfaceC33895OooO00o interfaceC33895OooO00o7 = o00ooo2.f93051OooOo;
        o00oo0o = o00ooo2.f93052OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o2);
        interfaceC33895OooO00o = interfaceC33895OooO00o7;
        id = o00oo0o.f93070OooO0oO;
        if (id != null) {
            r132 = interfaceC33895OooO00o;
            r132.OooOOO0(null);
            return id;
        }
        C26837Oooo0OO c26837Oooo0OO = o00oo0o.f93065OooO0O0;
        o00ooo2.f93052OooOo0o = o00oo0o;
        o00ooo2.f93051OooOo = interfaceC33895OooO00o;
        o00ooo2.f93056OooOoo0 = 2;
        if (c26837Oooo0OO.OooO(o00ooo2) == enumC32485OooO00o) {
            return enumC32485OooO00o;
        }
        o00oo0o2 = o00oo0o;
        interfaceC33895OooO00o = interfaceC33895OooO00o;
        C26800OooO c26800OooO4 = o00oo0o2.f93066OooO0OO;
        o00ooo2.f93052OooOo0o = o00oo0o2;
        o00ooo2.f93051OooOo = interfaceC33895OooO00o;
        o00ooo2.f93056OooOoo0 = 3;
        c26800OooO4.getClass();
        C33874OooO0OO c33874OooO0OO4 = C33649OoooOOo.f121328OooO00o;
        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26822OooOo00(c26800OooO4, null), o00ooo2);
        if (objOooO0o != enumC32485OooO00o) {
        }
        return enumC32485OooO00o;
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
        o00Oo0 o00oo02;
        Object objOooO0o;
        o00oO0O o00oo0o;
        if (abstractC32479OooO0OO instanceof o00Oo0) {
            o00oo02 = (o00Oo0) abstractC32479OooO0OO;
            int i = o00oo02.f93049OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oo02.f93049OooOoO = i - Integer.MIN_VALUE;
            } else {
                o00oo02 = new o00Oo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o00oo02.f93047OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00oo02.f93049OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26837Oooo0OO c26837Oooo0OO = this.f93065OooO0O0;
                o00oo02.f93048OooOo0o = this;
                o00oo02.f93049OooOoO = 1;
                objOooO0o = c26837Oooo0OO.OooO0o(o00oo02);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                o00oo0o = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                o00oo0o = o00oo02.f93048OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = ((C32445OooOOOO) obj).f116639OooOo0o;
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
            o00oo02.f93048OooOo0o = null;
            o00oo02.f93049OooOoO = 2;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    @Override // o0OOooO0.o00000
    public final InterfaceC33721OooO0o<String> OooOo00() {
        return new OooO0OO(this.f93065OooO0O0.f92909OooO0o0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo0O(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26854OooooO0 c26854OooooO0;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        o00oO0O o00oo0o;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Throwable th;
        o00oO0O o00oo0o2;
        if (abstractC32479OooO0OO instanceof C26854OooooO0) {
            c26854OooooO0 = (C26854OooooO0) abstractC32479OooO0OO;
            int i = c26854OooooO0.f92970OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26854OooooO0.f92970OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26854OooooO0 = new C26854OooooO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26854OooooO0.f92969OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26854OooooO0.f92970OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c26854OooooO0.f92967OooOo0o = this;
                interfaceC33895OooO00o = this.f93071OooO0oo;
                c26854OooooO0.f92966OooOo = interfaceC33895OooO00o;
                c26854OooooO0.f92970OooOoOO = 1;
                if (interfaceC33895OooO00o.OooO00o(c26854OooooO0) != enumC32485OooO00o) {
                    o00oo0o = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = c26854OooooO0.f92966OooOo;
                o00oo0o2 = c26854OooooO0.f92967OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    o00oo0o2.f93063OooO = null;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = c26854OooooO0.f92966OooOo;
            o00oo0o = c26854OooooO0.f92967OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO0OooO00o = C28051OooO00o.OooO00o(o00oo0o.f93064OooO00o);
            C26855OooooOO c26855OooooOO = new C26855OooooOO(2, null);
            c26854OooooO0.f92967OooOo0o = o00oo0o;
            c26854OooooO0.f92966OooOo = interfaceC33895OooO00o;
            c26854OooooO0.f92970OooOoOO = 2;
            if (C24332OooO.OooO00o(oooOO0OooO00o, c26855OooooOO, c26854OooooO0) != enumC32485OooO00o) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                o00oo0o2 = o00oo0o;
                o00oo0o2.f93063OooO = null;
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
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f93064OooO00o;
        if (str2 == null || str2.length() == 0) {
            return Oooo0oO.o0Oo0oo.OooO0Oo(abstractApplicationC26277OooOoOO.getString(R.string.note_title_default), C18115b5.CONNECTOR, str);
        }
        String strOooOo0 = C33595OooOOo.OooOo0(str2 + C18115b5.CONNECTOR + str, '\n', '_');
        List listOooOO0o = C34429OooOOo0.OooOO0o(".pptx", ".ppt", ".pdf", ".doc", ".docx");
        Iterator it = listOooOO0o.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (C33595OooOOo.OooOOo0(strOooOo0, (String) it.next(), false)) {
                break;
            }
            i++;
        }
        if (i > -1) {
            strOooOo0 = C33595OooOOo.OooOo0O(strOooOo0, (String) listOooOO0o.get(i), "");
        }
        Pattern patternCompile = Pattern.compile("[<>|:\"*?/\\\\]");
        kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strOooOo0).replaceAll("");
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
    public final Object OooOoO(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26868o0ooOoO c26868o0ooOoO;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        o00oO0O o00oo0o;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Throwable th;
        String str;
        o00oO0O o00oo0o2;
        if (abstractC32479OooO0OO instanceof C26868o0ooOoO) {
            c26868o0ooOoO = (C26868o0ooOoO) abstractC32479OooO0OO;
            int i = c26868o0ooOoO.f93128OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26868o0ooOoO.f93128OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26868o0ooOoO = new C26868o0ooOoO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26868o0ooOoO.f93127OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26868o0ooOoO.f93128OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c26868o0ooOoO.f93125OooOo0o = this;
                interfaceC33895OooO00o = this.f93071OooO0oo;
                c26868o0ooOoO.f93124OooOo = interfaceC33895OooO00o;
                c26868o0ooOoO.f93128OooOoOO = 1;
                if (interfaceC33895OooO00o.OooO00o(c26868o0ooOoO) != enumC32485OooO00o) {
                    o00oo0o = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = c26868o0ooOoO.f93124OooOo;
                o00oo0o2 = c26868o0ooOoO.f93125OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    o00oo0o2.f93063OooO = (String) obj;
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
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = c26868o0ooOoO.f93124OooOo;
            o00oo0o = c26868o0ooOoO.f93125OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            str = o00oo0o.f93063OooO;
            if (str == null) {
                o0OOO0o o0ooo0o2 = new o0OOO0o(C28051OooO00o.OooO00o(o00oo0o.f93064OooO00o).getData());
                c26868o0ooOoO.f93125OooOo0o = o00oo0o;
                c26868o0ooOoO.f93124OooOo = interfaceC33895OooO00o;
                c26868o0ooOoO.f93128OooOoOO = 2;
                Object objOooOOo = C25252OooO0Oo.OooOOo(o0ooo0o2, c26868o0ooOoO);
                if (objOooOOo != enumC32485OooO00o) {
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                    obj = objOooOOo;
                    o00oo0o2 = o00oo0o;
                    o00oo0o2.f93063OooO = (String) obj;
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a A[LOOP:0: B:44:0x0114->B:46:0x011a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0088 -> B:21:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOoO0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26866o00ooo c26866o00ooo;
        o00oO0O o00oo0o;
        List arrayList;
        C26866o00ooo c26866o00ooo2;
        o00oO0O o00oo0o2;
        String str3;
        String str4;
        Object objOooO0o;
        C26803OooO0O0 c26803OooO0O0;
        List list;
        int iOooO0Oo;
        Iterator it;
        if (abstractC32479OooO0OO instanceof C26866o00ooo) {
            c26866o00ooo = (C26866o00ooo) abstractC32479OooO0OO;
            int i = c26866o00ooo.f93099OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26866o00ooo.f93099OooOoo0 = i - Integer.MIN_VALUE;
                o00oo0o = this;
            } else {
                o00oo0o = this;
                c26866o00ooo = new C26866o00ooo(o00oo0o, abstractC32479OooO0OO);
            }
        }
        Object obj = c26866o00ooo.f93096OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26866o00ooo.f93099OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            arrayList = new ArrayList();
            c26866o00ooo2 = c26866o00ooo;
            o00oo0o2 = o00oo0o;
            str3 = str;
            str4 = str2;
            C26800OooO c26800OooO = o00oo0o2.f93066OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(str4);
            c26866o00ooo2.f93095OooOo0o = o00oo0o2;
            c26866o00ooo2.f93094OooOo = str3;
            c26866o00ooo2.f93097OooOoO0 = arrayList;
            c26866o00ooo2.f93099OooOoo0 = 1;
            c26800OooO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26816OooOOOo(str3, str4, null, c26800OooO), c26866o00ooo2);
            if (objOooO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26803OooO0O0 = (C26803OooO0O0) c26866o00ooo.f93094OooOo;
            list = (List) c26866o00ooo.f93095OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            Iterable iterable = (Iterable) obj;
            iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable, 10));
            if (iOooO0Oo < 16) {
                iOooO0Oo = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
            for (Object obj2 : iterable) {
                linkedHashMap.put(((C26804OooO0OO) obj2).getId(), obj2);
            }
            ArrayList arrayList2 = new ArrayList();
            it = list.iterator();
            while (it.hasNext()) {
                C26804OooO0OO c26804OooO0OO = (C26804OooO0OO) linkedHashMap.get(((C26804OooO0OO) it.next()).getId());
                if (c26804OooO0OO != null) {
                    arrayList2.add(c26804OooO0OO);
                }
            }
            String odataDeltaLink = c26803OooO0O0.getOdataDeltaLink();
            return new C32443OooOOO(arrayList2, odataDeltaLink != null ? Uri.parse(odataDeltaLink).getQueryParameter(ResponseType.TOKEN) : null);
        }
        arrayList = c26866o00ooo.f93097OooOoO0;
        String str5 = (String) c26866o00ooo.f93094OooOo;
        o00oo0o2 = (o00oO0O) c26866o00ooo.f93095OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C26803OooO0O0 c26803OooO0O02 = (C26803OooO0O0) obj;
        List list2 = arrayList;
        List<C26804OooO0OO> listOooO0OO = c26803OooO0O02.OooO0OO();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listOooO0OO) {
            C26804OooO0OO c26804OooO0OO2 = (C26804OooO0OO) obj3;
            o00oo0o2.getClass();
            if (c26804OooO0OO2.getFile() != null || c26804OooO0OO2.getDeleted() != null) {
                arrayList3.add(obj3);
            }
        }
        C34431OooOo0.OooOo0o(list2, arrayList3);
        String odataNextLink = c26803OooO0O02.getOdataNextLink();
        String queryParameter = odataNextLink == null ? Uri.parse(odataNextLink).getQueryParameter(ResponseType.TOKEN) : null;
        if (queryParameter == null) {
            str3 = str5;
            c26866o00ooo2 = c26866o00ooo;
            str4 = queryParameter;
            C26800OooO c26800OooO2 = o00oo0o2.f93066OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(str4);
            c26866o00ooo2.f93095OooOo0o = o00oo0o2;
            c26866o00ooo2.f93094OooOo = str3;
            c26866o00ooo2.f93097OooOoO0 = arrayList;
            c26866o00ooo2.f93099OooOoo0 = 1;
            c26800OooO2.getClass();
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26816OooOOOo(str3, str4, null, c26800OooO2), c26866o00ooo2);
            if (objOooO0o != enumC32485OooO00o) {
                C26866o00ooo c26866o00ooo3 = c26866o00ooo2;
                str5 = str3;
                obj = objOooO0o;
                c26866o00ooo = c26866o00ooo3;
                C26803OooO0O0 c26803OooO0O022 = (C26803OooO0O0) obj;
                List list22 = arrayList;
                List<C26804OooO0OO> listOooO0OO2 = c26803OooO0O022.OooO0OO();
                ArrayList arrayList32 = new ArrayList();
                while (r12.hasNext()) {
                }
                C34431OooOo0.OooOo0o(list22, arrayList32);
                String odataNextLink2 = c26803OooO0O022.getOdataNextLink();
                if (odataNextLink2 == null) {
                }
                if (queryParameter == null) {
                    c26866o00ooo.f93095OooOo0o = arrayList;
                    c26866o00ooo.f93094OooOo = c26803OooO0O022;
                    c26866o00ooo.f93097OooOoO0 = null;
                    c26866o00ooo.f93099OooOoo0 = 2;
                    o00oo0o2.getClass();
                    C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                    Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26856OooooOo(str5, o00oo0o2, null), c26866o00ooo);
                    if (objOooO0o2 != enumC32485OooO00o) {
                        c26803OooO0O0 = c26803OooO0O022;
                        obj = objOooO0o2;
                        list = arrayList;
                        Iterable iterable2 = (Iterable) obj;
                        iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable2, 10));
                        if (iOooO0Oo < 16) {
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo);
                        while (r0.hasNext()) {
                        }
                        ArrayList arrayList22 = new ArrayList();
                        it = list.iterator();
                        while (it.hasNext()) {
                        }
                        String odataDeltaLink2 = c26803OooO0O0.getOdataDeltaLink();
                        return new C32443OooOOO(arrayList22, odataDeltaLink2 != null ? Uri.parse(odataDeltaLink2).getQueryParameter(ResponseType.TOKEN) : null);
                    }
                }
            }
            return enumC32485OooO00o;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoOO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        oo0o0Oo oo0o0oo;
        o00oO0O o00oo0o;
        C33898OooO0Oo c33898OooO0Oo;
        if (abstractC32479OooO0OO instanceof oo0o0Oo) {
            oo0o0oo = (oo0o0Oo) abstractC32479OooO0OO;
            int i = oo0o0oo.f93139OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo0o0oo.f93139OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oo0o0oo = new oo0o0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oo0o0oo.f93138OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo0o0oo.f93139OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oo0o0oo.f93136OooOo0o = this;
            C33898OooO0Oo c33898OooO0Oo2 = this.f93068OooO0o;
            oo0o0oo.f93135OooOo = c33898OooO0Oo2;
            oo0o0oo.f93139OooOoOO = 1;
            if (c33898OooO0Oo2.OooO00o(oo0o0oo) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            o00oo0o = this;
            c33898OooO0Oo = c33898OooO0Oo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33898OooO0Oo = oo0o0oo.f93135OooOo;
            o00oo0o = oo0o0oo.f93136OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            o00oo0o.f93070OooO0oO = null;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c33898OooO0Oo.OooOOO0(null);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            c33898OooO0Oo.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DriveSnapshotCacheEntity OooOoo(C26804OooO0OO c26804OooO0OO, Map<String, String> map, String str) {
        Map<String, String> map2;
        String str2;
        long j;
        String lastModifiedDateTime;
        long jOooO0O0;
        String str3;
        String str4;
        String noteId;
        o00000 file;
        o00000O hashes;
        Long lOooOOO;
        Object objOooO00o;
        String id = c26804OooO0OO.getId();
        String quickXorHash = null;
        if (id == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("OneDriveDriveBackend");
            c20358OooO00o.OooOO0O("toDriveSnapshot: DriveItem id is null, skipping", new Object[0]);
            return null;
        }
        if (c26804OooO0OO.getDescription() == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("OneDriveDriveBackend");
            c20358OooO00o2.OooOO0O(C22237OooO0o0.OooO00o("toDriveSnapshot: DriveItem description is null for id=", id, ", name=", c26804OooO0OO.getName()), new Object[0]);
        }
        String description = c26804OooO0OO.getDescription();
        String string = description != null ? HtmlCompat.fromHtml(description, 0).toString() : null;
        if (map == null) {
            C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
            if (string != null) {
                try {
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    objOooO00o = (Map) this.f93069OooO0o0.fromJson(string, new o0OO00O().getType());
                } catch (Throwable th2) {
                    th = th2;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                }
                if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                    objOooO00o = c34436OooOoOO;
                }
                map2 = (Map) objOooO00o;
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = c34436OooOoOO;
            }
        } else {
            map2 = map;
        }
        String str5 = map2.get("mimeType");
        if (str5 == null) {
            str2 = map2.get("mimeType");
        } else {
            int iHashCode = str5.hashCode();
            if (iHashCode != -2039968287) {
                if (iHashCode != -1214862943) {
                    if (iHashCode == -956902466 && str5.equals("application/vnd.notein-apps.folders")) {
                        str2 = CloudMime.FOLDER;
                    }
                } else if (str5.equals("application/vnd.notein-apps.template")) {
                    str2 = CloudMime.TEMPLATE;
                }
            } else if (str5.equals("application/vnd.notein-apps.dbfile")) {
                str2 = CloudMime.NOTE;
            }
        }
        String createdDateTime = c26804OooO0OO.getCreatedDateTime();
        long jOooO0O02 = createdDateTime != null ? o00OO.OooO00o.OooO0O0(createdDateTime) : 0L;
        String str6 = map2.get(NoteMeta.PROPERTY_LAST_MODIFICATION_TIME);
        if (str6 == null || (lOooOOO = C33596OooOOo0.OooOOO(str6)) == null) {
            o00000O0 fileSystemInfo = c26804OooO0OO.getFileSystemInfo();
            if (fileSystemInfo == null || (lastModifiedDateTime = fileSystemInfo.getLastModifiedDateTime()) == null) {
                j = 0;
                String str7 = map2.get(NoteMeta.PROPERTY_NOTE_ID);
                String str8 = map2.get(Folder.PROPERTY_FOLDER_ID);
                String str9 = map2.get(MyTemplate.PROPERTY_TEMPLATE_ID);
                String str10 = map2.get(NoteMeta.PROPERTY_PARENT_ID);
                String str11 = map2.get(NoteMeta.PROPERTY_FAVORITE);
                Boolean boolValueOf = str11 == null ? Boolean.valueOf(Boolean.parseBoolean(str11)) : null;
                String str12 = map2.get(NoteMeta.PROPERTY_TITLE);
                String str13 = map2.get(NoteMeta.PROPERTY_IN_TRASH_BIN);
                Boolean boolValueOf2 = str13 == null ? Boolean.valueOf(Boolean.parseBoolean(str13)) : null;
                String str14 = map2.get("dbVersion");
                Integer numOooOOO0 = str14 == null ? C33596OooOOo0.OooOOO0(str14) : null;
                String str15 = map2.get("sortKey");
                Integer numOooOOO02 = str15 == null ? C33596OooOOo0.OooOOO0(str15) : null;
                String str16 = map2.get("usingOwnPdf");
                Boolean boolValueOf3 = str16 == null ? Boolean.valueOf(Boolean.parseBoolean(str16)) : null;
                String str17 = map2.get("lockAdded");
                CloudMetaExtra cloudMetaExtra = new CloudMetaExtra(str7, str9, str8, Long.valueOf(j), str10, boolValueOf, str12, boolValueOf2, str2, (Long) null, Long.valueOf(jOooO0O02), Long.valueOf(j), numOooOOO0, numOooOOO02, boolValueOf3, str17 == null ? Boolean.valueOf(Boolean.parseBoolean(str17)) : null, (String) null, 66048, (C24018OooO0oo) null);
                str3 = str2;
                if (str3 == null) {
                    str4 = str3;
                    noteId = null;
                } else {
                    int iHashCode2 = str3.hashCode();
                    if (iHashCode2 == 393630974) {
                        if (str3.equals(CloudMime.NOTE)) {
                            noteId = cloudMetaExtra.getNoteId();
                            str4 = str3;
                        }
                        str4 = str3;
                        noteId = null;
                    } else if (iHashCode2 != 1600536058) {
                        if (iHashCode2 == 1883341446 && str3.equals(CloudMime.TEMPLATE)) {
                            noteId = cloudMetaExtra.getTemplateId();
                            str4 = str3;
                        }
                        str4 = str3;
                        noteId = null;
                    } else {
                        if (str3.equals(CloudMime.FOLDER)) {
                            noteId = cloudMetaExtra.getFolderId();
                            str4 = str3;
                        }
                        str4 = str3;
                        noteId = null;
                    }
                }
                file = c26804OooO0OO.getFile();
                if (file != null && (hashes = file.getHashes()) != null) {
                    quickXorHash = hashes.getQuickXorHash();
                }
                long j2 = j;
                CloudContentTag cloudContentTag = new CloudContentTag((String) null, quickXorHash, j2, 1, (C24018OooO0oo) null);
                Long size = c26804OooO0OO.getSize();
                return new DriveSnapshotCacheEntity(id, str, noteId, str4, cloudContentTag, cloudMetaExtra, size != null ? size.longValue() : 0L, jOooO0O02, j2, c26804OooO0OO.getDeleted() != null, j2);
            }
            jOooO0O0 = o00OO.OooO00o.OooO0O0(lastModifiedDateTime);
        } else {
            long jLongValue = lOooOOO.longValue();
            if (jLongValue <= 10000000000L) {
                jLongValue *= (long) 1000;
            }
            long j3 = 1000;
            jOooO0O0 = (jLongValue / j3) * j3;
        }
        j = jOooO0O0;
        String str72 = map2.get(NoteMeta.PROPERTY_NOTE_ID);
        String str82 = map2.get(Folder.PROPERTY_FOLDER_ID);
        String str92 = map2.get(MyTemplate.PROPERTY_TEMPLATE_ID);
        String str102 = map2.get(NoteMeta.PROPERTY_PARENT_ID);
        String str112 = map2.get(NoteMeta.PROPERTY_FAVORITE);
        if (str112 == null) {
        }
        String str122 = map2.get(NoteMeta.PROPERTY_TITLE);
        String str132 = map2.get(NoteMeta.PROPERTY_IN_TRASH_BIN);
        if (str132 == null) {
        }
        String str142 = map2.get("dbVersion");
        if (str142 == null) {
        }
        String str152 = map2.get("sortKey");
        if (str152 == null) {
        }
        String str162 = map2.get("usingOwnPdf");
        if (str162 == null) {
        }
        String str172 = map2.get("lockAdded");
        CloudMetaExtra cloudMetaExtra2 = new CloudMetaExtra(str72, str92, str82, Long.valueOf(j), str102, boolValueOf, str122, boolValueOf2, str2, (Long) null, Long.valueOf(jOooO0O02), Long.valueOf(j), numOooOOO0, numOooOOO02, boolValueOf3, str172 == null ? Boolean.valueOf(Boolean.parseBoolean(str172)) : null, (String) null, 66048, (C24018OooO0oo) null);
        str3 = str2;
        if (str3 == null) {
        }
        file = c26804OooO0OO.getFile();
        if (file != null) {
            quickXorHash = hashes.getQuickXorHash();
        }
        long j22 = j;
        CloudContentTag cloudContentTag2 = new CloudContentTag((String) null, quickXorHash, j22, 1, (C24018OooO0oo) null);
        Long size2 = c26804OooO0OO.getSize();
        return new DriveSnapshotCacheEntity(id, str, noteId, str4, cloudContentTag2, cloudMetaExtra2, size2 != null ? size2.longValue() : 0L, jOooO0O02, j22, c26804OooO0OO.getDeleted() != null, j22);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r11.OooO(r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, o0OO0o0.o00oO0O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoo0(InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0O0O00 o0o0o00;
        o00oO0O o00oo0o;
        if (abstractC32479OooO0OO instanceof o0O0O00) {
            o0o0o00 = (o0O0O00) abstractC32479OooO0OO;
            int i = o0o0o00.f93104OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0o0o00.f93104OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o0o0o00 = new o0O0O00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o0o0o00.f93103OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r2 = o0o0o00.f93104OooOoOO;
        try {
        } catch (C35219OooOO0O e) {
            if (e.f126448OooOo0o != 401) {
                throw e;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("OneDriveDriveBackend");
            c20358OooO00o.OooOO0o(e, "download got 401, retry after refresh", new Object[0]);
            C26837Oooo0OO c26837Oooo0OO = r2.f93065OooO0O0;
            o0o0o00.f93101OooOo0o = interfaceC32507OooOO0o;
            o0o0o00.f93100OooOo = null;
            o0o0o00.f93104OooOoOO = 3;
            if (c26837Oooo0OO.OooO(o0o0o00) != enumC32485OooO00o) {
            }
        }
        if (r2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26837Oooo0OO c26837Oooo0OO2 = this.f93065OooO0O0;
            if (c26837Oooo0OO2.f92909OooO0o0.f121747OooOo0o.getValue() == 0) {
                o0o0o00.f93101OooOo0o = this;
                o0o0o00.f93100OooOo = interfaceC32507OooOO0o;
                o0o0o00.f93104OooOoOO = 1;
            }
            o00oo0o = this;
        } else {
            if (r2 != 1) {
                if (r2 == 2) {
                    InterfaceC32507OooOO0o interfaceC32507OooOO0o2 = o0o0o00.f93100OooOo;
                    C32446OooOOOo.OooO0O0(obj);
                    return obj;
                }
                if (r2 != 3) {
                    if (r2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return obj;
                }
                interfaceC32507OooOO0o = (InterfaceC32507OooOO0o) o0o0o00.f93101OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                o0o0o00.f93101OooOo0o = null;
                o0o0o00.f93104OooOoOO = 4;
                Object objInvoke = interfaceC32507OooOO0o.invoke(o0o0o00);
                return objInvoke == enumC32485OooO00o ? enumC32485OooO00o : objInvoke;
            }
            interfaceC32507OooOO0o = o0o0o00.f93100OooOo;
            o00oo0o = (o00oO0O) o0o0o00.f93101OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        o0o0o00.f93101OooOo0o = o00oo0o;
        o0o0o00.f93100OooOo = interfaceC32507OooOO0o;
        o0o0o00.f93104OooOoOO = 2;
        Object objInvoke2 = interfaceC32507OooOO0o.invoke(o0o0o00);
        if (objInvoke2 != enumC32485OooO00o) {
            return objInvoke2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOooO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        o000OOo o000ooo2;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        o00oO0O o00oo0o;
        Throwable th;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        String str2;
        o00oO0O o00oo0o2;
        if (abstractC32479OooO0OO instanceof o000OOo) {
            o000ooo2 = (o000OOo) abstractC32479OooO0OO;
            int i = o000ooo2.f93035OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000ooo2.f93035OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                o000ooo2 = new o000OOo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o000ooo2.f93032OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000ooo2.f93035OooOoo0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                o000ooo2.f93031OooOo0o = this;
                o000ooo2.f93030OooOo = str;
                interfaceC33895OooO00o = this.f93071OooO0oo;
                o000ooo2.f93033OooOoO0 = interfaceC33895OooO00o;
                o000ooo2.f93035OooOoo0 = 1;
                if (interfaceC33895OooO00o.OooO00o(o000ooo2) != enumC32485OooO00o) {
                    o00oo0o = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = o000ooo2.f93033OooOoO0;
                str2 = o000ooo2.f93030OooOo;
                o00oo0o2 = o000ooo2.f93031OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    o00oo0o2.f93063OooO = str2;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = o000ooo2.f93033OooOoO0;
            String str3 = o000ooo2.f93030OooOo;
            o00oo0o = o000ooo2.f93031OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            str = str3;
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO0OooO00o = C28051OooO00o.OooO00o(o00oo0o.f93064OooO00o);
            o000000 o000000Var = new o000000(str, null);
            o000ooo2.f93031OooOo0o = o00oo0o;
            o000ooo2.f93030OooOo = str;
            o000ooo2.f93033OooOoO0 = interfaceC33895OooO00o;
            o000ooo2.f93035OooOoo0 = 2;
            if (C24332OooO.OooO00o(oooOO0OooO00o, o000000Var, o000ooo2) != enumC32485OooO00o) {
                str2 = str;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                o00oo0o2 = o00oo0o;
                o00oo0o2.f93063OooO = str2;
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
        return this.f93067OooO0Oo;
    }
}
