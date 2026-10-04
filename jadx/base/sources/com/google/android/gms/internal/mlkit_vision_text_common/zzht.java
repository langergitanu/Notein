package com.google.android.gms.internal.mlkit_vision_text_common;

import com.aspose.slides.C22225Oooo0oO;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzht implements ObjectEncoder {
    static final zzht zza = new zzht();
    private static final FieldDescriptor zzb = C22225Oooo0oO.OooO00o(1, FieldDescriptor.builder("maxMs"));
    private static final FieldDescriptor zzc = C22225Oooo0oO.OooO00o(2, FieldDescriptor.builder("minMs"));
    private static final FieldDescriptor zzd = C22225Oooo0oO.OooO00o(3, FieldDescriptor.builder("avgMs"));
    private static final FieldDescriptor zze = C22225Oooo0oO.OooO00o(4, FieldDescriptor.builder("firstQuartileMs"));
    private static final FieldDescriptor zzf = C22225Oooo0oO.OooO00o(5, FieldDescriptor.builder("medianMs"));
    private static final FieldDescriptor zzg = C22225Oooo0oO.OooO00o(6, FieldDescriptor.builder("thirdQuartileMs"));

    private zzht() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zznw zznwVar = (zznw) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zznwVar.zzc());
        objectEncoderContext2.add(zzc, zznwVar.zze());
        objectEncoderContext2.add(zzd, zznwVar.zza());
        objectEncoderContext2.add(zze, zznwVar.zzb());
        objectEncoderContext2.add(zzf, zznwVar.zzd());
        objectEncoderContext2.add(zzg, zznwVar.zzf());
    }
}
