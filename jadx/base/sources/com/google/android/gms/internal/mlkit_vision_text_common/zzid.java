package com.google.android.gms.internal.mlkit_vision_text_common;

import com.aspose.slides.C22225Oooo0oO;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzid implements ObjectEncoder {
    static final zzid zza = new zzid();
    private static final FieldDescriptor zzb = C22225Oooo0oO.OooO00o(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = C22225Oooo0oO.OooO00o(2, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzd = C22225Oooo0oO.OooO00o(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = C22225Oooo0oO.OooO00o(4, FieldDescriptor.builder("autoManageModelOnBackground"));
    private static final FieldDescriptor zzf = C22225Oooo0oO.OooO00o(5, FieldDescriptor.builder("autoManageModelOnLowMemory"));
    private static final FieldDescriptor zzg = C22225Oooo0oO.OooO00o(6, FieldDescriptor.builder("isNnApiEnabled"));
    private static final FieldDescriptor zzh = C22225Oooo0oO.OooO00o(7, FieldDescriptor.builder("eventsCount"));
    private static final FieldDescriptor zzi = C22225Oooo0oO.OooO00o(8, FieldDescriptor.builder("otherErrors"));
    private static final FieldDescriptor zzj = C22225Oooo0oO.OooO00o(9, FieldDescriptor.builder("remoteConfigValueForAcceleration"));
    private static final FieldDescriptor zzk = C22225Oooo0oO.OooO00o(10, FieldDescriptor.builder("isAccelerated"));

    private zzid() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzoj zzojVar = (zzoj) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzojVar.zze());
        objectEncoderContext2.add(zzc, zzojVar.zza());
        objectEncoderContext2.add(zzd, zzojVar.zzd());
        objectEncoderContext2.add(zze, zzojVar.zzb());
        objectEncoderContext2.add(zzf, zzojVar.zzc());
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, (Object) null);
        objectEncoderContext2.add(zzj, (Object) null);
        objectEncoderContext2.add(zzk, (Object) null);
    }
}
