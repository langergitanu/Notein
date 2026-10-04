package com.google.firebase.vertexai.common;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\t\u001a\u00020\u00068&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m80612d2 = {"Lcom/google/firebase/vertexai/common/HeaderProvider;", "", "", "", "generateHeaders", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LoO0o0O/OooO00o;", "getTimeout-UwyO8pc", "()J", "timeout", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public interface HeaderProvider {
    Object generateHeaders(Continuation<? super Map<String, String>> continuation);

    /* JADX INFO: renamed from: getTimeout-UwyO8pc */
    long mo80701getTimeoutUwyO8pc();
}
