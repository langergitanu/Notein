package o0o0O0oO;

import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o.C33523OooO00o;
import oO0oO00.C33991o00000Oo;

/* JADX INFO: renamed from: o0o0O0oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30312OooO00o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f108082OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f108083OooOo0o;

    public /* synthetic */ C30312OooO00o(Object obj, int i) {
        this.f108083OooOo0o = i;
        this.f108082OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f108083OooOo0o) {
            case 0:
                Integer num = (Integer) obj;
                num.getClass();
                ((TrashBinContainerFragment) this.f108082OooOo).OooOoOO().OooOOOo(num);
                break;
            default:
                C33523OooO00o buildClassSerialDescriptor = (C33523OooO00o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                C33991o00000Oo c33991o00000Oo = (C33991o00000Oo) this.f108082OooOo;
                C33523OooO00o.OooO00o(buildClassSerialDescriptor, "first", c33991o00000Oo.f122232OooO00o.getDescriptor());
                C33523OooO00o.OooO00o(buildClassSerialDescriptor, "second", c33991o00000Oo.f122233OooO0O0.getDescriptor());
                C33523OooO00o.OooO00o(buildClassSerialDescriptor, "third", c33991o00000Oo.f122234OooO0OO.getDescriptor());
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
