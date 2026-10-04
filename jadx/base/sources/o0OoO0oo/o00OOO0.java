package o0OoO0oo;

import android.os.Build;
import android.view.MotionEvent;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.vivo.penengine.impl.VivoStylusManagerImpl;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class o00OOO0 implements o0O0o0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f102222OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102223OooO0O0;

    public o00OOO0(NoteEditorFragment noteEditorFragment) {
        this.f102223OooO0O0 = noteEditorFragment;
        String BRAND = Build.BRAND;
        kotlin.jvm.internal.OooOOO0.OooO0o(BRAND, "BRAND");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.OooOOO0.OooO0o(locale, "getDefault(...)");
        String upperCase = BRAND.toUpperCase(locale);
        kotlin.jvm.internal.OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
        this.f102222OooO00o = upperCase;
    }

    @Override // o0O0o0.OooO00o
    public final void OooO00o(MotionEvent motionEvent) {
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102222OooO00o, "VIVO")) {
            int action = motionEvent.getAction();
            NoteEditorFragment noteEditorFragment = this.f102223OooO0O0;
            if (action == 0) {
                VivoStylusManagerImpl.getInstance(noteEditorFragment.getContext()).enableWritingVibrate(true);
            } else if (action == 1 || action == 3) {
                VivoStylusManagerImpl.getInstance(noteEditorFragment.getContext()).enableWritingVibrate(false);
            }
        }
    }

    @Override // o0O0o0.OooO00o
    public final void onAttachedToWindow() {
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102222OooO00o, "VIVO")) {
            VivoStylusManagerImpl.getInstance(this.f102223OooO0O0.getContext()).init();
        }
    }

    @Override // o0O0o0.OooO00o
    public final void onDetachedFromWindow() {
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102222OooO00o, "VIVO")) {
            VivoStylusManagerImpl.getInstance(this.f102223OooO0O0.getContext()).destroy();
        }
    }
}
