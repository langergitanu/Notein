package Oooo0oO;

import OooOo.C20486OooOoO0;
import Oooo.C20812OooO0Oo;
import Oooo0oO.C21082o00000oO;
import OoooO.C21140OooO0O0;
import OoooO00.InterfaceC21153OooO0o0;
import OoooOOo.AbstractC21194OooO0oO;
import OoooOOo.AbstractC21223Oooo0OO;
import OoooOOo.C21192OooO0o;
import OoooOOo.C21200OooOOO0;
import com.aspose.words.EditingLanguage;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33611OooOO0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: Oooo0oO.o0000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", m80623f = "Recomposer.kt", m80624l = {EditingLanguage.THAI}, m80625m = "invokeSuspend")
public final class C21095o0000oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f61167OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C21192OooO0o f61168OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C21082o00000oO f61169OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f61170OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f61171OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21078Ooooooo f61172OooOoo0;

    /* JADX INFO: renamed from: Oooo0oO.o0000oO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", m80623f = "Recomposer.kt", m80624l = {1055}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f61173OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f61174OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21078Ooooooo f61175OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f61176OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0000O0 o0000o0, InterfaceC21078Ooooooo interfaceC21078Ooooooo, Continuation continuation) {
            super(2, continuation);
            this.f61176OooOoO0 = o0000o0;
            this.f61175OooOoO = interfaceC21078Ooooooo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f61176OooOoO0, this.f61175OooOoO, continuation);
            oooO00o.f61173OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f61174OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f61173OooOo;
            this.f61174OooOo0o = 1;
            this.f61176OooOoO0.invoke(interfaceC33636Oooo00o, this.f61175OooOoO, this);
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: Oooo0oO.o0000oO$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<Set<? extends Object>, AbstractC21194OooO0oO, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C21082o00000oO f61177OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C21082o00000oO c21082o00000oO) {
            super(2);
            this.f61177OooOo0o = c21082o00000oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
        @Override // oO0O000o.InterfaceC32508OooOOOo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C32460OooOooO invoke(Set<? extends Object> set, AbstractC21194OooO0oO abstractC21194OooO0oO) {
            InterfaceC33611OooOO0O<C32460OooOooO> interfaceC33611OooOO0OOooOo0o;
            Set<? extends Object> set2 = set;
            C21082o00000oO c21082o00000oO = this.f61177OooOo0o;
            synchronized (c21082o00000oO.f61078OooO0O0) {
                try {
                    if (((C21082o00000oO.EnumC21083OooO0Oo) c21082o00000oO.f61093OooOOo0.getValue()).compareTo(C21082o00000oO.EnumC21083OooO0Oo.f61101OooOoOO) >= 0) {
                        C20486OooOoO0<Object> c20486OooOoO0 = c21082o00000oO.f61083OooO0oO;
                        if (set2 instanceof C20812OooO0Oo) {
                            OooOo.Oooo000<T> oooo000 = ((C20812OooO0Oo) set2).f59754OooOo0o;
                            Object[] objArr = oooo000.f58542OooO0O0;
                            long[] jArr = oooo000.f58541OooO00o;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i = 0;
                                while (true) {
                                    long j = jArr[i];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i2 = 8 - ((~(i - length)) >>> 31);
                                        for (int i3 = 0; i3 < i2; i3++) {
                                            if ((255 & j) < 128) {
                                                Object obj = objArr[(i << 3) + i3];
                                                if (!(obj instanceof AbstractC21223Oooo0OO) || ((AbstractC21223Oooo0OO) obj).OooO0oo(1)) {
                                                    c20486OooOoO0.OooO0Oo(obj);
                                                }
                                            }
                                            j >>= 8;
                                        }
                                        if (i2 != 8) {
                                            break;
                                        }
                                        if (i == length) {
                                            break;
                                        }
                                        i++;
                                    }
                                }
                            }
                        } else {
                            for (Object obj2 : set2) {
                                if (!(obj2 instanceof AbstractC21223Oooo0OO) || ((AbstractC21223Oooo0OO) obj2).OooO0oo(1)) {
                                    c20486OooOoO0.OooO0Oo(obj2);
                                }
                            }
                        }
                        interfaceC33611OooOO0OOooOo0o = c21082o00000oO.OooOo0o();
                    } else {
                        interfaceC33611OooOO0OOooOo0o = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (interfaceC33611OooOO0OOooOo0o != null) {
                ((C33614OooOOO0) interfaceC33611OooOO0OOooOo0o).resumeWith(C32460OooOooO.f116667OooO00o);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21095o0000oO(C21082o00000oO c21082o00000oO, o0000O0 o0000o0, InterfaceC21078Ooooooo interfaceC21078Ooooooo, Continuation continuation) {
        super(2, continuation);
        this.f61169OooOoO = c21082o00000oO;
        this.f61171OooOoOO = o0000o0;
        this.f61172OooOoo0 = interfaceC21078Ooooooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C21095o0000oO c21095o0000oO = new C21095o0000oO(this.f61169OooOoO, this.f61171OooOoOO, this.f61172OooOoo0, continuation);
        c21095o0000oO.f61170OooOoO0 = obj;
        return c21095o0000oO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C21095o0000oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C33781o00o0O c33781o00o0O;
        InterfaceC21153OooO0o0 interfaceC21153OooO0o0;
        C21140OooO0O0 c21140OooO0O0Add;
        InterfaceC33672o00ooo interfaceC33672o00ooo;
        Throwable th;
        C21192OooO0o c21192OooO0o;
        List<InterfaceC21055Oooo0OO> listOooOoO;
        C21082o00000oO c21082o00000oO;
        C33781o00o0O c33781o00o0O2;
        InterfaceC21153OooO0o0 interfaceC21153OooO0o02;
        C21140OooO0O0 c21140OooO0O0O0000oO;
        C21082o00000oO c21082o00000oO2;
        C33781o00o0O c33781o00o0O3;
        InterfaceC21153OooO0o0 interfaceC21153OooO0o03;
        C21140OooO0O0 c21140OooO0O0O0000oO2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f61167OooOo;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c21192OooO0o = this.f61168OooOo0o;
            interfaceC33672o00ooo = (InterfaceC33672o00ooo) this.f61170OooOoO0;
            try {
                C32446OooOOOo.OooO0O0(obj);
                c21192OooO0o.OooO0O0();
                c21082o00000oO2 = this.f61169OooOoO;
                synchronized (c21082o00000oO2.f61078OooO0O0) {
                    try {
                        if (c21082o00000oO2.f61079OooO0OO == interfaceC33672o00ooo) {
                            c21082o00000oO2.f61079OooO0OO = null;
                        }
                        c21082o00000oO2.OooOo0o();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C33781o00o0O c33781o00o0O4 = C21082o00000oO.f61074OooOo0;
                C21082o00000oO.OooO0OO oooO0OO = this.f61169OooOoO.f61095OooOo00;
                do {
                    c33781o00o0O3 = C21082o00000oO.f61074OooOo0;
                    interfaceC21153OooO0o03 = (InterfaceC21153OooO0o0) c33781o00o0O3.getValue();
                    c21140OooO0O0O0000oO2 = interfaceC21153OooO0o03.o0000oO(oooO0OO);
                    if (interfaceC21153OooO0o03 == c21140OooO0O0O0000oO2) {
                        break;
                    }
                } while (!c33781o00o0O3.OooO(interfaceC21153OooO0o03, c21140OooO0O0O0000oO2));
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th3) {
                th = th3;
                c21192OooO0o.OooO0O0();
                c21082o00000oO = this.f61169OooOoO;
                synchronized (c21082o00000oO.f61078OooO0O0) {
                    try {
                        if (c21082o00000oO.f61079OooO0OO == interfaceC33672o00ooo) {
                            c21082o00000oO.f61079OooO0OO = null;
                        }
                        c21082o00000oO.OooOo0o();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                C33781o00o0O c33781o00o0O5 = C21082o00000oO.f61074OooOo0;
                C21082o00000oO.OooO0OO oooO0OO2 = this.f61169OooOoO.f61095OooOo00;
                do {
                    c33781o00o0O2 = C21082o00000oO.f61074OooOo0;
                    interfaceC21153OooO0o02 = (InterfaceC21153OooO0o0) c33781o00o0O2.getValue();
                    c21140OooO0O0O0000oO = interfaceC21153OooO0o02.o0000oO(oooO0OO2);
                    if (interfaceC21153OooO0o02 == c21140OooO0O0O0000oO) {
                        break;
                    }
                } while (!c33781o00o0O2.OooO(interfaceC21153OooO0o02, c21140OooO0O0O0000oO));
                throw th;
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33672o00ooo interfaceC33672o00oooOooO0Oo = oO00o00.OooO0OO.OooO0Oo(((InterfaceC33636Oooo00o) this.f61170OooOoO0).OooOOO0());
        C21082o00000oO c21082o00000oO3 = this.f61169OooOoO;
        synchronized (c21082o00000oO3.f61078OooO0O0) {
            Throwable th5 = c21082o00000oO3.f61080OooO0Oo;
            if (th5 != null) {
                throw th5;
            }
            if (((C21082o00000oO.EnumC21083OooO0Oo) c21082o00000oO3.f61093OooOOo0.getValue()).compareTo(C21082o00000oO.EnumC21083OooO0Oo.f61097OooOo) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (c21082o00000oO3.f61079OooO0OO != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            c21082o00000oO3.f61079OooO0OO = interfaceC33672o00oooOooO0Oo;
            c21082o00000oO3.OooOo0o();
        }
        OooO0O0 oooO0O0 = new OooO0O0(this.f61169OooOoO);
        C21200OooOOO0.OooO0o(C21200OooOOO0.f61494OooO00o);
        synchronized (C21200OooOOO0.f61496OooO0OO) {
            C21200OooOOO0.f61501OooO0oo = oOo000Oo.OooOo.OooooOo((Collection) C21200OooOOO0.f61501OooO0oo, oooO0O0);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        C21192OooO0o c21192OooO0o2 = new C21192OooO0o(oooO0O0);
        C33781o00o0O c33781o00o0O6 = C21082o00000oO.f61074OooOo0;
        C21082o00000oO.OooO0OO oooO0OO3 = this.f61169OooOoO.f61095OooOo00;
        try {
            do {
                c33781o00o0O = C21082o00000oO.f61074OooOo0;
                interfaceC21153OooO0o0 = (InterfaceC21153OooO0o0) c33781o00o0O.getValue();
                c21140OooO0O0Add = interfaceC21153OooO0o0.add((Object) oooO0OO3);
                if (interfaceC21153OooO0o0 != c21140OooO0O0Add) {
                }
                break;
            } while (!c33781o00o0O.OooO(interfaceC21153OooO0o0, c21140OooO0O0Add));
            break;
            C21082o00000oO c21082o00000oO4 = this.f61169OooOoO;
            synchronized (c21082o00000oO4.f61078OooO0O0) {
                listOooOoO = c21082o00000oO4.OooOoO();
            }
            int size = listOooOoO.size();
            for (int i2 = 0; i2 < size; i2++) {
                listOooOoO.get(i2).invalidateAll();
            }
            OooO00o oooO00o = new OooO00o(this.f61171OooOoOO, this.f61172OooOoo0, null);
            this.f61170OooOoO0 = interfaceC33672o00oooOooO0Oo;
            this.f61168OooOo0o = c21192OooO0o2;
            this.f61167OooOo = 1;
            if (C33633Oooo0.OooO0o0(oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            interfaceC33672o00ooo = interfaceC33672o00oooOooO0Oo;
            c21192OooO0o = c21192OooO0o2;
            c21192OooO0o.OooO0O0();
            c21082o00000oO2 = this.f61169OooOoO;
            synchronized (c21082o00000oO2.f61078OooO0O0) {
            }
        } catch (Throwable th6) {
            interfaceC33672o00ooo = interfaceC33672o00oooOooO0Oo;
            th = th6;
            c21192OooO0o = c21192OooO0o2;
            c21192OooO0o.OooO0O0();
            c21082o00000oO = this.f61169OooOoO;
            synchronized (c21082o00000oO.f61078OooO0O0) {
            }
        }
    }
}
