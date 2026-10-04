package com.orion.notein.p607ui.settings.assistlineandshapes;

import android.widget.SeekBar;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.settings.assistlineandshapes.ToolAssistLineAndShapesFragment;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30646Oooo0o;
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

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Integer f78990OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ToolAssistLineAndShapesFragment f78991OooO0O0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.assistlineandshapes.ToolAssistLineAndShapesFragment$initRows$7$onStopTrackingTouch$1", m80623f = "ToolAssistLineAndShapesFragment.kt", m80624l = {140}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ ToolAssistLineAndShapesFragment f78992OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78993OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ SeekBar f78994OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f78995OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment, OooO0O0 oooO0O0, SeekBar seekBar, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f78992OooOo = toolAssistLineAndShapesFragment;
            this.f78995OooOoO0 = oooO0O0;
            this.f78994OooOoO = seekBar;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f78992OooOo, this.f78995OooOoO0, this.f78994OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78993OooOo0o;
            ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment = this.f78992OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f78993OooOo0o = 1;
                obj = ToolAssistLineAndShapesFragment.OooOoO(toolAssistLineAndShapesFragment, 26, this);
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
            Integer num = this.f78995OooOoO0.f78990OooO00o;
            SeekBar seekBar = this.f78994OooOoO;
            if (!zBooleanValue || num == null) {
                C30623OooOOOO c30623OooOOOOOooOoOO = toolAssistLineAndShapesFragment.OooOoOO();
                float progress = seekBar.getProgress() / 100.0f;
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOOOooOoOO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30646Oooo0o(c30623OooOOOOOooOoOO, progress, null), 2);
            } else {
                seekBar.setProgress(num.intValue());
                ToolAssistLineAndShapesFragment.OooO00o oooO00o = toolAssistLineAndShapesFragment.f79004Oooo0O0;
                if (oooO00o == null) {
                    OooOOO0.OooOOOO("fillOpacityRow");
                    throw null;
                }
                oooO00o.OooO0O0(num.intValue());
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public OooO0O0(ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment) {
        this.f78991OooO0O0 = toolAssistLineAndShapesFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        ToolAssistLineAndShapesFragment.OooO00o oooO00o = this.f78991OooO0O0.f79004Oooo0O0;
        if (oooO00o != null) {
            oooO00o.OooO0O0(i);
        } else {
            OooOOO0.OooOOOO("fillOpacityRow");
            throw null;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        OooOOO0.OooO0oO(seekBar, "seekBar");
        ToolAssistLineAndShapesFragment.OooO00o oooO00o = this.f78991OooO0O0.f79004Oooo0O0;
        if (oooO00o == null) {
            OooOOO0.OooOOOO("fillOpacityRow");
            throw null;
        }
        oooO00o.f79011OooO0o0 = true;
        this.f78990OooO00o = Integer.valueOf(seekBar.getProgress());
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        OooOOO0.OooO0oO(seekBar, "seekBar");
        ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment = this.f78991OooO0O0;
        ToolAssistLineAndShapesFragment.OooO00o oooO00o = toolAssistLineAndShapesFragment.f79004Oooo0O0;
        if (oooO00o == null) {
            OooOOO0.OooOOOO("fillOpacityRow");
            throw null;
        }
        oooO00o.f79011OooO0o0 = false;
        InterfaceC21987OooOoo viewLifecycleOwner = toolAssistLineAndShapesFragment.getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(toolAssistLineAndShapesFragment, this, seekBar, null), 3);
    }
}
