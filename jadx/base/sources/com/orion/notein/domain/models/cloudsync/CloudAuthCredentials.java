package com.orion.notein.domain.models.cloudsync;

import OooOoo.C20593OooO0Oo;
import androidx.core.database.OooO00o;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudAuthCredentials;", "", "<init>", "()V", "Huawei", "OneDrive", "Generic", "Companion", "Lcom/orion/notein/domain/models/cloudsync/CloudAuthCredentials$Generic;", "Lcom/orion/notein/domain/models/cloudsync/CloudAuthCredentials$Huawei;", "Lcom/orion/notein/domain/models/cloudsync/CloudAuthCredentials$OneDrive;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class CloudAuthCredentials {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String KEY_HUAWEI_ACCESS_TOKEN = "huawei_access_token";
    public static final String KEY_HUAWEI_UNION_ID = "huawei_union_id";
    public static final String KEY_ONEDRIVE_AUTHORITY = "onedrive_authority";

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudAuthCredentials$Companion;", "", "<init>", "()V", "KEY_HUAWEI_UNION_ID", "", "KEY_HUAWEI_ACCESS_TOKEN", "KEY_ONEDRIVE_AUTHORITY", "fromMap", "Lcom/orion/notein/domain/models/cloudsync/CloudAuthCredentials;", C18437z2.f56754h, C18437z2.f56756j, "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final CloudAuthCredentials fromMap(String type, Map<String, String> values) {
            OooOOO0.OooO0oO(type, "type");
            OooOOO0.OooO0oO(values, "values");
            if (!type.equals(CloudSyncCredentialType.HUAWEI)) {
                return type.equals(CloudSyncCredentialType.ONE_DRIVE) ? new OneDrive(values.get(CloudAuthCredentials.KEY_ONEDRIVE_AUTHORITY)) : new Generic(type, values);
            }
            String str = values.get(CloudAuthCredentials.KEY_HUAWEI_UNION_ID);
            if (str == null) {
                throw new IllegalArgumentException("Missing unionId for Huawei credentials");
            }
            String str2 = values.get(CloudAuthCredentials.KEY_HUAWEI_ACCESS_TOKEN);
            if (str2 != null) {
                return new Huawei(str, str2);
            }
            throw new IllegalArgumentException("Missing accessToken for Huawei credentials");
        }

        private Companion() {
        }
    }

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudAuthCredentials$Generic;", "Lcom/orion/notein/domain/models/cloudsync/CloudAuthCredentials;", C18437z2.f56754h, "", C18437z2.f56756j, "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getType", "()Ljava/lang/String;", "getValues", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class Generic extends CloudAuthCredentials {
        private final String type;
        private final Map<String, String> values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Generic(String type, Map<String, String> values) {
            super(null);
            OooOOO0.OooO0oO(type, "type");
            OooOOO0.OooO0oO(values, "values");
            this.type = type;
            this.values = values;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Generic copy$default(Generic generic, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = generic.type;
            }
            if ((i & 2) != 0) {
                map = generic.values;
            }
            return generic.copy(str, map);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final Map<String, String> component2() {
            return this.values;
        }

        public final Generic copy(String type, Map<String, String> values) {
            OooOOO0.OooO0oO(type, "type");
            OooOOO0.OooO0oO(values, "values");
            return new Generic(type, values);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Generic)) {
                return false;
            }
            Generic generic = (Generic) other;
            return OooOOO0.OooO0O0(this.type, generic.type) && OooOOO0.OooO0O0(this.values, generic.values);
        }

        public final String getType() {
            return this.type;
        }

        public final Map<String, String> getValues() {
            return this.values;
        }

        public int hashCode() {
            return this.values.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            return "Generic(type=" + this.type + ", values=" + this.values + ")";
        }
    }

    @Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudAuthCredentials$Huawei;", "Lcom/orion/notein/domain/models/cloudsync/CloudAuthCredentials;", CommonConstant.KEY_UNION_ID, "", CommonConstant.KEY_ACCESS_TOKEN, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUnionId", "()Ljava/lang/String;", "getAccessToken", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class Huawei extends CloudAuthCredentials {
        private final String accessToken;
        private final String unionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Huawei(String unionId, String accessToken) {
            super(null);
            OooOOO0.OooO0oO(unionId, "unionId");
            OooOOO0.OooO0oO(accessToken, "accessToken");
            this.unionId = unionId;
            this.accessToken = accessToken;
        }

        public static /* synthetic */ Huawei copy$default(Huawei huawei, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = huawei.unionId;
            }
            if ((i & 2) != 0) {
                str2 = huawei.accessToken;
            }
            return huawei.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUnionId() {
            return this.unionId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        public final Huawei copy(String unionId, String accessToken) {
            OooOOO0.OooO0oO(unionId, "unionId");
            OooOOO0.OooO0oO(accessToken, "accessToken");
            return new Huawei(unionId, accessToken);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Huawei)) {
                return false;
            }
            Huawei huawei = (Huawei) other;
            return OooOOO0.OooO0O0(this.unionId, huawei.unionId) && OooOOO0.OooO0O0(this.accessToken, huawei.accessToken);
        }

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final String getUnionId() {
            return this.unionId;
        }

        public int hashCode() {
            return this.accessToken.hashCode() + (this.unionId.hashCode() * 31);
        }

        public String toString() {
            return OooO00o.OooO00o("Huawei(unionId=", this.unionId, ", accessToken=", this.accessToken, ")");
        }
    }

    @Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudAuthCredentials$OneDrive;", "Lcom/orion/notein/domain/models/cloudsync/CloudAuthCredentials;", "authority", "", "<init>", "(Ljava/lang/String;)V", "getAuthority", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class OneDrive extends CloudAuthCredentials {
        private final String authority;

        public OneDrive(String str) {
            super(null);
            this.authority = str;
        }

        public static /* synthetic */ OneDrive copy$default(OneDrive oneDrive, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = oneDrive.authority;
            }
            return oneDrive.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAuthority() {
            return this.authority;
        }

        public final OneDrive copy(String authority) {
            return new OneDrive(authority);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OneDrive) && OooOOO0.OooO0O0(this.authority, ((OneDrive) other).authority);
        }

        public final String getAuthority() {
            return this.authority;
        }

        public int hashCode() {
            String str = this.authority;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return C20593OooO0Oo.OooO0O0("OneDrive(authority=", this.authority, ")");
        }
    }

    public /* synthetic */ CloudAuthCredentials(C24018OooO0oo c24018OooO0oo) {
        this();
    }

    private CloudAuthCredentials() {
    }
}
