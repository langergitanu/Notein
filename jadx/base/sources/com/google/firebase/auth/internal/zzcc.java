package com.google.firebase.auth.internal;

import OooOO0.OooO0OO;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.words.WarningType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.TotpSecret;
import com.huawei.hms.network.embedded.C18241k5;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcc implements TotpSecret {
    private final String zza;
    private final String zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private String zzf;
    private FirebaseAuth zzg;

    public zzcc(String str, String str2, int i, int i2, long j, String str3, FirebaseAuth firebaseAuth) {
        Preconditions.checkNotEmpty(str3, "sessionInfo cannot be empty.");
        Preconditions.checkNotNull(firebaseAuth, "firebaseAuth cannot be null.");
        this.zza = Preconditions.checkNotEmpty(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.zzb = Preconditions.checkNotEmpty(str2, "hashAlgorithm cannot be empty.");
        this.zzc = i;
        this.zzd = i2;
        this.zze = j;
        this.zzf = str3;
        this.zzg = firebaseAuth;
    }

    private final void zza(String str) {
        this.zzg.getApp().getApplicationContext().startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)).addFlags(WarningType.HINT));
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final String generateQrCodeUrl() {
        return generateQrCodeUrl(Preconditions.checkNotEmpty(((FirebaseUser) Preconditions.checkNotNull(this.zzg.getCurrentUser(), "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.")).getEmail(), "Email cannot be empty, since verified email is required to use MFA."), this.zzg.getApp().getName());
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final int getCodeIntervalSeconds() {
        return this.zzd;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final int getCodeLength() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final long getEnrollmentCompletionDeadline() {
        return this.zze;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final String getHashAlgorithm() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final String getSessionInfo() {
        return this.zzf;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final String getSharedSecretKey() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final void openInOtpApp(String str) {
        Preconditions.checkNotEmpty(str, "qrCodeUrl cannot be empty.");
        try {
            zza(str);
        } catch (ActivityNotFoundException unused) {
            zza("https://play.google.com/store/search?q=otpauth&c=apps");
        }
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final void openInOtpApp(String str, String str2, Activity activity) {
        Preconditions.checkNotEmpty(str, "QrCodeUrl cannot be empty.");
        Preconditions.checkNotEmpty(str2, "FallbackUrl cannot be empty.");
        Preconditions.checkNotNull(activity, "Activity cannot be null.");
        try {
            zza(str, activity);
        } catch (ActivityNotFoundException unused) {
            zza(str2, activity);
        }
    }

    private static void zza(String str, Activity activity) {
        Preconditions.checkNotNull(activity, "Activity cannot be null.");
        activity.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)).addFlags(WarningType.HINT));
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final String generateQrCodeUrl(String str, String str2) {
        Preconditions.checkNotEmpty(str, "accountName cannot be empty.");
        Preconditions.checkNotEmpty(str2, "issuer cannot be empty.");
        String str3 = this.zza;
        String str4 = this.zzb;
        int i = this.zzc;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("otpauth://totp/", str2, C18241k5.f55433h, str, "?secret=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, "&issuer=", str2, "&algorithm=");
        sbOooO0O0.append(str4);
        sbOooO0O0.append("&digits=");
        sbOooO0O0.append(i);
        return sbOooO0O0.toString();
    }
}
