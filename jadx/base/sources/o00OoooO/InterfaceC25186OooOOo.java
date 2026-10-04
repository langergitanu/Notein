package o00OoooO;

import androidx.fragment.app.C21929Ooooo0o;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import java.util.Collections;
import java.util.List;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25116OooO0o;

/* JADX INFO: renamed from: o00OoooO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC25186OooOOo<Model, Data> {

    /* JADX INFO: renamed from: o00OoooO.OooOOo$OooO00o */
    public static class OooO00o<Data> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC25116OooO0o f85729OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<InterfaceC25116OooO0o> f85730OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final InterfaceC22255OooO0Oo<Data> f85731OooO0OO;

        public OooO00o() {
            throw null;
        }

        public OooO00o(InterfaceC25116OooO0o interfaceC25116OooO0o, InterfaceC22255OooO0Oo<Data> interfaceC22255OooO0Oo) {
            List<InterfaceC25116OooO0o> list = Collections.EMPTY_LIST;
            C21929Ooooo0o.OooO0OO(interfaceC25116OooO0o, "Argument must not be null");
            this.f85729OooO00o = interfaceC25116OooO0o;
            C21929Ooooo0o.OooO0OO(list, "Argument must not be null");
            this.f85730OooO0O0 = list;
            C21929Ooooo0o.OooO0OO(interfaceC22255OooO0Oo, "Argument must not be null");
            this.f85731OooO0OO = interfaceC22255OooO0Oo;
        }
    }

    OooO00o<Data> OooO00o(Model model, int i, int i2, C25111OooO c25111OooO);

    boolean OooO0O0(Model model);
}
