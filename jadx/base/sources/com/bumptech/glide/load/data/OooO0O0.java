package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.EnumC22252OooO0oo;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import java.io.IOException;
import o00Ooo0o.EnumC25112OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OooO0O0<T> implements InterfaceC22255OooO0Oo<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AssetManager f67194OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f67195OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public T f67196OooOoO0;

    public OooO0O0(AssetManager assetManager, String str) {
        this.f67194OooOo = assetManager;
        this.f67195OooOo0o = str;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final void OooO0O0() {
        T t = this.f67196OooOoO0;
        if (t == null) {
            return;
        }
        try {
            OooO0o0(t);
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final EnumC25112OooO00o OooO0OO() {
        return EnumC25112OooO00o.f85370OooOo0o;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final void OooO0Oo(EnumC22252OooO0oo enumC22252OooO0oo, InterfaceC22255OooO0Oo.OooO00o<? super T> oooO00o) {
        try {
            T tOooO0o = OooO0o(this.f67194OooOo, this.f67195OooOo0o);
            this.f67196OooOoO0 = tOooO0o;
            oooO00o.OooO0o0(tOooO0o);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            oooO00o.OooO0o(e);
        }
    }

    public abstract T OooO0o(AssetManager assetManager, String str) throws IOException;

    public abstract void OooO0o0(T t) throws IOException;

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final void cancel() {
    }
}
