package o0OoOOo;

import android.view.View;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0OoOOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29128OooO0O0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f103250OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AudioBarChildFragment f103251OooOo0o;

    public /* synthetic */ C29128OooO0O0(AudioBarChildFragment audioBarChildFragment, boolean z) {
        this.f103251OooOo0o = audioBarChildFragment;
        this.f103250OooOo = z;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        View view = this.f103251OooOo0o.f74161OooOooo;
        if (view != null) {
            view.setVisibility(this.f103250OooOo ? 0 : 8);
            return C32460OooOooO.f116667OooO00o;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
        throw null;
    }
}
