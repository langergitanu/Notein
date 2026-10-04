package com.google.android.gms.internal.p624firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import com.aspose.slides.internal.p407st.OooO00o;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;

/* JADX INFO: loaded from: classes7.dex */
public final class zzafx {
    private final String zza;
    private final String zzb;

    public zzafx(Context context) {
        this(context, context.getPackageName());
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzafx(Context context, String str) {
        Preconditions.checkNotNull(context);
        String strCheckNotEmpty = Preconditions.checkNotEmpty(str);
        this.zza = strCheckNotEmpty;
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, strCheckNotEmpty);
            if (packageCertificateHashBytes != null) {
                this.zzb = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            } else {
                OooO00o.OooO0O0("single cert required: ", str, "FBA-PackageInfo");
                this.zzb = null;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            OooO00o.OooO0O0("no pkg: ", str, "FBA-PackageInfo");
            this.zzb = null;
        }
    }
}
