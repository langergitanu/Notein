package com.google.mlkit.p567nl.translate;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_translate.zztc;
import com.google.android.gms.internal.mlkit_translate.zzte;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class TranslatorOptions {
    private final String zza;
    private final String zzb;
    private final Executor zzc;

    public static class Builder {
        private String zza;
        private String zzb;
        private Executor zzc;

        public TranslatorOptions build() {
            return new TranslatorOptions((String) Preconditions.checkNotNull(this.zza), (String) Preconditions.checkNotNull(this.zzb), this.zzc, null);
        }

        public Builder setExecutor(Executor executor) {
            this.zzc = executor;
            return this;
        }

        public Builder setSourceLanguage(String str) {
            this.zza = str;
            return this;
        }

        public Builder setTargetLanguage(String str) {
            this.zzb = str;
            return this;
        }
    }

    public /* synthetic */ TranslatorOptions(String str, String str2, Executor executor, zzl zzlVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = executor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslatorOptions)) {
            return false;
        }
        TranslatorOptions translatorOptions = (TranslatorOptions) obj;
        return Objects.equal(translatorOptions.zza, this.zza) && Objects.equal(translatorOptions.zzb, this.zzb) && Objects.equal(translatorOptions.zzc, this.zzc);
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc);
    }

    public final zzte zza() {
        zztc zztcVar = new zztc();
        zztcVar.zza(this.zza);
        zztcVar.zzb(this.zzb);
        return zztcVar.zzc();
    }

    public final String zzb() {
        return TranslateLanguage.zza(this.zza);
    }

    public final String zzc() {
        return TranslateLanguage.zza(this.zzb);
    }

    public final String zzd() {
        return this.zza;
    }

    public final String zze() {
        return this.zzb;
    }

    public final Executor zzf() {
        return this.zzc;
    }
}
