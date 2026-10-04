package o0o00oO0;

import android.view.View;
import com.orion.notein.p607ui.settings.appearance.AppearanceSettingsFragment;
import o0o00o0.C29936OooO0oO;

/* JADX INFO: renamed from: o0o00oO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29991OooO0oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f106540OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f106541OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29991OooO0oo(Object obj, int i) {
        this.f106541OooOo0o = i;
        this.f106540OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f106541OooOo0o) {
            case 0:
                C29936OooO0oO c29936OooO0oO = ((C29993OooOOOo) this.f106540OooOo).f106559Oooo0;
                if (c29936OooO0oO != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    View.OnClickListener onClickListener = c29936OooO0oO.f106286OooO0o;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }
                break;
            default:
                ((AppearanceSettingsFragment) this.f106540OooOo).OooOoO().OooO0o0(-1);
                break;
        }
    }
}
