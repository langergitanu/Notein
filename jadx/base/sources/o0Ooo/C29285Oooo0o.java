package o0Ooo;

import android.view.View;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
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

/* JADX INFO: renamed from: o0Ooo.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$15", m80623f = "PenBoxChildFragment.kt", m80624l = {1400}, m80625m = "invokeSuspend")
public final class C29285Oooo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PenBoxChildFragment f103822OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103823OooOo0o;

    /* JADX INFO: renamed from: o0Ooo.Oooo0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$15$1", m80623f = "PenBoxChildFragment.kt", m80624l = {1401}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103824OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103825OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$15$1$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19977OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31031OooO0O0>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103826OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103827OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19977OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super C19977OooO00o> continuation) {
                super(2, continuation);
                this.f103826OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19977OooO00o c19977OooO00o = new C19977OooO00o(this.f103826OooOo, continuation);
                c19977OooO00o.f103827OooOo0o = obj;
                return c19977OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C31031OooO0O0> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19977OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
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
                Iterator it = ((List) this.f103827OooOo0o).iterator();
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
                    PenBoxChildFragment penBoxChildFragment = this.f103826OooOo;
                    InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) penBoxChildFragment.f75371Oooo0oO.get(0);
                    Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                    if (value instanceof C29869OooO0Oo) {
                        Integer num = (Integer) penBoxChildFragment.Oooo0o().f75160OooOo0o.f121747OooOo0o.getValue();
                        int i = 5;
                        if (num != null && num.intValue() == 0) {
                            C29869OooO0Oo c29869OooO0Oo = (C29869OooO0Oo) value;
                            view = penBoxChildFragment.f75376OoooO0O;
                            if (view != null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
                                throw null;
                            }
                            if (c29869OooO0Oo.OooO0o0(view, 2, i)) {
                                penBoxChildFragment.Oooo00O().OooOOo(2);
                            }
                        } else if (num != null && num.intValue() == 2) {
                            i = 3;
                            C29869OooO0Oo c29869OooO0Oo2 = (C29869OooO0Oo) value;
                            view = penBoxChildFragment.f75376OoooO0O;
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
        public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f103824OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f103824OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103825OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103824OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = penBoxChildFragment.Oooo00O();
                C19977OooO00o c19977OooO00o = new C19977OooO00o(penBoxChildFragment, null);
                this.f103825OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OOOooo00O.f73382Oooo0O0, c19977OooO00o, this) == enumC32485OooO00o) {
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
    public C29285Oooo0o(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29285Oooo0o> continuation) {
        super(2, continuation);
        this.f103822OooOo = penBoxChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29285Oooo0o(this.f103822OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29285Oooo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103823OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            PenBoxChildFragment penBoxChildFragment = this.f103822OooOo;
            OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
            this.f103823OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(penBoxChildFragment, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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
