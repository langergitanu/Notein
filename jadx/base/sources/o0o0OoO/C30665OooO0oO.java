package o0o0OoO;

import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.niui.components.listitems.SwitchListItemView;
import com.orion.notein.App;
import com.orion.notein.p607ui.settings.assistlineandshapes.ToolAssistLineAndShapesFragment;
import com.orion.penkit.models.AnchorAssistAware;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0OoOO00.C29031OoooOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: renamed from: o0o0OoO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.assistlineandshapes.ToolAssistLineAndShapesFragment$bindState$2", m80623f = "ToolAssistLineAndShapesFragment.kt", m80624l = {192}, m80625m = "invokeSuspend")
public final class C30665OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ToolAssistLineAndShapesFragment f109710OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109711OooOo0o;

    /* JADX INFO: renamed from: o0o0OoO.OooO0oO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.assistlineandshapes.ToolAssistLineAndShapesFragment$bindState$2$1", m80623f = "ToolAssistLineAndShapesFragment.kt", m80624l = {193}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ ToolAssistLineAndShapesFragment f109712OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f109713OooOo0o;

        /* JADX INFO: renamed from: o0o0OoO.OooO0oO$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.assistlineandshapes.ToolAssistLineAndShapesFragment$bindState$2$1$1", m80623f = "ToolAssistLineAndShapesFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C20119OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC24338OooO0o0, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ToolAssistLineAndShapesFragment f109714OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f109715OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20119OooO00o(ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment, Continuation<? super C20119OooO00o> continuation) {
                super(2, continuation);
                this.f109714OooOo = toolAssistLineAndShapesFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C20119OooO00o c20119OooO00o = new C20119OooO00o(this.f109714OooOo, continuation);
                c20119OooO00o.f109715OooOo0o = obj;
                return c20119OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(AbstractC24338OooO0o0 abstractC24338OooO0o0, Continuation<? super C32460OooOooO> continuation) {
                return ((C20119OooO00o) create(abstractC24338OooO0o0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                AbstractC24338OooO0o0 abstractC24338OooO0o0 = (AbstractC24338OooO0o0) this.f109715OooOo0o;
                Boolean bool = (Boolean) abstractC24338OooO0o0.OooO0OO(App.f69574OoooooO);
                boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                Boolean bool2 = (Boolean) abstractC24338OooO0o0.OooO0OO(App.f69575Ooooooo);
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
                Boolean bool3 = (Boolean) abstractC24338OooO0o0.OooO0OO(App.f69598o0OoOo0);
                boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : true;
                AnchorAssistAware.Companion companion = AnchorAssistAware.INSTANCE;
                companion.setEnableAssistLine(zBooleanValue);
                companion.setEnableAssistLineMagneticAttraction(zBooleanValue2);
                C29031OoooOO0.f102846OooO0OO = zBooleanValue3;
                ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment = this.f109714OooOo;
                SwitchListItemView switchListItemView = toolAssistLineAndShapesFragment.f78999OooOooo;
                if (switchListItemView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("showGuidesToggle");
                    throw null;
                }
                if (switchListItemView.OooO() != zBooleanValue) {
                    SwitchListItemView switchListItemView2 = toolAssistLineAndShapesFragment.f78999OooOooo;
                    if (switchListItemView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("showGuidesToggle");
                        throw null;
                    }
                    switchListItemView2.setChecked(zBooleanValue);
                }
                SwitchListItemView switchListItemView3 = toolAssistLineAndShapesFragment.f79001Oooo000;
                if (switchListItemView3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("alignmentToggle");
                    throw null;
                }
                if (switchListItemView3.OooO() != zBooleanValue2) {
                    SwitchListItemView switchListItemView4 = toolAssistLineAndShapesFragment.f79001Oooo000;
                    if (switchListItemView4 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("alignmentToggle");
                        throw null;
                    }
                    switchListItemView4.setChecked(zBooleanValue2);
                }
                SwitchListItemView switchListItemView5 = toolAssistLineAndShapesFragment.f79002Oooo00O;
                if (switchListItemView5 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("angleCorrectionToggle");
                    throw null;
                }
                if (switchListItemView5.OooO() != zBooleanValue3) {
                    SwitchListItemView switchListItemView6 = toolAssistLineAndShapesFragment.f79002Oooo00O;
                    if (switchListItemView6 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("angleCorrectionToggle");
                        throw null;
                    }
                    switchListItemView6.setChecked(zBooleanValue3);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f109712OooOo = toolAssistLineAndShapesFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f109712OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f109713OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment = this.f109712OooOo;
                InterfaceC33721OooO0o data = ((o0000o0O.OooOO0) toolAssistLineAndShapesFragment.f78996OooOoo.getValue()).getData();
                C20119OooO00o c20119OooO00o = new C20119OooO00o(toolAssistLineAndShapesFragment, null);
                this.f109713OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(data, c20119OooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30665OooO0oO(ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment, Continuation<? super C30665OooO0oO> continuation) {
        super(2, continuation);
        this.f109710OooOo = toolAssistLineAndShapesFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30665OooO0oO(this.f109710OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30665OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109711OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment = this.f109710OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = toolAssistLineAndShapesFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(toolAssistLineAndShapesFragment, null);
            this.f109711OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(viewLifecycleOwner, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
