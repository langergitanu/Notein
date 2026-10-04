package o000OO00;

import androidx.core.content.ContextCompat;
import androidx.ink.brush.StampingTextureNative;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import o000OO00.OooOo;
import o0OoOo0o.C29210OooO00o;

/* JADX INFO: renamed from: o000OO00.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24469OooOoO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f82753OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82754OooOo0o;

    public /* synthetic */ C24469OooOoO(Object obj, int i) {
        this.f82754OooOo0o = i;
        this.f82753OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f82754OooOo0o) {
            case 0:
                return Integer.valueOf(StampingTextureNative.f65353OooO00o.getAnimationFrames(((OooOo.OooO0OO) this.f82753OooOo).OooO00o()));
            default:
                return new C29210OooO00o(ContextCompat.getColor(((AudioBarChildFragment) this.f82753OooOo).requireContext(), R.color.notein_accent_blue));
        }
    }
}
