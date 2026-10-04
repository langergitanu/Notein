package com.google.android.gms.internal.mlkit_common;

import com.aspose.slides.C22217OooOooo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzkh implements ObjectEncoder {
    static final zzkh zza = new zzkh();
    private static final FieldDescriptor zzb = C22217OooOooo.OooO00o(1, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID));
    private static final FieldDescriptor zzc = C22217OooOooo.OooO00o(2, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION));
    private static final FieldDescriptor zzd = C22217OooOooo.OooO00o(3, FieldDescriptor.builder("firebaseProjectId"));
    private static final FieldDescriptor zze = C22217OooOooo.OooO00o(4, FieldDescriptor.builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = C22217OooOooo.OooO00o(5, FieldDescriptor.builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = C22217OooOooo.OooO00o(6, FieldDescriptor.builder("gcmSenderId"));
    private static final FieldDescriptor zzh = C22217OooOooo.OooO00o(7, FieldDescriptor.builder("apiKey"));
    private static final FieldDescriptor zzi = C22217OooOooo.OooO00o(8, FieldDescriptor.builder("languages"));
    private static final FieldDescriptor zzj = C22217OooOooo.OooO00o(9, FieldDescriptor.builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = C22217OooOooo.OooO00o(10, FieldDescriptor.builder("isClearcutClient"));
    private static final FieldDescriptor zzl = C22217OooOooo.OooO00o(11, FieldDescriptor.builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = C22217OooOooo.OooO00o(12, FieldDescriptor.builder("isJsonLogging"));
    private static final FieldDescriptor zzn = C22217OooOooo.OooO00o(13, FieldDescriptor.builder("buildLevel"));
    private static final FieldDescriptor zzo = C22217OooOooo.OooO00o(14, FieldDescriptor.builder("optionalModuleVersion"));

    private zzkh() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzqv zzqvVar = (zzqv) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzqvVar.zzg());
        objectEncoderContext2.add(zzc, zzqvVar.zzh());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, zzqvVar.zzj());
        objectEncoderContext2.add(zzf, zzqvVar.zzk());
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, zzqvVar.zza());
        objectEncoderContext2.add(zzj, zzqvVar.zzi());
        objectEncoderContext2.add(zzk, zzqvVar.zzb());
        objectEncoderContext2.add(zzl, zzqvVar.zzd());
        objectEncoderContext2.add(zzm, zzqvVar.zzc());
        objectEncoderContext2.add(zzn, zzqvVar.zze());
        objectEncoderContext2.add(zzo, zzqvVar.zzf());
    }
}
