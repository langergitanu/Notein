package com.google.android.gms.internal.mlkit_common;

import com.aspose.slides.C22217OooOooo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzgr implements ObjectEncoder {
    static final zzgr zza = new zzgr();
    private static final FieldDescriptor zzb = C22217OooOooo.OooO00o(1, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzc = C22217OooOooo.OooO00o(2, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zzd = C22217OooOooo.OooO00o(3, FieldDescriptor.builder("source"));
    private static final FieldDescriptor zze = C22217OooOooo.OooO00o(4, FieldDescriptor.builder("uri"));
    private static final FieldDescriptor zzf = C22217OooOooo.OooO00o(5, FieldDescriptor.builder("hash"));
    private static final FieldDescriptor zzg = C22217OooOooo.OooO00o(6, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzh = C22217OooOooo.OooO00o(7, FieldDescriptor.builder("size"));
    private static final FieldDescriptor zzi = C22217OooOooo.OooO00o(8, FieldDescriptor.builder("hasLabelMap"));
    private static final FieldDescriptor zzj = C22217OooOooo.OooO00o(9, FieldDescriptor.builder("isManifestModel"));

    private zzgr() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zznh zznhVar = (zznh) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zznhVar.zzd());
        objectEncoderContext2.add(zzc, (Object) null);
        objectEncoderContext2.add(zzd, zznhVar.zzb());
        objectEncoderContext2.add(zze, (Object) null);
        objectEncoderContext2.add(zzf, zznhVar.zzc());
        objectEncoderContext2.add(zzg, zznhVar.zza());
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, (Object) null);
        objectEncoderContext2.add(zzj, (Object) null);
    }
}
