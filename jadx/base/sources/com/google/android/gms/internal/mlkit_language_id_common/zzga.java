package com.google.android.gms.internal.mlkit_language_id_common;

import com.aspose.slides.C22220Oooo00o;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzga implements ObjectEncoder {
    static final zzga zza = new zzga();
    private static final FieldDescriptor zzb = C22220Oooo00o.OooO00o(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = C22220Oooo00o.OooO00o(2, FieldDescriptor.builder("handledErrors"));
    private static final FieldDescriptor zzd = C22220Oooo00o.OooO00o(3, FieldDescriptor.builder("partiallyHandledErrors"));
    private static final FieldDescriptor zze = C22220Oooo00o.OooO00o(4, FieldDescriptor.builder("unhandledErrors"));
    private static final FieldDescriptor zzf = C22220Oooo00o.OooO00o(5, FieldDescriptor.builder("httpResponseCode"));

    private zzga() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
