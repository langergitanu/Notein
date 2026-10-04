package com.google.android.gms.internal.mlkit_vision_common;

import com.aspose.slides.C22224Oooo0o0;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzgu implements ObjectEncoder {
    static final zzgu zza = new zzgu();
    private static final FieldDescriptor zzb = C22224Oooo0o0.OooO00o(1, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID));
    private static final FieldDescriptor zzc = C22224Oooo0o0.OooO00o(2, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION));
    private static final FieldDescriptor zzd = C22224Oooo0o0.OooO00o(3, FieldDescriptor.builder("firebaseProjectId"));
    private static final FieldDescriptor zze = C22224Oooo0o0.OooO00o(4, FieldDescriptor.builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = C22224Oooo0o0.OooO00o(5, FieldDescriptor.builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = C22224Oooo0o0.OooO00o(6, FieldDescriptor.builder("gcmSenderId"));
    private static final FieldDescriptor zzh = C22224Oooo0o0.OooO00o(7, FieldDescriptor.builder("apiKey"));
    private static final FieldDescriptor zzi = C22224Oooo0o0.OooO00o(8, FieldDescriptor.builder("languages"));
    private static final FieldDescriptor zzj = C22224Oooo0o0.OooO00o(9, FieldDescriptor.builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = C22224Oooo0o0.OooO00o(10, FieldDescriptor.builder("isClearcutClient"));
    private static final FieldDescriptor zzl = C22224Oooo0o0.OooO00o(11, FieldDescriptor.builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = C22224Oooo0o0.OooO00o(12, FieldDescriptor.builder("isJsonLogging"));
    private static final FieldDescriptor zzn = C22224Oooo0o0.OooO00o(13, FieldDescriptor.builder("buildLevel"));
    private static final FieldDescriptor zzo = C22224Oooo0o0.OooO00o(14, FieldDescriptor.builder("optionalModuleVersion"));

    private zzgu() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzla zzlaVar = (zzla) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzlaVar.zzg());
        objectEncoderContext2.add(zzc, zzlaVar.zzh());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, zzlaVar.zzj());
        objectEncoderContext2.add(zzf, zzlaVar.zzk());
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, zzlaVar.zza());
        objectEncoderContext2.add(zzj, zzlaVar.zzi());
        objectEncoderContext2.add(zzk, zzlaVar.zzb());
        objectEncoderContext2.add(zzl, zzlaVar.zzd());
        objectEncoderContext2.add(zzm, zzlaVar.zzc());
        objectEncoderContext2.add(zzn, zzlaVar.zze());
        objectEncoderContext2.add(zzo, zzlaVar.zzf());
    }
}
