package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.aspose.slides.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22211OooOoO implements Continuation {
    public static int OooO00o(double d, int i, int i2) {
        return i2 - C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(d)), i);
    }

    public static ArrayList OooO0O0(int i, HashMap map, ArrayList arrayList, int i2, String str) {
        map.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return DefaultFirebaseAppCheck.lambda$getToken$1(task);
    }
}
