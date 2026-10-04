package com.orion.notein.domain.models.backup;

import OooOooO.C20741OooOOoo;
import Oooo0oO.o0Oo0oo;
import android.content.Context;
import android.os.Build;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallations;
import com.huawei.hms.network.embedded.C18115b5;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.orion.notein.global.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0oo000O.C31183OooO00o;
import o0oo000O.OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33595OooOOo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/domain/models/backup/BackupInstance;", "Ljava/io/Serializable;", "guid", "", CommonConstant.KEY_UID, "deviceName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGuid", "()Ljava/lang/String;", "getUid", "getDeviceName", "toBackupInstanceDirName", "getDisplayName", "context", "Landroid/content/Context;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class BackupInstance implements Serializable {
    private static final String TAG = "BackupInstance";
    private static final boolean USE_DUMMY_USER_ID = true;
    private final String deviceName;
    private final String guid;
    private final String uid;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC33895OooO00o lock = C33900OooO0o0.OooO00o();

    @Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/notein/domain/models/backup/BackupInstance$Companion;", "", "<init>", "()V", "", "getDeviceName", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "Lcom/orion/notein/domain/models/backup/BackupInstance;", "getInstance", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "", "USE_DUMMY_USER_ID", "Z", "LoO0o0oOo/OooO00o;", "lock", "LoO0o0oOo/OooO00o;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        private final String getDeviceName() {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            OooOOO0.OooO0Oo(str2);
            OooOOO0.OooO0Oo(str);
            if (!C33595OooOOo.OooOoO0(str2, str, false)) {
                return o0Oo0oo.OooO0Oo(OooOOOO.OooO00o(str), " ", str2);
            }
            String strOooO00o = OooOOOO.OooO00o(str2);
            OooOOO0.OooO0Oo(strOooO00o);
            return strOooO00o;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getInstance(Context context, Continuation<? super BackupInstance> continuation) throws Throwable {
            BackupInstance$Companion$getInstance$1 backupInstance$Companion$getInstance$1;
            InterfaceC33895OooO00o interfaceC33895OooO00o;
            Companion companion;
            InterfaceC33895OooO00o interfaceC33895OooO00o2;
            Companion companion2;
            String str;
            if (continuation instanceof BackupInstance$Companion$getInstance$1) {
                backupInstance$Companion$getInstance$1 = (BackupInstance$Companion$getInstance$1) continuation;
                int i = backupInstance$Companion$getInstance$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    backupInstance$Companion$getInstance$1.label = i - Integer.MIN_VALUE;
                } else {
                    backupInstance$Companion$getInstance$1 = new BackupInstance$Companion$getInstance$1(this, continuation);
                }
            }
            Object obj = backupInstance$Companion$getInstance$1.result;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = backupInstance$Companion$getInstance$1.label;
            try {
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    interfaceC33895OooO00o = BackupInstance.lock;
                    backupInstance$Companion$getInstance$1.L$0 = this;
                    backupInstance$Companion$getInstance$1.L$1 = interfaceC33895OooO00o;
                    backupInstance$Companion$getInstance$1.label = 1;
                    if (interfaceC33895OooO00o.OooO00o(backupInstance$Companion$getInstance$1) != enumC32485OooO00o) {
                        companion = this;
                    }
                    return enumC32485OooO00o;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) backupInstance$Companion$getInstance$1.L$1;
                    companion2 = (Companion) backupInstance$Companion$getInstance$1.L$0;
                    try {
                        C32446OooOOOo.OooO0O0(obj);
                        str = (String) obj;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        OooOOO0.OooO0Oo(str);
                        if (str.length() == 0) {
                            return new BackupInstance(str, C31183OooO00o.f111225OooO0o, companion2.getDeviceName());
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0(BackupInstance.TAG);
                        c20358OooO00o.OooO0OO("Global user id is empty.", new Object[0]);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        throw th;
                    }
                }
                InterfaceC33895OooO00o interfaceC33895OooO00o3 = (InterfaceC33895OooO00o) backupInstance$Companion$getInstance$1.L$1;
                companion = (Companion) backupInstance$Companion$getInstance$1.L$0;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33895OooO00o = interfaceC33895OooO00o3;
                Task<String> id = FirebaseInstallations.getInstance().getId();
                OooOOO0.OooO0o(id, "getId(...)");
                backupInstance$Companion$getInstance$1.L$0 = companion;
                backupInstance$Companion$getInstance$1.L$1 = interfaceC33895OooO00o;
                backupInstance$Companion$getInstance$1.label = 2;
                Object objOooO0o = C20741OooOOoo.OooO0o(id, backupInstance$Companion$getInstance$1);
                if (objOooO0o != enumC32485OooO00o) {
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                    obj = objOooO0o;
                    companion2 = companion;
                    str = (String) obj;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    OooOOO0.OooO0Oo(str);
                    if (str.length() == 0) {
                    }
                }
                return enumC32485OooO00o;
            } catch (Throwable th2) {
                th = th2;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                throw th;
            }
        }

        private Companion() {
        }
    }

    public BackupInstance(String guid, String uid, String deviceName) {
        OooOOO0.OooO0oO(guid, "guid");
        OooOOO0.OooO0oO(uid, "uid");
        OooOOO0.OooO0oO(deviceName, "deviceName");
        this.guid = guid;
        this.uid = uid;
        this.deviceName = deviceName;
    }

    public static /* synthetic */ BackupInstance copy$default(BackupInstance backupInstance, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = backupInstance.guid;
        }
        if ((i & 2) != 0) {
            str2 = backupInstance.uid;
        }
        if ((i & 4) != 0) {
            str3 = backupInstance.deviceName;
        }
        return backupInstance.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    public final BackupInstance copy(String guid, String uid, String deviceName) {
        OooOOO0.OooO0oO(guid, "guid");
        OooOOO0.OooO0oO(uid, "uid");
        OooOOO0.OooO0oO(deviceName, "deviceName");
        return new BackupInstance(guid, uid, deviceName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackupInstance)) {
            return false;
        }
        BackupInstance backupInstance = (BackupInstance) other;
        return OooOOO0.OooO0O0(this.guid, backupInstance.guid) && OooOOO0.OooO0O0(this.uid, backupInstance.uid) && OooOOO0.OooO0O0(this.deviceName, backupInstance.deviceName);
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getDisplayName(Context context) {
        OooOOO0.OooO0oO(context, "context");
        String string = context.getString(R.string.historical_backup);
        String str = this.deviceName;
        String str2 = this.guid;
        return string + C18115b5.CONNECTOR + str + C18115b5.CONNECTOR + ((Object) str2.subSequence(0, Math.min(6, str2.length())));
    }

    public final String getGuid() {
        return this.guid;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        return this.deviceName.hashCode() + OooO00o.OooO0O0(this.guid.hashCode() * 31, 31, this.uid);
    }

    public final String toBackupInstanceDirName() {
        String str = this.uid;
        String str2 = this.deviceName;
        String str3 = this.guid;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("backup_", str, C18115b5.CONNECTOR, str2, C18115b5.CONNECTOR);
        sbOooO0O0.append(str3);
        return sbOooO0O0.toString();
    }

    public String toString() {
        String str = this.guid;
        String str2 = this.uid;
        return androidx.concurrent.futures.OooO00o.OooO0OO(OooO0o.OooO0O0("BackupInstance(guid=", str, ", uid=", str2, ", deviceName="), this.deviceName, ")");
    }
}
