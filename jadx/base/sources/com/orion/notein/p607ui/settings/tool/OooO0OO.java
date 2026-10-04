package com.orion.notein.p607ui.settings.tool;

import android.widget.SeekBar;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o0OoOo0;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.p607ui.settings.tool.ToolSettingsFragment;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30645Oooo0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Integer f79364OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ToolSettingsFragment.OooO0O0 f79365OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ ToolSettingsFragment f79366OooO0OO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$setupPressureCard$2$onStopTrackingTouch$1", m80623f = "ToolSettingsFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_4}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ ToolSettingsFragment f79367OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79368OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ ToolSettingsFragment.OooO0O0 f79369OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f79370OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ SeekBar f79371OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ToolSettingsFragment toolSettingsFragment, OooO0OO oooO0OO, ToolSettingsFragment.OooO0O0 oooO0O0, SeekBar seekBar, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f79367OooOo = toolSettingsFragment;
            this.f79370OooOoO0 = oooO0OO;
            this.f79369OooOoO = oooO0O0;
            this.f79371OooOoOO = seekBar;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f79367OooOo, this.f79370OooOoO0, this.f79369OooOoO, this.f79371OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79368OooOo0o;
            ToolSettingsFragment toolSettingsFragment = this.f79367OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f79368OooOo0o = 1;
                obj = ToolSettingsFragment.OooOoO(toolSettingsFragment, 45, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Integer num = this.f79370OooOoO0.f79364OooO00o;
            if (!zBooleanValue || num == null) {
                C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30623OooOOOOOooOoo0), null, null, new C30645Oooo0OO(c30623OooOOOOOooOoo0, this.f79371OooOoOO.getProgress() / 100.0f, null), 3);
            } else {
                ToolSettingsFragment.OooO0O0 oooO0O0 = this.f79369OooOoO;
                oooO0O0.f79392OooO0OO.setProgress(num.intValue());
                oooO0O0.f79393OooO0Oo.setText(ToolSettingsFragment.OooOoOO(num.intValue()));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public OooO0OO(ToolSettingsFragment.OooO0O0 oooO0O0, ToolSettingsFragment toolSettingsFragment) {
        this.f79365OooO0O0 = oooO0O0;
        this.f79366OooO0OO = toolSettingsFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f79365OooO0O0.f79393OooO0Oo.setText(ToolSettingsFragment.OooOoOO(i));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        OooOOO0.OooO0oO(seekBar, "seekBar");
        this.f79366OooO0OO.f79374OooOooO = true;
        this.f79364OooO00o = Integer.valueOf(seekBar.getProgress());
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        OooOOO0.OooO0oO(seekBar, "seekBar");
        ToolSettingsFragment toolSettingsFragment = this.f79366OooO0OO;
        toolSettingsFragment.f79374OooOooO = false;
        InterfaceC21987OooOoo viewLifecycleOwner = toolSettingsFragment.getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(toolSettingsFragment, this, this.f79365OooO0O0, seekBar, null), 3);
    }
}
