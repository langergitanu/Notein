package o00OoooO;

import android.util.Log;
import com.bumptech.glide.EnumC22252OooO0oo;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.EnumC25112OooO00o;
import o00OoooO.InterfaceC25186OooOOo;
import o00o0O0.C25308OooO00o;
import o00o0O00.C25320OooO0Oo;

/* JADX INFO: renamed from: o00OoooO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25174OooO0Oo implements InterfaceC25186OooOOo<File, ByteBuffer> {

    /* JADX INFO: renamed from: o00OoooO.OooO0Oo$OooO00o */
    public static final class OooO00o implements InterfaceC22255OooO0Oo<ByteBuffer> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final File f85690OooOo0o;

        public OooO00o(File file) {
            this.f85690OooOo0o = file;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final Class<ByteBuffer> OooO00o() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0O0() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final EnumC25112OooO00o OooO0OO() {
            return EnumC25112OooO00o.f85370OooOo0o;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0Oo(EnumC22252OooO0oo enumC22252OooO0oo, InterfaceC22255OooO0Oo.OooO00o<? super ByteBuffer> oooO00o) {
            try {
                oooO00o.OooO0o0(C25308OooO00o.OooO00o(this.f85690OooOo0o));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                oooO00o.OooO0o(e);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void cancel() {
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooO0Oo$OooO0O0 */
    public static class OooO0O0 implements InterfaceC25188OooOOoo<File, ByteBuffer> {
        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<File, ByteBuffer> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25174OooO0Oo();
        }
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o<ByteBuffer> OooO00o(File file, int i, int i2, C25111OooO c25111OooO) {
        File file2 = file;
        return new InterfaceC25186OooOOo.OooO00o<>(new C25320OooO0Oo(file2), new OooO00o(file2));
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final /* bridge */ /* synthetic */ boolean OooO0O0(File file) {
        return true;
    }
}
