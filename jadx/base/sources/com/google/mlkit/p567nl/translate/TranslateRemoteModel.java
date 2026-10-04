package com.google.mlkit.p567nl.translate;

import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import com.google.mlkit.p567nl.translate.internal.zzac;

/* JADX INFO: loaded from: classes8.dex */
public class TranslateRemoteModel extends RemoteModel {
    public static final /* synthetic */ int zzb = 0;
    private final String zzc;

    public static class Builder {
        private final String zza;

        public Builder(String str) {
            this.zza = str;
        }

        public TranslateRemoteModel build() {
            return new TranslateRemoteModel(this.zza, null);
        }
    }

    public /* synthetic */ TranslateRemoteModel(String str, zzk zzkVar) {
        super(null, BaseModel.TRANSLATE, ModelType.TRANSLATE);
        this.zzc = str;
    }

    public static String zza(String str) {
        return "COM.GOOGLE.BASE_TRANSLATE:".concat(String.valueOf(str));
    }

    @Override // com.google.mlkit.common.model.RemoteModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TranslateRemoteModel) && super.equals(obj) && getLanguage() == ((TranslateRemoteModel) obj).getLanguage();
    }

    public String getLanguage() {
        return this.zzc;
    }

    @Override // com.google.mlkit.common.model.RemoteModel
    public final String getModelNameForBackend() {
        return zzac.zzb(getLanguage());
    }

    @Override // com.google.mlkit.common.model.RemoteModel
    public final String getUniqueModelNameForPersist() {
        return zza(zzac.zzb(getLanguage()));
    }

    @Override // com.google.mlkit.common.model.RemoteModel
    public int hashCode() {
        return getLanguage().hashCode() + (super.hashCode() * 31);
    }
}
