package o0ooO0Oo;

import java.io.IOException;
import o0ooO0o.C31454OooO;
import o0ooO0o.C31460OooO0o0;

/* JADX INFO: renamed from: o0ooO0Oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31439OooO0oO extends C31460OooO0o0 {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C31454OooO f112236OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31439OooO0oO(C31454OooO c31454OooO, C31454OooO c31454OooO2) {
        super(c31454OooO);
        this.f112236OooOoO0 = c31454OooO2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f112236OooOoO0.close();
    }
}
