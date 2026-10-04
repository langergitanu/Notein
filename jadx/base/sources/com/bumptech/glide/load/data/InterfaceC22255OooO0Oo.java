package com.bumptech.glide.load.data;

import com.bumptech.glide.EnumC22252OooO0oo;
import o00Ooo0o.EnumC25112OooO00o;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC22255OooO0Oo<T> {

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.OooO0Oo$OooO00o */
    public interface OooO00o<T> {
        void OooO0o(Exception exc);

        void OooO0o0(T t);
    }

    Class<T> OooO00o();

    void OooO0O0();

    EnumC25112OooO00o OooO0OO();

    void OooO0Oo(EnumC22252OooO0oo enumC22252OooO0oo, OooO00o<? super T> oooO00o);

    void cancel();
}
