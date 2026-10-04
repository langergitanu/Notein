package o0o00oO0;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.orion.notein.global.R;
import o0Oo0ooO.ViewOnClickListenerC28426OooOo0;
import o0Oo0ooO.ViewOnClickListenerC28427OooOo00;
import o0OoOO00.ViewOnClickListenerC29007OooOo0;
import o0o00o0.C29936OooO0oO;
import o0o00o0.InterfaceC29937OooO0oo;

/* JADX INFO: renamed from: o0o00oO0.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30016OoooO implements InterfaceC29937OooO0oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C29936OooO0oO f106675OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final View f106676OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final View f106677OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final SwitchMaterial f106678OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final SwitchMaterial f106679OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final SeekBar f106680OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final TextView f106681OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f106682OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f106683OooOooo = 20;

    public C30016OoooO(View view) {
        this.f106676OooOo0o = view;
        SwitchMaterial switchMaterial = (SwitchMaterial) view.findViewById(R.id.st_auto_shape_recognize);
        this.f106678OooOoO0 = switchMaterial;
        SwitchMaterial switchMaterial2 = (SwitchMaterial) view.findViewById(R.id.st_fill_shape_with_color);
        this.f106679OooOoOO = switchMaterial2;
        View viewFindViewById = view.findViewById(R.id.iv_auto_shape_guide);
        this.f106677OooOoO = viewFindViewById;
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.seekbar_color_opacity);
        this.f106680OooOoo = seekBar;
        this.f106681OooOoo0 = (TextView) view.findViewById(R.id.tv_opacity_of_shape_fill_color);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28427OooOo00(this, 3));
        switchMaterial.setOnClickListener(new ViewOnClickListenerC28426OooOo0(this, 3));
        switchMaterial2.setOnClickListener(new ViewOnClickListenerC29007OooOo0(this, 2));
        seekBar.setOnSeekBarChangeListener(new C30019OoooO0O(this));
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOOOo(boolean z) {
        this.f106682OooOooO = z;
        this.f106679OooOoOO.setChecked(z);
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOo0o(int i) {
        this.f106683OooOooo = i;
        this.f106681OooOoo0.setText(i + "%");
        this.f106680OooOoo.setProgress(i);
    }
}
