package com.google.android.gms.internal.mlkit_translate;

import com.aspose.slides.Oooo0;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzil implements ObjectEncoder {
    static final zzil zza = new zzil();
    private static final FieldDescriptor zzb = Oooo0.OooO0O0(1, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzc = Oooo0.OooO0O0(2, FieldDescriptor.builder("roughDownloadDurationMs"));
    private static final FieldDescriptor zzd = Oooo0.OooO0O0(3, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zze = Oooo0.OooO0O0(4, FieldDescriptor.builder("exactDownloadDurationMs"));
    private static final FieldDescriptor zzf = Oooo0.OooO0O0(5, FieldDescriptor.builder("downloadStatus"));
    private static final FieldDescriptor zzg = Oooo0.OooO0O0(6, FieldDescriptor.builder("downloadFailureStatus"));
    private static final FieldDescriptor zzh = Oooo0.OooO0O0(7, FieldDescriptor.builder("mddDownloadErrorCodes"));

    private zzil() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzox zzoxVar = (zzox) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzoxVar.zzc());
        objectEncoderContext2.add(zzc, zzoxVar.zze());
        objectEncoderContext2.add(zzd, zzoxVar.zza());
        objectEncoderContext2.add(zze, (Object) null);
        objectEncoderContext2.add(zzf, zzoxVar.zzb());
        objectEncoderContext2.add(zzg, zzoxVar.zzd());
        objectEncoderContext2.add(zzh, (Object) null);
    }
}
