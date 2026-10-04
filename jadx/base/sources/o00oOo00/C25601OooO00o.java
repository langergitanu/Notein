package o00oOo00;

import android.graphics.Bitmap;
import java.io.Closeable;
import o00o0o.AbstractC25434OooO00o;

/* JADX INFO: renamed from: o00oOo00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25601OooO00o implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC25434OooO00o<Bitmap> f87345OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f87346OooOo0o;

    public C25601OooO00o(int i, AbstractC25434OooO00o<Bitmap> abstractC25434OooO00o) {
        this.f87346OooOo0o = i;
        this.f87345OooOo = abstractC25434OooO00o;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f87345OooOo.close();
    }
}
