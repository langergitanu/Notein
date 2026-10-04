package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.EnumC22252OooO0oo;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import java.io.FileNotFoundException;
import java.io.IOException;
import o00Ooo0o.EnumC25112OooO00o;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22259OooOO0o<T> implements InterfaceC22255OooO0Oo<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ContentResolver f67215OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Uri f67216OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public T f67217OooOoO0;

    public AbstractC22259OooOO0o(ContentResolver contentResolver, Uri uri) {
        this.f67215OooOo = contentResolver;
        this.f67216OooOo0o = uri;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final void OooO0O0() {
        T t = this.f67217OooOoO0;
        if (t != null) {
            try {
                OooO0o0(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final EnumC25112OooO00o OooO0OO() {
        return EnumC25112OooO00o.f85370OooOo0o;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final void OooO0Oo(EnumC22252OooO0oo enumC22252OooO0oo, InterfaceC22255OooO0Oo.OooO00o<? super T> oooO00o) {
        try {
            ?? r3 = (T) OooO0o(this.f67215OooOo, this.f67216OooOo0o);
            this.f67217OooOoO0 = r3;
            oooO00o.OooO0o0(r3);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            oooO00o.OooO0o(e);
        }
    }

    public abstract Object OooO0o(ContentResolver contentResolver, Uri uri) throws FileNotFoundException;

    public abstract void OooO0o0(T t) throws IOException;

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final void cancel() {
    }
}
