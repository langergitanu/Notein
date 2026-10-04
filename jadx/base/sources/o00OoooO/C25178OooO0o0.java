package o00OoooO;

import android.util.Base64;
import com.bumptech.glide.EnumC22252OooO0oo;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.EnumC25112OooO00o;
import o00OoooO.InterfaceC25186OooOOo;
import o00o0O00.C25320OooO0Oo;

/* JADX INFO: renamed from: o00OoooO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25178OooO0o0<Model, Data> implements InterfaceC25186OooOOo<Model, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0.OooO00o f85701OooO00o;

    /* JADX INFO: renamed from: o00OoooO.OooO0o0$OooO00o */
    public static final class OooO00o<Data> implements InterfaceC22255OooO0Oo<Data> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO0O0.OooO00o f85702OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final String f85703OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public ByteArrayInputStream f85704OooOoO0;

        public OooO00o(String str, OooO0O0.OooO00o oooO00o) {
            this.f85703OooOo0o = str;
            this.f85702OooOo = oooO00o;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final Class<Data> OooO00o() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0O0() {
            try {
                this.f85704OooOoO0.close();
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final EnumC25112OooO00o OooO0OO() {
            return EnumC25112OooO00o.f85370OooOo0o;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0Oo(EnumC22252OooO0oo enumC22252OooO0oo, InterfaceC22255OooO0Oo.OooO00o<? super Data> oooO00o) {
            try {
                ByteArrayInputStream byteArrayInputStreamOooO00o = this.f85702OooOo.OooO00o(this.f85703OooOo0o);
                this.f85704OooOoO0 = byteArrayInputStreamOooO00o;
                oooO00o.OooO0o0(byteArrayInputStreamOooO00o);
            } catch (IllegalArgumentException e) {
                oooO00o.OooO0o(e);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void cancel() {
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooO0o0$OooO0O0 */
    public static final class OooO0O0<Model> implements InterfaceC25188OooOOoo<Model, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f85705OooO00o = new OooO00o();

        /* JADX INFO: renamed from: o00OoooO.OooO0o0$OooO0O0$OooO00o */
        public class OooO00o {
            public final ByteArrayInputStream OooO00o(String str) throws IllegalArgumentException {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Model, InputStream> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25178OooO0o0(this.f85705OooO00o);
        }
    }

    public C25178OooO0o0(OooO0O0.OooO00o oooO00o) {
        this.f85701OooO00o = oooO00o;
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o<Data> OooO00o(Model model, int i, int i2, C25111OooO c25111OooO) {
        return new InterfaceC25186OooOOo.OooO00o<>(new C25320OooO0Oo(model), new OooO00o(model.toString(), this.f85701OooO00o));
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final boolean OooO0O0(Model model) {
        return model.toString().startsWith("data:image");
    }
}
