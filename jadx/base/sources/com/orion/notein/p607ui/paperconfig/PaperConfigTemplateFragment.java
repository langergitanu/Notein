package com.orion.notein.p607ui.paperconfig;

import OooOoOO.C20519OooO0Oo;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.niui.components.button.SelectableTextButtonView;
import com.orion.notein.MainActivity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0o0o.ViewOnClickListenerC28243OooOo0O;
import o0Oo0o0o.ViewOnClickListenerC28244OooOo0o;
import o0OoOOOo.C29097OooO0o;
import o0OoOOOo.ViewOnClickListenerC29099OooO0oO;
import o0o0OOO.C30520o000000o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/paperconfig/PaperConfigTemplateFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class PaperConfigTemplateFragment extends Fragment {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C32447OooOOo f78669OooOo0o = C20519OooO0Oo.OooO0OO(new C29097OooO0o(this, 1));

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigTemplateFragment$checkVipAndExecute$1", m80623f = "PaperConfigTemplateFragment.kt", m80624l = {39}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78671OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ oO0O000o.OooO00o<C32460OooOooO> f78672OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f78673OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, oO0O000o.OooO00o<C32460OooOooO> oooO00o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f78673OooOoO0 = i;
            this.f78672OooOoO = oooO00o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return PaperConfigTemplateFragment.this.new OooO00o(this.f78673OooOoO0, this.f78672OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            OooO00o oooO00o;
            boolean zBooleanValue;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78671OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ActivityC21897OooOo0 activity = PaperConfigTemplateFragment.this.getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity == null) {
                    oooO00o = this;
                    zBooleanValue = false;
                    if (!zBooleanValue) {
                        oooO00o.f78672OooOoO.invoke();
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                this.f78671OooOo0o = 1;
                oooO00o = this;
                obj = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, this.f78673OooOoO0, 0, null, oooO00o, 6, null);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                oooO00o = this;
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (!zBooleanValue) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public abstract SelectableTextButtonView OooOoO();

    public final void OooOoO0(int i, oO0O000o.OooO00o<C32460OooOooO> oooO00o) {
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(i, oooO00o, null), 3);
    }

    public abstract SelectableTextButtonView OooOoOO();

    public abstract SelectableTextButtonView OooOoo();

    public abstract SelectableTextButtonView OooOoo0();

    public abstract SelectableTextButtonView OooOooO();

    public final C30520o000000o OooOooo() {
        return (C30520o000000o) this.f78669OooOo0o.getValue();
    }

    public final void Oooo000() {
        SelectableTextButtonView selectableTextButtonViewOooOoOO = OooOoOO();
        if (selectableTextButtonViewOooOoOO != null) {
            selectableTextButtonViewOooOoOO.setOnClickListener(new ViewOnClickListenerC29099OooO0oO(this, 3));
        }
        SelectableTextButtonView selectableTextButtonViewOooOoo0 = OooOoo0();
        if (selectableTextButtonViewOooOoo0 != null) {
            selectableTextButtonViewOooOoo0.setOnClickListener(new ViewOnClickListenerC28243OooOo0O(this, 4));
        }
        SelectableTextButtonView selectableTextButtonViewOooOoO = OooOoO();
        if (selectableTextButtonViewOooOoO != null) {
            selectableTextButtonViewOooOoO.setOnClickListener(new ViewOnClickListenerC28244OooOo0o(this, 6));
        }
    }
}
