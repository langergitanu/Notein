package o00OoooO;

import com.bumptech.glide.EnumC22252OooO0oo;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.EnumC25112OooO00o;
import o00OoooO.InterfaceC25186OooOOo;
import o00o0O00.C25320OooO0Oo;

/* JADX INFO: renamed from: o00OoooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25171OooO0O0<Data> implements InterfaceC25186OooOOo<byte[], Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC19683OooO0O0<Data> f85686OooO00o;

    /* JADX INFO: renamed from: o00OoooO.OooO0O0$OooO00o */
    public static class OooO00o implements InterfaceC25188OooOOoo<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: o00OoooO.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C19682OooO00o implements InterfaceC19683OooO0O0<ByteBuffer> {
            @Override // o00OoooO.C25171OooO0O0.InterfaceC19683OooO0O0
            public final Class<ByteBuffer> OooO00o() {
                return ByteBuffer.class;
            }

            @Override // o00OoooO.C25171OooO0O0.InterfaceC19683OooO0O0
            public final ByteBuffer OooO0O0(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<byte[], ByteBuffer> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25171OooO0O0(new C19682OooO00o());
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public interface InterfaceC19683OooO0O0<Data> {
        Class<Data> OooO00o();

        Data OooO0O0(byte[] bArr);
    }

    /* JADX INFO: renamed from: o00OoooO.OooO0O0$OooO0OO */
    public static class OooO0OO<Data> implements InterfaceC22255OooO0Oo<Data> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final InterfaceC19683OooO0O0<Data> f85687OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final byte[] f85688OooOo0o;

        public OooO0OO(byte[] bArr, InterfaceC19683OooO0O0<Data> interfaceC19683OooO0O0) {
            this.f85688OooOo0o = bArr;
            this.f85687OooOo = interfaceC19683OooO0O0;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final Class<Data> OooO00o() {
            return this.f85687OooOo.OooO00o();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0O0() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final EnumC25112OooO00o OooO0OO() {
            return EnumC25112OooO00o.f85370OooOo0o;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0Oo(EnumC22252OooO0oo enumC22252OooO0oo, InterfaceC22255OooO0Oo.OooO00o<? super Data> oooO00o) {
            oooO00o.OooO0o0(this.f85687OooOo.OooO0O0(this.f85688OooOo0o));
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void cancel() {
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooO0O0$OooO0Oo, reason: case insensitive filesystem */
    public static class C25172OooO0Oo implements InterfaceC25188OooOOoo<byte[], InputStream> {

        /* JADX INFO: renamed from: o00OoooO.OooO0O0$OooO0Oo$OooO00o */
        public class OooO00o implements InterfaceC19683OooO0O0<InputStream> {
            @Override // o00OoooO.C25171OooO0O0.InterfaceC19683OooO0O0
            public final Class<InputStream> OooO00o() {
                return InputStream.class;
            }

            @Override // o00OoooO.C25171OooO0O0.InterfaceC19683OooO0O0
            public final InputStream OooO0O0(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<byte[], InputStream> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25171OooO0O0(new OooO00o());
        }
    }

    public C25171OooO0O0(InterfaceC19683OooO0O0<Data> interfaceC19683OooO0O0) {
        this.f85686OooO00o = interfaceC19683OooO0O0;
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o OooO00o(byte[] bArr, int i, int i2, C25111OooO c25111OooO) {
        byte[] bArr2 = bArr;
        return new InterfaceC25186OooOOo.OooO00o(new C25320OooO0Oo(bArr2), new OooO0OO(bArr2, this.f85686OooO00o));
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final /* bridge */ /* synthetic */ boolean OooO0O0(byte[] bArr) {
        return true;
    }
}
