package com.google.android.gms.internal.mlkit_translate;

import com.aspose.slides.Oooo0;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzll implements ObjectEncoder {
    static final zzll zza = new zzll();
    private static final FieldDescriptor zzb = Oooo0.OooO0O0(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = Oooo0.OooO0O0(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = Oooo0.OooO0O0(3, FieldDescriptor.builder("inputLength"));
    private static final FieldDescriptor zze = Oooo0.OooO0O0(4, FieldDescriptor.builder("outputLength"));
    private static final FieldDescriptor zzf = Oooo0.OooO0O0(5, FieldDescriptor.builder("loadDictionaryErrorCode"));
    private static final FieldDescriptor zzg = Oooo0.OooO0O0(6, FieldDescriptor.builder("translateResultStatusCode"));
    private static final FieldDescriptor zzh = Oooo0.OooO0O0(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = Oooo0.OooO0O0(8, FieldDescriptor.builder("downloadHttpResponseCode"));

    private zzll() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzse zzseVar = (zzse) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzseVar.zza());
        objectEncoderContext2.add(zzc, zzseVar.zzc());
        objectEncoderContext2.add(zzd, zzseVar.zzd());
        objectEncoderContext2.add(zze, zzseVar.zzf());
        objectEncoderContext2.add(zzf, zzseVar.zze());
        objectEncoderContext2.add(zzg, zzseVar.zzg());
        objectEncoderContext2.add(zzh, zzseVar.zzb());
        objectEncoderContext2.add(zzi, (Object) null);
    }
}
