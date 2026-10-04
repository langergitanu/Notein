package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;
import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.firebase.encoders.FieldDescriptor;

/* JADX INFO: renamed from: com.aspose.slides.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22226Oooo0oo {
    public static SortedList OooO00o(int i, SortedList sortedList, SortedList sortedList2) {
        sortedList.addItem(Integer.valueOf(i), sortedList2);
        return new SortedList();
    }

    public static FieldDescriptor.Builder OooO0O0(int i, FieldDescriptor.Builder builder, String str) {
        zzct zzctVar = new zzct();
        zzctVar.zza(i);
        builder.withProperty(zzctVar.zzb()).build();
        return FieldDescriptor.builder(str);
    }

    public static StringBuilder OooO0OO(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }
}
