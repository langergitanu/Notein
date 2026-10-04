package com.google.android.gms.internal.mlkit_translate;

import com.aspose.slides.Oooo0;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzmc implements ObjectEncoder {
    static final zzmc zza = new zzmc();
    private static final FieldDescriptor zzb = Oooo0.OooO0O0(1, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID));
    private static final FieldDescriptor zzc = Oooo0.OooO0O0(2, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION));
    private static final FieldDescriptor zzd = Oooo0.OooO0O0(3, FieldDescriptor.builder("firebaseProjectId"));
    private static final FieldDescriptor zze = Oooo0.OooO0O0(4, FieldDescriptor.builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = Oooo0.OooO0O0(5, FieldDescriptor.builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = Oooo0.OooO0O0(6, FieldDescriptor.builder("gcmSenderId"));
    private static final FieldDescriptor zzh = Oooo0.OooO0O0(7, FieldDescriptor.builder("apiKey"));
    private static final FieldDescriptor zzi = Oooo0.OooO0O0(8, FieldDescriptor.builder("languages"));
    private static final FieldDescriptor zzj = Oooo0.OooO0O0(9, FieldDescriptor.builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = Oooo0.OooO0O0(10, FieldDescriptor.builder("isClearcutClient"));
    private static final FieldDescriptor zzl = Oooo0.OooO0O0(11, FieldDescriptor.builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = Oooo0.OooO0O0(12, FieldDescriptor.builder("isJsonLogging"));
    private static final FieldDescriptor zzn = Oooo0.OooO0O0(13, FieldDescriptor.builder("buildLevel"));
    private static final FieldDescriptor zzo = Oooo0.OooO0O0(14, FieldDescriptor.builder("optionalModuleVersion"));

    private zzmc() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzsw zzswVar = (zzsw) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzswVar.zzg());
        objectEncoderContext2.add(zzc, zzswVar.zzh());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, zzswVar.zzj());
        objectEncoderContext2.add(zzf, zzswVar.zzk());
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, zzswVar.zza());
        objectEncoderContext2.add(zzj, zzswVar.zzi());
        objectEncoderContext2.add(zzk, zzswVar.zzb());
        objectEncoderContext2.add(zzl, zzswVar.zzd());
        objectEncoderContext2.add(zzm, zzswVar.zzc());
        objectEncoderContext2.add(zzn, zzswVar.zze());
        objectEncoderContext2.add(zzo, zzswVar.zzf());
    }
}
