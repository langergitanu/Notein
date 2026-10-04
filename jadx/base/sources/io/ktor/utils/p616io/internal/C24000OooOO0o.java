package io.ktor.utils.p616io.internal;

import Oooo0oO.o0Oo0oo;
import io.ktor.utils.p616io.o0ooOOo;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: io.ktor.utils.io.internal.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C24000OooOO0o implements o0ooOOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C24000OooOO0o f80834OooO0O0 = new C24000OooOO0o();

    @Override // io.ktor.utils.p616io.o0ooOOo
    public final ByteBuffer OooO00o(int i) {
        return null;
    }

    @Override // io.ktor.utils.p616io.o0ooOOo
    public final Object OooO0oo(int i, Continuation<? super Boolean> continuation) {
        return Boolean.FALSE;
    }

    @Override // io.ktor.utils.p616io.o0ooOOo
    public final void OooOo00(int i) {
        if (i > 0) {
            throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Unable to mark ", " bytes consumed for already terminated channel"));
        }
    }
}
