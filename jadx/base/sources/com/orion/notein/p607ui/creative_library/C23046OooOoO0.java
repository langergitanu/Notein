package com.orion.notein.p607ui.creative_library;

import OooO0o.C20424OooO0Oo;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.C23047OooOoOO;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0OOOoO.C27188OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreatorProfileFragment$observeState$1", m80623f = "CreatorProfileFragment.kt", m80624l = {102}, m80625m = "invokeSuspend")
public final class C23046OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ CreatorProfileFragment f71185OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71186OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOoO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreatorProfileFragment$observeState$1$1", m80623f = "CreatorProfileFragment.kt", m80624l = {103}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ CreatorProfileFragment f71187OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71188OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOoO0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreatorProfileFragment$observeState$1$1$1", m80623f = "CreatorProfileFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19182OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C23047OooOoOO.OooO0OO, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CreatorProfileFragment f71189OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f71190OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19182OooO00o(CreatorProfileFragment creatorProfileFragment, Continuation<? super C19182OooO00o> continuation) {
                super(2, continuation);
                this.f71189OooOo = creatorProfileFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19182OooO00o c19182OooO00o = new C19182OooO00o(this.f71189OooOo, continuation);
                c19182OooO00o.f71190OooOo0o = obj;
                return c19182OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C23047OooOoOO.OooO0OO oooO0OO, Continuation<? super C32460OooOooO> continuation) {
                return ((C19182OooO00o) create(oooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C23047OooOoOO.OooO0OO oooO0OO = (C23047OooOoOO.OooO0OO) this.f71190OooOo0o;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CreatorProfileFragment");
                String str = oooO0OO.f71219OooO0O0;
                List<C23047OooOoOO.OooO00o> list = oooO0OO.f71222OooO0o;
                int size = list.size();
                StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("observeState: name=", str, ", materialCount=");
                int i = oooO0OO.f71223OooO0o0;
                sbOooO0o0.append(i);
                sbOooO0o0.append(", items=");
                sbOooO0o0.append(size);
                c20358OooO00o.OooO00o(sbOooO0o0.toString(), new Object[0]);
                CreatorProfileFragment creatorProfileFragment = this.f71189OooOo;
                C27188OooO0Oo c27188OooO0Oo = creatorProfileFragment.f70899OooOoo0;
                OooOOO0.OooO0Oo(c27188OooO0Oo);
                c27188OooO0Oo.f94946OooO0o0.setText(oooO0OO.f71219OooO0O0);
                C27188OooO0Oo c27188OooO0Oo2 = creatorProfileFragment.f70899OooOoo0;
                OooOOO0.OooO0Oo(c27188OooO0Oo2);
                c27188OooO0Oo2.f94944OooO0Oo.setText(oooO0OO.f71220OooO0OO);
                C27188OooO0Oo c27188OooO0Oo3 = creatorProfileFragment.f70899OooOoo0;
                OooOOO0.OooO0Oo(c27188OooO0Oo3);
                c27188OooO0Oo3.f94945OooO0o.setText(i > 0 ? creatorProfileFragment.getString(R.string.creative_library_material_count, new Integer(i)) : "");
                List<C23047OooOoOO.OooO00o> list2 = list;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                for (C23047OooOoOO.OooO00o oooO00o : list2) {
                    arrayList.add(new C23033OooOO0o.OooO00o(oooO00o.f71204OooO00o, oooO00o.f71205OooO0O0, oooO00o.f71206OooO0OO, oooO00o.f71207OooO0Oo, oooO00o.f71209OooO0o0, oooO00o.f71208OooO0o, MaterialActionType.DOWNLOAD, oooO00o.f71210OooO0oO, true, oooO00o.f71211OooO0oo, oooO00o.f71203OooO, oooO00o.f71212OooOO0));
                }
                com.orion.notein.p607ui.creative_library.OooO00o oooO00o2 = creatorProfileFragment.f70901OooOooo;
                if (oooO00o2 != null) {
                    oooO00o2.OooO0Oo(arrayList);
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("adapter");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CreatorProfileFragment creatorProfileFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f71187OooOo = creatorProfileFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f71187OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71188OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                CreatorProfileFragment creatorProfileFragment = this.f71187OooOo;
                C23047OooOoOO c23047OooOoOOOooOoOO = creatorProfileFragment.OooOoOO();
                C19182OooO00o c19182OooO00o = new C19182OooO00o(creatorProfileFragment, null);
                this.f71188OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c23047OooOoOOOooOoOO.f71202OooOOOO, c19182OooO00o, this) == enumC32485OooO00o) {
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
    public C23046OooOoO0(CreatorProfileFragment creatorProfileFragment, Continuation<? super C23046OooOoO0> continuation) {
        super(2, continuation);
        this.f71185OooOo = creatorProfileFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23046OooOoO0(this.f71185OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23046OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71186OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            CreatorProfileFragment creatorProfileFragment = this.f71185OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = creatorProfileFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(creatorProfileFragment, null);
            this.f71186OooOo0o = 1;
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
