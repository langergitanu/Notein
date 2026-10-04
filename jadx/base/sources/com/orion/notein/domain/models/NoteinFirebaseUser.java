package com.orion.notein.domain.models;

import com.aspose.slides.internal.p332p7.OooO;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/domain/models/NoteinFirebaseUser;", "", "id", "", "firebaseUid", "concatEmail", C17625c.f52155b, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getFirebaseUid", "getConcatEmail", "getCreationTime", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteinFirebaseUser {
    private static final String TAG = "NoteinFirebaseUser";
    private final String concatEmail;
    private final long creationTime;
    private final String firebaseUid;
    private final String id;

    public NoteinFirebaseUser(String id, String firebaseUid, String str, long j) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(firebaseUid, "firebaseUid");
        this.id = id;
        this.firebaseUid = firebaseUid;
        this.concatEmail = str;
        this.creationTime = j;
    }

    public static /* synthetic */ NoteinFirebaseUser copy$default(NoteinFirebaseUser noteinFirebaseUser, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noteinFirebaseUser.id;
        }
        if ((i & 2) != 0) {
            str2 = noteinFirebaseUser.firebaseUid;
        }
        if ((i & 4) != 0) {
            str3 = noteinFirebaseUser.concatEmail;
        }
        if ((i & 8) != 0) {
            j = noteinFirebaseUser.creationTime;
        }
        String str4 = str3;
        return noteinFirebaseUser.copy(str, str2, str4, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirebaseUid() {
        return this.firebaseUid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConcatEmail() {
        return this.concatEmail;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    public final NoteinFirebaseUser copy(String id, String firebaseUid, String concatEmail, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(firebaseUid, "firebaseUid");
        return new NoteinFirebaseUser(id, firebaseUid, concatEmail, creationTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteinFirebaseUser)) {
            return false;
        }
        NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) other;
        return OooOOO0.OooO0O0(this.id, noteinFirebaseUser.id) && OooOOO0.OooO0O0(this.firebaseUid, noteinFirebaseUser.firebaseUid) && OooOOO0.OooO0O0(this.concatEmail, noteinFirebaseUser.concatEmail) && this.creationTime == noteinFirebaseUser.creationTime;
    }

    public final String getConcatEmail() {
        return this.concatEmail;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getFirebaseUid() {
        return this.firebaseUid;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.firebaseUid);
        String str = this.concatEmail;
        return Long.hashCode(this.creationTime) + ((iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.firebaseUid;
        String str3 = this.concatEmail;
        long j = this.creationTime;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NoteinFirebaseUser(id=", str, ", firebaseUid=", str2, ", concatEmail=");
        OooO.OooO00o(j, str3, ", creationTime=", sbOooO0O0);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }
}
