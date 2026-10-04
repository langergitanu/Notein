package o00OoooO;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.EnumC22252OooO0oo;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import java.io.IOException;
import java.io.InputStream;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.EnumC25112OooO00o;
import o00OoooO.InterfaceC25186OooOOo;
import o00o000o.C25247OooO0o0;
import o00o000o.C25249OooO0oo;
import o00o0O00.C25320OooO0Oo;

/* JADX INFO: renamed from: o00OoooO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25175OooO0o<DataT> implements InterfaceC25186OooOOo<Integer, DataT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f85691OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f85692OooO0O0;

    /* JADX INFO: renamed from: o00OoooO.OooO0o$OooO00o */
    public static final class OooO00o implements InterfaceC25188OooOOoo<Integer, AssetFileDescriptor>, InterfaceC25177OooO0o0<AssetFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f85693OooO00o;

        public OooO00o(Context context) {
            this.f85693OooO00o = context;
        }

        @Override // o00OoooO.C25175OooO0o.InterfaceC25177OooO0o0
        public final Class<AssetFileDescriptor> OooO00o() {
            return AssetFileDescriptor.class;
        }

        @Override // o00OoooO.C25175OooO0o.InterfaceC25177OooO0o0
        public final void OooO0O0(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Integer, AssetFileDescriptor> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25175OooO0o(this.f85693OooO00o, this);
        }

        @Override // o00OoooO.C25175OooO0o.InterfaceC25177OooO0o0
        public final Object OooO0Oo(Resources resources, int i, Resources.Theme theme) {
            return resources.openRawResourceFd(i);
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooO0o$OooO0O0 */
    public static final class OooO0O0 implements InterfaceC25188OooOOoo<Integer, Drawable>, InterfaceC25177OooO0o0<Drawable> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f85694OooO00o;

        public OooO0O0(Context context) {
            this.f85694OooO00o = context;
        }

        @Override // o00OoooO.C25175OooO0o.InterfaceC25177OooO0o0
        public final Class<Drawable> OooO00o() {
            return Drawable.class;
        }

        @Override // o00OoooO.C25175OooO0o.InterfaceC25177OooO0o0
        public final /* bridge */ /* synthetic */ void OooO0O0(Drawable drawable) throws IOException {
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Integer, Drawable> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25175OooO0o(this.f85694OooO00o, this);
        }

        @Override // o00OoooO.C25175OooO0o.InterfaceC25177OooO0o0
        public final Object OooO0Oo(Resources resources, int i, Resources.Theme theme) {
            Context context = this.f85694OooO00o;
            return C25247OooO0o0.OooO00o(context, context, i, theme);
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooO0o$OooO0OO */
    public static final class OooO0OO implements InterfaceC25188OooOOoo<Integer, InputStream>, InterfaceC25177OooO0o0<InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f85695OooO00o;

        public OooO0OO(Context context) {
            this.f85695OooO00o = context;
        }

        @Override // o00OoooO.C25175OooO0o.InterfaceC25177OooO0o0
        public final Class<InputStream> OooO00o() {
            return InputStream.class;
        }

        @Override // o00OoooO.C25175OooO0o.InterfaceC25177OooO0o0
        public final void OooO0O0(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Integer, InputStream> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25175OooO0o(this.f85695OooO00o, this);
        }

        @Override // o00OoooO.C25175OooO0o.InterfaceC25177OooO0o0
        public final Object OooO0Oo(Resources resources, int i, Resources.Theme theme) {
            return resources.openRawResource(i);
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooO0o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C25176OooO0Oo<DataT> implements InterfaceC22255OooO0Oo<DataT> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Resources f85696OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Resources.Theme f85697OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final int f85698OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final Object f85699OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public DataT f85700OooOoOO;

        public C25176OooO0Oo(Resources.Theme theme, Resources resources, InterfaceC25177OooO0o0<DataT> interfaceC25177OooO0o0, int i) {
            this.f85697OooOo0o = theme;
            this.f85696OooOo = resources;
            this.f85699OooOoO0 = interfaceC25177OooO0o0;
            this.f85698OooOoO = i;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o00OoooO.OooO0o$OooO0o0] */
        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final Class<DataT> OooO00o() {
            return this.f85699OooOoO0.OooO00o();
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o00OoooO.OooO0o$OooO0o0] */
        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0O0() {
            DataT datat = this.f85700OooOoOO;
            if (datat != null) {
                try {
                    this.f85699OooOoO0.OooO0O0(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final EnumC25112OooO00o OooO0OO() {
            return EnumC25112OooO00o.f85370OooOo0o;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, o00OoooO.OooO0o$OooO0o0] */
        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0Oo(EnumC22252OooO0oo enumC22252OooO0oo, InterfaceC22255OooO0Oo.OooO00o<? super DataT> oooO00o) {
            try {
                ?? r4 = (DataT) this.f85699OooOoO0.OooO0Oo(this.f85696OooOo, this.f85698OooOoO, this.f85697OooOo0o);
                this.f85700OooOoOO = r4;
                oooO00o.OooO0o0(r4);
            } catch (Resources.NotFoundException e) {
                oooO00o.OooO0o(e);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void cancel() {
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooO0o$OooO0o0, reason: case insensitive filesystem */
    public interface InterfaceC25177OooO0o0<DataT> {
        Class<DataT> OooO00o();

        void OooO0O0(DataT datat) throws IOException;

        Object OooO0Oo(Resources resources, int i, Resources.Theme theme);
    }

    public C25175OooO0o(Context context, InterfaceC25177OooO0o0<DataT> interfaceC25177OooO0o0) {
        this.f85691OooO00o = context.getApplicationContext();
        this.f85692OooO0O0 = interfaceC25177OooO0o0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o00OoooO.OooO0o$OooO0o0] */
    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o OooO00o(Integer num, int i, int i2, C25111OooO c25111OooO) {
        Integer num2 = num;
        Resources.Theme theme = (Resources.Theme) c25111OooO.OooO0OO(C25249OooO0oo.f85972OooO0O0);
        return new InterfaceC25186OooOOo.OooO00o(new C25320OooO0Oo(num2), new C25176OooO0Oo(theme, theme != null ? theme.getResources() : this.f85691OooO00o.getResources(), this.f85692OooO0O0, num2.intValue()));
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final /* bridge */ /* synthetic */ boolean OooO0O0(Integer num) {
        return true;
    }
}
