package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bumptech.glide.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22251OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Class<?>, Object> f67131OooO00o;

    /* JADX INFO: renamed from: com.bumptech.glide.OooO0oO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashMap f67132OooO00o = new HashMap();
    }

    public C22251OooO0oO(OooO00o oooO00o) {
        this.f67131OooO00o = Collections.unmodifiableMap(new HashMap(oooO00o.f67132OooO00o));
    }
}
