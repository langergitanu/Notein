package oO00O0o;

import java.io.Closeable;
import oOo00OO0.C34480OooO0Oo;

/* JADX INFO: renamed from: oO00O0o.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32182OooOOo0 implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34480OooO0Oo f115504OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO f115505OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f115506OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final CharSequence f115507OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final CharSequence f115508OooOoOO;

    public C32182OooOOo0(CharSequence version, int i, CharSequence statusText, OooO oooO, C34480OooO0Oo builder) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(version, "version");
        kotlin.jvm.internal.OooOOO0.OooO0oO(statusText, "statusText");
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        this.f115505OooOo0o = oooO;
        this.f115504OooOo = builder;
        this.f115507OooOoO0 = version;
        this.f115506OooOoO = i;
        this.f115508OooOoOO = statusText;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f115504OooOo.OooO0o0();
        this.f115505OooOo0o.OooO0Oo();
    }
}
