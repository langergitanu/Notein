package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzh;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Listener;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22216OooOooO implements Listener, ObjectConstructor {
    public static Integer OooO00o(int i, Dictionary dictionary, Integer num, int i2) {
        dictionary.addItem(num, Integer.valueOf(i));
        return Integer.valueOf(i2);
    }

    public static Object OooO0O0(zzbk zzbkVar, int i, List list, int i2) {
        zzh.zza(zzbkVar.name(), i, list);
        return list.get(i2);
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        return ConstructorConstructor.lambda$newDefaultImplementationConstructor$12();
    }

    @Override // com.google.firebase.firestore.util.Listener
    public void onValue(Object obj) {
        FirestoreClient.lambda$new$3((String) obj);
    }
}
