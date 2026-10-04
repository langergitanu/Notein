package com.google.android.gms.internal.mlkit_common;

import com.aspose.slides.C22217OooOooo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzgs implements ObjectEncoder {
    static final zzgs zza = new zzgs();
    private static final FieldDescriptor zzb = C22217OooOooo.OooO00o(1, FieldDescriptor.builder("modelInfo"));
    private static final FieldDescriptor zzc = C22217OooOooo.OooO00o(2, FieldDescriptor.builder("initialDownloadConditions"));
    private static final FieldDescriptor zzd = C22217OooOooo.OooO00o(3, FieldDescriptor.builder("updateDownloadConditions"));
    private static final FieldDescriptor zze = C22217OooOooo.OooO00o(4, FieldDescriptor.builder("isModelUpdateEnabled"));

    private zzgs() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, ((zznl) obj).zza());
        objectEncoderContext2.add(zzc, (Object) null);
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, (Object) null);
    }
}
