package com.google.android.gms.internal.mlkit_language_id_common;

import com.aspose.slides.C22220Oooo00o;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzdn implements ObjectEncoder {
    static final zzdn zza = new zzdn();
    private static final FieldDescriptor zzb = C22220Oooo00o.OooO00o(1, FieldDescriptor.builder("remoteModelOptions"));
    private static final FieldDescriptor zzc = C22220Oooo00o.OooO00o(2, FieldDescriptor.builder("localModelOptions"));
    private static final FieldDescriptor zzd = C22220Oooo00o.OooO00o(3, FieldDescriptor.builder("errorCodes"));
    private static final FieldDescriptor zze = C22220Oooo00o.OooO00o(4, FieldDescriptor.builder("modelInitializationMs"));
    private static final FieldDescriptor zzf = C22220Oooo00o.OooO00o(5, FieldDescriptor.builder("isNnApiEnabled"));

    private zzdn() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
