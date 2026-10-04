package o00o000O;

import com.bumptech.glide.load.data.InterfaceC22256OooO0o0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o00o000O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25241OooO00o implements InterfaceC22256OooO0o0<ByteBuffer> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ByteBuffer f85963OooO00o;

    /* JADX INFO: renamed from: o00o000O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C19690OooO00o implements InterfaceC22256OooO0o0.OooO00o<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.InterfaceC22256OooO0o0.OooO00o
        public final Class<ByteBuffer> OooO00o() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22256OooO0o0.OooO00o
        public final InterfaceC22256OooO0o0<ByteBuffer> OooO0O0(ByteBuffer byteBuffer) {
            return new C25241OooO00o(byteBuffer);
        }
    }

    public C25241OooO00o(ByteBuffer byteBuffer) {
        this.f85963OooO00o = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22256OooO0o0
    public final ByteBuffer OooO00o() throws IOException {
        ByteBuffer byteBuffer = this.f85963OooO00o;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22256OooO0o0
    public final void OooO0O0() {
    }
}
