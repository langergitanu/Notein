package com.google.android.gms.internal.mlkit_language_id_common;

import com.aspose.slides.C22220Oooo00o;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.hihonor.honorid.core.data.DeviceInfo;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzfy implements ObjectEncoder {
    static final zzfy zza = new zzfy();
    private static final FieldDescriptor zzb = C22220Oooo00o.OooO00o(1, FieldDescriptor.builder(DeviceInfo.TAG_DEVICE_INFO));
    private static final FieldDescriptor zzc = C22220Oooo00o.OooO00o(2, FieldDescriptor.builder("nnapiInfo"));
    private static final FieldDescriptor zzd = C22220Oooo00o.OooO00o(3, FieldDescriptor.builder("gpuInfo"));
    private static final FieldDescriptor zze = C22220Oooo00o.OooO00o(4, FieldDescriptor.builder("pipelineIdentifier"));
    private static final FieldDescriptor zzf = C22220Oooo00o.OooO00o(5, FieldDescriptor.builder("acceptedConfigurations"));
    private static final FieldDescriptor zzg = C22220Oooo00o.OooO00o(6, FieldDescriptor.builder("action"));
    private static final FieldDescriptor zzh = C22220Oooo00o.OooO00o(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = C22220Oooo00o.OooO00o(8, FieldDescriptor.builder("customErrors"));
    private static final FieldDescriptor zzj = C22220Oooo00o.OooO00o(9, FieldDescriptor.builder("benchmarkStatus"));
    private static final FieldDescriptor zzk = C22220Oooo00o.OooO00o(10, FieldDescriptor.builder("validationTestResult"));
    private static final FieldDescriptor zzl = C22220Oooo00o.OooO00o(11, FieldDescriptor.builder("timestampUs"));
    private static final FieldDescriptor zzm = C22220Oooo00o.OooO00o(12, FieldDescriptor.builder("elapsedUs"));

    private zzfy() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
