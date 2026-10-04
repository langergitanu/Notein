package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class HmsHiAnalyticsUtils {
    public static void enableLog() {
        C18008n1.m77477a();
    }

    public static boolean getInitFlag() {
        return AbstractC18002l1.m77461b();
    }

    public static void init(Context context, boolean z, boolean z2, boolean z3, String str, String str2) {
        new C18005m1(context).m77472a(z).m77475c(z2).m77474b(z3).m77470a(0, str).m77470a(1, str).m77471a(str2).m77473a();
    }

    public static void onEvent(Context context, String str, String str2) {
        AbstractC18002l1.m77460a(context, str, str2);
    }

    public static void onReport() {
        AbstractC18002l1.m77462c();
    }

    public static void onEvent(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        AbstractC18002l1.m77459a(i, str, linkedHashMap);
    }
}
