package com.aspose.slides;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import java.util.HashMap;
import java.util.HashSet;
import o000ooOO.OooOOOO;

/* JADX INFO: renamed from: com.aspose.slides.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22215OooOoo0 implements Continuation, ObjectConstructor {
    public static float OooO00o(float f, float f2, float f3, float f4) {
        return ((f / f2) * f3) / f4;
    }

    public static HashSet OooO0O0(HashMap map, String str, OooOOOO.OooO00o oooO00o, int i) {
        map.put(str, oooO00o);
        return new HashSet(i);
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        return ConstructorConstructor.lambda$newDefaultImplementationConstructor$10();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return DefaultFirebaseAppCheck.lambda$getLimitedUseToken$3(task);
    }
}
