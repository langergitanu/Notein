package com.google.android.gms.internal.mlkit_language_id_common;

import com.aspose.slides.C22220Oooo00o;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzfa implements ObjectEncoder {
    static final zzfa zza = new zzfa();
    private static final FieldDescriptor zzb = C22220Oooo00o.OooO00o(1, FieldDescriptor.builder("confidence"));
    private static final FieldDescriptor zzc = C22220Oooo00o.OooO00o(2, FieldDescriptor.builder("languageCode"));

    private zzfa() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzix zzixVar = (zzix) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzixVar.zza());
        objectEncoderContext2.add(zzc, zzixVar.zzb());
    }
}
