package o0o0O00O;

import android.widget.TextView;
import androidx.core.view.InputDeviceCompat;
import com.orion.notein.domain.models.Label;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.label.LabelContainerFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0o0O00.C30185OooO00o;
import o0o0O00.C30207OooOo;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o0O00O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelContainerFragment$initActionBar$1", m80623f = "LabelContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30235OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LabelContainerFragment f107721OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f107722OooOo0o;

    /* JADX INFO: renamed from: o0o0O00O.OooO0Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelContainerFragment$initActionBar$1$1", m80623f = "LabelContainerFragment.kt", m80624l = {464}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ LabelContainerFragment f107723OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107724OooOo0o;

        /* JADX INFO: renamed from: o0o0O00O.OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20052OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ LabelContainerFragment f107725OooOo0o;

            public C20052OooO00o(LabelContainerFragment labelContainerFragment) {
                this.f107725OooOo0o = labelContainerFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                if (((Label) obj) != null) {
                    LabelContainerFragment labelContainerFragment = this.f107725OooOo0o;
                    C30185OooO00o c30185OooO00o = labelContainerFragment.f77706OooOooo;
                    if (c30185OooO00o == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("actionBarInitializer");
                        throw null;
                    }
                    c30185OooO00o.OooO00o(R.id.btn_creative_library).setVisibility(8);
                    C30185OooO00o c30185OooO00o2 = labelContainerFragment.f77706OooOooo;
                    if (c30185OooO00o2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("actionBarInitializer");
                        throw null;
                    }
                    ((TextView) c30185OooO00o2.OooO00o(R.id.current_folder_name)).setText(LabelContainerFragment.OooOoOO(labelContainerFragment));
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(LabelContainerFragment labelContainerFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f107723OooOo = labelContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f107723OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107724OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                LabelContainerFragment labelContainerFragment = this.f107723OooOo;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = labelContainerFragment.OooOoo();
                C20052OooO00o c20052OooO00o = new C20052OooO00o(labelContainerFragment);
                this.f107724OooOo0o = 1;
                if (oooO0OOOooOoo.f77154Oooo0OO.f121747OooOo0o.collect(c20052OooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            throw new C32438OooO0oO();
        }
    }

    /* JADX INFO: renamed from: o0o0O00O.OooO0Oo$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelContainerFragment$initActionBar$1$2", m80623f = "LabelContainerFragment.kt", m80624l = {475}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ LabelContainerFragment f107726OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107727OooOo0o;

        /* JADX INFO: renamed from: o0o0O00O.OooO0Oo$OooO0O0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ LabelContainerFragment f107728OooOo0o;

            public OooO00o(LabelContainerFragment labelContainerFragment) {
                this.f107728OooOo0o = labelContainerFragment;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
                NoteVO noteVO = (NoteVO) c32443OooOOO.f116638OooOo0o;
                NoteVO noteVO2 = (NoteVO) c32443OooOOO.f116637OooOo;
                LabelContainerFragment labelContainerFragment = this.f107728OooOo0o;
                C30185OooO00o c30185OooO00o = labelContainerFragment.f77706OooOooo;
                if (c30185OooO00o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("actionBarInitializer");
                    throw null;
                }
                c30185OooO00o.OooO0OO(noteVO, noteVO2);
                if (noteVO == null) {
                    C30185OooO00o c30185OooO00o2 = labelContainerFragment.f77706OooOooo;
                    if (c30185OooO00o2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("actionBarInitializer");
                        throw null;
                    }
                    ((TextView) c30185OooO00o2.OooO00o(R.id.current_folder_name)).setText(LabelContainerFragment.OooOoOO(labelContainerFragment));
                } else if (noteVO2 == null) {
                    C30185OooO00o c30185OooO00o3 = labelContainerFragment.f77706OooOooo;
                    if (c30185OooO00o3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("actionBarInitializer");
                        throw null;
                    }
                    ((TextView) c30185OooO00o3.OooO00o(R.id.parent_folder_name)).setText(LabelContainerFragment.OooOoOO(labelContainerFragment));
                }
                C30207OooOo c30207OooOo = labelContainerFragment.f77710Oooo00O;
                if (c30207OooOo == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("fabInitializer");
                    throw null;
                }
                c30207OooOo.OooO0OO(R.id.fab_add, noteVO != null);
                C30207OooOo c30207OooOo2 = labelContainerFragment.f77710Oooo00O;
                if (c30207OooOo2 != null) {
                    c30207OooOo2.OooO0OO(R.id.fab_create_scratch, noteVO != null);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("fabInitializer");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(LabelContainerFragment labelContainerFragment, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f107726OooOo = labelContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f107726OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107727OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw androidx.transition.OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            LabelContainerFragment labelContainerFragment = this.f107726OooOo;
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = labelContainerFragment.OooOoo();
            OooO00o oooO00o = new OooO00o(labelContainerFragment);
            this.f107727OooOo0o = 1;
            oooO0OOOooOoo.f77161OoooO00.collect(oooO00o, this);
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o0O00O.OooO0Oo$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelContainerFragment$initActionBar$1$3", m80623f = "LabelContainerFragment.kt", m80624l = {497}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ LabelContainerFragment f107729OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107730OooOo0o;

        /* JADX INFO: renamed from: o0o0O00O.OooO0Oo$OooO0OO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ LabelContainerFragment f107731OooOo0o;

            public OooO00o(LabelContainerFragment labelContainerFragment) {
                this.f107731OooOo0o = labelContainerFragment;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                Folder folder = (Folder) obj;
                LabelContainerFragment labelContainerFragment = this.f107731OooOo0o;
                NoteVO noteVO = (NoteVO) ((C32443OooOOO) labelContainerFragment.OooOoo().f77161OoooO00.getValue()).f116637OooOo;
                NoteVO noteVOCopy$default = null;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO != null ? noteVO.getId() : null, folder != null ? folder.getId() : null)) {
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO != null ? noteVO.getName() : null, folder != null ? folder.getTitle() : null)) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
                NoteVO noteVO2 = (NoteVO) ((C32443OooOOO) labelContainerFragment.OooOoo().f77161OoooO00.getValue()).f116638OooOo0o;
                if (noteVO2 != null) {
                    noteVOCopy$default = NoteVO.copy$default(noteVO2, null, null, null, null, folder != null ? folder.getId() : null, null, 0, 0, null, false, 0L, 0L, false, false, false, 0, 0, null, null, null, null, null, null, 0, null, false, false, 0L, false, null, false, 2147483631, null);
                }
                Object objOooOoO0 = labelContainerFragment.OooOoo().OooOoO0(noteVOCopy$default, continuation);
                return objOooOoO0 == EnumC32485OooO00o.f116726OooOo0o ? objOooOoO0 : C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(LabelContainerFragment labelContainerFragment, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f107729OooOo = labelContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f107729OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107730OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                LabelContainerFragment labelContainerFragment = this.f107729OooOo;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = labelContainerFragment.OooOoo();
                OooO00o oooO00o = new OooO00o(labelContainerFragment);
                this.f107730OooOo0o = 1;
                if (oooO0OOOooOoo.f77160OoooO0.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            throw new C32438OooO0oO();
        }
    }

    /* JADX INFO: renamed from: o0o0O00O.OooO0Oo$OooO0Oo, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelContainerFragment$initActionBar$1$4", m80623f = "LabelContainerFragment.kt", m80624l = {507}, m80625m = "invokeSuspend")
    public static final class C20053OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ LabelContainerFragment f107732OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107733OooOo0o;

        /* JADX INFO: renamed from: o0o0O00O.OooO0Oo$OooO0Oo$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ LabelContainerFragment f107734OooOo0o;

            public OooO00o(LabelContainerFragment labelContainerFragment) {
                this.f107734OooOo0o = labelContainerFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                C30185OooO00o c30185OooO00o = this.f107734OooOo0o.f77706OooOooo;
                if (c30185OooO00o != null) {
                    c30185OooO00o.OooO0Oo(iIntValue);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("actionBarInitializer");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20053OooO0Oo(LabelContainerFragment labelContainerFragment, Continuation<? super C20053OooO0Oo> continuation) {
            super(2, continuation);
            this.f107732OooOo = labelContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C20053OooO0Oo(this.f107732OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((C20053OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107733OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw androidx.transition.OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            LabelContainerFragment labelContainerFragment = this.f107732OooOo;
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = labelContainerFragment.OooOoo();
            OooO00o oooO00o = new OooO00o(labelContainerFragment);
            this.f107733OooOo0o = 1;
            oooO0OOOooOoo.f77147OooOooo.collect(oooO00o, this);
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o0O00O.OooO0Oo$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelContainerFragment$initActionBar$1$5", m80623f = "LabelContainerFragment.kt", m80624l = {InputDeviceCompat.SOURCE_DPAD}, m80625m = "invokeSuspend")
    public static final class C30236OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ LabelContainerFragment f107735OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107736OooOo0o;

        /* JADX INFO: renamed from: o0o0O00O.OooO0Oo$OooO0o0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ LabelContainerFragment f107737OooOo0o;

            public OooO00o(LabelContainerFragment labelContainerFragment) {
                this.f107737OooOo0o = labelContainerFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                List<NoteVO> list = (List) obj;
                C30185OooO00o c30185OooO00o = this.f107737OooOo0o.f77706OooOooo;
                if (c30185OooO00o != null) {
                    c30185OooO00o.OooO0o0(list);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("actionBarInitializer");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30236OooO0o0(LabelContainerFragment labelContainerFragment, Continuation<? super C30236OooO0o0> continuation) {
            super(2, continuation);
            this.f107735OooOo = labelContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C30236OooO0o0(this.f107735OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((C30236OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107736OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                LabelContainerFragment labelContainerFragment = this.f107735OooOo;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = labelContainerFragment.OooOoo();
                OooO00o oooO00o = new OooO00o(labelContainerFragment);
                this.f107736OooOo0o = 1;
                if (oooO0OOOooOoo.f77172OooooOO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            throw new C32438OooO0oO();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30235OooO0Oo(LabelContainerFragment labelContainerFragment, Continuation<? super C30235OooO0Oo> continuation) {
        super(2, continuation);
        this.f107721OooOo = labelContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30235OooO0Oo c30235OooO0Oo = new C30235OooO0Oo(this.f107721OooOo, continuation);
        c30235OooO0Oo.f107722OooOo0o = obj;
        return c30235OooO0Oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30235OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f107722OooOo0o;
        LabelContainerFragment labelContainerFragment = this.f107721OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(labelContainerFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(labelContainerFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(labelContainerFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C20053OooO0Oo(labelContainerFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C30236OooO0o0(labelContainerFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
