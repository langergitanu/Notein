package o00oo0Oo;

import OooooO0.C21294OooOO0O;
import android.content.Context;
import androidx.lifecycle.o0OoOo0;
import com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O;
import com.orion.notein.p607ui.creative_library.C23047OooOoOO;
import com.orion.notein.p607ui.creative_library.CreatorProfileFragment;
import com.orion.notein.p607ui.notelist.favorite.FavoriteListFragment;
import o00ooO.C25732OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o00oo0Oo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C25708OooOoOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f87756OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f87757OooOo0o;

    public /* synthetic */ C25708OooOoOO(Object obj, int i) {
        this.f87757OooOo0o = i;
        this.f87756OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f87756OooOo;
        switch (this.f87757OooOo0o) {
            case 0:
                C25722OoooO00 this$0 = (C25722OoooO00) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                C25732OooO0O0.OooO00o();
                return this$0.OooO0o((InterfaceC22291OoooO0O) this$0.f87794OooOO0o.getValue());
            case 1:
                return C21294OooOO0O.OooO0Oo((Context) obj, "notein-billing-sp");
            case 2:
                C23047OooOoOO c23047OooOoOOOooOoOO = ((CreatorProfileFragment) obj).OooOoOO();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c23047OooOoOOOooOoOO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new com.orion.notein.p607ui.creative_library.Oooo000(c23047OooOoOOOooOoOO, null), 2);
                return C32460OooOooO.f116667OooO00o;
            default:
                return ((FavoriteListFragment) obj).OooOoo0();
        }
    }
}
