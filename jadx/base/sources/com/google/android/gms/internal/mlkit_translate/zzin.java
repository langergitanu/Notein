package com.google.android.gms.internal.mlkit_translate;

import com.aspose.slides.Oooo0;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzin implements ObjectEncoder {
    static final zzin zza = new zzin();
    private static final FieldDescriptor zzb = Oooo0.OooO0O0(1, FieldDescriptor.builder("modelInfo"));
    private static final FieldDescriptor zzc = Oooo0.OooO0O0(2, FieldDescriptor.builder("initialDownloadConditions"));
    private static final FieldDescriptor zzd = Oooo0.OooO0O0(3, FieldDescriptor.builder("updateDownloadConditions"));
    private static final FieldDescriptor zze = Oooo0.OooO0O0(4, FieldDescriptor.builder("isModelUpdateEnabled"));

    private zzin() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, ((zzpg) obj).zza());
        objectEncoderContext2.add(zzc, (Object) null);
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, (Object) null);
    }
}
