package com.orion.notein.data.service.user;

import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.google.gson.annotations.SerializedName;
import com.hihonor.honorid.core.data.TmemberRight;
import com.huawei.hms.support.feature.result.CommonConstant;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOOo0.C27174OooO0O0;
import oOO00oOo.InterfaceC34387OooO00o;
import oOO00oOo.InterfaceC34388OooO0O0;
import oOO00oOo.InterfaceC34391OooO0o;
import oOO00oOo.OooOOOO;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0003\r\u0007\u000eJ&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u0004H§@¢\u0006\u0004\b\r\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m80612d2 = {"Lcom/orion/notein/data/service/user/NoteinFirebaseUserApiService;", "", "Lcom/orion/notein/data/service/user/NoteinFirebaseUserApiService$OooO00o;", "request", "LooooOOo0/OooOoO;", "Lo0OOOo0/OooO0O0;", "Lcom/orion/notein/data/service/user/NoteinFirebaseUserApiService$OooO0O0;", "OooO0O0", "(Lcom/orion/notein/data/service/user/NoteinFirebaseUserApiService$OooO00o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/orion/notein/data/service/user/NoteinFirebaseUserApiService$FirebaseUserResponse;", "OooO0OO", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "OooO00o", "FirebaseUserResponse", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface NoteinFirebaseUserApiService {

    @Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, m80612d2 = {"Lcom/orion/notein/data/service/user/NoteinFirebaseUserApiService$FirebaseUserResponse;", "", "id", "", "firebaseUserId", CommonConstant.KEY_DISPLAY_NAME, "email", "createdAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getFirebaseUserId", "getDisplayName", "getEmail", "getCreatedAt", "()J", "refreshedToken", "getRefreshedToken", "setRefreshedToken", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class FirebaseUserResponse {

        @SerializedName("createdAt")
        private final long createdAt;

        @SerializedName(CommonConstant.KEY_DISPLAY_NAME)
        private final String displayName;

        @SerializedName("email")
        private final String email;

        @SerializedName("firebaseUserId")
        private final String firebaseUserId;

        @SerializedName("id")
        private final String id;
        private String refreshedToken;

        public FirebaseUserResponse(String id, String firebaseUserId, String displayName, String email, long j) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(firebaseUserId, "firebaseUserId");
            OooOOO0.OooO0oO(displayName, "displayName");
            OooOOO0.OooO0oO(email, "email");
            this.id = id;
            this.firebaseUserId = firebaseUserId;
            this.displayName = displayName;
            this.email = email;
            this.createdAt = j;
        }

        public static /* synthetic */ FirebaseUserResponse copy$default(FirebaseUserResponse firebaseUserResponse, String str, String str2, String str3, String str4, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = firebaseUserResponse.id;
            }
            if ((i & 2) != 0) {
                str2 = firebaseUserResponse.firebaseUserId;
            }
            if ((i & 4) != 0) {
                str3 = firebaseUserResponse.displayName;
            }
            if ((i & 8) != 0) {
                str4 = firebaseUserResponse.email;
            }
            if ((i & 16) != 0) {
                j = firebaseUserResponse.createdAt;
            }
            long j2 = j;
            return firebaseUserResponse.copy(str, str2, str3, str4, j2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFirebaseUserId() {
            return this.firebaseUserId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getCreatedAt() {
            return this.createdAt;
        }

        public final FirebaseUserResponse copy(String id, String firebaseUserId, String displayName, String email, long createdAt) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(firebaseUserId, "firebaseUserId");
            OooOOO0.OooO0oO(displayName, "displayName");
            OooOOO0.OooO0oO(email, "email");
            return new FirebaseUserResponse(id, firebaseUserId, displayName, email, createdAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FirebaseUserResponse)) {
                return false;
            }
            FirebaseUserResponse firebaseUserResponse = (FirebaseUserResponse) other;
            return OooOOO0.OooO0O0(this.id, firebaseUserResponse.id) && OooOOO0.OooO0O0(this.firebaseUserId, firebaseUserResponse.firebaseUserId) && OooOOO0.OooO0O0(this.displayName, firebaseUserResponse.displayName) && OooOOO0.OooO0O0(this.email, firebaseUserResponse.email) && this.createdAt == firebaseUserResponse.createdAt;
        }

        public final long getCreatedAt() {
            return this.createdAt;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getFirebaseUserId() {
            return this.firebaseUserId;
        }

        public final String getId() {
            return this.id;
        }

        public final String getRefreshedToken() {
            return this.refreshedToken;
        }

        public int hashCode() {
            return Long.hashCode(this.createdAt) + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.firebaseUserId), 31, this.displayName), 31, this.email);
        }

        public final void setRefreshedToken(String str) {
            this.refreshedToken = str;
        }

        public String toString() {
            String str = this.id;
            String str2 = this.firebaseUserId;
            String str3 = this.displayName;
            String str4 = this.email;
            long j = this.createdAt;
            StringBuilder sbOooO0O0 = OooO0o.OooO0O0("FirebaseUserResponse(id=", str, ", firebaseUserId=", str2, ", displayName=");
            OooO0OO.OooO0o0(sbOooO0O0, str3, ", email=", str4, ", createdAt=");
            return android.support.v4.media.session.OooO00o.OooO00o(j, ")", sbOooO0O0);
        }
    }

    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/data/service/user/NoteinFirebaseUserApiService$OooO00o;", "", "", "OooO00o", "Ljava/lang/String;", "getIdToken", "()Ljava/lang/String;", CommonConstant.KEY_ID_TOKEN, "OooO0O0", "getFirebaseUserId", "firebaseUserId", "OooO0OO", "getDisplayName", CommonConstant.KEY_DISPLAY_NAME, "OooO0Oo", "getEmail", "email", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
        @SerializedName(CommonConstant.KEY_ID_TOKEN)
        private final String idToken;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
        @SerializedName("firebaseUserId")
        private final String firebaseUserId;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
        @SerializedName(CommonConstant.KEY_DISPLAY_NAME)
        private final String displayName;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
        @SerializedName("email")
        private final String email;

        public OooO00o(String idToken, String firebaseUserId, String str, String str2) {
            OooOOO0.OooO0oO(idToken, "idToken");
            OooOOO0.OooO0oO(firebaseUserId, "firebaseUserId");
            this.idToken = idToken;
            this.firebaseUserId = firebaseUserId;
            this.displayName = str;
            this.email = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return OooOOO0.OooO0O0(this.idToken, oooO00o.idToken) && OooOOO0.OooO0O0(this.firebaseUserId, oooO00o.firebaseUserId) && OooOOO0.OooO0O0(this.displayName, oooO00o.displayName) && OooOOO0.OooO0O0(this.email, oooO00o.email);
        }

        public final int hashCode() {
            return this.email.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.idToken.hashCode() * 31, 31, this.firebaseUserId), 31, this.displayName);
        }

        public final String toString() {
            String str = this.idToken;
            String str2 = this.firebaseUserId;
            return C21445Oooo.OooO0O0(OooO0o.OooO0O0("FirebaseLoginRequest(idToken=", str, ", firebaseUserId=", str2, ", displayName="), this.displayName, ", email=", this.email, ")");
        }
    }

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/data/service/user/NoteinFirebaseUserApiService$OooO0O0;", "", "", "OooO00o", "Ljava/lang/String;", "OooO0OO", "()Ljava/lang/String;", TmemberRight.TAG_USERID, "", "OooO0O0", "J", "()J", "createdAt", CommonConstant.KEY_ACCESS_TOKEN, "OooO0Oo", "getAccessExpireAt", "accessExpireAt", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
        @SerializedName(TmemberRight.TAG_USERID)
        private final String userId;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
        @SerializedName("createdAt")
        private final long createdAt;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
        @SerializedName(CommonConstant.KEY_ACCESS_TOKEN)
        private final String accessToken;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
        @SerializedName("accessExpireAt")
        private final long accessExpireAt;

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        /* JADX INFO: renamed from: OooO0O0, reason: from getter */
        public final long getCreatedAt() {
            return this.createdAt;
        }

        /* JADX INFO: renamed from: OooO0OO, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return OooOOO0.OooO0O0(this.userId, oooO0O0.userId) && this.createdAt == oooO0O0.createdAt && OooOOO0.OooO0O0(this.accessToken, oooO0O0.accessToken) && this.accessExpireAt == oooO0O0.accessExpireAt;
        }

        public final int hashCode() {
            return Long.hashCode(this.accessExpireAt) + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20703o000000o.OooO0O0(this.userId.hashCode() * 31, 31, this.createdAt), 31, this.accessToken);
        }

        public final String toString() {
            String str = this.userId;
            long j = this.createdAt;
            String str2 = this.accessToken;
            long j2 = this.accessExpireAt;
            StringBuilder sb = new StringBuilder("FirebaseLoginResponse(userId=");
            sb.append(str);
            sb.append(", createdAt=");
            sb.append(j);
            androidx.concurrent.futures.OooO0O0.OooO0O0(sb, ", accessToken=", str2, ", accessExpireAt=");
            return android.support.v4.media.session.OooO00o.OooO00o(j2, ")", sb);
        }
    }

    @InterfaceC34388OooO0O0("/v1/user")
    Object OooO00o(Continuation<? super C35238OooOoO<C27174OooO0O0<Boolean>>> continuation);

    @OooOOOO("/v1/user/login")
    Object OooO0O0(@InterfaceC34387OooO00o OooO00o oooO00o, Continuation<? super C35238OooOoO<C27174OooO0O0<OooO0O0>>> continuation);

    @InterfaceC34391OooO0o("/v1/user")
    Object OooO0OO(Continuation<? super C35238OooOoO<C27174OooO0O0<FirebaseUserResponse>>> continuation);
}
