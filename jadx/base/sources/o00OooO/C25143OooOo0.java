package o00OooO;

import com.bumptech.glide.load.data.InterfaceC22256OooO0o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o00Ooo0o.C25111OooO;
import o00OooO.OooOO0;
import o00o0O0O.C25321OooO00o;

/* JADX INFO: renamed from: o00OooO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25143OooOo0<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25321OooO00o.OooO0OO f85580OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<? extends OooOO0O<Data, ResourceType, Transcode>> f85581OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f85582OooO0OO;

    public C25143OooOo0(Class cls, Class cls2, Class cls3, List list, C25321OooO00o.OooO0OO oooO0OO) {
        this.f85580OooO00o = oooO0OO;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f85581OooO0O0 = list;
        this.f85582OooO0OO = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final InterfaceC25145OooOo0o OooO00o(int i, int i2, InterfaceC22256OooO0o0 interfaceC22256OooO0o0, C25111OooO c25111OooO, OooOO0.OooO00o oooO00o) throws C25140OooOOo {
        C25321OooO00o.OooO0OO oooO0OO = this.f85580OooO00o;
        List list = (List) oooO0OO.acquire();
        try {
            List<? extends OooOO0O<Data, ResourceType, Transcode>> list2 = this.f85581OooO0O0;
            int size = list2.size();
            InterfaceC25145OooOo0o interfaceC25145OooOo0oOooO00o = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC25145OooOo0oOooO00o = list2.get(i3).OooO00o(i, i2, interfaceC22256OooO0o0, c25111OooO, oooO00o);
                } catch (C25140OooOOo e) {
                    list.add(e);
                }
                if (interfaceC25145OooOo0oOooO00o != null) {
                    break;
                }
            }
            if (interfaceC25145OooOo0oOooO00o != null) {
                return interfaceC25145OooOo0oOooO00o;
            }
            throw new C25140OooOOo(this.f85582OooO0OO, new ArrayList(list));
        } finally {
            oooO0OO.release(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f85581OooO0O0.toArray()) + '}';
    }
}
