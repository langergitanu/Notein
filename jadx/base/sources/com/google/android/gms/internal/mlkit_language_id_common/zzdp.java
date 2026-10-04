package com.google.android.gms.internal.mlkit_language_id_common;

import com.aspose.slides.C22220Oooo00o;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzdp implements ObjectEncoder {
    static final zzdp zza = new zzdp();
    private static final FieldDescriptor zzb = C22220Oooo00o.OooO00o(1, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION));
    private static final FieldDescriptor zzc = C22220Oooo00o.OooO00o(2, FieldDescriptor.builder("osBuild"));
    private static final FieldDescriptor zzd = C22220Oooo00o.OooO00o(3, FieldDescriptor.builder("brand"));
    private static final FieldDescriptor zze = C22220Oooo00o.OooO00o(4, FieldDescriptor.builder("device"));
    private static final FieldDescriptor zzf = C22220Oooo00o.OooO00o(5, FieldDescriptor.builder("hardware"));
    private static final FieldDescriptor zzg = C22220Oooo00o.OooO00o(6, FieldDescriptor.builder("manufacturer"));
    private static final FieldDescriptor zzh = C22220Oooo00o.OooO00o(7, FieldDescriptor.builder("model"));
    private static final FieldDescriptor zzi = C22220Oooo00o.OooO00o(8, FieldDescriptor.builder("product"));
    private static final FieldDescriptor zzj = C22220Oooo00o.OooO00o(9, FieldDescriptor.builder("soc"));
    private static final FieldDescriptor zzk = C22220Oooo00o.OooO00o(10, FieldDescriptor.builder("socMetaBuildId"));

    private zzdp() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
