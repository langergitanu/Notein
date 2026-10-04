package o00OoooO;

import androidx.fragment.app.C21929Ooooo0o;
import com.bumptech.glide.EnumC22252OooO0oo;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.EnumC25112OooO00o;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00OooO.C25140OooOOo;
import o00OoooO.InterfaceC25186OooOOo;
import o00o0O0O.C25321OooO00o;

/* JADX INFO: renamed from: o00OoooO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25189OooOo0<Model, Data> implements InterfaceC25186OooOOo<Model, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f85739OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25321OooO00o.OooO0OO f85740OooO0O0;

    /* JADX INFO: renamed from: o00OoooO.OooOo0$OooO00o */
    public static class OooO00o<Data> implements InterfaceC22255OooO0Oo<Data>, InterfaceC22255OooO0Oo.OooO00o<Data> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C25321OooO00o.OooO0OO f85741OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final ArrayList f85742OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public EnumC22252OooO0oo f85743OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f85744OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public InterfaceC22255OooO0Oo.OooO00o<? super Data> f85745OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public boolean f85746OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public List<Throwable> f85747OooOoo0;

        public OooO00o(ArrayList arrayList, C25321OooO00o.OooO0OO oooO0OO) {
            this.f85741OooOo = oooO0OO;
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.f85742OooOo0o = arrayList;
            this.f85744OooOoO0 = 0;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final Class<Data> OooO00o() {
            return ((InterfaceC22255OooO0Oo) this.f85742OooOo0o.get(0)).OooO00o();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0O0() {
            List<Throwable> list = this.f85747OooOoo0;
            if (list != null) {
                this.f85741OooOo.release(list);
            }
            this.f85747OooOoo0 = null;
            Iterator it = this.f85742OooOo0o.iterator();
            while (it.hasNext()) {
                ((InterfaceC22255OooO0Oo) it.next()).OooO0O0();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final EnumC25112OooO00o OooO0OO() {
            return ((InterfaceC22255OooO0Oo) this.f85742OooOo0o.get(0)).OooO0OO();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0Oo(EnumC22252OooO0oo enumC22252OooO0oo, InterfaceC22255OooO0Oo.OooO00o<? super Data> oooO00o) {
            this.f85743OooOoO = enumC22252OooO0oo;
            this.f85745OooOoOO = oooO00o;
            this.f85747OooOoo0 = (List) this.f85741OooOo.acquire();
            ((InterfaceC22255OooO0Oo) this.f85742OooOo0o.get(this.f85744OooOoO0)).OooO0Oo(enumC22252OooO0oo, this);
            if (this.f85746OooOoo) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo.OooO00o
        public final void OooO0o(Exception exc) {
            List<Throwable> list = this.f85747OooOoo0;
            C21929Ooooo0o.OooO0OO(list, "Argument must not be null");
            list.add(exc);
            OooO0oO();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo.OooO00o
        public final void OooO0o0(Data data) {
            if (data != null) {
                this.f85745OooOoOO.OooO0o0(data);
            } else {
                OooO0oO();
            }
        }

        public final void OooO0oO() {
            if (this.f85746OooOoo) {
                return;
            }
            if (this.f85744OooOoO0 < this.f85742OooOo0o.size() - 1) {
                this.f85744OooOoO0++;
                OooO0Oo(this.f85743OooOoO, this.f85745OooOoOO);
            } else {
                C21929Ooooo0o.OooO0O0(this.f85747OooOoo0);
                this.f85745OooOoOO.OooO0o(new C25140OooOOo("Fetch failed", new ArrayList(this.f85747OooOoo0)));
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void cancel() {
            this.f85746OooOoo = true;
            Iterator it = this.f85742OooOo0o.iterator();
            while (it.hasNext()) {
                ((InterfaceC22255OooO0Oo) it.next()).cancel();
            }
        }
    }

    public C25189OooOo0(ArrayList arrayList, C25321OooO00o.OooO0OO oooO0OO) {
        this.f85739OooO00o = arrayList;
        this.f85740OooO0O0 = oooO0OO;
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o<Data> OooO00o(Model model, int i, int i2, C25111OooO c25111OooO) {
        InterfaceC25186OooOOo.OooO00o<Data> OooO00o2;
        ArrayList arrayList = this.f85739OooO00o;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        InterfaceC25116OooO0o interfaceC25116OooO0o = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC25186OooOOo interfaceC25186OooOOo = (InterfaceC25186OooOOo) arrayList.get(i3);
            if (interfaceC25186OooOOo.OooO0O0(model) && (OooO00o2 = interfaceC25186OooOOo.OooO00o(model, i, i2, c25111OooO)) != null) {
                arrayList2.add(OooO00o2.f85731OooO0OO);
                interfaceC25116OooO0o = OooO00o2.f85729OooO00o;
            }
        }
        if (arrayList2.isEmpty() || interfaceC25116OooO0o == null) {
            return null;
        }
        return new InterfaceC25186OooOOo.OooO00o<>(interfaceC25116OooO0o, new OooO00o(arrayList2, this.f85740OooO0O0));
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final boolean OooO0O0(Model model) {
        Iterator it = this.f85739OooO00o.iterator();
        while (it.hasNext()) {
            if (((InterfaceC25186OooOOo) it.next()).OooO0O0(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f85739OooO00o.toArray()) + '}';
    }
}
