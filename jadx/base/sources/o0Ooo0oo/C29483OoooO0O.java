package o0Ooo0oo;

import android.view.View;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0o00O00.C29869OooO0Oo;
import o0oOoOo.C31031OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo0oo.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$2", m80623f = "PenBarChildFragment.kt", m80624l = {1626}, m80625m = "invokeSuspend")
public final class C29483OoooO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104576OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104577OooOo0o;

    /* JADX INFO: renamed from: o0Ooo0oo.OoooO0O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$2$1", m80623f = "PenBarChildFragment.kt", m80624l = {1627}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f104578OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f104579OooOo0o;

        /* JADX INFO: renamed from: o0Ooo0oo.OoooO0O$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$2$1$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19998OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31031OooO0O0>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f104580OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f104581OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19998OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19998OooO00o> continuation) {
                super(2, continuation);
                this.f104580OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19998OooO00o c19998OooO00o = new C19998OooO00o(this.f104580OooOo, continuation);
                c19998OooO00o.f104581OooOo0o = obj;
                return c19998OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C31031OooO0O0> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19998OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
            
                if (r3.intValue() != 4) goto L52;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0089 A[PHI: r4
              0x0089: PHI (r4v3 int) = (r4v0 int), (r4v2 int), (r4v0 int) binds: [B:38:0x007b, B:34:0x0071, B:27:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object next;
                View view;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Iterator it = ((List) this.f104581OooOo0o).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((C31031OooO0O0) next).f110780OooO0OO) {
                        break;
                    }
                }
                C31031OooO0O0 c31031OooO0O0 = (C31031OooO0O0) next;
                if (c31031OooO0O0 == null || c31031OooO0O0.f110781OooO0Oo) {
                    return C32460OooOooO.f116667OooO00o;
                }
                if (c31031OooO0O0.f110778OooO00o == 2) {
                    PenBarChildFragment penBarChildFragment = this.f104580OooOo;
                    InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) penBarChildFragment.f75309o00ooo.get(0);
                    Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                    if (value instanceof C29869OooO0Oo) {
                        Integer num = (Integer) penBarChildFragment.Oooo0oO().f75160OooOo0o.f121747OooOo0o.getValue();
                        int i = 5;
                        if (num != null && num.intValue() == 0) {
                            C29869OooO0Oo c29869OooO0Oo = (C29869OooO0Oo) value;
                            view = penBarChildFragment.f75250Oooo0;
                            if (view != null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                                throw null;
                            }
                            if (c29869OooO0Oo.OooO0o0(view, 2, i)) {
                                penBarChildFragment.Oooo00O().OooOOo(2);
                            }
                        } else if (num != null && num.intValue() == 2) {
                            i = 3;
                            C29869OooO0Oo c29869OooO0Oo2 = (C29869OooO0Oo) value;
                            view = penBarChildFragment.f75250Oooo0;
                            if (view != null) {
                            }
                        } else if (num == null || num.intValue() != 6) {
                            if (num != null) {
                            }
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f104578OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f104578OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f104579OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f104578OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = penBarChildFragment.Oooo00O();
                C19998OooO00o c19998OooO00o = new C19998OooO00o(penBarChildFragment, null);
                this.f104579OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OOOooo00O.f73382Oooo0O0, c19998OooO00o, this) == enumC32485OooO00o) {
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
    public C29483OoooO0O(PenBarChildFragment penBarChildFragment, Continuation<? super C29483OoooO0O> continuation) {
        super(2, continuation);
        this.f104576OooOo = penBarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29483OoooO0O(this.f104576OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29483OoooO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104577OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            PenBarChildFragment penBarChildFragment = this.f104576OooOo;
            OooO00o oooO00o = new OooO00o(penBarChildFragment, null);
            this.f104577OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(penBarChildFragment, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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
