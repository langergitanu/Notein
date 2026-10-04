package com.google.android.gms.internal.mlkit_translate;

import com.aspose.slides.Oooo0;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzim implements ObjectEncoder {
    static final zzim zza = new zzim();
    private static final FieldDescriptor zzb = Oooo0.OooO0O0(1, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzc = Oooo0.OooO0O0(2, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zzd = Oooo0.OooO0O0(3, FieldDescriptor.builder("source"));
    private static final FieldDescriptor zze = Oooo0.OooO0O0(4, FieldDescriptor.builder("uri"));
    private static final FieldDescriptor zzf = Oooo0.OooO0O0(5, FieldDescriptor.builder("hash"));
    private static final FieldDescriptor zzg = Oooo0.OooO0O0(6, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzh = Oooo0.OooO0O0(7, FieldDescriptor.builder("size"));
    private static final FieldDescriptor zzi = Oooo0.OooO0O0(8, FieldDescriptor.builder("hasLabelMap"));
    private static final FieldDescriptor zzj = Oooo0.OooO0O0(9, FieldDescriptor.builder("isManifestModel"));

    private zzim() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzpc zzpcVar = (zzpc) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzpcVar.zzd());
        objectEncoderContext2.add(zzc, (Object) null);
        objectEncoderContext2.add(zzd, zzpcVar.zzb());
        objectEncoderContext2.add(zze, (Object) null);
        objectEncoderContext2.add(zzf, zzpcVar.zzc());
        objectEncoderContext2.add(zzg, zzpcVar.zza());
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, (Object) null);
        objectEncoderContext2.add(zzj, (Object) null);
    }
}
