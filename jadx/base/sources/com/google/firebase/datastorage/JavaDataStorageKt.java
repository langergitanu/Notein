package com.google.firebase.datastorage;

import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0000oOO.AbstractC24338OooO0o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"T", "Lo0000oOO/OooO0o0;", "Lo0000oOO/OooO0o0$OooO00o;", "key", "defaultValue", "getOrDefault", "(Lo0000oOO/OooO0o0;Lo0000oOO/OooO0o0$OooO00o;Ljava/lang/Object;)Ljava/lang/Object;", "com.google.firebase-firebase-common"}, m80613k = 2, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class JavaDataStorageKt {
    public static final <T> T getOrDefault(AbstractC24338OooO0o0 abstractC24338OooO0o0, AbstractC24338OooO0o0.OooO00o<T> key, T t) {
        OooOOO0.OooO0oO(abstractC24338OooO0o0, "<this>");
        OooOOO0.OooO0oO(key, "key");
        T t2 = (T) abstractC24338OooO0o0.OooO0OO(key);
        return t2 == null ? t : t2;
    }
}
