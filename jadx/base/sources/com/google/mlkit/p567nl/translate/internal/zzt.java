package com.google.mlkit.p567nl.translate.internal;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.gms.internal.mlkit_translate.zzce;
import com.google.android.gms.internal.mlkit_translate.zzcg;
import com.google.android.gms.internal.mlkit_translate.zzci;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.ModelInfo;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.p567nl.translate.C17446R;
import com.google.mlkit.p567nl.translate.TranslateRemoteModel;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* JADX INFO: loaded from: classes8.dex */
public final class zzt {
    private static final int zza = C17446R.raw.translate_models_metadata;
    private final zzs zzb;

    public zzt(zzs zzsVar) {
        this.zzb = zzsVar;
    }

    private static final ModelInfo zzb(String str, String str2, String str3) {
        int i = TranslateRemoteModel.zzb;
        return new ModelInfo(TranslateRemoteModel.zza(str), Uri.parse(String.format(str3, "v5", "r29", str)), str2, ModelType.TRANSLATE);
    }

    public final List zza(Context context, TranslateRemoteModel translateRemoteModel) throws MlKitException {
        String strZzb = zzac.zzb(translateRemoteModel.getLanguage());
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(zza);
            try {
                String next = new Scanner(inputStreamOpenRawResource).useDelimiter("\\A").next();
                if (inputStreamOpenRawResource != null) {
                    inputStreamOpenRawResource.close();
                }
                try {
                    zzce zzceVarZzb = zzcg.zzb(next).zzb();
                    zzce zzceVarZzc = zzceVarZzb.zzc("PKG_HIGH");
                    zzce zzceVarZzc2 = zzceVarZzb.zzc("PKG_LOW");
                    if (!zzceVarZzc.zzg(strZzb) && !zzceVarZzc2.zzg(strZzb)) {
                        this.zzb.zzs();
                        throw new MlKitException("Could not locate the model metadata.", 13);
                    }
                    try {
                        String strZze = (zzceVarZzc.zzg(strZzb) ? zzceVarZzc.zza(strZzb) : zzceVarZzc2.zza(strZzb)).zzb().zzd("HASH").zze();
                        ArrayList arrayList = new ArrayList(2);
                        arrayList.add(zzb(strZzb, strZze, "https://redirector.gvt1.com/edgedl/translate/offline/%s/high/%s/%s.zip"));
                        arrayList.add(zzb(strZzb, strZze, "https://dl.google.com/translate/offline/%s/high/%s/%s.zip"));
                        return arrayList;
                    } catch (ClassCastException e) {
                        e = e;
                        this.zzb.zzq();
                        throw new MlKitException("Could not locate model's hash.", 13, e);
                    } catch (IllegalStateException e2) {
                        e = e2;
                        this.zzb.zzq();
                        throw new MlKitException("Could not locate model's hash.", 13, e);
                    } catch (NullPointerException e3) {
                        e = e3;
                        this.zzb.zzq();
                        throw new MlKitException("Could not locate model's hash.", 13, e);
                    }
                } catch (zzci e4) {
                    this.zzb.zzr();
                    throw new MlKitException("Translate metadata could not be parsed.", 13, e4);
                }
            } finally {
            }
        } catch (Resources.NotFoundException | IOException e5) {
            this.zzb.zzp();
            throw new MlKitException("Translate metadata could not be located.", 13, e5);
        }
    }
}
