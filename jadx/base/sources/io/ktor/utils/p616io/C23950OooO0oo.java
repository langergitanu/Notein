package io.ktor.utils.p616io;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.C24033OooOooo;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: io.ktor.utils.io.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23950OooO0oo extends OooOOOO implements InterfaceC32507OooOO0o<ByteBuffer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f80555OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ long f80556OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C24033OooOooo f80557OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ long f80558OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23950OooO0oo(long j, ByteBuffer byteBuffer, long j2, C24033OooOooo c24033OooOooo) {
        super(1);
        this.f80556OooOo0o = j;
        this.f80555OooOo = byteBuffer;
        this.f80558OooOoO0 = j2;
        this.f80557OooOoO = c24033OooOooo;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(ByteBuffer byteBuffer) {
        ByteBuffer nioBuffer = byteBuffer;
        OooOOO0.OooO0oO(nioBuffer, "nioBuffer");
        if (nioBuffer.remaining() > 0) {
            ByteBuffer byteBufferDuplicate = nioBuffer.duplicate();
            OooOOO0.OooO0Oo(byteBufferDuplicate);
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) 0));
            int iLimit = byteBufferDuplicate.limit();
            ByteBuffer byteBuffer2 = this.f80555OooOo;
            long jLimit = byteBuffer2.limit();
            long j = this.f80558OooOoO0;
            byteBufferDuplicate.limit((int) Math.min(byteBufferDuplicate.limit(), Math.min(this.f80556OooOo0o, jLimit - j)));
            this.f80557OooOoO.f80940OooOo0o = byteBufferDuplicate.remaining();
            C23988OooooOO.OooO0Oo(byteBufferDuplicate, byteBuffer2, (int) j);
            byteBufferDuplicate.limit(iLimit);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
