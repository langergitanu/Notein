package o0OO0oO;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooOOO0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f93551OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f93552OooOo0o;

    public /* synthetic */ OooOOO0(Object obj, int i) {
        this.f93552OooOo0o = i;
        this.f93551OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f93552OooOo0o) {
            case 0:
                return ((C26938OooOOoo) this.f93551OooOo).f93571OooO0O0.get();
            default:
                Context baseContext = ((com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o) this.f93551OooOo).f74087OooO00o;
                while (true) {
                    if (!(baseContext instanceof OooO0Oo.OooOO0O)) {
                        if (baseContext instanceof ContextWrapper) {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                        if (baseContext == null) {
                            baseContext = null;
                        }
                    }
                }
                OooO0Oo.OooOO0O oooOO0O = (OooO0Oo.OooOO0O) baseContext;
                if (oooOO0O != null) {
                    return oooOO0O;
                }
                throw new IllegalStateException("Impossible context type.");
        }
    }
}
