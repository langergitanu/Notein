package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.tencent.p610mm.opensdk.utils.Log;

/* JADX INFO: renamed from: com.google.firebase.remoteconfig.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22788OooO0o0 implements SuccessContinuation {
    public static void OooO00o(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        Log.m80584e(str, sb.toString());
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return FirebaseRemoteConfig.lambda$fetch$4((ConfigFetchHandler.FetchResponse) obj);
    }
}
