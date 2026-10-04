package com.google.firebase.sessions;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m80612d2 = {"Lcom/google/firebase/sessions/TimeProvider;", "", "LoO0o0O/OooO00o;", "elapsedRealtime-UwyO8pc", "()J", "elapsedRealtime", "Lcom/google/firebase/sessions/Time;", "currentTime", "()Lcom/google/firebase/sessions/Time;", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public interface TimeProvider {
    Time currentTime();

    /* JADX INFO: renamed from: elapsedRealtime-UwyO8pc, reason: not valid java name */
    long mo80697elapsedRealtimeUwyO8pc();
}
