package o00OoooO;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.EnumC22252OooO0oo;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.EnumC25112OooO00o;
import o00OoooO.InterfaceC25186OooOOo;
import o00o0O00.C25320OooO0Oo;

/* JADX INFO: renamed from: o00OoooO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25179OooO0oO<Data> implements InterfaceC25186OooOOo<File, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25180OooO0Oo<Data> f85706OooO00o;

    /* JADX INFO: renamed from: o00OoooO.OooO0oO$OooO00o */
    public static class OooO00o<Data> implements InterfaceC25188OooOOoo<File, Data> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC25180OooO0Oo<Data> f85707OooO00o;

        public OooO00o(InterfaceC25180OooO0Oo<Data> interfaceC25180OooO0Oo) {
            this.f85707OooO00o = interfaceC25180OooO0Oo;
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<File, Data> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25179OooO0oO(this.f85707OooO00o);
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooO0oO$OooO0O0 */
    public static class OooO0O0 extends OooO00o<ParcelFileDescriptor> {
    }

    /* JADX INFO: renamed from: o00OoooO.OooO0oO$OooO0OO */
    public static final class OooO0OO<Data> implements InterfaceC22255OooO0Oo<Data> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final InterfaceC25180OooO0Oo<Data> f85708OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final File f85709OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public Data f85710OooOoO0;

        public OooO0OO(File file, InterfaceC25180OooO0Oo<Data> interfaceC25180OooO0Oo) {
            this.f85709OooOo0o = file;
            this.f85708OooOo = interfaceC25180OooO0Oo;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final Class<Data> OooO00o() {
            return this.f85708OooOo.OooO00o();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0O0() {
            Data data = this.f85710OooOoO0;
            if (data != null) {
                try {
                    this.f85708OooOo.OooO0O0(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final EnumC25112OooO00o OooO0OO() {
            return EnumC25112OooO00o.f85370OooOo0o;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0Oo(EnumC22252OooO0oo enumC22252OooO0oo, InterfaceC22255OooO0Oo.OooO00o<? super Data> oooO00o) {
            try {
                Data dataOooO0OO = this.f85708OooOo.OooO0OO(this.f85709OooOo0o);
                this.f85710OooOoO0 = dataOooO0OO;
                oooO00o.OooO0o0(dataOooO0OO);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                oooO00o.OooO0o(e);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void cancel() {
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooO0oO$OooO0Oo, reason: case insensitive filesystem */
    public interface InterfaceC25180OooO0Oo<Data> {
        Class<Data> OooO00o();

        void OooO0O0(Data data) throws IOException;

        Data OooO0OO(File file) throws FileNotFoundException;
    }

    /* JADX INFO: renamed from: o00OoooO.OooO0oO$OooO0o0, reason: case insensitive filesystem */
    public static class C25181OooO0o0 extends OooO00o<InputStream> {
    }

    public C25179OooO0oO(InterfaceC25180OooO0Oo<Data> interfaceC25180OooO0Oo) {
        this.f85706OooO00o = interfaceC25180OooO0Oo;
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o OooO00o(File file, int i, int i2, C25111OooO c25111OooO) {
        File file2 = file;
        return new InterfaceC25186OooOOo.OooO00o(new C25320OooO0Oo(file2), new OooO0OO(file2, this.f85706OooO00o));
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final /* bridge */ /* synthetic */ boolean OooO0O0(File file) {
        return true;
    }
}
