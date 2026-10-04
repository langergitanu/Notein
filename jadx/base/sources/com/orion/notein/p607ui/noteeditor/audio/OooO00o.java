package com.orion.notein.p607ui.noteeditor.audio;

import android.widget.SeekBar;
import android.widget.TextView;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f74201OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ AudioBarChildFragment f74202OooO0O0;

    public OooO00o(AudioBarChildFragment audioBarChildFragment) {
        this.f74202OooO0O0 = audioBarChildFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        OooOOO0.OooO0oO(seekBar, "seekBar");
        AudioBarChildFragment audioBarChildFragment = this.f74202OooO0O0;
        TextView textView = audioBarChildFragment.f74171Oooo0oO;
        if (textView != null) {
            textView.setText(audioBarChildFragment.f74173OoooO.format(Integer.valueOf(i)));
        } else {
            OooOOO0.OooOOOO("tvPlayPosition");
            throw null;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        OooOOO0.OooO0oO(seekBar, "seekBar");
        AudioBarChildFragment audioBarChildFragment = this.f74202OooO0O0;
        audioBarChildFragment.f74176OoooO0O.removeCallbacksAndMessages(null);
        this.f74201OooO00o = audioBarChildFragment.OooOoo0().OooOOo0();
        audioBarChildFragment.OooOoo0().OooOOoo();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        OooOOO0.OooO0oO(seekBar, "seekBar");
        int progress = seekBar.getProgress();
        boolean z = this.f74201OooO00o;
        AudioBarChildFragment audioBarChildFragment = this.f74202OooO0O0;
        if (z) {
            OooO0o.Oooo00O(audioBarChildFragment.OooOoo0(), Integer.valueOf(progress), 2);
        } else {
            audioBarChildFragment.OooOoo0().OooOooO(progress);
        }
    }
}
