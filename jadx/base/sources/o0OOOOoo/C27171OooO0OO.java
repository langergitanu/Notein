package o0OOOOoo;

import com.google.gson.annotations.SerializedName;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOOOoo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, m80612d2 = {"Lo0OOOOoo/OooO0OO;", "", "", "OooO00o", "Ljava/lang/String;", "getNickname", "()Ljava/lang/String;", IDToken.NICKNAME, "OooO0O0", "getGender", "gender", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27171OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nick_name")
    private final String nickname;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gender")
    private final String gender;

    public C27171OooO0OO() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27171OooO0OO)) {
            return false;
        }
        C27171OooO0OO c27171OooO0OO = (C27171OooO0OO) obj;
        return OooOOO0.OooO0O0(this.nickname, c27171OooO0OO.nickname) && OooOOO0.OooO0O0(this.gender, c27171OooO0OO.gender);
    }

    public final int hashCode() {
        String str = this.nickname;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gender;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return androidx.core.database.OooO00o.OooO00o("UpdateUserInfoBody(nickname=", this.nickname, ", gender=", this.gender, ")");
    }

    public C27171OooO0OO(String str, int i) {
        this.nickname = (i & 1) != 0 ? null : str;
        this.gender = null;
    }
}
