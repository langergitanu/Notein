package com.google.mlkit.p567nl.translate.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.mlkit_translate.zzt;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.LegacyModelMigrator;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public final class zzp extends LegacyModelMigrator {
    public zzp(Context context, ModelFileHelper modelFileHelper) {
        super(context, modelFileHelper);
    }

    private final void zzb(File file) {
        String name = file.getName();
        try {
            if (zzac.zzd(name).length == 2 && file.isDirectory()) {
                try {
                    File modelDir = this.modelFileHelper.getModelDir(name, ModelType.TRANSLATE);
                    zzt zztVarZza = zzac.zza(name);
                    int size = zztVarZza.size();
                    for (int i = 0; i < size; i++) {
                        String str = (String) zztVarZza.get(i);
                        LegacyModelMigrator.migrateFile(new File(file, str), new File(modelDir, str));
                    }
                    LegacyModelMigrator.deleteIfEmpty(file);
                } catch (MlKitException e) {
                    Log.e("TranslateMigrator", "Error creating model directory for ".concat(String.valueOf(name)), e);
                }
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // com.google.mlkit.common.sdkinternal.model.LegacyModelMigrator
    public final String getLegacyModelDirName() {
        return "com.google.firebase.ml.translate.models";
    }

    @Override // com.google.mlkit.common.sdkinternal.model.LegacyModelMigrator
    public final void migrateAllModelDirs(File file) {
        File[] fileArrListFiles;
        if (LegacyModelMigrator.isValidFirebasePersistenceKey(file.getName()) && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                zzb(file2);
            }
            LegacyModelMigrator.deleteIfEmpty(file);
        }
    }
}
