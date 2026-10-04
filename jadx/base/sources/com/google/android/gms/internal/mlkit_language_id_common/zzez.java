package com.google.android.gms.internal.mlkit_language_id_common;

import com.aspose.slides.C22220Oooo00o;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzez implements ObjectEncoder {
    static final zzez zza = new zzez();
    private static final FieldDescriptor zzb = C22220Oooo00o.OooO00o(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = C22220Oooo00o.OooO00o(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = C22220Oooo00o.OooO00o(3, FieldDescriptor.builder("identifyLanguageResult"));
    private static final FieldDescriptor zze = C22220Oooo00o.OooO00o(4, FieldDescriptor.builder("identifyPossibleLanguagesResult"));

    private zzez() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzjf zzjfVar = (zzjf) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzjfVar.zza());
        objectEncoderContext2.add(zzc, zzjfVar.zzb());
        objectEncoderContext2.add(zzd, zzjfVar.zzc());
        objectEncoderContext2.add(zze, zzjfVar.zzd());
    }
}
