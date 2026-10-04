package com.google.android.gms.internal.mlkit_translate;

import com.aspose.slides.Oooo0;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzhz implements ObjectEncoder {
    static final zzhz zza = new zzhz();
    private static final FieldDescriptor zzb = Oooo0.OooO0O0(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = Oooo0.OooO0O0(2, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzd = Oooo0.OooO0O0(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = Oooo0.OooO0O0(4, FieldDescriptor.builder("autoManageModelOnBackground"));
    private static final FieldDescriptor zzf = Oooo0.OooO0O0(5, FieldDescriptor.builder("autoManageModelOnLowMemory"));
    private static final FieldDescriptor zzg = Oooo0.OooO0O0(6, FieldDescriptor.builder("isNnApiEnabled"));
    private static final FieldDescriptor zzh = Oooo0.OooO0O0(7, FieldDescriptor.builder("eventsCount"));
    private static final FieldDescriptor zzi = Oooo0.OooO0O0(8, FieldDescriptor.builder("otherErrors"));
    private static final FieldDescriptor zzj = Oooo0.OooO0O0(9, FieldDescriptor.builder("remoteConfigValueForAcceleration"));
    private static final FieldDescriptor zzk = Oooo0.OooO0O0(10, FieldDescriptor.builder("isAccelerated"));

    private zzhz() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzoc zzocVar = (zzoc) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzocVar.zzc());
        objectEncoderContext2.add(zzc, zzocVar.zza());
        objectEncoderContext2.add(zzd, zzocVar.zzb());
        objectEncoderContext2.add(zze, (Object) null);
        objectEncoderContext2.add(zzf, (Object) null);
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, (Object) null);
        objectEncoderContext2.add(zzj, (Object) null);
        objectEncoderContext2.add(zzk, (Object) null);
    }
}
