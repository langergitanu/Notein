package io.ktor.utils.p616io.internal;

import io.ktor.utils.p616io.OooO00o;
import io.ktor.utils.p616io.oo0o0Oo;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.OooOOO0;
import oO00OOoo.C32250OooO0O0;
import oO00Oo0O.C32271OooO00o;
import oO00ooo.AbstractC32479OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o implements oo0o0Oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f80804OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f80805OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C32271OooO00o f80806OooO0Oo;

    public OooO0o(OooO00o channel) {
        OooOOO0.OooO0oO(channel, "channel");
        this.f80804OooO0O0 = channel;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C32271OooO00o.f115974OooO;
        this.f80806OooO0Oo = C32271OooO00o.f115978OooOOO0;
    }

    @Override // io.ktor.utils.p616io.oo0o0Oo
    public final C32271OooO00o OooO00o(int i) {
        ByteBuffer byteBufferOooO00o = this.f80804OooO0O0.OooO00o(i);
        if (byteBufferOooO00o == null) {
            return null;
        }
        ByteBuffer byteBuffer = C32250OooO0O0.f115830OooO00o;
        ByteBuffer byteBufferOrder = byteBufferOooO00o.slice().order(ByteOrder.BIG_ENDIAN);
        OooOOO0.OooO0o(byteBufferOrder, "buffer.slice().order(ByteOrder.BIG_ENDIAN)");
        C32271OooO00o c32271OooO00o = new C32271OooO00o(byteBufferOrder, null, null);
        c32271OooO00o.f115947OooO0Oo = 0;
        c32271OooO00o.f115945OooO0O0 = 0;
        c32271OooO00o.f115946OooO0OO = c32271OooO00o.f115948OooO0o;
        OooO0O0(c32271OooO00o);
        return c32271OooO00o;
    }

    public final void OooO0O0(C32271OooO00o c32271OooO00o) {
        int i = this.f80805OooO0OO;
        C32271OooO00o c32271OooO00o2 = this.f80806OooO0Oo;
        int i2 = i - (c32271OooO00o2.f115946OooO0OO - c32271OooO00o2.f115945OooO0O0);
        if (i2 > 0) {
            this.f80804OooO0O0.OooOo00(i2);
        }
        this.f80806OooO0Oo = c32271OooO00o;
        this.f80805OooO0OO = c32271OooO00o.f115946OooO0OO - c32271OooO00o.f115945OooO0O0;
    }

    @Override // io.ktor.utils.p616io.oo0o0Oo
    public final int OooO0oo(int i) {
        OooO0O0(C32271OooO00o.f115978OooOOO0);
        OooO00o oooO00o = this.f80804OooO0O0;
        int iMin = Math.min(oooO00o.OooO0OO(), i);
        oooO00o.OooOo00(iMin);
        return iMin;
    }

    @Override // io.ktor.utils.p616io.oo0o0Oo
    public final Object OooOo00(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0O0(C32271OooO00o.f115978OooOOO0);
        return this.f80804OooO0O0.OooO0oo(i, abstractC32479OooO0OO);
    }
}
