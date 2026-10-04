package o00o00Oo;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC21979OooOOo0;
import java.util.HashMap;
import o00o00Oo.C25267OooOOO;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: renamed from: o00o00Oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25266OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f85995OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25267OooOOO.OooO0O0 f85996OooO0O0;

    /* JADX INFO: renamed from: o00o00Oo.OooOO0o$OooO00o */
    public class OooO00o implements InterfaceC25265OooOO0O {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC21979OooOOo0 f85998OooOo0o;

        public OooO00o(AbstractC21979OooOOo0 abstractC21979OooOOo0) {
            this.f85998OooOo0o = abstractC21979OooOOo0;
        }

        @Override // o00o00Oo.InterfaceC25265OooOO0O
        public final void onDestroy() {
            C25266OooOO0o.this.f85995OooO00o.remove(this.f85998OooOo0o);
        }

        @Override // o00o00Oo.InterfaceC25265OooOO0O
        public final void onStart() {
        }

        @Override // o00o00Oo.InterfaceC25265OooOO0O
        public final void onStop() {
        }
    }

    /* JADX INFO: renamed from: o00o00Oo.OooOO0o$OooO0O0 */
    public final class OooO0O0 implements InterfaceC25269OooOOOO {
    }

    public C25266OooOO0o(C25267OooOOO.OooO0O0 oooO0O0) {
        this.f85996OooO0O0 = oooO0O0;
    }

    public final com.bumptech.glide.OooOOO0 OooO00o(Context context, com.bumptech.glide.OooO0OO oooO0OO, AbstractC21979OooOOo0 abstractC21979OooOOo0, FragmentManager fragmentManager, boolean z) {
        C25316OooOO0o.OooO00o();
        C25316OooOO0o.OooO00o();
        HashMap map = this.f85995OooO00o;
        com.bumptech.glide.OooOOO0 oooOOO0 = (com.bumptech.glide.OooOOO0) map.get(abstractC21979OooOOo0);
        if (oooOOO0 != null) {
            return oooOOO0;
        }
        C25264OooOO0 c25264OooOO0 = new C25264OooOO0(abstractC21979OooOOo0);
        com.bumptech.glide.OooOOO0 oooOOO0OooO00o = this.f85996OooO0O0.OooO00o(oooO0OO, c25264OooOO0, new OooO0O0(), context);
        map.put(abstractC21979OooOOo0, oooOOO0OooO00o);
        c25264OooOO0.OooO00o(new OooO00o(abstractC21979OooOOo0));
        if (z) {
            oooOOO0OooO00o.onStart();
        }
        return oooOOO0OooO00o;
    }
}
