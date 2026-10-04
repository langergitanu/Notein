package com.google.android.gms.internal.mlkit_vision_text_common;

import com.aspose.slides.C22225Oooo0oO;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzgk implements ObjectEncoder {
    static final zzgk zza = new zzgk();
    private static final FieldDescriptor zzb = C22225Oooo0oO.OooO00o(1, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzc = C22225Oooo0oO.OooO00o(2, FieldDescriptor.builder("hasResult"));
    private static final FieldDescriptor zzd = C22225Oooo0oO.OooO00o(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = C22225Oooo0oO.OooO00o(4, FieldDescriptor.builder("imageInfo"));
    private static final FieldDescriptor zzf = C22225Oooo0oO.OooO00o(5, FieldDescriptor.builder("recognizerOptions"));

    private zzgk() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzes zzesVar = (zzes) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzesVar.zza());
        objectEncoderContext2.add(zzc, (Object) null);
        objectEncoderContext2.add(zzd, zzesVar.zzc());
        objectEncoderContext2.add(zze, (Object) null);
        objectEncoderContext2.add(zzf, zzesVar.zzb());
    }
}
