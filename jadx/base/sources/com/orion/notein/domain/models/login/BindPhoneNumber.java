package com.orion.notein.domain.models.login;

import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
import com.orion.notein.domain.models.User;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m80612d2 = {"Lcom/orion/notein/domain/models/login/BindPhoneNumber;", "", "user", "Lcom/orion/notein/domain/models/User;", ResponseType.TOKEN, "", "<init>", "(Lcom/orion/notein/domain/models/User;Ljava/lang/String;)V", "getUser", "()Lcom/orion/notein/domain/models/User;", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class BindPhoneNumber {
    private final String token;
    private final User user;

    public BindPhoneNumber(User user, String token) {
        OooOOO0.OooO0oO(user, "user");
        OooOOO0.OooO0oO(token, "token");
        this.user = user;
        this.token = token;
    }

    public static /* synthetic */ BindPhoneNumber copy$default(BindPhoneNumber bindPhoneNumber, User user, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            user = bindPhoneNumber.user;
        }
        if ((i & 2) != 0) {
            str = bindPhoneNumber.token;
        }
        return bindPhoneNumber.copy(user, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final BindPhoneNumber copy(User user, String token) {
        OooOOO0.OooO0oO(user, "user");
        OooOOO0.OooO0oO(token, "token");
        return new BindPhoneNumber(user, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindPhoneNumber)) {
            return false;
        }
        BindPhoneNumber bindPhoneNumber = (BindPhoneNumber) other;
        return OooOOO0.OooO0O0(this.user, bindPhoneNumber.user) && OooOOO0.OooO0O0(this.token, bindPhoneNumber.token);
    }

    public final String getToken() {
        return this.token;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.token.hashCode() + (this.user.hashCode() * 31);
    }

    public String toString() {
        return "BindPhoneNumber(user=" + this.user + ", token=" + this.token + ")";
    }
}
