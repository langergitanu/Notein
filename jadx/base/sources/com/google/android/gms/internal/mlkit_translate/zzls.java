package com.google.android.gms.internal.mlkit_translate;

import com.aspose.slides.Oooo0;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzls implements ObjectEncoder {
    static final zzls zza = new zzls();
    private static final FieldDescriptor zzb = Oooo0.OooO0O0(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = Oooo0.OooO0O0(2, FieldDescriptor.builder("handledErrors"));
    private static final FieldDescriptor zzd = Oooo0.OooO0O0(3, FieldDescriptor.builder("partiallyHandledErrors"));
    private static final FieldDescriptor zze = Oooo0.OooO0O0(4, FieldDescriptor.builder("unhandledErrors"));
    private static final FieldDescriptor zzf = Oooo0.OooO0O0(5, FieldDescriptor.builder("httpResponseCode"));

    private zzls() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzsk zzskVar = (zzsk) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzskVar.zze());
        objectEncoderContext2.add(zzc, zzskVar.zza());
        objectEncoderContext2.add(zzd, zzskVar.zzb());
        objectEncoderContext2.add(zze, zzskVar.zzc());
        objectEncoderContext2.add(zzf, zzskVar.zzd());
    }
}
