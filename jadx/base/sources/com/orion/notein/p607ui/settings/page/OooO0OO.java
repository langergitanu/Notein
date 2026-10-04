package com.orion.notein.p607ui.settings.page;

import android.widget.SeekBar;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.settings.page.PageSettingsFragment;
import kotlin.jvm.internal.OooOOO0;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30641Oooo000;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PageSettingsFragment f79254OooO00o;

    public OooO0OO(PageSettingsFragment pageSettingsFragment) {
        this.f79254OooO00o = pageSettingsFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        PageSettingsFragment.OooO0O0 oooO0O0 = this.f79254OooO00o.f79261Oooo00O;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("pageFreeMoveCard");
            throw null;
        }
        oooO0O0.f79273OooO0Oo.setText(PageSettingsFragment.OooOoO(i));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        OooOOO0.OooO0oO(seekBar, "seekBar");
        this.f79254OooO00o.f79264Oooo0OO = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        OooOOO0.OooO0oO(seekBar, "seekBar");
        PageSettingsFragment pageSettingsFragment = this.f79254OooO00o;
        pageSettingsFragment.f79264Oooo0OO = false;
        C30623OooOOOO c30623OooOOOOOooOoOO = pageSettingsFragment.OooOoOO();
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30623OooOOOOOooOoOO), null, null, new C30641Oooo000(c30623OooOOOOOooOoOO, seekBar.getProgress() / 100.0f, null), 3);
    }
}
