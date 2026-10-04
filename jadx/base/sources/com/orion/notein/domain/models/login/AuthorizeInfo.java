package com.orion.notein.domain.models.login;

import android.content.Intent;
import androidx.concurrent.futures.OooO00o;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m80612d2 = {"Lcom/orion/notein/domain/models/login/AuthorizeInfo;", "", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "authCode", "", "qrCodeBytes", "", "<init>", "(Landroid/content/Intent;Ljava/lang/String;[B)V", "getIntent", "()Landroid/content/Intent;", "getAuthCode", "()Ljava/lang/String;", "getQrCodeBytes", "()[B", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "copy", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class AuthorizeInfo {
    private final String authCode;
    private final Intent intent;
    private final byte[] qrCodeBytes;

    public AuthorizeInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AuthorizeInfo copy$default(AuthorizeInfo authorizeInfo, Intent intent, String str, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            intent = authorizeInfo.intent;
        }
        if ((i & 2) != 0) {
            str = authorizeInfo.authCode;
        }
        if ((i & 4) != 0) {
            bArr = authorizeInfo.qrCodeBytes;
        }
        return authorizeInfo.copy(intent, str, bArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Intent getIntent() {
        return this.intent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getQrCodeBytes() {
        return this.qrCodeBytes;
    }

    public final AuthorizeInfo copy(Intent intent, String authCode, byte[] qrCodeBytes) {
        return new AuthorizeInfo(intent, authCode, qrCodeBytes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AuthorizeInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        OooOOO0.OooO0o0(other, "null cannot be cast to non-null type com.orion.notein.domain.models.login.AuthorizeInfo");
        AuthorizeInfo authorizeInfo = (AuthorizeInfo) other;
        if (!OooOOO0.OooO0O0(this.intent, authorizeInfo.intent) || !OooOOO0.OooO0O0(this.authCode, authorizeInfo.authCode)) {
            return false;
        }
        byte[] bArr = this.qrCodeBytes;
        if (bArr != null) {
            byte[] bArr2 = authorizeInfo.qrCodeBytes;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (authorizeInfo.qrCodeBytes != null) {
            return false;
        }
        return true;
    }

    public final String getAuthCode() {
        return this.authCode;
    }

    public final Intent getIntent() {
        return this.intent;
    }

    public final byte[] getQrCodeBytes() {
        return this.qrCodeBytes;
    }

    public int hashCode() {
        Intent intent = this.intent;
        int iHashCode = (intent != null ? intent.hashCode() : 0) * 31;
        String str = this.authCode;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        byte[] bArr = this.qrCodeBytes;
        return iHashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public String toString() {
        Intent intent = this.intent;
        String str = this.authCode;
        String string = Arrays.toString(this.qrCodeBytes);
        StringBuilder sb = new StringBuilder("AuthorizeInfo(intent=");
        sb.append(intent);
        sb.append(", authCode=");
        sb.append(str);
        sb.append(", qrCodeBytes=");
        return OooO00o.OooO0OO(sb, string, ")");
    }

    public AuthorizeInfo(Intent intent, String str, byte[] bArr) {
        this.intent = intent;
        this.authCode = str;
        this.qrCodeBytes = bArr;
    }

    public /* synthetic */ AuthorizeInfo(Intent intent, String str, byte[] bArr, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : intent, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bArr);
    }
}
