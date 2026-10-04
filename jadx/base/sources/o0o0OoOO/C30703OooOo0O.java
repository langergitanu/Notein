package o0o0OoOO;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.C21650OooOoO;
import androidx.lifecycle.C21989OooOooO;
import com.orion.notein.domain.mapper.StrokeMapper;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import java.util.Arrays;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00.C25206OooO0Oo;
import o0O0o00.C25927OooOo;
import o0OOo0o.C27355Oooo0oO;
import o0OOo0o.C27428o000oOoO;
import o0o0OoOo.C30722OooO00o;
import o0oo0OO.C31225OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OoOO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$showPenDebugDialog$1", m80623f = "DebugFragment.kt", m80624l = {405}, m80625m = "invokeSuspend")
public final class C30703OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DebugFragment f109808OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109809OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30703OooOo0O(DebugFragment debugFragment, Continuation<? super C30703OooOo0O> continuation) {
        super(2, continuation);
        this.f109808OooOo = debugFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30703OooOo0O(this.f109808OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30703OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109809OooOo0o;
        final DebugFragment debugFragment = this.f109808OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
            C30722OooO00o c30722OooO00oOooOoO = debugFragment.OooOoO();
            this.f109809OooOo0o = 1;
            C27428o000oOoO c27428o000oOoO = c30722OooO00oOooOoO.f109876OooOo00;
            c27428o000oOoO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27355Oooo0oO(c27428o000oOoO, null), this);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o = obj;
        }
        int iOooO0o = oO0O00oo.OooOO0.OooO0o(((Number) objOooO0o).intValue(), 0, 240);
        AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o2 = DebugFragment.f79020Oooo0OO;
        View viewInflate = debugFragment.getLayoutInflater().inflate(R.layout.dialog_debug_pen_settings, (ViewGroup) null);
        final SwitchCompat switchCompat = (SwitchCompat) viewInflate.findViewById(R.id.switch_force_legacy_pens);
        final SwitchCompat switchCompat2 = (SwitchCompat) viewInflate.findViewById(R.id.switch_debug_simplify_effect);
        final SeekBar seekBar = (SeekBar) viewInflate.findViewById(R.id.seek_parallelism);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_parallelism_value);
        final SeekBar seekBar2 = (SeekBar) viewInflate.findViewById(R.id.seek_k_factor);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_k_factor_value);
        final SeekBar seekBar3 = (SeekBar) viewInflate.findViewById(R.id.seek_sampling_rate);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_sampling_rate_value);
        int iOooO0o2 = oO0O00oo.OooOO0.OooO0o(StrokeMapper.INSTANCE.getDefaultParallelism(), 1, 7);
        int iOooO0o3 = oO0O00oo.OooOO0.OooO0o(oO0O00O.OooO00o.OooO0O0(C31225OooO00o.f111349OooO00o * 10.0f), 1, 90);
        switchCompat.setChecked(((Boolean) C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new C30704OooOo0o(debugFragment, null))).booleanValue());
        switchCompat2.setChecked(C25927OooOo.f88498OooOO0o);
        seekBar.setMax(6);
        seekBar.setProgress(iOooO0o2 - 1);
        textView.setText(String.valueOf(iOooO0o2));
        seekBar2.setMax(89);
        seekBar2.setProgress(iOooO0o3 - 1);
        textView2.setText(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(iOooO0o3 / 10.0f)}, 1)));
        seekBar3.setMax(240);
        seekBar3.setProgress(iOooO0o);
        textView3.setText(iOooO0o == 0 ? debugFragment.getString(R.string.debug_sampling_rate_default) : C21650OooOoO.OooO00o(iOooO0o, "Hz"));
        seekBar.setOnSeekBarChangeListener(new C30700OooOo(textView));
        seekBar2.setOnSeekBarChangeListener(new C30706OooOoO0(textView2));
        seekBar3.setOnSeekBarChangeListener(new C30705OooOoO(textView3, debugFragment));
        AlertDialog alertDialogCreate = new AlertDialog.Builder(debugFragment.requireContext()).setTitle(R.string.debug_pen_stroke_settings).setView(viewInflate).setPositiveButton(R.string.debug_apply, new DialogInterface.OnClickListener() { // from class: o0o0OoOO.OooOO0O
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o3 = DebugFragment.f79020Oooo0OO;
                StrokeMapper.Companion companion = StrokeMapper.INSTANCE;
                companion.setDefaultParallelism(seekBar.getProgress() + 1);
                C31225OooO00o.f111349OooO00o = (seekBar2.getProgress() + 1) / 10.0f;
                C25927OooOo.f88498OooOO0o = switchCompat2.isChecked();
                int progress = seekBar3.getProgress();
                boolean zIsChecked = switchCompat.isChecked();
                DebugFragment debugFragment2 = debugFragment;
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(debugFragment2), null, null, new C30707OooOoOO(debugFragment2, zIsChecked, progress, null), 3);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("DebugFragment");
                c20358OooO00o.OooO0o0("Pen debug settings applied: disableInkPen=%s, parallelism=%d, kFactor=%.1f, samplingRate=%d", Boolean.valueOf(zIsChecked), Integer.valueOf(companion.getDefaultParallelism()), Float.valueOf(C31225OooO00o.f111349OooO00o), Integer.valueOf(progress));
                Context context = debugFragment2.getContext();
                if (context != null) {
                    String string = debugFragment2.getString(R.string.debug_updated);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context, string);
                }
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.layout_bg_color);
        }
        alertDialogCreate.show();
        return C32460OooOooO.f116667OooO00o;
    }
}
