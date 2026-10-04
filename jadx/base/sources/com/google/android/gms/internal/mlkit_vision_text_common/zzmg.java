package com.google.android.gms.internal.mlkit_vision_text_common;

import com.aspose.slides.C22225Oooo0oO;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzmg implements ObjectEncoder {
    static final zzmg zza = new zzmg();
    private static final FieldDescriptor zzb = C22225Oooo0oO.OooO00o(1, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID));
    private static final FieldDescriptor zzc = C22225Oooo0oO.OooO00o(2, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION));
    private static final FieldDescriptor zzd = C22225Oooo0oO.OooO00o(3, FieldDescriptor.builder("firebaseProjectId"));
    private static final FieldDescriptor zze = C22225Oooo0oO.OooO00o(4, FieldDescriptor.builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = C22225Oooo0oO.OooO00o(5, FieldDescriptor.builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = C22225Oooo0oO.OooO00o(6, FieldDescriptor.builder("gcmSenderId"));
    private static final FieldDescriptor zzh = C22225Oooo0oO.OooO00o(7, FieldDescriptor.builder("apiKey"));
    private static final FieldDescriptor zzi = C22225Oooo0oO.OooO00o(8, FieldDescriptor.builder("languages"));
    private static final FieldDescriptor zzj = C22225Oooo0oO.OooO00o(9, FieldDescriptor.builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = C22225Oooo0oO.OooO00o(10, FieldDescriptor.builder("isClearcutClient"));
    private static final FieldDescriptor zzl = C22225Oooo0oO.OooO00o(11, FieldDescriptor.builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = C22225Oooo0oO.OooO00o(12, FieldDescriptor.builder("isJsonLogging"));
    private static final FieldDescriptor zzn = C22225Oooo0oO.OooO00o(13, FieldDescriptor.builder("buildLevel"));
    private static final FieldDescriptor zzo = C22225Oooo0oO.OooO00o(14, FieldDescriptor.builder("optionalModuleVersion"));

    private zzmg() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzst zzstVar = (zzst) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzstVar.zzg());
        objectEncoderContext2.add(zzc, zzstVar.zzh());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, zzstVar.zzj());
        objectEncoderContext2.add(zzf, zzstVar.zzk());
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, zzstVar.zza());
        objectEncoderContext2.add(zzj, zzstVar.zzi());
        objectEncoderContext2.add(zzk, zzstVar.zzb());
        objectEncoderContext2.add(zzl, zzstVar.zzd());
        objectEncoderContext2.add(zzm, zzstVar.zzc());
        objectEncoderContext2.add(zzn, zzstVar.zze());
        objectEncoderContext2.add(zzo, zzstVar.zzf());
    }
}
