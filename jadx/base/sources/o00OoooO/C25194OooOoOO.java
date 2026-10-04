package o00OoooO;

import com.bumptech.glide.EnumC22252OooO0oo;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.EnumC25112OooO00o;
import o00OoooO.InterfaceC25186OooOOo;
import o00o0O00.C25320OooO0Oo;

/* JADX INFO: renamed from: o00OoooO.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25194OooOoOO<Model> implements InterfaceC25186OooOOo<Model, Model> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C25194OooOoOO<?> f85768OooO00o = new C25194OooOoOO<>();

    /* JADX INFO: renamed from: o00OoooO.OooOoOO$OooO00o */
    public static class OooO00o<Model> implements InterfaceC25188OooOOoo<Model, Model> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o<?> f85769OooO00o = new OooO00o<>();

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Model, Model> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return C25194OooOoOO.f85768OooO00o;
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooOoOO$OooO0O0 */
    public static class OooO0O0<Model> implements InterfaceC22255OooO0Oo<Model> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Model f85770OooOo0o;

        public OooO0O0(Model model) {
            this.f85770OooOo0o = model;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final Class<Model> OooO00o() {
            return (Class<Model>) this.f85770OooOo0o.getClass();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0O0() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final EnumC25112OooO00o OooO0OO() {
            return EnumC25112OooO00o.f85370OooOo0o;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0Oo(EnumC22252OooO0oo enumC22252OooO0oo, InterfaceC22255OooO0Oo.OooO00o<? super Model> oooO00o) {
            oooO00o.OooO0o0(this.f85770OooOo0o);
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void cancel() {
        }
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o<Model> OooO00o(Model model, int i, int i2, C25111OooO c25111OooO) {
        return new InterfaceC25186OooOOo.OooO00o<>(new C25320OooO0Oo(model), new OooO0O0(model));
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final boolean OooO0O0(Model model) {
        return true;
    }
}
