package com.orion.notein.p607ui.creative_library;

import Oooo0.C20855OooooOO;
import android.content.Context;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.p607ui.creative_library.C23028OooO0Oo;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0O0oOoo.EnumC26187OoooOOo;
import o0Oo0oOo.o00000;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryDetailFragment$observeState$1", m80623f = "CreativeLibraryDetailFragment.kt", m80624l = {169}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ CreativeLibraryDetailFragment f70991OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70992OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryDetailFragment$observeState$1$1", m80623f = "CreativeLibraryDetailFragment.kt", m80624l = {170}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ CreativeLibraryDetailFragment f70993OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f70994OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryDetailFragment$observeState$1$1$1", m80623f = "CreativeLibraryDetailFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19172OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C23028OooO0Oo.C19176OooO0Oo, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CreativeLibraryDetailFragment f70995OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f70996OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19172OooO00o(CreativeLibraryDetailFragment creativeLibraryDetailFragment, Continuation<? super C19172OooO00o> continuation) {
                super(2, continuation);
                this.f70995OooOo = creativeLibraryDetailFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19172OooO00o c19172OooO00o = new C19172OooO00o(this.f70995OooOo, continuation);
                c19172OooO00o.f70996OooOo0o = obj;
                return c19172OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C23028OooO0Oo.C19176OooO0Oo c19176OooO0Oo, Continuation<? super C32460OooOooO> continuation) {
                return ((C19172OooO00o) create(c19176OooO0Oo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C23028OooO0Oo.C19176OooO0Oo c19176OooO0Oo = (C23028OooO0Oo.C19176OooO0Oo) this.f70996OooOo0o;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CreativeLibraryDetailFragment");
                int size = c19176OooO0Oo.f71029OooO0OO.size();
                CreativeLibraryDetailFragment creativeLibraryDetailFragment = this.f70995OooOo;
                o0OOOoO.OooO0O0 oooO0O0 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O0);
                c20358OooO00o.OooO00o(C20855OooooOO.OooO0OO(size, oooO0O0.f94916OooO0o.getScrollX(), "observeState: previewCount=", ", recyclerView.scrollX="), new Object[0]);
                OooOo oooOo = creativeLibraryDetailFragment.f70837OooOooo;
                if (oooOo == null) {
                    OooOOO0.OooOOOO("previewAdapter");
                    throw null;
                }
                oooOo.OooO0Oo(c19176OooO0Oo.f71029OooO0OO);
                o0OOOoO.OooO0O0 oooO0O02 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O02);
                oooO0O02.f94935OooOoO0.setText(c19176OooO0Oo.f71030OooO0Oo);
                o0OOOoO.OooO0O0 oooO0O03 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O03);
                oooO0O03.f94934OooOo0o.setText(c19176OooO0Oo.f71032OooO0o0);
                String str = c19176OooO0Oo.f71031OooO0o;
                boolean z = true;
                boolean z2 = str.length() > 0;
                String str2 = c19176OooO0Oo.f71034OooO0oo;
                boolean z3 = str2.length() > 0;
                String str3 = c19176OooO0Oo.f71035OooOO0;
                boolean z4 = str3.length() > 0;
                o0OOOoO.OooO0O0 oooO0O04 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O04);
                oooO0O04.f94921OooOO0O.setVisibility(z2 ? 0 : 8);
                o0OOOoO.OooO0O0 oooO0O05 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O05);
                oooO0O05.f94922OooOO0o.setText(z2 ? str.concat(": ") : "");
                o0OOOoO.OooO0O0 oooO0O06 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O06);
                oooO0O06.f94924OooOOO0.setText(c19176OooO0Oo.f71033OooO0oO);
                o0OOOoO.OooO0O0 oooO0O07 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O07);
                oooO0O07.f94911OooO.setVisibility((z2 && z3) ? 0 : 8);
                o0OOOoO.OooO0O0 oooO0O08 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O08);
                oooO0O08.f94923OooOOO.setVisibility(z3 ? 0 : 8);
                o0OOOoO.OooO0O0 oooO0O09 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O09);
                oooO0O09.f94925OooOOOO.setText(z3 ? str2.concat(": ") : "");
                o0OOOoO.OooO0O0 oooO0O010 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O010);
                oooO0O010.f94926OooOOOo.setText(c19176OooO0Oo.f71026OooO);
                o0OOOoO.OooO0O0 oooO0O011 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O011);
                oooO0O011.f94920OooOO0.setVisibility((z3 && z4) ? 0 : 8);
                o0OOOoO.OooO0O0 oooO0O012 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O012);
                oooO0O012.f94928OooOOo0.setVisibility(z4 ? 0 : 8);
                o0OOOoO.OooO0O0 oooO0O013 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O013);
                oooO0O013.f94927OooOOo.setText(z4 ? str3.concat(": ") : "");
                o0OOOoO.OooO0O0 oooO0O014 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O014);
                oooO0O014.f94929OooOOoo.setText(c19176OooO0Oo.f71036OooOO0O);
                o0OOOoO.OooO0O0 oooO0O015 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O015);
                oooO0O015.f94933OooOo0O.setText(c19176OooO0Oo.f71039OooOOO0);
                o0OOOoO.OooO0O0 oooO0O016 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O016);
                oooO0O016.f94931OooOo0.setText(c19176OooO0Oo.f71038OooOOO);
                o0OOOoO.OooO0O0 oooO0O017 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O017);
                Context contextRequireContext = creativeLibraryDetailFragment.requireContext();
                OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                MaterialActionType materialActionType = c19176OooO0Oo.f71040OooOOOO;
                oooO0O017.f94913OooO0O0.setText(o00000.OooO00o(contextRequireContext, materialActionType));
                o0OOOoO.OooO0O0 oooO0O018 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O018);
                if (c19176OooO0Oo.f71043OooOOo0 && materialActionType != MaterialActionType.GO_TO_CREATE) {
                    z = false;
                }
                oooO0O018.f94913OooO0O0.setEnabled(z);
                EnumC26187OoooOOo enumC26187OoooOOo = materialActionType == MaterialActionType.GO_TO_CREATE ? EnumC26187OoooOOo.f89410OooOoO0 : EnumC26187OoooOOo.f89408OooOo0o;
                o0OOOoO.OooO0O0 oooO0O019 = creativeLibraryDetailFragment.f70835OooOoo0;
                OooOOO0.OooO0Oo(oooO0O019);
                oooO0O019.f94913OooO0O0.setVariant(enumC26187OoooOOo);
                List<C23033OooOO0o.OooO00o> list = c19176OooO0Oo.f71042OooOOo;
                if (list.isEmpty()) {
                    o0OOOoO.OooO0O0 oooO0O020 = creativeLibraryDetailFragment.f70835OooOoo0;
                    OooOOO0.OooO0Oo(oooO0O020);
                    oooO0O020.f94918OooO0oO.setVisibility(8);
                } else {
                    o0OOOoO.OooO0O0 oooO0O021 = creativeLibraryDetailFragment.f70835OooOoo0;
                    OooOOO0.OooO0Oo(oooO0O021);
                    oooO0O021.f94918OooO0oO.setVisibility(0);
                    C23059Oooo0oO c23059Oooo0oO = creativeLibraryDetailFragment.f70839Oooo000;
                    if (c23059Oooo0oO == null) {
                        OooOOO0.OooOOOO("recommendationsAdapter");
                        throw null;
                    }
                    c23059Oooo0oO.OooO0Oo(list);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CreativeLibraryDetailFragment creativeLibraryDetailFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f70993OooOo = creativeLibraryDetailFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f70993OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f70994OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                CreativeLibraryDetailFragment creativeLibraryDetailFragment = this.f70993OooOo;
                C23028OooO0Oo c23028OooO0OoOooOoOO = creativeLibraryDetailFragment.OooOoOO();
                C19172OooO00o c19172OooO00o = new C19172OooO00o(creativeLibraryDetailFragment, null);
                this.f70994OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c23028OooO0OoOooOoOO.f71011OooOO0O, c19172OooO00o, this) == enumC32485OooO00o) {
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
    public OooO0O0(CreativeLibraryDetailFragment creativeLibraryDetailFragment, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f70991OooOo = creativeLibraryDetailFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0O0(this.f70991OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70992OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            CreativeLibraryDetailFragment creativeLibraryDetailFragment = this.f70991OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = creativeLibraryDetailFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(creativeLibraryDetailFragment, null);
            this.f70992OooOo0o = 1;
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
