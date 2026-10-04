package com.google.android.gms.internal.mlkit_language_id_common;

import com.aspose.slides.C22220Oooo00o;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzec implements ObjectEncoder {
    static final zzec zza = new zzec();
    private static final FieldDescriptor zzb = C22220Oooo00o.OooO00o(1, FieldDescriptor.builder("identifyLanguageConfidenceThreshold"));
    private static final FieldDescriptor zzc = C22220Oooo00o.OooO00o(2, FieldDescriptor.builder("identifyAllLanguagesConfidenceThreshold"));
    private static final FieldDescriptor zzd = C22220Oooo00o.OooO00o(3, FieldDescriptor.builder("confidenceThreshold"));

    private zzec() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, (Object) null);
        objectEncoderContext2.add(zzc, (Object) null);
        objectEncoderContext2.add(zzd, ((zzhu) obj).zza());
    }
}
