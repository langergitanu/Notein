package o0o00ooo;

import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.favorite.FavoriteContainerFragment;
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

/* JADX INFO: renamed from: o0o00ooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$initActionBar$1", m80623f = "FavoriteContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30147OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FavoriteContainerFragment f107297OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f107298OooOo0o;

    /* JADX INFO: renamed from: o0o00ooo.OooO0o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$initActionBar$1$1", m80623f = "FavoriteContainerFragment.kt", m80624l = {443}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ FavoriteContainerFragment f107299OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107300OooOo0o;

        /* JADX INFO: renamed from: o0o00ooo.OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20045OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ FavoriteContainerFragment f107301OooOo0o;

            public C20045OooO00o(FavoriteContainerFragment favoriteContainerFragment) {
                this.f107301OooOo0o = favoriteContainerFragment;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
                NoteVO noteVO = (NoteVO) c32443OooOOO.f116638OooOo0o;
                NoteVO noteVO2 = (NoteVO) c32443OooOOO.f116637OooOo;
                FavoriteContainerFragment favoriteContainerFragment = this.f107301OooOo0o;
                C30185OooO00o c30185OooO00o = favoriteContainerFragment.f77471OooOooO;
                if (c30185OooO00o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("actionBarInitializer");
                    throw null;
                }
                c30185OooO00o.OooO0OO(noteVO, noteVO2);
                C30207OooOo c30207OooOo = favoriteContainerFragment.f77474Oooo000;
                if (c30207OooOo == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("fabInitializer");
                    throw null;
                }
                c30207OooOo.OooO0OO(R.id.fab_add, noteVO != null);
                C30207OooOo c30207OooOo2 = favoriteContainerFragment.f77474Oooo000;
                if (c30207OooOo2 != null) {
                    c30207OooOo2.OooO0OO(R.id.fab_create_scratch, noteVO != null);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("fabInitializer");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FavoriteContainerFragment favoriteContainerFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f107299OooOo = favoriteContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f107299OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107300OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw androidx.transition.OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            FavoriteContainerFragment favoriteContainerFragment = this.f107299OooOo;
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo0 = favoriteContainerFragment.OooOoo0();
            C20045OooO00o c20045OooO00o = new C20045OooO00o(favoriteContainerFragment);
            this.f107300OooOo0o = 1;
            oooO0OOOooOoo0.f77161OoooO00.collect(c20045OooO00o, this);
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o00ooo.OooO0o0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$initActionBar$1$2", m80623f = "FavoriteContainerFragment.kt", m80624l = {455}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ FavoriteContainerFragment f107302OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107303OooOo0o;

        /* JADX INFO: renamed from: o0o00ooo.OooO0o0$OooO0O0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ FavoriteContainerFragment f107304OooOo0o;

            public OooO00o(FavoriteContainerFragment favoriteContainerFragment) {
                this.f107304OooOo0o = favoriteContainerFragment;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                Folder folder = (Folder) obj;
                FavoriteContainerFragment favoriteContainerFragment = this.f107304OooOo0o;
                NoteVO noteVO = (NoteVO) ((C32443OooOOO) favoriteContainerFragment.OooOoo0().f77161OoooO00.getValue()).f116637OooOo;
                NoteVO noteVOCopy$default = null;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO != null ? noteVO.getId() : null, folder != null ? folder.getId() : null)) {
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO != null ? noteVO.getName() : null, folder != null ? folder.getTitle() : null)) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
                NoteVO noteVO2 = (NoteVO) ((C32443OooOOO) favoriteContainerFragment.OooOoo0().f77161OoooO00.getValue()).f116638OooOo0o;
                if (noteVO2 != null) {
                    noteVOCopy$default = NoteVO.copy$default(noteVO2, null, null, null, null, folder != null ? folder.getId() : null, null, 0, 0, null, false, 0L, 0L, false, false, false, 0, 0, null, null, null, null, null, null, 0, null, false, false, 0L, false, null, false, 2147483631, null);
                }
                Object objOooOoO0 = favoriteContainerFragment.OooOoo0().OooOoO0(noteVOCopy$default, continuation);
                return objOooOoO0 == EnumC32485OooO00o.f116726OooOo0o ? objOooOoO0 : C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(FavoriteContainerFragment favoriteContainerFragment, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f107302OooOo = favoriteContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f107302OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107303OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                FavoriteContainerFragment favoriteContainerFragment = this.f107302OooOo;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo0 = favoriteContainerFragment.OooOoo0();
                OooO00o oooO00o = new OooO00o(favoriteContainerFragment);
                this.f107303OooOo0o = 1;
                if (oooO0OOOooOoo0.f77160OoooO0.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o00ooo.OooO0o0$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$initActionBar$1$3", m80623f = "FavoriteContainerFragment.kt", m80624l = {465}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ FavoriteContainerFragment f107305OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107306OooOo0o;

        /* JADX INFO: renamed from: o0o00ooo.OooO0o0$OooO0OO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ FavoriteContainerFragment f107307OooOo0o;

            public OooO00o(FavoriteContainerFragment favoriteContainerFragment) {
                this.f107307OooOo0o = favoriteContainerFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                C30185OooO00o c30185OooO00o = this.f107307OooOo0o.f77471OooOooO;
                if (c30185OooO00o != null) {
                    c30185OooO00o.OooO0Oo(iIntValue);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("actionBarInitializer");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(FavoriteContainerFragment favoriteContainerFragment, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f107305OooOo = favoriteContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f107305OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107306OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw androidx.transition.OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            FavoriteContainerFragment favoriteContainerFragment = this.f107305OooOo;
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo0 = favoriteContainerFragment.OooOoo0();
            OooO00o oooO00o = new OooO00o(favoriteContainerFragment);
            this.f107306OooOo0o = 1;
            oooO0OOOooOoo0.f77147OooOooo.collect(oooO00o, this);
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o00ooo.OooO0o0$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$initActionBar$1$4", m80623f = "FavoriteContainerFragment.kt", m80624l = {471}, m80625m = "invokeSuspend")
    public static final class C30148OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ FavoriteContainerFragment f107308OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107309OooOo0o;

        /* JADX INFO: renamed from: o0o00ooo.OooO0o0$OooO0Oo$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ FavoriteContainerFragment f107310OooOo0o;

            public OooO00o(FavoriteContainerFragment favoriteContainerFragment) {
                this.f107310OooOo0o = favoriteContainerFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                List<NoteVO> list = (List) obj;
                C30185OooO00o c30185OooO00o = this.f107310OooOo0o.f77471OooOooO;
                if (c30185OooO00o != null) {
                    c30185OooO00o.OooO0o0(list);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("actionBarInitializer");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30148OooO0Oo(FavoriteContainerFragment favoriteContainerFragment, Continuation<? super C30148OooO0Oo> continuation) {
            super(2, continuation);
            this.f107308OooOo = favoriteContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C30148OooO0Oo(this.f107308OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((C30148OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107309OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                FavoriteContainerFragment favoriteContainerFragment = this.f107308OooOo;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo0 = favoriteContainerFragment.OooOoo0();
                OooO00o oooO00o = new OooO00o(favoriteContainerFragment);
                this.f107309OooOo0o = 1;
                if (oooO0OOOooOoo0.f77172OooooOO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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
    public C30147OooO0o0(FavoriteContainerFragment favoriteContainerFragment, Continuation<? super C30147OooO0o0> continuation) {
        super(2, continuation);
        this.f107297OooOo = favoriteContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30147OooO0o0 c30147OooO0o0 = new C30147OooO0o0(this.f107297OooOo, continuation);
        c30147OooO0o0.f107298OooOo0o = obj;
        return c30147OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30147OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f107298OooOo0o;
        FavoriteContainerFragment favoriteContainerFragment = this.f107297OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(favoriteContainerFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(favoriteContainerFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(favoriteContainerFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C30148OooO0Oo(favoriteContainerFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
